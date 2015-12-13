
package org.openestate.io.openimmo.xml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
public class Geo
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected String plz;
    protected String ort;
    protected Geokoordinaten geokoordinaten;
    protected String strasse;
    protected String hausnummer;
    protected String bundesland;
    protected Land land;
    protected String gemeindecode;
    protected String flur;
    protected String flurstueck;
    protected String gemarkung;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected BigInteger etage;
    @XmlElement(name = "anzahl_etagen", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected BigInteger anzahlEtagen;
    @XmlElement(name = "lage_im_bau")
    protected LageImBau lageImBau;
    protected String wohnungsnr;
    @XmlElement(name = "lage_gebiet")
    protected LageGebiet lageGebiet;
    @XmlElement(name = "regionaler_zusatz")
    protected String regionalerZusatz;
    @XmlElement(name = "karten_makro")
    protected Boolean kartenMakro;
    @XmlElement(name = "karten_mikro")
    protected Boolean kartenMikro;
    protected Boolean virtuelletour;
    protected Boolean luftbildern;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the plz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public Boolean isKartenMakro() {
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
    public Boolean isKartenMikro() {
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
    public Boolean isVirtuelletour() {
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
    public Boolean isLuftbildern() {
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
    public List<UserDefinedExtend> getUserDefinedExtend() {
        if (userDefinedExtend == null) {
            userDefinedExtend = new ArrayList<UserDefinedExtend>();
        }
        return this.userDefinedExtend;
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
            String thePlz;
            thePlz = this.getPlz();
            strategy.appendField(locator, this, "plz", buffer, thePlz);
        }
        {
            String theOrt;
            theOrt = this.getOrt();
            strategy.appendField(locator, this, "ort", buffer, theOrt);
        }
        {
            Geokoordinaten theGeokoordinaten;
            theGeokoordinaten = this.getGeokoordinaten();
            strategy.appendField(locator, this, "geokoordinaten", buffer, theGeokoordinaten);
        }
        {
            String theStrasse;
            theStrasse = this.getStrasse();
            strategy.appendField(locator, this, "strasse", buffer, theStrasse);
        }
        {
            String theHausnummer;
            theHausnummer = this.getHausnummer();
            strategy.appendField(locator, this, "hausnummer", buffer, theHausnummer);
        }
        {
            String theBundesland;
            theBundesland = this.getBundesland();
            strategy.appendField(locator, this, "bundesland", buffer, theBundesland);
        }
        {
            Land theLand;
            theLand = this.getLand();
            strategy.appendField(locator, this, "land", buffer, theLand);
        }
        {
            String theGemeindecode;
            theGemeindecode = this.getGemeindecode();
            strategy.appendField(locator, this, "gemeindecode", buffer, theGemeindecode);
        }
        {
            String theFlur;
            theFlur = this.getFlur();
            strategy.appendField(locator, this, "flur", buffer, theFlur);
        }
        {
            String theFlurstueck;
            theFlurstueck = this.getFlurstueck();
            strategy.appendField(locator, this, "flurstueck", buffer, theFlurstueck);
        }
        {
            String theGemarkung;
            theGemarkung = this.getGemarkung();
            strategy.appendField(locator, this, "gemarkung", buffer, theGemarkung);
        }
        {
            BigInteger theEtage;
            theEtage = this.getEtage();
            strategy.appendField(locator, this, "etage", buffer, theEtage);
        }
        {
            BigInteger theAnzahlEtagen;
            theAnzahlEtagen = this.getAnzahlEtagen();
            strategy.appendField(locator, this, "anzahlEtagen", buffer, theAnzahlEtagen);
        }
        {
            LageImBau theLageImBau;
            theLageImBau = this.getLageImBau();
            strategy.appendField(locator, this, "lageImBau", buffer, theLageImBau);
        }
        {
            String theWohnungsnr;
            theWohnungsnr = this.getWohnungsnr();
            strategy.appendField(locator, this, "wohnungsnr", buffer, theWohnungsnr);
        }
        {
            LageGebiet theLageGebiet;
            theLageGebiet = this.getLageGebiet();
            strategy.appendField(locator, this, "lageGebiet", buffer, theLageGebiet);
        }
        {
            String theRegionalerZusatz;
            theRegionalerZusatz = this.getRegionalerZusatz();
            strategy.appendField(locator, this, "regionalerZusatz", buffer, theRegionalerZusatz);
        }
        {
            Boolean theKartenMakro;
            theKartenMakro = this.isKartenMakro();
            strategy.appendField(locator, this, "kartenMakro", buffer, theKartenMakro);
        }
        {
            Boolean theKartenMikro;
            theKartenMikro = this.isKartenMikro();
            strategy.appendField(locator, this, "kartenMikro", buffer, theKartenMikro);
        }
        {
            Boolean theVirtuelletour;
            theVirtuelletour = this.isVirtuelletour();
            strategy.appendField(locator, this, "virtuelletour", buffer, theVirtuelletour);
        }
        {
            Boolean theLuftbildern;
            theLuftbildern = this.isLuftbildern();
            strategy.appendField(locator, this, "luftbildern", buffer, theLuftbildern);
        }
        {
            List<UserDefinedSimplefield> theUserDefinedSimplefield;
            theUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            strategy.appendField(locator, this, "userDefinedSimplefield", buffer, theUserDefinedSimplefield);
        }
        {
            List<UserDefinedAnyfield> theUserDefinedAnyfield;
            theUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            strategy.appendField(locator, this, "userDefinedAnyfield", buffer, theUserDefinedAnyfield);
        }
        {
            List<UserDefinedExtend> theUserDefinedExtend;
            theUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            strategy.appendField(locator, this, "userDefinedExtend", buffer, theUserDefinedExtend);
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
        if (draftCopy instanceof Geo) {
            final Geo copy = ((Geo) draftCopy);
            if (this.plz!= null) {
                String sourcePlz;
                sourcePlz = this.getPlz();
                String copyPlz = ((String) strategy.copy(LocatorUtils.property(locator, "plz", sourcePlz), sourcePlz));
                copy.setPlz(copyPlz);
            } else {
                copy.plz = null;
            }
            if (this.ort!= null) {
                String sourceOrt;
                sourceOrt = this.getOrt();
                String copyOrt = ((String) strategy.copy(LocatorUtils.property(locator, "ort", sourceOrt), sourceOrt));
                copy.setOrt(copyOrt);
            } else {
                copy.ort = null;
            }
            if (this.geokoordinaten!= null) {
                Geokoordinaten sourceGeokoordinaten;
                sourceGeokoordinaten = this.getGeokoordinaten();
                Geokoordinaten copyGeokoordinaten = ((Geokoordinaten) strategy.copy(LocatorUtils.property(locator, "geokoordinaten", sourceGeokoordinaten), sourceGeokoordinaten));
                copy.setGeokoordinaten(copyGeokoordinaten);
            } else {
                copy.geokoordinaten = null;
            }
            if (this.strasse!= null) {
                String sourceStrasse;
                sourceStrasse = this.getStrasse();
                String copyStrasse = ((String) strategy.copy(LocatorUtils.property(locator, "strasse", sourceStrasse), sourceStrasse));
                copy.setStrasse(copyStrasse);
            } else {
                copy.strasse = null;
            }
            if (this.hausnummer!= null) {
                String sourceHausnummer;
                sourceHausnummer = this.getHausnummer();
                String copyHausnummer = ((String) strategy.copy(LocatorUtils.property(locator, "hausnummer", sourceHausnummer), sourceHausnummer));
                copy.setHausnummer(copyHausnummer);
            } else {
                copy.hausnummer = null;
            }
            if (this.bundesland!= null) {
                String sourceBundesland;
                sourceBundesland = this.getBundesland();
                String copyBundesland = ((String) strategy.copy(LocatorUtils.property(locator, "bundesland", sourceBundesland), sourceBundesland));
                copy.setBundesland(copyBundesland);
            } else {
                copy.bundesland = null;
            }
            if (this.land!= null) {
                Land sourceLand;
                sourceLand = this.getLand();
                Land copyLand = ((Land) strategy.copy(LocatorUtils.property(locator, "land", sourceLand), sourceLand));
                copy.setLand(copyLand);
            } else {
                copy.land = null;
            }
            if (this.gemeindecode!= null) {
                String sourceGemeindecode;
                sourceGemeindecode = this.getGemeindecode();
                String copyGemeindecode = ((String) strategy.copy(LocatorUtils.property(locator, "gemeindecode", sourceGemeindecode), sourceGemeindecode));
                copy.setGemeindecode(copyGemeindecode);
            } else {
                copy.gemeindecode = null;
            }
            if (this.flur!= null) {
                String sourceFlur;
                sourceFlur = this.getFlur();
                String copyFlur = ((String) strategy.copy(LocatorUtils.property(locator, "flur", sourceFlur), sourceFlur));
                copy.setFlur(copyFlur);
            } else {
                copy.flur = null;
            }
            if (this.flurstueck!= null) {
                String sourceFlurstueck;
                sourceFlurstueck = this.getFlurstueck();
                String copyFlurstueck = ((String) strategy.copy(LocatorUtils.property(locator, "flurstueck", sourceFlurstueck), sourceFlurstueck));
                copy.setFlurstueck(copyFlurstueck);
            } else {
                copy.flurstueck = null;
            }
            if (this.gemarkung!= null) {
                String sourceGemarkung;
                sourceGemarkung = this.getGemarkung();
                String copyGemarkung = ((String) strategy.copy(LocatorUtils.property(locator, "gemarkung", sourceGemarkung), sourceGemarkung));
                copy.setGemarkung(copyGemarkung);
            } else {
                copy.gemarkung = null;
            }
            if (this.etage!= null) {
                BigInteger sourceEtage;
                sourceEtage = this.getEtage();
                BigInteger copyEtage = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "etage", sourceEtage), sourceEtage));
                copy.setEtage(copyEtage);
            } else {
                copy.etage = null;
            }
            if (this.anzahlEtagen!= null) {
                BigInteger sourceAnzahlEtagen;
                sourceAnzahlEtagen = this.getAnzahlEtagen();
                BigInteger copyAnzahlEtagen = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "anzahlEtagen", sourceAnzahlEtagen), sourceAnzahlEtagen));
                copy.setAnzahlEtagen(copyAnzahlEtagen);
            } else {
                copy.anzahlEtagen = null;
            }
            if (this.lageImBau!= null) {
                LageImBau sourceLageImBau;
                sourceLageImBau = this.getLageImBau();
                LageImBau copyLageImBau = ((LageImBau) strategy.copy(LocatorUtils.property(locator, "lageImBau", sourceLageImBau), sourceLageImBau));
                copy.setLageImBau(copyLageImBau);
            } else {
                copy.lageImBau = null;
            }
            if (this.wohnungsnr!= null) {
                String sourceWohnungsnr;
                sourceWohnungsnr = this.getWohnungsnr();
                String copyWohnungsnr = ((String) strategy.copy(LocatorUtils.property(locator, "wohnungsnr", sourceWohnungsnr), sourceWohnungsnr));
                copy.setWohnungsnr(copyWohnungsnr);
            } else {
                copy.wohnungsnr = null;
            }
            if (this.lageGebiet!= null) {
                LageGebiet sourceLageGebiet;
                sourceLageGebiet = this.getLageGebiet();
                LageGebiet copyLageGebiet = ((LageGebiet) strategy.copy(LocatorUtils.property(locator, "lageGebiet", sourceLageGebiet), sourceLageGebiet));
                copy.setLageGebiet(copyLageGebiet);
            } else {
                copy.lageGebiet = null;
            }
            if (this.regionalerZusatz!= null) {
                String sourceRegionalerZusatz;
                sourceRegionalerZusatz = this.getRegionalerZusatz();
                String copyRegionalerZusatz = ((String) strategy.copy(LocatorUtils.property(locator, "regionalerZusatz", sourceRegionalerZusatz), sourceRegionalerZusatz));
                copy.setRegionalerZusatz(copyRegionalerZusatz);
            } else {
                copy.regionalerZusatz = null;
            }
            if (this.kartenMakro!= null) {
                Boolean sourceKartenMakro;
                sourceKartenMakro = this.isKartenMakro();
                Boolean copyKartenMakro = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kartenMakro", sourceKartenMakro), sourceKartenMakro));
                copy.setKartenMakro(copyKartenMakro);
            } else {
                copy.kartenMakro = null;
            }
            if (this.kartenMikro!= null) {
                Boolean sourceKartenMikro;
                sourceKartenMikro = this.isKartenMikro();
                Boolean copyKartenMikro = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kartenMikro", sourceKartenMikro), sourceKartenMikro));
                copy.setKartenMikro(copyKartenMikro);
            } else {
                copy.kartenMikro = null;
            }
            if (this.virtuelletour!= null) {
                Boolean sourceVirtuelletour;
                sourceVirtuelletour = this.isVirtuelletour();
                Boolean copyVirtuelletour = ((Boolean) strategy.copy(LocatorUtils.property(locator, "virtuelletour", sourceVirtuelletour), sourceVirtuelletour));
                copy.setVirtuelletour(copyVirtuelletour);
            } else {
                copy.virtuelletour = null;
            }
            if (this.luftbildern!= null) {
                Boolean sourceLuftbildern;
                sourceLuftbildern = this.isLuftbildern();
                Boolean copyLuftbildern = ((Boolean) strategy.copy(LocatorUtils.property(locator, "luftbildern", sourceLuftbildern), sourceLuftbildern));
                copy.setLuftbildern(copyLuftbildern);
            } else {
                copy.luftbildern = null;
            }
            if ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())) {
                List<UserDefinedSimplefield> sourceUserDefinedSimplefield;
                sourceUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedSimplefield> copyUserDefinedSimplefield = ((List<UserDefinedSimplefield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedSimplefield", sourceUserDefinedSimplefield), sourceUserDefinedSimplefield));
                copy.userDefinedSimplefield = null;
                if (copyUserDefinedSimplefield!= null) {
                    List<UserDefinedSimplefield> uniqueUserDefinedSimplefieldl = copy.getUserDefinedSimplefield();
                    uniqueUserDefinedSimplefieldl.addAll(copyUserDefinedSimplefield);
                }
            } else {
                copy.userDefinedSimplefield = null;
            }
            if ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())) {
                List<UserDefinedAnyfield> sourceUserDefinedAnyfield;
                sourceUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedAnyfield> copyUserDefinedAnyfield = ((List<UserDefinedAnyfield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedAnyfield", sourceUserDefinedAnyfield), sourceUserDefinedAnyfield));
                copy.userDefinedAnyfield = null;
                if (copyUserDefinedAnyfield!= null) {
                    List<UserDefinedAnyfield> uniqueUserDefinedAnyfieldl = copy.getUserDefinedAnyfield();
                    uniqueUserDefinedAnyfieldl.addAll(copyUserDefinedAnyfield);
                }
            } else {
                copy.userDefinedAnyfield = null;
            }
            if ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())) {
                List<UserDefinedExtend> sourceUserDefinedExtend;
                sourceUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedExtend> copyUserDefinedExtend = ((List<UserDefinedExtend> ) strategy.copy(LocatorUtils.property(locator, "userDefinedExtend", sourceUserDefinedExtend), sourceUserDefinedExtend));
                copy.userDefinedExtend = null;
                if (copyUserDefinedExtend!= null) {
                    List<UserDefinedExtend> uniqueUserDefinedExtendl = copy.getUserDefinedExtend();
                    uniqueUserDefinedExtendl.addAll(copyUserDefinedExtend);
                }
            } else {
                copy.userDefinedExtend = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Geo();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plz", lhsPlz), LocatorUtils.property(thatLocator, "plz", rhsPlz), lhsPlz, rhsPlz)) {
                return false;
            }
        }
        {
            String lhsOrt;
            lhsOrt = this.getOrt();
            String rhsOrt;
            rhsOrt = that.getOrt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ort", lhsOrt), LocatorUtils.property(thatLocator, "ort", rhsOrt), lhsOrt, rhsOrt)) {
                return false;
            }
        }
        {
            Geokoordinaten lhsGeokoordinaten;
            lhsGeokoordinaten = this.getGeokoordinaten();
            Geokoordinaten rhsGeokoordinaten;
            rhsGeokoordinaten = that.getGeokoordinaten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geokoordinaten", lhsGeokoordinaten), LocatorUtils.property(thatLocator, "geokoordinaten", rhsGeokoordinaten), lhsGeokoordinaten, rhsGeokoordinaten)) {
                return false;
            }
        }
        {
            String lhsStrasse;
            lhsStrasse = this.getStrasse();
            String rhsStrasse;
            rhsStrasse = that.getStrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strasse", lhsStrasse), LocatorUtils.property(thatLocator, "strasse", rhsStrasse), lhsStrasse, rhsStrasse)) {
                return false;
            }
        }
        {
            String lhsHausnummer;
            lhsHausnummer = this.getHausnummer();
            String rhsHausnummer;
            rhsHausnummer = that.getHausnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hausnummer", lhsHausnummer), LocatorUtils.property(thatLocator, "hausnummer", rhsHausnummer), lhsHausnummer, rhsHausnummer)) {
                return false;
            }
        }
        {
            String lhsBundesland;
            lhsBundesland = this.getBundesland();
            String rhsBundesland;
            rhsBundesland = that.getBundesland();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bundesland", lhsBundesland), LocatorUtils.property(thatLocator, "bundesland", rhsBundesland), lhsBundesland, rhsBundesland)) {
                return false;
            }
        }
        {
            Land lhsLand;
            lhsLand = this.getLand();
            Land rhsLand;
            rhsLand = that.getLand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "land", lhsLand), LocatorUtils.property(thatLocator, "land", rhsLand), lhsLand, rhsLand)) {
                return false;
            }
        }
        {
            String lhsGemeindecode;
            lhsGemeindecode = this.getGemeindecode();
            String rhsGemeindecode;
            rhsGemeindecode = that.getGemeindecode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gemeindecode", lhsGemeindecode), LocatorUtils.property(thatLocator, "gemeindecode", rhsGemeindecode), lhsGemeindecode, rhsGemeindecode)) {
                return false;
            }
        }
        {
            String lhsFlur;
            lhsFlur = this.getFlur();
            String rhsFlur;
            rhsFlur = that.getFlur();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flur", lhsFlur), LocatorUtils.property(thatLocator, "flur", rhsFlur), lhsFlur, rhsFlur)) {
                return false;
            }
        }
        {
            String lhsFlurstueck;
            lhsFlurstueck = this.getFlurstueck();
            String rhsFlurstueck;
            rhsFlurstueck = that.getFlurstueck();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flurstueck", lhsFlurstueck), LocatorUtils.property(thatLocator, "flurstueck", rhsFlurstueck), lhsFlurstueck, rhsFlurstueck)) {
                return false;
            }
        }
        {
            String lhsGemarkung;
            lhsGemarkung = this.getGemarkung();
            String rhsGemarkung;
            rhsGemarkung = that.getGemarkung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gemarkung", lhsGemarkung), LocatorUtils.property(thatLocator, "gemarkung", rhsGemarkung), lhsGemarkung, rhsGemarkung)) {
                return false;
            }
        }
        {
            BigInteger lhsEtage;
            lhsEtage = this.getEtage();
            BigInteger rhsEtage;
            rhsEtage = that.getEtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etage", lhsEtage), LocatorUtils.property(thatLocator, "etage", rhsEtage), lhsEtage, rhsEtage)) {
                return false;
            }
        }
        {
            BigInteger lhsAnzahlEtagen;
            lhsAnzahlEtagen = this.getAnzahlEtagen();
            BigInteger rhsAnzahlEtagen;
            rhsAnzahlEtagen = that.getAnzahlEtagen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlEtagen", lhsAnzahlEtagen), LocatorUtils.property(thatLocator, "anzahlEtagen", rhsAnzahlEtagen), lhsAnzahlEtagen, rhsAnzahlEtagen)) {
                return false;
            }
        }
        {
            LageImBau lhsLageImBau;
            lhsLageImBau = this.getLageImBau();
            LageImBau rhsLageImBau;
            rhsLageImBau = that.getLageImBau();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lageImBau", lhsLageImBau), LocatorUtils.property(thatLocator, "lageImBau", rhsLageImBau), lhsLageImBau, rhsLageImBau)) {
                return false;
            }
        }
        {
            String lhsWohnungsnr;
            lhsWohnungsnr = this.getWohnungsnr();
            String rhsWohnungsnr;
            rhsWohnungsnr = that.getWohnungsnr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnungsnr", lhsWohnungsnr), LocatorUtils.property(thatLocator, "wohnungsnr", rhsWohnungsnr), lhsWohnungsnr, rhsWohnungsnr)) {
                return false;
            }
        }
        {
            LageGebiet lhsLageGebiet;
            lhsLageGebiet = this.getLageGebiet();
            LageGebiet rhsLageGebiet;
            rhsLageGebiet = that.getLageGebiet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lageGebiet", lhsLageGebiet), LocatorUtils.property(thatLocator, "lageGebiet", rhsLageGebiet), lhsLageGebiet, rhsLageGebiet)) {
                return false;
            }
        }
        {
            String lhsRegionalerZusatz;
            lhsRegionalerZusatz = this.getRegionalerZusatz();
            String rhsRegionalerZusatz;
            rhsRegionalerZusatz = that.getRegionalerZusatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionalerZusatz", lhsRegionalerZusatz), LocatorUtils.property(thatLocator, "regionalerZusatz", rhsRegionalerZusatz), lhsRegionalerZusatz, rhsRegionalerZusatz)) {
                return false;
            }
        }
        {
            Boolean lhsKartenMakro;
            lhsKartenMakro = this.isKartenMakro();
            Boolean rhsKartenMakro;
            rhsKartenMakro = that.isKartenMakro();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kartenMakro", lhsKartenMakro), LocatorUtils.property(thatLocator, "kartenMakro", rhsKartenMakro), lhsKartenMakro, rhsKartenMakro)) {
                return false;
            }
        }
        {
            Boolean lhsKartenMikro;
            lhsKartenMikro = this.isKartenMikro();
            Boolean rhsKartenMikro;
            rhsKartenMikro = that.isKartenMikro();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kartenMikro", lhsKartenMikro), LocatorUtils.property(thatLocator, "kartenMikro", rhsKartenMikro), lhsKartenMikro, rhsKartenMikro)) {
                return false;
            }
        }
        {
            Boolean lhsVirtuelletour;
            lhsVirtuelletour = this.isVirtuelletour();
            Boolean rhsVirtuelletour;
            rhsVirtuelletour = that.isVirtuelletour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "virtuelletour", lhsVirtuelletour), LocatorUtils.property(thatLocator, "virtuelletour", rhsVirtuelletour), lhsVirtuelletour, rhsVirtuelletour)) {
                return false;
            }
        }
        {
            Boolean lhsLuftbildern;
            lhsLuftbildern = this.isLuftbildern();
            Boolean rhsLuftbildern;
            rhsLuftbildern = that.isLuftbildern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "luftbildern", lhsLuftbildern), LocatorUtils.property(thatLocator, "luftbildern", rhsLuftbildern), lhsLuftbildern, rhsLuftbildern)) {
                return false;
            }
        }
        {
            List<UserDefinedSimplefield> lhsUserDefinedSimplefield;
            lhsUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            List<UserDefinedSimplefield> rhsUserDefinedSimplefield;
            rhsUserDefinedSimplefield = (((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty()))?that.getUserDefinedSimplefield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedSimplefield", lhsUserDefinedSimplefield), LocatorUtils.property(thatLocator, "userDefinedSimplefield", rhsUserDefinedSimplefield), lhsUserDefinedSimplefield, rhsUserDefinedSimplefield)) {
                return false;
            }
        }
        {
            List<UserDefinedAnyfield> lhsUserDefinedAnyfield;
            lhsUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            List<UserDefinedAnyfield> rhsUserDefinedAnyfield;
            rhsUserDefinedAnyfield = (((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty()))?that.getUserDefinedAnyfield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedAnyfield", lhsUserDefinedAnyfield), LocatorUtils.property(thatLocator, "userDefinedAnyfield", rhsUserDefinedAnyfield), lhsUserDefinedAnyfield, rhsUserDefinedAnyfield)) {
                return false;
            }
        }
        {
            List<UserDefinedExtend> lhsUserDefinedExtend;
            lhsUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            List<UserDefinedExtend> rhsUserDefinedExtend;
            rhsUserDefinedExtend = (((that.userDefinedExtend!= null)&&(!that.userDefinedExtend.isEmpty()))?that.getUserDefinedExtend():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedExtend", lhsUserDefinedExtend), LocatorUtils.property(thatLocator, "userDefinedExtend", rhsUserDefinedExtend), lhsUserDefinedExtend, rhsUserDefinedExtend)) {
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
