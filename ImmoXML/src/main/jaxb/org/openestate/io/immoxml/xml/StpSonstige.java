
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * Java class for &lt;stp_sonstige&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "stp_sonstige")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class StpSonstige
    extends Stellplatz
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "platzart")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected StpSonstige.Platzart platzart;
    @XmlAttribute(name = "bemerkung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String bemerkung;

    /**
     * Gets the value of the platzart property.
     * 
     * @return
     *     possible object is
     *     {@link StpSonstige.Platzart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setBemerkung(String value) {
        this.bemerkung = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            StpSonstige.Platzart thePlatzart;
            thePlatzart = this.getPlatzart();
            strategy.appendField(locator, this, "platzart", buffer, thePlatzart, (this.platzart!= null));
        }
        {
            String theBemerkung;
            theBemerkung = this.getBemerkung();
            strategy.appendField(locator, this, "bemerkung", buffer, theBemerkung, (this.bemerkung!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof StpSonstige) {
            final StpSonstige copy = ((StpSonstige) draftCopy);
            {
                Boolean platzartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.platzart!= null));
                if (platzartShouldBeCopiedAndSet == Boolean.TRUE) {
                    StpSonstige.Platzart sourcePlatzart;
                    sourcePlatzart = this.getPlatzart();
                    StpSonstige.Platzart copyPlatzart = ((StpSonstige.Platzart) strategy.copy(LocatorUtils.property(locator, "platzart", sourcePlatzart), sourcePlatzart, (this.platzart!= null)));
                    copy.setPlatzart(copyPlatzart);
                } else {
                    if (platzartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.platzart = null;
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new StpSonstige();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "platzart", lhsPlatzart), LocatorUtils.property(thatLocator, "platzart", rhsPlatzart), lhsPlatzart, rhsPlatzart, (this.platzart!= null), (that.platzart!= null))) {
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }


    /**
     * 
     *                     Java enum for <em>platzart</em> attribute in &lt;stp_sonstige&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="FREIPLATZ"/&gt;
     *     &lt;enumeration value="GARAGE"/&gt;
     *     &lt;enumeration value="TIEFGARAGE"/&gt;
     *     &lt;enumeration value="CARPORT"/&gt;
     *     &lt;enumeration value="DUPLEX"/&gt;
     *     &lt;enumeration value="PARKHAUS"/&gt;
     *     &lt;enumeration value="SONSTIGES"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
