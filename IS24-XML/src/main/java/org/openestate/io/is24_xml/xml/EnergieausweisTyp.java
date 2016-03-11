
package org.openestate.io.is24_xml.xml;

import java.math.BigDecimal;
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
public class EnergieausweisTyp implements Cloneable, CopyTo2, Equals2, ToString2
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
            EnergieausweistypTyp theEnergieausweistyp;
            theEnergieausweistyp = this.getEnergieausweistyp();
            strategy.appendField(locator, this, "energieausweistyp", buffer, theEnergieausweistyp, (this.energieausweistyp!= null));
        }
        {
            BigDecimal theEnergieverbrauchskennwert;
            theEnergieverbrauchskennwert = this.getEnergieverbrauchskennwert();
            strategy.appendField(locator, this, "energieverbrauchskennwert", buffer, theEnergieverbrauchskennwert, (this.energieverbrauchskennwert!= null));
        }
        {
            Boolean theWarmwasserEnthalten;
            theWarmwasserEnthalten = this.isWarmwasserEnthalten();
            strategy.appendField(locator, this, "warmwasserEnthalten", buffer, theWarmwasserEnthalten, (this.warmwasserEnthalten!= null));
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
        if (draftCopy instanceof EnergieausweisTyp) {
            final EnergieausweisTyp copy = ((EnergieausweisTyp) draftCopy);
            {
                Boolean energieausweistypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energieausweistyp!= null));
                if (energieausweistypShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergieausweistypTyp sourceEnergieausweistyp;
                    sourceEnergieausweistyp = this.getEnergieausweistyp();
                    EnergieausweistypTyp copyEnergieausweistyp = ((EnergieausweistypTyp) strategy.copy(LocatorUtils.property(locator, "energieausweistyp", sourceEnergieausweistyp), sourceEnergieausweistyp, (this.energieausweistyp!= null)));
                    copy.setEnergieausweistyp(copyEnergieausweistyp);
                } else {
                    if (energieausweistypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energieausweistyp = null;
                    }
                }
            }
            {
                Boolean energieverbrauchskennwertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energieverbrauchskennwert!= null));
                if (energieverbrauchskennwertShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceEnergieverbrauchskennwert;
                    sourceEnergieverbrauchskennwert = this.getEnergieverbrauchskennwert();
                    BigDecimal copyEnergieverbrauchskennwert = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "energieverbrauchskennwert", sourceEnergieverbrauchskennwert), sourceEnergieverbrauchskennwert, (this.energieverbrauchskennwert!= null)));
                    copy.setEnergieverbrauchskennwert(copyEnergieverbrauchskennwert);
                } else {
                    if (energieverbrauchskennwertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energieverbrauchskennwert = null;
                    }
                }
            }
            {
                Boolean warmwasserEnthaltenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.warmwasserEnthalten!= null));
                if (warmwasserEnthaltenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWarmwasserEnthalten;
                    sourceWarmwasserEnthalten = this.isWarmwasserEnthalten();
                    Boolean copyWarmwasserEnthalten = ((Boolean) strategy.copy(LocatorUtils.property(locator, "warmwasserEnthalten", sourceWarmwasserEnthalten), sourceWarmwasserEnthalten, (this.warmwasserEnthalten!= null)));
                    copy.setWarmwasserEnthalten(copyWarmwasserEnthalten);
                } else {
                    if (warmwasserEnthaltenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.warmwasserEnthalten = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EnergieausweisTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieausweistyp", lhsEnergieausweistyp), LocatorUtils.property(thatLocator, "energieausweistyp", rhsEnergieausweistyp), lhsEnergieausweistyp, rhsEnergieausweistyp, (this.energieausweistyp!= null), (that.energieausweistyp!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsEnergieverbrauchskennwert;
            lhsEnergieverbrauchskennwert = this.getEnergieverbrauchskennwert();
            BigDecimal rhsEnergieverbrauchskennwert;
            rhsEnergieverbrauchskennwert = that.getEnergieverbrauchskennwert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieverbrauchskennwert", lhsEnergieverbrauchskennwert), LocatorUtils.property(thatLocator, "energieverbrauchskennwert", rhsEnergieverbrauchskennwert), lhsEnergieverbrauchskennwert, rhsEnergieverbrauchskennwert, (this.energieverbrauchskennwert!= null), (that.energieverbrauchskennwert!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWarmwasserEnthalten;
            lhsWarmwasserEnthalten = this.isWarmwasserEnthalten();
            Boolean rhsWarmwasserEnthalten;
            rhsWarmwasserEnthalten = that.isWarmwasserEnthalten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warmwasserEnthalten", lhsWarmwasserEnthalten), LocatorUtils.property(thatLocator, "warmwasserEnthalten", rhsWarmwasserEnthalten), lhsWarmwasserEnthalten, rhsWarmwasserEnthalten, (this.warmwasserEnthalten!= null), (that.warmwasserEnthalten!= null))) {
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
