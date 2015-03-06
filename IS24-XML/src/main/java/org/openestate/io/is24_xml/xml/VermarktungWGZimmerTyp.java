
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
 * <p>Java class for VermarktungWGZimmerTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VermarktungWGZimmerTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Kaltmiete" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       &lt;attribute name="Warmmiete" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       &lt;attribute name="Nebenkosten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       &lt;attribute name="Heizkosten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       &lt;attribute name="HeizkostenInWarmmieteEnthalten" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Mindestmietdauer" type="{http://www.immobilienscout24.de/immobilientransfer}MindestmietdauerTyp" />
 *       &lt;attribute name="Kaution" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VermarktungWGZimmerTyp")
public class VermarktungWGZimmerTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "Kaltmiete", required = true)
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double kaltmiete;
    @XmlAttribute(name = "Warmmiete")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double warmmiete;
    @XmlAttribute(name = "Nebenkosten")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double nebenkosten;
    @XmlAttribute(name = "Heizkosten")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Double heizkosten;
    @XmlAttribute(name = "HeizkostenInWarmmieteEnthalten")
    protected Boolean heizkostenInWarmmieteEnthalten;
    @XmlAttribute(name = "Mindestmietdauer")
    protected MindestmietdauerTyp mindestmietdauer;
    @XmlAttribute(name = "Kaution")
    @XmlJavaTypeAdapter(Adapter14 .class)
    protected String kaution;

    /**
     * Gets the value of the kaltmiete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getKaltmiete() {
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
    public void setKaltmiete(Double value) {
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
    public Double getWarmmiete() {
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
    public void setWarmmiete(Double value) {
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
    public Double getNebenkosten() {
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
    public void setNebenkosten(Double value) {
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
    public Double getHeizkosten() {
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
    public void setHeizkosten(Double value) {
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
    public Boolean isHeizkostenInWarmmieteEnthalten() {
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
    public void setKaution(String value) {
        this.kaution = value;
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
            Double theKaltmiete;
            theKaltmiete = this.getKaltmiete();
            strategy.appendField(locator, this, "kaltmiete", buffer, theKaltmiete);
        }
        {
            Double theWarmmiete;
            theWarmmiete = this.getWarmmiete();
            strategy.appendField(locator, this, "warmmiete", buffer, theWarmmiete);
        }
        {
            Double theNebenkosten;
            theNebenkosten = this.getNebenkosten();
            strategy.appendField(locator, this, "nebenkosten", buffer, theNebenkosten);
        }
        {
            Double theHeizkosten;
            theHeizkosten = this.getHeizkosten();
            strategy.appendField(locator, this, "heizkosten", buffer, theHeizkosten);
        }
        {
            Boolean theHeizkostenInWarmmieteEnthalten;
            theHeizkostenInWarmmieteEnthalten = this.isHeizkostenInWarmmieteEnthalten();
            strategy.appendField(locator, this, "heizkostenInWarmmieteEnthalten", buffer, theHeizkostenInWarmmieteEnthalten);
        }
        {
            MindestmietdauerTyp theMindestmietdauer;
            theMindestmietdauer = this.getMindestmietdauer();
            strategy.appendField(locator, this, "mindestmietdauer", buffer, theMindestmietdauer);
        }
        {
            String theKaution;
            theKaution = this.getKaution();
            strategy.appendField(locator, this, "kaution", buffer, theKaution);
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
        if (draftCopy instanceof VermarktungWGZimmerTyp) {
            final VermarktungWGZimmerTyp copy = ((VermarktungWGZimmerTyp) draftCopy);
            if (this.kaltmiete!= null) {
                Double sourceKaltmiete;
                sourceKaltmiete = this.getKaltmiete();
                Double copyKaltmiete = ((Double) strategy.copy(LocatorUtils.property(locator, "kaltmiete", sourceKaltmiete), sourceKaltmiete));
                copy.setKaltmiete(copyKaltmiete);
            } else {
                copy.kaltmiete = null;
            }
            if (this.warmmiete!= null) {
                Double sourceWarmmiete;
                sourceWarmmiete = this.getWarmmiete();
                Double copyWarmmiete = ((Double) strategy.copy(LocatorUtils.property(locator, "warmmiete", sourceWarmmiete), sourceWarmmiete));
                copy.setWarmmiete(copyWarmmiete);
            } else {
                copy.warmmiete = null;
            }
            if (this.nebenkosten!= null) {
                Double sourceNebenkosten;
                sourceNebenkosten = this.getNebenkosten();
                Double copyNebenkosten = ((Double) strategy.copy(LocatorUtils.property(locator, "nebenkosten", sourceNebenkosten), sourceNebenkosten));
                copy.setNebenkosten(copyNebenkosten);
            } else {
                copy.nebenkosten = null;
            }
            if (this.heizkosten!= null) {
                Double sourceHeizkosten;
                sourceHeizkosten = this.getHeizkosten();
                Double copyHeizkosten = ((Double) strategy.copy(LocatorUtils.property(locator, "heizkosten", sourceHeizkosten), sourceHeizkosten));
                copy.setHeizkosten(copyHeizkosten);
            } else {
                copy.heizkosten = null;
            }
            if (this.heizkostenInWarmmieteEnthalten!= null) {
                Boolean sourceHeizkostenInWarmmieteEnthalten;
                sourceHeizkostenInWarmmieteEnthalten = this.isHeizkostenInWarmmieteEnthalten();
                Boolean copyHeizkostenInWarmmieteEnthalten = ((Boolean) strategy.copy(LocatorUtils.property(locator, "heizkostenInWarmmieteEnthalten", sourceHeizkostenInWarmmieteEnthalten), sourceHeizkostenInWarmmieteEnthalten));
                copy.setHeizkostenInWarmmieteEnthalten(copyHeizkostenInWarmmieteEnthalten);
            } else {
                copy.heizkostenInWarmmieteEnthalten = null;
            }
            if (this.mindestmietdauer!= null) {
                MindestmietdauerTyp sourceMindestmietdauer;
                sourceMindestmietdauer = this.getMindestmietdauer();
                MindestmietdauerTyp copyMindestmietdauer = ((MindestmietdauerTyp) strategy.copy(LocatorUtils.property(locator, "mindestmietdauer", sourceMindestmietdauer), sourceMindestmietdauer));
                copy.setMindestmietdauer(copyMindestmietdauer);
            } else {
                copy.mindestmietdauer = null;
            }
            if (this.kaution!= null) {
                String sourceKaution;
                sourceKaution = this.getKaution();
                String copyKaution = ((String) strategy.copy(LocatorUtils.property(locator, "kaution", sourceKaution), sourceKaution));
                copy.setKaution(copyKaution);
            } else {
                copy.kaution = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VermarktungWGZimmerTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VermarktungWGZimmerTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VermarktungWGZimmerTyp that = ((VermarktungWGZimmerTyp) object);
        {
            Double lhsKaltmiete;
            lhsKaltmiete = this.getKaltmiete();
            Double rhsKaltmiete;
            rhsKaltmiete = that.getKaltmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaltmiete", lhsKaltmiete), LocatorUtils.property(thatLocator, "kaltmiete", rhsKaltmiete), lhsKaltmiete, rhsKaltmiete)) {
                return false;
            }
        }
        {
            Double lhsWarmmiete;
            lhsWarmmiete = this.getWarmmiete();
            Double rhsWarmmiete;
            rhsWarmmiete = that.getWarmmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warmmiete", lhsWarmmiete), LocatorUtils.property(thatLocator, "warmmiete", rhsWarmmiete), lhsWarmmiete, rhsWarmmiete)) {
                return false;
            }
        }
        {
            Double lhsNebenkosten;
            lhsNebenkosten = this.getNebenkosten();
            Double rhsNebenkosten;
            rhsNebenkosten = that.getNebenkosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nebenkosten", lhsNebenkosten), LocatorUtils.property(thatLocator, "nebenkosten", rhsNebenkosten), lhsNebenkosten, rhsNebenkosten)) {
                return false;
            }
        }
        {
            Double lhsHeizkosten;
            lhsHeizkosten = this.getHeizkosten();
            Double rhsHeizkosten;
            rhsHeizkosten = that.getHeizkosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizkosten", lhsHeizkosten), LocatorUtils.property(thatLocator, "heizkosten", rhsHeizkosten), lhsHeizkosten, rhsHeizkosten)) {
                return false;
            }
        }
        {
            Boolean lhsHeizkostenInWarmmieteEnthalten;
            lhsHeizkostenInWarmmieteEnthalten = this.isHeizkostenInWarmmieteEnthalten();
            Boolean rhsHeizkostenInWarmmieteEnthalten;
            rhsHeizkostenInWarmmieteEnthalten = that.isHeizkostenInWarmmieteEnthalten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizkostenInWarmmieteEnthalten", lhsHeizkostenInWarmmieteEnthalten), LocatorUtils.property(thatLocator, "heizkostenInWarmmieteEnthalten", rhsHeizkostenInWarmmieteEnthalten), lhsHeizkostenInWarmmieteEnthalten, rhsHeizkostenInWarmmieteEnthalten)) {
                return false;
            }
        }
        {
            MindestmietdauerTyp lhsMindestmietdauer;
            lhsMindestmietdauer = this.getMindestmietdauer();
            MindestmietdauerTyp rhsMindestmietdauer;
            rhsMindestmietdauer = that.getMindestmietdauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mindestmietdauer", lhsMindestmietdauer), LocatorUtils.property(thatLocator, "mindestmietdauer", rhsMindestmietdauer), lhsMindestmietdauer, rhsMindestmietdauer)) {
                return false;
            }
        }
        {
            String lhsKaution;
            lhsKaution = this.getKaution();
            String rhsKaution;
            rhsKaution = that.getKaution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaution", lhsKaution), LocatorUtils.property(thatLocator, "kaution", rhsKaution), lhsKaution, rhsKaution)) {
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
