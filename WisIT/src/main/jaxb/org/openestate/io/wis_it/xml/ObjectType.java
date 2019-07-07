
package org.openestate.io.wis_it.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for ObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LOESCHEN" type="{}yesNoType"/&gt;
 *         &lt;element name="GUELTIGBIS" type="{}dateTimeType"/&gt;
 *         &lt;element name="IMMOBILIENART" type="{}propertyType"/&gt;
 *         &lt;element name="ORT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FRAKTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MIETEKAUF" type="{}marketingType"/&gt;
 *         &lt;element name="PREIS" type="{}decimalType"/&gt;
 *         &lt;element name="AUFANFRAGE" type="{}yesNoType"/&gt;
 *         &lt;element name="NUTZFLAECHE" type="{}decimalType"/&gt;
 *         &lt;element name="FLAECHEART" type="{}areaType"/&gt;
 *         &lt;element name="STRASSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HAUSNUMMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STIEGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LAT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LNG" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FOERDERBAR" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="KONVENTIONIERT" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="ENERGIEEFFIZIENZKLASSE" type="{}energyEfficiencyClass" minOccurs="0"/&gt;
 *         &lt;element name="KUBATUR" type="{}decimalType" minOccurs="0"/&gt;
 *         &lt;element name="ZUSTAND" type="{}conditionType" minOccurs="0"/&gt;
 *         &lt;element name="ZIMMER" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="STOCKWERKE" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="STOCKWERK" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="AUFZUG" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="GARAGE" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="ABSTELLPLATZ" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="GRUENFLAECHE" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="KELLER" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="TERRASSE" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="LOGGIA" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="BALKON" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="DACHBODEN" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="HEIZUNG" type="{}heatingType" minOccurs="0"/&gt;
 *         &lt;element name="KLIMAHAUS" type="{}energyStandard" minOccurs="0"/&gt;
 *         &lt;element name="UEBERGABEZEITPUNKT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BAUJAHR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INFODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INFOIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BILD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BILD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BILD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BILD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BILD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BILD6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BILD7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BILD8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BILD9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BILD10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOWNLOAD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOWNLOAD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOWNLOAD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectType", propOrder = {
    "id",
    "loeschen",
    "gueltigbis",
    "immobilienart",
    "ort",
    "fraktion",
    "mietekauf",
    "preis",
    "aufanfrage",
    "nutzflaeche",
    "flaecheart",
    "strasse",
    "hausnummer",
    "stiege",
    "lat",
    "lng",
    "foerderbar",
    "konventioniert",
    "energieeffizienzklasse",
    "kubatur",
    "zustand",
    "zimmer",
    "stockwerke",
    "stockwerk",
    "aufzug",
    "garage",
    "abstellplatz",
    "gruenflaeche",
    "keller",
    "terrasse",
    "loggia",
    "balkon",
    "dachboden",
    "heizung",
    "klimahaus",
    "uebergabezeitpunkt",
    "baujahr",
    "infode",
    "infoit",
    "bild1",
    "bild2",
    "bild3",
    "bild4",
    "bild5",
    "bild6",
    "bild7",
    "bild8",
    "bild9",
    "bild10",
    "download1",
    "download2",
    "download3"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
public class ObjectType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "ID", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String id;
    @XmlElement(name = "LOESCHEN", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean loeschen;
    @XmlElement(name = "GUELTIGBIS", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected Calendar gueltigbis;
    @XmlElement(name = "IMMOBILIENART", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected PropertyType immobilienart;
    @XmlElement(name = "ORT", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String ort;
    @XmlElement(name = "FRAKTION")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String fraktion;
    @XmlElement(name = "MIETEKAUF", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected MarketingType mietekauf;
    @XmlElement(name = "PREIS", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal preis;
    @XmlElement(name = "AUFANFRAGE", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean aufanfrage;
    @XmlElement(name = "NUTZFLAECHE", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal nutzflaeche;
    @XmlElement(name = "FLAECHEART", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected AreaType flaecheart;
    @XmlElement(name = "STRASSE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String strasse;
    @XmlElement(name = "HAUSNUMMER")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String hausnummer;
    @XmlElement(name = "STIEGE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String stiege;
    @XmlElement(name = "LAT", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal lat;
    @XmlElement(name = "LNG", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal lng;
    @XmlElement(name = "FOERDERBAR", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean foerderbar;
    @XmlElement(name = "KONVENTIONIERT", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean konventioniert;
    @XmlElement(name = "ENERGIEEFFIZIENZKLASSE")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected EnergyEfficiencyClass energieeffizienzklasse;
    @XmlElement(name = "KUBATUR", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal kubatur;
    @XmlElement(name = "ZUSTAND")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected ConditionType zustand;
    @XmlElement(name = "ZIMMER", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger zimmer;
    @XmlElement(name = "STOCKWERKE", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger stockwerke;
    @XmlElement(name = "STOCKWERK", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger stockwerk;
    @XmlElement(name = "AUFZUG", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean aufzug;
    @XmlElement(name = "GARAGE", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean garage;
    @XmlElement(name = "ABSTELLPLATZ", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean abstellplatz;
    @XmlElement(name = "GRUENFLAECHE", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean gruenflaeche;
    @XmlElement(name = "KELLER", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean keller;
    @XmlElement(name = "TERRASSE", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean terrasse;
    @XmlElement(name = "LOGGIA", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean loggia;
    @XmlElement(name = "BALKON", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean balkon;
    @XmlElement(name = "DACHBODEN", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean dachboden;
    @XmlElement(name = "HEIZUNG")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected HeatingType heizung;
    @XmlElement(name = "KLIMAHAUS")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected EnergyStandard klimahaus;
    @XmlElement(name = "UEBERGABEZEITPUNKT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String uebergabezeitpunkt;
    @XmlElement(name = "BAUJAHR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String baujahr;
    @XmlElement(name = "INFODE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String infode;
    @XmlElement(name = "INFOIT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String infoit;
    @XmlElement(name = "BILD1")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String bild1;
    @XmlElement(name = "BILD2")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String bild2;
    @XmlElement(name = "BILD3")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String bild3;
    @XmlElement(name = "BILD4")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String bild4;
    @XmlElement(name = "BILD5")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String bild5;
    @XmlElement(name = "BILD6")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String bild6;
    @XmlElement(name = "BILD7")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String bild7;
    @XmlElement(name = "BILD8")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String bild8;
    @XmlElement(name = "BILD9")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String bild9;
    @XmlElement(name = "BILD10")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String bild10;
    @XmlElement(name = "DOWNLOAD1")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String download1;
    @XmlElement(name = "DOWNLOAD2")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String download2;
    @XmlElement(name = "DOWNLOAD3")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    protected String download3;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the loeschen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getLOESCHEN() {
        return loeschen;
    }

    /**
     * Sets the value of the loeschen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setLOESCHEN(Boolean value) {
        this.loeschen = value;
    }

    /**
     * Gets the value of the gueltigbis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Calendar getGUELTIGBIS() {
        return gueltigbis;
    }

    /**
     * Sets the value of the gueltigbis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setGUELTIGBIS(Calendar value) {
        this.gueltigbis = value;
    }

    /**
     * Gets the value of the immobilienart property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public PropertyType getIMMOBILIENART() {
        return immobilienart;
    }

    /**
     * Sets the value of the immobilienart property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setIMMOBILIENART(PropertyType value) {
        this.immobilienart = value;
    }

    /**
     * Gets the value of the ort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getORT() {
        return ort;
    }

    /**
     * Sets the value of the ort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setORT(String value) {
        this.ort = value;
    }

    /**
     * Gets the value of the fraktion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getFRAKTION() {
        return fraktion;
    }

    /**
     * Sets the value of the fraktion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setFRAKTION(String value) {
        this.fraktion = value;
    }

    /**
     * Gets the value of the mietekauf property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public MarketingType getMIETEKAUF() {
        return mietekauf;
    }

    /**
     * Sets the value of the mietekauf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setMIETEKAUF(MarketingType value) {
        this.mietekauf = value;
    }

    /**
     * Gets the value of the preis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getPREIS() {
        return preis;
    }

    /**
     * Sets the value of the preis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setPREIS(BigDecimal value) {
        this.preis = value;
    }

    /**
     * Gets the value of the aufanfrage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getAUFANFRAGE() {
        return aufanfrage;
    }

    /**
     * Sets the value of the aufanfrage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setAUFANFRAGE(Boolean value) {
        this.aufanfrage = value;
    }

    /**
     * Gets the value of the nutzflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getNUTZFLAECHE() {
        return nutzflaeche;
    }

    /**
     * Sets the value of the nutzflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setNUTZFLAECHE(BigDecimal value) {
        this.nutzflaeche = value;
    }

    /**
     * Gets the value of the flaecheart property.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public AreaType getFLAECHEART() {
        return flaecheart;
    }

    /**
     * Sets the value of the flaecheart property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setFLAECHEART(AreaType value) {
        this.flaecheart = value;
    }

    /**
     * Gets the value of the strasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getSTRASSE() {
        return strasse;
    }

    /**
     * Sets the value of the strasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setSTRASSE(String value) {
        this.strasse = value;
    }

    /**
     * Gets the value of the hausnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getHAUSNUMMER() {
        return hausnummer;
    }

    /**
     * Sets the value of the hausnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setHAUSNUMMER(String value) {
        this.hausnummer = value;
    }

    /**
     * Gets the value of the stiege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getSTIEGE() {
        return stiege;
    }

    /**
     * Sets the value of the stiege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setSTIEGE(String value) {
        this.stiege = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getLAT() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setLAT(BigDecimal value) {
        this.lat = value;
    }

    /**
     * Gets the value of the lng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getLNG() {
        return lng;
    }

    /**
     * Sets the value of the lng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setLNG(BigDecimal value) {
        this.lng = value;
    }

    /**
     * Gets the value of the foerderbar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getFOERDERBAR() {
        return foerderbar;
    }

    /**
     * Sets the value of the foerderbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setFOERDERBAR(Boolean value) {
        this.foerderbar = value;
    }

    /**
     * Gets the value of the konventioniert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getKONVENTIONIERT() {
        return konventioniert;
    }

    /**
     * Sets the value of the konventioniert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setKONVENTIONIERT(Boolean value) {
        this.konventioniert = value;
    }

    /**
     * Gets the value of the energieeffizienzklasse property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyEfficiencyClass }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public EnergyEfficiencyClass getENERGIEEFFIZIENZKLASSE() {
        return energieeffizienzklasse;
    }

    /**
     * Sets the value of the energieeffizienzklasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyEfficiencyClass }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setENERGIEEFFIZIENZKLASSE(EnergyEfficiencyClass value) {
        this.energieeffizienzklasse = value;
    }

    /**
     * Gets the value of the kubatur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getKUBATUR() {
        return kubatur;
    }

    /**
     * Sets the value of the kubatur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setKUBATUR(BigDecimal value) {
        this.kubatur = value;
    }

    /**
     * Gets the value of the zustand property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public ConditionType getZUSTAND() {
        return zustand;
    }

    /**
     * Sets the value of the zustand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setZUSTAND(ConditionType value) {
        this.zustand = value;
    }

    /**
     * Gets the value of the zimmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getZIMMER() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setZIMMER(BigInteger value) {
        this.zimmer = value;
    }

    /**
     * Gets the value of the stockwerke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getSTOCKWERKE() {
        return stockwerke;
    }

    /**
     * Sets the value of the stockwerke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setSTOCKWERKE(BigInteger value) {
        this.stockwerke = value;
    }

    /**
     * Gets the value of the stockwerk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getSTOCKWERK() {
        return stockwerk;
    }

    /**
     * Sets the value of the stockwerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setSTOCKWERK(BigInteger value) {
        this.stockwerk = value;
    }

    /**
     * Gets the value of the aufzug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getAUFZUG() {
        return aufzug;
    }

    /**
     * Sets the value of the aufzug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setAUFZUG(Boolean value) {
        this.aufzug = value;
    }

    /**
     * Gets the value of the garage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getGARAGE() {
        return garage;
    }

    /**
     * Sets the value of the garage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setGARAGE(Boolean value) {
        this.garage = value;
    }

    /**
     * Gets the value of the abstellplatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getABSTELLPLATZ() {
        return abstellplatz;
    }

    /**
     * Sets the value of the abstellplatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setABSTELLPLATZ(Boolean value) {
        this.abstellplatz = value;
    }

    /**
     * Gets the value of the gruenflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getGRUENFLAECHE() {
        return gruenflaeche;
    }

    /**
     * Sets the value of the gruenflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setGRUENFLAECHE(Boolean value) {
        this.gruenflaeche = value;
    }

    /**
     * Gets the value of the keller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getKELLER() {
        return keller;
    }

    /**
     * Sets the value of the keller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setKELLER(Boolean value) {
        this.keller = value;
    }

    /**
     * Gets the value of the terrasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getTERRASSE() {
        return terrasse;
    }

    /**
     * Sets the value of the terrasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setTERRASSE(Boolean value) {
        this.terrasse = value;
    }

    /**
     * Gets the value of the loggia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getLOGGIA() {
        return loggia;
    }

    /**
     * Sets the value of the loggia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setLOGGIA(Boolean value) {
        this.loggia = value;
    }

    /**
     * Gets the value of the balkon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getBALKON() {
        return balkon;
    }

    /**
     * Sets the value of the balkon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setBALKON(Boolean value) {
        this.balkon = value;
    }

    /**
     * Gets the value of the dachboden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getDACHBODEN() {
        return dachboden;
    }

    /**
     * Sets the value of the dachboden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setDACHBODEN(Boolean value) {
        this.dachboden = value;
    }

    /**
     * Gets the value of the heizung property.
     * 
     * @return
     *     possible object is
     *     {@link HeatingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public HeatingType getHEIZUNG() {
        return heizung;
    }

    /**
     * Sets the value of the heizung property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setHEIZUNG(HeatingType value) {
        this.heizung = value;
    }

    /**
     * Gets the value of the klimahaus property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyStandard }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public EnergyStandard getKLIMAHAUS() {
        return klimahaus;
    }

    /**
     * Sets the value of the klimahaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyStandard }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setKLIMAHAUS(EnergyStandard value) {
        this.klimahaus = value;
    }

    /**
     * Gets the value of the uebergabezeitpunkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getUEBERGABEZEITPUNKT() {
        return uebergabezeitpunkt;
    }

    /**
     * Sets the value of the uebergabezeitpunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setUEBERGABEZEITPUNKT(String value) {
        this.uebergabezeitpunkt = value;
    }

    /**
     * Gets the value of the baujahr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getBAUJAHR() {
        return baujahr;
    }

    /**
     * Sets the value of the baujahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setBAUJAHR(String value) {
        this.baujahr = value;
    }

    /**
     * Gets the value of the infode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getINFODE() {
        return infode;
    }

    /**
     * Sets the value of the infode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setINFODE(String value) {
        this.infode = value;
    }

    /**
     * Gets the value of the infoit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getINFOIT() {
        return infoit;
    }

    /**
     * Sets the value of the infoit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setINFOIT(String value) {
        this.infoit = value;
    }

    /**
     * Gets the value of the bild1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getBILD1() {
        return bild1;
    }

    /**
     * Sets the value of the bild1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setBILD1(String value) {
        this.bild1 = value;
    }

    /**
     * Gets the value of the bild2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getBILD2() {
        return bild2;
    }

    /**
     * Sets the value of the bild2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setBILD2(String value) {
        this.bild2 = value;
    }

    /**
     * Gets the value of the bild3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getBILD3() {
        return bild3;
    }

    /**
     * Sets the value of the bild3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setBILD3(String value) {
        this.bild3 = value;
    }

    /**
     * Gets the value of the bild4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getBILD4() {
        return bild4;
    }

    /**
     * Sets the value of the bild4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setBILD4(String value) {
        this.bild4 = value;
    }

    /**
     * Gets the value of the bild5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getBILD5() {
        return bild5;
    }

    /**
     * Sets the value of the bild5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setBILD5(String value) {
        this.bild5 = value;
    }

    /**
     * Gets the value of the bild6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getBILD6() {
        return bild6;
    }

    /**
     * Sets the value of the bild6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setBILD6(String value) {
        this.bild6 = value;
    }

    /**
     * Gets the value of the bild7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getBILD7() {
        return bild7;
    }

    /**
     * Sets the value of the bild7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setBILD7(String value) {
        this.bild7 = value;
    }

    /**
     * Gets the value of the bild8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getBILD8() {
        return bild8;
    }

    /**
     * Sets the value of the bild8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setBILD8(String value) {
        this.bild8 = value;
    }

    /**
     * Gets the value of the bild9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getBILD9() {
        return bild9;
    }

    /**
     * Sets the value of the bild9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setBILD9(String value) {
        this.bild9 = value;
    }

    /**
     * Gets the value of the bild10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getBILD10() {
        return bild10;
    }

    /**
     * Sets the value of the bild10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setBILD10(String value) {
        this.bild10 = value;
    }

    /**
     * Gets the value of the download1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getDOWNLOAD1() {
        return download1;
    }

    /**
     * Sets the value of the download1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setDOWNLOAD1(String value) {
        this.download1 = value;
    }

    /**
     * Gets the value of the download2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getDOWNLOAD2() {
        return download2;
    }

    /**
     * Sets the value of the download2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setDOWNLOAD2(String value) {
        this.download2 = value;
    }

    /**
     * Gets the value of the download3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String getDOWNLOAD3() {
        return download3;
    }

    /**
     * Sets the value of the download3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public void setDOWNLOAD3(String value) {
        this.download3 = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID, (this.id!= null));
        }
        {
            Boolean theLOESCHEN;
            theLOESCHEN = this.getLOESCHEN();
            strategy.appendField(locator, this, "loeschen", buffer, theLOESCHEN, (this.loeschen!= null));
        }
        {
            Calendar theGUELTIGBIS;
            theGUELTIGBIS = this.getGUELTIGBIS();
            strategy.appendField(locator, this, "gueltigbis", buffer, theGUELTIGBIS, (this.gueltigbis!= null));
        }
        {
            PropertyType theIMMOBILIENART;
            theIMMOBILIENART = this.getIMMOBILIENART();
            strategy.appendField(locator, this, "immobilienart", buffer, theIMMOBILIENART, (this.immobilienart!= null));
        }
        {
            String theORT;
            theORT = this.getORT();
            strategy.appendField(locator, this, "ort", buffer, theORT, (this.ort!= null));
        }
        {
            String theFRAKTION;
            theFRAKTION = this.getFRAKTION();
            strategy.appendField(locator, this, "fraktion", buffer, theFRAKTION, (this.fraktion!= null));
        }
        {
            MarketingType theMIETEKAUF;
            theMIETEKAUF = this.getMIETEKAUF();
            strategy.appendField(locator, this, "mietekauf", buffer, theMIETEKAUF, (this.mietekauf!= null));
        }
        {
            BigDecimal thePREIS;
            thePREIS = this.getPREIS();
            strategy.appendField(locator, this, "preis", buffer, thePREIS, (this.preis!= null));
        }
        {
            Boolean theAUFANFRAGE;
            theAUFANFRAGE = this.getAUFANFRAGE();
            strategy.appendField(locator, this, "aufanfrage", buffer, theAUFANFRAGE, (this.aufanfrage!= null));
        }
        {
            BigDecimal theNUTZFLAECHE;
            theNUTZFLAECHE = this.getNUTZFLAECHE();
            strategy.appendField(locator, this, "nutzflaeche", buffer, theNUTZFLAECHE, (this.nutzflaeche!= null));
        }
        {
            AreaType theFLAECHEART;
            theFLAECHEART = this.getFLAECHEART();
            strategy.appendField(locator, this, "flaecheart", buffer, theFLAECHEART, (this.flaecheart!= null));
        }
        {
            String theSTRASSE;
            theSTRASSE = this.getSTRASSE();
            strategy.appendField(locator, this, "strasse", buffer, theSTRASSE, (this.strasse!= null));
        }
        {
            String theHAUSNUMMER;
            theHAUSNUMMER = this.getHAUSNUMMER();
            strategy.appendField(locator, this, "hausnummer", buffer, theHAUSNUMMER, (this.hausnummer!= null));
        }
        {
            String theSTIEGE;
            theSTIEGE = this.getSTIEGE();
            strategy.appendField(locator, this, "stiege", buffer, theSTIEGE, (this.stiege!= null));
        }
        {
            BigDecimal theLAT;
            theLAT = this.getLAT();
            strategy.appendField(locator, this, "lat", buffer, theLAT, (this.lat!= null));
        }
        {
            BigDecimal theLNG;
            theLNG = this.getLNG();
            strategy.appendField(locator, this, "lng", buffer, theLNG, (this.lng!= null));
        }
        {
            Boolean theFOERDERBAR;
            theFOERDERBAR = this.getFOERDERBAR();
            strategy.appendField(locator, this, "foerderbar", buffer, theFOERDERBAR, (this.foerderbar!= null));
        }
        {
            Boolean theKONVENTIONIERT;
            theKONVENTIONIERT = this.getKONVENTIONIERT();
            strategy.appendField(locator, this, "konventioniert", buffer, theKONVENTIONIERT, (this.konventioniert!= null));
        }
        {
            EnergyEfficiencyClass theENERGIEEFFIZIENZKLASSE;
            theENERGIEEFFIZIENZKLASSE = this.getENERGIEEFFIZIENZKLASSE();
            strategy.appendField(locator, this, "energieeffizienzklasse", buffer, theENERGIEEFFIZIENZKLASSE, (this.energieeffizienzklasse!= null));
        }
        {
            BigDecimal theKUBATUR;
            theKUBATUR = this.getKUBATUR();
            strategy.appendField(locator, this, "kubatur", buffer, theKUBATUR, (this.kubatur!= null));
        }
        {
            ConditionType theZUSTAND;
            theZUSTAND = this.getZUSTAND();
            strategy.appendField(locator, this, "zustand", buffer, theZUSTAND, (this.zustand!= null));
        }
        {
            BigInteger theZIMMER;
            theZIMMER = this.getZIMMER();
            strategy.appendField(locator, this, "zimmer", buffer, theZIMMER, (this.zimmer!= null));
        }
        {
            BigInteger theSTOCKWERKE;
            theSTOCKWERKE = this.getSTOCKWERKE();
            strategy.appendField(locator, this, "stockwerke", buffer, theSTOCKWERKE, (this.stockwerke!= null));
        }
        {
            BigInteger theSTOCKWERK;
            theSTOCKWERK = this.getSTOCKWERK();
            strategy.appendField(locator, this, "stockwerk", buffer, theSTOCKWERK, (this.stockwerk!= null));
        }
        {
            Boolean theAUFZUG;
            theAUFZUG = this.getAUFZUG();
            strategy.appendField(locator, this, "aufzug", buffer, theAUFZUG, (this.aufzug!= null));
        }
        {
            Boolean theGARAGE;
            theGARAGE = this.getGARAGE();
            strategy.appendField(locator, this, "garage", buffer, theGARAGE, (this.garage!= null));
        }
        {
            Boolean theABSTELLPLATZ;
            theABSTELLPLATZ = this.getABSTELLPLATZ();
            strategy.appendField(locator, this, "abstellplatz", buffer, theABSTELLPLATZ, (this.abstellplatz!= null));
        }
        {
            Boolean theGRUENFLAECHE;
            theGRUENFLAECHE = this.getGRUENFLAECHE();
            strategy.appendField(locator, this, "gruenflaeche", buffer, theGRUENFLAECHE, (this.gruenflaeche!= null));
        }
        {
            Boolean theKELLER;
            theKELLER = this.getKELLER();
            strategy.appendField(locator, this, "keller", buffer, theKELLER, (this.keller!= null));
        }
        {
            Boolean theTERRASSE;
            theTERRASSE = this.getTERRASSE();
            strategy.appendField(locator, this, "terrasse", buffer, theTERRASSE, (this.terrasse!= null));
        }
        {
            Boolean theLOGGIA;
            theLOGGIA = this.getLOGGIA();
            strategy.appendField(locator, this, "loggia", buffer, theLOGGIA, (this.loggia!= null));
        }
        {
            Boolean theBALKON;
            theBALKON = this.getBALKON();
            strategy.appendField(locator, this, "balkon", buffer, theBALKON, (this.balkon!= null));
        }
        {
            Boolean theDACHBODEN;
            theDACHBODEN = this.getDACHBODEN();
            strategy.appendField(locator, this, "dachboden", buffer, theDACHBODEN, (this.dachboden!= null));
        }
        {
            HeatingType theHEIZUNG;
            theHEIZUNG = this.getHEIZUNG();
            strategy.appendField(locator, this, "heizung", buffer, theHEIZUNG, (this.heizung!= null));
        }
        {
            EnergyStandard theKLIMAHAUS;
            theKLIMAHAUS = this.getKLIMAHAUS();
            strategy.appendField(locator, this, "klimahaus", buffer, theKLIMAHAUS, (this.klimahaus!= null));
        }
        {
            String theUEBERGABEZEITPUNKT;
            theUEBERGABEZEITPUNKT = this.getUEBERGABEZEITPUNKT();
            strategy.appendField(locator, this, "uebergabezeitpunkt", buffer, theUEBERGABEZEITPUNKT, (this.uebergabezeitpunkt!= null));
        }
        {
            String theBAUJAHR;
            theBAUJAHR = this.getBAUJAHR();
            strategy.appendField(locator, this, "baujahr", buffer, theBAUJAHR, (this.baujahr!= null));
        }
        {
            String theINFODE;
            theINFODE = this.getINFODE();
            strategy.appendField(locator, this, "infode", buffer, theINFODE, (this.infode!= null));
        }
        {
            String theINFOIT;
            theINFOIT = this.getINFOIT();
            strategy.appendField(locator, this, "infoit", buffer, theINFOIT, (this.infoit!= null));
        }
        {
            String theBILD1;
            theBILD1 = this.getBILD1();
            strategy.appendField(locator, this, "bild1", buffer, theBILD1, (this.bild1 != null));
        }
        {
            String theBILD2;
            theBILD2 = this.getBILD2();
            strategy.appendField(locator, this, "bild2", buffer, theBILD2, (this.bild2 != null));
        }
        {
            String theBILD3;
            theBILD3 = this.getBILD3();
            strategy.appendField(locator, this, "bild3", buffer, theBILD3, (this.bild3 != null));
        }
        {
            String theBILD4;
            theBILD4 = this.getBILD4();
            strategy.appendField(locator, this, "bild4", buffer, theBILD4, (this.bild4 != null));
        }
        {
            String theBILD5;
            theBILD5 = this.getBILD5();
            strategy.appendField(locator, this, "bild5", buffer, theBILD5, (this.bild5 != null));
        }
        {
            String theBILD6;
            theBILD6 = this.getBILD6();
            strategy.appendField(locator, this, "bild6", buffer, theBILD6, (this.bild6 != null));
        }
        {
            String theBILD7;
            theBILD7 = this.getBILD7();
            strategy.appendField(locator, this, "bild7", buffer, theBILD7, (this.bild7 != null));
        }
        {
            String theBILD8;
            theBILD8 = this.getBILD8();
            strategy.appendField(locator, this, "bild8", buffer, theBILD8, (this.bild8 != null));
        }
        {
            String theBILD9;
            theBILD9 = this.getBILD9();
            strategy.appendField(locator, this, "bild9", buffer, theBILD9, (this.bild9 != null));
        }
        {
            String theBILD10;
            theBILD10 = this.getBILD10();
            strategy.appendField(locator, this, "bild10", buffer, theBILD10, (this.bild10 != null));
        }
        {
            String theDOWNLOAD1;
            theDOWNLOAD1 = this.getDOWNLOAD1();
            strategy.appendField(locator, this, "download1", buffer, theDOWNLOAD1, (this.download1 != null));
        }
        {
            String theDOWNLOAD2;
            theDOWNLOAD2 = this.getDOWNLOAD2();
            strategy.appendField(locator, this, "download2", buffer, theDOWNLOAD2, (this.download2 != null));
        }
        {
            String theDOWNLOAD3;
            theDOWNLOAD3 = this.getDOWNLOAD3();
            strategy.appendField(locator, this, "download3", buffer, theDOWNLOAD3, (this.download3 != null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ObjectType) {
            final ObjectType copy = ((ObjectType) draftCopy);
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceID;
                    sourceID = this.getID();
                    String copyID = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceID), sourceID, (this.id!= null)));
                    copy.setID(copyID);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
            {
                Boolean loeschenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loeschen!= null));
                if (loeschenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceLOESCHEN;
                    sourceLOESCHEN = this.getLOESCHEN();
                    Boolean copyLOESCHEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "loeschen", sourceLOESCHEN), sourceLOESCHEN, (this.loeschen!= null)));
                    copy.setLOESCHEN(copyLOESCHEN);
                } else {
                    if (loeschenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loeschen = null;
                    }
                }
            }
            {
                Boolean gueltigbisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gueltigbis!= null));
                if (gueltigbisShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceGUELTIGBIS;
                    sourceGUELTIGBIS = this.getGUELTIGBIS();
                    Calendar copyGUELTIGBIS = ((Calendar) strategy.copy(LocatorUtils.property(locator, "gueltigbis", sourceGUELTIGBIS), sourceGUELTIGBIS, (this.gueltigbis!= null)));
                    copy.setGUELTIGBIS(copyGUELTIGBIS);
                } else {
                    if (gueltigbisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gueltigbis = null;
                    }
                }
            }
            {
                Boolean immobilienartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.immobilienart!= null));
                if (immobilienartShouldBeCopiedAndSet == Boolean.TRUE) {
                    PropertyType sourceIMMOBILIENART;
                    sourceIMMOBILIENART = this.getIMMOBILIENART();
                    PropertyType copyIMMOBILIENART = ((PropertyType) strategy.copy(LocatorUtils.property(locator, "immobilienart", sourceIMMOBILIENART), sourceIMMOBILIENART, (this.immobilienart!= null)));
                    copy.setIMMOBILIENART(copyIMMOBILIENART);
                } else {
                    if (immobilienartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.immobilienart = null;
                    }
                }
            }
            {
                Boolean ortShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ort!= null));
                if (ortShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceORT;
                    sourceORT = this.getORT();
                    String copyORT = ((String) strategy.copy(LocatorUtils.property(locator, "ort", sourceORT), sourceORT, (this.ort!= null)));
                    copy.setORT(copyORT);
                } else {
                    if (ortShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ort = null;
                    }
                }
            }
            {
                Boolean fraktionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fraktion!= null));
                if (fraktionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFRAKTION;
                    sourceFRAKTION = this.getFRAKTION();
                    String copyFRAKTION = ((String) strategy.copy(LocatorUtils.property(locator, "fraktion", sourceFRAKTION), sourceFRAKTION, (this.fraktion!= null)));
                    copy.setFRAKTION(copyFRAKTION);
                } else {
                    if (fraktionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fraktion = null;
                    }
                }
            }
            {
                Boolean mietekaufShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mietekauf!= null));
                if (mietekaufShouldBeCopiedAndSet == Boolean.TRUE) {
                    MarketingType sourceMIETEKAUF;
                    sourceMIETEKAUF = this.getMIETEKAUF();
                    MarketingType copyMIETEKAUF = ((MarketingType) strategy.copy(LocatorUtils.property(locator, "mietekauf", sourceMIETEKAUF), sourceMIETEKAUF, (this.mietekauf!= null)));
                    copy.setMIETEKAUF(copyMIETEKAUF);
                } else {
                    if (mietekaufShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mietekauf = null;
                    }
                }
            }
            {
                Boolean preisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.preis!= null));
                if (preisShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourcePREIS;
                    sourcePREIS = this.getPREIS();
                    BigDecimal copyPREIS = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "preis", sourcePREIS), sourcePREIS, (this.preis!= null)));
                    copy.setPREIS(copyPREIS);
                } else {
                    if (preisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.preis = null;
                    }
                }
            }
            {
                Boolean aufanfrageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aufanfrage!= null));
                if (aufanfrageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAUFANFRAGE;
                    sourceAUFANFRAGE = this.getAUFANFRAGE();
                    Boolean copyAUFANFRAGE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "aufanfrage", sourceAUFANFRAGE), sourceAUFANFRAGE, (this.aufanfrage!= null)));
                    copy.setAUFANFRAGE(copyAUFANFRAGE);
                } else {
                    if (aufanfrageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aufanfrage = null;
                    }
                }
            }
            {
                Boolean nutzflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nutzflaeche!= null));
                if (nutzflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNUTZFLAECHE;
                    sourceNUTZFLAECHE = this.getNUTZFLAECHE();
                    BigDecimal copyNUTZFLAECHE = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nutzflaeche", sourceNUTZFLAECHE), sourceNUTZFLAECHE, (this.nutzflaeche!= null)));
                    copy.setNUTZFLAECHE(copyNUTZFLAECHE);
                } else {
                    if (nutzflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nutzflaeche = null;
                    }
                }
            }
            {
                Boolean flaecheartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flaecheart!= null));
                if (flaecheartShouldBeCopiedAndSet == Boolean.TRUE) {
                    AreaType sourceFLAECHEART;
                    sourceFLAECHEART = this.getFLAECHEART();
                    AreaType copyFLAECHEART = ((AreaType) strategy.copy(LocatorUtils.property(locator, "flaecheart", sourceFLAECHEART), sourceFLAECHEART, (this.flaecheart!= null)));
                    copy.setFLAECHEART(copyFLAECHEART);
                } else {
                    if (flaecheartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flaecheart = null;
                    }
                }
            }
            {
                Boolean strasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.strasse!= null));
                if (strasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSTRASSE;
                    sourceSTRASSE = this.getSTRASSE();
                    String copySTRASSE = ((String) strategy.copy(LocatorUtils.property(locator, "strasse", sourceSTRASSE), sourceSTRASSE, (this.strasse!= null)));
                    copy.setSTRASSE(copySTRASSE);
                } else {
                    if (strasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.strasse = null;
                    }
                }
            }
            {
                Boolean hausnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hausnummer!= null));
                if (hausnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHAUSNUMMER;
                    sourceHAUSNUMMER = this.getHAUSNUMMER();
                    String copyHAUSNUMMER = ((String) strategy.copy(LocatorUtils.property(locator, "hausnummer", sourceHAUSNUMMER), sourceHAUSNUMMER, (this.hausnummer!= null)));
                    copy.setHAUSNUMMER(copyHAUSNUMMER);
                } else {
                    if (hausnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hausnummer = null;
                    }
                }
            }
            {
                Boolean stiegeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stiege!= null));
                if (stiegeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSTIEGE;
                    sourceSTIEGE = this.getSTIEGE();
                    String copySTIEGE = ((String) strategy.copy(LocatorUtils.property(locator, "stiege", sourceSTIEGE), sourceSTIEGE, (this.stiege!= null)));
                    copy.setSTIEGE(copySTIEGE);
                } else {
                    if (stiegeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stiege = null;
                    }
                }
            }
            {
                Boolean latShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lat!= null));
                if (latShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLAT;
                    sourceLAT = this.getLAT();
                    BigDecimal copyLAT = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "lat", sourceLAT), sourceLAT, (this.lat!= null)));
                    copy.setLAT(copyLAT);
                } else {
                    if (latShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lat = null;
                    }
                }
            }
            {
                Boolean lngShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lng!= null));
                if (lngShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLNG;
                    sourceLNG = this.getLNG();
                    BigDecimal copyLNG = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "lng", sourceLNG), sourceLNG, (this.lng!= null)));
                    copy.setLNG(copyLNG);
                } else {
                    if (lngShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lng = null;
                    }
                }
            }
            {
                Boolean foerderbarShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.foerderbar!= null));
                if (foerderbarShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFOERDERBAR;
                    sourceFOERDERBAR = this.getFOERDERBAR();
                    Boolean copyFOERDERBAR = ((Boolean) strategy.copy(LocatorUtils.property(locator, "foerderbar", sourceFOERDERBAR), sourceFOERDERBAR, (this.foerderbar!= null)));
                    copy.setFOERDERBAR(copyFOERDERBAR);
                } else {
                    if (foerderbarShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.foerderbar = null;
                    }
                }
            }
            {
                Boolean konventioniertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.konventioniert!= null));
                if (konventioniertShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKONVENTIONIERT;
                    sourceKONVENTIONIERT = this.getKONVENTIONIERT();
                    Boolean copyKONVENTIONIERT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "konventioniert", sourceKONVENTIONIERT), sourceKONVENTIONIERT, (this.konventioniert!= null)));
                    copy.setKONVENTIONIERT(copyKONVENTIONIERT);
                } else {
                    if (konventioniertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.konventioniert = null;
                    }
                }
            }
            {
                Boolean energieeffizienzklasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energieeffizienzklasse!= null));
                if (energieeffizienzklasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergyEfficiencyClass sourceENERGIEEFFIZIENZKLASSE;
                    sourceENERGIEEFFIZIENZKLASSE = this.getENERGIEEFFIZIENZKLASSE();
                    EnergyEfficiencyClass copyENERGIEEFFIZIENZKLASSE = ((EnergyEfficiencyClass) strategy.copy(LocatorUtils.property(locator, "energieeffizienzklasse", sourceENERGIEEFFIZIENZKLASSE), sourceENERGIEEFFIZIENZKLASSE, (this.energieeffizienzklasse!= null)));
                    copy.setENERGIEEFFIZIENZKLASSE(copyENERGIEEFFIZIENZKLASSE);
                } else {
                    if (energieeffizienzklasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energieeffizienzklasse = null;
                    }
                }
            }
            {
                Boolean kubaturShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kubatur!= null));
                if (kubaturShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKUBATUR;
                    sourceKUBATUR = this.getKUBATUR();
                    BigDecimal copyKUBATUR = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kubatur", sourceKUBATUR), sourceKUBATUR, (this.kubatur!= null)));
                    copy.setKUBATUR(copyKUBATUR);
                } else {
                    if (kubaturShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kubatur = null;
                    }
                }
            }
            {
                Boolean zustandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zustand!= null));
                if (zustandShouldBeCopiedAndSet == Boolean.TRUE) {
                    ConditionType sourceZUSTAND;
                    sourceZUSTAND = this.getZUSTAND();
                    ConditionType copyZUSTAND = ((ConditionType) strategy.copy(LocatorUtils.property(locator, "zustand", sourceZUSTAND), sourceZUSTAND, (this.zustand!= null)));
                    copy.setZUSTAND(copyZUSTAND);
                } else {
                    if (zustandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zustand = null;
                    }
                }
            }
            {
                Boolean zimmerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zimmer!= null));
                if (zimmerShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceZIMMER;
                    sourceZIMMER = this.getZIMMER();
                    BigInteger copyZIMMER = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "zimmer", sourceZIMMER), sourceZIMMER, (this.zimmer!= null)));
                    copy.setZIMMER(copyZIMMER);
                } else {
                    if (zimmerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zimmer = null;
                    }
                }
            }
            {
                Boolean stockwerkeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stockwerke!= null));
                if (stockwerkeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceSTOCKWERKE;
                    sourceSTOCKWERKE = this.getSTOCKWERKE();
                    BigInteger copySTOCKWERKE = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "stockwerke", sourceSTOCKWERKE), sourceSTOCKWERKE, (this.stockwerke!= null)));
                    copy.setSTOCKWERKE(copySTOCKWERKE);
                } else {
                    if (stockwerkeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stockwerke = null;
                    }
                }
            }
            {
                Boolean stockwerkShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stockwerk!= null));
                if (stockwerkShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceSTOCKWERK;
                    sourceSTOCKWERK = this.getSTOCKWERK();
                    BigInteger copySTOCKWERK = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "stockwerk", sourceSTOCKWERK), sourceSTOCKWERK, (this.stockwerk!= null)));
                    copy.setSTOCKWERK(copySTOCKWERK);
                } else {
                    if (stockwerkShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stockwerk = null;
                    }
                }
            }
            {
                Boolean aufzugShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aufzug!= null));
                if (aufzugShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAUFZUG;
                    sourceAUFZUG = this.getAUFZUG();
                    Boolean copyAUFZUG = ((Boolean) strategy.copy(LocatorUtils.property(locator, "aufzug", sourceAUFZUG), sourceAUFZUG, (this.aufzug!= null)));
                    copy.setAUFZUG(copyAUFZUG);
                } else {
                    if (aufzugShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aufzug = null;
                    }
                }
            }
            {
                Boolean garageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garage!= null));
                if (garageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGARAGE;
                    sourceGARAGE = this.getGARAGE();
                    Boolean copyGARAGE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "garage", sourceGARAGE), sourceGARAGE, (this.garage!= null)));
                    copy.setGARAGE(copyGARAGE);
                } else {
                    if (garageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garage = null;
                    }
                }
            }
            {
                Boolean abstellplatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abstellplatz!= null));
                if (abstellplatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceABSTELLPLATZ;
                    sourceABSTELLPLATZ = this.getABSTELLPLATZ();
                    Boolean copyABSTELLPLATZ = ((Boolean) strategy.copy(LocatorUtils.property(locator, "abstellplatz", sourceABSTELLPLATZ), sourceABSTELLPLATZ, (this.abstellplatz!= null)));
                    copy.setABSTELLPLATZ(copyABSTELLPLATZ);
                } else {
                    if (abstellplatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abstellplatz = null;
                    }
                }
            }
            {
                Boolean gruenflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gruenflaeche!= null));
                if (gruenflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGRUENFLAECHE;
                    sourceGRUENFLAECHE = this.getGRUENFLAECHE();
                    Boolean copyGRUENFLAECHE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gruenflaeche", sourceGRUENFLAECHE), sourceGRUENFLAECHE, (this.gruenflaeche!= null)));
                    copy.setGRUENFLAECHE(copyGRUENFLAECHE);
                } else {
                    if (gruenflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gruenflaeche = null;
                    }
                }
            }
            {
                Boolean kellerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.keller!= null));
                if (kellerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKELLER;
                    sourceKELLER = this.getKELLER();
                    Boolean copyKELLER = ((Boolean) strategy.copy(LocatorUtils.property(locator, "keller", sourceKELLER), sourceKELLER, (this.keller!= null)));
                    copy.setKELLER(copyKELLER);
                } else {
                    if (kellerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.keller = null;
                    }
                }
            }
            {
                Boolean terrasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.terrasse!= null));
                if (terrasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTERRASSE;
                    sourceTERRASSE = this.getTERRASSE();
                    Boolean copyTERRASSE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "terrasse", sourceTERRASSE), sourceTERRASSE, (this.terrasse!= null)));
                    copy.setTERRASSE(copyTERRASSE);
                } else {
                    if (terrasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.terrasse = null;
                    }
                }
            }
            {
                Boolean loggiaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loggia!= null));
                if (loggiaShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceLOGGIA;
                    sourceLOGGIA = this.getLOGGIA();
                    Boolean copyLOGGIA = ((Boolean) strategy.copy(LocatorUtils.property(locator, "loggia", sourceLOGGIA), sourceLOGGIA, (this.loggia!= null)));
                    copy.setLOGGIA(copyLOGGIA);
                } else {
                    if (loggiaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loggia = null;
                    }
                }
            }
            {
                Boolean balkonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balkon!= null));
                if (balkonShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBALKON;
                    sourceBALKON = this.getBALKON();
                    Boolean copyBALKON = ((Boolean) strategy.copy(LocatorUtils.property(locator, "balkon", sourceBALKON), sourceBALKON, (this.balkon!= null)));
                    copy.setBALKON(copyBALKON);
                } else {
                    if (balkonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.balkon = null;
                    }
                }
            }
            {
                Boolean dachbodenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dachboden!= null));
                if (dachbodenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDACHBODEN;
                    sourceDACHBODEN = this.getDACHBODEN();
                    Boolean copyDACHBODEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "dachboden", sourceDACHBODEN), sourceDACHBODEN, (this.dachboden!= null)));
                    copy.setDACHBODEN(copyDACHBODEN);
                } else {
                    if (dachbodenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dachboden = null;
                    }
                }
            }
            {
                Boolean heizungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heizung!= null));
                if (heizungShouldBeCopiedAndSet == Boolean.TRUE) {
                    HeatingType sourceHEIZUNG;
                    sourceHEIZUNG = this.getHEIZUNG();
                    HeatingType copyHEIZUNG = ((HeatingType) strategy.copy(LocatorUtils.property(locator, "heizung", sourceHEIZUNG), sourceHEIZUNG, (this.heizung!= null)));
                    copy.setHEIZUNG(copyHEIZUNG);
                } else {
                    if (heizungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heizung = null;
                    }
                }
            }
            {
                Boolean klimahausShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.klimahaus!= null));
                if (klimahausShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergyStandard sourceKLIMAHAUS;
                    sourceKLIMAHAUS = this.getKLIMAHAUS();
                    EnergyStandard copyKLIMAHAUS = ((EnergyStandard) strategy.copy(LocatorUtils.property(locator, "klimahaus", sourceKLIMAHAUS), sourceKLIMAHAUS, (this.klimahaus!= null)));
                    copy.setKLIMAHAUS(copyKLIMAHAUS);
                } else {
                    if (klimahausShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.klimahaus = null;
                    }
                }
            }
            {
                Boolean uebergabezeitpunktShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.uebergabezeitpunkt!= null));
                if (uebergabezeitpunktShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUEBERGABEZEITPUNKT;
                    sourceUEBERGABEZEITPUNKT = this.getUEBERGABEZEITPUNKT();
                    String copyUEBERGABEZEITPUNKT = ((String) strategy.copy(LocatorUtils.property(locator, "uebergabezeitpunkt", sourceUEBERGABEZEITPUNKT), sourceUEBERGABEZEITPUNKT, (this.uebergabezeitpunkt!= null)));
                    copy.setUEBERGABEZEITPUNKT(copyUEBERGABEZEITPUNKT);
                } else {
                    if (uebergabezeitpunktShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.uebergabezeitpunkt = null;
                    }
                }
            }
            {
                Boolean baujahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.baujahr!= null));
                if (baujahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBAUJAHR;
                    sourceBAUJAHR = this.getBAUJAHR();
                    String copyBAUJAHR = ((String) strategy.copy(LocatorUtils.property(locator, "baujahr", sourceBAUJAHR), sourceBAUJAHR, (this.baujahr!= null)));
                    copy.setBAUJAHR(copyBAUJAHR);
                } else {
                    if (baujahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.baujahr = null;
                    }
                }
            }
            {
                Boolean infodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.infode!= null));
                if (infodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceINFODE;
                    sourceINFODE = this.getINFODE();
                    String copyINFODE = ((String) strategy.copy(LocatorUtils.property(locator, "infode", sourceINFODE), sourceINFODE, (this.infode!= null)));
                    copy.setINFODE(copyINFODE);
                } else {
                    if (infodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.infode = null;
                    }
                }
            }
            {
                Boolean infoitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.infoit!= null));
                if (infoitShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceINFOIT;
                    sourceINFOIT = this.getINFOIT();
                    String copyINFOIT = ((String) strategy.copy(LocatorUtils.property(locator, "infoit", sourceINFOIT), sourceINFOIT, (this.infoit!= null)));
                    copy.setINFOIT(copyINFOIT);
                } else {
                    if (infoitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.infoit = null;
                    }
                }
            }
            {
                Boolean bild1ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bild1 != null));
                if (bild1ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBILD1;
                    sourceBILD1 = this.getBILD1();
                    String copyBILD1 = ((String) strategy.copy(LocatorUtils.property(locator, "bild1", sourceBILD1), sourceBILD1, (this.bild1 != null)));
                    copy.setBILD1(copyBILD1);
                } else {
                    if (bild1ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bild1 = null;
                    }
                }
            }
            {
                Boolean bild2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bild2 != null));
                if (bild2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBILD2;
                    sourceBILD2 = this.getBILD2();
                    String copyBILD2 = ((String) strategy.copy(LocatorUtils.property(locator, "bild2", sourceBILD2), sourceBILD2, (this.bild2 != null)));
                    copy.setBILD2(copyBILD2);
                } else {
                    if (bild2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bild2 = null;
                    }
                }
            }
            {
                Boolean bild3ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bild3 != null));
                if (bild3ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBILD3;
                    sourceBILD3 = this.getBILD3();
                    String copyBILD3 = ((String) strategy.copy(LocatorUtils.property(locator, "bild3", sourceBILD3), sourceBILD3, (this.bild3 != null)));
                    copy.setBILD3(copyBILD3);
                } else {
                    if (bild3ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bild3 = null;
                    }
                }
            }
            {
                Boolean bild4ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bild4 != null));
                if (bild4ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBILD4;
                    sourceBILD4 = this.getBILD4();
                    String copyBILD4 = ((String) strategy.copy(LocatorUtils.property(locator, "bild4", sourceBILD4), sourceBILD4, (this.bild4 != null)));
                    copy.setBILD4(copyBILD4);
                } else {
                    if (bild4ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bild4 = null;
                    }
                }
            }
            {
                Boolean bild5ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bild5 != null));
                if (bild5ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBILD5;
                    sourceBILD5 = this.getBILD5();
                    String copyBILD5 = ((String) strategy.copy(LocatorUtils.property(locator, "bild5", sourceBILD5), sourceBILD5, (this.bild5 != null)));
                    copy.setBILD5(copyBILD5);
                } else {
                    if (bild5ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bild5 = null;
                    }
                }
            }
            {
                Boolean bild6ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bild6 != null));
                if (bild6ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBILD6;
                    sourceBILD6 = this.getBILD6();
                    String copyBILD6 = ((String) strategy.copy(LocatorUtils.property(locator, "bild6", sourceBILD6), sourceBILD6, (this.bild6 != null)));
                    copy.setBILD6(copyBILD6);
                } else {
                    if (bild6ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bild6 = null;
                    }
                }
            }
            {
                Boolean bild7ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bild7 != null));
                if (bild7ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBILD7;
                    sourceBILD7 = this.getBILD7();
                    String copyBILD7 = ((String) strategy.copy(LocatorUtils.property(locator, "bild7", sourceBILD7), sourceBILD7, (this.bild7 != null)));
                    copy.setBILD7(copyBILD7);
                } else {
                    if (bild7ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bild7 = null;
                    }
                }
            }
            {
                Boolean bild8ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bild8 != null));
                if (bild8ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBILD8;
                    sourceBILD8 = this.getBILD8();
                    String copyBILD8 = ((String) strategy.copy(LocatorUtils.property(locator, "bild8", sourceBILD8), sourceBILD8, (this.bild8 != null)));
                    copy.setBILD8(copyBILD8);
                } else {
                    if (bild8ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bild8 = null;
                    }
                }
            }
            {
                Boolean bild9ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bild9 != null));
                if (bild9ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBILD9;
                    sourceBILD9 = this.getBILD9();
                    String copyBILD9 = ((String) strategy.copy(LocatorUtils.property(locator, "bild9", sourceBILD9), sourceBILD9, (this.bild9 != null)));
                    copy.setBILD9(copyBILD9);
                } else {
                    if (bild9ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bild9 = null;
                    }
                }
            }
            {
                Boolean bild10ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bild10 != null));
                if (bild10ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBILD10;
                    sourceBILD10 = this.getBILD10();
                    String copyBILD10 = ((String) strategy.copy(LocatorUtils.property(locator, "bild10", sourceBILD10), sourceBILD10, (this.bild10 != null)));
                    copy.setBILD10(copyBILD10);
                } else {
                    if (bild10ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bild10 = null;
                    }
                }
            }
            {
                Boolean download1ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.download1 != null));
                if (download1ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDOWNLOAD1;
                    sourceDOWNLOAD1 = this.getDOWNLOAD1();
                    String copyDOWNLOAD1 = ((String) strategy.copy(LocatorUtils.property(locator, "download1", sourceDOWNLOAD1), sourceDOWNLOAD1, (this.download1 != null)));
                    copy.setDOWNLOAD1(copyDOWNLOAD1);
                } else {
                    if (download1ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.download1 = null;
                    }
                }
            }
            {
                Boolean download2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.download2 != null));
                if (download2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDOWNLOAD2;
                    sourceDOWNLOAD2 = this.getDOWNLOAD2();
                    String copyDOWNLOAD2 = ((String) strategy.copy(LocatorUtils.property(locator, "download2", sourceDOWNLOAD2), sourceDOWNLOAD2, (this.download2 != null)));
                    copy.setDOWNLOAD2(copyDOWNLOAD2);
                } else {
                    if (download2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.download2 = null;
                    }
                }
            }
            {
                Boolean download3ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.download3 != null));
                if (download3ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDOWNLOAD3;
                    sourceDOWNLOAD3 = this.getDOWNLOAD3();
                    String copyDOWNLOAD3 = ((String) strategy.copy(LocatorUtils.property(locator, "download3", sourceDOWNLOAD3), sourceDOWNLOAD3, (this.download3 != null)));
                    copy.setDOWNLOAD3(copyDOWNLOAD3);
                } else {
                    if (download3ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.download3 = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new ObjectType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ObjectType that = ((ObjectType) object);
        {
            String lhsID;
            lhsID = this.getID();
            String rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            Boolean lhsLOESCHEN;
            lhsLOESCHEN = this.getLOESCHEN();
            Boolean rhsLOESCHEN;
            rhsLOESCHEN = that.getLOESCHEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loeschen", lhsLOESCHEN), LocatorUtils.property(thatLocator, "loeschen", rhsLOESCHEN), lhsLOESCHEN, rhsLOESCHEN, (this.loeschen!= null), (that.loeschen!= null))) {
                return false;
            }
        }
        {
            Calendar lhsGUELTIGBIS;
            lhsGUELTIGBIS = this.getGUELTIGBIS();
            Calendar rhsGUELTIGBIS;
            rhsGUELTIGBIS = that.getGUELTIGBIS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gueltigbis", lhsGUELTIGBIS), LocatorUtils.property(thatLocator, "gueltigbis", rhsGUELTIGBIS), lhsGUELTIGBIS, rhsGUELTIGBIS, (this.gueltigbis!= null), (that.gueltigbis!= null))) {
                return false;
            }
        }
        {
            PropertyType lhsIMMOBILIENART;
            lhsIMMOBILIENART = this.getIMMOBILIENART();
            PropertyType rhsIMMOBILIENART;
            rhsIMMOBILIENART = that.getIMMOBILIENART();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "immobilienart", lhsIMMOBILIENART), LocatorUtils.property(thatLocator, "immobilienart", rhsIMMOBILIENART), lhsIMMOBILIENART, rhsIMMOBILIENART, (this.immobilienart!= null), (that.immobilienart!= null))) {
                return false;
            }
        }
        {
            String lhsORT;
            lhsORT = this.getORT();
            String rhsORT;
            rhsORT = that.getORT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ort", lhsORT), LocatorUtils.property(thatLocator, "ort", rhsORT), lhsORT, rhsORT, (this.ort!= null), (that.ort!= null))) {
                return false;
            }
        }
        {
            String lhsFRAKTION;
            lhsFRAKTION = this.getFRAKTION();
            String rhsFRAKTION;
            rhsFRAKTION = that.getFRAKTION();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fraktion", lhsFRAKTION), LocatorUtils.property(thatLocator, "fraktion", rhsFRAKTION), lhsFRAKTION, rhsFRAKTION, (this.fraktion!= null), (that.fraktion!= null))) {
                return false;
            }
        }
        {
            MarketingType lhsMIETEKAUF;
            lhsMIETEKAUF = this.getMIETEKAUF();
            MarketingType rhsMIETEKAUF;
            rhsMIETEKAUF = that.getMIETEKAUF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietekauf", lhsMIETEKAUF), LocatorUtils.property(thatLocator, "mietekauf", rhsMIETEKAUF), lhsMIETEKAUF, rhsMIETEKAUF, (this.mietekauf!= null), (that.mietekauf!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPREIS;
            lhsPREIS = this.getPREIS();
            BigDecimal rhsPREIS;
            rhsPREIS = that.getPREIS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preis", lhsPREIS), LocatorUtils.property(thatLocator, "preis", rhsPREIS), lhsPREIS, rhsPREIS, (this.preis!= null), (that.preis!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAUFANFRAGE;
            lhsAUFANFRAGE = this.getAUFANFRAGE();
            Boolean rhsAUFANFRAGE;
            rhsAUFANFRAGE = that.getAUFANFRAGE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aufanfrage", lhsAUFANFRAGE), LocatorUtils.property(thatLocator, "aufanfrage", rhsAUFANFRAGE), lhsAUFANFRAGE, rhsAUFANFRAGE, (this.aufanfrage!= null), (that.aufanfrage!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNUTZFLAECHE;
            lhsNUTZFLAECHE = this.getNUTZFLAECHE();
            BigDecimal rhsNUTZFLAECHE;
            rhsNUTZFLAECHE = that.getNUTZFLAECHE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nutzflaeche", lhsNUTZFLAECHE), LocatorUtils.property(thatLocator, "nutzflaeche", rhsNUTZFLAECHE), lhsNUTZFLAECHE, rhsNUTZFLAECHE, (this.nutzflaeche!= null), (that.nutzflaeche!= null))) {
                return false;
            }
        }
        {
            AreaType lhsFLAECHEART;
            lhsFLAECHEART = this.getFLAECHEART();
            AreaType rhsFLAECHEART;
            rhsFLAECHEART = that.getFLAECHEART();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flaecheart", lhsFLAECHEART), LocatorUtils.property(thatLocator, "flaecheart", rhsFLAECHEART), lhsFLAECHEART, rhsFLAECHEART, (this.flaecheart!= null), (that.flaecheart!= null))) {
                return false;
            }
        }
        {
            String lhsSTRASSE;
            lhsSTRASSE = this.getSTRASSE();
            String rhsSTRASSE;
            rhsSTRASSE = that.getSTRASSE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strasse", lhsSTRASSE), LocatorUtils.property(thatLocator, "strasse", rhsSTRASSE), lhsSTRASSE, rhsSTRASSE, (this.strasse!= null), (that.strasse!= null))) {
                return false;
            }
        }
        {
            String lhsHAUSNUMMER;
            lhsHAUSNUMMER = this.getHAUSNUMMER();
            String rhsHAUSNUMMER;
            rhsHAUSNUMMER = that.getHAUSNUMMER();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hausnummer", lhsHAUSNUMMER), LocatorUtils.property(thatLocator, "hausnummer", rhsHAUSNUMMER), lhsHAUSNUMMER, rhsHAUSNUMMER, (this.hausnummer!= null), (that.hausnummer!= null))) {
                return false;
            }
        }
        {
            String lhsSTIEGE;
            lhsSTIEGE = this.getSTIEGE();
            String rhsSTIEGE;
            rhsSTIEGE = that.getSTIEGE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stiege", lhsSTIEGE), LocatorUtils.property(thatLocator, "stiege", rhsSTIEGE), lhsSTIEGE, rhsSTIEGE, (this.stiege!= null), (that.stiege!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLAT;
            lhsLAT = this.getLAT();
            BigDecimal rhsLAT;
            rhsLAT = that.getLAT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lat", lhsLAT), LocatorUtils.property(thatLocator, "lat", rhsLAT), lhsLAT, rhsLAT, (this.lat!= null), (that.lat!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLNG;
            lhsLNG = this.getLNG();
            BigDecimal rhsLNG;
            rhsLNG = that.getLNG();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lng", lhsLNG), LocatorUtils.property(thatLocator, "lng", rhsLNG), lhsLNG, rhsLNG, (this.lng!= null), (that.lng!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFOERDERBAR;
            lhsFOERDERBAR = this.getFOERDERBAR();
            Boolean rhsFOERDERBAR;
            rhsFOERDERBAR = that.getFOERDERBAR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "foerderbar", lhsFOERDERBAR), LocatorUtils.property(thatLocator, "foerderbar", rhsFOERDERBAR), lhsFOERDERBAR, rhsFOERDERBAR, (this.foerderbar!= null), (that.foerderbar!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKONVENTIONIERT;
            lhsKONVENTIONIERT = this.getKONVENTIONIERT();
            Boolean rhsKONVENTIONIERT;
            rhsKONVENTIONIERT = that.getKONVENTIONIERT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "konventioniert", lhsKONVENTIONIERT), LocatorUtils.property(thatLocator, "konventioniert", rhsKONVENTIONIERT), lhsKONVENTIONIERT, rhsKONVENTIONIERT, (this.konventioniert!= null), (that.konventioniert!= null))) {
                return false;
            }
        }
        {
            EnergyEfficiencyClass lhsENERGIEEFFIZIENZKLASSE;
            lhsENERGIEEFFIZIENZKLASSE = this.getENERGIEEFFIZIENZKLASSE();
            EnergyEfficiencyClass rhsENERGIEEFFIZIENZKLASSE;
            rhsENERGIEEFFIZIENZKLASSE = that.getENERGIEEFFIZIENZKLASSE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieeffizienzklasse", lhsENERGIEEFFIZIENZKLASSE), LocatorUtils.property(thatLocator, "energieeffizienzklasse", rhsENERGIEEFFIZIENZKLASSE), lhsENERGIEEFFIZIENZKLASSE, rhsENERGIEEFFIZIENZKLASSE, (this.energieeffizienzklasse!= null), (that.energieeffizienzklasse!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsKUBATUR;
            lhsKUBATUR = this.getKUBATUR();
            BigDecimal rhsKUBATUR;
            rhsKUBATUR = that.getKUBATUR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kubatur", lhsKUBATUR), LocatorUtils.property(thatLocator, "kubatur", rhsKUBATUR), lhsKUBATUR, rhsKUBATUR, (this.kubatur!= null), (that.kubatur!= null))) {
                return false;
            }
        }
        {
            ConditionType lhsZUSTAND;
            lhsZUSTAND = this.getZUSTAND();
            ConditionType rhsZUSTAND;
            rhsZUSTAND = that.getZUSTAND();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zustand", lhsZUSTAND), LocatorUtils.property(thatLocator, "zustand", rhsZUSTAND), lhsZUSTAND, rhsZUSTAND, (this.zustand!= null), (that.zustand!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsZIMMER;
            lhsZIMMER = this.getZIMMER();
            BigInteger rhsZIMMER;
            rhsZIMMER = that.getZIMMER();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zimmer", lhsZIMMER), LocatorUtils.property(thatLocator, "zimmer", rhsZIMMER), lhsZIMMER, rhsZIMMER, (this.zimmer!= null), (that.zimmer!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsSTOCKWERKE;
            lhsSTOCKWERKE = this.getSTOCKWERKE();
            BigInteger rhsSTOCKWERKE;
            rhsSTOCKWERKE = that.getSTOCKWERKE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stockwerke", lhsSTOCKWERKE), LocatorUtils.property(thatLocator, "stockwerke", rhsSTOCKWERKE), lhsSTOCKWERKE, rhsSTOCKWERKE, (this.stockwerke!= null), (that.stockwerke!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsSTOCKWERK;
            lhsSTOCKWERK = this.getSTOCKWERK();
            BigInteger rhsSTOCKWERK;
            rhsSTOCKWERK = that.getSTOCKWERK();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stockwerk", lhsSTOCKWERK), LocatorUtils.property(thatLocator, "stockwerk", rhsSTOCKWERK), lhsSTOCKWERK, rhsSTOCKWERK, (this.stockwerk!= null), (that.stockwerk!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAUFZUG;
            lhsAUFZUG = this.getAUFZUG();
            Boolean rhsAUFZUG;
            rhsAUFZUG = that.getAUFZUG();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aufzug", lhsAUFZUG), LocatorUtils.property(thatLocator, "aufzug", rhsAUFZUG), lhsAUFZUG, rhsAUFZUG, (this.aufzug!= null), (that.aufzug!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGARAGE;
            lhsGARAGE = this.getGARAGE();
            Boolean rhsGARAGE;
            rhsGARAGE = that.getGARAGE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garage", lhsGARAGE), LocatorUtils.property(thatLocator, "garage", rhsGARAGE), lhsGARAGE, rhsGARAGE, (this.garage!= null), (that.garage!= null))) {
                return false;
            }
        }
        {
            Boolean lhsABSTELLPLATZ;
            lhsABSTELLPLATZ = this.getABSTELLPLATZ();
            Boolean rhsABSTELLPLATZ;
            rhsABSTELLPLATZ = that.getABSTELLPLATZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abstellplatz", lhsABSTELLPLATZ), LocatorUtils.property(thatLocator, "abstellplatz", rhsABSTELLPLATZ), lhsABSTELLPLATZ, rhsABSTELLPLATZ, (this.abstellplatz!= null), (that.abstellplatz!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGRUENFLAECHE;
            lhsGRUENFLAECHE = this.getGRUENFLAECHE();
            Boolean rhsGRUENFLAECHE;
            rhsGRUENFLAECHE = that.getGRUENFLAECHE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gruenflaeche", lhsGRUENFLAECHE), LocatorUtils.property(thatLocator, "gruenflaeche", rhsGRUENFLAECHE), lhsGRUENFLAECHE, rhsGRUENFLAECHE, (this.gruenflaeche!= null), (that.gruenflaeche!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKELLER;
            lhsKELLER = this.getKELLER();
            Boolean rhsKELLER;
            rhsKELLER = that.getKELLER();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keller", lhsKELLER), LocatorUtils.property(thatLocator, "keller", rhsKELLER), lhsKELLER, rhsKELLER, (this.keller!= null), (that.keller!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTERRASSE;
            lhsTERRASSE = this.getTERRASSE();
            Boolean rhsTERRASSE;
            rhsTERRASSE = that.getTERRASSE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terrasse", lhsTERRASSE), LocatorUtils.property(thatLocator, "terrasse", rhsTERRASSE), lhsTERRASSE, rhsTERRASSE, (this.terrasse!= null), (that.terrasse!= null))) {
                return false;
            }
        }
        {
            Boolean lhsLOGGIA;
            lhsLOGGIA = this.getLOGGIA();
            Boolean rhsLOGGIA;
            rhsLOGGIA = that.getLOGGIA();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loggia", lhsLOGGIA), LocatorUtils.property(thatLocator, "loggia", rhsLOGGIA), lhsLOGGIA, rhsLOGGIA, (this.loggia!= null), (that.loggia!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBALKON;
            lhsBALKON = this.getBALKON();
            Boolean rhsBALKON;
            rhsBALKON = that.getBALKON();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balkon", lhsBALKON), LocatorUtils.property(thatLocator, "balkon", rhsBALKON), lhsBALKON, rhsBALKON, (this.balkon!= null), (that.balkon!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDACHBODEN;
            lhsDACHBODEN = this.getDACHBODEN();
            Boolean rhsDACHBODEN;
            rhsDACHBODEN = that.getDACHBODEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dachboden", lhsDACHBODEN), LocatorUtils.property(thatLocator, "dachboden", rhsDACHBODEN), lhsDACHBODEN, rhsDACHBODEN, (this.dachboden!= null), (that.dachboden!= null))) {
                return false;
            }
        }
        {
            HeatingType lhsHEIZUNG;
            lhsHEIZUNG = this.getHEIZUNG();
            HeatingType rhsHEIZUNG;
            rhsHEIZUNG = that.getHEIZUNG();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizung", lhsHEIZUNG), LocatorUtils.property(thatLocator, "heizung", rhsHEIZUNG), lhsHEIZUNG, rhsHEIZUNG, (this.heizung!= null), (that.heizung!= null))) {
                return false;
            }
        }
        {
            EnergyStandard lhsKLIMAHAUS;
            lhsKLIMAHAUS = this.getKLIMAHAUS();
            EnergyStandard rhsKLIMAHAUS;
            rhsKLIMAHAUS = that.getKLIMAHAUS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "klimahaus", lhsKLIMAHAUS), LocatorUtils.property(thatLocator, "klimahaus", rhsKLIMAHAUS), lhsKLIMAHAUS, rhsKLIMAHAUS, (this.klimahaus!= null), (that.klimahaus!= null))) {
                return false;
            }
        }
        {
            String lhsUEBERGABEZEITPUNKT;
            lhsUEBERGABEZEITPUNKT = this.getUEBERGABEZEITPUNKT();
            String rhsUEBERGABEZEITPUNKT;
            rhsUEBERGABEZEITPUNKT = that.getUEBERGABEZEITPUNKT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uebergabezeitpunkt", lhsUEBERGABEZEITPUNKT), LocatorUtils.property(thatLocator, "uebergabezeitpunkt", rhsUEBERGABEZEITPUNKT), lhsUEBERGABEZEITPUNKT, rhsUEBERGABEZEITPUNKT, (this.uebergabezeitpunkt!= null), (that.uebergabezeitpunkt!= null))) {
                return false;
            }
        }
        {
            String lhsBAUJAHR;
            lhsBAUJAHR = this.getBAUJAHR();
            String rhsBAUJAHR;
            rhsBAUJAHR = that.getBAUJAHR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baujahr", lhsBAUJAHR), LocatorUtils.property(thatLocator, "baujahr", rhsBAUJAHR), lhsBAUJAHR, rhsBAUJAHR, (this.baujahr!= null), (that.baujahr!= null))) {
                return false;
            }
        }
        {
            String lhsINFODE;
            lhsINFODE = this.getINFODE();
            String rhsINFODE;
            rhsINFODE = that.getINFODE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "infode", lhsINFODE), LocatorUtils.property(thatLocator, "infode", rhsINFODE), lhsINFODE, rhsINFODE, (this.infode!= null), (that.infode!= null))) {
                return false;
            }
        }
        {
            String lhsINFOIT;
            lhsINFOIT = this.getINFOIT();
            String rhsINFOIT;
            rhsINFOIT = that.getINFOIT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "infoit", lhsINFOIT), LocatorUtils.property(thatLocator, "infoit", rhsINFOIT), lhsINFOIT, rhsINFOIT, (this.infoit!= null), (that.infoit!= null))) {
                return false;
            }
        }
        {
            String lhsBILD1;
            lhsBILD1 = this.getBILD1();
            String rhsBILD1;
            rhsBILD1 = that.getBILD1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild1", lhsBILD1), LocatorUtils.property(thatLocator, "bild1", rhsBILD1), lhsBILD1, rhsBILD1, (this.bild1 != null), (that.bild1 != null))) {
                return false;
            }
        }
        {
            String lhsBILD2;
            lhsBILD2 = this.getBILD2();
            String rhsBILD2;
            rhsBILD2 = that.getBILD2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild2", lhsBILD2), LocatorUtils.property(thatLocator, "bild2", rhsBILD2), lhsBILD2, rhsBILD2, (this.bild2 != null), (that.bild2 != null))) {
                return false;
            }
        }
        {
            String lhsBILD3;
            lhsBILD3 = this.getBILD3();
            String rhsBILD3;
            rhsBILD3 = that.getBILD3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild3", lhsBILD3), LocatorUtils.property(thatLocator, "bild3", rhsBILD3), lhsBILD3, rhsBILD3, (this.bild3 != null), (that.bild3 != null))) {
                return false;
            }
        }
        {
            String lhsBILD4;
            lhsBILD4 = this.getBILD4();
            String rhsBILD4;
            rhsBILD4 = that.getBILD4();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild4", lhsBILD4), LocatorUtils.property(thatLocator, "bild4", rhsBILD4), lhsBILD4, rhsBILD4, (this.bild4 != null), (that.bild4 != null))) {
                return false;
            }
        }
        {
            String lhsBILD5;
            lhsBILD5 = this.getBILD5();
            String rhsBILD5;
            rhsBILD5 = that.getBILD5();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild5", lhsBILD5), LocatorUtils.property(thatLocator, "bild5", rhsBILD5), lhsBILD5, rhsBILD5, (this.bild5 != null), (that.bild5 != null))) {
                return false;
            }
        }
        {
            String lhsBILD6;
            lhsBILD6 = this.getBILD6();
            String rhsBILD6;
            rhsBILD6 = that.getBILD6();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild6", lhsBILD6), LocatorUtils.property(thatLocator, "bild6", rhsBILD6), lhsBILD6, rhsBILD6, (this.bild6 != null), (that.bild6 != null))) {
                return false;
            }
        }
        {
            String lhsBILD7;
            lhsBILD7 = this.getBILD7();
            String rhsBILD7;
            rhsBILD7 = that.getBILD7();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild7", lhsBILD7), LocatorUtils.property(thatLocator, "bild7", rhsBILD7), lhsBILD7, rhsBILD7, (this.bild7 != null), (that.bild7 != null))) {
                return false;
            }
        }
        {
            String lhsBILD8;
            lhsBILD8 = this.getBILD8();
            String rhsBILD8;
            rhsBILD8 = that.getBILD8();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild8", lhsBILD8), LocatorUtils.property(thatLocator, "bild8", rhsBILD8), lhsBILD8, rhsBILD8, (this.bild8 != null), (that.bild8 != null))) {
                return false;
            }
        }
        {
            String lhsBILD9;
            lhsBILD9 = this.getBILD9();
            String rhsBILD9;
            rhsBILD9 = that.getBILD9();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild9", lhsBILD9), LocatorUtils.property(thatLocator, "bild9", rhsBILD9), lhsBILD9, rhsBILD9, (this.bild9 != null), (that.bild9 != null))) {
                return false;
            }
        }
        {
            String lhsBILD10;
            lhsBILD10 = this.getBILD10();
            String rhsBILD10;
            rhsBILD10 = that.getBILD10();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild10", lhsBILD10), LocatorUtils.property(thatLocator, "bild10", rhsBILD10), lhsBILD10, rhsBILD10, (this.bild10 != null), (that.bild10 != null))) {
                return false;
            }
        }
        {
            String lhsDOWNLOAD1;
            lhsDOWNLOAD1 = this.getDOWNLOAD1();
            String rhsDOWNLOAD1;
            rhsDOWNLOAD1 = that.getDOWNLOAD1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "download1", lhsDOWNLOAD1), LocatorUtils.property(thatLocator, "download1", rhsDOWNLOAD1), lhsDOWNLOAD1, rhsDOWNLOAD1, (this.download1 != null), (that.download1 != null))) {
                return false;
            }
        }
        {
            String lhsDOWNLOAD2;
            lhsDOWNLOAD2 = this.getDOWNLOAD2();
            String rhsDOWNLOAD2;
            rhsDOWNLOAD2 = that.getDOWNLOAD2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "download2", lhsDOWNLOAD2), LocatorUtils.property(thatLocator, "download2", rhsDOWNLOAD2), lhsDOWNLOAD2, rhsDOWNLOAD2, (this.download2 != null), (that.download2 != null))) {
                return false;
            }
        }
        {
            String lhsDOWNLOAD3;
            lhsDOWNLOAD3 = this.getDOWNLOAD3();
            String rhsDOWNLOAD3;
            rhsDOWNLOAD3 = that.getDOWNLOAD3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "download3", lhsDOWNLOAD3), LocatorUtils.property(thatLocator, "download3", rhsDOWNLOAD3), lhsDOWNLOAD3, rhsDOWNLOAD3, (this.download3 != null), (that.download3 != null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-07T07:14:25+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
