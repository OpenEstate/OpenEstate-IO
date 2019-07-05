
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import java.math.BigInteger;
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
 * <p>Java class for agent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="office-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://feed.immobiliare.it}emailType"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobile-phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://feed.immobiliare.it}langtxt" minOccurs="0"/&gt;
 *         &lt;element name="vat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="web" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="builder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://feed.immobiliare.it}contact" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://feed.immobiliare.it}locationStructure" minOccurs="0"/&gt;
 *         &lt;element name="logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sales-office" type="{http://feed.immobiliare.it}sales-office" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agent", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
public class Agent implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String name;
    @XmlElement(name = "office-name")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String officeName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter10 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String email;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String phone;
    @XmlElement(name = "mobile-phone")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String mobilePhone;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Langtxt description;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String vat;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String web;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean builder;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Contact contact;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected LocationStructure location;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String logo;
    @XmlElement(name = "sales-office")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected SalesOffice salesOffice;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "long")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getName() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the officeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getOfficeName() {
        return officeName;
    }

    /**
     * Sets the value of the officeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setOfficeName(String value) {
        this.officeName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Langtxt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setDescription(Langtxt value) {
        this.description = value;
    }

    /**
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getVat() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setVat(String value) {
        this.vat = value;
    }

    /**
     * Gets the value of the web property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getWeb() {
        return web;
    }

    /**
     * Sets the value of the web property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setWeb(String value) {
        this.web = value;
    }

    /**
     * Gets the value of the builder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getBuilder() {
        return builder;
    }

    /**
     * Sets the value of the builder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setBuilder(Boolean value) {
        this.builder = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public LocationStructure getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setLocation(LocationStructure value) {
        this.location = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setLogo(String value) {
        this.logo = value;
    }

    /**
     * Gets the value of the salesOffice property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOffice }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public SalesOffice getSalesOffice() {
        return salesOffice;
    }

    /**
     * Sets the value of the salesOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOffice }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setSalesOffice(SalesOffice value) {
        this.salesOffice = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getId() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setId(BigInteger value) {
        this.id = value;
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String theOfficeName;
            theOfficeName = this.getOfficeName();
            strategy.appendField(locator, this, "officeName", buffer, theOfficeName, (this.officeName!= null));
        }
        {
            String theEmail;
            theEmail = this.getEmail();
            strategy.appendField(locator, this, "email", buffer, theEmail, (this.email!= null));
        }
        {
            String thePhone;
            thePhone = this.getPhone();
            strategy.appendField(locator, this, "phone", buffer, thePhone, (this.phone!= null));
        }
        {
            String theMobilePhone;
            theMobilePhone = this.getMobilePhone();
            strategy.appendField(locator, this, "mobilePhone", buffer, theMobilePhone, (this.mobilePhone!= null));
        }
        {
            Langtxt theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            String theVat;
            theVat = this.getVat();
            strategy.appendField(locator, this, "vat", buffer, theVat, (this.vat!= null));
        }
        {
            String theWeb;
            theWeb = this.getWeb();
            strategy.appendField(locator, this, "web", buffer, theWeb, (this.web!= null));
        }
        {
            Boolean theBuilder;
            theBuilder = this.getBuilder();
            strategy.appendField(locator, this, "builder", buffer, theBuilder, (this.builder!= null));
        }
        {
            Contact theContact;
            theContact = this.getContact();
            strategy.appendField(locator, this, "contact", buffer, theContact, (this.contact!= null));
        }
        {
            LocationStructure theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation, (this.location!= null));
        }
        {
            String theLogo;
            theLogo = this.getLogo();
            strategy.appendField(locator, this, "logo", buffer, theLogo, (this.logo!= null));
        }
        {
            SalesOffice theSalesOffice;
            theSalesOffice = this.getSalesOffice();
            strategy.appendField(locator, this, "salesOffice", buffer, theSalesOffice, (this.salesOffice!= null));
        }
        {
            BigInteger theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
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
        if (draftCopy instanceof Agent) {
            final Agent copy = ((Agent) draftCopy);
            {
                Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceName;
                    sourceName = this.getName();
                    String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName, (this.name!= null)));
                    copy.setName(copyName);
                } else {
                    if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.name = null;
                    }
                }
            }
            {
                Boolean officeNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.officeName!= null));
                if (officeNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOfficeName;
                    sourceOfficeName = this.getOfficeName();
                    String copyOfficeName = ((String) strategy.copy(LocatorUtils.property(locator, "officeName", sourceOfficeName), sourceOfficeName, (this.officeName!= null)));
                    copy.setOfficeName(copyOfficeName);
                } else {
                    if (officeNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.officeName = null;
                    }
                }
            }
            {
                Boolean emailShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.email!= null));
                if (emailShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEmail;
                    sourceEmail = this.getEmail();
                    String copyEmail = ((String) strategy.copy(LocatorUtils.property(locator, "email", sourceEmail), sourceEmail, (this.email!= null)));
                    copy.setEmail(copyEmail);
                } else {
                    if (emailShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.email = null;
                    }
                }
            }
            {
                Boolean phoneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.phone!= null));
                if (phoneShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePhone;
                    sourcePhone = this.getPhone();
                    String copyPhone = ((String) strategy.copy(LocatorUtils.property(locator, "phone", sourcePhone), sourcePhone, (this.phone!= null)));
                    copy.setPhone(copyPhone);
                } else {
                    if (phoneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.phone = null;
                    }
                }
            }
            {
                Boolean mobilePhoneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mobilePhone!= null));
                if (mobilePhoneShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMobilePhone;
                    sourceMobilePhone = this.getMobilePhone();
                    String copyMobilePhone = ((String) strategy.copy(LocatorUtils.property(locator, "mobilePhone", sourceMobilePhone), sourceMobilePhone, (this.mobilePhone!= null)));
                    copy.setMobilePhone(copyMobilePhone);
                } else {
                    if (mobilePhoneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mobilePhone = null;
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
                Boolean vatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vat!= null));
                if (vatShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVat;
                    sourceVat = this.getVat();
                    String copyVat = ((String) strategy.copy(LocatorUtils.property(locator, "vat", sourceVat), sourceVat, (this.vat!= null)));
                    copy.setVat(copyVat);
                } else {
                    if (vatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vat = null;
                    }
                }
            }
            {
                Boolean webShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.web!= null));
                if (webShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceWeb;
                    sourceWeb = this.getWeb();
                    String copyWeb = ((String) strategy.copy(LocatorUtils.property(locator, "web", sourceWeb), sourceWeb, (this.web!= null)));
                    copy.setWeb(copyWeb);
                } else {
                    if (webShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.web = null;
                    }
                }
            }
            {
                Boolean builderShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.builder!= null));
                if (builderShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBuilder;
                    sourceBuilder = this.getBuilder();
                    Boolean copyBuilder = ((Boolean) strategy.copy(LocatorUtils.property(locator, "builder", sourceBuilder), sourceBuilder, (this.builder!= null)));
                    copy.setBuilder(copyBuilder);
                } else {
                    if (builderShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.builder = null;
                    }
                }
            }
            {
                Boolean contactShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contact!= null));
                if (contactShouldBeCopiedAndSet == Boolean.TRUE) {
                    Contact sourceContact;
                    sourceContact = this.getContact();
                    Contact copyContact = ((Contact) strategy.copy(LocatorUtils.property(locator, "contact", sourceContact), sourceContact, (this.contact!= null)));
                    copy.setContact(copyContact);
                } else {
                    if (contactShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contact = null;
                    }
                }
            }
            {
                Boolean locationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.location!= null));
                if (locationShouldBeCopiedAndSet == Boolean.TRUE) {
                    LocationStructure sourceLocation;
                    sourceLocation = this.getLocation();
                    LocationStructure copyLocation = ((LocationStructure) strategy.copy(LocatorUtils.property(locator, "location", sourceLocation), sourceLocation, (this.location!= null)));
                    copy.setLocation(copyLocation);
                } else {
                    if (locationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.location = null;
                    }
                }
            }
            {
                Boolean logoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.logo!= null));
                if (logoShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLogo;
                    sourceLogo = this.getLogo();
                    String copyLogo = ((String) strategy.copy(LocatorUtils.property(locator, "logo", sourceLogo), sourceLogo, (this.logo!= null)));
                    copy.setLogo(copyLogo);
                } else {
                    if (logoShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.logo = null;
                    }
                }
            }
            {
                Boolean salesOfficeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.salesOffice!= null));
                if (salesOfficeShouldBeCopiedAndSet == Boolean.TRUE) {
                    SalesOffice sourceSalesOffice;
                    sourceSalesOffice = this.getSalesOffice();
                    SalesOffice copySalesOffice = ((SalesOffice) strategy.copy(LocatorUtils.property(locator, "salesOffice", sourceSalesOffice), sourceSalesOffice, (this.salesOffice!= null)));
                    copy.setSalesOffice(copySalesOffice);
                } else {
                    if (salesOfficeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.salesOffice = null;
                    }
                }
            }
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceId;
                    sourceId = this.getId();
                    BigInteger copyId = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                    copy.setId(copyId);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Agent();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Agent that = ((Agent) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsOfficeName;
            lhsOfficeName = this.getOfficeName();
            String rhsOfficeName;
            rhsOfficeName = that.getOfficeName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "officeName", lhsOfficeName), LocatorUtils.property(thatLocator, "officeName", rhsOfficeName), lhsOfficeName, rhsOfficeName, (this.officeName!= null), (that.officeName!= null))) {
                return false;
            }
        }
        {
            String lhsEmail;
            lhsEmail = this.getEmail();
            String rhsEmail;
            rhsEmail = that.getEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail, (this.email!= null), (that.email!= null))) {
                return false;
            }
        }
        {
            String lhsPhone;
            lhsPhone = this.getPhone();
            String rhsPhone;
            rhsPhone = that.getPhone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phone", lhsPhone), LocatorUtils.property(thatLocator, "phone", rhsPhone), lhsPhone, rhsPhone, (this.phone!= null), (that.phone!= null))) {
                return false;
            }
        }
        {
            String lhsMobilePhone;
            lhsMobilePhone = this.getMobilePhone();
            String rhsMobilePhone;
            rhsMobilePhone = that.getMobilePhone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobilePhone", lhsMobilePhone), LocatorUtils.property(thatLocator, "mobilePhone", rhsMobilePhone), lhsMobilePhone, rhsMobilePhone, (this.mobilePhone!= null), (that.mobilePhone!= null))) {
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
            String lhsVat;
            lhsVat = this.getVat();
            String rhsVat;
            rhsVat = that.getVat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vat", lhsVat), LocatorUtils.property(thatLocator, "vat", rhsVat), lhsVat, rhsVat, (this.vat!= null), (that.vat!= null))) {
                return false;
            }
        }
        {
            String lhsWeb;
            lhsWeb = this.getWeb();
            String rhsWeb;
            rhsWeb = that.getWeb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "web", lhsWeb), LocatorUtils.property(thatLocator, "web", rhsWeb), lhsWeb, rhsWeb, (this.web!= null), (that.web!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBuilder;
            lhsBuilder = this.getBuilder();
            Boolean rhsBuilder;
            rhsBuilder = that.getBuilder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "builder", lhsBuilder), LocatorUtils.property(thatLocator, "builder", rhsBuilder), lhsBuilder, rhsBuilder, (this.builder!= null), (that.builder!= null))) {
                return false;
            }
        }
        {
            Contact lhsContact;
            lhsContact = this.getContact();
            Contact rhsContact;
            rhsContact = that.getContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contact", lhsContact), LocatorUtils.property(thatLocator, "contact", rhsContact), lhsContact, rhsContact, (this.contact!= null), (that.contact!= null))) {
                return false;
            }
        }
        {
            LocationStructure lhsLocation;
            lhsLocation = this.getLocation();
            LocationStructure rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation, (this.location!= null), (that.location!= null))) {
                return false;
            }
        }
        {
            String lhsLogo;
            lhsLogo = this.getLogo();
            String rhsLogo;
            rhsLogo = that.getLogo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logo", lhsLogo), LocatorUtils.property(thatLocator, "logo", rhsLogo), lhsLogo, rhsLogo, (this.logo!= null), (that.logo!= null))) {
                return false;
            }
        }
        {
            SalesOffice lhsSalesOffice;
            lhsSalesOffice = this.getSalesOffice();
            SalesOffice rhsSalesOffice;
            rhsSalesOffice = that.getSalesOffice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesOffice", lhsSalesOffice), LocatorUtils.property(thatLocator, "salesOffice", rhsSalesOffice), lhsSalesOffice, rhsSalesOffice, (this.salesOffice!= null), (that.salesOffice!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsId;
            lhsId = this.getId();
            BigInteger rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
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
