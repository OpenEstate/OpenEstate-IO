
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for VermarktungWohnKaufTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VermarktungWohnKaufTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Kaufpreis" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="Wohngeld" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="StellplatzKaufpreis" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="MieteinnahmenProMonat" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VermarktungWohnKaufTyp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public class VermarktungWohnKaufTyp implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "Kaufpreis", required = true)
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal kaufpreis;
    @XmlAttribute(name = "Wohngeld")
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal wohngeld;
    @XmlAttribute(name = "StellplatzKaufpreis")
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal stellplatzKaufpreis;
    @XmlAttribute(name = "MieteinnahmenProMonat")
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal mieteinnahmenProMonat;

    /**
     * Gets the value of the kaufpreis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getKaufpreis() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setKaufpreis(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getWohngeld() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setWohngeld(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getStellplatzKaufpreis() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setStellplatzKaufpreis(BigDecimal value) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getMieteinnahmenProMonat() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setMieteinnahmenProMonat(BigDecimal value) {
        this.mieteinnahmenProMonat = value;
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
            BigDecimal theKaufpreis;
            theKaufpreis = this.getKaufpreis();
            strategy.appendField(locator, this, "kaufpreis", buffer, theKaufpreis, (this.kaufpreis!= null));
        }
        {
            BigDecimal theWohngeld;
            theWohngeld = this.getWohngeld();
            strategy.appendField(locator, this, "wohngeld", buffer, theWohngeld, (this.wohngeld!= null));
        }
        {
            BigDecimal theStellplatzKaufpreis;
            theStellplatzKaufpreis = this.getStellplatzKaufpreis();
            strategy.appendField(locator, this, "stellplatzKaufpreis", buffer, theStellplatzKaufpreis, (this.stellplatzKaufpreis!= null));
        }
        {
            BigDecimal theMieteinnahmenProMonat;
            theMieteinnahmenProMonat = this.getMieteinnahmenProMonat();
            strategy.appendField(locator, this, "mieteinnahmenProMonat", buffer, theMieteinnahmenProMonat, (this.mieteinnahmenProMonat!= null));
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
        if (draftCopy instanceof VermarktungWohnKaufTyp) {
            final VermarktungWohnKaufTyp copy = ((VermarktungWohnKaufTyp) draftCopy);
            {
                Boolean kaufpreisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaufpreis!= null));
                if (kaufpreisShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKaufpreis;
                    sourceKaufpreis = this.getKaufpreis();
                    BigDecimal copyKaufpreis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaufpreis", sourceKaufpreis), sourceKaufpreis, (this.kaufpreis!= null)));
                    copy.setKaufpreis(copyKaufpreis);
                } else {
                    if (kaufpreisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kaufpreis = null;
                    }
                }
            }
            {
                Boolean wohngeldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wohngeld!= null));
                if (wohngeldShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWohngeld;
                    sourceWohngeld = this.getWohngeld();
                    BigDecimal copyWohngeld = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "wohngeld", sourceWohngeld), sourceWohngeld, (this.wohngeld!= null)));
                    copy.setWohngeld(copyWohngeld);
                } else {
                    if (wohngeldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohngeld = null;
                    }
                }
            }
            {
                Boolean stellplatzKaufpreisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stellplatzKaufpreis!= null));
                if (stellplatzKaufpreisShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceStellplatzKaufpreis;
                    sourceStellplatzKaufpreis = this.getStellplatzKaufpreis();
                    BigDecimal copyStellplatzKaufpreis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "stellplatzKaufpreis", sourceStellplatzKaufpreis), sourceStellplatzKaufpreis, (this.stellplatzKaufpreis!= null)));
                    copy.setStellplatzKaufpreis(copyStellplatzKaufpreis);
                } else {
                    if (stellplatzKaufpreisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stellplatzKaufpreis = null;
                    }
                }
            }
            {
                Boolean mieteinnahmenProMonatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mieteinnahmenProMonat!= null));
                if (mieteinnahmenProMonatShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMieteinnahmenProMonat;
                    sourceMieteinnahmenProMonat = this.getMieteinnahmenProMonat();
                    BigDecimal copyMieteinnahmenProMonat = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mieteinnahmenProMonat", sourceMieteinnahmenProMonat), sourceMieteinnahmenProMonat, (this.mieteinnahmenProMonat!= null)));
                    copy.setMieteinnahmenProMonat(copyMieteinnahmenProMonat);
                } else {
                    if (mieteinnahmenProMonatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mieteinnahmenProMonat = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new VermarktungWohnKaufTyp();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VermarktungWohnKaufTyp that = ((VermarktungWohnKaufTyp) object);
        {
            BigDecimal lhsKaufpreis;
            lhsKaufpreis = this.getKaufpreis();
            BigDecimal rhsKaufpreis;
            rhsKaufpreis = that.getKaufpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreis", lhsKaufpreis), LocatorUtils.property(thatLocator, "kaufpreis", rhsKaufpreis), lhsKaufpreis, rhsKaufpreis, (this.kaufpreis!= null), (that.kaufpreis!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWohngeld;
            lhsWohngeld = this.getWohngeld();
            BigDecimal rhsWohngeld;
            rhsWohngeld = that.getWohngeld();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohngeld", lhsWohngeld), LocatorUtils.property(thatLocator, "wohngeld", rhsWohngeld), lhsWohngeld, rhsWohngeld, (this.wohngeld!= null), (that.wohngeld!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsStellplatzKaufpreis;
            lhsStellplatzKaufpreis = this.getStellplatzKaufpreis();
            BigDecimal rhsStellplatzKaufpreis;
            rhsStellplatzKaufpreis = that.getStellplatzKaufpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stellplatzKaufpreis", lhsStellplatzKaufpreis), LocatorUtils.property(thatLocator, "stellplatzKaufpreis", rhsStellplatzKaufpreis), lhsStellplatzKaufpreis, rhsStellplatzKaufpreis, (this.stellplatzKaufpreis!= null), (that.stellplatzKaufpreis!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMieteinnahmenProMonat;
            lhsMieteinnahmenProMonat = this.getMieteinnahmenProMonat();
            BigDecimal rhsMieteinnahmenProMonat;
            rhsMieteinnahmenProMonat = that.getMieteinnahmenProMonat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mieteinnahmenProMonat", lhsMieteinnahmenProMonat), LocatorUtils.property(thatLocator, "mieteinnahmenProMonat", rhsMieteinnahmenProMonat), lhsMieteinnahmenProMonat, rhsMieteinnahmenProMonat, (this.mieteinnahmenProMonat!= null), (that.mieteinnahmenProMonat!= null))) {
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
