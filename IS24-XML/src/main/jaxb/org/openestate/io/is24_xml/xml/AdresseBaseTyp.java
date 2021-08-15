
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for AdresseBaseTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdresseBaseTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Strasse"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.immobilienscout24.de/immobilientransfer}Text100Typ"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Hausnummer" type="{http://www.immobilienscout24.de/immobilientransfer}Text30Typ" /&gt;
 *       &lt;attribute name="Postleitzahl" type="{http://www.immobilienscout24.de/immobilientransfer}Text20Typ" /&gt;
 *       &lt;attribute name="Ort" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *       &lt;attribute name="Laenderkennzeichen" type="{http://www.immobilienscout24.de/immobilientransfer}ISOLaenderCodeTyp" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdresseBaseTyp")
@XmlSeeAlso({
    KontaktAdresseTyp.class,
    ImmobilienAdresseBaseTyp.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
public abstract class AdresseBaseTyp implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "Strasse")
    @XmlJavaTypeAdapter(Adapter9 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected String strasse;
    @XmlAttribute(name = "Hausnummer")
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected String hausnummer;
    @XmlAttribute(name = "Postleitzahl")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected String postleitzahl;
    @XmlAttribute(name = "Ort")
    @XmlJavaTypeAdapter(Adapter7 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected String ort;
    @XmlAttribute(name = "Laenderkennzeichen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected ISOLaenderCodeTyp laenderkennzeichen;

    /**
     * Gets the value of the strasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setHausnummer(String value) {
        this.hausnummer = value;
    }

    /**
     * Gets the value of the postleitzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public String getPostleitzahl() {
        return postleitzahl;
    }

    /**
     * Sets the value of the postleitzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setPostleitzahl(String value) {
        this.postleitzahl = value;
    }

    /**
     * Gets the value of the ort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Gets the value of the laenderkennzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link ISOLaenderCodeTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public ISOLaenderCodeTyp getLaenderkennzeichen() {
        return laenderkennzeichen;
    }

    /**
     * Sets the value of the laenderkennzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISOLaenderCodeTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setLaenderkennzeichen(ISOLaenderCodeTyp value) {
        this.laenderkennzeichen = value;
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
            String thePostleitzahl;
            thePostleitzahl = this.getPostleitzahl();
            strategy.appendField(locator, this, "postleitzahl", buffer, thePostleitzahl, (this.postleitzahl!= null));
        }
        {
            String theOrt;
            theOrt = this.getOrt();
            strategy.appendField(locator, this, "ort", buffer, theOrt, (this.ort!= null));
        }
        {
            ISOLaenderCodeTyp theLaenderkennzeichen;
            theLaenderkennzeichen = this.getLaenderkennzeichen();
            strategy.appendField(locator, this, "laenderkennzeichen", buffer, theLaenderkennzeichen, (this.laenderkennzeichen!= null));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof AdresseBaseTyp) {
            final AdresseBaseTyp copy = ((AdresseBaseTyp) target);
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
                Boolean postleitzahlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.postleitzahl!= null));
                if (postleitzahlShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePostleitzahl;
                    sourcePostleitzahl = this.getPostleitzahl();
                    String copyPostleitzahl = ((String) strategy.copy(LocatorUtils.property(locator, "postleitzahl", sourcePostleitzahl), sourcePostleitzahl, (this.postleitzahl!= null)));
                    copy.setPostleitzahl(copyPostleitzahl);
                } else {
                    if (postleitzahlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.postleitzahl = null;
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
                Boolean laenderkennzeichenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.laenderkennzeichen!= null));
                if (laenderkennzeichenShouldBeCopiedAndSet == Boolean.TRUE) {
                    ISOLaenderCodeTyp sourceLaenderkennzeichen;
                    sourceLaenderkennzeichen = this.getLaenderkennzeichen();
                    ISOLaenderCodeTyp copyLaenderkennzeichen = ((ISOLaenderCodeTyp) strategy.copy(LocatorUtils.property(locator, "laenderkennzeichen", sourceLaenderkennzeichen), sourceLaenderkennzeichen, (this.laenderkennzeichen!= null)));
                    copy.setLaenderkennzeichen(copyLaenderkennzeichen);
                } else {
                    if (laenderkennzeichenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.laenderkennzeichen = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AdresseBaseTyp that = ((AdresseBaseTyp) object);
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
            String lhsPostleitzahl;
            lhsPostleitzahl = this.getPostleitzahl();
            String rhsPostleitzahl;
            rhsPostleitzahl = that.getPostleitzahl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postleitzahl", lhsPostleitzahl), LocatorUtils.property(thatLocator, "postleitzahl", rhsPostleitzahl), lhsPostleitzahl, rhsPostleitzahl, (this.postleitzahl!= null), (that.postleitzahl!= null))) {
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
            ISOLaenderCodeTyp lhsLaenderkennzeichen;
            lhsLaenderkennzeichen = this.getLaenderkennzeichen();
            ISOLaenderCodeTyp rhsLaenderkennzeichen;
            rhsLaenderkennzeichen = that.getLaenderkennzeichen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "laenderkennzeichen", lhsLaenderkennzeichen), LocatorUtils.property(thatLocator, "laenderkennzeichen", rhsLaenderkennzeichen), lhsLaenderkennzeichen, rhsLaenderkennzeichen, (this.laenderkennzeichen!= null), (that.laenderkennzeichen!= null))) {
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
