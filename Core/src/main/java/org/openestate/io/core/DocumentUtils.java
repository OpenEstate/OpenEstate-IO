/*
 * Copyright 2015 OpenEstate.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openestate.io.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.Writer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.jaxen.JaxenException;
import org.jaxen.XPath;
import org.jaxen.dom.DOMXPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * DocumentUtils.
 *
 * @author Andreas Rudolph
 */
public class DocumentUtils
{
  private final static Logger LOGGER = LoggerFactory.getLogger( DocumentUtils.class );

  public static void clean( Node node )
  {
    NodeList childNodes = node.getChildNodes();
    for (int n = childNodes.getLength() - 1; n >= 0; n--)
    {
       Node child = childNodes.item(n);
       short nodeType = child.getNodeType();

       if (nodeType == Node.ELEMENT_NODE)
          clean(child);
       else if (nodeType == Node.TEXT_NODE)
       {
          String trimmedNodeVal = child.getNodeValue().trim();
          if (trimmedNodeVal.length() == 0)
             node.removeChild(child);
          else
             child.setNodeValue(trimmedNodeVal);
       }
       else if (nodeType == Node.COMMENT_NODE)
          node.removeChild(child);
    }
  }

  public static int countNodes( String xpathExpression, Document doc ) throws JaxenException
  {
    return countNodes( xpathExpression, doc, doc );
  }

  public static int countNodes( String xpathExpression, Document doc, Object context ) throws JaxenException
  {
    return newXPath( xpathExpression, doc ).selectNodes( context ).size();
  }

  public static Element getRootElement( Document doc )
  {
    if (doc==null) return null;
    NodeList children = doc.getChildNodes();
    for (int i=0; i<children.getLength(); i++)
    {
      Node node = children.item( i );
      if (node instanceof Element) return (Element) node;
    }
    return null;
  }

  public static Document newDocument() throws ParserConfigurationException
  {
    return newDocument( true );
  }

  public static Document newDocument( boolean namespaceAware ) throws ParserConfigurationException
  {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    factory.setNamespaceAware( namespaceAware );
    DocumentBuilder builder = factory.newDocumentBuilder();
    return builder.newDocument();
  }

  public static Document newDocument( String xmlString ) throws SAXException, IOException, ParserConfigurationException
  {
    return newDocument( xmlString, true );
  }

  public static Document newDocument( String xmlString, boolean namespaceAware ) throws SAXException, IOException, ParserConfigurationException
  {
    return newDocument(
      new InputSource( new StringReader( xmlString ) ), namespaceAware );
  }

  public static Document newDocument( InputSource xmlSource ) throws SAXException, IOException, ParserConfigurationException
  {
    return newDocument( xmlSource, true );
  }

  public static Document newDocument( InputSource xmlSource, boolean namespaceAware ) throws SAXException, IOException, ParserConfigurationException
  {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    factory.setNamespaceAware( namespaceAware );
    DocumentBuilder builder = factory.newDocumentBuilder();
    return builder.parse( xmlSource );
  }

  public static Document newDocument( InputStream xmlStream ) throws SAXException, IOException, ParserConfigurationException
  {
    return newDocument( xmlStream, true );
  }

  public static Document newDocument( InputStream xmlStream, boolean namespaceAware ) throws SAXException, IOException, ParserConfigurationException
  {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    factory.setNamespaceAware( namespaceAware );
    DocumentBuilder builder = factory.newDocumentBuilder();
    return builder.parse( xmlStream );
  }

  public static Document newDocument( File xmlFile ) throws SAXException, IOException, ParserConfigurationException
  {
    return newDocument( xmlFile, true );
  }

  public static Document newDocument( File xmlFile, boolean namespaceAware ) throws SAXException, IOException, ParserConfigurationException
  {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    factory.setNamespaceAware( namespaceAware );
    DocumentBuilder builder = factory.newDocumentBuilder();
    return builder.parse( xmlFile );
  }

  public static XPath newXPath( String expression, Document doc ) throws JaxenException
  {
    DOMXPath xpath = new DOMXPath( expression );
    //LOGGER.debug( "new xpath: " + xpath.debug() );
    if (doc!=null)
    {
      Element root = getRootElement( doc );
      String uri = StringUtils.trimToEmpty( root.getNamespaceURI() );
      xpath.addNamespace( "oi", uri );
    }
    return xpath;
  }

  public static void printNodes( Document doc )
  {
    NodeList children = doc.getChildNodes();
    for (int i=0; i<children.getLength(); i++)
    {
      Node node = children.item( i );
      if (node instanceof Element) printNode( (Element) node );
    }
  }

  public static void printNode( Element node )
  {
    printNode( node, 0 );
  }

