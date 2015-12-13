
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for BefeuerungsArtTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BefeuerungsArtTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="KeineAngabe" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Erdwaerme" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Solarheizung" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Pelletheizung" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Gas" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Oel" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Fernwaerme" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Strom" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Kohle" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BefeuerungsArtTyp", propOrder = {

})
public class BefeuerungsArtTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElementRef(name = "KeineAngabe", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<Object> keineAngabe;
    @XmlElementRef(name = "Erdwaerme", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<Object> erdwaerme;
    @XmlElementRef(name = "Solarheizung", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<Object> solarheizung;
    @XmlElementRef(name = "Pelletheizung", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<Object> pelletheizung;
    @XmlElementRef(name = "Gas", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<Object> gas;
    @XmlElementRef(name = "Oel", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<Object> oel;
    @XmlElementRef(name = "Fernwaerme", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<Object> fernwaerme;
    @XmlElementRef(name = "Strom", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<Object> strom;
    @XmlElementRef(name = "Kohle", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<Object> kohle;

    /**
     * Gets the value of the keineAngabe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getKeineAngabe() {
        return keineAngabe;
    }

    /**
     * Sets the value of the keineAngabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setKeineAngabe(JAXBElement<Object> value) {
        this.keineAngabe = value;
    }

    /**
     * Gets the value of the erdwaerme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getErdwaerme() {
        return erdwaerme;
    }

    /**
     * Sets the value of the erdwaerme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setErdwaerme(JAXBElement<Object> value) {
        this.erdwaerme = value;
    }

    /**
     * Gets the value of the solarheizung property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getSolarheizung() {
        return solarheizung;
    }

    /**
     * Sets the value of the solarheizung property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setSolarheizung(JAXBElement<Object> value) {
        this.solarheizung = value;
    }

    /**
     * Gets the value of the pelletheizung property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getPelletheizung() {
        return pelletheizung;
    }

    /**
     * Sets the value of the pelletheizung property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setPelletheizung(JAXBElement<Object> value) {
        this.pelletheizung = value;
    }

    /**
     * Gets the value of the gas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getGas() {
        return gas;
    }

    /**
     * Sets the value of the gas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setGas(JAXBElement<Object> value) {
        this.gas = value;
    }

    /**
     * Gets the value of the oel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getOel() {
        return oel;
    }

    /**
     * Sets the value of the oel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setOel(JAXBElement<Object> value) {
        this.oel = value;
    }

    /**
     * Gets the value of the fernwaerme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getFernwaerme() {
        return fernwaerme;
    }

    /**
     * Sets the value of the fernwaerme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setFernwaerme(JAXBElement<Object> value) {
        this.fernwaerme = value;
    }

    /**
     * Gets the value of the strom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getStrom() {
        return strom;
    }

    /**
     * Sets the value of the strom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setStrom(JAXBElement<Object> value) {
        this.strom = value;
    }

    /**
     * Gets the value of the kohle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getKohle() {
        return kohle;
    }

    /**
     * Sets the value of the kohle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setKohle(JAXBElement<Object> value) {
        this.kohle = value;
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
            JAXBElement<Object> theKeineAngabe;
            theKeineAngabe = this.getKeineAngabe();
            strategy.appendField(locator, this, "keineAngabe", buffer, theKeineAngabe);
        }
        {
            JAXBElement<Object> theErdwaerme;
            theErdwaerme = this.getErdwaerme();
            strategy.appendField(locator, this, "erdwaerme", buffer, theErdwaerme);
        }
        {
            JAXBElement<Object> theSolarheizung;
            theSolarheizung = this.getSolarheizung();
            strategy.appendField(locator, this, "solarheizung", buffer, theSolarheizung);
        }
        {
            JAXBElement<Object> thePelletheizung;
            thePelletheizung = this.getPelletheizung();
            strategy.appendField(locator, this, "pelletheizung", buffer, thePelletheizung);
        }
        {
            JAXBElement<Object> theGas;
            theGas = this.getGas();
            strategy.appendField(locator, this, "gas", buffer, theGas);
        }
        {
            JAXBElement<Object> theOel;
            theOel = this.getOel();
            strategy.appendField(locator, this, "oel", buffer, theOel);
        }
        {
            JAXBElement<Object> theFernwaerme;
            theFernwaerme = this.getFernwaerme();
            strategy.appendField(locator, this, "fernwaerme", buffer, theFernwaerme);
        }
        {
            JAXBElement<Object> theStrom;
            theStrom = this.getStrom();
            strategy.appendField(locator, this, "strom", buffer, theStrom);
        }
        {
            JAXBElement<Object> theKohle;
            theKohle = this.getKohle();
            strategy.appendField(locator, this, "kohle", buffer, theKohle);
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
        if (draftCopy instanceof BefeuerungsArtTyp) {
            final BefeuerungsArtTyp copy = ((BefeuerungsArtTyp) draftCopy);
            if (this.keineAngabe!= null) {
                JAXBElement<Object> sourceKeineAngabe;
                sourceKeineAngabe = this.getKeineAngabe();
                @SuppressWarnings("unchecked")
                JAXBElement<Object> copyKeineAngabe = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "keineAngabe", sourceKeineAngabe), sourceKeineAngabe));
                copy.setKeineAngabe(copyKeineAngabe);
            } else {
                copy.keineAngabe = null;
            }
            if (this.erdwaerme!= null) {
                JAXBElement<Object> sourceErdwaerme;
                sourceErdwaerme = this.getErdwaerme();
                @SuppressWarnings("unchecked")
                JAXBElement<Object> copyErdwaerme = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "erdwaerme", sourceErdwaerme), sourceErdwaerme));
                copy.setErdwaerme(copyErdwaerme);
            } else {
                copy.erdwaerme = null;
            }
            if (this.solarheizung!= null) {
                JAXBElement<Object> sourceSolarheizung;
                sourceSolarheizung = this.getSolarheizung();
                @SuppressWarnings("unchecked")
                JAXBElement<Object> copySolarheizung = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "solarheizung", sourceSolarheizung), sourceSolarheizung));
                copy.setSolarheizung(copySolarheizung);
            } else {
                copy.solarheizung = null;
            }
            if (this.pelletheizung!= null) {
                JAXBElement<Object> sourcePelletheizung;
                sourcePelletheizung = this.getPelletheizung();
                @SuppressWarnings("unchecked")
                JAXBElement<Object> copyPelletheizung = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "pelletheizung", sourcePelletheizung), sourcePelletheizung));
                copy.setPelletheizung(copyPelletheizung);
            } else {
                copy.pelletheizung = null;
            }
            if (this.gas!= null) {
                JAXBElement<Object> sourceGas;
                sourceGas = this.getGas();
                @SuppressWarnings("unchecked")
                JAXBElement<Object> copyGas = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "gas", sourceGas), sourceGas));
                copy.setGas(copyGas);
            } else {
                copy.gas = null;
            }
            if (this.oel!= null) {
                JAXBElement<Object> sourceOel;
                sourceOel = this.getOel();
                @SuppressWarnings("unchecked")
                JAXBElement<Object> copyOel = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "oel", sourceOel), sourceOel));
                copy.setOel(copyOel);
            } else {
                copy.oel = null;
            }
            if (this.fernwaerme!= null) {
                JAXBElement<Object> sourceFernwaerme;
                sourceFernwaerme = this.getFernwaerme();
                @SuppressWarnings("unchecked")
                JAXBElement<Object> copyFernwaerme = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "fernwaerme", sourceFernwaerme), sourceFernwaerme));
                copy.setFernwaerme(copyFernwaerme);
            } else {
                copy.fernwaerme = null;
            }
            if (this.strom!= null) {
                JAXBElement<Object> sourceStrom;
                sourceStrom = this.getStrom();
                @SuppressWarnings("unchecked")
                JAXBElement<Object> copyStrom = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "strom", sourceStrom), sourceStrom));
                copy.setStrom(copyStrom);
            } else {
                copy.strom = null;
            }
            if (this.kohle!= null) {
                JAXBElement<Object> sourceKohle;
                sourceKohle = this.getKohle();
                @SuppressWarnings("unchecked")
                JAXBElement<Object> copyKohle = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "kohle", sourceKohle), sourceKohle));
                copy.setKohle(copyKohle);
            } else {
                copy.kohle = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BefeuerungsArtTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BefeuerungsArtTyp that = ((BefeuerungsArtTyp) object);
        {
            JAXBElement<Object> lhsKeineAngabe;
            lhsKeineAngabe = this.getKeineAngabe();
            JAXBElement<Object> rhsKeineAngabe;
            rhsKeineAngabe = that.getKeineAngabe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keineAngabe", lhsKeineAngabe), LocatorUtils.property(thatLocator, "keineAngabe", rhsKeineAngabe), lhsKeineAngabe, rhsKeineAngabe)) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsErdwaerme;
            lhsErdwaerme = this.getErdwaerme();
            JAXBElement<Object> rhsErdwaerme;
            rhsErdwaerme = that.getErdwaerme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erdwaerme", lhsErdwaerme), LocatorUtils.property(thatLocator, "erdwaerme", rhsErdwaerme), lhsErdwaerme, rhsErdwaerme)) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsSolarheizung;
            lhsSolarheizung = this.getSolarheizung();
            JAXBElement<Object> rhsSolarheizung;
            rhsSolarheizung = that.getSolarheizung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "solarheizung", lhsSolarheizung), LocatorUtils.property(thatLocator, "solarheizung", rhsSolarheizung), lhsSolarheizung, rhsSolarheizung)) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsPelletheizung;
            lhsPelletheizung = this.getPelletheizung();
            JAXBElement<Object> rhsPelletheizung;
            rhsPelletheizung = that.getPelletheizung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pelletheizung", lhsPelletheizung), LocatorUtils.property(thatLocator, "pelletheizung", rhsPelletheizung), lhsPelletheizung, rhsPelletheizung)) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsGas;
            lhsGas = this.getGas();
            JAXBElement<Object> rhsGas;
            rhsGas = that.getGas();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gas", lhsGas), LocatorUtils.property(thatLocator, "gas", rhsGas), lhsGas, rhsGas)) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsOel;
            lhsOel = this.getOel();
            JAXBElement<Object> rhsOel;
            rhsOel = that.getOel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oel", lhsOel), LocatorUtils.property(thatLocator, "oel", rhsOel), lhsOel, rhsOel)) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsFernwaerme;
            lhsFernwaerme = this.getFernwaerme();
            JAXBElement<Object> rhsFernwaerme;
            rhsFernwaerme = that.getFernwaerme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fernwaerme", lhsFernwaerme), LocatorUtils.property(thatLocator, "fernwaerme", rhsFernwaerme), lhsFernwaerme, rhsFernwaerme)) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsStrom;
            lhsStrom = this.getStrom();
            JAXBElement<Object> rhsStrom;
            rhsStrom = that.getStrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strom", lhsStrom), LocatorUtils.property(thatLocator, "strom", rhsStrom), lhsStrom, rhsStrom)) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsKohle;
            lhsKohle = this.getKohle();
            JAXBElement<Object> rhsKohle;
            rhsKohle = that.getKohle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kohle", lhsKohle), LocatorUtils.property(thatLocator, "kohle", rhsKohle), lhsKohle, rhsKohle)) {
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
