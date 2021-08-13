
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * Java class for &lt;zustand_angaben&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baujahr",
    "letztemodernisierung",
    "zustand",
    "alter",
    "bebaubarNach",
    "erschliessung",
    "erschliessungUmfang",
    "bauzone",
    "altlasten",
    "energiepass",
    "verkaufstatus",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "zustand_angaben")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class ZustandAngaben implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String baujahr;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String letztemodernisierung;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Zustand zustand;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Alter alter;
    @XmlElement(name = "bebaubar_nach")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected BebaubarNach bebaubarNach;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Erschliessung erschliessung;
    @XmlElement(name = "erschliessung_umfang")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected ErschliessungUmfang erschliessungUmfang;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String bauzone;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String altlasten;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected List<Energiepass> energiepass;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Verkaufstatus verkaufstatus;
    @XmlElement(name = "user_defined_simplefield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the baujahr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String getBaujahr() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setBaujahr(String value) {
        this.baujahr = value;
    }

    /**
     * Gets the value of the letztemodernisierung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String getLetztemodernisierung() {
        return letztemodernisierung;
    }

    /**
     * Sets the value of the letztemodernisierung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setLetztemodernisierung(String value) {
        this.letztemodernisierung = value;
    }

    /**
     * Gets the value of the zustand property.
     * 
     * @return
     *     possible object is
     *     {@link Zustand }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Zustand getZustand() {
        return zustand;
    }

    /**
     * Sets the value of the zustand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zustand }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setZustand(Zustand value) {
        this.zustand = value;
    }

    /**
     * Gets the value of the alter property.
     * 
     * @return
     *     possible object is
     *     {@link Alter }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Alter getAlter() {
        return alter;
    }

    /**
     * Sets the value of the alter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Alter }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setAlter(Alter value) {
        this.alter = value;
    }

    /**
     * Gets the value of the bebaubarNach property.
     * 
     * @return
     *     possible object is
     *     {@link BebaubarNach }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public BebaubarNach getBebaubarNach() {
        return bebaubarNach;
    }

    /**
     * Sets the value of the bebaubarNach property.
     * 
     * @param value
     *     allowed object is
     *     {@link BebaubarNach }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setBebaubarNach(BebaubarNach value) {
        this.bebaubarNach = value;
    }

    /**
     * Gets the value of the erschliessung property.
     * 
     * @return
     *     possible object is
     *     {@link Erschliessung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Erschliessung getErschliessung() {
        return erschliessung;
    }

    /**
     * Sets the value of the erschliessung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Erschliessung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setErschliessung(Erschliessung value) {
        this.erschliessung = value;
    }

    /**
     * Gets the value of the erschliessungUmfang property.
     * 
     * @return
     *     possible object is
     *     {@link ErschliessungUmfang }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public ErschliessungUmfang getErschliessungUmfang() {
        return erschliessungUmfang;
    }

    /**
     * Sets the value of the erschliessungUmfang property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErschliessungUmfang }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setErschliessungUmfang(ErschliessungUmfang value) {
        this.erschliessungUmfang = value;
    }

    /**
     * Gets the value of the bauzone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String getBauzone() {
        return bauzone;
    }

    /**
     * Sets the value of the bauzone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setBauzone(String value) {
        this.bauzone = value;
    }

    /**
     * Gets the value of the altlasten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String getAltlasten() {
        return altlasten;
    }

    /**
     * Sets the value of the altlasten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setAltlasten(String value) {
        this.altlasten = value;
    }

    /**
     * Gets the value of the energiepass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energiepass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergiepass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Energiepass }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public List<Energiepass> getEnergiepass() {
        if (energiepass == null) {
            energiepass = new ArrayList<Energiepass>();
        }
        return this.energiepass;
    }

    /**
     * Gets the value of the verkaufstatus property.
     * 
     * @return
     *     possible object is
     *     {@link Verkaufstatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Verkaufstatus getVerkaufstatus() {
        return verkaufstatus;
    }

    /**
     * Sets the value of the verkaufstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Verkaufstatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setVerkaufstatus(Verkaufstatus value) {
        this.verkaufstatus = value;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public List<UserDefinedExtend> getUserDefinedExtend() {
        if (userDefinedExtend == null) {
            userDefinedExtend = new ArrayList<UserDefinedExtend>();
        }
        return this.userDefinedExtend;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theBaujahr;
            theBaujahr = this.getBaujahr();
            strategy.appendField(locator, this, "baujahr", buffer, theBaujahr, (this.baujahr!= null));
        }
        {
            String theLetztemodernisierung;
            theLetztemodernisierung = this.getLetztemodernisierung();
            strategy.appendField(locator, this, "letztemodernisierung", buffer, theLetztemodernisierung, (this.letztemodernisierung!= null));
        }
        {
            Zustand theZustand;
            theZustand = this.getZustand();
            strategy.appendField(locator, this, "zustand", buffer, theZustand, (this.zustand!= null));
        }
        {
            Alter theAlter;
            theAlter = this.getAlter();
            strategy.appendField(locator, this, "alter", buffer, theAlter, (this.alter!= null));
        }
        {
            BebaubarNach theBebaubarNach;
            theBebaubarNach = this.getBebaubarNach();
            strategy.appendField(locator, this, "bebaubarNach", buffer, theBebaubarNach, (this.bebaubarNach!= null));
        }
        {
            Erschliessung theErschliessung;
            theErschliessung = this.getErschliessung();
            strategy.appendField(locator, this, "erschliessung", buffer, theErschliessung, (this.erschliessung!= null));
        }
        {
            ErschliessungUmfang theErschliessungUmfang;
            theErschliessungUmfang = this.getErschliessungUmfang();
            strategy.appendField(locator, this, "erschliessungUmfang", buffer, theErschliessungUmfang, (this.erschliessungUmfang!= null));
        }
        {
            String theBauzone;
            theBauzone = this.getBauzone();
            strategy.appendField(locator, this, "bauzone", buffer, theBauzone, (this.bauzone!= null));
        }
        {
            String theAltlasten;
            theAltlasten = this.getAltlasten();
            strategy.appendField(locator, this, "altlasten", buffer, theAltlasten, (this.altlasten!= null));
        }
        {
            List<Energiepass> theEnergiepass;
            theEnergiepass = (((this.energiepass!= null)&&(!this.energiepass.isEmpty()))?this.getEnergiepass():null);
            strategy.appendField(locator, this, "energiepass", buffer, theEnergiepass, ((this.energiepass!= null)&&(!this.energiepass.isEmpty())));
        }
        {
            Verkaufstatus theVerkaufstatus;
            theVerkaufstatus = this.getVerkaufstatus();
            strategy.appendField(locator, this, "verkaufstatus", buffer, theVerkaufstatus, (this.verkaufstatus!= null));
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ZustandAngaben) {
            final ZustandAngaben copy = ((ZustandAngaben) draftCopy);
            {
                Boolean baujahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.baujahr!= null));
                if (baujahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBaujahr;
                    sourceBaujahr = this.getBaujahr();
                    String copyBaujahr = ((String) strategy.copy(LocatorUtils.property(locator, "baujahr", sourceBaujahr), sourceBaujahr, (this.baujahr!= null)));
                    copy.setBaujahr(copyBaujahr);
                } else {
                    if (baujahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.baujahr = null;
                    }
                }
            }
            {
                Boolean letztemodernisierungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.letztemodernisierung!= null));
                if (letztemodernisierungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLetztemodernisierung;
                    sourceLetztemodernisierung = this.getLetztemodernisierung();
                    String copyLetztemodernisierung = ((String) strategy.copy(LocatorUtils.property(locator, "letztemodernisierung", sourceLetztemodernisierung), sourceLetztemodernisierung, (this.letztemodernisierung!= null)));
                    copy.setLetztemodernisierung(copyLetztemodernisierung);
                } else {
                    if (letztemodernisierungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.letztemodernisierung = null;
                    }
                }
            }
            {
                Boolean zustandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zustand!= null));
                if (zustandShouldBeCopiedAndSet == Boolean.TRUE) {
                    Zustand sourceZustand;
                    sourceZustand = this.getZustand();
                    Zustand copyZustand = ((Zustand) strategy.copy(LocatorUtils.property(locator, "zustand", sourceZustand), sourceZustand, (this.zustand!= null)));
                    copy.setZustand(copyZustand);
                } else {
                    if (zustandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zustand = null;
                    }
                }
            }
            {
                Boolean alterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alter!= null));
                if (alterShouldBeCopiedAndSet == Boolean.TRUE) {
                    Alter sourceAlter;
                    sourceAlter = this.getAlter();
                    Alter copyAlter = ((Alter) strategy.copy(LocatorUtils.property(locator, "alter", sourceAlter), sourceAlter, (this.alter!= null)));
                    copy.setAlter(copyAlter);
                } else {
                    if (alterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alter = null;
                    }
                }
            }
            {
                Boolean bebaubarNachShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bebaubarNach!= null));
                if (bebaubarNachShouldBeCopiedAndSet == Boolean.TRUE) {
                    BebaubarNach sourceBebaubarNach;
                    sourceBebaubarNach = this.getBebaubarNach();
                    BebaubarNach copyBebaubarNach = ((BebaubarNach) strategy.copy(LocatorUtils.property(locator, "bebaubarNach", sourceBebaubarNach), sourceBebaubarNach, (this.bebaubarNach!= null)));
                    copy.setBebaubarNach(copyBebaubarNach);
                } else {
                    if (bebaubarNachShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bebaubarNach = null;
                    }
                }
            }
            {
                Boolean erschliessungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erschliessung!= null));
                if (erschliessungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Erschliessung sourceErschliessung;
                    sourceErschliessung = this.getErschliessung();
                    Erschliessung copyErschliessung = ((Erschliessung) strategy.copy(LocatorUtils.property(locator, "erschliessung", sourceErschliessung), sourceErschliessung, (this.erschliessung!= null)));
                    copy.setErschliessung(copyErschliessung);
                } else {
                    if (erschliessungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erschliessung = null;
                    }
                }
            }
            {
                Boolean erschliessungUmfangShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erschliessungUmfang!= null));
                if (erschliessungUmfangShouldBeCopiedAndSet == Boolean.TRUE) {
                    ErschliessungUmfang sourceErschliessungUmfang;
                    sourceErschliessungUmfang = this.getErschliessungUmfang();
                    ErschliessungUmfang copyErschliessungUmfang = ((ErschliessungUmfang) strategy.copy(LocatorUtils.property(locator, "erschliessungUmfang", sourceErschliessungUmfang), sourceErschliessungUmfang, (this.erschliessungUmfang!= null)));
                    copy.setErschliessungUmfang(copyErschliessungUmfang);
                } else {
                    if (erschliessungUmfangShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erschliessungUmfang = null;
                    }
                }
            }
            {
                Boolean bauzoneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bauzone!= null));
                if (bauzoneShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBauzone;
                    sourceBauzone = this.getBauzone();
                    String copyBauzone = ((String) strategy.copy(LocatorUtils.property(locator, "bauzone", sourceBauzone), sourceBauzone, (this.bauzone!= null)));
                    copy.setBauzone(copyBauzone);
                } else {
                    if (bauzoneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bauzone = null;
                    }
                }
            }
            {
                Boolean altlastenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.altlasten!= null));
                if (altlastenShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAltlasten;
                    sourceAltlasten = this.getAltlasten();
                    String copyAltlasten = ((String) strategy.copy(LocatorUtils.property(locator, "altlasten", sourceAltlasten), sourceAltlasten, (this.altlasten!= null)));
                    copy.setAltlasten(copyAltlasten);
                } else {
                    if (altlastenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.altlasten = null;
                    }
                }
            }
            {
                Boolean energiepassShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.energiepass!= null)&&(!this.energiepass.isEmpty())));
                if (energiepassShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Energiepass> sourceEnergiepass;
                    sourceEnergiepass = (((this.energiepass!= null)&&(!this.energiepass.isEmpty()))?this.getEnergiepass():null);
                    @SuppressWarnings("unchecked")
                    List<Energiepass> copyEnergiepass = ((List<Energiepass> ) strategy.copy(LocatorUtils.property(locator, "energiepass", sourceEnergiepass), sourceEnergiepass, ((this.energiepass!= null)&&(!this.energiepass.isEmpty()))));
                    copy.energiepass = null;
                    if (copyEnergiepass!= null) {
                        List<Energiepass> uniqueEnergiepassl = copy.getEnergiepass();
                        uniqueEnergiepassl.addAll(copyEnergiepass);
                    }
                } else {
                    if (energiepassShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energiepass = null;
                    }
                }
            }
            {
                Boolean verkaufstatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verkaufstatus!= null));
                if (verkaufstatusShouldBeCopiedAndSet == Boolean.TRUE) {
                    Verkaufstatus sourceVerkaufstatus;
                    sourceVerkaufstatus = this.getVerkaufstatus();
                    Verkaufstatus copyVerkaufstatus = ((Verkaufstatus) strategy.copy(LocatorUtils.property(locator, "verkaufstatus", sourceVerkaufstatus), sourceVerkaufstatus, (this.verkaufstatus!= null)));
                    copy.setVerkaufstatus(copyVerkaufstatus);
                } else {
                    if (verkaufstatusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verkaufstatus = null;
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new ZustandAngaben();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZustandAngaben that = ((ZustandAngaben) object);
        {
            String lhsBaujahr;
            lhsBaujahr = this.getBaujahr();
            String rhsBaujahr;
            rhsBaujahr = that.getBaujahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baujahr", lhsBaujahr), LocatorUtils.property(thatLocator, "baujahr", rhsBaujahr), lhsBaujahr, rhsBaujahr, (this.baujahr!= null), (that.baujahr!= null))) {
                return false;
            }
        }
        {
            String lhsLetztemodernisierung;
            lhsLetztemodernisierung = this.getLetztemodernisierung();
            String rhsLetztemodernisierung;
            rhsLetztemodernisierung = that.getLetztemodernisierung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "letztemodernisierung", lhsLetztemodernisierung), LocatorUtils.property(thatLocator, "letztemodernisierung", rhsLetztemodernisierung), lhsLetztemodernisierung, rhsLetztemodernisierung, (this.letztemodernisierung!= null), (that.letztemodernisierung!= null))) {
                return false;
            }
        }
        {
            Zustand lhsZustand;
            lhsZustand = this.getZustand();
            Zustand rhsZustand;
            rhsZustand = that.getZustand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zustand", lhsZustand), LocatorUtils.property(thatLocator, "zustand", rhsZustand), lhsZustand, rhsZustand, (this.zustand!= null), (that.zustand!= null))) {
                return false;
            }
        }
        {
            Alter lhsAlter;
            lhsAlter = this.getAlter();
            Alter rhsAlter;
            rhsAlter = that.getAlter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alter", lhsAlter), LocatorUtils.property(thatLocator, "alter", rhsAlter), lhsAlter, rhsAlter, (this.alter!= null), (that.alter!= null))) {
                return false;
            }
        }
        {
            BebaubarNach lhsBebaubarNach;
            lhsBebaubarNach = this.getBebaubarNach();
            BebaubarNach rhsBebaubarNach;
            rhsBebaubarNach = that.getBebaubarNach();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bebaubarNach", lhsBebaubarNach), LocatorUtils.property(thatLocator, "bebaubarNach", rhsBebaubarNach), lhsBebaubarNach, rhsBebaubarNach, (this.bebaubarNach!= null), (that.bebaubarNach!= null))) {
                return false;
            }
        }
        {
            Erschliessung lhsErschliessung;
            lhsErschliessung = this.getErschliessung();
            Erschliessung rhsErschliessung;
            rhsErschliessung = that.getErschliessung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erschliessung", lhsErschliessung), LocatorUtils.property(thatLocator, "erschliessung", rhsErschliessung), lhsErschliessung, rhsErschliessung, (this.erschliessung!= null), (that.erschliessung!= null))) {
                return false;
            }
        }
        {
            ErschliessungUmfang lhsErschliessungUmfang;
            lhsErschliessungUmfang = this.getErschliessungUmfang();
            ErschliessungUmfang rhsErschliessungUmfang;
            rhsErschliessungUmfang = that.getErschliessungUmfang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erschliessungUmfang", lhsErschliessungUmfang), LocatorUtils.property(thatLocator, "erschliessungUmfang", rhsErschliessungUmfang), lhsErschliessungUmfang, rhsErschliessungUmfang, (this.erschliessungUmfang!= null), (that.erschliessungUmfang!= null))) {
                return false;
            }
        }
        {
            String lhsBauzone;
            lhsBauzone = this.getBauzone();
            String rhsBauzone;
            rhsBauzone = that.getBauzone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bauzone", lhsBauzone), LocatorUtils.property(thatLocator, "bauzone", rhsBauzone), lhsBauzone, rhsBauzone, (this.bauzone!= null), (that.bauzone!= null))) {
                return false;
            }
        }
        {
            String lhsAltlasten;
            lhsAltlasten = this.getAltlasten();
            String rhsAltlasten;
            rhsAltlasten = that.getAltlasten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "altlasten", lhsAltlasten), LocatorUtils.property(thatLocator, "altlasten", rhsAltlasten), lhsAltlasten, rhsAltlasten, (this.altlasten!= null), (that.altlasten!= null))) {
                return false;
            }
        }
        {
            List<Energiepass> lhsEnergiepass;
            lhsEnergiepass = (((this.energiepass!= null)&&(!this.energiepass.isEmpty()))?this.getEnergiepass():null);
            List<Energiepass> rhsEnergiepass;
            rhsEnergiepass = (((that.energiepass!= null)&&(!that.energiepass.isEmpty()))?that.getEnergiepass():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energiepass", lhsEnergiepass), LocatorUtils.property(thatLocator, "energiepass", rhsEnergiepass), lhsEnergiepass, rhsEnergiepass, ((this.energiepass!= null)&&(!this.energiepass.isEmpty())), ((that.energiepass!= null)&&(!that.energiepass.isEmpty())))) {
                return false;
            }
        }
        {
            Verkaufstatus lhsVerkaufstatus;
            lhsVerkaufstatus = this.getVerkaufstatus();
            Verkaufstatus rhsVerkaufstatus;
            rhsVerkaufstatus = that.getVerkaufstatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verkaufstatus", lhsVerkaufstatus), LocatorUtils.property(thatLocator, "verkaufstatus", rhsVerkaufstatus), lhsVerkaufstatus, rhsVerkaufstatus, (this.verkaufstatus!= null), (that.verkaufstatus!= null))) {
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
