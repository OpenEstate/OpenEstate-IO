
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
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
 * <p>Java class for extended complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extended"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="amount-parking" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="amount-bedrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="amount-lounge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="amount-other-rooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="amount-terrace" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="amount-balcony" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="inner-exposition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="outer-exposition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="entrance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="closet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="basement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="penthouse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tavern" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fireplace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="security-door" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tub" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="security-alarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="swimming-pool" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tennis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="electric-gate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="optical-fiber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="concierge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="video-intercom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="external-frames"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="nd"/&gt;
 *               &lt;enumeration value="glass/wood"/&gt;
 *               &lt;enumeration value="glass/metal"/&gt;
 *               &lt;enumeration value="double glass/wood"/&gt;
 *               &lt;enumeration value="double glass/metal"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tv"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="nd"/&gt;
 *               &lt;enumeration value="centralized"/&gt;
 *               &lt;enumeration value="private"/&gt;
 *               &lt;enumeration value="satellite"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="registry" type="{http://feed.immobiliare.it}registry" minOccurs="0"/&gt;
 *         &lt;element name="sharable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extended", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
public class Extended implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "amount-parking", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger amountParking;
    @XmlElement(name = "amount-bedrooms", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger amountBedrooms;
    @XmlElement(name = "amount-lounge", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger amountLounge;
    @XmlElement(name = "amount-other-rooms", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger amountOtherRooms;
    @XmlElement(name = "amount-terrace", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger amountTerrace;
    @XmlElement(name = "amount-balcony", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected BigInteger amountBalcony;
    @XmlElement(name = "inner-exposition")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean innerExposition;
    @XmlElement(name = "outer-exposition")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean outerExposition;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean entrance;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean closet;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean basement;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean penthouse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean tavern;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean fireplace;
    @XmlElement(name = "security-door")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean securityDoor;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean tub;
    @XmlElement(name = "security-alarm")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean securityAlarm;
    @XmlElement(name = "swimming-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean swimmingPool;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean tennis;
    @XmlElement(name = "electric-gate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean electricGate;
    @XmlElement(name = "optical-fiber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean opticalFiber;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean concierge;
    @XmlElement(name = "video-intercom")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean videoIntercom;
    @XmlElement(name = "external-frames", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Extended.ExternalFrames externalFrames;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Extended.Tv tv;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Registry registry;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean sharable;

    /**
     * Gets the value of the amountParking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getAmountParking() {
        return amountParking;
    }

    /**
     * Sets the value of the amountParking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setAmountParking(BigInteger value) {
        this.amountParking = value;
    }

    /**
     * Gets the value of the amountBedrooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getAmountBedrooms() {
        return amountBedrooms;
    }

    /**
     * Sets the value of the amountBedrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setAmountBedrooms(BigInteger value) {
        this.amountBedrooms = value;
    }

    /**
     * Gets the value of the amountLounge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getAmountLounge() {
        return amountLounge;
    }

    /**
     * Sets the value of the amountLounge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setAmountLounge(BigInteger value) {
        this.amountLounge = value;
    }

    /**
     * Gets the value of the amountOtherRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getAmountOtherRooms() {
        return amountOtherRooms;
    }

    /**
     * Sets the value of the amountOtherRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setAmountOtherRooms(BigInteger value) {
        this.amountOtherRooms = value;
    }

    /**
     * Gets the value of the amountTerrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getAmountTerrace() {
        return amountTerrace;
    }

    /**
     * Sets the value of the amountTerrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setAmountTerrace(BigInteger value) {
        this.amountTerrace = value;
    }

    /**
     * Gets the value of the amountBalcony property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public BigInteger getAmountBalcony() {
        return amountBalcony;
    }

    /**
     * Sets the value of the amountBalcony property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setAmountBalcony(BigInteger value) {
        this.amountBalcony = value;
    }

    /**
     * Gets the value of the innerExposition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getInnerExposition() {
        return innerExposition;
    }

    /**
     * Sets the value of the innerExposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setInnerExposition(Boolean value) {
        this.innerExposition = value;
    }

    /**
     * Gets the value of the outerExposition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getOuterExposition() {
        return outerExposition;
    }

    /**
     * Sets the value of the outerExposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setOuterExposition(Boolean value) {
        this.outerExposition = value;
    }

    /**
     * Gets the value of the entrance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getEntrance() {
        return entrance;
    }

    /**
     * Sets the value of the entrance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setEntrance(Boolean value) {
        this.entrance = value;
    }

    /**
     * Gets the value of the closet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getCloset() {
        return closet;
    }

    /**
     * Sets the value of the closet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setCloset(Boolean value) {
        this.closet = value;
    }

    /**
     * Gets the value of the basement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getBasement() {
        return basement;
    }

    /**
     * Sets the value of the basement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setBasement(Boolean value) {
        this.basement = value;
    }

    /**
     * Gets the value of the penthouse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getPenthouse() {
        return penthouse;
    }

    /**
     * Sets the value of the penthouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setPenthouse(Boolean value) {
        this.penthouse = value;
    }

    /**
     * Gets the value of the tavern property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getTavern() {
        return tavern;
    }

    /**
     * Sets the value of the tavern property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setTavern(Boolean value) {
        this.tavern = value;
    }

    /**
     * Gets the value of the fireplace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getFireplace() {
        return fireplace;
    }

    /**
     * Sets the value of the fireplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setFireplace(Boolean value) {
        this.fireplace = value;
    }

    /**
     * Gets the value of the securityDoor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getSecurityDoor() {
        return securityDoor;
    }

    /**
     * Sets the value of the securityDoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setSecurityDoor(Boolean value) {
        this.securityDoor = value;
    }

    /**
     * Gets the value of the tub property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getTub() {
        return tub;
    }

    /**
     * Sets the value of the tub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setTub(Boolean value) {
        this.tub = value;
    }

    /**
     * Gets the value of the securityAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getSecurityAlarm() {
        return securityAlarm;
    }

    /**
     * Sets the value of the securityAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setSecurityAlarm(Boolean value) {
        this.securityAlarm = value;
    }

    /**
     * Gets the value of the swimmingPool property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getSwimmingPool() {
        return swimmingPool;
    }

    /**
     * Sets the value of the swimmingPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setSwimmingPool(Boolean value) {
        this.swimmingPool = value;
    }

    /**
     * Gets the value of the tennis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getTennis() {
        return tennis;
    }

    /**
     * Sets the value of the tennis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setTennis(Boolean value) {
        this.tennis = value;
    }

    /**
     * Gets the value of the electricGate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getElectricGate() {
        return electricGate;
    }

    /**
     * Sets the value of the electricGate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setElectricGate(Boolean value) {
        this.electricGate = value;
    }

    /**
     * Gets the value of the opticalFiber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getOpticalFiber() {
        return opticalFiber;
    }

    /**
     * Sets the value of the opticalFiber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setOpticalFiber(Boolean value) {
        this.opticalFiber = value;
    }

    /**
     * Gets the value of the concierge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getConcierge() {
        return concierge;
    }

    /**
     * Sets the value of the concierge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setConcierge(Boolean value) {
        this.concierge = value;
    }

    /**
     * Gets the value of the videoIntercom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getVideoIntercom() {
        return videoIntercom;
    }

    /**
     * Sets the value of the videoIntercom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setVideoIntercom(Boolean value) {
        this.videoIntercom = value;
    }

    /**
     * Gets the value of the externalFrames property.
     * 
     * @return
     *     possible object is
     *     {@link Extended.ExternalFrames }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Extended.ExternalFrames getExternalFrames() {
        return externalFrames;
    }

    /**
     * Sets the value of the externalFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extended.ExternalFrames }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setExternalFrames(Extended.ExternalFrames value) {
        this.externalFrames = value;
    }

    /**
     * Gets the value of the tv property.
     * 
     * @return
     *     possible object is
     *     {@link Extended.Tv }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Extended.Tv getTv() {
        return tv;
    }

    /**
     * Sets the value of the tv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extended.Tv }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setTv(Extended.Tv value) {
        this.tv = value;
    }

    /**
     * Gets the value of the registry property.
     * 
     * @return
     *     possible object is
     *     {@link Registry }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Registry getRegistry() {
        return registry;
    }

    /**
     * Sets the value of the registry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registry }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setRegistry(Registry value) {
        this.registry = value;
    }

    /**
     * Gets the value of the sharable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getSharable() {
        return sharable;
    }

    /**
     * Sets the value of the sharable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setSharable(Boolean value) {
        this.sharable = value;
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
            BigInteger theAmountParking;
            theAmountParking = this.getAmountParking();
            strategy.appendField(locator, this, "amountParking", buffer, theAmountParking, (this.amountParking!= null));
        }
        {
            BigInteger theAmountBedrooms;
            theAmountBedrooms = this.getAmountBedrooms();
            strategy.appendField(locator, this, "amountBedrooms", buffer, theAmountBedrooms, (this.amountBedrooms!= null));
        }
        {
            BigInteger theAmountLounge;
            theAmountLounge = this.getAmountLounge();
            strategy.appendField(locator, this, "amountLounge", buffer, theAmountLounge, (this.amountLounge!= null));
        }
        {
            BigInteger theAmountOtherRooms;
            theAmountOtherRooms = this.getAmountOtherRooms();
            strategy.appendField(locator, this, "amountOtherRooms", buffer, theAmountOtherRooms, (this.amountOtherRooms!= null));
        }
        {
            BigInteger theAmountTerrace;
            theAmountTerrace = this.getAmountTerrace();
            strategy.appendField(locator, this, "amountTerrace", buffer, theAmountTerrace, (this.amountTerrace!= null));
        }
        {
            BigInteger theAmountBalcony;
            theAmountBalcony = this.getAmountBalcony();
            strategy.appendField(locator, this, "amountBalcony", buffer, theAmountBalcony, (this.amountBalcony!= null));
        }
        {
            Boolean theInnerExposition;
            theInnerExposition = this.getInnerExposition();
            strategy.appendField(locator, this, "innerExposition", buffer, theInnerExposition, (this.innerExposition!= null));
        }
        {
            Boolean theOuterExposition;
            theOuterExposition = this.getOuterExposition();
            strategy.appendField(locator, this, "outerExposition", buffer, theOuterExposition, (this.outerExposition!= null));
        }
        {
            Boolean theEntrance;
            theEntrance = this.getEntrance();
            strategy.appendField(locator, this, "entrance", buffer, theEntrance, (this.entrance!= null));
        }
        {
            Boolean theCloset;
            theCloset = this.getCloset();
            strategy.appendField(locator, this, "closet", buffer, theCloset, (this.closet!= null));
        }
        {
            Boolean theBasement;
            theBasement = this.getBasement();
            strategy.appendField(locator, this, "basement", buffer, theBasement, (this.basement!= null));
        }
        {
            Boolean thePenthouse;
            thePenthouse = this.getPenthouse();
            strategy.appendField(locator, this, "penthouse", buffer, thePenthouse, (this.penthouse!= null));
        }
        {
            Boolean theTavern;
            theTavern = this.getTavern();
            strategy.appendField(locator, this, "tavern", buffer, theTavern, (this.tavern!= null));
        }
        {
            Boolean theFireplace;
            theFireplace = this.getFireplace();
            strategy.appendField(locator, this, "fireplace", buffer, theFireplace, (this.fireplace!= null));
        }
        {
            Boolean theSecurityDoor;
            theSecurityDoor = this.getSecurityDoor();
            strategy.appendField(locator, this, "securityDoor", buffer, theSecurityDoor, (this.securityDoor!= null));
        }
        {
            Boolean theTub;
            theTub = this.getTub();
            strategy.appendField(locator, this, "tub", buffer, theTub, (this.tub!= null));
        }
        {
            Boolean theSecurityAlarm;
            theSecurityAlarm = this.getSecurityAlarm();
            strategy.appendField(locator, this, "securityAlarm", buffer, theSecurityAlarm, (this.securityAlarm!= null));
        }
        {
            Boolean theSwimmingPool;
            theSwimmingPool = this.getSwimmingPool();
            strategy.appendField(locator, this, "swimmingPool", buffer, theSwimmingPool, (this.swimmingPool!= null));
        }
        {
            Boolean theTennis;
            theTennis = this.getTennis();
            strategy.appendField(locator, this, "tennis", buffer, theTennis, (this.tennis!= null));
        }
        {
            Boolean theElectricGate;
            theElectricGate = this.getElectricGate();
            strategy.appendField(locator, this, "electricGate", buffer, theElectricGate, (this.electricGate!= null));
        }
        {
            Boolean theOpticalFiber;
            theOpticalFiber = this.getOpticalFiber();
            strategy.appendField(locator, this, "opticalFiber", buffer, theOpticalFiber, (this.opticalFiber!= null));
        }
        {
            Boolean theConcierge;
            theConcierge = this.getConcierge();
            strategy.appendField(locator, this, "concierge", buffer, theConcierge, (this.concierge!= null));
        }
        {
            Boolean theVideoIntercom;
            theVideoIntercom = this.getVideoIntercom();
            strategy.appendField(locator, this, "videoIntercom", buffer, theVideoIntercom, (this.videoIntercom!= null));
        }
        {
            Extended.ExternalFrames theExternalFrames;
            theExternalFrames = this.getExternalFrames();
            strategy.appendField(locator, this, "externalFrames", buffer, theExternalFrames, (this.externalFrames!= null));
        }
        {
            Extended.Tv theTv;
            theTv = this.getTv();
            strategy.appendField(locator, this, "tv", buffer, theTv, (this.tv!= null));
        }
        {
            Registry theRegistry;
            theRegistry = this.getRegistry();
            strategy.appendField(locator, this, "registry", buffer, theRegistry, (this.registry!= null));
        }
        {
            Boolean theSharable;
            theSharable = this.getSharable();
            strategy.appendField(locator, this, "sharable", buffer, theSharable, (this.sharable!= null));
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
        if (draftCopy instanceof Extended) {
            final Extended copy = ((Extended) draftCopy);
            {
                Boolean amountParkingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.amountParking!= null));
                if (amountParkingShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceAmountParking;
                    sourceAmountParking = this.getAmountParking();
                    BigInteger copyAmountParking = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "amountParking", sourceAmountParking), sourceAmountParking, (this.amountParking!= null)));
                    copy.setAmountParking(copyAmountParking);
                } else {
                    if (amountParkingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.amountParking = null;
                    }
                }
            }
            {
                Boolean amountBedroomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.amountBedrooms!= null));
                if (amountBedroomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceAmountBedrooms;
                    sourceAmountBedrooms = this.getAmountBedrooms();
                    BigInteger copyAmountBedrooms = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "amountBedrooms", sourceAmountBedrooms), sourceAmountBedrooms, (this.amountBedrooms!= null)));
                    copy.setAmountBedrooms(copyAmountBedrooms);
                } else {
                    if (amountBedroomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.amountBedrooms = null;
                    }
                }
            }
            {
                Boolean amountLoungeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.amountLounge!= null));
                if (amountLoungeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceAmountLounge;
                    sourceAmountLounge = this.getAmountLounge();
                    BigInteger copyAmountLounge = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "amountLounge", sourceAmountLounge), sourceAmountLounge, (this.amountLounge!= null)));
                    copy.setAmountLounge(copyAmountLounge);
                } else {
                    if (amountLoungeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.amountLounge = null;
                    }
                }
            }
            {
                Boolean amountOtherRoomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.amountOtherRooms!= null));
                if (amountOtherRoomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceAmountOtherRooms;
                    sourceAmountOtherRooms = this.getAmountOtherRooms();
                    BigInteger copyAmountOtherRooms = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "amountOtherRooms", sourceAmountOtherRooms), sourceAmountOtherRooms, (this.amountOtherRooms!= null)));
                    copy.setAmountOtherRooms(copyAmountOtherRooms);
                } else {
                    if (amountOtherRoomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.amountOtherRooms = null;
                    }
                }
            }
            {
                Boolean amountTerraceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.amountTerrace!= null));
                if (amountTerraceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceAmountTerrace;
                    sourceAmountTerrace = this.getAmountTerrace();
                    BigInteger copyAmountTerrace = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "amountTerrace", sourceAmountTerrace), sourceAmountTerrace, (this.amountTerrace!= null)));
                    copy.setAmountTerrace(copyAmountTerrace);
                } else {
                    if (amountTerraceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.amountTerrace = null;
                    }
                }
            }
            {
                Boolean amountBalconyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.amountBalcony!= null));
                if (amountBalconyShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceAmountBalcony;
                    sourceAmountBalcony = this.getAmountBalcony();
                    BigInteger copyAmountBalcony = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "amountBalcony", sourceAmountBalcony), sourceAmountBalcony, (this.amountBalcony!= null)));
                    copy.setAmountBalcony(copyAmountBalcony);
                } else {
                    if (amountBalconyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.amountBalcony = null;
                    }
                }
            }
            {
                Boolean innerExpositionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.innerExposition!= null));
                if (innerExpositionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceInnerExposition;
                    sourceInnerExposition = this.getInnerExposition();
                    Boolean copyInnerExposition = ((Boolean) strategy.copy(LocatorUtils.property(locator, "innerExposition", sourceInnerExposition), sourceInnerExposition, (this.innerExposition!= null)));
                    copy.setInnerExposition(copyInnerExposition);
                } else {
                    if (innerExpositionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.innerExposition = null;
                    }
                }
            }
            {
                Boolean outerExpositionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.outerExposition!= null));
                if (outerExpositionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceOuterExposition;
                    sourceOuterExposition = this.getOuterExposition();
                    Boolean copyOuterExposition = ((Boolean) strategy.copy(LocatorUtils.property(locator, "outerExposition", sourceOuterExposition), sourceOuterExposition, (this.outerExposition!= null)));
                    copy.setOuterExposition(copyOuterExposition);
                } else {
                    if (outerExpositionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.outerExposition = null;
                    }
                }
            }
            {
                Boolean entranceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.entrance!= null));
                if (entranceShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceEntrance;
                    sourceEntrance = this.getEntrance();
                    Boolean copyEntrance = ((Boolean) strategy.copy(LocatorUtils.property(locator, "entrance", sourceEntrance), sourceEntrance, (this.entrance!= null)));
                    copy.setEntrance(copyEntrance);
                } else {
                    if (entranceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.entrance = null;
                    }
                }
            }
            {
                Boolean closetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.closet!= null));
                if (closetShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceCloset;
                    sourceCloset = this.getCloset();
                    Boolean copyCloset = ((Boolean) strategy.copy(LocatorUtils.property(locator, "closet", sourceCloset), sourceCloset, (this.closet!= null)));
                    copy.setCloset(copyCloset);
                } else {
                    if (closetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.closet = null;
                    }
                }
            }
            {
                Boolean basementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.basement!= null));
                if (basementShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBasement;
                    sourceBasement = this.getBasement();
                    Boolean copyBasement = ((Boolean) strategy.copy(LocatorUtils.property(locator, "basement", sourceBasement), sourceBasement, (this.basement!= null)));
                    copy.setBasement(copyBasement);
                } else {
                    if (basementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.basement = null;
                    }
                }
            }
            {
                Boolean penthouseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.penthouse!= null));
                if (penthouseShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePenthouse;
                    sourcePenthouse = this.getPenthouse();
                    Boolean copyPenthouse = ((Boolean) strategy.copy(LocatorUtils.property(locator, "penthouse", sourcePenthouse), sourcePenthouse, (this.penthouse!= null)));
                    copy.setPenthouse(copyPenthouse);
                } else {
                    if (penthouseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.penthouse = null;
                    }
                }
            }
            {
                Boolean tavernShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tavern!= null));
                if (tavernShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTavern;
                    sourceTavern = this.getTavern();
                    Boolean copyTavern = ((Boolean) strategy.copy(LocatorUtils.property(locator, "tavern", sourceTavern), sourceTavern, (this.tavern!= null)));
                    copy.setTavern(copyTavern);
                } else {
                    if (tavernShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tavern = null;
                    }
                }
            }
            {
                Boolean fireplaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fireplace!= null));
                if (fireplaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFireplace;
                    sourceFireplace = this.getFireplace();
                    Boolean copyFireplace = ((Boolean) strategy.copy(LocatorUtils.property(locator, "fireplace", sourceFireplace), sourceFireplace, (this.fireplace!= null)));
                    copy.setFireplace(copyFireplace);
                } else {
                    if (fireplaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fireplace = null;
                    }
                }
            }
            {
                Boolean securityDoorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.securityDoor!= null));
                if (securityDoorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSecurityDoor;
                    sourceSecurityDoor = this.getSecurityDoor();
                    Boolean copySecurityDoor = ((Boolean) strategy.copy(LocatorUtils.property(locator, "securityDoor", sourceSecurityDoor), sourceSecurityDoor, (this.securityDoor!= null)));
                    copy.setSecurityDoor(copySecurityDoor);
                } else {
                    if (securityDoorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.securityDoor = null;
                    }
                }
            }
            {
                Boolean tubShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tub!= null));
                if (tubShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTub;
                    sourceTub = this.getTub();
                    Boolean copyTub = ((Boolean) strategy.copy(LocatorUtils.property(locator, "tub", sourceTub), sourceTub, (this.tub!= null)));
                    copy.setTub(copyTub);
                } else {
                    if (tubShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tub = null;
                    }
                }
            }
            {
                Boolean securityAlarmShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.securityAlarm!= null));
                if (securityAlarmShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSecurityAlarm;
                    sourceSecurityAlarm = this.getSecurityAlarm();
                    Boolean copySecurityAlarm = ((Boolean) strategy.copy(LocatorUtils.property(locator, "securityAlarm", sourceSecurityAlarm), sourceSecurityAlarm, (this.securityAlarm!= null)));
                    copy.setSecurityAlarm(copySecurityAlarm);
                } else {
                    if (securityAlarmShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.securityAlarm = null;
                    }
                }
            }
            {
                Boolean swimmingPoolShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.swimmingPool!= null));
                if (swimmingPoolShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSwimmingPool;
                    sourceSwimmingPool = this.getSwimmingPool();
                    Boolean copySwimmingPool = ((Boolean) strategy.copy(LocatorUtils.property(locator, "swimmingPool", sourceSwimmingPool), sourceSwimmingPool, (this.swimmingPool!= null)));
                    copy.setSwimmingPool(copySwimmingPool);
                } else {
                    if (swimmingPoolShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.swimmingPool = null;
                    }
                }
            }
            {
                Boolean tennisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tennis!= null));
                if (tennisShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTennis;
                    sourceTennis = this.getTennis();
                    Boolean copyTennis = ((Boolean) strategy.copy(LocatorUtils.property(locator, "tennis", sourceTennis), sourceTennis, (this.tennis!= null)));
                    copy.setTennis(copyTennis);
                } else {
                    if (tennisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tennis = null;
                    }
                }
            }
            {
                Boolean electricGateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.electricGate!= null));
                if (electricGateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceElectricGate;
                    sourceElectricGate = this.getElectricGate();
                    Boolean copyElectricGate = ((Boolean) strategy.copy(LocatorUtils.property(locator, "electricGate", sourceElectricGate), sourceElectricGate, (this.electricGate!= null)));
                    copy.setElectricGate(copyElectricGate);
                } else {
                    if (electricGateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.electricGate = null;
                    }
                }
            }
            {
                Boolean opticalFiberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.opticalFiber!= null));
                if (opticalFiberShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceOpticalFiber;
                    sourceOpticalFiber = this.getOpticalFiber();
                    Boolean copyOpticalFiber = ((Boolean) strategy.copy(LocatorUtils.property(locator, "opticalFiber", sourceOpticalFiber), sourceOpticalFiber, (this.opticalFiber!= null)));
                    copy.setOpticalFiber(copyOpticalFiber);
                } else {
                    if (opticalFiberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.opticalFiber = null;
                    }
                }
            }
            {
                Boolean conciergeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.concierge!= null));
                if (conciergeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceConcierge;
                    sourceConcierge = this.getConcierge();
                    Boolean copyConcierge = ((Boolean) strategy.copy(LocatorUtils.property(locator, "concierge", sourceConcierge), sourceConcierge, (this.concierge!= null)));
                    copy.setConcierge(copyConcierge);
                } else {
                    if (conciergeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.concierge = null;
                    }
                }
            }
            {
                Boolean videoIntercomShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.videoIntercom!= null));
                if (videoIntercomShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceVideoIntercom;
                    sourceVideoIntercom = this.getVideoIntercom();
                    Boolean copyVideoIntercom = ((Boolean) strategy.copy(LocatorUtils.property(locator, "videoIntercom", sourceVideoIntercom), sourceVideoIntercom, (this.videoIntercom!= null)));
                    copy.setVideoIntercom(copyVideoIntercom);
                } else {
                    if (videoIntercomShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.videoIntercom = null;
                    }
                }
            }
            {
                Boolean externalFramesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.externalFrames!= null));
                if (externalFramesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Extended.ExternalFrames sourceExternalFrames;
                    sourceExternalFrames = this.getExternalFrames();
                    Extended.ExternalFrames copyExternalFrames = ((Extended.ExternalFrames) strategy.copy(LocatorUtils.property(locator, "externalFrames", sourceExternalFrames), sourceExternalFrames, (this.externalFrames!= null)));
                    copy.setExternalFrames(copyExternalFrames);
                } else {
                    if (externalFramesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.externalFrames = null;
                    }
                }
            }
            {
                Boolean tvShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tv!= null));
                if (tvShouldBeCopiedAndSet == Boolean.TRUE) {
                    Extended.Tv sourceTv;
                    sourceTv = this.getTv();
                    Extended.Tv copyTv = ((Extended.Tv) strategy.copy(LocatorUtils.property(locator, "tv", sourceTv), sourceTv, (this.tv!= null)));
                    copy.setTv(copyTv);
                } else {
                    if (tvShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tv = null;
                    }
                }
            }
            {
                Boolean registryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.registry!= null));
                if (registryShouldBeCopiedAndSet == Boolean.TRUE) {
                    Registry sourceRegistry;
                    sourceRegistry = this.getRegistry();
                    Registry copyRegistry = ((Registry) strategy.copy(LocatorUtils.property(locator, "registry", sourceRegistry), sourceRegistry, (this.registry!= null)));
                    copy.setRegistry(copyRegistry);
                } else {
                    if (registryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.registry = null;
                    }
                }
            }
            {
                Boolean sharableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sharable!= null));
                if (sharableShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSharable;
                    sourceSharable = this.getSharable();
                    Boolean copySharable = ((Boolean) strategy.copy(LocatorUtils.property(locator, "sharable", sourceSharable), sourceSharable, (this.sharable!= null)));
                    copy.setSharable(copySharable);
                } else {
                    if (sharableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sharable = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Extended();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Extended that = ((Extended) object);
        {
            BigInteger lhsAmountParking;
            lhsAmountParking = this.getAmountParking();
            BigInteger rhsAmountParking;
            rhsAmountParking = that.getAmountParking();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amountParking", lhsAmountParking), LocatorUtils.property(thatLocator, "amountParking", rhsAmountParking), lhsAmountParking, rhsAmountParking, (this.amountParking!= null), (that.amountParking!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsAmountBedrooms;
            lhsAmountBedrooms = this.getAmountBedrooms();
            BigInteger rhsAmountBedrooms;
            rhsAmountBedrooms = that.getAmountBedrooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amountBedrooms", lhsAmountBedrooms), LocatorUtils.property(thatLocator, "amountBedrooms", rhsAmountBedrooms), lhsAmountBedrooms, rhsAmountBedrooms, (this.amountBedrooms!= null), (that.amountBedrooms!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsAmountLounge;
            lhsAmountLounge = this.getAmountLounge();
            BigInteger rhsAmountLounge;
            rhsAmountLounge = that.getAmountLounge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amountLounge", lhsAmountLounge), LocatorUtils.property(thatLocator, "amountLounge", rhsAmountLounge), lhsAmountLounge, rhsAmountLounge, (this.amountLounge!= null), (that.amountLounge!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsAmountOtherRooms;
            lhsAmountOtherRooms = this.getAmountOtherRooms();
            BigInteger rhsAmountOtherRooms;
            rhsAmountOtherRooms = that.getAmountOtherRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amountOtherRooms", lhsAmountOtherRooms), LocatorUtils.property(thatLocator, "amountOtherRooms", rhsAmountOtherRooms), lhsAmountOtherRooms, rhsAmountOtherRooms, (this.amountOtherRooms!= null), (that.amountOtherRooms!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsAmountTerrace;
            lhsAmountTerrace = this.getAmountTerrace();
            BigInteger rhsAmountTerrace;
            rhsAmountTerrace = that.getAmountTerrace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amountTerrace", lhsAmountTerrace), LocatorUtils.property(thatLocator, "amountTerrace", rhsAmountTerrace), lhsAmountTerrace, rhsAmountTerrace, (this.amountTerrace!= null), (that.amountTerrace!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsAmountBalcony;
            lhsAmountBalcony = this.getAmountBalcony();
            BigInteger rhsAmountBalcony;
            rhsAmountBalcony = that.getAmountBalcony();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amountBalcony", lhsAmountBalcony), LocatorUtils.property(thatLocator, "amountBalcony", rhsAmountBalcony), lhsAmountBalcony, rhsAmountBalcony, (this.amountBalcony!= null), (that.amountBalcony!= null))) {
                return false;
            }
        }
        {
            Boolean lhsInnerExposition;
            lhsInnerExposition = this.getInnerExposition();
            Boolean rhsInnerExposition;
            rhsInnerExposition = that.getInnerExposition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "innerExposition", lhsInnerExposition), LocatorUtils.property(thatLocator, "innerExposition", rhsInnerExposition), lhsInnerExposition, rhsInnerExposition, (this.innerExposition!= null), (that.innerExposition!= null))) {
                return false;
            }
        }
        {
            Boolean lhsOuterExposition;
            lhsOuterExposition = this.getOuterExposition();
            Boolean rhsOuterExposition;
            rhsOuterExposition = that.getOuterExposition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outerExposition", lhsOuterExposition), LocatorUtils.property(thatLocator, "outerExposition", rhsOuterExposition), lhsOuterExposition, rhsOuterExposition, (this.outerExposition!= null), (that.outerExposition!= null))) {
                return false;
            }
        }
        {
            Boolean lhsEntrance;
            lhsEntrance = this.getEntrance();
            Boolean rhsEntrance;
            rhsEntrance = that.getEntrance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entrance", lhsEntrance), LocatorUtils.property(thatLocator, "entrance", rhsEntrance), lhsEntrance, rhsEntrance, (this.entrance!= null), (that.entrance!= null))) {
                return false;
            }
        }
        {
            Boolean lhsCloset;
            lhsCloset = this.getCloset();
            Boolean rhsCloset;
            rhsCloset = that.getCloset();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "closet", lhsCloset), LocatorUtils.property(thatLocator, "closet", rhsCloset), lhsCloset, rhsCloset, (this.closet!= null), (that.closet!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBasement;
            lhsBasement = this.getBasement();
            Boolean rhsBasement;
            rhsBasement = that.getBasement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "basement", lhsBasement), LocatorUtils.property(thatLocator, "basement", rhsBasement), lhsBasement, rhsBasement, (this.basement!= null), (that.basement!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPenthouse;
            lhsPenthouse = this.getPenthouse();
            Boolean rhsPenthouse;
            rhsPenthouse = that.getPenthouse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "penthouse", lhsPenthouse), LocatorUtils.property(thatLocator, "penthouse", rhsPenthouse), lhsPenthouse, rhsPenthouse, (this.penthouse!= null), (that.penthouse!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTavern;
            lhsTavern = this.getTavern();
            Boolean rhsTavern;
            rhsTavern = that.getTavern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tavern", lhsTavern), LocatorUtils.property(thatLocator, "tavern", rhsTavern), lhsTavern, rhsTavern, (this.tavern!= null), (that.tavern!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFireplace;
            lhsFireplace = this.getFireplace();
            Boolean rhsFireplace;
            rhsFireplace = that.getFireplace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fireplace", lhsFireplace), LocatorUtils.property(thatLocator, "fireplace", rhsFireplace), lhsFireplace, rhsFireplace, (this.fireplace!= null), (that.fireplace!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSecurityDoor;
            lhsSecurityDoor = this.getSecurityDoor();
            Boolean rhsSecurityDoor;
            rhsSecurityDoor = that.getSecurityDoor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "securityDoor", lhsSecurityDoor), LocatorUtils.property(thatLocator, "securityDoor", rhsSecurityDoor), lhsSecurityDoor, rhsSecurityDoor, (this.securityDoor!= null), (that.securityDoor!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTub;
            lhsTub = this.getTub();
            Boolean rhsTub;
            rhsTub = that.getTub();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tub", lhsTub), LocatorUtils.property(thatLocator, "tub", rhsTub), lhsTub, rhsTub, (this.tub!= null), (that.tub!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSecurityAlarm;
            lhsSecurityAlarm = this.getSecurityAlarm();
            Boolean rhsSecurityAlarm;
            rhsSecurityAlarm = that.getSecurityAlarm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "securityAlarm", lhsSecurityAlarm), LocatorUtils.property(thatLocator, "securityAlarm", rhsSecurityAlarm), lhsSecurityAlarm, rhsSecurityAlarm, (this.securityAlarm!= null), (that.securityAlarm!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSwimmingPool;
            lhsSwimmingPool = this.getSwimmingPool();
            Boolean rhsSwimmingPool;
            rhsSwimmingPool = that.getSwimmingPool();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "swimmingPool", lhsSwimmingPool), LocatorUtils.property(thatLocator, "swimmingPool", rhsSwimmingPool), lhsSwimmingPool, rhsSwimmingPool, (this.swimmingPool!= null), (that.swimmingPool!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTennis;
            lhsTennis = this.getTennis();
            Boolean rhsTennis;
            rhsTennis = that.getTennis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tennis", lhsTennis), LocatorUtils.property(thatLocator, "tennis", rhsTennis), lhsTennis, rhsTennis, (this.tennis!= null), (that.tennis!= null))) {
                return false;
            }
        }
        {
            Boolean lhsElectricGate;
            lhsElectricGate = this.getElectricGate();
            Boolean rhsElectricGate;
            rhsElectricGate = that.getElectricGate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electricGate", lhsElectricGate), LocatorUtils.property(thatLocator, "electricGate", rhsElectricGate), lhsElectricGate, rhsElectricGate, (this.electricGate!= null), (that.electricGate!= null))) {
                return false;
            }
        }
        {
            Boolean lhsOpticalFiber;
            lhsOpticalFiber = this.getOpticalFiber();
            Boolean rhsOpticalFiber;
            rhsOpticalFiber = that.getOpticalFiber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "opticalFiber", lhsOpticalFiber), LocatorUtils.property(thatLocator, "opticalFiber", rhsOpticalFiber), lhsOpticalFiber, rhsOpticalFiber, (this.opticalFiber!= null), (that.opticalFiber!= null))) {
                return false;
            }
        }
        {
            Boolean lhsConcierge;
            lhsConcierge = this.getConcierge();
            Boolean rhsConcierge;
            rhsConcierge = that.getConcierge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "concierge", lhsConcierge), LocatorUtils.property(thatLocator, "concierge", rhsConcierge), lhsConcierge, rhsConcierge, (this.concierge!= null), (that.concierge!= null))) {
                return false;
            }
        }
        {
            Boolean lhsVideoIntercom;
            lhsVideoIntercom = this.getVideoIntercom();
            Boolean rhsVideoIntercom;
            rhsVideoIntercom = that.getVideoIntercom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "videoIntercom", lhsVideoIntercom), LocatorUtils.property(thatLocator, "videoIntercom", rhsVideoIntercom), lhsVideoIntercom, rhsVideoIntercom, (this.videoIntercom!= null), (that.videoIntercom!= null))) {
                return false;
            }
        }
        {
            Extended.ExternalFrames lhsExternalFrames;
            lhsExternalFrames = this.getExternalFrames();
            Extended.ExternalFrames rhsExternalFrames;
            rhsExternalFrames = that.getExternalFrames();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalFrames", lhsExternalFrames), LocatorUtils.property(thatLocator, "externalFrames", rhsExternalFrames), lhsExternalFrames, rhsExternalFrames, (this.externalFrames!= null), (that.externalFrames!= null))) {
                return false;
            }
        }
        {
            Extended.Tv lhsTv;
            lhsTv = this.getTv();
            Extended.Tv rhsTv;
            rhsTv = that.getTv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tv", lhsTv), LocatorUtils.property(thatLocator, "tv", rhsTv), lhsTv, rhsTv, (this.tv!= null), (that.tv!= null))) {
                return false;
            }
        }
        {
            Registry lhsRegistry;
            lhsRegistry = this.getRegistry();
            Registry rhsRegistry;
            rhsRegistry = that.getRegistry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registry", lhsRegistry), LocatorUtils.property(thatLocator, "registry", rhsRegistry), lhsRegistry, rhsRegistry, (this.registry!= null), (that.registry!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSharable;
            lhsSharable = this.getSharable();
            Boolean rhsSharable;
            rhsSharable = that.getSharable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sharable", lhsSharable), LocatorUtils.property(thatLocator, "sharable", rhsSharable), lhsSharable, rhsSharable, (this.sharable!= null), (that.sharable!= null))) {
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
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="nd"/&gt;
     *     &lt;enumeration value="glass/wood"/&gt;
     *     &lt;enumeration value="glass/metal"/&gt;
     *     &lt;enumeration value="double glass/wood"/&gt;
     *     &lt;enumeration value="double glass/metal"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public enum ExternalFrames {

        @XmlEnumValue("nd")
        ND("nd"),
        @XmlEnumValue("glass/wood")
        GLASS_WOOD("glass/wood"),
        @XmlEnumValue("glass/metal")
        GLASS_METAL("glass/metal"),
        @XmlEnumValue("double glass/wood")
        DOUBLE_GLASS_WOOD("double glass/wood"),
        @XmlEnumValue("double glass/metal")
        DOUBLE_GLASS_METAL("double glass/metal");
        private final String value;

        ExternalFrames(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Extended.ExternalFrames fromValue(String v) {
            for (Extended.ExternalFrames c: Extended.ExternalFrames.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
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
     *     &lt;enumeration value="nd"/&gt;
     *     &lt;enumeration value="centralized"/&gt;
     *     &lt;enumeration value="private"/&gt;
     *     &lt;enumeration value="satellite"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public enum Tv {

        @XmlEnumValue("nd")
        ND("nd"),
        @XmlEnumValue("centralized")
        CENTRALIZED("centralized"),
        @XmlEnumValue("private")
        PRIVATE("private"),
        @XmlEnumValue("satellite")
        SATELLITE("satellite");
        private final String value;

        Tv(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Extended.Tv fromValue(String v) {
            for (Extended.Tv c: Extended.Tv.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
