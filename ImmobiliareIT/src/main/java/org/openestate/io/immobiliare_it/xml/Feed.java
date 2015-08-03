
package org.openestate.io.immobiliare_it.xml;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
public class Feed
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Version version;
    @XmlElement(required = true)
    protected Feed.Metadata metadata;
    protected Feed.Projects projects;
    @XmlElement(required = true)
    protected Feed.Properties properties;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Version }
     *     
     */
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
    public void setProperties(Feed.Properties value) {
        this.properties = value;
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
            Version theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        {
            Feed.Metadata theMetadata;
            theMetadata = this.getMetadata();
            strategy.appendField(locator, this, "metadata", buffer, theMetadata);
        }
        {
            Feed.Projects theProjects;
            theProjects = this.getProjects();
            strategy.appendField(locator, this, "projects", buffer, theProjects);
        }
        {
            Feed.Properties theProperties;
            theProperties = this.getProperties();
            strategy.appendField(locator, this, "properties", buffer, theProperties);
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
        if (draftCopy instanceof Feed) {
            final Feed copy = ((Feed) draftCopy);
            if (this.version!= null) {
                Version sourceVersion;
                sourceVersion = this.getVersion();
                Version copyVersion = ((Version) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion));
                copy.setVersion(copyVersion);
            } else {
                copy.version = null;
            }
            if (this.metadata!= null) {
                Feed.Metadata sourceMetadata;
                sourceMetadata = this.getMetadata();
                Feed.Metadata copyMetadata = ((Feed.Metadata) strategy.copy(LocatorUtils.property(locator, "metadata", sourceMetadata), sourceMetadata));
                copy.setMetadata(copyMetadata);
            } else {
                copy.metadata = null;
            }
            if (this.projects!= null) {
                Feed.Projects sourceProjects;
                sourceProjects = this.getProjects();
                Feed.Projects copyProjects = ((Feed.Projects) strategy.copy(LocatorUtils.property(locator, "projects", sourceProjects), sourceProjects));
                copy.setProjects(copyProjects);
            } else {
                copy.projects = null;
            }
            if (this.properties!= null) {
                Feed.Properties sourceProperties;
                sourceProperties = this.getProperties();
                Feed.Properties copyProperties = ((Feed.Properties) strategy.copy(LocatorUtils.property(locator, "properties", sourceProperties), sourceProperties));
                copy.setProperties(copyProperties);
            } else {
                copy.properties = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Feed();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Feed)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
                return false;
            }
        }
        {
            Feed.Metadata lhsMetadata;
            lhsMetadata = this.getMetadata();
            Feed.Metadata rhsMetadata;
            rhsMetadata = that.getMetadata();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metadata", lhsMetadata), LocatorUtils.property(thatLocator, "metadata", rhsMetadata), lhsMetadata, rhsMetadata)) {
                return false;
            }
        }
        {
            Feed.Projects lhsProjects;
            lhsProjects = this.getProjects();
            Feed.Projects rhsProjects;
            rhsProjects = that.getProjects();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "projects", lhsProjects), LocatorUtils.property(thatLocator, "projects", rhsProjects), lhsProjects, rhsProjects)) {
                return false;
            }
        }
        {
            Feed.Properties lhsProperties;
            lhsProperties = this.getProperties();
            Feed.Properties rhsProperties;
            rhsProperties = that.getProperties();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "properties", lhsProperties), LocatorUtils.property(thatLocator, "properties", rhsProperties), lhsProperties, rhsProperties)) {
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
    public static class Metadata
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(required = true)
        protected Publisher publisher;
        @XmlElement(name = "build-date", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "dateTime")
        protected Calendar buildDate;
        protected Feed.Metadata.Multipage multipage;

        /**
         * Gets the value of the publisher property.
         * 
         * @return
         *     possible object is
         *     {@link Publisher }
         *     
         */
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
        public void setMultipage(Feed.Metadata.Multipage value) {
            this.multipage = value;
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
                Publisher thePublisher;
                thePublisher = this.getPublisher();
                strategy.appendField(locator, this, "publisher", buffer, thePublisher);
            }
            {
                Calendar theBuildDate;
                theBuildDate = this.getBuildDate();
                strategy.appendField(locator, this, "buildDate", buffer, theBuildDate);
            }
            {
                Feed.Metadata.Multipage theMultipage;
                theMultipage = this.getMultipage();
                strategy.appendField(locator, this, "multipage", buffer, theMultipage);
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
            if (draftCopy instanceof Feed.Metadata) {
                final Feed.Metadata copy = ((Feed.Metadata) draftCopy);
                if (this.publisher!= null) {
                    Publisher sourcePublisher;
                    sourcePublisher = this.getPublisher();
                    Publisher copyPublisher = ((Publisher) strategy.copy(LocatorUtils.property(locator, "publisher", sourcePublisher), sourcePublisher));
                    copy.setPublisher(copyPublisher);
                } else {
                    copy.publisher = null;
                }
                if (this.buildDate!= null) {
                    Calendar sourceBuildDate;
                    sourceBuildDate = this.getBuildDate();
                    Calendar copyBuildDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "buildDate", sourceBuildDate), sourceBuildDate));
                    copy.setBuildDate(copyBuildDate);
                } else {
                    copy.buildDate = null;
                }
                if (this.multipage!= null) {
                    Feed.Metadata.Multipage sourceMultipage;
                    sourceMultipage = this.getMultipage();
                    Feed.Metadata.Multipage copyMultipage = ((Feed.Metadata.Multipage) strategy.copy(LocatorUtils.property(locator, "multipage", sourceMultipage), sourceMultipage));
                    copy.setMultipage(copyMultipage);
                } else {
                    copy.multipage = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new Feed.Metadata();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof Feed.Metadata)) {
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
                if (!strategy.equals(LocatorUtils.property(thisLocator, "publisher", lhsPublisher), LocatorUtils.property(thatLocator, "publisher", rhsPublisher), lhsPublisher, rhsPublisher)) {
                    return false;
                }
            }
            {
                Calendar lhsBuildDate;
                lhsBuildDate = this.getBuildDate();
                Calendar rhsBuildDate;
                rhsBuildDate = that.getBuildDate();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "buildDate", lhsBuildDate), LocatorUtils.property(thatLocator, "buildDate", rhsBuildDate), lhsBuildDate, rhsBuildDate)) {
                    return false;
                }
            }
            {
                Feed.Metadata.Multipage lhsMultipage;
                lhsMultipage = this.getMultipage();
                Feed.Metadata.Multipage rhsMultipage;
                rhsMultipage = that.getMultipage();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "multipage", lhsMultipage), LocatorUtils.property(thatLocator, "multipage", rhsMultipage), lhsMultipage, rhsMultipage)) {
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
        public static class Multipage
            implements Cloneable, CopyTo, Equals, ToString
        {

            @XmlElement(required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter2 .class)
            @XmlSchemaType(name = "integer")
            protected Long current;
            @XmlElement(required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter2 .class)
            @XmlSchemaType(name = "integer")
            protected Long last;

            /**
             * Gets the value of the current property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Long getCurrent() {
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
            public void setCurrent(Long value) {
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
            public Long getLast() {
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
            public void setLast(Long value) {
                this.last = value;
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
                    Long theCurrent;
                    theCurrent = this.getCurrent();
                    strategy.appendField(locator, this, "current", buffer, theCurrent);
                }
                {
                    Long theLast;
                    theLast = this.getLast();
                    strategy.appendField(locator, this, "last", buffer, theLast);
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
                if (draftCopy instanceof Feed.Metadata.Multipage) {
                    final Feed.Metadata.Multipage copy = ((Feed.Metadata.Multipage) draftCopy);
                    if (this.current!= null) {
                        Long sourceCurrent;
                        sourceCurrent = this.getCurrent();
                        Long copyCurrent = ((Long) strategy.copy(LocatorUtils.property(locator, "current", sourceCurrent), sourceCurrent));
                        copy.setCurrent(copyCurrent);
                    } else {
                        copy.current = null;
                    }
                    if (this.last!= null) {
                        Long sourceLast;
                        sourceLast = this.getLast();
                        Long copyLast = ((Long) strategy.copy(LocatorUtils.property(locator, "last", sourceLast), sourceLast));
                        copy.setLast(copyLast);
                    } else {
                        copy.last = null;
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new Feed.Metadata.Multipage();
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                if (!(object instanceof Feed.Metadata.Multipage)) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final Feed.Metadata.Multipage that = ((Feed.Metadata.Multipage) object);
                {
                    Long lhsCurrent;
                    lhsCurrent = this.getCurrent();
                    Long rhsCurrent;
                    rhsCurrent = that.getCurrent();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "current", lhsCurrent), LocatorUtils.property(thatLocator, "current", rhsCurrent), lhsCurrent, rhsCurrent)) {
                        return false;
                    }
                }
                {
                    Long lhsLast;
                    lhsLast = this.getLast();
                    Long rhsLast;
                    rhsLast = that.getLast();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "last", lhsLast), LocatorUtils.property(thatLocator, "last", rhsLast), lhsLast, rhsLast)) {
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
    public static class Projects
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(required = true)
        protected Feed.Projects.Project project;

        /**
         * Gets the value of the project property.
         * 
         * @return
         *     possible object is
         *     {@link Feed.Projects.Project }
         *     
         */
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
        public void setProject(Feed.Projects.Project value) {
            this.project = value;
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
                Feed.Projects.Project theProject;
                theProject = this.getProject();
                strategy.appendField(locator, this, "project", buffer, theProject);
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
            if (draftCopy instanceof Feed.Projects) {
                final Feed.Projects copy = ((Feed.Projects) draftCopy);
                if (this.project!= null) {
                    Feed.Projects.Project sourceProject;
                    sourceProject = this.getProject();
                    Feed.Projects.Project copyProject = ((Feed.Projects.Project) strategy.copy(LocatorUtils.property(locator, "project", sourceProject), sourceProject));
                    copy.setProject(copyProject);
                } else {
                    copy.project = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new Feed.Projects();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof Feed.Projects)) {
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
                if (!strategy.equals(LocatorUtils.property(thisLocator, "project", lhsProject), LocatorUtils.property(thatLocator, "project", rhsProject), lhsProject, rhsProject)) {
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
        public static class Project
            implements Cloneable, CopyTo, Equals, ToString
        {

            @XmlElement(name = "unique-id", required = true)
            protected String uniqueId;
            @XmlElement(name = "date-updated", required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter3 .class)
            @XmlSchemaType(name = "dateTime")
            protected Calendar dateUpdated;
            @XmlElement(required = true)
            protected Feed.Projects.Project.Agent agent;
            @XmlElement(required = true)
            protected Feed.Projects.Project.Features features;
            protected LocationStructure location;
            protected Feed.Projects.Project.Pictures pictures;
            protected Feed.Projects.Project.Videos videos;
            protected Feed.Projects.Project.Lots lots;
            @XmlAttribute(name = "operation")
            protected Operation operation;

            /**
             * Gets the value of the uniqueId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
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
            public void setOperation(Operation value) {
                this.operation = value;
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
                    String theUniqueId;
                    theUniqueId = this.getUniqueId();
                    strategy.appendField(locator, this, "uniqueId", buffer, theUniqueId);
                }
                {
                    Calendar theDateUpdated;
                    theDateUpdated = this.getDateUpdated();
                    strategy.appendField(locator, this, "dateUpdated", buffer, theDateUpdated);
                }
                {
                    Feed.Projects.Project.Agent theAgent;
                    theAgent = this.getAgent();
                    strategy.appendField(locator, this, "agent", buffer, theAgent);
                }
                {
                    Feed.Projects.Project.Features theFeatures;
                    theFeatures = this.getFeatures();
                    strategy.appendField(locator, this, "features", buffer, theFeatures);
                }
                {
                    LocationStructure theLocation;
                    theLocation = this.getLocation();
                    strategy.appendField(locator, this, "location", buffer, theLocation);
                }
                {
                    Feed.Projects.Project.Pictures thePictures;
                    thePictures = this.getPictures();
                    strategy.appendField(locator, this, "pictures", buffer, thePictures);
                }
                {
                    Feed.Projects.Project.Videos theVideos;
                    theVideos = this.getVideos();
                    strategy.appendField(locator, this, "videos", buffer, theVideos);
                }
                {
                    Feed.Projects.Project.Lots theLots;
                    theLots = this.getLots();
                    strategy.appendField(locator, this, "lots", buffer, theLots);
                }
                {
                    Operation theOperation;
                    theOperation = this.getOperation();
                    strategy.appendField(locator, this, "operation", buffer, theOperation);
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
                if (draftCopy instanceof Feed.Projects.Project) {
                    final Feed.Projects.Project copy = ((Feed.Projects.Project) draftCopy);
                    if (this.uniqueId!= null) {
                        String sourceUniqueId;
                        sourceUniqueId = this.getUniqueId();
                        String copyUniqueId = ((String) strategy.copy(LocatorUtils.property(locator, "uniqueId", sourceUniqueId), sourceUniqueId));
                        copy.setUniqueId(copyUniqueId);
                    } else {
                        copy.uniqueId = null;
                    }
                    if (this.dateUpdated!= null) {
                        Calendar sourceDateUpdated;
                        sourceDateUpdated = this.getDateUpdated();
                        Calendar copyDateUpdated = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateUpdated", sourceDateUpdated), sourceDateUpdated));
                        copy.setDateUpdated(copyDateUpdated);
                    } else {
                        copy.dateUpdated = null;
                    }
                    if (this.agent!= null) {
                        Feed.Projects.Project.Agent sourceAgent;
                        sourceAgent = this.getAgent();
                        Feed.Projects.Project.Agent copyAgent = ((Feed.Projects.Project.Agent) strategy.copy(LocatorUtils.property(locator, "agent", sourceAgent), sourceAgent));
                        copy.setAgent(copyAgent);
                    } else {
                        copy.agent = null;
                    }
                    if (this.features!= null) {
                        Feed.Projects.Project.Features sourceFeatures;
                        sourceFeatures = this.getFeatures();
                        Feed.Projects.Project.Features copyFeatures = ((Feed.Projects.Project.Features) strategy.copy(LocatorUtils.property(locator, "features", sourceFeatures), sourceFeatures));
                        copy.setFeatures(copyFeatures);
                    } else {
                        copy.features = null;
                    }
                    if (this.location!= null) {
                        LocationStructure sourceLocation;
                        sourceLocation = this.getLocation();
                        LocationStructure copyLocation = ((LocationStructure) strategy.copy(LocatorUtils.property(locator, "location", sourceLocation), sourceLocation));
                        copy.setLocation(copyLocation);
                    } else {
                        copy.location = null;
                    }
                    if (this.pictures!= null) {
                        Feed.Projects.Project.Pictures sourcePictures;
                        sourcePictures = this.getPictures();
                        Feed.Projects.Project.Pictures copyPictures = ((Feed.Projects.Project.Pictures) strategy.copy(LocatorUtils.property(locator, "pictures", sourcePictures), sourcePictures));
                        copy.setPictures(copyPictures);
                    } else {
                        copy.pictures = null;
                    }
                    if (this.videos!= null) {
                        Feed.Projects.Project.Videos sourceVideos;
                        sourceVideos = this.getVideos();
                        Feed.Projects.Project.Videos copyVideos = ((Feed.Projects.Project.Videos) strategy.copy(LocatorUtils.property(locator, "videos", sourceVideos), sourceVideos));
                        copy.setVideos(copyVideos);
                    } else {
                        copy.videos = null;
                    }
                    if (this.lots!= null) {
                        Feed.Projects.Project.Lots sourceLots;
                        sourceLots = this.getLots();
                        Feed.Projects.Project.Lots copyLots = ((Feed.Projects.Project.Lots) strategy.copy(LocatorUtils.property(locator, "lots", sourceLots), sourceLots));
                        copy.setLots(copyLots);
                    } else {
                        copy.lots = null;
                    }
                    if (this.operation!= null) {
                        Operation sourceOperation;
                        sourceOperation = this.getOperation();
                        Operation copyOperation = ((Operation) strategy.copy(LocatorUtils.property(locator, "operation", sourceOperation), sourceOperation));
                        copy.setOperation(copyOperation);
                    } else {
                        copy.operation = null;
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new Feed.Projects.Project();
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                if (!(object instanceof Feed.Projects.Project)) {
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
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "uniqueId", lhsUniqueId), LocatorUtils.property(thatLocator, "uniqueId", rhsUniqueId), lhsUniqueId, rhsUniqueId)) {
                        return false;
                    }
                }
                {
                    Calendar lhsDateUpdated;
                    lhsDateUpdated = this.getDateUpdated();
                    Calendar rhsDateUpdated;
                    rhsDateUpdated = that.getDateUpdated();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "dateUpdated", lhsDateUpdated), LocatorUtils.property(thatLocator, "dateUpdated", rhsDateUpdated), lhsDateUpdated, rhsDateUpdated)) {
                        return false;
                    }
                }
                {
                    Feed.Projects.Project.Agent lhsAgent;
                    lhsAgent = this.getAgent();
                    Feed.Projects.Project.Agent rhsAgent;
                    rhsAgent = that.getAgent();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "agent", lhsAgent), LocatorUtils.property(thatLocator, "agent", rhsAgent), lhsAgent, rhsAgent)) {
                        return false;
                    }
                }
                {
                    Feed.Projects.Project.Features lhsFeatures;
                    lhsFeatures = this.getFeatures();
                    Feed.Projects.Project.Features rhsFeatures;
                    rhsFeatures = that.getFeatures();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "features", lhsFeatures), LocatorUtils.property(thatLocator, "features", rhsFeatures), lhsFeatures, rhsFeatures)) {
                        return false;
                    }
                }
                {
                    LocationStructure lhsLocation;
                    lhsLocation = this.getLocation();
                    LocationStructure rhsLocation;
                    rhsLocation = that.getLocation();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation)) {
                        return false;
                    }
                }
                {
                    Feed.Projects.Project.Pictures lhsPictures;
                    lhsPictures = this.getPictures();
                    Feed.Projects.Project.Pictures rhsPictures;
                    rhsPictures = that.getPictures();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "pictures", lhsPictures), LocatorUtils.property(thatLocator, "pictures", rhsPictures), lhsPictures, rhsPictures)) {
                        return false;
                    }
                }
                {
                    Feed.Projects.Project.Videos lhsVideos;
                    lhsVideos = this.getVideos();
                    Feed.Projects.Project.Videos rhsVideos;
                    rhsVideos = that.getVideos();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "videos", lhsVideos), LocatorUtils.property(thatLocator, "videos", rhsVideos), lhsVideos, rhsVideos)) {
                        return false;
                    }
                }
                {
                    Feed.Projects.Project.Lots lhsLots;
                    lhsLots = this.getLots();
                    Feed.Projects.Project.Lots rhsLots;
                    rhsLots = that.getLots();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "lots", lhsLots), LocatorUtils.property(thatLocator, "lots", rhsLots), lhsLots, rhsLots)) {
                        return false;
                    }
                }
                {
                    Operation lhsOperation;
                    lhsOperation = this.getOperation();
                    Operation rhsOperation;
                    rhsOperation = that.getOperation();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "operation", lhsOperation), LocatorUtils.property(thatLocator, "operation", rhsOperation), lhsOperation, rhsOperation)) {
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
            public static class Agent
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlElement(required = true)
                protected String name;
                @XmlElement(required = true)
                @XmlJavaTypeAdapter(Adapter4 .class)
                protected String email;
                @XmlElement(name = "sales-office", required = true)
                protected Feed.Projects.Project.Agent.SalesOffice salesOffice;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
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
                public void setSalesOffice(Feed.Projects.Project.Agent.SalesOffice value) {
                    this.salesOffice = value;
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
                        String theName;
                        theName = this.getName();
                        strategy.appendField(locator, this, "name", buffer, theName);
                    }
                    {
                        String theEmail;
                        theEmail = this.getEmail();
                        strategy.appendField(locator, this, "email", buffer, theEmail);
                    }
                    {
                        Feed.Projects.Project.Agent.SalesOffice theSalesOffice;
                        theSalesOffice = this.getSalesOffice();
                        strategy.appendField(locator, this, "salesOffice", buffer, theSalesOffice);
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
                    if (draftCopy instanceof Feed.Projects.Project.Agent) {
                        final Feed.Projects.Project.Agent copy = ((Feed.Projects.Project.Agent) draftCopy);
                        if (this.name!= null) {
                            String sourceName;
                            sourceName = this.getName();
                            String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                            copy.setName(copyName);
                        } else {
                            copy.name = null;
                        }
                        if (this.email!= null) {
                            String sourceEmail;
                            sourceEmail = this.getEmail();
                            String copyEmail = ((String) strategy.copy(LocatorUtils.property(locator, "email", sourceEmail), sourceEmail));
                            copy.setEmail(copyEmail);
                        } else {
                            copy.email = null;
                        }
                        if (this.salesOffice!= null) {
                            Feed.Projects.Project.Agent.SalesOffice sourceSalesOffice;
                            sourceSalesOffice = this.getSalesOffice();
                            Feed.Projects.Project.Agent.SalesOffice copySalesOffice = ((Feed.Projects.Project.Agent.SalesOffice) strategy.copy(LocatorUtils.property(locator, "salesOffice", sourceSalesOffice), sourceSalesOffice));
                            copy.setSalesOffice(copySalesOffice);
                        } else {
                            copy.salesOffice = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Feed.Projects.Project.Agent();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                    if (!(object instanceof Feed.Projects.Project.Agent)) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                            return false;
                        }
                    }
                    {
                        String lhsEmail;
                        lhsEmail = this.getEmail();
                        String rhsEmail;
                        rhsEmail = that.getEmail();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail)) {
                            return false;
                        }
                    }
                    {
                        Feed.Projects.Project.Agent.SalesOffice lhsSalesOffice;
                        lhsSalesOffice = this.getSalesOffice();
                        Feed.Projects.Project.Agent.SalesOffice rhsSalesOffice;
                        rhsSalesOffice = that.getSalesOffice();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "salesOffice", lhsSalesOffice), LocatorUtils.property(thatLocator, "salesOffice", rhsSalesOffice), lhsSalesOffice, rhsSalesOffice)) {
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
                public static class SalesOffice
                    implements Cloneable, CopyTo, Equals, ToString
                {

                    @XmlElement(name = "country-code", required = true)
                    @XmlJavaTypeAdapter(Adapter23 .class)
                    protected String countryCode;
                    @XmlElement(name = "administrative-area", required = true)
                    protected String administrativeArea;
                    @XmlElement(name = "sub-administrative-area", required = true)
                    protected String subAdministrativeArea;
                    @XmlElement(required = true)
                    protected Feed.Projects.Project.Agent.SalesOffice.City city;
                    @XmlElement(required = true)
                    protected Feed.Projects.Project.Agent.SalesOffice.Locality locality;
                    protected String phone;
                    protected String mobile;

                    /**
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
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
                    public void setMobile(String value) {
                        this.mobile = value;
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
                            String theCountryCode;
                            theCountryCode = this.getCountryCode();
                            strategy.appendField(locator, this, "countryCode", buffer, theCountryCode);
                        }
                        {
                            String theAdministrativeArea;
                            theAdministrativeArea = this.getAdministrativeArea();
                            strategy.appendField(locator, this, "administrativeArea", buffer, theAdministrativeArea);
                        }
                        {
                            String theSubAdministrativeArea;
                            theSubAdministrativeArea = this.getSubAdministrativeArea();
                            strategy.appendField(locator, this, "subAdministrativeArea", buffer, theSubAdministrativeArea);
                        }
                        {
                            Feed.Projects.Project.Agent.SalesOffice.City theCity;
                            theCity = this.getCity();
                            strategy.appendField(locator, this, "city", buffer, theCity);
                        }
                        {
                            Feed.Projects.Project.Agent.SalesOffice.Locality theLocality;
                            theLocality = this.getLocality();
                            strategy.appendField(locator, this, "locality", buffer, theLocality);
                        }
                        {
                            String thePhone;
                            thePhone = this.getPhone();
                            strategy.appendField(locator, this, "phone", buffer, thePhone);
                        }
                        {
                            String theMobile;
                            theMobile = this.getMobile();
                            strategy.appendField(locator, this, "mobile", buffer, theMobile);
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
                        if (draftCopy instanceof Feed.Projects.Project.Agent.SalesOffice) {
                            final Feed.Projects.Project.Agent.SalesOffice copy = ((Feed.Projects.Project.Agent.SalesOffice) draftCopy);
                            if (this.countryCode!= null) {
                                String sourceCountryCode;
                                sourceCountryCode = this.getCountryCode();
                                String copyCountryCode = ((String) strategy.copy(LocatorUtils.property(locator, "countryCode", sourceCountryCode), sourceCountryCode));
                                copy.setCountryCode(copyCountryCode);
                            } else {
                                copy.countryCode = null;
                            }
                            if (this.administrativeArea!= null) {
                                String sourceAdministrativeArea;
                                sourceAdministrativeArea = this.getAdministrativeArea();
                                String copyAdministrativeArea = ((String) strategy.copy(LocatorUtils.property(locator, "administrativeArea", sourceAdministrativeArea), sourceAdministrativeArea));
                                copy.setAdministrativeArea(copyAdministrativeArea);
                            } else {
                                copy.administrativeArea = null;
                            }
                            if (this.subAdministrativeArea!= null) {
                                String sourceSubAdministrativeArea;
                                sourceSubAdministrativeArea = this.getSubAdministrativeArea();
                                String copySubAdministrativeArea = ((String) strategy.copy(LocatorUtils.property(locator, "subAdministrativeArea", sourceSubAdministrativeArea), sourceSubAdministrativeArea));
                                copy.setSubAdministrativeArea(copySubAdministrativeArea);
                            } else {
                                copy.subAdministrativeArea = null;
                            }
                            if (this.city!= null) {
                                Feed.Projects.Project.Agent.SalesOffice.City sourceCity;
                                sourceCity = this.getCity();
                                Feed.Projects.Project.Agent.SalesOffice.City copyCity = ((Feed.Projects.Project.Agent.SalesOffice.City) strategy.copy(LocatorUtils.property(locator, "city", sourceCity), sourceCity));
                                copy.setCity(copyCity);
                            } else {
                                copy.city = null;
                            }
                            if (this.locality!= null) {
                                Feed.Projects.Project.Agent.SalesOffice.Locality sourceLocality;
                                sourceLocality = this.getLocality();
                                Feed.Projects.Project.Agent.SalesOffice.Locality copyLocality = ((Feed.Projects.Project.Agent.SalesOffice.Locality) strategy.copy(LocatorUtils.property(locator, "locality", sourceLocality), sourceLocality));
                                copy.setLocality(copyLocality);
                            } else {
                                copy.locality = null;
                            }
                            if (this.phone!= null) {
                                String sourcePhone;
                                sourcePhone = this.getPhone();
                                String copyPhone = ((String) strategy.copy(LocatorUtils.property(locator, "phone", sourcePhone), sourcePhone));
                                copy.setPhone(copyPhone);
                            } else {
                                copy.phone = null;
                            }
                            if (this.mobile!= null) {
                                String sourceMobile;
                                sourceMobile = this.getMobile();
                                String copyMobile = ((String) strategy.copy(LocatorUtils.property(locator, "mobile", sourceMobile), sourceMobile));
                                copy.setMobile(copyMobile);
                            } else {
                                copy.mobile = null;
                            }
                        }
                        return draftCopy;
                    }

                    public Object createNewInstance() {
                        return new Feed.Projects.Project.Agent.SalesOffice();
                    }

                    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                        if (!(object instanceof Feed.Projects.Project.Agent.SalesOffice)) {
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
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryCode", lhsCountryCode), LocatorUtils.property(thatLocator, "countryCode", rhsCountryCode), lhsCountryCode, rhsCountryCode)) {
                                return false;
                            }
                        }
                        {
                            String lhsAdministrativeArea;
                            lhsAdministrativeArea = this.getAdministrativeArea();
                            String rhsAdministrativeArea;
                            rhsAdministrativeArea = that.getAdministrativeArea();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "administrativeArea", lhsAdministrativeArea), LocatorUtils.property(thatLocator, "administrativeArea", rhsAdministrativeArea), lhsAdministrativeArea, rhsAdministrativeArea)) {
                                return false;
                            }
                        }
                        {
                            String lhsSubAdministrativeArea;
                            lhsSubAdministrativeArea = this.getSubAdministrativeArea();
                            String rhsSubAdministrativeArea;
                            rhsSubAdministrativeArea = that.getSubAdministrativeArea();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "subAdministrativeArea", lhsSubAdministrativeArea), LocatorUtils.property(thatLocator, "subAdministrativeArea", rhsSubAdministrativeArea), lhsSubAdministrativeArea, rhsSubAdministrativeArea)) {
                                return false;
                            }
                        }
                        {
                            Feed.Projects.Project.Agent.SalesOffice.City lhsCity;
                            lhsCity = this.getCity();
                            Feed.Projects.Project.Agent.SalesOffice.City rhsCity;
                            rhsCity = that.getCity();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity)) {
                                return false;
                            }
                        }
                        {
                            Feed.Projects.Project.Agent.SalesOffice.Locality lhsLocality;
                            lhsLocality = this.getLocality();
                            Feed.Projects.Project.Agent.SalesOffice.Locality rhsLocality;
                            rhsLocality = that.getLocality();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "locality", lhsLocality), LocatorUtils.property(thatLocator, "locality", rhsLocality), lhsLocality, rhsLocality)) {
                                return false;
                            }
                        }
                        {
                            String lhsPhone;
                            lhsPhone = this.getPhone();
                            String rhsPhone;
                            rhsPhone = that.getPhone();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "phone", lhsPhone), LocatorUtils.property(thatLocator, "phone", rhsPhone), lhsPhone, rhsPhone)) {
                                return false;
                            }
                        }
                        {
                            String lhsMobile;
                            lhsMobile = this.getMobile();
                            String rhsMobile;
                            rhsMobile = that.getMobile();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobile", lhsMobile), LocatorUtils.property(thatLocator, "mobile", rhsMobile), lhsMobile, rhsMobile)) {
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
                    public static class City
                        implements Cloneable, CopyTo, Equals, ToString
                    {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "code")
                        @XmlJavaTypeAdapter(Adapter2 .class)
                        @XmlSchemaType(name = "integer")
                        protected Long code;

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

                        /**
                         * Gets the value of the code property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public Long getCode() {
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
                        public void setCode(Long value) {
                            this.code = value;
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
                            {
                                Long theCode;
                                theCode = this.getCode();
                                strategy.appendField(locator, this, "code", buffer, theCode);
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
                            if (draftCopy instanceof Feed.Projects.Project.Agent.SalesOffice.City) {
                                final Feed.Projects.Project.Agent.SalesOffice.City copy = ((Feed.Projects.Project.Agent.SalesOffice.City) draftCopy);
                                if (this.value!= null) {
                                    String sourceValue;
                                    sourceValue = this.getValue();
                                    String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                                    copy.setValue(copyValue);
                                } else {
                                    copy.value = null;
                                }
                                if (this.code!= null) {
                                    Long sourceCode;
                                    sourceCode = this.getCode();
                                    Long copyCode = ((Long) strategy.copy(LocatorUtils.property(locator, "code", sourceCode), sourceCode));
                                    copy.setCode(copyCode);
                                } else {
                                    copy.code = null;
                                }
                            }
                            return draftCopy;
                        }

                        public Object createNewInstance() {
                            return new Feed.Projects.Project.Agent.SalesOffice.City();
                        }

                        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                            if (!(object instanceof Feed.Projects.Project.Agent.SalesOffice.City)) {
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
                                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                                    return false;
                                }
                            }
                            {
                                Long lhsCode;
                                lhsCode = this.getCode();
                                Long rhsCode;
                                rhsCode = that.getCode();
                                if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
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
                    public static class Locality
                        implements Cloneable, CopyTo, Equals, ToString
                    {

                        @XmlElement(required = true)
                        protected String thoroughfare;

                        /**
                         * Gets the value of the thoroughfare property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
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
                        public void setThoroughfare(String value) {
                            this.thoroughfare = value;
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
                                String theThoroughfare;
                                theThoroughfare = this.getThoroughfare();
                                strategy.appendField(locator, this, "thoroughfare", buffer, theThoroughfare);
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
                            if (draftCopy instanceof Feed.Projects.Project.Agent.SalesOffice.Locality) {
                                final Feed.Projects.Project.Agent.SalesOffice.Locality copy = ((Feed.Projects.Project.Agent.SalesOffice.Locality) draftCopy);
                                if (this.thoroughfare!= null) {
                                    String sourceThoroughfare;
                                    sourceThoroughfare = this.getThoroughfare();
                                    String copyThoroughfare = ((String) strategy.copy(LocatorUtils.property(locator, "thoroughfare", sourceThoroughfare), sourceThoroughfare));
                                    copy.setThoroughfare(copyThoroughfare);
                                } else {
                                    copy.thoroughfare = null;
                                }
                            }
                            return draftCopy;
                        }

                        public Object createNewInstance() {
                            return new Feed.Projects.Project.Agent.SalesOffice.Locality();
                        }

                        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                            if (!(object instanceof Feed.Projects.Project.Agent.SalesOffice.Locality)) {
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
                                if (!strategy.equals(LocatorUtils.property(thisLocator, "thoroughfare", lhsThoroughfare), LocatorUtils.property(thatLocator, "thoroughfare", rhsThoroughfare), lhsThoroughfare, rhsThoroughfare)) {
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
            public static class Features
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlElement(name = "building-status")
                protected String buildingStatus;
                @XmlElement(name = "start-date", type = String.class)
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "dateTime")
                protected Calendar startDate;
                @XmlElement(name = "end-date", type = String.class)
                @XmlJavaTypeAdapter(Adapter1 .class)
                @XmlSchemaType(name = "dateTime")
                protected Calendar endDate;
                @XmlElement(required = true)
                protected String name;
                protected String specification;
                @XmlElement(name = "floorplanner-url")
                protected String floorplannerUrl;
                @XmlElement(name = "virtual-tour")
                protected String virtualTour;
                @XmlElement(required = true)
                protected Langtxt description;
                @XmlElement(name = "energy-class", required = true)
                @XmlSchemaType(name = "string")
                protected ClassEnergy energyClass;
                @XmlElement(name = "energy-performance")
                protected ClassEnergyPerformance energyPerformance;

                /**
                 * Gets the value of the buildingStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
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
                public void setEnergyPerformance(ClassEnergyPerformance value) {
                    this.energyPerformance = value;
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
                        String theBuildingStatus;
                        theBuildingStatus = this.getBuildingStatus();
                        strategy.appendField(locator, this, "buildingStatus", buffer, theBuildingStatus);
                    }
                    {
                        Calendar theStartDate;
                        theStartDate = this.getStartDate();
                        strategy.appendField(locator, this, "startDate", buffer, theStartDate);
                    }
                    {
                        Calendar theEndDate;
                        theEndDate = this.getEndDate();
                        strategy.appendField(locator, this, "endDate", buffer, theEndDate);
                    }
                    {
                        String theName;
                        theName = this.getName();
                        strategy.appendField(locator, this, "name", buffer, theName);
                    }
                    {
                        String theSpecification;
                        theSpecification = this.getSpecification();
                        strategy.appendField(locator, this, "specification", buffer, theSpecification);
                    }
                    {
                        String theFloorplannerUrl;
                        theFloorplannerUrl = this.getFloorplannerUrl();
                        strategy.appendField(locator, this, "floorplannerUrl", buffer, theFloorplannerUrl);
                    }
                    {
                        String theVirtualTour;
                        theVirtualTour = this.getVirtualTour();
                        strategy.appendField(locator, this, "virtualTour", buffer, theVirtualTour);
                    }
                    {
                        Langtxt theDescription;
                        theDescription = this.getDescription();
                        strategy.appendField(locator, this, "description", buffer, theDescription);
                    }
                    {
                        ClassEnergy theEnergyClass;
                        theEnergyClass = this.getEnergyClass();
                        strategy.appendField(locator, this, "energyClass", buffer, theEnergyClass);
                    }
                    {
                        ClassEnergyPerformance theEnergyPerformance;
                        theEnergyPerformance = this.getEnergyPerformance();
                        strategy.appendField(locator, this, "energyPerformance", buffer, theEnergyPerformance);
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
                    if (draftCopy instanceof Feed.Projects.Project.Features) {
                        final Feed.Projects.Project.Features copy = ((Feed.Projects.Project.Features) draftCopy);
                        if (this.buildingStatus!= null) {
                            String sourceBuildingStatus;
                            sourceBuildingStatus = this.getBuildingStatus();
                            String copyBuildingStatus = ((String) strategy.copy(LocatorUtils.property(locator, "buildingStatus", sourceBuildingStatus), sourceBuildingStatus));
                            copy.setBuildingStatus(copyBuildingStatus);
                        } else {
                            copy.buildingStatus = null;
                        }
                        if (this.startDate!= null) {
                            Calendar sourceStartDate;
                            sourceStartDate = this.getStartDate();
                            Calendar copyStartDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "startDate", sourceStartDate), sourceStartDate));
                            copy.setStartDate(copyStartDate);
                        } else {
                            copy.startDate = null;
                        }
                        if (this.endDate!= null) {
                            Calendar sourceEndDate;
                            sourceEndDate = this.getEndDate();
                            Calendar copyEndDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "endDate", sourceEndDate), sourceEndDate));
                            copy.setEndDate(copyEndDate);
                        } else {
                            copy.endDate = null;
                        }
                        if (this.name!= null) {
                            String sourceName;
                            sourceName = this.getName();
                            String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                            copy.setName(copyName);
                        } else {
                            copy.name = null;
                        }
                        if (this.specification!= null) {
                            String sourceSpecification;
                            sourceSpecification = this.getSpecification();
                            String copySpecification = ((String) strategy.copy(LocatorUtils.property(locator, "specification", sourceSpecification), sourceSpecification));
                            copy.setSpecification(copySpecification);
                        } else {
                            copy.specification = null;
                        }
                        if (this.floorplannerUrl!= null) {
                            String sourceFloorplannerUrl;
                            sourceFloorplannerUrl = this.getFloorplannerUrl();
                            String copyFloorplannerUrl = ((String) strategy.copy(LocatorUtils.property(locator, "floorplannerUrl", sourceFloorplannerUrl), sourceFloorplannerUrl));
                            copy.setFloorplannerUrl(copyFloorplannerUrl);
                        } else {
                            copy.floorplannerUrl = null;
                        }
                        if (this.virtualTour!= null) {
                            String sourceVirtualTour;
                            sourceVirtualTour = this.getVirtualTour();
                            String copyVirtualTour = ((String) strategy.copy(LocatorUtils.property(locator, "virtualTour", sourceVirtualTour), sourceVirtualTour));
                            copy.setVirtualTour(copyVirtualTour);
                        } else {
                            copy.virtualTour = null;
                        }
                        if (this.description!= null) {
                            Langtxt sourceDescription;
                            sourceDescription = this.getDescription();
                            Langtxt copyDescription = ((Langtxt) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription));
                            copy.setDescription(copyDescription);
                        } else {
                            copy.description = null;
                        }
                        if (this.energyClass!= null) {
                            ClassEnergy sourceEnergyClass;
                            sourceEnergyClass = this.getEnergyClass();
                            ClassEnergy copyEnergyClass = ((ClassEnergy) strategy.copy(LocatorUtils.property(locator, "energyClass", sourceEnergyClass), sourceEnergyClass));
                            copy.setEnergyClass(copyEnergyClass);
                        } else {
                            copy.energyClass = null;
                        }
                        if (this.energyPerformance!= null) {
                            ClassEnergyPerformance sourceEnergyPerformance;
                            sourceEnergyPerformance = this.getEnergyPerformance();
                            ClassEnergyPerformance copyEnergyPerformance = ((ClassEnergyPerformance) strategy.copy(LocatorUtils.property(locator, "energyPerformance", sourceEnergyPerformance), sourceEnergyPerformance));
                            copy.setEnergyPerformance(copyEnergyPerformance);
                        } else {
                            copy.energyPerformance = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Feed.Projects.Project.Features();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                    if (!(object instanceof Feed.Projects.Project.Features)) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingStatus", lhsBuildingStatus), LocatorUtils.property(thatLocator, "buildingStatus", rhsBuildingStatus), lhsBuildingStatus, rhsBuildingStatus)) {
                            return false;
                        }
                    }
                    {
                        Calendar lhsStartDate;
                        lhsStartDate = this.getStartDate();
                        Calendar rhsStartDate;
                        rhsStartDate = that.getStartDate();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "startDate", lhsStartDate), LocatorUtils.property(thatLocator, "startDate", rhsStartDate), lhsStartDate, rhsStartDate)) {
                            return false;
                        }
                    }
                    {
                        Calendar lhsEndDate;
                        lhsEndDate = this.getEndDate();
                        Calendar rhsEndDate;
                        rhsEndDate = that.getEndDate();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "endDate", lhsEndDate), LocatorUtils.property(thatLocator, "endDate", rhsEndDate), lhsEndDate, rhsEndDate)) {
                            return false;
                        }
                    }
                    {
                        String lhsName;
                        lhsName = this.getName();
                        String rhsName;
                        rhsName = that.getName();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                            return false;
                        }
                    }
                    {
                        String lhsSpecification;
                        lhsSpecification = this.getSpecification();
                        String rhsSpecification;
                        rhsSpecification = that.getSpecification();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "specification", lhsSpecification), LocatorUtils.property(thatLocator, "specification", rhsSpecification), lhsSpecification, rhsSpecification)) {
                            return false;
                        }
                    }
                    {
                        String lhsFloorplannerUrl;
                        lhsFloorplannerUrl = this.getFloorplannerUrl();
                        String rhsFloorplannerUrl;
                        rhsFloorplannerUrl = that.getFloorplannerUrl();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "floorplannerUrl", lhsFloorplannerUrl), LocatorUtils.property(thatLocator, "floorplannerUrl", rhsFloorplannerUrl), lhsFloorplannerUrl, rhsFloorplannerUrl)) {
                            return false;
                        }
                    }
                    {
                        String lhsVirtualTour;
                        lhsVirtualTour = this.getVirtualTour();
                        String rhsVirtualTour;
                        rhsVirtualTour = that.getVirtualTour();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "virtualTour", lhsVirtualTour), LocatorUtils.property(thatLocator, "virtualTour", rhsVirtualTour), lhsVirtualTour, rhsVirtualTour)) {
                            return false;
                        }
                    }
                    {
                        Langtxt lhsDescription;
                        lhsDescription = this.getDescription();
                        Langtxt rhsDescription;
                        rhsDescription = that.getDescription();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                            return false;
                        }
                    }
                    {
                        ClassEnergy lhsEnergyClass;
                        lhsEnergyClass = this.getEnergyClass();
                        ClassEnergy rhsEnergyClass;
                        rhsEnergyClass = that.getEnergyClass();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "energyClass", lhsEnergyClass), LocatorUtils.property(thatLocator, "energyClass", rhsEnergyClass), lhsEnergyClass, rhsEnergyClass)) {
                            return false;
                        }
                    }
                    {
                        ClassEnergyPerformance lhsEnergyPerformance;
                        lhsEnergyPerformance = this.getEnergyPerformance();
                        ClassEnergyPerformance rhsEnergyPerformance;
                        rhsEnergyPerformance = that.getEnergyPerformance();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "energyPerformance", lhsEnergyPerformance), LocatorUtils.property(thatLocator, "energyPerformance", rhsEnergyPerformance), lhsEnergyPerformance, rhsEnergyPerformance)) {
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
            public static class Lots
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlElement(required = true, type = String.class)
                @XmlJavaTypeAdapter(Adapter2 .class)
                @XmlSchemaType(name = "integer")
                protected Long residential;
                @XmlElement(required = true, type = String.class)
                @XmlJavaTypeAdapter(Adapter2 .class)
                @XmlSchemaType(name = "integer")
                protected Long commercial;
                @XmlElement(required = true)
                protected List<Feed.Projects.Project.Lots.Lot> lot;

                /**
                 * Gets the value of the residential property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public Long getResidential() {
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
                public void setResidential(Long value) {
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
                public Long getCommercial() {
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
                public void setCommercial(Long value) {
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
                public List<Feed.Projects.Project.Lots.Lot> getLot() {
                    if (lot == null) {
                        lot = new ArrayList<Feed.Projects.Project.Lots.Lot>();
                    }
                    return this.lot;
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
                        Long theResidential;
                        theResidential = this.getResidential();
                        strategy.appendField(locator, this, "residential", buffer, theResidential);
                    }
                    {
                        Long theCommercial;
                        theCommercial = this.getCommercial();
                        strategy.appendField(locator, this, "commercial", buffer, theCommercial);
                    }
                    {
                        List<Feed.Projects.Project.Lots.Lot> theLot;
                        theLot = (((this.lot!= null)&&(!this.lot.isEmpty()))?this.getLot():null);
                        strategy.appendField(locator, this, "lot", buffer, theLot);
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
                    if (draftCopy instanceof Feed.Projects.Project.Lots) {
                        final Feed.Projects.Project.Lots copy = ((Feed.Projects.Project.Lots) draftCopy);
                        if (this.residential!= null) {
                            Long sourceResidential;
                            sourceResidential = this.getResidential();
                            Long copyResidential = ((Long) strategy.copy(LocatorUtils.property(locator, "residential", sourceResidential), sourceResidential));
                            copy.setResidential(copyResidential);
                        } else {
                            copy.residential = null;
                        }
                        if (this.commercial!= null) {
                            Long sourceCommercial;
                            sourceCommercial = this.getCommercial();
                            Long copyCommercial = ((Long) strategy.copy(LocatorUtils.property(locator, "commercial", sourceCommercial), sourceCommercial));
                            copy.setCommercial(copyCommercial);
                        } else {
                            copy.commercial = null;
                        }
                        if ((this.lot!= null)&&(!this.lot.isEmpty())) {
                            List<Feed.Projects.Project.Lots.Lot> sourceLot;
                            sourceLot = (((this.lot!= null)&&(!this.lot.isEmpty()))?this.getLot():null);
                            @SuppressWarnings("unchecked")
                            List<Feed.Projects.Project.Lots.Lot> copyLot = ((List<Feed.Projects.Project.Lots.Lot> ) strategy.copy(LocatorUtils.property(locator, "lot", sourceLot), sourceLot));
                            copy.lot = null;
                            if (copyLot!= null) {
                                List<Feed.Projects.Project.Lots.Lot> uniqueLotl = copy.getLot();
                                uniqueLotl.addAll(copyLot);
                            }
                        } else {
                            copy.lot = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Feed.Projects.Project.Lots();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                    if (!(object instanceof Feed.Projects.Project.Lots)) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Feed.Projects.Project.Lots that = ((Feed.Projects.Project.Lots) object);
                    {
                        Long lhsResidential;
                        lhsResidential = this.getResidential();
                        Long rhsResidential;
                        rhsResidential = that.getResidential();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "residential", lhsResidential), LocatorUtils.property(thatLocator, "residential", rhsResidential), lhsResidential, rhsResidential)) {
                            return false;
                        }
                    }
                    {
                        Long lhsCommercial;
                        lhsCommercial = this.getCommercial();
                        Long rhsCommercial;
                        rhsCommercial = that.getCommercial();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "commercial", lhsCommercial), LocatorUtils.property(thatLocator, "commercial", rhsCommercial), lhsCommercial, rhsCommercial)) {
                            return false;
                        }
                    }
                    {
                        List<Feed.Projects.Project.Lots.Lot> lhsLot;
                        lhsLot = (((this.lot!= null)&&(!this.lot.isEmpty()))?this.getLot():null);
                        List<Feed.Projects.Project.Lots.Lot> rhsLot;
                        rhsLot = (((that.lot!= null)&&(!that.lot.isEmpty()))?that.getLot():null);
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "lot", lhsLot), LocatorUtils.property(thatLocator, "lot", rhsLot), lhsLot, rhsLot)) {
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
                public static class Lot
                    implements Cloneable, CopyTo, Equals, ToString
                {

                    @XmlElement(name = "unique-id", required = true)
                    protected String uniqueId;
                    @XmlElement(name = "property-type", required = true)
                    @XmlSchemaType(name = "string")
                    protected PropertyTypeProject propertyType;
                    @XmlElement(required = true)
                    protected PriceType price;
                    @XmlElement(required = true)
                    protected SizeType size;
                    @XmlElement(type = String.class)
                    @XmlJavaTypeAdapter(Adapter10 .class)
                    @XmlSchemaType(name = "integer")
                    protected Integer rooms;
                    @XmlElement(required = true, type = String.class)
                    @XmlJavaTypeAdapter(Adapter2 .class)
                    @XmlSchemaType(name = "integer")
                    protected Long bathrooms;
                    @XmlElement(required = true)
                    protected FloorProject floor;
                    @XmlElement(required = true)
                    protected BoxProject garage;
                    @XmlElement(required = true)
                    protected String description;
                    @XmlElement(required = true)
                    protected String specification;
                    protected Feed.Projects.Project.Lots.Lot.Pictures pictures;
                    @XmlAttribute(name = "total")
                    @XmlJavaTypeAdapter(Adapter2 .class)
                    @XmlSchemaType(name = "integer")
                    protected Long total;
                    @XmlAttribute(name = "forsale")
                    @XmlJavaTypeAdapter(Adapter2 .class)
                    @XmlSchemaType(name = "integer")
                    protected Long forsale;

                    /**
                     * Gets the value of the uniqueId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
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
                    public Long getBathrooms() {
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
                    public void setBathrooms(Long value) {
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
                    public Long getTotal() {
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
                    public void setTotal(Long value) {
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
                    public Long getForsale() {
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
                    public void setForsale(Long value) {
                        this.forsale = value;
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
                            String theUniqueId;
                            theUniqueId = this.getUniqueId();
                            strategy.appendField(locator, this, "uniqueId", buffer, theUniqueId);
                        }
                        {
                            PropertyTypeProject thePropertyType;
                            thePropertyType = this.getPropertyType();
                            strategy.appendField(locator, this, "propertyType", buffer, thePropertyType);
                        }
                        {
                            PriceType thePrice;
                            thePrice = this.getPrice();
                            strategy.appendField(locator, this, "price", buffer, thePrice);
                        }
                        {
                            SizeType theSize;
                            theSize = this.getSize();
                            strategy.appendField(locator, this, "size", buffer, theSize);
                        }
                        {
                            Integer theRooms;
                            theRooms = this.getRooms();
                            strategy.appendField(locator, this, "rooms", buffer, theRooms);
                        }
                        {
                            Long theBathrooms;
                            theBathrooms = this.getBathrooms();
                            strategy.appendField(locator, this, "bathrooms", buffer, theBathrooms);
                        }
                        {
                            FloorProject theFloor;
                            theFloor = this.getFloor();
                            strategy.appendField(locator, this, "floor", buffer, theFloor);
                        }
                        {
                            BoxProject theGarage;
                            theGarage = this.getGarage();
                            strategy.appendField(locator, this, "garage", buffer, theGarage);
                        }
                        {
                            String theDescription;
                            theDescription = this.getDescription();
                            strategy.appendField(locator, this, "description", buffer, theDescription);
                        }
                        {
                            String theSpecification;
                            theSpecification = this.getSpecification();
                            strategy.appendField(locator, this, "specification", buffer, theSpecification);
                        }
                        {
                            Feed.Projects.Project.Lots.Lot.Pictures thePictures;
                            thePictures = this.getPictures();
                            strategy.appendField(locator, this, "pictures", buffer, thePictures);
                        }
                        {
                            Long theTotal;
                            theTotal = this.getTotal();
                            strategy.appendField(locator, this, "total", buffer, theTotal);
                        }
                        {
                            Long theForsale;
                            theForsale = this.getForsale();
                            strategy.appendField(locator, this, "forsale", buffer, theForsale);
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
                        if (draftCopy instanceof Feed.Projects.Project.Lots.Lot) {
                            final Feed.Projects.Project.Lots.Lot copy = ((Feed.Projects.Project.Lots.Lot) draftCopy);
                            if (this.uniqueId!= null) {
                                String sourceUniqueId;
                                sourceUniqueId = this.getUniqueId();
                                String copyUniqueId = ((String) strategy.copy(LocatorUtils.property(locator, "uniqueId", sourceUniqueId), sourceUniqueId));
                                copy.setUniqueId(copyUniqueId);
                            } else {
                                copy.uniqueId = null;
                            }
                            if (this.propertyType!= null) {
                                PropertyTypeProject sourcePropertyType;
                                sourcePropertyType = this.getPropertyType();
                                PropertyTypeProject copyPropertyType = ((PropertyTypeProject) strategy.copy(LocatorUtils.property(locator, "propertyType", sourcePropertyType), sourcePropertyType));
                                copy.setPropertyType(copyPropertyType);
                            } else {
                                copy.propertyType = null;
                            }
                            if (this.price!= null) {
                                PriceType sourcePrice;
                                sourcePrice = this.getPrice();
                                PriceType copyPrice = ((PriceType) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                                copy.setPrice(copyPrice);
                            } else {
                                copy.price = null;
                            }
                            if (this.size!= null) {
                                SizeType sourceSize;
                                sourceSize = this.getSize();
                                SizeType copySize = ((SizeType) strategy.copy(LocatorUtils.property(locator, "size", sourceSize), sourceSize));
                                copy.setSize(copySize);
                            } else {
                                copy.size = null;
                            }
                            if (this.rooms!= null) {
                                Integer sourceRooms;
                                sourceRooms = this.getRooms();
                                Integer copyRooms = ((Integer) strategy.copy(LocatorUtils.property(locator, "rooms", sourceRooms), sourceRooms));
                                copy.setRooms(copyRooms);
                            } else {
                                copy.rooms = null;
                            }
                            if (this.bathrooms!= null) {
                                Long sourceBathrooms;
                                sourceBathrooms = this.getBathrooms();
                                Long copyBathrooms = ((Long) strategy.copy(LocatorUtils.property(locator, "bathrooms", sourceBathrooms), sourceBathrooms));
                                copy.setBathrooms(copyBathrooms);
                            } else {
                                copy.bathrooms = null;
                            }
                            if (this.floor!= null) {
                                FloorProject sourceFloor;
                                sourceFloor = this.getFloor();
                                FloorProject copyFloor = ((FloorProject) strategy.copy(LocatorUtils.property(locator, "floor", sourceFloor), sourceFloor));
                                copy.setFloor(copyFloor);
                            } else {
                                copy.floor = null;
                            }
                            if (this.garage!= null) {
                                BoxProject sourceGarage;
                                sourceGarage = this.getGarage();
                                BoxProject copyGarage = ((BoxProject) strategy.copy(LocatorUtils.property(locator, "garage", sourceGarage), sourceGarage));
                                copy.setGarage(copyGarage);
                            } else {
                                copy.garage = null;
                            }
                            if (this.description!= null) {
                                String sourceDescription;
                                sourceDescription = this.getDescription();
                                String copyDescription = ((String) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription));
                                copy.setDescription(copyDescription);
                            } else {
                                copy.description = null;
                            }
                            if (this.specification!= null) {
                                String sourceSpecification;
                                sourceSpecification = this.getSpecification();
                                String copySpecification = ((String) strategy.copy(LocatorUtils.property(locator, "specification", sourceSpecification), sourceSpecification));
                                copy.setSpecification(copySpecification);
                            } else {
                                copy.specification = null;
                            }
                            if (this.pictures!= null) {
                                Feed.Projects.Project.Lots.Lot.Pictures sourcePictures;
                                sourcePictures = this.getPictures();
                                Feed.Projects.Project.Lots.Lot.Pictures copyPictures = ((Feed.Projects.Project.Lots.Lot.Pictures) strategy.copy(LocatorUtils.property(locator, "pictures", sourcePictures), sourcePictures));
                                copy.setPictures(copyPictures);
                            } else {
                                copy.pictures = null;
                            }
                            if (this.total!= null) {
                                Long sourceTotal;
                                sourceTotal = this.getTotal();
                                Long copyTotal = ((Long) strategy.copy(LocatorUtils.property(locator, "total", sourceTotal), sourceTotal));
                                copy.setTotal(copyTotal);
                            } else {
                                copy.total = null;
                            }
                            if (this.forsale!= null) {
                                Long sourceForsale;
                                sourceForsale = this.getForsale();
                                Long copyForsale = ((Long) strategy.copy(LocatorUtils.property(locator, "forsale", sourceForsale), sourceForsale));
                                copy.setForsale(copyForsale);
                            } else {
                                copy.forsale = null;
                            }
                        }
                        return draftCopy;
                    }

                    public Object createNewInstance() {
                        return new Feed.Projects.Project.Lots.Lot();
                    }

                    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                        if (!(object instanceof Feed.Projects.Project.Lots.Lot)) {
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
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "uniqueId", lhsUniqueId), LocatorUtils.property(thatLocator, "uniqueId", rhsUniqueId), lhsUniqueId, rhsUniqueId)) {
                                return false;
                            }
                        }
                        {
                            PropertyTypeProject lhsPropertyType;
                            lhsPropertyType = this.getPropertyType();
                            PropertyTypeProject rhsPropertyType;
                            rhsPropertyType = that.getPropertyType();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyType", lhsPropertyType), LocatorUtils.property(thatLocator, "propertyType", rhsPropertyType), lhsPropertyType, rhsPropertyType)) {
                                return false;
                            }
                        }
                        {
                            PriceType lhsPrice;
                            lhsPrice = this.getPrice();
                            PriceType rhsPrice;
                            rhsPrice = that.getPrice();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
                                return false;
                            }
                        }
                        {
                            SizeType lhsSize;
                            lhsSize = this.getSize();
                            SizeType rhsSize;
                            rhsSize = that.getSize();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize)) {
                                return false;
                            }
                        }
                        {
                            Integer lhsRooms;
                            lhsRooms = this.getRooms();
                            Integer rhsRooms;
                            rhsRooms = that.getRooms();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "rooms", lhsRooms), LocatorUtils.property(thatLocator, "rooms", rhsRooms), lhsRooms, rhsRooms)) {
                                return false;
                            }
                        }
                        {
                            Long lhsBathrooms;
                            lhsBathrooms = this.getBathrooms();
                            Long rhsBathrooms;
                            rhsBathrooms = that.getBathrooms();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "bathrooms", lhsBathrooms), LocatorUtils.property(thatLocator, "bathrooms", rhsBathrooms), lhsBathrooms, rhsBathrooms)) {
                                return false;
                            }
                        }
                        {
                            FloorProject lhsFloor;
                            lhsFloor = this.getFloor();
                            FloorProject rhsFloor;
                            rhsFloor = that.getFloor();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor)) {
                                return false;
                            }
                        }
                        {
                            BoxProject lhsGarage;
                            lhsGarage = this.getGarage();
                            BoxProject rhsGarage;
                            rhsGarage = that.getGarage();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "garage", lhsGarage), LocatorUtils.property(thatLocator, "garage", rhsGarage), lhsGarage, rhsGarage)) {
                                return false;
                            }
                        }
                        {
                            String lhsDescription;
                            lhsDescription = this.getDescription();
                            String rhsDescription;
                            rhsDescription = that.getDescription();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                                return false;
                            }
                        }
                        {
                            String lhsSpecification;
                            lhsSpecification = this.getSpecification();
                            String rhsSpecification;
                            rhsSpecification = that.getSpecification();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "specification", lhsSpecification), LocatorUtils.property(thatLocator, "specification", rhsSpecification), lhsSpecification, rhsSpecification)) {
                                return false;
                            }
                        }
                        {
                            Feed.Projects.Project.Lots.Lot.Pictures lhsPictures;
                            lhsPictures = this.getPictures();
                            Feed.Projects.Project.Lots.Lot.Pictures rhsPictures;
                            rhsPictures = that.getPictures();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "pictures", lhsPictures), LocatorUtils.property(thatLocator, "pictures", rhsPictures), lhsPictures, rhsPictures)) {
                                return false;
                            }
                        }
                        {
                            Long lhsTotal;
                            lhsTotal = this.getTotal();
                            Long rhsTotal;
                            rhsTotal = that.getTotal();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "total", lhsTotal), LocatorUtils.property(thatLocator, "total", rhsTotal), lhsTotal, rhsTotal)) {
                                return false;
                            }
                        }
                        {
                            Long lhsForsale;
                            lhsForsale = this.getForsale();
                            Long rhsForsale;
                            rhsForsale = that.getForsale();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "forsale", lhsForsale), LocatorUtils.property(thatLocator, "forsale", rhsForsale), lhsForsale, rhsForsale)) {
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
                    public static class Pictures
                        implements Cloneable, CopyTo, Equals, ToString
                    {

                        @XmlElement(name = "picture-url", required = true)
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
                        public List<PictureProject> getPictureUrl() {
                            if (pictureUrl == null) {
                                pictureUrl = new ArrayList<PictureProject>();
                            }
                            return this.pictureUrl;
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
                                List<PictureProject> thePictureUrl;
                                thePictureUrl = (((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty()))?this.getPictureUrl():null);
                                strategy.appendField(locator, this, "pictureUrl", buffer, thePictureUrl);
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
                            if (draftCopy instanceof Feed.Projects.Project.Lots.Lot.Pictures) {
                                final Feed.Projects.Project.Lots.Lot.Pictures copy = ((Feed.Projects.Project.Lots.Lot.Pictures) draftCopy);
                                if ((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty())) {
                                    List<PictureProject> sourcePictureUrl;
                                    sourcePictureUrl = (((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty()))?this.getPictureUrl():null);
                                    @SuppressWarnings("unchecked")
                                    List<PictureProject> copyPictureUrl = ((List<PictureProject> ) strategy.copy(LocatorUtils.property(locator, "pictureUrl", sourcePictureUrl), sourcePictureUrl));
                                    copy.pictureUrl = null;
                                    if (copyPictureUrl!= null) {
                                        List<PictureProject> uniquePictureUrll = copy.getPictureUrl();
                                        uniquePictureUrll.addAll(copyPictureUrl);
                                    }
                                } else {
                                    copy.pictureUrl = null;
                                }
                            }
                            return draftCopy;
                        }

                        public Object createNewInstance() {
                            return new Feed.Projects.Project.Lots.Lot.Pictures();
                        }

                        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                            if (!(object instanceof Feed.Projects.Project.Lots.Lot.Pictures)) {
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
                                if (!strategy.equals(LocatorUtils.property(thisLocator, "pictureUrl", lhsPictureUrl), LocatorUtils.property(thatLocator, "pictureUrl", rhsPictureUrl), lhsPictureUrl, rhsPictureUrl)) {
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
            public static class Pictures
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlElement(name = "picture-url", required = true)
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
                public List<PictureProject> getPictureUrl() {
                    if (pictureUrl == null) {
                        pictureUrl = new ArrayList<PictureProject>();
                    }
                    return this.pictureUrl;
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
                        List<PictureProject> thePictureUrl;
                        thePictureUrl = (((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty()))?this.getPictureUrl():null);
                        strategy.appendField(locator, this, "pictureUrl", buffer, thePictureUrl);
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
                    if (draftCopy instanceof Feed.Projects.Project.Pictures) {
                        final Feed.Projects.Project.Pictures copy = ((Feed.Projects.Project.Pictures) draftCopy);
                        if ((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty())) {
                            List<PictureProject> sourcePictureUrl;
                            sourcePictureUrl = (((this.pictureUrl!= null)&&(!this.pictureUrl.isEmpty()))?this.getPictureUrl():null);
                            @SuppressWarnings("unchecked")
                            List<PictureProject> copyPictureUrl = ((List<PictureProject> ) strategy.copy(LocatorUtils.property(locator, "pictureUrl", sourcePictureUrl), sourcePictureUrl));
                            copy.pictureUrl = null;
                            if (copyPictureUrl!= null) {
                                List<PictureProject> uniquePictureUrll = copy.getPictureUrl();
                                uniquePictureUrll.addAll(copyPictureUrl);
                            }
                        } else {
                            copy.pictureUrl = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Feed.Projects.Project.Pictures();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                    if (!(object instanceof Feed.Projects.Project.Pictures)) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "pictureUrl", lhsPictureUrl), LocatorUtils.property(thatLocator, "pictureUrl", rhsPictureUrl), lhsPictureUrl, rhsPictureUrl)) {
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
            public static class Videos
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlElement(required = true)
                protected VideoProject video;

                /**
                 * Gets the value of the video property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link VideoProject }
                 *     
                 */
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
                public void setVideo(VideoProject value) {
                    this.video = value;
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
                        VideoProject theVideo;
                        theVideo = this.getVideo();
                        strategy.appendField(locator, this, "video", buffer, theVideo);
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
                    if (draftCopy instanceof Feed.Projects.Project.Videos) {
                        final Feed.Projects.Project.Videos copy = ((Feed.Projects.Project.Videos) draftCopy);
                        if (this.video!= null) {
                            VideoProject sourceVideo;
                            sourceVideo = this.getVideo();
                            VideoProject copyVideo = ((VideoProject) strategy.copy(LocatorUtils.property(locator, "video", sourceVideo), sourceVideo));
                            copy.setVideo(copyVideo);
                        } else {
                            copy.video = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Feed.Projects.Project.Videos();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                    if (!(object instanceof Feed.Projects.Project.Videos)) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "video", lhsVideo), LocatorUtils.property(thatLocator, "video", rhsVideo), lhsVideo, rhsVideo)) {
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
    public static class Properties
        implements Cloneable, CopyTo, Equals, ToString
    {

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
        public List<Feed.Properties.Property> getProperty() {
            if (property == null) {
                property = new ArrayList<Feed.Properties.Property>();
            }
            return this.property;
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
                List<Feed.Properties.Property> theProperty;
                theProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
                strategy.appendField(locator, this, "property", buffer, theProperty);
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
            if (draftCopy instanceof Feed.Properties) {
                final Feed.Properties copy = ((Feed.Properties) draftCopy);
                if ((this.property!= null)&&(!this.property.isEmpty())) {
                    List<Feed.Properties.Property> sourceProperty;
                    sourceProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
                    @SuppressWarnings("unchecked")
                    List<Feed.Properties.Property> copyProperty = ((List<Feed.Properties.Property> ) strategy.copy(LocatorUtils.property(locator, "property", sourceProperty), sourceProperty));
                    copy.property = null;
                    if (copyProperty!= null) {
                        List<Feed.Properties.Property> uniquePropertyl = copy.getProperty();
                        uniquePropertyl.addAll(copyProperty);
                    }
                } else {
                    copy.property = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new Feed.Properties();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof Feed.Properties)) {
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
                if (!strategy.equals(LocatorUtils.property(thisLocator, "property", lhsProperty), LocatorUtils.property(thatLocator, "property", rhsProperty), lhsProperty, rhsProperty)) {
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
        public static class Property
            implements Cloneable, CopyTo, Equals, ToString
        {

            @XmlElement(name = "unique-id", required = true)
            protected String uniqueId;
            @XmlElement(name = "date-updated", required = true, type = String.class)
            @XmlJavaTypeAdapter(Adapter3 .class)
            @XmlSchemaType(name = "dateTime")
            protected Calendar dateUpdated;
            @XmlElement(name = "date-expiration", type = String.class)
            @XmlJavaTypeAdapter(Adapter22 .class)
            protected Calendar dateExpiration;
            @XmlElement(name = "transaction-type", required = true)
            protected TransactionType transactionType;
            protected Building building;
            @XmlElement(type = String.class)
            @XmlJavaTypeAdapter(Adapter5 .class)
            protected Category category;
            @XmlElement(name = "property-type")
            protected Proptype propertyType;
            @XmlElement(name = "building-status")
            @XmlSchemaType(name = "string")
            protected Status buildingStatus;
            @XmlElement(required = true)
            protected Feed.Properties.Property.Agent agent;
            @XmlElement(required = true)
            protected LocationStructure location;
            @XmlElement(required = true)
            protected Feed.Properties.Property.Features features;
            @XmlElement(name = "extra-features")
            protected Feed.Properties.Property.ExtraFeatures extraFeatures;
            protected Feed.Properties.Property.Pictures pictures;
            protected Feed.Properties.Property.Blueprints blueprints;
            protected Feed.Properties.Property.Videos videos;
            @XmlAttribute(name = "operation")
            protected Operation operation;

            /**
             * Gets the value of the uniqueId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
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
            public void setOperation(Operation value) {
                this.operation = value;
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
                    String theUniqueId;
                    theUniqueId = this.getUniqueId();
                    strategy.appendField(locator, this, "uniqueId", buffer, theUniqueId);
                }
                {
                    Calendar theDateUpdated;
                    theDateUpdated = this.getDateUpdated();
                    strategy.appendField(locator, this, "dateUpdated", buffer, theDateUpdated);
                }
                {
                    Calendar theDateExpiration;
                    theDateExpiration = this.getDateExpiration();
                    strategy.appendField(locator, this, "dateExpiration", buffer, theDateExpiration);
                }
                {
                    TransactionType theTransactionType;
                    theTransactionType = this.getTransactionType();
                    strategy.appendField(locator, this, "transactionType", buffer, theTransactionType);
                }
                {
                    Building theBuilding;
                    theBuilding = this.getBuilding();
                    strategy.appendField(locator, this, "building", buffer, theBuilding);
                }
                {
                    Category theCategory;
                    theCategory = this.getCategory();
                    strategy.appendField(locator, this, "category", buffer, theCategory);
                }
                {
                    Proptype thePropertyType;
                    thePropertyType = this.getPropertyType();
                    strategy.appendField(locator, this, "propertyType", buffer, thePropertyType);
                }
                {
                    Status theBuildingStatus;
                    theBuildingStatus = this.getBuildingStatus();
                    strategy.appendField(locator, this, "buildingStatus", buffer, theBuildingStatus);
                }
                {
                    Feed.Properties.Property.Agent theAgent;
                    theAgent = this.getAgent();
                    strategy.appendField(locator, this, "agent", buffer, theAgent);
                }
                {
                    LocationStructure theLocation;
                    theLocation = this.getLocation();
                    strategy.appendField(locator, this, "location", buffer, theLocation);
                }
                {
                    Feed.Properties.Property.Features theFeatures;
                    theFeatures = this.getFeatures();
                    strategy.appendField(locator, this, "features", buffer, theFeatures);
                }
                {
                    Feed.Properties.Property.ExtraFeatures theExtraFeatures;
                    theExtraFeatures = this.getExtraFeatures();
                    strategy.appendField(locator, this, "extraFeatures", buffer, theExtraFeatures);
                }
                {
                    Feed.Properties.Property.Pictures thePictures;
                    thePictures = this.getPictures();
                    strategy.appendField(locator, this, "pictures", buffer, thePictures);
                }
                {
                    Feed.Properties.Property.Blueprints theBlueprints;
                    theBlueprints = this.getBlueprints();
                    strategy.appendField(locator, this, "blueprints", buffer, theBlueprints);
                }
                {
                    Feed.Properties.Property.Videos theVideos;
                    theVideos = this.getVideos();
                    strategy.appendField(locator, this, "videos", buffer, theVideos);
                }
                {
                    Operation theOperation;
                    theOperation = this.getOperation();
                    strategy.appendField(locator, this, "operation", buffer, theOperation);
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
                if (draftCopy instanceof Feed.Properties.Property) {
                    final Feed.Properties.Property copy = ((Feed.Properties.Property) draftCopy);
                    if (this.uniqueId!= null) {
                        String sourceUniqueId;
                        sourceUniqueId = this.getUniqueId();
                        String copyUniqueId = ((String) strategy.copy(LocatorUtils.property(locator, "uniqueId", sourceUniqueId), sourceUniqueId));
                        copy.setUniqueId(copyUniqueId);
                    } else {
                        copy.uniqueId = null;
                    }
                    if (this.dateUpdated!= null) {
                        Calendar sourceDateUpdated;
                        sourceDateUpdated = this.getDateUpdated();
                        Calendar copyDateUpdated = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateUpdated", sourceDateUpdated), sourceDateUpdated));
                        copy.setDateUpdated(copyDateUpdated);
                    } else {
                        copy.dateUpdated = null;
                    }
                    if (this.dateExpiration!= null) {
                        Calendar sourceDateExpiration;
                        sourceDateExpiration = this.getDateExpiration();
                        Calendar copyDateExpiration = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateExpiration", sourceDateExpiration), sourceDateExpiration));
                        copy.setDateExpiration(copyDateExpiration);
                    } else {
                        copy.dateExpiration = null;
                    }
                    if (this.transactionType!= null) {
                        TransactionType sourceTransactionType;
                        sourceTransactionType = this.getTransactionType();
                        TransactionType copyTransactionType = ((TransactionType) strategy.copy(LocatorUtils.property(locator, "transactionType", sourceTransactionType), sourceTransactionType));
                        copy.setTransactionType(copyTransactionType);
                    } else {
                        copy.transactionType = null;
                    }
                    if (this.building!= null) {
                        Building sourceBuilding;
                        sourceBuilding = this.getBuilding();
                        Building copyBuilding = ((Building) strategy.copy(LocatorUtils.property(locator, "building", sourceBuilding), sourceBuilding));
                        copy.setBuilding(copyBuilding);
                    } else {
                        copy.building = null;
                    }
                    if (this.category!= null) {
                        Category sourceCategory;
                        sourceCategory = this.getCategory();
                        Category copyCategory = ((Category) strategy.copy(LocatorUtils.property(locator, "category", sourceCategory), sourceCategory));
                        copy.setCategory(copyCategory);
                    } else {
                        copy.category = null;
                    }
                    if (this.propertyType!= null) {
                        Proptype sourcePropertyType;
                        sourcePropertyType = this.getPropertyType();
                        Proptype copyPropertyType = ((Proptype) strategy.copy(LocatorUtils.property(locator, "propertyType", sourcePropertyType), sourcePropertyType));
                        copy.setPropertyType(copyPropertyType);
                    } else {
                        copy.propertyType = null;
                    }
                    if (this.buildingStatus!= null) {
                        Status sourceBuildingStatus;
                        sourceBuildingStatus = this.getBuildingStatus();
                        Status copyBuildingStatus = ((Status) strategy.copy(LocatorUtils.property(locator, "buildingStatus", sourceBuildingStatus), sourceBuildingStatus));
                        copy.setBuildingStatus(copyBuildingStatus);
                    } else {
                        copy.buildingStatus = null;
                    }
                    if (this.agent!= null) {
                        Feed.Properties.Property.Agent sourceAgent;
                        sourceAgent = this.getAgent();
                        Feed.Properties.Property.Agent copyAgent = ((Feed.Properties.Property.Agent) strategy.copy(LocatorUtils.property(locator, "agent", sourceAgent), sourceAgent));
                        copy.setAgent(copyAgent);
                    } else {
                        copy.agent = null;
                    }
                    if (this.location!= null) {
                        LocationStructure sourceLocation;
                        sourceLocation = this.getLocation();
                        LocationStructure copyLocation = ((LocationStructure) strategy.copy(LocatorUtils.property(locator, "location", sourceLocation), sourceLocation));
                        copy.setLocation(copyLocation);
                    } else {
                        copy.location = null;
                    }
                    if (this.features!= null) {
                        Feed.Properties.Property.Features sourceFeatures;
                        sourceFeatures = this.getFeatures();
                        Feed.Properties.Property.Features copyFeatures = ((Feed.Properties.Property.Features) strategy.copy(LocatorUtils.property(locator, "features", sourceFeatures), sourceFeatures));
                        copy.setFeatures(copyFeatures);
                    } else {
                        copy.features = null;
                    }
                    if (this.extraFeatures!= null) {
                        Feed.Properties.Property.ExtraFeatures sourceExtraFeatures;
                        sourceExtraFeatures = this.getExtraFeatures();
                        Feed.Properties.Property.ExtraFeatures copyExtraFeatures = ((Feed.Properties.Property.ExtraFeatures) strategy.copy(LocatorUtils.property(locator, "extraFeatures", sourceExtraFeatures), sourceExtraFeatures));
                        copy.setExtraFeatures(copyExtraFeatures);
                    } else {
                        copy.extraFeatures = null;
                    }
                    if (this.pictures!= null) {
                        Feed.Properties.Property.Pictures sourcePictures;
                        sourcePictures = this.getPictures();
                        Feed.Properties.Property.Pictures copyPictures = ((Feed.Properties.Property.Pictures) strategy.copy(LocatorUtils.property(locator, "pictures", sourcePictures), sourcePictures));
                        copy.setPictures(copyPictures);
                    } else {
                        copy.pictures = null;
                    }
                    if (this.blueprints!= null) {
                        Feed.Properties.Property.Blueprints sourceBlueprints;
                        sourceBlueprints = this.getBlueprints();
                        Feed.Properties.Property.Blueprints copyBlueprints = ((Feed.Properties.Property.Blueprints) strategy.copy(LocatorUtils.property(locator, "blueprints", sourceBlueprints), sourceBlueprints));
                        copy.setBlueprints(copyBlueprints);
                    } else {
                        copy.blueprints = null;
                    }
                    if (this.videos!= null) {
                        Feed.Properties.Property.Videos sourceVideos;
                        sourceVideos = this.getVideos();
                        Feed.Properties.Property.Videos copyVideos = ((Feed.Properties.Property.Videos) strategy.copy(LocatorUtils.property(locator, "videos", sourceVideos), sourceVideos));
                        copy.setVideos(copyVideos);
                    } else {
                        copy.videos = null;
                    }
                    if (this.operation!= null) {
                        Operation sourceOperation;
                        sourceOperation = this.getOperation();
                        Operation copyOperation = ((Operation) strategy.copy(LocatorUtils.property(locator, "operation", sourceOperation), sourceOperation));
                        copy.setOperation(copyOperation);
                    } else {
                        copy.operation = null;
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new Feed.Properties.Property();
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                if (!(object instanceof Feed.Properties.Property)) {
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
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "uniqueId", lhsUniqueId), LocatorUtils.property(thatLocator, "uniqueId", rhsUniqueId), lhsUniqueId, rhsUniqueId)) {
                        return false;
                    }
                }
                {
                    Calendar lhsDateUpdated;
                    lhsDateUpdated = this.getDateUpdated();
                    Calendar rhsDateUpdated;
                    rhsDateUpdated = that.getDateUpdated();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "dateUpdated", lhsDateUpdated), LocatorUtils.property(thatLocator, "dateUpdated", rhsDateUpdated), lhsDateUpdated, rhsDateUpdated)) {
                        return false;
                    }
                }
                {
                    Calendar lhsDateExpiration;
                    lhsDateExpiration = this.getDateExpiration();
                    Calendar rhsDateExpiration;
                    rhsDateExpiration = that.getDateExpiration();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "dateExpiration", lhsDateExpiration), LocatorUtils.property(thatLocator, "dateExpiration", rhsDateExpiration), lhsDateExpiration, rhsDateExpiration)) {
                        return false;
                    }
                }
                {
                    TransactionType lhsTransactionType;
                    lhsTransactionType = this.getTransactionType();
                    TransactionType rhsTransactionType;
                    rhsTransactionType = that.getTransactionType();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionType", lhsTransactionType), LocatorUtils.property(thatLocator, "transactionType", rhsTransactionType), lhsTransactionType, rhsTransactionType)) {
                        return false;
                    }
                }
                {
                    Building lhsBuilding;
                    lhsBuilding = this.getBuilding();
                    Building rhsBuilding;
                    rhsBuilding = that.getBuilding();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "building", lhsBuilding), LocatorUtils.property(thatLocator, "building", rhsBuilding), lhsBuilding, rhsBuilding)) {
                        return false;
                    }
                }
                {
                    Category lhsCategory;
                    lhsCategory = this.getCategory();
                    Category rhsCategory;
                    rhsCategory = that.getCategory();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory)) {
                        return false;
                    }
                }
                {
                    Proptype lhsPropertyType;
                    lhsPropertyType = this.getPropertyType();
                    Proptype rhsPropertyType;
                    rhsPropertyType = that.getPropertyType();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyType", lhsPropertyType), LocatorUtils.property(thatLocator, "propertyType", rhsPropertyType), lhsPropertyType, rhsPropertyType)) {
                        return false;
                    }
                }
                {
                    Status lhsBuildingStatus;
                    lhsBuildingStatus = this.getBuildingStatus();
                    Status rhsBuildingStatus;
                    rhsBuildingStatus = that.getBuildingStatus();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingStatus", lhsBuildingStatus), LocatorUtils.property(thatLocator, "buildingStatus", rhsBuildingStatus), lhsBuildingStatus, rhsBuildingStatus)) {
                        return false;
                    }
                }
                {
                    Feed.Properties.Property.Agent lhsAgent;
                    lhsAgent = this.getAgent();
                    Feed.Properties.Property.Agent rhsAgent;
                    rhsAgent = that.getAgent();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "agent", lhsAgent), LocatorUtils.property(thatLocator, "agent", rhsAgent), lhsAgent, rhsAgent)) {
                        return false;
                    }
                }
                {
                    LocationStructure lhsLocation;
                    lhsLocation = this.getLocation();
                    LocationStructure rhsLocation;
                    rhsLocation = that.getLocation();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation)) {
                        return false;
                    }
                }
                {
                    Feed.Properties.Property.Features lhsFeatures;
                    lhsFeatures = this.getFeatures();
                    Feed.Properties.Property.Features rhsFeatures;
                    rhsFeatures = that.getFeatures();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "features", lhsFeatures), LocatorUtils.property(thatLocator, "features", rhsFeatures), lhsFeatures, rhsFeatures)) {
                        return false;
                    }
                }
                {
                    Feed.Properties.Property.ExtraFeatures lhsExtraFeatures;
                    lhsExtraFeatures = this.getExtraFeatures();
                    Feed.Properties.Property.ExtraFeatures rhsExtraFeatures;
                    rhsExtraFeatures = that.getExtraFeatures();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "extraFeatures", lhsExtraFeatures), LocatorUtils.property(thatLocator, "extraFeatures", rhsExtraFeatures), lhsExtraFeatures, rhsExtraFeatures)) {
                        return false;
                    }
                }
                {
                    Feed.Properties.Property.Pictures lhsPictures;
                    lhsPictures = this.getPictures();
                    Feed.Properties.Property.Pictures rhsPictures;
                    rhsPictures = that.getPictures();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "pictures", lhsPictures), LocatorUtils.property(thatLocator, "pictures", rhsPictures), lhsPictures, rhsPictures)) {
                        return false;
                    }
                }
                {
                    Feed.Properties.Property.Blueprints lhsBlueprints;
                    lhsBlueprints = this.getBlueprints();
                    Feed.Properties.Property.Blueprints rhsBlueprints;
                    rhsBlueprints = that.getBlueprints();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "blueprints", lhsBlueprints), LocatorUtils.property(thatLocator, "blueprints", rhsBlueprints), lhsBlueprints, rhsBlueprints)) {
                        return false;
                    }
                }
                {
                    Feed.Properties.Property.Videos lhsVideos;
                    lhsVideos = this.getVideos();
                    Feed.Properties.Property.Videos rhsVideos;
                    rhsVideos = that.getVideos();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "videos", lhsVideos), LocatorUtils.property(thatLocator, "videos", rhsVideos), lhsVideos, rhsVideos)) {
                        return false;
                    }
                }
                {
                    Operation lhsOperation;
                    lhsOperation = this.getOperation();
                    Operation rhsOperation;
                    rhsOperation = that.getOperation();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "operation", lhsOperation), LocatorUtils.property(thatLocator, "operation", rhsOperation), lhsOperation, rhsOperation)) {
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
            public static class Agent
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlElement(name = "office-name")
                protected String officeName;
                @XmlElement(required = true)
                @XmlJavaTypeAdapter(Adapter4 .class)
                protected String email;

                /**
                 * Gets the value of the officeName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
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
                public void setEmail(String value) {
                    this.email = value;
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
                        String theOfficeName;
                        theOfficeName = this.getOfficeName();
                        strategy.appendField(locator, this, "officeName", buffer, theOfficeName);
                    }
                    {
                        String theEmail;
                        theEmail = this.getEmail();
                        strategy.appendField(locator, this, "email", buffer, theEmail);
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
                    if (draftCopy instanceof Feed.Properties.Property.Agent) {
                        final Feed.Properties.Property.Agent copy = ((Feed.Properties.Property.Agent) draftCopy);
                        if (this.officeName!= null) {
                            String sourceOfficeName;
                            sourceOfficeName = this.getOfficeName();
                            String copyOfficeName = ((String) strategy.copy(LocatorUtils.property(locator, "officeName", sourceOfficeName), sourceOfficeName));
                            copy.setOfficeName(copyOfficeName);
                        } else {
                            copy.officeName = null;
                        }
                        if (this.email!= null) {
                            String sourceEmail;
                            sourceEmail = this.getEmail();
                            String copyEmail = ((String) strategy.copy(LocatorUtils.property(locator, "email", sourceEmail), sourceEmail));
                            copy.setEmail(copyEmail);
                        } else {
                            copy.email = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Feed.Properties.Property.Agent();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                    if (!(object instanceof Feed.Properties.Property.Agent)) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "officeName", lhsOfficeName), LocatorUtils.property(thatLocator, "officeName", rhsOfficeName), lhsOfficeName, rhsOfficeName)) {
                            return false;
                        }
                    }
                    {
                        String lhsEmail;
                        lhsEmail = this.getEmail();
                        String rhsEmail;
                        rhsEmail = that.getEmail();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail)) {
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
            public static class Blueprints
                implements Cloneable, CopyTo, Equals, ToString
            {

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
                public List<PictureExtended> getBlueprint() {
                    if (blueprint == null) {
                        blueprint = new ArrayList<PictureExtended>();
                    }
                    return this.blueprint;
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
                        List<PictureExtended> theBlueprint;
                        theBlueprint = (((this.blueprint!= null)&&(!this.blueprint.isEmpty()))?this.getBlueprint():null);
                        strategy.appendField(locator, this, "blueprint", buffer, theBlueprint);
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
                    if (draftCopy instanceof Feed.Properties.Property.Blueprints) {
                        final Feed.Properties.Property.Blueprints copy = ((Feed.Properties.Property.Blueprints) draftCopy);
                        if ((this.blueprint!= null)&&(!this.blueprint.isEmpty())) {
                            List<PictureExtended> sourceBlueprint;
                            sourceBlueprint = (((this.blueprint!= null)&&(!this.blueprint.isEmpty()))?this.getBlueprint():null);
                            @SuppressWarnings("unchecked")
                            List<PictureExtended> copyBlueprint = ((List<PictureExtended> ) strategy.copy(LocatorUtils.property(locator, "blueprint", sourceBlueprint), sourceBlueprint));
                            copy.blueprint = null;
                            if (copyBlueprint!= null) {
                                List<PictureExtended> uniqueBlueprintl = copy.getBlueprint();
                                uniqueBlueprintl.addAll(copyBlueprint);
                            }
                        } else {
                            copy.blueprint = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Feed.Properties.Property.Blueprints();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                    if (!(object instanceof Feed.Properties.Property.Blueprints)) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "blueprint", lhsBlueprint), LocatorUtils.property(thatLocator, "blueprint", rhsBlueprint), lhsBlueprint, rhsBlueprint)) {
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
            public static class ExtraFeatures
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlElement(type = String.class)
                @XmlJavaTypeAdapter(Adapter2 .class)
                @XmlSchemaType(name = "integer")
                protected Long bedrooms;
                @XmlElement(type = String.class)
                @XmlJavaTypeAdapter(Adapter2 .class)
                @XmlSchemaType(name = "integer")
                protected Long bathrooms;
                protected Box garage;
                @XmlSchemaType(name = "string")
                protected Kitchen kitchen;
                @XmlSchemaType(name = "string")
                protected Heat heating;
                @XmlSchemaType(name = "string")
                protected Garden garden;
                @XmlElement(type = String.class)
                @XmlJavaTypeAdapter(Adapter7 .class)
                protected Boolean terrace;
                @XmlElement(type = String.class)
                @XmlJavaTypeAdapter(Adapter7 .class)
                protected Boolean balcony;
                @XmlElement(type = String.class)
                @XmlJavaTypeAdapter(Adapter7 .class)
                protected Boolean elevator;
                @XmlElement(name = "air-conditioning", type = String.class)
                @XmlJavaTypeAdapter(Adapter7 .class)
                protected Boolean airConditioning;
                protected Floor floor;
                @XmlElement(name = "num-floors", type = String.class)
                @XmlJavaTypeAdapter(Adapter2 .class)
                @XmlSchemaType(name = "integer")
                protected Long numFloors;
                @XmlElement(name = "virtual-tour")
                protected String virtualTour;
                @XmlElement(name = "rent-contract")
                @XmlSchemaType(name = "string")
                protected Rental rentContract;
                @XmlElement(name = "additional-costs")
                protected AdditionalCostsType additionalCosts;
                @XmlSchemaType(name = "string")
                protected Furniture furniture;
                @XmlElement(name = "security-alarm", type = String.class)
                @XmlJavaTypeAdapter(Adapter7 .class)
                protected Boolean securityAlarm;
                @XmlElement(type = String.class)
                @XmlJavaTypeAdapter(Adapter7 .class)
                protected Boolean reception;
                @XmlElement(type = String.class)
                @XmlJavaTypeAdapter(Adapter7 .class)
                protected Boolean net;
                @XmlElement(name = "external-area")
                protected LandSizeType externalArea;
                @XmlElement(name = "build-year", type = String.class)
                @XmlJavaTypeAdapter(Adapter6 .class)
                @XmlSchemaType(name = "integer")
                protected Integer buildYear;
                @XmlElement(name = "free-conditions")
                protected String freeConditions;
                @XmlElement(name = "overhead-crane")
                @XmlSchemaType(name = "string")
                protected YesNoReady overheadCrane;
                @XmlElement(name = "beam-height", type = String.class)
                @XmlJavaTypeAdapter(Adapter2 .class)
                @XmlSchemaType(name = "integer")
                protected Long beamHeight;
                @XmlElement(name = "office-size")
                protected SizeType officeSize;
                @XmlElement(name = "floorplanner-url")
                protected String floorplannerUrl;
                @XmlElement(name = "doc-specification")
                protected String docSpecification;
                @XmlElement(name = "doc-description")
                protected String docDescription;

                /**
                 * Gets the value of the bedrooms property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public Long getBedrooms() {
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
                public void setBedrooms(Long value) {
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
                public Long getBathrooms() {
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
                public void setBathrooms(Long value) {
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
                public Boolean isTerrace() {
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
                public Boolean isBalcony() {
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
                public Boolean isElevator() {
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
                public Boolean isAirConditioning() {
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
                public Long getNumFloors() {
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
                public void setNumFloors(Long value) {
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
                public Boolean isSecurityAlarm() {
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
                public Boolean isReception() {
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
                public Boolean isNet() {
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
                public Long getBeamHeight() {
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
                public void setBeamHeight(Long value) {
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
                public void setDocDescription(String value) {
                    this.docDescription = value;
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
                        Long theBedrooms;
                        theBedrooms = this.getBedrooms();
                        strategy.appendField(locator, this, "bedrooms", buffer, theBedrooms);
                    }
                    {
                        Long theBathrooms;
                        theBathrooms = this.getBathrooms();
                        strategy.appendField(locator, this, "bathrooms", buffer, theBathrooms);
                    }
                    {
                        Box theGarage;
                        theGarage = this.getGarage();
                        strategy.appendField(locator, this, "garage", buffer, theGarage);
                    }
                    {
                        Kitchen theKitchen;
                        theKitchen = this.getKitchen();
                        strategy.appendField(locator, this, "kitchen", buffer, theKitchen);
                    }
                    {
                        Heat theHeating;
                        theHeating = this.getHeating();
                        strategy.appendField(locator, this, "heating", buffer, theHeating);
                    }
                    {
                        Garden theGarden;
                        theGarden = this.getGarden();
                        strategy.appendField(locator, this, "garden", buffer, theGarden);
                    }
                    {
                        Boolean theTerrace;
                        theTerrace = this.isTerrace();
                        strategy.appendField(locator, this, "terrace", buffer, theTerrace);
                    }
                    {
                        Boolean theBalcony;
                        theBalcony = this.isBalcony();
                        strategy.appendField(locator, this, "balcony", buffer, theBalcony);
                    }
                    {
                        Boolean theElevator;
                        theElevator = this.isElevator();
                        strategy.appendField(locator, this, "elevator", buffer, theElevator);
                    }
                    {
                        Boolean theAirConditioning;
                        theAirConditioning = this.isAirConditioning();
                        strategy.appendField(locator, this, "airConditioning", buffer, theAirConditioning);
                    }
                    {
                        Floor theFloor;
                        theFloor = this.getFloor();
                        strategy.appendField(locator, this, "floor", buffer, theFloor);
                    }
                    {
                        Long theNumFloors;
                        theNumFloors = this.getNumFloors();
                        strategy.appendField(locator, this, "numFloors", buffer, theNumFloors);
                    }
                    {
                        String theVirtualTour;
                        theVirtualTour = this.getVirtualTour();
                        strategy.appendField(locator, this, "virtualTour", buffer, theVirtualTour);
                    }
                    {
                        Rental theRentContract;
                        theRentContract = this.getRentContract();
                        strategy.appendField(locator, this, "rentContract", buffer, theRentContract);
                    }
                    {
                        AdditionalCostsType theAdditionalCosts;
                        theAdditionalCosts = this.getAdditionalCosts();
                        strategy.appendField(locator, this, "additionalCosts", buffer, theAdditionalCosts);
                    }
                    {
                        Furniture theFurniture;
                        theFurniture = this.getFurniture();
                        strategy.appendField(locator, this, "furniture", buffer, theFurniture);
                    }
                    {
                        Boolean theSecurityAlarm;
                        theSecurityAlarm = this.isSecurityAlarm();
                        strategy.appendField(locator, this, "securityAlarm", buffer, theSecurityAlarm);
                    }
                    {
                        Boolean theReception;
                        theReception = this.isReception();
                        strategy.appendField(locator, this, "reception", buffer, theReception);
                    }
                    {
                        Boolean theNet;
                        theNet = this.isNet();
                        strategy.appendField(locator, this, "net", buffer, theNet);
                    }
                    {
                        LandSizeType theExternalArea;
                        theExternalArea = this.getExternalArea();
                        strategy.appendField(locator, this, "externalArea", buffer, theExternalArea);
                    }
                    {
                        Integer theBuildYear;
                        theBuildYear = this.getBuildYear();
                        strategy.appendField(locator, this, "buildYear", buffer, theBuildYear);
                    }
                    {
                        String theFreeConditions;
                        theFreeConditions = this.getFreeConditions();
                        strategy.appendField(locator, this, "freeConditions", buffer, theFreeConditions);
                    }
                    {
                        YesNoReady theOverheadCrane;
                        theOverheadCrane = this.getOverheadCrane();
                        strategy.appendField(locator, this, "overheadCrane", buffer, theOverheadCrane);
                    }
                    {
                        Long theBeamHeight;
                        theBeamHeight = this.getBeamHeight();
                        strategy.appendField(locator, this, "beamHeight", buffer, theBeamHeight);
                    }
                    {
                        SizeType theOfficeSize;
                        theOfficeSize = this.getOfficeSize();
                        strategy.appendField(locator, this, "officeSize", buffer, theOfficeSize);
                    }
                    {
                        String theFloorplannerUrl;
                        theFloorplannerUrl = this.getFloorplannerUrl();
                        strategy.appendField(locator, this, "floorplannerUrl", buffer, theFloorplannerUrl);
                    }
                    {
                        String theDocSpecification;
                        theDocSpecification = this.getDocSpecification();
                        strategy.appendField(locator, this, "docSpecification", buffer, theDocSpecification);
                    }
                    {
                        String theDocDescription;
                        theDocDescription = this.getDocDescription();
                        strategy.appendField(locator, this, "docDescription", buffer, theDocDescription);
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
                    if (draftCopy instanceof Feed.Properties.Property.ExtraFeatures) {
                        final Feed.Properties.Property.ExtraFeatures copy = ((Feed.Properties.Property.ExtraFeatures) draftCopy);
                        if (this.bedrooms!= null) {
                            Long sourceBedrooms;
                            sourceBedrooms = this.getBedrooms();
                            Long copyBedrooms = ((Long) strategy.copy(LocatorUtils.property(locator, "bedrooms", sourceBedrooms), sourceBedrooms));
                            copy.setBedrooms(copyBedrooms);
                        } else {
                            copy.bedrooms = null;
                        }
                        if (this.bathrooms!= null) {
                            Long sourceBathrooms;
                            sourceBathrooms = this.getBathrooms();
                            Long copyBathrooms = ((Long) strategy.copy(LocatorUtils.property(locator, "bathrooms", sourceBathrooms), sourceBathrooms));
                            copy.setBathrooms(copyBathrooms);
                        } else {
                            copy.bathrooms = null;
                        }
                        if (this.garage!= null) {
                            Box sourceGarage;
                            sourceGarage = this.getGarage();
                            Box copyGarage = ((Box) strategy.copy(LocatorUtils.property(locator, "garage", sourceGarage), sourceGarage));
                            copy.setGarage(copyGarage);
                        } else {
                            copy.garage = null;
                        }
                        if (this.kitchen!= null) {
                            Kitchen sourceKitchen;
                            sourceKitchen = this.getKitchen();
                            Kitchen copyKitchen = ((Kitchen) strategy.copy(LocatorUtils.property(locator, "kitchen", sourceKitchen), sourceKitchen));
                            copy.setKitchen(copyKitchen);
                        } else {
                            copy.kitchen = null;
                        }
                        if (this.heating!= null) {
                            Heat sourceHeating;
                            sourceHeating = this.getHeating();
                            Heat copyHeating = ((Heat) strategy.copy(LocatorUtils.property(locator, "heating", sourceHeating), sourceHeating));
                            copy.setHeating(copyHeating);
                        } else {
                            copy.heating = null;
                        }
                        if (this.garden!= null) {
                            Garden sourceGarden;
                            sourceGarden = this.getGarden();
                            Garden copyGarden = ((Garden) strategy.copy(LocatorUtils.property(locator, "garden", sourceGarden), sourceGarden));
                            copy.setGarden(copyGarden);
                        } else {
                            copy.garden = null;
                        }
                        if (this.terrace!= null) {
                            Boolean sourceTerrace;
                            sourceTerrace = this.isTerrace();
                            Boolean copyTerrace = ((Boolean) strategy.copy(LocatorUtils.property(locator, "terrace", sourceTerrace), sourceTerrace));
                            copy.setTerrace(copyTerrace);
                        } else {
                            copy.terrace = null;
                        }
                        if (this.balcony!= null) {
                            Boolean sourceBalcony;
                            sourceBalcony = this.isBalcony();
                            Boolean copyBalcony = ((Boolean) strategy.copy(LocatorUtils.property(locator, "balcony", sourceBalcony), sourceBalcony));
                            copy.setBalcony(copyBalcony);
                        } else {
                            copy.balcony = null;
                        }
                        if (this.elevator!= null) {
                            Boolean sourceElevator;
                            sourceElevator = this.isElevator();
                            Boolean copyElevator = ((Boolean) strategy.copy(LocatorUtils.property(locator, "elevator", sourceElevator), sourceElevator));
                            copy.setElevator(copyElevator);
                        } else {
                            copy.elevator = null;
                        }
                        if (this.airConditioning!= null) {
                            Boolean sourceAirConditioning;
                            sourceAirConditioning = this.isAirConditioning();
                            Boolean copyAirConditioning = ((Boolean) strategy.copy(LocatorUtils.property(locator, "airConditioning", sourceAirConditioning), sourceAirConditioning));
                            copy.setAirConditioning(copyAirConditioning);
                        } else {
                            copy.airConditioning = null;
                        }
                        if (this.floor!= null) {
                            Floor sourceFloor;
                            sourceFloor = this.getFloor();
                            Floor copyFloor = ((Floor) strategy.copy(LocatorUtils.property(locator, "floor", sourceFloor), sourceFloor));
                            copy.setFloor(copyFloor);
                        } else {
                            copy.floor = null;
                        }
                        if (this.numFloors!= null) {
                            Long sourceNumFloors;
                            sourceNumFloors = this.getNumFloors();
                            Long copyNumFloors = ((Long) strategy.copy(LocatorUtils.property(locator, "numFloors", sourceNumFloors), sourceNumFloors));
                            copy.setNumFloors(copyNumFloors);
                        } else {
                            copy.numFloors = null;
                        }
                        if (this.virtualTour!= null) {
                            String sourceVirtualTour;
                            sourceVirtualTour = this.getVirtualTour();
                            String copyVirtualTour = ((String) strategy.copy(LocatorUtils.property(locator, "virtualTour", sourceVirtualTour), sourceVirtualTour));
                            copy.setVirtualTour(copyVirtualTour);
                        } else {
                            copy.virtualTour = null;
                        }
                        if (this.rentContract!= null) {
                            Rental sourceRentContract;
                            sourceRentContract = this.getRentContract();
                            Rental copyRentContract = ((Rental) strategy.copy(LocatorUtils.property(locator, "rentContract", sourceRentContract), sourceRentContract));
                            copy.setRentContract(copyRentContract);
                        } else {
                            copy.rentContract = null;
                        }
                        if (this.additionalCosts!= null) {
                            AdditionalCostsType sourceAdditionalCosts;
                            sourceAdditionalCosts = this.getAdditionalCosts();
                            AdditionalCostsType copyAdditionalCosts = ((AdditionalCostsType) strategy.copy(LocatorUtils.property(locator, "additionalCosts", sourceAdditionalCosts), sourceAdditionalCosts));
                            copy.setAdditionalCosts(copyAdditionalCosts);
                        } else {
                            copy.additionalCosts = null;
                        }
                        if (this.furniture!= null) {
                            Furniture sourceFurniture;
                            sourceFurniture = this.getFurniture();
                            Furniture copyFurniture = ((Furniture) strategy.copy(LocatorUtils.property(locator, "furniture", sourceFurniture), sourceFurniture));
                            copy.setFurniture(copyFurniture);
                        } else {
                            copy.furniture = null;
                        }
                        if (this.securityAlarm!= null) {
                            Boolean sourceSecurityAlarm;
                            sourceSecurityAlarm = this.isSecurityAlarm();
                            Boolean copySecurityAlarm = ((Boolean) strategy.copy(LocatorUtils.property(locator, "securityAlarm", sourceSecurityAlarm), sourceSecurityAlarm));
                            copy.setSecurityAlarm(copySecurityAlarm);
                        } else {
                            copy.securityAlarm = null;
                        }
                        if (this.reception!= null) {
                            Boolean sourceReception;
                            sourceReception = this.isReception();
                            Boolean copyReception = ((Boolean) strategy.copy(LocatorUtils.property(locator, "reception", sourceReception), sourceReception));
                            copy.setReception(copyReception);
                        } else {
                            copy.reception = null;
                        }
                        if (this.net!= null) {
                            Boolean sourceNet;
                            sourceNet = this.isNet();
                            Boolean copyNet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "net", sourceNet), sourceNet));
                            copy.setNet(copyNet);
                        } else {
                            copy.net = null;
                        }
                        if (this.externalArea!= null) {
                            LandSizeType sourceExternalArea;
                            sourceExternalArea = this.getExternalArea();
                            LandSizeType copyExternalArea = ((LandSizeType) strategy.copy(LocatorUtils.property(locator, "externalArea", sourceExternalArea), sourceExternalArea));
                            copy.setExternalArea(copyExternalArea);
                        } else {
                            copy.externalArea = null;
                        }
                        if (this.buildYear!= null) {
                            Integer sourceBuildYear;
                            sourceBuildYear = this.getBuildYear();
                            Integer copyBuildYear = ((Integer) strategy.copy(LocatorUtils.property(locator, "buildYear", sourceBuildYear), sourceBuildYear));
                            copy.setBuildYear(copyBuildYear);
                        } else {
                            copy.buildYear = null;
                        }
                        if (this.freeConditions!= null) {
                            String sourceFreeConditions;
                            sourceFreeConditions = this.getFreeConditions();
                            String copyFreeConditions = ((String) strategy.copy(LocatorUtils.property(locator, "freeConditions", sourceFreeConditions), sourceFreeConditions));
                            copy.setFreeConditions(copyFreeConditions);
                        } else {
                            copy.freeConditions = null;
                        }
                        if (this.overheadCrane!= null) {
                            YesNoReady sourceOverheadCrane;
                            sourceOverheadCrane = this.getOverheadCrane();
                            YesNoReady copyOverheadCrane = ((YesNoReady) strategy.copy(LocatorUtils.property(locator, "overheadCrane", sourceOverheadCrane), sourceOverheadCrane));
                            copy.setOverheadCrane(copyOverheadCrane);
                        } else {
                            copy.overheadCrane = null;
                        }
                        if (this.beamHeight!= null) {
                            Long sourceBeamHeight;
                            sourceBeamHeight = this.getBeamHeight();
                            Long copyBeamHeight = ((Long) strategy.copy(LocatorUtils.property(locator, "beamHeight", sourceBeamHeight), sourceBeamHeight));
                            copy.setBeamHeight(copyBeamHeight);
                        } else {
                            copy.beamHeight = null;
                        }
                        if (this.officeSize!= null) {
                            SizeType sourceOfficeSize;
                            sourceOfficeSize = this.getOfficeSize();
                            SizeType copyOfficeSize = ((SizeType) strategy.copy(LocatorUtils.property(locator, "officeSize", sourceOfficeSize), sourceOfficeSize));
                            copy.setOfficeSize(copyOfficeSize);
                        } else {
                            copy.officeSize = null;
                        }
                        if (this.floorplannerUrl!= null) {
                            String sourceFloorplannerUrl;
                            sourceFloorplannerUrl = this.getFloorplannerUrl();
                            String copyFloorplannerUrl = ((String) strategy.copy(LocatorUtils.property(locator, "floorplannerUrl", sourceFloorplannerUrl), sourceFloorplannerUrl));
                            copy.setFloorplannerUrl(copyFloorplannerUrl);
                        } else {
                            copy.floorplannerUrl = null;
                        }
                        if (this.docSpecification!= null) {
                            String sourceDocSpecification;
                            sourceDocSpecification = this.getDocSpecification();
                            String copyDocSpecification = ((String) strategy.copy(LocatorUtils.property(locator, "docSpecification", sourceDocSpecification), sourceDocSpecification));
                            copy.setDocSpecification(copyDocSpecification);
                        } else {
                            copy.docSpecification = null;
                        }
                        if (this.docDescription!= null) {
                            String sourceDocDescription;
                            sourceDocDescription = this.getDocDescription();
                            String copyDocDescription = ((String) strategy.copy(LocatorUtils.property(locator, "docDescription", sourceDocDescription), sourceDocDescription));
                            copy.setDocDescription(copyDocDescription);
                        } else {
                            copy.docDescription = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Feed.Properties.Property.ExtraFeatures();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                    if (!(object instanceof Feed.Properties.Property.ExtraFeatures)) {
                        return false;
                    }
                    if (this == object) {
                        return true;
                    }
                    final Feed.Properties.Property.ExtraFeatures that = ((Feed.Properties.Property.ExtraFeatures) object);
                    {
                        Long lhsBedrooms;
                        lhsBedrooms = this.getBedrooms();
                        Long rhsBedrooms;
                        rhsBedrooms = that.getBedrooms();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "bedrooms", lhsBedrooms), LocatorUtils.property(thatLocator, "bedrooms", rhsBedrooms), lhsBedrooms, rhsBedrooms)) {
                            return false;
                        }
                    }
                    {
                        Long lhsBathrooms;
                        lhsBathrooms = this.getBathrooms();
                        Long rhsBathrooms;
                        rhsBathrooms = that.getBathrooms();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "bathrooms", lhsBathrooms), LocatorUtils.property(thatLocator, "bathrooms", rhsBathrooms), lhsBathrooms, rhsBathrooms)) {
                            return false;
                        }
                    }
                    {
                        Box lhsGarage;
                        lhsGarage = this.getGarage();
                        Box rhsGarage;
                        rhsGarage = that.getGarage();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "garage", lhsGarage), LocatorUtils.property(thatLocator, "garage", rhsGarage), lhsGarage, rhsGarage)) {
                            return false;
                        }
                    }
                    {
                        Kitchen lhsKitchen;
                        lhsKitchen = this.getKitchen();
                        Kitchen rhsKitchen;
                        rhsKitchen = that.getKitchen();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "kitchen", lhsKitchen), LocatorUtils.property(thatLocator, "kitchen", rhsKitchen), lhsKitchen, rhsKitchen)) {
                            return false;
                        }
                    }
                    {
                        Heat lhsHeating;
                        lhsHeating = this.getHeating();
                        Heat rhsHeating;
                        rhsHeating = that.getHeating();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "heating", lhsHeating), LocatorUtils.property(thatLocator, "heating", rhsHeating), lhsHeating, rhsHeating)) {
                            return false;
                        }
                    }
                    {
                        Garden lhsGarden;
                        lhsGarden = this.getGarden();
                        Garden rhsGarden;
                        rhsGarden = that.getGarden();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "garden", lhsGarden), LocatorUtils.property(thatLocator, "garden", rhsGarden), lhsGarden, rhsGarden)) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsTerrace;
                        lhsTerrace = this.isTerrace();
                        Boolean rhsTerrace;
                        rhsTerrace = that.isTerrace();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "terrace", lhsTerrace), LocatorUtils.property(thatLocator, "terrace", rhsTerrace), lhsTerrace, rhsTerrace)) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsBalcony;
                        lhsBalcony = this.isBalcony();
                        Boolean rhsBalcony;
                        rhsBalcony = that.isBalcony();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "balcony", lhsBalcony), LocatorUtils.property(thatLocator, "balcony", rhsBalcony), lhsBalcony, rhsBalcony)) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsElevator;
                        lhsElevator = this.isElevator();
                        Boolean rhsElevator;
                        rhsElevator = that.isElevator();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "elevator", lhsElevator), LocatorUtils.property(thatLocator, "elevator", rhsElevator), lhsElevator, rhsElevator)) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsAirConditioning;
                        lhsAirConditioning = this.isAirConditioning();
                        Boolean rhsAirConditioning;
                        rhsAirConditioning = that.isAirConditioning();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "airConditioning", lhsAirConditioning), LocatorUtils.property(thatLocator, "airConditioning", rhsAirConditioning), lhsAirConditioning, rhsAirConditioning)) {
                            return false;
                        }
                    }
                    {
                        Floor lhsFloor;
                        lhsFloor = this.getFloor();
                        Floor rhsFloor;
                        rhsFloor = that.getFloor();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor)) {
                            return false;
                        }
                    }
                    {
                        Long lhsNumFloors;
                        lhsNumFloors = this.getNumFloors();
                        Long rhsNumFloors;
                        rhsNumFloors = that.getNumFloors();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "numFloors", lhsNumFloors), LocatorUtils.property(thatLocator, "numFloors", rhsNumFloors), lhsNumFloors, rhsNumFloors)) {
                            return false;
                        }
                    }
                    {
                        String lhsVirtualTour;
                        lhsVirtualTour = this.getVirtualTour();
                        String rhsVirtualTour;
                        rhsVirtualTour = that.getVirtualTour();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "virtualTour", lhsVirtualTour), LocatorUtils.property(thatLocator, "virtualTour", rhsVirtualTour), lhsVirtualTour, rhsVirtualTour)) {
                            return false;
                        }
                    }
                    {
                        Rental lhsRentContract;
                        lhsRentContract = this.getRentContract();
                        Rental rhsRentContract;
                        rhsRentContract = that.getRentContract();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "rentContract", lhsRentContract), LocatorUtils.property(thatLocator, "rentContract", rhsRentContract), lhsRentContract, rhsRentContract)) {
                            return false;
                        }
                    }
                    {
                        AdditionalCostsType lhsAdditionalCosts;
                        lhsAdditionalCosts = this.getAdditionalCosts();
                        AdditionalCostsType rhsAdditionalCosts;
                        rhsAdditionalCosts = that.getAdditionalCosts();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalCosts", lhsAdditionalCosts), LocatorUtils.property(thatLocator, "additionalCosts", rhsAdditionalCosts), lhsAdditionalCosts, rhsAdditionalCosts)) {
                            return false;
                        }
                    }
                    {
                        Furniture lhsFurniture;
                        lhsFurniture = this.getFurniture();
                        Furniture rhsFurniture;
                        rhsFurniture = that.getFurniture();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "furniture", lhsFurniture), LocatorUtils.property(thatLocator, "furniture", rhsFurniture), lhsFurniture, rhsFurniture)) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsSecurityAlarm;
                        lhsSecurityAlarm = this.isSecurityAlarm();
                        Boolean rhsSecurityAlarm;
                        rhsSecurityAlarm = that.isSecurityAlarm();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "securityAlarm", lhsSecurityAlarm), LocatorUtils.property(thatLocator, "securityAlarm", rhsSecurityAlarm), lhsSecurityAlarm, rhsSecurityAlarm)) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsReception;
                        lhsReception = this.isReception();
                        Boolean rhsReception;
                        rhsReception = that.isReception();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "reception", lhsReception), LocatorUtils.property(thatLocator, "reception", rhsReception), lhsReception, rhsReception)) {
                            return false;
                        }
                    }
                    {
                        Boolean lhsNet;
                        lhsNet = this.isNet();
                        Boolean rhsNet;
                        rhsNet = that.isNet();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "net", lhsNet), LocatorUtils.property(thatLocator, "net", rhsNet), lhsNet, rhsNet)) {
                            return false;
                        }
                    }
                    {
                        LandSizeType lhsExternalArea;
                        lhsExternalArea = this.getExternalArea();
                        LandSizeType rhsExternalArea;
                        rhsExternalArea = that.getExternalArea();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "externalArea", lhsExternalArea), LocatorUtils.property(thatLocator, "externalArea", rhsExternalArea), lhsExternalArea, rhsExternalArea)) {
                            return false;
                        }
                    }
                    {
                        Integer lhsBuildYear;
                        lhsBuildYear = this.getBuildYear();
                        Integer rhsBuildYear;
                        rhsBuildYear = that.getBuildYear();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "buildYear", lhsBuildYear), LocatorUtils.property(thatLocator, "buildYear", rhsBuildYear), lhsBuildYear, rhsBuildYear)) {
                            return false;
                        }
                    }
                    {
                        String lhsFreeConditions;
                        lhsFreeConditions = this.getFreeConditions();
                        String rhsFreeConditions;
                        rhsFreeConditions = that.getFreeConditions();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "freeConditions", lhsFreeConditions), LocatorUtils.property(thatLocator, "freeConditions", rhsFreeConditions), lhsFreeConditions, rhsFreeConditions)) {
                            return false;
                        }
                    }
                    {
                        YesNoReady lhsOverheadCrane;
                        lhsOverheadCrane = this.getOverheadCrane();
                        YesNoReady rhsOverheadCrane;
                        rhsOverheadCrane = that.getOverheadCrane();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "overheadCrane", lhsOverheadCrane), LocatorUtils.property(thatLocator, "overheadCrane", rhsOverheadCrane), lhsOverheadCrane, rhsOverheadCrane)) {
                            return false;
                        }
                    }
                    {
                        Long lhsBeamHeight;
                        lhsBeamHeight = this.getBeamHeight();
                        Long rhsBeamHeight;
                        rhsBeamHeight = that.getBeamHeight();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "beamHeight", lhsBeamHeight), LocatorUtils.property(thatLocator, "beamHeight", rhsBeamHeight), lhsBeamHeight, rhsBeamHeight)) {
                            return false;
                        }
                    }
                    {
                        SizeType lhsOfficeSize;
                        lhsOfficeSize = this.getOfficeSize();
                        SizeType rhsOfficeSize;
                        rhsOfficeSize = that.getOfficeSize();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "officeSize", lhsOfficeSize), LocatorUtils.property(thatLocator, "officeSize", rhsOfficeSize), lhsOfficeSize, rhsOfficeSize)) {
                            return false;
                        }
                    }
                    {
                        String lhsFloorplannerUrl;
                        lhsFloorplannerUrl = this.getFloorplannerUrl();
                        String rhsFloorplannerUrl;
                        rhsFloorplannerUrl = that.getFloorplannerUrl();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "floorplannerUrl", lhsFloorplannerUrl), LocatorUtils.property(thatLocator, "floorplannerUrl", rhsFloorplannerUrl), lhsFloorplannerUrl, rhsFloorplannerUrl)) {
                            return false;
                        }
                    }
                    {
                        String lhsDocSpecification;
                        lhsDocSpecification = this.getDocSpecification();
                        String rhsDocSpecification;
                        rhsDocSpecification = that.getDocSpecification();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "docSpecification", lhsDocSpecification), LocatorUtils.property(thatLocator, "docSpecification", rhsDocSpecification), lhsDocSpecification, rhsDocSpecification)) {
                            return false;
                        }
                    }
                    {
                        String lhsDocDescription;
                        lhsDocDescription = this.getDocDescription();
                        String rhsDocDescription;
                        rhsDocDescription = that.getDocDescription();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "docDescription", lhsDocDescription), LocatorUtils.property(thatLocator, "docDescription", rhsDocDescription), lhsDocDescription, rhsDocDescription)) {
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
            public static class Features
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlElement(required = true, type = String.class)
                @XmlJavaTypeAdapter(Adapter10 .class)
                @XmlSchemaType(name = "integer")
                protected Integer rooms;
                @XmlElement(required = true)
                protected SizeType size;
                @XmlElement(required = true)
                protected PriceType price;
                @XmlElement(required = true)
                protected List<Langtxt> description;
                @XmlElement(name = "energy-class", required = true)
                @XmlSchemaType(name = "string")
                protected ClassEnergy energyClass;
                @XmlElement(name = "energy-performance")
                protected ClassEnergyPerformance energyPerformance;

                /**
                 * Gets the value of the rooms property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
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
                public void setEnergyPerformance(ClassEnergyPerformance value) {
                    this.energyPerformance = value;
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
                        Integer theRooms;
                        theRooms = this.getRooms();
                        strategy.appendField(locator, this, "rooms", buffer, theRooms);
                    }
                    {
                        SizeType theSize;
                        theSize = this.getSize();
                        strategy.appendField(locator, this, "size", buffer, theSize);
                    }
                    {
                        PriceType thePrice;
                        thePrice = this.getPrice();
                        strategy.appendField(locator, this, "price", buffer, thePrice);
                    }
                    {
                        List<Langtxt> theDescription;
                        theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
                        strategy.appendField(locator, this, "description", buffer, theDescription);
                    }
                    {
                        ClassEnergy theEnergyClass;
                        theEnergyClass = this.getEnergyClass();
                        strategy.appendField(locator, this, "energyClass", buffer, theEnergyClass);
                    }
                    {
                        ClassEnergyPerformance theEnergyPerformance;
                        theEnergyPerformance = this.getEnergyPerformance();
                        strategy.appendField(locator, this, "energyPerformance", buffer, theEnergyPerformance);
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
                    if (draftCopy instanceof Feed.Properties.Property.Features) {
                        final Feed.Properties.Property.Features copy = ((Feed.Properties.Property.Features) draftCopy);
                        if (this.rooms!= null) {
                            Integer sourceRooms;
                            sourceRooms = this.getRooms();
                            Integer copyRooms = ((Integer) strategy.copy(LocatorUtils.property(locator, "rooms", sourceRooms), sourceRooms));
                            copy.setRooms(copyRooms);
                        } else {
                            copy.rooms = null;
                        }
                        if (this.size!= null) {
                            SizeType sourceSize;
                            sourceSize = this.getSize();
                            SizeType copySize = ((SizeType) strategy.copy(LocatorUtils.property(locator, "size", sourceSize), sourceSize));
                            copy.setSize(copySize);
                        } else {
                            copy.size = null;
                        }
                        if (this.price!= null) {
                            PriceType sourcePrice;
                            sourcePrice = this.getPrice();
                            PriceType copyPrice = ((PriceType) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice));
                            copy.setPrice(copyPrice);
                        } else {
                            copy.price = null;
                        }
                        if ((this.description!= null)&&(!this.description.isEmpty())) {
                            List<Langtxt> sourceDescription;
                            sourceDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
                            @SuppressWarnings("unchecked")
                            List<Langtxt> copyDescription = ((List<Langtxt> ) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription));
                            copy.description = null;
                            if (copyDescription!= null) {
                                List<Langtxt> uniqueDescriptionl = copy.getDescription();
                                uniqueDescriptionl.addAll(copyDescription);
                            }
                        } else {
                            copy.description = null;
                        }
                        if (this.energyClass!= null) {
                            ClassEnergy sourceEnergyClass;
                            sourceEnergyClass = this.getEnergyClass();
                            ClassEnergy copyEnergyClass = ((ClassEnergy) strategy.copy(LocatorUtils.property(locator, "energyClass", sourceEnergyClass), sourceEnergyClass));
                            copy.setEnergyClass(copyEnergyClass);
                        } else {
                            copy.energyClass = null;
                        }
                        if (this.energyPerformance!= null) {
                            ClassEnergyPerformance sourceEnergyPerformance;
                            sourceEnergyPerformance = this.getEnergyPerformance();
                            ClassEnergyPerformance copyEnergyPerformance = ((ClassEnergyPerformance) strategy.copy(LocatorUtils.property(locator, "energyPerformance", sourceEnergyPerformance), sourceEnergyPerformance));
                            copy.setEnergyPerformance(copyEnergyPerformance);
                        } else {
                            copy.energyPerformance = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Feed.Properties.Property.Features();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                    if (!(object instanceof Feed.Properties.Property.Features)) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "rooms", lhsRooms), LocatorUtils.property(thatLocator, "rooms", rhsRooms), lhsRooms, rhsRooms)) {
                            return false;
                        }
                    }
                    {
                        SizeType lhsSize;
                        lhsSize = this.getSize();
                        SizeType rhsSize;
                        rhsSize = that.getSize();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize)) {
                            return false;
                        }
                    }
                    {
                        PriceType lhsPrice;
                        lhsPrice = this.getPrice();
                        PriceType rhsPrice;
                        rhsPrice = that.getPrice();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice)) {
                            return false;
                        }
                    }
                    {
                        List<Langtxt> lhsDescription;
                        lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
                        List<Langtxt> rhsDescription;
                        rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                            return false;
                        }
                    }
                    {
                        ClassEnergy lhsEnergyClass;
                        lhsEnergyClass = this.getEnergyClass();
                        ClassEnergy rhsEnergyClass;
                        rhsEnergyClass = that.getEnergyClass();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "energyClass", lhsEnergyClass), LocatorUtils.property(thatLocator, "energyClass", rhsEnergyClass), lhsEnergyClass, rhsEnergyClass)) {
                            return false;
                        }
                    }
                    {
                        ClassEnergyPerformance lhsEnergyPerformance;
                        lhsEnergyPerformance = this.getEnergyPerformance();
                        ClassEnergyPerformance rhsEnergyPerformance;
                        rhsEnergyPerformance = that.getEnergyPerformance();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "energyPerformance", lhsEnergyPerformance), LocatorUtils.property(thatLocator, "energyPerformance", rhsEnergyPerformance), lhsEnergyPerformance, rhsEnergyPerformance)) {
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
            public static class Pictures
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlElements({
                    @XmlElement(name = "picture-url"),
                    @XmlElement(name = "picture", type = PictureExtended.class)
                })
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
                public List<PictureProject> getPictureUrlAndPicture() {
                    if (pictureUrlAndPicture == null) {
                        pictureUrlAndPicture = new ArrayList<PictureProject>();
                    }
                    return this.pictureUrlAndPicture;
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
                        List<PictureProject> thePictureUrlAndPicture;
                        thePictureUrlAndPicture = (((this.pictureUrlAndPicture!= null)&&(!this.pictureUrlAndPicture.isEmpty()))?this.getPictureUrlAndPicture():null);
                        strategy.appendField(locator, this, "pictureUrlAndPicture", buffer, thePictureUrlAndPicture);
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
                    if (draftCopy instanceof Feed.Properties.Property.Pictures) {
                        final Feed.Properties.Property.Pictures copy = ((Feed.Properties.Property.Pictures) draftCopy);
                        if ((this.pictureUrlAndPicture!= null)&&(!this.pictureUrlAndPicture.isEmpty())) {
                            List<PictureProject> sourcePictureUrlAndPicture;
                            sourcePictureUrlAndPicture = (((this.pictureUrlAndPicture!= null)&&(!this.pictureUrlAndPicture.isEmpty()))?this.getPictureUrlAndPicture():null);
                            @SuppressWarnings("unchecked")
                            List<PictureProject> copyPictureUrlAndPicture = ((List<PictureProject> ) strategy.copy(LocatorUtils.property(locator, "pictureUrlAndPicture", sourcePictureUrlAndPicture), sourcePictureUrlAndPicture));
                            copy.pictureUrlAndPicture = null;
                            if (copyPictureUrlAndPicture!= null) {
                                List<PictureProject> uniquePictureUrlAndPicturel = copy.getPictureUrlAndPicture();
                                uniquePictureUrlAndPicturel.addAll(copyPictureUrlAndPicture);
                            }
                        } else {
                            copy.pictureUrlAndPicture = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Feed.Properties.Property.Pictures();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                    if (!(object instanceof Feed.Properties.Property.Pictures)) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "pictureUrlAndPicture", lhsPictureUrlAndPicture), LocatorUtils.property(thatLocator, "pictureUrlAndPicture", rhsPictureUrlAndPicture), lhsPictureUrlAndPicture, rhsPictureUrlAndPicture)) {
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
            public static class Videos
                implements Cloneable, CopyTo, Equals, ToString
            {

                @XmlElement(required = true)
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
                public List<VideoProject> getVideo() {
                    if (video == null) {
                        video = new ArrayList<VideoProject>();
                    }
                    return this.video;
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
                        List<VideoProject> theVideo;
                        theVideo = (((this.video!= null)&&(!this.video.isEmpty()))?this.getVideo():null);
                        strategy.appendField(locator, this, "video", buffer, theVideo);
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
                    if (draftCopy instanceof Feed.Properties.Property.Videos) {
                        final Feed.Properties.Property.Videos copy = ((Feed.Properties.Property.Videos) draftCopy);
                        if ((this.video!= null)&&(!this.video.isEmpty())) {
                            List<VideoProject> sourceVideo;
                            sourceVideo = (((this.video!= null)&&(!this.video.isEmpty()))?this.getVideo():null);
                            @SuppressWarnings("unchecked")
                            List<VideoProject> copyVideo = ((List<VideoProject> ) strategy.copy(LocatorUtils.property(locator, "video", sourceVideo), sourceVideo));
                            copy.video = null;
                            if (copyVideo!= null) {
                                List<VideoProject> uniqueVideol = copy.getVideo();
                                uniqueVideol.addAll(copyVideo);
                            }
                        } else {
                            copy.video = null;
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new Feed.Properties.Property.Videos();
                }

                public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                    if (!(object instanceof Feed.Properties.Property.Videos)) {
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
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "video", lhsVideo), LocatorUtils.property(thatLocator, "video", rhsVideo), lhsVideo, rhsVideo)) {
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
