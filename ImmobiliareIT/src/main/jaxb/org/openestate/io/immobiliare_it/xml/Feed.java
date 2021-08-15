
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
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
import org.openestate.io.immobiliare_it.xml.types.Category;


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
 *         &lt;element name="version" type="{http://feed.immobiliare.it}version"/&gt;
 *         &lt;element name="metadata"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="publisher" type="{http://feed.immobiliare.it}publisher"/&gt;
 *                   &lt;element name="build-date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="multipage" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="projects" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="project"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="unique-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="date-updated" type="{http://feed.immobiliare.it}dateUpdatedType"/&gt;
 *                             &lt;element name="agent"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="email" type="{http://feed.immobiliare.it}emailType"/&gt;
 *                                       &lt;element name="sales-office"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;all&gt;
 *                                                 &lt;element name="country-code"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;pattern value="[a-zA-Z]{2}"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="administrative-area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="sub-administrative-area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="city"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;simpleContent&gt;
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                                         &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/simpleContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="locality"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="thoroughfare" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/all&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="features"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="building-status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="start-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                                       &lt;element name="end-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="floorplanner-url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="virtual-tour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="description" type="{http://feed.immobiliare.it}langtxt"/&gt;
 *                                       &lt;element name="energy-class" type="{http://feed.immobiliare.it}classEnergy"/&gt;
 *                                       &lt;element name="energy-performance" type="{http://feed.immobiliare.it}classEnergyPerformance" minOccurs="0"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="location" type="{http://feed.immobiliare.it}locationStructure" minOccurs="0"/&gt;
 *                             &lt;element name="pictures" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="picture-url" type="{http://feed.immobiliare.it}pictureProject" maxOccurs="unbounded"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="videos" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="video" type="{http://feed.immobiliare.it}videoProject"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="lots" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="residential" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="commercial" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="lot" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;all&gt;
 *                                                 &lt;element name="unique-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="property-type" type="{http://feed.immobiliare.it}propertyTypeProject"/&gt;
 *                                                 &lt;element name="price" type="{http://feed.immobiliare.it}priceType"/&gt;
 *                                                 &lt;element name="size" type="{http://feed.immobiliare.it}sizeType"/&gt;
 *                                                 &lt;element name="rooms" type="{http://feed.immobiliare.it}roomsType" minOccurs="0"/&gt;
 *                                                 &lt;element name="bathrooms" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                                 &lt;element name="floor" type="{http://feed.immobiliare.it}floorProject"/&gt;
 *                                                 &lt;element name="garage" type="{http://feed.immobiliare.it}boxProject"/&gt;
 *                                                 &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="specification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="pictures" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="picture-url" type="{http://feed.immobiliare.it}pictureProject" maxOccurs="unbounded"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/all&gt;
 *                                               &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                               &lt;attribute name="forsale" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                           &lt;attribute name="operation" type="{http://feed.immobiliare.it}operation" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="properties"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *                   &lt;element name="property"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="unique-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="date-updated" type="{http://feed.immobiliare.it}dateUpdatedType"/&gt;
 *                             &lt;element name="date-expiration" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}dateTime {http://feed.immobiliare.it}nullString"&gt;
 *                                 &lt;/union&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="transaction-type" type="{http://feed.immobiliare.it}transactionType"/&gt;
 *                             &lt;element name="building" type="{http://feed.immobiliare.it}building" minOccurs="0"/&gt;
 *                             &lt;element name="category" type="{http://feed.immobiliare.it}cat" minOccurs="0"/&gt;
 *                             &lt;element name="property-type" type="{http://feed.immobiliare.it}proptype" minOccurs="0"/&gt;
 *                             &lt;element name="building-status" type="{http://feed.immobiliare.it}status" minOccurs="0"/&gt;
 *                             &lt;element name="agent"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="office-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="email" type="{http://feed.immobiliare.it}emailType"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="location" type="{http://feed.immobiliare.it}locationStructure"/&gt;
 *                             &lt;element name="features"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="rooms" type="{http://feed.immobiliare.it}roomsType"/&gt;
 *                                       &lt;element name="size" type="{http://feed.immobiliare.it}sizeType"/&gt;
 *                                       &lt;element name="price" type="{http://feed.immobiliare.it}priceType"/&gt;
 *                                       &lt;element name="description" type="{http://feed.immobiliare.it}langtxt" maxOccurs="25"/&gt;
 *                                       &lt;element name="energy-class" type="{http://feed.immobiliare.it}classEnergy"/&gt;
 *                                       &lt;element name="energy-performance" type="{http://feed.immobiliare.it}classEnergyPerformance" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="extra-features" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="bedrooms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                       &lt;element name="bathrooms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                       &lt;element name="garage" type="{http://feed.immobiliare.it}box" minOccurs="0"/&gt;
 *                                       &lt;element name="kitchen" type="{http://feed.immobiliare.it}kitchen" minOccurs="0"/&gt;
 *                                       &lt;element name="heating" type="{http://feed.immobiliare.it}heat" minOccurs="0"/&gt;
 *                                       &lt;element name="garden" type="{http://feed.immobiliare.it}garden" minOccurs="0"/&gt;
 *                                       &lt;element name="terrace" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
 *                                       &lt;element name="balcony" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
 *                                       &lt;element name="elevator" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
 *                                       &lt;element name="air-conditioning" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
 *                                       &lt;element name="floor" type="{http://feed.immobiliare.it}floor" minOccurs="0"/&gt;
 *                                       &lt;element name="num-floors" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                       &lt;element name="virtual-tour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="rent-contract" type="{http://feed.immobiliare.it}rental" minOccurs="0"/&gt;
 *                                       &lt;element name="additional-costs" type="{http://feed.immobiliare.it}additionalCostsType" minOccurs="0"/&gt;
 *                                       &lt;element name="furniture" type="{http://feed.immobiliare.it}furniture" minOccurs="0"/&gt;
 *                                       &lt;element name="security-alarm" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
 *                                       &lt;element name="reception" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
 *                                       &lt;element name="net" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
 *                                       &lt;element name="external-area" type="{http://feed.immobiliare.it}landSizeType" minOccurs="0"/&gt;
 *                                       &lt;element name="build-year" type="{http://feed.immobiliare.it}year" minOccurs="0"/&gt;
 *                                       &lt;element name="free-conditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="overhead-crane" type="{http://feed.immobiliare.it}yesnoready" minOccurs="0"/&gt;
 *                                       &lt;element name="beam-height" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                       &lt;element name="office-size" type="{http://feed.immobiliare.it}sizeType" minOccurs="0"/&gt;
 *                                       &lt;element name="floorplanner-url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="doc-specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="doc-description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="pictures" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence maxOccurs="15" minOccurs="0"&gt;
 *                                       &lt;element name="picture-url" type="{http://feed.immobiliare.it}pictureProject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                       &lt;element name="picture" type="{http://feed.immobiliare.it}pictureExtended" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="blueprints" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="blueprint" type="{http://feed.immobiliare.it}pictureExtended" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="videos" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence maxOccurs="4"&gt;
 *                                       &lt;element name="video" type="{http://feed.immobiliare.it}videoProject"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                           &lt;attribute name="operation" type="{http://feed.immobiliare.it}operation" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "feed")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
public class Feed implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected Version version;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected Feed.Metadata metadata;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected Feed.Projects projects;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    protected Feed.Properties properties;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Version }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Version getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Version }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public void setVersion(Version value) {
        this.version = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link Feed.Metadata }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Feed.Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Feed.Metadata }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public void setMetadata(Feed.Metadata value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the projects property.
     * 
     * @return
     *     possible object is
     *     {@link Feed.Projects }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Feed.Projects getProjects() {
        return projects;
    }

    /**
     * Sets the value of the projects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Feed.Projects }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public void setProjects(Feed.Projects value) {
        this.projects = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Feed.Properties }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Feed.Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Feed.Properties }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public void setProperties(Feed.Properties value) {
        this.properties = value;
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
            Version theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion, (this.version!= null));
        }
        {
            Feed.Metadata theMetadata;
            theMetadata = this.getMetadata();
            strategy.appendField(locator, this, "metadata", buffer, theMetadata, (this.metadata!= null));
        }
        {
            Feed.Projects theProjects;
            theProjects = this.getProjects();
            strategy.appendField(locator, this, "projects", buffer, theProjects, (this.projects!= null));
        }
        {
            Feed.Properties theProperties;
            theProperties = this.getProperties();
            strategy.appendField(locator, this, "properties", buffer, theProperties, (this.properties!= null));
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
        if (draftCopy instanceof Feed) {
            final Feed copy = ((Feed) draftCopy);
            {
                Boolean versionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.version!= null));
                if (versionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Version sourceVersion;
                    sourceVersion = this.getVersion();
                    Version copyVersion = ((Version) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion, (this.version!= null)));
                    copy.setVersion(copyVersion);
                } else {
                    if (versionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.version = null;
                    }
                }
            }
            {
                Boolean metadataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.metadata!= null));
                if (metadataShouldBeCopiedAndSet == Boolean.TRUE) {
                    Feed.Metadata sourceMetadata;
                    sourceMetadata = this.getMetadata();
                    Feed.Metadata copyMetadata = ((Feed.Metadata) strategy.copy(LocatorUtils.property(locator, "metadata", sourceMetadata), sourceMetadata, (this.metadata!= null)));
                    copy.setMetadata(copyMetadata);
                } else {
                    if (metadataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.metadata = null;
                    }
                }
            }
            {
                Boolean projectsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.projects!= null));
                if (projectsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Feed.Projects sourceProjects;
                    sourceProjects = this.getProjects();
                    Feed.Projects copyProjects = ((Feed.Projects) strategy.copy(LocatorUtils.property(locator, "projects", sourceProjects), sourceProjects, (this.projects!= null)));
                    copy.setProjects(copyProjects);
                } else {
                    if (projectsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.projects = null;
                    }
                }
            }
            {
                Boolean propertiesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.properties!= null));
                if (propertiesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Feed.Properties sourceProperties;
                    sourceProperties = this.getProperties();
                    Feed.Properties copyProperties = ((Feed.Properties) strategy.copy(LocatorUtils.property(locator, "properties", sourceProperties), sourceProperties, (this.properties!= null)));
                    copy.setProperties(copyProperties);
                } else {
                    if (propertiesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.properties = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Feed();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Feed that = ((Feed) object);
        {
            Version lhsVersion;
            lhsVersion = this.getVersion();
            Version rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion, (this.version!= null), (that.version!= null))) {
                return false;
            }
        }
        {
            Feed.Metadata lhsMetadata;
            lhsMetadata = this.getMetadata();
            Feed.Metadata rhsMetadata;
            rhsMetadata = that.getMetadata();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metadata", lhsMetadata), LocatorUtils.property(thatLocator, "metadata", rhsMetadata), lhsMetadata, rhsMetadata, (this.metadata!= null), (that.metadata!= null))) {
                return false;
            }
        }
        {
            Feed.Projects lhsProjects;
            lhsProjects = this.getProjects();
            Feed.Projects rhsProjects;
            rhsProjects = that.getProjects();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "projects", lhsProjects), LocatorUtils.property(thatLocator, "projects", rhsProjects), lhsProjects, rhsProjects, (this.projects!= null), (that.projects!= null))) {
                return false;
            }
        }
        {
            Feed.Properties lhsProperties;
            lhsProperties = this.getProperties();
            Feed.Properties rhsProperties;
            rhsProperties = that.getProperties();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "properties", lhsProperties), LocatorUtils.property(thatLocator, "properties", rhsProperties), lhsProperties, rhsProperties, (this.properties!= null), (that.properties!= null))) {
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="publisher" type="{http://feed.immobiliare.it}publisher"/&gt;
     *         &lt;element name="build-date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="multipage" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    @XmlType(name = "", propOrder = {

    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public static class Metadata implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        protected Publisher publisher;
        @XmlElement(name = "build-date", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "dateTime")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        protected Calendar buildDate;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        protected Feed.Metadata.Multipage multipage;

        /**
         * Gets the value of the publisher property.
         * 
         * @return
         *     possible object is
         *     {@link Publisher }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Publisher getPublisher() {
            return publisher;
        }

        /**
         * Sets the value of the publisher property.
         * 
         * @param value
         *     allowed object is
         *     {@link Publisher }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public void setPublisher(Publisher value) {
            this.publisher = value;
        }

        /**
         * Gets the value of the buildDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Calendar getBuildDate() {
            return buildDate;
        }

        /**
         * Sets the value of the buildDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public void setBuildDate(Calendar value) {
            this.buildDate = value;
        }

        /**
         * Gets the value of the multipage property.
         * 
         * @return
         *     possible object is
         *     {@link Feed.Metadata.Multipage }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Feed.Metadata.Multipage getMultipage() {
            return multipage;
        }

        /**
         * Sets the value of the multipage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Feed.Metadata.Multipage }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public void setMultipage(Feed.Metadata.Multipage value) {
            this.multipage = value;
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
                Publisher thePublisher;
                thePublisher = this.getPublisher();
                strategy.appendField(locator, this, "publisher", buffer, thePublisher, (this.publisher!= null));
            }
            {
                Calendar theBuildDate;
                theBuildDate = this.getBuildDate();
                strategy.appendField(locator, this, "buildDate", buffer, theBuildDate, (this.buildDate!= null));
            }
            {
                Feed.Metadata.Multipage theMultipage;
                theMultipage = this.getMultipage();
                strategy.appendField(locator, this, "multipage", buffer, theMultipage, (this.multipage!= null));
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
            if (draftCopy instanceof Feed.Metadata) {
                final Feed.Metadata copy = ((Feed.Metadata) draftCopy);
                {
                    Boolean publisherShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.publisher!= null));
                    if (publisherShouldBeCopiedAndSet == Boolean.TRUE) {
                        Publisher sourcePublisher;
                        sourcePublisher = this.getPublisher();
                        Publisher copyPublisher = ((Publisher) strategy.copy(LocatorUtils.property(locator, "publisher", sourcePublisher), sourcePublisher, (this.publisher!= null)));
                        copy.setPublisher(copyPublisher);
                    } else {
                        if (publisherShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.publisher = null;
                        }
                    }
                }
                {
                    Boolean buildDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.buildDate!= null));
                    if (buildDateShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceBuildDate;
                        sourceBuildDate = this.getBuildDate();
                        Calendar copyBuildDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "buildDate", sourceBuildDate), sourceBuildDate, (this.buildDate!= null)));
                        copy.setBuildDate(copyBuildDate);
                    } else {
                        if (buildDateShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.buildDate = null;
                        }
                    }
                }
                {
                    Boolean multipageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.multipage!= null));
                    if (multipageShouldBeCopiedAndSet == Boolean.TRUE) {
                        Feed.Metadata.Multipage sourceMultipage;
                        sourceMultipage = this.getMultipage();
                        Feed.Metadata.Multipage copyMultipage = ((Feed.Metadata.Multipage) strategy.copy(LocatorUtils.property(locator, "multipage", sourceMultipage), sourceMultipage, (this.multipage!= null)));
                        copy.setMultipage(copyMultipage);
                    } else {
                        if (multipageShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.multipage = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new Feed.Metadata();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Feed.Metadata that = ((Feed.Metadata) object);
            {
                Publisher lhsPublisher;
                lhsPublisher = this.getPublisher();
                Publisher rhsPublisher;
                rhsPublisher = that.getPublisher();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "publisher", lhsPublisher), LocatorUtils.property(thatLocator, "publisher", rhsPublisher), lhsPublisher, rhsPublisher, (this.publisher!= null), (that.publisher!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsBuildDate;
                lhsBuildDate = this.getBuildDate();
                Calendar rhsBuildDate;
                rhsBuildDate = that.getBuildDate();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "buildDate", lhsBuildDate), LocatorUtils.property(thatLocator, "buildDate", rhsBuildDate), lhsBuildDate, rhsBuildDate, (this.buildDate!= null), (that.buildDate!= null))) {
                    return false;
                }
            }
            {
                Feed.Metadata.Multipage lhsMultipage;
                lhsMultipage = this.getMultipage();
                Feed.Metadata.Multipage rhsMultipage;
                rhsMultipage = that.getMultipage();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "multipage", lhsMultipage), LocatorUtils.property(thatLocator, "multipage", rhsMultipage), lhsMultipage, rhsMultipage, (this.multipage!= null), (that.multipage!= null))) {
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
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        public static class Multipage implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
        {

            @XmlElement(required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter2 .class)
            @XmlSchemaType(name = "integer")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected BigInteger current;
            @XmlElement(required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter2 .class)
            @XmlSchemaType(name = "integer")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected BigInteger last;

            /**
             * Gets the value of the current property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public BigInteger getCurrent() {
                return current;
            }

            /**
             * Sets the value of the current property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setCurrent(BigInteger value) {
                this.current = value;
            }

            /**
             * Gets the value of the last property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public BigInteger getLast() {
                return last;
            }

            /**
             * Sets the value of the last property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setLast(BigInteger value) {
                this.last = value;
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
                    BigInteger theCurrent;
                    theCurrent = this.getCurrent();
                    strategy.appendField(locator, this, "current", buffer, theCurrent, (this.current!= null));
                }
                {
                    BigInteger theLast;
                    theLast = this.getLast();
                    strategy.appendField(locator, this, "last", buffer, theLast, (this.last!= null));
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
                if (draftCopy instanceof Feed.Metadata.Multipage) {
                    final Feed.Metadata.Multipage copy = ((Feed.Metadata.Multipage) draftCopy);
                    {
                        Boolean currentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.current!= null));
                        if (currentShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceCurrent;
                            sourceCurrent = this.getCurrent();
                            BigInteger copyCurrent = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "current", sourceCurrent), sourceCurrent, (this.current!= null)));
                            copy.setCurrent(copyCurrent);
                        } else {
                            if (currentShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.current = null;
                            }
                        }
                    }
                    {
                        Boolean lastShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.last!= null));
                        if (lastShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceLast;
                            sourceLast = this.getLast();
                            BigInteger copyLast = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "last", sourceLast), sourceLast, (this.last!= null)));
                            copy.setLast(copyLast);
                        } else {
                            if (lastShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.last = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Object createNewInstance() {
                return new Feed.Metadata.Multipage();
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final Feed.Metadata.Multipage that = ((Feed.Metadata.Multipage) object);
                {
                    BigInteger lhsCurrent;
                    lhsCurrent = this.getCurrent();
                    BigInteger rhsCurrent;
                    rhsCurrent = that.getCurrent();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "current", lhsCurrent), LocatorUtils.property(thatLocator, "current", rhsCurrent), lhsCurrent, rhsCurrent, (this.current!= null), (that.current!= null))) {
                        return false;
                    }
                }
                {
                    BigInteger lhsLast;
                    lhsLast = this.getLast();
                    BigInteger rhsLast;
                    rhsLast = that.getLast();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "last", lhsLast), LocatorUtils.property(thatLocator, "last", rhsLast), lhsLast, rhsLast, (this.last!= null), (that.last!= null))) {
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="project"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="unique-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="date-updated" type="{http://feed.immobiliare.it}dateUpdatedType"/&gt;
     *                   &lt;element name="agent"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="email" type="{http://feed.immobiliare.it}emailType"/&gt;
     *                             &lt;element name="sales-office"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;all&gt;
     *                                       &lt;element name="country-code"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;pattern value="[a-zA-Z]{2}"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="administrative-area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="sub-administrative-area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="city"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;simpleContent&gt;
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/simpleContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="locality"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="thoroughfare" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/all&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="features"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="building-status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="start-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *                             &lt;element name="end-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="floorplanner-url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="virtual-tour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="description" type="{http://feed.immobiliare.it}langtxt"/&gt;
     *                             &lt;element name="energy-class" type="{http://feed.immobiliare.it}classEnergy"/&gt;
     *                             &lt;element name="energy-performance" type="{http://feed.immobiliare.it}classEnergyPerformance" minOccurs="0"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="location" type="{http://feed.immobiliare.it}locationStructure" minOccurs="0"/&gt;
     *                   &lt;element name="pictures" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="picture-url" type="{http://feed.immobiliare.it}pictureProject" maxOccurs="unbounded"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="videos" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="video" type="{http://feed.immobiliare.it}videoProject"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="lots" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="residential" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="commercial" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="lot" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;all&gt;
     *                                       &lt;element name="unique-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="property-type" type="{http://feed.immobiliare.it}propertyTypeProject"/&gt;
     *                                       &lt;element name="price" type="{http://feed.immobiliare.it}priceType"/&gt;
     *                                       &lt;element name="size" type="{http://feed.immobiliare.it}sizeType"/&gt;
     *                                       &lt;element name="rooms" type="{http://feed.immobiliare.it}roomsType" minOccurs="0"/&gt;
     *                                       &lt;element name="bathrooms" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                                       &lt;element name="floor" type="{http://feed.immobiliare.it}floorProject"/&gt;
     *                                       &lt;element name="garage" type="{http://feed.immobiliare.it}boxProject"/&gt;
     *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="specification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="pictures" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="picture-url" type="{http://feed.immobiliare.it}pictureProject" maxOccurs="unbounded"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/all&gt;
     *                                     &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                     &lt;attribute name="forsale" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *                 &lt;attribute name="operation" type="{http://feed.immobiliare.it}operation" /&gt;
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
    @XmlType(name = "", propOrder = {

    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public static class Projects implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        protected Feed.Projects.Project project;

        /**
         * Gets the value of the project property.
         * 
         * @return
         *     possible object is
         *     {@link Feed.Projects.Project }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Feed.Projects.Project getProject() {
            return project;
        }

        /**
         * Sets the value of the project property.
         * 
         * @param value
         *     allowed object is
         *     {@link Feed.Projects.Project }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public void setProject(Feed.Projects.Project value) {
            this.project = value;
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
                Feed.Projects.Project theProject;
                theProject = this.getProject();
                strategy.appendField(locator, this, "project", buffer, theProject, (this.project!= null));
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
            if (draftCopy instanceof Feed.Projects) {
                final Feed.Projects copy = ((Feed.Projects) draftCopy);
                {
                    Boolean projectShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.project!= null));
                    if (projectShouldBeCopiedAndSet == Boolean.TRUE) {
                        Feed.Projects.Project sourceProject;
                        sourceProject = this.getProject();
                        Feed.Projects.Project copyProject = ((Feed.Projects.Project) strategy.copy(LocatorUtils.property(locator, "project", sourceProject), sourceProject, (this.project!= null)));
                        copy.setProject(copyProject);
                    } else {
                        if (projectShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.project = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new Feed.Projects();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Feed.Projects that = ((Feed.Projects) object);
            {
                Feed.Projects.Project lhsProject;
                lhsProject = this.getProject();
                Feed.Projects.Project rhsProject;
                rhsProject = that.getProject();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "project", lhsProject), LocatorUtils.property(thatLocator, "project", rhsProject), lhsProject, rhsProject, (this.project!= null), (that.project!= null))) {
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
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="unique-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="date-updated" type="{http://feed.immobiliare.it}dateUpdatedType"/&gt;
         *         &lt;element name="agent"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="email" type="{http://feed.immobiliare.it}emailType"/&gt;
         *                   &lt;element name="sales-office"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;all&gt;
         *                             &lt;element name="country-code"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;pattern value="[a-zA-Z]{2}"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="administrative-area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="sub-administrative-area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="city"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;simpleContent&gt;
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/simpleContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="locality"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="thoroughfare" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/all&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="features"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="building-status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="start-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
         *                   &lt;element name="end-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="floorplanner-url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="virtual-tour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="description" type="{http://feed.immobiliare.it}langtxt"/&gt;
         *                   &lt;element name="energy-class" type="{http://feed.immobiliare.it}classEnergy"/&gt;
         *                   &lt;element name="energy-performance" type="{http://feed.immobiliare.it}classEnergyPerformance" minOccurs="0"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="location" type="{http://feed.immobiliare.it}locationStructure" minOccurs="0"/&gt;
         *         &lt;element name="pictures" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="picture-url" type="{http://feed.immobiliare.it}pictureProject" maxOccurs="unbounded"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="videos" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="video" type="{http://feed.immobiliare.it}videoProject"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="lots" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="residential" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="commercial" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="lot" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;all&gt;
         *                             &lt;element name="unique-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="property-type" type="{http://feed.immobiliare.it}propertyTypeProject"/&gt;
         *                             &lt;element name="price" type="{http://feed.immobiliare.it}priceType"/&gt;
         *                             &lt;element name="size" type="{http://feed.immobiliare.it}sizeType"/&gt;
         *                             &lt;element name="rooms" type="{http://feed.immobiliare.it}roomsType" minOccurs="0"/&gt;
         *                             &lt;element name="bathrooms" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                             &lt;element name="floor" type="{http://feed.immobiliare.it}floorProject"/&gt;
         *                             &lt;element name="garage" type="{http://feed.immobiliare.it}boxProject"/&gt;
         *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="specification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="pictures" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="picture-url" type="{http://feed.immobiliare.it}pictureProject" maxOccurs="unbounded"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/all&gt;
         *                           &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                           &lt;attribute name="forsale" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *       &lt;attribute name="operation" type="{http://feed.immobiliare.it}operation" /&gt;
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
        public static class Project implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
        {

            @XmlElement(name = "unique-id", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected String uniqueId;
            @XmlElement(name = "date-updated", required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter3 .class)
            @XmlSchemaType(name = "dateTime")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Calendar dateUpdated;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Feed.Projects.Project.Agent agent;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Feed.Projects.Project.Features features;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected LocationStructure location;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Feed.Projects.Project.Pictures pictures;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Feed.Projects.Project.Videos videos;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Feed.Projects.Project.Lots lots;
            @XmlAttribute(name = "operation")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Operation operation;

            /**
             * Gets the value of the uniqueId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setUniqueId(String value) {
                this.uniqueId = value;
            }

            /**
             * Gets the value of the dateUpdated property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Calendar getDateUpdated() {
                return dateUpdated;
            }

            /**
             * Sets the value of the dateUpdated property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setDateUpdated(Calendar value) {
                this.dateUpdated = value;
            }

            /**
             * Gets the value of the agent property.
             * 
             * @return
             *     possible object is
             *     {@link Feed.Projects.Project.Agent }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Feed.Projects.Project.Agent getAgent() {
                return agent;
            }

            /**
             * Sets the value of the agent property.
             * 
             * @param value
             *     allowed object is
             *     {@link Feed.Projects.Project.Agent }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setAgent(Feed.Projects.Project.Agent value) {
                this.agent = value;
            }

            /**
             * Gets the value of the features property.
             * 
             * @return
             *     possible object is
             *     {@link Feed.Projects.Project.Features }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Feed.Projects.Project.Features getFeatures() {
                return features;
            }

            /**
             * Sets the value of the features property.
             * 
             * @param value
             *     allowed object is
             *     {@link Feed.Projects.Project.Features }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setFeatures(Feed.Projects.Project.Features value) {
                this.features = value;
            }

            /**
             * Gets the value of the location property.
             * 
             * @return
             *     possible object is
             *     {@link LocationStructure }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setLocation(LocationStructure value) {
                this.location = value;
            }

            /**
             * Gets the value of the pictures property.
             * 
             * @return
             *     possible object is
             *     {@link Feed.Projects.Project.Pictures }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Feed.Projects.Project.Pictures getPictures() {
                return pictures;
            }

            /**
             * Sets the value of the pictures property.
             * 
             * @param value
             *     allowed object is
             *     {@link Feed.Projects.Project.Pictures }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setPictures(Feed.Projects.Project.Pictures value) {
                this.pictures = value;
            }

            /**
             * Gets the value of the videos property.
             * 
             * @return
             *     possible object is
             *     {@link Feed.Projects.Project.Videos }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Feed.Projects.Project.Videos getVideos() {
                return videos;
            }

            /**
             * Sets the value of the videos property.
             * 
             * @param value
             *     allowed object is
             *     {@link Feed.Projects.Project.Videos }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setVideos(Feed.Projects.Project.Videos value) {
                this.videos = value;
            }

            /**
             * Gets the value of the lots property.
             * 
             * @return
             *     possible object is
             *     {@link Feed.Projects.Project.Lots }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Feed.Projects.Project.Lots getLots() {
                return lots;
            }

            /**
             * Sets the value of the lots property.
             * 
             * @param value
             *     allowed object is
             *     {@link Feed.Projects.Project.Lots }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setLots(Feed.Projects.Project.Lots value) {
                this.lots = value;
            }

            /**
             * Gets the value of the operation property.
             * 
             * @return
             *     possible object is
             *     {@link Operation }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Operation getOperation() {
                return operation;
            }

            /**
             * Sets the value of the operation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Operation }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setOperation(Operation value) {
                this.operation = value;
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
                    String theUniqueId;
                    theUniqueId = this.getUniqueId();
                    strategy.appendField(locator, this, "uniqueId", buffer, theUniqueId, (this.uniqueId!= null));
                }
                {
                    Calendar theDateUpdated;
                    theDateUpdated = this.getDateUpdated();
                    strategy.appendField(locator, this, "dateUpdated", buffer, theDateUpdated, (this.dateUpdated!= null));
                }
                {
                    Feed.Projects.Project.Agent theAgent;
                    theAgent = this.getAgent();
                    strategy.appendField(locator, this, "agent", buffer, theAgent, (this.agent!= null));
                }
                {
                    Feed.Projects.Project.Features theFeatures;
                    theFeatures = this.getFeatures();
                    strategy.appendField(locator, this, "features", buffer, theFeatures, (this.features!= null));
                }
                {
                    LocationStructure theLocation;
                    theLocation = this.getLocation();
                    strategy.appendField(locator, this, "location", buffer, theLocation, (this.location!= null));
                }
                {
                    Feed.Projects.Project.Pictures thePictures;
                    thePictures = this.getPictures();
                    strategy.appendField(locator, this, "pictures", buffer, thePictures, (this.pictures!= null));
                }
                {
                    Feed.Projects.Project.Videos theVideos;
                    theVideos = this.getVideos();
                    strategy.appendField(locator, this, "videos", buffer, theVideos, (this.videos!= null));
                }
                {
                    Feed.Projects.Project.Lots theLots;
                    theLots = this.getLots();
                    strategy.appendField(locator, this, "lots", buffer, theLots, (this.lots!= null));
                }
                {
                    Operation theOperation;
                    theOperation = this.getOperation();
                    strategy.appendField(locator, this, "operation", buffer, theOperation, (this.operation!= null));
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
                if (draftCopy instanceof Feed.Projects.Project) {
                    final Feed.Projects.Project copy = ((Feed.Projects.Project) draftCopy);
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
                        Boolean dateUpdatedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateUpdated!= null));
                        if (dateUpdatedShouldBeCopiedAndSet == Boolean.TRUE) {
                            Calendar sourceDateUpdated;
                            sourceDateUpdated = this.getDateUpdated();
                            Calendar copyDateUpdated = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateUpdated", sourceDateUpdated), sourceDateUpdated, (this.dateUpdated!= null)));
                            copy.setDateUpdated(copyDateUpdated);
                        } else {
                            if (dateUpdatedShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.dateUpdated = null;
                            }
                        }
                    }
                    {
                        Boolean agentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.agent!= null));
                        if (agentShouldBeCopiedAndSet == Boolean.TRUE) {
                            Feed.Projects.Project.Agent sourceAgent;
                            sourceAgent = this.getAgent();
                            Feed.Projects.Project.Agent copyAgent = ((Feed.Projects.Project.Agent) strategy.copy(LocatorUtils.property(locator, "agent", sourceAgent), sourceAgent, (this.agent!= null)));
                            copy.setAgent(copyAgent);
                        } else {
                            if (agentShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.agent = null;
                            }
                        }
                    }
                    {
                        Boolean featuresShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.features!= null));
                        if (featuresShouldBeCopiedAndSet == Boolean.TRUE) {
                            Feed.Projects.Project.Features sourceFeatures;
                            sourceFeatures = this.getFeatures();
                            Feed.Projects.Project.Features copyFeatures = ((Feed.Projects.Project.Features) strategy.copy(LocatorUtils.property(locator, "features", sourceFeatures), sourceFeatures, (this.features!= null)));
                            copy.setFeatures(copyFeatures);
                        } else {
                            if (featuresShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.features = null;
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
                        Boolean picturesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pictures!= null));
                        if (picturesShouldBeCopiedAndSet == Boolean.TRUE) {
                            Feed.Projects.Project.Pictures sourcePictures;
                            sourcePictures = this.getPictures();
                            Feed.Projects.Project.Pictures copyPictures = ((Feed.Projects.Project.Pictures) strategy.copy(LocatorUtils.property(locator, "pictures", sourcePictures), sourcePictures, (this.pictures!= null)));
                            copy.setPictures(copyPictures);
                        } else {
                            if (picturesShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.pictures = null;
                            }
                        }
                    }
                    {
                        Boolean videosShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.videos!= null));
                        if (videosShouldBeCopiedAndSet == Boolean.TRUE) {
                            Feed.Projects.Project.Videos sourceVideos;
                            sourceVideos = this.getVideos();
                            Feed.Projects.Project.Videos copyVideos = ((Feed.Projects.Project.Videos) strategy.copy(LocatorUtils.property(locator, "videos", sourceVideos), sourceVideos, (this.videos!= null)));
                            copy.setVideos(copyVideos);
                        } else {
                            if (videosShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.videos = null;
                            }
                        }
                    }
                    {
                        Boolean lotsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lots!= null));
                        if (lotsShouldBeCopiedAndSet == Boolean.TRUE) {
                            Feed.Projects.Project.Lots sourceLots;
                            sourceLots = this.getLots();
                            Feed.Projects.Project.Lots copyLots = ((Feed.Projects.Project.Lots) strategy.copy(LocatorUtils.property(locator, "lots", sourceLots), sourceLots, (this.lots!= null)));
                            copy.setLots(copyLots);
                        } else {
                            if (lotsShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.lots = null;
                            }
                        }
                    }
                    {
                        Boolean operationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operation!= null));
                        if (operationShouldBeCopiedAndSet == Boolean.TRUE) {
                            Operation sourceOperation;
                            sourceOperation = this.getOperation();
                            Operation copyOperation = ((Operation) strategy.copy(LocatorUtils.property(locator, "operation", sourceOperation), sourceOperation, (this.operation!= null)));
                            copy.setOperation(copyOperation);
                        } else {
                            if (operationShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.operation = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Object createNewInstance() {
                return new Feed.Projects.Project();
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final Feed.Projects.Project that = ((Feed.Projects.Project) object);
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
                    Calendar lhsDateUpdated;
                    lhsDateUpdated = this.getDateUpdated();
                    Calendar rhsDateUpdated;
                    rhsDateUpdated = that.getDateUpdated();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "dateUpdated", lhsDateUpdated), LocatorUtils.property(thatLocator, "dateUpdated", rhsDateUpdated), lhsDateUpdated, rhsDateUpdated, (this.dateUpdated!= null), (that.dateUpdated!= null))) {
                        return false;
                    }
                }
                {
                    Feed.Projects.Project.Agent lhsAgent;
                    lhsAgent = this.getAgent();
                    Feed.Projects.Project.Agent rhsAgent;
                    rhsAgent = that.getAgent();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "agent", lhsAgent), LocatorUtils.property(thatLocator, "agent", rhsAgent), lhsAgent, rhsAgent, (this.agent!= null), (that.agent!= null))) {
                        return false;
                    }
                }
                {
                    Feed.Projects.Project.Features lhsFeatures;
                    lhsFeatures = this.getFeatures();
                    Feed.Projects.Project.Features rhsFeatures;
                    rhsFeatures = that.getFeatures();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "features", lhsFeatures), LocatorUtils.property(thatLocator, "features", rhsFeatures), lhsFeatures, rhsFeatures, (this.features!= null), (that.features!= null))) {
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
                    Feed.Projects.Project.Pictures lhsPictures;
                    lhsPictures = this.getPictures();
                    Feed.Projects.Project.Pictures rhsPictures;
                    rhsPictures = that.getPictures();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "pictures", lhsPictures), LocatorUtils.property(thatLocator, "pictures", rhsPictures), lhsPictures, rhsPictures, (this.pictures!= null), (that.pictures!= null))) {
                        return false;
                    }
                }
                {
                    Feed.Projects.Project.Videos lhsVideos;
                    lhsVideos = this.getVideos();
                    Feed.Projects.Project.Videos rhsVideos;
                    rhsVideos = that.getVideos();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "videos", lhsVideos), LocatorUtils.property(thatLocator, "videos", rhsVideos), lhsVideos, rhsVideos, (this.videos!= null), (that.videos!= null))) {
                        return false;
                    }
                }
                {
                    Feed.Projects.Project.Lots lhsLots;
                    lhsLots = this.getLots();
                    Feed.Projects.Project.Lots rhsLots;
                    rhsLots = that.getLots();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "lots", lhsLots), LocatorUtils.property(thatLocator, "lots", rhsLots), lhsLots, rhsLots, (this.lots!= null), (that.lots!= null))) {
                        return false;
                    }
                }
                {
                    Operation lhsOperation;
                    lhsOperation = this.getOperation();
                    Operation rhsOperation;
                    rhsOperation = that.getOperation();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "operation", lhsOperation), LocatorUtils.property(thatLocator, "operation", rhsOperation), lhsOperation, rhsOperation, (this.operation!= null), (that.operation!= null))) {
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
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;all&gt;
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="email" type="{http://feed.immobiliare.it}emailType"/&gt;
             *         &lt;element name="sales-office"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;all&gt;
             *                   &lt;element name="country-code"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;pattern value="[a-zA-Z]{2}"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="administrative-area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="sub-administrative-area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="city"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;simpleContent&gt;
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/simpleContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="locality"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="thoroughfare" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            @XmlType(name = "", propOrder = {

            })
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public static class Agent implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected String name;
                @XmlElement(required = true)
                @XmlJavaTypeAdapter(Adapter4 .class)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected String email;
                @XmlElement(name = "sales-office", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Feed.Projects.Project.Agent.SalesOffice salesOffice;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the email property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setEmail(String value) {
                    this.email = value;
                }

                /**
                 * Gets the value of the salesOffice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Feed.Projects.Project.Agent.SalesOffice }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Feed.Projects.Project.Agent.SalesOffice getSalesOffice() {
                    return salesOffice;
                }

                /**
                 * Sets the value of the salesOffice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Feed.Projects.Project.Agent.SalesOffice }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setSalesOffice(Feed.Projects.Project.Agent.SalesOffice value) {
                    this.salesOffice = value;
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
                        String theName;
                        theName = this.getName();
                        strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
                    }
                    {
                        String theEmail;
                        theEmail = this.getEmail();
                        strategy.appendField(locator, this, "email", buffer, theEmail, (this.email!= null));
                    }
                    {
                        Feed.Projects.Project.Agent.SalesOffice theSalesOffice;
                        theSalesOffice = this.getSalesOffice();
                        strategy.appendField(locator, this, "salesOffice", buffer, theSalesOffice, (this.salesOffice!= null));
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
                    if (draftCopy instanceof Feed.Projects.Project.Agent) {
                        final Feed.Projects.Project.Agent copy = ((Feed.Projects.Project.Agent) draftCopy);
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
                            Boolean salesOfficeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.salesOffice!= null));
                            if (salesOfficeShouldBeCopiedAndSet == Boolean.TRUE) {
                                Feed.Projects.Project.Agent.SalesOffice sourceSalesOffice;
                                sourceSalesOffice = this.getSalesOffice();
                                Feed.Projects.Project.Agent.SalesOffice copySalesOffice = ((Feed.Projects.Project.Agent.SalesOffice) strategy.copy(LocatorUtils.property(locator, "salesOffice", sourceSalesOffice), sourceSalesOffice, (this.salesOffice!= null)));
                                copy.setSalesOffice(copySalesOffice);
                            } else {
                                if (salesOfficeShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.salesOffice = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Object createNewInstance() {
                    return new Feed.Projects.Project.Agent();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Feed.Projects.Project.Agent that = ((Feed.Projects.Project.Agent) object);
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
                        String lhsEmail;
                        lhsEmail = this.getEmail();
                        String rhsEmail;
                        rhsEmail = that.getEmail();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail, (this.email!= null), (that.email!= null))) {
                            return false;
                        }
                    }
                    {
                        Feed.Projects.Project.Agent.SalesOffice lhsSalesOffice;
                        lhsSalesOffice = this.getSalesOffice();
                        Feed.Projects.Project.Agent.SalesOffice rhsSalesOffice;
                        rhsSalesOffice = that.getSalesOffice();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "salesOffice", lhsSalesOffice), LocatorUtils.property(thatLocator, "salesOffice", rhsSalesOffice), lhsSalesOffice, rhsSalesOffice, (this.salesOffice!= null), (that.salesOffice!= null))) {
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
                 *         &lt;element name="sub-administrative-area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="city"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;simpleContent&gt;
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
                @XmlType(name = "", propOrder = {

                })
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public static class SalesOffice implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
                {

                    @XmlElement(name = "country-code", required = true)
                    @XmlJavaTypeAdapter(Adapter23 .class)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected String countryCode;
                    @XmlElement(name = "administrative-area", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected String administrativeArea;
                    @XmlElement(name = "sub-administrative-area", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected String subAdministrativeArea;
                    @XmlElement(required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected Feed.Projects.Project.Agent.SalesOffice.City city;
                    @XmlElement(required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected Feed.Projects.Project.Agent.SalesOffice.Locality locality;
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected String phone;
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected String mobile;

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
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public void setSubAdministrativeArea(String value) {
                        this.subAdministrativeArea = value;
                    }

                    /**
                     * Gets the value of the city property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Feed.Projects.Project.Agent.SalesOffice.City }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public Feed.Projects.Project.Agent.SalesOffice.City getCity() {
                        return city;
                    }

                    /**
                     * Sets the value of the city property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Feed.Projects.Project.Agent.SalesOffice.City }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public void setCity(Feed.Projects.Project.Agent.SalesOffice.City value) {
                        this.city = value;
                    }

                    /**
                     * Gets the value of the locality property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Feed.Projects.Project.Agent.SalesOffice.Locality }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public Feed.Projects.Project.Agent.SalesOffice.Locality getLocality() {
                        return locality;
                    }

                    /**
                     * Sets the value of the locality property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Feed.Projects.Project.Agent.SalesOffice.Locality }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public void setLocality(Feed.Projects.Project.Agent.SalesOffice.Locality value) {
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public void setMobile(String value) {
                        this.mobile = value;
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
                            String theSubAdministrativeArea;
                            theSubAdministrativeArea = this.getSubAdministrativeArea();
                            strategy.appendField(locator, this, "subAdministrativeArea", buffer, theSubAdministrativeArea, (this.subAdministrativeArea!= null));
                        }
                        {
                            Feed.Projects.Project.Agent.SalesOffice.City theCity;
                            theCity = this.getCity();
                            strategy.appendField(locator, this, "city", buffer, theCity, (this.city!= null));
                        }
                        {
                            Feed.Projects.Project.Agent.SalesOffice.Locality theLocality;
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
                        if (draftCopy instanceof Feed.Projects.Project.Agent.SalesOffice) {
                            final Feed.Projects.Project.Agent.SalesOffice copy = ((Feed.Projects.Project.Agent.SalesOffice) draftCopy);
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
                                    Feed.Projects.Project.Agent.SalesOffice.City sourceCity;
                                    sourceCity = this.getCity();
                                    Feed.Projects.Project.Agent.SalesOffice.City copyCity = ((Feed.Projects.Project.Agent.SalesOffice.City) strategy.copy(LocatorUtils.property(locator, "city", sourceCity), sourceCity, (this.city!= null)));
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
                                    Feed.Projects.Project.Agent.SalesOffice.Locality sourceLocality;
                                    sourceLocality = this.getLocality();
                                    Feed.Projects.Project.Agent.SalesOffice.Locality copyLocality = ((Feed.Projects.Project.Agent.SalesOffice.Locality) strategy.copy(LocatorUtils.property(locator, "locality", sourceLocality), sourceLocality, (this.locality!= null)));
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

                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public Object createNewInstance() {
                        return new Feed.Projects.Project.Agent.SalesOffice();
                    }

                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                        if ((object == null)||(this.getClass()!= object.getClass())) {
                            return false;
                        }
                        if (this == object) {
                            return true;
                        }
                        final Feed.Projects.Project.Agent.SalesOffice that = ((Feed.Projects.Project.Agent.SalesOffice) object);
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
                            Feed.Projects.Project.Agent.SalesOffice.City lhsCity;
                            lhsCity = this.getCity();
                            Feed.Projects.Project.Agent.SalesOffice.City rhsCity;
                            rhsCity = that.getCity();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity, (this.city!= null), (that.city!= null))) {
                                return false;
                            }
                        }
                        {
                            Feed.Projects.Project.Agent.SalesOffice.Locality lhsLocality;
                            lhsLocality = this.getLocality();
                            Feed.Projects.Project.Agent.SalesOffice.Locality rhsLocality;
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
                            if (draftCopy instanceof Feed.Projects.Project.Agent.SalesOffice.City) {
                                final Feed.Projects.Project.Agent.SalesOffice.City copy = ((Feed.Projects.Project.Agent.SalesOffice.City) draftCopy);
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
                            return new Feed.Projects.Project.Agent.SalesOffice.City();
                        }

                        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                            if ((object == null)||(this.getClass()!= object.getClass())) {
                                return false;
                            }
                            if (this == object) {
                                return true;
                            }
                            final Feed.Projects.Project.Agent.SalesOffice.City that = ((Feed.Projects.Project.Agent.SalesOffice.City) object);
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public static class Locality implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
                    {

                        @XmlElement(required = true)
                        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                        protected String thoroughfare;

                        /**
                         * Gets the value of the thoroughfare property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                        public void setThoroughfare(String value) {
                            this.thoroughfare = value;
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
                                String theThoroughfare;
                                theThoroughfare = this.getThoroughfare();
                                strategy.appendField(locator, this, "thoroughfare", buffer, theThoroughfare, (this.thoroughfare!= null));
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
                            if (draftCopy instanceof Feed.Projects.Project.Agent.SalesOffice.Locality) {
                                final Feed.Projects.Project.Agent.SalesOffice.Locality copy = ((Feed.Projects.Project.Agent.SalesOffice.Locality) draftCopy);
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

                        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                        public Object createNewInstance() {
                            return new Feed.Projects.Project.Agent.SalesOffice.Locality();
                        }

                        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                            if ((object == null)||(this.getClass()!= object.getClass())) {
                                return false;
                            }
                            if (this == object) {
                                return true;
                            }
                            final Feed.Projects.Project.Agent.SalesOffice.Locality that = ((Feed.Projects.Project.Agent.SalesOffice.Locality) object);
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

                        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                        public boolean equals(Object object) {
                            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
                            return equals(null, null, object, strategy);
                        }

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
             *       &lt;all&gt;
             *         &lt;element name="building-status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="start-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
             *         &lt;element name="end-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="floorplanner-url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="virtual-tour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="description" type="{http://feed.immobiliare.it}langtxt"/&gt;
             *         &lt;element name="energy-class" type="{http://feed.immobiliare.it}classEnergy"/&gt;
             *         &lt;element name="energy-performance" type="{http://feed.immobiliare.it}classEnergyPerformance" minOccurs="0"/&gt;
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
            public static class Features implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlElement(name = "building-status")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected String buildingStatus;
                @XmlElement(name = "start-date", type = String.class)
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "dateTime")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Calendar startDate;
                @XmlElement(name = "end-date", type = String.class)
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "dateTime")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Calendar endDate;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected String name;
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected String specification;
                @XmlElement(name = "floorplanner-url")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected String floorplannerUrl;
                @XmlElement(name = "virtual-tour")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected String virtualTour;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Langtxt description;
                @XmlElement(name = "energy-class", required = true)
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected ClassEnergy energyClass;
                @XmlElement(name = "energy-performance")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected ClassEnergyPerformance energyPerformance;

                /**
                 * Gets the value of the buildingStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public String getBuildingStatus() {
                    return buildingStatus;
                }

                /**
                 * Sets the value of the buildingStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setBuildingStatus(String value) {
                    this.buildingStatus = value;
                }

                /**
                 * Gets the value of the startDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Calendar getStartDate() {
                    return startDate;
                }

                /**
                 * Sets the value of the startDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setStartDate(Calendar value) {
                    this.startDate = value;
                }

                /**
                 * Gets the value of the endDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Calendar getEndDate() {
                    return endDate;
                }

                /**
                 * Sets the value of the endDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setEndDate(Calendar value) {
                    this.endDate = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the specification property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setSpecification(String value) {
                    this.specification = value;
                }

                /**
                 * Gets the value of the floorplannerUrl property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public String getFloorplannerUrl() {
                    return floorplannerUrl;
                }

                /**
                 * Sets the value of the floorplannerUrl property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setFloorplannerUrl(String value) {
                    this.floorplannerUrl = value;
                }

                /**
                 * Gets the value of the virtualTour property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public String getVirtualTour() {
                    return virtualTour;
                }

                /**
                 * Sets the value of the virtualTour property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setVirtualTour(String value) {
                    this.virtualTour = value;
                }

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Langtxt }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setDescription(Langtxt value) {
                    this.description = value;
                }

                /**
                 * Gets the value of the energyClass property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ClassEnergy }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public ClassEnergy getEnergyClass() {
                    return energyClass;
                }

                /**
                 * Sets the value of the energyClass property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ClassEnergy }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setEnergyClass(ClassEnergy value) {
                    this.energyClass = value;
                }

                /**
                 * Gets the value of the energyPerformance property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ClassEnergyPerformance }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public ClassEnergyPerformance getEnergyPerformance() {
                    return energyPerformance;
                }

                /**
                 * Sets the value of the energyPerformance property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ClassEnergyPerformance }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setEnergyPerformance(ClassEnergyPerformance value) {
                    this.energyPerformance = value;
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
                        String theBuildingStatus;
                        theBuildingStatus = this.getBuildingStatus();
                        strategy.appendField(locator, this, "buildingStatus", buffer, theBuildingStatus, (this.buildingStatus!= null));
                    }
                    {
                        Calendar theStartDate;
                        theStartDate = this.getStartDate();
                        strategy.appendField(locator, this, "startDate", buffer, theStartDate, (this.startDate!= null));
                    }
                    {
                        Calendar theEndDate;
                        theEndDate = this.getEndDate();
                        strategy.appendField(locator, this, "endDate", buffer, theEndDate, (this.endDate!= null));
                    }
                    {
                        String theName;
                        theName = this.getName();
                        strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
                    }
                    {
                        String theSpecification;
                        theSpecification = this.getSpecification();
                        strategy.appendField(locator, this, "specification", buffer, theSpecification, (this.specification!= null));
                    }
                    {
                        String theFloorplannerUrl;
                        theFloorplannerUrl = this.getFloorplannerUrl();
                        strategy.appendField(locator, this, "floorplannerUrl", buffer, theFloorplannerUrl, (this.floorplannerUrl!= null));
                    }
                    {
                        String theVirtualTour;
                        theVirtualTour = this.getVirtualTour();
                        strategy.appendField(locator, this, "virtualTour", buffer, theVirtualTour, (this.virtualTour!= null));
                    }
                    {
                        Langtxt theDescription;
                        theDescription = this.getDescription();
                        strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
                    }
                    {
                        ClassEnergy theEnergyClass;
                        theEnergyClass = this.getEnergyClass();
                        strategy.appendField(locator, this, "energyClass", buffer, theEnergyClass, (this.energyClass!= null));
                    }
                    {
                        ClassEnergyPerformance theEnergyPerformance;
                        theEnergyPerformance = this.getEnergyPerformance();
                        strategy.appendField(locator, this, "energyPerformance", buffer, theEnergyPerformance, (this.energyPerformance!= null));
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
                    if (draftCopy instanceof Feed.Projects.Project.Features) {
                        final Feed.Projects.Project.Features copy = ((Feed.Projects.Project.Features) draftCopy);
                        {
                            Boolean buildingStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.buildingStatus!= null));
                            if (buildingStatusShouldBeCopiedAndSet == Boolean.TRUE) {
                                String sourceBuildingStatus;
                                sourceBuildingStatus = this.getBuildingStatus();
                                String copyBuildingStatus = ((String) strategy.copy(LocatorUtils.property(locator, "buildingStatus", sourceBuildingStatus), sourceBuildingStatus, (this.buildingStatus!= null)));
                                copy.setBuildingStatus(copyBuildingStatus);
                            } else {
                                if (buildingStatusShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.buildingStatus = null;
                                }
                            }
                        }
                        {
                            Boolean startDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.startDate!= null));
                            if (startDateShouldBeCopiedAndSet == Boolean.TRUE) {
                                Calendar sourceStartDate;
                                sourceStartDate = this.getStartDate();
                                Calendar copyStartDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "startDate", sourceStartDate), sourceStartDate, (this.startDate!= null)));
                                copy.setStartDate(copyStartDate);
                            } else {
                                if (startDateShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.startDate = null;
                                }
                            }
                        }
                        {
                            Boolean endDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.endDate!= null));
                            if (endDateShouldBeCopiedAndSet == Boolean.TRUE) {
                                Calendar sourceEndDate;
                                sourceEndDate = this.getEndDate();
                                Calendar copyEndDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "endDate", sourceEndDate), sourceEndDate, (this.endDate!= null)));
                                copy.setEndDate(copyEndDate);
                            } else {
                                if (endDateShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.endDate = null;
                                }
                            }
                        }
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
                            Boolean floorplannerUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floorplannerUrl!= null));
                            if (floorplannerUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                                String sourceFloorplannerUrl;
                                sourceFloorplannerUrl = this.getFloorplannerUrl();
                                String copyFloorplannerUrl = ((String) strategy.copy(LocatorUtils.property(locator, "floorplannerUrl", sourceFloorplannerUrl), sourceFloorplannerUrl, (this.floorplannerUrl!= null)));
                                copy.setFloorplannerUrl(copyFloorplannerUrl);
                            } else {
                                if (floorplannerUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.floorplannerUrl = null;
                                }
                            }
                        }
                        {
                            Boolean virtualTourShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.virtualTour!= null));
                            if (virtualTourShouldBeCopiedAndSet == Boolean.TRUE) {
                                String sourceVirtualTour;
                                sourceVirtualTour = this.getVirtualTour();
                                String copyVirtualTour = ((String) strategy.copy(LocatorUtils.property(locator, "virtualTour", sourceVirtualTour), sourceVirtualTour, (this.virtualTour!= null)));
                                copy.setVirtualTour(copyVirtualTour);
                            } else {
                                if (virtualTourShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.virtualTour = null;
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
                            Boolean energyClassShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyClass!= null));
                            if (energyClassShouldBeCopiedAndSet == Boolean.TRUE) {
                                ClassEnergy sourceEnergyClass;
                                sourceEnergyClass = this.getEnergyClass();
                                ClassEnergy copyEnergyClass = ((ClassEnergy) strategy.copy(LocatorUtils.property(locator, "energyClass", sourceEnergyClass), sourceEnergyClass, (this.energyClass!= null)));
                                copy.setEnergyClass(copyEnergyClass);
                            } else {
                                if (energyClassShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.energyClass = null;
                                }
                            }
                        }
                        {
                            Boolean energyPerformanceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyPerformance!= null));
                            if (energyPerformanceShouldBeCopiedAndSet == Boolean.TRUE) {
                                ClassEnergyPerformance sourceEnergyPerformance;
                                sourceEnergyPerformance = this.getEnergyPerformance();
                                ClassEnergyPerformance copyEnergyPerformance = ((ClassEnergyPerformance) strategy.copy(LocatorUtils.property(locator, "energyPerformance", sourceEnergyPerformance), sourceEnergyPerformance, (this.energyPerformance!= null)));
                                copy.setEnergyPerformance(copyEnergyPerformance);
                            } else {
                                if (energyPerformanceShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.energyPerformance = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Object createNewInstance() {
                    return new Feed.Projects.Project.Features();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Feed.Projects.Project.Features that = ((Feed.Projects.Project.Features) object);
                    {
                        String lhsBuildingStatus;
                        lhsBuildingStatus = this.getBuildingStatus();
                        String rhsBuildingStatus;
                        rhsBuildingStatus = that.getBuildingStatus();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingStatus", lhsBuildingStatus), LocatorUtils.property(thatLocator, "buildingStatus", rhsBuildingStatus), lhsBuildingStatus, rhsBuildingStatus, (this.buildingStatus!= null), (that.buildingStatus!= null))) {
                            return false;
                        }
                    }
                    {
                        Calendar lhsStartDate;
                        lhsStartDate = this.getStartDate();
                        Calendar rhsStartDate;
                        rhsStartDate = that.getStartDate();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "startDate", lhsStartDate), LocatorUtils.property(thatLocator, "startDate", rhsStartDate), lhsStartDate, rhsStartDate, (this.startDate!= null), (that.startDate!= null))) {
                            return false;
                        }
                    }
                    {
                        Calendar lhsEndDate;
                        lhsEndDate = this.getEndDate();
                        Calendar rhsEndDate;
                        rhsEndDate = that.getEndDate();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "endDate", lhsEndDate), LocatorUtils.property(thatLocator, "endDate", rhsEndDate), lhsEndDate, rhsEndDate, (this.endDate!= null), (that.endDate!= null))) {
                            return false;
                        }
                    }
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
                        String lhsSpecification;
                        lhsSpecification = this.getSpecification();
                        String rhsSpecification;
                        rhsSpecification = that.getSpecification();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "specification", lhsSpecification), LocatorUtils.property(thatLocator, "specification", rhsSpecification), lhsSpecification, rhsSpecification, (this.specification!= null), (that.specification!= null))) {
                            return false;
                        }
                    }
                    {
                        String lhsFloorplannerUrl;
                        lhsFloorplannerUrl = this.getFloorplannerUrl();
                        String rhsFloorplannerUrl;
                        rhsFloorplannerUrl = that.getFloorplannerUrl();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "floorplannerUrl", lhsFloorplannerUrl), LocatorUtils.property(thatLocator, "floorplannerUrl", rhsFloorplannerUrl), lhsFloorplannerUrl, rhsFloorplannerUrl, (this.floorplannerUrl!= null), (that.floorplannerUrl!= null))) {
                            return false;
                        }
                    }
                    {
                        String lhsVirtualTour;
                        lhsVirtualTour = this.getVirtualTour();
                        String rhsVirtualTour;
                        rhsVirtualTour = that.getVirtualTour();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "virtualTour", lhsVirtualTour), LocatorUtils.property(thatLocator, "virtualTour", rhsVirtualTour), lhsVirtualTour, rhsVirtualTour, (this.virtualTour!= null), (that.virtualTour!= null))) {
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
                        ClassEnergy lhsEnergyClass;
                        lhsEnergyClass = this.getEnergyClass();
                        ClassEnergy rhsEnergyClass;
                        rhsEnergyClass = that.getEnergyClass();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "energyClass", lhsEnergyClass), LocatorUtils.property(thatLocator, "energyClass", rhsEnergyClass), lhsEnergyClass, rhsEnergyClass, (this.energyClass!= null), (that.energyClass!= null))) {
                            return false;
                        }
                    }
                    {
                        ClassEnergyPerformance lhsEnergyPerformance;
                        lhsEnergyPerformance = this.getEnergyPerformance();
                        ClassEnergyPerformance rhsEnergyPerformance;
                        rhsEnergyPerformance = that.getEnergyPerformance();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "energyPerformance", lhsEnergyPerformance), LocatorUtils.property(thatLocator, "energyPerformance", rhsEnergyPerformance), lhsEnergyPerformance, rhsEnergyPerformance, (this.energyPerformance!= null), (that.energyPerformance!= null))) {
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
             *       &lt;sequence&gt;
             *         &lt;element name="residential" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="commercial" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="lot" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;all&gt;
             *                   &lt;element name="unique-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="property-type" type="{http://feed.immobiliare.it}propertyTypeProject"/&gt;
             *                   &lt;element name="price" type="{http://feed.immobiliare.it}priceType"/&gt;
             *                   &lt;element name="size" type="{http://feed.immobiliare.it}sizeType"/&gt;
             *                   &lt;element name="rooms" type="{http://feed.immobiliare.it}roomsType" minOccurs="0"/&gt;
             *                   &lt;element name="bathrooms" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *                   &lt;element name="floor" type="{http://feed.immobiliare.it}floorProject"/&gt;
             *                   &lt;element name="garage" type="{http://feed.immobiliare.it}boxProject"/&gt;
             *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="specification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="pictures" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="picture-url" type="{http://feed.immobiliare.it}pictureProject" maxOccurs="unbounded"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/all&gt;
             *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *                 &lt;attribute name="forsale" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
                "residential",
                "commercial",
                "lot"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public static class Lots implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlElement(required = true, type = String.class)
                @XmlJavaTypeAdapter(Adapter2 .class)
                @XmlSchemaType(name = "integer")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected BigInteger residential;
                @XmlElement(required = true, type = String.class)
                @XmlJavaTypeAdapter(Adapter2 .class)
                @XmlSchemaType(name = "integer")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected BigInteger commercial;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected List<Feed.Projects.Project.Lots.Lot> lot;

                /**
                 * Gets the value of the residential property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                 * {@link Feed.Projects.Project.Lots.Lot }
                 * 
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public List<Feed.Projects.Project.Lots.Lot> getLot() {
                    if (lot == null) {
                        lot = new ArrayList<Feed.Projects.Project.Lots.Lot>();
                    }
                    return this.lot;
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
                        List<Feed.Projects.Project.Lots.Lot> theLot;
                        theLot = (((this.lot!= null)&&(!this.lot.isEmpty()))?this.getLot():null);
                        strategy.appendField(locator, this, "lot", buffer, theLot, ((this.lot!= null)&&(!this.lot.isEmpty())));
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
                    if (draftCopy instanceof Feed.Projects.Project.Lots) {
                        final Feed.Projects.Project.Lots copy = ((Feed.Projects.Project.Lots) draftCopy);
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
                                List<Feed.Projects.Project.Lots.Lot> sourceLot;
                                sourceLot = (((this.lot!= null)&&(!this.lot.isEmpty()))?this.getLot():null);
                                @SuppressWarnings("unchecked")
                                List<Feed.Projects.Project.Lots.Lot> copyLot = ((List<Feed.Projects.Project.Lots.Lot> ) strategy.copy(LocatorUtils.property(locator, "lot", sourceLot), sourceLot, ((this.lot!= null)&&(!this.lot.isEmpty()))));
                                copy.lot = null;
                                if (copyLot!= null) {
                                    List<Feed.Projects.Project.Lots.Lot> uniqueLotl = copy.getLot();
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

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Object createNewInstance() {
                    return new Feed.Projects.Project.Lots();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Feed.Projects.Project.Lots that = ((Feed.Projects.Project.Lots) object);
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
                        List<Feed.Projects.Project.Lots.Lot> lhsLot;
                        lhsLot = (((this.lot!= null)&&(!this.lot.isEmpty()))?this.getLot():null);
                        List<Feed.Projects.Project.Lots.Lot> rhsLot;
                        rhsLot = (((that.lot!= null)&&(!that.lot.isEmpty()))?that.getLot():null);
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "lot", lhsLot), LocatorUtils.property(thatLocator, "lot", rhsLot), lhsLot, rhsLot, ((this.lot!= null)&&(!this.lot.isEmpty())), ((that.lot!= null)&&(!that.lot.isEmpty())))) {
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
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;all&gt;
                 *         &lt;element name="unique-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="property-type" type="{http://feed.immobiliare.it}propertyTypeProject"/&gt;
                 *         &lt;element name="price" type="{http://feed.immobiliare.it}priceType"/&gt;
                 *         &lt;element name="size" type="{http://feed.immobiliare.it}sizeType"/&gt;
                 *         &lt;element name="rooms" type="{http://feed.immobiliare.it}roomsType" minOccurs="0"/&gt;
                 *         &lt;element name="bathrooms" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
                 *         &lt;element name="floor" type="{http://feed.immobiliare.it}floorProject"/&gt;
                 *         &lt;element name="garage" type="{http://feed.immobiliare.it}boxProject"/&gt;
                 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="specification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="pictures" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="picture-url" type="{http://feed.immobiliare.it}pictureProject" maxOccurs="unbounded"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/all&gt;
                 *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                 *       &lt;attribute name="forsale" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
                public static class Lot implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
                {

                    @XmlElement(name = "unique-id", required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected String uniqueId;
                    @XmlElement(name = "property-type", required = true)
                    @XmlSchemaType(name = "string")
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected PropertyTypeProject propertyType;
                    @XmlElement(required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected PriceType price;
                    @XmlElement(required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected SizeType size;
                    @XmlElement(type = String.class)
                    @XmlJavaTypeAdapter(Adapter10 .class)
                    @XmlSchemaType(name = "integer")
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected Integer rooms;
                    @XmlElement(required = true, type = String.class)
                    @XmlJavaTypeAdapter(Adapter2 .class)
                    @XmlSchemaType(name = "integer")
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected BigInteger bathrooms;
                    @XmlElement(required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected FloorProject floor;
                    @XmlElement(required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected BoxProject garage;
                    @XmlElement(required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected String description;
                    @XmlElement(required = true)
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected String specification;
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected Feed.Projects.Project.Lots.Lot.Pictures pictures;
                    @XmlAttribute(name = "total")
                    @XmlJavaTypeAdapter(Adapter2 .class)
                    @XmlSchemaType(name = "integer")
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected BigInteger total;
                    @XmlAttribute(name = "forsale")
                    @XmlJavaTypeAdapter(Adapter2 .class)
                    @XmlSchemaType(name = "integer")
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    protected BigInteger forsale;

                    /**
                     * Gets the value of the uniqueId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public void setUniqueId(String value) {
                        this.uniqueId = value;
                    }

                    /**
                     * Gets the value of the propertyType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PropertyTypeProject }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public PropertyTypeProject getPropertyType() {
                        return propertyType;
                    }

                    /**
                     * Sets the value of the propertyType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PropertyTypeProject }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public void setPropertyType(PropertyTypeProject value) {
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public void setSize(SizeType value) {
                        this.size = value;
                    }

                    /**
                     * Gets the value of the rooms property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public Integer getRooms() {
                        return rooms;
                    }

                    /**
                     * Sets the value of the rooms property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public void setRooms(Integer value) {
                        this.rooms = value;
                    }

                    /**
                     * Gets the value of the bathrooms property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public BigInteger getBathrooms() {
                        return bathrooms;
                    }

                    /**
                     * Sets the value of the bathrooms property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public void setBathrooms(BigInteger value) {
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public void setGarage(BoxProject value) {
                        this.garage = value;
                    }

                    /**
                     * Gets the value of the description property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public String getDescription() {
                        return description;
                    }

                    /**
                     * Sets the value of the description property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public void setDescription(String value) {
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public void setSpecification(String value) {
                        this.specification = value;
                    }

                    /**
                     * Gets the value of the pictures property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Feed.Projects.Project.Lots.Lot.Pictures }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public Feed.Projects.Project.Lots.Lot.Pictures getPictures() {
                        return pictures;
                    }

                    /**
                     * Sets the value of the pictures property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Feed.Projects.Project.Lots.Lot.Pictures }
                     *     
                     */
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public void setPictures(Feed.Projects.Project.Lots.Lot.Pictures value) {
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public void setForsale(BigInteger value) {
                        this.forsale = value;
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
                            String theUniqueId;
                            theUniqueId = this.getUniqueId();
                            strategy.appendField(locator, this, "uniqueId", buffer, theUniqueId, (this.uniqueId!= null));
                        }
                        {
                            PropertyTypeProject thePropertyType;
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
                            Integer theRooms;
                            theRooms = this.getRooms();
                            strategy.appendField(locator, this, "rooms", buffer, theRooms, (this.rooms!= null));
                        }
                        {
                            BigInteger theBathrooms;
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
                            String theDescription;
                            theDescription = this.getDescription();
                            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
                        }
                        {
                            String theSpecification;
                            theSpecification = this.getSpecification();
                            strategy.appendField(locator, this, "specification", buffer, theSpecification, (this.specification!= null));
                        }
                        {
                            Feed.Projects.Project.Lots.Lot.Pictures thePictures;
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
                        if (draftCopy instanceof Feed.Projects.Project.Lots.Lot) {
                            final Feed.Projects.Project.Lots.Lot copy = ((Feed.Projects.Project.Lots.Lot) draftCopy);
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
                                    PropertyTypeProject sourcePropertyType;
                                    sourcePropertyType = this.getPropertyType();
                                    PropertyTypeProject copyPropertyType = ((PropertyTypeProject) strategy.copy(LocatorUtils.property(locator, "propertyType", sourcePropertyType), sourcePropertyType, (this.propertyType!= null)));
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
                                    Integer sourceRooms;
                                    sourceRooms = this.getRooms();
                                    Integer copyRooms = ((Integer) strategy.copy(LocatorUtils.property(locator, "rooms", sourceRooms), sourceRooms, (this.rooms!= null)));
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
                                    String sourceDescription;
                                    sourceDescription = this.getDescription();
                                    String copyDescription = ((String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, (this.description!= null)));
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
                                    Feed.Projects.Project.Lots.Lot.Pictures sourcePictures;
                                    sourcePictures = this.getPictures();
                                    Feed.Projects.Project.Lots.Lot.Pictures copyPictures = ((Feed.Projects.Project.Lots.Lot.Pictures) strategy.copy(LocatorUtils.property(locator, "pictures", sourcePictures), sourcePictures, (this.pictures!= null)));
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
                        }
                        return draftCopy;
                    }

                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public Object createNewInstance() {
                        return new Feed.Projects.Project.Lots.Lot();
                    }

                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                        if ((object == null)||(this.getClass()!= object.getClass())) {
                            return false;
                        }
                        if (this == object) {
                            return true;
                        }
                        final Feed.Projects.Project.Lots.Lot that = ((Feed.Projects.Project.Lots.Lot) object);
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
                            PropertyTypeProject lhsPropertyType;
                            lhsPropertyType = this.getPropertyType();
                            PropertyTypeProject rhsPropertyType;
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
                            Integer lhsRooms;
                            lhsRooms = this.getRooms();
                            Integer rhsRooms;
                            rhsRooms = that.getRooms();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "rooms", lhsRooms), LocatorUtils.property(thatLocator, "rooms", rhsRooms), lhsRooms, rhsRooms, (this.rooms!= null), (that.rooms!= null))) {
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
                            String lhsDescription;
                            lhsDescription = this.getDescription();
                            String rhsDescription;
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
                            Feed.Projects.Project.Lots.Lot.Pictures lhsPictures;
                            lhsPictures = this.getPictures();
                            Feed.Projects.Project.Lots.Lot.Pictures rhsPictures;
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
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="picture-url" type="{http://feed.immobiliare.it}pictureProject" maxOccurs="unbounded"/&gt;
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
                        "pictureUrl"
                    })
                    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                    public static class Pictures implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
                    {

                        @XmlElement(name = "picture-url", required = true)
                        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                        protected List<PictureProject> pictureUrl;

                        /**
                         * Gets the value of the pictureUrl property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the pictureUrl property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getPictureUrl().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PictureProject }
                         * 
                         * 
                         */
                        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                        public List<PictureProject> getPictureUrl() {
                            if (pictureUrl == null) {
                                pictureUrl = new ArrayList<PictureProject>();
                            }
                            return this.pictureUrl;
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
                                List<PictureProject> thePictureUrl;
                                thePictureUrl = (((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty()))?this.getPictureUrl():null);
                                strategy.appendField(locator, this, "pictureUrl", buffer, thePictureUrl, ((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty())));
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
                            if (draftCopy instanceof Feed.Projects.Project.Lots.Lot.Pictures) {
                                final Feed.Projects.Project.Lots.Lot.Pictures copy = ((Feed.Projects.Project.Lots.Lot.Pictures) draftCopy);
                                {
                                    Boolean pictureUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty())));
                                    if (pictureUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                                        List<PictureProject> sourcePictureUrl;
                                        sourcePictureUrl = (((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty()))?this.getPictureUrl():null);
                                        @SuppressWarnings("unchecked")
                                        List<PictureProject> copyPictureUrl = ((List<PictureProject> ) strategy.copy(LocatorUtils.property(locator, "pictureUrl", sourcePictureUrl), sourcePictureUrl, ((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty()))));
                                        copy.pictureUrl = null;
                                        if (copyPictureUrl!= null) {
                                            List<PictureProject> uniquePictureUrll = copy.getPictureUrl();
                                            uniquePictureUrll.addAll(copyPictureUrl);
                                        }
                                    } else {
                                        if (pictureUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                                            copy.pictureUrl = null;
                                        }
                                    }
                                }
                            }
                            return draftCopy;
                        }

                        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                        public Object createNewInstance() {
                            return new Feed.Projects.Project.Lots.Lot.Pictures();
                        }

                        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                            if ((object == null)||(this.getClass()!= object.getClass())) {
                                return false;
                            }
                            if (this == object) {
                                return true;
                            }
                            final Feed.Projects.Project.Lots.Lot.Pictures that = ((Feed.Projects.Project.Lots.Lot.Pictures) object);
                            {
                                List<PictureProject> lhsPictureUrl;
                                lhsPictureUrl = (((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty()))?this.getPictureUrl():null);
                                List<PictureProject> rhsPictureUrl;
                                rhsPictureUrl = (((that.pictureUrl!= null)&&(!that.pictureUrl.isEmpty()))?that.getPictureUrl():null);
                                if (!strategy.equals(LocatorUtils.property(thisLocator, "pictureUrl", lhsPictureUrl), LocatorUtils.property(thatLocator, "pictureUrl", rhsPictureUrl), lhsPictureUrl, rhsPictureUrl, ((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty())), ((that.pictureUrl!= null)&&(!that.pictureUrl.isEmpty())))) {
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
             *         &lt;element name="picture-url" type="{http://feed.immobiliare.it}pictureProject" maxOccurs="unbounded"/&gt;
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
                "pictureUrl"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public static class Pictures implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlElement(name = "picture-url", required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected List<PictureProject> pictureUrl;

                /**
                 * Gets the value of the pictureUrl property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pictureUrl property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPictureUrl().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PictureProject }
                 * 
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public List<PictureProject> getPictureUrl() {
                    if (pictureUrl == null) {
                        pictureUrl = new ArrayList<PictureProject>();
                    }
                    return this.pictureUrl;
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
                        List<PictureProject> thePictureUrl;
                        thePictureUrl = (((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty()))?this.getPictureUrl():null);
                        strategy.appendField(locator, this, "pictureUrl", buffer, thePictureUrl, ((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty())));
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
                    if (draftCopy instanceof Feed.Projects.Project.Pictures) {
                        final Feed.Projects.Project.Pictures copy = ((Feed.Projects.Project.Pictures) draftCopy);
                        {
                            Boolean pictureUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty())));
                            if (pictureUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                                List<PictureProject> sourcePictureUrl;
                                sourcePictureUrl = (((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty()))?this.getPictureUrl():null);
                                @SuppressWarnings("unchecked")
                                List<PictureProject> copyPictureUrl = ((List<PictureProject> ) strategy.copy(LocatorUtils.property(locator, "pictureUrl", sourcePictureUrl), sourcePictureUrl, ((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty()))));
                                copy.pictureUrl = null;
                                if (copyPictureUrl!= null) {
                                    List<PictureProject> uniquePictureUrll = copy.getPictureUrl();
                                    uniquePictureUrll.addAll(copyPictureUrl);
                                }
                            } else {
                                if (pictureUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.pictureUrl = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Object createNewInstance() {
                    return new Feed.Projects.Project.Pictures();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Feed.Projects.Project.Pictures that = ((Feed.Projects.Project.Pictures) object);
                    {
                        List<PictureProject> lhsPictureUrl;
                        lhsPictureUrl = (((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty()))?this.getPictureUrl():null);
                        List<PictureProject> rhsPictureUrl;
                        rhsPictureUrl = (((that.pictureUrl!= null)&&(!that.pictureUrl.isEmpty()))?that.getPictureUrl():null);
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "pictureUrl", lhsPictureUrl), LocatorUtils.property(thatLocator, "pictureUrl", rhsPictureUrl), lhsPictureUrl, rhsPictureUrl, ((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty())), ((that.pictureUrl!= null)&&(!that.pictureUrl.isEmpty())))) {
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
             *         &lt;element name="video" type="{http://feed.immobiliare.it}videoProject"/&gt;
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
            public static class Videos implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected VideoProject video;

                /**
                 * Gets the value of the video property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link VideoProject }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public VideoProject getVideo() {
                    return video;
                }

                /**
                 * Sets the value of the video property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link VideoProject }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setVideo(VideoProject value) {
                    this.video = value;
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
                        VideoProject theVideo;
                        theVideo = this.getVideo();
                        strategy.appendField(locator, this, "video", buffer, theVideo, (this.video!= null));
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
                    if (draftCopy instanceof Feed.Projects.Project.Videos) {
                        final Feed.Projects.Project.Videos copy = ((Feed.Projects.Project.Videos) draftCopy);
                        {
                            Boolean videoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.video!= null));
                            if (videoShouldBeCopiedAndSet == Boolean.TRUE) {
                                VideoProject sourceVideo;
                                sourceVideo = this.getVideo();
                                VideoProject copyVideo = ((VideoProject) strategy.copy(LocatorUtils.property(locator, "video", sourceVideo), sourceVideo, (this.video!= null)));
                                copy.setVideo(copyVideo);
                            } else {
                                if (videoShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.video = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Object createNewInstance() {
                    return new Feed.Projects.Project.Videos();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Feed.Projects.Project.Videos that = ((Feed.Projects.Project.Videos) object);
                    {
                        VideoProject lhsVideo;
                        lhsVideo = this.getVideo();
                        VideoProject rhsVideo;
                        rhsVideo = that.getVideo();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "video", lhsVideo), LocatorUtils.property(thatLocator, "video", rhsVideo), lhsVideo, rhsVideo, (this.video!= null), (that.video!= null))) {
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
     *         &lt;element name="property"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="unique-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="date-updated" type="{http://feed.immobiliare.it}dateUpdatedType"/&gt;
     *                   &lt;element name="date-expiration" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}dateTime {http://feed.immobiliare.it}nullString"&gt;
     *                       &lt;/union&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="transaction-type" type="{http://feed.immobiliare.it}transactionType"/&gt;
     *                   &lt;element name="building" type="{http://feed.immobiliare.it}building" minOccurs="0"/&gt;
     *                   &lt;element name="category" type="{http://feed.immobiliare.it}cat" minOccurs="0"/&gt;
     *                   &lt;element name="property-type" type="{http://feed.immobiliare.it}proptype" minOccurs="0"/&gt;
     *                   &lt;element name="building-status" type="{http://feed.immobiliare.it}status" minOccurs="0"/&gt;
     *                   &lt;element name="agent"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="office-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="email" type="{http://feed.immobiliare.it}emailType"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="location" type="{http://feed.immobiliare.it}locationStructure"/&gt;
     *                   &lt;element name="features"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="rooms" type="{http://feed.immobiliare.it}roomsType"/&gt;
     *                             &lt;element name="size" type="{http://feed.immobiliare.it}sizeType"/&gt;
     *                             &lt;element name="price" type="{http://feed.immobiliare.it}priceType"/&gt;
     *                             &lt;element name="description" type="{http://feed.immobiliare.it}langtxt" maxOccurs="25"/&gt;
     *                             &lt;element name="energy-class" type="{http://feed.immobiliare.it}classEnergy"/&gt;
     *                             &lt;element name="energy-performance" type="{http://feed.immobiliare.it}classEnergyPerformance" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="extra-features" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="bedrooms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="bathrooms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="garage" type="{http://feed.immobiliare.it}box" minOccurs="0"/&gt;
     *                             &lt;element name="kitchen" type="{http://feed.immobiliare.it}kitchen" minOccurs="0"/&gt;
     *                             &lt;element name="heating" type="{http://feed.immobiliare.it}heat" minOccurs="0"/&gt;
     *                             &lt;element name="garden" type="{http://feed.immobiliare.it}garden" minOccurs="0"/&gt;
     *                             &lt;element name="terrace" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
     *                             &lt;element name="balcony" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
     *                             &lt;element name="elevator" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
     *                             &lt;element name="air-conditioning" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
     *                             &lt;element name="floor" type="{http://feed.immobiliare.it}floor" minOccurs="0"/&gt;
     *                             &lt;element name="num-floors" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="virtual-tour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="rent-contract" type="{http://feed.immobiliare.it}rental" minOccurs="0"/&gt;
     *                             &lt;element name="additional-costs" type="{http://feed.immobiliare.it}additionalCostsType" minOccurs="0"/&gt;
     *                             &lt;element name="furniture" type="{http://feed.immobiliare.it}furniture" minOccurs="0"/&gt;
     *                             &lt;element name="security-alarm" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
     *                             &lt;element name="reception" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
     *                             &lt;element name="net" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
     *                             &lt;element name="external-area" type="{http://feed.immobiliare.it}landSizeType" minOccurs="0"/&gt;
     *                             &lt;element name="build-year" type="{http://feed.immobiliare.it}year" minOccurs="0"/&gt;
     *                             &lt;element name="free-conditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="overhead-crane" type="{http://feed.immobiliare.it}yesnoready" minOccurs="0"/&gt;
     *                             &lt;element name="beam-height" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                             &lt;element name="office-size" type="{http://feed.immobiliare.it}sizeType" minOccurs="0"/&gt;
     *                             &lt;element name="floorplanner-url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="doc-specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="doc-description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="pictures" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence maxOccurs="15" minOccurs="0"&gt;
     *                             &lt;element name="picture-url" type="{http://feed.immobiliare.it}pictureProject" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                             &lt;element name="picture" type="{http://feed.immobiliare.it}pictureExtended" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="blueprints" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="blueprint" type="{http://feed.immobiliare.it}pictureExtended" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="videos" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence maxOccurs="4"&gt;
     *                             &lt;element name="video" type="{http://feed.immobiliare.it}videoProject"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *                 &lt;attribute name="operation" type="{http://feed.immobiliare.it}operation" /&gt;
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
        "property"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
    public static class Properties implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        protected List<Feed.Properties.Property> property;

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
         * {@link Feed.Properties.Property }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public List<Feed.Properties.Property> getProperty() {
            if (property == null) {
                property = new ArrayList<Feed.Properties.Property>();
            }
            return this.property;
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
                List<Feed.Properties.Property> theProperty;
                theProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
                strategy.appendField(locator, this, "property", buffer, theProperty, ((this.property!= null)&&(!this.property.isEmpty())));
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
            if (draftCopy instanceof Feed.Properties) {
                final Feed.Properties copy = ((Feed.Properties) draftCopy);
                {
                    Boolean propertyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.property!= null)&&(!this.property.isEmpty())));
                    if (propertyShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<Feed.Properties.Property> sourceProperty;
                        sourceProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
                        @SuppressWarnings("unchecked")
                        List<Feed.Properties.Property> copyProperty = ((List<Feed.Properties.Property> ) strategy.copy(LocatorUtils.property(locator, "property", sourceProperty), sourceProperty, ((this.property!= null)&&(!this.property.isEmpty()))));
                        copy.property = null;
                        if (copyProperty!= null) {
                            List<Feed.Properties.Property> uniquePropertyl = copy.getProperty();
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

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new Feed.Properties();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Feed.Properties that = ((Feed.Properties) object);
            {
                List<Feed.Properties.Property> lhsProperty;
                lhsProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
                List<Feed.Properties.Property> rhsProperty;
                rhsProperty = (((that.property!= null)&&(!that.property.isEmpty()))?that.getProperty():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "property", lhsProperty), LocatorUtils.property(thatLocator, "property", rhsProperty), lhsProperty, rhsProperty, ((this.property!= null)&&(!this.property.isEmpty())), ((that.property!= null)&&(!that.property.isEmpty())))) {
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
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="unique-id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="date-updated" type="{http://feed.immobiliare.it}dateUpdatedType"/&gt;
         *         &lt;element name="date-expiration" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}dateTime {http://feed.immobiliare.it}nullString"&gt;
         *             &lt;/union&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="transaction-type" type="{http://feed.immobiliare.it}transactionType"/&gt;
         *         &lt;element name="building" type="{http://feed.immobiliare.it}building" minOccurs="0"/&gt;
         *         &lt;element name="category" type="{http://feed.immobiliare.it}cat" minOccurs="0"/&gt;
         *         &lt;element name="property-type" type="{http://feed.immobiliare.it}proptype" minOccurs="0"/&gt;
         *         &lt;element name="building-status" type="{http://feed.immobiliare.it}status" minOccurs="0"/&gt;
         *         &lt;element name="agent"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="office-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="email" type="{http://feed.immobiliare.it}emailType"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="location" type="{http://feed.immobiliare.it}locationStructure"/&gt;
         *         &lt;element name="features"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="rooms" type="{http://feed.immobiliare.it}roomsType"/&gt;
         *                   &lt;element name="size" type="{http://feed.immobiliare.it}sizeType"/&gt;
         *                   &lt;element name="price" type="{http://feed.immobiliare.it}priceType"/&gt;
         *                   &lt;element name="description" type="{http://feed.immobiliare.it}langtxt" maxOccurs="25"/&gt;
         *                   &lt;element name="energy-class" type="{http://feed.immobiliare.it}classEnergy"/&gt;
         *                   &lt;element name="energy-performance" type="{http://feed.immobiliare.it}classEnergyPerformance" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="extra-features" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="bedrooms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="bathrooms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="garage" type="{http://feed.immobiliare.it}box" minOccurs="0"/&gt;
         *                   &lt;element name="kitchen" type="{http://feed.immobiliare.it}kitchen" minOccurs="0"/&gt;
         *                   &lt;element name="heating" type="{http://feed.immobiliare.it}heat" minOccurs="0"/&gt;
         *                   &lt;element name="garden" type="{http://feed.immobiliare.it}garden" minOccurs="0"/&gt;
         *                   &lt;element name="terrace" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
         *                   &lt;element name="balcony" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
         *                   &lt;element name="elevator" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
         *                   &lt;element name="air-conditioning" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
         *                   &lt;element name="floor" type="{http://feed.immobiliare.it}floor" minOccurs="0"/&gt;
         *                   &lt;element name="num-floors" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="virtual-tour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="rent-contract" type="{http://feed.immobiliare.it}rental" minOccurs="0"/&gt;
         *                   &lt;element name="additional-costs" type="{http://feed.immobiliare.it}additionalCostsType" minOccurs="0"/&gt;
         *                   &lt;element name="furniture" type="{http://feed.immobiliare.it}furniture" minOccurs="0"/&gt;
         *                   &lt;element name="security-alarm" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
         *                   &lt;element name="reception" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
         *                   &lt;element name="net" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
         *                   &lt;element name="external-area" type="{http://feed.immobiliare.it}landSizeType" minOccurs="0"/&gt;
         *                   &lt;element name="build-year" type="{http://feed.immobiliare.it}year" minOccurs="0"/&gt;
         *                   &lt;element name="free-conditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="overhead-crane" type="{http://feed.immobiliare.it}yesnoready" minOccurs="0"/&gt;
         *                   &lt;element name="beam-height" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                   &lt;element name="office-size" type="{http://feed.immobiliare.it}sizeType" minOccurs="0"/&gt;
         *                   &lt;element name="floorplanner-url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="doc-specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="doc-description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="pictures" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence maxOccurs="15" minOccurs="0"&gt;
         *                   &lt;element name="picture-url" type="{http://feed.immobiliare.it}pictureProject" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                   &lt;element name="picture" type="{http://feed.immobiliare.it}pictureExtended" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="blueprints" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="blueprint" type="{http://feed.immobiliare.it}pictureExtended" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="videos" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence maxOccurs="4"&gt;
         *                   &lt;element name="video" type="{http://feed.immobiliare.it}videoProject"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *       &lt;attribute name="operation" type="{http://feed.immobiliare.it}operation" /&gt;
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
        public static class Property implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
        {

            @XmlElement(name = "unique-id", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected String uniqueId;
            @XmlElement(name = "date-updated", required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter3 .class)
            @XmlSchemaType(name = "dateTime")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Calendar dateUpdated;
            @XmlElement(name = "date-expiration", type = String.class)
            @XmlJavaTypeAdapter(Adapter22 .class)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Calendar dateExpiration;
            @XmlElement(name = "transaction-type", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected TransactionType transactionType;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Building building;
            @XmlElement(type = String.class)
            @XmlJavaTypeAdapter(Adapter5 .class)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Category category;
            @XmlElement(name = "property-type")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Proptype propertyType;
            @XmlElement(name = "building-status")
            @XmlSchemaType(name = "string")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Status buildingStatus;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Feed.Properties.Property.Agent agent;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected LocationStructure location;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Feed.Properties.Property.Features features;
            @XmlElement(name = "extra-features")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Feed.Properties.Property.ExtraFeatures extraFeatures;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Feed.Properties.Property.Pictures pictures;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Feed.Properties.Property.Blueprints blueprints;
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Feed.Properties.Property.Videos videos;
            @XmlAttribute(name = "operation")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            protected Operation operation;

            /**
             * Gets the value of the uniqueId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setUniqueId(String value) {
                this.uniqueId = value;
            }

            /**
             * Gets the value of the dateUpdated property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Calendar getDateUpdated() {
                return dateUpdated;
            }

            /**
             * Sets the value of the dateUpdated property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setDateUpdated(Calendar value) {
                this.dateUpdated = value;
            }

            /**
             * Gets the value of the dateExpiration property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Calendar getDateExpiration() {
                return dateExpiration;
            }

            /**
             * Sets the value of the dateExpiration property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setDateExpiration(Calendar value) {
                this.dateExpiration = value;
            }

            /**
             * Gets the value of the transactionType property.
             * 
             * @return
             *     possible object is
             *     {@link TransactionType }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public TransactionType getTransactionType() {
                return transactionType;
            }

            /**
             * Sets the value of the transactionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link TransactionType }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setTransactionType(TransactionType value) {
                this.transactionType = value;
            }

            /**
             * Gets the value of the building property.
             * 
             * @return
             *     possible object is
             *     {@link Building }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Building getBuilding() {
                return building;
            }

            /**
             * Sets the value of the building property.
             * 
             * @param value
             *     allowed object is
             *     {@link Building }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setBuilding(Building value) {
                this.building = value;
            }

            /**
             * Gets the value of the category property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Category getCategory() {
                return category;
            }

            /**
             * Sets the value of the category property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setCategory(Category value) {
                this.category = value;
            }

            /**
             * Gets the value of the propertyType property.
             * 
             * @return
             *     possible object is
             *     {@link Proptype }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Proptype getPropertyType() {
                return propertyType;
            }

            /**
             * Sets the value of the propertyType property.
             * 
             * @param value
             *     allowed object is
             *     {@link Proptype }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setPropertyType(Proptype value) {
                this.propertyType = value;
            }

            /**
             * Gets the value of the buildingStatus property.
             * 
             * @return
             *     possible object is
             *     {@link Status }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Status getBuildingStatus() {
                return buildingStatus;
            }

            /**
             * Sets the value of the buildingStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link Status }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setBuildingStatus(Status value) {
                this.buildingStatus = value;
            }

            /**
             * Gets the value of the agent property.
             * 
             * @return
             *     possible object is
             *     {@link Feed.Properties.Property.Agent }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Feed.Properties.Property.Agent getAgent() {
                return agent;
            }

            /**
             * Sets the value of the agent property.
             * 
             * @param value
             *     allowed object is
             *     {@link Feed.Properties.Property.Agent }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setAgent(Feed.Properties.Property.Agent value) {
                this.agent = value;
            }

            /**
             * Gets the value of the location property.
             * 
             * @return
             *     possible object is
             *     {@link LocationStructure }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setLocation(LocationStructure value) {
                this.location = value;
            }

            /**
             * Gets the value of the features property.
             * 
             * @return
             *     possible object is
             *     {@link Feed.Properties.Property.Features }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Feed.Properties.Property.Features getFeatures() {
                return features;
            }

            /**
             * Sets the value of the features property.
             * 
             * @param value
             *     allowed object is
             *     {@link Feed.Properties.Property.Features }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setFeatures(Feed.Properties.Property.Features value) {
                this.features = value;
            }

            /**
             * Gets the value of the extraFeatures property.
             * 
             * @return
             *     possible object is
             *     {@link Feed.Properties.Property.ExtraFeatures }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Feed.Properties.Property.ExtraFeatures getExtraFeatures() {
                return extraFeatures;
            }

            /**
             * Sets the value of the extraFeatures property.
             * 
             * @param value
             *     allowed object is
             *     {@link Feed.Properties.Property.ExtraFeatures }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setExtraFeatures(Feed.Properties.Property.ExtraFeatures value) {
                this.extraFeatures = value;
            }

            /**
             * Gets the value of the pictures property.
             * 
             * @return
             *     possible object is
             *     {@link Feed.Properties.Property.Pictures }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Feed.Properties.Property.Pictures getPictures() {
                return pictures;
            }

            /**
             * Sets the value of the pictures property.
             * 
             * @param value
             *     allowed object is
             *     {@link Feed.Properties.Property.Pictures }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setPictures(Feed.Properties.Property.Pictures value) {
                this.pictures = value;
            }

            /**
             * Gets the value of the blueprints property.
             * 
             * @return
             *     possible object is
             *     {@link Feed.Properties.Property.Blueprints }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Feed.Properties.Property.Blueprints getBlueprints() {
                return blueprints;
            }

            /**
             * Sets the value of the blueprints property.
             * 
             * @param value
             *     allowed object is
             *     {@link Feed.Properties.Property.Blueprints }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setBlueprints(Feed.Properties.Property.Blueprints value) {
                this.blueprints = value;
            }

            /**
             * Gets the value of the videos property.
             * 
             * @return
             *     possible object is
             *     {@link Feed.Properties.Property.Videos }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Feed.Properties.Property.Videos getVideos() {
                return videos;
            }

            /**
             * Sets the value of the videos property.
             * 
             * @param value
             *     allowed object is
             *     {@link Feed.Properties.Property.Videos }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setVideos(Feed.Properties.Property.Videos value) {
                this.videos = value;
            }

            /**
             * Gets the value of the operation property.
             * 
             * @return
             *     possible object is
             *     {@link Operation }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Operation getOperation() {
                return operation;
            }

            /**
             * Sets the value of the operation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Operation }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public void setOperation(Operation value) {
                this.operation = value;
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
                    String theUniqueId;
                    theUniqueId = this.getUniqueId();
                    strategy.appendField(locator, this, "uniqueId", buffer, theUniqueId, (this.uniqueId!= null));
                }
                {
                    Calendar theDateUpdated;
                    theDateUpdated = this.getDateUpdated();
                    strategy.appendField(locator, this, "dateUpdated", buffer, theDateUpdated, (this.dateUpdated!= null));
                }
                {
                    Calendar theDateExpiration;
                    theDateExpiration = this.getDateExpiration();
                    strategy.appendField(locator, this, "dateExpiration", buffer, theDateExpiration, (this.dateExpiration!= null));
                }
                {
                    TransactionType theTransactionType;
                    theTransactionType = this.getTransactionType();
                    strategy.appendField(locator, this, "transactionType", buffer, theTransactionType, (this.transactionType!= null));
                }
                {
                    Building theBuilding;
                    theBuilding = this.getBuilding();
                    strategy.appendField(locator, this, "building", buffer, theBuilding, (this.building!= null));
                }
                {
                    Category theCategory;
                    theCategory = this.getCategory();
                    strategy.appendField(locator, this, "category", buffer, theCategory, (this.category!= null));
                }
                {
                    Proptype thePropertyType;
                    thePropertyType = this.getPropertyType();
                    strategy.appendField(locator, this, "propertyType", buffer, thePropertyType, (this.propertyType!= null));
                }
                {
                    Status theBuildingStatus;
                    theBuildingStatus = this.getBuildingStatus();
                    strategy.appendField(locator, this, "buildingStatus", buffer, theBuildingStatus, (this.buildingStatus!= null));
                }
                {
                    Feed.Properties.Property.Agent theAgent;
                    theAgent = this.getAgent();
                    strategy.appendField(locator, this, "agent", buffer, theAgent, (this.agent!= null));
                }
                {
                    LocationStructure theLocation;
                    theLocation = this.getLocation();
                    strategy.appendField(locator, this, "location", buffer, theLocation, (this.location!= null));
                }
                {
                    Feed.Properties.Property.Features theFeatures;
                    theFeatures = this.getFeatures();
                    strategy.appendField(locator, this, "features", buffer, theFeatures, (this.features!= null));
                }
                {
                    Feed.Properties.Property.ExtraFeatures theExtraFeatures;
                    theExtraFeatures = this.getExtraFeatures();
                    strategy.appendField(locator, this, "extraFeatures", buffer, theExtraFeatures, (this.extraFeatures!= null));
                }
                {
                    Feed.Properties.Property.Pictures thePictures;
                    thePictures = this.getPictures();
                    strategy.appendField(locator, this, "pictures", buffer, thePictures, (this.pictures!= null));
                }
                {
                    Feed.Properties.Property.Blueprints theBlueprints;
                    theBlueprints = this.getBlueprints();
                    strategy.appendField(locator, this, "blueprints", buffer, theBlueprints, (this.blueprints!= null));
                }
                {
                    Feed.Properties.Property.Videos theVideos;
                    theVideos = this.getVideos();
                    strategy.appendField(locator, this, "videos", buffer, theVideos, (this.videos!= null));
                }
                {
                    Operation theOperation;
                    theOperation = this.getOperation();
                    strategy.appendField(locator, this, "operation", buffer, theOperation, (this.operation!= null));
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
                if (draftCopy instanceof Feed.Properties.Property) {
                    final Feed.Properties.Property copy = ((Feed.Properties.Property) draftCopy);
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
                        Boolean dateUpdatedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateUpdated!= null));
                        if (dateUpdatedShouldBeCopiedAndSet == Boolean.TRUE) {
                            Calendar sourceDateUpdated;
                            sourceDateUpdated = this.getDateUpdated();
                            Calendar copyDateUpdated = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateUpdated", sourceDateUpdated), sourceDateUpdated, (this.dateUpdated!= null)));
                            copy.setDateUpdated(copyDateUpdated);
                        } else {
                            if (dateUpdatedShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.dateUpdated = null;
                            }
                        }
                    }
                    {
                        Boolean dateExpirationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateExpiration!= null));
                        if (dateExpirationShouldBeCopiedAndSet == Boolean.TRUE) {
                            Calendar sourceDateExpiration;
                            sourceDateExpiration = this.getDateExpiration();
                            Calendar copyDateExpiration = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateExpiration", sourceDateExpiration), sourceDateExpiration, (this.dateExpiration!= null)));
                            copy.setDateExpiration(copyDateExpiration);
                        } else {
                            if (dateExpirationShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.dateExpiration = null;
                            }
                        }
                    }
                    {
                        Boolean transactionTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.transactionType!= null));
                        if (transactionTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                            TransactionType sourceTransactionType;
                            sourceTransactionType = this.getTransactionType();
                            TransactionType copyTransactionType = ((TransactionType) strategy.copy(LocatorUtils.property(locator, "transactionType", sourceTransactionType), sourceTransactionType, (this.transactionType!= null)));
                            copy.setTransactionType(copyTransactionType);
                        } else {
                            if (transactionTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.transactionType = null;
                            }
                        }
                    }
                    {
                        Boolean buildingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.building!= null));
                        if (buildingShouldBeCopiedAndSet == Boolean.TRUE) {
                            Building sourceBuilding;
                            sourceBuilding = this.getBuilding();
                            Building copyBuilding = ((Building) strategy.copy(LocatorUtils.property(locator, "building", sourceBuilding), sourceBuilding, (this.building!= null)));
                            copy.setBuilding(copyBuilding);
                        } else {
                            if (buildingShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.building = null;
                            }
                        }
                    }
                    {
                        Boolean categoryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.category!= null));
                        if (categoryShouldBeCopiedAndSet == Boolean.TRUE) {
                            Category sourceCategory;
                            sourceCategory = this.getCategory();
                            Category copyCategory = ((Category) strategy.copy(LocatorUtils.property(locator, "category", sourceCategory), sourceCategory, (this.category!= null)));
                            copy.setCategory(copyCategory);
                        } else {
                            if (categoryShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.category = null;
                            }
                        }
                    }
                    {
                        Boolean propertyTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.propertyType!= null));
                        if (propertyTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                            Proptype sourcePropertyType;
                            sourcePropertyType = this.getPropertyType();
                            Proptype copyPropertyType = ((Proptype) strategy.copy(LocatorUtils.property(locator, "propertyType", sourcePropertyType), sourcePropertyType, (this.propertyType!= null)));
                            copy.setPropertyType(copyPropertyType);
                        } else {
                            if (propertyTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.propertyType = null;
                            }
                        }
                    }
                    {
                        Boolean buildingStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.buildingStatus!= null));
                        if (buildingStatusShouldBeCopiedAndSet == Boolean.TRUE) {
                            Status sourceBuildingStatus;
                            sourceBuildingStatus = this.getBuildingStatus();
                            Status copyBuildingStatus = ((Status) strategy.copy(LocatorUtils.property(locator, "buildingStatus", sourceBuildingStatus), sourceBuildingStatus, (this.buildingStatus!= null)));
                            copy.setBuildingStatus(copyBuildingStatus);
                        } else {
                            if (buildingStatusShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.buildingStatus = null;
                            }
                        }
                    }
                    {
                        Boolean agentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.agent!= null));
                        if (agentShouldBeCopiedAndSet == Boolean.TRUE) {
                            Feed.Properties.Property.Agent sourceAgent;
                            sourceAgent = this.getAgent();
                            Feed.Properties.Property.Agent copyAgent = ((Feed.Properties.Property.Agent) strategy.copy(LocatorUtils.property(locator, "agent", sourceAgent), sourceAgent, (this.agent!= null)));
                            copy.setAgent(copyAgent);
                        } else {
                            if (agentShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.agent = null;
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
                        Boolean featuresShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.features!= null));
                        if (featuresShouldBeCopiedAndSet == Boolean.TRUE) {
                            Feed.Properties.Property.Features sourceFeatures;
                            sourceFeatures = this.getFeatures();
                            Feed.Properties.Property.Features copyFeatures = ((Feed.Properties.Property.Features) strategy.copy(LocatorUtils.property(locator, "features", sourceFeatures), sourceFeatures, (this.features!= null)));
                            copy.setFeatures(copyFeatures);
                        } else {
                            if (featuresShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.features = null;
                            }
                        }
                    }
                    {
                        Boolean extraFeaturesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.extraFeatures!= null));
                        if (extraFeaturesShouldBeCopiedAndSet == Boolean.TRUE) {
                            Feed.Properties.Property.ExtraFeatures sourceExtraFeatures;
                            sourceExtraFeatures = this.getExtraFeatures();
                            Feed.Properties.Property.ExtraFeatures copyExtraFeatures = ((Feed.Properties.Property.ExtraFeatures) strategy.copy(LocatorUtils.property(locator, "extraFeatures", sourceExtraFeatures), sourceExtraFeatures, (this.extraFeatures!= null)));
                            copy.setExtraFeatures(copyExtraFeatures);
                        } else {
                            if (extraFeaturesShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.extraFeatures = null;
                            }
                        }
                    }
                    {
                        Boolean picturesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pictures!= null));
                        if (picturesShouldBeCopiedAndSet == Boolean.TRUE) {
                            Feed.Properties.Property.Pictures sourcePictures;
                            sourcePictures = this.getPictures();
                            Feed.Properties.Property.Pictures copyPictures = ((Feed.Properties.Property.Pictures) strategy.copy(LocatorUtils.property(locator, "pictures", sourcePictures), sourcePictures, (this.pictures!= null)));
                            copy.setPictures(copyPictures);
                        } else {
                            if (picturesShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.pictures = null;
                            }
                        }
                    }
                    {
                        Boolean blueprintsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.blueprints!= null));
                        if (blueprintsShouldBeCopiedAndSet == Boolean.TRUE) {
                            Feed.Properties.Property.Blueprints sourceBlueprints;
                            sourceBlueprints = this.getBlueprints();
                            Feed.Properties.Property.Blueprints copyBlueprints = ((Feed.Properties.Property.Blueprints) strategy.copy(LocatorUtils.property(locator, "blueprints", sourceBlueprints), sourceBlueprints, (this.blueprints!= null)));
                            copy.setBlueprints(copyBlueprints);
                        } else {
                            if (blueprintsShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.blueprints = null;
                            }
                        }
                    }
                    {
                        Boolean videosShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.videos!= null));
                        if (videosShouldBeCopiedAndSet == Boolean.TRUE) {
                            Feed.Properties.Property.Videos sourceVideos;
                            sourceVideos = this.getVideos();
                            Feed.Properties.Property.Videos copyVideos = ((Feed.Properties.Property.Videos) strategy.copy(LocatorUtils.property(locator, "videos", sourceVideos), sourceVideos, (this.videos!= null)));
                            copy.setVideos(copyVideos);
                        } else {
                            if (videosShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.videos = null;
                            }
                        }
                    }
                    {
                        Boolean operationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operation!= null));
                        if (operationShouldBeCopiedAndSet == Boolean.TRUE) {
                            Operation sourceOperation;
                            sourceOperation = this.getOperation();
                            Operation copyOperation = ((Operation) strategy.copy(LocatorUtils.property(locator, "operation", sourceOperation), sourceOperation, (this.operation!= null)));
                            copy.setOperation(copyOperation);
                        } else {
                            if (operationShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.operation = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public Object createNewInstance() {
                return new Feed.Properties.Property();
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final Feed.Properties.Property that = ((Feed.Properties.Property) object);
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
                    Calendar lhsDateUpdated;
                    lhsDateUpdated = this.getDateUpdated();
                    Calendar rhsDateUpdated;
                    rhsDateUpdated = that.getDateUpdated();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "dateUpdated", lhsDateUpdated), LocatorUtils.property(thatLocator, "dateUpdated", rhsDateUpdated), lhsDateUpdated, rhsDateUpdated, (this.dateUpdated!= null), (that.dateUpdated!= null))) {
                        return false;
                    }
                }
                {
                    Calendar lhsDateExpiration;
                    lhsDateExpiration = this.getDateExpiration();
                    Calendar rhsDateExpiration;
                    rhsDateExpiration = that.getDateExpiration();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "dateExpiration", lhsDateExpiration), LocatorUtils.property(thatLocator, "dateExpiration", rhsDateExpiration), lhsDateExpiration, rhsDateExpiration, (this.dateExpiration!= null), (that.dateExpiration!= null))) {
                        return false;
                    }
                }
                {
                    TransactionType lhsTransactionType;
                    lhsTransactionType = this.getTransactionType();
                    TransactionType rhsTransactionType;
                    rhsTransactionType = that.getTransactionType();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionType", lhsTransactionType), LocatorUtils.property(thatLocator, "transactionType", rhsTransactionType), lhsTransactionType, rhsTransactionType, (this.transactionType!= null), (that.transactionType!= null))) {
                        return false;
                    }
                }
                {
                    Building lhsBuilding;
                    lhsBuilding = this.getBuilding();
                    Building rhsBuilding;
                    rhsBuilding = that.getBuilding();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "building", lhsBuilding), LocatorUtils.property(thatLocator, "building", rhsBuilding), lhsBuilding, rhsBuilding, (this.building!= null), (that.building!= null))) {
                        return false;
                    }
                }
                {
                    Category lhsCategory;
                    lhsCategory = this.getCategory();
                    Category rhsCategory;
                    rhsCategory = that.getCategory();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory, (this.category!= null), (that.category!= null))) {
                        return false;
                    }
                }
                {
                    Proptype lhsPropertyType;
                    lhsPropertyType = this.getPropertyType();
                    Proptype rhsPropertyType;
                    rhsPropertyType = that.getPropertyType();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyType", lhsPropertyType), LocatorUtils.property(thatLocator, "propertyType", rhsPropertyType), lhsPropertyType, rhsPropertyType, (this.propertyType!= null), (that.propertyType!= null))) {
                        return false;
                    }
                }
                {
                    Status lhsBuildingStatus;
                    lhsBuildingStatus = this.getBuildingStatus();
                    Status rhsBuildingStatus;
                    rhsBuildingStatus = that.getBuildingStatus();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingStatus", lhsBuildingStatus), LocatorUtils.property(thatLocator, "buildingStatus", rhsBuildingStatus), lhsBuildingStatus, rhsBuildingStatus, (this.buildingStatus!= null), (that.buildingStatus!= null))) {
                        return false;
                    }
                }
                {
                    Feed.Properties.Property.Agent lhsAgent;
                    lhsAgent = this.getAgent();
                    Feed.Properties.Property.Agent rhsAgent;
                    rhsAgent = that.getAgent();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "agent", lhsAgent), LocatorUtils.property(thatLocator, "agent", rhsAgent), lhsAgent, rhsAgent, (this.agent!= null), (that.agent!= null))) {
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
                    Feed.Properties.Property.Features lhsFeatures;
                    lhsFeatures = this.getFeatures();
                    Feed.Properties.Property.Features rhsFeatures;
                    rhsFeatures = that.getFeatures();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "features", lhsFeatures), LocatorUtils.property(thatLocator, "features", rhsFeatures), lhsFeatures, rhsFeatures, (this.features!= null), (that.features!= null))) {
                        return false;
                    }
                }
                {
                    Feed.Properties.Property.ExtraFeatures lhsExtraFeatures;
                    lhsExtraFeatures = this.getExtraFeatures();
                    Feed.Properties.Property.ExtraFeatures rhsExtraFeatures;
                    rhsExtraFeatures = that.getExtraFeatures();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "extraFeatures", lhsExtraFeatures), LocatorUtils.property(thatLocator, "extraFeatures", rhsExtraFeatures), lhsExtraFeatures, rhsExtraFeatures, (this.extraFeatures!= null), (that.extraFeatures!= null))) {
                        return false;
                    }
                }
                {
                    Feed.Properties.Property.Pictures lhsPictures;
                    lhsPictures = this.getPictures();
                    Feed.Properties.Property.Pictures rhsPictures;
                    rhsPictures = that.getPictures();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "pictures", lhsPictures), LocatorUtils.property(thatLocator, "pictures", rhsPictures), lhsPictures, rhsPictures, (this.pictures!= null), (that.pictures!= null))) {
                        return false;
                    }
                }
                {
                    Feed.Properties.Property.Blueprints lhsBlueprints;
                    lhsBlueprints = this.getBlueprints();
                    Feed.Properties.Property.Blueprints rhsBlueprints;
                    rhsBlueprints = that.getBlueprints();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "blueprints", lhsBlueprints), LocatorUtils.property(thatLocator, "blueprints", rhsBlueprints), lhsBlueprints, rhsBlueprints, (this.blueprints!= null), (that.blueprints!= null))) {
                        return false;
                    }
                }
                {
                    Feed.Properties.Property.Videos lhsVideos;
                    lhsVideos = this.getVideos();
                    Feed.Properties.Property.Videos rhsVideos;
                    rhsVideos = that.getVideos();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "videos", lhsVideos), LocatorUtils.property(thatLocator, "videos", rhsVideos), lhsVideos, rhsVideos, (this.videos!= null), (that.videos!= null))) {
                        return false;
                    }
                }
                {
                    Operation lhsOperation;
                    lhsOperation = this.getOperation();
                    Operation rhsOperation;
                    rhsOperation = that.getOperation();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "operation", lhsOperation), LocatorUtils.property(thatLocator, "operation", rhsOperation), lhsOperation, rhsOperation, (this.operation!= null), (that.operation!= null))) {
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
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;all&gt;
             *         &lt;element name="office-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="email" type="{http://feed.immobiliare.it}emailType"/&gt;
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
            public static class Agent implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlElement(name = "office-name")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected String officeName;
                @XmlElement(required = true)
                @XmlJavaTypeAdapter(Adapter4 .class)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected String email;

                /**
                 * Gets the value of the officeName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setEmail(String value) {
                    this.email = value;
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
                        String theOfficeName;
                        theOfficeName = this.getOfficeName();
                        strategy.appendField(locator, this, "officeName", buffer, theOfficeName, (this.officeName!= null));
                    }
                    {
                        String theEmail;
                        theEmail = this.getEmail();
                        strategy.appendField(locator, this, "email", buffer, theEmail, (this.email!= null));
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
                    if (draftCopy instanceof Feed.Properties.Property.Agent) {
                        final Feed.Properties.Property.Agent copy = ((Feed.Properties.Property.Agent) draftCopy);
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
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Object createNewInstance() {
                    return new Feed.Properties.Property.Agent();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Feed.Properties.Property.Agent that = ((Feed.Properties.Property.Agent) object);
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
             *       &lt;sequence&gt;
             *         &lt;element name="blueprint" type="{http://feed.immobiliare.it}pictureExtended" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                "blueprint"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public static class Blueprints implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected List<PictureExtended> blueprint;

                /**
                 * Gets the value of the blueprint property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the blueprint property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBlueprint().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PictureExtended }
                 * 
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public List<PictureExtended> getBlueprint() {
                    if (blueprint == null) {
                        blueprint = new ArrayList<PictureExtended>();
                    }
                    return this.blueprint;
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
                        List<PictureExtended> theBlueprint;
                        theBlueprint = (((this.blueprint!= null)&&(!this.blueprint.isEmpty()))?this.getBlueprint():null);
                        strategy.appendField(locator, this, "blueprint", buffer, theBlueprint, ((this.blueprint!= null)&&(!this.blueprint.isEmpty())));
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
                    if (draftCopy instanceof Feed.Properties.Property.Blueprints) {
                        final Feed.Properties.Property.Blueprints copy = ((Feed.Properties.Property.Blueprints) draftCopy);
                        {
                            Boolean blueprintShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.blueprint!= null)&&(!this.blueprint.isEmpty())));
                            if (blueprintShouldBeCopiedAndSet == Boolean.TRUE) {
                                List<PictureExtended> sourceBlueprint;
                                sourceBlueprint = (((this.blueprint!= null)&&(!this.blueprint.isEmpty()))?this.getBlueprint():null);
                                @SuppressWarnings("unchecked")
                                List<PictureExtended> copyBlueprint = ((List<PictureExtended> ) strategy.copy(LocatorUtils.property(locator, "blueprint", sourceBlueprint), sourceBlueprint, ((this.blueprint!= null)&&(!this.blueprint.isEmpty()))));
                                copy.blueprint = null;
                                if (copyBlueprint!= null) {
                                    List<PictureExtended> uniqueBlueprintl = copy.getBlueprint();
                                    uniqueBlueprintl.addAll(copyBlueprint);
                                }
                            } else {
                                if (blueprintShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.blueprint = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Object createNewInstance() {
                    return new Feed.Properties.Property.Blueprints();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Feed.Properties.Property.Blueprints that = ((Feed.Properties.Property.Blueprints) object);
                    {
                        List<PictureExtended> lhsBlueprint;
                        lhsBlueprint = (((this.blueprint!= null)&&(!this.blueprint.isEmpty()))?this.getBlueprint():null);
                        List<PictureExtended> rhsBlueprint;
                        rhsBlueprint = (((that.blueprint!= null)&&(!that.blueprint.isEmpty()))?that.getBlueprint():null);
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "blueprint", lhsBlueprint), LocatorUtils.property(thatLocator, "blueprint", rhsBlueprint), lhsBlueprint, rhsBlueprint, ((this.blueprint!= null)&&(!this.blueprint.isEmpty())), ((that.blueprint!= null)&&(!that.blueprint.isEmpty())))) {
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
             *         &lt;element name="bedrooms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *         &lt;element name="bathrooms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *         &lt;element name="garage" type="{http://feed.immobiliare.it}box" minOccurs="0"/&gt;
             *         &lt;element name="kitchen" type="{http://feed.immobiliare.it}kitchen" minOccurs="0"/&gt;
             *         &lt;element name="heating" type="{http://feed.immobiliare.it}heat" minOccurs="0"/&gt;
             *         &lt;element name="garden" type="{http://feed.immobiliare.it}garden" minOccurs="0"/&gt;
             *         &lt;element name="terrace" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
             *         &lt;element name="balcony" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
             *         &lt;element name="elevator" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
             *         &lt;element name="air-conditioning" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
             *         &lt;element name="floor" type="{http://feed.immobiliare.it}floor" minOccurs="0"/&gt;
             *         &lt;element name="num-floors" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *         &lt;element name="virtual-tour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="rent-contract" type="{http://feed.immobiliare.it}rental" minOccurs="0"/&gt;
             *         &lt;element name="additional-costs" type="{http://feed.immobiliare.it}additionalCostsType" minOccurs="0"/&gt;
             *         &lt;element name="furniture" type="{http://feed.immobiliare.it}furniture" minOccurs="0"/&gt;
             *         &lt;element name="security-alarm" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
             *         &lt;element name="reception" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
             *         &lt;element name="net" type="{http://feed.immobiliare.it}yesno" minOccurs="0"/&gt;
             *         &lt;element name="external-area" type="{http://feed.immobiliare.it}landSizeType" minOccurs="0"/&gt;
             *         &lt;element name="build-year" type="{http://feed.immobiliare.it}year" minOccurs="0"/&gt;
             *         &lt;element name="free-conditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="overhead-crane" type="{http://feed.immobiliare.it}yesnoready" minOccurs="0"/&gt;
             *         &lt;element name="beam-height" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *         &lt;element name="office-size" type="{http://feed.immobiliare.it}sizeType" minOccurs="0"/&gt;
             *         &lt;element name="floorplanner-url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="doc-specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="doc-description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            public static class ExtraFeatures implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlElement(type = String.class)
                @XmlJavaTypeAdapter(Adapter2 .class)
                @XmlSchemaType(name = "integer")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected BigInteger bedrooms;
                @XmlElement(type = String.class)
                @XmlJavaTypeAdapter(Adapter2 .class)
                @XmlSchemaType(name = "integer")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected BigInteger bathrooms;
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Box garage;
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Kitchen kitchen;
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Heat heating;
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Garden garden;
                @XmlElement(type = String.class)
                @XmlJavaTypeAdapter(Adapter7 .class)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Boolean terrace;
                @XmlElement(type = String.class)
                @XmlJavaTypeAdapter(Adapter7 .class)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Boolean balcony;
                @XmlElement(type = String.class)
                @XmlJavaTypeAdapter(Adapter7 .class)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Boolean elevator;
                @XmlElement(name = "air-conditioning", type = String.class)
                @XmlJavaTypeAdapter(Adapter7 .class)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Boolean airConditioning;
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Floor floor;
                @XmlElement(name = "num-floors", type = String.class)
                @XmlJavaTypeAdapter(Adapter2 .class)
                @XmlSchemaType(name = "integer")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected BigInteger numFloors;
                @XmlElement(name = "virtual-tour")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected String virtualTour;
                @XmlElement(name = "rent-contract")
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Rental rentContract;
                @XmlElement(name = "additional-costs")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected AdditionalCostsType additionalCosts;
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Furniture furniture;
                @XmlElement(name = "security-alarm", type = String.class)
                @XmlJavaTypeAdapter(Adapter7 .class)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Boolean securityAlarm;
                @XmlElement(type = String.class)
                @XmlJavaTypeAdapter(Adapter7 .class)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Boolean reception;
                @XmlElement(type = String.class)
                @XmlJavaTypeAdapter(Adapter7 .class)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Boolean net;
                @XmlElement(name = "external-area")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected LandSizeType externalArea;
                @XmlElement(name = "build-year", type = String.class)
                @XmlJavaTypeAdapter(Adapter6 .class)
                @XmlSchemaType(name = "integer")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Integer buildYear;
                @XmlElement(name = "free-conditions")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected String freeConditions;
                @XmlElement(name = "overhead-crane")
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected YesNoReady overheadCrane;
                @XmlElement(name = "beam-height", type = String.class)
                @XmlJavaTypeAdapter(Adapter2 .class)
                @XmlSchemaType(name = "integer")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected BigInteger beamHeight;
                @XmlElement(name = "office-size")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected SizeType officeSize;
                @XmlElement(name = "floorplanner-url")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected String floorplannerUrl;
                @XmlElement(name = "doc-specification")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected String docSpecification;
                @XmlElement(name = "doc-description")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected String docDescription;

                /**
                 * Gets the value of the bedrooms property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public BigInteger getBedrooms() {
                    return bedrooms;
                }

                /**
                 * Sets the value of the bedrooms property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setBedrooms(BigInteger value) {
                    this.bedrooms = value;
                }

                /**
                 * Gets the value of the bathrooms property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public BigInteger getBathrooms() {
                    return bathrooms;
                }

                /**
                 * Sets the value of the bathrooms property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setBathrooms(BigInteger value) {
                    this.bathrooms = value;
                }

                /**
                 * Gets the value of the garage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Box }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Box getGarage() {
                    return garage;
                }

                /**
                 * Sets the value of the garage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Box }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setGarage(Box value) {
                    this.garage = value;
                }

                /**
                 * Gets the value of the kitchen property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Kitchen }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Kitchen getKitchen() {
                    return kitchen;
                }

                /**
                 * Sets the value of the kitchen property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Kitchen }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setKitchen(Kitchen value) {
                    this.kitchen = value;
                }

                /**
                 * Gets the value of the heating property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Heat }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Heat getHeating() {
                    return heating;
                }

                /**
                 * Sets the value of the heating property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Heat }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setHeating(Heat value) {
                    this.heating = value;
                }

                /**
                 * Gets the value of the garden property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Garden }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Garden getGarden() {
                    return garden;
                }

                /**
                 * Sets the value of the garden property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Garden }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setGarden(Garden value) {
                    this.garden = value;
                }

                /**
                 * Gets the value of the terrace property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Boolean getTerrace() {
                    return terrace;
                }

                /**
                 * Sets the value of the terrace property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setTerrace(Boolean value) {
                    this.terrace = value;
                }

                /**
                 * Gets the value of the balcony property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Boolean getBalcony() {
                    return balcony;
                }

                /**
                 * Sets the value of the balcony property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setBalcony(Boolean value) {
                    this.balcony = value;
                }

                /**
                 * Gets the value of the elevator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Boolean getElevator() {
                    return elevator;
                }

                /**
                 * Sets the value of the elevator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setElevator(Boolean value) {
                    this.elevator = value;
                }

                /**
                 * Gets the value of the airConditioning property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Boolean getAirConditioning() {
                    return airConditioning;
                }

                /**
                 * Sets the value of the airConditioning property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setAirConditioning(Boolean value) {
                    this.airConditioning = value;
                }

                /**
                 * Gets the value of the floor property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Floor }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Floor getFloor() {
                    return floor;
                }

                /**
                 * Sets the value of the floor property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Floor }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setFloor(Floor value) {
                    this.floor = value;
                }

                /**
                 * Gets the value of the numFloors property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public BigInteger getNumFloors() {
                    return numFloors;
                }

                /**
                 * Sets the value of the numFloors property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setNumFloors(BigInteger value) {
                    this.numFloors = value;
                }

                /**
                 * Gets the value of the virtualTour property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public String getVirtualTour() {
                    return virtualTour;
                }

                /**
                 * Sets the value of the virtualTour property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setVirtualTour(String value) {
                    this.virtualTour = value;
                }

                /**
                 * Gets the value of the rentContract property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Rental }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Rental getRentContract() {
                    return rentContract;
                }

                /**
                 * Sets the value of the rentContract property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Rental }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setRentContract(Rental value) {
                    this.rentContract = value;
                }

                /**
                 * Gets the value of the additionalCosts property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalCostsType }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public AdditionalCostsType getAdditionalCosts() {
                    return additionalCosts;
                }

                /**
                 * Sets the value of the additionalCosts property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalCostsType }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setAdditionalCosts(AdditionalCostsType value) {
                    this.additionalCosts = value;
                }

                /**
                 * Gets the value of the furniture property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Furniture }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Furniture getFurniture() {
                    return furniture;
                }

                /**
                 * Sets the value of the furniture property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Furniture }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setFurniture(Furniture value) {
                    this.furniture = value;
                }

                /**
                 * Gets the value of the securityAlarm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Boolean getSecurityAlarm() {
                    return securityAlarm;
                }

                /**
                 * Sets the value of the securityAlarm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setSecurityAlarm(Boolean value) {
                    this.securityAlarm = value;
                }

                /**
                 * Gets the value of the reception property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Boolean getReception() {
                    return reception;
                }

                /**
                 * Sets the value of the reception property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setReception(Boolean value) {
                    this.reception = value;
                }

                /**
                 * Gets the value of the net property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Boolean getNet() {
                    return net;
                }

                /**
                 * Sets the value of the net property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setNet(Boolean value) {
                    this.net = value;
                }

                /**
                 * Gets the value of the externalArea property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LandSizeType }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public LandSizeType getExternalArea() {
                    return externalArea;
                }

                /**
                 * Sets the value of the externalArea property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LandSizeType }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setExternalArea(LandSizeType value) {
                    this.externalArea = value;
                }

                /**
                 * Gets the value of the buildYear property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Integer getBuildYear() {
                    return buildYear;
                }

                /**
                 * Sets the value of the buildYear property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setBuildYear(Integer value) {
                    this.buildYear = value;
                }

                /**
                 * Gets the value of the freeConditions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public String getFreeConditions() {
                    return freeConditions;
                }

                /**
                 * Sets the value of the freeConditions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setFreeConditions(String value) {
                    this.freeConditions = value;
                }

                /**
                 * Gets the value of the overheadCrane property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link YesNoReady }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public YesNoReady getOverheadCrane() {
                    return overheadCrane;
                }

                /**
                 * Sets the value of the overheadCrane property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link YesNoReady }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setOverheadCrane(YesNoReady value) {
                    this.overheadCrane = value;
                }

                /**
                 * Gets the value of the beamHeight property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public BigInteger getBeamHeight() {
                    return beamHeight;
                }

                /**
                 * Sets the value of the beamHeight property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setBeamHeight(BigInteger value) {
                    this.beamHeight = value;
                }

                /**
                 * Gets the value of the officeSize property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SizeType }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public SizeType getOfficeSize() {
                    return officeSize;
                }

                /**
                 * Sets the value of the officeSize property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SizeType }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setOfficeSize(SizeType value) {
                    this.officeSize = value;
                }

                /**
                 * Gets the value of the floorplannerUrl property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public String getFloorplannerUrl() {
                    return floorplannerUrl;
                }

                /**
                 * Sets the value of the floorplannerUrl property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setFloorplannerUrl(String value) {
                    this.floorplannerUrl = value;
                }

                /**
                 * Gets the value of the docSpecification property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public String getDocSpecification() {
                    return docSpecification;
                }

                /**
                 * Sets the value of the docSpecification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setDocSpecification(String value) {
                    this.docSpecification = value;
                }

                /**
                 * Gets the value of the docDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public String getDocDescription() {
                    return docDescription;
                }

                /**
                 * Sets the value of the docDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setDocDescription(String value) {
                    this.docDescription = value;
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
                        BigInteger theBedrooms;
                        theBedrooms = this.getBedrooms();
                        strategy.appendField(locator, this, "bedrooms", buffer, theBedrooms, (this.bedrooms!= null));
                    }
                    {
                        BigInteger theBathrooms;
                        theBathrooms = this.getBathrooms();
                        strategy.appendField(locator, this, "bathrooms", buffer, theBathrooms, (this.bathrooms!= null));
                    }
                    {
                        Box theGarage;
                        theGarage = this.getGarage();
                        strategy.appendField(locator, this, "garage", buffer, theGarage, (this.garage!= null));
                    }
                    {
                        Kitchen theKitchen;
                        theKitchen = this.getKitchen();
                        strategy.appendField(locator, this, "kitchen", buffer, theKitchen, (this.kitchen!= null));
                    }
                    {
                        Heat theHeating;
                        theHeating = this.getHeating();
                        strategy.appendField(locator, this, "heating", buffer, theHeating, (this.heating!= null));
                    }
                    {
                        Garden theGarden;
                        theGarden = this.getGarden();
                        strategy.appendField(locator, this, "garden", buffer, theGarden, (this.garden!= null));
                    }
                    {
                        Boolean theTerrace;
                        theTerrace = this.getTerrace();
                        strategy.appendField(locator, this, "terrace", buffer, theTerrace, (this.terrace!= null));
                    }
                    {
                        Boolean theBalcony;
                        theBalcony = this.getBalcony();
                        strategy.appendField(locator, this, "balcony", buffer, theBalcony, (this.balcony!= null));
                    }
                    {
                        Boolean theElevator;
                        theElevator = this.getElevator();
                        strategy.appendField(locator, this, "elevator", buffer, theElevator, (this.elevator!= null));
                    }
                    {
                        Boolean theAirConditioning;
                        theAirConditioning = this.getAirConditioning();
                        strategy.appendField(locator, this, "airConditioning", buffer, theAirConditioning, (this.airConditioning!= null));
                    }
                    {
                        Floor theFloor;
                        theFloor = this.getFloor();
                        strategy.appendField(locator, this, "floor", buffer, theFloor, (this.floor!= null));
                    }
                    {
                        BigInteger theNumFloors;
                        theNumFloors = this.getNumFloors();
                        strategy.appendField(locator, this, "numFloors", buffer, theNumFloors, (this.numFloors!= null));
                    }
                    {
                        String theVirtualTour;
                        theVirtualTour = this.getVirtualTour();
                        strategy.appendField(locator, this, "virtualTour", buffer, theVirtualTour, (this.virtualTour!= null));
                    }
                    {
                        Rental theRentContract;
                        theRentContract = this.getRentContract();
                        strategy.appendField(locator, this, "rentContract", buffer, theRentContract, (this.rentContract!= null));
                    }
                    {
                        AdditionalCostsType theAdditionalCosts;
                        theAdditionalCosts = this.getAdditionalCosts();
                        strategy.appendField(locator, this, "additionalCosts", buffer, theAdditionalCosts, (this.additionalCosts!= null));
                    }
                    {
                        Furniture theFurniture;
                        theFurniture = this.getFurniture();
                        strategy.appendField(locator, this, "furniture", buffer, theFurniture, (this.furniture!= null));
                    }
                    {
                        Boolean theSecurityAlarm;
                        theSecurityAlarm = this.getSecurityAlarm();
                        strategy.appendField(locator, this, "securityAlarm", buffer, theSecurityAlarm, (this.securityAlarm!= null));
                    }
                    {
                        Boolean theReception;
                        theReception = this.getReception();
                        strategy.appendField(locator, this, "reception", buffer, theReception, (this.reception!= null));
                    }
                    {
                        Boolean theNet;
                        theNet = this.getNet();
                        strategy.appendField(locator, this, "net", buffer, theNet, (this.net!= null));
                    }
                    {
                        LandSizeType theExternalArea;
                        theExternalArea = this.getExternalArea();
                        strategy.appendField(locator, this, "externalArea", buffer, theExternalArea, (this.externalArea!= null));
                    }
                    {
                        Integer theBuildYear;
                        theBuildYear = this.getBuildYear();
                        strategy.appendField(locator, this, "buildYear", buffer, theBuildYear, (this.buildYear!= null));
                    }
                    {
                        String theFreeConditions;
                        theFreeConditions = this.getFreeConditions();
                        strategy.appendField(locator, this, "freeConditions", buffer, theFreeConditions, (this.freeConditions!= null));
                    }
                    {
                        YesNoReady theOverheadCrane;
                        theOverheadCrane = this.getOverheadCrane();
                        strategy.appendField(locator, this, "overheadCrane", buffer, theOverheadCrane, (this.overheadCrane!= null));
                    }
                    {
                        BigInteger theBeamHeight;
                        theBeamHeight = this.getBeamHeight();
                        strategy.appendField(locator, this, "beamHeight", buffer, theBeamHeight, (this.beamHeight!= null));
                    }
                    {
                        SizeType theOfficeSize;
                        theOfficeSize = this.getOfficeSize();
                        strategy.appendField(locator, this, "officeSize", buffer, theOfficeSize, (this.officeSize!= null));
                    }
                    {
                        String theFloorplannerUrl;
                        theFloorplannerUrl = this.getFloorplannerUrl();
                        strategy.appendField(locator, this, "floorplannerUrl", buffer, theFloorplannerUrl, (this.floorplannerUrl!= null));
                    }
                    {
                        String theDocSpecification;
                        theDocSpecification = this.getDocSpecification();
                        strategy.appendField(locator, this, "docSpecification", buffer, theDocSpecification, (this.docSpecification!= null));
                    }
                    {
                        String theDocDescription;
                        theDocDescription = this.getDocDescription();
                        strategy.appendField(locator, this, "docDescription", buffer, theDocDescription, (this.docDescription!= null));
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
                    if (draftCopy instanceof Feed.Properties.Property.ExtraFeatures) {
                        final Feed.Properties.Property.ExtraFeatures copy = ((Feed.Properties.Property.ExtraFeatures) draftCopy);
                        {
                            Boolean bedroomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bedrooms!= null));
                            if (bedroomsShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigInteger sourceBedrooms;
                                sourceBedrooms = this.getBedrooms();
                                BigInteger copyBedrooms = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "bedrooms", sourceBedrooms), sourceBedrooms, (this.bedrooms!= null)));
                                copy.setBedrooms(copyBedrooms);
                            } else {
                                if (bedroomsShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.bedrooms = null;
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
                            Boolean garageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garage!= null));
                            if (garageShouldBeCopiedAndSet == Boolean.TRUE) {
                                Box sourceGarage;
                                sourceGarage = this.getGarage();
                                Box copyGarage = ((Box) strategy.copy(LocatorUtils.property(locator, "garage", sourceGarage), sourceGarage, (this.garage!= null)));
                                copy.setGarage(copyGarage);
                            } else {
                                if (garageShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.garage = null;
                                }
                            }
                        }
                        {
                            Boolean kitchenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kitchen!= null));
                            if (kitchenShouldBeCopiedAndSet == Boolean.TRUE) {
                                Kitchen sourceKitchen;
                                sourceKitchen = this.getKitchen();
                                Kitchen copyKitchen = ((Kitchen) strategy.copy(LocatorUtils.property(locator, "kitchen", sourceKitchen), sourceKitchen, (this.kitchen!= null)));
                                copy.setKitchen(copyKitchen);
                            } else {
                                if (kitchenShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.kitchen = null;
                                }
                            }
                        }
                        {
                            Boolean heatingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heating!= null));
                            if (heatingShouldBeCopiedAndSet == Boolean.TRUE) {
                                Heat sourceHeating;
                                sourceHeating = this.getHeating();
                                Heat copyHeating = ((Heat) strategy.copy(LocatorUtils.property(locator, "heating", sourceHeating), sourceHeating, (this.heating!= null)));
                                copy.setHeating(copyHeating);
                            } else {
                                if (heatingShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.heating = null;
                                }
                            }
                        }
                        {
                            Boolean gardenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garden!= null));
                            if (gardenShouldBeCopiedAndSet == Boolean.TRUE) {
                                Garden sourceGarden;
                                sourceGarden = this.getGarden();
                                Garden copyGarden = ((Garden) strategy.copy(LocatorUtils.property(locator, "garden", sourceGarden), sourceGarden, (this.garden!= null)));
                                copy.setGarden(copyGarden);
                            } else {
                                if (gardenShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.garden = null;
                                }
                            }
                        }
                        {
                            Boolean terraceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.terrace!= null));
                            if (terraceShouldBeCopiedAndSet == Boolean.TRUE) {
                                Boolean sourceTerrace;
                                sourceTerrace = this.getTerrace();
                                Boolean copyTerrace = ((Boolean) strategy.copy(LocatorUtils.property(locator, "terrace", sourceTerrace), sourceTerrace, (this.terrace!= null)));
                                copy.setTerrace(copyTerrace);
                            } else {
                                if (terraceShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.terrace = null;
                                }
                            }
                        }
                        {
                            Boolean balconyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balcony!= null));
                            if (balconyShouldBeCopiedAndSet == Boolean.TRUE) {
                                Boolean sourceBalcony;
                                sourceBalcony = this.getBalcony();
                                Boolean copyBalcony = ((Boolean) strategy.copy(LocatorUtils.property(locator, "balcony", sourceBalcony), sourceBalcony, (this.balcony!= null)));
                                copy.setBalcony(copyBalcony);
                            } else {
                                if (balconyShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.balcony = null;
                                }
                            }
                        }
                        {
                            Boolean elevatorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.elevator!= null));
                            if (elevatorShouldBeCopiedAndSet == Boolean.TRUE) {
                                Boolean sourceElevator;
                                sourceElevator = this.getElevator();
                                Boolean copyElevator = ((Boolean) strategy.copy(LocatorUtils.property(locator, "elevator", sourceElevator), sourceElevator, (this.elevator!= null)));
                                copy.setElevator(copyElevator);
                            } else {
                                if (elevatorShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.elevator = null;
                                }
                            }
                        }
                        {
                            Boolean airConditioningShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.airConditioning!= null));
                            if (airConditioningShouldBeCopiedAndSet == Boolean.TRUE) {
                                Boolean sourceAirConditioning;
                                sourceAirConditioning = this.getAirConditioning();
                                Boolean copyAirConditioning = ((Boolean) strategy.copy(LocatorUtils.property(locator, "airConditioning", sourceAirConditioning), sourceAirConditioning, (this.airConditioning!= null)));
                                copy.setAirConditioning(copyAirConditioning);
                            } else {
                                if (airConditioningShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.airConditioning = null;
                                }
                            }
                        }
                        {
                            Boolean floorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floor!= null));
                            if (floorShouldBeCopiedAndSet == Boolean.TRUE) {
                                Floor sourceFloor;
                                sourceFloor = this.getFloor();
                                Floor copyFloor = ((Floor) strategy.copy(LocatorUtils.property(locator, "floor", sourceFloor), sourceFloor, (this.floor!= null)));
                                copy.setFloor(copyFloor);
                            } else {
                                if (floorShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.floor = null;
                                }
                            }
                        }
                        {
                            Boolean numFloorsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numFloors!= null));
                            if (numFloorsShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigInteger sourceNumFloors;
                                sourceNumFloors = this.getNumFloors();
                                BigInteger copyNumFloors = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "numFloors", sourceNumFloors), sourceNumFloors, (this.numFloors!= null)));
                                copy.setNumFloors(copyNumFloors);
                            } else {
                                if (numFloorsShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.numFloors = null;
                                }
                            }
                        }
                        {
                            Boolean virtualTourShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.virtualTour!= null));
                            if (virtualTourShouldBeCopiedAndSet == Boolean.TRUE) {
                                String sourceVirtualTour;
                                sourceVirtualTour = this.getVirtualTour();
                                String copyVirtualTour = ((String) strategy.copy(LocatorUtils.property(locator, "virtualTour", sourceVirtualTour), sourceVirtualTour, (this.virtualTour!= null)));
                                copy.setVirtualTour(copyVirtualTour);
                            } else {
                                if (virtualTourShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.virtualTour = null;
                                }
                            }
                        }
                        {
                            Boolean rentContractShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rentContract!= null));
                            if (rentContractShouldBeCopiedAndSet == Boolean.TRUE) {
                                Rental sourceRentContract;
                                sourceRentContract = this.getRentContract();
                                Rental copyRentContract = ((Rental) strategy.copy(LocatorUtils.property(locator, "rentContract", sourceRentContract), sourceRentContract, (this.rentContract!= null)));
                                copy.setRentContract(copyRentContract);
                            } else {
                                if (rentContractShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.rentContract = null;
                                }
                            }
                        }
                        {
                            Boolean additionalCostsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.additionalCosts!= null));
                            if (additionalCostsShouldBeCopiedAndSet == Boolean.TRUE) {
                                AdditionalCostsType sourceAdditionalCosts;
                                sourceAdditionalCosts = this.getAdditionalCosts();
                                AdditionalCostsType copyAdditionalCosts = ((AdditionalCostsType) strategy.copy(LocatorUtils.property(locator, "additionalCosts", sourceAdditionalCosts), sourceAdditionalCosts, (this.additionalCosts!= null)));
                                copy.setAdditionalCosts(copyAdditionalCosts);
                            } else {
                                if (additionalCostsShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.additionalCosts = null;
                                }
                            }
                        }
                        {
                            Boolean furnitureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.furniture!= null));
                            if (furnitureShouldBeCopiedAndSet == Boolean.TRUE) {
                                Furniture sourceFurniture;
                                sourceFurniture = this.getFurniture();
                                Furniture copyFurniture = ((Furniture) strategy.copy(LocatorUtils.property(locator, "furniture", sourceFurniture), sourceFurniture, (this.furniture!= null)));
                                copy.setFurniture(copyFurniture);
                            } else {
                                if (furnitureShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.furniture = null;
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
                            Boolean receptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.reception!= null));
                            if (receptionShouldBeCopiedAndSet == Boolean.TRUE) {
                                Boolean sourceReception;
                                sourceReception = this.getReception();
                                Boolean copyReception = ((Boolean) strategy.copy(LocatorUtils.property(locator, "reception", sourceReception), sourceReception, (this.reception!= null)));
                                copy.setReception(copyReception);
                            } else {
                                if (receptionShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.reception = null;
                                }
                            }
                        }
                        {
                            Boolean netShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.net!= null));
                            if (netShouldBeCopiedAndSet == Boolean.TRUE) {
                                Boolean sourceNet;
                                sourceNet = this.getNet();
                                Boolean copyNet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "net", sourceNet), sourceNet, (this.net!= null)));
                                copy.setNet(copyNet);
                            } else {
                                if (netShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.net = null;
                                }
                            }
                        }
                        {
                            Boolean externalAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.externalArea!= null));
                            if (externalAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                                LandSizeType sourceExternalArea;
                                sourceExternalArea = this.getExternalArea();
                                LandSizeType copyExternalArea = ((LandSizeType) strategy.copy(LocatorUtils.property(locator, "externalArea", sourceExternalArea), sourceExternalArea, (this.externalArea!= null)));
                                copy.setExternalArea(copyExternalArea);
                            } else {
                                if (externalAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.externalArea = null;
                                }
                            }
                        }
                        {
                            Boolean buildYearShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.buildYear!= null));
                            if (buildYearShouldBeCopiedAndSet == Boolean.TRUE) {
                                Integer sourceBuildYear;
                                sourceBuildYear = this.getBuildYear();
                                Integer copyBuildYear = ((Integer) strategy.copy(LocatorUtils.property(locator, "buildYear", sourceBuildYear), sourceBuildYear, (this.buildYear!= null)));
                                copy.setBuildYear(copyBuildYear);
                            } else {
                                if (buildYearShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.buildYear = null;
                                }
                            }
                        }
                        {
                            Boolean freeConditionsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freeConditions!= null));
                            if (freeConditionsShouldBeCopiedAndSet == Boolean.TRUE) {
                                String sourceFreeConditions;
                                sourceFreeConditions = this.getFreeConditions();
                                String copyFreeConditions = ((String) strategy.copy(LocatorUtils.property(locator, "freeConditions", sourceFreeConditions), sourceFreeConditions, (this.freeConditions!= null)));
                                copy.setFreeConditions(copyFreeConditions);
                            } else {
                                if (freeConditionsShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.freeConditions = null;
                                }
                            }
                        }
                        {
                            Boolean overheadCraneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.overheadCrane!= null));
                            if (overheadCraneShouldBeCopiedAndSet == Boolean.TRUE) {
                                YesNoReady sourceOverheadCrane;
                                sourceOverheadCrane = this.getOverheadCrane();
                                YesNoReady copyOverheadCrane = ((YesNoReady) strategy.copy(LocatorUtils.property(locator, "overheadCrane", sourceOverheadCrane), sourceOverheadCrane, (this.overheadCrane!= null)));
                                copy.setOverheadCrane(copyOverheadCrane);
                            } else {
                                if (overheadCraneShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.overheadCrane = null;
                                }
                            }
                        }
                        {
                            Boolean beamHeightShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beamHeight!= null));
                            if (beamHeightShouldBeCopiedAndSet == Boolean.TRUE) {
                                BigInteger sourceBeamHeight;
                                sourceBeamHeight = this.getBeamHeight();
                                BigInteger copyBeamHeight = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "beamHeight", sourceBeamHeight), sourceBeamHeight, (this.beamHeight!= null)));
                                copy.setBeamHeight(copyBeamHeight);
                            } else {
                                if (beamHeightShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.beamHeight = null;
                                }
                            }
                        }
                        {
                            Boolean officeSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.officeSize!= null));
                            if (officeSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                                SizeType sourceOfficeSize;
                                sourceOfficeSize = this.getOfficeSize();
                                SizeType copyOfficeSize = ((SizeType) strategy.copy(LocatorUtils.property(locator, "officeSize", sourceOfficeSize), sourceOfficeSize, (this.officeSize!= null)));
                                copy.setOfficeSize(copyOfficeSize);
                            } else {
                                if (officeSizeShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.officeSize = null;
                                }
                            }
                        }
                        {
                            Boolean floorplannerUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floorplannerUrl!= null));
                            if (floorplannerUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                                String sourceFloorplannerUrl;
                                sourceFloorplannerUrl = this.getFloorplannerUrl();
                                String copyFloorplannerUrl = ((String) strategy.copy(LocatorUtils.property(locator, "floorplannerUrl", sourceFloorplannerUrl), sourceFloorplannerUrl, (this.floorplannerUrl!= null)));
                                copy.setFloorplannerUrl(copyFloorplannerUrl);
                            } else {
                                if (floorplannerUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.floorplannerUrl = null;
                                }
                            }
                        }
                        {
                            Boolean docSpecificationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.docSpecification!= null));
                            if (docSpecificationShouldBeCopiedAndSet == Boolean.TRUE) {
                                String sourceDocSpecification;
                                sourceDocSpecification = this.getDocSpecification();
                                String copyDocSpecification = ((String) strategy.copy(LocatorUtils.property(locator, "docSpecification", sourceDocSpecification), sourceDocSpecification, (this.docSpecification!= null)));
                                copy.setDocSpecification(copyDocSpecification);
                            } else {
                                if (docSpecificationShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.docSpecification = null;
                                }
                            }
                        }
                        {
                            Boolean docDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.docDescription!= null));
                            if (docDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                                String sourceDocDescription;
                                sourceDocDescription = this.getDocDescription();
                                String copyDocDescription = ((String) strategy.copy(LocatorUtils.property(locator, "docDescription", sourceDocDescription), sourceDocDescription, (this.docDescription!= null)));
                                copy.setDocDescription(copyDocDescription);
                            } else {
                                if (docDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.docDescription = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Object createNewInstance() {
                    return new Feed.Properties.Property.ExtraFeatures();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Feed.Properties.Property.ExtraFeatures that = ((Feed.Properties.Property.ExtraFeatures) object);
                    {
                        BigInteger lhsBedrooms;
                        lhsBedrooms = this.getBedrooms();
                        BigInteger rhsBedrooms;
                        rhsBedrooms = that.getBedrooms();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "bedrooms", lhsBedrooms), LocatorUtils.property(thatLocator, "bedrooms", rhsBedrooms), lhsBedrooms, rhsBedrooms, (this.bedrooms!= null), (that.bedrooms!= null))) {
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
                        Box lhsGarage;
                        lhsGarage = this.getGarage();
                        Box rhsGarage;
                        rhsGarage = that.getGarage();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "garage", lhsGarage), LocatorUtils.property(thatLocator, "garage", rhsGarage), lhsGarage, rhsGarage, (this.garage!= null), (that.garage!= null))) {
                            return false;
                        }
                    }
                    {
                        Kitchen lhsKitchen;
                        lhsKitchen = this.getKitchen();
                        Kitchen rhsKitchen;
                        rhsKitchen = that.getKitchen();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "kitchen", lhsKitchen), LocatorUtils.property(thatLocator, "kitchen", rhsKitchen), lhsKitchen, rhsKitchen, (this.kitchen!= null), (that.kitchen!= null))) {
                            return false;
                        }
                    }
                    {
                        Heat lhsHeating;
                        lhsHeating = this.getHeating();
                        Heat rhsHeating;
                        rhsHeating = that.getHeating();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "heating", lhsHeating), LocatorUtils.property(thatLocator, "heating", rhsHeating), lhsHeating, rhsHeating, (this.heating!= null), (that.heating!= null))) {
                            return false;
                        }
                    }
                    {
                        Garden lhsGarden;
                        lhsGarden = this.getGarden();
                        Garden rhsGarden;
                        rhsGarden = that.getGarden();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "garden", lhsGarden), LocatorUtils.property(thatLocator, "garden", rhsGarden), lhsGarden, rhsGarden, (this.garden!= null), (that.garden!= null))) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsTerrace;
                        lhsTerrace = this.getTerrace();
                        Boolean rhsTerrace;
                        rhsTerrace = that.getTerrace();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "terrace", lhsTerrace), LocatorUtils.property(thatLocator, "terrace", rhsTerrace), lhsTerrace, rhsTerrace, (this.terrace!= null), (that.terrace!= null))) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsBalcony;
                        lhsBalcony = this.getBalcony();
                        Boolean rhsBalcony;
                        rhsBalcony = that.getBalcony();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "balcony", lhsBalcony), LocatorUtils.property(thatLocator, "balcony", rhsBalcony), lhsBalcony, rhsBalcony, (this.balcony!= null), (that.balcony!= null))) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsElevator;
                        lhsElevator = this.getElevator();
                        Boolean rhsElevator;
                        rhsElevator = that.getElevator();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "elevator", lhsElevator), LocatorUtils.property(thatLocator, "elevator", rhsElevator), lhsElevator, rhsElevator, (this.elevator!= null), (that.elevator!= null))) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsAirConditioning;
                        lhsAirConditioning = this.getAirConditioning();
                        Boolean rhsAirConditioning;
                        rhsAirConditioning = that.getAirConditioning();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "airConditioning", lhsAirConditioning), LocatorUtils.property(thatLocator, "airConditioning", rhsAirConditioning), lhsAirConditioning, rhsAirConditioning, (this.airConditioning!= null), (that.airConditioning!= null))) {
                            return false;
                        }
                    }
                    {
                        Floor lhsFloor;
                        lhsFloor = this.getFloor();
                        Floor rhsFloor;
                        rhsFloor = that.getFloor();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor, (this.floor!= null), (that.floor!= null))) {
                            return false;
                        }
                    }
                    {
                        BigInteger lhsNumFloors;
                        lhsNumFloors = this.getNumFloors();
                        BigInteger rhsNumFloors;
                        rhsNumFloors = that.getNumFloors();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "numFloors", lhsNumFloors), LocatorUtils.property(thatLocator, "numFloors", rhsNumFloors), lhsNumFloors, rhsNumFloors, (this.numFloors!= null), (that.numFloors!= null))) {
                            return false;
                        }
                    }
                    {
                        String lhsVirtualTour;
                        lhsVirtualTour = this.getVirtualTour();
                        String rhsVirtualTour;
                        rhsVirtualTour = that.getVirtualTour();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "virtualTour", lhsVirtualTour), LocatorUtils.property(thatLocator, "virtualTour", rhsVirtualTour), lhsVirtualTour, rhsVirtualTour, (this.virtualTour!= null), (that.virtualTour!= null))) {
                            return false;
                        }
                    }
                    {
                        Rental lhsRentContract;
                        lhsRentContract = this.getRentContract();
                        Rental rhsRentContract;
                        rhsRentContract = that.getRentContract();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "rentContract", lhsRentContract), LocatorUtils.property(thatLocator, "rentContract", rhsRentContract), lhsRentContract, rhsRentContract, (this.rentContract!= null), (that.rentContract!= null))) {
                            return false;
                        }
                    }
                    {
                        AdditionalCostsType lhsAdditionalCosts;
                        lhsAdditionalCosts = this.getAdditionalCosts();
                        AdditionalCostsType rhsAdditionalCosts;
                        rhsAdditionalCosts = that.getAdditionalCosts();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalCosts", lhsAdditionalCosts), LocatorUtils.property(thatLocator, "additionalCosts", rhsAdditionalCosts), lhsAdditionalCosts, rhsAdditionalCosts, (this.additionalCosts!= null), (that.additionalCosts!= null))) {
                            return false;
                        }
                    }
                    {
                        Furniture lhsFurniture;
                        lhsFurniture = this.getFurniture();
                        Furniture rhsFurniture;
                        rhsFurniture = that.getFurniture();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "furniture", lhsFurniture), LocatorUtils.property(thatLocator, "furniture", rhsFurniture), lhsFurniture, rhsFurniture, (this.furniture!= null), (that.furniture!= null))) {
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
                        Boolean lhsReception;
                        lhsReception = this.getReception();
                        Boolean rhsReception;
                        rhsReception = that.getReception();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "reception", lhsReception), LocatorUtils.property(thatLocator, "reception", rhsReception), lhsReception, rhsReception, (this.reception!= null), (that.reception!= null))) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsNet;
                        lhsNet = this.getNet();
                        Boolean rhsNet;
                        rhsNet = that.getNet();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "net", lhsNet), LocatorUtils.property(thatLocator, "net", rhsNet), lhsNet, rhsNet, (this.net!= null), (that.net!= null))) {
                            return false;
                        }
                    }
                    {
                        LandSizeType lhsExternalArea;
                        lhsExternalArea = this.getExternalArea();
                        LandSizeType rhsExternalArea;
                        rhsExternalArea = that.getExternalArea();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "externalArea", lhsExternalArea), LocatorUtils.property(thatLocator, "externalArea", rhsExternalArea), lhsExternalArea, rhsExternalArea, (this.externalArea!= null), (that.externalArea!= null))) {
                            return false;
                        }
                    }
                    {
                        Integer lhsBuildYear;
                        lhsBuildYear = this.getBuildYear();
                        Integer rhsBuildYear;
                        rhsBuildYear = that.getBuildYear();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "buildYear", lhsBuildYear), LocatorUtils.property(thatLocator, "buildYear", rhsBuildYear), lhsBuildYear, rhsBuildYear, (this.buildYear!= null), (that.buildYear!= null))) {
                            return false;
                        }
                    }
                    {
                        String lhsFreeConditions;
                        lhsFreeConditions = this.getFreeConditions();
                        String rhsFreeConditions;
                        rhsFreeConditions = that.getFreeConditions();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "freeConditions", lhsFreeConditions), LocatorUtils.property(thatLocator, "freeConditions", rhsFreeConditions), lhsFreeConditions, rhsFreeConditions, (this.freeConditions!= null), (that.freeConditions!= null))) {
                            return false;
                        }
                    }
                    {
                        YesNoReady lhsOverheadCrane;
                        lhsOverheadCrane = this.getOverheadCrane();
                        YesNoReady rhsOverheadCrane;
                        rhsOverheadCrane = that.getOverheadCrane();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "overheadCrane", lhsOverheadCrane), LocatorUtils.property(thatLocator, "overheadCrane", rhsOverheadCrane), lhsOverheadCrane, rhsOverheadCrane, (this.overheadCrane!= null), (that.overheadCrane!= null))) {
                            return false;
                        }
                    }
                    {
                        BigInteger lhsBeamHeight;
                        lhsBeamHeight = this.getBeamHeight();
                        BigInteger rhsBeamHeight;
                        rhsBeamHeight = that.getBeamHeight();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "beamHeight", lhsBeamHeight), LocatorUtils.property(thatLocator, "beamHeight", rhsBeamHeight), lhsBeamHeight, rhsBeamHeight, (this.beamHeight!= null), (that.beamHeight!= null))) {
                            return false;
                        }
                    }
                    {
                        SizeType lhsOfficeSize;
                        lhsOfficeSize = this.getOfficeSize();
                        SizeType rhsOfficeSize;
                        rhsOfficeSize = that.getOfficeSize();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "officeSize", lhsOfficeSize), LocatorUtils.property(thatLocator, "officeSize", rhsOfficeSize), lhsOfficeSize, rhsOfficeSize, (this.officeSize!= null), (that.officeSize!= null))) {
                            return false;
                        }
                    }
                    {
                        String lhsFloorplannerUrl;
                        lhsFloorplannerUrl = this.getFloorplannerUrl();
                        String rhsFloorplannerUrl;
                        rhsFloorplannerUrl = that.getFloorplannerUrl();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "floorplannerUrl", lhsFloorplannerUrl), LocatorUtils.property(thatLocator, "floorplannerUrl", rhsFloorplannerUrl), lhsFloorplannerUrl, rhsFloorplannerUrl, (this.floorplannerUrl!= null), (that.floorplannerUrl!= null))) {
                            return false;
                        }
                    }
                    {
                        String lhsDocSpecification;
                        lhsDocSpecification = this.getDocSpecification();
                        String rhsDocSpecification;
                        rhsDocSpecification = that.getDocSpecification();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "docSpecification", lhsDocSpecification), LocatorUtils.property(thatLocator, "docSpecification", rhsDocSpecification), lhsDocSpecification, rhsDocSpecification, (this.docSpecification!= null), (that.docSpecification!= null))) {
                            return false;
                        }
                    }
                    {
                        String lhsDocDescription;
                        lhsDocDescription = this.getDocDescription();
                        String rhsDocDescription;
                        rhsDocDescription = that.getDocDescription();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "docDescription", lhsDocDescription), LocatorUtils.property(thatLocator, "docDescription", rhsDocDescription), lhsDocDescription, rhsDocDescription, (this.docDescription!= null), (that.docDescription!= null))) {
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
             *       &lt;sequence&gt;
             *         &lt;element name="rooms" type="{http://feed.immobiliare.it}roomsType"/&gt;
             *         &lt;element name="size" type="{http://feed.immobiliare.it}sizeType"/&gt;
             *         &lt;element name="price" type="{http://feed.immobiliare.it}priceType"/&gt;
             *         &lt;element name="description" type="{http://feed.immobiliare.it}langtxt" maxOccurs="25"/&gt;
             *         &lt;element name="energy-class" type="{http://feed.immobiliare.it}classEnergy"/&gt;
             *         &lt;element name="energy-performance" type="{http://feed.immobiliare.it}classEnergyPerformance" minOccurs="0"/&gt;
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
                "rooms",
                "size",
                "price",
                "description",
                "energyClass",
                "energyPerformance"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public static class Features implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlElement(required = true, type = String.class)
                @XmlJavaTypeAdapter(Adapter10 .class)
                @XmlSchemaType(name = "integer")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected Integer rooms;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected SizeType size;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected PriceType price;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected List<Langtxt> description;
                @XmlElement(name = "energy-class", required = true)
                @XmlSchemaType(name = "string")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected ClassEnergy energyClass;
                @XmlElement(name = "energy-performance")
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected ClassEnergyPerformance energyPerformance;

                /**
                 * Gets the value of the rooms property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Integer getRooms() {
                    return rooms;
                }

                /**
                 * Sets the value of the rooms property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setRooms(Integer value) {
                    this.rooms = value;
                }

                /**
                 * Gets the value of the size property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SizeType }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setSize(SizeType value) {
                    this.size = value;
                }

                /**
                 * Gets the value of the price property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PriceType }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
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
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setPrice(PriceType value) {
                    this.price = value;
                }

                /**
                 * Gets the value of the description property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the description property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDescription().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Langtxt }
                 * 
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public List<Langtxt> getDescription() {
                    if (description == null) {
                        description = new ArrayList<Langtxt>();
                    }
                    return this.description;
                }

                /**
                 * Gets the value of the energyClass property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ClassEnergy }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public ClassEnergy getEnergyClass() {
                    return energyClass;
                }

                /**
                 * Sets the value of the energyClass property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ClassEnergy }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setEnergyClass(ClassEnergy value) {
                    this.energyClass = value;
                }

                /**
                 * Gets the value of the energyPerformance property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ClassEnergyPerformance }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public ClassEnergyPerformance getEnergyPerformance() {
                    return energyPerformance;
                }

                /**
                 * Sets the value of the energyPerformance property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ClassEnergyPerformance }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public void setEnergyPerformance(ClassEnergyPerformance value) {
                    this.energyPerformance = value;
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
                        Integer theRooms;
                        theRooms = this.getRooms();
                        strategy.appendField(locator, this, "rooms", buffer, theRooms, (this.rooms!= null));
                    }
                    {
                        SizeType theSize;
                        theSize = this.getSize();
                        strategy.appendField(locator, this, "size", buffer, theSize, (this.size!= null));
                    }
                    {
                        PriceType thePrice;
                        thePrice = this.getPrice();
                        strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
                    }
                    {
                        List<Langtxt> theDescription;
                        theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
                        strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
                    }
                    {
                        ClassEnergy theEnergyClass;
                        theEnergyClass = this.getEnergyClass();
                        strategy.appendField(locator, this, "energyClass", buffer, theEnergyClass, (this.energyClass!= null));
                    }
                    {
                        ClassEnergyPerformance theEnergyPerformance;
                        theEnergyPerformance = this.getEnergyPerformance();
                        strategy.appendField(locator, this, "energyPerformance", buffer, theEnergyPerformance, (this.energyPerformance!= null));
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
                    if (draftCopy instanceof Feed.Properties.Property.Features) {
                        final Feed.Properties.Property.Features copy = ((Feed.Properties.Property.Features) draftCopy);
                        {
                            Boolean roomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rooms!= null));
                            if (roomsShouldBeCopiedAndSet == Boolean.TRUE) {
                                Integer sourceRooms;
                                sourceRooms = this.getRooms();
                                Integer copyRooms = ((Integer) strategy.copy(LocatorUtils.property(locator, "rooms", sourceRooms), sourceRooms, (this.rooms!= null)));
                                copy.setRooms(copyRooms);
                            } else {
                                if (roomsShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.rooms = null;
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
                            Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.description!= null)&&(!this.description.isEmpty())));
                            if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                                List<Langtxt> sourceDescription;
                                sourceDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
                                @SuppressWarnings("unchecked")
                                List<Langtxt> copyDescription = ((List<Langtxt> ) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, ((this.description!= null)&&(!this.description.isEmpty()))));
                                copy.description = null;
                                if (copyDescription!= null) {
                                    List<Langtxt> uniqueDescriptionl = copy.getDescription();
                                    uniqueDescriptionl.addAll(copyDescription);
                                }
                            } else {
                                if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.description = null;
                                }
                            }
                        }
                        {
                            Boolean energyClassShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyClass!= null));
                            if (energyClassShouldBeCopiedAndSet == Boolean.TRUE) {
                                ClassEnergy sourceEnergyClass;
                                sourceEnergyClass = this.getEnergyClass();
                                ClassEnergy copyEnergyClass = ((ClassEnergy) strategy.copy(LocatorUtils.property(locator, "energyClass", sourceEnergyClass), sourceEnergyClass, (this.energyClass!= null)));
                                copy.setEnergyClass(copyEnergyClass);
                            } else {
                                if (energyClassShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.energyClass = null;
                                }
                            }
                        }
                        {
                            Boolean energyPerformanceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyPerformance!= null));
                            if (energyPerformanceShouldBeCopiedAndSet == Boolean.TRUE) {
                                ClassEnergyPerformance sourceEnergyPerformance;
                                sourceEnergyPerformance = this.getEnergyPerformance();
                                ClassEnergyPerformance copyEnergyPerformance = ((ClassEnergyPerformance) strategy.copy(LocatorUtils.property(locator, "energyPerformance", sourceEnergyPerformance), sourceEnergyPerformance, (this.energyPerformance!= null)));
                                copy.setEnergyPerformance(copyEnergyPerformance);
                            } else {
                                if (energyPerformanceShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.energyPerformance = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Object createNewInstance() {
                    return new Feed.Properties.Property.Features();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Feed.Properties.Property.Features that = ((Feed.Properties.Property.Features) object);
                    {
                        Integer lhsRooms;
                        lhsRooms = this.getRooms();
                        Integer rhsRooms;
                        rhsRooms = that.getRooms();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "rooms", lhsRooms), LocatorUtils.property(thatLocator, "rooms", rhsRooms), lhsRooms, rhsRooms, (this.rooms!= null), (that.rooms!= null))) {
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
                        PriceType lhsPrice;
                        lhsPrice = this.getPrice();
                        PriceType rhsPrice;
                        rhsPrice = that.getPrice();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice, (this.price!= null), (that.price!= null))) {
                            return false;
                        }
                    }
                    {
                        List<Langtxt> lhsDescription;
                        lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
                        List<Langtxt> rhsDescription;
                        rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, ((this.description!= null)&&(!this.description.isEmpty())), ((that.description!= null)&&(!that.description.isEmpty())))) {
                            return false;
                        }
                    }
                    {
                        ClassEnergy lhsEnergyClass;
                        lhsEnergyClass = this.getEnergyClass();
                        ClassEnergy rhsEnergyClass;
                        rhsEnergyClass = that.getEnergyClass();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "energyClass", lhsEnergyClass), LocatorUtils.property(thatLocator, "energyClass", rhsEnergyClass), lhsEnergyClass, rhsEnergyClass, (this.energyClass!= null), (that.energyClass!= null))) {
                            return false;
                        }
                    }
                    {
                        ClassEnergyPerformance lhsEnergyPerformance;
                        lhsEnergyPerformance = this.getEnergyPerformance();
                        ClassEnergyPerformance rhsEnergyPerformance;
                        rhsEnergyPerformance = that.getEnergyPerformance();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "energyPerformance", lhsEnergyPerformance), LocatorUtils.property(thatLocator, "energyPerformance", rhsEnergyPerformance), lhsEnergyPerformance, rhsEnergyPerformance, (this.energyPerformance!= null), (that.energyPerformance!= null))) {
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
             *       &lt;sequence maxOccurs="15" minOccurs="0"&gt;
             *         &lt;element name="picture-url" type="{http://feed.immobiliare.it}pictureProject" maxOccurs="unbounded" minOccurs="0"/&gt;
             *         &lt;element name="picture" type="{http://feed.immobiliare.it}pictureExtended" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                "pictureUrlAndPicture"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public static class Pictures implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlElements({
                    @XmlElement(name = "picture-url"),
                    @XmlElement(name = "picture", type = PictureExtended.class)
                })
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected List<PictureProject> pictureUrlAndPicture;

                /**
                 * Gets the value of the pictureUrlAndPicture property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pictureUrlAndPicture property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPictureUrlAndPicture().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PictureProject }
                 * {@link PictureExtended }
                 * 
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public List<PictureProject> getPictureUrlAndPicture() {
                    if (pictureUrlAndPicture == null) {
                        pictureUrlAndPicture = new ArrayList<PictureProject>();
                    }
                    return this.pictureUrlAndPicture;
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
                        List<PictureProject> thePictureUrlAndPicture;
                        thePictureUrlAndPicture = (((this.pictureUrlAndPicture!= null)&&(!this.pictureUrlAndPicture.isEmpty()))?this.getPictureUrlAndPicture():null);
                        strategy.appendField(locator, this, "pictureUrlAndPicture", buffer, thePictureUrlAndPicture, ((this.pictureUrlAndPicture!= null)&&(!this.pictureUrlAndPicture.isEmpty())));
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
                    if (draftCopy instanceof Feed.Properties.Property.Pictures) {
                        final Feed.Properties.Property.Pictures copy = ((Feed.Properties.Property.Pictures) draftCopy);
                        {
                            Boolean pictureUrlAndPictureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.pictureUrlAndPicture!= null)&&(!this.pictureUrlAndPicture.isEmpty())));
                            if (pictureUrlAndPictureShouldBeCopiedAndSet == Boolean.TRUE) {
                                List<PictureProject> sourcePictureUrlAndPicture;
                                sourcePictureUrlAndPicture = (((this.pictureUrlAndPicture!= null)&&(!this.pictureUrlAndPicture.isEmpty()))?this.getPictureUrlAndPicture():null);
                                @SuppressWarnings("unchecked")
                                List<PictureProject> copyPictureUrlAndPicture = ((List<PictureProject> ) strategy.copy(LocatorUtils.property(locator, "pictureUrlAndPicture", sourcePictureUrlAndPicture), sourcePictureUrlAndPicture, ((this.pictureUrlAndPicture!= null)&&(!this.pictureUrlAndPicture.isEmpty()))));
                                copy.pictureUrlAndPicture = null;
                                if (copyPictureUrlAndPicture!= null) {
                                    List<PictureProject> uniquePictureUrlAndPicturel = copy.getPictureUrlAndPicture();
                                    uniquePictureUrlAndPicturel.addAll(copyPictureUrlAndPicture);
                                }
                            } else {
                                if (pictureUrlAndPictureShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.pictureUrlAndPicture = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Object createNewInstance() {
                    return new Feed.Properties.Property.Pictures();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Feed.Properties.Property.Pictures that = ((Feed.Properties.Property.Pictures) object);
                    {
                        List<PictureProject> lhsPictureUrlAndPicture;
                        lhsPictureUrlAndPicture = (((this.pictureUrlAndPicture!= null)&&(!this.pictureUrlAndPicture.isEmpty()))?this.getPictureUrlAndPicture():null);
                        List<PictureProject> rhsPictureUrlAndPicture;
                        rhsPictureUrlAndPicture = (((that.pictureUrlAndPicture!= null)&&(!that.pictureUrlAndPicture.isEmpty()))?that.getPictureUrlAndPicture():null);
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "pictureUrlAndPicture", lhsPictureUrlAndPicture), LocatorUtils.property(thatLocator, "pictureUrlAndPicture", rhsPictureUrlAndPicture), lhsPictureUrlAndPicture, rhsPictureUrlAndPicture, ((this.pictureUrlAndPicture!= null)&&(!this.pictureUrlAndPicture.isEmpty())), ((that.pictureUrlAndPicture!= null)&&(!that.pictureUrlAndPicture.isEmpty())))) {
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
             *       &lt;sequence maxOccurs="4"&gt;
             *         &lt;element name="video" type="{http://feed.immobiliare.it}videoProject"/&gt;
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
                "video"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
            public static class Videos implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
            {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                protected List<VideoProject> video;

                /**
                 * Gets the value of the video property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the video property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVideo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VideoProject }
                 * 
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public List<VideoProject> getVideo() {
                    if (video == null) {
                        video = new ArrayList<VideoProject>();
                    }
                    return this.video;
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
                        List<VideoProject> theVideo;
                        theVideo = (((this.video!= null)&&(!this.video.isEmpty()))?this.getVideo():null);
                        strategy.appendField(locator, this, "video", buffer, theVideo, ((this.video!= null)&&(!this.video.isEmpty())));
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
                    if (draftCopy instanceof Feed.Properties.Property.Videos) {
                        final Feed.Properties.Property.Videos copy = ((Feed.Properties.Property.Videos) draftCopy);
                        {
                            Boolean videoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.video!= null)&&(!this.video.isEmpty())));
                            if (videoShouldBeCopiedAndSet == Boolean.TRUE) {
                                List<VideoProject> sourceVideo;
                                sourceVideo = (((this.video!= null)&&(!this.video.isEmpty()))?this.getVideo():null);
                                @SuppressWarnings("unchecked")
                                List<VideoProject> copyVideo = ((List<VideoProject> ) strategy.copy(LocatorUtils.property(locator, "video", sourceVideo), sourceVideo, ((this.video!= null)&&(!this.video.isEmpty()))));
                                copy.video = null;
                                if (copyVideo!= null) {
                                    List<VideoProject> uniqueVideol = copy.getVideo();
                                    uniqueVideol.addAll(copyVideo);
                                }
                            } else {
                                if (videoShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.video = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public Object createNewInstance() {
                    return new Feed.Properties.Property.Videos();
                }

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:59+02:00", comments = "JAXB RI v2.3.0")
                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                    if ((object == null)||(this.getClass()!= object.getClass())) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Feed.Properties.Property.Videos that = ((Feed.Properties.Property.Videos) object);
                    {
                        List<VideoProject> lhsVideo;
                        lhsVideo = (((this.video!= null)&&(!this.video.isEmpty()))?this.getVideo():null);
                        List<VideoProject> rhsVideo;
                        rhsVideo = (((that.video!= null)&&(!that.video.isEmpty()))?that.getVideo():null);
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "video", lhsVideo), LocatorUtils.property(thatLocator, "video", rhsVideo), lhsVideo, rhsVideo, ((this.video!= null)&&(!this.video.isEmpty())), ((that.video!= null)&&(!that.video.isEmpty())))) {
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

    }

}
