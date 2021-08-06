
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for WazTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WazTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}ImmobilieBaseTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pauschalmiete"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}WazMieteBaseTyp"&gt;
 *                 &lt;attribute name="MietePauschal" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *                 &lt;attribute name="MietePro" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}WazZeiteinheitenTyp" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Monatsmiete" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}WazMieteBaseTyp"&gt;
 *                 &lt;attribute name="Kaltmiete" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *                 &lt;attribute name="Nebenkosten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BefeuerungsArt" type="{http://www.immobilienscout24.de/immobilientransfer}BefeuerungsArtTyp" minOccurs="0"/&gt;
 *         &lt;element name="Energieausweis" type="{http://www.immobilienscout24.de/immobilientransfer}EnergieausweisTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="WazKategorie" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}WazKategorienTyp" /&gt;
 *       &lt;attribute name="Wohnflaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Zimmer" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}ZimmeranzahlTyp" /&gt;
 *       &lt;attribute name="FreiBis" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="Midestmietdauer" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl52Typ" /&gt;
 *       &lt;attribute name="Maximalmietdauer" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl52Typ" /&gt;
 *       &lt;attribute name="Etage" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3i0Typ" /&gt;
 *       &lt;attribute name="Etagenzahl" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3Typ" /&gt;
 *       &lt;attribute name="Objektzustand" type="{http://www.immobilienscout24.de/immobilientransfer}WazObjektZustandTyp" /&gt;
 *       &lt;attribute name="Heizungsart" type="{http://www.immobilienscout24.de/immobilientransfer}HeizungsartTyp" /&gt;
 *       &lt;attribute name="Aufzug" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Haustiere" type="{http://www.immobilienscout24.de/immobilientransfer}GenehmigungTyp" /&gt;
 *       &lt;attribute name="BalkonTerrasse" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GartenBenutzung" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Mobilar" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RaucherOk" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Geschlecht" type="{http://www.immobilienscout24.de/immobilientransfer}GeschlechtTyp" /&gt;
 *       &lt;attribute name="AnzahlPersonen" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
 *       &lt;attribute name="FreiAb" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="Parkplatz" type="{http://www.immobilienscout24.de/immobilientransfer}StellplatzKategorieTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="AnzahlGaragenStellplaetze" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
 *       &lt;attribute name="Keller" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GaesteWC" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Rollstuhlgerecht" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Barrierefrei" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Parkplatzmiete" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="Kaution" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WazTyp", propOrder = {
    "pauschalmiete",
    "monatsmiete",
    "befeuerungsArt",
    "energieausweis"
})
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.WAZ.Type.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
public class WazTyp
    extends ImmobilieBaseTyp
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "Pauschalmiete", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected WazTyp.Pauschalmiete pauschalmiete;
    @XmlElement(name = "Monatsmiete")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected WazTyp.Monatsmiete monatsmiete;
    @XmlElement(name = "BefeuerungsArt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BefeuerungsArtTyp befeuerungsArt;
    @XmlElement(name = "Energieausweis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected EnergieausweisTyp energieausweis;
    @XmlAttribute(name = "WazKategorie", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected WazKategorienTyp wazKategorie;
    @XmlAttribute(name = "Wohnflaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal wohnflaeche;
    @XmlAttribute(name = "Zimmer", required = true)
    @XmlJavaTypeAdapter(Adapter32 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal zimmer;
    @XmlAttribute(name = "FreiBis")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar freiBis;
    @XmlAttribute(name = "Midestmietdauer")
    @XmlJavaTypeAdapter(Adapter30 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal midestmietdauer;
    @XmlAttribute(name = "Maximalmietdauer")
    @XmlJavaTypeAdapter(Adapter30 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal maximalmietdauer;
    @XmlAttribute(name = "Etage")
    @XmlJavaTypeAdapter(Adapter20 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Long etage;
    @XmlAttribute(name = "Etagenzahl")
    @XmlJavaTypeAdapter(Adapter21 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Long etagenzahl;
    @XmlAttribute(name = "Objektzustand")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected WazObjektZustandTyp objektzustand;
    @XmlAttribute(name = "Heizungsart")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected HeizungsartTyp heizungsart;
    @XmlAttribute(name = "Aufzug")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean aufzug;
    @XmlAttribute(name = "Haustiere")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected GenehmigungTyp haustiere;
    @XmlAttribute(name = "BalkonTerrasse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean balkonTerrasse;
    @XmlAttribute(name = "GartenBenutzung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean gartenBenutzung;
    @XmlAttribute(name = "Mobilar")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean mobilar;
    @XmlAttribute(name = "RaucherOk")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean raucherOk;
    @XmlAttribute(name = "Geschlecht")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected GeschlechtTyp geschlecht;
    @XmlAttribute(name = "AnzahlPersonen")
    @XmlJavaTypeAdapter(Adapter19 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Long anzahlPersonen;
    @XmlAttribute(name = "FreiAb", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar freiAb;
    @XmlAttribute(name = "Parkplatz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected StellplatzKategorieTyp parkplatz;
    @XmlAttribute(name = "AnzahlGaragenStellplaetze")
    @XmlJavaTypeAdapter(Adapter19 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Long anzahlGaragenStellplaetze;
    @XmlAttribute(name = "Keller")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean keller;
    @XmlAttribute(name = "GaesteWC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean gaesteWC;
    @XmlAttribute(name = "Rollstuhlgerecht")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean rollstuhlgerecht;
    @XmlAttribute(name = "Barrierefrei")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean barrierefrei;
    @XmlAttribute(name = "Parkplatzmiete")
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal parkplatzmiete;
    @XmlAttribute(name = "Kaution")
    @XmlJavaTypeAdapter(Adapter7 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected String kaution;

    /**
     * Gets the value of the pauschalmiete property.
     * 
     * @return
     *     possible object is
     *     {@link WazTyp.Pauschalmiete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public WazTyp.Pauschalmiete getPauschalmiete() {
        return pauschalmiete;
    }

    /**
     * Sets the value of the pauschalmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link WazTyp.Pauschalmiete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setPauschalmiete(WazTyp.Pauschalmiete value) {
        this.pauschalmiete = value;
    }

    /**
     * Gets the value of the monatsmiete property.
     * 
     * @return
     *     possible object is
     *     {@link WazTyp.Monatsmiete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public WazTyp.Monatsmiete getMonatsmiete() {
        return monatsmiete;
    }

    /**
     * Sets the value of the monatsmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link WazTyp.Monatsmiete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setMonatsmiete(WazTyp.Monatsmiete value) {
        this.monatsmiete = value;
    }

    /**
     * Gets the value of the befeuerungsArt property.
     * 
     * @return
     *     possible object is
     *     {@link BefeuerungsArtTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public BefeuerungsArtTyp getBefeuerungsArt() {
        return befeuerungsArt;
    }

    /**
     * Sets the value of the befeuerungsArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BefeuerungsArtTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setBefeuerungsArt(BefeuerungsArtTyp value) {
        this.befeuerungsArt = value;
    }

    /**
     * Gets the value of the energieausweis property.
     * 
     * @return
     *     possible object is
     *     {@link EnergieausweisTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public EnergieausweisTyp getEnergieausweis() {
        return energieausweis;
    }

    /**
     * Sets the value of the energieausweis property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergieausweisTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setEnergieausweis(EnergieausweisTyp value) {
        this.energieausweis = value;
    }

    /**
     * Gets the value of the wazKategorie property.
     * 
     * @return
     *     possible object is
     *     {@link WazKategorienTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public WazKategorienTyp getWazKategorie() {
        return wazKategorie;
    }

    /**
     * Sets the value of the wazKategorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link WazKategorienTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setWazKategorie(WazKategorienTyp value) {
        this.wazKategorie = value;
    }

    /**
     * Gets the value of the wohnflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getWohnflaeche() {
        return wohnflaeche;
    }

    /**
     * Sets the value of the wohnflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setWohnflaeche(BigDecimal value) {
        this.wohnflaeche = value;
    }

    /**
     * Gets the value of the zimmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getZimmer() {
        return zimmer;
    }

    /**
     * Sets the value of the zimmer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setZimmer(BigDecimal value) {
        this.zimmer = value;
    }

    /**
     * Gets the value of the freiBis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Calendar getFreiBis() {
        return freiBis;
    }

    /**
     * Sets the value of the freiBis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setFreiBis(Calendar value) {
        this.freiBis = value;
    }

    /**
     * Gets the value of the midestmietdauer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getMidestmietdauer() {
        return midestmietdauer;
    }

    /**
     * Sets the value of the midestmietdauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setMidestmietdauer(BigDecimal value) {
        this.midestmietdauer = value;
    }

    /**
     * Gets the value of the maximalmietdauer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getMaximalmietdauer() {
        return maximalmietdauer;
    }

    /**
     * Sets the value of the maximalmietdauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setMaximalmietdauer(BigDecimal value) {
        this.maximalmietdauer = value;
    }

    /**
     * Gets the value of the etage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Long getEtage() {
        return etage;
    }

    /**
     * Sets the value of the etage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setEtage(Long value) {
        this.etage = value;
    }

    /**
     * Gets the value of the etagenzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Long getEtagenzahl() {
        return etagenzahl;
    }

    /**
     * Sets the value of the etagenzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setEtagenzahl(Long value) {
        this.etagenzahl = value;
    }

    /**
     * Gets the value of the objektzustand property.
     * 
     * @return
     *     possible object is
     *     {@link WazObjektZustandTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public WazObjektZustandTyp getObjektzustand() {
        return objektzustand;
    }

    /**
     * Sets the value of the objektzustand property.
     * 
     * @param value
     *     allowed object is
     *     {@link WazObjektZustandTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setObjektzustand(WazObjektZustandTyp value) {
        this.objektzustand = value;
    }

    /**
     * Gets the value of the heizungsart property.
     * 
     * @return
     *     possible object is
     *     {@link HeizungsartTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public HeizungsartTyp getHeizungsart() {
        return heizungsart;
    }

    /**
     * Sets the value of the heizungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeizungsartTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setHeizungsart(HeizungsartTyp value) {
        this.heizungsart = value;
    }

    /**
     * Gets the value of the aufzug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getAufzug() {
        return aufzug;
    }

    /**
     * Sets the value of the aufzug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setAufzug(Boolean value) {
        this.aufzug = value;
    }

    /**
     * Gets the value of the haustiere property.
     * 
     * @return
     *     possible object is
     *     {@link GenehmigungTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public GenehmigungTyp getHaustiere() {
        return haustiere;
    }

    /**
     * Sets the value of the haustiere property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenehmigungTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setHaustiere(GenehmigungTyp value) {
        this.haustiere = value;
    }

    /**
     * Gets the value of the balkonTerrasse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getBalkonTerrasse() {
        return balkonTerrasse;
    }

    /**
     * Sets the value of the balkonTerrasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setBalkonTerrasse(Boolean value) {
        this.balkonTerrasse = value;
    }

    /**
     * Gets the value of the gartenBenutzung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getGartenBenutzung() {
        return gartenBenutzung;
    }

    /**
     * Sets the value of the gartenBenutzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setGartenBenutzung(Boolean value) {
        this.gartenBenutzung = value;
    }

    /**
     * Gets the value of the mobilar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getMobilar() {
        return mobilar;
    }

    /**
     * Sets the value of the mobilar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setMobilar(Boolean value) {
        this.mobilar = value;
    }

    /**
     * Gets the value of the raucherOk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getRaucherOk() {
        return raucherOk;
    }

    /**
     * Sets the value of the raucherOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setRaucherOk(Boolean value) {
        this.raucherOk = value;
    }

    /**
     * Gets the value of the geschlecht property.
     * 
     * @return
     *     possible object is
     *     {@link GeschlechtTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public GeschlechtTyp getGeschlecht() {
        return geschlecht;
    }

    /**
     * Sets the value of the geschlecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeschlechtTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setGeschlecht(GeschlechtTyp value) {
        this.geschlecht = value;
    }

    /**
     * Gets the value of the anzahlPersonen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Long getAnzahlPersonen() {
        return anzahlPersonen;
    }

    /**
     * Sets the value of the anzahlPersonen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setAnzahlPersonen(Long value) {
        this.anzahlPersonen = value;
    }

    /**
     * Gets the value of the freiAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Calendar getFreiAb() {
        return freiAb;
    }

    /**
     * Sets the value of the freiAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setFreiAb(Calendar value) {
        this.freiAb = value;
    }

    /**
     * Gets the value of the parkplatz property.
     * 
     * @return
     *     possible object is
     *     {@link StellplatzKategorieTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public StellplatzKategorieTyp getParkplatz() {
        if (parkplatz == null) {
            return StellplatzKategorieTyp.KEINE_ANGABE;
        } else {
            return parkplatz;
        }
    }

    /**
     * Sets the value of the parkplatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StellplatzKategorieTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setParkplatz(StellplatzKategorieTyp value) {
        this.parkplatz = value;
    }

    /**
     * Gets the value of the anzahlGaragenStellplaetze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Long getAnzahlGaragenStellplaetze() {
        return anzahlGaragenStellplaetze;
    }

    /**
     * Sets the value of the anzahlGaragenStellplaetze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setAnzahlGaragenStellplaetze(Long value) {
        this.anzahlGaragenStellplaetze = value;
    }

    /**
     * Gets the value of the keller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getKeller() {
        return keller;
    }

    /**
     * Sets the value of the keller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setKeller(Boolean value) {
        this.keller = value;
    }

    /**
     * Gets the value of the gaesteWC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getGaesteWC() {
        return gaesteWC;
    }

    /**
     * Sets the value of the gaesteWC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setGaesteWC(Boolean value) {
        this.gaesteWC = value;
    }

    /**
     * Gets the value of the rollstuhlgerecht property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getRollstuhlgerecht() {
        return rollstuhlgerecht;
    }

    /**
     * Sets the value of the rollstuhlgerecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setRollstuhlgerecht(Boolean value) {
        this.rollstuhlgerecht = value;
    }

    /**
     * Gets the value of the barrierefrei property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getBarrierefrei() {
        return barrierefrei;
    }

    /**
     * Sets the value of the barrierefrei property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setBarrierefrei(Boolean value) {
        this.barrierefrei = value;
    }

    /**
     * Gets the value of the parkplatzmiete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getParkplatzmiete() {
        return parkplatzmiete;
    }

    /**
     * Sets the value of the parkplatzmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setParkplatzmiete(BigDecimal value) {
        this.parkplatzmiete = value;
    }

    /**
     * Gets the value of the kaution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public String getKaution() {
        return kaution;
    }

    /**
     * Sets the value of the kaution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setKaution(String value) {
        this.kaution = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            WazTyp.Pauschalmiete thePauschalmiete;
            thePauschalmiete = this.getPauschalmiete();
            strategy.appendField(locator, this, "pauschalmiete", buffer, thePauschalmiete, (this.pauschalmiete!= null));
        }
        {
            WazTyp.Monatsmiete theMonatsmiete;
            theMonatsmiete = this.getMonatsmiete();
            strategy.appendField(locator, this, "monatsmiete", buffer, theMonatsmiete, (this.monatsmiete!= null));
        }
        {
            BefeuerungsArtTyp theBefeuerungsArt;
            theBefeuerungsArt = this.getBefeuerungsArt();
            strategy.appendField(locator, this, "befeuerungsArt", buffer, theBefeuerungsArt, (this.befeuerungsArt!= null));
        }
        {
            EnergieausweisTyp theEnergieausweis;
            theEnergieausweis = this.getEnergieausweis();
            strategy.appendField(locator, this, "energieausweis", buffer, theEnergieausweis, (this.energieausweis!= null));
        }
        {
            WazKategorienTyp theWazKategorie;
            theWazKategorie = this.getWazKategorie();
            strategy.appendField(locator, this, "wazKategorie", buffer, theWazKategorie, (this.wazKategorie!= null));
        }
        {
            BigDecimal theWohnflaeche;
            theWohnflaeche = this.getWohnflaeche();
            strategy.appendField(locator, this, "wohnflaeche", buffer, theWohnflaeche, (this.wohnflaeche!= null));
        }
        {
            BigDecimal theZimmer;
            theZimmer = this.getZimmer();
            strategy.appendField(locator, this, "zimmer", buffer, theZimmer, (this.zimmer!= null));
        }
        {
            Calendar theFreiBis;
            theFreiBis = this.getFreiBis();
            strategy.appendField(locator, this, "freiBis", buffer, theFreiBis, (this.freiBis!= null));
        }
        {
            BigDecimal theMidestmietdauer;
            theMidestmietdauer = this.getMidestmietdauer();
            strategy.appendField(locator, this, "midestmietdauer", buffer, theMidestmietdauer, (this.midestmietdauer!= null));
        }
        {
            BigDecimal theMaximalmietdauer;
            theMaximalmietdauer = this.getMaximalmietdauer();
            strategy.appendField(locator, this, "maximalmietdauer", buffer, theMaximalmietdauer, (this.maximalmietdauer!= null));
        }
        {
            Long theEtage;
            theEtage = this.getEtage();
            strategy.appendField(locator, this, "etage", buffer, theEtage, (this.etage!= null));
        }
        {
            Long theEtagenzahl;
            theEtagenzahl = this.getEtagenzahl();
            strategy.appendField(locator, this, "etagenzahl", buffer, theEtagenzahl, (this.etagenzahl!= null));
        }
        {
            WazObjektZustandTyp theObjektzustand;
            theObjektzustand = this.getObjektzustand();
            strategy.appendField(locator, this, "objektzustand", buffer, theObjektzustand, (this.objektzustand!= null));
        }
        {
            HeizungsartTyp theHeizungsart;
            theHeizungsart = this.getHeizungsart();
            strategy.appendField(locator, this, "heizungsart", buffer, theHeizungsart, (this.heizungsart!= null));
        }
        {
            Boolean theAufzug;
            theAufzug = this.getAufzug();
            strategy.appendField(locator, this, "aufzug", buffer, theAufzug, (this.aufzug!= null));
        }
        {
            GenehmigungTyp theHaustiere;
            theHaustiere = this.getHaustiere();
            strategy.appendField(locator, this, "haustiere", buffer, theHaustiere, (this.haustiere!= null));
        }
        {
            Boolean theBalkonTerrasse;
            theBalkonTerrasse = this.getBalkonTerrasse();
            strategy.appendField(locator, this, "balkonTerrasse", buffer, theBalkonTerrasse, (this.balkonTerrasse!= null));
        }
        {
            Boolean theGartenBenutzung;
            theGartenBenutzung = this.getGartenBenutzung();
            strategy.appendField(locator, this, "gartenBenutzung", buffer, theGartenBenutzung, (this.gartenBenutzung!= null));
        }
        {
            Boolean theMobilar;
            theMobilar = this.getMobilar();
            strategy.appendField(locator, this, "mobilar", buffer, theMobilar, (this.mobilar!= null));
        }
        {
            Boolean theRaucherOk;
            theRaucherOk = this.getRaucherOk();
            strategy.appendField(locator, this, "raucherOk", buffer, theRaucherOk, (this.raucherOk!= null));
        }
        {
            GeschlechtTyp theGeschlecht;
            theGeschlecht = this.getGeschlecht();
            strategy.appendField(locator, this, "geschlecht", buffer, theGeschlecht, (this.geschlecht!= null));
        }
        {
            Long theAnzahlPersonen;
            theAnzahlPersonen = this.getAnzahlPersonen();
            strategy.appendField(locator, this, "anzahlPersonen", buffer, theAnzahlPersonen, (this.anzahlPersonen!= null));
        }
        {
            Calendar theFreiAb;
            theFreiAb = this.getFreiAb();
            strategy.appendField(locator, this, "freiAb", buffer, theFreiAb, (this.freiAb!= null));
        }
        {
            StellplatzKategorieTyp theParkplatz;
            theParkplatz = this.getParkplatz();
            strategy.appendField(locator, this, "parkplatz", buffer, theParkplatz, (this.parkplatz!= null));
        }
        {
            Long theAnzahlGaragenStellplaetze;
            theAnzahlGaragenStellplaetze = this.getAnzahlGaragenStellplaetze();
            strategy.appendField(locator, this, "anzahlGaragenStellplaetze", buffer, theAnzahlGaragenStellplaetze, (this.anzahlGaragenStellplaetze!= null));
        }
        {
            Boolean theKeller;
            theKeller = this.getKeller();
            strategy.appendField(locator, this, "keller", buffer, theKeller, (this.keller!= null));
        }
        {
            Boolean theGaesteWC;
            theGaesteWC = this.getGaesteWC();
            strategy.appendField(locator, this, "gaesteWC", buffer, theGaesteWC, (this.gaesteWC!= null));
        }
        {
            Boolean theRollstuhlgerecht;
            theRollstuhlgerecht = this.getRollstuhlgerecht();
            strategy.appendField(locator, this, "rollstuhlgerecht", buffer, theRollstuhlgerecht, (this.rollstuhlgerecht!= null));
        }
        {
            Boolean theBarrierefrei;
            theBarrierefrei = this.getBarrierefrei();
            strategy.appendField(locator, this, "barrierefrei", buffer, theBarrierefrei, (this.barrierefrei!= null));
        }
        {
            BigDecimal theParkplatzmiete;
            theParkplatzmiete = this.getParkplatzmiete();
            strategy.appendField(locator, this, "parkplatzmiete", buffer, theParkplatzmiete, (this.parkplatzmiete!= null));
        }
        {
            String theKaution;
            theKaution = this.getKaution();
            strategy.appendField(locator, this, "kaution", buffer, theKaution, (this.kaution!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof WazTyp) {
            final WazTyp copy = ((WazTyp) draftCopy);
            {
                Boolean pauschalmieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pauschalmiete!= null));
                if (pauschalmieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    WazTyp.Pauschalmiete sourcePauschalmiete;
                    sourcePauschalmiete = this.getPauschalmiete();
                    WazTyp.Pauschalmiete copyPauschalmiete = ((WazTyp.Pauschalmiete) strategy.copy(LocatorUtils.property(locator, "pauschalmiete", sourcePauschalmiete), sourcePauschalmiete, (this.pauschalmiete!= null)));
                    copy.setPauschalmiete(copyPauschalmiete);
                } else {
                    if (pauschalmieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pauschalmiete = null;
                    }
                }
            }
            {
                Boolean monatsmieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.monatsmiete!= null));
                if (monatsmieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    WazTyp.Monatsmiete sourceMonatsmiete;
                    sourceMonatsmiete = this.getMonatsmiete();
                    WazTyp.Monatsmiete copyMonatsmiete = ((WazTyp.Monatsmiete) strategy.copy(LocatorUtils.property(locator, "monatsmiete", sourceMonatsmiete), sourceMonatsmiete, (this.monatsmiete!= null)));
                    copy.setMonatsmiete(copyMonatsmiete);
                } else {
                    if (monatsmieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.monatsmiete = null;
                    }
                }
            }
            {
                Boolean befeuerungsArtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.befeuerungsArt!= null));
                if (befeuerungsArtShouldBeCopiedAndSet == Boolean.TRUE) {
                    BefeuerungsArtTyp sourceBefeuerungsArt;
                    sourceBefeuerungsArt = this.getBefeuerungsArt();
                    BefeuerungsArtTyp copyBefeuerungsArt = ((BefeuerungsArtTyp) strategy.copy(LocatorUtils.property(locator, "befeuerungsArt", sourceBefeuerungsArt), sourceBefeuerungsArt, (this.befeuerungsArt!= null)));
                    copy.setBefeuerungsArt(copyBefeuerungsArt);
                } else {
                    if (befeuerungsArtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.befeuerungsArt = null;
                    }
                }
            }
            {
                Boolean energieausweisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energieausweis!= null));
                if (energieausweisShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergieausweisTyp sourceEnergieausweis;
                    sourceEnergieausweis = this.getEnergieausweis();
                    EnergieausweisTyp copyEnergieausweis = ((EnergieausweisTyp) strategy.copy(LocatorUtils.property(locator, "energieausweis", sourceEnergieausweis), sourceEnergieausweis, (this.energieausweis!= null)));
                    copy.setEnergieausweis(copyEnergieausweis);
                } else {
                    if (energieausweisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energieausweis = null;
                    }
                }
            }
            {
                Boolean wazKategorieShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wazKategorie!= null));
                if (wazKategorieShouldBeCopiedAndSet == Boolean.TRUE) {
                    WazKategorienTyp sourceWazKategorie;
                    sourceWazKategorie = this.getWazKategorie();
                    WazKategorienTyp copyWazKategorie = ((WazKategorienTyp) strategy.copy(LocatorUtils.property(locator, "wazKategorie", sourceWazKategorie), sourceWazKategorie, (this.wazKategorie!= null)));
                    copy.setWazKategorie(copyWazKategorie);
                } else {
                    if (wazKategorieShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wazKategorie = null;
                    }
                }
            }
            {
                Boolean wohnflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wohnflaeche!= null));
                if (wohnflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWohnflaeche;
                    sourceWohnflaeche = this.getWohnflaeche();
                    BigDecimal copyWohnflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "wohnflaeche", sourceWohnflaeche), sourceWohnflaeche, (this.wohnflaeche!= null)));
                    copy.setWohnflaeche(copyWohnflaeche);
                } else {
                    if (wohnflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohnflaeche = null;
                    }
                }
            }
            {
                Boolean zimmerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zimmer!= null));
                if (zimmerShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceZimmer;
                    sourceZimmer = this.getZimmer();
                    BigDecimal copyZimmer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "zimmer", sourceZimmer), sourceZimmer, (this.zimmer!= null)));
                    copy.setZimmer(copyZimmer);
                } else {
                    if (zimmerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zimmer = null;
                    }
                }
            }
            {
                Boolean freiBisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freiBis!= null));
                if (freiBisShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceFreiBis;
                    sourceFreiBis = this.getFreiBis();
                    Calendar copyFreiBis = ((Calendar) strategy.copy(LocatorUtils.property(locator, "freiBis", sourceFreiBis), sourceFreiBis, (this.freiBis!= null)));
                    copy.setFreiBis(copyFreiBis);
                } else {
                    if (freiBisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freiBis = null;
                    }
                }
            }
            {
                Boolean midestmietdauerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.midestmietdauer!= null));
                if (midestmietdauerShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMidestmietdauer;
                    sourceMidestmietdauer = this.getMidestmietdauer();
                    BigDecimal copyMidestmietdauer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "midestmietdauer", sourceMidestmietdauer), sourceMidestmietdauer, (this.midestmietdauer!= null)));
                    copy.setMidestmietdauer(copyMidestmietdauer);
                } else {
                    if (midestmietdauerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.midestmietdauer = null;
                    }
                }
            }
            {
                Boolean maximalmietdauerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maximalmietdauer!= null));
                if (maximalmietdauerShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMaximalmietdauer;
                    sourceMaximalmietdauer = this.getMaximalmietdauer();
                    BigDecimal copyMaximalmietdauer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "maximalmietdauer", sourceMaximalmietdauer), sourceMaximalmietdauer, (this.maximalmietdauer!= null)));
                    copy.setMaximalmietdauer(copyMaximalmietdauer);
                } else {
                    if (maximalmietdauerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maximalmietdauer = null;
                    }
                }
            }
            {
                Boolean etageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.etage!= null));
                if (etageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceEtage;
                    sourceEtage = this.getEtage();
                    Long copyEtage = ((Long) strategy.copy(LocatorUtils.property(locator, "etage", sourceEtage), sourceEtage, (this.etage!= null)));
                    copy.setEtage(copyEtage);
                } else {
                    if (etageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.etage = null;
                    }
                }
            }
            {
                Boolean etagenzahlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.etagenzahl!= null));
                if (etagenzahlShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceEtagenzahl;
                    sourceEtagenzahl = this.getEtagenzahl();
                    Long copyEtagenzahl = ((Long) strategy.copy(LocatorUtils.property(locator, "etagenzahl", sourceEtagenzahl), sourceEtagenzahl, (this.etagenzahl!= null)));
                    copy.setEtagenzahl(copyEtagenzahl);
                } else {
                    if (etagenzahlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.etagenzahl = null;
                    }
                }
            }
            {
                Boolean objektzustandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektzustand!= null));
                if (objektzustandShouldBeCopiedAndSet == Boolean.TRUE) {
                    WazObjektZustandTyp sourceObjektzustand;
                    sourceObjektzustand = this.getObjektzustand();
                    WazObjektZustandTyp copyObjektzustand = ((WazObjektZustandTyp) strategy.copy(LocatorUtils.property(locator, "objektzustand", sourceObjektzustand), sourceObjektzustand, (this.objektzustand!= null)));
                    copy.setObjektzustand(copyObjektzustand);
                } else {
                    if (objektzustandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektzustand = null;
                    }
                }
            }
            {
                Boolean heizungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heizungsart!= null));
                if (heizungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    HeizungsartTyp sourceHeizungsart;
                    sourceHeizungsart = this.getHeizungsart();
                    HeizungsartTyp copyHeizungsart = ((HeizungsartTyp) strategy.copy(LocatorUtils.property(locator, "heizungsart", sourceHeizungsart), sourceHeizungsart, (this.heizungsart!= null)));
                    copy.setHeizungsart(copyHeizungsart);
                } else {
                    if (heizungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heizungsart = null;
                    }
                }
            }
            {
                Boolean aufzugShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aufzug!= null));
                if (aufzugShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAufzug;
                    sourceAufzug = this.getAufzug();
                    Boolean copyAufzug = ((Boolean) strategy.copy(LocatorUtils.property(locator, "aufzug", sourceAufzug), sourceAufzug, (this.aufzug!= null)));
                    copy.setAufzug(copyAufzug);
                } else {
                    if (aufzugShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aufzug = null;
                    }
                }
            }
            {
                Boolean haustiereShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.haustiere!= null));
                if (haustiereShouldBeCopiedAndSet == Boolean.TRUE) {
                    GenehmigungTyp sourceHaustiere;
                    sourceHaustiere = this.getHaustiere();
                    GenehmigungTyp copyHaustiere = ((GenehmigungTyp) strategy.copy(LocatorUtils.property(locator, "haustiere", sourceHaustiere), sourceHaustiere, (this.haustiere!= null)));
                    copy.setHaustiere(copyHaustiere);
                } else {
                    if (haustiereShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.haustiere = null;
                    }
                }
            }
            {
                Boolean balkonTerrasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balkonTerrasse!= null));
                if (balkonTerrasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBalkonTerrasse;
                    sourceBalkonTerrasse = this.getBalkonTerrasse();
                    Boolean copyBalkonTerrasse = ((Boolean) strategy.copy(LocatorUtils.property(locator, "balkonTerrasse", sourceBalkonTerrasse), sourceBalkonTerrasse, (this.balkonTerrasse!= null)));
                    copy.setBalkonTerrasse(copyBalkonTerrasse);
                } else {
                    if (balkonTerrasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.balkonTerrasse = null;
                    }
                }
            }
            {
                Boolean gartenBenutzungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gartenBenutzung!= null));
                if (gartenBenutzungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGartenBenutzung;
                    sourceGartenBenutzung = this.getGartenBenutzung();
                    Boolean copyGartenBenutzung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gartenBenutzung", sourceGartenBenutzung), sourceGartenBenutzung, (this.gartenBenutzung!= null)));
                    copy.setGartenBenutzung(copyGartenBenutzung);
                } else {
                    if (gartenBenutzungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gartenBenutzung = null;
                    }
                }
            }
            {
                Boolean mobilarShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mobilar!= null));
                if (mobilarShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceMobilar;
                    sourceMobilar = this.getMobilar();
                    Boolean copyMobilar = ((Boolean) strategy.copy(LocatorUtils.property(locator, "mobilar", sourceMobilar), sourceMobilar, (this.mobilar!= null)));
                    copy.setMobilar(copyMobilar);
                } else {
                    if (mobilarShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mobilar = null;
                    }
                }
            }
            {
                Boolean raucherOkShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.raucherOk!= null));
                if (raucherOkShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRaucherOk;
                    sourceRaucherOk = this.getRaucherOk();
                    Boolean copyRaucherOk = ((Boolean) strategy.copy(LocatorUtils.property(locator, "raucherOk", sourceRaucherOk), sourceRaucherOk, (this.raucherOk!= null)));
                    copy.setRaucherOk(copyRaucherOk);
                } else {
                    if (raucherOkShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.raucherOk = null;
                    }
                }
            }
            {
                Boolean geschlechtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geschlecht!= null));
                if (geschlechtShouldBeCopiedAndSet == Boolean.TRUE) {
                    GeschlechtTyp sourceGeschlecht;
                    sourceGeschlecht = this.getGeschlecht();
                    GeschlechtTyp copyGeschlecht = ((GeschlechtTyp) strategy.copy(LocatorUtils.property(locator, "geschlecht", sourceGeschlecht), sourceGeschlecht, (this.geschlecht!= null)));
                    copy.setGeschlecht(copyGeschlecht);
                } else {
                    if (geschlechtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geschlecht = null;
                    }
                }
            }
            {
                Boolean anzahlPersonenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlPersonen!= null));
                if (anzahlPersonenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAnzahlPersonen;
                    sourceAnzahlPersonen = this.getAnzahlPersonen();
                    Long copyAnzahlPersonen = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlPersonen", sourceAnzahlPersonen), sourceAnzahlPersonen, (this.anzahlPersonen!= null)));
                    copy.setAnzahlPersonen(copyAnzahlPersonen);
                } else {
                    if (anzahlPersonenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlPersonen = null;
                    }
                }
            }
            {
                Boolean freiAbShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freiAb!= null));
                if (freiAbShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceFreiAb;
                    sourceFreiAb = this.getFreiAb();
                    Calendar copyFreiAb = ((Calendar) strategy.copy(LocatorUtils.property(locator, "freiAb", sourceFreiAb), sourceFreiAb, (this.freiAb!= null)));
                    copy.setFreiAb(copyFreiAb);
                } else {
                    if (freiAbShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freiAb = null;
                    }
                }
            }
            {
                Boolean parkplatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkplatz!= null));
                if (parkplatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    StellplatzKategorieTyp sourceParkplatz;
                    sourceParkplatz = this.getParkplatz();
                    StellplatzKategorieTyp copyParkplatz = ((StellplatzKategorieTyp) strategy.copy(LocatorUtils.property(locator, "parkplatz", sourceParkplatz), sourceParkplatz, (this.parkplatz!= null)));
                    copy.setParkplatz(copyParkplatz);
                } else {
                    if (parkplatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkplatz = null;
                    }
                }
            }
            {
                Boolean anzahlGaragenStellplaetzeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlGaragenStellplaetze!= null));
                if (anzahlGaragenStellplaetzeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAnzahlGaragenStellplaetze;
                    sourceAnzahlGaragenStellplaetze = this.getAnzahlGaragenStellplaetze();
                    Long copyAnzahlGaragenStellplaetze = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlGaragenStellplaetze", sourceAnzahlGaragenStellplaetze), sourceAnzahlGaragenStellplaetze, (this.anzahlGaragenStellplaetze!= null)));
                    copy.setAnzahlGaragenStellplaetze(copyAnzahlGaragenStellplaetze);
                } else {
                    if (anzahlGaragenStellplaetzeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlGaragenStellplaetze = null;
                    }
                }
            }
            {
                Boolean kellerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.keller!= null));
                if (kellerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKeller;
                    sourceKeller = this.getKeller();
                    Boolean copyKeller = ((Boolean) strategy.copy(LocatorUtils.property(locator, "keller", sourceKeller), sourceKeller, (this.keller!= null)));
                    copy.setKeller(copyKeller);
                } else {
                    if (kellerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.keller = null;
                    }
                }
            }
            {
                Boolean gaesteWCShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gaesteWC!= null));
                if (gaesteWCShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGaesteWC;
                    sourceGaesteWC = this.getGaesteWC();
                    Boolean copyGaesteWC = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gaesteWC", sourceGaesteWC), sourceGaesteWC, (this.gaesteWC!= null)));
                    copy.setGaesteWC(copyGaesteWC);
                } else {
                    if (gaesteWCShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gaesteWC = null;
                    }
                }
            }
            {
                Boolean rollstuhlgerechtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rollstuhlgerecht!= null));
                if (rollstuhlgerechtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRollstuhlgerecht;
                    sourceRollstuhlgerecht = this.getRollstuhlgerecht();
                    Boolean copyRollstuhlgerecht = ((Boolean) strategy.copy(LocatorUtils.property(locator, "rollstuhlgerecht", sourceRollstuhlgerecht), sourceRollstuhlgerecht, (this.rollstuhlgerecht!= null)));
                    copy.setRollstuhlgerecht(copyRollstuhlgerecht);
                } else {
                    if (rollstuhlgerechtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rollstuhlgerecht = null;
                    }
                }
            }
            {
                Boolean barrierefreiShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.barrierefrei!= null));
                if (barrierefreiShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBarrierefrei;
                    sourceBarrierefrei = this.getBarrierefrei();
                    Boolean copyBarrierefrei = ((Boolean) strategy.copy(LocatorUtils.property(locator, "barrierefrei", sourceBarrierefrei), sourceBarrierefrei, (this.barrierefrei!= null)));
                    copy.setBarrierefrei(copyBarrierefrei);
                } else {
                    if (barrierefreiShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.barrierefrei = null;
                    }
                }
            }
            {
                Boolean parkplatzmieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkplatzmiete!= null));
                if (parkplatzmieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceParkplatzmiete;
                    sourceParkplatzmiete = this.getParkplatzmiete();
                    BigDecimal copyParkplatzmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "parkplatzmiete", sourceParkplatzmiete), sourceParkplatzmiete, (this.parkplatzmiete!= null)));
                    copy.setParkplatzmiete(copyParkplatzmiete);
                } else {
                    if (parkplatzmieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkplatzmiete = null;
                    }
                }
            }
            {
                Boolean kautionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaution!= null));
                if (kautionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKaution;
                    sourceKaution = this.getKaution();
                    String copyKaution = ((String) strategy.copy(LocatorUtils.property(locator, "kaution", sourceKaution), sourceKaution, (this.kaution!= null)));
                    copy.setKaution(copyKaution);
                } else {
                    if (kautionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kaution = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new WazTyp();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final WazTyp that = ((WazTyp) object);
        {
            WazTyp.Pauschalmiete lhsPauschalmiete;
            lhsPauschalmiete = this.getPauschalmiete();
            WazTyp.Pauschalmiete rhsPauschalmiete;
            rhsPauschalmiete = that.getPauschalmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pauschalmiete", lhsPauschalmiete), LocatorUtils.property(thatLocator, "pauschalmiete", rhsPauschalmiete), lhsPauschalmiete, rhsPauschalmiete, (this.pauschalmiete!= null), (that.pauschalmiete!= null))) {
                return false;
            }
        }
        {
            WazTyp.Monatsmiete lhsMonatsmiete;
            lhsMonatsmiete = this.getMonatsmiete();
            WazTyp.Monatsmiete rhsMonatsmiete;
            rhsMonatsmiete = that.getMonatsmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monatsmiete", lhsMonatsmiete), LocatorUtils.property(thatLocator, "monatsmiete", rhsMonatsmiete), lhsMonatsmiete, rhsMonatsmiete, (this.monatsmiete!= null), (that.monatsmiete!= null))) {
                return false;
            }
        }
        {
            BefeuerungsArtTyp lhsBefeuerungsArt;
            lhsBefeuerungsArt = this.getBefeuerungsArt();
            BefeuerungsArtTyp rhsBefeuerungsArt;
            rhsBefeuerungsArt = that.getBefeuerungsArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "befeuerungsArt", lhsBefeuerungsArt), LocatorUtils.property(thatLocator, "befeuerungsArt", rhsBefeuerungsArt), lhsBefeuerungsArt, rhsBefeuerungsArt, (this.befeuerungsArt!= null), (that.befeuerungsArt!= null))) {
                return false;
            }
        }
        {
            EnergieausweisTyp lhsEnergieausweis;
            lhsEnergieausweis = this.getEnergieausweis();
            EnergieausweisTyp rhsEnergieausweis;
            rhsEnergieausweis = that.getEnergieausweis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieausweis", lhsEnergieausweis), LocatorUtils.property(thatLocator, "energieausweis", rhsEnergieausweis), lhsEnergieausweis, rhsEnergieausweis, (this.energieausweis!= null), (that.energieausweis!= null))) {
                return false;
            }
        }
        {
            WazKategorienTyp lhsWazKategorie;
            lhsWazKategorie = this.getWazKategorie();
            WazKategorienTyp rhsWazKategorie;
            rhsWazKategorie = that.getWazKategorie();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wazKategorie", lhsWazKategorie), LocatorUtils.property(thatLocator, "wazKategorie", rhsWazKategorie), lhsWazKategorie, rhsWazKategorie, (this.wazKategorie!= null), (that.wazKategorie!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWohnflaeche;
            lhsWohnflaeche = this.getWohnflaeche();
            BigDecimal rhsWohnflaeche;
            rhsWohnflaeche = that.getWohnflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnflaeche", lhsWohnflaeche), LocatorUtils.property(thatLocator, "wohnflaeche", rhsWohnflaeche), lhsWohnflaeche, rhsWohnflaeche, (this.wohnflaeche!= null), (that.wohnflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsZimmer;
            lhsZimmer = this.getZimmer();
            BigDecimal rhsZimmer;
            rhsZimmer = that.getZimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zimmer", lhsZimmer), LocatorUtils.property(thatLocator, "zimmer", rhsZimmer), lhsZimmer, rhsZimmer, (this.zimmer!= null), (that.zimmer!= null))) {
                return false;
            }
        }
        {
            Calendar lhsFreiBis;
            lhsFreiBis = this.getFreiBis();
            Calendar rhsFreiBis;
            rhsFreiBis = that.getFreiBis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiBis", lhsFreiBis), LocatorUtils.property(thatLocator, "freiBis", rhsFreiBis), lhsFreiBis, rhsFreiBis, (this.freiBis!= null), (that.freiBis!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMidestmietdauer;
            lhsMidestmietdauer = this.getMidestmietdauer();
            BigDecimal rhsMidestmietdauer;
            rhsMidestmietdauer = that.getMidestmietdauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "midestmietdauer", lhsMidestmietdauer), LocatorUtils.property(thatLocator, "midestmietdauer", rhsMidestmietdauer), lhsMidestmietdauer, rhsMidestmietdauer, (this.midestmietdauer!= null), (that.midestmietdauer!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMaximalmietdauer;
            lhsMaximalmietdauer = this.getMaximalmietdauer();
            BigDecimal rhsMaximalmietdauer;
            rhsMaximalmietdauer = that.getMaximalmietdauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximalmietdauer", lhsMaximalmietdauer), LocatorUtils.property(thatLocator, "maximalmietdauer", rhsMaximalmietdauer), lhsMaximalmietdauer, rhsMaximalmietdauer, (this.maximalmietdauer!= null), (that.maximalmietdauer!= null))) {
                return false;
            }
        }
        {
            Long lhsEtage;
            lhsEtage = this.getEtage();
            Long rhsEtage;
            rhsEtage = that.getEtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etage", lhsEtage), LocatorUtils.property(thatLocator, "etage", rhsEtage), lhsEtage, rhsEtage, (this.etage!= null), (that.etage!= null))) {
                return false;
            }
        }
        {
            Long lhsEtagenzahl;
            lhsEtagenzahl = this.getEtagenzahl();
            Long rhsEtagenzahl;
            rhsEtagenzahl = that.getEtagenzahl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etagenzahl", lhsEtagenzahl), LocatorUtils.property(thatLocator, "etagenzahl", rhsEtagenzahl), lhsEtagenzahl, rhsEtagenzahl, (this.etagenzahl!= null), (that.etagenzahl!= null))) {
                return false;
            }
        }
        {
            WazObjektZustandTyp lhsObjektzustand;
            lhsObjektzustand = this.getObjektzustand();
            WazObjektZustandTyp rhsObjektzustand;
            rhsObjektzustand = that.getObjektzustand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektzustand", lhsObjektzustand), LocatorUtils.property(thatLocator, "objektzustand", rhsObjektzustand), lhsObjektzustand, rhsObjektzustand, (this.objektzustand!= null), (that.objektzustand!= null))) {
                return false;
            }
        }
        {
            HeizungsartTyp lhsHeizungsart;
            lhsHeizungsart = this.getHeizungsart();
            HeizungsartTyp rhsHeizungsart;
            rhsHeizungsart = that.getHeizungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizungsart", lhsHeizungsart), LocatorUtils.property(thatLocator, "heizungsart", rhsHeizungsart), lhsHeizungsart, rhsHeizungsart, (this.heizungsart!= null), (that.heizungsart!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAufzug;
            lhsAufzug = this.getAufzug();
            Boolean rhsAufzug;
            rhsAufzug = that.getAufzug();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aufzug", lhsAufzug), LocatorUtils.property(thatLocator, "aufzug", rhsAufzug), lhsAufzug, rhsAufzug, (this.aufzug!= null), (that.aufzug!= null))) {
                return false;
            }
        }
        {
            GenehmigungTyp lhsHaustiere;
            lhsHaustiere = this.getHaustiere();
            GenehmigungTyp rhsHaustiere;
            rhsHaustiere = that.getHaustiere();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haustiere", lhsHaustiere), LocatorUtils.property(thatLocator, "haustiere", rhsHaustiere), lhsHaustiere, rhsHaustiere, (this.haustiere!= null), (that.haustiere!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBalkonTerrasse;
            lhsBalkonTerrasse = this.getBalkonTerrasse();
            Boolean rhsBalkonTerrasse;
            rhsBalkonTerrasse = that.getBalkonTerrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balkonTerrasse", lhsBalkonTerrasse), LocatorUtils.property(thatLocator, "balkonTerrasse", rhsBalkonTerrasse), lhsBalkonTerrasse, rhsBalkonTerrasse, (this.balkonTerrasse!= null), (that.balkonTerrasse!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGartenBenutzung;
            lhsGartenBenutzung = this.getGartenBenutzung();
            Boolean rhsGartenBenutzung;
            rhsGartenBenutzung = that.getGartenBenutzung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gartenBenutzung", lhsGartenBenutzung), LocatorUtils.property(thatLocator, "gartenBenutzung", rhsGartenBenutzung), lhsGartenBenutzung, rhsGartenBenutzung, (this.gartenBenutzung!= null), (that.gartenBenutzung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsMobilar;
            lhsMobilar = this.getMobilar();
            Boolean rhsMobilar;
            rhsMobilar = that.getMobilar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobilar", lhsMobilar), LocatorUtils.property(thatLocator, "mobilar", rhsMobilar), lhsMobilar, rhsMobilar, (this.mobilar!= null), (that.mobilar!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRaucherOk;
            lhsRaucherOk = this.getRaucherOk();
            Boolean rhsRaucherOk;
            rhsRaucherOk = that.getRaucherOk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "raucherOk", lhsRaucherOk), LocatorUtils.property(thatLocator, "raucherOk", rhsRaucherOk), lhsRaucherOk, rhsRaucherOk, (this.raucherOk!= null), (that.raucherOk!= null))) {
                return false;
            }
        }
        {
            GeschlechtTyp lhsGeschlecht;
            lhsGeschlecht = this.getGeschlecht();
            GeschlechtTyp rhsGeschlecht;
            rhsGeschlecht = that.getGeschlecht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geschlecht", lhsGeschlecht), LocatorUtils.property(thatLocator, "geschlecht", rhsGeschlecht), lhsGeschlecht, rhsGeschlecht, (this.geschlecht!= null), (that.geschlecht!= null))) {
                return false;
            }
        }
        {
            Long lhsAnzahlPersonen;
            lhsAnzahlPersonen = this.getAnzahlPersonen();
            Long rhsAnzahlPersonen;
            rhsAnzahlPersonen = that.getAnzahlPersonen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlPersonen", lhsAnzahlPersonen), LocatorUtils.property(thatLocator, "anzahlPersonen", rhsAnzahlPersonen), lhsAnzahlPersonen, rhsAnzahlPersonen, (this.anzahlPersonen!= null), (that.anzahlPersonen!= null))) {
                return false;
            }
        }
        {
            Calendar lhsFreiAb;
            lhsFreiAb = this.getFreiAb();
            Calendar rhsFreiAb;
            rhsFreiAb = that.getFreiAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiAb", lhsFreiAb), LocatorUtils.property(thatLocator, "freiAb", rhsFreiAb), lhsFreiAb, rhsFreiAb, (this.freiAb!= null), (that.freiAb!= null))) {
                return false;
            }
        }
        {
            StellplatzKategorieTyp lhsParkplatz;
            lhsParkplatz = this.getParkplatz();
            StellplatzKategorieTyp rhsParkplatz;
            rhsParkplatz = that.getParkplatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkplatz", lhsParkplatz), LocatorUtils.property(thatLocator, "parkplatz", rhsParkplatz), lhsParkplatz, rhsParkplatz, (this.parkplatz!= null), (that.parkplatz!= null))) {
                return false;
            }
        }
        {
            Long lhsAnzahlGaragenStellplaetze;
            lhsAnzahlGaragenStellplaetze = this.getAnzahlGaragenStellplaetze();
            Long rhsAnzahlGaragenStellplaetze;
            rhsAnzahlGaragenStellplaetze = that.getAnzahlGaragenStellplaetze();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlGaragenStellplaetze", lhsAnzahlGaragenStellplaetze), LocatorUtils.property(thatLocator, "anzahlGaragenStellplaetze", rhsAnzahlGaragenStellplaetze), lhsAnzahlGaragenStellplaetze, rhsAnzahlGaragenStellplaetze, (this.anzahlGaragenStellplaetze!= null), (that.anzahlGaragenStellplaetze!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKeller;
            lhsKeller = this.getKeller();
            Boolean rhsKeller;
            rhsKeller = that.getKeller();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keller", lhsKeller), LocatorUtils.property(thatLocator, "keller", rhsKeller), lhsKeller, rhsKeller, (this.keller!= null), (that.keller!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGaesteWC;
            lhsGaesteWC = this.getGaesteWC();
            Boolean rhsGaesteWC;
            rhsGaesteWC = that.getGaesteWC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gaesteWC", lhsGaesteWC), LocatorUtils.property(thatLocator, "gaesteWC", rhsGaesteWC), lhsGaesteWC, rhsGaesteWC, (this.gaesteWC!= null), (that.gaesteWC!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRollstuhlgerecht;
            lhsRollstuhlgerecht = this.getRollstuhlgerecht();
            Boolean rhsRollstuhlgerecht;
            rhsRollstuhlgerecht = that.getRollstuhlgerecht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rollstuhlgerecht", lhsRollstuhlgerecht), LocatorUtils.property(thatLocator, "rollstuhlgerecht", rhsRollstuhlgerecht), lhsRollstuhlgerecht, rhsRollstuhlgerecht, (this.rollstuhlgerecht!= null), (that.rollstuhlgerecht!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBarrierefrei;
            lhsBarrierefrei = this.getBarrierefrei();
            Boolean rhsBarrierefrei;
            rhsBarrierefrei = that.getBarrierefrei();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barrierefrei", lhsBarrierefrei), LocatorUtils.property(thatLocator, "barrierefrei", rhsBarrierefrei), lhsBarrierefrei, rhsBarrierefrei, (this.barrierefrei!= null), (that.barrierefrei!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsParkplatzmiete;
            lhsParkplatzmiete = this.getParkplatzmiete();
            BigDecimal rhsParkplatzmiete;
            rhsParkplatzmiete = that.getParkplatzmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkplatzmiete", lhsParkplatzmiete), LocatorUtils.property(thatLocator, "parkplatzmiete", rhsParkplatzmiete), lhsParkplatzmiete, rhsParkplatzmiete, (this.parkplatzmiete!= null), (that.parkplatzmiete!= null))) {
                return false;
            }
        }
        {
            String lhsKaution;
            lhsKaution = this.getKaution();
            String rhsKaution;
            rhsKaution = that.getKaution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaution", lhsKaution), LocatorUtils.property(thatLocator, "kaution", rhsKaution), lhsKaution, rhsKaution, (this.kaution!= null), (that.kaution!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}WazMieteBaseTyp"&gt;
     *       &lt;attribute name="Kaltmiete" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
     *       &lt;attribute name="Nebenkosten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public static class Monatsmiete
        extends WazMieteBaseTyp
        implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlAttribute(name = "Kaltmiete")
        @XmlJavaTypeAdapter(Adapter35 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        protected BigDecimal kaltmiete;
        @XmlAttribute(name = "Nebenkosten")
        @XmlJavaTypeAdapter(Adapter35 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        protected BigDecimal nebenkosten;

        /**
         * Gets the value of the kaltmiete property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public BigDecimal getKaltmiete() {
            return kaltmiete;
        }

        /**
         * Sets the value of the kaltmiete property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public void setKaltmiete(BigDecimal value) {
            this.kaltmiete = value;
        }

        /**
         * Gets the value of the nebenkosten property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public BigDecimal getNebenkosten() {
            return nebenkosten;
        }

        /**
         * Sets the value of the nebenkosten property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public void setNebenkosten(BigDecimal value) {
            this.nebenkosten = value;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            super.appendFields(locator, buffer, strategy);
            {
                BigDecimal theKaltmiete;
                theKaltmiete = this.getKaltmiete();
                strategy.appendField(locator, this, "kaltmiete", buffer, theKaltmiete, (this.kaltmiete!= null));
            }
            {
                BigDecimal theNebenkosten;
                theNebenkosten = this.getNebenkosten();
                strategy.appendField(locator, this, "nebenkosten", buffer, theNebenkosten, (this.nebenkosten!= null));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            super.copyTo(locator, draftCopy, strategy);
            if (draftCopy instanceof WazTyp.Monatsmiete) {
                final WazTyp.Monatsmiete copy = ((WazTyp.Monatsmiete) draftCopy);
                {
                    Boolean kaltmieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaltmiete!= null));
                    if (kaltmieteShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigDecimal sourceKaltmiete;
                        sourceKaltmiete = this.getKaltmiete();
                        BigDecimal copyKaltmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaltmiete", sourceKaltmiete), sourceKaltmiete, (this.kaltmiete!= null)));
                        copy.setKaltmiete(copyKaltmiete);
                    } else {
                        if (kaltmieteShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.kaltmiete = null;
                        }
                    }
                }
                {
                    Boolean nebenkostenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nebenkosten!= null));
                    if (nebenkostenShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigDecimal sourceNebenkosten;
                        sourceNebenkosten = this.getNebenkosten();
                        BigDecimal copyNebenkosten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nebenkosten", sourceNebenkosten), sourceNebenkosten, (this.nebenkosten!= null)));
                        copy.setNebenkosten(copyNebenkosten);
                    } else {
                        if (nebenkostenShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.nebenkosten = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new WazTyp.Monatsmiete();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final WazTyp.Monatsmiete that = ((WazTyp.Monatsmiete) object);
            {
                BigDecimal lhsKaltmiete;
                lhsKaltmiete = this.getKaltmiete();
                BigDecimal rhsKaltmiete;
                rhsKaltmiete = that.getKaltmiete();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "kaltmiete", lhsKaltmiete), LocatorUtils.property(thatLocator, "kaltmiete", rhsKaltmiete), lhsKaltmiete, rhsKaltmiete, (this.kaltmiete!= null), (that.kaltmiete!= null))) {
                    return false;
                }
            }
            {
                BigDecimal lhsNebenkosten;
                lhsNebenkosten = this.getNebenkosten();
                BigDecimal rhsNebenkosten;
                rhsNebenkosten = that.getNebenkosten();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "nebenkosten", lhsNebenkosten), LocatorUtils.property(thatLocator, "nebenkosten", rhsNebenkosten), lhsNebenkosten, rhsNebenkosten, (this.nebenkosten!= null), (that.nebenkosten!= null))) {
                    return false;
                }
            }
            return true;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
            return equals(null, null, object, strategy);
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}WazMieteBaseTyp"&gt;
     *       &lt;attribute name="MietePauschal" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
     *       &lt;attribute name="MietePro" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}WazZeiteinheitenTyp" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public static class Pauschalmiete
        extends WazMieteBaseTyp
        implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlAttribute(name = "MietePauschal", required = true)
        @XmlJavaTypeAdapter(Adapter35 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        protected BigDecimal mietePauschal;
        @XmlAttribute(name = "MietePro", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        protected WazZeiteinheitenTyp mietePro;

        /**
         * Gets the value of the mietePauschal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public BigDecimal getMietePauschal() {
            return mietePauschal;
        }

        /**
         * Sets the value of the mietePauschal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public void setMietePauschal(BigDecimal value) {
            this.mietePauschal = value;
        }

        /**
         * Gets the value of the mietePro property.
         * 
         * @return
         *     possible object is
         *     {@link WazZeiteinheitenTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public WazZeiteinheitenTyp getMietePro() {
            return mietePro;
        }

        /**
         * Sets the value of the mietePro property.
         * 
         * @param value
         *     allowed object is
         *     {@link WazZeiteinheitenTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public void setMietePro(WazZeiteinheitenTyp value) {
            this.mietePro = value;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            super.appendFields(locator, buffer, strategy);
            {
                BigDecimal theMietePauschal;
                theMietePauschal = this.getMietePauschal();
                strategy.appendField(locator, this, "mietePauschal", buffer, theMietePauschal, (this.mietePauschal!= null));
            }
            {
                WazZeiteinheitenTyp theMietePro;
                theMietePro = this.getMietePro();
                strategy.appendField(locator, this, "mietePro", buffer, theMietePro, (this.mietePro!= null));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            super.copyTo(locator, draftCopy, strategy);
            if (draftCopy instanceof WazTyp.Pauschalmiete) {
                final WazTyp.Pauschalmiete copy = ((WazTyp.Pauschalmiete) draftCopy);
                {
                    Boolean mietePauschalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mietePauschal!= null));
                    if (mietePauschalShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigDecimal sourceMietePauschal;
                        sourceMietePauschal = this.getMietePauschal();
                        BigDecimal copyMietePauschal = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mietePauschal", sourceMietePauschal), sourceMietePauschal, (this.mietePauschal!= null)));
                        copy.setMietePauschal(copyMietePauschal);
                    } else {
                        if (mietePauschalShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.mietePauschal = null;
                        }
                    }
                }
                {
                    Boolean mieteProShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mietePro!= null));
                    if (mieteProShouldBeCopiedAndSet == Boolean.TRUE) {
                        WazZeiteinheitenTyp sourceMietePro;
                        sourceMietePro = this.getMietePro();
                        WazZeiteinheitenTyp copyMietePro = ((WazZeiteinheitenTyp) strategy.copy(LocatorUtils.property(locator, "mietePro", sourceMietePro), sourceMietePro, (this.mietePro!= null)));
                        copy.setMietePro(copyMietePro);
                    } else {
                        if (mieteProShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.mietePro = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new WazTyp.Pauschalmiete();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final WazTyp.Pauschalmiete that = ((WazTyp.Pauschalmiete) object);
            {
                BigDecimal lhsMietePauschal;
                lhsMietePauschal = this.getMietePauschal();
                BigDecimal rhsMietePauschal;
                rhsMietePauschal = that.getMietePauschal();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mietePauschal", lhsMietePauschal), LocatorUtils.property(thatLocator, "mietePauschal", rhsMietePauschal), lhsMietePauschal, rhsMietePauschal, (this.mietePauschal!= null), (that.mietePauschal!= null))) {
                    return false;
                }
            }
            {
                WazZeiteinheitenTyp lhsMietePro;
                lhsMietePro = this.getMietePro();
                WazZeiteinheitenTyp rhsMietePro;
                rhsMietePro = that.getMietePro();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mietePro", lhsMietePro), LocatorUtils.property(thatLocator, "mietePro", rhsMietePro), lhsMietePro, rhsMietePro, (this.mietePro!= null), (that.mietePro!= null))) {
                    return false;
                }
            }
            return true;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
            return equals(null, null, object, strategy);
        }

    }

}
