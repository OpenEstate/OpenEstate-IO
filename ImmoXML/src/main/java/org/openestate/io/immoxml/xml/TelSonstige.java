
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * Java class for &lt;tel_sonstige&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "tel_sonstige")
public class TelSonstige implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
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
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            TelSonstige.Telefonart theTelefonart;
            theTelefonart = this.getTelefonart();
            strategy.appendField(locator, this, "telefonart", buffer, theTelefonart, (this.telefonart!= null));
        }
        {
            String theBemerkung;
            theBemerkung = this.getBemerkung();
            strategy.appendField(locator, this, "bemerkung", buffer, theBemerkung, (this.bemerkung!= null));
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
        if (draftCopy instanceof TelSonstige) {
            final TelSonstige copy = ((TelSonstige) draftCopy);
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceValue;
                    sourceValue = this.getValue();
                    String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean telefonartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.telefonart!= null));
                if (telefonartShouldBeCopiedAndSet == Boolean.TRUE) {
                    TelSonstige.Telefonart sourceTelefonart;
                    sourceTelefonart = this.getTelefonart();
                    TelSonstige.Telefonart copyTelefonart = ((TelSonstige.Telefonart) strategy.copy(LocatorUtils.property(locator, "telefonart", sourceTelefonart), sourceTelefonart, (this.telefonart!= null)));
                    copy.setTelefonart(copyTelefonart);
                } else {
                    if (telefonartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.telefonart = null;
                    }
                }
            }
            {
                Boolean bemerkungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bemerkung!= null));
                if (bemerkungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBemerkung;
                    sourceBemerkung = this.getBemerkung();
                    String copyBemerkung = ((String) strategy.copy(LocatorUtils.property(locator, "bemerkung", sourceBemerkung), sourceBemerkung, (this.bemerkung!= null)));
                    copy.setBemerkung(copyBemerkung);
                } else {
                    if (bemerkungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bemerkung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TelSonstige();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            TelSonstige.Telefonart lhsTelefonart;
            lhsTelefonart = this.getTelefonart();
            TelSonstige.Telefonart rhsTelefonart;
            rhsTelefonart = that.getTelefonart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telefonart", lhsTelefonart), LocatorUtils.property(thatLocator, "telefonart", rhsTelefonart), lhsTelefonart, rhsTelefonart, (this.telefonart!= null), (that.telefonart!= null))) {
                return false;
            }
        }
        {
            String lhsBemerkung;
            lhsBemerkung = this.getBemerkung();
            String rhsBemerkung;
            rhsBemerkung = that.getBemerkung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bemerkung", lhsBemerkung), LocatorUtils.property(thatLocator, "bemerkung", rhsBemerkung), lhsBemerkung, rhsBemerkung, (this.bemerkung!= null), (that.bemerkung!= null))) {
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
     * Java enum for <em>telefonart</em> attribute in &lt;tel_sonstige&gt; elements.

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