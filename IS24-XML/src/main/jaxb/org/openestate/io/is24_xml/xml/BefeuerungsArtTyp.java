
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
public class BefeuerungsArtTyp implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElementRef(name = "KeineAngabe", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> keineAngabe;
    @XmlElementRef(name = "Erdwaerme", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> erdwaerme;
    @XmlElementRef(name = "Solarheizung", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> solarheizung;
    @XmlElementRef(name = "Pelletheizung", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> pelletheizung;
    @XmlElementRef(name = "Gas", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> gas;
    @XmlElementRef(name = "Oel", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> oel;
    @XmlElementRef(name = "Fernwaerme", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> fernwaerme;
    @XmlElementRef(name = "Strom", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> strom;
    @XmlElementRef(name = "Kohle", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
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
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            JAXBElement<Object> theKeineAngabe;
            theKeineAngabe = this.getKeineAngabe();
            strategy.appendField(locator, this, "keineAngabe", buffer, theKeineAngabe, (this.keineAngabe!= null));
        }
        {
            JAXBElement<Object> theErdwaerme;
            theErdwaerme = this.getErdwaerme();
            strategy.appendField(locator, this, "erdwaerme", buffer, theErdwaerme, (this.erdwaerme!= null));
        }
        {
            JAXBElement<Object> theSolarheizung;
            theSolarheizung = this.getSolarheizung();
            strategy.appendField(locator, this, "solarheizung", buffer, theSolarheizung, (this.solarheizung!= null));
        }
        {
            JAXBElement<Object> thePelletheizung;
            thePelletheizung = this.getPelletheizung();
            strategy.appendField(locator, this, "pelletheizung", buffer, thePelletheizung, (this.pelletheizung!= null));
        }
        {
            JAXBElement<Object> theGas;
            theGas = this.getGas();
            strategy.appendField(locator, this, "gas", buffer, theGas, (this.gas!= null));
        }
        {
            JAXBElement<Object> theOel;
            theOel = this.getOel();
            strategy.appendField(locator, this, "oel", buffer, theOel, (this.oel!= null));
        }
        {
            JAXBElement<Object> theFernwaerme;
            theFernwaerme = this.getFernwaerme();
            strategy.appendField(locator, this, "fernwaerme", buffer, theFernwaerme, (this.fernwaerme!= null));
        }
        {
            JAXBElement<Object> theStrom;
            theStrom = this.getStrom();
            strategy.appendField(locator, this, "strom", buffer, theStrom, (this.strom!= null));
        }
        {
            JAXBElement<Object> theKohle;
            theKohle = this.getKohle();
            strategy.appendField(locator, this, "kohle", buffer, theKohle, (this.kohle!= null));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof BefeuerungsArtTyp) {
            final BefeuerungsArtTyp copy = ((BefeuerungsArtTyp) draftCopy);
            {
                Boolean keineAngabeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.keineAngabe!= null));
                if (keineAngabeShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceKeineAngabe;
                    sourceKeineAngabe = this.getKeineAngabe();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyKeineAngabe = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "keineAngabe", sourceKeineAngabe), sourceKeineAngabe, (this.keineAngabe!= null)));
                    copy.setKeineAngabe(copyKeineAngabe);
                } else {
                    if (keineAngabeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.keineAngabe = null;
                    }
                }
            }
            {
                Boolean erdwaermeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erdwaerme!= null));
                if (erdwaermeShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceErdwaerme;
                    sourceErdwaerme = this.getErdwaerme();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyErdwaerme = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "erdwaerme", sourceErdwaerme), sourceErdwaerme, (this.erdwaerme!= null)));
                    copy.setErdwaerme(copyErdwaerme);
                } else {
                    if (erdwaermeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erdwaerme = null;
                    }
                }
            }
            {
                Boolean solarheizungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.solarheizung!= null));
                if (solarheizungShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceSolarheizung;
                    sourceSolarheizung = this.getSolarheizung();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copySolarheizung = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "solarheizung", sourceSolarheizung), sourceSolarheizung, (this.solarheizung!= null)));
                    copy.setSolarheizung(copySolarheizung);
                } else {
                    if (solarheizungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.solarheizung = null;
                    }
                }
            }
            {
                Boolean pelletheizungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pelletheizung!= null));
                if (pelletheizungShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourcePelletheizung;
                    sourcePelletheizung = this.getPelletheizung();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyPelletheizung = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "pelletheizung", sourcePelletheizung), sourcePelletheizung, (this.pelletheizung!= null)));
                    copy.setPelletheizung(copyPelletheizung);
                } else {
                    if (pelletheizungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pelletheizung = null;
                    }
                }
            }
            {
                Boolean gasShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gas!= null));
                if (gasShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceGas;
                    sourceGas = this.getGas();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyGas = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "gas", sourceGas), sourceGas, (this.gas!= null)));
                    copy.setGas(copyGas);
                } else {
                    if (gasShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gas = null;
                    }
                }
            }
            {
                Boolean oelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.oel!= null));
                if (oelShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceOel;
                    sourceOel = this.getOel();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyOel = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "oel", sourceOel), sourceOel, (this.oel!= null)));
                    copy.setOel(copyOel);
                } else {
                    if (oelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.oel = null;
                    }
                }
            }
            {
                Boolean fernwaermeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fernwaerme!= null));
                if (fernwaermeShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceFernwaerme;
                    sourceFernwaerme = this.getFernwaerme();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyFernwaerme = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "fernwaerme", sourceFernwaerme), sourceFernwaerme, (this.fernwaerme!= null)));
                    copy.setFernwaerme(copyFernwaerme);
                } else {
                    if (fernwaermeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fernwaerme = null;
                    }
                }
            }
            {
                Boolean stromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.strom!= null));
                if (stromShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceStrom;
                    sourceStrom = this.getStrom();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyStrom = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "strom", sourceStrom), sourceStrom, (this.strom!= null)));
                    copy.setStrom(copyStrom);
                } else {
                    if (stromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.strom = null;
                    }
                }
            }
            {
                Boolean kohleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kohle!= null));
                if (kohleShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceKohle;
                    sourceKohle = this.getKohle();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyKohle = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "kohle", sourceKohle), sourceKohle, (this.kohle!= null)));
                    copy.setKohle(copyKohle);
                } else {
                    if (kohleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kohle = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BefeuerungsArtTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keineAngabe", lhsKeineAngabe), LocatorUtils.property(thatLocator, "keineAngabe", rhsKeineAngabe), lhsKeineAngabe, rhsKeineAngabe, (this.keineAngabe!= null), (that.keineAngabe!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsErdwaerme;
            lhsErdwaerme = this.getErdwaerme();
            JAXBElement<Object> rhsErdwaerme;
            rhsErdwaerme = that.getErdwaerme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erdwaerme", lhsErdwaerme), LocatorUtils.property(thatLocator, "erdwaerme", rhsErdwaerme), lhsErdwaerme, rhsErdwaerme, (this.erdwaerme!= null), (that.erdwaerme!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsSolarheizung;
            lhsSolarheizung = this.getSolarheizung();
            JAXBElement<Object> rhsSolarheizung;
            rhsSolarheizung = that.getSolarheizung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "solarheizung", lhsSolarheizung), LocatorUtils.property(thatLocator, "solarheizung", rhsSolarheizung), lhsSolarheizung, rhsSolarheizung, (this.solarheizung!= null), (that.solarheizung!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsPelletheizung;
            lhsPelletheizung = this.getPelletheizung();
            JAXBElement<Object> rhsPelletheizung;
            rhsPelletheizung = that.getPelletheizung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pelletheizung", lhsPelletheizung), LocatorUtils.property(thatLocator, "pelletheizung", rhsPelletheizung), lhsPelletheizung, rhsPelletheizung, (this.pelletheizung!= null), (that.pelletheizung!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsGas;
            lhsGas = this.getGas();
            JAXBElement<Object> rhsGas;
            rhsGas = that.getGas();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gas", lhsGas), LocatorUtils.property(thatLocator, "gas", rhsGas), lhsGas, rhsGas, (this.gas!= null), (that.gas!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsOel;
            lhsOel = this.getOel();
            JAXBElement<Object> rhsOel;
            rhsOel = that.getOel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oel", lhsOel), LocatorUtils.property(thatLocator, "oel", rhsOel), lhsOel, rhsOel, (this.oel!= null), (that.oel!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsFernwaerme;
            lhsFernwaerme = this.getFernwaerme();
            JAXBElement<Object> rhsFernwaerme;
            rhsFernwaerme = that.getFernwaerme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fernwaerme", lhsFernwaerme), LocatorUtils.property(thatLocator, "fernwaerme", rhsFernwaerme), lhsFernwaerme, rhsFernwaerme, (this.fernwaerme!= null), (that.fernwaerme!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsStrom;
            lhsStrom = this.getStrom();
            JAXBElement<Object> rhsStrom;
            rhsStrom = that.getStrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strom", lhsStrom), LocatorUtils.property(thatLocator, "strom", rhsStrom), lhsStrom, rhsStrom, (this.strom!= null), (that.strom!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsKohle;
            lhsKohle = this.getKohle();
            JAXBElement<Object> rhsKohle;
            rhsKohle = that.getKohle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kohle", lhsKohle), LocatorUtils.property(thatLocator, "kohle", rhsKohle), lhsKohle, rhsKohle, (this.kohle!= null), (that.kohle!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
