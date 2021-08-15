
package org.openestate.io.filemaker.xml.result;

import java.io.Serializable;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for DatabaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatabaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RECORDS" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="DATEFORMAT" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TIMEFORMAT" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LAYOUT" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseType")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
public class DatabaseType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "NAME", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    protected String name;
    @XmlAttribute(name = "RECORDS", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger records;
    @XmlAttribute(name = "DATEFORMAT", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    protected String dateformat;
    @XmlAttribute(name = "TIMEFORMAT", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    protected String timeformat;
    @XmlAttribute(name = "LAYOUT", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    protected String layout;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getRECORDS() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public void setRECORDS(BigInteger value) {
        this.records = value;
    }

    /**
     * Gets the value of the dateformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public String getDATEFORMAT() {
        return dateformat;
    }

    /**
     * Sets the value of the dateformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public void setDATEFORMAT(String value) {
        this.dateformat = value;
    }

    /**
     * Gets the value of the timeformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public String getTIMEFORMAT() {
        return timeformat;
    }

    /**
     * Sets the value of the timeformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public void setTIMEFORMAT(String value) {
        this.timeformat = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public String getLAYOUT() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public void setLAYOUT(String value) {
        this.layout = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theNAME;
            theNAME = this.getNAME();
            strategy.appendField(locator, this, "name", buffer, theNAME, (this.name!= null));
        }
        {
            BigInteger theRECORDS;
            theRECORDS = this.getRECORDS();
            strategy.appendField(locator, this, "records", buffer, theRECORDS, (this.records!= null));
        }
        {
            String theDATEFORMAT;
            theDATEFORMAT = this.getDATEFORMAT();
            strategy.appendField(locator, this, "dateformat", buffer, theDATEFORMAT, (this.dateformat!= null));
        }
        {
            String theTIMEFORMAT;
            theTIMEFORMAT = this.getTIMEFORMAT();
            strategy.appendField(locator, this, "timeformat", buffer, theTIMEFORMAT, (this.timeformat!= null));
        }
        {
            String theLAYOUT;
            theLAYOUT = this.getLAYOUT();
            strategy.appendField(locator, this, "layout", buffer, theLAYOUT, (this.layout!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof DatabaseType) {
            final DatabaseType copy = ((DatabaseType) draftCopy);
            {
                Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNAME;
                    sourceNAME = this.getNAME();
                    String copyNAME = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceNAME), sourceNAME, (this.name!= null)));
                    copy.setNAME(copyNAME);
                } else {
                    if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.name = null;
                    }
                }
            }
            {
                Boolean recordsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.records!= null));
                if (recordsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceRECORDS;
                    sourceRECORDS = this.getRECORDS();
                    BigInteger copyRECORDS = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "records", sourceRECORDS), sourceRECORDS, (this.records!= null)));
                    copy.setRECORDS(copyRECORDS);
                } else {
                    if (recordsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.records = null;
                    }
                }
            }
            {
                Boolean dateformatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateformat!= null));
                if (dateformatShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDATEFORMAT;
                    sourceDATEFORMAT = this.getDATEFORMAT();
                    String copyDATEFORMAT = ((String) strategy.copy(LocatorUtils.property(locator, "dateformat", sourceDATEFORMAT), sourceDATEFORMAT, (this.dateformat!= null)));
                    copy.setDATEFORMAT(copyDATEFORMAT);
                } else {
                    if (dateformatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateformat = null;
                    }
                }
            }
            {
                Boolean timeformatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timeformat!= null));
                if (timeformatShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTIMEFORMAT;
                    sourceTIMEFORMAT = this.getTIMEFORMAT();
                    String copyTIMEFORMAT = ((String) strategy.copy(LocatorUtils.property(locator, "timeformat", sourceTIMEFORMAT), sourceTIMEFORMAT, (this.timeformat!= null)));
                    copy.setTIMEFORMAT(copyTIMEFORMAT);
                } else {
                    if (timeformatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timeformat = null;
                    }
                }
            }
            {
                Boolean layoutShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.layout!= null));
                if (layoutShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLAYOUT;
                    sourceLAYOUT = this.getLAYOUT();
                    String copyLAYOUT = ((String) strategy.copy(LocatorUtils.property(locator, "layout", sourceLAYOUT), sourceLAYOUT, (this.layout!= null)));
                    copy.setLAYOUT(copyLAYOUT);
                } else {
                    if (layoutShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.layout = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new DatabaseType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DatabaseType that = ((DatabaseType) object);
        {
            String lhsNAME;
            lhsNAME = this.getNAME();
            String rhsNAME;
            rhsNAME = that.getNAME();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsNAME), LocatorUtils.property(thatLocator, "name", rhsNAME), lhsNAME, rhsNAME, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsRECORDS;
            lhsRECORDS = this.getRECORDS();
            BigInteger rhsRECORDS;
            rhsRECORDS = that.getRECORDS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "records", lhsRECORDS), LocatorUtils.property(thatLocator, "records", rhsRECORDS), lhsRECORDS, rhsRECORDS, (this.records!= null), (that.records!= null))) {
                return false;
            }
        }
        {
            String lhsDATEFORMAT;
            lhsDATEFORMAT = this.getDATEFORMAT();
            String rhsDATEFORMAT;
            rhsDATEFORMAT = that.getDATEFORMAT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateformat", lhsDATEFORMAT), LocatorUtils.property(thatLocator, "dateformat", rhsDATEFORMAT), lhsDATEFORMAT, rhsDATEFORMAT, (this.dateformat!= null), (that.dateformat!= null))) {
                return false;
            }
        }
        {
            String lhsTIMEFORMAT;
            lhsTIMEFORMAT = this.getTIMEFORMAT();
            String rhsTIMEFORMAT;
            rhsTIMEFORMAT = that.getTIMEFORMAT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeformat", lhsTIMEFORMAT), LocatorUtils.property(thatLocator, "timeformat", rhsTIMEFORMAT), lhsTIMEFORMAT, rhsTIMEFORMAT, (this.timeformat!= null), (that.timeformat!= null))) {
                return false;
            }
        }
        {
            String lhsLAYOUT;
            lhsLAYOUT = this.getLAYOUT();
            String rhsLAYOUT;
            rhsLAYOUT = that.getLAYOUT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layout", lhsLAYOUT), LocatorUtils.property(thatLocator, "layout", rhsLAYOUT), lhsLAYOUT, rhsLAYOUT, (this.layout!= null), (that.layout!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
