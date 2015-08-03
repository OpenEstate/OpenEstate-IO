
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * <p>Java class for AmtsgerichtTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmtsgerichtTyp"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.immobilienscout24.de/immobilientransfer&gt;Text40Typ"&gt;
 *       &lt;attribute name="BundeslandCode" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}ISOBundeslaenderCodeTyp" /&gt;
 *       &lt;attribute name="Telefon" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Text15Typ" /&gt;
 *       &lt;attribute name="Aktenzeichen" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Text15Typ" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmtsgerichtTyp", propOrder = {
    "value"
})
public class AmtsgerichtTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected String value;
    @XmlAttribute(name = "BundeslandCode", required = true)
    protected ISOBundeslaenderCodeTyp bundeslandCode;
    @XmlAttribute(name = "Telefon", required = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String telefon;
    @XmlAttribute(name = "Aktenzeichen", required = true)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected String aktenzeichen;

    /**
     * Text, maximal 40 Zeichen
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the bundeslandCode property.
     * 
     * @return
     *     possible object is
     *     {@link ISOBundeslaenderCodeTyp }
     *     
     */
    public ISOBundeslaenderCodeTyp getBundeslandCode() {
        return bundeslandCode;
    }

    /**
     * Sets the value of the bundeslandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISOBundeslaenderCodeTyp }
     *     
     */
    public void setBundeslandCode(ISOBundeslaenderCodeTyp value) {
        this.bundeslandCode = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the aktenzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktenzeichen() {
        return aktenzeichen;
    }

    /**
     * Sets the value of the aktenzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktenzeichen(String value) {
        this.aktenzeichen = value;
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
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            ISOBundeslaenderCodeTyp theBundeslandCode;
            theBundeslandCode = this.getBundeslandCode();
            strategy.appendField(locator, this, "bundeslandCode", buffer, theBundeslandCode);
        }
        {
            String theTelefon;
            theTelefon = this.getTelefon();
            strategy.appendField(locator, this, "telefon", buffer, theTelefon);
        }
        {
            String theAktenzeichen;
            theAktenzeichen = this.getAktenzeichen();
            strategy.appendField(locator, this, "aktenzeichen", buffer, theAktenzeichen);
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
        if (draftCopy instanceof AmtsgerichtTyp) {
            final AmtsgerichtTyp copy = ((AmtsgerichtTyp) draftCopy);
            if (this.value!= null) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.bundeslandCode!= null) {
                ISOBundeslaenderCodeTyp sourceBundeslandCode;
                sourceBundeslandCode = this.getBundeslandCode();
                ISOBundeslaenderCodeTyp copyBundeslandCode = ((ISOBundeslaenderCodeTyp) strategy.copy(LocatorUtils.property(locator, "bundeslandCode", sourceBundeslandCode), sourceBundeslandCode));
                copy.setBundeslandCode(copyBundeslandCode);
            } else {
                copy.bundeslandCode = null;
            }
            if (this.telefon!= null) {
                String sourceTelefon;
                sourceTelefon = this.getTelefon();
                String copyTelefon = ((String) strategy.copy(LocatorUtils.property(locator, "telefon", sourceTelefon), sourceTelefon));
                copy.setTelefon(copyTelefon);
            } else {
                copy.telefon = null;
            }
            if (this.aktenzeichen!= null) {
                String sourceAktenzeichen;
                sourceAktenzeichen = this.getAktenzeichen();
                String copyAktenzeichen = ((String) strategy.copy(LocatorUtils.property(locator, "aktenzeichen", sourceAktenzeichen), sourceAktenzeichen));
                copy.setAktenzeichen(copyAktenzeichen);
            } else {
                copy.aktenzeichen = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AmtsgerichtTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AmtsgerichtTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AmtsgerichtTyp that = ((AmtsgerichtTyp) object);
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            ISOBundeslaenderCodeTyp lhsBundeslandCode;
            lhsBundeslandCode = this.getBundeslandCode();
            ISOBundeslaenderCodeTyp rhsBundeslandCode;
            rhsBundeslandCode = that.getBundeslandCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bundeslandCode", lhsBundeslandCode), LocatorUtils.property(thatLocator, "bundeslandCode", rhsBundeslandCode), lhsBundeslandCode, rhsBundeslandCode)) {
                return false;
            }
        }
        {
            String lhsTelefon;
            lhsTelefon = this.getTelefon();
            String rhsTelefon;
            rhsTelefon = that.getTelefon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telefon", lhsTelefon), LocatorUtils.property(thatLocator, "telefon", rhsTelefon), lhsTelefon, rhsTelefon)) {
                return false;
            }
        }
        {
            String lhsAktenzeichen;
            lhsAktenzeichen = this.getAktenzeichen();
            String rhsAktenzeichen;
            rhsAktenzeichen = that.getAktenzeichen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktenzeichen", lhsAktenzeichen), LocatorUtils.property(thatLocator, "aktenzeichen", rhsAktenzeichen), lhsAktenzeichen, rhsAktenzeichen)) {
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
