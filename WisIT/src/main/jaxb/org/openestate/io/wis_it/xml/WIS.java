
package org.openestate.io.wis_it.xml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BENUTZER"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="KDNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OBJEKTE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ANZAHL" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                   &lt;element name="OBJEKT" type="{}ObjectType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "", propOrder = {
    "benutzer",
    "objekte"
})
@XmlRootElement(name = "WIS")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
public class WIS implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "BENUTZER", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    protected WIS.BENUTZER benutzer;
    @XmlElement(name = "OBJEKTE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    protected WIS.OBJEKTE objekte;

    /**
     * Gets the value of the benutzer property.
     * 
     * @return
     *     possible object is
     *     {@link WIS.BENUTZER }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    public WIS.BENUTZER getBENUTZER() {
        return benutzer;
    }

    /**
     * Sets the value of the benutzer property.
     * 
     * @param value
     *     allowed object is
     *     {@link WIS.BENUTZER }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    public void setBENUTZER(WIS.BENUTZER value) {
        this.benutzer = value;
    }

    /**
     * Gets the value of the objekte property.
     * 
     * @return
     *     possible object is
     *     {@link WIS.OBJEKTE }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    public WIS.OBJEKTE getOBJEKTE() {
        return objekte;
    }

    /**
     * Sets the value of the objekte property.
     * 
     * @param value
     *     allowed object is
     *     {@link WIS.OBJEKTE }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    public void setOBJEKTE(WIS.OBJEKTE value) {
        this.objekte = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            WIS.BENUTZER theBENUTZER;
            theBENUTZER = this.getBENUTZER();
            strategy.appendField(locator, this, "benutzer", buffer, theBENUTZER, (this.benutzer!= null));
        }
        {
            WIS.OBJEKTE theOBJEKTE;
            theOBJEKTE = this.getOBJEKTE();
            strategy.appendField(locator, this, "objekte", buffer, theOBJEKTE, (this.objekte!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof WIS) {
            final WIS copy = ((WIS) draftCopy);
            {
                Boolean benutzerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.benutzer!= null));
                if (benutzerShouldBeCopiedAndSet == Boolean.TRUE) {
                    WIS.BENUTZER sourceBENUTZER;
                    sourceBENUTZER = this.getBENUTZER();
                    WIS.BENUTZER copyBENUTZER = ((WIS.BENUTZER) strategy.copy(LocatorUtils.property(locator, "benutzer", sourceBENUTZER), sourceBENUTZER, (this.benutzer!= null)));
                    copy.setBENUTZER(copyBENUTZER);
                } else {
                    if (benutzerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.benutzer = null;
                    }
                }
            }
            {
                Boolean objekteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objekte!= null));
                if (objekteShouldBeCopiedAndSet == Boolean.TRUE) {
                    WIS.OBJEKTE sourceOBJEKTE;
                    sourceOBJEKTE = this.getOBJEKTE();
                    WIS.OBJEKTE copyOBJEKTE = ((WIS.OBJEKTE) strategy.copy(LocatorUtils.property(locator, "objekte", sourceOBJEKTE), sourceOBJEKTE, (this.objekte!= null)));
                    copy.setOBJEKTE(copyOBJEKTE);
                } else {
                    if (objekteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objekte = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new WIS();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final WIS that = ((WIS) object);
        {
            WIS.BENUTZER lhsBENUTZER;
            lhsBENUTZER = this.getBENUTZER();
            WIS.BENUTZER rhsBENUTZER;
            rhsBENUTZER = that.getBENUTZER();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "benutzer", lhsBENUTZER), LocatorUtils.property(thatLocator, "benutzer", rhsBENUTZER), lhsBENUTZER, rhsBENUTZER, (this.benutzer!= null), (that.benutzer!= null))) {
                return false;
            }
        }
        {
            WIS.OBJEKTE lhsOBJEKTE;
            lhsOBJEKTE = this.getOBJEKTE();
            WIS.OBJEKTE rhsOBJEKTE;
            rhsOBJEKTE = that.getOBJEKTE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objekte", lhsOBJEKTE), LocatorUtils.property(thatLocator, "objekte", rhsOBJEKTE), lhsOBJEKTE, rhsOBJEKTE, (this.objekte!= null), (that.objekte!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
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
     *         &lt;element name="KDNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "kdnr"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    public static class BENUTZER implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(name = "KDNR", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        protected String kdnr;

        /**
         * Gets the value of the kdnr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public String getKDNR() {
            return kdnr;
        }

        /**
         * Sets the value of the kdnr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public void setKDNR(String value) {
            this.kdnr = value;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                String theKDNR;
                theKDNR = this.getKDNR();
                strategy.appendField(locator, this, "kdnr", buffer, theKDNR, (this.kdnr!= null));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof WIS.BENUTZER) {
                final WIS.BENUTZER copy = ((WIS.BENUTZER) draftCopy);
                {
                    Boolean kdnrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kdnr!= null));
                    if (kdnrShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceKDNR;
                        sourceKDNR = this.getKDNR();
                        String copyKDNR = ((String) strategy.copy(LocatorUtils.property(locator, "kdnr", sourceKDNR), sourceKDNR, (this.kdnr!= null)));
                        copy.setKDNR(copyKDNR);
                    } else {
                        if (kdnrShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.kdnr = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new WIS.BENUTZER();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final WIS.BENUTZER that = ((WIS.BENUTZER) object);
            {
                String lhsKDNR;
                lhsKDNR = this.getKDNR();
                String rhsKDNR;
                rhsKDNR = that.getKDNR();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "kdnr", lhsKDNR), LocatorUtils.property(thatLocator, "kdnr", rhsKDNR), lhsKDNR, rhsKDNR, (this.kdnr!= null), (that.kdnr!= null))) {
                    return false;
                }
            }
            return true;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
            return equals(null, null, object, strategy);
        }

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
     *         &lt;element name="ANZAHL" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *         &lt;element name="OBJEKT" type="{}ObjectType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "anzahl",
        "objekt"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
    public static class OBJEKTE implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(name = "ANZAHL", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "positiveInteger")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        protected BigInteger anzahl;
        @XmlElement(name = "OBJEKT")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        protected List<ObjectType> objekt;

        /**
         * Gets the value of the anzahl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public BigInteger getANZAHL() {
            return anzahl;
        }

        /**
         * Sets the value of the anzahl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public void setANZAHL(BigInteger value) {
            this.anzahl = value;
        }

        /**
         * Gets the value of the objekt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the objekt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOBJEKT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ObjectType }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public List<ObjectType> getOBJEKT() {
            if (objekt == null) {
                objekt = new ArrayList<ObjectType>();
            }
            return this.objekt;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                BigInteger theANZAHL;
                theANZAHL = this.getANZAHL();
                strategy.appendField(locator, this, "anzahl", buffer, theANZAHL, (this.anzahl!= null));
            }
            {
                List<ObjectType> theOBJEKT;
                theOBJEKT = (((this.objekt!= null)&&(!this.objekt.isEmpty()))?this.getOBJEKT():null);
                strategy.appendField(locator, this, "objekt", buffer, theOBJEKT, ((this.objekt!= null)&&(!this.objekt.isEmpty())));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof WIS.OBJEKTE) {
                final WIS.OBJEKTE copy = ((WIS.OBJEKTE) draftCopy);
                {
                    Boolean anzahlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahl!= null));
                    if (anzahlShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceANZAHL;
                        sourceANZAHL = this.getANZAHL();
                        BigInteger copyANZAHL = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "anzahl", sourceANZAHL), sourceANZAHL, (this.anzahl!= null)));
                        copy.setANZAHL(copyANZAHL);
                    } else {
                        if (anzahlShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.anzahl = null;
                        }
                    }
                }
                {
                    Boolean objektShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.objekt!= null)&&(!this.objekt.isEmpty())));
                    if (objektShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<ObjectType> sourceOBJEKT;
                        sourceOBJEKT = (((this.objekt!= null)&&(!this.objekt.isEmpty()))?this.getOBJEKT():null);
                        @SuppressWarnings("unchecked")
                        List<ObjectType> copyOBJEKT = ((List<ObjectType> ) strategy.copy(LocatorUtils.property(locator, "objekt", sourceOBJEKT), sourceOBJEKT, ((this.objekt!= null)&&(!this.objekt.isEmpty()))));
                        copy.objekt = null;
                        if (copyOBJEKT!= null) {
                            List<ObjectType> uniqueOBJEKTl = copy.getOBJEKT();
                            uniqueOBJEKTl.addAll(copyOBJEKT);
                        }
                    } else {
                        if (objektShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.objekt = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new WIS.OBJEKTE();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final WIS.OBJEKTE that = ((WIS.OBJEKTE) object);
            {
                BigInteger lhsANZAHL;
                lhsANZAHL = this.getANZAHL();
                BigInteger rhsANZAHL;
                rhsANZAHL = that.getANZAHL();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahl", lhsANZAHL), LocatorUtils.property(thatLocator, "anzahl", rhsANZAHL), lhsANZAHL, rhsANZAHL, (this.anzahl!= null), (that.anzahl!= null))) {
                    return false;
                }
            }
            {
                List<ObjectType> lhsOBJEKT;
                lhsOBJEKT = (((this.objekt!= null)&&(!this.objekt.isEmpty()))?this.getOBJEKT():null);
                List<ObjectType> rhsOBJEKT;
                rhsOBJEKT = (((that.objekt!= null)&&(!that.objekt.isEmpty()))?that.getOBJEKT():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "objekt", lhsOBJEKT), LocatorUtils.property(thatLocator, "objekt", rhsOBJEKT), lhsOBJEKT, rhsOBJEKT, ((this.objekt!= null)&&(!this.objekt.isEmpty())), ((that.objekt!= null)&&(!that.objekt.isEmpty())))) {
                    return false;
                }
            }
            return true;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:32:15+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
            return equals(null, null, object, strategy);
        }

    }

}
