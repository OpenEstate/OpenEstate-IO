
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for VermarktungGewerbeTyp2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VermarktungGewerbeTyp2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Miete"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Kaution" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Kauf" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="Nebenkosten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="PreisProParkflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="Preis" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}PreisAufAnfrage" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VermarktungGewerbeTyp2", propOrder = {
    "miete",
    "kauf"
})
public class VermarktungGewerbeTyp2 implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "Miete")
    protected VermarktungGewerbeTyp2 .Miete miete;
    @XmlElementRef(name = "Kauf", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<Object> kauf;
    @XmlAttribute(name = "Nebenkosten")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected BigDecimal nebenkosten;
    @XmlAttribute(name = "PreisProParkflaeche")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected BigDecimal preisProParkflaeche;
    @XmlAttribute(name = "Preis", required = true)
    @XmlJavaTypeAdapter(Adapter36 .class)
    protected BigDecimal preis;

    /**
     * Gets the value of the miete property.
     * 
     * @return
     *     possible object is
     *     {@link VermarktungGewerbeTyp2 .Miete }
     *     
     */
    public VermarktungGewerbeTyp2 .Miete getMiete() {
        return miete;
    }

    /**
     * Sets the value of the miete property.
     * 
     * @param value
     *     allowed object is
     *     {@link VermarktungGewerbeTyp2 .Miete }
     *     
     */
    public void setMiete(VermarktungGewerbeTyp2 .Miete value) {
        this.miete = value;
    }

    /**
     * Gets the value of the kauf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getKauf() {
        return kauf;
    }

    /**
     * Sets the value of the kauf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setKauf(JAXBElement<Object> value) {
        this.kauf = value;
    }

    /**
     * Gets the value of the nebenkosten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setNebenkosten(BigDecimal value) {
        this.nebenkosten = value;
    }

    /**
     * Gets the value of the preisProParkflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getPreisProParkflaeche() {
        return preisProParkflaeche;
    }

    /**
     * Sets the value of the preisProParkflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreisProParkflaeche(BigDecimal value) {
        this.preisProParkflaeche = value;
    }

    /**
     * Gets the value of the preis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getPreis() {
        return preis;
    }

    /**
     * Sets the value of the preis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreis(BigDecimal value) {
        this.preis = value;
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
            VermarktungGewerbeTyp2 .Miete theMiete;
            theMiete = this.getMiete();
            strategy.appendField(locator, this, "miete", buffer, theMiete, (this.miete!= null));
        }
        {
            JAXBElement<Object> theKauf;
            theKauf = this.getKauf();
            strategy.appendField(locator, this, "kauf", buffer, theKauf, (this.kauf!= null));
        }
        {
            BigDecimal theNebenkosten;
            theNebenkosten = this.getNebenkosten();
            strategy.appendField(locator, this, "nebenkosten", buffer, theNebenkosten, (this.nebenkosten!= null));
        }
        {
            BigDecimal thePreisProParkflaeche;
            thePreisProParkflaeche = this.getPreisProParkflaeche();
            strategy.appendField(locator, this, "preisProParkflaeche", buffer, thePreisProParkflaeche, (this.preisProParkflaeche!= null));
        }
        {
            BigDecimal thePreis;
            thePreis = this.getPreis();
            strategy.appendField(locator, this, "preis", buffer, thePreis, (this.preis!= null));
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
        if (draftCopy instanceof VermarktungGewerbeTyp2) {
            final VermarktungGewerbeTyp2 copy = ((VermarktungGewerbeTyp2) draftCopy);
            {
                Boolean mieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.miete!= null));
                if (mieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    VermarktungGewerbeTyp2 .Miete sourceMiete;
                    sourceMiete = this.getMiete();
                    VermarktungGewerbeTyp2 .Miete copyMiete = ((VermarktungGewerbeTyp2 .Miete) strategy.copy(LocatorUtils.property(locator, "miete", sourceMiete), sourceMiete, (this.miete!= null)));
                    copy.setMiete(copyMiete);
                } else {
                    if (mieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.miete = null;
                    }
                }
            }
            {
                Boolean kaufShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kauf!= null));
                if (kaufShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<Object> sourceKauf;
                    sourceKauf = this.getKauf();
                    @SuppressWarnings("unchecked")
                    JAXBElement<Object> copyKauf = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "kauf", sourceKauf), sourceKauf, (this.kauf!= null)));
                    copy.setKauf(copyKauf);
                } else {
                    if (kaufShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kauf = null;
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
                Boolean preisProParkflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.preisProParkflaeche!= null));
                if (preisProParkflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourcePreisProParkflaeche;
                    sourcePreisProParkflaeche = this.getPreisProParkflaeche();
                    BigDecimal copyPreisProParkflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "preisProParkflaeche", sourcePreisProParkflaeche), sourcePreisProParkflaeche, (this.preisProParkflaeche!= null)));
                    copy.setPreisProParkflaeche(copyPreisProParkflaeche);
                } else {
                    if (preisProParkflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.preisProParkflaeche = null;
                    }
                }
            }
            {
                Boolean preisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.preis!= null));
                if (preisShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourcePreis;
                    sourcePreis = this.getPreis();
                    BigDecimal copyPreis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "preis", sourcePreis), sourcePreis, (this.preis!= null)));
                    copy.setPreis(copyPreis);
                } else {
                    if (preisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.preis = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VermarktungGewerbeTyp2();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VermarktungGewerbeTyp2 that = ((VermarktungGewerbeTyp2) object);
        {
            VermarktungGewerbeTyp2 .Miete lhsMiete;
            lhsMiete = this.getMiete();
            VermarktungGewerbeTyp2 .Miete rhsMiete;
            rhsMiete = that.getMiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "miete", lhsMiete), LocatorUtils.property(thatLocator, "miete", rhsMiete), lhsMiete, rhsMiete, (this.miete!= null), (that.miete!= null))) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsKauf;
            lhsKauf = this.getKauf();
            JAXBElement<Object> rhsKauf;
            rhsKauf = that.getKauf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kauf", lhsKauf), LocatorUtils.property(thatLocator, "kauf", rhsKauf), lhsKauf, rhsKauf, (this.kauf!= null), (that.kauf!= null))) {
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
            BigDecimal lhsPreisProParkflaeche;
            lhsPreisProParkflaeche = this.getPreisProParkflaeche();
            BigDecimal rhsPreisProParkflaeche;
            rhsPreisProParkflaeche = that.getPreisProParkflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisProParkflaeche", lhsPreisProParkflaeche), LocatorUtils.property(thatLocator, "preisProParkflaeche", rhsPreisProParkflaeche), lhsPreisProParkflaeche, rhsPreisProParkflaeche, (this.preisProParkflaeche!= null), (that.preisProParkflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPreis;
            lhsPreis = this.getPreis();
            BigDecimal rhsPreis;
            rhsPreis = that.getPreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preis", lhsPreis), LocatorUtils.property(thatLocator, "preis", rhsPreis), lhsPreis, rhsPreis, (this.preis!= null), (that.preis!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
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
     *       &lt;attribute name="Kaution" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Miete implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlAttribute(name = "Kaution")
        @XmlJavaTypeAdapter(Adapter7 .class)
        protected String kaution;

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
                String theKaution;
                theKaution = this.getKaution();
                strategy.appendField(locator, this, "kaution", buffer, theKaution, (this.kaution!= null));
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
            if (draftCopy instanceof VermarktungGewerbeTyp2 .Miete) {
                final VermarktungGewerbeTyp2 .Miete copy = ((VermarktungGewerbeTyp2 .Miete) draftCopy);
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

        public Object createNewInstance() {
            return new VermarktungGewerbeTyp2 .Miete();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final VermarktungGewerbeTyp2 .Miete that = ((VermarktungGewerbeTyp2 .Miete) object);
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

        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

    }

}
