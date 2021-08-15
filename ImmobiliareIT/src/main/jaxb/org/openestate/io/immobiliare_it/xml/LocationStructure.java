
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
 * <p>Java class for locationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="country-code"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[a-zA-Z]{2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="administrative-area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sub-administrative-area"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="city"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="locality" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="neighbourhood" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="type"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="district"/&gt;
 *                                 &lt;enumeration value="locality"/&gt;
 *                                 &lt;enumeration value="area"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="thoroughfare" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="display"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;pattern value="yes|no"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="postal-code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="longitude" type="{http://feed.immobiliare.it}longitudeType"/&gt;
 *                   &lt;element name="latitude" type="{http://feed.immobiliare.it}latitudeType"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationStructure", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
public class LocationStructure implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "country-code", required = true)
    @XmlJavaTypeAdapter(Adapter19 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected String countryCode;
    @XmlElement(name = "administrative-area", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected String administrativeArea;
    @XmlElement(name = "sub-administrative-area", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected LocationStructure.SubAdministrativeArea subAdministrativeArea;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected LocationStructure.City city;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected LocationStructure.Locality locality;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public void setAdministrativeArea(String value) {
        this.administrativeArea = value;
    }

    /**
     * Gets the value of the subAdministrativeArea property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure.SubAdministrativeArea }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public LocationStructure.SubAdministrativeArea getSubAdministrativeArea() {
        return subAdministrativeArea;
    }

    /**
     * Sets the value of the subAdministrativeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure.SubAdministrativeArea }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public void setSubAdministrativeArea(LocationStructure.SubAdministrativeArea value) {
        this.subAdministrativeArea = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure.City }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public LocationStructure.City getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure.City }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public void setCity(LocationStructure.City value) {
        this.city = value;
    }

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure.Locality }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public LocationStructure.Locality getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure.Locality }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public void setLocality(LocationStructure.Locality value) {
        this.locality = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
            LocationStructure.SubAdministrativeArea theSubAdministrativeArea;
            theSubAdministrativeArea = this.getSubAdministrativeArea();
            strategy.appendField(locator, this, "subAdministrativeArea", buffer, theSubAdministrativeArea, (this.subAdministrativeArea!= null));
        }
        {
            LocationStructure.City theCity;
            theCity = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theCity, (this.city!= null));
        }
        {
            LocationStructure.Locality theLocality;
            theLocality = this.getLocality();
            strategy.appendField(locator, this, "locality", buffer, theLocality, (this.locality!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof LocationStructure) {
            final LocationStructure copy = ((LocationStructure) draftCopy);
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
                    LocationStructure.SubAdministrativeArea sourceSubAdministrativeArea;
                    sourceSubAdministrativeArea = this.getSubAdministrativeArea();
                    LocationStructure.SubAdministrativeArea copySubAdministrativeArea = ((LocationStructure.SubAdministrativeArea) strategy.copy(LocatorUtils.property(locator, "subAdministrativeArea", sourceSubAdministrativeArea), sourceSubAdministrativeArea, (this.subAdministrativeArea!= null)));
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
                    LocationStructure.City sourceCity;
                    sourceCity = this.getCity();
                    LocationStructure.City copyCity = ((LocationStructure.City) strategy.copy(LocatorUtils.property(locator, "city", sourceCity), sourceCity, (this.city!= null)));
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
                    LocationStructure.Locality sourceLocality;
                    sourceLocality = this.getLocality();
                    LocationStructure.Locality copyLocality = ((LocationStructure.Locality) strategy.copy(LocatorUtils.property(locator, "locality", sourceLocality), sourceLocality, (this.locality!= null)));
                    copy.setLocality(copyLocality);
                } else {
                    if (localityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.locality = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new LocationStructure();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LocationStructure that = ((LocationStructure) object);
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
            LocationStructure.SubAdministrativeArea lhsSubAdministrativeArea;
            lhsSubAdministrativeArea = this.getSubAdministrativeArea();
            LocationStructure.SubAdministrativeArea rhsSubAdministrativeArea;
            rhsSubAdministrativeArea = that.getSubAdministrativeArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subAdministrativeArea", lhsSubAdministrativeArea), LocatorUtils.property(thatLocator, "subAdministrativeArea", rhsSubAdministrativeArea), lhsSubAdministrativeArea, rhsSubAdministrativeArea, (this.subAdministrativeArea!= null), (that.subAdministrativeArea!= null))) {
                return false;
            }
        }
        {
            LocationStructure.City lhsCity;
            lhsCity = this.getCity();
            LocationStructure.City rhsCity;
            rhsCity = that.getCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity, (this.city!= null), (that.city!= null))) {
                return false;
            }
        }
        {
            LocationStructure.Locality lhsLocality;
            lhsLocality = this.getLocality();
            LocationStructure.Locality rhsLocality;
            rhsLocality = that.getLocality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locality", lhsLocality), LocatorUtils.property(thatLocator, "locality", rhsLocality), lhsLocality, rhsLocality, (this.locality!= null), (that.locality!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public static class City implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlValue
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        protected String value;
        @XmlAttribute(name = "code")
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "integer")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        protected BigInteger code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public BigInteger getCode() {
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public void setCode(BigInteger value) {
            this.code = value;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                String theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
            }
            {
                BigInteger theCode;
                theCode = this.getCode();
                strategy.appendField(locator, this, "code", buffer, theCode, (this.code!= null));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof LocationStructure.City) {
                final LocationStructure.City copy = ((LocationStructure.City) draftCopy);
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
                        BigInteger sourceCode;
                        sourceCode = this.getCode();
                        BigInteger copyCode = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "code", sourceCode), sourceCode, (this.code!= null)));
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

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new LocationStructure.City();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final LocationStructure.City that = ((LocationStructure.City) object);
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
                BigInteger lhsCode;
                lhsCode = this.getCode();
                BigInteger rhsCode;
                rhsCode = that.getCode();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode, (this.code!= null), (that.code!= null))) {
                    return false;
                }
            }
            return true;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
     *       &lt;all&gt;
     *         &lt;element name="neighbourhood" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="type"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="district"/&gt;
     *                       &lt;enumeration value="locality"/&gt;
     *                       &lt;enumeration value="area"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="thoroughfare" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="display"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;pattern value="yes|no"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="postal-code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="longitude" type="{http://feed.immobiliare.it}longitudeType"/&gt;
     *         &lt;element name="latitude" type="{http://feed.immobiliare.it}latitudeType"/&gt;
     *       &lt;/all&gt;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public static class Locality implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        protected LocationStructure.Locality.Neighbourhood neighbourhood;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        protected LocationStructure.Locality.Thoroughfare thoroughfare;
        @XmlElement(name = "postal-code")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        protected String postalCode;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter9 .class)
        @XmlSchemaType(name = "decimal")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        protected BigDecimal longitude;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter8 .class)
        @XmlSchemaType(name = "decimal")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        protected BigDecimal latitude;

        /**
         * Gets the value of the neighbourhood property.
         * 
         * @return
         *     possible object is
         *     {@link LocationStructure.Locality.Neighbourhood }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public LocationStructure.Locality.Neighbourhood getNeighbourhood() {
            return neighbourhood;
        }

        /**
         * Sets the value of the neighbourhood property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationStructure.Locality.Neighbourhood }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public void setNeighbourhood(LocationStructure.Locality.Neighbourhood value) {
            this.neighbourhood = value;
        }

        /**
         * Gets the value of the thoroughfare property.
         * 
         * @return
         *     possible object is
         *     {@link LocationStructure.Locality.Thoroughfare }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public LocationStructure.Locality.Thoroughfare getThoroughfare() {
            return thoroughfare;
        }

        /**
         * Sets the value of the thoroughfare property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationStructure.Locality.Thoroughfare }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public void setThoroughfare(LocationStructure.Locality.Thoroughfare value) {
            this.thoroughfare = value;
        }

        /**
         * Gets the value of the postalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public String getPostalCode() {
            return postalCode;
        }

        /**
         * Sets the value of the postalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public void setPostalCode(String value) {
            this.postalCode = value;
        }

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public BigDecimal getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public void setLongitude(BigDecimal value) {
            this.longitude = value;
        }

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public BigDecimal getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public void setLatitude(BigDecimal value) {
            this.latitude = value;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                LocationStructure.Locality.Neighbourhood theNeighbourhood;
                theNeighbourhood = this.getNeighbourhood();
                strategy.appendField(locator, this, "neighbourhood", buffer, theNeighbourhood, (this.neighbourhood!= null));
            }
            {
                LocationStructure.Locality.Thoroughfare theThoroughfare;
                theThoroughfare = this.getThoroughfare();
                strategy.appendField(locator, this, "thoroughfare", buffer, theThoroughfare, (this.thoroughfare!= null));
            }
            {
                String thePostalCode;
                thePostalCode = this.getPostalCode();
                strategy.appendField(locator, this, "postalCode", buffer, thePostalCode, (this.postalCode!= null));
            }
            {
                BigDecimal theLongitude;
                theLongitude = this.getLongitude();
                strategy.appendField(locator, this, "longitude", buffer, theLongitude, (this.longitude!= null));
            }
            {
                BigDecimal theLatitude;
                theLatitude = this.getLatitude();
                strategy.appendField(locator, this, "latitude", buffer, theLatitude, (this.latitude!= null));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof LocationStructure.Locality) {
                final LocationStructure.Locality copy = ((LocationStructure.Locality) draftCopy);
                {
                    Boolean neighbourhoodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.neighbourhood!= null));
                    if (neighbourhoodShouldBeCopiedAndSet == Boolean.TRUE) {
                        LocationStructure.Locality.Neighbourhood sourceNeighbourhood;
                        sourceNeighbourhood = this.getNeighbourhood();
                        LocationStructure.Locality.Neighbourhood copyNeighbourhood = ((LocationStructure.Locality.Neighbourhood) strategy.copy(LocatorUtils.property(locator, "neighbourhood", sourceNeighbourhood), sourceNeighbourhood, (this.neighbourhood!= null)));
                        copy.setNeighbourhood(copyNeighbourhood);
                    } else {
                        if (neighbourhoodShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.neighbourhood = null;
                        }
                    }
                }
                {
                    Boolean thoroughfareShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thoroughfare!= null));
                    if (thoroughfareShouldBeCopiedAndSet == Boolean.TRUE) {
                        LocationStructure.Locality.Thoroughfare sourceThoroughfare;
                        sourceThoroughfare = this.getThoroughfare();
                        LocationStructure.Locality.Thoroughfare copyThoroughfare = ((LocationStructure.Locality.Thoroughfare) strategy.copy(LocatorUtils.property(locator, "thoroughfare", sourceThoroughfare), sourceThoroughfare, (this.thoroughfare!= null)));
                        copy.setThoroughfare(copyThoroughfare);
                    } else {
                        if (thoroughfareShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.thoroughfare = null;
                        }
                    }
                }
                {
                    Boolean postalCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.postalCode!= null));
                    if (postalCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourcePostalCode;
                        sourcePostalCode = this.getPostalCode();
                        String copyPostalCode = ((String) strategy.copy(LocatorUtils.property(locator, "postalCode", sourcePostalCode), sourcePostalCode, (this.postalCode!= null)));
                        copy.setPostalCode(copyPostalCode);
                    } else {
                        if (postalCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.postalCode = null;
                        }
                    }
                }
                {
                    Boolean longitudeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.longitude!= null));
                    if (longitudeShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigDecimal sourceLongitude;
                        sourceLongitude = this.getLongitude();
                        BigDecimal copyLongitude = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "longitude", sourceLongitude), sourceLongitude, (this.longitude!= null)));
                        copy.setLongitude(copyLongitude);
                    } else {
                        if (longitudeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.longitude = null;
                        }
                    }
                }
                {
                    Boolean latitudeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.latitude!= null));
                    if (latitudeShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigDecimal sourceLatitude;
                        sourceLatitude = this.getLatitude();
                        BigDecimal copyLatitude = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "latitude", sourceLatitude), sourceLatitude, (this.latitude!= null)));
                        copy.setLatitude(copyLatitude);
                    } else {
                        if (latitudeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.latitude = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new LocationStructure.Locality();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final LocationStructure.Locality that = ((LocationStructure.Locality) object);
            {
                LocationStructure.Locality.Neighbourhood lhsNeighbourhood;
                lhsNeighbourhood = this.getNeighbourhood();
                LocationStructure.Locality.Neighbourhood rhsNeighbourhood;
                rhsNeighbourhood = that.getNeighbourhood();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "neighbourhood", lhsNeighbourhood), LocatorUtils.property(thatLocator, "neighbourhood", rhsNeighbourhood), lhsNeighbourhood, rhsNeighbourhood, (this.neighbourhood!= null), (that.neighbourhood!= null))) {
                    return false;
                }
            }
            {
                LocationStructure.Locality.Thoroughfare lhsThoroughfare;
                lhsThoroughfare = this.getThoroughfare();
                LocationStructure.Locality.Thoroughfare rhsThoroughfare;
                rhsThoroughfare = that.getThoroughfare();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "thoroughfare", lhsThoroughfare), LocatorUtils.property(thatLocator, "thoroughfare", rhsThoroughfare), lhsThoroughfare, rhsThoroughfare, (this.thoroughfare!= null), (that.thoroughfare!= null))) {
                    return false;
                }
            }
            {
                String lhsPostalCode;
                lhsPostalCode = this.getPostalCode();
                String rhsPostalCode;
                rhsPostalCode = that.getPostalCode();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "postalCode", lhsPostalCode), LocatorUtils.property(thatLocator, "postalCode", rhsPostalCode), lhsPostalCode, rhsPostalCode, (this.postalCode!= null), (that.postalCode!= null))) {
                    return false;
                }
            }
            {
                BigDecimal lhsLongitude;
                lhsLongitude = this.getLongitude();
                BigDecimal rhsLongitude;
                rhsLongitude = that.getLongitude();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "longitude", lhsLongitude), LocatorUtils.property(thatLocator, "longitude", rhsLongitude), lhsLongitude, rhsLongitude, (this.longitude!= null), (that.longitude!= null))) {
                    return false;
                }
            }
            {
                BigDecimal lhsLatitude;
                lhsLatitude = this.getLatitude();
                BigDecimal rhsLatitude;
                rhsLatitude = that.getLatitude();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "latitude", lhsLatitude), LocatorUtils.property(thatLocator, "latitude", rhsLatitude), lhsLatitude, rhsLatitude, (this.latitude!= null), (that.latitude!= null))) {
                    return false;
                }
            }
            return true;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="type"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="district"/&gt;
         *             &lt;enumeration value="locality"/&gt;
         *             &lt;enumeration value="area"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public static class Neighbourhood implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
        {

            @XmlValue
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected String value;
            @XmlAttribute(name = "type")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType type;
            @XmlAttribute(name = "id")
            @XmlJavaTypeAdapter(Adapter2 .class)
            @XmlSchemaType(name = "positiveInteger")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected BigInteger id;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setType(LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType value) {
                this.type = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setId(BigInteger value) {
                this.id = value;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public String toString() {
                final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
                final StringBuilder buffer = new StringBuilder();
                append(null, buffer, strategy);
                return buffer.toString();
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                strategy.appendStart(locator, this, buffer);
                appendFields(locator, buffer, strategy);
                strategy.appendEnd(locator, this, buffer);
                return buffer;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                {
                    String theValue;
                    theValue = this.getValue();
                    strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
                }
                {
                    LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType theType;
                    theType = this.getType();
                    strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
                }
                {
                    BigInteger theId;
                    theId = this.getId();
                    strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
                }
                return buffer;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Object clone() {
                return copyTo(createNewInstance());
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Object copyTo(Object target) {
                final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
                return copyTo(null, target, strategy);
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                final Object draftCopy = ((target == null)?createNewInstance():target);
                if (draftCopy instanceof LocationStructure.Locality.Neighbourhood) {
                    final LocationStructure.Locality.Neighbourhood copy = ((LocationStructure.Locality.Neighbourhood) draftCopy);
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
                            LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType sourceType;
                            sourceType = this.getType();
                            LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType copyType = ((LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                            copy.setType(copyType);
                        } else {
                            if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.type = null;
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

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Object createNewInstance() {
                return new LocationStructure.Locality.Neighbourhood();
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final LocationStructure.Locality.Neighbourhood that = ((LocationStructure.Locality.Neighbourhood) object);
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
                    LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType lhsType;
                    lhsType = this.getType();
                    LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType rhsType;
                    rhsType = that.getType();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
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

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
             *     &lt;enumeration value="district"/&gt;
             *     &lt;enumeration value="locality"/&gt;
             *     &lt;enumeration value="area"/&gt;
             *   &lt;/restriction&gt;
             * &lt;/simpleType&gt;
             * </pre>
             * 
             */
            @XmlType(name = "")
            @XmlEnum
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public enum LocationNeighbourhoodType {

                @XmlEnumValue("district")
                DISTRICT("district"),
                @XmlEnumValue("locality")
                LOCALITY("locality"),
                @XmlEnumValue("area")
                AREA("area");
                private final String value;

                LocationNeighbourhoodType(String v) {
                    value = v;
                }

                public String value() {
                    return value;
                }

                public static LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType fromValue(String v) {
                    for (LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType c: LocationStructure.Locality.Neighbourhood.LocationNeighbourhoodType.values()) {
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
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="display"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;pattern value="yes|no"/&gt;
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public static class Thoroughfare implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
        {

            @XmlValue
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected String value;
            @XmlAttribute(name = "display")
            @XmlJavaTypeAdapter(Adapter20 .class)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Boolean display;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the display property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Boolean getDisplay() {
                return display;
            }

            /**
             * Sets the value of the display property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setDisplay(Boolean value) {
                this.display = value;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public String toString() {
                final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
                final StringBuilder buffer = new StringBuilder();
                append(null, buffer, strategy);
                return buffer.toString();
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                strategy.appendStart(locator, this, buffer);
                appendFields(locator, buffer, strategy);
                strategy.appendEnd(locator, this, buffer);
                return buffer;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                {
                    String theValue;
                    theValue = this.getValue();
                    strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
                }
                {
                    Boolean theDisplay;
                    theDisplay = this.getDisplay();
                    strategy.appendField(locator, this, "display", buffer, theDisplay, (this.display!= null));
                }
                return buffer;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Object clone() {
                return copyTo(createNewInstance());
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Object copyTo(Object target) {
                final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
                return copyTo(null, target, strategy);
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                final Object draftCopy = ((target == null)?createNewInstance():target);
                if (draftCopy instanceof LocationStructure.Locality.Thoroughfare) {
                    final LocationStructure.Locality.Thoroughfare copy = ((LocationStructure.Locality.Thoroughfare) draftCopy);
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
                        Boolean displayShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.display!= null));
                        if (displayShouldBeCopiedAndSet == Boolean.TRUE) {
                            Boolean sourceDisplay;
                            sourceDisplay = this.getDisplay();
                            Boolean copyDisplay = ((Boolean) strategy.copy(LocatorUtils.property(locator, "display", sourceDisplay), sourceDisplay, (this.display!= null)));
                            copy.setDisplay(copyDisplay);
                        } else {
                            if (displayShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.display = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Object createNewInstance() {
                return new LocationStructure.Locality.Thoroughfare();
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final LocationStructure.Locality.Thoroughfare that = ((LocationStructure.Locality.Thoroughfare) object);
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
                    Boolean lhsDisplay;
                    lhsDisplay = this.getDisplay();
                    Boolean rhsDisplay;
                    rhsDisplay = that.getDisplay();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "display", lhsDisplay), LocatorUtils.property(thatLocator, "display", rhsDisplay), lhsDisplay, rhsDisplay, (this.display!= null), (that.display!= null))) {
                        return false;
                    }
                }
                return true;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public boolean equals(Object object) {
                final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
                return equals(null, null, object, strategy);
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public static class SubAdministrativeArea implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlValue
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        protected String value;
        @XmlAttribute(name = "code")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        protected String code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public void setCode(String value) {
            this.code = value;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof LocationStructure.SubAdministrativeArea) {
                final LocationStructure.SubAdministrativeArea copy = ((LocationStructure.SubAdministrativeArea) draftCopy);
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

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new LocationStructure.SubAdministrativeArea();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final LocationStructure.SubAdministrativeArea that = ((LocationStructure.SubAdministrativeArea) object);
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

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
            return equals(null, null, object, strategy);
        }

    }

}
