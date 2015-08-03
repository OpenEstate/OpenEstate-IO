
package org.openestate.io.wis_it.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
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
 *         &lt;element name="LOESCHEN" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="GUELTIGBIS" type="{}dateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="IMMOBILIENART" type="{}propertyType" minOccurs="0"/&gt;
 *         &lt;element name="ORT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FRAKTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MIETEKAUF" type="{}marketingType" minOccurs="0"/&gt;
 *         &lt;element name="PREIS" type="{}decimalType" minOccurs="0"/&gt;
 *         &lt;element name="AUFANFRAGE" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="NUTZFLAECHE" type="{}decimalType" minOccurs="0"/&gt;
 *         &lt;element name="FLAECHEART" type="{}areaType" minOccurs="0"/&gt;
 *         &lt;element name="FOERDERBAR" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="KONVENTIONIERT" type="{}yesNoType" minOccurs="0"/&gt;
 *         &lt;element name="KUBATUR" type="{}decimalType" minOccurs="0"/&gt;
 *         &lt;element name="ZUSTAND" type="{}conditionType" minOccurs="0"/&gt;
 *         &lt;element name="ZIMMER" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="STOCKWERKE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="STOCKWERK" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
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
    "foerderbar",
    "konventioniert",
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
public class ObjectType
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "LOESCHEN", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Boolean loeschen;
    @XmlElement(name = "GUELTIGBIS", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Calendar gueltigbis;
    @XmlElement(name = "IMMOBILIENART")
    @XmlSchemaType(name = "string")
    protected PropertyType immobilienart;
    @XmlElement(name = "ORT")
    protected String ort;
    @XmlElement(name = "FRAKTION")
    protected String fraktion;
    @XmlElement(name = "MIETEKAUF")
    @XmlSchemaType(name = "string")
    protected MarketingType mietekauf;
    @XmlElement(name = "PREIS", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "decimal")
    protected Double preis;
    @XmlElement(name = "AUFANFRAGE", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Boolean aufanfrage;
    @XmlElement(name = "NUTZFLAECHE", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "decimal")
    protected Double nutzflaeche;
    @XmlElement(name = "FLAECHEART")
    @XmlSchemaType(name = "string")
    protected AreaType flaecheart;
    @XmlElement(name = "FOERDERBAR", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Boolean foerderbar;
    @XmlElement(name = "KONVENTIONIERT", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Boolean konventioniert;
    @XmlElement(name = "KUBATUR", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "decimal")
    protected Double kubatur;
    @XmlElement(name = "ZUSTAND")
    @XmlSchemaType(name = "string")
    protected ConditionType zustand;
    @XmlElement(name = "ZIMMER", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer zimmer;
    @XmlElement(name = "STOCKWERKE", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer stockwerke;
    @XmlElement(name = "STOCKWERK", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer stockwerk;
    @XmlElement(name = "AUFZUG", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Boolean aufzug;
    @XmlElement(name = "GARAGE", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Boolean garage;
    @XmlElement(name = "ABSTELLPLATZ", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Boolean abstellplatz;
    @XmlElement(name = "GRUENFLAECHE", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Boolean gruenflaeche;
    @XmlElement(name = "KELLER", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Boolean keller;
    @XmlElement(name = "TERRASSE", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Boolean terrasse;
    @XmlElement(name = "LOGGIA", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Boolean loggia;
    @XmlElement(name = "BALKON", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Boolean balkon;
    @XmlElement(name = "DACHBODEN", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Boolean dachboden;
    @XmlElement(name = "HEIZUNG")
    @XmlSchemaType(name = "string")
    protected HeatingType heizung;
    @XmlElement(name = "KLIMAHAUS")
    @XmlSchemaType(name = "string")
    protected EnergyStandard klimahaus;
    @XmlElement(name = "UEBERGABEZEITPUNKT")
    protected String uebergabezeitpunkt;
    @XmlElement(name = "BAUJAHR")
    protected String baujahr;
    @XmlElement(name = "INFODE")
    protected String infode;
    @XmlElement(name = "INFOIT")
    protected String infoit;
    @XmlElement(name = "BILD1")
    protected String bild1;
    @XmlElement(name = "BILD2")
    protected String bild2;
    @XmlElement(name = "BILD3")
    protected String bild3;
    @XmlElement(name = "BILD4")
    protected String bild4;
    @XmlElement(name = "BILD5")
    protected String bild5;
    @XmlElement(name = "BILD6")
    protected String bild6;
    @XmlElement(name = "BILD7")
    protected String bild7;
    @XmlElement(name = "BILD8")
    protected String bild8;
    @XmlElement(name = "BILD9")
    protected String bild9;
    @XmlElement(name = "BILD10")
    protected String bild10;
    @XmlElement(name = "DOWNLOAD1")
    protected String download1;
    @XmlElement(name = "DOWNLOAD2")
    protected String download2;
    @XmlElement(name = "DOWNLOAD3")
    protected String download3;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public Boolean isLOESCHEN() {
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
    public Double getPREIS() {
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
    public void setPREIS(Double value) {
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
    public Boolean isAUFANFRAGE() {
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
    public Double getNUTZFLAECHE() {
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
    public void setNUTZFLAECHE(Double value) {
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
    public void setFLAECHEART(AreaType value) {
        this.flaecheart = value;
    }

    /**
     * Gets the value of the foerderbar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isFOERDERBAR() {
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
    public Boolean isKONVENTIONIERT() {
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
    public void setKONVENTIONIERT(Boolean value) {
        this.konventioniert = value;
    }

    /**
     * Gets the value of the kubatur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getKUBATUR() {
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
    public void setKUBATUR(Double value) {
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
    public Integer getZIMMER() {
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
    public void setZIMMER(Integer value) {
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
    public Integer getSTOCKWERKE() {
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
    public void setSTOCKWERKE(Integer value) {
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
    public Integer getSTOCKWERK() {
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
    public void setSTOCKWERK(Integer value) {
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
    public Boolean isAUFZUG() {
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
    public Boolean isGARAGE() {
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
    public Boolean isABSTELLPLATZ() {
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
    public Boolean isGRUENFLAECHE() {
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
    public Boolean isKELLER() {
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
    public Boolean isTERRASSE() {
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
    public Boolean isLOGGIA() {
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
    public Boolean isBALKON() {
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
    public Boolean isDACHBODEN() {
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
    public void setDOWNLOAD3(String value) {
        this.download3 = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            Boolean theLOESCHEN;
            theLOESCHEN = this.isLOESCHEN();
            strategy.appendField(locator, this, "loeschen", buffer, theLOESCHEN);
        }
        {
            Calendar theGUELTIGBIS;
            theGUELTIGBIS = this.getGUELTIGBIS();
            strategy.appendField(locator, this, "gueltigbis", buffer, theGUELTIGBIS);
        }
        {
            PropertyType theIMMOBILIENART;
            theIMMOBILIENART = this.getIMMOBILIENART();
            strategy.appendField(locator, this, "immobilienart", buffer, theIMMOBILIENART);
        }
        {
            String theORT;
            theORT = this.getORT();
            strategy.appendField(locator, this, "ort", buffer, theORT);
        }
        {
            String theFRAKTION;
            theFRAKTION = this.getFRAKTION();
            strategy.appendField(locator, this, "fraktion", buffer, theFRAKTION);
        }
        {
            MarketingType theMIETEKAUF;
            theMIETEKAUF = this.getMIETEKAUF();
            strategy.appendField(locator, this, "mietekauf", buffer, theMIETEKAUF);
        }
        {
            Double thePREIS;
            thePREIS = this.getPREIS();
            strategy.appendField(locator, this, "preis", buffer, thePREIS);
        }
        {
            Boolean theAUFANFRAGE;
            theAUFANFRAGE = this.isAUFANFRAGE();
            strategy.appendField(locator, this, "aufanfrage", buffer, theAUFANFRAGE);
        }
        {
            Double theNUTZFLAECHE;
            theNUTZFLAECHE = this.getNUTZFLAECHE();
            strategy.appendField(locator, this, "nutzflaeche", buffer, theNUTZFLAECHE);
        }
        {
            AreaType theFLAECHEART;
            theFLAECHEART = this.getFLAECHEART();
            strategy.appendField(locator, this, "flaecheart", buffer, theFLAECHEART);
        }
        {
            Boolean theFOERDERBAR;
            theFOERDERBAR = this.isFOERDERBAR();
            strategy.appendField(locator, this, "foerderbar", buffer, theFOERDERBAR);
        }
        {
            Boolean theKONVENTIONIERT;
            theKONVENTIONIERT = this.isKONVENTIONIERT();
            strategy.appendField(locator, this, "konventioniert", buffer, theKONVENTIONIERT);
        }
        {
            Double theKUBATUR;
            theKUBATUR = this.getKUBATUR();
            strategy.appendField(locator, this, "kubatur", buffer, theKUBATUR);
        }
        {
            ConditionType theZUSTAND;
            theZUSTAND = this.getZUSTAND();
            strategy.appendField(locator, this, "zustand", buffer, theZUSTAND);
        }
        {
            Integer theZIMMER;
            theZIMMER = this.getZIMMER();
            strategy.appendField(locator, this, "zimmer", buffer, theZIMMER);
        }
        {
            Integer theSTOCKWERKE;
            theSTOCKWERKE = this.getSTOCKWERKE();
            strategy.appendField(locator, this, "stockwerke", buffer, theSTOCKWERKE);
        }
        {
            Integer theSTOCKWERK;
            theSTOCKWERK = this.getSTOCKWERK();
            strategy.appendField(locator, this, "stockwerk", buffer, theSTOCKWERK);
        }
        {
            Boolean theAUFZUG;
            theAUFZUG = this.isAUFZUG();
            strategy.appendField(locator, this, "aufzug", buffer, theAUFZUG);
        }
        {
            Boolean theGARAGE;
            theGARAGE = this.isGARAGE();
            strategy.appendField(locator, this, "garage", buffer, theGARAGE);
        }
        {
            Boolean theABSTELLPLATZ;
            theABSTELLPLATZ = this.isABSTELLPLATZ();
            strategy.appendField(locator, this, "abstellplatz", buffer, theABSTELLPLATZ);
        }
        {
            Boolean theGRUENFLAECHE;
            theGRUENFLAECHE = this.isGRUENFLAECHE();
            strategy.appendField(locator, this, "gruenflaeche", buffer, theGRUENFLAECHE);
        }
        {
            Boolean theKELLER;
            theKELLER = this.isKELLER();
            strategy.appendField(locator, this, "keller", buffer, theKELLER);
        }
        {
            Boolean theTERRASSE;
            theTERRASSE = this.isTERRASSE();
            strategy.appendField(locator, this, "terrasse", buffer, theTERRASSE);
        }
        {
            Boolean theLOGGIA;
            theLOGGIA = this.isLOGGIA();
            strategy.appendField(locator, this, "loggia", buffer, theLOGGIA);
        }
        {
            Boolean theBALKON;
            theBALKON = this.isBALKON();
            strategy.appendField(locator, this, "balkon", buffer, theBALKON);
        }
        {
            Boolean theDACHBODEN;
            theDACHBODEN = this.isDACHBODEN();
            strategy.appendField(locator, this, "dachboden", buffer, theDACHBODEN);
        }
        {
            HeatingType theHEIZUNG;
            theHEIZUNG = this.getHEIZUNG();
            strategy.appendField(locator, this, "heizung", buffer, theHEIZUNG);
        }
        {
            EnergyStandard theKLIMAHAUS;
            theKLIMAHAUS = this.getKLIMAHAUS();
            strategy.appendField(locator, this, "klimahaus", buffer, theKLIMAHAUS);
        }
        {
            String theUEBERGABEZEITPUNKT;
            theUEBERGABEZEITPUNKT = this.getUEBERGABEZEITPUNKT();
            strategy.appendField(locator, this, "uebergabezeitpunkt", buffer, theUEBERGABEZEITPUNKT);
        }
        {
            String theBAUJAHR;
            theBAUJAHR = this.getBAUJAHR();
            strategy.appendField(locator, this, "baujahr", buffer, theBAUJAHR);
        }
        {
            String theINFODE;
            theINFODE = this.getINFODE();
            strategy.appendField(locator, this, "infode", buffer, theINFODE);
        }
        {
            String theINFOIT;
            theINFOIT = this.getINFOIT();
            strategy.appendField(locator, this, "infoit", buffer, theINFOIT);
        }
        {
            String theBILD1;
            theBILD1 = this.getBILD1();
            strategy.appendField(locator, this, "bild1", buffer, theBILD1);
        }
        {
            String theBILD2;
            theBILD2 = this.getBILD2();
            strategy.appendField(locator, this, "bild2", buffer, theBILD2);
        }
        {
            String theBILD3;
            theBILD3 = this.getBILD3();
            strategy.appendField(locator, this, "bild3", buffer, theBILD3);
        }
        {
            String theBILD4;
            theBILD4 = this.getBILD4();
            strategy.appendField(locator, this, "bild4", buffer, theBILD4);
        }
        {
            String theBILD5;
            theBILD5 = this.getBILD5();
            strategy.appendField(locator, this, "bild5", buffer, theBILD5);
        }
        {
            String theBILD6;
            theBILD6 = this.getBILD6();
            strategy.appendField(locator, this, "bild6", buffer, theBILD6);
        }
        {
            String theBILD7;
            theBILD7 = this.getBILD7();
            strategy.appendField(locator, this, "bild7", buffer, theBILD7);
        }
        {
            String theBILD8;
            theBILD8 = this.getBILD8();
            strategy.appendField(locator, this, "bild8", buffer, theBILD8);
        }
        {
            String theBILD9;
            theBILD9 = this.getBILD9();
            strategy.appendField(locator, this, "bild9", buffer, theBILD9);
        }
        {
            String theBILD10;
            theBILD10 = this.getBILD10();
            strategy.appendField(locator, this, "bild10", buffer, theBILD10);
        }
        {
            String theDOWNLOAD1;
            theDOWNLOAD1 = this.getDOWNLOAD1();
            strategy.appendField(locator, this, "download1", buffer, theDOWNLOAD1);
        }
        {
            String theDOWNLOAD2;
            theDOWNLOAD2 = this.getDOWNLOAD2();
            strategy.appendField(locator, this, "download2", buffer, theDOWNLOAD2);
        }
        {
            String theDOWNLOAD3;
            theDOWNLOAD3 = this.getDOWNLOAD3();
            strategy.appendField(locator, this, "download3", buffer, theDOWNLOAD3);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ObjectType) {
            final ObjectType copy = ((ObjectType) draftCopy);
            if (this.id!= null) {
                String sourceID;
                sourceID = this.getID();
                String copyID = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceID), sourceID));
                copy.setID(copyID);
            } else {
                copy.id = null;
            }
            if (this.loeschen!= null) {
                Boolean sourceLOESCHEN;
                sourceLOESCHEN = this.isLOESCHEN();
                Boolean copyLOESCHEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "loeschen", sourceLOESCHEN), sourceLOESCHEN));
                copy.setLOESCHEN(copyLOESCHEN);
            } else {
                copy.loeschen = null;
            }
            if (this.gueltigbis!= null) {
                Calendar sourceGUELTIGBIS;
                sourceGUELTIGBIS = this.getGUELTIGBIS();
                Calendar copyGUELTIGBIS = ((Calendar) strategy.copy(LocatorUtils.property(locator, "gueltigbis", sourceGUELTIGBIS), sourceGUELTIGBIS));
                copy.setGUELTIGBIS(copyGUELTIGBIS);
            } else {
                copy.gueltigbis = null;
            }
            if (this.immobilienart!= null) {
                PropertyType sourceIMMOBILIENART;
                sourceIMMOBILIENART = this.getIMMOBILIENART();
                PropertyType copyIMMOBILIENART = ((PropertyType) strategy.copy(LocatorUtils.property(locator, "immobilienart", sourceIMMOBILIENART), sourceIMMOBILIENART));
                copy.setIMMOBILIENART(copyIMMOBILIENART);
            } else {
                copy.immobilienart = null;
            }
            if (this.ort!= null) {
                String sourceORT;
                sourceORT = this.getORT();
                String copyORT = ((String) strategy.copy(LocatorUtils.property(locator, "ort", sourceORT), sourceORT));
                copy.setORT(copyORT);
            } else {
                copy.ort = null;
            }
            if (this.fraktion!= null) {
                String sourceFRAKTION;
                sourceFRAKTION = this.getFRAKTION();
                String copyFRAKTION = ((String) strategy.copy(LocatorUtils.property(locator, "fraktion", sourceFRAKTION), sourceFRAKTION));
                copy.setFRAKTION(copyFRAKTION);
            } else {
                copy.fraktion = null;
            }
            if (this.mietekauf!= null) {
                MarketingType sourceMIETEKAUF;
                sourceMIETEKAUF = this.getMIETEKAUF();
                MarketingType copyMIETEKAUF = ((MarketingType) strategy.copy(LocatorUtils.property(locator, "mietekauf", sourceMIETEKAUF), sourceMIETEKAUF));
                copy.setMIETEKAUF(copyMIETEKAUF);
            } else {
                copy.mietekauf = null;
            }
            if (this.preis!= null) {
                Double sourcePREIS;
                sourcePREIS = this.getPREIS();
                Double copyPREIS = ((Double) strategy.copy(LocatorUtils.property(locator, "preis", sourcePREIS), sourcePREIS));
                copy.setPREIS(copyPREIS);
            } else {
                copy.preis = null;
            }
            if (this.aufanfrage!= null) {
                Boolean sourceAUFANFRAGE;
                sourceAUFANFRAGE = this.isAUFANFRAGE();
                Boolean copyAUFANFRAGE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "aufanfrage", sourceAUFANFRAGE), sourceAUFANFRAGE));
                copy.setAUFANFRAGE(copyAUFANFRAGE);
            } else {
                copy.aufanfrage = null;
            }
            if (this.nutzflaeche!= null) {
                Double sourceNUTZFLAECHE;
                sourceNUTZFLAECHE = this.getNUTZFLAECHE();
                Double copyNUTZFLAECHE = ((Double) strategy.copy(LocatorUtils.property(locator, "nutzflaeche", sourceNUTZFLAECHE), sourceNUTZFLAECHE));
                copy.setNUTZFLAECHE(copyNUTZFLAECHE);
            } else {
                copy.nutzflaeche = null;
            }
            if (this.flaecheart!= null) {
                AreaType sourceFLAECHEART;
                sourceFLAECHEART = this.getFLAECHEART();
                AreaType copyFLAECHEART = ((AreaType) strategy.copy(LocatorUtils.property(locator, "flaecheart", sourceFLAECHEART), sourceFLAECHEART));
                copy.setFLAECHEART(copyFLAECHEART);
            } else {
                copy.flaecheart = null;
            }
            if (this.foerderbar!= null) {
                Boolean sourceFOERDERBAR;
                sourceFOERDERBAR = this.isFOERDERBAR();
                Boolean copyFOERDERBAR = ((Boolean) strategy.copy(LocatorUtils.property(locator, "foerderbar", sourceFOERDERBAR), sourceFOERDERBAR));
                copy.setFOERDERBAR(copyFOERDERBAR);
            } else {
                copy.foerderbar = null;
            }
            if (this.konventioniert!= null) {
                Boolean sourceKONVENTIONIERT;
                sourceKONVENTIONIERT = this.isKONVENTIONIERT();
                Boolean copyKONVENTIONIERT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "konventioniert", sourceKONVENTIONIERT), sourceKONVENTIONIERT));
                copy.setKONVENTIONIERT(copyKONVENTIONIERT);
            } else {
                copy.konventioniert = null;
            }
            if (this.kubatur!= null) {
                Double sourceKUBATUR;
                sourceKUBATUR = this.getKUBATUR();
                Double copyKUBATUR = ((Double) strategy.copy(LocatorUtils.property(locator, "kubatur", sourceKUBATUR), sourceKUBATUR));
                copy.setKUBATUR(copyKUBATUR);
            } else {
                copy.kubatur = null;
            }
            if (this.zustand!= null) {
                ConditionType sourceZUSTAND;
                sourceZUSTAND = this.getZUSTAND();
                ConditionType copyZUSTAND = ((ConditionType) strategy.copy(LocatorUtils.property(locator, "zustand", sourceZUSTAND), sourceZUSTAND));
                copy.setZUSTAND(copyZUSTAND);
            } else {
                copy.zustand = null;
            }
            if (this.zimmer!= null) {
                Integer sourceZIMMER;
                sourceZIMMER = this.getZIMMER();
                Integer copyZIMMER = ((Integer) strategy.copy(LocatorUtils.property(locator, "zimmer", sourceZIMMER), sourceZIMMER));
                copy.setZIMMER(copyZIMMER);
            } else {
                copy.zimmer = null;
            }
            if (this.stockwerke!= null) {
                Integer sourceSTOCKWERKE;
                sourceSTOCKWERKE = this.getSTOCKWERKE();
                Integer copySTOCKWERKE = ((Integer) strategy.copy(LocatorUtils.property(locator, "stockwerke", sourceSTOCKWERKE), sourceSTOCKWERKE));
                copy.setSTOCKWERKE(copySTOCKWERKE);
            } else {
                copy.stockwerke = null;
            }
            if (this.stockwerk!= null) {
                Integer sourceSTOCKWERK;
                sourceSTOCKWERK = this.getSTOCKWERK();
                Integer copySTOCKWERK = ((Integer) strategy.copy(LocatorUtils.property(locator, "stockwerk", sourceSTOCKWERK), sourceSTOCKWERK));
                copy.setSTOCKWERK(copySTOCKWERK);
            } else {
                copy.stockwerk = null;
            }
            if (this.aufzug!= null) {
                Boolean sourceAUFZUG;
                sourceAUFZUG = this.isAUFZUG();
                Boolean copyAUFZUG = ((Boolean) strategy.copy(LocatorUtils.property(locator, "aufzug", sourceAUFZUG), sourceAUFZUG));
                copy.setAUFZUG(copyAUFZUG);
            } else {
                copy.aufzug = null;
            }
            if (this.garage!= null) {
                Boolean sourceGARAGE;
                sourceGARAGE = this.isGARAGE();
                Boolean copyGARAGE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "garage", sourceGARAGE), sourceGARAGE));
                copy.setGARAGE(copyGARAGE);
            } else {
                copy.garage = null;
            }
            if (this.abstellplatz!= null) {
                Boolean sourceABSTELLPLATZ;
                sourceABSTELLPLATZ = this.isABSTELLPLATZ();
                Boolean copyABSTELLPLATZ = ((Boolean) strategy.copy(LocatorUtils.property(locator, "abstellplatz", sourceABSTELLPLATZ), sourceABSTELLPLATZ));
                copy.setABSTELLPLATZ(copyABSTELLPLATZ);
            } else {
                copy.abstellplatz = null;
            }
            if (this.gruenflaeche!= null) {
                Boolean sourceGRUENFLAECHE;
                sourceGRUENFLAECHE = this.isGRUENFLAECHE();
                Boolean copyGRUENFLAECHE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gruenflaeche", sourceGRUENFLAECHE), sourceGRUENFLAECHE));
                copy.setGRUENFLAECHE(copyGRUENFLAECHE);
            } else {
                copy.gruenflaeche = null;
            }
            if (this.keller!= null) {
                Boolean sourceKELLER;
                sourceKELLER = this.isKELLER();
                Boolean copyKELLER = ((Boolean) strategy.copy(LocatorUtils.property(locator, "keller", sourceKELLER), sourceKELLER));
                copy.setKELLER(copyKELLER);
            } else {
                copy.keller = null;
            }
            if (this.terrasse!= null) {
                Boolean sourceTERRASSE;
                sourceTERRASSE = this.isTERRASSE();
                Boolean copyTERRASSE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "terrasse", sourceTERRASSE), sourceTERRASSE));
                copy.setTERRASSE(copyTERRASSE);
            } else {
                copy.terrasse = null;
            }
            if (this.loggia!= null) {
                Boolean sourceLOGGIA;
                sourceLOGGIA = this.isLOGGIA();
                Boolean copyLOGGIA = ((Boolean) strategy.copy(LocatorUtils.property(locator, "loggia", sourceLOGGIA), sourceLOGGIA));
                copy.setLOGGIA(copyLOGGIA);
            } else {
                copy.loggia = null;
            }
            if (this.balkon!= null) {
                Boolean sourceBALKON;
                sourceBALKON = this.isBALKON();
                Boolean copyBALKON = ((Boolean) strategy.copy(LocatorUtils.property(locator, "balkon", sourceBALKON), sourceBALKON));
                copy.setBALKON(copyBALKON);
            } else {
                copy.balkon = null;
            }
            if (this.dachboden!= null) {
                Boolean sourceDACHBODEN;
                sourceDACHBODEN = this.isDACHBODEN();
                Boolean copyDACHBODEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "dachboden", sourceDACHBODEN), sourceDACHBODEN));
                copy.setDACHBODEN(copyDACHBODEN);
            } else {
                copy.dachboden = null;
            }
            if (this.heizung!= null) {
                HeatingType sourceHEIZUNG;
                sourceHEIZUNG = this.getHEIZUNG();
                HeatingType copyHEIZUNG = ((HeatingType) strategy.copy(LocatorUtils.property(locator, "heizung", sourceHEIZUNG), sourceHEIZUNG));
                copy.setHEIZUNG(copyHEIZUNG);
            } else {
                copy.heizung = null;
            }
            if (this.klimahaus!= null) {
                EnergyStandard sourceKLIMAHAUS;
                sourceKLIMAHAUS = this.getKLIMAHAUS();
                EnergyStandard copyKLIMAHAUS = ((EnergyStandard) strategy.copy(LocatorUtils.property(locator, "klimahaus", sourceKLIMAHAUS), sourceKLIMAHAUS));
                copy.setKLIMAHAUS(copyKLIMAHAUS);
            } else {
                copy.klimahaus = null;
            }
            if (this.uebergabezeitpunkt!= null) {
                String sourceUEBERGABEZEITPUNKT;
                sourceUEBERGABEZEITPUNKT = this.getUEBERGABEZEITPUNKT();
                String copyUEBERGABEZEITPUNKT = ((String) strategy.copy(LocatorUtils.property(locator, "uebergabezeitpunkt", sourceUEBERGABEZEITPUNKT), sourceUEBERGABEZEITPUNKT));
                copy.setUEBERGABEZEITPUNKT(copyUEBERGABEZEITPUNKT);
            } else {
                copy.uebergabezeitpunkt = null;
            }
            if (this.baujahr!= null) {
                String sourceBAUJAHR;
                sourceBAUJAHR = this.getBAUJAHR();
                String copyBAUJAHR = ((String) strategy.copy(LocatorUtils.property(locator, "baujahr", sourceBAUJAHR), sourceBAUJAHR));
                copy.setBAUJAHR(copyBAUJAHR);
            } else {
                copy.baujahr = null;
            }
            if (this.infode!= null) {
                String sourceINFODE;
                sourceINFODE = this.getINFODE();
                String copyINFODE = ((String) strategy.copy(LocatorUtils.property(locator, "infode", sourceINFODE), sourceINFODE));
                copy.setINFODE(copyINFODE);
            } else {
                copy.infode = null;
            }
            if (this.infoit!= null) {
                String sourceINFOIT;
                sourceINFOIT = this.getINFOIT();
                String copyINFOIT = ((String) strategy.copy(LocatorUtils.property(locator, "infoit", sourceINFOIT), sourceINFOIT));
                copy.setINFOIT(copyINFOIT);
            } else {
                copy.infoit = null;
            }
            if (this.bild1 != null) {
                String sourceBILD1;
                sourceBILD1 = this.getBILD1();
                String copyBILD1 = ((String) strategy.copy(LocatorUtils.property(locator, "bild1", sourceBILD1), sourceBILD1));
                copy.setBILD1(copyBILD1);
            } else {
                copy.bild1 = null;
            }
            if (this.bild2 != null) {
                String sourceBILD2;
                sourceBILD2 = this.getBILD2();
                String copyBILD2 = ((String) strategy.copy(LocatorUtils.property(locator, "bild2", sourceBILD2), sourceBILD2));
                copy.setBILD2(copyBILD2);
            } else {
                copy.bild2 = null;
            }
            if (this.bild3 != null) {
                String sourceBILD3;
                sourceBILD3 = this.getBILD3();
                String copyBILD3 = ((String) strategy.copy(LocatorUtils.property(locator, "bild3", sourceBILD3), sourceBILD3));
                copy.setBILD3(copyBILD3);
            } else {
                copy.bild3 = null;
            }
            if (this.bild4 != null) {
                String sourceBILD4;
                sourceBILD4 = this.getBILD4();
                String copyBILD4 = ((String) strategy.copy(LocatorUtils.property(locator, "bild4", sourceBILD4), sourceBILD4));
                copy.setBILD4(copyBILD4);
            } else {
                copy.bild4 = null;
            }
            if (this.bild5 != null) {
                String sourceBILD5;
                sourceBILD5 = this.getBILD5();
                String copyBILD5 = ((String) strategy.copy(LocatorUtils.property(locator, "bild5", sourceBILD5), sourceBILD5));
                copy.setBILD5(copyBILD5);
            } else {
                copy.bild5 = null;
            }
            if (this.bild6 != null) {
                String sourceBILD6;
                sourceBILD6 = this.getBILD6();
                String copyBILD6 = ((String) strategy.copy(LocatorUtils.property(locator, "bild6", sourceBILD6), sourceBILD6));
                copy.setBILD6(copyBILD6);
            } else {
                copy.bild6 = null;
            }
            if (this.bild7 != null) {
                String sourceBILD7;
                sourceBILD7 = this.getBILD7();
                String copyBILD7 = ((String) strategy.copy(LocatorUtils.property(locator, "bild7", sourceBILD7), sourceBILD7));
                copy.setBILD7(copyBILD7);
            } else {
                copy.bild7 = null;
            }
            if (this.bild8 != null) {
                String sourceBILD8;
                sourceBILD8 = this.getBILD8();
                String copyBILD8 = ((String) strategy.copy(LocatorUtils.property(locator, "bild8", sourceBILD8), sourceBILD8));
                copy.setBILD8(copyBILD8);
            } else {
                copy.bild8 = null;
            }
            if (this.bild9 != null) {
                String sourceBILD9;
                sourceBILD9 = this.getBILD9();
                String copyBILD9 = ((String) strategy.copy(LocatorUtils.property(locator, "bild9", sourceBILD9), sourceBILD9));
                copy.setBILD9(copyBILD9);
            } else {
                copy.bild9 = null;
            }
            if (this.bild10 != null) {
                String sourceBILD10;
                sourceBILD10 = this.getBILD10();
                String copyBILD10 = ((String) strategy.copy(LocatorUtils.property(locator, "bild10", sourceBILD10), sourceBILD10));
                copy.setBILD10(copyBILD10);
            } else {
                copy.bild10 = null;
            }
            if (this.download1 != null) {
                String sourceDOWNLOAD1;
                sourceDOWNLOAD1 = this.getDOWNLOAD1();
                String copyDOWNLOAD1 = ((String) strategy.copy(LocatorUtils.property(locator, "download1", sourceDOWNLOAD1), sourceDOWNLOAD1));
                copy.setDOWNLOAD1(copyDOWNLOAD1);
            } else {
                copy.download1 = null;
            }
            if (this.download2 != null) {
                String sourceDOWNLOAD2;
                sourceDOWNLOAD2 = this.getDOWNLOAD2();
                String copyDOWNLOAD2 = ((String) strategy.copy(LocatorUtils.property(locator, "download2", sourceDOWNLOAD2), sourceDOWNLOAD2));
                copy.setDOWNLOAD2(copyDOWNLOAD2);
            } else {
                copy.download2 = null;
            }
            if (this.download3 != null) {
                String sourceDOWNLOAD3;
                sourceDOWNLOAD3 = this.getDOWNLOAD3();
                String copyDOWNLOAD3 = ((String) strategy.copy(LocatorUtils.property(locator, "download3", sourceDOWNLOAD3), sourceDOWNLOAD3));
                copy.setDOWNLOAD3(copyDOWNLOAD3);
            } else {
                copy.download3 = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ObjectType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ObjectType)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            Boolean lhsLOESCHEN;
            lhsLOESCHEN = this.isLOESCHEN();
            Boolean rhsLOESCHEN;
            rhsLOESCHEN = that.isLOESCHEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loeschen", lhsLOESCHEN), LocatorUtils.property(thatLocator, "loeschen", rhsLOESCHEN), lhsLOESCHEN, rhsLOESCHEN)) {
                return false;
            }
        }
        {
            Calendar lhsGUELTIGBIS;
            lhsGUELTIGBIS = this.getGUELTIGBIS();
            Calendar rhsGUELTIGBIS;
            rhsGUELTIGBIS = that.getGUELTIGBIS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gueltigbis", lhsGUELTIGBIS), LocatorUtils.property(thatLocator, "gueltigbis", rhsGUELTIGBIS), lhsGUELTIGBIS, rhsGUELTIGBIS)) {
                return false;
            }
        }
        {
            PropertyType lhsIMMOBILIENART;
            lhsIMMOBILIENART = this.getIMMOBILIENART();
            PropertyType rhsIMMOBILIENART;
            rhsIMMOBILIENART = that.getIMMOBILIENART();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "immobilienart", lhsIMMOBILIENART), LocatorUtils.property(thatLocator, "immobilienart", rhsIMMOBILIENART), lhsIMMOBILIENART, rhsIMMOBILIENART)) {
                return false;
            }
        }
        {
            String lhsORT;
            lhsORT = this.getORT();
            String rhsORT;
            rhsORT = that.getORT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ort", lhsORT), LocatorUtils.property(thatLocator, "ort", rhsORT), lhsORT, rhsORT)) {
                return false;
            }
        }
        {
            String lhsFRAKTION;
            lhsFRAKTION = this.getFRAKTION();
            String rhsFRAKTION;
            rhsFRAKTION = that.getFRAKTION();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fraktion", lhsFRAKTION), LocatorUtils.property(thatLocator, "fraktion", rhsFRAKTION), lhsFRAKTION, rhsFRAKTION)) {
                return false;
            }
        }
        {
            MarketingType lhsMIETEKAUF;
            lhsMIETEKAUF = this.getMIETEKAUF();
            MarketingType rhsMIETEKAUF;
            rhsMIETEKAUF = that.getMIETEKAUF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietekauf", lhsMIETEKAUF), LocatorUtils.property(thatLocator, "mietekauf", rhsMIETEKAUF), lhsMIETEKAUF, rhsMIETEKAUF)) {
                return false;
            }
        }
        {
            Double lhsPREIS;
            lhsPREIS = this.getPREIS();
            Double rhsPREIS;
            rhsPREIS = that.getPREIS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preis", lhsPREIS), LocatorUtils.property(thatLocator, "preis", rhsPREIS), lhsPREIS, rhsPREIS)) {
                return false;
            }
        }
        {
            Boolean lhsAUFANFRAGE;
            lhsAUFANFRAGE = this.isAUFANFRAGE();
            Boolean rhsAUFANFRAGE;
            rhsAUFANFRAGE = that.isAUFANFRAGE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aufanfrage", lhsAUFANFRAGE), LocatorUtils.property(thatLocator, "aufanfrage", rhsAUFANFRAGE), lhsAUFANFRAGE, rhsAUFANFRAGE)) {
                return false;
            }
        }
        {
            Double lhsNUTZFLAECHE;
            lhsNUTZFLAECHE = this.getNUTZFLAECHE();
            Double rhsNUTZFLAECHE;
            rhsNUTZFLAECHE = that.getNUTZFLAECHE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nutzflaeche", lhsNUTZFLAECHE), LocatorUtils.property(thatLocator, "nutzflaeche", rhsNUTZFLAECHE), lhsNUTZFLAECHE, rhsNUTZFLAECHE)) {
                return false;
            }
        }
        {
            AreaType lhsFLAECHEART;
            lhsFLAECHEART = this.getFLAECHEART();
            AreaType rhsFLAECHEART;
            rhsFLAECHEART = that.getFLAECHEART();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flaecheart", lhsFLAECHEART), LocatorUtils.property(thatLocator, "flaecheart", rhsFLAECHEART), lhsFLAECHEART, rhsFLAECHEART)) {
                return false;
            }
        }
        {
            Boolean lhsFOERDERBAR;
            lhsFOERDERBAR = this.isFOERDERBAR();
            Boolean rhsFOERDERBAR;
            rhsFOERDERBAR = that.isFOERDERBAR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "foerderbar", lhsFOERDERBAR), LocatorUtils.property(thatLocator, "foerderbar", rhsFOERDERBAR), lhsFOERDERBAR, rhsFOERDERBAR)) {
                return false;
            }
        }
        {
            Boolean lhsKONVENTIONIERT;
            lhsKONVENTIONIERT = this.isKONVENTIONIERT();
            Boolean rhsKONVENTIONIERT;
            rhsKONVENTIONIERT = that.isKONVENTIONIERT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "konventioniert", lhsKONVENTIONIERT), LocatorUtils.property(thatLocator, "konventioniert", rhsKONVENTIONIERT), lhsKONVENTIONIERT, rhsKONVENTIONIERT)) {
                return false;
            }
        }
        {
            Double lhsKUBATUR;
            lhsKUBATUR = this.getKUBATUR();
            Double rhsKUBATUR;
            rhsKUBATUR = that.getKUBATUR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kubatur", lhsKUBATUR), LocatorUtils.property(thatLocator, "kubatur", rhsKUBATUR), lhsKUBATUR, rhsKUBATUR)) {
                return false;
            }
        }
        {
            ConditionType lhsZUSTAND;
            lhsZUSTAND = this.getZUSTAND();
            ConditionType rhsZUSTAND;
            rhsZUSTAND = that.getZUSTAND();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zustand", lhsZUSTAND), LocatorUtils.property(thatLocator, "zustand", rhsZUSTAND), lhsZUSTAND, rhsZUSTAND)) {
                return false;
            }
        }
        {
            Integer lhsZIMMER;
            lhsZIMMER = this.getZIMMER();
            Integer rhsZIMMER;
            rhsZIMMER = that.getZIMMER();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zimmer", lhsZIMMER), LocatorUtils.property(thatLocator, "zimmer", rhsZIMMER), lhsZIMMER, rhsZIMMER)) {
                return false;
            }
        }
        {
            Integer lhsSTOCKWERKE;
            lhsSTOCKWERKE = this.getSTOCKWERKE();
            Integer rhsSTOCKWERKE;
            rhsSTOCKWERKE = that.getSTOCKWERKE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stockwerke", lhsSTOCKWERKE), LocatorUtils.property(thatLocator, "stockwerke", rhsSTOCKWERKE), lhsSTOCKWERKE, rhsSTOCKWERKE)) {
                return false;
            }
        }
        {
            Integer lhsSTOCKWERK;
            lhsSTOCKWERK = this.getSTOCKWERK();
            Integer rhsSTOCKWERK;
            rhsSTOCKWERK = that.getSTOCKWERK();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stockwerk", lhsSTOCKWERK), LocatorUtils.property(thatLocator, "stockwerk", rhsSTOCKWERK), lhsSTOCKWERK, rhsSTOCKWERK)) {
                return false;
            }
        }
        {
            Boolean lhsAUFZUG;
            lhsAUFZUG = this.isAUFZUG();
            Boolean rhsAUFZUG;
            rhsAUFZUG = that.isAUFZUG();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aufzug", lhsAUFZUG), LocatorUtils.property(thatLocator, "aufzug", rhsAUFZUG), lhsAUFZUG, rhsAUFZUG)) {
                return false;
            }
        }
        {
            Boolean lhsGARAGE;
            lhsGARAGE = this.isGARAGE();
            Boolean rhsGARAGE;
            rhsGARAGE = that.isGARAGE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garage", lhsGARAGE), LocatorUtils.property(thatLocator, "garage", rhsGARAGE), lhsGARAGE, rhsGARAGE)) {
                return false;
            }
        }
        {
            Boolean lhsABSTELLPLATZ;
            lhsABSTELLPLATZ = this.isABSTELLPLATZ();
            Boolean rhsABSTELLPLATZ;
            rhsABSTELLPLATZ = that.isABSTELLPLATZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abstellplatz", lhsABSTELLPLATZ), LocatorUtils.property(thatLocator, "abstellplatz", rhsABSTELLPLATZ), lhsABSTELLPLATZ, rhsABSTELLPLATZ)) {
                return false;
            }
        }
        {
            Boolean lhsGRUENFLAECHE;
            lhsGRUENFLAECHE = this.isGRUENFLAECHE();
            Boolean rhsGRUENFLAECHE;
            rhsGRUENFLAECHE = that.isGRUENFLAECHE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gruenflaeche", lhsGRUENFLAECHE), LocatorUtils.property(thatLocator, "gruenflaeche", rhsGRUENFLAECHE), lhsGRUENFLAECHE, rhsGRUENFLAECHE)) {
                return false;
            }
        }
        {
            Boolean lhsKELLER;
            lhsKELLER = this.isKELLER();
            Boolean rhsKELLER;
            rhsKELLER = that.isKELLER();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keller", lhsKELLER), LocatorUtils.property(thatLocator, "keller", rhsKELLER), lhsKELLER, rhsKELLER)) {
                return false;
            }
        }
        {
            Boolean lhsTERRASSE;
            lhsTERRASSE = this.isTERRASSE();
            Boolean rhsTERRASSE;
            rhsTERRASSE = that.isTERRASSE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terrasse", lhsTERRASSE), LocatorUtils.property(thatLocator, "terrasse", rhsTERRASSE), lhsTERRASSE, rhsTERRASSE)) {
                return false;
            }
        }
        {
            Boolean lhsLOGGIA;
            lhsLOGGIA = this.isLOGGIA();
            Boolean rhsLOGGIA;
            rhsLOGGIA = that.isLOGGIA();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loggia", lhsLOGGIA), LocatorUtils.property(thatLocator, "loggia", rhsLOGGIA), lhsLOGGIA, rhsLOGGIA)) {
                return false;
            }
        }
        {
            Boolean lhsBALKON;
            lhsBALKON = this.isBALKON();
            Boolean rhsBALKON;
            rhsBALKON = that.isBALKON();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balkon", lhsBALKON), LocatorUtils.property(thatLocator, "balkon", rhsBALKON), lhsBALKON, rhsBALKON)) {
                return false;
            }
        }
        {
            Boolean lhsDACHBODEN;
            lhsDACHBODEN = this.isDACHBODEN();
            Boolean rhsDACHBODEN;
            rhsDACHBODEN = that.isDACHBODEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dachboden", lhsDACHBODEN), LocatorUtils.property(thatLocator, "dachboden", rhsDACHBODEN), lhsDACHBODEN, rhsDACHBODEN)) {
                return false;
            }
        }
        {
            HeatingType lhsHEIZUNG;
            lhsHEIZUNG = this.getHEIZUNG();
            HeatingType rhsHEIZUNG;
            rhsHEIZUNG = that.getHEIZUNG();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizung", lhsHEIZUNG), LocatorUtils.property(thatLocator, "heizung", rhsHEIZUNG), lhsHEIZUNG, rhsHEIZUNG)) {
                return false;
            }
        }
        {
            EnergyStandard lhsKLIMAHAUS;
            lhsKLIMAHAUS = this.getKLIMAHAUS();
            EnergyStandard rhsKLIMAHAUS;
            rhsKLIMAHAUS = that.getKLIMAHAUS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "klimahaus", lhsKLIMAHAUS), LocatorUtils.property(thatLocator, "klimahaus", rhsKLIMAHAUS), lhsKLIMAHAUS, rhsKLIMAHAUS)) {
                return false;
            }
        }
        {
            String lhsUEBERGABEZEITPUNKT;
            lhsUEBERGABEZEITPUNKT = this.getUEBERGABEZEITPUNKT();
            String rhsUEBERGABEZEITPUNKT;
            rhsUEBERGABEZEITPUNKT = that.getUEBERGABEZEITPUNKT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uebergabezeitpunkt", lhsUEBERGABEZEITPUNKT), LocatorUtils.property(thatLocator, "uebergabezeitpunkt", rhsUEBERGABEZEITPUNKT), lhsUEBERGABEZEITPUNKT, rhsUEBERGABEZEITPUNKT)) {
                return false;
            }
        }
        {
            String lhsBAUJAHR;
            lhsBAUJAHR = this.getBAUJAHR();
            String rhsBAUJAHR;
            rhsBAUJAHR = that.getBAUJAHR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baujahr", lhsBAUJAHR), LocatorUtils.property(thatLocator, "baujahr", rhsBAUJAHR), lhsBAUJAHR, rhsBAUJAHR)) {
                return false;
            }
        }
        {
            String lhsINFODE;
            lhsINFODE = this.getINFODE();
            String rhsINFODE;
            rhsINFODE = that.getINFODE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "infode", lhsINFODE), LocatorUtils.property(thatLocator, "infode", rhsINFODE), lhsINFODE, rhsINFODE)) {
                return false;
            }
        }
        {
            String lhsINFOIT;
            lhsINFOIT = this.getINFOIT();
            String rhsINFOIT;
            rhsINFOIT = that.getINFOIT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "infoit", lhsINFOIT), LocatorUtils.property(thatLocator, "infoit", rhsINFOIT), lhsINFOIT, rhsINFOIT)) {
                return false;
            }
        }
        {
            String lhsBILD1;
            lhsBILD1 = this.getBILD1();
            String rhsBILD1;
            rhsBILD1 = that.getBILD1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild1", lhsBILD1), LocatorUtils.property(thatLocator, "bild1", rhsBILD1), lhsBILD1, rhsBILD1)) {
                return false;
            }
        }
        {
            String lhsBILD2;
            lhsBILD2 = this.getBILD2();
            String rhsBILD2;
            rhsBILD2 = that.getBILD2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild2", lhsBILD2), LocatorUtils.property(thatLocator, "bild2", rhsBILD2), lhsBILD2, rhsBILD2)) {
                return false;
            }
        }
        {
            String lhsBILD3;
            lhsBILD3 = this.getBILD3();
            String rhsBILD3;
            rhsBILD3 = that.getBILD3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild3", lhsBILD3), LocatorUtils.property(thatLocator, "bild3", rhsBILD3), lhsBILD3, rhsBILD3)) {
                return false;
            }
        }
        {
            String lhsBILD4;
            lhsBILD4 = this.getBILD4();
            String rhsBILD4;
            rhsBILD4 = that.getBILD4();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild4", lhsBILD4), LocatorUtils.property(thatLocator, "bild4", rhsBILD4), lhsBILD4, rhsBILD4)) {
                return false;
            }
        }
        {
            String lhsBILD5;
            lhsBILD5 = this.getBILD5();
            String rhsBILD5;
            rhsBILD5 = that.getBILD5();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild5", lhsBILD5), LocatorUtils.property(thatLocator, "bild5", rhsBILD5), lhsBILD5, rhsBILD5)) {
                return false;
            }
        }
        {
            String lhsBILD6;
            lhsBILD6 = this.getBILD6();
            String rhsBILD6;
            rhsBILD6 = that.getBILD6();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild6", lhsBILD6), LocatorUtils.property(thatLocator, "bild6", rhsBILD6), lhsBILD6, rhsBILD6)) {
                return false;
            }
        }
        {
            String lhsBILD7;
            lhsBILD7 = this.getBILD7();
            String rhsBILD7;
            rhsBILD7 = that.getBILD7();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild7", lhsBILD7), LocatorUtils.property(thatLocator, "bild7", rhsBILD7), lhsBILD7, rhsBILD7)) {
                return false;
            }
        }
        {
            String lhsBILD8;
            lhsBILD8 = this.getBILD8();
            String rhsBILD8;
            rhsBILD8 = that.getBILD8();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild8", lhsBILD8), LocatorUtils.property(thatLocator, "bild8", rhsBILD8), lhsBILD8, rhsBILD8)) {
                return false;
            }
        }
        {
            String lhsBILD9;
            lhsBILD9 = this.getBILD9();
            String rhsBILD9;
            rhsBILD9 = that.getBILD9();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild9", lhsBILD9), LocatorUtils.property(thatLocator, "bild9", rhsBILD9), lhsBILD9, rhsBILD9)) {
                return false;
            }
        }
        {
            String lhsBILD10;
            lhsBILD10 = this.getBILD10();
            String rhsBILD10;
            rhsBILD10 = that.getBILD10();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bild10", lhsBILD10), LocatorUtils.property(thatLocator, "bild10", rhsBILD10), lhsBILD10, rhsBILD10)) {
                return false;
            }
        }
        {
            String lhsDOWNLOAD1;
            lhsDOWNLOAD1 = this.getDOWNLOAD1();
            String rhsDOWNLOAD1;
            rhsDOWNLOAD1 = that.getDOWNLOAD1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "download1", lhsDOWNLOAD1), LocatorUtils.property(thatLocator, "download1", rhsDOWNLOAD1), lhsDOWNLOAD1, rhsDOWNLOAD1)) {
                return false;
            }
        }
        {
            String lhsDOWNLOAD2;
            lhsDOWNLOAD2 = this.getDOWNLOAD2();
            String rhsDOWNLOAD2;
            rhsDOWNLOAD2 = that.getDOWNLOAD2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "download2", lhsDOWNLOAD2), LocatorUtils.property(thatLocator, "download2", rhsDOWNLOAD2), lhsDOWNLOAD2, rhsDOWNLOAD2)) {
                return false;
            }
        }
        {
            String lhsDOWNLOAD3;
            lhsDOWNLOAD3 = this.getDOWNLOAD3();
            String rhsDOWNLOAD3;
            rhsDOWNLOAD3 = that.getDOWNLOAD3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "download3", lhsDOWNLOAD3), LocatorUtils.property(thatLocator, "download3", rhsDOWNLOAD3), lhsDOWNLOAD3, rhsDOWNLOAD3)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
