/*
 * Copyright 2015-2018 OpenEstate.org.
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
package org.openestate.io.openimmo.converters;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.jaxen.JaxenException;
import org.openestate.io.core.XmlConverter;
import org.openestate.io.core.XmlUtils;
import org.openestate.io.openimmo.OpenImmoVersion;
import org.openestate.io.openimmo.OpenImmoDocument;
import org.openestate.io.openimmo.OpenImmoFeedbackDocument;
import org.openestate.io.openimmo.OpenImmoTransferDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Converter for version 1.2.4.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class OpenImmo_1_2_4 extends XmlConverter<OpenImmoDocument, OpenImmoVersion>
{
  private final static Logger LOGGER = LoggerFactory.getLogger( OpenImmo_1_2_4.class );

  @Override
  public OpenImmoVersion getVersion()
  {
    return OpenImmoVersion.V1_2_4;
  }

  /**
   * Downgrade an OpenImmo document from version 1.2.4 to 1.2.3.
   *
   * @param doc OpenImmo document in version 1.2.4
   */
  @Override
  public void downgradeToPreviousVersion( OpenImmoDocument doc )
  {
    doc.setDocumentVersion( OpenImmoVersion.V1_2_3 );

    // downgrade a feedback document
    if (doc instanceof OpenImmoFeedbackDocument)
    {
      try
      {
        this.removeFeedbackVersionElements( doc.getDocument() );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't remove unsupported <version> elements!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      }

      try
      {
        this.removeFeedbackInteressentChildElements( doc.getDocument() );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't remove unsupported children of <interessent> elements!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      }
    }

    // downgrade a transfer document
    else if (doc instanceof OpenImmoTransferDocument)
    {
      try
      {
        this.removePreiseChildElements( doc.getDocument() );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't remove unsupported children of <preise> elements!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      }

      try
      {
        this.removeWintergartenElements( doc.getDocument() );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't remove unsupported <wintergarten> elements!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      }

      try
      {
        this.downgradeEnergietypElements( doc.getDocument() );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't downgrade <energietyp> elements!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      }

      try
      {
        this.downgradeBebaubarNachElements( doc.getDocument() );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't downgrade <bebaubar_nach> elements!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      }

      try
      {
        this.downgradeAnhangElements( doc.getDocument() );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't downgrade <anhang> elements!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      }

      try
      {
        this.downgradeWohnungElements( doc.getDocument() );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't downgrade <wohnung> elements!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      }

      try
      {
        this.downgradeGrundstueckElements( doc.getDocument() );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't downgrade <grundstueck> elements!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      }

      try
      {
        this.downgradeLandUndForstwirtschaftElements( doc.getDocument() );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't downgrade <land_und_forstwirtschaft> elements!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      }

      try
      {
        this.downgradeParkenElements( doc.getDocument() );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't downgrade <parken> elements!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      }
    }
  }

  /**
   * Upgrade an OpenImmo document from version 1.2.3 to 1.2.4.
   *
   * @param doc OpenImmo document in version 1.2.3
   */
  @Override
  public void upgradeFromPreviousVersion( OpenImmoDocument doc )
  {
    doc.setDocumentVersion( OpenImmoVersion.V1_2_4 );

    if (doc instanceof OpenImmoTransferDocument)
    {
      try
      {
        this.upgradeAnzahlBalkonTerrassenElements( doc.getDocument() );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't upgrade <anzahl_balkon_terrassen> elements!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      }

      try
      {
        this.upgradeAnhangElements( doc.getDocument() );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't upgrade <anhang> elements!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      }

      try
      {
        this.upgradeSonstigeElements( doc.getDocument() );
      }
      catch (Exception ex)
      {
        LOGGER.error( "Can't upgrade <sonstige> elements!" );
        LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      }
    }
  }

  /**
   * Downgrade &lt;anhang&gt; elements to OpenImmo 1.2.3.
   * <p>
   * The options "QRCODE", "FILM", "FILMLINK" for the "gruppe" attribute of
   * &lt;anhang&gt; elements are not available in version 1.2.3.
   * <p>
   * The option "REMOTE" for the "location" attribute of
   * &lt;anhang&gt; elements is not available in version 1.2.3.
   * <p>
   * The the child element &lt;check&gt; of &lt;anhang&gt; elements is not
   * available in version 1.2.3.
   *
   * @param doc OpenImmo document in version 1.2.4
   * @throws JaxenException
   */
  protected void downgradeAnhangElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:openimmo/io:anbieter/io:anhang | " +
      "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;

      String value = StringUtils.trimToNull( node.getAttribute( "gruppe" ) );
      if ("QRCODE".equalsIgnoreCase( value ))
        node.removeAttribute( "gruppe" );
      else if ("FILM".equalsIgnoreCase( value ))
        node.removeAttribute( "gruppe" );
      else if ("FILMLINK".equalsIgnoreCase( value ))
        node.removeAttribute( "gruppe" );

      value = StringUtils.trimToNull( node.getAttribute( "location" ) );
      if ("REMOTE".equalsIgnoreCase( value ))
        node.setAttribute( "location", "EXTERN" );

      List childNodes = XmlUtils.newXPath( "io:check", doc )
        .selectNodes( node );
      for (Object childItem : childNodes)
      {
        node.removeChild( (Node) childItem );
      }
    }
  }

  /**
   * Downgrade &lt;bebaubar_nach&gt; elements to OpenImmo 1.2.3.
   * <p>
   * The option "LAENDERSPEZIFISCH" for the "bebaubar_attr" attribute of
   * &lt;bebaubar_nach&gt; elements is not available in version 1.2.3.
   * <p>
   * Any occurences of these values are removed.
   *
   * @param doc OpenImmo document in version 1.2.4
   * @throws JaxenException
   */
  protected void downgradeBebaubarNachElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:openimmo/io:anbieter/io:immobilie/io:zustand_angaben/io:bebaubar_nach[@bebaubar_attr]",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      String value = StringUtils.trimToNull( node.getAttribute( "bebaubar_attr" ) );
      if ("LAENDERSPEZIFISCH".equalsIgnoreCase( value ))
        node.removeAttribute( "bebaubar_attr" );
    }
  }

  /**
   * Downgrade &lt;energietyp&gt; elements to OpenImmo 1.2.3.
   * <p>
   * The attributes "KFW55", "KFW70" of &lt;energietyp&gt; elements are not
   * available in OpenImmo 1.2.3.
   *
   * @param doc OpenImmo document in version 1.2.4
   * @throws JaxenException
   */
  protected void downgradeEnergietypElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:energietyp[@KFW55 or @KFW70]",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      node.removeAttribute( "KFW55" );
      node.removeAttribute( "KFW70" );
    }
  }

  /**
   * Downgrade &lt;grundstueck&gt; elements to OpenImmo 1.2.3.
   * <p>
   * The option "SEELIEGENSCHAFT" for the "grundst_typ" attribute of
   * &lt;grundstueck&gt; elements is not available in version 1.2.3.
   * <p>
   * Any occurence of these values is removed.
   *
   * @param doc OpenImmo document in version 1.2.4
   * @throws JaxenException
   */
  protected void downgradeGrundstueckElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:grundstueck[@grundst_typ]",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      String value = StringUtils.trimToNull( node.getAttribute( "grundst_typ" ) );
      if ("SEELIEGENSCHAFT".equalsIgnoreCase( value ))
        node.removeAttribute( "grundst_typ" );
    }
  }

  /**
   * Downgrade &lt;land_und_forstwirtschaft&gt; elements to OpenImmo 1.2.3.
   * <p>
   * The option "JAGDREVIER" for the "land_typ" attribute of
   * &lt;land_und_forstwirtschaft&gt; elements is not available in version
   * 1.2.3.
   * <p>
   * Any occurence of these values is replaced by the
   * "SONSTIGE_LANDWIRTSCHAFTSIMMOBILIEN" value.
   *
   * @param doc OpenImmo document in version 1.2.4
   * @throws JaxenException
   */
  protected void downgradeLandUndForstwirtschaftElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:land_und_forstwirtschaft[@land_typ]",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      String value = StringUtils.trimToNull( node.getAttribute( "land_typ" ) );
      if ("JAGDREVIER".equalsIgnoreCase( value ))
        node.setAttribute( "land_typ", "SONSTIGE_LANDWIRTSCHAFTSIMMOBILIEN" );
    }
  }

  /**
   * Downgrade &lt;parken&gt; elements to OpenImmo 1.2.3.
   * <p>
   * The options "EINZELGARAGE", "PARKHAUS", "TIEFGARAGENSTELLPLATZ",
   * "PARKPLATZ_STROM" for the "parken_typ" attribute of
   * &lt;parken&gt; elements are not available in version 1.2.3.
   * <p>
   * Any occurence of these values is replaced by the "STELLPLATZ" value.
   *
   * @param doc OpenImmo document in version 1.2.4
   * @throws JaxenException
   */
  protected void downgradeParkenElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:parken[@parken_typ]",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      String value = StringUtils.trimToNull( node.getAttribute( "parken_typ" ) );
      if ("EINZELGARAGE".equalsIgnoreCase( value ))
        node.setAttribute( "parken_typ", "STELLPLATZ" );
      else if ("PARKHAUS".equalsIgnoreCase( value ))
        node.setAttribute( "parken_typ", "STELLPLATZ" );
      else if ("TIEFGARAGENSTELLPLATZ".equalsIgnoreCase( value ))
        node.setAttribute( "parken_typ", "STELLPLATZ" );
      else if ("PARKPLATZ_STROM".equalsIgnoreCase( value ))
        node.setAttribute( "parken_typ", "STELLPLATZ" );
    }
  }

  /**
   * Downgrade &lt;wohnung&gt; elements to OpenImmo 1.2.3.
   * <p>
   * The option "ROHDACHBODEN" for the "wohnungtyp" attribute of
   * &lt;wohnung&gt; elements is not available in version 1.2.3.
   * <p>
   * Any occurence of these values is replaced by the "KEINE_ANGABE" value.
   *
   * @param doc OpenImmo document in version 1.2.4
   * @throws JaxenException
   */
  protected void downgradeWohnungElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:wohnung[@wohnungtyp]",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      String value = StringUtils.trimToNull( node.getAttribute( "wohnungtyp" ) );
      if ("ROHDACHBODEN".equalsIgnoreCase( value ))
        node.setAttribute( "wohnungtyp", "KEINE_ANGABE" );
    }
  }

  /**
   * Remove unsupported children from all &lt;interessent&gt; elements in
   * feedback XML.
   * <p>
   * OpenImmo 1.2.3 does not support more then one &lt;bevorzugt&gt;,
   * &lt;wunsch&gt; elements in feedback XML.
   *
   * @param doc OpenImmo document in version 1.2.4
   * @throws JaxenException
   */
  protected void removeFeedbackInteressentChildElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:openimmo_feedback/io:objekt/io:interessent",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element parentNode = (Element) item;
      boolean bevorzugtPassed = false;
      boolean wunschPassed = false;

      List childNodes = XmlUtils.newXPath(
        "io:bevorzugt", doc ).selectNodes( parentNode );
      for (Object childItem : childNodes)
      {
        Element node = (Element) childItem;
        if (!bevorzugtPassed) bevorzugtPassed = true;
        else parentNode.removeChild( node );
      }

      childNodes = XmlUtils.newXPath(
        "io:wunsch", doc ).selectNodes( parentNode );
      for (Object childItem : childNodes)
      {
        Element node = (Element) childItem;
        if (!wunschPassed) wunschPassed = true;
        else parentNode.removeChild( node );
      }
    }
  }

  /**
   * Remove &lt;version&gt; elements in feedback XML.
   * <p>
   * OpenImmo 1.2.3 does not support &lt;version&gt; elements in feedback XML.
   *
   * @param doc OpenImmo document in version 1.2.4
   * @throws JaxenException
   */
  protected void removeFeedbackVersionElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:openimmo_feedback/io:version",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      Element parentNode = (Element) node.getParentNode();
      parentNode.removeChild( node );
    }
  }

  /**
   * Remove unsupported children from all &lt;preise&gt; elements.
   * <p>
   * OpenImmo 1.2.3 does not support the following children for
   * &lt;preise&gt; elements: &lt;provision_teilen&gt;, &lt;kaution_text&gt;,
   * &lt;richtpreis&gt;
   * <p>
   * These elements are removed by this function.
   *
   * @param doc OpenImmo document in version 1.2.4
   * @throws JaxenException
   */
  protected void removePreiseChildElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:provision_teilen | " +
      "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:kaution_text | " +
      "/io:openimmo/io:anbieter/io:immobilie/io:preise/io:richtpreis",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      Element parentNode = (Element) node.getParentNode();
      parentNode.removeChild( node );
    }
  }

  /**
   * Remove &lt;wintergarten&gt; elements.
   * <p>
   * OpenImmo 1.2.3 does not support &lt;wintergarten&gt; elements.
   *
   * @param doc OpenImmo document in version 1.2.4
   * @throws JaxenException
   */
  protected void removeWintergartenElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:openimmo/io:anbieter/io:immobilie/io:ausstattung/io:wintergarten",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      Element parentNode = (Element) node.getParentNode();
      parentNode.removeChild( node );
    }
  }

  /**
   * Upgrade &lt;anhang&gt; elements to OpenImmo 1.2.4.
   * <p>
   * The option "REMOTE" for the "location" attribute of &lt;anhang&gt; elements
   * is introduced with OpenImmo 1.2.4.
   * <p>
   * If the &lt;pfad&gt; element of an &lt;anhang&gt; element contains an URL
   * (beginning with "http://" / "https://" / "ftp://" / "ftps://"), the value
   * of the "location" attribute is changed to "REMOTE".
   *
   * @param doc OpenImmo document in version 1.2.3
   * @throws JaxenException
   */
  protected void upgradeAnhangElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:openimmo/io:anbieter/io:anhang/io:daten/io:pfad | " +
      "/io:openimmo/io:anbieter/io:immobilie/io:anhaenge/io:anhang/io:daten/io:pfad",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      Element parentNode = (Element) node.getParentNode().getParentNode();
      String value = StringUtils.trimToEmpty( node.getTextContent() ).toLowerCase();
      if (value.startsWith( "http://" ))
        parentNode.setAttribute( "location", "REMOTE" );
      else if (value.startsWith( "https://" ))
        parentNode.setAttribute( "location", "REMOTE" );
      else if (value.startsWith( "ftp://" ))
        parentNode.setAttribute( "location", "REMOTE" );
      else if (value.startsWith( "ftps://" ))
        parentNode.setAttribute( "location", "REMOTE" );
    }
  }

  /**
   * Upgrade &lt;anzahl_balkon_terrassen&gt; elements to OpenImmo 1.2.4.
   * <p>
   * The &lt;anzahl_balkon_terrassen&gt; is not supported anymore in version
   * 1.2.4. The element is replaced by &lt;anzahl_balkone&gt; and
   * &lt;anzahl_terrassen&gt;.
   * <p>
   * Any &lt;anzahl_balkon_terrassen&gt; element is removed. Its content is
   * copied into &lt;anzahl_balkone&gt;, if this element is not already present.
   *
   * @param doc OpenImmo document in version 1.2.3
   * @throws JaxenException
   */
  protected void upgradeAnzahlBalkonTerrassenElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:openimmo/io:anbieter/io:immobilie/io:flaechen/io:anzahl_balkon_terrassen",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      Element parentNode = (Element) node.getParentNode();
      String value = StringUtils.trimToNull( node.getTextContent() );
      if (value!=null)
      {
        Element newNode = (Element) XmlUtils.newXPath(
          "io:anzahl_balkone", doc ).selectSingleNode( parentNode );
        if (newNode==null)
        {
          newNode = doc.createElementNS( StringUtils.EMPTY, "anzahl_balkone" );
          newNode.setTextContent( value );
          parentNode.appendChild( newNode );
        }
        else if (StringUtils.isBlank( newNode.getTextContent() ))
        {
          newNode.setTextContent( value );
        }
      }
      parentNode.removeChild( node );
    }
  }

  /**
   * Upgrade &lt;sonstige&gt; elements to OpenImmo 1.2.4.
   * <p>
   * The options "GARAGEN", "PARKFLACHE" for the "sonstige_typ" attribute of
   * &lt;sonstige&gt; elements were removed with OpenImmo 1.2.4.
   * <p>
   * For any occurence of these values the corresponding &lt;sonstige&gt;
   * element is replaced with a &lt;parken&gt; element.
   *
   * @param doc OpenImmo document in version 1.2.3
   * @throws JaxenException
   */
  protected void upgradeSonstigeElements( Document doc ) throws JaxenException
  {
    List nodes = XmlUtils.newXPath(
      "/io:openimmo/io:anbieter/io:immobilie/io:objektkategorie/io:objektart/io:sonstige[@sonstige_typ]",
      doc ).selectNodes( doc );
    for (Object item : nodes)
    {
      Element node = (Element) item;
      String value = StringUtils.trimToNull( node.getAttribute( "sonstige_typ" ) );
      if ("GARAGEN".equalsIgnoreCase( value ) || "PARKFLACHE".equalsIgnoreCase( value ))
      {
        Element parentNode = (Element) node.getParentNode();
        parentNode.removeChild( node );

        Element newNode = doc.createElementNS( StringUtils.EMPTY, "parken" );
        newNode.setAttribute( "parken_typ", "STELLPLATZ" );
        parentNode.appendChild( newNode );
      }
    }
  }
}