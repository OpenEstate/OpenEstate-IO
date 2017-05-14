/*
 * Copyright 2015-2017 OpenEstate.org.
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
package org.openestate.io.kyero.converters;

import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.jaxen.JaxenException;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.kyero.KyeroDocument;
import org.openestate.io.kyero.KyeroUtils;
import org.openestate.io.kyero.KyeroVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Converter for version 3.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class Kyero_3 extends XmlConverter<KyeroDocument, KyeroVersion>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( Kyero_3.class );

  @Override
  public KyeroVersion getVersion()
  {
    return KyeroVersion.V3;
  }

  /**
   * Downgrade a Kyero document from version 3.
   *
   * @param doc Kyero document in version 3
   */
  @Override
  public void downgradeToPreviousVersion( KyeroDocument doc )
  {
    doc.setDocumentVersion( KyeroVersion.V2_1 );

    try
    {
      this.downgradeNewBuildElements( doc.getDocument() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't downgrade <new_build> elements!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }

    try
    {
      this.downgradeTypeElements( doc.getDocument() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't downgrade <type> elements!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }

    try
    {
      this.downgradeUrlElements( doc.getDocument() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't downgrade <url> elements!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }

    try
    {
      this.removeLocationElements( doc.getDocument() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't remove <location> elements!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }

    try
    {
      this.removeEnergyRatingElements( doc.getDocument() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't remove <energy_rating> elements!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }

    try
    {
      this.removeNotesElements( doc.getDocument() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't remove <notes> elements!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }

    try
    {
      this.removeUnsupportedLanguageElements( doc.getDocument() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't remove unsupported translation elements!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }
  }

  /**
   * Upgrade a Kyero document to version 3.
   *
   * @param doc Kyero document in version 2.1
   */
  @Override
  public void upgradeFromPreviousVersion( KyeroDocument doc )
  {
    doc.setDocumentVersion( KyeroVersion.V3 );

    try
    {
      this.removeCustomElements( doc.getDocument() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't remove <custom> elements!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }

    try
    {
      this.upgradeNewBuildElements( doc.getDocument() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't upgrade <new_build> elements!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }

    try
    {
      this.upgradeTypeElements( doc.getDocument() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't upgrade <type> elements!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }

    try
    {
      this.upgradeCurrencyElements( doc.getDocument() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't upgrade <currency> elements!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }

    try
    {
      this.upgradeUrlElements( doc.getDocument() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't upgrade <url> elements!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
    }
  }

  /**
   * Downgrade &lt;new_build&gt; elements to Kyero 2.1.
   * <p>
   * The &lt;new_build&gt; elements are not available in version 2.1. Instead
   * the value "new_build" is used in the &lt;price_freq&gt; element.
   * <p>
   * Any &lt;new_build&gt; elements are removed. If its value is set to "1",
   * then &lt;price_freq&gt;sale&lt;/price_freq&gt; is convertet to
   * &lt;price_freq&gt;new_build&lt;/price_freq&gt;,
   *
   * @param doc Kyero document in version 3
   * @throws JaxenException
   */
  protected void downgradeNewBuildElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:root/io:property/io:new_build",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      Element parentNode = (Element) node.getParentNode();
      String value = StringUtils.trimToNull( node.getTextContent() );
      if ("1".equals( value ))
      {
        Element priceFreqNode = (Element) XmlUtils.newXPath( "io:price_freq", doc )
          .selectSingleNode( parentNode );
        if (priceFreqNode==null)
        {
          priceFreqNode = doc.createElementNS( KyeroUtils.NAMESPACE, "price_freq" );
          priceFreqNode.setTextContent( "new_build" );
          parentNode.appendChild( priceFreqNode );
        }
        else if ("sale".equalsIgnoreCase( priceFreqNode.getTextContent() ))
        {
          priceFreqNode.setTextContent( "new_build" );
        }
      }
      parentNode.removeChild( node );
    }
  }

  /**
   * Downgrade &lt;type&gt; elements to Kyero 2.1.
   * <p>
   * The &lt;type&gt; elements require a &lt;en&gt; child element in version
   * 2.1.
   * <p>
   * An &lt;en&gt; child element is created for any &lt;type&gt; element.
   *
   * @param doc Kyero document in version 3
   * @throws JaxenException
   */
  protected void downgradeTypeElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:root/io:property/io:type",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      String value = StringUtils.trimToNull( node.getTextContent() );
      node.setTextContent( null );

      Element childNode = doc.createElementNS( KyeroUtils.NAMESPACE, "en" );
      childNode.setTextContent( value );
      node.appendChild( childNode );
    }
  }

  /**
   * Downgrade &lt;url&gt; elements to Kyero 2.1.
   * <p>
   * The &lt;url&gt; elements only support a simple text value in version
   * 2.1. Version 3 allows different URL's for different languages.
   * <p>
   * Any children of &lt;url&gt; elements are removed. The english URL or the
   * first found URL is copied as simple value into the &lt;url&gt; element.
   *
   * @param doc Kyero document in version 3
   * @throws JaxenException
   */
  protected void downgradeUrlElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:root/io:property/io:url",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;

      String enUrlValue = null;
      String fallbackUrlValue = null;
      List childNodes = XmlUtils.newXPath(
        "*", doc ).selectNodes( node );
      for (Object childItem : childNodes)
      {
        Element langNode = (Element) childItem;
        if ("en".equalsIgnoreCase( langNode.getLocalName() ))
          enUrlValue = StringUtils.trimToNull( langNode.getTextContent() );
        else if (fallbackUrlValue==null)
          fallbackUrlValue = StringUtils.trimToNull( langNode.getTextContent() );
        node.removeChild( langNode );
      }

      node.setTextContent( (enUrlValue!=null)? enUrlValue: fallbackUrlValue );
    }
  }

  /**
   * Remove &lt;custom&gt; elements.
   * <p>
   * Kyero 3 does not support &lt;custom&gt; elements in &lt;property&gt; and
   * &lt;agent&gt;.
   * <p>
   * Any occurence of these elements is removed.
   *
   * @param doc OpenImmo document in version 2.1
   * @throws JaxenException
   */
  protected void removeCustomElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:root/io:property/io:custom  | " +
      "/io:root/io:agent/io:custom",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      Element parentNode = (Element) node.getParentNode();
      parentNode.removeChild( node );
    }
  }

  /**
   * Remove &lt;energy_rating&gt; elements.
   * <p>
   * Kyero 2.1 does not support &lt;energy_rating&gt; elements.
   *
   * @param doc OpenImmo document in version 3
   * @throws JaxenException
   */
  protected void removeEnergyRatingElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:root/io:property/io:energy_rating",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      Element parentNode = (Element) node.getParentNode();
      parentNode.removeChild( node );
    }
  }

  /**
   * Remove &lt;location&gt; elements.
   * <p>
   * Kyero 2.1 does not support &lt;location&gt; elements.
   *
   * @param doc OpenImmo document in version 3
   * @throws JaxenException
   */
  protected void removeLocationElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:root/io:property/io:location",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      Element parentNode = (Element) node.getParentNode();
      parentNode.removeChild( node );
    }
  }

  /**
   * Remove &lt;notes&gt; elements.
   * <p>
   * Kyero 2.1 does not support &lt;notes&gt; elements.
   *
   * @param doc OpenImmo document in version 3
   * @throws JaxenException
   */
  protected void removeNotesElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:root/io:property/io:notes",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      Element parentNode = (Element) node.getParentNode();
      parentNode.removeChild( node );
    }
  }

  /**
   * Remove elements with translations in unsupported languages.
   * <p>
   * Kyero 2.1 does only support translation in &lt;title&gt; (for images),
   * &lt;desc&gt; (for properties) elements for "en", "es", "de", "nl", "fr".
   *
   * @param doc OpenImmo document in version 3
   * @throws JaxenException
   */
  protected void removeUnsupportedLanguageElements( Document doc ) throws JaxenException
  {
    String[] unsupportedLanguages = new String[]{
      "ar", "bg", "ca", "cs", "da", "el", "et", "fa", "fi", "he", "hi", "hu",
      "id", "it", "ja", "ko", "lt", "lv", "no", "pl", "pt", "ro", "ru", "sk",
      "sl", "sv", "th", "tr", "uk", "vi", "zh",
    };
    List nodes = XmlUtils.newXPath(
      "/io:root/io:property/io:desc | " +
      "/io:root/io:property/io:images/io:image/io:title",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      List childNodes = XmlUtils.newXPath(
        "*", doc ).selectNodes( node );
      for (Object childItem : childNodes)
      {
        Element langNode = (Element) childItem;
        String lang = langNode.getLocalName().toLowerCase();
        if (ArrayUtils.contains( unsupportedLanguages, lang ))
        {
          node.removeChild( langNode );
        }
      }
    }
  }

  /**
   * Upgrade &lt;currency&gt; elements to Kyero 3.
   * <p>
   * The &lt;currency&gt; only supports the values "EUR", "GBP", "USD" in
   * version 3.
   * <p>
   * Any &lt;currency&gt; with an unsupported value is removed from the
   * document.
   *
   * @param doc Kyero document in version 2.1
   * @throws JaxenException
   */
  protected void upgradeCurrencyElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:root/io:property/io:currency",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      Element parentNode = (Element) node.getParentNode();
      String value = StringUtils.trimToNull( node.getTextContent() );
      if ("EUR".equalsIgnoreCase( value ))
        node.setTextContent( "EUR" );
      else if ("GBP".equalsIgnoreCase( value ))
        node.setTextContent( "GBP" );
      else if ("USD".equalsIgnoreCase( value ))
        node.setTextContent( "USD" );
      else
        parentNode.removeChild( node );
    }
  }

  /**
   * Upgrade &lt;new_build&gt; elements for Kyero 3.
   * <p>
   * The &lt;new_build&gt; elements are not available in version 2.1. Instead
   * the value "new_build" is used in the &lt;price_freq&gt; element.
   * <p>
   * Any occurences of &lt;price_freq&gt;new_build&lt;/price_freq&gt; is
   * replaced by &lt;price_freq&gt;sale&lt;/price_freq&gt; and
   * &lt;new_build&gt;1&lt;/new_build&gt; is added to the property.
   *
   * @param doc Kyero document in version 2.1
   * @throws JaxenException
   */
  protected void upgradeNewBuildElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:root/io:property/io:price_freq",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      Element parentNode = (Element) node.getParentNode();
      if (!"new_build".equalsIgnoreCase( node.getTextContent() )) continue;
      node.setTextContent( "sale" );

      Element newBuildNode = doc.createElementNS( KyeroUtils.NAMESPACE, "new_build" );
      newBuildNode.setTextContent( "1" );
      parentNode.appendChild( newBuildNode );
    }
  }

  /**
   * Upgrade &lt;type&gt; elements to Kyero 3.
   * <p>
   * The &lt;type&gt; elements do not support any child element in version 3.
   * <p>
   * Any child elements of &lt;type&gt; are removed. The text from the
   * &lt;en&gt; child element is copied into the &lt;type&gt; element.
   *
   * @param doc Kyero document in version 2.1
   * @throws JaxenException
   */
  protected void upgradeTypeElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:root/io:property/io:type",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;

      String enTypeValue = null;
      String fallbackTypeValue = null;
      List childNodes = XmlUtils.newXPath(
        "*", doc ).selectNodes( node );
      for (Object childItem : childNodes)
      {
        Element langNode = (Element) childItem;
        if ("en".equalsIgnoreCase( langNode.getLocalName() ))
          enTypeValue = StringUtils.trimToNull( langNode.getTextContent() );
        else if (fallbackTypeValue==null)
          fallbackTypeValue = StringUtils.trimToNull( langNode.getTextContent() );
        node.removeChild( langNode );
      }
      node.setTextContent( (enTypeValue!=null)? enTypeValue: fallbackTypeValue );
    }
  }

  /**
   * Upgrade &lt;url&gt; elements to Kyero 3.
   * <p>
   * The &lt;url&gt; elements only support a simple text value in version
   * 2.1. Version 3 allows different URL's for different languages.
   * <p>
   * The simple value of &lt;url&gt; elements is removed and copied into the
   * &lt;en&gt; child element.
   *
   * @param doc Kyero document in version 2.1
   * @throws JaxenException
   */
  protected void upgradeUrlElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:root/io:property/io:url",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      String value = StringUtils.trimToNull( node.getTextContent() );
      node.setTextContent( null );
      if (value==null)
      {
        Element parentNode = (Element) node.getParentNode();
        parentNode.removeChild( node );
      }
      else
      {
        Element childNode = doc.createElementNS( KyeroUtils.NAMESPACE, "en" );
        childNode.setTextContent( value );
        node.appendChild( childNode );
      }
    }
  }
}