
package org.openestate.io.filemaker.xml.result;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for ResultSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ROW" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="COL" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DATA" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="RECORDID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="MODID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FOUND" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultSetType", propOrder = {
    "row"
})
public class ResultSetType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "ROW")
    protected List<ResultSetType.ROW> row;
    @XmlAttribute(name = "FOUND", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger found;

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getROW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultSetType.ROW }
     * 
     * 
     */
    public List<ResultSetType.ROW> getROW() {
        if (row == null) {
            row = new ArrayList<ResultSetType.ROW>();
        }
        return this.row;
    }

    /**
     * Gets the value of the found property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFOUND() {
        return found;
    }

    /**
     * Sets the value of the found property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFOUND(BigInteger value) {
        this.found = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<ResultSetType.ROW> theROW;
            theROW = (((this.row!= null)&&(!this.row.isEmpty()))?this.getROW():null);
            strategy.appendField(locator, this, "row", buffer, theROW, ((this.row!= null)&&(!this.row.isEmpty())));
        }
        {
            BigInteger theFOUND;
            theFOUND = this.getFOUND();
            strategy.appendField(locator, this, "found", buffer, theFOUND, (this.found!= null));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ResultSetType) {
            final ResultSetType copy = ((ResultSetType) draftCopy);
            {
                Boolean rowShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.row!= null)&&(!this.row.isEmpty())));
                if (rowShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ResultSetType.ROW> sourceROW;
                    sourceROW = (((this.row!= null)&&(!this.row.isEmpty()))?this.getROW():null);
                    @SuppressWarnings("unchecked")
                    List<ResultSetType.ROW> copyROW = ((List<ResultSetType.ROW> ) strategy.copy(LocatorUtils.property(locator, "row", sourceROW), sourceROW, ((this.row!= null)&&(!this.row.isEmpty()))));
                    copy.row = null;
                    if (copyROW!= null) {
                        List<ResultSetType.ROW> uniqueROWl = copy.getROW();
                        uniqueROWl.addAll(copyROW);
                    }
                } else {
                    if (rowShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.row = null;
                    }
                }
            }
            {
                Boolean foundShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.found!= null));
                if (foundShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceFOUND;
                    sourceFOUND = this.getFOUND();
                    BigInteger copyFOUND = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "found", sourceFOUND), sourceFOUND, (this.found!= null)));
                    copy.setFOUND(copyFOUND);
                } else {
                    if (foundShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.found = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ResultSetType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ResultSetType that = ((ResultSetType) object);
        {
            List<ResultSetType.ROW> lhsROW;
            lhsROW = (((this.row!= null)&&(!this.row.isEmpty()))?this.getROW():null);
            List<ResultSetType.ROW> rhsROW;
            rhsROW = (((that.row!= null)&&(!that.row.isEmpty()))?that.getROW():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "row", lhsROW), LocatorUtils.property(thatLocator, "row", rhsROW), lhsROW, rhsROW, ((this.row!= null)&&(!this.row.isEmpty())), ((that.row!= null)&&(!that.row.isEmpty())))) {
                return false;
            }
        }
        {
            BigInteger lhsFOUND;
            lhsFOUND = this.getFOUND();
            BigInteger rhsFOUND;
            rhsFOUND = that.getFOUND();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "found", lhsFOUND), LocatorUtils.property(thatLocator, "found", rhsFOUND), lhsFOUND, rhsFOUND, (this.found!= null), (that.found!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
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
     *         &lt;element name="COL" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DATA" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="RECORDID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="MODID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "col"
    })
    public static class ROW implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(name = "COL")
        protected List<ResultSetType.ROW.COL> col;
        @XmlAttribute(name = "RECORDID", required = true)
        protected BigInteger recordid;
        @XmlAttribute(name = "MODID", required = true)
        protected BigInteger modid;

        /**
         * Gets the value of the col property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the col property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResultSetType.ROW.COL }
         * 
         * 
         */
        public List<ResultSetType.ROW.COL> getCOL() {
            if (col == null) {
                col = new ArrayList<ResultSetType.ROW.COL>();
            }
            return this.col;
        }

        /**
         * Gets the value of the recordid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRECORDID() {
            return recordid;
        }

        /**
         * Sets the value of the recordid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRECORDID(BigInteger value) {
            this.recordid = value;
        }

        /**
         * Gets the value of the modid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMODID() {
            return modid;
        }

        /**
         * Sets the value of the modid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMODID(BigInteger value) {
            this.modid = value;
        }

        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                List<ResultSetType.ROW.COL> theCOL;
                theCOL = (((this.col!= null)&&(!this.col.isEmpty()))?this.getCOL():null);
                strategy.appendField(locator, this, "col", buffer, theCOL, ((this.col!= null)&&(!this.col.isEmpty())));
            }
            {
                BigInteger theRECORDID;
                theRECORDID = this.getRECORDID();
                strategy.appendField(locator, this, "recordid", buffer, theRECORDID, (this.recordid!= null));
            }
            {
                BigInteger theMODID;
                theMODID = this.getMODID();
                strategy.appendField(locator, this, "modid", buffer, theMODID, (this.modid!= null));
            }
            return buffer;
        }

        public Object clone() {
            return copyTo(createNewInstance());
        }

        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof ResultSetType.ROW) {
                final ResultSetType.ROW copy = ((ResultSetType.ROW) draftCopy);
                {
                    Boolean colShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.col!= null)&&(!this.col.isEmpty())));
                    if (colShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<ResultSetType.ROW.COL> sourceCOL;
                        sourceCOL = (((this.col!= null)&&(!this.col.isEmpty()))?this.getCOL():null);
                        @SuppressWarnings("unchecked")
                        List<ResultSetType.ROW.COL> copyCOL = ((List<ResultSetType.ROW.COL> ) strategy.copy(LocatorUtils.property(locator, "col", sourceCOL), sourceCOL, ((this.col!= null)&&(!this.col.isEmpty()))));
                        copy.col = null;
                        if (copyCOL!= null) {
                            List<ResultSetType.ROW.COL> uniqueCOLl = copy.getCOL();
                            uniqueCOLl.addAll(copyCOL);
                        }
                    } else {
                        if (colShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.col = null;
                        }
                    }
                }
                {
                    Boolean recordidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recordid!= null));
                    if (recordidShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceRECORDID;
                        sourceRECORDID = this.getRECORDID();
                        BigInteger copyRECORDID = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "recordid", sourceRECORDID), sourceRECORDID, (this.recordid!= null)));
                        copy.setRECORDID(copyRECORDID);
                    } else {
                        if (recordidShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.recordid = null;
                        }
                    }
                }
                {
                    Boolean modidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.modid!= null));
                    if (modidShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceMODID;
                        sourceMODID = this.getMODID();
                        BigInteger copyMODID = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "modid", sourceMODID), sourceMODID, (this.modid!= null)));
                        copy.setMODID(copyMODID);
                    } else {
                        if (modidShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.modid = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ResultSetType.ROW();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final ResultSetType.ROW that = ((ResultSetType.ROW) object);
            {
                List<ResultSetType.ROW.COL> lhsCOL;
                lhsCOL = (((this.col!= null)&&(!this.col.isEmpty()))?this.getCOL():null);
                List<ResultSetType.ROW.COL> rhsCOL;
                rhsCOL = (((that.col!= null)&&(!that.col.isEmpty()))?that.getCOL():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "col", lhsCOL), LocatorUtils.property(thatLocator, "col", rhsCOL), lhsCOL, rhsCOL, ((this.col!= null)&&(!this.col.isEmpty())), ((that.col!= null)&&(!that.col.isEmpty())))) {
                    return false;
                }
            }
            {
                BigInteger lhsRECORDID;
                lhsRECORDID = this.getRECORDID();
                BigInteger rhsRECORDID;
                rhsRECORDID = that.getRECORDID();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "recordid", lhsRECORDID), LocatorUtils.property(thatLocator, "recordid", rhsRECORDID), lhsRECORDID, rhsRECORDID, (this.recordid!= null), (that.recordid!= null))) {
                    return false;
                }
            }
            {
                BigInteger lhsMODID;
                lhsMODID = this.getMODID();
                BigInteger rhsMODID;
                rhsMODID = that.getMODID();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "modid", lhsMODID), LocatorUtils.property(thatLocator, "modid", rhsMODID), lhsMODID, rhsMODID, (this.modid!= null), (that.modid!= null))) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
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
         *         &lt;element name="DATA" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "data"
        })
        public static class COL implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
        {

            @XmlElement(name = "DATA")
            protected List<String> data;

            /**
             * Gets the value of the data property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the data property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDATA().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getDATA() {
                if (data == null) {
                    data = new ArrayList<String>();
                }
                return this.data;
            }

            public String toString() {
                final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                final StringBuilder buffer = new StringBuilder();
                append(null, buffer, strategy);
                return buffer.toString();
            }

            public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                strategy.appendStart(locator, this, buffer);
                appendFields(locator, buffer, strategy);
                strategy.appendEnd(locator, this, buffer);
                return buffer;
            }

            public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                {
                    List<String> theDATA;
                    theDATA = (((this.data!= null)&&(!this.data.isEmpty()))?this.getDATA():null);
                    strategy.appendField(locator, this, "data", buffer, theDATA, ((this.data!= null)&&(!this.data.isEmpty())));
                }
                return buffer;
            }

            public Object clone() {
                return copyTo(createNewInstance());
            }

            public Object copyTo(Object target) {
                final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                return copyTo(null, target, strategy);
            }

            public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                final Object draftCopy = ((target == null)?createNewInstance():target);
                if (draftCopy instanceof ResultSetType.ROW.COL) {
                    final ResultSetType.ROW.COL copy = ((ResultSetType.ROW.COL) draftCopy);
                    {
                        Boolean dataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.data!= null)&&(!this.data.isEmpty())));
                        if (dataShouldBeCopiedAndSet == Boolean.TRUE) {
                            List<String> sourceDATA;
                            sourceDATA = (((this.data!= null)&&(!this.data.isEmpty()))?this.getDATA():null);
                            @SuppressWarnings("unchecked")
                            List<String> copyDATA = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "data", sourceDATA), sourceDATA, ((this.data!= null)&&(!this.data.isEmpty()))));
                            copy.data = null;
                            if (copyDATA!= null) {
                                List<String> uniqueDATAl = copy.getDATA();
                                uniqueDATAl.addAll(copyDATA);
                            }
                        } else {
                            if (dataShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.data = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new ResultSetType.ROW.COL();
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final ResultSetType.ROW.COL that = ((ResultSetType.ROW.COL) object);
                {
                    List<String> lhsDATA;
                    lhsDATA = (((this.data!= null)&&(!this.data.isEmpty()))?this.getDATA():null);
                    List<String> rhsDATA;
                    rhsDATA = (((that.data!= null)&&(!that.data.isEmpty()))?that.getDATA():null);
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "data", lhsDATA), LocatorUtils.property(thatLocator, "data", rhsDATA), lhsDATA, rhsDATA, ((this.data!= null)&&(!this.data.isEmpty())), ((that.data!= null)&&(!that.data.isEmpty())))) {
                        return false;
                    }
                }
                return true;
            }

            public boolean equals(Object object) {
                final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
                return equals(null, null, object, strategy);
            }

        }

    }

}
