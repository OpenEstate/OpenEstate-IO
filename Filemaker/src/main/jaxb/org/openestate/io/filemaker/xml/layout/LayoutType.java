
package org.openestate.io.filemaker.xml.layout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for LayoutType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayoutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FIELD" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="STYLE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="TYPE" type="{http://www.filemaker.com/fmpxmllayout}FieldStyleType" /&gt;
 *                           &lt;attribute name="VALUELIST" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DATABASE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutType", propOrder = {
    "field"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
public class LayoutType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "FIELD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    protected List<LayoutType.FIELD> field;
    @XmlAttribute(name = "NAME", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    protected String name;
    @XmlAttribute(name = "DATABASE", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    protected String database;

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFIELD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayoutType.FIELD }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public List<LayoutType.FIELD> getFIELD() {
        if (field == null) {
            field = new ArrayList<LayoutType.FIELD>();
        }
        return this.field;
    }

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
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public String getDATABASE() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public void setDATABASE(String value) {
        this.database = value;
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
            List<LayoutType.FIELD> theFIELD;
            theFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
            strategy.appendField(locator, this, "field", buffer, theFIELD, ((this.field!= null)&&(!this.field.isEmpty())));
        }
        {
            String theNAME;
            theNAME = this.getNAME();
            strategy.appendField(locator, this, "name", buffer, theNAME, (this.name!= null));
        }
        {
            String theDATABASE;
            theDATABASE = this.getDATABASE();
            strategy.appendField(locator, this, "database", buffer, theDATABASE, (this.database!= null));
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
        if (draftCopy instanceof LayoutType) {
            final LayoutType copy = ((LayoutType) draftCopy);
            {
                Boolean fieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.field!= null)&&(!this.field.isEmpty())));
                if (fieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<LayoutType.FIELD> sourceFIELD;
                    sourceFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
                    @SuppressWarnings("unchecked")
                    List<LayoutType.FIELD> copyFIELD = ((List<LayoutType.FIELD> ) strategy.copy(LocatorUtils.property(locator, "field", sourceFIELD), sourceFIELD, ((this.field!= null)&&(!this.field.isEmpty()))));
                    copy.field = null;
                    if (copyFIELD!= null) {
                        List<LayoutType.FIELD> uniqueFIELDl = copy.getFIELD();
                        uniqueFIELDl.addAll(copyFIELD);
                    }
                } else {
                    if (fieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.field = null;
                    }
                }
            }
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
                Boolean databaseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.database!= null));
                if (databaseShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDATABASE;
                    sourceDATABASE = this.getDATABASE();
                    String copyDATABASE = ((String) strategy.copy(LocatorUtils.property(locator, "database", sourceDATABASE), sourceDATABASE, (this.database!= null)));
                    copy.setDATABASE(copyDATABASE);
                } else {
                    if (databaseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.database = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new LayoutType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LayoutType that = ((LayoutType) object);
        {
            List<LayoutType.FIELD> lhsFIELD;
            lhsFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
            List<LayoutType.FIELD> rhsFIELD;
            rhsFIELD = (((that.field!= null)&&(!that.field.isEmpty()))?that.getFIELD():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsFIELD), LocatorUtils.property(thatLocator, "field", rhsFIELD), lhsFIELD, rhsFIELD, ((this.field!= null)&&(!this.field.isEmpty())), ((that.field!= null)&&(!that.field.isEmpty())))) {
                return false;
            }
        }
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
            String lhsDATABASE;
            lhsDATABASE = this.getDATABASE();
            String rhsDATABASE;
            rhsDATABASE = that.getDATABASE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "database", lhsDATABASE), LocatorUtils.property(thatLocator, "database", rhsDATABASE), lhsDATABASE, rhsDATABASE, (this.database!= null), (that.database!= null))) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="STYLE"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="TYPE" type="{http://www.filemaker.com/fmpxmllayout}FieldStyleType" /&gt;
     *                 &lt;attribute name="VALUELIST" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "style"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public static class FIELD implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(name = "STYLE", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        protected LayoutType.FIELD.STYLE style;
        @XmlAttribute(name = "NAME", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        protected String name;

        /**
         * Gets the value of the style property.
         * 
         * @return
         *     possible object is
         *     {@link LayoutType.FIELD.STYLE }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        public LayoutType.FIELD.STYLE getSTYLE() {
            return style;
        }

        /**
         * Sets the value of the style property.
         * 
         * @param value
         *     allowed object is
         *     {@link LayoutType.FIELD.STYLE }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        public void setSTYLE(LayoutType.FIELD.STYLE value) {
            this.style = value;
        }

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
                LayoutType.FIELD.STYLE theSTYLE;
                theSTYLE = this.getSTYLE();
                strategy.appendField(locator, this, "style", buffer, theSTYLE, (this.style!= null));
            }
            {
                String theNAME;
                theNAME = this.getNAME();
                strategy.appendField(locator, this, "name", buffer, theNAME, (this.name!= null));
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
            if (draftCopy instanceof LayoutType.FIELD) {
                final LayoutType.FIELD copy = ((LayoutType.FIELD) draftCopy);
                {
                    Boolean styleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.style!= null));
                    if (styleShouldBeCopiedAndSet == Boolean.TRUE) {
                        LayoutType.FIELD.STYLE sourceSTYLE;
                        sourceSTYLE = this.getSTYLE();
                        LayoutType.FIELD.STYLE copySTYLE = ((LayoutType.FIELD.STYLE) strategy.copy(LocatorUtils.property(locator, "style", sourceSTYLE), sourceSTYLE, (this.style!= null)));
                        copy.setSTYLE(copySTYLE);
                    } else {
                        if (styleShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.style = null;
                        }
                    }
                }
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
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new LayoutType.FIELD();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final LayoutType.FIELD that = ((LayoutType.FIELD) object);
            {
                LayoutType.FIELD.STYLE lhsSTYLE;
                lhsSTYLE = this.getSTYLE();
                LayoutType.FIELD.STYLE rhsSTYLE;
                rhsSTYLE = that.getSTYLE();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "style", lhsSTYLE), LocatorUtils.property(thatLocator, "style", rhsSTYLE), lhsSTYLE, rhsSTYLE, (this.style!= null), (that.style!= null))) {
                    return false;
                }
            }
            {
                String lhsNAME;
                lhsNAME = this.getNAME();
                String rhsNAME;
                rhsNAME = that.getNAME();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsNAME), LocatorUtils.property(thatLocator, "name", rhsNAME), lhsNAME, rhsNAME, (this.name!= null), (that.name!= null))) {
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="TYPE" type="{http://www.filemaker.com/fmpxmllayout}FieldStyleType" /&gt;
         *       &lt;attribute name="VALUELIST" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        public static class STYLE implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
        {

            @XmlAttribute(name = "TYPE")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
            protected FieldStyleType type;
            @XmlAttribute(name = "VALUELIST")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
            protected String valuelist;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link FieldStyleType }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
            public FieldStyleType getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link FieldStyleType }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
            public void setTYPE(FieldStyleType value) {
                this.type = value;
            }

            /**
             * Gets the value of the valuelist property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
            public String getVALUELIST() {
                return valuelist;
            }

            /**
             * Sets the value of the valuelist property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
            public void setVALUELIST(String value) {
                this.valuelist = value;
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
                    FieldStyleType theTYPE;
                    theTYPE = this.getTYPE();
                    strategy.appendField(locator, this, "type", buffer, theTYPE, (this.type!= null));
                }
                {
                    String theVALUELIST;
                    theVALUELIST = this.getVALUELIST();
                    strategy.appendField(locator, this, "valuelist", buffer, theVALUELIST, (this.valuelist!= null));
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
                if (draftCopy instanceof LayoutType.FIELD.STYLE) {
                    final LayoutType.FIELD.STYLE copy = ((LayoutType.FIELD.STYLE) draftCopy);
                    {
                        Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                        if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                            FieldStyleType sourceTYPE;
                            sourceTYPE = this.getTYPE();
                            FieldStyleType copyTYPE = ((FieldStyleType) strategy.copy(LocatorUtils.property(locator, "type", sourceTYPE), sourceTYPE, (this.type!= null)));
                            copy.setTYPE(copyTYPE);
                        } else {
                            if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.type = null;
                            }
                        }
                    }
                    {
                        Boolean valuelistShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valuelist!= null));
                        if (valuelistShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceVALUELIST;
                            sourceVALUELIST = this.getVALUELIST();
                            String copyVALUELIST = ((String) strategy.copy(LocatorUtils.property(locator, "valuelist", sourceVALUELIST), sourceVALUELIST, (this.valuelist!= null)));
                            copy.setVALUELIST(copyVALUELIST);
                        } else {
                            if (valuelistShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.valuelist = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
            public Object createNewInstance() {
                return new LayoutType.FIELD.STYLE();
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final LayoutType.FIELD.STYLE that = ((LayoutType.FIELD.STYLE) object);
                {
                    FieldStyleType lhsTYPE;
                    lhsTYPE = this.getTYPE();
                    FieldStyleType rhsTYPE;
                    rhsTYPE = that.getTYPE();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsTYPE), LocatorUtils.property(thatLocator, "type", rhsTYPE), lhsTYPE, rhsTYPE, (this.type!= null), (that.type!= null))) {
                        return false;
                    }
                }
                {
                    String lhsVALUELIST;
                    lhsVALUELIST = this.getVALUELIST();
                    String rhsVALUELIST;
                    rhsVALUELIST = that.getVALUELIST();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "valuelist", lhsVALUELIST), LocatorUtils.property(thatLocator, "valuelist", rhsVALUELIST), lhsVALUELIST, rhsVALUELIST, (this.valuelist!= null), (that.valuelist!= null))) {
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

    }

}
