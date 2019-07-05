
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for sales-office complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sales-office"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="country-code" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[a-zA-Z]{2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="administrative-area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sub-administrative-area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="locality"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="thoroughfare" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sales-office", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
public class SalesOffice implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "country-code")
    @XmlJavaTypeAdapter(Adapter20 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String countryCode;
    @XmlElement(name = "administrative-area")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String administrativeArea;
    @XmlElement(name = "sub-administrative-area")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String subAdministrativeArea;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected SalesOffice.City city;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected SalesOffice.Locality locality;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String phone;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected String mobile;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the administrativeArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getAdministrativeArea() {
        return administrativeArea;
    }

    /**
     * Sets the value of the administrativeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setAdministrativeArea(String value) {
        this.administrativeArea = value;
    }

    /**
     * Gets the value of the subAdministrativeArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getSubAdministrativeArea() {
        return subAdministrativeArea;
    }

    /**
     * Sets the value of the subAdministrativeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setSubAdministrativeArea(String value) {
        this.subAdministrativeArea = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOffice.City }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public SalesOffice.City getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOffice.City }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setCity(SalesOffice.City value) {
        this.city = value;
    }

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOffice.Locality }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public SalesOffice.Locality getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOffice.Locality }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setLocality(SalesOffice.Locality value) {
        this.locality = value;
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
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setMobile(String value) {
        this.mobile = value;
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
            String theCountryCode;
            theCountryCode = this.getCountryCode();
            strategy.appendField(locator, this, "countryCode", buffer, theCountryCode, (this.countryCode!= null));
        }
        {
            String theAdministrativeArea;
            theAdministrativeArea = this.getAdministrativeArea();
            strategy.appendField(locator, this, "administrativeArea", buffer, theAdministrativeArea, (this.administrativeArea!= null));
        }
        {
            String theSubAdministrativeArea;
            theSubAdministrativeArea = this.getSubAdministrativeArea();
            strategy.appendField(locator, this, "subAdministrativeArea", buffer, theSubAdministrativeArea, (this.subAdministrativeArea!= null));
        }
        {
            SalesOffice.City theCity;
            theCity = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theCity, (this.city!= null));
        }
        {
            SalesOffice.Locality theLocality;
            theLocality = this.getLocality();
            strategy.appendField(locator, this, "locality", buffer, theLocality, (this.locality!= null));
        }
        {
            String thePhone;
            thePhone = this.getPhone();
            strategy.appendField(locator, this, "phone", buffer, thePhone, (this.phone!= null));
        }
        {
            String theMobile;
            theMobile = this.getMobile();
            strategy.appendField(locator, this, "mobile", buffer, theMobile, (this.mobile!= null));
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
        if (draftCopy instanceof SalesOffice) {
            final SalesOffice copy = ((SalesOffice) draftCopy);
            {
                Boolean countryCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.countryCode!= null));
                if (countryCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCountryCode;
                    sourceCountryCode = this.getCountryCode();
                    String copyCountryCode = ((String) strategy.copy(LocatorUtils.property(locator, "countryCode", sourceCountryCode), sourceCountryCode, (this.countryCode!= null)));
                    copy.setCountryCode(copyCountryCode);
                } else {
                    if (countryCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.countryCode = null;
                    }
                }
            }
            {
                Boolean administrativeAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.administrativeArea!= null));
                if (administrativeAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAdministrativeArea;
                    sourceAdministrativeArea = this.getAdministrativeArea();
                    String copyAdministrativeArea = ((String) strategy.copy(LocatorUtils.property(locator, "administrativeArea", sourceAdministrativeArea), sourceAdministrativeArea, (this.administrativeArea!= null)));
                    copy.setAdministrativeArea(copyAdministrativeArea);
                } else {
                    if (administrativeAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.administrativeArea = null;
                    }
                }
            }
            {
                Boolean subAdministrativeAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.subAdministrativeArea!= null));
                if (subAdministrativeAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSubAdministrativeArea;
                    sourceSubAdministrativeArea = this.getSubAdministrativeArea();
                    String copySubAdministrativeArea = ((String) strategy.copy(LocatorUtils.property(locator, "subAdministrativeArea", sourceSubAdministrativeArea), sourceSubAdministrativeArea, (this.subAdministrativeArea!= null)));
                    copy.setSubAdministrativeArea(copySubAdministrativeArea);
                } else {
                    if (subAdministrativeAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.subAdministrativeArea = null;
                    }
                }
            }
            {
                Boolean cityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.city!= null));
                if (cityShouldBeCopiedAndSet == Boolean.TRUE) {
                    SalesOffice.City sourceCity;
                    sourceCity = this.getCity();
                    SalesOffice.City copyCity = ((SalesOffice.City) strategy.copy(LocatorUtils.property(locator, "city", sourceCity), sourceCity, (this.city!= null)));
                    copy.setCity(copyCity);
                } else {
                    if (cityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.city = null;
                    }
                }
            }
            {
                Boolean localityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.locality!= null));
                if (localityShouldBeCopiedAndSet == Boolean.TRUE) {
                    SalesOffice.Locality sourceLocality;
                    sourceLocality = this.getLocality();
                    SalesOffice.Locality copyLocality = ((SalesOffice.Locality) strategy.copy(LocatorUtils.property(locator, "locality", sourceLocality), sourceLocality, (this.locality!= null)));
                    copy.setLocality(copyLocality);
                } else {
                    if (localityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.locality = null;
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
                Boolean mobileShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mobile!= null));
                if (mobileShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMobile;
                    sourceMobile = this.getMobile();
                    String copyMobile = ((String) strategy.copy(LocatorUtils.property(locator, "mobile", sourceMobile), sourceMobile, (this.mobile!= null)));
                    copy.setMobile(copyMobile);
                } else {
                    if (mobileShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mobile = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new SalesOffice();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SalesOffice that = ((SalesOffice) object);
        {
            String lhsCountryCode;
            lhsCountryCode = this.getCountryCode();
            String rhsCountryCode;
            rhsCountryCode = that.getCountryCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryCode", lhsCountryCode), LocatorUtils.property(thatLocator, "countryCode", rhsCountryCode), lhsCountryCode, rhsCountryCode, (this.countryCode!= null), (that.countryCode!= null))) {
                return false;
            }
        }
        {
            String lhsAdministrativeArea;
            lhsAdministrativeArea = this.getAdministrativeArea();
            String rhsAdministrativeArea;
            rhsAdministrativeArea = that.getAdministrativeArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "administrativeArea", lhsAdministrativeArea), LocatorUtils.property(thatLocator, "administrativeArea", rhsAdministrativeArea), lhsAdministrativeArea, rhsAdministrativeArea, (this.administrativeArea!= null), (that.administrativeArea!= null))) {
                return false;
            }
        }
        {
            String lhsSubAdministrativeArea;
            lhsSubAdministrativeArea = this.getSubAdministrativeArea();
            String rhsSubAdministrativeArea;
            rhsSubAdministrativeArea = that.getSubAdministrativeArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subAdministrativeArea", lhsSubAdministrativeArea), LocatorUtils.property(thatLocator, "subAdministrativeArea", rhsSubAdministrativeArea), lhsSubAdministrativeArea, rhsSubAdministrativeArea, (this.subAdministrativeArea!= null), (that.subAdministrativeArea!= null))) {
                return false;
            }
        }
        {
            SalesOffice.City lhsCity;
            lhsCity = this.getCity();
            SalesOffice.City rhsCity;
            rhsCity = that.getCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity, (this.city!= null), (that.city!= null))) {
                return false;
            }
        }
        {
            SalesOffice.Locality lhsLocality;
            lhsLocality = this.getLocality();
            SalesOffice.Locality rhsLocality;
            rhsLocality = that.getLocality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locality", lhsLocality), LocatorUtils.property(thatLocator, "locality", rhsLocality), lhsLocality, rhsLocality, (this.locality!= null), (that.locality!= null))) {
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
            String lhsMobile;
            lhsMobile = this.getMobile();
            String rhsMobile;
            rhsMobile = that.getMobile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobile", lhsMobile), LocatorUtils.property(thatLocator, "mobile", rhsMobile), lhsMobile, rhsMobile, (this.mobile!= null), (that.mobile!= null))) {
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    public static class City implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlValue
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected String value;
        @XmlAttribute(name = "code")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected String code;

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
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setCode(String value) {
            this.code = value;
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
                String theCode;
                theCode = this.getCode();
                strategy.appendField(locator, this, "code", buffer, theCode, (this.code!= null));
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
            if (draftCopy instanceof SalesOffice.City) {
                final SalesOffice.City copy = ((SalesOffice.City) draftCopy);
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
                    Boolean codeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.code!= null));
                    if (codeShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceCode;
                        sourceCode = this.getCode();
                        String copyCode = ((String) strategy.copy(LocatorUtils.property(locator, "code", sourceCode), sourceCode, (this.code!= null)));
                        copy.setCode(copyCode);
                    } else {
                        if (codeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.code = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new SalesOffice.City();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final SalesOffice.City that = ((SalesOffice.City) object);
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
                String lhsCode;
                lhsCode = this.getCode();
                String rhsCode;
                rhsCode = that.getCode();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode, (this.code!= null), (that.code!= null))) {
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="thoroughfare" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "thoroughfare"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public static class Locality implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected String thoroughfare;

        /**
         * Gets the value of the thoroughfare property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public String getThoroughfare() {
            return thoroughfare;
        }

        /**
         * Sets the value of the thoroughfare property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setThoroughfare(String value) {
            this.thoroughfare = value;
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
                String theThoroughfare;
                theThoroughfare = this.getThoroughfare();
                strategy.appendField(locator, this, "thoroughfare", buffer, theThoroughfare, (this.thoroughfare!= null));
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
            if (draftCopy instanceof SalesOffice.Locality) {
                final SalesOffice.Locality copy = ((SalesOffice.Locality) draftCopy);
                {
                    Boolean thoroughfareShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thoroughfare!= null));
                    if (thoroughfareShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceThoroughfare;
                        sourceThoroughfare = this.getThoroughfare();
                        String copyThoroughfare = ((String) strategy.copy(LocatorUtils.property(locator, "thoroughfare", sourceThoroughfare), sourceThoroughfare, (this.thoroughfare!= null)));
                        copy.setThoroughfare(copyThoroughfare);
                    } else {
                        if (thoroughfareShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.thoroughfare = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new SalesOffice.Locality();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final SalesOffice.Locality that = ((SalesOffice.Locality) object);
            {
                String lhsThoroughfare;
                lhsThoroughfare = this.getThoroughfare();
                String rhsThoroughfare;
                rhsThoroughfare = that.getThoroughfare();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "thoroughfare", lhsThoroughfare), LocatorUtils.property(thatLocator, "thoroughfare", rhsThoroughfare), lhsThoroughfare, rhsThoroughfare, (this.thoroughfare!= null), (that.thoroughfare!= null))) {
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

}
