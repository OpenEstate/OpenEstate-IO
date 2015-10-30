
package org.openestate.io.is24_xml.xml;

import java.math.BigDecimal;
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
 * <p>Java class for EnergieausweisTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergieausweisTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Energieausweistyp" type="{http://www.immobilienscout24.de/immobilientransfer}EnergieausweistypTyp" /&gt;
 *       &lt;attribute name="Energieverbrauchskennwert" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl52Typ" /&gt;
 *       &lt;attribute name="WarmwasserEnthalten" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergieausweisTyp")
public class EnergieausweisTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "Energieausweistyp")
    protected EnergieausweistypTyp energieausweistyp;
    @XmlAttribute(name = "Energieverbrauchskennwert")
    @XmlJavaTypeAdapter(Adapter30 .class)
    protected BigDecimal energieverbrauchskennwert;
    @XmlAttribute(name = "WarmwasserEnthalten")
    protected Boolean warmwasserEnthalten;

    /**
     * Gets the value of the energieausweistyp property.
     * 
     * @return
     *     possible object is
     *     {@link EnergieausweistypTyp }
     *     
     */
    public EnergieausweistypTyp getEnergieausweistyp() {
        return energieausweistyp;
    }

    /**
     * Sets the value of the energieausweistyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergieausweistypTyp }
     *     
     */
    public void setEnergieausweistyp(EnergieausweistypTyp value) {
        this.energieausweistyp = value;
    }

    /**
     * Gets the value of the energieverbrauchskennwert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getEnergieverbrauchskennwert() {
        return energieverbrauchskennwert;
    }

    /**
     * Sets the value of the energieverbrauchskennwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergieverbrauchskennwert(BigDecimal value) {
        this.energieverbrauchskennwert = value;
    }

    /**
     * Gets the value of the warmwasserEnthalten property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarmwasserEnthalten() {
        return warmwasserEnthalten;
    }

    /**
     * Sets the value of the warmwasserEnthalten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarmwasserEnthalten(Boolean value) {
        this.warmwasserEnthalten = value;
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
            EnergieausweistypTyp theEnergieausweistyp;
            theEnergieausweistyp = this.getEnergieausweistyp();
            strategy.appendField(locator, this, "energieausweistyp", buffer, theEnergieausweistyp);
        }
        {
            BigDecimal theEnergieverbrauchskennwert;
            theEnergieverbrauchskennwert = this.getEnergieverbrauchskennwert();
            strategy.appendField(locator, this, "energieverbrauchskennwert", buffer, theEnergieverbrauchskennwert);
        }
        {
            Boolean theWarmwasserEnthalten;
            theWarmwasserEnthalten = this.isWarmwasserEnthalten();
            strategy.appendField(locator, this, "warmwasserEnthalten", buffer, theWarmwasserEnthalten);
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
        if (draftCopy instanceof EnergieausweisTyp) {
            final EnergieausweisTyp copy = ((EnergieausweisTyp) draftCopy);
            if (this.energieausweistyp!= null) {
                EnergieausweistypTyp sourceEnergieausweistyp;
                sourceEnergieausweistyp = this.getEnergieausweistyp();
                EnergieausweistypTyp copyEnergieausweistyp = ((EnergieausweistypTyp) strategy.copy(LocatorUtils.property(locator, "energieausweistyp", sourceEnergieausweistyp), sourceEnergieausweistyp));
                copy.setEnergieausweistyp(copyEnergieausweistyp);
            } else {
                copy.energieausweistyp = null;
            }
            if (this.energieverbrauchskennwert!= null) {
                BigDecimal sourceEnergieverbrauchskennwert;
                sourceEnergieverbrauchskennwert = this.getEnergieverbrauchskennwert();
                BigDecimal copyEnergieverbrauchskennwert = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "energieverbrauchskennwert", sourceEnergieverbrauchskennwert), sourceEnergieverbrauchskennwert));
                copy.setEnergieverbrauchskennwert(copyEnergieverbrauchskennwert);
            } else {
                copy.energieverbrauchskennwert = null;
            }
            if (this.warmwasserEnthalten!= null) {
                Boolean sourceWarmwasserEnthalten;
                sourceWarmwasserEnthalten = this.isWarmwasserEnthalten();
                Boolean copyWarmwasserEnthalten = ((Boolean) strategy.copy(LocatorUtils.property(locator, "warmwasserEnthalten", sourceWarmwasserEnthalten), sourceWarmwasserEnthalten));
                copy.setWarmwasserEnthalten(copyWarmwasserEnthalten);
            } else {
                copy.warmwasserEnthalten = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EnergieausweisTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EnergieausweisTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EnergieausweisTyp that = ((EnergieausweisTyp) object);
        {
            EnergieausweistypTyp lhsEnergieausweistyp;
            lhsEnergieausweistyp = this.getEnergieausweistyp();
            EnergieausweistypTyp rhsEnergieausweistyp;
            rhsEnergieausweistyp = that.getEnergieausweistyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieausweistyp", lhsEnergieausweistyp), LocatorUtils.property(thatLocator, "energieausweistyp", rhsEnergieausweistyp), lhsEnergieausweistyp, rhsEnergieausweistyp)) {
                return false;
            }
        }
        {
            BigDecimal lhsEnergieverbrauchskennwert;
            lhsEnergieverbrauchskennwert = this.getEnergieverbrauchskennwert();
            BigDecimal rhsEnergieverbrauchskennwert;
            rhsEnergieverbrauchskennwert = that.getEnergieverbrauchskennwert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieverbrauchskennwert", lhsEnergieverbrauchskennwert), LocatorUtils.property(thatLocator, "energieverbrauchskennwert", rhsEnergieverbrauchskennwert), lhsEnergieverbrauchskennwert, rhsEnergieverbrauchskennwert)) {
                return false;
            }
        }
        {
            Boolean lhsWarmwasserEnthalten;
            lhsWarmwasserEnthalten = this.isWarmwasserEnthalten();
            Boolean rhsWarmwasserEnthalten;
            rhsWarmwasserEnthalten = that.isWarmwasserEnthalten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warmwasserEnthalten", lhsWarmwasserEnthalten), LocatorUtils.property(thatLocator, "warmwasserEnthalten", rhsWarmwasserEnthalten), lhsWarmwasserEnthalten, rhsWarmwasserEnthalten)) {
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
