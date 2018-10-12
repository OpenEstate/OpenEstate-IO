
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * Java class for &lt;geo&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "plz",
    "ort",
    "geokoordinaten",
    "strasse",
    "hausnummer",
    "bundesland",
    "land",
    "gemeindecode",
    "flur",
    "flurstueck",
    "gemarkung",
    "etage",
    "anzahlEtagen",
    "lageImBau",
    "wohnungsnr",
    "lageGebiet",
    "regionalerZusatz",
    "kartenMakro",
    "kartenMikro",
    "virtuelletour",
    "luftbildern",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "geo")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
public class Geo implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String plz;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String ort;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Geokoordinaten geokoordinaten;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String strasse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String hausnummer;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String bundesland;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Land land;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String gemeindecode;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String flur;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String flurstueck;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String gemarkung;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger etage;
    @XmlElement(name = "anzahl_etagen", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger anzahlEtagen;
    @XmlElement(name = "lage_im_bau")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected LageImBau lageImBau;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String wohnungsnr;
    @XmlElement(name = "lage_gebiet")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected LageGebiet lageGebiet;
    @XmlElement(name = "regionaler_zusatz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String regionalerZusatz;
    @XmlElement(name = "karten_makro")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean kartenMakro;
    @XmlElement(name = "karten_mikro")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean kartenMikro;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean virtuelletour;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean luftbildern;
    @XmlElement(name = "user_defined_simplefield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the plz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getPlz() {
        return plz;
    }

    /**
     * Sets the value of the plz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setPlz(String value) {
        this.plz = value;
    }

    /**
     * Gets the value of the ort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getOrt() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Gets the value of the geokoordinaten property.
     * 
     * @return
     *     possible object is
     *     {@link Geokoordinaten }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Geokoordinaten getGeokoordinaten() {
        return geokoordinaten;
    }

    /**
     * Sets the value of the geokoordinaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geokoordinaten }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setGeokoordinaten(Geokoordinaten value) {
        this.geokoordinaten = value;
    }

    /**
     * Gets the value of the strasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getStrasse() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setStrasse(String value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getHausnummer() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setHausnummer(String value) {
        this.hausnummer = value;
    }

    /**
     * Gets the value of the bundesland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getBundesland() {
        return bundesland;
    }

    /**
     * Sets the value of the bundesland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setBundesland(String value) {
        this.bundesland = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link Land }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Land getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link Land }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setLand(Land value) {
        this.land = value;
    }

    /**
     * Gets the value of the gemeindecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getGemeindecode() {
        return gemeindecode;
    }

    /**
     * Sets the value of the gemeindecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setGemeindecode(String value) {
        this.gemeindecode = value;
    }

    /**
     * Gets the value of the flur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getFlur() {
        return flur;
    }

    /**
     * Sets the value of the flur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setFlur(String value) {
        this.flur = value;
    }

    /**
     * Gets the value of the flurstueck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getFlurstueck() {
        return flurstueck;
    }

    /**
     * Sets the value of the flurstueck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setFlurstueck(String value) {
        this.flurstueck = value;
    }

    /**
     * Gets the value of the gemarkung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getGemarkung() {
        return gemarkung;
    }

    /**
     * Sets the value of the gemarkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setGemarkung(String value) {
        this.gemarkung = value;
    }

    /**
     * Gets the value of the etage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getEtage() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setEtage(BigInteger value) {
        this.etage = value;
    }

    /**
     * Gets the value of the anzahlEtagen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getAnzahlEtagen() {
        return anzahlEtagen;
    }

    /**
     * Sets the value of the anzahlEtagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setAnzahlEtagen(BigInteger value) {
        this.anzahlEtagen = value;
    }

    /**
     * Gets the value of the lageImBau property.
     * 
     * @return
     *     possible object is
     *     {@link LageImBau }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public LageImBau getLageImBau() {
        return lageImBau;
    }

    /**
     * Sets the value of the lageImBau property.
     * 
     * @param value
     *     allowed object is
     *     {@link LageImBau }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setLageImBau(LageImBau value) {
        this.lageImBau = value;
    }

    /**
     * Gets the value of the wohnungsnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getWohnungsnr() {
        return wohnungsnr;
    }

    /**
     * Sets the value of the wohnungsnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setWohnungsnr(String value) {
        this.wohnungsnr = value;
    }

    /**
     * Gets the value of the lageGebiet property.
     * 
     * @return
     *     possible object is
     *     {@link LageGebiet }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public LageGebiet getLageGebiet() {
        return lageGebiet;
    }

    /**
     * Sets the value of the lageGebiet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LageGebiet }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setLageGebiet(LageGebiet value) {
        this.lageGebiet = value;
    }

    /**
     * Gets the value of the regionalerZusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getRegionalerZusatz() {
        return regionalerZusatz;
    }

    /**
     * Sets the value of the regionalerZusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setRegionalerZusatz(String value) {
        this.regionalerZusatz = value;
    }

    /**
     * Gets the value of the kartenMakro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getKartenMakro() {
        return kartenMakro;
    }

    /**
     * Sets the value of the kartenMakro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setKartenMakro(Boolean value) {
        this.kartenMakro = value;
    }

    /**
     * Gets the value of the kartenMikro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getKartenMikro() {
        return kartenMikro;
    }

    /**
     * Sets the value of the kartenMikro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setKartenMikro(Boolean value) {
        this.kartenMikro = value;
    }

    /**
     * Gets the value of the virtuelletour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getVirtuelletour() {
        return virtuelletour;
    }

    /**
     * Sets the value of the virtuelletour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setVirtuelletour(Boolean value) {
        this.virtuelletour = value;
    }

    /**
     * Gets the value of the luftbildern property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getLuftbildern() {
        return luftbildern;
    }

    /**
     * Sets the value of the luftbildern property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setLuftbildern(Boolean value) {
        this.luftbildern = value;
    }

    /**
     * Gets the value of the userDefinedSimplefield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedSimplefield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedSimplefield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedSimplefield }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public List<UserDefinedSimplefield> getUserDefinedSimplefield() {
        if (userDefinedSimplefield == null) {
            userDefinedSimplefield = new ArrayList<UserDefinedSimplefield>();
        }
        return this.userDefinedSimplefield;
    }

    /**
     * Gets the value of the userDefinedAnyfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedAnyfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedAnyfield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedAnyfield }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public List<UserDefinedAnyfield> getUserDefinedAnyfield() {
        if (userDefinedAnyfield == null) {
            userDefinedAnyfield = new ArrayList<UserDefinedAnyfield>();
        }
        return this.userDefinedAnyfield;
    }

    /**
     * Gets the value of the userDefinedExtend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedExtend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedExtend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedExtend }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public List<UserDefinedExtend> getUserDefinedExtend() {
        if (userDefinedExtend == null) {
            userDefinedExtend = new ArrayList<UserDefinedExtend>();
        }
        return this.userDefinedExtend;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String thePlz;
            thePlz = this.getPlz();
            strategy.appendField(locator, this, "plz", buffer, thePlz, (this.plz!= null));
        }
        {
            String theOrt;
            theOrt = this.getOrt();
            strategy.appendField(locator, this, "ort", buffer, theOrt, (this.ort!= null));
        }
        {
            Geokoordinaten theGeokoordinaten;
            theGeokoordinaten = this.getGeokoordinaten();
            strategy.appendField(locator, this, "geokoordinaten", buffer, theGeokoordinaten, (this.geokoordinaten!= null));
        }
        {
            String theStrasse;
            theStrasse = this.getStrasse();
            strategy.appendField(locator, this, "strasse", buffer, theStrasse, (this.strasse!= null));
        }
        {
            String theHausnummer;
            theHausnummer = this.getHausnummer();
            strategy.appendField(locator, this, "hausnummer", buffer, theHausnummer, (this.hausnummer!= null));
        }
        {
            String theBundesland;
            theBundesland = this.getBundesland();
            strategy.appendField(locator, this, "bundesland", buffer, theBundesland, (this.bundesland!= null));
        }
        {
            Land theLand;
            theLand = this.getLand();
            strategy.appendField(locator, this, "land", buffer, theLand, (this.land!= null));
        }
        {
            String theGemeindecode;
            theGemeindecode = this.getGemeindecode();
            strategy.appendField(locator, this, "gemeindecode", buffer, theGemeindecode, (this.gemeindecode!= null));
        }
        {
            String theFlur;
            theFlur = this.getFlur();
            strategy.appendField(locator, this, "flur", buffer, theFlur, (this.flur!= null));
        }
        {
            String theFlurstueck;
            theFlurstueck = this.getFlurstueck();
            strategy.appendField(locator, this, "flurstueck", buffer, theFlurstueck, (this.flurstueck!= null));
        }
        {
            String theGemarkung;
            theGemarkung = this.getGemarkung();
            strategy.appendField(locator, this, "gemarkung", buffer, theGemarkung, (this.gemarkung!= null));
        }
        {
            BigInteger theEtage;
            theEtage = this.getEtage();
            strategy.appendField(locator, this, "etage", buffer, theEtage, (this.etage!= null));
        }
        {
            BigInteger theAnzahlEtagen;
            theAnzahlEtagen = this.getAnzahlEtagen();
            strategy.appendField(locator, this, "anzahlEtagen", buffer, theAnzahlEtagen, (this.anzahlEtagen!= null));
        }
        {
            LageImBau theLageImBau;
            theLageImBau = this.getLageImBau();
            strategy.appendField(locator, this, "lageImBau", buffer, theLageImBau, (this.lageImBau!= null));
        }
        {
            String theWohnungsnr;
            theWohnungsnr = this.getWohnungsnr();
            strategy.appendField(locator, this, "wohnungsnr", buffer, theWohnungsnr, (this.wohnungsnr!= null));
        }
        {
            LageGebiet theLageGebiet;
            theLageGebiet = this.getLageGebiet();
            strategy.appendField(locator, this, "lageGebiet", buffer, theLageGebiet, (this.lageGebiet!= null));
        }
        {
            String theRegionalerZusatz;
            theRegionalerZusatz = this.getRegionalerZusatz();
            strategy.appendField(locator, this, "regionalerZusatz", buffer, theRegionalerZusatz, (this.regionalerZusatz!= null));
        }
        {
            Boolean theKartenMakro;
            theKartenMakro = this.getKartenMakro();
            strategy.appendField(locator, this, "kartenMakro", buffer, theKartenMakro, (this.kartenMakro!= null));
        }
        {
            Boolean theKartenMikro;
            theKartenMikro = this.getKartenMikro();
            strategy.appendField(locator, this, "kartenMikro", buffer, theKartenMikro, (this.kartenMikro!= null));
        }
        {
            Boolean theVirtuelletour;
            theVirtuelletour = this.getVirtuelletour();
            strategy.appendField(locator, this, "virtuelletour", buffer, theVirtuelletour, (this.virtuelletour!= null));
        }
        {
            Boolean theLuftbildern;
            theLuftbildern = this.getLuftbildern();
            strategy.appendField(locator, this, "luftbildern", buffer, theLuftbildern, (this.luftbildern!= null));
        }
        {
            List<UserDefinedSimplefield> theUserDefinedSimplefield;
            theUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            strategy.appendField(locator, this, "userDefinedSimplefield", buffer, theUserDefinedSimplefield, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())));
        }
        {
            List<UserDefinedAnyfield> theUserDefinedAnyfield;
            theUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            strategy.appendField(locator, this, "userDefinedAnyfield", buffer, theUserDefinedAnyfield, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())));
        }
        {
            List<UserDefinedExtend> theUserDefinedExtend;
            theUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            strategy.appendField(locator, this, "userDefinedExtend", buffer, theUserDefinedExtend, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Geo) {
            final Geo copy = ((Geo) draftCopy);
            {
                Boolean plzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.plz!= null));
                if (plzShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePlz;
                    sourcePlz = this.getPlz();
                    String copyPlz = ((String) strategy.copy(LocatorUtils.property(locator, "plz", sourcePlz), sourcePlz, (this.plz!= null)));
                    copy.setPlz(copyPlz);
                } else {
                    if (plzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.plz = null;
                    }
                }
            }
            {
                Boolean ortShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ort!= null));
                if (ortShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOrt;
                    sourceOrt = this.getOrt();
                    String copyOrt = ((String) strategy.copy(LocatorUtils.property(locator, "ort", sourceOrt), sourceOrt, (this.ort!= null)));
                    copy.setOrt(copyOrt);
                } else {
                    if (ortShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ort = null;
                    }
                }
            }
            {
                Boolean geokoordinatenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geokoordinaten!= null));
                if (geokoordinatenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Geokoordinaten sourceGeokoordinaten;
                    sourceGeokoordinaten = this.getGeokoordinaten();
                    Geokoordinaten copyGeokoordinaten = ((Geokoordinaten) strategy.copy(LocatorUtils.property(locator, "geokoordinaten", sourceGeokoordinaten), sourceGeokoordinaten, (this.geokoordinaten!= null)));
                    copy.setGeokoordinaten(copyGeokoordinaten);
                } else {
                    if (geokoordinatenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geokoordinaten = null;
                    }
                }
            }
            {
                Boolean strasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.strasse!= null));
                if (strasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceStrasse;
                    sourceStrasse = this.getStrasse();
                    String copyStrasse = ((String) strategy.copy(LocatorUtils.property(locator, "strasse", sourceStrasse), sourceStrasse, (this.strasse!= null)));
                    copy.setStrasse(copyStrasse);
                } else {
                    if (strasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.strasse = null;
                    }
                }
            }
            {
                Boolean hausnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hausnummer!= null));
                if (hausnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHausnummer;
                    sourceHausnummer = this.getHausnummer();
                    String copyHausnummer = ((String) strategy.copy(LocatorUtils.property(locator, "hausnummer", sourceHausnummer), sourceHausnummer, (this.hausnummer!= null)));
                    copy.setHausnummer(copyHausnummer);
                } else {
                    if (hausnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hausnummer = null;
                    }
                }
            }
            {
                Boolean bundeslandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bundesland!= null));
                if (bundeslandShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBundesland;
                    sourceBundesland = this.getBundesland();
                    String copyBundesland = ((String) strategy.copy(LocatorUtils.property(locator, "bundesland", sourceBundesland), sourceBundesland, (this.bundesland!= null)));
                    copy.setBundesland(copyBundesland);
                } else {
                    if (bundeslandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bundesland = null;
                    }
                }
            }
            {
                Boolean landShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.land!= null));
                if (landShouldBeCopiedAndSet == Boolean.TRUE) {
                    Land sourceLand;
                    sourceLand = this.getLand();
                    Land copyLand = ((Land) strategy.copy(LocatorUtils.property(locator, "land", sourceLand), sourceLand, (this.land!= null)));
                    copy.setLand(copyLand);
                } else {
                    if (landShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.land = null;
                    }
                }
            }
            {
                Boolean gemeindecodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gemeindecode!= null));
                if (gemeindecodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGemeindecode;
                    sourceGemeindecode = this.getGemeindecode();
                    String copyGemeindecode = ((String) strategy.copy(LocatorUtils.property(locator, "gemeindecode", sourceGemeindecode), sourceGemeindecode, (this.gemeindecode!= null)));
                    copy.setGemeindecode(copyGemeindecode);
                } else {
                    if (gemeindecodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gemeindecode = null;
                    }
                }
            }
            {
                Boolean flurShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flur!= null));
                if (flurShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFlur;
                    sourceFlur = this.getFlur();
                    String copyFlur = ((String) strategy.copy(LocatorUtils.property(locator, "flur", sourceFlur), sourceFlur, (this.flur!= null)));
                    copy.setFlur(copyFlur);
                } else {
                    if (flurShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flur = null;
                    }
                }
            }
            {
                Boolean flurstueckShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flurstueck!= null));
                if (flurstueckShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFlurstueck;
                    sourceFlurstueck = this.getFlurstueck();
                    String copyFlurstueck = ((String) strategy.copy(LocatorUtils.property(locator, "flurstueck", sourceFlurstueck), sourceFlurstueck, (this.flurstueck!= null)));
                    copy.setFlurstueck(copyFlurstueck);
                } else {
                    if (flurstueckShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flurstueck = null;
                    }
                }
            }
            {
                Boolean gemarkungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gemarkung!= null));
                if (gemarkungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGemarkung;
                    sourceGemarkung = this.getGemarkung();
                    String copyGemarkung = ((String) strategy.copy(LocatorUtils.property(locator, "gemarkung", sourceGemarkung), sourceGemarkung, (this.gemarkung!= null)));
                    copy.setGemarkung(copyGemarkung);
                } else {
                    if (gemarkungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gemarkung = null;
                    }
                }
            }
            {
                Boolean etageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.etage!= null));
                if (etageShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceEtage;
                    sourceEtage = this.getEtage();
                    BigInteger copyEtage = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "etage", sourceEtage), sourceEtage, (this.etage!= null)));
                    copy.setEtage(copyEtage);
                } else {
                    if (etageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.etage = null;
                    }
                }
            }
            {
                Boolean anzahlEtagenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlEtagen!= null));
                if (anzahlEtagenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceAnzahlEtagen;
                    sourceAnzahlEtagen = this.getAnzahlEtagen();
                    BigInteger copyAnzahlEtagen = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "anzahlEtagen", sourceAnzahlEtagen), sourceAnzahlEtagen, (this.anzahlEtagen!= null)));
                    copy.setAnzahlEtagen(copyAnzahlEtagen);
                } else {
                    if (anzahlEtagenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlEtagen = null;
                    }
                }
            }
            {
                Boolean lageImBauShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lageImBau!= null));
                if (lageImBauShouldBeCopiedAndSet == Boolean.TRUE) {
                    LageImBau sourceLageImBau;
                    sourceLageImBau = this.getLageImBau();
                    LageImBau copyLageImBau = ((LageImBau) strategy.copy(LocatorUtils.property(locator, "lageImBau", sourceLageImBau), sourceLageImBau, (this.lageImBau!= null)));
                    copy.setLageImBau(copyLageImBau);
                } else {
                    if (lageImBauShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lageImBau = null;
                    }
                }
            }
            {
                Boolean wohnungsnrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wohnungsnr!= null));
                if (wohnungsnrShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceWohnungsnr;
                    sourceWohnungsnr = this.getWohnungsnr();
                    String copyWohnungsnr = ((String) strategy.copy(LocatorUtils.property(locator, "wohnungsnr", sourceWohnungsnr), sourceWohnungsnr, (this.wohnungsnr!= null)));
                    copy.setWohnungsnr(copyWohnungsnr);
                } else {
                    if (wohnungsnrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohnungsnr = null;
                    }
                }
            }
            {
                Boolean lageGebietShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lageGebiet!= null));
                if (lageGebietShouldBeCopiedAndSet == Boolean.TRUE) {
                    LageGebiet sourceLageGebiet;
                    sourceLageGebiet = this.getLageGebiet();
                    LageGebiet copyLageGebiet = ((LageGebiet) strategy.copy(LocatorUtils.property(locator, "lageGebiet", sourceLageGebiet), sourceLageGebiet, (this.lageGebiet!= null)));
                    copy.setLageGebiet(copyLageGebiet);
                } else {
                    if (lageGebietShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lageGebiet = null;
                    }
                }
            }
            {
                Boolean regionalerZusatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.regionalerZusatz!= null));
                if (regionalerZusatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRegionalerZusatz;
                    sourceRegionalerZusatz = this.getRegionalerZusatz();
                    String copyRegionalerZusatz = ((String) strategy.copy(LocatorUtils.property(locator, "regionalerZusatz", sourceRegionalerZusatz), sourceRegionalerZusatz, (this.regionalerZusatz!= null)));
                    copy.setRegionalerZusatz(copyRegionalerZusatz);
                } else {
                    if (regionalerZusatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.regionalerZusatz = null;
                    }
                }
            }
            {
                Boolean kartenMakroShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kartenMakro!= null));
                if (kartenMakroShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKartenMakro;
                    sourceKartenMakro = this.getKartenMakro();
                    Boolean copyKartenMakro = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kartenMakro", sourceKartenMakro), sourceKartenMakro, (this.kartenMakro!= null)));
                    copy.setKartenMakro(copyKartenMakro);
                } else {
                    if (kartenMakroShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kartenMakro = null;
                    }
                }
            }
            {
                Boolean kartenMikroShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kartenMikro!= null));
                if (kartenMikroShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKartenMikro;
                    sourceKartenMikro = this.getKartenMikro();
                    Boolean copyKartenMikro = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kartenMikro", sourceKartenMikro), sourceKartenMikro, (this.kartenMikro!= null)));
                    copy.setKartenMikro(copyKartenMikro);
                } else {
                    if (kartenMikroShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kartenMikro = null;
                    }
                }
            }
            {
                Boolean virtuelletourShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.virtuelletour!= null));
                if (virtuelletourShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceVirtuelletour;
                    sourceVirtuelletour = this.getVirtuelletour();
                    Boolean copyVirtuelletour = ((Boolean) strategy.copy(LocatorUtils.property(locator, "virtuelletour", sourceVirtuelletour), sourceVirtuelletour, (this.virtuelletour!= null)));
                    copy.setVirtuelletour(copyVirtuelletour);
                } else {
                    if (virtuelletourShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.virtuelletour = null;
                    }
                }
            }
            {
                Boolean luftbildernShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.luftbildern!= null));
                if (luftbildernShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceLuftbildern;
                    sourceLuftbildern = this.getLuftbildern();
                    Boolean copyLuftbildern = ((Boolean) strategy.copy(LocatorUtils.property(locator, "luftbildern", sourceLuftbildern), sourceLuftbildern, (this.luftbildern!= null)));
                    copy.setLuftbildern(copyLuftbildern);
                } else {
                    if (luftbildernShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.luftbildern = null;
                    }
                }
            }
            {
                Boolean userDefinedSimplefieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())));
                if (userDefinedSimplefieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UserDefinedSimplefield> sourceUserDefinedSimplefield;
                    sourceUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
                    @SuppressWarnings("unchecked")
                    List<UserDefinedSimplefield> copyUserDefinedSimplefield = ((List<UserDefinedSimplefield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedSimplefield", sourceUserDefinedSimplefield), sourceUserDefinedSimplefield, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))));
                    copy.userDefinedSimplefield = null;
                    if (copyUserDefinedSimplefield!= null) {
                        List<UserDefinedSimplefield> uniqueUserDefinedSimplefieldl = copy.getUserDefinedSimplefield();
                        uniqueUserDefinedSimplefieldl.addAll(copyUserDefinedSimplefield);
                    }
                } else {
                    if (userDefinedSimplefieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userDefinedSimplefield = null;
                    }
                }
            }
            {
                Boolean userDefinedAnyfieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())));
                if (userDefinedAnyfieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UserDefinedAnyfield> sourceUserDefinedAnyfield;
                    sourceUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
                    @SuppressWarnings("unchecked")
                    List<UserDefinedAnyfield> copyUserDefinedAnyfield = ((List<UserDefinedAnyfield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedAnyfield", sourceUserDefinedAnyfield), sourceUserDefinedAnyfield, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))));
                    copy.userDefinedAnyfield = null;
                    if (copyUserDefinedAnyfield!= null) {
                        List<UserDefinedAnyfield> uniqueUserDefinedAnyfieldl = copy.getUserDefinedAnyfield();
                        uniqueUserDefinedAnyfieldl.addAll(copyUserDefinedAnyfield);
                    }
                } else {
                    if (userDefinedAnyfieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userDefinedAnyfield = null;
                    }
                }
            }
            {
                Boolean userDefinedExtendShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())));
                if (userDefinedExtendShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UserDefinedExtend> sourceUserDefinedExtend;
                    sourceUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
                    @SuppressWarnings("unchecked")
                    List<UserDefinedExtend> copyUserDefinedExtend = ((List<UserDefinedExtend> ) strategy.copy(LocatorUtils.property(locator, "userDefinedExtend", sourceUserDefinedExtend), sourceUserDefinedExtend, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))));
                    copy.userDefinedExtend = null;
                    if (copyUserDefinedExtend!= null) {
                        List<UserDefinedExtend> uniqueUserDefinedExtendl = copy.getUserDefinedExtend();
                        uniqueUserDefinedExtendl.addAll(copyUserDefinedExtend);
                    }
                } else {
                    if (userDefinedExtendShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userDefinedExtend = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Geo();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Geo that = ((Geo) object);
        {
            String lhsPlz;
            lhsPlz = this.getPlz();
            String rhsPlz;
            rhsPlz = that.getPlz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plz", lhsPlz), LocatorUtils.property(thatLocator, "plz", rhsPlz), lhsPlz, rhsPlz, (this.plz!= null), (that.plz!= null))) {
                return false;
            }
        }
        {
            String lhsOrt;
            lhsOrt = this.getOrt();
            String rhsOrt;
            rhsOrt = that.getOrt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ort", lhsOrt), LocatorUtils.property(thatLocator, "ort", rhsOrt), lhsOrt, rhsOrt, (this.ort!= null), (that.ort!= null))) {
                return false;
            }
        }
        {
            Geokoordinaten lhsGeokoordinaten;
            lhsGeokoordinaten = this.getGeokoordinaten();
            Geokoordinaten rhsGeokoordinaten;
            rhsGeokoordinaten = that.getGeokoordinaten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geokoordinaten", lhsGeokoordinaten), LocatorUtils.property(thatLocator, "geokoordinaten", rhsGeokoordinaten), lhsGeokoordinaten, rhsGeokoordinaten, (this.geokoordinaten!= null), (that.geokoordinaten!= null))) {
                return false;
            }
        }
        {
            String lhsStrasse;
            lhsStrasse = this.getStrasse();
            String rhsStrasse;
            rhsStrasse = that.getStrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strasse", lhsStrasse), LocatorUtils.property(thatLocator, "strasse", rhsStrasse), lhsStrasse, rhsStrasse, (this.strasse!= null), (that.strasse!= null))) {
                return false;
            }
        }
        {
            String lhsHausnummer;
            lhsHausnummer = this.getHausnummer();
            String rhsHausnummer;
            rhsHausnummer = that.getHausnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hausnummer", lhsHausnummer), LocatorUtils.property(thatLocator, "hausnummer", rhsHausnummer), lhsHausnummer, rhsHausnummer, (this.hausnummer!= null), (that.hausnummer!= null))) {
                return false;
            }
        }
        {
            String lhsBundesland;
            lhsBundesland = this.getBundesland();
            String rhsBundesland;
            rhsBundesland = that.getBundesland();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bundesland", lhsBundesland), LocatorUtils.property(thatLocator, "bundesland", rhsBundesland), lhsBundesland, rhsBundesland, (this.bundesland!= null), (that.bundesland!= null))) {
                return false;
            }
        }
        {
            Land lhsLand;
            lhsLand = this.getLand();
            Land rhsLand;
            rhsLand = that.getLand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "land", lhsLand), LocatorUtils.property(thatLocator, "land", rhsLand), lhsLand, rhsLand, (this.land!= null), (that.land!= null))) {
                return false;
            }
        }
        {
            String lhsGemeindecode;
            lhsGemeindecode = this.getGemeindecode();
            String rhsGemeindecode;
            rhsGemeindecode = that.getGemeindecode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gemeindecode", lhsGemeindecode), LocatorUtils.property(thatLocator, "gemeindecode", rhsGemeindecode), lhsGemeindecode, rhsGemeindecode, (this.gemeindecode!= null), (that.gemeindecode!= null))) {
                return false;
            }
        }
        {
            String lhsFlur;
            lhsFlur = this.getFlur();
            String rhsFlur;
            rhsFlur = that.getFlur();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flur", lhsFlur), LocatorUtils.property(thatLocator, "flur", rhsFlur), lhsFlur, rhsFlur, (this.flur!= null), (that.flur!= null))) {
                return false;
            }
        }
        {
            String lhsFlurstueck;
            lhsFlurstueck = this.getFlurstueck();
            String rhsFlurstueck;
            rhsFlurstueck = that.getFlurstueck();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flurstueck", lhsFlurstueck), LocatorUtils.property(thatLocator, "flurstueck", rhsFlurstueck), lhsFlurstueck, rhsFlurstueck, (this.flurstueck!= null), (that.flurstueck!= null))) {
                return false;
            }
        }
        {
            String lhsGemarkung;
            lhsGemarkung = this.getGemarkung();
            String rhsGemarkung;
            rhsGemarkung = that.getGemarkung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gemarkung", lhsGemarkung), LocatorUtils.property(thatLocator, "gemarkung", rhsGemarkung), lhsGemarkung, rhsGemarkung, (this.gemarkung!= null), (that.gemarkung!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsEtage;
            lhsEtage = this.getEtage();
            BigInteger rhsEtage;
            rhsEtage = that.getEtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etage", lhsEtage), LocatorUtils.property(thatLocator, "etage", rhsEtage), lhsEtage, rhsEtage, (this.etage!= null), (that.etage!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsAnzahlEtagen;
            lhsAnzahlEtagen = this.getAnzahlEtagen();
            BigInteger rhsAnzahlEtagen;
            rhsAnzahlEtagen = that.getAnzahlEtagen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlEtagen", lhsAnzahlEtagen), LocatorUtils.property(thatLocator, "anzahlEtagen", rhsAnzahlEtagen), lhsAnzahlEtagen, rhsAnzahlEtagen, (this.anzahlEtagen!= null), (that.anzahlEtagen!= null))) {
                return false;
            }
        }
        {
            LageImBau lhsLageImBau;
            lhsLageImBau = this.getLageImBau();
            LageImBau rhsLageImBau;
            rhsLageImBau = that.getLageImBau();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lageImBau", lhsLageImBau), LocatorUtils.property(thatLocator, "lageImBau", rhsLageImBau), lhsLageImBau, rhsLageImBau, (this.lageImBau!= null), (that.lageImBau!= null))) {
                return false;
            }
        }
        {
            String lhsWohnungsnr;
            lhsWohnungsnr = this.getWohnungsnr();
            String rhsWohnungsnr;
            rhsWohnungsnr = that.getWohnungsnr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnungsnr", lhsWohnungsnr), LocatorUtils.property(thatLocator, "wohnungsnr", rhsWohnungsnr), lhsWohnungsnr, rhsWohnungsnr, (this.wohnungsnr!= null), (that.wohnungsnr!= null))) {
                return false;
            }
        }
        {
            LageGebiet lhsLageGebiet;
            lhsLageGebiet = this.getLageGebiet();
            LageGebiet rhsLageGebiet;
            rhsLageGebiet = that.getLageGebiet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lageGebiet", lhsLageGebiet), LocatorUtils.property(thatLocator, "lageGebiet", rhsLageGebiet), lhsLageGebiet, rhsLageGebiet, (this.lageGebiet!= null), (that.lageGebiet!= null))) {
                return false;
            }
        }
        {
            String lhsRegionalerZusatz;
            lhsRegionalerZusatz = this.getRegionalerZusatz();
            String rhsRegionalerZusatz;
            rhsRegionalerZusatz = that.getRegionalerZusatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionalerZusatz", lhsRegionalerZusatz), LocatorUtils.property(thatLocator, "regionalerZusatz", rhsRegionalerZusatz), lhsRegionalerZusatz, rhsRegionalerZusatz, (this.regionalerZusatz!= null), (that.regionalerZusatz!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKartenMakro;
            lhsKartenMakro = this.getKartenMakro();
            Boolean rhsKartenMakro;
            rhsKartenMakro = that.getKartenMakro();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kartenMakro", lhsKartenMakro), LocatorUtils.property(thatLocator, "kartenMakro", rhsKartenMakro), lhsKartenMakro, rhsKartenMakro, (this.kartenMakro!= null), (that.kartenMakro!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKartenMikro;
            lhsKartenMikro = this.getKartenMikro();
            Boolean rhsKartenMikro;
            rhsKartenMikro = that.getKartenMikro();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kartenMikro", lhsKartenMikro), LocatorUtils.property(thatLocator, "kartenMikro", rhsKartenMikro), lhsKartenMikro, rhsKartenMikro, (this.kartenMikro!= null), (that.kartenMikro!= null))) {
                return false;
            }
        }
        {
            Boolean lhsVirtuelletour;
            lhsVirtuelletour = this.getVirtuelletour();
            Boolean rhsVirtuelletour;
            rhsVirtuelletour = that.getVirtuelletour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "virtuelletour", lhsVirtuelletour), LocatorUtils.property(thatLocator, "virtuelletour", rhsVirtuelletour), lhsVirtuelletour, rhsVirtuelletour, (this.virtuelletour!= null), (that.virtuelletour!= null))) {
                return false;
            }
        }
        {
            Boolean lhsLuftbildern;
            lhsLuftbildern = this.getLuftbildern();
            Boolean rhsLuftbildern;
            rhsLuftbildern = that.getLuftbildern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "luftbildern", lhsLuftbildern), LocatorUtils.property(thatLocator, "luftbildern", rhsLuftbildern), lhsLuftbildern, rhsLuftbildern, (this.luftbildern!= null), (that.luftbildern!= null))) {
                return false;
            }
        }
        {
            List<UserDefinedSimplefield> lhsUserDefinedSimplefield;
            lhsUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            List<UserDefinedSimplefield> rhsUserDefinedSimplefield;
            rhsUserDefinedSimplefield = (((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty()))?that.getUserDefinedSimplefield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedSimplefield", lhsUserDefinedSimplefield), LocatorUtils.property(thatLocator, "userDefinedSimplefield", rhsUserDefinedSimplefield), lhsUserDefinedSimplefield, rhsUserDefinedSimplefield, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())), ((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty())))) {
                return false;
            }
        }
        {
            List<UserDefinedAnyfield> lhsUserDefinedAnyfield;
            lhsUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            List<UserDefinedAnyfield> rhsUserDefinedAnyfield;
            rhsUserDefinedAnyfield = (((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty()))?that.getUserDefinedAnyfield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedAnyfield", lhsUserDefinedAnyfield), LocatorUtils.property(thatLocator, "userDefinedAnyfield", rhsUserDefinedAnyfield), lhsUserDefinedAnyfield, rhsUserDefinedAnyfield, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())), ((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty())))) {
                return false;
            }
        }
        {
            List<UserDefinedExtend> lhsUserDefinedExtend;
            lhsUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            List<UserDefinedExtend> rhsUserDefinedExtend;
            rhsUserDefinedExtend = (((that.userDefinedExtend!= null)&&(!that.userDefinedExtend.isEmpty()))?that.getUserDefinedExtend():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedExtend", lhsUserDefinedExtend), LocatorUtils.property(thatLocator, "userDefinedExtend", rhsUserDefinedExtend), lhsUserDefinedExtend, rhsUserDefinedExtend, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())), ((that.userDefinedExtend!= null)&&(!that.userDefinedExtend.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
