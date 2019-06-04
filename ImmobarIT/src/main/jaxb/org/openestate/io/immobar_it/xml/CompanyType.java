
package org.openestate.io.immobar_it.xml;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * A company to transfer.
 * 
 * <p>Java class for CompanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="company_name_de" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company_address_de" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company_location_de" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company_name_it" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company_address_it" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company_location_it" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company_postalcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company_province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company_country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company_fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company_mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company_website" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="company_ISTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="property" type="{}PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyType", propOrder = {
    "companyNameDe",
    "companyAddressDe",
    "companyLocationDe",
    "companyNameIt",
    "companyAddressIt",
    "companyLocationIt",
    "companyPostalcode",
    "companyProvince",
    "companyCountry",
    "companyPhone",
    "companyFax",
    "companyMobile",
    "companyEmail",
    "companyWebsite",
    "companyISTAT",
    "property"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
public class CompanyType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "company_name_de")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String companyNameDe;
    @XmlElement(name = "company_address_de")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String companyAddressDe;
    @XmlElement(name = "company_location_de")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String companyLocationDe;
    @XmlElement(name = "company_name_it")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String companyNameIt;
    @XmlElement(name = "company_address_it")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String companyAddressIt;
    @XmlElement(name = "company_location_it")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String companyLocationIt;
    @XmlElement(name = "company_postalcode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String companyPostalcode;
    @XmlElement(name = "company_province")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String companyProvince;
    @XmlElement(name = "company_country")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String companyCountry;
    @XmlElement(name = "company_phone")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String companyPhone;
    @XmlElement(name = "company_fax")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String companyFax;
    @XmlElement(name = "company_mobile")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String companyMobile;
    @XmlElement(name = "company_email")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String companyEmail;
    @XmlElement(name = "company_website", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected URI companyWebsite;
    @XmlElement(name = "company_ISTAT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected String companyISTAT;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected List<PropertyType> property;

    /**
     * Gets the value of the companyNameDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getCompanyNameDe() {
        return companyNameDe;
    }

    /**
     * Sets the value of the companyNameDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyNameDe(String value) {
        this.companyNameDe = value;
    }

    /**
     * Gets the value of the companyAddressDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getCompanyAddressDe() {
        return companyAddressDe;
    }

    /**
     * Sets the value of the companyAddressDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyAddressDe(String value) {
        this.companyAddressDe = value;
    }

    /**
     * Gets the value of the companyLocationDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getCompanyLocationDe() {
        return companyLocationDe;
    }

    /**
     * Sets the value of the companyLocationDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyLocationDe(String value) {
        this.companyLocationDe = value;
    }

    /**
     * Gets the value of the companyNameIt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getCompanyNameIt() {
        return companyNameIt;
    }

    /**
     * Sets the value of the companyNameIt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyNameIt(String value) {
        this.companyNameIt = value;
    }

    /**
     * Gets the value of the companyAddressIt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getCompanyAddressIt() {
        return companyAddressIt;
    }

    /**
     * Sets the value of the companyAddressIt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyAddressIt(String value) {
        this.companyAddressIt = value;
    }

    /**
     * Gets the value of the companyLocationIt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getCompanyLocationIt() {
        return companyLocationIt;
    }

    /**
     * Sets the value of the companyLocationIt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyLocationIt(String value) {
        this.companyLocationIt = value;
    }

    /**
     * Gets the value of the companyPostalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getCompanyPostalcode() {
        return companyPostalcode;
    }

    /**
     * Sets the value of the companyPostalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyPostalcode(String value) {
        this.companyPostalcode = value;
    }

    /**
     * Gets the value of the companyProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getCompanyProvince() {
        return companyProvince;
    }

    /**
     * Sets the value of the companyProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyProvince(String value) {
        this.companyProvince = value;
    }

    /**
     * Gets the value of the companyCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getCompanyCountry() {
        return companyCountry;
    }

    /**
     * Sets the value of the companyCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyCountry(String value) {
        this.companyCountry = value;
    }

    /**
     * Gets the value of the companyPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * Sets the value of the companyPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyPhone(String value) {
        this.companyPhone = value;
    }

    /**
     * Gets the value of the companyFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getCompanyFax() {
        return companyFax;
    }

    /**
     * Sets the value of the companyFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyFax(String value) {
        this.companyFax = value;
    }

    /**
     * Gets the value of the companyMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getCompanyMobile() {
        return companyMobile;
    }

    /**
     * Sets the value of the companyMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyMobile(String value) {
        this.companyMobile = value;
    }

    /**
     * Gets the value of the companyEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getCompanyEmail() {
        return companyEmail;
    }

    /**
     * Sets the value of the companyEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyEmail(String value) {
        this.companyEmail = value;
    }

    /**
     * Gets the value of the companyWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public URI getCompanyWebsite() {
        return companyWebsite;
    }

    /**
     * Sets the value of the companyWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyWebsite(URI value) {
        this.companyWebsite = value;
    }

    /**
     * Gets the value of the companyISTAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String getCompanyISTAT() {
        return companyISTAT;
    }

    /**
     * Sets the value of the companyISTAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public void setCompanyISTAT(String value) {
        this.companyISTAT = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public List<PropertyType> getProperty() {
        if (property == null) {
            property = new ArrayList<PropertyType>();
        }
        return this.property;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theCompanyNameDe;
            theCompanyNameDe = this.getCompanyNameDe();
            strategy.appendField(locator, this, "companyNameDe", buffer, theCompanyNameDe, (this.companyNameDe!= null));
        }
        {
            String theCompanyAddressDe;
            theCompanyAddressDe = this.getCompanyAddressDe();
            strategy.appendField(locator, this, "companyAddressDe", buffer, theCompanyAddressDe, (this.companyAddressDe!= null));
        }
        {
            String theCompanyLocationDe;
            theCompanyLocationDe = this.getCompanyLocationDe();
            strategy.appendField(locator, this, "companyLocationDe", buffer, theCompanyLocationDe, (this.companyLocationDe!= null));
        }
        {
            String theCompanyNameIt;
            theCompanyNameIt = this.getCompanyNameIt();
            strategy.appendField(locator, this, "companyNameIt", buffer, theCompanyNameIt, (this.companyNameIt!= null));
        }
        {
            String theCompanyAddressIt;
            theCompanyAddressIt = this.getCompanyAddressIt();
            strategy.appendField(locator, this, "companyAddressIt", buffer, theCompanyAddressIt, (this.companyAddressIt!= null));
        }
        {
            String theCompanyLocationIt;
            theCompanyLocationIt = this.getCompanyLocationIt();
            strategy.appendField(locator, this, "companyLocationIt", buffer, theCompanyLocationIt, (this.companyLocationIt!= null));
        }
        {
            String theCompanyPostalcode;
            theCompanyPostalcode = this.getCompanyPostalcode();
            strategy.appendField(locator, this, "companyPostalcode", buffer, theCompanyPostalcode, (this.companyPostalcode!= null));
        }
        {
            String theCompanyProvince;
            theCompanyProvince = this.getCompanyProvince();
            strategy.appendField(locator, this, "companyProvince", buffer, theCompanyProvince, (this.companyProvince!= null));
        }
        {
            String theCompanyCountry;
            theCompanyCountry = this.getCompanyCountry();
            strategy.appendField(locator, this, "companyCountry", buffer, theCompanyCountry, (this.companyCountry!= null));
        }
        {
            String theCompanyPhone;
            theCompanyPhone = this.getCompanyPhone();
            strategy.appendField(locator, this, "companyPhone", buffer, theCompanyPhone, (this.companyPhone!= null));
        }
        {
            String theCompanyFax;
            theCompanyFax = this.getCompanyFax();
            strategy.appendField(locator, this, "companyFax", buffer, theCompanyFax, (this.companyFax!= null));
        }
        {
            String theCompanyMobile;
            theCompanyMobile = this.getCompanyMobile();
            strategy.appendField(locator, this, "companyMobile", buffer, theCompanyMobile, (this.companyMobile!= null));
        }
        {
            String theCompanyEmail;
            theCompanyEmail = this.getCompanyEmail();
            strategy.appendField(locator, this, "companyEmail", buffer, theCompanyEmail, (this.companyEmail!= null));
        }
        {
            URI theCompanyWebsite;
            theCompanyWebsite = this.getCompanyWebsite();
            strategy.appendField(locator, this, "companyWebsite", buffer, theCompanyWebsite, (this.companyWebsite!= null));
        }
        {
            String theCompanyISTAT;
            theCompanyISTAT = this.getCompanyISTAT();
            strategy.appendField(locator, this, "companyISTAT", buffer, theCompanyISTAT, (this.companyISTAT!= null));
        }
        {
            List<PropertyType> theProperty;
            theProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
            strategy.appendField(locator, this, "property", buffer, theProperty, ((this.property!= null)&&(!this.property.isEmpty())));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof CompanyType) {
            final CompanyType copy = ((CompanyType) draftCopy);
            {
                Boolean companyNameDeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyNameDe!= null));
                if (companyNameDeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyNameDe;
                    sourceCompanyNameDe = this.getCompanyNameDe();
                    String copyCompanyNameDe = ((String) strategy.copy(LocatorUtils.property(locator, "companyNameDe", sourceCompanyNameDe), sourceCompanyNameDe, (this.companyNameDe!= null)));
                    copy.setCompanyNameDe(copyCompanyNameDe);
                } else {
                    if (companyNameDeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyNameDe = null;
                    }
                }
            }
            {
                Boolean companyAddressDeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyAddressDe!= null));
                if (companyAddressDeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyAddressDe;
                    sourceCompanyAddressDe = this.getCompanyAddressDe();
                    String copyCompanyAddressDe = ((String) strategy.copy(LocatorUtils.property(locator, "companyAddressDe", sourceCompanyAddressDe), sourceCompanyAddressDe, (this.companyAddressDe!= null)));
                    copy.setCompanyAddressDe(copyCompanyAddressDe);
                } else {
                    if (companyAddressDeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyAddressDe = null;
                    }
                }
            }
            {
                Boolean companyLocationDeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyLocationDe!= null));
                if (companyLocationDeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyLocationDe;
                    sourceCompanyLocationDe = this.getCompanyLocationDe();
                    String copyCompanyLocationDe = ((String) strategy.copy(LocatorUtils.property(locator, "companyLocationDe", sourceCompanyLocationDe), sourceCompanyLocationDe, (this.companyLocationDe!= null)));
                    copy.setCompanyLocationDe(copyCompanyLocationDe);
                } else {
                    if (companyLocationDeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyLocationDe = null;
                    }
                }
            }
            {
                Boolean companyNameItShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyNameIt!= null));
                if (companyNameItShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyNameIt;
                    sourceCompanyNameIt = this.getCompanyNameIt();
                    String copyCompanyNameIt = ((String) strategy.copy(LocatorUtils.property(locator, "companyNameIt", sourceCompanyNameIt), sourceCompanyNameIt, (this.companyNameIt!= null)));
                    copy.setCompanyNameIt(copyCompanyNameIt);
                } else {
                    if (companyNameItShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyNameIt = null;
                    }
                }
            }
            {
                Boolean companyAddressItShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyAddressIt!= null));
                if (companyAddressItShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyAddressIt;
                    sourceCompanyAddressIt = this.getCompanyAddressIt();
                    String copyCompanyAddressIt = ((String) strategy.copy(LocatorUtils.property(locator, "companyAddressIt", sourceCompanyAddressIt), sourceCompanyAddressIt, (this.companyAddressIt!= null)));
                    copy.setCompanyAddressIt(copyCompanyAddressIt);
                } else {
                    if (companyAddressItShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyAddressIt = null;
                    }
                }
            }
            {
                Boolean companyLocationItShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyLocationIt!= null));
                if (companyLocationItShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyLocationIt;
                    sourceCompanyLocationIt = this.getCompanyLocationIt();
                    String copyCompanyLocationIt = ((String) strategy.copy(LocatorUtils.property(locator, "companyLocationIt", sourceCompanyLocationIt), sourceCompanyLocationIt, (this.companyLocationIt!= null)));
                    copy.setCompanyLocationIt(copyCompanyLocationIt);
                } else {
                    if (companyLocationItShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyLocationIt = null;
                    }
                }
            }
            {
                Boolean companyPostalcodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyPostalcode!= null));
                if (companyPostalcodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyPostalcode;
                    sourceCompanyPostalcode = this.getCompanyPostalcode();
                    String copyCompanyPostalcode = ((String) strategy.copy(LocatorUtils.property(locator, "companyPostalcode", sourceCompanyPostalcode), sourceCompanyPostalcode, (this.companyPostalcode!= null)));
                    copy.setCompanyPostalcode(copyCompanyPostalcode);
                } else {
                    if (companyPostalcodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyPostalcode = null;
                    }
                }
            }
            {
                Boolean companyProvinceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyProvince!= null));
                if (companyProvinceShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyProvince;
                    sourceCompanyProvince = this.getCompanyProvince();
                    String copyCompanyProvince = ((String) strategy.copy(LocatorUtils.property(locator, "companyProvince", sourceCompanyProvince), sourceCompanyProvince, (this.companyProvince!= null)));
                    copy.setCompanyProvince(copyCompanyProvince);
                } else {
                    if (companyProvinceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyProvince = null;
                    }
                }
            }
            {
                Boolean companyCountryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyCountry!= null));
                if (companyCountryShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyCountry;
                    sourceCompanyCountry = this.getCompanyCountry();
                    String copyCompanyCountry = ((String) strategy.copy(LocatorUtils.property(locator, "companyCountry", sourceCompanyCountry), sourceCompanyCountry, (this.companyCountry!= null)));
                    copy.setCompanyCountry(copyCompanyCountry);
                } else {
                    if (companyCountryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyCountry = null;
                    }
                }
            }
            {
                Boolean companyPhoneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyPhone!= null));
                if (companyPhoneShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyPhone;
                    sourceCompanyPhone = this.getCompanyPhone();
                    String copyCompanyPhone = ((String) strategy.copy(LocatorUtils.property(locator, "companyPhone", sourceCompanyPhone), sourceCompanyPhone, (this.companyPhone!= null)));
                    copy.setCompanyPhone(copyCompanyPhone);
                } else {
                    if (companyPhoneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyPhone = null;
                    }
                }
            }
            {
                Boolean companyFaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyFax!= null));
                if (companyFaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyFax;
                    sourceCompanyFax = this.getCompanyFax();
                    String copyCompanyFax = ((String) strategy.copy(LocatorUtils.property(locator, "companyFax", sourceCompanyFax), sourceCompanyFax, (this.companyFax!= null)));
                    copy.setCompanyFax(copyCompanyFax);
                } else {
                    if (companyFaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyFax = null;
                    }
                }
            }
            {
                Boolean companyMobileShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyMobile!= null));
                if (companyMobileShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyMobile;
                    sourceCompanyMobile = this.getCompanyMobile();
                    String copyCompanyMobile = ((String) strategy.copy(LocatorUtils.property(locator, "companyMobile", sourceCompanyMobile), sourceCompanyMobile, (this.companyMobile!= null)));
                    copy.setCompanyMobile(copyCompanyMobile);
                } else {
                    if (companyMobileShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyMobile = null;
                    }
                }
            }
            {
                Boolean companyEmailShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyEmail!= null));
                if (companyEmailShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyEmail;
                    sourceCompanyEmail = this.getCompanyEmail();
                    String copyCompanyEmail = ((String) strategy.copy(LocatorUtils.property(locator, "companyEmail", sourceCompanyEmail), sourceCompanyEmail, (this.companyEmail!= null)));
                    copy.setCompanyEmail(copyCompanyEmail);
                } else {
                    if (companyEmailShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyEmail = null;
                    }
                }
            }
            {
                Boolean companyWebsiteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyWebsite!= null));
                if (companyWebsiteShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceCompanyWebsite;
                    sourceCompanyWebsite = this.getCompanyWebsite();
                    URI copyCompanyWebsite = ((URI) strategy.copy(LocatorUtils.property(locator, "companyWebsite", sourceCompanyWebsite), sourceCompanyWebsite, (this.companyWebsite!= null)));
                    copy.setCompanyWebsite(copyCompanyWebsite);
                } else {
                    if (companyWebsiteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyWebsite = null;
                    }
                }
            }
            {
                Boolean companyISTATShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.companyISTAT!= null));
                if (companyISTATShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCompanyISTAT;
                    sourceCompanyISTAT = this.getCompanyISTAT();
                    String copyCompanyISTAT = ((String) strategy.copy(LocatorUtils.property(locator, "companyISTAT", sourceCompanyISTAT), sourceCompanyISTAT, (this.companyISTAT!= null)));
                    copy.setCompanyISTAT(copyCompanyISTAT);
                } else {
                    if (companyISTATShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.companyISTAT = null;
                    }
                }
            }
            {
                Boolean propertyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.property!= null)&&(!this.property.isEmpty())));
                if (propertyShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<PropertyType> sourceProperty;
                    sourceProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
                    @SuppressWarnings("unchecked")
                    List<PropertyType> copyProperty = ((List<PropertyType> ) strategy.copy(LocatorUtils.property(locator, "property", sourceProperty), sourceProperty, ((this.property!= null)&&(!this.property.isEmpty()))));
                    copy.property = null;
                    if (copyProperty!= null) {
                        List<PropertyType> uniquePropertyl = copy.getProperty();
                        uniquePropertyl.addAll(copyProperty);
                    }
                } else {
                    if (propertyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.property = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new CompanyType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CompanyType that = ((CompanyType) object);
        {
            String lhsCompanyNameDe;
            lhsCompanyNameDe = this.getCompanyNameDe();
            String rhsCompanyNameDe;
            rhsCompanyNameDe = that.getCompanyNameDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyNameDe", lhsCompanyNameDe), LocatorUtils.property(thatLocator, "companyNameDe", rhsCompanyNameDe), lhsCompanyNameDe, rhsCompanyNameDe, (this.companyNameDe!= null), (that.companyNameDe!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyAddressDe;
            lhsCompanyAddressDe = this.getCompanyAddressDe();
            String rhsCompanyAddressDe;
            rhsCompanyAddressDe = that.getCompanyAddressDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyAddressDe", lhsCompanyAddressDe), LocatorUtils.property(thatLocator, "companyAddressDe", rhsCompanyAddressDe), lhsCompanyAddressDe, rhsCompanyAddressDe, (this.companyAddressDe!= null), (that.companyAddressDe!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyLocationDe;
            lhsCompanyLocationDe = this.getCompanyLocationDe();
            String rhsCompanyLocationDe;
            rhsCompanyLocationDe = that.getCompanyLocationDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyLocationDe", lhsCompanyLocationDe), LocatorUtils.property(thatLocator, "companyLocationDe", rhsCompanyLocationDe), lhsCompanyLocationDe, rhsCompanyLocationDe, (this.companyLocationDe!= null), (that.companyLocationDe!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyNameIt;
            lhsCompanyNameIt = this.getCompanyNameIt();
            String rhsCompanyNameIt;
            rhsCompanyNameIt = that.getCompanyNameIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyNameIt", lhsCompanyNameIt), LocatorUtils.property(thatLocator, "companyNameIt", rhsCompanyNameIt), lhsCompanyNameIt, rhsCompanyNameIt, (this.companyNameIt!= null), (that.companyNameIt!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyAddressIt;
            lhsCompanyAddressIt = this.getCompanyAddressIt();
            String rhsCompanyAddressIt;
            rhsCompanyAddressIt = that.getCompanyAddressIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyAddressIt", lhsCompanyAddressIt), LocatorUtils.property(thatLocator, "companyAddressIt", rhsCompanyAddressIt), lhsCompanyAddressIt, rhsCompanyAddressIt, (this.companyAddressIt!= null), (that.companyAddressIt!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyLocationIt;
            lhsCompanyLocationIt = this.getCompanyLocationIt();
            String rhsCompanyLocationIt;
            rhsCompanyLocationIt = that.getCompanyLocationIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyLocationIt", lhsCompanyLocationIt), LocatorUtils.property(thatLocator, "companyLocationIt", rhsCompanyLocationIt), lhsCompanyLocationIt, rhsCompanyLocationIt, (this.companyLocationIt!= null), (that.companyLocationIt!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyPostalcode;
            lhsCompanyPostalcode = this.getCompanyPostalcode();
            String rhsCompanyPostalcode;
            rhsCompanyPostalcode = that.getCompanyPostalcode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyPostalcode", lhsCompanyPostalcode), LocatorUtils.property(thatLocator, "companyPostalcode", rhsCompanyPostalcode), lhsCompanyPostalcode, rhsCompanyPostalcode, (this.companyPostalcode!= null), (that.companyPostalcode!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyProvince;
            lhsCompanyProvince = this.getCompanyProvince();
            String rhsCompanyProvince;
            rhsCompanyProvince = that.getCompanyProvince();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyProvince", lhsCompanyProvince), LocatorUtils.property(thatLocator, "companyProvince", rhsCompanyProvince), lhsCompanyProvince, rhsCompanyProvince, (this.companyProvince!= null), (that.companyProvince!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyCountry;
            lhsCompanyCountry = this.getCompanyCountry();
            String rhsCompanyCountry;
            rhsCompanyCountry = that.getCompanyCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyCountry", lhsCompanyCountry), LocatorUtils.property(thatLocator, "companyCountry", rhsCompanyCountry), lhsCompanyCountry, rhsCompanyCountry, (this.companyCountry!= null), (that.companyCountry!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyPhone;
            lhsCompanyPhone = this.getCompanyPhone();
            String rhsCompanyPhone;
            rhsCompanyPhone = that.getCompanyPhone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyPhone", lhsCompanyPhone), LocatorUtils.property(thatLocator, "companyPhone", rhsCompanyPhone), lhsCompanyPhone, rhsCompanyPhone, (this.companyPhone!= null), (that.companyPhone!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyFax;
            lhsCompanyFax = this.getCompanyFax();
            String rhsCompanyFax;
            rhsCompanyFax = that.getCompanyFax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyFax", lhsCompanyFax), LocatorUtils.property(thatLocator, "companyFax", rhsCompanyFax), lhsCompanyFax, rhsCompanyFax, (this.companyFax!= null), (that.companyFax!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyMobile;
            lhsCompanyMobile = this.getCompanyMobile();
            String rhsCompanyMobile;
            rhsCompanyMobile = that.getCompanyMobile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyMobile", lhsCompanyMobile), LocatorUtils.property(thatLocator, "companyMobile", rhsCompanyMobile), lhsCompanyMobile, rhsCompanyMobile, (this.companyMobile!= null), (that.companyMobile!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyEmail;
            lhsCompanyEmail = this.getCompanyEmail();
            String rhsCompanyEmail;
            rhsCompanyEmail = that.getCompanyEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyEmail", lhsCompanyEmail), LocatorUtils.property(thatLocator, "companyEmail", rhsCompanyEmail), lhsCompanyEmail, rhsCompanyEmail, (this.companyEmail!= null), (that.companyEmail!= null))) {
                return false;
            }
        }
        {
            URI lhsCompanyWebsite;
            lhsCompanyWebsite = this.getCompanyWebsite();
            URI rhsCompanyWebsite;
            rhsCompanyWebsite = that.getCompanyWebsite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyWebsite", lhsCompanyWebsite), LocatorUtils.property(thatLocator, "companyWebsite", rhsCompanyWebsite), lhsCompanyWebsite, rhsCompanyWebsite, (this.companyWebsite!= null), (that.companyWebsite!= null))) {
                return false;
            }
        }
        {
            String lhsCompanyISTAT;
            lhsCompanyISTAT = this.getCompanyISTAT();
            String rhsCompanyISTAT;
            rhsCompanyISTAT = that.getCompanyISTAT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyISTAT", lhsCompanyISTAT), LocatorUtils.property(thatLocator, "companyISTAT", rhsCompanyISTAT), lhsCompanyISTAT, rhsCompanyISTAT, (this.companyISTAT!= null), (that.companyISTAT!= null))) {
                return false;
            }
        }
        {
            List<PropertyType> lhsProperty;
            lhsProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
            List<PropertyType> rhsProperty;
            rhsProperty = (((that.property!= null)&&(!that.property.isEmpty()))?that.getProperty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "property", lhsProperty), LocatorUtils.property(thatLocator, "property", rhsProperty), lhsProperty, rhsProperty, ((this.property!= null)&&(!this.property.isEmpty())), ((that.property!= null)&&(!that.property.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