  private static void printNode( Element node, int indent )
  {
    String prefix = (indent>0)? StringUtils.repeat( ">", indent ) + " ": "";
    LOGGER.debug( prefix + "<" + node.getTagName() + "> / " + node.getNamespaceURI() + " / " + node.getPrefix() );

    prefix = StringUtils.repeat( ">", indent+1 ) + " ";
    NamedNodeMap attribs = node.getAttributes();
    for (int i=0; i<attribs.getLength(); i++)
    {
      Attr attrib = (Attr) attribs.item( i );
      LOGGER.debug( prefix + "@" + attrib.getName() + " / " + attrib.getNamespaceURI() + " / " + attrib.getPrefix() );
    }
    NodeList children = node.getChildNodes();
    for (int i=0; i<children.getLength(); i++)
    {
      Node child = children.item( i );
      if (child instanceof Element) printNode( (Element) child, indent+1 );
    }
  }

  public static void replaceNamespace( Document doc, String newNamespaceURI )
  {
    NodeList children = doc.getChildNodes();
    for (int i=0; i<children.getLength(); i++)
    {
      replaceNamespace( doc, children.item( i ), newNamespaceURI );
    }
  }

  public static void replaceNamespace( Document doc, Node node, String newNamespaceURI )
  {
    if (node instanceof Attr)
    {
      doc.renameNode( node, newNamespaceURI, node.getLocalName() );
    }
    else if (node instanceof Element)
    {
      doc.renameNode( node, newNamespaceURI, node.getLocalName() );
      NodeList children = node.getChildNodes();
      for (int i=0; i<children.getLength(); i++)
      {
        replaceNamespace( doc, children.item( i ), newNamespaceURI );
      }
    }
  }

  public static void replaceTextWithCData( Document doc )
  {
    NodeList children = doc.getChildNodes();
    for (int i=0; i<children.getLength(); i++)
    {
      DocumentUtils.replaceTextWithCData(doc, children.item( i ) );
    }
  }

  public static void replaceTextWithCData( Document doc, Node node )
  {
    if (node instanceof Text)
    {
      Text text = (Text) node;
      CDATASection cdata = doc.createCDATASection( text.getTextContent() );
      Element parent = (Element) text.getParentNode();
      parent.replaceChild( cdata, text );
    }
    else if (node instanceof Element)
    {
      //LOGGER.debug( "ELEMENT " + element.getTagName() );
      NodeList children = node.getChildNodes();
      for (int i=0; i<children.getLength(); i++)
      {
        //LOGGER.debug( "> " + children.item( i ).getClass().getName() );
        DocumentUtils.replaceTextWithCData( doc, children.item( i ) );
      }
    }
  }

  public static void write( Document doc, File file ) throws TransformerException, IOException
  {
    write( doc, file, true );
  }

  public static void write( Document doc, File file, boolean prettyPrint ) throws TransformerException, IOException
  {
    OutputStream output = null;
    try
    {
      output = new FileOutputStream( file );
      write( doc, output, prettyPrint );
    }
    finally
    {
      IOUtils.closeQuietly( output );
    }
  }

  public static void write( Document doc, OutputStream output ) throws TransformerException
  {
    write( doc, output, true );
  }

  public static void write( Document doc, OutputStream output, boolean prettyPrint ) throws TransformerException
  {
    clean( doc );
    Transformer transformer = TransformerFactory.newInstance().newTransformer();
    transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
    transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
    transformer.setOutputProperty( OutputKeys.ENCODING, "UTF-8" );
    transformer.setOutputProperty( OutputKeys.STANDALONE, "yes" );
    transformer.setOutputProperty( OutputKeys.INDENT, (prettyPrint)? "yes": "no" );
    if (prettyPrint) transformer.setOutputProperty( "{http://xml.apache.org/xslt}indent-amount", "2" );
    transformer.transform( new DOMSource( doc ), new StreamResult( output ) );
  }

  public static void write( Document doc, Writer output ) throws TransformerException
  {
    write( doc, output, true );
  }

  public static void write( Document doc, Writer output, boolean prettyPrint ) throws TransformerException
  {
    clean( doc );
    Transformer transformer = TransformerFactory.newInstance().newTransformer();
    transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
    transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
    transformer.setOutputProperty( OutputKeys.ENCODING, "UTF-8" );
    transformer.setOutputProperty( OutputKeys.STANDALONE, "yes" );
    transformer.setOutputProperty( OutputKeys.INDENT, (prettyPrint)? "yes": "no" );
    if (prettyPrint) transformer.setOutputProperty( "{http://xml.apache.org/xslt}indent-amount", "2" );
    transformer.transform( new DOMSource( doc ), new StreamResult( output ) );
  }
}