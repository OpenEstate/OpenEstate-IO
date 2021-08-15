
package org.openestate.io.immobiliare_it.xml;

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
 * <p>Java class for lots complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lots"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="residential" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="commercial" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="lot" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="unique-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="property-type" type="{http://feed.immobiliare.it}propertyTypeProject"/&gt;
 *                   &lt;element name="price" type="{http://feed.immobiliare.it}priceType"/&gt;
 *                   &lt;element name="size" type="{http://feed.immobiliare.it}sizeType"/&gt;
 *                   &lt;element name="rooms" type="{http://feed.immobiliare.it}roomsType" minOccurs="0"/&gt;
 *                   &lt;element name="bathrooms" type="{http://feed.immobiliare.it}roomsType" minOccurs="0"/&gt;
 *                   &lt;element name="floor" type="{http://feed.immobiliare.it}floorProject" minOccurs="0"/&gt;
 *                   &lt;element name="garage" type="{http://feed.immobiliare.it}boxProject" minOccurs="0"/&gt;
 *                   &lt;element name="description" type="{http://feed.immobiliare.it}langtxt" minOccurs="0"/&gt;
 *                   &lt;element name="specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="pictures" type="{http://feed.immobiliare.it}pictures" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *                 &lt;attribute name="total" type="{http://feed.immobiliare.it}nullInteger" /&gt;
 *                 &lt;attribute name="forsale" type="{http://feed.immobiliare.it}nullInteger" /&gt;
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
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
@XmlType(name = "lots", propOrder = {
    "residential",
    "commercial",
    "lot"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
public class Lots implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "long")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger residential;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "long")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger commercial;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected List<Lots.Lot> lot;

    /**
     * Gets the value of the residential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getResidential() {
        return residential;
    }

    /**
     * Sets the value of the residential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setResidential(BigInteger value) {
        this.residential = value;
    }

    /**
     * Gets the value of the commercial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getCommercial() {
        return commercial;
    }

    /**
     * Sets the value of the commercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setCommercial(BigInteger value) {
        this.commercial = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lots.Lot }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public List<Lots.Lot> getLot() {
        if (lot == null) {
            lot = new ArrayList<Lots.Lot>();
        }
        return this.lot;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            BigInteger theResidential;
            theResidential = this.getResidential();
            strategy.appendField(locator, this, "residential", buffer, theResidential, (this.residential!= null));
        }
        {
            BigInteger theCommercial;
            theCommercial = this.getCommercial();
            strategy.appendField(locator, this, "commercial", buffer, theCommercial, (this.commercial!= null));
        }
        {
            List<Lots.Lot> theLot;
            theLot = (((this.lot!= null)&&(!this.lot.isEmpty()))?this.getLot():null);
            strategy.appendField(locator, this, "lot", buffer, theLot, ((this.lot!= null)&&(!this.lot.isEmpty())));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Lots) {
            final Lots copy = ((Lots) draftCopy);
            {
                Boolean residentialShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.residential!= null));
                if (residentialShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceResidential;
                    sourceResidential = this.getResidential();
                    BigInteger copyResidential = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "residential", sourceResidential), sourceResidential, (this.residential!= null)));
                    copy.setResidential(copyResidential);
                } else {
                    if (residentialShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.residential = null;
                    }
                }
            }
            {
                Boolean commercialShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.commercial!= null));
                if (commercialShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceCommercial;
                    sourceCommercial = this.getCommercial();
                    BigInteger copyCommercial = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "commercial", sourceCommercial), sourceCommercial, (this.commercial!= null)));
                    copy.setCommercial(copyCommercial);
                } else {
                    if (commercialShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.commercial = null;
                    }
                }
            }
            {
                Boolean lotShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.lot!= null)&&(!this.lot.isEmpty())));
                if (lotShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Lots.Lot> sourceLot;
                    sourceLot = (((this.lot!= null)&&(!this.lot.isEmpty()))?this.getLot():null);
                    @SuppressWarnings("unchecked")
                    List<Lots.Lot> copyLot = ((List<Lots.Lot> ) strategy.copy(LocatorUtils.property(locator, "lot", sourceLot), sourceLot, ((this.lot!= null)&&(!this.lot.isEmpty()))));
                    copy.lot = null;
                    if (copyLot!= null) {
                        List<Lots.Lot> uniqueLotl = copy.getLot();
                        uniqueLotl.addAll(copyLot);
                    }
                } else {
                    if (lotShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lot = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Lots();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Lots that = ((Lots) object);
        {
            BigInteger lhsResidential;
            lhsResidential = this.getResidential();
            BigInteger rhsResidential;
            rhsResidential = that.getResidential();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "residential", lhsResidential), LocatorUtils.property(thatLocator, "residential", rhsResidential), lhsResidential, rhsResidential, (this.residential!= null), (that.residential!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsCommercial;
            lhsCommercial = this.getCommercial();
            BigInteger rhsCommercial;
            rhsCommercial = that.getCommercial();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercial", lhsCommercial), LocatorUtils.property(thatLocator, "commercial", rhsCommercial), lhsCommercial, rhsCommercial, (this.commercial!= null), (that.commercial!= null))) {
                return false;
            }
        }
        {
            List<Lots.Lot> lhsLot;
            lhsLot = (((this.lot!= null)&&(!this.lot.isEmpty()))?this.getLot():null);
            List<Lots.Lot> rhsLot;
            rhsLot = (((that.lot!= null)&&(!that.lot.isEmpty()))?that.getLot():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lot", lhsLot), LocatorUtils.property(thatLocator, "lot", rhsLot), lhsLot, rhsLot, ((this.lot!= null)&&(!this.lot.isEmpty())), ((that.lot!= null)&&(!that.lot.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
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
     *       &lt;all&gt;
     *         &lt;element name="unique-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="property-type" type="{http://feed.immobiliare.it}propertyTypeProject"/&gt;
     *         &lt;element name="price" type="{http://feed.immobiliare.it}priceType"/&gt;
     *         &lt;element name="size" type="{http://feed.immobiliare.it}sizeType"/&gt;
     *         &lt;element name="rooms" type="{http://feed.immobiliare.it}roomsType" minOccurs="0"/&gt;
     *         &lt;element name="bathrooms" type="{http://feed.immobiliare.it}roomsType" minOccurs="0"/&gt;
     *         &lt;element name="floor" type="{http://feed.immobiliare.it}floorProject" minOccurs="0"/&gt;
     *         &lt;element name="garage" type="{http://feed.immobiliare.it}boxProject" minOccurs="0"/&gt;
     *         &lt;element name="description" type="{http://feed.immobiliare.it}langtxt" minOccurs="0"/&gt;
     *         &lt;element name="specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="pictures" type="{http://feed.immobiliare.it}pictures" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *       &lt;attribute name="total" type="{http://feed.immobiliare.it}nullInteger" /&gt;
     *       &lt;attribute name="forsale" type="{http://feed.immobiliare.it}nullInteger" /&gt;
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public static class Lot implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(name = "unique-id")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected String uniqueId;
        @XmlElement(name = "property-type", required = true)
        @XmlSchemaType(name = "string")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected ProjectPropertyType propertyType;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected PriceType price;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected SizeType size;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected RoomsType rooms;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected RoomsType bathrooms;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected FloorProject floor;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected BoxProject garage;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected Langtxt description;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected String specification;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected Pictures pictures;
        @XmlAttribute(name = "total")
        @XmlJavaTypeAdapter(Adapter9 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected BigInteger total;
        @XmlAttribute(name = "forsale")
        @XmlJavaTypeAdapter(Adapter9 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected BigInteger forsale;
        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(Adapter4 .class)
        @XmlSchemaType(name = "long")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        protected BigInteger id;

        /**
         * Gets the value of the uniqueId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public String getUniqueId() {
            return uniqueId;
        }

        /**
         * Sets the value of the uniqueId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setUniqueId(String value) {
            this.uniqueId = value;
        }

        /**
         * Gets the value of the propertyType property.
         * 
         * @return
         *     possible object is
         *     {@link ProjectPropertyType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public ProjectPropertyType getPropertyType() {
            return propertyType;
        }

        /**
         * Sets the value of the propertyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProjectPropertyType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setPropertyType(ProjectPropertyType value) {
            this.propertyType = value;
        }

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link PriceType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public PriceType getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setPrice(PriceType value) {
            this.price = value;
        }

        /**
         * Gets the value of the size property.
         * 
         * @return
         *     possible object is
         *     {@link SizeType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public SizeType getSize() {
            return size;
        }

        /**
         * Sets the value of the size property.
         * 
         * @param value
         *     allowed object is
         *     {@link SizeType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setSize(SizeType value) {
            this.size = value;
        }

        /**
         * Gets the value of the rooms property.
         * 
         * @return
         *     possible object is
         *     {@link RoomsType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public RoomsType getRooms() {
            return rooms;
        }

        /**
         * Sets the value of the rooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link RoomsType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setRooms(RoomsType value) {
            this.rooms = value;
        }

        /**
         * Gets the value of the bathrooms property.
         * 
         * @return
         *     possible object is
         *     {@link RoomsType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public RoomsType getBathrooms() {
            return bathrooms;
        }

        /**
         * Sets the value of the bathrooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link RoomsType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setBathrooms(RoomsType value) {
            this.bathrooms = value;
        }

        /**
         * Gets the value of the floor property.
         * 
         * @return
         *     possible object is
         *     {@link FloorProject }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public FloorProject getFloor() {
            return floor;
        }

        /**
         * Sets the value of the floor property.
         * 
         * @param value
         *     allowed object is
         *     {@link FloorProject }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setFloor(FloorProject value) {
            this.floor = value;
        }

        /**
         * Gets the value of the garage property.
         * 
         * @return
         *     possible object is
         *     {@link BoxProject }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public BoxProject getGarage() {
            return garage;
        }

        /**
         * Sets the value of the garage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BoxProject }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setGarage(BoxProject value) {
            this.garage = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link Langtxt }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Langtxt getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link Langtxt }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setDescription(Langtxt value) {
            this.description = value;
        }

        /**
         * Gets the value of the specification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public String getSpecification() {
            return specification;
        }

        /**
         * Sets the value of the specification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setSpecification(String value) {
            this.specification = value;
        }

        /**
         * Gets the value of the pictures property.
         * 
         * @return
         *     possible object is
         *     {@link Pictures }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Pictures getPictures() {
            return pictures;
        }

        /**
         * Sets the value of the pictures property.
         * 
         * @param value
         *     allowed object is
         *     {@link Pictures }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setPictures(Pictures value) {
            this.pictures = value;
        }

        /**
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public BigInteger getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setTotal(BigInteger value) {
            this.total = value;
        }

        /**
         * Gets the value of the forsale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public BigInteger getForsale() {
            return forsale;
        }

        /**
         * Sets the value of the forsale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setForsale(BigInteger value) {
            this.forsale = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public BigInteger getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public void setID(BigInteger value) {
            this.id = value;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                String theUniqueId;
                theUniqueId = this.getUniqueId();
                strategy.appendField(locator, this, "uniqueId", buffer, theUniqueId, (this.uniqueId!= null));
            }
            {
                ProjectPropertyType thePropertyType;
                thePropertyType = this.getPropertyType();
                strategy.appendField(locator, this, "propertyType", buffer, thePropertyType, (this.propertyType!= null));
            }
            {
                PriceType thePrice;
                thePrice = this.getPrice();
                strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
            }
            {
                SizeType theSize;
                theSize = this.getSize();
                strategy.appendField(locator, this, "size", buffer, theSize, (this.size!= null));
            }
            {
                RoomsType theRooms;
                theRooms = this.getRooms();
                strategy.appendField(locator, this, "rooms", buffer, theRooms, (this.rooms!= null));
            }
            {
                RoomsType theBathrooms;
                theBathrooms = this.getBathrooms();
                strategy.appendField(locator, this, "bathrooms", buffer, theBathrooms, (this.bathrooms!= null));
            }
            {
                FloorProject theFloor;
                theFloor = this.getFloor();
                strategy.appendField(locator, this, "floor", buffer, theFloor, (this.floor!= null));
            }
            {
                BoxProject theGarage;
                theGarage = this.getGarage();
                strategy.appendField(locator, this, "garage", buffer, theGarage, (this.garage!= null));
            }
            {
                Langtxt theDescription;
                theDescription = this.getDescription();
                strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
            }
            {
                String theSpecification;
                theSpecification = this.getSpecification();
                strategy.appendField(locator, this, "specification", buffer, theSpecification, (this.specification!= null));
            }
            {
                Pictures thePictures;
                thePictures = this.getPictures();
                strategy.appendField(locator, this, "pictures", buffer, thePictures, (this.pictures!= null));
            }
            {
                BigInteger theTotal;
                theTotal = this.getTotal();
                strategy.appendField(locator, this, "total", buffer, theTotal, (this.total!= null));
            }
            {
                BigInteger theForsale;
                theForsale = this.getForsale();
                strategy.appendField(locator, this, "forsale", buffer, theForsale, (this.forsale!= null));
            }
            {
                BigInteger theID;
                theID = this.getID();
                strategy.appendField(locator, this, "id", buffer, theID, (this.id!= null));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof Lots.Lot) {
                final Lots.Lot copy = ((Lots.Lot) draftCopy);
                {
                    Boolean uniqueIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.uniqueId!= null));
                    if (uniqueIdShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceUniqueId;
                        sourceUniqueId = this.getUniqueId();
                        String copyUniqueId = ((String) strategy.copy(LocatorUtils.property(locator, "uniqueId", sourceUniqueId), sourceUniqueId, (this.uniqueId!= null)));
                        copy.setUniqueId(copyUniqueId);
                    } else {
                        if (uniqueIdShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.uniqueId = null;
                        }
                    }
                }
                {
                    Boolean propertyTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.propertyType!= null));
                    if (propertyTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                        ProjectPropertyType sourcePropertyType;
                        sourcePropertyType = this.getPropertyType();
                        ProjectPropertyType copyPropertyType = ((ProjectPropertyType) strategy.copy(LocatorUtils.property(locator, "propertyType", sourcePropertyType), sourcePropertyType, (this.propertyType!= null)));
                        copy.setPropertyType(copyPropertyType);
                    } else {
                        if (propertyTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.propertyType = null;
                        }
                    }
                }
                {
                    Boolean priceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.price!= null));
                    if (priceShouldBeCopiedAndSet == Boolean.TRUE) {
                        PriceType sourcePrice;
                        sourcePrice = this.getPrice();
                        PriceType copyPrice = ((PriceType) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice, (this.price!= null)));
                        copy.setPrice(copyPrice);
                    } else {
                        if (priceShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.price = null;
                        }
                    }
                }
                {
                    Boolean sizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.size!= null));
                    if (sizeShouldBeCopiedAndSet == Boolean.TRUE) {
                        SizeType sourceSize;
                        sourceSize = this.getSize();
                        SizeType copySize = ((SizeType) strategy.copy(LocatorUtils.property(locator, "size", sourceSize), sourceSize, (this.size!= null)));
                        copy.setSize(copySize);
                    } else {
                        if (sizeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.size = null;
                        }
                    }
                }
                {
                    Boolean roomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rooms!= null));
                    if (roomsShouldBeCopiedAndSet == Boolean.TRUE) {
                        RoomsType sourceRooms;
                        sourceRooms = this.getRooms();
                        RoomsType copyRooms = ((RoomsType) strategy.copy(LocatorUtils.property(locator, "rooms", sourceRooms), sourceRooms, (this.rooms!= null)));
                        copy.setRooms(copyRooms);
                    } else {
                        if (roomsShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.rooms = null;
                        }
                    }
                }
                {
                    Boolean bathroomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bathrooms!= null));
                    if (bathroomsShouldBeCopiedAndSet == Boolean.TRUE) {
                        RoomsType sourceBathrooms;
                        sourceBathrooms = this.getBathrooms();
                        RoomsType copyBathrooms = ((RoomsType) strategy.copy(LocatorUtils.property(locator, "bathrooms", sourceBathrooms), sourceBathrooms, (this.bathrooms!= null)));
                        copy.setBathrooms(copyBathrooms);
                    } else {
                        if (bathroomsShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.bathrooms = null;
                        }
                    }
                }
                {
                    Boolean floorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floor!= null));
                    if (floorShouldBeCopiedAndSet == Boolean.TRUE) {
                        FloorProject sourceFloor;
                        sourceFloor = this.getFloor();
                        FloorProject copyFloor = ((FloorProject) strategy.copy(LocatorUtils.property(locator, "floor", sourceFloor), sourceFloor, (this.floor!= null)));
                        copy.setFloor(copyFloor);
                    } else {
                        if (floorShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.floor = null;
                        }
                    }
                }
                {
                    Boolean garageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garage!= null));
                    if (garageShouldBeCopiedAndSet == Boolean.TRUE) {
                        BoxProject sourceGarage;
                        sourceGarage = this.getGarage();
                        BoxProject copyGarage = ((BoxProject) strategy.copy(LocatorUtils.property(locator, "garage", sourceGarage), sourceGarage, (this.garage!= null)));
                        copy.setGarage(copyGarage);
                    } else {
                        if (garageShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.garage = null;
                        }
                    }
                }
                {
                    Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                    if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                        Langtxt sourceDescription;
                        sourceDescription = this.getDescription();
                        Langtxt copyDescription = ((Langtxt) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
                        copy.setDescription(copyDescription);
                    } else {
                        if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.description = null;
                        }
                    }
                }
                {
                    Boolean specificationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.specification!= null));
                    if (specificationShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceSpecification;
                        sourceSpecification = this.getSpecification();
                        String copySpecification = ((String) strategy.copy(LocatorUtils.property(locator, "specification", sourceSpecification), sourceSpecification, (this.specification!= null)));
                        copy.setSpecification(copySpecification);
                    } else {
                        if (specificationShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.specification = null;
                        }
                    }
                }
                {
                    Boolean picturesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pictures!= null));
                    if (picturesShouldBeCopiedAndSet == Boolean.TRUE) {
                        Pictures sourcePictures;
                        sourcePictures = this.getPictures();
                        Pictures copyPictures = ((Pictures) strategy.copy(LocatorUtils.property(locator, "pictures", sourcePictures), sourcePictures, (this.pictures!= null)));
                        copy.setPictures(copyPictures);
                    } else {
                        if (picturesShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.pictures = null;
                        }
                    }
                }
                {
                    Boolean totalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.total!= null));
                    if (totalShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceTotal;
                        sourceTotal = this.getTotal();
                        BigInteger copyTotal = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "total", sourceTotal), sourceTotal, (this.total!= null)));
                        copy.setTotal(copyTotal);
                    } else {
                        if (totalShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.total = null;
                        }
                    }
                }
                {
                    Boolean forsaleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.forsale!= null));
                    if (forsaleShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceForsale;
                        sourceForsale = this.getForsale();
                        BigInteger copyForsale = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "forsale", sourceForsale), sourceForsale, (this.forsale!= null)));
                        copy.setForsale(copyForsale);
                    } else {
                        if (forsaleShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.forsale = null;
                        }
                    }
                }
                {
                    Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                    if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceID;
                        sourceID = this.getID();
                        BigInteger copyID = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "id", sourceID), sourceID, (this.id!= null)));
                        copy.setID(copyID);
                    } else {
                        if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.id = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new Lots.Lot();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Lots.Lot that = ((Lots.Lot) object);
            {
                String lhsUniqueId;
                lhsUniqueId = this.getUniqueId();
                String rhsUniqueId;
                rhsUniqueId = that.getUniqueId();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "uniqueId", lhsUniqueId), LocatorUtils.property(thatLocator, "uniqueId", rhsUniqueId), lhsUniqueId, rhsUniqueId, (this.uniqueId!= null), (that.uniqueId!= null))) {
                    return false;
                }
            }
            {
                ProjectPropertyType lhsPropertyType;
                lhsPropertyType = this.getPropertyType();
                ProjectPropertyType rhsPropertyType;
                rhsPropertyType = that.getPropertyType();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyType", lhsPropertyType), LocatorUtils.property(thatLocator, "propertyType", rhsPropertyType), lhsPropertyType, rhsPropertyType, (this.propertyType!= null), (that.propertyType!= null))) {
                    return false;
                }
            }
            {
                PriceType lhsPrice;
                lhsPrice = this.getPrice();
                PriceType rhsPrice;
                rhsPrice = that.getPrice();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice, (this.price!= null), (that.price!= null))) {
                    return false;
                }
            }
            {
                SizeType lhsSize;
                lhsSize = this.getSize();
                SizeType rhsSize;
                rhsSize = that.getSize();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize, (this.size!= null), (that.size!= null))) {
                    return false;
                }
            }
            {
                RoomsType lhsRooms;
                lhsRooms = this.getRooms();
                RoomsType rhsRooms;
                rhsRooms = that.getRooms();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "rooms", lhsRooms), LocatorUtils.property(thatLocator, "rooms", rhsRooms), lhsRooms, rhsRooms, (this.rooms!= null), (that.rooms!= null))) {
                    return false;
                }
            }
            {
                RoomsType lhsBathrooms;
                lhsBathrooms = this.getBathrooms();
                RoomsType rhsBathrooms;
                rhsBathrooms = that.getBathrooms();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "bathrooms", lhsBathrooms), LocatorUtils.property(thatLocator, "bathrooms", rhsBathrooms), lhsBathrooms, rhsBathrooms, (this.bathrooms!= null), (that.bathrooms!= null))) {
                    return false;
                }
            }
            {
                FloorProject lhsFloor;
                lhsFloor = this.getFloor();
                FloorProject rhsFloor;
                rhsFloor = that.getFloor();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor, (this.floor!= null), (that.floor!= null))) {
                    return false;
                }
            }
            {
                BoxProject lhsGarage;
                lhsGarage = this.getGarage();
                BoxProject rhsGarage;
                rhsGarage = that.getGarage();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "garage", lhsGarage), LocatorUtils.property(thatLocator, "garage", rhsGarage), lhsGarage, rhsGarage, (this.garage!= null), (that.garage!= null))) {
                    return false;
                }
            }
            {
                Langtxt lhsDescription;
                lhsDescription = this.getDescription();
                Langtxt rhsDescription;
                rhsDescription = that.getDescription();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                    return false;
                }
            }
            {
                String lhsSpecification;
                lhsSpecification = this.getSpecification();
                String rhsSpecification;
                rhsSpecification = that.getSpecification();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "specification", lhsSpecification), LocatorUtils.property(thatLocator, "specification", rhsSpecification), lhsSpecification, rhsSpecification, (this.specification!= null), (that.specification!= null))) {
                    return false;
                }
            }
            {
                Pictures lhsPictures;
                lhsPictures = this.getPictures();
                Pictures rhsPictures;
                rhsPictures = that.getPictures();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "pictures", lhsPictures), LocatorUtils.property(thatLocator, "pictures", rhsPictures), lhsPictures, rhsPictures, (this.pictures!= null), (that.pictures!= null))) {
                    return false;
                }
            }
            {
                BigInteger lhsTotal;
                lhsTotal = this.getTotal();
                BigInteger rhsTotal;
                rhsTotal = that.getTotal();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "total", lhsTotal), LocatorUtils.property(thatLocator, "total", rhsTotal), lhsTotal, rhsTotal, (this.total!= null), (that.total!= null))) {
                    return false;
                }
            }
            {
                BigInteger lhsForsale;
                lhsForsale = this.getForsale();
                BigInteger rhsForsale;
                rhsForsale = that.getForsale();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "forsale", lhsForsale), LocatorUtils.property(thatLocator, "forsale", rhsForsale), lhsForsale, rhsForsale, (this.forsale!= null), (that.forsale!= null))) {
                    return false;
                }
            }
            {
                BigInteger lhsID;
                lhsID = this.getID();
                BigInteger rhsID;
                rhsID = that.getID();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID, (this.id!= null), (that.id!= null))) {
                    return false;
                }
            }
            return true;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
            return equals(null, null, object, strategy);
        }

    }

}
