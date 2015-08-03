
package org.openestate.io.openimmo.xml;

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
 * Java class for &lt;verwaltung_techn&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objektnrIntern",
    "objektnrExtern",
    "aktion",
    "aktivVon",
    "aktivBis",
    "openimmoObid",
    "kennungUrsprung",
    "standVom",
    "weitergabeGenerell",
    "weitergabePositiv",
    "weitergabeNegativ",
    "gruppenKennung",
    "master",
    "sprache",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "verwaltung_techn")
public class VerwaltungTechn
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "objektnr_intern")
    protected String objektnrIntern;
    @XmlElement(name = "objektnr_extern", required = true)
    protected String objektnrExtern;
    @XmlElement(required = true)
    protected Aktion aktion;
    @XmlElement(name = "aktiv_von", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar aktivVon;
    @XmlElement(name = "aktiv_bis", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar aktivBis;
    @XmlElement(name = "openimmo_obid", required = true)
    protected String openimmoObid;
    @XmlElement(name = "kennung_ursprung")
    protected String kennungUrsprung;
    @XmlElement(name = "stand_vom", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar standVom;
    @XmlElement(name = "weitergabe_generell")
    protected Boolean weitergabeGenerell;
    @XmlElement(name = "weitergabe_positiv")
    protected String weitergabePositiv;
    @XmlElement(name = "weitergabe_negativ")
    protected String weitergabeNegativ;
    @XmlElement(name = "gruppen_kennung")
    protected String gruppenKennung;
    protected Master master;
    protected String sprache;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the objektnrIntern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjektnrIntern() {
        return objektnrIntern;
    }

    /**
     * Sets the value of the objektnrIntern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjektnrIntern(String value) {
        this.objektnrIntern = value;
    }

    /**
     * Gets the value of the objektnrExtern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjektnrExtern() {
        return objektnrExtern;
    }

    /**
     * Sets the value of the objektnrExtern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjektnrExtern(String value) {
        this.objektnrExtern = value;
    }

    /**
     * Gets the value of the aktion property.
     * 
     * @return
     *     possible object is
     *     {@link Aktion }
     *     
     */
    public Aktion getAktion() {
        return aktion;
    }

    /**
     * Sets the value of the aktion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aktion }
     *     
     */
    public void setAktion(Aktion value) {
        this.aktion = value;
    }

    /**
     * Gets the value of the aktivVon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getAktivVon() {
        return aktivVon;
    }

    /**
     * Sets the value of the aktivVon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktivVon(Calendar value) {
        this.aktivVon = value;
    }

    /**
     * Gets the value of the aktivBis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getAktivBis() {
        return aktivBis;
    }

    /**
     * Sets the value of the aktivBis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktivBis(Calendar value) {
        this.aktivBis = value;
    }

    /**
     * Gets the value of the openimmoObid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenimmoObid() {
        return openimmoObid;
    }

    /**
     * Sets the value of the openimmoObid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenimmoObid(String value) {
        this.openimmoObid = value;
    }

    /**
     * Gets the value of the kennungUrsprung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKennungUrsprung() {
        return kennungUrsprung;
    }

    /**
     * Sets the value of the kennungUrsprung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKennungUrsprung(String value) {
        this.kennungUrsprung = value;
    }

    /**
     * Gets the value of the standVom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStandVom() {
        return standVom;
    }

    /**
     * Sets the value of the standVom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandVom(Calendar value) {
        this.standVom = value;
    }

    /**
     * Gets the value of the weitergabeGenerell property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeitergabeGenerell() {
        return weitergabeGenerell;
    }

    /**
     * Sets the value of the weitergabeGenerell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeitergabeGenerell(Boolean value) {
        this.weitergabeGenerell = value;
    }

    /**
     * Gets the value of the weitergabePositiv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeitergabePositiv() {
        return weitergabePositiv;
    }

    /**
     * Sets the value of the weitergabePositiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeitergabePositiv(String value) {
        this.weitergabePositiv = value;
    }

    /**
     * Gets the value of the weitergabeNegativ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeitergabeNegativ() {
        return weitergabeNegativ;
    }

    /**
     * Sets the value of the weitergabeNegativ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeitergabeNegativ(String value) {
        this.weitergabeNegativ = value;
    }

    /**
     * Gets the value of the gruppenKennung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGruppenKennung() {
        return gruppenKennung;
    }

    /**
     * Sets the value of the gruppenKennung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGruppenKennung(String value) {
        this.gruppenKennung = value;
    }

    /**
     * Gets the value of the master property.
     * 
     * @return
     *     possible object is
     *     {@link Master }
     *     
     */
    public Master getMaster() {
        return master;
    }

    /**
     * Sets the value of the master property.
     * 
     * @param value
     *     allowed object is
     *     {@link Master }
     *     
     */
    public void setMaster(Master value) {
        this.master = value;
    }

    /**
     * Gets the value of the sprache property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSprache() {
        return sprache;
    }

    /**
     * Sets the value of the sprache property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSprache(String value) {
        this.sprache = value;
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
            String theObjektnrIntern;
            theObjektnrIntern = this.getObjektnrIntern();
            strategy.appendField(locator, this, "objektnrIntern", buffer, theObjektnrIntern);
        }
        {
            String theObjektnrExtern;
            theObjektnrExtern = this.getObjektnrExtern();
            strategy.appendField(locator, this, "objektnrExtern", buffer, theObjektnrExtern);
        }
        {
            Aktion theAktion;
            theAktion = this.getAktion();
            strategy.appendField(locator, this, "aktion", buffer, theAktion);
        }
        {
            Calendar theAktivVon;
            theAktivVon = this.getAktivVon();
            strategy.appendField(locator, this, "aktivVon", buffer, theAktivVon);
        }
        {
            Calendar theAktivBis;
            theAktivBis = this.getAktivBis();
            strategy.appendField(locator, this, "aktivBis", buffer, theAktivBis);
        }
        {
            String theOpenimmoObid;
            theOpenimmoObid = this.getOpenimmoObid();
            strategy.appendField(locator, this, "openimmoObid", buffer, theOpenimmoObid);
        }
        {
            String theKennungUrsprung;
            theKennungUrsprung = this.getKennungUrsprung();
            strategy.appendField(locator, this, "kennungUrsprung", buffer, theKennungUrsprung);
        }
        {
            Calendar theStandVom;
            theStandVom = this.getStandVom();
            strategy.appendField(locator, this, "standVom", buffer, theStandVom);
        }
        {
            Boolean theWeitergabeGenerell;
            theWeitergabeGenerell = this.isWeitergabeGenerell();
            strategy.appendField(locator, this, "weitergabeGenerell", buffer, theWeitergabeGenerell);
        }
        {
            String theWeitergabePositiv;
            theWeitergabePositiv = this.getWeitergabePositiv();
            strategy.appendField(locator, this, "weitergabePositiv", buffer, theWeitergabePositiv);
        }
        {
            String theWeitergabeNegativ;
            theWeitergabeNegativ = this.getWeitergabeNegativ();
            strategy.appendField(locator, this, "weitergabeNegativ", buffer, theWeitergabeNegativ);
        }
        {
            String theGruppenKennung;
            theGruppenKennung = this.getGruppenKennung();
            strategy.appendField(locator, this, "gruppenKennung", buffer, theGruppenKennung);
        }
        {
            Master theMaster;
            theMaster = this.getMaster();
            strategy.appendField(locator, this, "master", buffer, theMaster);
        }
        {
            String theSprache;
            theSprache = this.getSprache();
            strategy.appendField(locator, this, "sprache", buffer, theSprache);
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
        if (draftCopy instanceof VerwaltungTechn) {
            final VerwaltungTechn copy = ((VerwaltungTechn) draftCopy);
            if (this.objektnrIntern!= null) {
                String sourceObjektnrIntern;
                sourceObjektnrIntern = this.getObjektnrIntern();
                String copyObjektnrIntern = ((String) strategy.copy(LocatorUtils.property(locator, "objektnrIntern", sourceObjektnrIntern), sourceObjektnrIntern));
                copy.setObjektnrIntern(copyObjektnrIntern);
            } else {
                copy.objektnrIntern = null;
            }
            if (this.objektnrExtern!= null) {
                String sourceObjektnrExtern;
                sourceObjektnrExtern = this.getObjektnrExtern();
                String copyObjektnrExtern = ((String) strategy.copy(LocatorUtils.property(locator, "objektnrExtern", sourceObjektnrExtern), sourceObjektnrExtern));
                copy.setObjektnrExtern(copyObjektnrExtern);
            } else {
                copy.objektnrExtern = null;
            }
            if (this.aktion!= null) {
                Aktion sourceAktion;
                sourceAktion = this.getAktion();
                Aktion copyAktion = ((Aktion) strategy.copy(LocatorUtils.property(locator, "aktion", sourceAktion), sourceAktion));
                copy.setAktion(copyAktion);
            } else {
                copy.aktion = null;
            }
            if (this.aktivVon!= null) {
                Calendar sourceAktivVon;
                sourceAktivVon = this.getAktivVon();
                Calendar copyAktivVon = ((Calendar) strategy.copy(LocatorUtils.property(locator, "aktivVon", sourceAktivVon), sourceAktivVon));
                copy.setAktivVon(copyAktivVon);
            } else {
                copy.aktivVon = null;
            }
            if (this.aktivBis!= null) {
                Calendar sourceAktivBis;
                sourceAktivBis = this.getAktivBis();
                Calendar copyAktivBis = ((Calendar) strategy.copy(LocatorUtils.property(locator, "aktivBis", sourceAktivBis), sourceAktivBis));
                copy.setAktivBis(copyAktivBis);
            } else {
                copy.aktivBis = null;
            }
            if (this.openimmoObid!= null) {
                String sourceOpenimmoObid;
                sourceOpenimmoObid = this.getOpenimmoObid();
                String copyOpenimmoObid = ((String) strategy.copy(LocatorUtils.property(locator, "openimmoObid", sourceOpenimmoObid), sourceOpenimmoObid));
                copy.setOpenimmoObid(copyOpenimmoObid);
            } else {
                copy.openimmoObid = null;
            }
            if (this.kennungUrsprung!= null) {
                String sourceKennungUrsprung;
                sourceKennungUrsprung = this.getKennungUrsprung();
                String copyKennungUrsprung = ((String) strategy.copy(LocatorUtils.property(locator, "kennungUrsprung", sourceKennungUrsprung), sourceKennungUrsprung));
                copy.setKennungUrsprung(copyKennungUrsprung);
            } else {
                copy.kennungUrsprung = null;
            }
            if (this.standVom!= null) {
                Calendar sourceStandVom;
                sourceStandVom = this.getStandVom();
                Calendar copyStandVom = ((Calendar) strategy.copy(LocatorUtils.property(locator, "standVom", sourceStandVom), sourceStandVom));
                copy.setStandVom(copyStandVom);
            } else {
                copy.standVom = null;
            }
            if (this.weitergabeGenerell!= null) {
                Boolean sourceWeitergabeGenerell;
                sourceWeitergabeGenerell = this.isWeitergabeGenerell();
                Boolean copyWeitergabeGenerell = ((Boolean) strategy.copy(LocatorUtils.property(locator, "weitergabeGenerell", sourceWeitergabeGenerell), sourceWeitergabeGenerell));
                copy.setWeitergabeGenerell(copyWeitergabeGenerell);
            } else {
                copy.weitergabeGenerell = null;
            }
            if (this.weitergabePositiv!= null) {
                String sourceWeitergabePositiv;
                sourceWeitergabePositiv = this.getWeitergabePositiv();
                String copyWeitergabePositiv = ((String) strategy.copy(LocatorUtils.property(locator, "weitergabePositiv", sourceWeitergabePositiv), sourceWeitergabePositiv));
                copy.setWeitergabePositiv(copyWeitergabePositiv);
            } else {
                copy.weitergabePositiv = null;
            }
            if (this.weitergabeNegativ!= null) {
                String sourceWeitergabeNegativ;
                sourceWeitergabeNegativ = this.getWeitergabeNegativ();
                String copyWeitergabeNegativ = ((String) strategy.copy(LocatorUtils.property(locator, "weitergabeNegativ", sourceWeitergabeNegativ), sourceWeitergabeNegativ));
                copy.setWeitergabeNegativ(copyWeitergabeNegativ);
            } else {
                copy.weitergabeNegativ = null;
            }
            if (this.gruppenKennung!= null) {
                String sourceGruppenKennung;
                sourceGruppenKennung = this.getGruppenKennung();
                String copyGruppenKennung = ((String) strategy.copy(LocatorUtils.property(locator, "gruppenKennung", sourceGruppenKennung), sourceGruppenKennung));
                copy.setGruppenKennung(copyGruppenKennung);
            } else {
                copy.gruppenKennung = null;
            }
            if (this.master!= null) {
                Master sourceMaster;
                sourceMaster = this.getMaster();
                Master copyMaster = ((Master) strategy.copy(LocatorUtils.property(locator, "master", sourceMaster), sourceMaster));
                copy.setMaster(copyMaster);
            } else {
                copy.master = null;
            }
            if (this.sprache!= null) {
                String sourceSprache;
                sourceSprache = this.getSprache();
                String copySprache = ((String) strategy.copy(LocatorUtils.property(locator, "sprache", sourceSprache), sourceSprache));
                copy.setSprache(copySprache);
            } else {
                copy.sprache = null;
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
        return new VerwaltungTechn();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VerwaltungTechn)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VerwaltungTechn that = ((VerwaltungTechn) object);
        {
            String lhsObjektnrIntern;
            lhsObjektnrIntern = this.getObjektnrIntern();
            String rhsObjektnrIntern;
            rhsObjektnrIntern = that.getObjektnrIntern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektnrIntern", lhsObjektnrIntern), LocatorUtils.property(thatLocator, "objektnrIntern", rhsObjektnrIntern), lhsObjektnrIntern, rhsObjektnrIntern)) {
                return false;
            }
        }
        {
            String lhsObjektnrExtern;
            lhsObjektnrExtern = this.getObjektnrExtern();
            String rhsObjektnrExtern;
            rhsObjektnrExtern = that.getObjektnrExtern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektnrExtern", lhsObjektnrExtern), LocatorUtils.property(thatLocator, "objektnrExtern", rhsObjektnrExtern), lhsObjektnrExtern, rhsObjektnrExtern)) {
                return false;
            }
        }
        {
            Aktion lhsAktion;
            lhsAktion = this.getAktion();
            Aktion rhsAktion;
            rhsAktion = that.getAktion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktion", lhsAktion), LocatorUtils.property(thatLocator, "aktion", rhsAktion), lhsAktion, rhsAktion)) {
                return false;
            }
        }
        {
            Calendar lhsAktivVon;
            lhsAktivVon = this.getAktivVon();
            Calendar rhsAktivVon;
            rhsAktivVon = that.getAktivVon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktivVon", lhsAktivVon), LocatorUtils.property(thatLocator, "aktivVon", rhsAktivVon), lhsAktivVon, rhsAktivVon)) {
                return false;
            }
        }
        {
            Calendar lhsAktivBis;
            lhsAktivBis = this.getAktivBis();
            Calendar rhsAktivBis;
            rhsAktivBis = that.getAktivBis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktivBis", lhsAktivBis), LocatorUtils.property(thatLocator, "aktivBis", rhsAktivBis), lhsAktivBis, rhsAktivBis)) {
                return false;
            }
        }
        {
            String lhsOpenimmoObid;
            lhsOpenimmoObid = this.getOpenimmoObid();
            String rhsOpenimmoObid;
            rhsOpenimmoObid = that.getOpenimmoObid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "openimmoObid", lhsOpenimmoObid), LocatorUtils.property(thatLocator, "openimmoObid", rhsOpenimmoObid), lhsOpenimmoObid, rhsOpenimmoObid)) {
                return false;
            }
        }
        {
            String lhsKennungUrsprung;
            lhsKennungUrsprung = this.getKennungUrsprung();
            String rhsKennungUrsprung;
            rhsKennungUrsprung = that.getKennungUrsprung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kennungUrsprung", lhsKennungUrsprung), LocatorUtils.property(thatLocator, "kennungUrsprung", rhsKennungUrsprung), lhsKennungUrsprung, rhsKennungUrsprung)) {
                return false;
            }
        }
        {
            Calendar lhsStandVom;
            lhsStandVom = this.getStandVom();
            Calendar rhsStandVom;
            rhsStandVom = that.getStandVom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standVom", lhsStandVom), LocatorUtils.property(thatLocator, "standVom", rhsStandVom), lhsStandVom, rhsStandVom)) {
                return false;
            }
        }
        {
            Boolean lhsWeitergabeGenerell;
            lhsWeitergabeGenerell = this.isWeitergabeGenerell();
            Boolean rhsWeitergabeGenerell;
            rhsWeitergabeGenerell = that.isWeitergabeGenerell();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weitergabeGenerell", lhsWeitergabeGenerell), LocatorUtils.property(thatLocator, "weitergabeGenerell", rhsWeitergabeGenerell), lhsWeitergabeGenerell, rhsWeitergabeGenerell)) {
                return false;
            }
        }
        {
            String lhsWeitergabePositiv;
            lhsWeitergabePositiv = this.getWeitergabePositiv();
            String rhsWeitergabePositiv;
            rhsWeitergabePositiv = that.getWeitergabePositiv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weitergabePositiv", lhsWeitergabePositiv), LocatorUtils.property(thatLocator, "weitergabePositiv", rhsWeitergabePositiv), lhsWeitergabePositiv, rhsWeitergabePositiv)) {
                return false;
            }
        }
        {
            String lhsWeitergabeNegativ;
            lhsWeitergabeNegativ = this.getWeitergabeNegativ();
            String rhsWeitergabeNegativ;
            rhsWeitergabeNegativ = that.getWeitergabeNegativ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weitergabeNegativ", lhsWeitergabeNegativ), LocatorUtils.property(thatLocator, "weitergabeNegativ", rhsWeitergabeNegativ), lhsWeitergabeNegativ, rhsWeitergabeNegativ)) {
                return false;
            }
        }
        {
            String lhsGruppenKennung;
            lhsGruppenKennung = this.getGruppenKennung();
            String rhsGruppenKennung;
            rhsGruppenKennung = that.getGruppenKennung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gruppenKennung", lhsGruppenKennung), LocatorUtils.property(thatLocator, "gruppenKennung", rhsGruppenKennung), lhsGruppenKennung, rhsGruppenKennung)) {
                return false;
            }
        }
        {
            Master lhsMaster;
            lhsMaster = this.getMaster();
            Master rhsMaster;
            rhsMaster = that.getMaster();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "master", lhsMaster), LocatorUtils.property(thatLocator, "master", rhsMaster), lhsMaster, rhsMaster)) {
                return false;
            }
        }
        {
            String lhsSprache;
            lhsSprache = this.getSprache();
            String rhsSprache;
            rhsSprache = that.getSprache();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sprache", lhsSprache), LocatorUtils.property(thatLocator, "sprache", rhsSprache), lhsSprache, rhsSprache)) {
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
