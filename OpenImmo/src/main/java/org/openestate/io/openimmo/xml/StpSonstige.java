
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 * Java class for &lt;stp_sonstige&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "stp_sonstige")
public class StpSonstige
    extends Stellplatz
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "platzart")
    protected StpSonstige.Platzart platzart;
    @XmlAttribute(name = "bemerkung")
    protected String bemerkung;

    /**
     * Gets the value of the platzart property.
     *
     * @return
     *     possible object is
     *     {@link StpSonstige.Platzart }
     *
     */
    public StpSonstige.Platzart getPlatzart() {
        return platzart;
    }

    /**
     * Sets the value of the platzart property.
     *
     * @param value
     *     allowed object is
     *     {@link StpSonstige.Platzart }
     *
     */
    public void setPlatzart(StpSonstige.Platzart value) {
        this.platzart = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            StpSonstige.Platzart thePlatzart;
            thePlatzart = this.getPlatzart();
            strategy.appendField(locator, this, "platzart", buffer, thePlatzart);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof StpSonstige) {
            final StpSonstige copy = ((StpSonstige) draftCopy);
            if (this.platzart!= null) {
                StpSonstige.Platzart sourcePlatzart;
                sourcePlatzart = this.getPlatzart();
                StpSonstige.Platzart copyPlatzart = ((StpSonstige.Platzart) strategy.copy(LocatorUtils.property(locator, "platzart", sourcePlatzart), sourcePlatzart));
                copy.setPlatzart(copyPlatzart);
            } else {
                copy.platzart = null;
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
        return new StpSonstige();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StpSonstige)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final StpSonstige that = ((StpSonstige) object);
        {
            StpSonstige.Platzart lhsPlatzart;
            lhsPlatzart = this.getPlatzart();
            StpSonstige.Platzart rhsPlatzart;
            rhsPlatzart = that.getPlatzart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "platzart", lhsPlatzart), LocatorUtils.property(thatLocator, "platzart", rhsPlatzart), lhsPlatzart, rhsPlatzart)) {
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
     * Java enum for <em>platzart</em> attribute in &lt;stp_sonstige&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Platzart {

        FREIPLATZ,
        GARAGE,
        TIEFGARAGE,
        CARPORT,
        DUPLEX,
        PARKHAUS,
        SONSTIGES;

        public String value() {
            return name();
        }

        public static StpSonstige.Platzart fromValue(String v) {
            return valueOf(v);
        }

    }

}