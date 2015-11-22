
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
public class LayoutType
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "FIELD")
    protected List<LayoutType.FIELD> field;
    @XmlAttribute(name = "NAME", required = true)
    protected String name;
    @XmlAttribute(name = "DATABASE", required = true)
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
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setDATABASE(String value) {
        this.database = value;
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
            List<LayoutType.FIELD> theFIELD;
            theFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
            strategy.appendField(locator, this, "field", buffer, theFIELD);
        }
        {
            String theNAME;
            theNAME = this.getNAME();
            strategy.appendField(locator, this, "name", buffer, theNAME);
        }
        {
            String theDATABASE;
            theDATABASE = this.getDATABASE();
            strategy.appendField(locator, this, "database", buffer, theDATABASE);
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
        if (draftCopy instanceof LayoutType) {
            final LayoutType copy = ((LayoutType) draftCopy);
            if ((this.field!= null)&&(!this.field.isEmpty())) {
                List<LayoutType.FIELD> sourceFIELD;
                sourceFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
                @SuppressWarnings("unchecked")
                List<LayoutType.FIELD> copyFIELD = ((List<LayoutType.FIELD> ) strategy.copy(LocatorUtils.property(locator, "field", sourceFIELD), sourceFIELD));
                copy.field = null;
                if (copyFIELD!= null) {
                    List<LayoutType.FIELD> uniqueFIELDl = copy.getFIELD();
                    uniqueFIELDl.addAll(copyFIELD);
                }
            } else {
                copy.field = null;
            }
            if (this.name!= null) {
                String sourceNAME;
                sourceNAME = this.getNAME();
                String copyNAME = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceNAME), sourceNAME));
                copy.setNAME(copyNAME);
            } else {
                copy.name = null;
            }
            if (this.database!= null) {
                String sourceDATABASE;
                sourceDATABASE = this.getDATABASE();
                String copyDATABASE = ((String) strategy.copy(LocatorUtils.property(locator, "database", sourceDATABASE), sourceDATABASE));
                copy.setDATABASE(copyDATABASE);
            } else {
                copy.database = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LayoutType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LayoutType)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsFIELD), LocatorUtils.property(thatLocator, "field", rhsFIELD), lhsFIELD, rhsFIELD)) {
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
        {
            String lhsDATABASE;
            lhsDATABASE = this.getDATABASE();
            String rhsDATABASE;
            rhsDATABASE = that.getDATABASE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "database", lhsDATABASE), LocatorUtils.property(thatLocator, "database", rhsDATABASE), lhsDATABASE, rhsDATABASE)) {
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
    public static class FIELD
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "STYLE", required = true)
        protected LayoutType.FIELD.STYLE style;
        @XmlAttribute(name = "NAME", required = true)
        protected String name;

        /**
         * Gets the value of the style property.
         * 
         * @return
         *     possible object is
         *     {@link LayoutType.FIELD.STYLE }
         *     
         */
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
                LayoutType.FIELD.STYLE theSTYLE;
                theSTYLE = this.getSTYLE();
                strategy.appendField(locator, this, "style", buffer, theSTYLE);
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
            if (draftCopy instanceof LayoutType.FIELD) {
                final LayoutType.FIELD copy = ((LayoutType.FIELD) draftCopy);
                if (this.style!= null) {
                    LayoutType.FIELD.STYLE sourceSTYLE;
                    sourceSTYLE = this.getSTYLE();
                    LayoutType.FIELD.STYLE copySTYLE = ((LayoutType.FIELD.STYLE) strategy.copy(LocatorUtils.property(locator, "style", sourceSTYLE), sourceSTYLE));
                    copy.setSTYLE(copySTYLE);
                } else {
                    copy.style = null;
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
            return new LayoutType.FIELD();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof LayoutType.FIELD)) {
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
                if (!strategy.equals(LocatorUtils.property(thisLocator, "style", lhsSTYLE), LocatorUtils.property(thatLocator, "style", rhsSTYLE), lhsSTYLE, rhsSTYLE)) {
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
        public static class STYLE
            implements Cloneable, CopyTo, Equals, ToString
        {

            @XmlAttribute(name = "TYPE")
            protected FieldStyleType type;
            @XmlAttribute(name = "VALUELIST")
            protected String valuelist;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link FieldStyleType }
             *     
             */
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
            public void setVALUELIST(String value) {
                this.valuelist = value;
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
                    FieldStyleType theTYPE;
                    theTYPE = this.getTYPE();
                    strategy.appendField(locator, this, "type", buffer, theTYPE);
                }
                {
                    String theVALUELIST;
                    theVALUELIST = this.getVALUELIST();
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
                if (draftCopy instanceof LayoutType.FIELD.STYLE) {
                    final LayoutType.FIELD.STYLE copy = ((LayoutType.FIELD.STYLE) draftCopy);
                    if (this.type!= null) {
                        FieldStyleType sourceTYPE;
                        sourceTYPE = this.getTYPE();
                        FieldStyleType copyTYPE = ((FieldStyleType) strategy.copy(LocatorUtils.property(locator, "type", sourceTYPE), sourceTYPE));
                        copy.setTYPE(copyTYPE);
                    } else {
                        copy.type = null;
                    }
                    if (this.valuelist!= null) {
                        String sourceVALUELIST;
                        sourceVALUELIST = this.getVALUELIST();
                        String copyVALUELIST = ((String) strategy.copy(LocatorUtils.property(locator, "valuelist", sourceVALUELIST), sourceVALUELIST));
                        copy.setVALUELIST(copyVALUELIST);
                    } else {
                        copy.valuelist = null;
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new LayoutType.FIELD.STYLE();
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                if (!(object instanceof LayoutType.FIELD.STYLE)) {
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
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsTYPE), LocatorUtils.property(thatLocator, "type", rhsTYPE), lhsTYPE, rhsTYPE)) {
                        return false;
                    }
                }
                {
                    String lhsVALUELIST;
                    lhsVALUELIST = this.getVALUELIST();
                    String rhsVALUELIST;
                    rhsVALUELIST = that.getVALUELIST();
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

        }

    }

}
