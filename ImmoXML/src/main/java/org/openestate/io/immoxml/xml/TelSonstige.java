
package org.openestate.io.immoxml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.immoxml.de>kontakt">
 *       &lt;attribute name="telefonart">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="TEL_ZENTRALE"/>
 *             &lt;enumeration value="TEL_DURCHW"/>
 *             &lt;enumeration value="TEL_PRIVAT"/>
 *             &lt;enumeration value="TEL_HANDY"/>
 *             &lt;enumeration value="TEL_FAX"/>
 *             &lt;enumeration value="TEL_SONSTIGE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="bemerkung" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "tel_sonstige")
public class TelSonstige
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "telefonart")
    protected TelSonstige.Telefonart telefonart;
    @XmlAttribute(name = "bemerkung")
    protected String bemerkung;

    /**
     * E-Mail
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
     * Gets the value of the telefonart property.
     * 
     * @return
     *     possible object is
     *     {@link TelSonstige.Telefonart }
     *     
     */
    public TelSonstige.Telefonart getTelefonart() {
        return telefonart;
    }

    /**
     * Sets the value of the telefonart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelSonstige.Telefonart }
     *     
     */
    public void setTelefonart(TelSonstige.Telefonart value) {
        this.telefonart = value;
    }

    /**
     * Gets the value of the bemerkung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the value of the bemerkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBemerkung(String value) {
        this.bemerkung = value;
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
            TelSonstige.Telefonart theTelefonart;
            theTelefonart = this.getTelefonart();
            strategy.appendField(locator, this, "telefonart", buffer, theTelefonart);
        }
        {
            String theBemerkung;
            theBemerkung = this.getBemerkung();
            strategy.appendField(locator, this, "bemerkung", buffer, theBemerkung);
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
        if (draftCopy instanceof TelSonstige) {
            final TelSonstige copy = ((TelSonstige) draftCopy);
            if (this.value!= null) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.telefonart!= null) {
                TelSonstige.Telefonart sourceTelefonart;
                sourceTelefonart = this.getTelefonart();
                TelSonstige.Telefonart copyTelefonart = ((TelSonstige.Telefonart) strategy.copy(LocatorUtils.property(locator, "telefonart", sourceTelefonart), sourceTelefonart));
                copy.setTelefonart(copyTelefonart);
            } else {
                copy.telefonart = null;
            }
            if (this.bemerkung!= null) {
                String sourceBemerkung;
                sourceBemerkung = this.getBemerkung();
                String copyBemerkung = ((String) strategy.copy(LocatorUtils.property(locator, "bemerkung", sourceBemerkung), sourceBemerkung));
                copy.setBemerkung(copyBemerkung);
            } else {
                copy.bemerkung = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TelSonstige();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TelSonstige)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TelSonstige that = ((TelSonstige) object);
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
            TelSonstige.Telefonart lhsTelefonart;
            lhsTelefonart = this.getTelefonart();
            TelSonstige.Telefonart rhsTelefonart;
            rhsTelefonart = that.getTelefonart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telefonart", lhsTelefonart), LocatorUtils.property(thatLocator, "telefonart", rhsTelefonart), lhsTelefonart, rhsTelefonart)) {
                return false;
            }
        }
        {
            String lhsBemerkung;
            lhsBemerkung = this.getBemerkung();
            String rhsBemerkung;
            rhsBemerkung = that.getBemerkung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bemerkung", lhsBemerkung), LocatorUtils.property(thatLocator, "bemerkung", rhsBemerkung), lhsBemerkung, rhsBemerkung)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="TEL_ZENTRALE"/>
     *     &lt;enumeration value="TEL_DURCHW"/>
     *     &lt;enumeration value="TEL_PRIVAT"/>
     *     &lt;enumeration value="TEL_HANDY"/>
     *     &lt;enumeration value="TEL_FAX"/>
     *     &lt;enumeration value="TEL_SONSTIGE"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum Telefonart {

        TEL_ZENTRALE,
        TEL_DURCHW,
        TEL_PRIVAT,
        TEL_HANDY,
        TEL_FAX,
        TEL_SONSTIGE;

        public String value() {
            return name();
        }

        public static TelSonstige.Telefonart fromValue(String v) {
            return valueOf(v);
        }

    }

}
