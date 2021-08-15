
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
 * <p>Java class for VermarktungWGZimmerTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VermarktungWGZimmerTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Kaltmiete" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="Warmmiete" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="Nebenkosten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="Heizkosten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="HeizkostenInWarmmieteEnthalten" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Mindestmietdauer" type="{http://www.immobilienscout24.de/immobilientransfer}MindestmietdauerTyp" /&gt;
 *       &lt;attribute name="Kaution" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VermarktungWGZimmerTyp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
public class VermarktungWGZimmerTyp implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "Kaltmiete", required = true)
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal kaltmiete;
    @XmlAttribute(name = "Warmmiete")
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal warmmiete;
    @XmlAttribute(name = "Nebenkosten")
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal nebenkosten;
    @XmlAttribute(name = "Heizkosten")
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal heizkosten;
    @XmlAttribute(name = "HeizkostenInWarmmieteEnthalten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean heizkostenInWarmmieteEnthalten;
    @XmlAttribute(name = "Mindestmietdauer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected MindestmietdauerTyp mindestmietdauer;
    @XmlAttribute(name = "Kaution")
    @XmlJavaTypeAdapter(Adapter7 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected String kaution;

    /**
     * Gets the value of the kaltmiete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getKaltmiete() {
        return kaltmiete;
    }

    /**
     * Sets the value of the kaltmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setKaltmiete(BigDecimal value) {
        this.kaltmiete = value;
    }

    /**
     * Gets the value of the warmmiete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getWarmmiete() {
        return warmmiete;
    }

    /**
     * Sets the value of the warmmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setWarmmiete(BigDecimal value) {
        this.warmmiete = value;
    }

    /**
     * Gets the value of the nebenkosten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getNebenkosten() {
        return nebenkosten;
    }

    /**
     * Sets the value of the nebenkosten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setNebenkosten(BigDecimal value) {
        this.nebenkosten = value;
    }

    /**
     * Gets the value of the heizkosten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getHeizkosten() {
        return heizkosten;
    }

    /**
     * Sets the value of the heizkosten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setHeizkosten(BigDecimal value) {
        this.heizkosten = value;
    }

    /**
     * Gets the value of the heizkostenInWarmmieteEnthalten property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getHeizkostenInWarmmieteEnthalten() {
        return heizkostenInWarmmieteEnthalten;
    }

    /**
     * Sets the value of the heizkostenInWarmmieteEnthalten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setHeizkostenInWarmmieteEnthalten(Boolean value) {
        this.heizkostenInWarmmieteEnthalten = value;
    }

    /**
     * Gets the value of the mindestmietdauer property.
     * 
     * @return
     *     possible object is
     *     {@link MindestmietdauerTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public MindestmietdauerTyp getMindestmietdauer() {
        return mindestmietdauer;
    }

    /**
     * Sets the value of the mindestmietdauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MindestmietdauerTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setMindestmietdauer(MindestmietdauerTyp value) {
        this.mindestmietdauer = value;
    }

    /**
     * Gets the value of the kaution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public String getKaution() {
        return kaution;
    }

    /**
     * Sets the value of the kaution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setKaution(String value) {
        this.kaution = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            BigDecimal theKaltmiete;
            theKaltmiete = this.getKaltmiete();
            strategy.appendField(locator, this, "kaltmiete", buffer, theKaltmiete, (this.kaltmiete!= null));
        }
        {
            BigDecimal theWarmmiete;
            theWarmmiete = this.getWarmmiete();
            strategy.appendField(locator, this, "warmmiete", buffer, theWarmmiete, (this.warmmiete!= null));
        }
        {
            BigDecimal theNebenkosten;
            theNebenkosten = this.getNebenkosten();
            strategy.appendField(locator, this, "nebenkosten", buffer, theNebenkosten, (this.nebenkosten!= null));
        }
        {
            BigDecimal theHeizkosten;
            theHeizkosten = this.getHeizkosten();
            strategy.appendField(locator, this, "heizkosten", buffer, theHeizkosten, (this.heizkosten!= null));
        }
        {
            Boolean theHeizkostenInWarmmieteEnthalten;
            theHeizkostenInWarmmieteEnthalten = this.getHeizkostenInWarmmieteEnthalten();
            strategy.appendField(locator, this, "heizkostenInWarmmieteEnthalten", buffer, theHeizkostenInWarmmieteEnthalten, (this.heizkostenInWarmmieteEnthalten!= null));
        }
        {
            MindestmietdauerTyp theMindestmietdauer;
            theMindestmietdauer = this.getMindestmietdauer();
            strategy.appendField(locator, this, "mindestmietdauer", buffer, theMindestmietdauer, (this.mindestmietdauer!= null));
        }
        {
            String theKaution;
            theKaution = this.getKaution();
            strategy.appendField(locator, this, "kaution", buffer, theKaution, (this.kaution!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof VermarktungWGZimmerTyp) {
            final VermarktungWGZimmerTyp copy = ((VermarktungWGZimmerTyp) draftCopy);
            {
                Boolean kaltmieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaltmiete!= null));
                if (kaltmieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKaltmiete;
                    sourceKaltmiete = this.getKaltmiete();
                    BigDecimal copyKaltmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaltmiete", sourceKaltmiete), sourceKaltmiete, (this.kaltmiete!= null)));
                    copy.setKaltmiete(copyKaltmiete);
                } else {
                    if (kaltmieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kaltmiete = null;
                    }
                }
            }
            {
                Boolean warmmieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.warmmiete!= null));
                if (warmmieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWarmmiete;
                    sourceWarmmiete = this.getWarmmiete();
                    BigDecimal copyWarmmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "warmmiete", sourceWarmmiete), sourceWarmmiete, (this.warmmiete!= null)));
                    copy.setWarmmiete(copyWarmmiete);
                } else {
                    if (warmmieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.warmmiete = null;
                    }
                }
            }
            {
                Boolean nebenkostenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nebenkosten!= null));
                if (nebenkostenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNebenkosten;
                    sourceNebenkosten = this.getNebenkosten();
                    BigDecimal copyNebenkosten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nebenkosten", sourceNebenkosten), sourceNebenkosten, (this.nebenkosten!= null)));
                    copy.setNebenkosten(copyNebenkosten);
                } else {
                    if (nebenkostenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nebenkosten = null;
                    }
                }
            }
            {
                Boolean heizkostenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heizkosten!= null));
                if (heizkostenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHeizkosten;
                    sourceHeizkosten = this.getHeizkosten();
                    BigDecimal copyHeizkosten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "heizkosten", sourceHeizkosten), sourceHeizkosten, (this.heizkosten!= null)));
                    copy.setHeizkosten(copyHeizkosten);
                } else {
                    if (heizkostenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heizkosten = null;
                    }
                }
            }
            {
                Boolean heizkostenInWarmmieteEnthaltenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heizkostenInWarmmieteEnthalten!= null));
                if (heizkostenInWarmmieteEnthaltenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceHeizkostenInWarmmieteEnthalten;
                    sourceHeizkostenInWarmmieteEnthalten = this.getHeizkostenInWarmmieteEnthalten();
                    Boolean copyHeizkostenInWarmmieteEnthalten = ((Boolean) strategy.copy(LocatorUtils.property(locator, "heizkostenInWarmmieteEnthalten", sourceHeizkostenInWarmmieteEnthalten), sourceHeizkostenInWarmmieteEnthalten, (this.heizkostenInWarmmieteEnthalten!= null)));
                    copy.setHeizkostenInWarmmieteEnthalten(copyHeizkostenInWarmmieteEnthalten);
                } else {
                    if (heizkostenInWarmmieteEnthaltenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heizkostenInWarmmieteEnthalten = null;
                    }
                }
            }
            {
                Boolean mindestmietdauerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mindestmietdauer!= null));
                if (mindestmietdauerShouldBeCopiedAndSet == Boolean.TRUE) {
                    MindestmietdauerTyp sourceMindestmietdauer;
                    sourceMindestmietdauer = this.getMindestmietdauer();
                    MindestmietdauerTyp copyMindestmietdauer = ((MindestmietdauerTyp) strategy.copy(LocatorUtils.property(locator, "mindestmietdauer", sourceMindestmietdauer), sourceMindestmietdauer, (this.mindestmietdauer!= null)));
                    copy.setMindestmietdauer(copyMindestmietdauer);
                } else {
                    if (mindestmietdauerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mindestmietdauer = null;
                    }
                }
            }
            {
                Boolean kautionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaution!= null));
                if (kautionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKaution;
                    sourceKaution = this.getKaution();
                    String copyKaution = ((String) strategy.copy(LocatorUtils.property(locator, "kaution", sourceKaution), sourceKaution, (this.kaution!= null)));
                    copy.setKaution(copyKaution);
                } else {
                    if (kautionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kaution = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new VermarktungWGZimmerTyp();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VermarktungWGZimmerTyp that = ((VermarktungWGZimmerTyp) object);
        {
            BigDecimal lhsKaltmiete;
            lhsKaltmiete = this.getKaltmiete();
            BigDecimal rhsKaltmiete;
            rhsKaltmiete = that.getKaltmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaltmiete", lhsKaltmiete), LocatorUtils.property(thatLocator, "kaltmiete", rhsKaltmiete), lhsKaltmiete, rhsKaltmiete, (this.kaltmiete!= null), (that.kaltmiete!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWarmmiete;
            lhsWarmmiete = this.getWarmmiete();
            BigDecimal rhsWarmmiete;
            rhsWarmmiete = that.getWarmmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warmmiete", lhsWarmmiete), LocatorUtils.property(thatLocator, "warmmiete", rhsWarmmiete), lhsWarmmiete, rhsWarmmiete, (this.warmmiete!= null), (that.warmmiete!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNebenkosten;
            lhsNebenkosten = this.getNebenkosten();
            BigDecimal rhsNebenkosten;
            rhsNebenkosten = that.getNebenkosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nebenkosten", lhsNebenkosten), LocatorUtils.property(thatLocator, "nebenkosten", rhsNebenkosten), lhsNebenkosten, rhsNebenkosten, (this.nebenkosten!= null), (that.nebenkosten!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHeizkosten;
            lhsHeizkosten = this.getHeizkosten();
            BigDecimal rhsHeizkosten;
            rhsHeizkosten = that.getHeizkosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizkosten", lhsHeizkosten), LocatorUtils.property(thatLocator, "heizkosten", rhsHeizkosten), lhsHeizkosten, rhsHeizkosten, (this.heizkosten!= null), (that.heizkosten!= null))) {
                return false;
            }
        }
        {
            Boolean lhsHeizkostenInWarmmieteEnthalten;
            lhsHeizkostenInWarmmieteEnthalten = this.getHeizkostenInWarmmieteEnthalten();
            Boolean rhsHeizkostenInWarmmieteEnthalten;
            rhsHeizkostenInWarmmieteEnthalten = that.getHeizkostenInWarmmieteEnthalten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizkostenInWarmmieteEnthalten", lhsHeizkostenInWarmmieteEnthalten), LocatorUtils.property(thatLocator, "heizkostenInWarmmieteEnthalten", rhsHeizkostenInWarmmieteEnthalten), lhsHeizkostenInWarmmieteEnthalten, rhsHeizkostenInWarmmieteEnthalten, (this.heizkostenInWarmmieteEnthalten!= null), (that.heizkostenInWarmmieteEnthalten!= null))) {
                return false;
            }
        }
        {
            MindestmietdauerTyp lhsMindestmietdauer;
            lhsMindestmietdauer = this.getMindestmietdauer();
            MindestmietdauerTyp rhsMindestmietdauer;
            rhsMindestmietdauer = that.getMindestmietdauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mindestmietdauer", lhsMindestmietdauer), LocatorUtils.property(thatLocator, "mindestmietdauer", rhsMindestmietdauer), lhsMindestmietdauer, rhsMindestmietdauer, (this.mindestmietdauer!= null), (that.mindestmietdauer!= null))) {
                return false;
            }
        }
        {
            String lhsKaution;
            lhsKaution = this.getKaution();
            String rhsKaution;
            rhsKaution = that.getKaution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaution", lhsKaution), LocatorUtils.property(thatLocator, "kaution", rhsKaution), lhsKaution, rhsKaution, (this.kaution!= null), (that.kaution!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
