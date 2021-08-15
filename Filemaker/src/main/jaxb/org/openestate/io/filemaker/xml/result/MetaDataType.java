
package org.openestate.io.filemaker.xml.result;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for MetaDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FIELD" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TYPE" use="required" type="{http://www.filemaker.com/fmpxmlresult}FieldType" /&gt;
 *                 &lt;attribute name="EMPTYOK" use="required" type="{http://www.filemaker.com/fmpxmlresult}BooleanType" /&gt;
 *                 &lt;attribute name="MAXREPEAT" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataType", propOrder = {
    "field"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
public class MetaDataType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "FIELD")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    protected List<MetaDataType.FIELD> field;

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
     * {@link MetaDataType.FIELD }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public List<MetaDataType.FIELD> getFIELD() {
        if (field == null) {
            field = new ArrayList<MetaDataType.FIELD>();
        }
        return this.field;
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
            List<MetaDataType.FIELD> theFIELD;
            theFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
            strategy.appendField(locator, this, "field", buffer, theFIELD, ((this.field!= null)&&(!this.field.isEmpty())));
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
        if (draftCopy instanceof MetaDataType) {
            final MetaDataType copy = ((MetaDataType) draftCopy);
            {
                Boolean fieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.field!= null)&&(!this.field.isEmpty())));
                if (fieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MetaDataType.FIELD> sourceFIELD;
                    sourceFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
                    @SuppressWarnings("unchecked")
                    List<MetaDataType.FIELD> copyFIELD = ((List<MetaDataType.FIELD> ) strategy.copy(LocatorUtils.property(locator, "field", sourceFIELD), sourceFIELD, ((this.field!= null)&&(!this.field.isEmpty()))));
                    copy.field = null;
                    if (copyFIELD!= null) {
                        List<MetaDataType.FIELD> uniqueFIELDl = copy.getFIELD();
                        uniqueFIELDl.addAll(copyFIELD);
                    }
                } else {
                    if (fieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.field = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new MetaDataType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MetaDataType that = ((MetaDataType) object);
        {
            List<MetaDataType.FIELD> lhsFIELD;
            lhsFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
            List<MetaDataType.FIELD> rhsFIELD;
            rhsFIELD = (((that.field!= null)&&(!that.field.isEmpty()))?that.getFIELD():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsFIELD), LocatorUtils.property(thatLocator, "field", rhsFIELD), lhsFIELD, rhsFIELD, ((this.field!= null)&&(!this.field.isEmpty())), ((that.field!= null)&&(!that.field.isEmpty())))) {
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
     *       &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TYPE" use="required" type="{http://www.filemaker.com/fmpxmlresult}FieldType" /&gt;
     *       &lt;attribute name="EMPTYOK" use="required" type="{http://www.filemaker.com/fmpxmlresult}BooleanType" /&gt;
     *       &lt;attribute name="MAXREPEAT" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
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
    public static class FIELD implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlAttribute(name = "NAME", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        protected String name;
        @XmlAttribute(name = "TYPE", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        protected FieldType type;
        @XmlAttribute(name = "EMPTYOK", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        protected Boolean emptyok;
        @XmlAttribute(name = "MAXREPEAT", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        protected BigInteger maxrepeat;

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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link FieldType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        public FieldType getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link FieldType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        public void setTYPE(FieldType value) {
            this.type = value;
        }

        /**
         * Gets the value of the emptyok property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        public Boolean getEMPTYOK() {
            return emptyok;
        }

        /**
         * Sets the value of the emptyok property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        public void setEMPTYOK(Boolean value) {
            this.emptyok = value;
        }

        /**
         * Gets the value of the maxrepeat property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        public BigInteger getMAXREPEAT() {
            return maxrepeat;
        }

        /**
         * Sets the value of the maxrepeat property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        public void setMAXREPEAT(BigInteger value) {
            this.maxrepeat = value;
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
                FieldType theTYPE;
                theTYPE = this.getTYPE();
                strategy.appendField(locator, this, "type", buffer, theTYPE, (this.type!= null));
            }
            {
                Boolean theEMPTYOK;
                theEMPTYOK = this.getEMPTYOK();
                strategy.appendField(locator, this, "emptyok", buffer, theEMPTYOK, (this.emptyok!= null));
            }
            {
                BigInteger theMAXREPEAT;
                theMAXREPEAT = this.getMAXREPEAT();
                strategy.appendField(locator, this, "maxrepeat", buffer, theMAXREPEAT, (this.maxrepeat!= null));
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
            if (draftCopy instanceof MetaDataType.FIELD) {
                final MetaDataType.FIELD copy = ((MetaDataType.FIELD) draftCopy);
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
                    Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                    if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                        FieldType sourceTYPE;
                        sourceTYPE = this.getTYPE();
                        FieldType copyTYPE = ((FieldType) strategy.copy(LocatorUtils.property(locator, "type", sourceTYPE), sourceTYPE, (this.type!= null)));
                        copy.setTYPE(copyTYPE);
                    } else {
                        if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.type = null;
                        }
                    }
                }
                {
                    Boolean emptyokShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.emptyok!= null));
                    if (emptyokShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceEMPTYOK;
                        sourceEMPTYOK = this.getEMPTYOK();
                        Boolean copyEMPTYOK = ((Boolean) strategy.copy(LocatorUtils.property(locator, "emptyok", sourceEMPTYOK), sourceEMPTYOK, (this.emptyok!= null)));
                        copy.setEMPTYOK(copyEMPTYOK);
                    } else {
                        if (emptyokShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.emptyok = null;
                        }
                    }
                }
                {
                    Boolean maxrepeatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxrepeat!= null));
                    if (maxrepeatShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceMAXREPEAT;
                        sourceMAXREPEAT = this.getMAXREPEAT();
                        BigInteger copyMAXREPEAT = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "maxrepeat", sourceMAXREPEAT), sourceMAXREPEAT, (this.maxrepeat!= null)));
                        copy.setMAXREPEAT(copyMAXREPEAT);
                    } else {
                        if (maxrepeatShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.maxrepeat = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new MetaDataType.FIELD();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:17+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final MetaDataType.FIELD that = ((MetaDataType.FIELD) object);
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
                FieldType lhsTYPE;
                lhsTYPE = this.getTYPE();
                FieldType rhsTYPE;
                rhsTYPE = that.getTYPE();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsTYPE), LocatorUtils.property(thatLocator, "type", rhsTYPE), lhsTYPE, rhsTYPE, (this.type!= null), (that.type!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsEMPTYOK;
                lhsEMPTYOK = this.getEMPTYOK();
                Boolean rhsEMPTYOK;
                rhsEMPTYOK = that.getEMPTYOK();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "emptyok", lhsEMPTYOK), LocatorUtils.property(thatLocator, "emptyok", rhsEMPTYOK), lhsEMPTYOK, rhsEMPTYOK, (this.emptyok!= null), (that.emptyok!= null))) {
                    return false;
                }
            }
            {
                BigInteger lhsMAXREPEAT;
                lhsMAXREPEAT = this.getMAXREPEAT();
                BigInteger rhsMAXREPEAT;
                rhsMAXREPEAT = that.getMAXREPEAT();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "maxrepeat", lhsMAXREPEAT), LocatorUtils.property(thatLocator, "maxrepeat", rhsMAXREPEAT), lhsMAXREPEAT, rhsMAXREPEAT, (this.maxrepeat!= null), (that.maxrepeat!= null))) {
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
