
package org.openestate.io.casa_it.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;choice&gt;
 *         &lt;element name="realestateitems"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="realestate" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="address" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="city" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;length value="6"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="zone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="street" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="zip" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="description" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="value" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="20"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="building" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="age"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                           &lt;minInclusive value="-1"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="expenses"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                           &lt;minInclusive value="-1"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="units"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                           &lt;minInclusive value="-1"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="totalfloors"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                           &lt;minInclusive value="-1"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="haslift" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="price" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="value"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                           &lt;minInclusive value="-1"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="min" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                           &lt;minInclusive value="0"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="max" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                           &lt;minInclusive value="1"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="box" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="size"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                           &lt;minInclusive value="0"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="type"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                           &lt;enumeration value="-1"/&gt;
 *                                           &lt;enumeration value="0"/&gt;
 *                                           &lt;enumeration value="1"/&gt;
 *                                           &lt;enumeration value="2"/&gt;
 *                                           &lt;enumeration value="3"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="garden" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="size"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                           &lt;minInclusive value="0"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="type"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                           &lt;enumeration value="-1"/&gt;
 *                                           &lt;enumeration value="0"/&gt;
 *                                           &lt;enumeration value="1"/&gt;
 *                                           &lt;enumeration value="2"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="configuration" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="isaddressvisibleonsite" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                                     &lt;attribute name="ismapvisible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                                     &lt;attribute name="isrealestatevisibleonmap" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="googlemapcoordinate" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *                                     &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *                                     &lt;attribute name="mapzoom" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                     &lt;attribute name="latitudemapcenter" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *                                     &lt;attribute name="longitudemapcenter" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="images" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="advertismentimage" maxOccurs="14"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="imagetype" use="required"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;enumeration value="Image"/&gt;
 *                                                     &lt;enumeration value="Map"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="action" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                 &lt;enumeration value="0"/&gt;
 *                                 &lt;enumeration value="1"/&gt;
 *                                 &lt;enumeration value="2"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="agencycode" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                           &lt;attribute name="reference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="referenceID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                           &lt;attribute name="contracttype" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                 &lt;enumeration value="1"/&gt;
 *                                 &lt;enumeration value="2"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="condition"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                 &lt;enumeration value="-1"/&gt;
 *                                 &lt;enumeration value="1"/&gt;
 *                                 &lt;enumeration value="2"/&gt;
 *                                 &lt;enumeration value="3"/&gt;
 *                                 &lt;enumeration value="4"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="hasbalcony" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="hasterrace" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="heatingtype"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                 &lt;enumeration value="-1"/&gt;
 *                                 &lt;enumeration value="1"/&gt;
 *                                 &lt;enumeration value="2"/&gt;
 *                                 &lt;enumeration value="3"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="housetypology" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                 &lt;enumeration value="1"/&gt;
 *                                 &lt;enumeration value="3"/&gt;
 *                                 &lt;enumeration value="4"/&gt;
 *                                 &lt;enumeration value="5"/&gt;
 *                                 &lt;enumeration value="6"/&gt;
 *                                 &lt;enumeration value="7"/&gt;
 *                                 &lt;enumeration value="8"/&gt;
 *                                 &lt;enumeration value="9"/&gt;
 *                                 &lt;enumeration value="10"/&gt;
 *                                 &lt;enumeration value="11"/&gt;
 *                                 &lt;enumeration value="12"/&gt;
 *                                 &lt;enumeration value="13"/&gt;
 *                                 &lt;enumeration value="14"/&gt;
 *                                 &lt;enumeration value="15"/&gt;
 *                                 &lt;enumeration value="16"/&gt;
 *                                 &lt;enumeration value="17"/&gt;
 *                                 &lt;enumeration value="18"/&gt;
 *                                 &lt;enumeration value="19"/&gt;
 *                                 &lt;enumeration value="20"/&gt;
 *                                 &lt;enumeration value="21"/&gt;
 *                                 &lt;enumeration value="22"/&gt;
 *                                 &lt;enumeration value="23"/&gt;
 *                                 &lt;enumeration value="24"/&gt;
 *                                 &lt;enumeration value="26"/&gt;
 *                                 &lt;enumeration value="27"/&gt;
 *                                 &lt;enumeration value="28"/&gt;
 *                                 &lt;enumeration value="29"/&gt;
 *                                 &lt;enumeration value="30"/&gt;
 *                                 &lt;enumeration value="31"/&gt;
 *                                 &lt;enumeration value="32"/&gt;
 *                                 &lt;enumeration value="33"/&gt;
 *                                 &lt;enumeration value="34"/&gt;
 *                                 &lt;enumeration value="35"/&gt;
 *                                 &lt;enumeration value="36"/&gt;
 *                                 &lt;enumeration value="37"/&gt;
 *                                 &lt;enumeration value="38"/&gt;
 *                                 &lt;enumeration value="39"/&gt;
 *                                 &lt;enumeration value="40"/&gt;
 *                                 &lt;enumeration value="41"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="bathrooms"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                 &lt;minInclusive value="-1"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="floor"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                 &lt;enumeration value="-2"/&gt;
 *                                 &lt;enumeration value="-1"/&gt;
 *                                 &lt;enumeration value="0"/&gt;
 *                                 &lt;enumeration value="1"/&gt;
 *                                 &lt;enumeration value="2"/&gt;
 *                                 &lt;enumeration value="3"/&gt;
 *                                 &lt;enumeration value="4"/&gt;
 *                                 &lt;enumeration value="5"/&gt;
 *                                 &lt;enumeration value="6"/&gt;
 *                                 &lt;enumeration value="7"/&gt;
 *                                 &lt;enumeration value="8"/&gt;
 *                                 &lt;enumeration value="9"/&gt;
 *                                 &lt;enumeration value="10"/&gt;
 *                                 &lt;enumeration value="11"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="rooms"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                 &lt;minInclusive value="-1"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="occupationstate"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                 &lt;enumeration value="-1"/&gt;
 *                                 &lt;enumeration value="1"/&gt;
 *                                 &lt;enumeration value="2"/&gt;
 *                                 &lt;enumeration value="3"/&gt;
 *                                 &lt;enumeration value="4"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="realestatetype" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                 &lt;enumeration value="1"/&gt;
 *                                 &lt;enumeration value="2"/&gt;
 *                                 &lt;enumeration value="4"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "realestateitems"
})
@XmlRootElement(name = "container")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
public class Container implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
    protected Container.Realestateitems realestateitems;

    /**
     * Gets the value of the realestateitems property.
     * 
     * @return
     *     possible object is
     *     {@link Container.Realestateitems }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
    public Container.Realestateitems getRealestateitems() {
        return realestateitems;
    }

    /**
     * Sets the value of the realestateitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Container.Realestateitems }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
    public void setRealestateitems(Container.Realestateitems value) {
        this.realestateitems = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Container.Realestateitems theRealestateitems;
            theRealestateitems = this.getRealestateitems();
            strategy.appendField(locator, this, "realestateitems", buffer, theRealestateitems, (this.realestateitems!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Container) {
            final Container copy = ((Container) draftCopy);
            {
                Boolean realestateitemsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realestateitems!= null));
                if (realestateitemsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Container.Realestateitems sourceRealestateitems;
                    sourceRealestateitems = this.getRealestateitems();
                    Container.Realestateitems copyRealestateitems = ((Container.Realestateitems) strategy.copy(LocatorUtils.property(locator, "realestateitems", sourceRealestateitems), sourceRealestateitems, (this.realestateitems!= null)));
                    copy.setRealestateitems(copyRealestateitems);
                } else {
                    if (realestateitemsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realestateitems = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Container();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Container that = ((Container) object);
        {
            Container.Realestateitems lhsRealestateitems;
            lhsRealestateitems = this.getRealestateitems();
            Container.Realestateitems rhsRealestateitems;
            rhsRealestateitems = that.getRealestateitems();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realestateitems", lhsRealestateitems), LocatorUtils.property(thatLocator, "realestateitems", rhsRealestateitems), lhsRealestateitems, rhsRealestateitems, (this.realestateitems!= null), (that.realestateitems!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
     *         &lt;element name="realestate" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="address" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="city" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;length value="6"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="zone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="street" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="zip" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="description" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="value" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="20"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="building" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="age"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                 &lt;minInclusive value="-1"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="expenses"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                 &lt;minInclusive value="-1"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="units"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                 &lt;minInclusive value="-1"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="totalfloors"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                 &lt;minInclusive value="-1"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="haslift" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="price" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="value"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                 &lt;minInclusive value="-1"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="min" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                 &lt;minInclusive value="0"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="max" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                 &lt;minInclusive value="1"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="box" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="size"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                 &lt;minInclusive value="0"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="type"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                 &lt;enumeration value="-1"/&gt;
     *                                 &lt;enumeration value="0"/&gt;
     *                                 &lt;enumeration value="1"/&gt;
     *                                 &lt;enumeration value="2"/&gt;
     *                                 &lt;enumeration value="3"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="garden" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="size"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                 &lt;minInclusive value="0"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="type"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                 &lt;enumeration value="-1"/&gt;
     *                                 &lt;enumeration value="0"/&gt;
     *                                 &lt;enumeration value="1"/&gt;
     *                                 &lt;enumeration value="2"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="configuration" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="isaddressvisibleonsite" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *                           &lt;attribute name="ismapvisible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *                           &lt;attribute name="isrealestatevisibleonmap" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="googlemapcoordinate" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
     *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
     *                           &lt;attribute name="mapzoom" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="latitudemapcenter" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
     *                           &lt;attribute name="longitudemapcenter" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="images" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="advertismentimage" maxOccurs="14"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="imagetype" use="required"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;enumeration value="Image"/&gt;
     *                                           &lt;enumeration value="Map"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="action" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                       &lt;enumeration value="0"/&gt;
     *                       &lt;enumeration value="1"/&gt;
     *                       &lt;enumeration value="2"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="agencycode" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                 &lt;attribute name="reference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="referenceID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                 &lt;attribute name="contracttype" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                       &lt;enumeration value="1"/&gt;
     *                       &lt;enumeration value="2"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="condition"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                       &lt;enumeration value="-1"/&gt;
     *                       &lt;enumeration value="1"/&gt;
     *                       &lt;enumeration value="2"/&gt;
     *                       &lt;enumeration value="3"/&gt;
     *                       &lt;enumeration value="4"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="hasbalcony" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="hasterrace" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="heatingtype"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                       &lt;enumeration value="-1"/&gt;
     *                       &lt;enumeration value="1"/&gt;
     *                       &lt;enumeration value="2"/&gt;
     *                       &lt;enumeration value="3"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="housetypology" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                       &lt;enumeration value="1"/&gt;
     *                       &lt;enumeration value="3"/&gt;
     *                       &lt;enumeration value="4"/&gt;
     *                       &lt;enumeration value="5"/&gt;
     *                       &lt;enumeration value="6"/&gt;
     *                       &lt;enumeration value="7"/&gt;
     *                       &lt;enumeration value="8"/&gt;
     *                       &lt;enumeration value="9"/&gt;
     *                       &lt;enumeration value="10"/&gt;
     *                       &lt;enumeration value="11"/&gt;
     *                       &lt;enumeration value="12"/&gt;
     *                       &lt;enumeration value="13"/&gt;
     *                       &lt;enumeration value="14"/&gt;
     *                       &lt;enumeration value="15"/&gt;
     *                       &lt;enumeration value="16"/&gt;
     *                       &lt;enumeration value="17"/&gt;
     *                       &lt;enumeration value="18"/&gt;
     *                       &lt;enumeration value="19"/&gt;
     *                       &lt;enumeration value="20"/&gt;
     *                       &lt;enumeration value="21"/&gt;
     *                       &lt;enumeration value="22"/&gt;
     *                       &lt;enumeration value="23"/&gt;
     *                       &lt;enumeration value="24"/&gt;
     *                       &lt;enumeration value="26"/&gt;
     *                       &lt;enumeration value="27"/&gt;
     *                       &lt;enumeration value="28"/&gt;
     *                       &lt;enumeration value="29"/&gt;
     *                       &lt;enumeration value="30"/&gt;
     *                       &lt;enumeration value="31"/&gt;
     *                       &lt;enumeration value="32"/&gt;
     *                       &lt;enumeration value="33"/&gt;
     *                       &lt;enumeration value="34"/&gt;
     *                       &lt;enumeration value="35"/&gt;
     *                       &lt;enumeration value="36"/&gt;
     *                       &lt;enumeration value="37"/&gt;
     *                       &lt;enumeration value="38"/&gt;
     *                       &lt;enumeration value="39"/&gt;
     *                       &lt;enumeration value="40"/&gt;
     *                       &lt;enumeration value="41"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="bathrooms"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                       &lt;minInclusive value="-1"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="floor"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                       &lt;enumeration value="-2"/&gt;
     *                       &lt;enumeration value="-1"/&gt;
     *                       &lt;enumeration value="0"/&gt;
     *                       &lt;enumeration value="1"/&gt;
     *                       &lt;enumeration value="2"/&gt;
     *                       &lt;enumeration value="3"/&gt;
     *                       &lt;enumeration value="4"/&gt;
     *                       &lt;enumeration value="5"/&gt;
     *                       &lt;enumeration value="6"/&gt;
     *                       &lt;enumeration value="7"/&gt;
     *                       &lt;enumeration value="8"/&gt;
     *                       &lt;enumeration value="9"/&gt;
     *                       &lt;enumeration value="10"/&gt;
     *                       &lt;enumeration value="11"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="rooms"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                       &lt;minInclusive value="-1"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="occupationstate"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                       &lt;enumeration value="-1"/&gt;
     *                       &lt;enumeration value="1"/&gt;
     *                       &lt;enumeration value="2"/&gt;
     *                       &lt;enumeration value="3"/&gt;
     *                       &lt;enumeration value="4"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="realestatetype" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                       &lt;enumeration value="1"/&gt;
     *                       &lt;enumeration value="2"/&gt;
     *                       &lt;enumeration value="4"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
        "realestate"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
    public static class Realestateitems implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
        protected List<Container.Realestateitems.Realestate> realestate;

        /**
         * Gets the value of the realestate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the realestate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRealestate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Container.Realestateitems.Realestate }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
        public List<Container.Realestateitems.Realestate> getRealestate() {
            if (realestate == null) {
                realestate = new ArrayList<Container.Realestateitems.Realestate>();
            }
            return this.realestate;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                List<Container.Realestateitems.Realestate> theRealestate;
                theRealestate = (((this.realestate!= null)&&(!this.realestate.isEmpty()))?this.getRealestate():null);
                strategy.appendField(locator, this, "realestate", buffer, theRealestate, ((this.realestate!= null)&&(!this.realestate.isEmpty())));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof Container.Realestateitems) {
                final Container.Realestateitems copy = ((Container.Realestateitems) draftCopy);
                {
                    Boolean realestateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.realestate!= null)&&(!this.realestate.isEmpty())));
                    if (realestateShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<Container.Realestateitems.Realestate> sourceRealestate;
                        sourceRealestate = (((this.realestate!= null)&&(!this.realestate.isEmpty()))?this.getRealestate():null);
                        @SuppressWarnings("unchecked")
                        List<Container.Realestateitems.Realestate> copyRealestate = ((List<Container.Realestateitems.Realestate> ) strategy.copy(LocatorUtils.property(locator, "realestate", sourceRealestate), sourceRealestate, ((this.realestate!= null)&&(!this.realestate.isEmpty()))));
                        copy.realestate = null;
                        if (copyRealestate!= null) {
                            List<Container.Realestateitems.Realestate> uniqueRealestatel = copy.getRealestate();
                            uniqueRealestatel.addAll(copyRealestate);
                        }
                    } else {
                        if (realestateShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.realestate = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new Container.Realestateitems();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Container.Realestateitems that = ((Container.Realestateitems) object);
            {
                List<Container.Realestateitems.Realestate> lhsRealestate;
                lhsRealestate = (((this.realestate!= null)&&(!this.realestate.isEmpty()))?this.getRealestate():null);
                List<Container.Realestateitems.Realestate> rhsRealestate;
                rhsRealestate = (((that.realestate!= null)&&(!that.realestate.isEmpty()))?that.getRealestate():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "realestate", lhsRealestate), LocatorUtils.property(thatLocator, "realestate", rhsRealestate), lhsRealestate, rhsRealestate, ((this.realestate!= null)&&(!this.realestate.isEmpty())), ((that.realestate!= null)&&(!that.realestate.isEmpty())))) {
                    return false;
                }
            }
            return true;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
         *         &lt;element name="address" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="city" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;length value="6"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="zone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="street" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="zip" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="description" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="value" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="20"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="building" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="age"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                       &lt;minInclusive value="-1"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="expenses"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                       &lt;minInclusive value="-1"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="units"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                       &lt;minInclusive value="-1"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="totalfloors"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                       &lt;minInclusive value="-1"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="haslift" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="price" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="value"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                       &lt;minInclusive value="-1"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="min" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                       &lt;minInclusive value="0"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="max" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                       &lt;minInclusive value="1"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="box" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="size"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                       &lt;minInclusive value="0"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="type"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                       &lt;enumeration value="-1"/&gt;
         *                       &lt;enumeration value="0"/&gt;
         *                       &lt;enumeration value="1"/&gt;
         *                       &lt;enumeration value="2"/&gt;
         *                       &lt;enumeration value="3"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="garden" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="size"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                       &lt;minInclusive value="0"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="type"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                       &lt;enumeration value="-1"/&gt;
         *                       &lt;enumeration value="0"/&gt;
         *                       &lt;enumeration value="1"/&gt;
         *                       &lt;enumeration value="2"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="configuration" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="isaddressvisibleonsite" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
         *                 &lt;attribute name="ismapvisible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
         *                 &lt;attribute name="isrealestatevisibleonmap" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="googlemapcoordinate" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
         *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
         *                 &lt;attribute name="mapzoom" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="latitudemapcenter" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
         *                 &lt;attribute name="longitudemapcenter" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="images" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="advertismentimage" maxOccurs="14"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="imagetype" use="required"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;enumeration value="Image"/&gt;
         *                                 &lt;enumeration value="Map"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="action" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *             &lt;enumeration value="0"/&gt;
         *             &lt;enumeration value="1"/&gt;
         *             &lt;enumeration value="2"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="agencycode" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *       &lt;attribute name="reference" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="referenceID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *       &lt;attribute name="contracttype" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *             &lt;enumeration value="1"/&gt;
         *             &lt;enumeration value="2"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="condition"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *             &lt;enumeration value="-1"/&gt;
         *             &lt;enumeration value="1"/&gt;
         *             &lt;enumeration value="2"/&gt;
         *             &lt;enumeration value="3"/&gt;
         *             &lt;enumeration value="4"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="hasbalcony" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="hasterrace" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="heatingtype"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *             &lt;enumeration value="-1"/&gt;
         *             &lt;enumeration value="1"/&gt;
         *             &lt;enumeration value="2"/&gt;
         *             &lt;enumeration value="3"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="housetypology" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *             &lt;enumeration value="1"/&gt;
         *             &lt;enumeration value="3"/&gt;
         *             &lt;enumeration value="4"/&gt;
         *             &lt;enumeration value="5"/&gt;
         *             &lt;enumeration value="6"/&gt;
         *             &lt;enumeration value="7"/&gt;
         *             &lt;enumeration value="8"/&gt;
         *             &lt;enumeration value="9"/&gt;
         *             &lt;enumeration value="10"/&gt;
         *             &lt;enumeration value="11"/&gt;
         *             &lt;enumeration value="12"/&gt;
         *             &lt;enumeration value="13"/&gt;
         *             &lt;enumeration value="14"/&gt;
         *             &lt;enumeration value="15"/&gt;
         *             &lt;enumeration value="16"/&gt;
         *             &lt;enumeration value="17"/&gt;
         *             &lt;enumeration value="18"/&gt;
         *             &lt;enumeration value="19"/&gt;
         *             &lt;enumeration value="20"/&gt;
         *             &lt;enumeration value="21"/&gt;
         *             &lt;enumeration value="22"/&gt;
         *             &lt;enumeration value="23"/&gt;
         *             &lt;enumeration value="24"/&gt;
         *             &lt;enumeration value="26"/&gt;
         *             &lt;enumeration value="27"/&gt;
         *             &lt;enumeration value="28"/&gt;
         *             &lt;enumeration value="29"/&gt;
         *             &lt;enumeration value="30"/&gt;
         *             &lt;enumeration value="31"/&gt;
         *             &lt;enumeration value="32"/&gt;
         *             &lt;enumeration value="33"/&gt;
         *             &lt;enumeration value="34"/&gt;
         *             &lt;enumeration value="35"/&gt;
         *             &lt;enumeration value="36"/&gt;
         *             &lt;enumeration value="37"/&gt;
         *             &lt;enumeration value="38"/&gt;
         *             &lt;enumeration value="39"/&gt;
         *             &lt;enumeration value="40"/&gt;
         *             &lt;enumeration value="41"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="bathrooms"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *             &lt;minInclusive value="-1"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="floor"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *             &lt;enumeration value="-2"/&gt;
         *             &lt;enumeration value="-1"/&gt;
         *             &lt;enumeration value="0"/&gt;
         *             &lt;enumeration value="1"/&gt;
         *             &lt;enumeration value="2"/&gt;
         *             &lt;enumeration value="3"/&gt;
         *             &lt;enumeration value="4"/&gt;
         *             &lt;enumeration value="5"/&gt;
         *             &lt;enumeration value="6"/&gt;
         *             &lt;enumeration value="7"/&gt;
         *             &lt;enumeration value="8"/&gt;
         *             &lt;enumeration value="9"/&gt;
         *             &lt;enumeration value="10"/&gt;
         *             &lt;enumeration value="11"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="rooms"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *             &lt;minInclusive value="-1"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="occupationstate"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *             &lt;enumeration value="-1"/&gt;
         *             &lt;enumeration value="1"/&gt;
         *             &lt;enumeration value="2"/&gt;
         *             &lt;enumeration value="3"/&gt;
         *             &lt;enumeration value="4"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="realestatetype" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *             &lt;enumeration value="1"/&gt;
         *             &lt;enumeration value="2"/&gt;
         *             &lt;enumeration value="4"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "address",
            "description",
            "building",
            "price",
            "box",
            "garden",
            "configuration",
            "googlemapcoordinate",
            "images"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
        public static class Realestate implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
        {

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected Container.Realestateitems.Realestate.Address address;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected Container.Realestateitems.Realestate.Description description;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected Container.Realestateitems.Realestate.Building building;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected Container.Realestateitems.Realestate.Price price;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected Container.Realestateitems.Realestate.Box box;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected Container.Realestateitems.Realestate.Garden garden;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected Container.Realestateitems.Realestate.Configuration configuration;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected Container.Realestateitems.Realestate.Googlemapcoordinate googlemapcoordinate;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected Container.Realestateitems.Realestate.Images images;
            @XmlAttribute(name = "action", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected BigInteger action;
            @XmlAttribute(name = "agencycode", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected int agencycode;
            @XmlAttribute(name = "reference", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected String reference;
            @XmlAttribute(name = "referenceID")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected Integer referenceID;
            @XmlAttribute(name = "contracttype", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected BigInteger contracttype;
            @XmlAttribute(name = "condition")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected BigInteger condition;
            @XmlAttribute(name = "hasbalcony")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected Boolean hasbalcony;
            @XmlAttribute(name = "hasterrace")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected Boolean hasterrace;
            @XmlAttribute(name = "heatingtype")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected BigInteger heatingtype;
            @XmlAttribute(name = "housetypology", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected BigInteger housetypology;
            @XmlAttribute(name = "bathrooms")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected BigInteger bathrooms;
            @XmlAttribute(name = "floor")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected BigInteger floor;
            @XmlAttribute(name = "rooms")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected BigInteger rooms;
            @XmlAttribute(name = "occupationstate")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected BigInteger occupationstate;
            @XmlAttribute(name = "realestatetype", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected BigInteger realestatetype;
            @XmlAttribute(name = "size", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            protected BigInteger size;

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link Container.Realestateitems.Realestate.Address }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Container.Realestateitems.Realestate.Address getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link Container.Realestateitems.Realestate.Address }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setAddress(Container.Realestateitems.Realestate.Address value) {
                this.address = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link Container.Realestateitems.Realestate.Description }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Container.Realestateitems.Realestate.Description getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link Container.Realestateitems.Realestate.Description }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setDescription(Container.Realestateitems.Realestate.Description value) {
                this.description = value;
            }

            /**
             * Gets the value of the building property.
             * 
             * @return
             *     possible object is
             *     {@link Container.Realestateitems.Realestate.Building }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Container.Realestateitems.Realestate.Building getBuilding() {
                return building;
            }

            /**
             * Sets the value of the building property.
             * 
             * @param value
             *     allowed object is
             *     {@link Container.Realestateitems.Realestate.Building }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setBuilding(Container.Realestateitems.Realestate.Building value) {
                this.building = value;
            }

            /**
             * Gets the value of the price property.
             * 
             * @return
             *     possible object is
             *     {@link Container.Realestateitems.Realestate.Price }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Container.Realestateitems.Realestate.Price getPrice() {
                return price;
            }

            /**
             * Sets the value of the price property.
             * 
             * @param value
             *     allowed object is
             *     {@link Container.Realestateitems.Realestate.Price }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setPrice(Container.Realestateitems.Realestate.Price value) {
                this.price = value;
            }

            /**
             * Gets the value of the box property.
             * 
             * @return
             *     possible object is
             *     {@link Container.Realestateitems.Realestate.Box }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Container.Realestateitems.Realestate.Box getBox() {
                return box;
            }

            /**
             * Sets the value of the box property.
             * 
             * @param value
             *     allowed object is
             *     {@link Container.Realestateitems.Realestate.Box }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setBox(Container.Realestateitems.Realestate.Box value) {
                this.box = value;
            }

            /**
             * Gets the value of the garden property.
             * 
             * @return
             *     possible object is
             *     {@link Container.Realestateitems.Realestate.Garden }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Container.Realestateitems.Realestate.Garden getGarden() {
                return garden;
            }

            /**
             * Sets the value of the garden property.
             * 
             * @param value
             *     allowed object is
             *     {@link Container.Realestateitems.Realestate.Garden }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setGarden(Container.Realestateitems.Realestate.Garden value) {
                this.garden = value;
            }

            /**
             * Gets the value of the configuration property.
             * 
             * @return
             *     possible object is
             *     {@link Container.Realestateitems.Realestate.Configuration }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Container.Realestateitems.Realestate.Configuration getConfiguration() {
                return configuration;
            }

            /**
             * Sets the value of the configuration property.
             * 
             * @param value
             *     allowed object is
             *     {@link Container.Realestateitems.Realestate.Configuration }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setConfiguration(Container.Realestateitems.Realestate.Configuration value) {
                this.configuration = value;
            }

            /**
             * Gets the value of the googlemapcoordinate property.
             * 
             * @return
             *     possible object is
             *     {@link Container.Realestateitems.Realestate.Googlemapcoordinate }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Container.Realestateitems.Realestate.Googlemapcoordinate getGooglemapcoordinate() {
                return googlemapcoordinate;
            }

            /**
             * Sets the value of the googlemapcoordinate property.
             * 
             * @param value
             *     allowed object is
             *     {@link Container.Realestateitems.Realestate.Googlemapcoordinate }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setGooglemapcoordinate(Container.Realestateitems.Realestate.Googlemapcoordinate value) {
                this.googlemapcoordinate = value;
            }

            /**
             * Gets the value of the images property.
             * 
             * @return
             *     possible object is
             *     {@link Container.Realestateitems.Realestate.Images }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Container.Realestateitems.Realestate.Images getImages() {
                return images;
            }

            /**
             * Sets the value of the images property.
             * 
             * @param value
             *     allowed object is
             *     {@link Container.Realestateitems.Realestate.Images }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setImages(Container.Realestateitems.Realestate.Images value) {
                this.images = value;
            }

            /**
             * Gets the value of the action property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public BigInteger getAction() {
                return action;
            }

            /**
             * Sets the value of the action property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setAction(BigInteger value) {
                this.action = value;
            }

            /**
             * Gets the value of the agencycode property.
             * 
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public int getAgencycode() {
                return agencycode;
            }

            /**
             * Sets the value of the agencycode property.
             * 
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setAgencycode(int value) {
                this.agencycode = value;
            }

            /**
             * Gets the value of the reference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public String getReference() {
                return reference;
            }

            /**
             * Sets the value of the reference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setReference(String value) {
                this.reference = value;
            }

            /**
             * Gets the value of the referenceID property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Integer getReferenceID() {
                return referenceID;
            }

            /**
             * Sets the value of the referenceID property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setReferenceID(Integer value) {
                this.referenceID = value;
            }

            /**
             * Gets the value of the contracttype property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public BigInteger getContracttype() {
                return contracttype;
            }

            /**
             * Sets the value of the contracttype property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setContracttype(BigInteger value) {
                this.contracttype = value;
            }

            /**
             * Gets the value of the condition property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public BigInteger getCondition() {
                return condition;
            }

            /**
             * Sets the value of the condition property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setCondition(BigInteger value) {
                this.condition = value;
            }

            /**
             * Gets the value of the hasbalcony property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Boolean getHasbalcony() {
                return hasbalcony;
            }

            /**
             * Sets the value of the hasbalcony property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setHasbalcony(Boolean value) {
                this.hasbalcony = value;
            }

            /**
             * Gets the value of the hasterrace property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Boolean getHasterrace() {
                return hasterrace;
            }

            /**
             * Sets the value of the hasterrace property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setHasterrace(Boolean value) {
                this.hasterrace = value;
            }

            /**
             * Gets the value of the heatingtype property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public BigInteger getHeatingtype() {
                return heatingtype;
            }

            /**
             * Sets the value of the heatingtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setHeatingtype(BigInteger value) {
                this.heatingtype = value;
            }

            /**
             * Gets the value of the housetypology property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public BigInteger getHousetypology() {
                return housetypology;
            }

            /**
             * Sets the value of the housetypology property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setHousetypology(BigInteger value) {
                this.housetypology = value;
            }

            /**
             * Gets the value of the bathrooms property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public BigInteger getBathrooms() {
                return bathrooms;
            }

            /**
             * Sets the value of the bathrooms property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setBathrooms(BigInteger value) {
                this.bathrooms = value;
            }

            /**
             * Gets the value of the floor property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public BigInteger getFloor() {
                return floor;
            }

            /**
             * Sets the value of the floor property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setFloor(BigInteger value) {
                this.floor = value;
            }

            /**
             * Gets the value of the rooms property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public BigInteger getRooms() {
                return rooms;
            }

            /**
             * Sets the value of the rooms property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setRooms(BigInteger value) {
                this.rooms = value;
            }

            /**
             * Gets the value of the occupationstate property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public BigInteger getOccupationstate() {
                return occupationstate;
            }

            /**
             * Sets the value of the occupationstate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setOccupationstate(BigInteger value) {
                this.occupationstate = value;
            }

            /**
             * Gets the value of the realestatetype property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public BigInteger getRealestatetype() {
                return realestatetype;
            }

            /**
             * Sets the value of the realestatetype property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setRealestatetype(BigInteger value) {
                this.realestatetype = value;
            }

            /**
             * Gets the value of the size property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public BigInteger getSize() {
                return size;
            }

            /**
             * Sets the value of the size property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public void setSize(BigInteger value) {
                this.size = value;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public String toString() {
                final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                final StringBuilder buffer = new StringBuilder();
                append(null, buffer, strategy);
                return buffer.toString();
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                strategy.appendStart(locator, this, buffer);
                appendFields(locator, buffer, strategy);
                strategy.appendEnd(locator, this, buffer);
                return buffer;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                {
                    Container.Realestateitems.Realestate.Address theAddress;
                    theAddress = this.getAddress();
                    strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
                }
                {
                    Container.Realestateitems.Realestate.Description theDescription;
                    theDescription = this.getDescription();
                    strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
                }
                {
                    Container.Realestateitems.Realestate.Building theBuilding;
                    theBuilding = this.getBuilding();
                    strategy.appendField(locator, this, "building", buffer, theBuilding, (this.building!= null));
                }
                {
                    Container.Realestateitems.Realestate.Price thePrice;
                    thePrice = this.getPrice();
                    strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
                }
                {
                    Container.Realestateitems.Realestate.Box theBox;
                    theBox = this.getBox();
                    strategy.appendField(locator, this, "box", buffer, theBox, (this.box!= null));
                }
                {
                    Container.Realestateitems.Realestate.Garden theGarden;
                    theGarden = this.getGarden();
                    strategy.appendField(locator, this, "garden", buffer, theGarden, (this.garden!= null));
                }
                {
                    Container.Realestateitems.Realestate.Configuration theConfiguration;
                    theConfiguration = this.getConfiguration();
                    strategy.appendField(locator, this, "configuration", buffer, theConfiguration, (this.configuration!= null));
                }
                {
                    Container.Realestateitems.Realestate.Googlemapcoordinate theGooglemapcoordinate;
                    theGooglemapcoordinate = this.getGooglemapcoordinate();
                    strategy.appendField(locator, this, "googlemapcoordinate", buffer, theGooglemapcoordinate, (this.googlemapcoordinate!= null));
                }
                {
                    Container.Realestateitems.Realestate.Images theImages;
                    theImages = this.getImages();
                    strategy.appendField(locator, this, "images", buffer, theImages, (this.images!= null));
                }
                {
                    BigInteger theAction;
                    theAction = this.getAction();
                    strategy.appendField(locator, this, "action", buffer, theAction, (this.action!= null));
                }
                {
                    int theAgencycode;
                    theAgencycode = this.getAgencycode();
                    strategy.appendField(locator, this, "agencycode", buffer, theAgencycode, true);
                }
                {
                    String theReference;
                    theReference = this.getReference();
                    strategy.appendField(locator, this, "reference", buffer, theReference, (this.reference!= null));
                }
                {
                    Integer theReferenceID;
                    theReferenceID = this.getReferenceID();
                    strategy.appendField(locator, this, "referenceID", buffer, theReferenceID, (this.referenceID!= null));
                }
                {
                    BigInteger theContracttype;
                    theContracttype = this.getContracttype();
                    strategy.appendField(locator, this, "contracttype", buffer, theContracttype, (this.contracttype!= null));
                }
                {
                    BigInteger theCondition;
                    theCondition = this.getCondition();
                    strategy.appendField(locator, this, "condition", buffer, theCondition, (this.condition!= null));
                }
                {
                    Boolean theHasbalcony;
                    theHasbalcony = this.getHasbalcony();
                    strategy.appendField(locator, this, "hasbalcony", buffer, theHasbalcony, (this.hasbalcony!= null));
                }
                {
                    Boolean theHasterrace;
                    theHasterrace = this.getHasterrace();
                    strategy.appendField(locator, this, "hasterrace", buffer, theHasterrace, (this.hasterrace!= null));
                }
                {
                    BigInteger theHeatingtype;
                    theHeatingtype = this.getHeatingtype();
                    strategy.appendField(locator, this, "heatingtype", buffer, theHeatingtype, (this.heatingtype!= null));
                }
                {
                    BigInteger theHousetypology;
                    theHousetypology = this.getHousetypology();
                    strategy.appendField(locator, this, "housetypology", buffer, theHousetypology, (this.housetypology!= null));
                }
                {
                    BigInteger theBathrooms;
                    theBathrooms = this.getBathrooms();
                    strategy.appendField(locator, this, "bathrooms", buffer, theBathrooms, (this.bathrooms!= null));
                }
                {
                    BigInteger theFloor;
                    theFloor = this.getFloor();
                    strategy.appendField(locator, this, "floor", buffer, theFloor, (this.floor!= null));
                }
                {
                    BigInteger theRooms;
                    theRooms = this.getRooms();
                    strategy.appendField(locator, this, "rooms", buffer, theRooms, (this.rooms!= null));
                }
                {
                    BigInteger theOccupationstate;
                    theOccupationstate = this.getOccupationstate();
                    strategy.appendField(locator, this, "occupationstate", buffer, theOccupationstate, (this.occupationstate!= null));
                }
                {
                    BigInteger theRealestatetype;
                    theRealestatetype = this.getRealestatetype();
                    strategy.appendField(locator, this, "realestatetype", buffer, theRealestatetype, (this.realestatetype!= null));
                }
                {
                    BigInteger theSize;
                    theSize = this.getSize();
                    strategy.appendField(locator, this, "size", buffer, theSize, (this.size!= null));
                }
                return buffer;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Object clone() {
                return copyTo(createNewInstance());
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Object copyTo(Object target) {
                final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                return copyTo(null, target, strategy);
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                final Object draftCopy = ((target == null)?createNewInstance():target);
                if (draftCopy instanceof Container.Realestateitems.Realestate) {
                    final Container.Realestateitems.Realestate copy = ((Container.Realestateitems.Realestate) draftCopy);
                    {
                        Boolean addressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.address!= null));
                        if (addressShouldBeCopiedAndSet == Boolean.TRUE) {
                            Container.Realestateitems.Realestate.Address sourceAddress;
                            sourceAddress = this.getAddress();
                            Container.Realestateitems.Realestate.Address copyAddress = ((Container.Realestateitems.Realestate.Address) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress, (this.address!= null)));
                            copy.setAddress(copyAddress);
                        } else {
                            if (addressShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.address = null;
                            }
                        }
                    }
                    {
                        Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.description!= null));
                        if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                            Container.Realestateitems.Realestate.Description sourceDescription;
                            sourceDescription = this.getDescription();
                            Container.Realestateitems.Realestate.Description copyDescription = ((Container.Realestateitems.Realestate.Description) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
                            copy.setDescription(copyDescription);
                        } else {
                            if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.description = null;
                            }
                        }
                    }
                    {
                        Boolean buildingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.building!= null));
                        if (buildingShouldBeCopiedAndSet == Boolean.TRUE) {
                            Container.Realestateitems.Realestate.Building sourceBuilding;
                            sourceBuilding = this.getBuilding();
                            Container.Realestateitems.Realestate.Building copyBuilding = ((Container.Realestateitems.Realestate.Building) strategy.copy(LocatorUtils.property(locator, "building", sourceBuilding), sourceBuilding, (this.building!= null)));
                            copy.setBuilding(copyBuilding);
                        } else {
                            if (buildingShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.building = null;
                            }
                        }
                    }
                    {
                        Boolean priceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.price!= null));
                        if (priceShouldBeCopiedAndSet == Boolean.TRUE) {
                            Container.Realestateitems.Realestate.Price sourcePrice;
                            sourcePrice = this.getPrice();
                            Container.Realestateitems.Realestate.Price copyPrice = ((Container.Realestateitems.Realestate.Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice, (this.price!= null)));
                            copy.setPrice(copyPrice);
                        } else {
                            if (priceShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.price = null;
                            }
                        }
                    }
                    {
                        Boolean boxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.box!= null));
                        if (boxShouldBeCopiedAndSet == Boolean.TRUE) {
                            Container.Realestateitems.Realestate.Box sourceBox;
                            sourceBox = this.getBox();
                            Container.Realestateitems.Realestate.Box copyBox = ((Container.Realestateitems.Realestate.Box) strategy.copy(LocatorUtils.property(locator, "box", sourceBox), sourceBox, (this.box!= null)));
                            copy.setBox(copyBox);
                        } else {
                            if (boxShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.box = null;
                            }
                        }
                    }
                    {
                        Boolean gardenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garden!= null));
                        if (gardenShouldBeCopiedAndSet == Boolean.TRUE) {
                            Container.Realestateitems.Realestate.Garden sourceGarden;
                            sourceGarden = this.getGarden();
                            Container.Realestateitems.Realestate.Garden copyGarden = ((Container.Realestateitems.Realestate.Garden) strategy.copy(LocatorUtils.property(locator, "garden", sourceGarden), sourceGarden, (this.garden!= null)));
                            copy.setGarden(copyGarden);
                        } else {
                            if (gardenShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.garden = null;
                            }
                        }
                    }
                    {
                        Boolean configurationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.configuration!= null));
                        if (configurationShouldBeCopiedAndSet == Boolean.TRUE) {
                            Container.Realestateitems.Realestate.Configuration sourceConfiguration;
                            sourceConfiguration = this.getConfiguration();
                            Container.Realestateitems.Realestate.Configuration copyConfiguration = ((Container.Realestateitems.Realestate.Configuration) strategy.copy(LocatorUtils.property(locator, "configuration", sourceConfiguration), sourceConfiguration, (this.configuration!= null)));
                            copy.setConfiguration(copyConfiguration);
                        } else {
                            if (configurationShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.configuration = null;
                            }
                        }
                    }
                    {
                        Boolean googlemapcoordinateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.googlemapcoordinate!= null));
                        if (googlemapcoordinateShouldBeCopiedAndSet == Boolean.TRUE) {
                            Container.Realestateitems.Realestate.Googlemapcoordinate sourceGooglemapcoordinate;
                            sourceGooglemapcoordinate = this.getGooglemapcoordinate();
                            Container.Realestateitems.Realestate.Googlemapcoordinate copyGooglemapcoordinate = ((Container.Realestateitems.Realestate.Googlemapcoordinate) strategy.copy(LocatorUtils.property(locator, "googlemapcoordinate", sourceGooglemapcoordinate), sourceGooglemapcoordinate, (this.googlemapcoordinate!= null)));
                            copy.setGooglemapcoordinate(copyGooglemapcoordinate);
                        } else {
                            if (googlemapcoordinateShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.googlemapcoordinate = null;
                            }
                        }
                    }
                    {
                        Boolean imagesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.images!= null));
                        if (imagesShouldBeCopiedAndSet == Boolean.TRUE) {
                            Container.Realestateitems.Realestate.Images sourceImages;
                            sourceImages = this.getImages();
                            Container.Realestateitems.Realestate.Images copyImages = ((Container.Realestateitems.Realestate.Images) strategy.copy(LocatorUtils.property(locator, "images", sourceImages), sourceImages, (this.images!= null)));
                            copy.setImages(copyImages);
                        } else {
                            if (imagesShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.images = null;
                            }
                        }
                    }
                    {
                        Boolean actionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.action!= null));
                        if (actionShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceAction;
                            sourceAction = this.getAction();
                            BigInteger copyAction = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "action", sourceAction), sourceAction, (this.action!= null)));
                            copy.setAction(copyAction);
                        } else {
                            if (actionShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.action = null;
                            }
                        }
                    }
                    {
                        Boolean agencycodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                        if (agencycodeShouldBeCopiedAndSet == Boolean.TRUE) {
                            int sourceAgencycode;
                            sourceAgencycode = this.getAgencycode();
                            int copyAgencycode = strategy.copy(LocatorUtils.property(locator, "agencycode", sourceAgencycode), sourceAgencycode, true);
                            copy.setAgencycode(copyAgencycode);
                        } else {
                            if (agencycodeShouldBeCopiedAndSet == Boolean.FALSE) {
                            }
                        }
                    }
                    {
                        Boolean referenceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.reference!= null));
                        if (referenceShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceReference;
                            sourceReference = this.getReference();
                            String copyReference = ((String) strategy.copy(LocatorUtils.property(locator, "reference", sourceReference), sourceReference, (this.reference!= null)));
                            copy.setReference(copyReference);
                        } else {
                            if (referenceShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.reference = null;
                            }
                        }
                    }
                    {
                        Boolean referenceIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.referenceID!= null));
                        if (referenceIDShouldBeCopiedAndSet == Boolean.TRUE) {
                            Integer sourceReferenceID;
                            sourceReferenceID = this.getReferenceID();
                            Integer copyReferenceID = ((Integer) strategy.copy(LocatorUtils.property(locator, "referenceID", sourceReferenceID), sourceReferenceID, (this.referenceID!= null)));
                            copy.setReferenceID(copyReferenceID);
                        } else {
                            if (referenceIDShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.referenceID = null;
                            }
                        }
                    }
                    {
                        Boolean contracttypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contracttype!= null));
                        if (contracttypeShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceContracttype;
                            sourceContracttype = this.getContracttype();
                            BigInteger copyContracttype = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "contracttype", sourceContracttype), sourceContracttype, (this.contracttype!= null)));
                            copy.setContracttype(copyContracttype);
                        } else {
                            if (contracttypeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.contracttype = null;
                            }
                        }
                    }
                    {
                        Boolean conditionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.condition!= null));
                        if (conditionShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceCondition;
                            sourceCondition = this.getCondition();
                            BigInteger copyCondition = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "condition", sourceCondition), sourceCondition, (this.condition!= null)));
                            copy.setCondition(copyCondition);
                        } else {
                            if (conditionShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.condition = null;
                            }
                        }
                    }
                    {
                        Boolean hasbalconyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hasbalcony!= null));
                        if (hasbalconyShouldBeCopiedAndSet == Boolean.TRUE) {
                            Boolean sourceHasbalcony;
                            sourceHasbalcony = this.getHasbalcony();
                            Boolean copyHasbalcony = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hasbalcony", sourceHasbalcony), sourceHasbalcony, (this.hasbalcony!= null)));
                            copy.setHasbalcony(copyHasbalcony);
                        } else {
                            if (hasbalconyShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.hasbalcony = null;
                            }
                        }
                    }
                    {
                        Boolean hasterraceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hasterrace!= null));
                        if (hasterraceShouldBeCopiedAndSet == Boolean.TRUE) {
                            Boolean sourceHasterrace;
                            sourceHasterrace = this.getHasterrace();
                            Boolean copyHasterrace = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hasterrace", sourceHasterrace), sourceHasterrace, (this.hasterrace!= null)));
                            copy.setHasterrace(copyHasterrace);
                        } else {
                            if (hasterraceShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.hasterrace = null;
                            }
                        }
                    }
                    {
                        Boolean heatingtypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heatingtype!= null));
                        if (heatingtypeShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceHeatingtype;
                            sourceHeatingtype = this.getHeatingtype();
                            BigInteger copyHeatingtype = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "heatingtype", sourceHeatingtype), sourceHeatingtype, (this.heatingtype!= null)));
                            copy.setHeatingtype(copyHeatingtype);
                        } else {
                            if (heatingtypeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.heatingtype = null;
                            }
                        }
                    }
                    {
                        Boolean housetypologyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.housetypology!= null));
                        if (housetypologyShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceHousetypology;
                            sourceHousetypology = this.getHousetypology();
                            BigInteger copyHousetypology = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "housetypology", sourceHousetypology), sourceHousetypology, (this.housetypology!= null)));
                            copy.setHousetypology(copyHousetypology);
                        } else {
                            if (housetypologyShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.housetypology = null;
                            }
                        }
                    }
                    {
                        Boolean bathroomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bathrooms!= null));
                        if (bathroomsShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceBathrooms;
                            sourceBathrooms = this.getBathrooms();
                            BigInteger copyBathrooms = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "bathrooms", sourceBathrooms), sourceBathrooms, (this.bathrooms!= null)));
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
                            BigInteger sourceFloor;
                            sourceFloor = this.getFloor();
                            BigInteger copyFloor = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "floor", sourceFloor), sourceFloor, (this.floor!= null)));
                            copy.setFloor(copyFloor);
                        } else {
                            if (floorShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.floor = null;
                            }
                        }
                    }
                    {
                        Boolean roomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rooms!= null));
                        if (roomsShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceRooms;
                            sourceRooms = this.getRooms();
                            BigInteger copyRooms = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "rooms", sourceRooms), sourceRooms, (this.rooms!= null)));
                            copy.setRooms(copyRooms);
                        } else {
                            if (roomsShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.rooms = null;
                            }
                        }
                    }
                    {
                        Boolean occupationstateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.occupationstate!= null));
                        if (occupationstateShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceOccupationstate;
                            sourceOccupationstate = this.getOccupationstate();
                            BigInteger copyOccupationstate = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "occupationstate", sourceOccupationstate), sourceOccupationstate, (this.occupationstate!= null)));
                            copy.setOccupationstate(copyOccupationstate);
                        } else {
                            if (occupationstateShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.occupationstate = null;
                            }
                        }
                    }
                    {
                        Boolean realestatetypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realestatetype!= null));
                        if (realestatetypeShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceRealestatetype;
                            sourceRealestatetype = this.getRealestatetype();
                            BigInteger copyRealestatetype = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "realestatetype", sourceRealestatetype), sourceRealestatetype, (this.realestatetype!= null)));
                            copy.setRealestatetype(copyRealestatetype);
                        } else {
                            if (realestatetypeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.realestatetype = null;
                            }
                        }
                    }
                    {
                        Boolean sizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.size!= null));
                        if (sizeShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceSize;
                            sourceSize = this.getSize();
                            BigInteger copySize = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "size", sourceSize), sourceSize, (this.size!= null)));
                            copy.setSize(copySize);
                        } else {
                            if (sizeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.size = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public Object createNewInstance() {
                return new Container.Realestateitems.Realestate();
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final Container.Realestateitems.Realestate that = ((Container.Realestateitems.Realestate) object);
                {
                    Container.Realestateitems.Realestate.Address lhsAddress;
                    lhsAddress = this.getAddress();
                    Container.Realestateitems.Realestate.Address rhsAddress;
                    rhsAddress = that.getAddress();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress, (this.address!= null), (that.address!= null))) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Description lhsDescription;
                    lhsDescription = this.getDescription();
                    Container.Realestateitems.Realestate.Description rhsDescription;
                    rhsDescription = that.getDescription();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Building lhsBuilding;
                    lhsBuilding = this.getBuilding();
                    Container.Realestateitems.Realestate.Building rhsBuilding;
                    rhsBuilding = that.getBuilding();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "building", lhsBuilding), LocatorUtils.property(thatLocator, "building", rhsBuilding), lhsBuilding, rhsBuilding, (this.building!= null), (that.building!= null))) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Price lhsPrice;
                    lhsPrice = this.getPrice();
                    Container.Realestateitems.Realestate.Price rhsPrice;
                    rhsPrice = that.getPrice();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice, (this.price!= null), (that.price!= null))) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Box lhsBox;
                    lhsBox = this.getBox();
                    Container.Realestateitems.Realestate.Box rhsBox;
                    rhsBox = that.getBox();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "box", lhsBox), LocatorUtils.property(thatLocator, "box", rhsBox), lhsBox, rhsBox, (this.box!= null), (that.box!= null))) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Garden lhsGarden;
                    lhsGarden = this.getGarden();
                    Container.Realestateitems.Realestate.Garden rhsGarden;
                    rhsGarden = that.getGarden();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "garden", lhsGarden), LocatorUtils.property(thatLocator, "garden", rhsGarden), lhsGarden, rhsGarden, (this.garden!= null), (that.garden!= null))) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Configuration lhsConfiguration;
                    lhsConfiguration = this.getConfiguration();
                    Container.Realestateitems.Realestate.Configuration rhsConfiguration;
                    rhsConfiguration = that.getConfiguration();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "configuration", lhsConfiguration), LocatorUtils.property(thatLocator, "configuration", rhsConfiguration), lhsConfiguration, rhsConfiguration, (this.configuration!= null), (that.configuration!= null))) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Googlemapcoordinate lhsGooglemapcoordinate;
                    lhsGooglemapcoordinate = this.getGooglemapcoordinate();
                    Container.Realestateitems.Realestate.Googlemapcoordinate rhsGooglemapcoordinate;
                    rhsGooglemapcoordinate = that.getGooglemapcoordinate();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "googlemapcoordinate", lhsGooglemapcoordinate), LocatorUtils.property(thatLocator, "googlemapcoordinate", rhsGooglemapcoordinate), lhsGooglemapcoordinate, rhsGooglemapcoordinate, (this.googlemapcoordinate!= null), (that.googlemapcoordinate!= null))) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Images lhsImages;
                    lhsImages = this.getImages();
                    Container.Realestateitems.Realestate.Images rhsImages;
                    rhsImages = that.getImages();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "images", lhsImages), LocatorUtils.property(thatLocator, "images", rhsImages), lhsImages, rhsImages, (this.images!= null), (that.images!= null))) {
                        return false;
                    }
                }
                {
                    BigInteger lhsAction;
                    lhsAction = this.getAction();
                    BigInteger rhsAction;
                    rhsAction = that.getAction();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "action", lhsAction), LocatorUtils.property(thatLocator, "action", rhsAction), lhsAction, rhsAction, (this.action!= null), (that.action!= null))) {
                        return false;
                    }
                }
                {
                    int lhsAgencycode;
                    lhsAgencycode = this.getAgencycode();
                    int rhsAgencycode;
                    rhsAgencycode = that.getAgencycode();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "agencycode", lhsAgencycode), LocatorUtils.property(thatLocator, "agencycode", rhsAgencycode), lhsAgencycode, rhsAgencycode, true, true)) {
                        return false;
                    }
                }
                {
                    String lhsReference;
                    lhsReference = this.getReference();
                    String rhsReference;
                    rhsReference = that.getReference();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "reference", lhsReference), LocatorUtils.property(thatLocator, "reference", rhsReference), lhsReference, rhsReference, (this.reference!= null), (that.reference!= null))) {
                        return false;
                    }
                }
                {
                    Integer lhsReferenceID;
                    lhsReferenceID = this.getReferenceID();
                    Integer rhsReferenceID;
                    rhsReferenceID = that.getReferenceID();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceID", lhsReferenceID), LocatorUtils.property(thatLocator, "referenceID", rhsReferenceID), lhsReferenceID, rhsReferenceID, (this.referenceID!= null), (that.referenceID!= null))) {
                        return false;
                    }
                }
                {
                    BigInteger lhsContracttype;
                    lhsContracttype = this.getContracttype();
                    BigInteger rhsContracttype;
                    rhsContracttype = that.getContracttype();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "contracttype", lhsContracttype), LocatorUtils.property(thatLocator, "contracttype", rhsContracttype), lhsContracttype, rhsContracttype, (this.contracttype!= null), (that.contracttype!= null))) {
                        return false;
                    }
                }
                {
                    BigInteger lhsCondition;
                    lhsCondition = this.getCondition();
                    BigInteger rhsCondition;
                    rhsCondition = that.getCondition();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "condition", lhsCondition), LocatorUtils.property(thatLocator, "condition", rhsCondition), lhsCondition, rhsCondition, (this.condition!= null), (that.condition!= null))) {
                        return false;
                    }
                }
                {
                    Boolean lhsHasbalcony;
                    lhsHasbalcony = this.getHasbalcony();
                    Boolean rhsHasbalcony;
                    rhsHasbalcony = that.getHasbalcony();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "hasbalcony", lhsHasbalcony), LocatorUtils.property(thatLocator, "hasbalcony", rhsHasbalcony), lhsHasbalcony, rhsHasbalcony, (this.hasbalcony!= null), (that.hasbalcony!= null))) {
                        return false;
                    }
                }
                {
                    Boolean lhsHasterrace;
                    lhsHasterrace = this.getHasterrace();
                    Boolean rhsHasterrace;
                    rhsHasterrace = that.getHasterrace();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "hasterrace", lhsHasterrace), LocatorUtils.property(thatLocator, "hasterrace", rhsHasterrace), lhsHasterrace, rhsHasterrace, (this.hasterrace!= null), (that.hasterrace!= null))) {
                        return false;
                    }
                }
                {
                    BigInteger lhsHeatingtype;
                    lhsHeatingtype = this.getHeatingtype();
                    BigInteger rhsHeatingtype;
                    rhsHeatingtype = that.getHeatingtype();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingtype", lhsHeatingtype), LocatorUtils.property(thatLocator, "heatingtype", rhsHeatingtype), lhsHeatingtype, rhsHeatingtype, (this.heatingtype!= null), (that.heatingtype!= null))) {
                        return false;
                    }
                }
                {
                    BigInteger lhsHousetypology;
                    lhsHousetypology = this.getHousetypology();
                    BigInteger rhsHousetypology;
                    rhsHousetypology = that.getHousetypology();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "housetypology", lhsHousetypology), LocatorUtils.property(thatLocator, "housetypology", rhsHousetypology), lhsHousetypology, rhsHousetypology, (this.housetypology!= null), (that.housetypology!= null))) {
                        return false;
                    }
                }
                {
                    BigInteger lhsBathrooms;
                    lhsBathrooms = this.getBathrooms();
                    BigInteger rhsBathrooms;
                    rhsBathrooms = that.getBathrooms();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "bathrooms", lhsBathrooms), LocatorUtils.property(thatLocator, "bathrooms", rhsBathrooms), lhsBathrooms, rhsBathrooms, (this.bathrooms!= null), (that.bathrooms!= null))) {
                        return false;
                    }
                }
                {
                    BigInteger lhsFloor;
                    lhsFloor = this.getFloor();
                    BigInteger rhsFloor;
                    rhsFloor = that.getFloor();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor, (this.floor!= null), (that.floor!= null))) {
                        return false;
                    }
                }
                {
                    BigInteger lhsRooms;
                    lhsRooms = this.getRooms();
                    BigInteger rhsRooms;
                    rhsRooms = that.getRooms();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "rooms", lhsRooms), LocatorUtils.property(thatLocator, "rooms", rhsRooms), lhsRooms, rhsRooms, (this.rooms!= null), (that.rooms!= null))) {
                        return false;
                    }
                }
                {
                    BigInteger lhsOccupationstate;
                    lhsOccupationstate = this.getOccupationstate();
                    BigInteger rhsOccupationstate;
                    rhsOccupationstate = that.getOccupationstate();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "occupationstate", lhsOccupationstate), LocatorUtils.property(thatLocator, "occupationstate", rhsOccupationstate), lhsOccupationstate, rhsOccupationstate, (this.occupationstate!= null), (that.occupationstate!= null))) {
                        return false;
                    }
                }
                {
                    BigInteger lhsRealestatetype;
                    lhsRealestatetype = this.getRealestatetype();
                    BigInteger rhsRealestatetype;
                    rhsRealestatetype = that.getRealestatetype();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "realestatetype", lhsRealestatetype), LocatorUtils.property(thatLocator, "realestatetype", rhsRealestatetype), lhsRealestatetype, rhsRealestatetype, (this.realestatetype!= null), (that.realestatetype!= null))) {
                        return false;
                    }
                }
                {
                    BigInteger lhsSize;
                    lhsSize = this.getSize();
                    BigInteger rhsSize;
                    rhsSize = that.getSize();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize, (this.size!= null), (that.size!= null))) {
                        return false;
                    }
                }
                return true;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
             *       &lt;attribute name="city" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;length value="6"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="zone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="street" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="zip" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public static class Address implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlAttribute(name = "city", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected String city;
                @XmlAttribute(name = "zone")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected String zone;
                @XmlAttribute(name = "street")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected String street;
                @XmlAttribute(name = "number")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected String number;
                @XmlAttribute(name = "zip")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected String zip;

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public String getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setCity(String value) {
                    this.city = value;
                }

                /**
                 * Gets the value of the zone property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public String getZone() {
                    return zone;
                }

                /**
                 * Sets the value of the zone property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setZone(String value) {
                    this.zone = value;
                }

                /**
                 * Gets the value of the street property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public String getStreet() {
                    return street;
                }

                /**
                 * Sets the value of the street property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setStreet(String value) {
                    this.street = value;
                }

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setNumber(String value) {
                    this.number = value;
                }

                /**
                 * Gets the value of the zip property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public String getZip() {
                    return zip;
                }

                /**
                 * Sets the value of the zip property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setZip(String value) {
                    this.zip = value;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public String toString() {
                    final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                    final StringBuilder buffer = new StringBuilder();
                    append(null, buffer, strategy);
                    return buffer.toString();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    strategy.appendStart(locator, this, buffer);
                    appendFields(locator, buffer, strategy);
                    strategy.appendEnd(locator, this, buffer);
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    {
                        String theCity;
                        theCity = this.getCity();
                        strategy.appendField(locator, this, "city", buffer, theCity, (this.city!= null));
                    }
                    {
                        String theZone;
                        theZone = this.getZone();
                        strategy.appendField(locator, this, "zone", buffer, theZone, (this.zone!= null));
                    }
                    {
                        String theStreet;
                        theStreet = this.getStreet();
                        strategy.appendField(locator, this, "street", buffer, theStreet, (this.street!= null));
                    }
                    {
                        String theNumber;
                        theNumber = this.getNumber();
                        strategy.appendField(locator, this, "number", buffer, theNumber, (this.number!= null));
                    }
                    {
                        String theZip;
                        theZip = this.getZip();
                        strategy.appendField(locator, this, "zip", buffer, theZip, (this.zip!= null));
                    }
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object clone() {
                    return copyTo(createNewInstance());
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(Object target) {
                    final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                    return copyTo(null, target, strategy);
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                    final Object draftCopy = ((target == null)?createNewInstance():target);
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Address) {
                        final Container.Realestateitems.Realestate.Address copy = ((Container.Realestateitems.Realestate.Address) draftCopy);
                        {
                            Boolean cityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.city!= null));
                            if (cityShouldBeCopiedAndSet == Boolean.TRUE) {
                                String sourceCity;
                                sourceCity = this.getCity();
                                String copyCity = ((String) strategy.copy(LocatorUtils.property(locator, "city", sourceCity), sourceCity, (this.city!= null)));
                                copy.setCity(copyCity);
                            } else {
                                if (cityShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.city = null;
                                }
                            }
                        }
                        {
                            Boolean zoneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zone!= null));
                            if (zoneShouldBeCopiedAndSet == Boolean.TRUE) {
                                String sourceZone;
                                sourceZone = this.getZone();
                                String copyZone = ((String) strategy.copy(LocatorUtils.property(locator, "zone", sourceZone), sourceZone, (this.zone!= null)));
                                copy.setZone(copyZone);
                            } else {
                                if (zoneShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.zone = null;
                                }
                            }
                        }
                        {
                            Boolean streetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.street!= null));
                            if (streetShouldBeCopiedAndSet == Boolean.TRUE) {
                                String sourceStreet;
                                sourceStreet = this.getStreet();
                                String copyStreet = ((String) strategy.copy(LocatorUtils.property(locator, "street", sourceStreet), sourceStreet, (this.street!= null)));
                                copy.setStreet(copyStreet);
                            } else {
                                if (streetShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.street = null;
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
                        {
                            Boolean zipShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zip!= null));
                            if (zipShouldBeCopiedAndSet == Boolean.TRUE) {
                                String sourceZip;
                                sourceZip = this.getZip();
                                String copyZip = ((String) strategy.copy(LocatorUtils.property(locator, "zip", sourceZip), sourceZip, (this.zip!= null)));
                                copy.setZip(copyZip);
                            } else {
                                if (zipShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.zip = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Address();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Container.Realestateitems.Realestate.Address that = ((Container.Realestateitems.Realestate.Address) object);
                    {
                        String lhsCity;
                        lhsCity = this.getCity();
                        String rhsCity;
                        rhsCity = that.getCity();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity, (this.city!= null), (that.city!= null))) {
                            return false;
                        }
                    }
                    {
                        String lhsZone;
                        lhsZone = this.getZone();
                        String rhsZone;
                        rhsZone = that.getZone();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "zone", lhsZone), LocatorUtils.property(thatLocator, "zone", rhsZone), lhsZone, rhsZone, (this.zone!= null), (that.zone!= null))) {
                            return false;
                        }
                    }
                    {
                        String lhsStreet;
                        lhsStreet = this.getStreet();
                        String rhsStreet;
                        rhsStreet = that.getStreet();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "street", lhsStreet), LocatorUtils.property(thatLocator, "street", rhsStreet), lhsStreet, rhsStreet, (this.street!= null), (that.street!= null))) {
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
                    {
                        String lhsZip;
                        lhsZip = this.getZip();
                        String rhsZip;
                        rhsZip = that.getZip();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "zip", lhsZip), LocatorUtils.property(thatLocator, "zip", rhsZip), lhsZip, rhsZip, (this.zip!= null), (that.zip!= null))) {
                            return false;
                        }
                    }
                    return true;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
             *       &lt;attribute name="size"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *             &lt;minInclusive value="0"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="type"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *             &lt;enumeration value="-1"/&gt;
             *             &lt;enumeration value="0"/&gt;
             *             &lt;enumeration value="1"/&gt;
             *             &lt;enumeration value="2"/&gt;
             *             &lt;enumeration value="3"/&gt;
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
            @XmlType(name = "")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public static class Box implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlAttribute(name = "size")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigInteger size;
                @XmlAttribute(name = "type")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigInteger type;

                /**
                 * Gets the value of the size property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public BigInteger getSize() {
                    return size;
                }

                /**
                 * Sets the value of the size property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setSize(BigInteger value) {
                    this.size = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public BigInteger getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setType(BigInteger value) {
                    this.type = value;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public String toString() {
                    final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                    final StringBuilder buffer = new StringBuilder();
                    append(null, buffer, strategy);
                    return buffer.toString();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    strategy.appendStart(locator, this, buffer);
                    appendFields(locator, buffer, strategy);
                    strategy.appendEnd(locator, this, buffer);
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    {
                        BigInteger theSize;
                        theSize = this.getSize();
                        strategy.appendField(locator, this, "size", buffer, theSize, (this.size!= null));
                    }
                    {
                        BigInteger theType;
                        theType = this.getType();
                        strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
                    }
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object clone() {
                    return copyTo(createNewInstance());
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(Object target) {
                    final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                    return copyTo(null, target, strategy);
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                    final Object draftCopy = ((target == null)?createNewInstance():target);
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Box) {
                        final Container.Realestateitems.Realestate.Box copy = ((Container.Realestateitems.Realestate.Box) draftCopy);
                        {
                            Boolean sizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.size!= null));
                            if (sizeShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigInteger sourceSize;
                                sourceSize = this.getSize();
                                BigInteger copySize = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "size", sourceSize), sourceSize, (this.size!= null)));
                                copy.setSize(copySize);
                            } else {
                                if (sizeShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.size = null;
                                }
                            }
                        }
                        {
                            Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                            if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigInteger sourceType;
                                sourceType = this.getType();
                                BigInteger copyType = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
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

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Box();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Container.Realestateitems.Realestate.Box that = ((Container.Realestateitems.Realestate.Box) object);
                    {
                        BigInteger lhsSize;
                        lhsSize = this.getSize();
                        BigInteger rhsSize;
                        rhsSize = that.getSize();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize, (this.size!= null), (that.size!= null))) {
                            return false;
                        }
                    }
                    {
                        BigInteger lhsType;
                        lhsType = this.getType();
                        BigInteger rhsType;
                        rhsType = that.getType();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                            return false;
                        }
                    }
                    return true;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
             *       &lt;attribute name="age"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *             &lt;minInclusive value="-1"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="expenses"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *             &lt;minInclusive value="-1"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="units"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *             &lt;minInclusive value="-1"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="totalfloors"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *             &lt;minInclusive value="-1"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="haslift" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public static class Building implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlAttribute(name = "age")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigInteger age;
                @XmlAttribute(name = "expenses")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigDecimal expenses;
                @XmlAttribute(name = "units")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigInteger units;
                @XmlAttribute(name = "totalfloors")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigInteger totalfloors;
                @XmlAttribute(name = "haslift")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected Boolean haslift;

                /**
                 * Gets the value of the age property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public BigInteger getAge() {
                    return age;
                }

                /**
                 * Sets the value of the age property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setAge(BigInteger value) {
                    this.age = value;
                }

                /**
                 * Gets the value of the expenses property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public BigDecimal getExpenses() {
                    return expenses;
                }

                /**
                 * Sets the value of the expenses property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setExpenses(BigDecimal value) {
                    this.expenses = value;
                }

                /**
                 * Gets the value of the units property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public BigInteger getUnits() {
                    return units;
                }

                /**
                 * Sets the value of the units property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setUnits(BigInteger value) {
                    this.units = value;
                }

                /**
                 * Gets the value of the totalfloors property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public BigInteger getTotalfloors() {
                    return totalfloors;
                }

                /**
                 * Sets the value of the totalfloors property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setTotalfloors(BigInteger value) {
                    this.totalfloors = value;
                }

                /**
                 * Gets the value of the haslift property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Boolean getHaslift() {
                    return haslift;
                }

                /**
                 * Sets the value of the haslift property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setHaslift(Boolean value) {
                    this.haslift = value;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public String toString() {
                    final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                    final StringBuilder buffer = new StringBuilder();
                    append(null, buffer, strategy);
                    return buffer.toString();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    strategy.appendStart(locator, this, buffer);
                    appendFields(locator, buffer, strategy);
                    strategy.appendEnd(locator, this, buffer);
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    {
                        BigInteger theAge;
                        theAge = this.getAge();
                        strategy.appendField(locator, this, "age", buffer, theAge, (this.age!= null));
                    }
                    {
                        BigDecimal theExpenses;
                        theExpenses = this.getExpenses();
                        strategy.appendField(locator, this, "expenses", buffer, theExpenses, (this.expenses!= null));
                    }
                    {
                        BigInteger theUnits;
                        theUnits = this.getUnits();
                        strategy.appendField(locator, this, "units", buffer, theUnits, (this.units!= null));
                    }
                    {
                        BigInteger theTotalfloors;
                        theTotalfloors = this.getTotalfloors();
                        strategy.appendField(locator, this, "totalfloors", buffer, theTotalfloors, (this.totalfloors!= null));
                    }
                    {
                        Boolean theHaslift;
                        theHaslift = this.getHaslift();
                        strategy.appendField(locator, this, "haslift", buffer, theHaslift, (this.haslift!= null));
                    }
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object clone() {
                    return copyTo(createNewInstance());
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(Object target) {
                    final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                    return copyTo(null, target, strategy);
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                    final Object draftCopy = ((target == null)?createNewInstance():target);
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Building) {
                        final Container.Realestateitems.Realestate.Building copy = ((Container.Realestateitems.Realestate.Building) draftCopy);
                        {
                            Boolean ageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.age!= null));
                            if (ageShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigInteger sourceAge;
                                sourceAge = this.getAge();
                                BigInteger copyAge = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "age", sourceAge), sourceAge, (this.age!= null)));
                                copy.setAge(copyAge);
                            } else {
                                if (ageShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.age = null;
                                }
                            }
                        }
                        {
                            Boolean expensesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.expenses!= null));
                            if (expensesShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigDecimal sourceExpenses;
                                sourceExpenses = this.getExpenses();
                                BigDecimal copyExpenses = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "expenses", sourceExpenses), sourceExpenses, (this.expenses!= null)));
                                copy.setExpenses(copyExpenses);
                            } else {
                                if (expensesShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.expenses = null;
                                }
                            }
                        }
                        {
                            Boolean unitsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.units!= null));
                            if (unitsShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigInteger sourceUnits;
                                sourceUnits = this.getUnits();
                                BigInteger copyUnits = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "units", sourceUnits), sourceUnits, (this.units!= null)));
                                copy.setUnits(copyUnits);
                            } else {
                                if (unitsShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.units = null;
                                }
                            }
                        }
                        {
                            Boolean totalfloorsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.totalfloors!= null));
                            if (totalfloorsShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigInteger sourceTotalfloors;
                                sourceTotalfloors = this.getTotalfloors();
                                BigInteger copyTotalfloors = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "totalfloors", sourceTotalfloors), sourceTotalfloors, (this.totalfloors!= null)));
                                copy.setTotalfloors(copyTotalfloors);
                            } else {
                                if (totalfloorsShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.totalfloors = null;
                                }
                            }
                        }
                        {
                            Boolean hasliftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.haslift!= null));
                            if (hasliftShouldBeCopiedAndSet == Boolean.TRUE) {
                                Boolean sourceHaslift;
                                sourceHaslift = this.getHaslift();
                                Boolean copyHaslift = ((Boolean) strategy.copy(LocatorUtils.property(locator, "haslift", sourceHaslift), sourceHaslift, (this.haslift!= null)));
                                copy.setHaslift(copyHaslift);
                            } else {
                                if (hasliftShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.haslift = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Building();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Container.Realestateitems.Realestate.Building that = ((Container.Realestateitems.Realestate.Building) object);
                    {
                        BigInteger lhsAge;
                        lhsAge = this.getAge();
                        BigInteger rhsAge;
                        rhsAge = that.getAge();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "age", lhsAge), LocatorUtils.property(thatLocator, "age", rhsAge), lhsAge, rhsAge, (this.age!= null), (that.age!= null))) {
                            return false;
                        }
                    }
                    {
                        BigDecimal lhsExpenses;
                        lhsExpenses = this.getExpenses();
                        BigDecimal rhsExpenses;
                        rhsExpenses = that.getExpenses();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "expenses", lhsExpenses), LocatorUtils.property(thatLocator, "expenses", rhsExpenses), lhsExpenses, rhsExpenses, (this.expenses!= null), (that.expenses!= null))) {
                            return false;
                        }
                    }
                    {
                        BigInteger lhsUnits;
                        lhsUnits = this.getUnits();
                        BigInteger rhsUnits;
                        rhsUnits = that.getUnits();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "units", lhsUnits), LocatorUtils.property(thatLocator, "units", rhsUnits), lhsUnits, rhsUnits, (this.units!= null), (that.units!= null))) {
                            return false;
                        }
                    }
                    {
                        BigInteger lhsTotalfloors;
                        lhsTotalfloors = this.getTotalfloors();
                        BigInteger rhsTotalfloors;
                        rhsTotalfloors = that.getTotalfloors();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "totalfloors", lhsTotalfloors), LocatorUtils.property(thatLocator, "totalfloors", rhsTotalfloors), lhsTotalfloors, rhsTotalfloors, (this.totalfloors!= null), (that.totalfloors!= null))) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsHaslift;
                        lhsHaslift = this.getHaslift();
                        Boolean rhsHaslift;
                        rhsHaslift = that.getHaslift();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "haslift", lhsHaslift), LocatorUtils.property(thatLocator, "haslift", rhsHaslift), lhsHaslift, rhsHaslift, (this.haslift!= null), (that.haslift!= null))) {
                            return false;
                        }
                    }
                    return true;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
             *       &lt;attribute name="isaddressvisibleonsite" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
             *       &lt;attribute name="ismapvisible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
             *       &lt;attribute name="isrealestatevisibleonmap" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public static class Configuration implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlAttribute(name = "isaddressvisibleonsite")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected Boolean isaddressvisibleonsite;
                @XmlAttribute(name = "ismapvisible")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected Boolean ismapvisible;
                @XmlAttribute(name = "isrealestatevisibleonmap")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected Boolean isrealestatevisibleonmap;

                /**
                 * Gets the value of the isaddressvisibleonsite property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Boolean getIsaddressvisibleonsite() {
                    if (isaddressvisibleonsite == null) {
                        return false;
                    } else {
                        return isaddressvisibleonsite;
                    }
                }

                /**
                 * Sets the value of the isaddressvisibleonsite property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setIsaddressvisibleonsite(Boolean value) {
                    this.isaddressvisibleonsite = value;
                }

                /**
                 * Gets the value of the ismapvisible property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Boolean getIsmapvisible() {
                    if (ismapvisible == null) {
                        return false;
                    } else {
                        return ismapvisible;
                    }
                }

                /**
                 * Sets the value of the ismapvisible property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setIsmapvisible(Boolean value) {
                    this.ismapvisible = value;
                }

                /**
                 * Gets the value of the isrealestatevisibleonmap property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Boolean getIsrealestatevisibleonmap() {
                    if (isrealestatevisibleonmap == null) {
                        return false;
                    } else {
                        return isrealestatevisibleonmap;
                    }
                }

                /**
                 * Sets the value of the isrealestatevisibleonmap property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setIsrealestatevisibleonmap(Boolean value) {
                    this.isrealestatevisibleonmap = value;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public String toString() {
                    final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                    final StringBuilder buffer = new StringBuilder();
                    append(null, buffer, strategy);
                    return buffer.toString();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    strategy.appendStart(locator, this, buffer);
                    appendFields(locator, buffer, strategy);
                    strategy.appendEnd(locator, this, buffer);
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    {
                        Boolean theIsaddressvisibleonsite;
                        theIsaddressvisibleonsite = this.getIsaddressvisibleonsite();
                        strategy.appendField(locator, this, "isaddressvisibleonsite", buffer, theIsaddressvisibleonsite, (this.isaddressvisibleonsite!= null));
                    }
                    {
                        Boolean theIsmapvisible;
                        theIsmapvisible = this.getIsmapvisible();
                        strategy.appendField(locator, this, "ismapvisible", buffer, theIsmapvisible, (this.ismapvisible!= null));
                    }
                    {
                        Boolean theIsrealestatevisibleonmap;
                        theIsrealestatevisibleonmap = this.getIsrealestatevisibleonmap();
                        strategy.appendField(locator, this, "isrealestatevisibleonmap", buffer, theIsrealestatevisibleonmap, (this.isrealestatevisibleonmap!= null));
                    }
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object clone() {
                    return copyTo(createNewInstance());
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(Object target) {
                    final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                    return copyTo(null, target, strategy);
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                    final Object draftCopy = ((target == null)?createNewInstance():target);
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Configuration) {
                        final Container.Realestateitems.Realestate.Configuration copy = ((Container.Realestateitems.Realestate.Configuration) draftCopy);
                        {
                            Boolean isaddressvisibleonsiteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isaddressvisibleonsite!= null));
                            if (isaddressvisibleonsiteShouldBeCopiedAndSet == Boolean.TRUE) {
                                Boolean sourceIsaddressvisibleonsite;
                                sourceIsaddressvisibleonsite = this.getIsaddressvisibleonsite();
                                Boolean copyIsaddressvisibleonsite = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isaddressvisibleonsite", sourceIsaddressvisibleonsite), sourceIsaddressvisibleonsite, (this.isaddressvisibleonsite!= null)));
                                copy.setIsaddressvisibleonsite(copyIsaddressvisibleonsite);
                            } else {
                                if (isaddressvisibleonsiteShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.isaddressvisibleonsite = null;
                                }
                            }
                        }
                        {
                            Boolean ismapvisibleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ismapvisible!= null));
                            if (ismapvisibleShouldBeCopiedAndSet == Boolean.TRUE) {
                                Boolean sourceIsmapvisible;
                                sourceIsmapvisible = this.getIsmapvisible();
                                Boolean copyIsmapvisible = ((Boolean) strategy.copy(LocatorUtils.property(locator, "ismapvisible", sourceIsmapvisible), sourceIsmapvisible, (this.ismapvisible!= null)));
                                copy.setIsmapvisible(copyIsmapvisible);
                            } else {
                                if (ismapvisibleShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.ismapvisible = null;
                                }
                            }
                        }
                        {
                            Boolean isrealestatevisibleonmapShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isrealestatevisibleonmap!= null));
                            if (isrealestatevisibleonmapShouldBeCopiedAndSet == Boolean.TRUE) {
                                Boolean sourceIsrealestatevisibleonmap;
                                sourceIsrealestatevisibleonmap = this.getIsrealestatevisibleonmap();
                                Boolean copyIsrealestatevisibleonmap = ((Boolean) strategy.copy(LocatorUtils.property(locator, "isrealestatevisibleonmap", sourceIsrealestatevisibleonmap), sourceIsrealestatevisibleonmap, (this.isrealestatevisibleonmap!= null)));
                                copy.setIsrealestatevisibleonmap(copyIsrealestatevisibleonmap);
                            } else {
                                if (isrealestatevisibleonmapShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.isrealestatevisibleonmap = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Configuration();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Container.Realestateitems.Realestate.Configuration that = ((Container.Realestateitems.Realestate.Configuration) object);
                    {
                        Boolean lhsIsaddressvisibleonsite;
                        lhsIsaddressvisibleonsite = this.getIsaddressvisibleonsite();
                        Boolean rhsIsaddressvisibleonsite;
                        rhsIsaddressvisibleonsite = that.getIsaddressvisibleonsite();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "isaddressvisibleonsite", lhsIsaddressvisibleonsite), LocatorUtils.property(thatLocator, "isaddressvisibleonsite", rhsIsaddressvisibleonsite), lhsIsaddressvisibleonsite, rhsIsaddressvisibleonsite, (this.isaddressvisibleonsite!= null), (that.isaddressvisibleonsite!= null))) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsIsmapvisible;
                        lhsIsmapvisible = this.getIsmapvisible();
                        Boolean rhsIsmapvisible;
                        rhsIsmapvisible = that.getIsmapvisible();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "ismapvisible", lhsIsmapvisible), LocatorUtils.property(thatLocator, "ismapvisible", rhsIsmapvisible), lhsIsmapvisible, rhsIsmapvisible, (this.ismapvisible!= null), (that.ismapvisible!= null))) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsIsrealestatevisibleonmap;
                        lhsIsrealestatevisibleonmap = this.getIsrealestatevisibleonmap();
                        Boolean rhsIsrealestatevisibleonmap;
                        rhsIsrealestatevisibleonmap = that.getIsrealestatevisibleonmap();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "isrealestatevisibleonmap", lhsIsrealestatevisibleonmap), LocatorUtils.property(thatLocator, "isrealestatevisibleonmap", rhsIsrealestatevisibleonmap), lhsIsrealestatevisibleonmap, rhsIsrealestatevisibleonmap, (this.isrealestatevisibleonmap!= null), (that.isrealestatevisibleonmap!= null))) {
                            return false;
                        }
                    }
                    return true;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
             *       &lt;attribute name="value" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="20"/&gt;
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
            @XmlType(name = "")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public static class Description implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlAttribute(name = "value", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected String value;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setValue(String value) {
                    this.value = value;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public String toString() {
                    final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                    final StringBuilder buffer = new StringBuilder();
                    append(null, buffer, strategy);
                    return buffer.toString();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    strategy.appendStart(locator, this, buffer);
                    appendFields(locator, buffer, strategy);
                    strategy.appendEnd(locator, this, buffer);
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    {
                        String theValue;
                        theValue = this.getValue();
                        strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
                    }
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object clone() {
                    return copyTo(createNewInstance());
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(Object target) {
                    final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                    return copyTo(null, target, strategy);
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                    final Object draftCopy = ((target == null)?createNewInstance():target);
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Description) {
                        final Container.Realestateitems.Realestate.Description copy = ((Container.Realestateitems.Realestate.Description) draftCopy);
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
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Description();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Container.Realestateitems.Realestate.Description that = ((Container.Realestateitems.Realestate.Description) object);
                    {
                        String lhsValue;
                        lhsValue = this.getValue();
                        String rhsValue;
                        rhsValue = that.getValue();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                            return false;
                        }
                    }
                    return true;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
             *       &lt;attribute name="size"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *             &lt;minInclusive value="0"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="type"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *             &lt;enumeration value="-1"/&gt;
             *             &lt;enumeration value="0"/&gt;
             *             &lt;enumeration value="1"/&gt;
             *             &lt;enumeration value="2"/&gt;
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
            @XmlType(name = "")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public static class Garden implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlAttribute(name = "size")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigInteger size;
                @XmlAttribute(name = "type")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigInteger type;

                /**
                 * Gets the value of the size property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public BigInteger getSize() {
                    return size;
                }

                /**
                 * Sets the value of the size property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setSize(BigInteger value) {
                    this.size = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public BigInteger getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setType(BigInteger value) {
                    this.type = value;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public String toString() {
                    final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                    final StringBuilder buffer = new StringBuilder();
                    append(null, buffer, strategy);
                    return buffer.toString();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    strategy.appendStart(locator, this, buffer);
                    appendFields(locator, buffer, strategy);
                    strategy.appendEnd(locator, this, buffer);
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    {
                        BigInteger theSize;
                        theSize = this.getSize();
                        strategy.appendField(locator, this, "size", buffer, theSize, (this.size!= null));
                    }
                    {
                        BigInteger theType;
                        theType = this.getType();
                        strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
                    }
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object clone() {
                    return copyTo(createNewInstance());
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(Object target) {
                    final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                    return copyTo(null, target, strategy);
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                    final Object draftCopy = ((target == null)?createNewInstance():target);
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Garden) {
                        final Container.Realestateitems.Realestate.Garden copy = ((Container.Realestateitems.Realestate.Garden) draftCopy);
                        {
                            Boolean sizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.size!= null));
                            if (sizeShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigInteger sourceSize;
                                sourceSize = this.getSize();
                                BigInteger copySize = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "size", sourceSize), sourceSize, (this.size!= null)));
                                copy.setSize(copySize);
                            } else {
                                if (sizeShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.size = null;
                                }
                            }
                        }
                        {
                            Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                            if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigInteger sourceType;
                                sourceType = this.getType();
                                BigInteger copyType = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
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

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Garden();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Container.Realestateitems.Realestate.Garden that = ((Container.Realestateitems.Realestate.Garden) object);
                    {
                        BigInteger lhsSize;
                        lhsSize = this.getSize();
                        BigInteger rhsSize;
                        rhsSize = that.getSize();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize, (this.size!= null), (that.size!= null))) {
                            return false;
                        }
                    }
                    {
                        BigInteger lhsType;
                        lhsType = this.getType();
                        BigInteger rhsType;
                        rhsType = that.getType();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                            return false;
                        }
                    }
                    return true;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
             *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
             *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
             *       &lt;attribute name="mapzoom" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="latitudemapcenter" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
             *       &lt;attribute name="longitudemapcenter" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public static class Googlemapcoordinate implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlAttribute(name = "latitude")
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "double")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigDecimal latitude;
                @XmlAttribute(name = "longitude")
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "double")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigDecimal longitude;
                @XmlAttribute(name = "mapzoom")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected Integer mapzoom;
                @XmlAttribute(name = "latitudemapcenter")
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "double")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigDecimal latitudemapcenter;
                @XmlAttribute(name = "longitudemapcenter")
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "double")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigDecimal longitudemapcenter;

                /**
                 * Gets the value of the latitude property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setLatitude(BigDecimal value) {
                    this.latitude = value;
                }

                /**
                 * Gets the value of the longitude property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setLongitude(BigDecimal value) {
                    this.longitude = value;
                }

                /**
                 * Gets the value of the mapzoom property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Integer getMapzoom() {
                    return mapzoom;
                }

                /**
                 * Sets the value of the mapzoom property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setMapzoom(Integer value) {
                    this.mapzoom = value;
                }

                /**
                 * Gets the value of the latitudemapcenter property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public BigDecimal getLatitudemapcenter() {
                    return latitudemapcenter;
                }

                /**
                 * Sets the value of the latitudemapcenter property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setLatitudemapcenter(BigDecimal value) {
                    this.latitudemapcenter = value;
                }

                /**
                 * Gets the value of the longitudemapcenter property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public BigDecimal getLongitudemapcenter() {
                    return longitudemapcenter;
                }

                /**
                 * Sets the value of the longitudemapcenter property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setLongitudemapcenter(BigDecimal value) {
                    this.longitudemapcenter = value;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public String toString() {
                    final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                    final StringBuilder buffer = new StringBuilder();
                    append(null, buffer, strategy);
                    return buffer.toString();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    strategy.appendStart(locator, this, buffer);
                    appendFields(locator, buffer, strategy);
                    strategy.appendEnd(locator, this, buffer);
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    {
                        BigDecimal theLatitude;
                        theLatitude = this.getLatitude();
                        strategy.appendField(locator, this, "latitude", buffer, theLatitude, (this.latitude!= null));
                    }
                    {
                        BigDecimal theLongitude;
                        theLongitude = this.getLongitude();
                        strategy.appendField(locator, this, "longitude", buffer, theLongitude, (this.longitude!= null));
                    }
                    {
                        Integer theMapzoom;
                        theMapzoom = this.getMapzoom();
                        strategy.appendField(locator, this, "mapzoom", buffer, theMapzoom, (this.mapzoom!= null));
                    }
                    {
                        BigDecimal theLatitudemapcenter;
                        theLatitudemapcenter = this.getLatitudemapcenter();
                        strategy.appendField(locator, this, "latitudemapcenter", buffer, theLatitudemapcenter, (this.latitudemapcenter!= null));
                    }
                    {
                        BigDecimal theLongitudemapcenter;
                        theLongitudemapcenter = this.getLongitudemapcenter();
                        strategy.appendField(locator, this, "longitudemapcenter", buffer, theLongitudemapcenter, (this.longitudemapcenter!= null));
                    }
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object clone() {
                    return copyTo(createNewInstance());
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(Object target) {
                    final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                    return copyTo(null, target, strategy);
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                    final Object draftCopy = ((target == null)?createNewInstance():target);
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Googlemapcoordinate) {
                        final Container.Realestateitems.Realestate.Googlemapcoordinate copy = ((Container.Realestateitems.Realestate.Googlemapcoordinate) draftCopy);
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
                            Boolean mapzoomShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mapzoom!= null));
                            if (mapzoomShouldBeCopiedAndSet == Boolean.TRUE) {
                                Integer sourceMapzoom;
                                sourceMapzoom = this.getMapzoom();
                                Integer copyMapzoom = ((Integer) strategy.copy(LocatorUtils.property(locator, "mapzoom", sourceMapzoom), sourceMapzoom, (this.mapzoom!= null)));
                                copy.setMapzoom(copyMapzoom);
                            } else {
                                if (mapzoomShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.mapzoom = null;
                                }
                            }
                        }
                        {
                            Boolean latitudemapcenterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.latitudemapcenter!= null));
                            if (latitudemapcenterShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigDecimal sourceLatitudemapcenter;
                                sourceLatitudemapcenter = this.getLatitudemapcenter();
                                BigDecimal copyLatitudemapcenter = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "latitudemapcenter", sourceLatitudemapcenter), sourceLatitudemapcenter, (this.latitudemapcenter!= null)));
                                copy.setLatitudemapcenter(copyLatitudemapcenter);
                            } else {
                                if (latitudemapcenterShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.latitudemapcenter = null;
                                }
                            }
                        }
                        {
                            Boolean longitudemapcenterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.longitudemapcenter!= null));
                            if (longitudemapcenterShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigDecimal sourceLongitudemapcenter;
                                sourceLongitudemapcenter = this.getLongitudemapcenter();
                                BigDecimal copyLongitudemapcenter = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "longitudemapcenter", sourceLongitudemapcenter), sourceLongitudemapcenter, (this.longitudemapcenter!= null)));
                                copy.setLongitudemapcenter(copyLongitudemapcenter);
                            } else {
                                if (longitudemapcenterShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.longitudemapcenter = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Googlemapcoordinate();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Container.Realestateitems.Realestate.Googlemapcoordinate that = ((Container.Realestateitems.Realestate.Googlemapcoordinate) object);
                    {
                        BigDecimal lhsLatitude;
                        lhsLatitude = this.getLatitude();
                        BigDecimal rhsLatitude;
                        rhsLatitude = that.getLatitude();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "latitude", lhsLatitude), LocatorUtils.property(thatLocator, "latitude", rhsLatitude), lhsLatitude, rhsLatitude, (this.latitude!= null), (that.latitude!= null))) {
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
                        Integer lhsMapzoom;
                        lhsMapzoom = this.getMapzoom();
                        Integer rhsMapzoom;
                        rhsMapzoom = that.getMapzoom();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "mapzoom", lhsMapzoom), LocatorUtils.property(thatLocator, "mapzoom", rhsMapzoom), lhsMapzoom, rhsMapzoom, (this.mapzoom!= null), (that.mapzoom!= null))) {
                            return false;
                        }
                    }
                    {
                        BigDecimal lhsLatitudemapcenter;
                        lhsLatitudemapcenter = this.getLatitudemapcenter();
                        BigDecimal rhsLatitudemapcenter;
                        rhsLatitudemapcenter = that.getLatitudemapcenter();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "latitudemapcenter", lhsLatitudemapcenter), LocatorUtils.property(thatLocator, "latitudemapcenter", rhsLatitudemapcenter), lhsLatitudemapcenter, rhsLatitudemapcenter, (this.latitudemapcenter!= null), (that.latitudemapcenter!= null))) {
                            return false;
                        }
                    }
                    {
                        BigDecimal lhsLongitudemapcenter;
                        lhsLongitudemapcenter = this.getLongitudemapcenter();
                        BigDecimal rhsLongitudemapcenter;
                        rhsLongitudemapcenter = that.getLongitudemapcenter();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "longitudemapcenter", lhsLongitudemapcenter), LocatorUtils.property(thatLocator, "longitudemapcenter", rhsLongitudemapcenter), lhsLongitudemapcenter, rhsLongitudemapcenter, (this.longitudemapcenter!= null), (that.longitudemapcenter!= null))) {
                            return false;
                        }
                    }
                    return true;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
             *         &lt;element name="advertismentimage" maxOccurs="14"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="imagetype" use="required"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;enumeration value="Image"/&gt;
             *                       &lt;enumeration value="Map"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
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
                "advertismentimage"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public static class Images implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected List<Container.Realestateitems.Realestate.Images.Advertismentimage> advertismentimage;

                /**
                 * Gets the value of the advertismentimage property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the advertismentimage property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAdvertismentimage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Container.Realestateitems.Realestate.Images.Advertismentimage }
                 * 
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public List<Container.Realestateitems.Realestate.Images.Advertismentimage> getAdvertismentimage() {
                    if (advertismentimage == null) {
                        advertismentimage = new ArrayList<Container.Realestateitems.Realestate.Images.Advertismentimage>();
                    }
                    return this.advertismentimage;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public String toString() {
                    final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                    final StringBuilder buffer = new StringBuilder();
                    append(null, buffer, strategy);
                    return buffer.toString();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    strategy.appendStart(locator, this, buffer);
                    appendFields(locator, buffer, strategy);
                    strategy.appendEnd(locator, this, buffer);
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    {
                        List<Container.Realestateitems.Realestate.Images.Advertismentimage> theAdvertismentimage;
                        theAdvertismentimage = (((this.advertismentimage!= null)&&(!this.advertismentimage.isEmpty()))?this.getAdvertismentimage():null);
                        strategy.appendField(locator, this, "advertismentimage", buffer, theAdvertismentimage, ((this.advertismentimage!= null)&&(!this.advertismentimage.isEmpty())));
                    }
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object clone() {
                    return copyTo(createNewInstance());
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(Object target) {
                    final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                    return copyTo(null, target, strategy);
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                    final Object draftCopy = ((target == null)?createNewInstance():target);
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Images) {
                        final Container.Realestateitems.Realestate.Images copy = ((Container.Realestateitems.Realestate.Images) draftCopy);
                        {
                            Boolean advertismentimageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.advertismentimage!= null)&&(!this.advertismentimage.isEmpty())));
                            if (advertismentimageShouldBeCopiedAndSet == Boolean.TRUE) {
                                List<Container.Realestateitems.Realestate.Images.Advertismentimage> sourceAdvertismentimage;
                                sourceAdvertismentimage = (((this.advertismentimage!= null)&&(!this.advertismentimage.isEmpty()))?this.getAdvertismentimage():null);
                                @SuppressWarnings("unchecked")
                                List<Container.Realestateitems.Realestate.Images.Advertismentimage> copyAdvertismentimage = ((List<Container.Realestateitems.Realestate.Images.Advertismentimage> ) strategy.copy(LocatorUtils.property(locator, "advertismentimage", sourceAdvertismentimage), sourceAdvertismentimage, ((this.advertismentimage!= null)&&(!this.advertismentimage.isEmpty()))));
                                copy.advertismentimage = null;
                                if (copyAdvertismentimage!= null) {
                                    List<Container.Realestateitems.Realestate.Images.Advertismentimage> uniqueAdvertismentimagel = copy.getAdvertismentimage();
                                    uniqueAdvertismentimagel.addAll(copyAdvertismentimage);
                                }
                            } else {
                                if (advertismentimageShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.advertismentimage = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Images();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Container.Realestateitems.Realestate.Images that = ((Container.Realestateitems.Realestate.Images) object);
                    {
                        List<Container.Realestateitems.Realestate.Images.Advertismentimage> lhsAdvertismentimage;
                        lhsAdvertismentimage = (((this.advertismentimage!= null)&&(!this.advertismentimage.isEmpty()))?this.getAdvertismentimage():null);
                        List<Container.Realestateitems.Realestate.Images.Advertismentimage> rhsAdvertismentimage;
                        rhsAdvertismentimage = (((that.advertismentimage!= null)&&(!that.advertismentimage.isEmpty()))?that.getAdvertismentimage():null);
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "advertismentimage", lhsAdvertismentimage), LocatorUtils.property(thatLocator, "advertismentimage", rhsAdvertismentimage), lhsAdvertismentimage, rhsAdvertismentimage, ((this.advertismentimage!= null)&&(!this.advertismentimage.isEmpty())), ((that.advertismentimage!= null)&&(!that.advertismentimage.isEmpty())))) {
                            return false;
                        }
                    }
                    return true;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
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
                 *       &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="imagetype" use="required"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;enumeration value="Image"/&gt;
                 *             &lt;enumeration value="Map"/&gt;
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
                @XmlType(name = "")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public static class Advertismentimage implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
                {

                    @XmlAttribute(name = "path", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    protected String path;
                    @XmlAttribute(name = "imagetype", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    protected String imagetype;

                    /**
                     * Gets the value of the path property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    public String getPath() {
                        return path;
                    }

                    /**
                     * Sets the value of the path property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    public void setPath(String value) {
                        this.path = value;
                    }

                    /**
                     * Gets the value of the imagetype property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    public String getImagetype() {
                        return imagetype;
                    }

                    /**
                     * Sets the value of the imagetype property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    public void setImagetype(String value) {
                        this.imagetype = value;
                    }

                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    public String toString() {
                        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                        final StringBuilder buffer = new StringBuilder();
                        append(null, buffer, strategy);
                        return buffer.toString();
                    }

                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                        strategy.appendStart(locator, this, buffer);
                        appendFields(locator, buffer, strategy);
                        strategy.appendEnd(locator, this, buffer);
                        return buffer;
                    }

                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                        {
                            String thePath;
                            thePath = this.getPath();
                            strategy.appendField(locator, this, "path", buffer, thePath, (this.path!= null));
                        }
                        {
                            String theImagetype;
                            theImagetype = this.getImagetype();
                            strategy.appendField(locator, this, "imagetype", buffer, theImagetype, (this.imagetype!= null));
                        }
                        return buffer;
                    }

                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    public Object clone() {
                        return copyTo(createNewInstance());
                    }

                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    public Object copyTo(Object target) {
                        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                        return copyTo(null, target, strategy);
                    }

                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                        final Object draftCopy = ((target == null)?createNewInstance():target);
                        if (draftCopy instanceof Container.Realestateitems.Realestate.Images.Advertismentimage) {
                            final Container.Realestateitems.Realestate.Images.Advertismentimage copy = ((Container.Realestateitems.Realestate.Images.Advertismentimage) draftCopy);
                            {
                                Boolean pathShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.path!= null));
                                if (pathShouldBeCopiedAndSet == Boolean.TRUE) {
                                    String sourcePath;
                                    sourcePath = this.getPath();
                                    String copyPath = ((String) strategy.copy(LocatorUtils.property(locator, "path", sourcePath), sourcePath, (this.path!= null)));
                                    copy.setPath(copyPath);
                                } else {
                                    if (pathShouldBeCopiedAndSet == Boolean.FALSE) {
                                        copy.path = null;
                                    }
                                }
                            }
                            {
                                Boolean imagetypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.imagetype!= null));
                                if (imagetypeShouldBeCopiedAndSet == Boolean.TRUE) {
                                    String sourceImagetype;
                                    sourceImagetype = this.getImagetype();
                                    String copyImagetype = ((String) strategy.copy(LocatorUtils.property(locator, "imagetype", sourceImagetype), sourceImagetype, (this.imagetype!= null)));
                                    copy.setImagetype(copyImagetype);
                                } else {
                                    if (imagetypeShouldBeCopiedAndSet == Boolean.FALSE) {
                                        copy.imagetype = null;
                                    }
                                }
                            }
                        }
                        return draftCopy;
                    }

                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    public Object createNewInstance() {
                        return new Container.Realestateitems.Realestate.Images.Advertismentimage();
                    }

                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                        if ((object == null)||(this.getClass()!= object.getClass())) {
                            return false;
                        }
                        if (this == object) {
                            return true;
                        }
                        final Container.Realestateitems.Realestate.Images.Advertismentimage that = ((Container.Realestateitems.Realestate.Images.Advertismentimage) object);
                        {
                            String lhsPath;
                            lhsPath = this.getPath();
                            String rhsPath;
                            rhsPath = that.getPath();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "path", lhsPath), LocatorUtils.property(thatLocator, "path", rhsPath), lhsPath, rhsPath, (this.path!= null), (that.path!= null))) {
                                return false;
                            }
                        }
                        {
                            String lhsImagetype;
                            lhsImagetype = this.getImagetype();
                            String rhsImagetype;
                            rhsImagetype = that.getImagetype();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "imagetype", lhsImagetype), LocatorUtils.property(thatLocator, "imagetype", rhsImagetype), lhsImagetype, rhsImagetype, (this.imagetype!= null), (that.imagetype!= null))) {
                                return false;
                            }
                        }
                        return true;
                    }

                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                    public boolean equals(Object object) {
                        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
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
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="value"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *             &lt;minInclusive value="-1"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="min" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *             &lt;minInclusive value="0"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="max" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *             &lt;minInclusive value="1"/&gt;
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
            @XmlType(name = "")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
            public static class Price implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlAttribute(name = "value")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigDecimal value;
                @XmlAttribute(name = "min", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigDecimal min;
                @XmlAttribute(name = "max", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                protected BigDecimal max;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public BigDecimal getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setValue(BigDecimal value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the min property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public BigDecimal getMin() {
                    return min;
                }

                /**
                 * Sets the value of the min property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setMin(BigDecimal value) {
                    this.min = value;
                }

                /**
                 * Gets the value of the max property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public BigDecimal getMax() {
                    return max;
                }

                /**
                 * Sets the value of the max property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public void setMax(BigDecimal value) {
                    this.max = value;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public String toString() {
                    final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                    final StringBuilder buffer = new StringBuilder();
                    append(null, buffer, strategy);
                    return buffer.toString();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    strategy.appendStart(locator, this, buffer);
                    appendFields(locator, buffer, strategy);
                    strategy.appendEnd(locator, this, buffer);
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                    {
                        BigDecimal theValue;
                        theValue = this.getValue();
                        strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
                    }
                    {
                        BigDecimal theMin;
                        theMin = this.getMin();
                        strategy.appendField(locator, this, "min", buffer, theMin, (this.min!= null));
                    }
                    {
                        BigDecimal theMax;
                        theMax = this.getMax();
                        strategy.appendField(locator, this, "max", buffer, theMax, (this.max!= null));
                    }
                    return buffer;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object clone() {
                    return copyTo(createNewInstance());
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(Object target) {
                    final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                    return copyTo(null, target, strategy);
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                    final Object draftCopy = ((target == null)?createNewInstance():target);
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Price) {
                        final Container.Realestateitems.Realestate.Price copy = ((Container.Realestateitems.Realestate.Price) draftCopy);
                        {
                            Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                            if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigDecimal sourceValue;
                                sourceValue = this.getValue();
                                BigDecimal copyValue = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                                copy.setValue(copyValue);
                            } else {
                                if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.value = null;
                                }
                            }
                        }
                        {
                            Boolean minShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.min!= null));
                            if (minShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigDecimal sourceMin;
                                sourceMin = this.getMin();
                                BigDecimal copyMin = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "min", sourceMin), sourceMin, (this.min!= null)));
                                copy.setMin(copyMin);
                            } else {
                                if (minShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.min = null;
                                }
                            }
                        }
                        {
                            Boolean maxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.max!= null));
                            if (maxShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigDecimal sourceMax;
                                sourceMax = this.getMax();
                                BigDecimal copyMax = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "max", sourceMax), sourceMax, (this.max!= null)));
                                copy.setMax(copyMax);
                            } else {
                                if (maxShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.max = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Price();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Container.Realestateitems.Realestate.Price that = ((Container.Realestateitems.Realestate.Price) object);
                    {
                        BigDecimal lhsValue;
                        lhsValue = this.getValue();
                        BigDecimal rhsValue;
                        rhsValue = that.getValue();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                            return false;
                        }
                    }
                    {
                        BigDecimal lhsMin;
                        lhsMin = this.getMin();
                        BigDecimal rhsMin;
                        rhsMin = that.getMin();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "min", lhsMin), LocatorUtils.property(thatLocator, "min", rhsMin), lhsMin, rhsMin, (this.min!= null), (that.min!= null))) {
                            return false;
                        }
                    }
                    {
                        BigDecimal lhsMax;
                        lhsMax = this.getMax();
                        BigDecimal rhsMax;
                        rhsMax = that.getMax();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "max", lhsMax), LocatorUtils.property(thatLocator, "max", rhsMax), lhsMax, rhsMax, (this.max!= null), (that.max!= null))) {
                            return false;
                        }
                    }
                    return true;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:02+02:00", comments = "JAXB RI v2.2.11")
                public boolean equals(Object object) {
                    final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
                    return equals(null, null, object, strategy);
                }

            }

        }

    }

}
