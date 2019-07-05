
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
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
 * <p>Java class for transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="price" type="{http://feed.immobiliare.it}priceType"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="auction" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="for-revenue" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ownership" type="{http://feed.immobiliare.it}ownershipType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
public class Transaction implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected PriceType price;
    @XmlAttribute(name = "type")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String type;
    @XmlAttribute(name = "auction")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean auction;
    @XmlAttribute(name = "for-revenue")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean forRevenue;
    @XmlAttribute(name = "ownership")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected OwnershipType ownership;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the auction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getAuction() {
        return auction;
    }

    /**
     * Sets the value of the auction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setAuction(Boolean value) {
        this.auction = value;
    }

    /**
     * Gets the value of the forRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getForRevenue() {
        return forRevenue;
    }

    /**
     * Sets the value of the forRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setForRevenue(Boolean value) {
        this.forRevenue = value;
    }

    /**
     * Gets the value of the ownership property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public OwnershipType getOwnership() {
        return ownership;
    }

    /**
     * Sets the value of the ownership property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setOwnership(OwnershipType value) {
        this.ownership = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            PriceType thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        {
            Boolean theAuction;
            theAuction = this.getAuction();
            strategy.appendField(locator, this, "auction", buffer, theAuction, (this.auction!= null));
        }
        {
            Boolean theForRevenue;
            theForRevenue = this.getForRevenue();
            strategy.appendField(locator, this, "forRevenue", buffer, theForRevenue, (this.forRevenue!= null));
        }
        {
            OwnershipType theOwnership;
            theOwnership = this.getOwnership();
            strategy.appendField(locator, this, "ownership", buffer, theOwnership, (this.ownership!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Transaction) {
            final Transaction copy = ((Transaction) draftCopy);
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
                Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceType;
                    sourceType = this.getType();
                    String copyType = ((String) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                    copy.setType(copyType);
                } else {
                    if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.type = null;
                    }
                }
            }
            {
                Boolean auctionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.auction!= null));
                if (auctionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAuction;
                    sourceAuction = this.getAuction();
                    Boolean copyAuction = ((Boolean) strategy.copy(LocatorUtils.property(locator, "auction", sourceAuction), sourceAuction, (this.auction!= null)));
                    copy.setAuction(copyAuction);
                } else {
                    if (auctionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.auction = null;
                    }
                }
            }
            {
                Boolean forRevenueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.forRevenue!= null));
                if (forRevenueShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceForRevenue;
                    sourceForRevenue = this.getForRevenue();
                    Boolean copyForRevenue = ((Boolean) strategy.copy(LocatorUtils.property(locator, "forRevenue", sourceForRevenue), sourceForRevenue, (this.forRevenue!= null)));
                    copy.setForRevenue(copyForRevenue);
                } else {
                    if (forRevenueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.forRevenue = null;
                    }
                }
            }
            {
                Boolean ownershipShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ownership!= null));
                if (ownershipShouldBeCopiedAndSet == Boolean.TRUE) {
                    OwnershipType sourceOwnership;
                    sourceOwnership = this.getOwnership();
                    OwnershipType copyOwnership = ((OwnershipType) strategy.copy(LocatorUtils.property(locator, "ownership", sourceOwnership), sourceOwnership, (this.ownership!= null)));
                    copy.setOwnership(copyOwnership);
                } else {
                    if (ownershipShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ownership = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Transaction();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Transaction that = ((Transaction) object);
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
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAuction;
            lhsAuction = this.getAuction();
            Boolean rhsAuction;
            rhsAuction = that.getAuction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auction", lhsAuction), LocatorUtils.property(thatLocator, "auction", rhsAuction), lhsAuction, rhsAuction, (this.auction!= null), (that.auction!= null))) {
                return false;
            }
        }
        {
            Boolean lhsForRevenue;
            lhsForRevenue = this.getForRevenue();
            Boolean rhsForRevenue;
            rhsForRevenue = that.getForRevenue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forRevenue", lhsForRevenue), LocatorUtils.property(thatLocator, "forRevenue", rhsForRevenue), lhsForRevenue, rhsForRevenue, (this.forRevenue!= null), (that.forRevenue!= null))) {
                return false;
            }
        }
        {
            OwnershipType lhsOwnership;
            lhsOwnership = this.getOwnership();
            OwnershipType rhsOwnership;
            rhsOwnership = that.getOwnership();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ownership", lhsOwnership), LocatorUtils.property(thatLocator, "ownership", rhsOwnership), lhsOwnership, rhsOwnership, (this.ownership!= null), (that.ownership!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
