/*
 * Copyright 2015-2021 OpenEstate.org.
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
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import javax.xml.bind.DatatypeConverter;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
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
 * Some helper functions for XML processing.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
public final class XmlUtils {
    private final static Logger LOGGER = LoggerFactory.getLogger(XmlUtils.class);

    private XmlUtils() {
    }

    /**
     * Recursively remove any comments and unnecessary white spaces from a
     * {@link Node} and its children.
     *
     * @param node the node to clean
     */
    public static void clean(Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int n = childNodes.getLength() - 1; n >= 0; n--) {
            Node child = childNodes.item(n);
            short nodeType = child.getNodeType();
            if (nodeType == Node.ELEMENT_NODE) {
                XmlUtils.clean(child);
            } else if (nodeType == Node.COMMENT_NODE) {
                node.removeChild(child);
            } else if (nodeType == Node.TEXT_NODE) {
                String value = StringUtils.trimToNull(child.getNodeValue());
                if (value == null)
                    node.removeChild(child);
                else
                    child.setNodeValue(value);
            }
        }
    }

    /**
     * Return the root {@link Element} of a {@link Document}.
     *
     * @param doc the document, where the root element is looked up
     * @return root element of the document or null, if not found
     */
    public static Element getRootElement(Document doc) {
        if (doc == null) return null;
        NodeList children = doc.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node node = children.item(i);
            if (node instanceof Element) return (Element) node;
        }
        return null;
    }

    /**
     * Create an empty {@link Document}.
     *
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static Document newDocument() throws ParserConfigurationException {
        return XmlUtils.newDocument(true);
    }

    /**
     * Create an empty {@link Document}.
     *
     * @param namespaceAware if namespaces are used in the created document
     * @return created document
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static Document newDocument(boolean namespaceAware) throws ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(namespaceAware);
        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.newDocument();
    }

    /**
     * Create a {@link Document} from XML string.
     *
     * @param xmlString the XML string, the document is created from
     * @return created document
     * @throws SAXException                 if XML contains an error
     * @throws IOException                  if XML is not readable
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static Document newDocument(String xmlString) throws SAXException, IOException, ParserConfigurationException {
        return XmlUtils.newDocument(xmlString, true);
    }

    /**
     * Create a {@link Document} from XML string.
     *
     * @param xmlString      the XML string, the document is created from
     * @param namespaceAware if namespaces are used in the created document
     * @return created document
     * @throws SAXException                 if XML contains an error
     * @throws IOException                  if XML is not readable
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static Document newDocument(String xmlString, boolean namespaceAware) throws SAXException, IOException, ParserConfigurationException {
        return XmlUtils.newDocument(
                new InputSource(new StringReader(xmlString)), namespaceAware);
    }

    /**
     * Create a {@link Document} from an {@link InputSource}.
     *
     * @param xmlSource the XML input, the document is created from
     * @return created document
     * @throws SAXException                 if XML contains an error
     * @throws IOException                  if XML is not readable
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static Document newDocument(InputSource xmlSource) throws SAXException, IOException, ParserConfigurationException {
        return XmlUtils.newDocument(xmlSource, true);
    }

    /**
     * Create a {@link Document} from an {@link InputSource}.
     *
     * @param xmlSource      the XML input, the document is created from
     * @param namespaceAware if namespaces are used in the created document
     * @return created document
     * @throws SAXException                 if XML contains an error
     * @throws IOException                  if XML is not readable
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static Document newDocument(InputSource xmlSource, boolean namespaceAware) throws SAXException, IOException, ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(namespaceAware);
        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.parse(xmlSource);
    }

    /**
     * Create a {@link Document} from an {@link InputStream}.
     *
     * @param xmlStream the XML input, the document is created from
     * @return created document
     * @throws SAXException                 if XML contains an error
     * @throws IOException                  if XML is not readable
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static Document newDocument(InputStream xmlStream) throws SAXException, IOException, ParserConfigurationException {
        return XmlUtils.newDocument(xmlStream, true);
    }

    /**
     * Create a {@link Document} from an {@link InputStream}.
     *
     * @param xmlStream      the XML input, the document is created from
     * @param namespaceAware if namespaces are used in the created document
     * @return created document
     * @throws SAXException                 if XML contains an error
     * @throws IOException                  if XML is not readable
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static Document newDocument(InputStream xmlStream, boolean namespaceAware) throws SAXException, IOException, ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(namespaceAware);
        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.parse(xmlStream);
    }

    /**
     * Create a {@link Document} from a {@link File}.
     *
     * @param xmlFile the XML file, the document is created from
     * @return created document
     * @throws SAXException                 if XML contains an error
     * @throws IOException                  if XML is not readable
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static Document newDocument(File xmlFile) throws SAXException, IOException, ParserConfigurationException {
        return XmlUtils.newDocument(xmlFile, true);
    }

    /**
     * Create a {@link Document} from a {@link File}.
     *
     * @param xmlFile        the XML file, the document is created from
     * @param namespaceAware if namespaces are used in the created document
     * @return created document
     * @throws SAXException                 if XML contains an error
     * @throws IOException                  if XML is not readable
     * @throws ParserConfigurationException if the parser is not properly configured
     */
    public static Document newDocument(File xmlFile, boolean namespaceAware) throws SAXException, IOException, ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(namespaceAware);
        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.parse(xmlFile);
    }

    /**
     * Create a {@link XPathExpression}.
     *
     * @param expression      string with the XPath expression to create
     * @param doc             the document, whose namespace is bound to the XPath expression
     * @param namespacePrefix prefix of the document namespace, that is bound to the XPath expression
     * @return the created XPath expression
     * @throws XPathExpressionException if the XPath is not creatable
     * @deprecated use {@link #xPath(String, Document, String)} instead
     */
    @Deprecated
    public static XPathExpression newXPath(String expression, Document doc, String namespacePrefix) throws XPathExpressionException {
        return xPath(expression, doc, namespacePrefix);
    }

    /**
     * Reads a xsd:date value.
     * <p>
     * If the value is not a valid xsd:date, we're trying to parse the value
     * against other common formats. If this also fails, we're trying to parse the
     * value as xsd:dateTime.
     * <p>
     * The functions throws an {@link IllegalArgumentException}, if the value is
     * not readable.
     *
     * @param value the XML value to parse
     * @return parsed date value
     */
    public static Calendar parseDate(String value) {
        return XmlUtils.parseDate(value, true);
    }

    private static Calendar parseDate(String value, boolean tryDateTimeOnError) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;
        try {
            return DatatypeConverter.parseDate(value);
        } catch (IllegalArgumentException ex) {
            //LOGGER.warn( "Can't parse value '" + value + "' as date!" );
            //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
        }
        try {
            //noinspection SpellCheckingInspection
            Date date = DateUtils.parseDateStrictly(value,
                    "dd.MM.yyyy", "dd.MM.yy", "dd/MM/yyyy", "dd/MM/yy", "dd-MM-yyyy",
                    "dd-MMM-yyyy", "yyyy-MM-dd", "yyyy/MM/dd", "yyyy-D", "MM/yyyy",
                    "MMM yyyy", "MMMMM yyyy", "yyyy");
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            return cal;
        } catch (ParseException ex) {
            //LOGGER.warn( "Can't parse value '" + value + "' as date!" );
            //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
        }

        // try to parse the value as xsd:dateTime instead
        if (tryDateTimeOnError) {
            try {
                return XmlUtils.parseDateTime(value, false);
            } catch (IllegalArgumentException ex) {
                //LOGGER.warn( "Can't parse value '" + value + "' as datetime!" );
                //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
            }
        }

        throw new IllegalArgumentException("Can't parse date value '" + value + "'!");
    }

    /**
     * Reads a xsd:dateTime value.
     * <p>
     * If the value is not a valid xsd:dateTime, we're trying to parse the value
     * against other common formats. If this also fails, we're trying to parse the
     * value as xsd:date.
     * <p>
     * The functions throws an {@link IllegalArgumentException}, if the value is
     * not readable.
     *
     * @param value the XML value to parse
     * @return parsed date value
     */
    public static Calendar parseDateTime(String value) {
        return XmlUtils.parseDateTime(value, true);
    }

    private static Calendar parseDateTime(String value, boolean tryDateOnError) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;
        try {
            return DatatypeConverter.parseDateTime(value);
        } catch (IllegalArgumentException ex) {
            //LOGGER.warn( "Can't parse value '" + value + "' as datetime!" );
            //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
        }
        try {
            //noinspection SpellCheckingInspection
            Date date = DateUtils.parseDateStrictly(value,
                    "yyyy-MM-dd'T'HH:mm:ss",
                    "yyyy-MM-dd'T'HH:mm",
                    "yyyy-MM-dd HH:mm:ss",
                    "yyyy-MM-dd HH:mm");
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            return cal;
        } catch (ParseException ex) {
            //LOGGER.warn( "Can't parse value '" + value + "' as datetime!" );
            //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
        }

        // try to parse the value as xsd:date instead
        if (tryDateOnError) {
            try {
                return XmlUtils.parseDate(value, false);
            } catch (IllegalArgumentException ex) {
                //LOGGER.warn( "Can't parse value '" + value + "' as datetime!" );
                //LOGGER.warn( "> " + ex.getLocalizedMessage(), ex );
            }
        }

        throw new IllegalArgumentException("Can't parse date-time value '" + value + "'!");
    }

    /**
     * Print nodes of a {@link Document} recursively to the local logger.
     *
     * @param doc the document to print
     */
    @SuppressWarnings("unused")
    public static void printNodes(Document doc) {
        NodeList children = doc.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node node = children.item(i);
            if (node instanceof Element) printNode((Element) node);
        }
    }

    /**
     * Print an {@link Element} and its children to the local logger.
     *
     * @param node the element to print
     */
    public static void printNode(Element node) {
        XmlUtils.printNode(node, 0);
    }

    private static void printNode(Element node, int indent) {
        String prefix = (indent > 0) ? StringUtils.repeat(">", indent) + " " : "";
        LOGGER.debug(prefix + "<" + node.getTagName() + "> / " + node.getNamespaceURI() + " / " + node.getPrefix());

        prefix = StringUtils.repeat(">", indent + 1) + " ";
        NamedNodeMap attribs = node.getAttributes();
        for (int i = 0; i < attribs.getLength(); i++) {
            Attr attrib = (Attr) attribs.item(i);
            LOGGER.debug(prefix + "@" + attrib.getName() + " / " + attrib.getNamespaceURI() + " / " + attrib.getPrefix());
        }
        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child instanceof Element) {
                XmlUtils.printNode((Element) child, indent + 1);
            }
        }
    }

    /**
     * Replace the namespace of any {@link Element} in a {@link Document}.
     *
     * @param doc             the document to update
     * @param newNamespaceURI the new namespace URI
     */
    public static void replaceNamespace(Document doc, String newNamespaceURI) {
        NodeList children = doc.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            XmlUtils.replaceNamespace(doc, children.item(i), newNamespaceURI);
        }
    }

    /**
     * Replace the namespace of a {@link Node} and its children.
     *
     * @param doc             the document to update
     * @param node            the node to update
     * @param newNamespaceURI the new namespace URI
     */
    public static void replaceNamespace(Document doc, Node node, String newNamespaceURI) {
        if (node instanceof Attr) {
            doc.renameNode(node, newNamespaceURI, node.getLocalName());
        } else if (node instanceof Element) {
            doc.renameNode(node, newNamespaceURI, node.getLocalName());
            NodeList children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                XmlUtils.replaceNamespace(doc, children.item(i), newNamespaceURI);
            }
        }
    }

    /**
     * Replace all text values of a {@link Document} with CDATA values.
     *
     * @param doc the document to update
     */
    public static void replaceTextWithCData(Document doc) {
        NodeList children = doc.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            XmlUtils.replaceTextWithCData(doc, children.item(i));
        }
    }

    /**
     * Replace all text values of a {@link Node} with CDATA values.
     *
     * @param doc  the document to update
     * @param node the node to update
     */
    public static void replaceTextWithCData(Document doc, Node node) {
        if (node instanceof Text) {
            Text text = (Text) node;
            CDATASection cdata = doc.createCDATASection(text.getTextContent());
            Element parent = (Element) text.getParentNode();
            parent.replaceChild(cdata, text);
        } else if (node instanceof Element) {
            //LOGGER.debug( "ELEMENT " + element.getTagName() );
            NodeList children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                //LOGGER.debug( "> " + children.item( i ).getClass().getName() );
                XmlUtils.replaceTextWithCData(doc, children.item(i));
            }
        }
    }

    /**
     * Write a {@link Document} to a {@link File}.
     *
     * @param doc  the document to write
     * @param file the file, where the document is written to
     * @throws TransformerException if XML transformation failed
     * @throws IOException          if writing failed
     */
    public static void write(Document doc, File file) throws TransformerException, IOException {
        XmlUtils.write(doc, file, true);
    }

    /**
     * Write a {@link Document} to a {@link File}.
     *
     * @param doc         the document to write
     * @param file        the file, where the document is written to
     * @param prettyPrint if pretty printing is enabled for the generated XML code
     * @throws TransformerException if XML transformation failed
     * @throws IOException          if writing failed
     */
    public static void write(Document doc, File file, boolean prettyPrint) throws TransformerException, IOException {
        try (OutputStream output = new FileOutputStream(file)) {
            XmlUtils.write(doc, output, prettyPrint);
        }
    }

    /**
     * Write a {@link Document} to an {@link OutputStream}.
     *
     * @param doc    the document to write
     * @param output the output, where the document is written to
     * @throws TransformerException if XML transformation failed
     */
    public static void write(Document doc, OutputStream output) throws TransformerException {
        XmlUtils.write(doc, output, true);
    }

    /**
     * Write a {@link Document} to an {@link OutputStream}.
     *
     * @param doc         the document to write
     * @param output      the output, where the document is written to
     * @param prettyPrint if pretty printing is enabled for the generated XML code
     * @throws TransformerException if XML transformation failed
     */
    @SuppressWarnings("DuplicatedCode")
    public static void write(Document doc, OutputStream output, boolean prettyPrint) throws TransformerException {
        XmlUtils.clean(doc);
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, (prettyPrint) ? "yes" : "no");
        if (prettyPrint) {
            //noinspection HttpUrlsUsage
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        }
        transformer.transform(new DOMSource(doc), new StreamResult(output));
    }

    /**
     * Write a {@link Document} to a {@link Writer}.
     *
     * @param doc    the document to write
     * @param output the output, where the document is written to
     * @throws TransformerException if XML transformation failed
     */
    public static void write(Document doc, Writer output) throws TransformerException {
        XmlUtils.write(doc, output, true);
    }

    /**
     * Write a {@link Document} to a {@link Writer}.
     *
     * @param doc         the document to write
     * @param output      the output, where the document is written to
     * @param prettyPrint if pretty printing is enabled for the generated XML code
     * @throws TransformerException if XML transformation failed
     */
    @SuppressWarnings("DuplicatedCode")
    public static void write(Document doc, Writer output, boolean prettyPrint) throws TransformerException {
        XmlUtils.clean(doc);
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, (prettyPrint) ? "yes" : "no");
        if (prettyPrint) {
            //noinspection HttpUrlsUsage
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        }
        transformer.transform(new DOMSource(doc), new StreamResult(output));
    }

    /**
     * Create a {@link XPathExpression}.
     *
     * @param expression string with the XPath expression to create
     * @return the created XPath expression
     * @throws XPathExpressionException if the XPath is not creatable
     */
    public static XPathExpression xPath(String expression) throws XPathExpressionException {
        return xPath(expression, null, null);
    }

    /**
     * Create a {@link XPathExpression}.
     *
     * @param expression string with the XPath expression to create
     * @param doc        the document, whose namespace is bound to the XPath expression
     * @return the created XPath expression
     * @throws XPathExpressionException if the XPath is not creatable
     */
    public static XPathExpression xPath(String expression, Document doc) throws XPathExpressionException {
        return xPath(expression, doc, null);
    }

    /**
     * Create a {@link XPathExpression}.
     *
     * @param expression      string with the XPath expression to create
     * @param doc             the document, whose namespace is bound to the XPath expression
     * @param namespacePrefix prefix of the document namespace, that is bound to the XPath expression
     * @return the created XPath expression
     * @throws XPathExpressionException if the XPath is not creatable
     */
    public static XPathExpression xPath(String expression, Document doc, String namespacePrefix) throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();

        //LOGGER.debug( "new xpath: " + xpath.debug() );
        if (doc != null && StringUtils.isNotBlank(namespacePrefix)) {
            final Element root = XmlUtils.getRootElement(doc);
            final String uri = StringUtils.trimToEmpty(root.getNamespaceURI());

            if (StringUtils.isBlank(uri)) {
                // Remove namespace from xPath expression, if the document does not use namespaces at all.
                // Otherwise, error are thrown during evaluation.
                expression = expression.replace(namespacePrefix + ":", StringUtils.EMPTY);
            } else {
                //xpath.addNamespace(namespacePrefix, uri);

                //NamespaceContextImpl context = new NamespaceContextImpl();
                //context.startPrefixMapping(namespacePrefix, uri);
                //xPath.setNamespaceContext(new NamespaceContextImpl());
                //xPath.setNamespaceContext(new SimpleNamespaceResolver(namespacePrefix, uri));
                xPath.setNamespaceContext(new NamespaceContext() {
                    @Override
                    public String getNamespaceURI(String prefix) {
                        //LOGGER.debug("getNamespaceURI({}) => {} ({})", prefix, uri, uri.length());
                        //LOGGER.debug("test", new Exception());
                        return uri;
                    }

                    @Override
                    public String getPrefix(String namespaceURI) {
                        //LOGGER.debug("getPrefix({}) => {}", namespaceURI, namespacePrefix);
                        return namespacePrefix;
                    }

                    @Override
                    public Iterator<String> getPrefixes(String namespaceURI) {
                        //LOGGER.debug("getPrefixes({})", namespaceURI);
                        return null;
                    }
                });
            }
        }

        return xPath.compile(expression);
    }

    /**
     * Get a node, that matches against an XPath expression.
     *
     * @param xpathExpression the XPath expression to match
     * @param item            the node, on which the XPath expression is evaluated
     * @return matching boolean value
     * @throws XPathExpressionException if the XPath evaluation failed
     */
    public static Boolean xPathBoolean(XPathExpression xpathExpression, Object item) throws XPathExpressionException {
        return (Boolean) xpathExpression.evaluate(item, XPathConstants.BOOLEAN);
    }

    /**
     * Get an element, that matches against an XPath expression.
     *
     * @param xpathExpression the XPath expression to match
     * @param item            the node, on which the XPath expression is evaluated
     * @return matching element
     * @throws XPathExpressionException if the XPath evaluation failed
     */
    public static Element xPathElement(XPathExpression xpathExpression, Object item) throws XPathExpressionException {
        return (Element) xpathExpression.evaluate(item, XPathConstants.NODE);
    }

    /**
     * Process an element, that matches against an XPath expression.
     *
     * @param xpathExpression the XPath expression to match
     * @param item            the node, on which the XPath expression is evaluated
     * @throws XPathExpressionException if the XPath evaluation failed
     */
    public static void xPathElementProcess(XPathExpression xpathExpression, Object item, XPathProcessor<Element> processor) throws XPathExpressionException {
        processor.process(xPathElement(xpathExpression, item));
    }

    /**
     * Process a list of elements, that are matching against an XPath expression.
     *
     * @param xpathExpression the XPath expression to match
     * @param item            the node, on which the XPath expression is evaluated
     * @throws XPathExpressionException if the XPath evaluation failed
     */
    public static void xPathElementsProcess(XPathExpression xpathExpression, Object item, XPathProcessor<Element> processor) throws XPathExpressionException {
        final NodeList nodes = xPathNodes(xpathExpression, item);
        for (int i=0; i<nodes.getLength(); i++) {
            processor.process((Element) nodes.item(i));
        }
    }

    /**
     * Get a node, that matches against an XPath expression.
     *
     * @param xpathExpression the XPath expression to match
     * @param item            the node, on which the XPath expression is evaluated
     * @return matching node
     * @throws XPathExpressionException if the XPath evaluation failed
     */
    public static Node xPathNode(XPathExpression xpathExpression, Object item) throws XPathExpressionException {
        return (Node) xpathExpression.evaluate(item, XPathConstants.NODE);
    }

    /**
     * Process a node, that matches against an XPath expression.
     *
     * @param xpathExpression the XPath expression to match
     * @param item            the node, on which the XPath expression is evaluated
     * @throws XPathExpressionException if the XPath evaluation failed
     */
    public static void xPathNodeProcess(XPathExpression xpathExpression, Object item, XPathProcessor<Node> processor) throws XPathExpressionException {
        processor.process(xPathNode(xpathExpression, item));
    }

    /**
     * Get a list of nodes, that are matching against an XPath expression.
     *
     * @param xpathExpression the XPath expression to match
     * @param item            the node, on which the XPath expression is evaluated
     * @return list of matching nodes
     * @throws XPathExpressionException if the XPath evaluation failed
     */
    public static NodeList xPathNodes(XPathExpression xpathExpression, Object item) throws XPathExpressionException {
        return (NodeList) xpathExpression.evaluate(item, XPathConstants.NODESET);
    }

    /**
     * Process a list of nodes, that are matching against an XPath expression.
     *
     * @param xpathExpression the XPath expression to match
     * @param item            the node, on which the XPath expression is evaluated
     * @throws XPathExpressionException if the XPath evaluation failed
     */
    public static void xPathNodesProcess(XPathExpression xpathExpression, Object item, XPathProcessor<Node> processor) throws XPathExpressionException {
        final NodeList nodes = xPathNodes(xpathExpression, item);
        for (int i=0; i<nodes.getLength(); i++) {
            processor.process(nodes.item(i));
        }
    }

    /**
     * Count the number of nodes, that are matching against an XPath expression.
     *
     * @param xpathExpression the XPath expression to match
     * @param item            the node, on which the XPath expression is evaluated
     * @return number of matching nodes
     * @throws XPathExpressionException if the XPath evaluation failed
     */
    public static int xPathNodesCount(XPathExpression xpathExpression, Object item) throws XPathExpressionException {
        return xPathNodes(xpathExpression, item).getLength();
    }

    /**
     * Get a number, that matches against an XPath expression.
     *
     * @param xpathExpression the XPath expression to match
     * @param item            the node, on which the XPath expression is evaluated
     * @return matching number value
     * @throws XPathExpressionException if the XPath evaluation failed
     */
    public static Number xPathNumber(XPathExpression xpathExpression, Object item) throws XPathExpressionException {
        return (Number) xpathExpression.evaluate(item, XPathConstants.NUMBER);
    }

    /**
     * Get a string, that matches against an XPath expression.
     *
     * @param xpathExpression the XPath expression to match
     * @param item            the node, on which the XPath expression is evaluated
     * @return matching string value
     * @throws XPathExpressionException if the XPath evaluation failed
     */
    public static String xPathString(XPathExpression xpathExpression, Object item) throws XPathExpressionException {
        return (String) xpathExpression.evaluate(item, XPathConstants.STRING);
    }

    public interface XPathProcessor<T extends Node> {
        void process(T node) throws XPathExpressionException;
    }
}