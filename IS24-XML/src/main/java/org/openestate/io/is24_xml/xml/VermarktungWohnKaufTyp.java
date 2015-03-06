
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for VermarktungWohnKaufTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VermarktungWohnKaufTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Kaufpreis" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       &lt;attribute name="Wohngeld" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       &lt;attribute name="StellplatzKaufpreis" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       &lt;attribute name="MieteinnahmenProMonat" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VermarktungWohnKaufTyp")
public class VermarktungWohnKaufTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "Kaufpreis", required = true)
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double kaufpreis;
    @XmlAttribute(name = "Wohngeld")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double wohngeld;
    @XmlAttribute(name = "StellplatzKaufpreis")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double stellplatzKaufpreis;
    @XmlAttribute(name = "MieteinnahmenProMonat")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double mieteinnahmenProMonat;

    /**
     * Gets the value of the kaufpreis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getKaufpreis() {
        return kaufpreis;
    }

    /**
     * Sets the value of the kaufpreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKaufpreis(Double value) {
        this.kaufpreis = value;
    }

    /**
     * Gets the value of the wohngeld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getWohngeld() {
        return wohngeld;
    }

    /**
     * Sets the value of the wohngeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohngeld(Double value) {
        this.wohngeld = value;
    }

    /**
     * Gets the value of the stellplatzKaufpreis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getStellplatzKaufpreis() {
        return stellplatzKaufpreis;
    }

    /**
     * Sets the value of the stellplatzKaufpreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStellplatzKaufpreis(Double value) {
        this.stellplatzKaufpreis = value;
    }

    /**
     * Gets the value of the mieteinnahmenProMonat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getMieteinnahmenProMonat() {
        return mieteinnahmenProMonat;
    }

    /**
     * Sets the value of the mieteinnahmenProMonat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMieteinnahmenProMonat(Double value) {
        this.mieteinnahmenProMonat = value;
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
            Double theKaufpreis;
            theKaufpreis = this.getKaufpreis();
            strategy.appendField(locator, this, "kaufpreis", buffer, theKaufpreis);
        }
        {
            Double theWohngeld;
            theWohngeld = this.getWohngeld();
            strategy.appendField(locator, this, "wohngeld", buffer, theWohngeld);
        }
        {
            Double theStellplatzKaufpreis;
            theStellplatzKaufpreis = this.getStellplatzKaufpreis();
            strategy.appendField(locator, this, "stellplatzKaufpreis", buffer, theStellplatzKaufpreis);
        }
        {
            Double theMieteinnahmenProMonat;
            theMieteinnahmenProMonat = this.getMieteinnahmenProMonat();
            strategy.appendField(locator, this, "mieteinnahmenProMonat", buffer, theMieteinnahmenProMonat);
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
        if (draftCopy instanceof VermarktungWohnKaufTyp) {
            final VermarktungWohnKaufTyp copy = ((VermarktungWohnKaufTyp) draftCopy);
            if (this.kaufpreis!= null) {
                Double sourceKaufpreis;
                sourceKaufpreis = this.getKaufpreis();
                Double copyKaufpreis = ((Double) strategy.copy(LocatorUtils.property(locator, "kaufpreis", sourceKaufpreis), sourceKaufpreis));
                copy.setKaufpreis(copyKaufpreis);
            } else {
                copy.kaufpreis = null;
            }
            if (this.wohngeld!= null) {
                Double sourceWohngeld;
                sourceWohngeld = this.getWohngeld();
                Double copyWohngeld = ((Double) strategy.copy(LocatorUtils.property(locator, "wohngeld", sourceWohngeld), sourceWohngeld));
                copy.setWohngeld(copyWohngeld);
            } else {
                copy.wohngeld = null;
            }
            if (this.stellplatzKaufpreis!= null) {
                Double sourceStellplatzKaufpreis;
                sourceStellplatzKaufpreis = this.getStellplatzKaufpreis();
                Double copyStellplatzKaufpreis = ((Double) strategy.copy(LocatorUtils.property(locator, "stellplatzKaufpreis", sourceStellplatzKaufpreis), sourceStellplatzKaufpreis));
                copy.setStellplatzKaufpreis(copyStellplatzKaufpreis);
            } else {
                copy.stellplatzKaufpreis = null;
            }
            if (this.mieteinnahmenProMonat!= null) {
                Double sourceMieteinnahmenProMonat;
                sourceMieteinnahmenProMonat = this.getMieteinnahmenProMonat();
                Double copyMieteinnahmenProMonat = ((Double) strategy.copy(LocatorUtils.property(locator, "mieteinnahmenProMonat", sourceMieteinnahmenProMonat), sourceMieteinnahmenProMonat));
                copy.setMieteinnahmenProMonat(copyMieteinnahmenProMonat);
            } else {
                copy.mieteinnahmenProMonat = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VermarktungWohnKaufTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VermarktungWohnKaufTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VermarktungWohnKaufTyp that = ((VermarktungWohnKaufTyp) object);
        {
            Double lhsKaufpreis;
            lhsKaufpreis = this.getKaufpreis();
            Double rhsKaufpreis;
            rhsKaufpreis = that.getKaufpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreis", lhsKaufpreis), LocatorUtils.property(thatLocator, "kaufpreis", rhsKaufpreis), lhsKaufpreis, rhsKaufpreis)) {
                return false;
            }
        }
        {
            Double lhsWohngeld;
            lhsWohngeld = this.getWohngeld();
            Double rhsWohngeld;
            rhsWohngeld = that.getWohngeld();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohngeld", lhsWohngeld), LocatorUtils.property(thatLocator, "wohngeld", rhsWohngeld), lhsWohngeld, rhsWohngeld)) {
                return false;
            }
        }
        {
            Double lhsStellplatzKaufpreis;
            lhsStellplatzKaufpreis = this.getStellplatzKaufpreis();
            Double rhsStellplatzKaufpreis;
            rhsStellplatzKaufpreis = that.getStellplatzKaufpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stellplatzKaufpreis", lhsStellplatzKaufpreis), LocatorUtils.property(thatLocator, "stellplatzKaufpreis", rhsStellplatzKaufpreis), lhsStellplatzKaufpreis, rhsStellplatzKaufpreis)) {
                return false;
            }
        }
        {
            Double lhsMieteinnahmenProMonat;
            lhsMieteinnahmenProMonat = this.getMieteinnahmenProMonat();
            Double rhsMieteinnahmenProMonat;
            rhsMieteinnahmenProMonat = that.getMieteinnahmenProMonat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mieteinnahmenProMonat", lhsMieteinnahmenProMonat), LocatorUtils.property(thatLocator, "mieteinnahmenProMonat", rhsMieteinnahmenProMonat), lhsMieteinnahmenProMonat, rhsMieteinnahmenProMonat)) {
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
