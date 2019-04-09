
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
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
 * Alle empfohlenen Nutzungen fuer Grundstuecke des alten allgemeinen Grundstueckstyps
 *             
 * 
 * <p>Java class for GrundstueckEmpfohleneNutzung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrundstueckEmpfohleneNutzung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Ackerland" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Bauerwartungsland" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Bootsstaende" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Buero" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Camping" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Doppelhaus" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Einfamilienhaus" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Einzelhandel-gross" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Einzelhandel-klein" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Garagen" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Garten" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Gastronomie" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Gewerbe" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Hotel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Industrie" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="keineBebauung" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Kleingewerbe" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Lager" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Mehrfamilienhaus" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Obstpflanzung" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Parkhaus" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Produktion" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Reihenhaus" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Stellplaetze" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Villa" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Wald" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrundstueckEmpfohleneNutzung", propOrder = {

})
@XmlSeeAlso({
    GrundstueckWohnenEmpfohleneNutzung.class,
    GrundstueckGewerbeEmpfohleneNutzung.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public class GrundstueckEmpfohleneNutzung implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElementRef(name = "Ackerland", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> ackerland;
    @XmlElementRef(name = "Bauerwartungsland", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> bauerwartungsland;
    @XmlElementRef(name = "Bootsstaende", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> bootsstaende;
    @XmlElementRef(name = "Buero", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> buero;
    @XmlElementRef(name = "Camping", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> camping;
    @XmlElementRef(name = "Doppelhaus", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> doppelhaus;
    @XmlElementRef(name = "Einfamilienhaus", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> einfamilienhaus;
    @XmlElementRef(name = "Einzelhandel-gross", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> einzelhandelGross;
    @XmlElementRef(name = "Einzelhandel-klein", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> einzelhandelKlein;
    @XmlElementRef(name = "Garagen", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> garagen;
    @XmlElementRef(name = "Garten", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> garten;
    @XmlElementRef(name = "Gastronomie", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> gastronomie;
    @XmlElementRef(name = "Gewerbe", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> gewerbe;
    @XmlElementRef(name = "Hotel", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> hotel;
    @XmlElementRef(name = "Industrie", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> industrie;
    @XmlElementRef(name = "keineBebauung", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> keineBebauung;
    @XmlElementRef(name = "Kleingewerbe", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> kleingewerbe;
    @XmlElementRef(name = "Lager", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> lager;
    @XmlElementRef(name = "Mehrfamilienhaus", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> mehrfamilienhaus;
    @XmlElementRef(name = "Obstpflanzung", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> obstpflanzung;
    @XmlElementRef(name = "Parkhaus", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> parkhaus;
    @XmlElementRef(name = "Produktion", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> produktion;
    @XmlElementRef(name = "Reihenhaus", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> reihenhaus;
    @XmlElementRef(name = "Stellplaetze", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> stellplaetze;
    @XmlElementRef(name = "Villa", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> villa;
    @XmlElementRef(name = "Wald", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected JAXBElement<Object> wald;

    /**
     * Gets the value of the ackerland property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getAckerland() {
        return ackerland;
    }

    /**
     * Sets the value of the ackerland property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setAckerland(JAXBElement<Object> value) {
        this.ackerland = value;
    }

    /**
     * Gets the value of the bauerwartungsland property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getBauerwartungsland() {
        return bauerwartungsland;
    }

    /**
     * Sets the value of the bauerwartungsland property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setBauerwartungsland(JAXBElement<Object> value) {
        this.bauerwartungsland = value;
    }

    /**
     * Gets the value of the bootsstaende property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getBootsstaende() {
        return bootsstaende;
    }

    /**
     * Sets the value of the bootsstaende property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setBootsstaende(JAXBElement<Object> value) {
        this.bootsstaende = value;
    }

    /**
     * Gets the value of the buero property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getBuero() {
        return buero;
    }

    /**
     * Sets the value of the buero property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setBuero(JAXBElement<Object> value) {
        this.buero = value;
    }

    /**
     * Gets the value of the camping property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getCamping() {
        return camping;
    }

    /**
     * Sets the value of the camping property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setCamping(JAXBElement<Object> value) {
        this.camping = value;
    }

    /**
     * Gets the value of the doppelhaus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getDoppelhaus() {
        return doppelhaus;
    }

    /**
     * Sets the value of the doppelhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setDoppelhaus(JAXBElement<Object> value) {
        this.doppelhaus = value;
    }

    /**
     * Gets the value of the einfamilienhaus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getEinfamilienhaus() {
        return einfamilienhaus;
    }

    /**
     * Sets the value of the einfamilienhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setEinfamilienhaus(JAXBElement<Object> value) {
        this.einfamilienhaus = value;
    }

    /**
     * Gets the value of the einzelhandelGross property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getEinzelhandelGross() {
        return einzelhandelGross;
    }

    /**
     * Sets the value of the einzelhandelGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setEinzelhandelGross(JAXBElement<Object> value) {
        this.einzelhandelGross = value;
    }

    /**
     * Gets the value of the einzelhandelKlein property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getEinzelhandelKlein() {
        return einzelhandelKlein;
    }

    /**
     * Sets the value of the einzelhandelKlein property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setEinzelhandelKlein(JAXBElement<Object> value) {
        this.einzelhandelKlein = value;
    }

    /**
     * Gets the value of the garagen property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getGaragen() {
        return garagen;
    }

    /**
     * Sets the value of the garagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setGaragen(JAXBElement<Object> value) {
        this.garagen = value;
    }

    /**
     * Gets the value of the garten property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getGarten() {
        return garten;
    }

    /**
     * Sets the value of the garten property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setGarten(JAXBElement<Object> value) {
        this.garten = value;
    }

    /**
     * Gets the value of the gastronomie property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getGastronomie() {
        return gastronomie;
    }

    /**
     * Sets the value of the gastronomie property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setGastronomie(JAXBElement<Object> value) {
        this.gastronomie = value;
    }

    /**
     * Gets the value of the gewerbe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getGewerbe() {
        return gewerbe;
    }

    /**
     * Sets the value of the gewerbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setGewerbe(JAXBElement<Object> value) {
        this.gewerbe = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setHotel(JAXBElement<Object> value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the industrie property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getIndustrie() {
        return industrie;
    }

    /**
     * Sets the value of the industrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setIndustrie(JAXBElement<Object> value) {
        this.industrie = value;
    }

    /**
     * Gets the value of the keineBebauung property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getKeineBebauung() {
        return keineBebauung;
    }

    /**
     * Sets the value of the keineBebauung property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setKeineBebauung(JAXBElement<Object> value) {
        this.keineBebauung = value;
    }

    /**
     * Gets the value of the kleingewerbe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getKleingewerbe() {
        return kleingewerbe;
    }

    /**
     * Sets the value of the kleingewerbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setKleingewerbe(JAXBElement<Object> value) {
        this.kleingewerbe = value;
    }

    /**
     * Gets the value of the lager property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getLager() {
        return lager;
    }

    /**
     * Sets the value of the lager property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setLager(JAXBElement<Object> value) {
        this.lager = value;
    }

    /**
     * Gets the value of the mehrfamilienhaus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getMehrfamilienhaus() {
        return mehrfamilienhaus;
    }

    /**
     * Sets the value of the mehrfamilienhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setMehrfamilienhaus(JAXBElement<Object> value) {
        this.mehrfamilienhaus = value;
    }

    /**
     * Gets the value of the obstpflanzung property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getObstpflanzung() {
        return obstpflanzung;
    }

    /**
     * Sets the value of the obstpflanzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setObstpflanzung(JAXBElement<Object> value) {
        this.obstpflanzung = value;
    }

    /**
     * Gets the value of the parkhaus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getParkhaus() {
        return parkhaus;
    }

    /**
     * Sets the value of the parkhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setParkhaus(JAXBElement<Object> value) {
        this.parkhaus = value;
    }

    /**
     * Gets the value of the produktion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getProduktion() {
        return produktion;
    }

    /**
     * Sets the value of the produktion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setProduktion(JAXBElement<Object> value) {
        this.produktion = value;
    }

    /**
     * Gets the value of the reihenhaus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getReihenhaus() {
        return reihenhaus;
    }

    /**
     * Sets the value of the reihenhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setReihenhaus(JAXBElement<Object> value) {
        this.reihenhaus = value;
    }

    /**
     * Gets the value of the stellplaetze property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getStellplaetze() {
        return stellplaetze;
    }

    /**
     * Sets the value of the stellplaetze property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setStellplaetze(JAXBElement<Object> value) {
        this.stellplaetze = value;
    }

    /**
     * Gets the value of the villa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getVilla() {
        return villa;
    }

    /**
     * Sets the value of the villa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setVilla(JAXBElement<Object> value) {
        this.villa = value;
    }

    /**
     * Gets the value of the wald property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public JAXBElement<Object> getWald() {
        return wald;
    }

    /**
     * Sets the value of the wald property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setWald(JAXBElement<Object> value) {
        this.wald = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            JAXBElement<Object> theAckerland;
            theAckerland = this.getAckerland();
            strategy.appendField(locator, this, "ackerland", buffer, theAckerland, (this.ackerland!= null));
        }
        {
            JAXBElement<Object> theBauerwartungsland;
            theBauerwartungsland = this.getBauerwartungsland();
            strategy.appendField(locator, this, "bauerwartungsland", buffer, theBauerwartungsland, (this.bauerwartungsland!= null));
        }
        {
            JAXBElement<Object> theBootsstaende;
            theBootsstaende = this.getBootsstaende();
            strategy.appendField(locator, this, "bootsstaende", buffer, theBootsstaende, (this.bootsstaende!= null));
        }
        {
            JAXBElement<Object> theBuero;
            theBuero = this.getBuero();
            strategy.appendField(locator, this, "buero", buffer, theBuero, (this.buero!= null));
        }
        {
            JAXBElement<Object> theCamping;
            theCamping = this.getCamping();
            strategy.appendField(locator, this, "camping", buffer, theCamping, (this.camping!= null));
        }
        {
            JAXBElement<Object> theDoppelhaus;
            theDoppelhaus = this.getDoppelhaus();
            strategy.appendField(locator, this, "doppelhaus", buffer, theDoppelhaus, (this.doppelhaus!= null));
        }
        {
            JAXBElement<Object> theEinfamilienhaus;
            theEinfamilienhaus = this.getEinfamilienhaus();
            strategy.appendField(locator, this, "einfamilienhaus", buffer, theEinfamilienhaus, (this.einfamilienhaus!= null));
        }
        {
            JAXBElement<Object> theEinzelhandelGross;
            theEinzelhandelGross = this.getEinzelhandelGross();
            strategy.appendField(locator, this, "einzelhandelGross", buffer, theEinzelhandelGross, (this.einzelhandelGross!= null));
        }
        {
            JAXBElement<Object> theEinzelhandelKlein;
            theEinzelhandelKlein = this.getEinzelhandelKlein();
            strategy.appendField(locator, this, "einzelhandelKlein", buffer, theEinzelhandelKlein, (this.einzelhandelKlein!= null));
        }
        {
            JAXBElement<Object> theGaragen;
            theGaragen = this.getGaragen();
            strategy.appendField(locator, this, "garagen", buffer, theGaragen, (this.garagen!= null));
        }
        {
            JAXBElement<Object> theGarten;
            theGarten = this.getGarten();
            strategy.appendField(locator, this, "garten", buffer, theGarten, (this.garten!= null));
        }
        {
            JAXBElement<Object> theGastronomie;
            theGastronomie = this.getGastronomie();
            strategy.appendField(locator, this, "gastronomie", buffer, theGastronomie, (this.gastronomie!= null));
        }
        {
            JAXBElement<Object> theGewerbe;
            theGewerbe = this.getGewerbe();
            strategy.appendField(locator, this, "gewerbe", buffer, theGewerbe, (this.gewerbe!= null));
        }
        {
            JAXBElement<Object> theHotel;
            theHotel = this.getHotel();
            strategy.appendField(locator, this, "hotel", buffer, theHotel, (this.hotel!= null));
        }
        {
            JAXBElement<Object> theIndustrie;
            theIndustrie = this.getIndustrie();
            strategy.appendField(locator, this, "industrie", buffer, theIndustrie, (this.industrie!= null));
        }
        {
            JAXBElement<Object> theKeineBebauung;
            theKeineBebauung = this.getKeineBebauung();
            strategy.appendField(locator, this, "keineBebauung", buffer, theKeineBebauung, (this.keineBebauung!= null));
        }
        {
            JAXBElement<Object> theKleingewerbe;
            theKleingewerbe = this.getKleingewerbe();
            strategy.appendField(locator, this, "kleingewerbe", buffer, theKleingewerbe, (this.kleingewerbe!= null));
        }
        {
            JAXBElement<Object> theLager;
            theLager = this.getLager();
            strategy.appendField(locator, this, "lager", buffer, theLager, (this.lager!= null));
        }
        {
            JAXBElement<Object> theMehrfamilienhaus;
            theMehrfamilienhaus = this.getMehrfamilienhaus();
            strategy.appendField(locator, this, "mehrfamilienhaus", buffer, theMehrfamilienhaus, (this.mehrfamilienhaus!= null));
        }
        {
            JAXBElement<Object> theObstpflanzung;
            theObstpflanzung = this.getObstpflanzung();
            strategy.appendField(locator, this, "obstpflanzung", buffer, theObstpflanzung, (this.obstpflanzung!= null));
        }
        {
            JAXBElement<Object> theParkhaus;
            theParkhaus = this.getParkhaus();
            strategy.appendField(locator, this, "parkhaus", buffer, theParkhaus, (this.parkhaus!= null));
        }
        {
            JAXBElement<Object> theProduktion;
            theProduktion = this.getProduktion();
            strategy.appendField(locator, this, "produktion", buffer, theProduktion, (this.produktion!= null));
        }
        {
            JAXBElement<Object> theReihenhaus;
            theReihenhaus = this.getReihenhaus();
            strategy.appendField(locator, this, "reihenhaus", buffer, theReihenhaus, (this.reihenhaus!= null));
        }
        {
            JAXBElement<Object> theStellplaetze;
            theStellplaetze = this.getStellplaetze();
            strategy.appendField(locator, this, "stellplaetze", buffer, theStellplaetze, (this.stellplaetze!= null));
        }
        {
            JAXBElement<Object> theVilla;
            theVilla = this.getVilla();
            strategy.appendField(locator, this, "villa", buffer, theVilla, (this.villa!= null));
        }
        {
            JAXBElement<Object> theWald;
            theWald = this.getWald();
            strategy.appendField(locator, this, "wald", buffer, theWald, (this.wald!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof GrundstueckEmpfohleneNutzung) {
            final GrundstueckEmpfohleneNutzung copy = ((GrundstueckEmpfohleneNutzung) draftCopy);
            {
                Boolean ackerlandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ackerland!= null));
                if (ackerlandShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceAckerland;
                    sourceAckerland = this.getAckerland();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyAckerland = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "ackerland", sourceAckerland), sourceAckerland, (this.ackerland!= null)));
                    copy.setAckerland(copyAckerland);
                } else {
                    if (ackerlandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ackerland = null;
                    }
                }
            }
            {
                Boolean bauerwartungslandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bauerwartungsland!= null));
                if (bauerwartungslandShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceBauerwartungsland;
                    sourceBauerwartungsland = this.getBauerwartungsland();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyBauerwartungsland = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "bauerwartungsland", sourceBauerwartungsland), sourceBauerwartungsland, (this.bauerwartungsland!= null)));
                    copy.setBauerwartungsland(copyBauerwartungsland);
                } else {
                    if (bauerwartungslandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bauerwartungsland = null;
                    }
                }
            }
            {
                Boolean bootsstaendeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bootsstaende!= null));
                if (bootsstaendeShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceBootsstaende;
                    sourceBootsstaende = this.getBootsstaende();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyBootsstaende = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "bootsstaende", sourceBootsstaende), sourceBootsstaende, (this.bootsstaende!= null)));
                    copy.setBootsstaende(copyBootsstaende);
                } else {
                    if (bootsstaendeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bootsstaende = null;
                    }
                }
            }
            {
                Boolean bueroShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.buero!= null));
                if (bueroShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceBuero;
                    sourceBuero = this.getBuero();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyBuero = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "buero", sourceBuero), sourceBuero, (this.buero!= null)));
                    copy.setBuero(copyBuero);
                } else {
                    if (bueroShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.buero = null;
                    }
                }
            }
            {
                Boolean campingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.camping!= null));
                if (campingShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceCamping;
                    sourceCamping = this.getCamping();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyCamping = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "camping", sourceCamping), sourceCamping, (this.camping!= null)));
                    copy.setCamping(copyCamping);
                } else {
                    if (campingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.camping = null;
                    }
                }
            }
            {
                Boolean doppelhausShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.doppelhaus!= null));
                if (doppelhausShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceDoppelhaus;
                    sourceDoppelhaus = this.getDoppelhaus();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyDoppelhaus = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "doppelhaus", sourceDoppelhaus), sourceDoppelhaus, (this.doppelhaus!= null)));
                    copy.setDoppelhaus(copyDoppelhaus);
                } else {
                    if (doppelhausShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.doppelhaus = null;
                    }
                }
            }
            {
                Boolean einfamilienhausShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einfamilienhaus!= null));
                if (einfamilienhausShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceEinfamilienhaus;
                    sourceEinfamilienhaus = this.getEinfamilienhaus();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyEinfamilienhaus = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "einfamilienhaus", sourceEinfamilienhaus), sourceEinfamilienhaus, (this.einfamilienhaus!= null)));
                    copy.setEinfamilienhaus(copyEinfamilienhaus);
                } else {
                    if (einfamilienhausShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einfamilienhaus = null;
                    }
                }
            }
            {
                Boolean einzelhandelGrossShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einzelhandelGross!= null));
                if (einzelhandelGrossShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceEinzelhandelGross;
                    sourceEinzelhandelGross = this.getEinzelhandelGross();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyEinzelhandelGross = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "einzelhandelGross", sourceEinzelhandelGross), sourceEinzelhandelGross, (this.einzelhandelGross!= null)));
                    copy.setEinzelhandelGross(copyEinzelhandelGross);
                } else {
                    if (einzelhandelGrossShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einzelhandelGross = null;
                    }
                }
            }
            {
                Boolean einzelhandelKleinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einzelhandelKlein!= null));
                if (einzelhandelKleinShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceEinzelhandelKlein;
                    sourceEinzelhandelKlein = this.getEinzelhandelKlein();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyEinzelhandelKlein = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "einzelhandelKlein", sourceEinzelhandelKlein), sourceEinzelhandelKlein, (this.einzelhandelKlein!= null)));
                    copy.setEinzelhandelKlein(copyEinzelhandelKlein);
                } else {
                    if (einzelhandelKleinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einzelhandelKlein = null;
                    }
                }
            }
            {
                Boolean garagenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garagen!= null));
                if (garagenShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceGaragen;
                    sourceGaragen = this.getGaragen();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyGaragen = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "garagen", sourceGaragen), sourceGaragen, (this.garagen!= null)));
                    copy.setGaragen(copyGaragen);
                } else {
                    if (garagenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garagen = null;
                    }
                }
            }
            {
                Boolean gartenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garten!= null));
                if (gartenShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceGarten;
                    sourceGarten = this.getGarten();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyGarten = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "garten", sourceGarten), sourceGarten, (this.garten!= null)));
                    copy.setGarten(copyGarten);
                } else {
                    if (gartenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garten = null;
                    }
                }
            }
            {
                Boolean gastronomieShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gastronomie!= null));
                if (gastronomieShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceGastronomie;
                    sourceGastronomie = this.getGastronomie();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyGastronomie = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "gastronomie", sourceGastronomie), sourceGastronomie, (this.gastronomie!= null)));
                    copy.setGastronomie(copyGastronomie);
                } else {
                    if (gastronomieShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gastronomie = null;
                    }
                }
            }
            {
                Boolean gewerbeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gewerbe!= null));
                if (gewerbeShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceGewerbe;
                    sourceGewerbe = this.getGewerbe();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyGewerbe = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "gewerbe", sourceGewerbe), sourceGewerbe, (this.gewerbe!= null)));
                    copy.setGewerbe(copyGewerbe);
                } else {
                    if (gewerbeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gewerbe = null;
                    }
                }
            }
            {
                Boolean hotelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hotel!= null));
                if (hotelShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceHotel;
                    sourceHotel = this.getHotel();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyHotel = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "hotel", sourceHotel), sourceHotel, (this.hotel!= null)));
                    copy.setHotel(copyHotel);
                } else {
                    if (hotelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hotel = null;
                    }
                }
            }
            {
                Boolean industrieShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.industrie!= null));
                if (industrieShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceIndustrie;
                    sourceIndustrie = this.getIndustrie();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyIndustrie = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "industrie", sourceIndustrie), sourceIndustrie, (this.industrie!= null)));
                    copy.setIndustrie(copyIndustrie);
                } else {
                    if (industrieShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.industrie = null;
                    }
                }
            }
            {
                Boolean keineBebauungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.keineBebauung!= null));
                if (keineBebauungShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceKeineBebauung;
                    sourceKeineBebauung = this.getKeineBebauung();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyKeineBebauung = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "keineBebauung", sourceKeineBebauung), sourceKeineBebauung, (this.keineBebauung!= null)));
                    copy.setKeineBebauung(copyKeineBebauung);
                } else {
                    if (keineBebauungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.keineBebauung = null;
                    }
                }
            }
            {
                Boolean kleingewerbeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kleingewerbe!= null));
                if (kleingewerbeShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceKleingewerbe;
                    sourceKleingewerbe = this.getKleingewerbe();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyKleingewerbe = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "kleingewerbe", sourceKleingewerbe), sourceKleingewerbe, (this.kleingewerbe!= null)));
                    copy.setKleingewerbe(copyKleingewerbe);
                } else {
                    if (kleingewerbeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kleingewerbe = null;
                    }
                }
            }
            {
                Boolean lagerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lager!= null));
                if (lagerShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceLager;
                    sourceLager = this.getLager();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyLager = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "lager", sourceLager), sourceLager, (this.lager!= null)));
                    copy.setLager(copyLager);
                } else {
                    if (lagerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lager = null;
                    }
                }
            }
            {
                Boolean mehrfamilienhausShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mehrfamilienhaus!= null));
                if (mehrfamilienhausShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceMehrfamilienhaus;
                    sourceMehrfamilienhaus = this.getMehrfamilienhaus();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyMehrfamilienhaus = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "mehrfamilienhaus", sourceMehrfamilienhaus), sourceMehrfamilienhaus, (this.mehrfamilienhaus!= null)));
                    copy.setMehrfamilienhaus(copyMehrfamilienhaus);
                } else {
                    if (mehrfamilienhausShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mehrfamilienhaus = null;
                    }
                }
            }
            {
                Boolean obstpflanzungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.obstpflanzung!= null));
                if (obstpflanzungShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceObstpflanzung;
                    sourceObstpflanzung = this.getObstpflanzung();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyObstpflanzung = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "obstpflanzung", sourceObstpflanzung), sourceObstpflanzung, (this.obstpflanzung!= null)));
                    copy.setObstpflanzung(copyObstpflanzung);
                } else {
                    if (obstpflanzungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.obstpflanzung = null;
                    }
                }
            }
            {
                Boolean parkhausShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkhaus!= null));
                if (parkhausShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceParkhaus;
                    sourceParkhaus = this.getParkhaus();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyParkhaus = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "parkhaus", sourceParkhaus), sourceParkhaus, (this.parkhaus!= null)));
                    copy.setParkhaus(copyParkhaus);
                } else {
                    if (parkhausShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkhaus = null;
                    }
                }
            }
            {
                Boolean produktionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.produktion!= null));
                if (produktionShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceProduktion;
                    sourceProduktion = this.getProduktion();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyProduktion = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "produktion", sourceProduktion), sourceProduktion, (this.produktion!= null)));
                    copy.setProduktion(copyProduktion);
                } else {
                    if (produktionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.produktion = null;
                    }
                }
            }
            {
                Boolean reihenhausShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.reihenhaus!= null));
                if (reihenhausShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceReihenhaus;
                    sourceReihenhaus = this.getReihenhaus();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyReihenhaus = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "reihenhaus", sourceReihenhaus), sourceReihenhaus, (this.reihenhaus!= null)));
                    copy.setReihenhaus(copyReihenhaus);
                } else {
                    if (reihenhausShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.reihenhaus = null;
                    }
                }
            }
            {
                Boolean stellplaetzeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stellplaetze!= null));
                if (stellplaetzeShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceStellplaetze;
                    sourceStellplaetze = this.getStellplaetze();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyStellplaetze = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "stellplaetze", sourceStellplaetze), sourceStellplaetze, (this.stellplaetze!= null)));
                    copy.setStellplaetze(copyStellplaetze);
                } else {
                    if (stellplaetzeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stellplaetze = null;
                    }
                }
            }
            {
                Boolean villaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.villa!= null));
                if (villaShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceVilla;
                    sourceVilla = this.getVilla();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyVilla = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "villa", sourceVilla), sourceVilla, (this.villa!= null)));
                    copy.setVilla(copyVilla);
                } else {
                    if (villaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.villa = null;
                    }
                }
            }
            {
                Boolean waldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wald!= null));
                if (waldShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceWald;
                    sourceWald = this.getWald();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyWald = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "wald", sourceWald), sourceWald, (this.wald!= null)));
                    copy.setWald(copyWald);
                } else {
                    if (waldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wald = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new GrundstueckEmpfohleneNutzung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GrundstueckEmpfohleneNutzung that = ((GrundstueckEmpfohleneNutzung) object);
        {
            JAXBElement<Object> lhsAckerland;
            lhsAckerland = this.getAckerland();
            JAXBElement<Object> rhsAckerland;
            rhsAckerland = that.getAckerland();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ackerland", lhsAckerland), LocatorUtils.property(thatLocator, "ackerland", rhsAckerland), lhsAckerland, rhsAckerland, (this.ackerland!= null), (that.ackerland!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsBauerwartungsland;
            lhsBauerwartungsland = this.getBauerwartungsland();
            JAXBElement<Object> rhsBauerwartungsland;
            rhsBauerwartungsland = that.getBauerwartungsland();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bauerwartungsland", lhsBauerwartungsland), LocatorUtils.property(thatLocator, "bauerwartungsland", rhsBauerwartungsland), lhsBauerwartungsland, rhsBauerwartungsland, (this.bauerwartungsland!= null), (that.bauerwartungsland!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsBootsstaende;
            lhsBootsstaende = this.getBootsstaende();
            JAXBElement<Object> rhsBootsstaende;
            rhsBootsstaende = that.getBootsstaende();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bootsstaende", lhsBootsstaende), LocatorUtils.property(thatLocator, "bootsstaende", rhsBootsstaende), lhsBootsstaende, rhsBootsstaende, (this.bootsstaende!= null), (that.bootsstaende!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsBuero;
            lhsBuero = this.getBuero();
            JAXBElement<Object> rhsBuero;
            rhsBuero = that.getBuero();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buero", lhsBuero), LocatorUtils.property(thatLocator, "buero", rhsBuero), lhsBuero, rhsBuero, (this.buero!= null), (that.buero!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsCamping;
            lhsCamping = this.getCamping();
            JAXBElement<Object> rhsCamping;
            rhsCamping = that.getCamping();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "camping", lhsCamping), LocatorUtils.property(thatLocator, "camping", rhsCamping), lhsCamping, rhsCamping, (this.camping!= null), (that.camping!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsDoppelhaus;
            lhsDoppelhaus = this.getDoppelhaus();
            JAXBElement<Object> rhsDoppelhaus;
            rhsDoppelhaus = that.getDoppelhaus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doppelhaus", lhsDoppelhaus), LocatorUtils.property(thatLocator, "doppelhaus", rhsDoppelhaus), lhsDoppelhaus, rhsDoppelhaus, (this.doppelhaus!= null), (that.doppelhaus!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsEinfamilienhaus;
            lhsEinfamilienhaus = this.getEinfamilienhaus();
            JAXBElement<Object> rhsEinfamilienhaus;
            rhsEinfamilienhaus = that.getEinfamilienhaus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einfamilienhaus", lhsEinfamilienhaus), LocatorUtils.property(thatLocator, "einfamilienhaus", rhsEinfamilienhaus), lhsEinfamilienhaus, rhsEinfamilienhaus, (this.einfamilienhaus!= null), (that.einfamilienhaus!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsEinzelhandelGross;
            lhsEinzelhandelGross = this.getEinzelhandelGross();
            JAXBElement<Object> rhsEinzelhandelGross;
            rhsEinzelhandelGross = that.getEinzelhandelGross();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einzelhandelGross", lhsEinzelhandelGross), LocatorUtils.property(thatLocator, "einzelhandelGross", rhsEinzelhandelGross), lhsEinzelhandelGross, rhsEinzelhandelGross, (this.einzelhandelGross!= null), (that.einzelhandelGross!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsEinzelhandelKlein;
            lhsEinzelhandelKlein = this.getEinzelhandelKlein();
            JAXBElement<Object> rhsEinzelhandelKlein;
            rhsEinzelhandelKlein = that.getEinzelhandelKlein();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einzelhandelKlein", lhsEinzelhandelKlein), LocatorUtils.property(thatLocator, "einzelhandelKlein", rhsEinzelhandelKlein), lhsEinzelhandelKlein, rhsEinzelhandelKlein, (this.einzelhandelKlein!= null), (that.einzelhandelKlein!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsGaragen;
            lhsGaragen = this.getGaragen();
            JAXBElement<Object> rhsGaragen;
            rhsGaragen = that.getGaragen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garagen", lhsGaragen), LocatorUtils.property(thatLocator, "garagen", rhsGaragen), lhsGaragen, rhsGaragen, (this.garagen!= null), (that.garagen!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsGarten;
            lhsGarten = this.getGarten();
            JAXBElement<Object> rhsGarten;
            rhsGarten = that.getGarten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garten", lhsGarten), LocatorUtils.property(thatLocator, "garten", rhsGarten), lhsGarten, rhsGarten, (this.garten!= null), (that.garten!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsGastronomie;
            lhsGastronomie = this.getGastronomie();
            JAXBElement<Object> rhsGastronomie;
            rhsGastronomie = that.getGastronomie();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastronomie", lhsGastronomie), LocatorUtils.property(thatLocator, "gastronomie", rhsGastronomie), lhsGastronomie, rhsGastronomie, (this.gastronomie!= null), (that.gastronomie!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsGewerbe;
            lhsGewerbe = this.getGewerbe();
            JAXBElement<Object> rhsGewerbe;
            rhsGewerbe = that.getGewerbe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewerbe", lhsGewerbe), LocatorUtils.property(thatLocator, "gewerbe", rhsGewerbe), lhsGewerbe, rhsGewerbe, (this.gewerbe!= null), (that.gewerbe!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsHotel;
            lhsHotel = this.getHotel();
            JAXBElement<Object> rhsHotel;
            rhsHotel = that.getHotel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hotel", lhsHotel), LocatorUtils.property(thatLocator, "hotel", rhsHotel), lhsHotel, rhsHotel, (this.hotel!= null), (that.hotel!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsIndustrie;
            lhsIndustrie = this.getIndustrie();
            JAXBElement<Object> rhsIndustrie;
            rhsIndustrie = that.getIndustrie();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "industrie", lhsIndustrie), LocatorUtils.property(thatLocator, "industrie", rhsIndustrie), lhsIndustrie, rhsIndustrie, (this.industrie!= null), (that.industrie!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsKeineBebauung;
            lhsKeineBebauung = this.getKeineBebauung();
            JAXBElement<Object> rhsKeineBebauung;
            rhsKeineBebauung = that.getKeineBebauung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keineBebauung", lhsKeineBebauung), LocatorUtils.property(thatLocator, "keineBebauung", rhsKeineBebauung), lhsKeineBebauung, rhsKeineBebauung, (this.keineBebauung!= null), (that.keineBebauung!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsKleingewerbe;
            lhsKleingewerbe = this.getKleingewerbe();
            JAXBElement<Object> rhsKleingewerbe;
            rhsKleingewerbe = that.getKleingewerbe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kleingewerbe", lhsKleingewerbe), LocatorUtils.property(thatLocator, "kleingewerbe", rhsKleingewerbe), lhsKleingewerbe, rhsKleingewerbe, (this.kleingewerbe!= null), (that.kleingewerbe!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsLager;
            lhsLager = this.getLager();
            JAXBElement<Object> rhsLager;
            rhsLager = that.getLager();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lager", lhsLager), LocatorUtils.property(thatLocator, "lager", rhsLager), lhsLager, rhsLager, (this.lager!= null), (that.lager!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsMehrfamilienhaus;
            lhsMehrfamilienhaus = this.getMehrfamilienhaus();
            JAXBElement<Object> rhsMehrfamilienhaus;
            rhsMehrfamilienhaus = that.getMehrfamilienhaus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mehrfamilienhaus", lhsMehrfamilienhaus), LocatorUtils.property(thatLocator, "mehrfamilienhaus", rhsMehrfamilienhaus), lhsMehrfamilienhaus, rhsMehrfamilienhaus, (this.mehrfamilienhaus!= null), (that.mehrfamilienhaus!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsObstpflanzung;
            lhsObstpflanzung = this.getObstpflanzung();
            JAXBElement<Object> rhsObstpflanzung;
            rhsObstpflanzung = that.getObstpflanzung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "obstpflanzung", lhsObstpflanzung), LocatorUtils.property(thatLocator, "obstpflanzung", rhsObstpflanzung), lhsObstpflanzung, rhsObstpflanzung, (this.obstpflanzung!= null), (that.obstpflanzung!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsParkhaus;
            lhsParkhaus = this.getParkhaus();
            JAXBElement<Object> rhsParkhaus;
            rhsParkhaus = that.getParkhaus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkhaus", lhsParkhaus), LocatorUtils.property(thatLocator, "parkhaus", rhsParkhaus), lhsParkhaus, rhsParkhaus, (this.parkhaus!= null), (that.parkhaus!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsProduktion;
            lhsProduktion = this.getProduktion();
            JAXBElement<Object> rhsProduktion;
            rhsProduktion = that.getProduktion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "produktion", lhsProduktion), LocatorUtils.property(thatLocator, "produktion", rhsProduktion), lhsProduktion, rhsProduktion, (this.produktion!= null), (that.produktion!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsReihenhaus;
            lhsReihenhaus = this.getReihenhaus();
            JAXBElement<Object> rhsReihenhaus;
            rhsReihenhaus = that.getReihenhaus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reihenhaus", lhsReihenhaus), LocatorUtils.property(thatLocator, "reihenhaus", rhsReihenhaus), lhsReihenhaus, rhsReihenhaus, (this.reihenhaus!= null), (that.reihenhaus!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsStellplaetze;
            lhsStellplaetze = this.getStellplaetze();
            JAXBElement<Object> rhsStellplaetze;
            rhsStellplaetze = that.getStellplaetze();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stellplaetze", lhsStellplaetze), LocatorUtils.property(thatLocator, "stellplaetze", rhsStellplaetze), lhsStellplaetze, rhsStellplaetze, (this.stellplaetze!= null), (that.stellplaetze!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsVilla;
            lhsVilla = this.getVilla();
            JAXBElement<Object> rhsVilla;
            rhsVilla = that.getVilla();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "villa", lhsVilla), LocatorUtils.property(thatLocator, "villa", rhsVilla), lhsVilla, rhsVilla, (this.villa!= null), (that.villa!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsWald;
            lhsWald = this.getWald();
            JAXBElement<Object> rhsWald;
            rhsWald = that.getWald();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wald", lhsWald), LocatorUtils.property(thatLocator, "wald", rhsWald), lhsWald, rhsWald, (this.wald!= null), (that.wald!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
