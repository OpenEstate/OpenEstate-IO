
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 * Java class for &lt;interessent&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intId",
    "anrede",
    "vorname",
    "nachname",
    "firma",
    "strasse",
    "postfach",
    "plz",
    "ort",
    "tel",
    "fax",
    "mobil",
    "email",
    "bevorzugt",
    "wunsch",
    "anfrage",
    "userDefinedExtend"
})
@XmlRootElement(name = "interessent")
public class Interessent implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "int_id")
    protected String intId;
    protected String anrede;
    protected String vorname;
    protected String nachname;
    protected String firma;
    protected String strasse;
    protected String postfach;
    protected String plz;
    protected String ort;
    protected String tel;
    protected String fax;
    protected String mobil;
    protected String email;
    protected List<Interessent.Bevorzugt> bevorzugt;
    protected List<Interessent.Wunsch> wunsch;
    protected String anfrage;
    @XmlElement(name = "user_defined_extend")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the intId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIntId() {
        return intId;
    }

    /**
     * Sets the value of the intId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIntId(String value) {
        this.intId = value;
    }

    /**
     * Gets the value of the anrede property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAnrede() {
        return anrede;
    }

    /**
     * Sets the value of the anrede property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAnrede(String value) {
        this.anrede = value;
    }

    /**
     * Gets the value of the vorname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Sets the value of the vorname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVorname(String value) {
        this.vorname = value;
    }

    /**
     * Gets the value of the nachname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * Sets the value of the nachname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNachname(String value) {
        this.nachname = value;
    }

    /**
     * Gets the value of the firma property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirma() {
        return firma;
    }

    /**
     * Sets the value of the firma property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirma(String value) {
        this.firma = value;
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
     * Gets the value of the postfach property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostfach() {
        return postfach;
    }

    /**
     * Sets the value of the postfach property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostfach(String value) {
        this.postfach = value;
    }

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
     * Gets the value of the tel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the fax property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the mobil property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMobil() {
        return mobil;
    }

    /**
     * Sets the value of the mobil property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMobil(String value) {
        this.mobil = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the bevorzugt property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bevorzugt property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBevorzugt().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interessent.Bevorzugt }
     *
     *
     */
    public List<Interessent.Bevorzugt> getBevorzugt() {
        if (bevorzugt == null) {
            bevorzugt = new ArrayList<Interessent.Bevorzugt>();
        }
        return this.bevorzugt;
    }

    /**
     * Gets the value of the wunsch property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wunsch property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWunsch().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interessent.Wunsch }
     *
     *
     */
    public List<Interessent.Wunsch> getWunsch() {
        if (wunsch == null) {
            wunsch = new ArrayList<Interessent.Wunsch>();
        }
        return this.wunsch;
    }

    /**
     * Gets the value of the anfrage property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAnfrage() {
        return anfrage;
    }

    /**
     * Sets the value of the anfrage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAnfrage(String value) {
        this.anfrage = value;
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
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theIntId;
            theIntId = this.getIntId();
            strategy.appendField(locator, this, "intId", buffer, theIntId, (this.intId!= null));
        }
        {
            String theAnrede;
            theAnrede = this.getAnrede();
            strategy.appendField(locator, this, "anrede", buffer, theAnrede, (this.anrede!= null));
        }
        {
            String theVorname;
            theVorname = this.getVorname();
            strategy.appendField(locator, this, "vorname", buffer, theVorname, (this.vorname!= null));
        }
        {
            String theNachname;
            theNachname = this.getNachname();
            strategy.appendField(locator, this, "nachname", buffer, theNachname, (this.nachname!= null));
        }
        {
            String theFirma;
            theFirma = this.getFirma();
            strategy.appendField(locator, this, "firma", buffer, theFirma, (this.firma!= null));
        }
        {
            String theStrasse;
            theStrasse = this.getStrasse();
            strategy.appendField(locator, this, "strasse", buffer, theStrasse, (this.strasse!= null));
        }
        {
            String thePostfach;
            thePostfach = this.getPostfach();
            strategy.appendField(locator, this, "postfach", buffer, thePostfach, (this.postfach!= null));
        }
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
            String theTel;
            theTel = this.getTel();
            strategy.appendField(locator, this, "tel", buffer, theTel, (this.tel!= null));
        }
        {
            String theFax;
            theFax = this.getFax();
            strategy.appendField(locator, this, "fax", buffer, theFax, (this.fax!= null));
        }
        {
            String theMobil;
            theMobil = this.getMobil();
            strategy.appendField(locator, this, "mobil", buffer, theMobil, (this.mobil!= null));
        }
        {
            String theEmail;
            theEmail = this.getEmail();
            strategy.appendField(locator, this, "email", buffer, theEmail, (this.email!= null));
        }
        {
            List<Interessent.Bevorzugt> theBevorzugt;
            theBevorzugt = (((this.bevorzugt!= null)&&(!this.bevorzugt.isEmpty()))?this.getBevorzugt():null);
            strategy.appendField(locator, this, "bevorzugt", buffer, theBevorzugt, ((this.bevorzugt!= null)&&(!this.bevorzugt.isEmpty())));
        }
        {
            List<Interessent.Wunsch> theWunsch;
            theWunsch = (((this.wunsch!= null)&&(!this.wunsch.isEmpty()))?this.getWunsch():null);
            strategy.appendField(locator, this, "wunsch", buffer, theWunsch, ((this.wunsch!= null)&&(!this.wunsch.isEmpty())));
        }
        {
            String theAnfrage;
            theAnfrage = this.getAnfrage();
            strategy.appendField(locator, this, "anfrage", buffer, theAnfrage, (this.anfrage!= null));
        }
        {
            List<UserDefinedExtend> theUserDefinedExtend;
            theUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            strategy.appendField(locator, this, "userDefinedExtend", buffer, theUserDefinedExtend, ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Interessent) {
            final Interessent copy = ((Interessent) draftCopy);
            {
                Boolean intIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.intId!= null));
                if (intIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIntId;
                    sourceIntId = this.getIntId();
                    String copyIntId = ((String) strategy.copy(LocatorUtils.property(locator, "intId", sourceIntId), sourceIntId, (this.intId!= null)));
                    copy.setIntId(copyIntId);
                } else {
                    if (intIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.intId = null;
                    }
                }
            }
            {
                Boolean anredeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anrede!= null));
                if (anredeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAnrede;
                    sourceAnrede = this.getAnrede();
                    String copyAnrede = ((String) strategy.copy(LocatorUtils.property(locator, "anrede", sourceAnrede), sourceAnrede, (this.anrede!= null)));
                    copy.setAnrede(copyAnrede);
                } else {
                    if (anredeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anrede = null;
                    }
                }
            }
            {
                Boolean vornameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vorname!= null));
                if (vornameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVorname;
                    sourceVorname = this.getVorname();
                    String copyVorname = ((String) strategy.copy(LocatorUtils.property(locator, "vorname", sourceVorname), sourceVorname, (this.vorname!= null)));
                    copy.setVorname(copyVorname);
                } else {
                    if (vornameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vorname = null;
                    }
                }
            }
            {
                Boolean nachnameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nachname!= null));
                if (nachnameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNachname;
                    sourceNachname = this.getNachname();
                    String copyNachname = ((String) strategy.copy(LocatorUtils.property(locator, "nachname", sourceNachname), sourceNachname, (this.nachname!= null)));
                    copy.setNachname(copyNachname);
                } else {
                    if (nachnameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nachname = null;
                    }
                }
            }
            {
                Boolean firmaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.firma!= null));
                if (firmaShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFirma;
                    sourceFirma = this.getFirma();
                    String copyFirma = ((String) strategy.copy(LocatorUtils.property(locator, "firma", sourceFirma), sourceFirma, (this.firma!= null)));
                    copy.setFirma(copyFirma);
                } else {
                    if (firmaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firma = null;
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
                Boolean postfachShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.postfach!= null));
                if (postfachShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePostfach;
                    sourcePostfach = this.getPostfach();
                    String copyPostfach = ((String) strategy.copy(LocatorUtils.property(locator, "postfach", sourcePostfach), sourcePostfach, (this.postfach!= null)));
                    copy.setPostfach(copyPostfach);
                } else {
                    if (postfachShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.postfach = null;
                    }
                }
            }
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
                Boolean telShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tel!= null));
                if (telShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTel;
                    sourceTel = this.getTel();
                    String copyTel = ((String) strategy.copy(LocatorUtils.property(locator, "tel", sourceTel), sourceTel, (this.tel!= null)));
                    copy.setTel(copyTel);
                } else {
                    if (telShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tel = null;
                    }
                }
            }
            {
                Boolean faxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fax!= null));
                if (faxShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFax;
                    sourceFax = this.getFax();
                    String copyFax = ((String) strategy.copy(LocatorUtils.property(locator, "fax", sourceFax), sourceFax, (this.fax!= null)));
                    copy.setFax(copyFax);
                } else {
                    if (faxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fax = null;
                    }
                }
            }
            {
                Boolean mobilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mobil!= null));
                if (mobilShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMobil;
                    sourceMobil = this.getMobil();
                    String copyMobil = ((String) strategy.copy(LocatorUtils.property(locator, "mobil", sourceMobil), sourceMobil, (this.mobil!= null)));
                    copy.setMobil(copyMobil);
                } else {
                    if (mobilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mobil = null;
                    }
                }
            }
            {
                Boolean emailShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.email!= null));
                if (emailShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEmail;
                    sourceEmail = this.getEmail();
                    String copyEmail = ((String) strategy.copy(LocatorUtils.property(locator, "email", sourceEmail), sourceEmail, (this.email!= null)));
                    copy.setEmail(copyEmail);
                } else {
                    if (emailShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.email = null;
                    }
                }
            }
            {
                Boolean bevorzugtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.bevorzugt!= null)&&(!this.bevorzugt.isEmpty())));
                if (bevorzugtShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Interessent.Bevorzugt> sourceBevorzugt;
                    sourceBevorzugt = (((this.bevorzugt!= null)&&(!this.bevorzugt.isEmpty()))?this.getBevorzugt():null);
                    @SuppressWarnings("unchecked")
                    List<Interessent.Bevorzugt> copyBevorzugt = ((List<Interessent.Bevorzugt> ) strategy.copy(LocatorUtils.property(locator, "bevorzugt", sourceBevorzugt), sourceBevorzugt, ((this.bevorzugt!= null)&&(!this.bevorzugt.isEmpty()))));
                    copy.bevorzugt = null;
                    if (copyBevorzugt!= null) {
                        List<Interessent.Bevorzugt> uniqueBevorzugtl = copy.getBevorzugt();
                        uniqueBevorzugtl.addAll(copyBevorzugt);
                    }
                } else {
                    if (bevorzugtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bevorzugt = null;
                    }
                }
            }
            {
                Boolean wunschShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.wunsch!= null)&&(!this.wunsch.isEmpty())));
                if (wunschShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Interessent.Wunsch> sourceWunsch;
                    sourceWunsch = (((this.wunsch!= null)&&(!this.wunsch.isEmpty()))?this.getWunsch():null);
                    @SuppressWarnings("unchecked")
                    List<Interessent.Wunsch> copyWunsch = ((List<Interessent.Wunsch> ) strategy.copy(LocatorUtils.property(locator, "wunsch", sourceWunsch), sourceWunsch, ((this.wunsch!= null)&&(!this.wunsch.isEmpty()))));
                    copy.wunsch = null;
                    if (copyWunsch!= null) {
                        List<Interessent.Wunsch> uniqueWunschl = copy.getWunsch();
                        uniqueWunschl.addAll(copyWunsch);
                    }
                } else {
                    if (wunschShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wunsch = null;
                    }
                }
            }
            {
                Boolean anfrageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anfrage!= null));
                if (anfrageShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAnfrage;
                    sourceAnfrage = this.getAnfrage();
                    String copyAnfrage = ((String) strategy.copy(LocatorUtils.property(locator, "anfrage", sourceAnfrage), sourceAnfrage, (this.anfrage!= null)));
                    copy.setAnfrage(copyAnfrage);
                } else {
                    if (anfrageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anfrage = null;
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

    public Object createNewInstance() {
        return new Interessent();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Interessent that = ((Interessent) object);
        {
            String lhsIntId;
            lhsIntId = this.getIntId();
            String rhsIntId;
            rhsIntId = that.getIntId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intId", lhsIntId), LocatorUtils.property(thatLocator, "intId", rhsIntId), lhsIntId, rhsIntId, (this.intId!= null), (that.intId!= null))) {
                return false;
            }
        }
        {
            String lhsAnrede;
            lhsAnrede = this.getAnrede();
            String rhsAnrede;
            rhsAnrede = that.getAnrede();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anrede", lhsAnrede), LocatorUtils.property(thatLocator, "anrede", rhsAnrede), lhsAnrede, rhsAnrede, (this.anrede!= null), (that.anrede!= null))) {
                return false;
            }
        }
        {
            String lhsVorname;
            lhsVorname = this.getVorname();
            String rhsVorname;
            rhsVorname = that.getVorname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorname", lhsVorname), LocatorUtils.property(thatLocator, "vorname", rhsVorname), lhsVorname, rhsVorname, (this.vorname!= null), (that.vorname!= null))) {
                return false;
            }
        }
        {
            String lhsNachname;
            lhsNachname = this.getNachname();
            String rhsNachname;
            rhsNachname = that.getNachname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nachname", lhsNachname), LocatorUtils.property(thatLocator, "nachname", rhsNachname), lhsNachname, rhsNachname, (this.nachname!= null), (that.nachname!= null))) {
                return false;
            }
        }
        {
            String lhsFirma;
            lhsFirma = this.getFirma();
            String rhsFirma;
            rhsFirma = that.getFirma();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firma", lhsFirma), LocatorUtils.property(thatLocator, "firma", rhsFirma), lhsFirma, rhsFirma, (this.firma!= null), (that.firma!= null))) {
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
            String lhsPostfach;
            lhsPostfach = this.getPostfach();
            String rhsPostfach;
            rhsPostfach = that.getPostfach();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postfach", lhsPostfach), LocatorUtils.property(thatLocator, "postfach", rhsPostfach), lhsPostfach, rhsPostfach, (this.postfach!= null), (that.postfach!= null))) {
                return false;
            }
        }
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
            String lhsTel;
            lhsTel = this.getTel();
            String rhsTel;
            rhsTel = that.getTel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tel", lhsTel), LocatorUtils.property(thatLocator, "tel", rhsTel), lhsTel, rhsTel, (this.tel!= null), (that.tel!= null))) {
                return false;
            }
        }
        {
            String lhsFax;
            lhsFax = this.getFax();
            String rhsFax;
            rhsFax = that.getFax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fax", lhsFax), LocatorUtils.property(thatLocator, "fax", rhsFax), lhsFax, rhsFax, (this.fax!= null), (that.fax!= null))) {
                return false;
            }
        }
        {
            String lhsMobil;
            lhsMobil = this.getMobil();
            String rhsMobil;
            rhsMobil = that.getMobil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobil", lhsMobil), LocatorUtils.property(thatLocator, "mobil", rhsMobil), lhsMobil, rhsMobil, (this.mobil!= null), (that.mobil!= null))) {
                return false;
            }
        }
        {
            String lhsEmail;
            lhsEmail = this.getEmail();
            String rhsEmail;
            rhsEmail = that.getEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail, (this.email!= null), (that.email!= null))) {
                return false;
            }
        }
        {
            List<Interessent.Bevorzugt> lhsBevorzugt;
            lhsBevorzugt = (((this.bevorzugt!= null)&&(!this.bevorzugt.isEmpty()))?this.getBevorzugt():null);
            List<Interessent.Bevorzugt> rhsBevorzugt;
            rhsBevorzugt = (((that.bevorzugt!= null)&&(!that.bevorzugt.isEmpty()))?that.getBevorzugt():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bevorzugt", lhsBevorzugt), LocatorUtils.property(thatLocator, "bevorzugt", rhsBevorzugt), lhsBevorzugt, rhsBevorzugt, ((this.bevorzugt!= null)&&(!this.bevorzugt.isEmpty())), ((that.bevorzugt!= null)&&(!that.bevorzugt.isEmpty())))) {
                return false;
            }
        }
        {
            List<Interessent.Wunsch> lhsWunsch;
            lhsWunsch = (((this.wunsch!= null)&&(!this.wunsch.isEmpty()))?this.getWunsch():null);
            List<Interessent.Wunsch> rhsWunsch;
            rhsWunsch = (((that.wunsch!= null)&&(!that.wunsch.isEmpty()))?that.getWunsch():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wunsch", lhsWunsch), LocatorUtils.property(thatLocator, "wunsch", rhsWunsch), lhsWunsch, rhsWunsch, ((this.wunsch!= null)&&(!this.wunsch.isEmpty())), ((that.wunsch!= null)&&(!that.wunsch.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsAnfrage;
            lhsAnfrage = this.getAnfrage();
            String rhsAnfrage;
            rhsAnfrage = that.getAnfrage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anfrage", lhsAnfrage), LocatorUtils.property(thatLocator, "anfrage", rhsAnfrage), lhsAnfrage, rhsAnfrage, (this.anfrage!= null), (that.anfrage!= null))) {
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

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * Java enum for &lt;bevorzugt&gt; in &lt;interessent&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Bevorzugt {

        EMAIL,
        TEL,
        MOBIL,
        FAX,
        BRIEF;

        public String value() {
            return name();
        }

        public static Interessent.Bevorzugt fromValue(String v) {
            return valueOf(v);
        }

    }


    /**
     * Java enum for &lt;wunsch&gt; in &lt;interessent&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Wunsch {

        BESICHTIGUNG,
        ANRUF,
        DETAIL;

        public String value() {
            return name();
        }

        public static Interessent.Wunsch fromValue(String v) {
            return valueOf(v);
        }

    }

}