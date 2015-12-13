
package org.openestate.io.filemaker.xml.result;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
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
public class DatabaseType
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "NAME", required = true)
    protected String name;
    @XmlAttribute(name = "RECORDS", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger records;
    @XmlAttribute(name = "DATEFORMAT", required = true)
    protected String dateformat;
    @XmlAttribute(name = "TIMEFORMAT", required = true)
    protected String timeformat;
    @XmlAttribute(name = "LAYOUT", required = true)
    protected String layout;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setLAYOUT(String value) {
        this.layout = value;
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
            String theNAME;
            theNAME = this.getNAME();
            strategy.appendField(locator, this, "name", buffer, theNAME);
        }
        {
            BigInteger theRECORDS;
            theRECORDS = this.getRECORDS();
            strategy.appendField(locator, this, "records", buffer, theRECORDS);
        }
        {
            String theDATEFORMAT;
            theDATEFORMAT = this.getDATEFORMAT();
            strategy.appendField(locator, this, "dateformat", buffer, theDATEFORMAT);
        }
        {
            String theTIMEFORMAT;
            theTIMEFORMAT = this.getTIMEFORMAT();
            strategy.appendField(locator, this, "timeformat", buffer, theTIMEFORMAT);
        }
        {
            String theLAYOUT;
            theLAYOUT = this.getLAYOUT();
            strategy.appendField(locator, this, "layout", buffer, theLAYOUT);
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
        if (draftCopy instanceof DatabaseType) {
            final DatabaseType copy = ((DatabaseType) draftCopy);
            if (this.name!= null) {
                String sourceNAME;
                sourceNAME = this.getNAME();
                String copyNAME = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceNAME), sourceNAME));
                copy.setNAME(copyNAME);
            } else {
                copy.name = null;
            }
            if (this.records!= null) {
                BigInteger sourceRECORDS;
                sourceRECORDS = this.getRECORDS();
                BigInteger copyRECORDS = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "records", sourceRECORDS), sourceRECORDS));
                copy.setRECORDS(copyRECORDS);
            } else {
                copy.records = null;
            }
            if (this.dateformat!= null) {
                String sourceDATEFORMAT;
                sourceDATEFORMAT = this.getDATEFORMAT();
                String copyDATEFORMAT = ((String) strategy.copy(LocatorUtils.property(locator, "dateformat", sourceDATEFORMAT), sourceDATEFORMAT));
                copy.setDATEFORMAT(copyDATEFORMAT);
            } else {
                copy.dateformat = null;
            }
            if (this.timeformat!= null) {
                String sourceTIMEFORMAT;
                sourceTIMEFORMAT = this.getTIMEFORMAT();
                String copyTIMEFORMAT = ((String) strategy.copy(LocatorUtils.property(locator, "timeformat", sourceTIMEFORMAT), sourceTIMEFORMAT));
                copy.setTIMEFORMAT(copyTIMEFORMAT);
            } else {
                copy.timeformat = null;
            }
            if (this.layout!= null) {
                String sourceLAYOUT;
                sourceLAYOUT = this.getLAYOUT();
                String copyLAYOUT = ((String) strategy.copy(LocatorUtils.property(locator, "layout", sourceLAYOUT), sourceLAYOUT));
                copy.setLAYOUT(copyLAYOUT);
            } else {
                copy.layout = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DatabaseType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsNAME), LocatorUtils.property(thatLocator, "name", rhsNAME), lhsNAME, rhsNAME)) {
                return false;
            }
        }
        {
            BigInteger lhsRECORDS;
            lhsRECORDS = this.getRECORDS();
            BigInteger rhsRECORDS;
            rhsRECORDS = that.getRECORDS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "records", lhsRECORDS), LocatorUtils.property(thatLocator, "records", rhsRECORDS), lhsRECORDS, rhsRECORDS)) {
                return false;
            }
        }
        {
            String lhsDATEFORMAT;
            lhsDATEFORMAT = this.getDATEFORMAT();
            String rhsDATEFORMAT;
            rhsDATEFORMAT = that.getDATEFORMAT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateformat", lhsDATEFORMAT), LocatorUtils.property(thatLocator, "dateformat", rhsDATEFORMAT), lhsDATEFORMAT, rhsDATEFORMAT)) {
                return false;
            }
        }
        {
            String lhsTIMEFORMAT;
            lhsTIMEFORMAT = this.getTIMEFORMAT();
            String rhsTIMEFORMAT;
            rhsTIMEFORMAT = that.getTIMEFORMAT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeformat", lhsTIMEFORMAT), LocatorUtils.property(thatLocator, "timeformat", rhsTIMEFORMAT), lhsTIMEFORMAT, rhsTIMEFORMAT)) {
                return false;
            }
        }
        {
            String lhsLAYOUT;
            lhsLAYOUT = this.getLAYOUT();
            String rhsLAYOUT;
            rhsLAYOUT = that.getLAYOUT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layout", lhsLAYOUT), LocatorUtils.property(thatLocator, "layout", rhsLAYOUT), lhsLAYOUT, rhsLAYOUT)) {
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
