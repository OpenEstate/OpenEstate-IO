
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * Java class for &lt;sicherheitstechnik&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "sicherheitstechnik")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Sicherheitstechnik implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "ALARMANLAGE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean alarmanlage;
    @XmlAttribute(name = "KAMERA")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean kamera;
    @XmlAttribute(name = "POLIZEIRUF")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean polizeiruf;

    /**
     * Gets the value of the alarmanlage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getALARMANLAGE() {
        return alarmanlage;
    }

    /**
     * Sets the value of the alarmanlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setALARMANLAGE(Boolean value) {
        this.alarmanlage = value;
    }

    /**
     * Gets the value of the kamera property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getKAMERA() {
        return kamera;
    }

    /**
     * Sets the value of the kamera property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setKAMERA(Boolean value) {
        this.kamera = value;
    }

    /**
     * Gets the value of the polizeiruf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getPOLIZEIRUF() {
        return polizeiruf;
    }

    /**
     * Sets the value of the polizeiruf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setPOLIZEIRUF(Boolean value) {
        this.polizeiruf = value;
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
            Boolean theALARMANLAGE;
            theALARMANLAGE = this.getALARMANLAGE();
            strategy.appendField(locator, this, "alarmanlage", buffer, theALARMANLAGE, (this.alarmanlage!= null));
        }
        {
            Boolean theKAMERA;
            theKAMERA = this.getKAMERA();
            strategy.appendField(locator, this, "kamera", buffer, theKAMERA, (this.kamera!= null));
        }
        {
            Boolean thePOLIZEIRUF;
            thePOLIZEIRUF = this.getPOLIZEIRUF();
            strategy.appendField(locator, this, "polizeiruf", buffer, thePOLIZEIRUF, (this.polizeiruf!= null));
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
        if (draftCopy instanceof Sicherheitstechnik) {
            final Sicherheitstechnik copy = ((Sicherheitstechnik) draftCopy);
            {
                Boolean alarmanlageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alarmanlage!= null));
                if (alarmanlageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceALARMANLAGE;
                    sourceALARMANLAGE = this.getALARMANLAGE();
                    Boolean copyALARMANLAGE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "alarmanlage", sourceALARMANLAGE), sourceALARMANLAGE, (this.alarmanlage!= null)));
                    copy.setALARMANLAGE(copyALARMANLAGE);
                } else {
                    if (alarmanlageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alarmanlage = null;
                    }
                }
            }
            {
                Boolean kameraShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kamera!= null));
                if (kameraShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKAMERA;
                    sourceKAMERA = this.getKAMERA();
                    Boolean copyKAMERA = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kamera", sourceKAMERA), sourceKAMERA, (this.kamera!= null)));
                    copy.setKAMERA(copyKAMERA);
                } else {
                    if (kameraShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kamera = null;
                    }
                }
            }
            {
                Boolean polizeirufShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.polizeiruf!= null));
                if (polizeirufShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePOLIZEIRUF;
                    sourcePOLIZEIRUF = this.getPOLIZEIRUF();
                    Boolean copyPOLIZEIRUF = ((Boolean) strategy.copy(LocatorUtils.property(locator, "polizeiruf", sourcePOLIZEIRUF), sourcePOLIZEIRUF, (this.polizeiruf!= null)));
                    copy.setPOLIZEIRUF(copyPOLIZEIRUF);
                } else {
                    if (polizeirufShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.polizeiruf = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Sicherheitstechnik();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Sicherheitstechnik that = ((Sicherheitstechnik) object);
        {
            Boolean lhsALARMANLAGE;
            lhsALARMANLAGE = this.getALARMANLAGE();
            Boolean rhsALARMANLAGE;
            rhsALARMANLAGE = that.getALARMANLAGE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alarmanlage", lhsALARMANLAGE), LocatorUtils.property(thatLocator, "alarmanlage", rhsALARMANLAGE), lhsALARMANLAGE, rhsALARMANLAGE, (this.alarmanlage!= null), (that.alarmanlage!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKAMERA;
            lhsKAMERA = this.getKAMERA();
            Boolean rhsKAMERA;
            rhsKAMERA = that.getKAMERA();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kamera", lhsKAMERA), LocatorUtils.property(thatLocator, "kamera", rhsKAMERA), lhsKAMERA, rhsKAMERA, (this.kamera!= null), (that.kamera!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPOLIZEIRUF;
            lhsPOLIZEIRUF = this.getPOLIZEIRUF();
            Boolean rhsPOLIZEIRUF;
            rhsPOLIZEIRUF = that.getPOLIZEIRUF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "polizeiruf", lhsPOLIZEIRUF), LocatorUtils.property(thatLocator, "polizeiruf", rhsPOLIZEIRUF), lhsPOLIZEIRUF, rhsPOLIZEIRUF, (this.polizeiruf!= null), (that.polizeiruf!= null))) {
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
