
package org.openestate.io.filemaker.xml.result;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
public class MetaDataType
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "FIELD")
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
    public List<MetaDataType.FIELD> getFIELD() {
        if (field == null) {
            field = new ArrayList<MetaDataType.FIELD>();
        }
        return this.field;
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
            List<MetaDataType.FIELD> theFIELD;
            theFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
            strategy.appendField(locator, this, "field", buffer, theFIELD);
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
        if (draftCopy instanceof MetaDataType) {
            final MetaDataType copy = ((MetaDataType) draftCopy);
            if ((this.field!= null)&&(!this.field.isEmpty())) {
                List<MetaDataType.FIELD> sourceFIELD;
                sourceFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
                @SuppressWarnings("unchecked")
                List<MetaDataType.FIELD> copyFIELD = ((List<MetaDataType.FIELD> ) strategy.copy(LocatorUtils.property(locator, "field", sourceFIELD), sourceFIELD));
                copy.field = null;
                if (copyFIELD!= null) {
                    List<MetaDataType.FIELD> uniqueFIELDl = copy.getFIELD();
                    uniqueFIELDl.addAll(copyFIELD);
                }
            } else {
                copy.field = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MetaDataType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsFIELD), LocatorUtils.property(thatLocator, "field", rhsFIELD), lhsFIELD, rhsFIELD)) {
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
    public static class FIELD
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlAttribute(name = "NAME", required = true)
        protected String name;
        @XmlAttribute(name = "TYPE", required = true)
        protected FieldType type;
        @XmlAttribute(name = "EMPTYOK", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        protected Boolean emptyok;
        @XmlAttribute(name = "MAXREPEAT", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxrepeat;

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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link FieldType }
         *     
         */
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
        public Boolean isEMPTYOK() {
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
        public void setMAXREPEAT(BigInteger value) {
            this.maxrepeat = value;
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
                FieldType theTYPE;
                theTYPE = this.getTYPE();
                strategy.appendField(locator, this, "type", buffer, theTYPE);
            }
            {
                Boolean theEMPTYOK;
                theEMPTYOK = this.isEMPTYOK();
                strategy.appendField(locator, this, "emptyok", buffer, theEMPTYOK);
            }
            {
                BigInteger theMAXREPEAT;
                theMAXREPEAT = this.getMAXREPEAT();
                strategy.appendField(locator, this, "maxrepeat", buffer, theMAXREPEAT);
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
            if (draftCopy instanceof MetaDataType.FIELD) {
                final MetaDataType.FIELD copy = ((MetaDataType.FIELD) draftCopy);
                if (this.name!= null) {
                    String sourceNAME;
                    sourceNAME = this.getNAME();
                    String copyNAME = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceNAME), sourceNAME));
                    copy.setNAME(copyNAME);
                } else {
                    copy.name = null;
                }
                if (this.type!= null) {
                    FieldType sourceTYPE;
                    sourceTYPE = this.getTYPE();
                    FieldType copyTYPE = ((FieldType) strategy.copy(LocatorUtils.property(locator, "type", sourceTYPE), sourceTYPE));
                    copy.setTYPE(copyTYPE);
                } else {
                    copy.type = null;
                }
                if (this.emptyok!= null) {
                    Boolean sourceEMPTYOK;
                    sourceEMPTYOK = this.isEMPTYOK();
                    Boolean copyEMPTYOK = ((Boolean) strategy.copy(LocatorUtils.property(locator, "emptyok", sourceEMPTYOK), sourceEMPTYOK));
                    copy.setEMPTYOK(copyEMPTYOK);
                } else {
                    copy.emptyok = null;
                }
                if (this.maxrepeat!= null) {
                    BigInteger sourceMAXREPEAT;
                    sourceMAXREPEAT = this.getMAXREPEAT();
                    BigInteger copyMAXREPEAT = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "maxrepeat", sourceMAXREPEAT), sourceMAXREPEAT));
                    copy.setMAXREPEAT(copyMAXREPEAT);
                } else {
                    copy.maxrepeat = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new MetaDataType.FIELD();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
                if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsNAME), LocatorUtils.property(thatLocator, "name", rhsNAME), lhsNAME, rhsNAME)) {
                    return false;
                }
            }
            {
                FieldType lhsTYPE;
                lhsTYPE = this.getTYPE();
                FieldType rhsTYPE;
                rhsTYPE = that.getTYPE();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsTYPE), LocatorUtils.property(thatLocator, "type", rhsTYPE), lhsTYPE, rhsTYPE)) {
                    return false;
                }
            }
            {
                Boolean lhsEMPTYOK;
                lhsEMPTYOK = this.isEMPTYOK();
                Boolean rhsEMPTYOK;
                rhsEMPTYOK = that.isEMPTYOK();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "emptyok", lhsEMPTYOK), LocatorUtils.property(thatLocator, "emptyok", rhsEMPTYOK), lhsEMPTYOK, rhsEMPTYOK)) {
                    return false;
                }
            }
            {
                BigInteger lhsMAXREPEAT;
                lhsMAXREPEAT = this.getMAXREPEAT();
                BigInteger rhsMAXREPEAT;
                rhsMAXREPEAT = that.getMAXREPEAT();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "maxrepeat", lhsMAXREPEAT), LocatorUtils.property(thatLocator, "maxrepeat", rhsMAXREPEAT), lhsMAXREPEAT, rhsMAXREPEAT)) {
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

}
