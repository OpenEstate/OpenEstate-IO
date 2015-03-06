
package org.openestate.io.wis_it.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BENUTZER">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="KDNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OBJEKTE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ANZAHL" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="OBJEKT" type="{}ObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
public class WIS
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "BENUTZER", required = true)
    protected WIS.BENUTZER benutzer;
    @XmlElement(name = "OBJEKTE")
    protected WIS.OBJEKTE objekte;

    /**
     * Gets the value of the benutzer property.
     * 
     * @return
     *     possible object is
     *     {@link WIS.BENUTZER }
     *     
     */
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
    public void setOBJEKTE(WIS.OBJEKTE value) {
        this.objekte = value;
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
            WIS.BENUTZER theBENUTZER;
            theBENUTZER = this.getBENUTZER();
            strategy.appendField(locator, this, "benutzer", buffer, theBENUTZER);
        }
        {
            WIS.OBJEKTE theOBJEKTE;
            theOBJEKTE = this.getOBJEKTE();
            strategy.appendField(locator, this, "objekte", buffer, theOBJEKTE);
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
        if (draftCopy instanceof WIS) {
            final WIS copy = ((WIS) draftCopy);
            if (this.benutzer!= null) {
                WIS.BENUTZER sourceBENUTZER;
                sourceBENUTZER = this.getBENUTZER();
                WIS.BENUTZER copyBENUTZER = ((WIS.BENUTZER) strategy.copy(LocatorUtils.property(locator, "benutzer", sourceBENUTZER), sourceBENUTZER));
                copy.setBENUTZER(copyBENUTZER);
            } else {
                copy.benutzer = null;
            }
            if (this.objekte!= null) {
                WIS.OBJEKTE sourceOBJEKTE;
                sourceOBJEKTE = this.getOBJEKTE();
                WIS.OBJEKTE copyOBJEKTE = ((WIS.OBJEKTE) strategy.copy(LocatorUtils.property(locator, "objekte", sourceOBJEKTE), sourceOBJEKTE));
                copy.setOBJEKTE(copyOBJEKTE);
            } else {
                copy.objekte = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new WIS();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof WIS)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "benutzer", lhsBENUTZER), LocatorUtils.property(thatLocator, "benutzer", rhsBENUTZER), lhsBENUTZER, rhsBENUTZER)) {
                return false;
            }
        }
        {
            WIS.OBJEKTE lhsOBJEKTE;
            lhsOBJEKTE = this.getOBJEKTE();
            WIS.OBJEKTE rhsOBJEKTE;
            rhsOBJEKTE = that.getOBJEKTE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objekte", lhsOBJEKTE), LocatorUtils.property(thatLocator, "objekte", rhsOBJEKTE), lhsOBJEKTE, rhsOBJEKTE)) {
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="KDNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "kdnr"
    })
    public static class BENUTZER
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "KDNR", required = true)
        protected String kdnr;

        /**
         * Gets the value of the kdnr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
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
        public void setKDNR(String value) {
            this.kdnr = value;
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
                String theKDNR;
                theKDNR = this.getKDNR();
                strategy.appendField(locator, this, "kdnr", buffer, theKDNR);
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
            if (draftCopy instanceof WIS.BENUTZER) {
                final WIS.BENUTZER copy = ((WIS.BENUTZER) draftCopy);
                if (this.kdnr!= null) {
                    String sourceKDNR;
                    sourceKDNR = this.getKDNR();
                    String copyKDNR = ((String) strategy.copy(LocatorUtils.property(locator, "kdnr", sourceKDNR), sourceKDNR));
                    copy.setKDNR(copyKDNR);
                } else {
                    copy.kdnr = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new WIS.BENUTZER();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof WIS.BENUTZER)) {
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
                if (!strategy.equals(LocatorUtils.property(thisLocator, "kdnr", lhsKDNR), LocatorUtils.property(thatLocator, "kdnr", rhsKDNR), lhsKDNR, rhsKDNR)) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ANZAHL" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="OBJEKT" type="{}ObjectType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "anzahl",
        "objekt"
    })
    public static class OBJEKTE
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "ANZAHL", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "positiveInteger")
        protected Integer anzahl;
        @XmlElement(name = "OBJEKT")
        protected List<ObjectType> objekt;

        /**
         * Gets the value of the anzahl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Integer getANZAHL() {
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
        public void setANZAHL(Integer value) {
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
        public List<ObjectType> getOBJEKT() {
            if (objekt == null) {
                objekt = new ArrayList<ObjectType>();
            }
            return this.objekt;
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
                Integer theANZAHL;
                theANZAHL = this.getANZAHL();
                strategy.appendField(locator, this, "anzahl", buffer, theANZAHL);
            }
            {
                List<ObjectType> theOBJEKT;
                theOBJEKT = (((this.objekt!= null)&&(!this.objekt.isEmpty()))?this.getOBJEKT():null);
                strategy.appendField(locator, this, "objekt", buffer, theOBJEKT);
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
            if (draftCopy instanceof WIS.OBJEKTE) {
                final WIS.OBJEKTE copy = ((WIS.OBJEKTE) draftCopy);
                if (this.anzahl!= null) {
                    Integer sourceANZAHL;
                    sourceANZAHL = this.getANZAHL();
                    Integer copyANZAHL = ((Integer) strategy.copy(LocatorUtils.property(locator, "anzahl", sourceANZAHL), sourceANZAHL));
                    copy.setANZAHL(copyANZAHL);
                } else {
                    copy.anzahl = null;
                }
                if ((this.objekt!= null)&&(!this.objekt.isEmpty())) {
                    List<ObjectType> sourceOBJEKT;
                    sourceOBJEKT = (((this.objekt!= null)&&(!this.objekt.isEmpty()))?this.getOBJEKT():null);
                    @SuppressWarnings("unchecked")
                    List<ObjectType> copyOBJEKT = ((List<ObjectType> ) strategy.copy(LocatorUtils.property(locator, "objekt", sourceOBJEKT), sourceOBJEKT));
                    copy.objekt = null;
                    if (copyOBJEKT!= null) {
                        List<ObjectType> uniqueOBJEKTl = copy.getOBJEKT();
                        uniqueOBJEKTl.addAll(copyOBJEKT);
                    }
                } else {
                    copy.objekt = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new WIS.OBJEKTE();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof WIS.OBJEKTE)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final WIS.OBJEKTE that = ((WIS.OBJEKTE) object);
            {
                Integer lhsANZAHL;
                lhsANZAHL = this.getANZAHL();
                Integer rhsANZAHL;
                rhsANZAHL = that.getANZAHL();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahl", lhsANZAHL), LocatorUtils.property(thatLocator, "anzahl", rhsANZAHL), lhsANZAHL, rhsANZAHL)) {
                    return false;
                }
            }
            {
                List<ObjectType> lhsOBJEKT;
                lhsOBJEKT = (((this.objekt!= null)&&(!this.objekt.isEmpty()))?this.getOBJEKT():null);
                List<ObjectType> rhsOBJEKT;
                rhsOBJEKT = (((that.objekt!= null)&&(!that.objekt.isEmpty()))?that.getOBJEKT():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "objekt", lhsOBJEKT), LocatorUtils.property(thatLocator, "objekt", rhsOBJEKT), lhsOBJEKT, rhsOBJEKT)) {
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
