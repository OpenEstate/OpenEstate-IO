
package org.openestate.io.immoxml.xml;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
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
 * Java class for &lt;verwaltung_objekt&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objektadresseFreigeben",
    "verfuegbarAb",
    "abdatum",
    "bisdatum",
    "minMietdauer",
    "maxMietdauer",
    "versteigerungstermin",
    "wbsSozialwohnung",
    "vermietet",
    "gruppennummer",
    "zugang",
    "laufzeit",
    "maxPersonen",
    "nichtraucher",
    "haustiere",
    "geschlecht",
    "denkmalgeschuetzt",
    "alsFerien",
    "gewerblicheNutzung",
    "branchen",
    "hochhaus",
    "userDefinedSimplefield",
    "userDefinedAnyfield"
})
@XmlRootElement(name = "verwaltung_objekt")
public class VerwaltungObjekt
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "objektadresse_freigeben")
    protected Boolean objektadresseFreigeben;
    @XmlElement(name = "verfuegbar_ab")
    protected String verfuegbarAb;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar abdatum;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar bisdatum;
    @XmlElement(name = "min_mietdauer")
    protected MinMietdauer minMietdauer;
    @XmlElement(name = "max_mietdauer")
    protected MaxMietdauer maxMietdauer;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar versteigerungstermin;
    @XmlElement(name = "wbs_sozialwohnung")
    protected Boolean wbsSozialwohnung;
    protected Boolean vermietet;
    protected String gruppennummer;
    protected String zugang;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal laufzeit;
    @XmlElement(name = "max_personen", type = String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxPersonen;
    protected Boolean nichtraucher;
    protected Boolean haustiere;
    protected Geschlecht geschlecht;
    protected Boolean denkmalgeschuetzt;
    @XmlElement(name = "als_ferien")
    protected Boolean alsFerien;
    @XmlElement(name = "gewerbliche_nutzung")
    protected Boolean gewerblicheNutzung;
    protected String branchen;
    protected Boolean hochhaus;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;

    /**
     * Gets the value of the objektadresseFreigeben property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObjektadresseFreigeben() {
        return objektadresseFreigeben;
    }

    /**
     * Sets the value of the objektadresseFreigeben property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObjektadresseFreigeben(Boolean value) {
        this.objektadresseFreigeben = value;
    }

    /**
     * Gets the value of the verfuegbarAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerfuegbarAb() {
        return verfuegbarAb;
    }

    /**
     * Sets the value of the verfuegbarAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerfuegbarAb(String value) {
        this.verfuegbarAb = value;
    }

    /**
     * Gets the value of the abdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getAbdatum() {
        return abdatum;
    }

    /**
     * Sets the value of the abdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbdatum(Calendar value) {
        this.abdatum = value;
    }

    /**
     * Gets the value of the bisdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBisdatum() {
        return bisdatum;
    }

    /**
     * Sets the value of the bisdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBisdatum(Calendar value) {
        this.bisdatum = value;
    }

    /**
     * Gets the value of the minMietdauer property.
     * 
     * @return
     *     possible object is
     *     {@link MinMietdauer }
     *     
     */
    public MinMietdauer getMinMietdauer() {
        return minMietdauer;
    }

    /**
     * Sets the value of the minMietdauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinMietdauer }
     *     
     */
    public void setMinMietdauer(MinMietdauer value) {
        this.minMietdauer = value;
    }

    /**
     * Gets the value of the maxMietdauer property.
     * 
     * @return
     *     possible object is
     *     {@link MaxMietdauer }
     *     
     */
    public MaxMietdauer getMaxMietdauer() {
        return maxMietdauer;
    }

    /**
     * Sets the value of the maxMietdauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxMietdauer }
     *     
     */
    public void setMaxMietdauer(MaxMietdauer value) {
        this.maxMietdauer = value;
    }

    /**
     * Gets the value of the versteigerungstermin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getVersteigerungstermin() {
        return versteigerungstermin;
    }

    /**
     * Sets the value of the versteigerungstermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersteigerungstermin(Calendar value) {
        this.versteigerungstermin = value;
    }

    /**
     * Gets the value of the wbsSozialwohnung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWbsSozialwohnung() {
        return wbsSozialwohnung;
    }

    /**
     * Sets the value of the wbsSozialwohnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWbsSozialwohnung(Boolean value) {
        this.wbsSozialwohnung = value;
    }

    /**
     * Gets the value of the vermietet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVermietet() {
        return vermietet;
    }

    /**
     * Sets the value of the vermietet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVermietet(Boolean value) {
        this.vermietet = value;
    }

    /**
     * Gets the value of the gruppennummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGruppennummer() {
        return gruppennummer;
    }

    /**
     * Sets the value of the gruppennummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGruppennummer(String value) {
        this.gruppennummer = value;
    }

    /**
     * Gets the value of the zugang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZugang() {
        return zugang;
    }

    /**
     * Sets the value of the zugang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZugang(String value) {
        this.zugang = value;
    }

    /**
     * Gets the value of the laufzeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getLaufzeit() {
        return laufzeit;
    }

    /**
     * Sets the value of the laufzeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaufzeit(BigDecimal value) {
        this.laufzeit = value;
    }

    /**
     * Gets the value of the maxPersonen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigInteger getMaxPersonen() {
        return maxPersonen;
    }

    /**
     * Sets the value of the maxPersonen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPersonen(BigInteger value) {
        this.maxPersonen = value;
    }

    /**
     * Gets the value of the nichtraucher property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNichtraucher() {
        return nichtraucher;
    }

    /**
     * Sets the value of the nichtraucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNichtraucher(Boolean value) {
        this.nichtraucher = value;
    }

    /**
     * Gets the value of the haustiere property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHaustiere() {
        return haustiere;
    }

    /**
     * Sets the value of the haustiere property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHaustiere(Boolean value) {
        this.haustiere = value;
    }

    /**
     * Gets the value of the geschlecht property.
     * 
     * @return
     *     possible object is
     *     {@link Geschlecht }
     *     
     */
    public Geschlecht getGeschlecht() {
        return geschlecht;
    }

    /**
     * Sets the value of the geschlecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geschlecht }
     *     
     */
    public void setGeschlecht(Geschlecht value) {
        this.geschlecht = value;
    }

    /**
     * Gets the value of the denkmalgeschuetzt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDenkmalgeschuetzt() {
        return denkmalgeschuetzt;
    }

    /**
     * Sets the value of the denkmalgeschuetzt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDenkmalgeschuetzt(Boolean value) {
        this.denkmalgeschuetzt = value;
    }

    /**
     * Gets the value of the alsFerien property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlsFerien() {
        return alsFerien;
    }

    /**
     * Sets the value of the alsFerien property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlsFerien(Boolean value) {
        this.alsFerien = value;
    }

    /**
     * Gets the value of the gewerblicheNutzung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGewerblicheNutzung() {
        return gewerblicheNutzung;
    }

    /**
     * Sets the value of the gewerblicheNutzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGewerblicheNutzung(Boolean value) {
        this.gewerblicheNutzung = value;
    }

    /**
     * Gets the value of the branchen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchen() {
        return branchen;
    }

    /**
     * Sets the value of the branchen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchen(String value) {
        this.branchen = value;
    }

    /**
     * Gets the value of the hochhaus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHochhaus() {
        return hochhaus;
    }

    /**
     * Sets the value of the hochhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHochhaus(Boolean value) {
        this.hochhaus = value;
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
            Boolean theObjektadresseFreigeben;
            theObjektadresseFreigeben = this.isObjektadresseFreigeben();
            strategy.appendField(locator, this, "objektadresseFreigeben", buffer, theObjektadresseFreigeben);
        }
        {
            String theVerfuegbarAb;
            theVerfuegbarAb = this.getVerfuegbarAb();
            strategy.appendField(locator, this, "verfuegbarAb", buffer, theVerfuegbarAb);
        }
        {
            Calendar theAbdatum;
            theAbdatum = this.getAbdatum();
            strategy.appendField(locator, this, "abdatum", buffer, theAbdatum);
        }
        {
            Calendar theBisdatum;
            theBisdatum = this.getBisdatum();
            strategy.appendField(locator, this, "bisdatum", buffer, theBisdatum);
        }
        {
            MinMietdauer theMinMietdauer;
            theMinMietdauer = this.getMinMietdauer();
            strategy.appendField(locator, this, "minMietdauer", buffer, theMinMietdauer);
        }
        {
            MaxMietdauer theMaxMietdauer;
            theMaxMietdauer = this.getMaxMietdauer();
            strategy.appendField(locator, this, "maxMietdauer", buffer, theMaxMietdauer);
        }
        {
            Calendar theVersteigerungstermin;
            theVersteigerungstermin = this.getVersteigerungstermin();
            strategy.appendField(locator, this, "versteigerungstermin", buffer, theVersteigerungstermin);
        }
        {
            Boolean theWbsSozialwohnung;
            theWbsSozialwohnung = this.isWbsSozialwohnung();
            strategy.appendField(locator, this, "wbsSozialwohnung", buffer, theWbsSozialwohnung);
        }
        {
            Boolean theVermietet;
            theVermietet = this.isVermietet();
            strategy.appendField(locator, this, "vermietet", buffer, theVermietet);
        }
        {
            String theGruppennummer;
            theGruppennummer = this.getGruppennummer();
            strategy.appendField(locator, this, "gruppennummer", buffer, theGruppennummer);
        }
        {
            String theZugang;
            theZugang = this.getZugang();
            strategy.appendField(locator, this, "zugang", buffer, theZugang);
        }
        {
            BigDecimal theLaufzeit;
            theLaufzeit = this.getLaufzeit();
            strategy.appendField(locator, this, "laufzeit", buffer, theLaufzeit);
        }
        {
            BigInteger theMaxPersonen;
            theMaxPersonen = this.getMaxPersonen();
            strategy.appendField(locator, this, "maxPersonen", buffer, theMaxPersonen);
        }
        {
            Boolean theNichtraucher;
            theNichtraucher = this.isNichtraucher();
            strategy.appendField(locator, this, "nichtraucher", buffer, theNichtraucher);
        }
        {
            Boolean theHaustiere;
            theHaustiere = this.isHaustiere();
            strategy.appendField(locator, this, "haustiere", buffer, theHaustiere);
        }
        {
            Geschlecht theGeschlecht;
            theGeschlecht = this.getGeschlecht();
            strategy.appendField(locator, this, "geschlecht", buffer, theGeschlecht);
        }
        {
            Boolean theDenkmalgeschuetzt;
            theDenkmalgeschuetzt = this.isDenkmalgeschuetzt();
            strategy.appendField(locator, this, "denkmalgeschuetzt", buffer, theDenkmalgeschuetzt);
        }
        {
            Boolean theAlsFerien;
            theAlsFerien = this.isAlsFerien();
            strategy.appendField(locator, this, "alsFerien", buffer, theAlsFerien);
        }
        {
            Boolean theGewerblicheNutzung;
            theGewerblicheNutzung = this.isGewerblicheNutzung();
            strategy.appendField(locator, this, "gewerblicheNutzung", buffer, theGewerblicheNutzung);
        }
        {
            String theBranchen;
            theBranchen = this.getBranchen();
            strategy.appendField(locator, this, "branchen", buffer, theBranchen);
        }
        {
            Boolean theHochhaus;
            theHochhaus = this.isHochhaus();
            strategy.appendField(locator, this, "hochhaus", buffer, theHochhaus);
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
        if (draftCopy instanceof VerwaltungObjekt) {
            final VerwaltungObjekt copy = ((VerwaltungObjekt) draftCopy);
            if (this.objektadresseFreigeben!= null) {
                Boolean sourceObjektadresseFreigeben;
                sourceObjektadresseFreigeben = this.isObjektadresseFreigeben();
                Boolean copyObjektadresseFreigeben = ((Boolean) strategy.copy(LocatorUtils.property(locator, "objektadresseFreigeben", sourceObjektadresseFreigeben), sourceObjektadresseFreigeben));
                copy.setObjektadresseFreigeben(copyObjektadresseFreigeben);
            } else {
                copy.objektadresseFreigeben = null;
            }
            if (this.verfuegbarAb!= null) {
                String sourceVerfuegbarAb;
                sourceVerfuegbarAb = this.getVerfuegbarAb();
                String copyVerfuegbarAb = ((String) strategy.copy(LocatorUtils.property(locator, "verfuegbarAb", sourceVerfuegbarAb), sourceVerfuegbarAb));
                copy.setVerfuegbarAb(copyVerfuegbarAb);
            } else {
                copy.verfuegbarAb = null;
            }
            if (this.abdatum!= null) {
                Calendar sourceAbdatum;
                sourceAbdatum = this.getAbdatum();
                Calendar copyAbdatum = ((Calendar) strategy.copy(LocatorUtils.property(locator, "abdatum", sourceAbdatum), sourceAbdatum));
                copy.setAbdatum(copyAbdatum);
            } else {
                copy.abdatum = null;
            }
            if (this.bisdatum!= null) {
                Calendar sourceBisdatum;
                sourceBisdatum = this.getBisdatum();
                Calendar copyBisdatum = ((Calendar) strategy.copy(LocatorUtils.property(locator, "bisdatum", sourceBisdatum), sourceBisdatum));
                copy.setBisdatum(copyBisdatum);
            } else {
                copy.bisdatum = null;
            }
            if (this.minMietdauer!= null) {
                MinMietdauer sourceMinMietdauer;
                sourceMinMietdauer = this.getMinMietdauer();
                MinMietdauer copyMinMietdauer = ((MinMietdauer) strategy.copy(LocatorUtils.property(locator, "minMietdauer", sourceMinMietdauer), sourceMinMietdauer));
                copy.setMinMietdauer(copyMinMietdauer);
            } else {
                copy.minMietdauer = null;
            }
            if (this.maxMietdauer!= null) {
                MaxMietdauer sourceMaxMietdauer;
                sourceMaxMietdauer = this.getMaxMietdauer();
                MaxMietdauer copyMaxMietdauer = ((MaxMietdauer) strategy.copy(LocatorUtils.property(locator, "maxMietdauer", sourceMaxMietdauer), sourceMaxMietdauer));
                copy.setMaxMietdauer(copyMaxMietdauer);
            } else {
                copy.maxMietdauer = null;
            }
            if (this.versteigerungstermin!= null) {
                Calendar sourceVersteigerungstermin;
                sourceVersteigerungstermin = this.getVersteigerungstermin();
                Calendar copyVersteigerungstermin = ((Calendar) strategy.copy(LocatorUtils.property(locator, "versteigerungstermin", sourceVersteigerungstermin), sourceVersteigerungstermin));
                copy.setVersteigerungstermin(copyVersteigerungstermin);
            } else {
                copy.versteigerungstermin = null;
            }
            if (this.wbsSozialwohnung!= null) {
                Boolean sourceWbsSozialwohnung;
                sourceWbsSozialwohnung = this.isWbsSozialwohnung();
                Boolean copyWbsSozialwohnung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wbsSozialwohnung", sourceWbsSozialwohnung), sourceWbsSozialwohnung));
                copy.setWbsSozialwohnung(copyWbsSozialwohnung);
            } else {
                copy.wbsSozialwohnung = null;
            }
            if (this.vermietet!= null) {
                Boolean sourceVermietet;
                sourceVermietet = this.isVermietet();
                Boolean copyVermietet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "vermietet", sourceVermietet), sourceVermietet));
                copy.setVermietet(copyVermietet);
            } else {
                copy.vermietet = null;
            }
            if (this.gruppennummer!= null) {
                String sourceGruppennummer;
                sourceGruppennummer = this.getGruppennummer();
                String copyGruppennummer = ((String) strategy.copy(LocatorUtils.property(locator, "gruppennummer", sourceGruppennummer), sourceGruppennummer));
                copy.setGruppennummer(copyGruppennummer);
            } else {
                copy.gruppennummer = null;
            }
            if (this.zugang!= null) {
                String sourceZugang;
                sourceZugang = this.getZugang();
                String copyZugang = ((String) strategy.copy(LocatorUtils.property(locator, "zugang", sourceZugang), sourceZugang));
                copy.setZugang(copyZugang);
            } else {
                copy.zugang = null;
            }
            if (this.laufzeit!= null) {
                BigDecimal sourceLaufzeit;
                sourceLaufzeit = this.getLaufzeit();
                BigDecimal copyLaufzeit = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "laufzeit", sourceLaufzeit), sourceLaufzeit));
                copy.setLaufzeit(copyLaufzeit);
            } else {
                copy.laufzeit = null;
            }
            if (this.maxPersonen!= null) {
                BigInteger sourceMaxPersonen;
                sourceMaxPersonen = this.getMaxPersonen();
                BigInteger copyMaxPersonen = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "maxPersonen", sourceMaxPersonen), sourceMaxPersonen));
                copy.setMaxPersonen(copyMaxPersonen);
            } else {
                copy.maxPersonen = null;
            }
            if (this.nichtraucher!= null) {
                Boolean sourceNichtraucher;
                sourceNichtraucher = this.isNichtraucher();
                Boolean copyNichtraucher = ((Boolean) strategy.copy(LocatorUtils.property(locator, "nichtraucher", sourceNichtraucher), sourceNichtraucher));
                copy.setNichtraucher(copyNichtraucher);
            } else {
                copy.nichtraucher = null;
            }
            if (this.haustiere!= null) {
                Boolean sourceHaustiere;
                sourceHaustiere = this.isHaustiere();
                Boolean copyHaustiere = ((Boolean) strategy.copy(LocatorUtils.property(locator, "haustiere", sourceHaustiere), sourceHaustiere));
                copy.setHaustiere(copyHaustiere);
            } else {
                copy.haustiere = null;
            }
            if (this.geschlecht!= null) {
                Geschlecht sourceGeschlecht;
                sourceGeschlecht = this.getGeschlecht();
                Geschlecht copyGeschlecht = ((Geschlecht) strategy.copy(LocatorUtils.property(locator, "geschlecht", sourceGeschlecht), sourceGeschlecht));
                copy.setGeschlecht(copyGeschlecht);
            } else {
                copy.geschlecht = null;
            }
            if (this.denkmalgeschuetzt!= null) {
                Boolean sourceDenkmalgeschuetzt;
                sourceDenkmalgeschuetzt = this.isDenkmalgeschuetzt();
                Boolean copyDenkmalgeschuetzt = ((Boolean) strategy.copy(LocatorUtils.property(locator, "denkmalgeschuetzt", sourceDenkmalgeschuetzt), sourceDenkmalgeschuetzt));
                copy.setDenkmalgeschuetzt(copyDenkmalgeschuetzt);
            } else {
                copy.denkmalgeschuetzt = null;
            }
            if (this.alsFerien!= null) {
                Boolean sourceAlsFerien;
                sourceAlsFerien = this.isAlsFerien();
                Boolean copyAlsFerien = ((Boolean) strategy.copy(LocatorUtils.property(locator, "alsFerien", sourceAlsFerien), sourceAlsFerien));
                copy.setAlsFerien(copyAlsFerien);
            } else {
                copy.alsFerien = null;
            }
            if (this.gewerblicheNutzung!= null) {
                Boolean sourceGewerblicheNutzung;
                sourceGewerblicheNutzung = this.isGewerblicheNutzung();
                Boolean copyGewerblicheNutzung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gewerblicheNutzung", sourceGewerblicheNutzung), sourceGewerblicheNutzung));
                copy.setGewerblicheNutzung(copyGewerblicheNutzung);
            } else {
                copy.gewerblicheNutzung = null;
            }
            if (this.branchen!= null) {
                String sourceBranchen;
                sourceBranchen = this.getBranchen();
                String copyBranchen = ((String) strategy.copy(LocatorUtils.property(locator, "branchen", sourceBranchen), sourceBranchen));
                copy.setBranchen(copyBranchen);
            } else {
                copy.branchen = null;
            }
            if (this.hochhaus!= null) {
                Boolean sourceHochhaus;
                sourceHochhaus = this.isHochhaus();
                Boolean copyHochhaus = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hochhaus", sourceHochhaus), sourceHochhaus));
                copy.setHochhaus(copyHochhaus);
            } else {
                copy.hochhaus = null;
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
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VerwaltungObjekt();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VerwaltungObjekt that = ((VerwaltungObjekt) object);
        {
            Boolean lhsObjektadresseFreigeben;
            lhsObjektadresseFreigeben = this.isObjektadresseFreigeben();
            Boolean rhsObjektadresseFreigeben;
            rhsObjektadresseFreigeben = that.isObjektadresseFreigeben();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektadresseFreigeben", lhsObjektadresseFreigeben), LocatorUtils.property(thatLocator, "objektadresseFreigeben", rhsObjektadresseFreigeben), lhsObjektadresseFreigeben, rhsObjektadresseFreigeben)) {
                return false;
            }
        }
        {
            String lhsVerfuegbarAb;
            lhsVerfuegbarAb = this.getVerfuegbarAb();
            String rhsVerfuegbarAb;
            rhsVerfuegbarAb = that.getVerfuegbarAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verfuegbarAb", lhsVerfuegbarAb), LocatorUtils.property(thatLocator, "verfuegbarAb", rhsVerfuegbarAb), lhsVerfuegbarAb, rhsVerfuegbarAb)) {
                return false;
            }
        }
        {
            Calendar lhsAbdatum;
            lhsAbdatum = this.getAbdatum();
            Calendar rhsAbdatum;
            rhsAbdatum = that.getAbdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abdatum", lhsAbdatum), LocatorUtils.property(thatLocator, "abdatum", rhsAbdatum), lhsAbdatum, rhsAbdatum)) {
                return false;
            }
        }
        {
            Calendar lhsBisdatum;
            lhsBisdatum = this.getBisdatum();
            Calendar rhsBisdatum;
            rhsBisdatum = that.getBisdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bisdatum", lhsBisdatum), LocatorUtils.property(thatLocator, "bisdatum", rhsBisdatum), lhsBisdatum, rhsBisdatum)) {
                return false;
            }
        }
        {
            MinMietdauer lhsMinMietdauer;
            lhsMinMietdauer = this.getMinMietdauer();
            MinMietdauer rhsMinMietdauer;
            rhsMinMietdauer = that.getMinMietdauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minMietdauer", lhsMinMietdauer), LocatorUtils.property(thatLocator, "minMietdauer", rhsMinMietdauer), lhsMinMietdauer, rhsMinMietdauer)) {
                return false;
            }
        }
        {
            MaxMietdauer lhsMaxMietdauer;
            lhsMaxMietdauer = this.getMaxMietdauer();
            MaxMietdauer rhsMaxMietdauer;
            rhsMaxMietdauer = that.getMaxMietdauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxMietdauer", lhsMaxMietdauer), LocatorUtils.property(thatLocator, "maxMietdauer", rhsMaxMietdauer), lhsMaxMietdauer, rhsMaxMietdauer)) {
                return false;
            }
        }
        {
            Calendar lhsVersteigerungstermin;
            lhsVersteigerungstermin = this.getVersteigerungstermin();
            Calendar rhsVersteigerungstermin;
            rhsVersteigerungstermin = that.getVersteigerungstermin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versteigerungstermin", lhsVersteigerungstermin), LocatorUtils.property(thatLocator, "versteigerungstermin", rhsVersteigerungstermin), lhsVersteigerungstermin, rhsVersteigerungstermin)) {
                return false;
            }
        }
        {
            Boolean lhsWbsSozialwohnung;
            lhsWbsSozialwohnung = this.isWbsSozialwohnung();
            Boolean rhsWbsSozialwohnung;
            rhsWbsSozialwohnung = that.isWbsSozialwohnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wbsSozialwohnung", lhsWbsSozialwohnung), LocatorUtils.property(thatLocator, "wbsSozialwohnung", rhsWbsSozialwohnung), lhsWbsSozialwohnung, rhsWbsSozialwohnung)) {
                return false;
            }
        }
        {
            Boolean lhsVermietet;
            lhsVermietet = this.isVermietet();
            Boolean rhsVermietet;
            rhsVermietet = that.isVermietet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermietet", lhsVermietet), LocatorUtils.property(thatLocator, "vermietet", rhsVermietet), lhsVermietet, rhsVermietet)) {
                return false;
            }
        }
        {
            String lhsGruppennummer;
            lhsGruppennummer = this.getGruppennummer();
            String rhsGruppennummer;
            rhsGruppennummer = that.getGruppennummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gruppennummer", lhsGruppennummer), LocatorUtils.property(thatLocator, "gruppennummer", rhsGruppennummer), lhsGruppennummer, rhsGruppennummer)) {
                return false;
            }
        }
        {
            String lhsZugang;
            lhsZugang = this.getZugang();
            String rhsZugang;
            rhsZugang = that.getZugang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zugang", lhsZugang), LocatorUtils.property(thatLocator, "zugang", rhsZugang), lhsZugang, rhsZugang)) {
                return false;
            }
        }
        {
            BigDecimal lhsLaufzeit;
            lhsLaufzeit = this.getLaufzeit();
            BigDecimal rhsLaufzeit;
            rhsLaufzeit = that.getLaufzeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "laufzeit", lhsLaufzeit), LocatorUtils.property(thatLocator, "laufzeit", rhsLaufzeit), lhsLaufzeit, rhsLaufzeit)) {
                return false;
            }
        }
        {
            BigInteger lhsMaxPersonen;
            lhsMaxPersonen = this.getMaxPersonen();
            BigInteger rhsMaxPersonen;
            rhsMaxPersonen = that.getMaxPersonen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxPersonen", lhsMaxPersonen), LocatorUtils.property(thatLocator, "maxPersonen", rhsMaxPersonen), lhsMaxPersonen, rhsMaxPersonen)) {
                return false;
            }
        }
        {
            Boolean lhsNichtraucher;
            lhsNichtraucher = this.isNichtraucher();
            Boolean rhsNichtraucher;
            rhsNichtraucher = that.isNichtraucher();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nichtraucher", lhsNichtraucher), LocatorUtils.property(thatLocator, "nichtraucher", rhsNichtraucher), lhsNichtraucher, rhsNichtraucher)) {
                return false;
            }
        }
        {
            Boolean lhsHaustiere;
            lhsHaustiere = this.isHaustiere();
            Boolean rhsHaustiere;
            rhsHaustiere = that.isHaustiere();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haustiere", lhsHaustiere), LocatorUtils.property(thatLocator, "haustiere", rhsHaustiere), lhsHaustiere, rhsHaustiere)) {
                return false;
            }
        }
        {
            Geschlecht lhsGeschlecht;
            lhsGeschlecht = this.getGeschlecht();
            Geschlecht rhsGeschlecht;
            rhsGeschlecht = that.getGeschlecht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geschlecht", lhsGeschlecht), LocatorUtils.property(thatLocator, "geschlecht", rhsGeschlecht), lhsGeschlecht, rhsGeschlecht)) {
                return false;
            }
        }
        {
            Boolean lhsDenkmalgeschuetzt;
            lhsDenkmalgeschuetzt = this.isDenkmalgeschuetzt();
            Boolean rhsDenkmalgeschuetzt;
            rhsDenkmalgeschuetzt = that.isDenkmalgeschuetzt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "denkmalgeschuetzt", lhsDenkmalgeschuetzt), LocatorUtils.property(thatLocator, "denkmalgeschuetzt", rhsDenkmalgeschuetzt), lhsDenkmalgeschuetzt, rhsDenkmalgeschuetzt)) {
                return false;
            }
        }
        {
            Boolean lhsAlsFerien;
            lhsAlsFerien = this.isAlsFerien();
            Boolean rhsAlsFerien;
            rhsAlsFerien = that.isAlsFerien();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alsFerien", lhsAlsFerien), LocatorUtils.property(thatLocator, "alsFerien", rhsAlsFerien), lhsAlsFerien, rhsAlsFerien)) {
                return false;
            }
        }
        {
            Boolean lhsGewerblicheNutzung;
            lhsGewerblicheNutzung = this.isGewerblicheNutzung();
            Boolean rhsGewerblicheNutzung;
            rhsGewerblicheNutzung = that.isGewerblicheNutzung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewerblicheNutzung", lhsGewerblicheNutzung), LocatorUtils.property(thatLocator, "gewerblicheNutzung", rhsGewerblicheNutzung), lhsGewerblicheNutzung, rhsGewerblicheNutzung)) {
                return false;
            }
        }
        {
            String lhsBranchen;
            lhsBranchen = this.getBranchen();
            String rhsBranchen;
            rhsBranchen = that.getBranchen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "branchen", lhsBranchen), LocatorUtils.property(thatLocator, "branchen", rhsBranchen), lhsBranchen, rhsBranchen)) {
                return false;
            }
        }
        {
            Boolean lhsHochhaus;
            lhsHochhaus = this.isHochhaus();
            Boolean rhsHochhaus;
            rhsHochhaus = that.isHochhaus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hochhaus", lhsHochhaus), LocatorUtils.property(thatLocator, "hochhaus", rhsHochhaus), lhsHochhaus, rhsHochhaus)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
