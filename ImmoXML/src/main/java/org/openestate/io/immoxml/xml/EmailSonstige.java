
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
 * Java class for &lt;email_sonstige&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "email_sonstige")
public class EmailSonstige
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "emailart")
    protected EmailSonstige.Emailart emailart;
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
     * Gets the value of the emailart property.
     *
     * @return
     *     possible object is
     *     {@link EmailSonstige.Emailart }
     *
     */
    public EmailSonstige.Emailart getEmailart() {
        return emailart;
    }

    /**
     * Sets the value of the emailart property.
     *
     * @param value
     *     allowed object is
     *     {@link EmailSonstige.Emailart }
     *
     */
    public void setEmailart(EmailSonstige.Emailart value) {
        this.emailart = value;
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
            EmailSonstige.Emailart theEmailart;
            theEmailart = this.getEmailart();
            strategy.appendField(locator, this, "emailart", buffer, theEmailart);
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
        if (draftCopy instanceof EmailSonstige) {
            final EmailSonstige copy = ((EmailSonstige) draftCopy);
            if (this.value!= null) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.emailart!= null) {
                EmailSonstige.Emailart sourceEmailart;
                sourceEmailart = this.getEmailart();
                EmailSonstige.Emailart copyEmailart = ((EmailSonstige.Emailart) strategy.copy(LocatorUtils.property(locator, "emailart", sourceEmailart), sourceEmailart));
                copy.setEmailart(copyEmailart);
            } else {
                copy.emailart = null;
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
        return new EmailSonstige();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EmailSonstige that = ((EmailSonstige) object);
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
            EmailSonstige.Emailart lhsEmailart;
            lhsEmailart = this.getEmailart();
            EmailSonstige.Emailart rhsEmailart;
            rhsEmailart = that.getEmailart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailart", lhsEmailart), LocatorUtils.property(thatLocator, "emailart", rhsEmailart), lhsEmailart, rhsEmailart)) {
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
     * Java enum for <em>emailart</em> attribute in &lt;email_sonstige&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Emailart {

        EM_ZENTRALE,
        EM_DIREKT,
        EM_PRIVAT,
        EM_SONSTIGE;

        public String value() {
            return name();
        }

        public static EmailSonstige.Emailart fromValue(String v) {
            return valueOf(v);
        }

    }

}