
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
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
public abstract class AdresseBaseTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "Strasse")
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected String strasse;
    @XmlAttribute(name = "Hausnummer")
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected String hausnummer;
    @XmlAttribute(name = "Postleitzahl")
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected String postleitzahl;
    @XmlAttribute(name = "Ort")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String ort;
    @XmlAttribute(name = "Laenderkennzeichen")
    protected ISOLaenderCodeTyp laenderkennzeichen;

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
     * Gets the value of the postleitzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
     * Gets the value of the laenderkennzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link ISOLaenderCodeTyp }
     *     
     */
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
    public void setLaenderkennzeichen(ISOLaenderCodeTyp value) {
        this.laenderkennzeichen = value;
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
            String thePostleitzahl;
            thePostleitzahl = this.getPostleitzahl();
            strategy.appendField(locator, this, "postleitzahl", buffer, thePostleitzahl);
        }
        {
            String theOrt;
            theOrt = this.getOrt();
            strategy.appendField(locator, this, "ort", buffer, theOrt);
        }
        {
            ISOLaenderCodeTyp theLaenderkennzeichen;
            theLaenderkennzeichen = this.getLaenderkennzeichen();
            strategy.appendField(locator, this, "laenderkennzeichen", buffer, theLaenderkennzeichen);
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof AdresseBaseTyp) {
            final AdresseBaseTyp copy = ((AdresseBaseTyp) target);
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
            if (this.postleitzahl!= null) {
                String sourcePostleitzahl;
                sourcePostleitzahl = this.getPostleitzahl();
                String copyPostleitzahl = ((String) strategy.copy(LocatorUtils.property(locator, "postleitzahl", sourcePostleitzahl), sourcePostleitzahl));
                copy.setPostleitzahl(copyPostleitzahl);
            } else {
                copy.postleitzahl = null;
            }
            if (this.ort!= null) {
                String sourceOrt;
                sourceOrt = this.getOrt();
                String copyOrt = ((String) strategy.copy(LocatorUtils.property(locator, "ort", sourceOrt), sourceOrt));
                copy.setOrt(copyOrt);
            } else {
                copy.ort = null;
            }
            if (this.laenderkennzeichen!= null) {
                ISOLaenderCodeTyp sourceLaenderkennzeichen;
                sourceLaenderkennzeichen = this.getLaenderkennzeichen();
                ISOLaenderCodeTyp copyLaenderkennzeichen = ((ISOLaenderCodeTyp) strategy.copy(LocatorUtils.property(locator, "laenderkennzeichen", sourceLaenderkennzeichen), sourceLaenderkennzeichen));
                copy.setLaenderkennzeichen(copyLaenderkennzeichen);
            } else {
                copy.laenderkennzeichen = null;
            }
        }
        return target;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AdresseBaseTyp)) {
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
            String lhsPostleitzahl;
            lhsPostleitzahl = this.getPostleitzahl();
            String rhsPostleitzahl;
            rhsPostleitzahl = that.getPostleitzahl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postleitzahl", lhsPostleitzahl), LocatorUtils.property(thatLocator, "postleitzahl", rhsPostleitzahl), lhsPostleitzahl, rhsPostleitzahl)) {
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
            ISOLaenderCodeTyp lhsLaenderkennzeichen;
            lhsLaenderkennzeichen = this.getLaenderkennzeichen();
            ISOLaenderCodeTyp rhsLaenderkennzeichen;
            rhsLaenderkennzeichen = that.getLaenderkennzeichen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "laenderkennzeichen", lhsLaenderkennzeichen), LocatorUtils.property(thatLocator, "laenderkennzeichen", rhsLaenderkennzeichen), lhsLaenderkennzeichen, rhsLaenderkennzeichen)) {
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
