
package org.openestate.io.casa_it.xml;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
public class Container
    implements Cloneable, CopyTo, Equals, ToString
{

    protected Container.Realestateitems realestateitems;

    /**
     * Gets the value of the realestateitems property.
     * 
     * @return
     *     possible object is
     *     {@link Container.Realestateitems }
     *     
     */
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
    public void setRealestateitems(Container.Realestateitems value) {
        this.realestateitems = value;
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
            Container.Realestateitems theRealestateitems;
            theRealestateitems = this.getRealestateitems();
            strategy.appendField(locator, this, "realestateitems", buffer, theRealestateitems);
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
        if (draftCopy instanceof Container) {
            final Container copy = ((Container) draftCopy);
            if (this.realestateitems!= null) {
                Container.Realestateitems sourceRealestateitems;
                sourceRealestateitems = this.getRealestateitems();
                Container.Realestateitems copyRealestateitems = ((Container.Realestateitems) strategy.copy(LocatorUtils.property(locator, "realestateitems", sourceRealestateitems), sourceRealestateitems));
                copy.setRealestateitems(copyRealestateitems);
            } else {
                copy.realestateitems = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Container();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realestateitems", lhsRealestateitems), LocatorUtils.property(thatLocator, "realestateitems", rhsRealestateitems), lhsRealestateitems, rhsRealestateitems)) {
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
    public static class Realestateitems
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(required = true)
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
        public List<Container.Realestateitems.Realestate> getRealestate() {
            if (realestate == null) {
                realestate = new ArrayList<Container.Realestateitems.Realestate>();
            }
            return this.realestate;
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
                List<Container.Realestateitems.Realestate> theRealestate;
                theRealestate = (((this.realestate!= null)&&(!this.realestate.isEmpty()))?this.getRealestate():null);
                strategy.appendField(locator, this, "realestate", buffer, theRealestate);
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
            if (draftCopy instanceof Container.Realestateitems) {
                final Container.Realestateitems copy = ((Container.Realestateitems) draftCopy);
                if ((this.realestate!= null)&&(!this.realestate.isEmpty())) {
                    List<Container.Realestateitems.Realestate> sourceRealestate;
                    sourceRealestate = (((this.realestate!= null)&&(!this.realestate.isEmpty()))?this.getRealestate():null);
                    @SuppressWarnings("unchecked")
                    List<Container.Realestateitems.Realestate> copyRealestate = ((List<Container.Realestateitems.Realestate> ) strategy.copy(LocatorUtils.property(locator, "realestate", sourceRealestate), sourceRealestate));
                    copy.realestate = null;
                    if (copyRealestate!= null) {
                        List<Container.Realestateitems.Realestate> uniqueRealestatel = copy.getRealestate();
                        uniqueRealestatel.addAll(copyRealestate);
                    }
                } else {
                    copy.realestate = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new Container.Realestateitems();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
                if (!strategy.equals(LocatorUtils.property(thisLocator, "realestate", lhsRealestate), LocatorUtils.property(thatLocator, "realestate", rhsRealestate), lhsRealestate, rhsRealestate)) {
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
        public static class Realestate
            implements Cloneable, CopyTo, Equals, ToString
        {

            protected Container.Realestateitems.Realestate.Address address;
            protected Container.Realestateitems.Realestate.Description description;
            protected Container.Realestateitems.Realestate.Building building;
            protected Container.Realestateitems.Realestate.Price price;
            protected Container.Realestateitems.Realestate.Box box;
            protected Container.Realestateitems.Realestate.Garden garden;
            protected Container.Realestateitems.Realestate.Configuration configuration;
            protected Container.Realestateitems.Realestate.Googlemapcoordinate googlemapcoordinate;
            protected Container.Realestateitems.Realestate.Images images;
            @XmlAttribute(name = "action", required = true)
            protected BigInteger action;
            @XmlAttribute(name = "agencycode", required = true)
            protected int agencycode;
            @XmlAttribute(name = "reference", required = true)
            protected String reference;
            @XmlAttribute(name = "referenceID")
            protected Integer referenceID;
            @XmlAttribute(name = "contracttype", required = true)
            protected BigInteger contracttype;
            @XmlAttribute(name = "condition")
            protected BigInteger condition;
            @XmlAttribute(name = "hasbalcony")
            protected Boolean hasbalcony;
            @XmlAttribute(name = "hasterrace")
            protected Boolean hasterrace;
            @XmlAttribute(name = "heatingtype")
            protected BigInteger heatingtype;
            @XmlAttribute(name = "housetypology", required = true)
            protected BigInteger housetypology;
            @XmlAttribute(name = "bathrooms")
            protected BigInteger bathrooms;
            @XmlAttribute(name = "floor")
            protected BigInteger floor;
            @XmlAttribute(name = "rooms")
            protected BigInteger rooms;
            @XmlAttribute(name = "occupationstate")
            protected BigInteger occupationstate;
            @XmlAttribute(name = "realestatetype", required = true)
            protected BigInteger realestatetype;
            @XmlAttribute(name = "size", required = true)
            protected BigInteger size;

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link Container.Realestateitems.Realestate.Address }
             *     
             */
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
            public void setAction(BigInteger value) {
                this.action = value;
            }

            /**
             * Gets the value of the agencycode property.
             * 
             */
            public int getAgencycode() {
                return agencycode;
            }

            /**
             * Sets the value of the agencycode property.
             * 
             */
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
            public Boolean isHasbalcony() {
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
            public Boolean isHasterrace() {
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
            public void setSize(BigInteger value) {
                this.size = value;
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
                    Container.Realestateitems.Realestate.Address theAddress;
                    theAddress = this.getAddress();
                    strategy.appendField(locator, this, "address", buffer, theAddress);
                }
                {
                    Container.Realestateitems.Realestate.Description theDescription;
                    theDescription = this.getDescription();
                    strategy.appendField(locator, this, "description", buffer, theDescription);
                }
                {
                    Container.Realestateitems.Realestate.Building theBuilding;
                    theBuilding = this.getBuilding();
                    strategy.appendField(locator, this, "building", buffer, theBuilding);
                }
                {
                    Container.Realestateitems.Realestate.Price thePrice;
                    thePrice = this.getPrice();
                    strategy.appendField(locator, this, "price", buffer, thePrice);
                }
                {
                    Container.Realestateitems.Realestate.Box theBox;
                    theBox = this.getBox();
                    strategy.appendField(locator, this, "box", buffer, theBox);
                }
                {
                    Container.Realestateitems.Realestate.Garden theGarden;
                    theGarden = this.getGarden();
                    strategy.appendField(locator, this, "garden", buffer, theGarden);
                }
                {
                    Container.Realestateitems.Realestate.Configuration theConfiguration;
                    theConfiguration = this.getConfiguration();
                    strategy.appendField(locator, this, "configuration", buffer, theConfiguration);
                }
                {
                    Container.Realestateitems.Realestate.Googlemapcoordinate theGooglemapcoordinate;
                    theGooglemapcoordinate = this.getGooglemapcoordinate();
                    strategy.appendField(locator, this, "googlemapcoordinate", buffer, theGooglemapcoordinate);
                }
                {
                    Container.Realestateitems.Realestate.Images theImages;
                    theImages = this.getImages();
                    strategy.appendField(locator, this, "images", buffer, theImages);
                }
                {
                    BigInteger theAction;
                    theAction = this.getAction();
                    strategy.appendField(locator, this, "action", buffer, theAction);
                }
                {
                    int theAgencycode;
                    theAgencycode = this.getAgencycode();
                    strategy.appendField(locator, this, "agencycode", buffer, theAgencycode);
                }
                {
                    String theReference;
                    theReference = this.getReference();
                    strategy.appendField(locator, this, "reference", buffer, theReference);
                }
                {
                    Integer theReferenceID;
                    theReferenceID = this.getReferenceID();
                    strategy.appendField(locator, this, "referenceID", buffer, theReferenceID);
                }
                {
                    BigInteger theContracttype;
                    theContracttype = this.getContracttype();
                    strategy.appendField(locator, this, "contracttype", buffer, theContracttype);
                }
                {
                    BigInteger theCondition;
                    theCondition = this.getCondition();
                    strategy.appendField(locator, this, "condition", buffer, theCondition);
                }
                {
                    Boolean theHasbalcony;
                    theHasbalcony = this.isHasbalcony();
                    strategy.appendField(locator, this, "hasbalcony", buffer, theHasbalcony);
                }
                {
                    Boolean theHasterrace;
                    theHasterrace = this.isHasterrace();
                    strategy.appendField(locator, this, "hasterrace", buffer, theHasterrace);
                }
                {
                    BigInteger theHeatingtype;
                    theHeatingtype = this.getHeatingtype();
                    strategy.appendField(locator, this, "heatingtype", buffer, theHeatingtype);
                }
                {
                    BigInteger theHousetypology;
                    theHousetypology = this.getHousetypology();
                    strategy.appendField(locator, this, "housetypology", buffer, theHousetypology);
                }
                {
                    BigInteger theBathrooms;
                    theBathrooms = this.getBathrooms();
                    strategy.appendField(locator, this, "bathrooms", buffer, theBathrooms);
                }
                {
                    BigInteger theFloor;
                    theFloor = this.getFloor();
                    strategy.appendField(locator, this, "floor", buffer, theFloor);
                }
                {
                    BigInteger theRooms;
                    theRooms = this.getRooms();
                    strategy.appendField(locator, this, "rooms", buffer, theRooms);
                }
                {
                    BigInteger theOccupationstate;
                    theOccupationstate = this.getOccupationstate();
                    strategy.appendField(locator, this, "occupationstate", buffer, theOccupationstate);
                }
                {
                    BigInteger theRealestatetype;
                    theRealestatetype = this.getRealestatetype();
                    strategy.appendField(locator, this, "realestatetype", buffer, theRealestatetype);
                }
                {
                    BigInteger theSize;
                    theSize = this.getSize();
                    strategy.appendField(locator, this, "size", buffer, theSize);
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
                if (draftCopy instanceof Container.Realestateitems.Realestate) {
                    final Container.Realestateitems.Realestate copy = ((Container.Realestateitems.Realestate) draftCopy);
                    if (this.address!= null) {
                        Container.Realestateitems.Realestate.Address sourceAddress;
                        sourceAddress = this.getAddress();
                        Container.Realestateitems.Realestate.Address copyAddress = ((Container.Realestateitems.Realestate.Address) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress));
                        copy.setAddress(copyAddress);
                    } else {
                        copy.address = null;
                    }
                    if (this.description!= null) {
                        Container.Realestateitems.Realestate.Description sourceDescription;
                        sourceDescription = this.getDescription();
                        Container.Realestateitems.Realestate.Description copyDescription = ((Container.Realestateitems.Realestate.Description) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription));
                        copy.setDescription(copyDescription);
                    } else {
                        copy.description = null;
                    }
                    if (this.building!= null) {
                        Container.Realestateitems.Realestate.Building sourceBuilding;
                        sourceBuilding = this.getBuilding();
                        Container.Realestateitems.Realestate.Building copyBuilding = ((Container.Realestateitems.Realestate.Building) strategy.copy(LocatorUtils.property(locator, "building", sourceBuilding), sourceBuilding));
                        copy.setBuilding(copyBuilding);
                    } else {
                        copy.building = null;
                    }
                    if (this.price!= null) {
                        Container.Realestateitems.Realestate.Price sourcePrice;
                        sourcePrice = this.getPrice();
                        Container.Realestateitems.Realestate.Price copyPrice = ((Container.Realestateitems.Realestate.Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                        copy.setPrice(copyPrice);
                    } else {
                        copy.price = null;
                    }
                    if (this.box!= null) {
                        Container.Realestateitems.Realestate.Box sourceBox;
                        sourceBox = this.getBox();
                        Container.Realestateitems.Realestate.Box copyBox = ((Container.Realestateitems.Realestate.Box) strategy.copy(LocatorUtils.property(locator, "box", sourceBox), sourceBox));
                        copy.setBox(copyBox);
                    } else {
                        copy.box = null;
                    }
                    if (this.garden!= null) {
                        Container.Realestateitems.Realestate.Garden sourceGarden;
                        sourceGarden = this.getGarden();
                        Container.Realestateitems.Realestate.Garden copyGarden = ((Container.Realestateitems.Realestate.Garden) strategy.copy(LocatorUtils.property(locator, "garden", sourceGarden), sourceGarden));
                        copy.setGarden(copyGarden);
                    } else {
                        copy.garden = null;
                    }
                    if (this.configuration!= null) {
                        Container.Realestateitems.Realestate.Configuration sourceConfiguration;
                        sourceConfiguration = this.getConfiguration();
                        Container.Realestateitems.Realestate.Configuration copyConfiguration = ((Container.Realestateitems.Realestate.Configuration) strategy.copy(LocatorUtils.property(locator, "configuration", sourceConfiguration), sourceConfiguration));
                        copy.setConfiguration(copyConfiguration);
                    } else {
                        copy.configuration = null;
                    }
                    if (this.googlemapcoordinate!= null) {
                        Container.Realestateitems.Realestate.Googlemapcoordinate sourceGooglemapcoordinate;
                        sourceGooglemapcoordinate = this.getGooglemapcoordinate();
                        Container.Realestateitems.Realestate.Googlemapcoordinate copyGooglemapcoordinate = ((Container.Realestateitems.Realestate.Googlemapcoordinate) strategy.copy(LocatorUtils.property(locator, "googlemapcoordinate", sourceGooglemapcoordinate), sourceGooglemapcoordinate));
                        copy.setGooglemapcoordinate(copyGooglemapcoordinate);
                    } else {
                        copy.googlemapcoordinate = null;
                    }
                    if (this.images!= null) {
                        Container.Realestateitems.Realestate.Images sourceImages;
                        sourceImages = this.getImages();
                        Container.Realestateitems.Realestate.Images copyImages = ((Container.Realestateitems.Realestate.Images) strategy.copy(LocatorUtils.property(locator, "images", sourceImages), sourceImages));
                        copy.setImages(copyImages);
                    } else {
                        copy.images = null;
                    }
                    if (this.action!= null) {
                        BigInteger sourceAction;
                        sourceAction = this.getAction();
                        BigInteger copyAction = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "action", sourceAction), sourceAction));
                        copy.setAction(copyAction);
                    } else {
                        copy.action = null;
                    }
                    {
                        int sourceAgencycode;
                        sourceAgencycode = this.getAgencycode();
                        int copyAgencycode = strategy.copy(LocatorUtils.property(locator, "agencycode", sourceAgencycode), sourceAgencycode);
                        copy.setAgencycode(copyAgencycode);
                    }
                    if (this.reference!= null) {
                        String sourceReference;
                        sourceReference = this.getReference();
                        String copyReference = ((String) strategy.copy(LocatorUtils.property(locator, "reference", sourceReference), sourceReference));
                        copy.setReference(copyReference);
                    } else {
                        copy.reference = null;
                    }
                    if (this.referenceID!= null) {
                        Integer sourceReferenceID;
                        sourceReferenceID = this.getReferenceID();
                        Integer copyReferenceID = ((Integer) strategy.copy(LocatorUtils.property(locator, "referenceID", sourceReferenceID), sourceReferenceID));
                        copy.setReferenceID(copyReferenceID);
                    } else {
                        copy.referenceID = null;
                    }
                    if (this.contracttype!= null) {
                        BigInteger sourceContracttype;
                        sourceContracttype = this.getContracttype();
                        BigInteger copyContracttype = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "contracttype", sourceContracttype), sourceContracttype));
                        copy.setContracttype(copyContracttype);
                    } else {
                        copy.contracttype = null;
                    }
                    if (this.condition!= null) {
                        BigInteger sourceCondition;
                        sourceCondition = this.getCondition();
                        BigInteger copyCondition = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "condition", sourceCondition), sourceCondition));
                        copy.setCondition(copyCondition);
                    } else {
                        copy.condition = null;
                    }
                    if (this.hasbalcony!= null) {
                        Boolean sourceHasbalcony;
                        sourceHasbalcony = this.isHasbalcony();
                        Boolean copyHasbalcony = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hasbalcony", sourceHasbalcony), sourceHasbalcony));
                        copy.setHasbalcony(copyHasbalcony);
                    } else {
                        copy.hasbalcony = null;
                    }
                    if (this.hasterrace!= null) {
                        Boolean sourceHasterrace;
                        sourceHasterrace = this.isHasterrace();
                        Boolean copyHasterrace = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hasterrace", sourceHasterrace), sourceHasterrace));
                        copy.setHasterrace(copyHasterrace);
                    } else {
                        copy.hasterrace = null;
                    }
                    if (this.heatingtype!= null) {
                        BigInteger sourceHeatingtype;
                        sourceHeatingtype = this.getHeatingtype();
                        BigInteger copyHeatingtype = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "heatingtype", sourceHeatingtype), sourceHeatingtype));
                        copy.setHeatingtype(copyHeatingtype);
                    } else {
                        copy.heatingtype = null;
                    }
                    if (this.housetypology!= null) {
                        BigInteger sourceHousetypology;
                        sourceHousetypology = this.getHousetypology();
                        BigInteger copyHousetypology = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "housetypology", sourceHousetypology), sourceHousetypology));
                        copy.setHousetypology(copyHousetypology);
                    } else {
                        copy.housetypology = null;
                    }
                    if (this.bathrooms!= null) {
                        BigInteger sourceBathrooms;
                        sourceBathrooms = this.getBathrooms();
                        BigInteger copyBathrooms = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "bathrooms", sourceBathrooms), sourceBathrooms));
                        copy.setBathrooms(copyBathrooms);
                    } else {
                        copy.bathrooms = null;
                    }
                    if (this.floor!= null) {
                        BigInteger sourceFloor;
                        sourceFloor = this.getFloor();
                        BigInteger copyFloor = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "floor", sourceFloor), sourceFloor));
                        copy.setFloor(copyFloor);
                    } else {
                        copy.floor = null;
                    }
                    if (this.rooms!= null) {
                        BigInteger sourceRooms;
                        sourceRooms = this.getRooms();
                        BigInteger copyRooms = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "rooms", sourceRooms), sourceRooms));
                        copy.setRooms(copyRooms);
                    } else {
                        copy.rooms = null;
                    }
                    if (this.occupationstate!= null) {
                        BigInteger sourceOccupationstate;
                        sourceOccupationstate = this.getOccupationstate();
                        BigInteger copyOccupationstate = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "occupationstate", sourceOccupationstate), sourceOccupationstate));
                        copy.setOccupationstate(copyOccupationstate);
                    } else {
                        copy.occupationstate = null;
                    }
                    if (this.realestatetype!= null) {
                        BigInteger sourceRealestatetype;
                        sourceRealestatetype = this.getRealestatetype();
                        BigInteger copyRealestatetype = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "realestatetype", sourceRealestatetype), sourceRealestatetype));
                        copy.setRealestatetype(copyRealestatetype);
                    } else {
                        copy.realestatetype = null;
                    }
                    if (this.size!= null) {
                        BigInteger sourceSize;
                        sourceSize = this.getSize();
                        BigInteger copySize = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "size", sourceSize), sourceSize));
                        copy.setSize(copySize);
                    } else {
                        copy.size = null;
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new Container.Realestateitems.Realestate();
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Description lhsDescription;
                    lhsDescription = this.getDescription();
                    Container.Realestateitems.Realestate.Description rhsDescription;
                    rhsDescription = that.getDescription();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Building lhsBuilding;
                    lhsBuilding = this.getBuilding();
                    Container.Realestateitems.Realestate.Building rhsBuilding;
                    rhsBuilding = that.getBuilding();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "building", lhsBuilding), LocatorUtils.property(thatLocator, "building", rhsBuilding), lhsBuilding, rhsBuilding)) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Price lhsPrice;
                    lhsPrice = this.getPrice();
                    Container.Realestateitems.Realestate.Price rhsPrice;
                    rhsPrice = that.getPrice();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Box lhsBox;
                    lhsBox = this.getBox();
                    Container.Realestateitems.Realestate.Box rhsBox;
                    rhsBox = that.getBox();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "box", lhsBox), LocatorUtils.property(thatLocator, "box", rhsBox), lhsBox, rhsBox)) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Garden lhsGarden;
                    lhsGarden = this.getGarden();
                    Container.Realestateitems.Realestate.Garden rhsGarden;
                    rhsGarden = that.getGarden();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "garden", lhsGarden), LocatorUtils.property(thatLocator, "garden", rhsGarden), lhsGarden, rhsGarden)) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Configuration lhsConfiguration;
                    lhsConfiguration = this.getConfiguration();
                    Container.Realestateitems.Realestate.Configuration rhsConfiguration;
                    rhsConfiguration = that.getConfiguration();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "configuration", lhsConfiguration), LocatorUtils.property(thatLocator, "configuration", rhsConfiguration), lhsConfiguration, rhsConfiguration)) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Googlemapcoordinate lhsGooglemapcoordinate;
                    lhsGooglemapcoordinate = this.getGooglemapcoordinate();
                    Container.Realestateitems.Realestate.Googlemapcoordinate rhsGooglemapcoordinate;
                    rhsGooglemapcoordinate = that.getGooglemapcoordinate();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "googlemapcoordinate", lhsGooglemapcoordinate), LocatorUtils.property(thatLocator, "googlemapcoordinate", rhsGooglemapcoordinate), lhsGooglemapcoordinate, rhsGooglemapcoordinate)) {
                        return false;
                    }
                }
                {
                    Container.Realestateitems.Realestate.Images lhsImages;
                    lhsImages = this.getImages();
                    Container.Realestateitems.Realestate.Images rhsImages;
                    rhsImages = that.getImages();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "images", lhsImages), LocatorUtils.property(thatLocator, "images", rhsImages), lhsImages, rhsImages)) {
                        return false;
                    }
                }
                {
                    BigInteger lhsAction;
                    lhsAction = this.getAction();
                    BigInteger rhsAction;
                    rhsAction = that.getAction();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "action", lhsAction), LocatorUtils.property(thatLocator, "action", rhsAction), lhsAction, rhsAction)) {
                        return false;
                    }
                }
                {
                    int lhsAgencycode;
                    lhsAgencycode = this.getAgencycode();
                    int rhsAgencycode;
                    rhsAgencycode = that.getAgencycode();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "agencycode", lhsAgencycode), LocatorUtils.property(thatLocator, "agencycode", rhsAgencycode), lhsAgencycode, rhsAgencycode)) {
                        return false;
                    }
                }
                {
                    String lhsReference;
                    lhsReference = this.getReference();
                    String rhsReference;
                    rhsReference = that.getReference();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "reference", lhsReference), LocatorUtils.property(thatLocator, "reference", rhsReference), lhsReference, rhsReference)) {
                        return false;
                    }
                }
                {
                    Integer lhsReferenceID;
                    lhsReferenceID = this.getReferenceID();
                    Integer rhsReferenceID;
                    rhsReferenceID = that.getReferenceID();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceID", lhsReferenceID), LocatorUtils.property(thatLocator, "referenceID", rhsReferenceID), lhsReferenceID, rhsReferenceID)) {
                        return false;
                    }
                }
                {
                    BigInteger lhsContracttype;
                    lhsContracttype = this.getContracttype();
                    BigInteger rhsContracttype;
                    rhsContracttype = that.getContracttype();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "contracttype", lhsContracttype), LocatorUtils.property(thatLocator, "contracttype", rhsContracttype), lhsContracttype, rhsContracttype)) {
                        return false;
                    }
                }
                {
                    BigInteger lhsCondition;
                    lhsCondition = this.getCondition();
                    BigInteger rhsCondition;
                    rhsCondition = that.getCondition();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "condition", lhsCondition), LocatorUtils.property(thatLocator, "condition", rhsCondition), lhsCondition, rhsCondition)) {
                        return false;
                    }
                }
                {
                    Boolean lhsHasbalcony;
                    lhsHasbalcony = this.isHasbalcony();
                    Boolean rhsHasbalcony;
                    rhsHasbalcony = that.isHasbalcony();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "hasbalcony", lhsHasbalcony), LocatorUtils.property(thatLocator, "hasbalcony", rhsHasbalcony), lhsHasbalcony, rhsHasbalcony)) {
                        return false;
                    }
                }
                {
                    Boolean lhsHasterrace;
                    lhsHasterrace = this.isHasterrace();
                    Boolean rhsHasterrace;
                    rhsHasterrace = that.isHasterrace();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "hasterrace", lhsHasterrace), LocatorUtils.property(thatLocator, "hasterrace", rhsHasterrace), lhsHasterrace, rhsHasterrace)) {
                        return false;
                    }
                }
                {
                    BigInteger lhsHeatingtype;
                    lhsHeatingtype = this.getHeatingtype();
                    BigInteger rhsHeatingtype;
                    rhsHeatingtype = that.getHeatingtype();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingtype", lhsHeatingtype), LocatorUtils.property(thatLocator, "heatingtype", rhsHeatingtype), lhsHeatingtype, rhsHeatingtype)) {
                        return false;
                    }
                }
                {
                    BigInteger lhsHousetypology;
                    lhsHousetypology = this.getHousetypology();
                    BigInteger rhsHousetypology;
                    rhsHousetypology = that.getHousetypology();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "housetypology", lhsHousetypology), LocatorUtils.property(thatLocator, "housetypology", rhsHousetypology), lhsHousetypology, rhsHousetypology)) {
                        return false;
                    }
                }
                {
                    BigInteger lhsBathrooms;
                    lhsBathrooms = this.getBathrooms();
                    BigInteger rhsBathrooms;
                    rhsBathrooms = that.getBathrooms();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "bathrooms", lhsBathrooms), LocatorUtils.property(thatLocator, "bathrooms", rhsBathrooms), lhsBathrooms, rhsBathrooms)) {
                        return false;
                    }
                }
                {
                    BigInteger lhsFloor;
                    lhsFloor = this.getFloor();
                    BigInteger rhsFloor;
                    rhsFloor = that.getFloor();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor)) {
                        return false;
                    }
                }
                {
                    BigInteger lhsRooms;
                    lhsRooms = this.getRooms();
                    BigInteger rhsRooms;
                    rhsRooms = that.getRooms();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "rooms", lhsRooms), LocatorUtils.property(thatLocator, "rooms", rhsRooms), lhsRooms, rhsRooms)) {
                        return false;
                    }
                }
                {
                    BigInteger lhsOccupationstate;
                    lhsOccupationstate = this.getOccupationstate();
                    BigInteger rhsOccupationstate;
                    rhsOccupationstate = that.getOccupationstate();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "occupationstate", lhsOccupationstate), LocatorUtils.property(thatLocator, "occupationstate", rhsOccupationstate), lhsOccupationstate, rhsOccupationstate)) {
                        return false;
                    }
                }
                {
                    BigInteger lhsRealestatetype;
                    lhsRealestatetype = this.getRealestatetype();
                    BigInteger rhsRealestatetype;
                    rhsRealestatetype = that.getRealestatetype();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "realestatetype", lhsRealestatetype), LocatorUtils.property(thatLocator, "realestatetype", rhsRealestatetype), lhsRealestatetype, rhsRealestatetype)) {
                        return false;
                    }
                }
                {
                    BigInteger lhsSize;
                    lhsSize = this.getSize();
                    BigInteger rhsSize;
                    rhsSize = that.getSize();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize)) {
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
            public static class Address
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlAttribute(name = "city", required = true)
                protected String city;
                @XmlAttribute(name = "zone")
                protected String zone;
                @XmlAttribute(name = "street")
                protected String street;
                @XmlAttribute(name = "number")
                protected String number;
                @XmlAttribute(name = "zip")
                protected String zip;

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
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
                public void setZip(String value) {
                    this.zip = value;
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
                        String theCity;
                        theCity = this.getCity();
                        strategy.appendField(locator, this, "city", buffer, theCity);
                    }
                    {
                        String theZone;
                        theZone = this.getZone();
                        strategy.appendField(locator, this, "zone", buffer, theZone);
                    }
                    {
                        String theStreet;
                        theStreet = this.getStreet();
                        strategy.appendField(locator, this, "street", buffer, theStreet);
                    }
                    {
                        String theNumber;
                        theNumber = this.getNumber();
                        strategy.appendField(locator, this, "number", buffer, theNumber);
                    }
                    {
                        String theZip;
                        theZip = this.getZip();
                        strategy.appendField(locator, this, "zip", buffer, theZip);
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
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Address) {
                        final Container.Realestateitems.Realestate.Address copy = ((Container.Realestateitems.Realestate.Address) draftCopy);
                        if (this.city!= null) {
                            String sourceCity;
                            sourceCity = this.getCity();
                            String copyCity = ((String) strategy.copy(LocatorUtils.property(locator, "city", sourceCity), sourceCity));
                            copy.setCity(copyCity);
                        } else {
                            copy.city = null;
                        }
                        if (this.zone!= null) {
                            String sourceZone;
                            sourceZone = this.getZone();
                            String copyZone = ((String) strategy.copy(LocatorUtils.property(locator, "zone", sourceZone), sourceZone));
                            copy.setZone(copyZone);
                        } else {
                            copy.zone = null;
                        }
                        if (this.street!= null) {
                            String sourceStreet;
                            sourceStreet = this.getStreet();
                            String copyStreet = ((String) strategy.copy(LocatorUtils.property(locator, "street", sourceStreet), sourceStreet));
                            copy.setStreet(copyStreet);
                        } else {
                            copy.street = null;
                        }
                        if (this.number!= null) {
                            String sourceNumber;
                            sourceNumber = this.getNumber();
                            String copyNumber = ((String) strategy.copy(LocatorUtils.property(locator, "number", sourceNumber), sourceNumber));
                            copy.setNumber(copyNumber);
                        } else {
                            copy.number = null;
                        }
                        if (this.zip!= null) {
                            String sourceZip;
                            sourceZip = this.getZip();
                            String copyZip = ((String) strategy.copy(LocatorUtils.property(locator, "zip", sourceZip), sourceZip));
                            copy.setZip(copyZip);
                        } else {
                            copy.zip = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Address();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity)) {
                            return false;
                        }
                    }
                    {
                        String lhsZone;
                        lhsZone = this.getZone();
                        String rhsZone;
                        rhsZone = that.getZone();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "zone", lhsZone), LocatorUtils.property(thatLocator, "zone", rhsZone), lhsZone, rhsZone)) {
                            return false;
                        }
                    }
                    {
                        String lhsStreet;
                        lhsStreet = this.getStreet();
                        String rhsStreet;
                        rhsStreet = that.getStreet();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "street", lhsStreet), LocatorUtils.property(thatLocator, "street", rhsStreet), lhsStreet, rhsStreet)) {
                            return false;
                        }
                    }
                    {
                        String lhsNumber;
                        lhsNumber = this.getNumber();
                        String rhsNumber;
                        rhsNumber = that.getNumber();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "number", lhsNumber), LocatorUtils.property(thatLocator, "number", rhsNumber), lhsNumber, rhsNumber)) {
                            return false;
                        }
                    }
                    {
                        String lhsZip;
                        lhsZip = this.getZip();
                        String rhsZip;
                        rhsZip = that.getZip();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "zip", lhsZip), LocatorUtils.property(thatLocator, "zip", rhsZip), lhsZip, rhsZip)) {
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
            public static class Box
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlAttribute(name = "size")
                protected BigInteger size;
                @XmlAttribute(name = "type")
                protected BigInteger type;

                /**
                 * Gets the value of the size property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
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
                public void setType(BigInteger value) {
                    this.type = value;
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
                        BigInteger theSize;
                        theSize = this.getSize();
                        strategy.appendField(locator, this, "size", buffer, theSize);
                    }
                    {
                        BigInteger theType;
                        theType = this.getType();
                        strategy.appendField(locator, this, "type", buffer, theType);
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
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Box) {
                        final Container.Realestateitems.Realestate.Box copy = ((Container.Realestateitems.Realestate.Box) draftCopy);
                        if (this.size!= null) {
                            BigInteger sourceSize;
                            sourceSize = this.getSize();
                            BigInteger copySize = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "size", sourceSize), sourceSize));
                            copy.setSize(copySize);
                        } else {
                            copy.size = null;
                        }
                        if (this.type!= null) {
                            BigInteger sourceType;
                            sourceType = this.getType();
                            BigInteger copyType = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType));
                            copy.setType(copyType);
                        } else {
                            copy.type = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Box();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize)) {
                            return false;
                        }
                    }
                    {
                        BigInteger lhsType;
                        lhsType = this.getType();
                        BigInteger rhsType;
                        rhsType = that.getType();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
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
            public static class Building
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlAttribute(name = "age")
                protected BigInteger age;
                @XmlAttribute(name = "expenses")
                protected BigDecimal expenses;
                @XmlAttribute(name = "units")
                protected BigInteger units;
                @XmlAttribute(name = "totalfloors")
                protected BigInteger totalfloors;
                @XmlAttribute(name = "haslift")
                protected Boolean haslift;

                /**
                 * Gets the value of the age property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
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
                public Boolean isHaslift() {
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
                public void setHaslift(Boolean value) {
                    this.haslift = value;
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
                        BigInteger theAge;
                        theAge = this.getAge();
                        strategy.appendField(locator, this, "age", buffer, theAge);
                    }
                    {
                        BigDecimal theExpenses;
                        theExpenses = this.getExpenses();
                        strategy.appendField(locator, this, "expenses", buffer, theExpenses);
                    }
                    {
                        BigInteger theUnits;
                        theUnits = this.getUnits();
                        strategy.appendField(locator, this, "units", buffer, theUnits);
                    }
                    {
                        BigInteger theTotalfloors;
                        theTotalfloors = this.getTotalfloors();
                        strategy.appendField(locator, this, "totalfloors", buffer, theTotalfloors);
                    }
                    {
                        Boolean theHaslift;
                        theHaslift = this.isHaslift();
                        strategy.appendField(locator, this, "haslift", buffer, theHaslift);
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
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Building) {
                        final Container.Realestateitems.Realestate.Building copy = ((Container.Realestateitems.Realestate.Building) draftCopy);
                        if (this.age!= null) {
                            BigInteger sourceAge;
                            sourceAge = this.getAge();
                            BigInteger copyAge = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "age", sourceAge), sourceAge));
                            copy.setAge(copyAge);
                        } else {
                            copy.age = null;
                        }
                        if (this.expenses!= null) {
                            BigDecimal sourceExpenses;
                            sourceExpenses = this.getExpenses();
                            BigDecimal copyExpenses = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "expenses", sourceExpenses), sourceExpenses));
                            copy.setExpenses(copyExpenses);
                        } else {
                            copy.expenses = null;
                        }
                        if (this.units!= null) {
                            BigInteger sourceUnits;
                            sourceUnits = this.getUnits();
                            BigInteger copyUnits = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "units", sourceUnits), sourceUnits));
                            copy.setUnits(copyUnits);
                        } else {
                            copy.units = null;
                        }
                        if (this.totalfloors!= null) {
                            BigInteger sourceTotalfloors;
                            sourceTotalfloors = this.getTotalfloors();
                            BigInteger copyTotalfloors = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "totalfloors", sourceTotalfloors), sourceTotalfloors));
                            copy.setTotalfloors(copyTotalfloors);
                        } else {
                            copy.totalfloors = null;
                        }
                        if (this.haslift!= null) {
                            Boolean sourceHaslift;
                            sourceHaslift = this.isHaslift();
                            Boolean copyHaslift = ((Boolean) strategy.copy(LocatorUtils.property(locator, "haslift", sourceHaslift), sourceHaslift));
                            copy.setHaslift(copyHaslift);
                        } else {
                            copy.haslift = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Building();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "age", lhsAge), LocatorUtils.property(thatLocator, "age", rhsAge), lhsAge, rhsAge)) {
                            return false;
                        }
                    }
                    {
                        BigDecimal lhsExpenses;
                        lhsExpenses = this.getExpenses();
                        BigDecimal rhsExpenses;
                        rhsExpenses = that.getExpenses();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "expenses", lhsExpenses), LocatorUtils.property(thatLocator, "expenses", rhsExpenses), lhsExpenses, rhsExpenses)) {
                            return false;
                        }
                    }
                    {
                        BigInteger lhsUnits;
                        lhsUnits = this.getUnits();
                        BigInteger rhsUnits;
                        rhsUnits = that.getUnits();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "units", lhsUnits), LocatorUtils.property(thatLocator, "units", rhsUnits), lhsUnits, rhsUnits)) {
                            return false;
                        }
                    }
                    {
                        BigInteger lhsTotalfloors;
                        lhsTotalfloors = this.getTotalfloors();
                        BigInteger rhsTotalfloors;
                        rhsTotalfloors = that.getTotalfloors();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "totalfloors", lhsTotalfloors), LocatorUtils.property(thatLocator, "totalfloors", rhsTotalfloors), lhsTotalfloors, rhsTotalfloors)) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsHaslift;
                        lhsHaslift = this.isHaslift();
                        Boolean rhsHaslift;
                        rhsHaslift = that.isHaslift();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "haslift", lhsHaslift), LocatorUtils.property(thatLocator, "haslift", rhsHaslift), lhsHaslift, rhsHaslift)) {
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
            public static class Configuration
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlAttribute(name = "isaddressvisibleonsite")
                protected Boolean isaddressvisibleonsite;
                @XmlAttribute(name = "ismapvisible")
                protected Boolean ismapvisible;
                @XmlAttribute(name = "isrealestatevisibleonmap")
                protected Boolean isrealestatevisibleonmap;

                /**
                 * Gets the value of the isaddressvisibleonsite property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isIsaddressvisibleonsite() {
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
                public boolean isIsmapvisible() {
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
                public boolean isIsrealestatevisibleonmap() {
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
                public void setIsrealestatevisibleonmap(Boolean value) {
                    this.isrealestatevisibleonmap = value;
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
                        boolean theIsaddressvisibleonsite;
                        theIsaddressvisibleonsite = ((this.isaddressvisibleonsite!= null)?this.isIsaddressvisibleonsite():false);
                        strategy.appendField(locator, this, "isaddressvisibleonsite", buffer, theIsaddressvisibleonsite);
                    }
                    {
                        boolean theIsmapvisible;
                        theIsmapvisible = ((this.ismapvisible!= null)?this.isIsmapvisible():false);
                        strategy.appendField(locator, this, "ismapvisible", buffer, theIsmapvisible);
                    }
                    {
                        boolean theIsrealestatevisibleonmap;
                        theIsrealestatevisibleonmap = ((this.isrealestatevisibleonmap!= null)?this.isIsrealestatevisibleonmap():false);
                        strategy.appendField(locator, this, "isrealestatevisibleonmap", buffer, theIsrealestatevisibleonmap);
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
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Configuration) {
                        final Container.Realestateitems.Realestate.Configuration copy = ((Container.Realestateitems.Realestate.Configuration) draftCopy);
                        if (this.isaddressvisibleonsite!= null) {
                            boolean sourceIsaddressvisibleonsite;
                            sourceIsaddressvisibleonsite = ((this.isaddressvisibleonsite!= null)?this.isIsaddressvisibleonsite():false);
                            boolean copyIsaddressvisibleonsite = strategy.copy(LocatorUtils.property(locator, "isaddressvisibleonsite", sourceIsaddressvisibleonsite), sourceIsaddressvisibleonsite);
                            copy.setIsaddressvisibleonsite(copyIsaddressvisibleonsite);
                        } else {
                            copy.isaddressvisibleonsite = null;
                        }
                        if (this.ismapvisible!= null) {
                            boolean sourceIsmapvisible;
                            sourceIsmapvisible = ((this.ismapvisible!= null)?this.isIsmapvisible():false);
                            boolean copyIsmapvisible = strategy.copy(LocatorUtils.property(locator, "ismapvisible", sourceIsmapvisible), sourceIsmapvisible);
                            copy.setIsmapvisible(copyIsmapvisible);
                        } else {
                            copy.ismapvisible = null;
                        }
                        if (this.isrealestatevisibleonmap!= null) {
                            boolean sourceIsrealestatevisibleonmap;
                            sourceIsrealestatevisibleonmap = ((this.isrealestatevisibleonmap!= null)?this.isIsrealestatevisibleonmap():false);
                            boolean copyIsrealestatevisibleonmap = strategy.copy(LocatorUtils.property(locator, "isrealestatevisibleonmap", sourceIsrealestatevisibleonmap), sourceIsrealestatevisibleonmap);
                            copy.setIsrealestatevisibleonmap(copyIsrealestatevisibleonmap);
                        } else {
                            copy.isrealestatevisibleonmap = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Configuration();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Container.Realestateitems.Realestate.Configuration that = ((Container.Realestateitems.Realestate.Configuration) object);
                    {
                        boolean lhsIsaddressvisibleonsite;
                        lhsIsaddressvisibleonsite = ((this.isaddressvisibleonsite!= null)?this.isIsaddressvisibleonsite():false);
                        boolean rhsIsaddressvisibleonsite;
                        rhsIsaddressvisibleonsite = ((that.isaddressvisibleonsite!= null)?that.isIsaddressvisibleonsite():false);
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "isaddressvisibleonsite", lhsIsaddressvisibleonsite), LocatorUtils.property(thatLocator, "isaddressvisibleonsite", rhsIsaddressvisibleonsite), lhsIsaddressvisibleonsite, rhsIsaddressvisibleonsite)) {
                            return false;
                        }
                    }
                    {
                        boolean lhsIsmapvisible;
                        lhsIsmapvisible = ((this.ismapvisible!= null)?this.isIsmapvisible():false);
                        boolean rhsIsmapvisible;
                        rhsIsmapvisible = ((that.ismapvisible!= null)?that.isIsmapvisible():false);
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "ismapvisible", lhsIsmapvisible), LocatorUtils.property(thatLocator, "ismapvisible", rhsIsmapvisible), lhsIsmapvisible, rhsIsmapvisible)) {
                            return false;
                        }
                    }
                    {
                        boolean lhsIsrealestatevisibleonmap;
                        lhsIsrealestatevisibleonmap = ((this.isrealestatevisibleonmap!= null)?this.isIsrealestatevisibleonmap():false);
                        boolean rhsIsrealestatevisibleonmap;
                        rhsIsrealestatevisibleonmap = ((that.isrealestatevisibleonmap!= null)?that.isIsrealestatevisibleonmap():false);
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "isrealestatevisibleonmap", lhsIsrealestatevisibleonmap), LocatorUtils.property(thatLocator, "isrealestatevisibleonmap", rhsIsrealestatevisibleonmap), lhsIsrealestatevisibleonmap, rhsIsrealestatevisibleonmap)) {
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
            public static class Description
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlAttribute(name = "value", required = true)
                protected String value;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
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
                public void setValue(String value) {
                    this.value = value;
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
                        String theValue;
                        theValue = this.getValue();
                        strategy.appendField(locator, this, "value", buffer, theValue);
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
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Description) {
                        final Container.Realestateitems.Realestate.Description copy = ((Container.Realestateitems.Realestate.Description) draftCopy);
                        if (this.value!= null) {
                            String sourceValue;
                            sourceValue = this.getValue();
                            String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                            copy.setValue(copyValue);
                        } else {
                            copy.value = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Description();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
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
            public static class Garden
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlAttribute(name = "size")
                protected BigInteger size;
                @XmlAttribute(name = "type")
                protected BigInteger type;

                /**
                 * Gets the value of the size property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
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
                public void setType(BigInteger value) {
                    this.type = value;
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
                        BigInteger theSize;
                        theSize = this.getSize();
                        strategy.appendField(locator, this, "size", buffer, theSize);
                    }
                    {
                        BigInteger theType;
                        theType = this.getType();
                        strategy.appendField(locator, this, "type", buffer, theType);
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
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Garden) {
                        final Container.Realestateitems.Realestate.Garden copy = ((Container.Realestateitems.Realestate.Garden) draftCopy);
                        if (this.size!= null) {
                            BigInteger sourceSize;
                            sourceSize = this.getSize();
                            BigInteger copySize = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "size", sourceSize), sourceSize));
                            copy.setSize(copySize);
                        } else {
                            copy.size = null;
                        }
                        if (this.type!= null) {
                            BigInteger sourceType;
                            sourceType = this.getType();
                            BigInteger copyType = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType));
                            copy.setType(copyType);
                        } else {
                            copy.type = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Garden();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize)) {
                            return false;
                        }
                    }
                    {
                        BigInteger lhsType;
                        lhsType = this.getType();
                        BigInteger rhsType;
                        rhsType = that.getType();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
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
            public static class Googlemapcoordinate
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlAttribute(name = "latitude")
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "double")
                protected BigDecimal latitude;
                @XmlAttribute(name = "longitude")
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "double")
                protected BigDecimal longitude;
                @XmlAttribute(name = "mapzoom")
                protected Integer mapzoom;
                @XmlAttribute(name = "latitudemapcenter")
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "double")
                protected BigDecimal latitudemapcenter;
                @XmlAttribute(name = "longitudemapcenter")
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "double")
                protected BigDecimal longitudemapcenter;

                /**
                 * Gets the value of the latitude property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
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
                public void setLongitudemapcenter(BigDecimal value) {
                    this.longitudemapcenter = value;
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
                        BigDecimal theLatitude;
                        theLatitude = this.getLatitude();
                        strategy.appendField(locator, this, "latitude", buffer, theLatitude);
                    }
                    {
                        BigDecimal theLongitude;
                        theLongitude = this.getLongitude();
                        strategy.appendField(locator, this, "longitude", buffer, theLongitude);
                    }
                    {
                        Integer theMapzoom;
                        theMapzoom = this.getMapzoom();
                        strategy.appendField(locator, this, "mapzoom", buffer, theMapzoom);
                    }
                    {
                        BigDecimal theLatitudemapcenter;
                        theLatitudemapcenter = this.getLatitudemapcenter();
                        strategy.appendField(locator, this, "latitudemapcenter", buffer, theLatitudemapcenter);
                    }
                    {
                        BigDecimal theLongitudemapcenter;
                        theLongitudemapcenter = this.getLongitudemapcenter();
                        strategy.appendField(locator, this, "longitudemapcenter", buffer, theLongitudemapcenter);
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
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Googlemapcoordinate) {
                        final Container.Realestateitems.Realestate.Googlemapcoordinate copy = ((Container.Realestateitems.Realestate.Googlemapcoordinate) draftCopy);
                        if (this.latitude!= null) {
                            BigDecimal sourceLatitude;
                            sourceLatitude = this.getLatitude();
                            BigDecimal copyLatitude = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "latitude", sourceLatitude), sourceLatitude));
                            copy.setLatitude(copyLatitude);
                        } else {
                            copy.latitude = null;
                        }
                        if (this.longitude!= null) {
                            BigDecimal sourceLongitude;
                            sourceLongitude = this.getLongitude();
                            BigDecimal copyLongitude = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "longitude", sourceLongitude), sourceLongitude));
                            copy.setLongitude(copyLongitude);
                        } else {
                            copy.longitude = null;
                        }
                        if (this.mapzoom!= null) {
                            Integer sourceMapzoom;
                            sourceMapzoom = this.getMapzoom();
                            Integer copyMapzoom = ((Integer) strategy.copy(LocatorUtils.property(locator, "mapzoom", sourceMapzoom), sourceMapzoom));
                            copy.setMapzoom(copyMapzoom);
                        } else {
                            copy.mapzoom = null;
                        }
                        if (this.latitudemapcenter!= null) {
                            BigDecimal sourceLatitudemapcenter;
                            sourceLatitudemapcenter = this.getLatitudemapcenter();
                            BigDecimal copyLatitudemapcenter = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "latitudemapcenter", sourceLatitudemapcenter), sourceLatitudemapcenter));
                            copy.setLatitudemapcenter(copyLatitudemapcenter);
                        } else {
                            copy.latitudemapcenter = null;
                        }
                        if (this.longitudemapcenter!= null) {
                            BigDecimal sourceLongitudemapcenter;
                            sourceLongitudemapcenter = this.getLongitudemapcenter();
                            BigDecimal copyLongitudemapcenter = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "longitudemapcenter", sourceLongitudemapcenter), sourceLongitudemapcenter));
                            copy.setLongitudemapcenter(copyLongitudemapcenter);
                        } else {
                            copy.longitudemapcenter = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Googlemapcoordinate();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "latitude", lhsLatitude), LocatorUtils.property(thatLocator, "latitude", rhsLatitude), lhsLatitude, rhsLatitude)) {
                            return false;
                        }
                    }
                    {
                        BigDecimal lhsLongitude;
                        lhsLongitude = this.getLongitude();
                        BigDecimal rhsLongitude;
                        rhsLongitude = that.getLongitude();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "longitude", lhsLongitude), LocatorUtils.property(thatLocator, "longitude", rhsLongitude), lhsLongitude, rhsLongitude)) {
                            return false;
                        }
                    }
                    {
                        Integer lhsMapzoom;
                        lhsMapzoom = this.getMapzoom();
                        Integer rhsMapzoom;
                        rhsMapzoom = that.getMapzoom();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "mapzoom", lhsMapzoom), LocatorUtils.property(thatLocator, "mapzoom", rhsMapzoom), lhsMapzoom, rhsMapzoom)) {
                            return false;
                        }
                    }
                    {
                        BigDecimal lhsLatitudemapcenter;
                        lhsLatitudemapcenter = this.getLatitudemapcenter();
                        BigDecimal rhsLatitudemapcenter;
                        rhsLatitudemapcenter = that.getLatitudemapcenter();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "latitudemapcenter", lhsLatitudemapcenter), LocatorUtils.property(thatLocator, "latitudemapcenter", rhsLatitudemapcenter), lhsLatitudemapcenter, rhsLatitudemapcenter)) {
                            return false;
                        }
                    }
                    {
                        BigDecimal lhsLongitudemapcenter;
                        lhsLongitudemapcenter = this.getLongitudemapcenter();
                        BigDecimal rhsLongitudemapcenter;
                        rhsLongitudemapcenter = that.getLongitudemapcenter();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "longitudemapcenter", lhsLongitudemapcenter), LocatorUtils.property(thatLocator, "longitudemapcenter", rhsLongitudemapcenter), lhsLongitudemapcenter, rhsLongitudemapcenter)) {
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
            public static class Images
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlElement(required = true)
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
                public List<Container.Realestateitems.Realestate.Images.Advertismentimage> getAdvertismentimage() {
                    if (advertismentimage == null) {
                        advertismentimage = new ArrayList<Container.Realestateitems.Realestate.Images.Advertismentimage>();
                    }
                    return this.advertismentimage;
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
                        List<Container.Realestateitems.Realestate.Images.Advertismentimage> theAdvertismentimage;
                        theAdvertismentimage = (((this.advertismentimage!= null)&&(!this.advertismentimage.isEmpty()))?this.getAdvertismentimage():null);
                        strategy.appendField(locator, this, "advertismentimage", buffer, theAdvertismentimage);
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
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Images) {
                        final Container.Realestateitems.Realestate.Images copy = ((Container.Realestateitems.Realestate.Images) draftCopy);
                        if ((this.advertismentimage!= null)&&(!this.advertismentimage.isEmpty())) {
                            List<Container.Realestateitems.Realestate.Images.Advertismentimage> sourceAdvertismentimage;
                            sourceAdvertismentimage = (((this.advertismentimage!= null)&&(!this.advertismentimage.isEmpty()))?this.getAdvertismentimage():null);
                            @SuppressWarnings("unchecked")
                            List<Container.Realestateitems.Realestate.Images.Advertismentimage> copyAdvertismentimage = ((List<Container.Realestateitems.Realestate.Images.Advertismentimage> ) strategy.copy(LocatorUtils.property(locator, "advertismentimage", sourceAdvertismentimage), sourceAdvertismentimage));
                            copy.advertismentimage = null;
                            if (copyAdvertismentimage!= null) {
                                List<Container.Realestateitems.Realestate.Images.Advertismentimage> uniqueAdvertismentimagel = copy.getAdvertismentimage();
                                uniqueAdvertismentimagel.addAll(copyAdvertismentimage);
                            }
                        } else {
                            copy.advertismentimage = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Images();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "advertismentimage", lhsAdvertismentimage), LocatorUtils.property(thatLocator, "advertismentimage", rhsAdvertismentimage), lhsAdvertismentimage, rhsAdvertismentimage)) {
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
                public static class Advertismentimage
                    implements Cloneable, CopyTo, Equals, ToString
                {

                    @XmlAttribute(name = "path", required = true)
                    protected String path;
                    @XmlAttribute(name = "imagetype", required = true)
                    protected String imagetype;

                    /**
                     * Gets the value of the path property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
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
                    public void setImagetype(String value) {
                        this.imagetype = value;
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
                            String thePath;
                            thePath = this.getPath();
                            strategy.appendField(locator, this, "path", buffer, thePath);
                        }
                        {
                            String theImagetype;
                            theImagetype = this.getImagetype();
                            strategy.appendField(locator, this, "imagetype", buffer, theImagetype);
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
                        if (draftCopy instanceof Container.Realestateitems.Realestate.Images.Advertismentimage) {
                            final Container.Realestateitems.Realestate.Images.Advertismentimage copy = ((Container.Realestateitems.Realestate.Images.Advertismentimage) draftCopy);
                            if (this.path!= null) {
                                String sourcePath;
                                sourcePath = this.getPath();
                                String copyPath = ((String) strategy.copy(LocatorUtils.property(locator, "path", sourcePath), sourcePath));
                                copy.setPath(copyPath);
                            } else {
                                copy.path = null;
                            }
                            if (this.imagetype!= null) {
                                String sourceImagetype;
                                sourceImagetype = this.getImagetype();
                                String copyImagetype = ((String) strategy.copy(LocatorUtils.property(locator, "imagetype", sourceImagetype), sourceImagetype));
                                copy.setImagetype(copyImagetype);
                            } else {
                                copy.imagetype = null;
                            }
                        }
                        return draftCopy;
                    }

                    public Object createNewInstance() {
                        return new Container.Realestateitems.Realestate.Images.Advertismentimage();
                    }

                    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "path", lhsPath), LocatorUtils.property(thatLocator, "path", rhsPath), lhsPath, rhsPath)) {
                                return false;
                            }
                        }
                        {
                            String lhsImagetype;
                            lhsImagetype = this.getImagetype();
                            String rhsImagetype;
                            rhsImagetype = that.getImagetype();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "imagetype", lhsImagetype), LocatorUtils.property(thatLocator, "imagetype", rhsImagetype), lhsImagetype, rhsImagetype)) {
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
            public static class Price
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlAttribute(name = "value")
                protected BigDecimal value;
                @XmlAttribute(name = "min", required = true)
                protected BigDecimal min;
                @XmlAttribute(name = "max", required = true)
                protected BigDecimal max;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
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
                public void setMax(BigDecimal value) {
                    this.max = value;
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
                        BigDecimal theValue;
                        theValue = this.getValue();
                        strategy.appendField(locator, this, "value", buffer, theValue);
                    }
                    {
                        BigDecimal theMin;
                        theMin = this.getMin();
                        strategy.appendField(locator, this, "min", buffer, theMin);
                    }
                    {
                        BigDecimal theMax;
                        theMax = this.getMax();
                        strategy.appendField(locator, this, "max", buffer, theMax);
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
                    if (draftCopy instanceof Container.Realestateitems.Realestate.Price) {
                        final Container.Realestateitems.Realestate.Price copy = ((Container.Realestateitems.Realestate.Price) draftCopy);
                        if (this.value!= null) {
                            BigDecimal sourceValue;
                            sourceValue = this.getValue();
                            BigDecimal copyValue = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                            copy.setValue(copyValue);
                        } else {
                            copy.value = null;
                        }
                        if (this.min!= null) {
                            BigDecimal sourceMin;
                            sourceMin = this.getMin();
                            BigDecimal copyMin = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "min", sourceMin), sourceMin));
                            copy.setMin(copyMin);
                        } else {
                            copy.min = null;
                        }
                        if (this.max!= null) {
                            BigDecimal sourceMax;
                            sourceMax = this.getMax();
                            BigDecimal copyMax = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "max", sourceMax), sourceMax));
                            copy.setMax(copyMax);
                        } else {
                            copy.max = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Container.Realestateitems.Realestate.Price();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                            return false;
                        }
                    }
                    {
                        BigDecimal lhsMin;
                        lhsMin = this.getMin();
                        BigDecimal rhsMin;
                        rhsMin = that.getMin();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "min", lhsMin), LocatorUtils.property(thatLocator, "min", rhsMin), lhsMin, rhsMin)) {
                            return false;
                        }
                    }
                    {
                        BigDecimal lhsMax;
                        lhsMax = this.getMax();
                        BigDecimal rhsMax;
                        rhsMax = that.getMax();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "max", lhsMax), LocatorUtils.property(thatLocator, "max", rhsMax), lhsMax, rhsMax)) {
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

    }

}
