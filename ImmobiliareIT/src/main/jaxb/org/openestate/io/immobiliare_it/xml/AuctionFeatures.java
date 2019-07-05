
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * <p>Java class for auction-features complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auction-features"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auctions"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="auction" type="{http://feed.immobiliare.it}auction" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="starting-price"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;long"&gt;
 *                 &lt;attribute name="currency" use="required" type="{http://feed.immobiliare.it}currency" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="minimum-bid" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;int"&gt;
 *                 &lt;attribute name="currency" use="required" type="{http://feed.immobiliare.it}currency" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="success-price" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;long"&gt;
 *                 &lt;attribute name="currency" use="required" type="{http://feed.immobiliare.it}currency" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="court" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="type"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="court"/&gt;
 *                       &lt;enumeration value="other"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="reference" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="actors" type="{http://feed.immobiliare.it}actors" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Esecuzione immobiliare"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auction-features", propOrder = {
    "auctions",
    "startingPrice",
    "minimumBid",
    "successPrice",
    "court",
    "reference",
    "actors",
    "notes"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
public class AuctionFeatures implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected AuctionFeatures.Auctions auctions;
    @XmlElement(name = "starting-price", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected AuctionFeatures.StartingPrice startingPrice;
    @XmlElement(name = "minimum-bid")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected AuctionFeatures.MinimumBid minimumBid;
    @XmlElement(name = "success-price")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected AuctionFeatures.SuccessPrice successPrice;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected AuctionFeatures.Court court;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected AuctionFeatures.Reference reference;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Actors actors;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String notes;
    @XmlAttribute(name = "type")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected AuctionFeatures.Type type;

    /**
     * Gets the value of the auctions property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionFeatures.Auctions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public AuctionFeatures.Auctions getAuctions() {
        return auctions;
    }

    /**
     * Sets the value of the auctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionFeatures.Auctions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setAuctions(AuctionFeatures.Auctions value) {
        this.auctions = value;
    }

    /**
     * Gets the value of the startingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionFeatures.StartingPrice }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public AuctionFeatures.StartingPrice getStartingPrice() {
        return startingPrice;
    }

    /**
     * Sets the value of the startingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionFeatures.StartingPrice }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setStartingPrice(AuctionFeatures.StartingPrice value) {
        this.startingPrice = value;
    }

    /**
     * Gets the value of the minimumBid property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionFeatures.MinimumBid }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public AuctionFeatures.MinimumBid getMinimumBid() {
        return minimumBid;
    }

    /**
     * Sets the value of the minimumBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionFeatures.MinimumBid }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setMinimumBid(AuctionFeatures.MinimumBid value) {
        this.minimumBid = value;
    }

    /**
     * Gets the value of the successPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionFeatures.SuccessPrice }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public AuctionFeatures.SuccessPrice getSuccessPrice() {
        return successPrice;
    }

    /**
     * Sets the value of the successPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionFeatures.SuccessPrice }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setSuccessPrice(AuctionFeatures.SuccessPrice value) {
        this.successPrice = value;
    }

    /**
     * Gets the value of the court property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionFeatures.Court }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public AuctionFeatures.Court getCourt() {
        return court;
    }

    /**
     * Sets the value of the court property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionFeatures.Court }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setCourt(AuctionFeatures.Court value) {
        this.court = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionFeatures.Reference }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public AuctionFeatures.Reference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionFeatures.Reference }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setReference(AuctionFeatures.Reference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the actors property.
     * 
     * @return
     *     possible object is
     *     {@link Actors }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Actors getActors() {
        return actors;
    }

    /**
     * Sets the value of the actors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Actors }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setActors(Actors value) {
        this.actors = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionFeatures.Type }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public AuctionFeatures.Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionFeatures.Type }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setType(AuctionFeatures.Type value) {
        this.type = value;
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
            AuctionFeatures.Auctions theAuctions;
            theAuctions = this.getAuctions();
            strategy.appendField(locator, this, "auctions", buffer, theAuctions, (this.auctions!= null));
        }
        {
            AuctionFeatures.StartingPrice theStartingPrice;
            theStartingPrice = this.getStartingPrice();
            strategy.appendField(locator, this, "startingPrice", buffer, theStartingPrice, (this.startingPrice!= null));
        }
        {
            AuctionFeatures.MinimumBid theMinimumBid;
            theMinimumBid = this.getMinimumBid();
            strategy.appendField(locator, this, "minimumBid", buffer, theMinimumBid, (this.minimumBid!= null));
        }
        {
            AuctionFeatures.SuccessPrice theSuccessPrice;
            theSuccessPrice = this.getSuccessPrice();
            strategy.appendField(locator, this, "successPrice", buffer, theSuccessPrice, (this.successPrice!= null));
        }
        {
            AuctionFeatures.Court theCourt;
            theCourt = this.getCourt();
            strategy.appendField(locator, this, "court", buffer, theCourt, (this.court!= null));
        }
        {
            AuctionFeatures.Reference theReference;
            theReference = this.getReference();
            strategy.appendField(locator, this, "reference", buffer, theReference, (this.reference!= null));
        }
        {
            Actors theActors;
            theActors = this.getActors();
            strategy.appendField(locator, this, "actors", buffer, theActors, (this.actors!= null));
        }
        {
            String theNotes;
            theNotes = this.getNotes();
            strategy.appendField(locator, this, "notes", buffer, theNotes, (this.notes!= null));
        }
        {
            AuctionFeatures.Type theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
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
        if (draftCopy instanceof AuctionFeatures) {
            final AuctionFeatures copy = ((AuctionFeatures) draftCopy);
            {
                Boolean auctionsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.auctions!= null));
                if (auctionsShouldBeCopiedAndSet == Boolean.TRUE) {
                    AuctionFeatures.Auctions sourceAuctions;
                    sourceAuctions = this.getAuctions();
                    AuctionFeatures.Auctions copyAuctions = ((AuctionFeatures.Auctions) strategy.copy(LocatorUtils.property(locator, "auctions", sourceAuctions), sourceAuctions, (this.auctions!= null)));
                    copy.setAuctions(copyAuctions);
                } else {
                    if (auctionsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.auctions = null;
                    }
                }
            }
            {
                Boolean startingPriceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.startingPrice!= null));
                if (startingPriceShouldBeCopiedAndSet == Boolean.TRUE) {
                    AuctionFeatures.StartingPrice sourceStartingPrice;
                    sourceStartingPrice = this.getStartingPrice();
                    AuctionFeatures.StartingPrice copyStartingPrice = ((AuctionFeatures.StartingPrice) strategy.copy(LocatorUtils.property(locator, "startingPrice", sourceStartingPrice), sourceStartingPrice, (this.startingPrice!= null)));
                    copy.setStartingPrice(copyStartingPrice);
                } else {
                    if (startingPriceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.startingPrice = null;
                    }
                }
            }
            {
                Boolean minimumBidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minimumBid!= null));
                if (minimumBidShouldBeCopiedAndSet == Boolean.TRUE) {
                    AuctionFeatures.MinimumBid sourceMinimumBid;
                    sourceMinimumBid = this.getMinimumBid();
                    AuctionFeatures.MinimumBid copyMinimumBid = ((AuctionFeatures.MinimumBid) strategy.copy(LocatorUtils.property(locator, "minimumBid", sourceMinimumBid), sourceMinimumBid, (this.minimumBid!= null)));
                    copy.setMinimumBid(copyMinimumBid);
                } else {
                    if (minimumBidShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minimumBid = null;
                    }
                }
            }
            {
                Boolean successPriceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.successPrice!= null));
                if (successPriceShouldBeCopiedAndSet == Boolean.TRUE) {
                    AuctionFeatures.SuccessPrice sourceSuccessPrice;
                    sourceSuccessPrice = this.getSuccessPrice();
                    AuctionFeatures.SuccessPrice copySuccessPrice = ((AuctionFeatures.SuccessPrice) strategy.copy(LocatorUtils.property(locator, "successPrice", sourceSuccessPrice), sourceSuccessPrice, (this.successPrice!= null)));
                    copy.setSuccessPrice(copySuccessPrice);
                } else {
                    if (successPriceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.successPrice = null;
                    }
                }
            }
            {
                Boolean courtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.court!= null));
                if (courtShouldBeCopiedAndSet == Boolean.TRUE) {
                    AuctionFeatures.Court sourceCourt;
                    sourceCourt = this.getCourt();
                    AuctionFeatures.Court copyCourt = ((AuctionFeatures.Court) strategy.copy(LocatorUtils.property(locator, "court", sourceCourt), sourceCourt, (this.court!= null)));
                    copy.setCourt(copyCourt);
                } else {
                    if (courtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.court = null;
                    }
                }
            }
            {
                Boolean referenceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.reference!= null));
                if (referenceShouldBeCopiedAndSet == Boolean.TRUE) {
                    AuctionFeatures.Reference sourceReference;
                    sourceReference = this.getReference();
                    AuctionFeatures.Reference copyReference = ((AuctionFeatures.Reference) strategy.copy(LocatorUtils.property(locator, "reference", sourceReference), sourceReference, (this.reference!= null)));
                    copy.setReference(copyReference);
                } else {
                    if (referenceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.reference = null;
                    }
                }
            }
            {
                Boolean actorsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.actors!= null));
                if (actorsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Actors sourceActors;
                    sourceActors = this.getActors();
                    Actors copyActors = ((Actors) strategy.copy(LocatorUtils.property(locator, "actors", sourceActors), sourceActors, (this.actors!= null)));
                    copy.setActors(copyActors);
                } else {
                    if (actorsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.actors = null;
                    }
                }
            }
            {
                Boolean notesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.notes!= null));
                if (notesShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNotes;
                    sourceNotes = this.getNotes();
                    String copyNotes = ((String) strategy.copy(LocatorUtils.property(locator, "notes", sourceNotes), sourceNotes, (this.notes!= null)));
                    copy.setNotes(copyNotes);
                } else {
                    if (notesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.notes = null;
                    }
                }
            }
            {
                Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                    AuctionFeatures.Type sourceType;
                    sourceType = this.getType();
                    AuctionFeatures.Type copyType = ((AuctionFeatures.Type) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                    copy.setType(copyType);
                } else {
                    if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.type = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new AuctionFeatures();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AuctionFeatures that = ((AuctionFeatures) object);
        {
            AuctionFeatures.Auctions lhsAuctions;
            lhsAuctions = this.getAuctions();
            AuctionFeatures.Auctions rhsAuctions;
            rhsAuctions = that.getAuctions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auctions", lhsAuctions), LocatorUtils.property(thatLocator, "auctions", rhsAuctions), lhsAuctions, rhsAuctions, (this.auctions!= null), (that.auctions!= null))) {
                return false;
            }
        }
        {
            AuctionFeatures.StartingPrice lhsStartingPrice;
            lhsStartingPrice = this.getStartingPrice();
            AuctionFeatures.StartingPrice rhsStartingPrice;
            rhsStartingPrice = that.getStartingPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startingPrice", lhsStartingPrice), LocatorUtils.property(thatLocator, "startingPrice", rhsStartingPrice), lhsStartingPrice, rhsStartingPrice, (this.startingPrice!= null), (that.startingPrice!= null))) {
                return false;
            }
        }
        {
            AuctionFeatures.MinimumBid lhsMinimumBid;
            lhsMinimumBid = this.getMinimumBid();
            AuctionFeatures.MinimumBid rhsMinimumBid;
            rhsMinimumBid = that.getMinimumBid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumBid", lhsMinimumBid), LocatorUtils.property(thatLocator, "minimumBid", rhsMinimumBid), lhsMinimumBid, rhsMinimumBid, (this.minimumBid!= null), (that.minimumBid!= null))) {
                return false;
            }
        }
        {
            AuctionFeatures.SuccessPrice lhsSuccessPrice;
            lhsSuccessPrice = this.getSuccessPrice();
            AuctionFeatures.SuccessPrice rhsSuccessPrice;
            rhsSuccessPrice = that.getSuccessPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "successPrice", lhsSuccessPrice), LocatorUtils.property(thatLocator, "successPrice", rhsSuccessPrice), lhsSuccessPrice, rhsSuccessPrice, (this.successPrice!= null), (that.successPrice!= null))) {
                return false;
            }
        }
        {
            AuctionFeatures.Court lhsCourt;
            lhsCourt = this.getCourt();
            AuctionFeatures.Court rhsCourt;
            rhsCourt = that.getCourt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "court", lhsCourt), LocatorUtils.property(thatLocator, "court", rhsCourt), lhsCourt, rhsCourt, (this.court!= null), (that.court!= null))) {
                return false;
            }
        }
        {
            AuctionFeatures.Reference lhsReference;
            lhsReference = this.getReference();
            AuctionFeatures.Reference rhsReference;
            rhsReference = that.getReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reference", lhsReference), LocatorUtils.property(thatLocator, "reference", rhsReference), lhsReference, rhsReference, (this.reference!= null), (that.reference!= null))) {
                return false;
            }
        }
        {
            Actors lhsActors;
            lhsActors = this.getActors();
            Actors rhsActors;
            rhsActors = that.getActors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actors", lhsActors), LocatorUtils.property(thatLocator, "actors", rhsActors), lhsActors, rhsActors, (this.actors!= null), (that.actors!= null))) {
                return false;
            }
        }
        {
            String lhsNotes;
            lhsNotes = this.getNotes();
            String rhsNotes;
            rhsNotes = that.getNotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notes", lhsNotes), LocatorUtils.property(thatLocator, "notes", rhsNotes), lhsNotes, rhsNotes, (this.notes!= null), (that.notes!= null))) {
                return false;
            }
        }
        {
            AuctionFeatures.Type lhsType;
            lhsType = this.getType();
            AuctionFeatures.Type rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
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
     *         &lt;element name="auction" type="{http://feed.immobiliare.it}auction" maxOccurs="unbounded"/&gt;
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
        "auction"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public static class Auctions implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected List<Auction> auction;

        /**
         * Gets the value of the auction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the auction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Auction }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public List<Auction> getAuction() {
            if (auction == null) {
                auction = new ArrayList<Auction>();
            }
            return this.auction;
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
                List<Auction> theAuction;
                theAuction = (((this.auction!= null)&&(!this.auction.isEmpty()))?this.getAuction():null);
                strategy.appendField(locator, this, "auction", buffer, theAuction, ((this.auction!= null)&&(!this.auction.isEmpty())));
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
            if (draftCopy instanceof AuctionFeatures.Auctions) {
                final AuctionFeatures.Auctions copy = ((AuctionFeatures.Auctions) draftCopy);
                {
                    Boolean auctionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.auction!= null)&&(!this.auction.isEmpty())));
                    if (auctionShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<Auction> sourceAuction;
                        sourceAuction = (((this.auction!= null)&&(!this.auction.isEmpty()))?this.getAuction():null);
                        @SuppressWarnings("unchecked")
                        List<Auction> copyAuction = ((List<Auction> ) strategy.copy(LocatorUtils.property(locator, "auction", sourceAuction), sourceAuction, ((this.auction!= null)&&(!this.auction.isEmpty()))));
                        copy.auction = null;
                        if (copyAuction!= null) {
                            List<Auction> uniqueAuctionl = copy.getAuction();
                            uniqueAuctionl.addAll(copyAuction);
                        }
                    } else {
                        if (auctionShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.auction = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new AuctionFeatures.Auctions();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final AuctionFeatures.Auctions that = ((AuctionFeatures.Auctions) object);
            {
                List<Auction> lhsAuction;
                lhsAuction = (((this.auction!= null)&&(!this.auction.isEmpty()))?this.getAuction():null);
                List<Auction> rhsAuction;
                rhsAuction = (((that.auction!= null)&&(!that.auction.isEmpty()))?that.getAuction():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "auction", lhsAuction), LocatorUtils.property(thatLocator, "auction", rhsAuction), lhsAuction, rhsAuction, ((this.auction!= null)&&(!this.auction.isEmpty())), ((that.auction!= null)&&(!that.auction.isEmpty())))) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="type"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="court"/&gt;
     *             &lt;enumeration value="other"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public static class Court implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlValue
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected String value;
        @XmlAttribute(name = "type")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected AuctionFeatures.Court.Type type;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link AuctionFeatures.Court.Type }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public AuctionFeatures.Court.Type getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link AuctionFeatures.Court.Type }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setType(AuctionFeatures.Court.Type value) {
            this.type = value;
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
                String theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
            }
            {
                AuctionFeatures.Court.Type theType;
                theType = this.getType();
                strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
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
            if (draftCopy instanceof AuctionFeatures.Court) {
                final AuctionFeatures.Court copy = ((AuctionFeatures.Court) draftCopy);
                {
                    Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                    if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceValue;
                        sourceValue = this.getValue();
                        String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                        copy.setValue(copyValue);
                    } else {
                        if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.value = null;
                        }
                    }
                }
                {
                    Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                    if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                        AuctionFeatures.Court.Type sourceType;
                        sourceType = this.getType();
                        AuctionFeatures.Court.Type copyType = ((AuctionFeatures.Court.Type) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                        copy.setType(copyType);
                    } else {
                        if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.type = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new AuctionFeatures.Court();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final AuctionFeatures.Court that = ((AuctionFeatures.Court) object);
            {
                String lhsValue;
                lhsValue = this.getValue();
                String rhsValue;
                rhsValue = that.getValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                    return false;
                }
            }
            {
                AuctionFeatures.Court.Type lhsType;
                lhsType = this.getType();
                AuctionFeatures.Court.Type rhsType;
                rhsType = that.getType();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
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


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType&gt;
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *     &lt;enumeration value="court"/&gt;
         *     &lt;enumeration value="other"/&gt;
         *   &lt;/restriction&gt;
         * &lt;/simpleType&gt;
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public enum Type {

            @XmlEnumValue("court")
            COURT("court"),
            @XmlEnumValue("other")
            OTHER("other");
            private final String value;

            Type(String v) {
                value = v;
            }

            public String value() {
                return value;
            }

            public static AuctionFeatures.Court.Type fromValue(String v) {
                for (AuctionFeatures.Court.Type c: AuctionFeatures.Court.Type.values()) {
                    if (c.value.equals(v)) {
                        return c;
                    }
                }
                throw new IllegalArgumentException(v);
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;int"&gt;
     *       &lt;attribute name="currency" use="required" type="{http://feed.immobiliare.it}currency" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public static class MinimumBid implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlValue
        @XmlJavaTypeAdapter(Adapter5 .class)
        @XmlSchemaType(name = "int")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected BigInteger value;
        @XmlAttribute(name = "currency", required = true)
        @XmlJavaTypeAdapter(Adapter14 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected Currency currency;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Currency getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setCurrency(Currency value) {
            this.currency = value;
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
                BigInteger theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
            }
            {
                Currency theCurrency;
                theCurrency = this.getCurrency();
                strategy.appendField(locator, this, "currency", buffer, theCurrency, (this.currency!= null));
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
            if (draftCopy instanceof AuctionFeatures.MinimumBid) {
                final AuctionFeatures.MinimumBid copy = ((AuctionFeatures.MinimumBid) draftCopy);
                {
                    Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                    if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceValue;
                        sourceValue = this.getValue();
                        BigInteger copyValue = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                        copy.setValue(copyValue);
                    } else {
                        if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.value = null;
                        }
                    }
                }
                {
                    Boolean currencyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.currency!= null));
                    if (currencyShouldBeCopiedAndSet == Boolean.TRUE) {
                        Currency sourceCurrency;
                        sourceCurrency = this.getCurrency();
                        Currency copyCurrency = ((Currency) strategy.copy(LocatorUtils.property(locator, "currency", sourceCurrency), sourceCurrency, (this.currency!= null)));
                        copy.setCurrency(copyCurrency);
                    } else {
                        if (currencyShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.currency = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new AuctionFeatures.MinimumBid();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final AuctionFeatures.MinimumBid that = ((AuctionFeatures.MinimumBid) object);
            {
                BigInteger lhsValue;
                lhsValue = this.getValue();
                BigInteger rhsValue;
                rhsValue = that.getValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                    return false;
                }
            }
            {
                Currency lhsCurrency;
                lhsCurrency = this.getCurrency();
                Currency rhsCurrency;
                rhsCurrency = that.getCurrency();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "currency", lhsCurrency), LocatorUtils.property(thatLocator, "currency", rhsCurrency), lhsCurrency, rhsCurrency, (this.currency!= null), (that.currency!= null))) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public static class Reference implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlValue
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected String value;
        @XmlAttribute(name = "year")
        @XmlJavaTypeAdapter(Adapter5 .class)
        @XmlSchemaType(name = "int")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected BigInteger year;
        @XmlAttribute(name = "number")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected String number;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the year property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public BigInteger getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setYear(BigInteger value) {
            this.year = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setNumber(String value) {
            this.number = value;
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
                String theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
            }
            {
                BigInteger theYear;
                theYear = this.getYear();
                strategy.appendField(locator, this, "year", buffer, theYear, (this.year!= null));
            }
            {
                String theNumber;
                theNumber = this.getNumber();
                strategy.appendField(locator, this, "number", buffer, theNumber, (this.number!= null));
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
            if (draftCopy instanceof AuctionFeatures.Reference) {
                final AuctionFeatures.Reference copy = ((AuctionFeatures.Reference) draftCopy);
                {
                    Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                    if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceValue;
                        sourceValue = this.getValue();
                        String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                        copy.setValue(copyValue);
                    } else {
                        if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.value = null;
                        }
                    }
                }
                {
                    Boolean yearShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.year!= null));
                    if (yearShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceYear;
                        sourceYear = this.getYear();
                        BigInteger copyYear = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "year", sourceYear), sourceYear, (this.year!= null)));
                        copy.setYear(copyYear);
                    } else {
                        if (yearShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.year = null;
                        }
                    }
                }
                {
                    Boolean numberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.number!= null));
                    if (numberShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceNumber;
                        sourceNumber = this.getNumber();
                        String copyNumber = ((String) strategy.copy(LocatorUtils.property(locator, "number", sourceNumber), sourceNumber, (this.number!= null)));
                        copy.setNumber(copyNumber);
                    } else {
                        if (numberShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.number = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new AuctionFeatures.Reference();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final AuctionFeatures.Reference that = ((AuctionFeatures.Reference) object);
            {
                String lhsValue;
                lhsValue = this.getValue();
                String rhsValue;
                rhsValue = that.getValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                    return false;
                }
            }
            {
                BigInteger lhsYear;
                lhsYear = this.getYear();
                BigInteger rhsYear;
                rhsYear = that.getYear();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "year", lhsYear), LocatorUtils.property(thatLocator, "year", rhsYear), lhsYear, rhsYear, (this.year!= null), (that.year!= null))) {
                    return false;
                }
            }
            {
                String lhsNumber;
                lhsNumber = this.getNumber();
                String rhsNumber;
                rhsNumber = that.getNumber();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "number", lhsNumber), LocatorUtils.property(thatLocator, "number", rhsNumber), lhsNumber, rhsNumber, (this.number!= null), (that.number!= null))) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;long"&gt;
     *       &lt;attribute name="currency" use="required" type="{http://feed.immobiliare.it}currency" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public static class StartingPrice implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlValue
        @XmlJavaTypeAdapter(Adapter4 .class)
        @XmlSchemaType(name = "long")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected BigInteger value;
        @XmlAttribute(name = "currency", required = true)
        @XmlJavaTypeAdapter(Adapter14 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected Currency currency;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Currency getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setCurrency(Currency value) {
            this.currency = value;
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
                BigInteger theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
            }
            {
                Currency theCurrency;
                theCurrency = this.getCurrency();
                strategy.appendField(locator, this, "currency", buffer, theCurrency, (this.currency!= null));
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
            if (draftCopy instanceof AuctionFeatures.StartingPrice) {
                final AuctionFeatures.StartingPrice copy = ((AuctionFeatures.StartingPrice) draftCopy);
                {
                    Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                    if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceValue;
                        sourceValue = this.getValue();
                        BigInteger copyValue = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                        copy.setValue(copyValue);
                    } else {
                        if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.value = null;
                        }
                    }
                }
                {
                    Boolean currencyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.currency!= null));
                    if (currencyShouldBeCopiedAndSet == Boolean.TRUE) {
                        Currency sourceCurrency;
                        sourceCurrency = this.getCurrency();
                        Currency copyCurrency = ((Currency) strategy.copy(LocatorUtils.property(locator, "currency", sourceCurrency), sourceCurrency, (this.currency!= null)));
                        copy.setCurrency(copyCurrency);
                    } else {
                        if (currencyShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.currency = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new AuctionFeatures.StartingPrice();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final AuctionFeatures.StartingPrice that = ((AuctionFeatures.StartingPrice) object);
            {
                BigInteger lhsValue;
                lhsValue = this.getValue();
                BigInteger rhsValue;
                rhsValue = that.getValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                    return false;
                }
            }
            {
                Currency lhsCurrency;
                lhsCurrency = this.getCurrency();
                Currency rhsCurrency;
                rhsCurrency = that.getCurrency();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "currency", lhsCurrency), LocatorUtils.property(thatLocator, "currency", rhsCurrency), lhsCurrency, rhsCurrency, (this.currency!= null), (that.currency!= null))) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;long"&gt;
     *       &lt;attribute name="currency" use="required" type="{http://feed.immobiliare.it}currency" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public static class SuccessPrice implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlValue
        @XmlJavaTypeAdapter(Adapter4 .class)
        @XmlSchemaType(name = "long")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected BigInteger value;
        @XmlAttribute(name = "currency", required = true)
        @XmlJavaTypeAdapter(Adapter14 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected Currency currency;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Currency getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setCurrency(Currency value) {
            this.currency = value;
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
                BigInteger theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
            }
            {
                Currency theCurrency;
                theCurrency = this.getCurrency();
                strategy.appendField(locator, this, "currency", buffer, theCurrency, (this.currency!= null));
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
            if (draftCopy instanceof AuctionFeatures.SuccessPrice) {
                final AuctionFeatures.SuccessPrice copy = ((AuctionFeatures.SuccessPrice) draftCopy);
                {
                    Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                    if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceValue;
                        sourceValue = this.getValue();
                        BigInteger copyValue = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                        copy.setValue(copyValue);
                    } else {
                        if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.value = null;
                        }
                    }
                }
                {
                    Boolean currencyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.currency!= null));
                    if (currencyShouldBeCopiedAndSet == Boolean.TRUE) {
                        Currency sourceCurrency;
                        sourceCurrency = this.getCurrency();
                        Currency copyCurrency = ((Currency) strategy.copy(LocatorUtils.property(locator, "currency", sourceCurrency), sourceCurrency, (this.currency!= null)));
                        copy.setCurrency(copyCurrency);
                    } else {
                        if (currencyShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.currency = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new AuctionFeatures.SuccessPrice();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final AuctionFeatures.SuccessPrice that = ((AuctionFeatures.SuccessPrice) object);
            {
                BigInteger lhsValue;
                lhsValue = this.getValue();
                BigInteger rhsValue;
                rhsValue = that.getValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                    return false;
                }
            }
            {
                Currency lhsCurrency;
                lhsCurrency = this.getCurrency();
                Currency rhsCurrency;
                rhsCurrency = that.getCurrency();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "currency", lhsCurrency), LocatorUtils.property(thatLocator, "currency", rhsCurrency), lhsCurrency, rhsCurrency, (this.currency!= null), (that.currency!= null))) {
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


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="Esecuzione immobiliare"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public enum Type {

        @XmlEnumValue("Esecuzione immobiliare")
        ESECUZIONE_IMMOBILIARE("Esecuzione immobiliare");
        private final String value;

        Type(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static AuctionFeatures.Type fromValue(String v) {
            for (AuctionFeatures.Type c: AuctionFeatures.Type.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
