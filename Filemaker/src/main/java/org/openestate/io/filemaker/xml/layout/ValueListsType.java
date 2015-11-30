
package org.openestate.io.filemaker.xml.layout;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for ValueListsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueListsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VALUELIST" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ValueListsType", propOrder = {
    "valuelist"
})
public class ValueListsType
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "VALUELIST")
    protected List<ValueListsType.VALUELIST> valuelist;

    /**
     * Gets the value of the valuelist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuelist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVALUELIST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueListsType.VALUELIST }
     * 
     * 
     */
    public List<ValueListsType.VALUELIST> getVALUELIST() {
        if (valuelist == null) {
            valuelist = new ArrayList<ValueListsType.VALUELIST>();
        }
        return this.valuelist;
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
            List<ValueListsType.VALUELIST> theVALUELIST;
            theVALUELIST = (((this.valuelist!= null)&&(!this.valuelist.isEmpty()))?this.getVALUELIST():null);
            strategy.appendField(locator, this, "valuelist", buffer, theVALUELIST);
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
        if (draftCopy instanceof ValueListsType) {
            final ValueListsType copy = ((ValueListsType) draftCopy);
            if ((this.valuelist!= null)&&(!this.valuelist.isEmpty())) {
                List<ValueListsType.VALUELIST> sourceVALUELIST;
                sourceVALUELIST = (((this.valuelist!= null)&&(!this.valuelist.isEmpty()))?this.getVALUELIST():null);
                @SuppressWarnings("unchecked")
                List<ValueListsType.VALUELIST> copyVALUELIST = ((List<ValueListsType.VALUELIST> ) strategy.copy(LocatorUtils.property(locator, "valuelist", sourceVALUELIST), sourceVALUELIST));
                copy.valuelist = null;
                if (copyVALUELIST!= null) {
                    List<ValueListsType.VALUELIST> uniqueVALUELISTl = copy.getVALUELIST();
                    uniqueVALUELISTl.addAll(copyVALUELIST);
                }
            } else {
                copy.valuelist = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ValueListsType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ValueListsType that = ((ValueListsType) object);
        {
            List<ValueListsType.VALUELIST> lhsVALUELIST;
            lhsVALUELIST = (((this.valuelist!= null)&&(!this.valuelist.isEmpty()))?this.getVALUELIST():null);
            List<ValueListsType.VALUELIST> rhsVALUELIST;
            rhsVALUELIST = (((that.valuelist!= null)&&(!that.valuelist.isEmpty()))?that.getVALUELIST():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valuelist", lhsVALUELIST), LocatorUtils.property(thatLocator, "valuelist", rhsVALUELIST), lhsVALUELIST, rhsVALUELIST)) {
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
     *       &lt;sequence&gt;
     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "value"
    })
    public static class VALUELIST
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "VALUE")
        protected List<String> value;
        @XmlAttribute(name = "NAME", required = true)
        protected String name;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVALUE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVALUE() {
            if (value == null) {
                value = new ArrayList<String>();
            }
            return this.value;
        }

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
                List<String> theVALUE;
                theVALUE = (((this.value!= null)&&(!this.value.isEmpty()))?this.getVALUE():null);
                strategy.appendField(locator, this, "value", buffer, theVALUE);
            }
            {
                String theNAME;
                theNAME = this.getNAME();
                strategy.appendField(locator, this, "name", buffer, theNAME);
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
            if (draftCopy instanceof ValueListsType.VALUELIST) {
                final ValueListsType.VALUELIST copy = ((ValueListsType.VALUELIST) draftCopy);
                if ((this.value!= null)&&(!this.value.isEmpty())) {
                    List<String> sourceVALUE;
                    sourceVALUE = (((this.value!= null)&&(!this.value.isEmpty()))?this.getVALUE():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyVALUE = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "value", sourceVALUE), sourceVALUE));
                    copy.value = null;
                    if (copyVALUE!= null) {
                        List<String> uniqueVALUEl = copy.getVALUE();
                        uniqueVALUEl.addAll(copyVALUE);
                    }
                } else {
                    copy.value = null;
                }
                if (this.name!= null) {
                    String sourceNAME;
                    sourceNAME = this.getNAME();
                    String copyNAME = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceNAME), sourceNAME));
                    copy.setNAME(copyNAME);
                } else {
                    copy.name = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ValueListsType.VALUELIST();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final ValueListsType.VALUELIST that = ((ValueListsType.VALUELIST) object);
            {
                List<String> lhsVALUE;
                lhsVALUE = (((this.value!= null)&&(!this.value.isEmpty()))?this.getVALUE():null);
                List<String> rhsVALUE;
                rhsVALUE = (((that.value!= null)&&(!that.value.isEmpty()))?that.getVALUE():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsVALUE), LocatorUtils.property(thatLocator, "value", rhsVALUE), lhsVALUE, rhsVALUE)) {
                    return false;
                }
            }
            {
                String lhsNAME;
                lhsNAME = this.getNAME();
                String rhsNAME;
                rhsNAME = that.getNAME();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsNAME), LocatorUtils.property(thatLocator, "name", rhsNAME), lhsNAME, rhsNAME)) {
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