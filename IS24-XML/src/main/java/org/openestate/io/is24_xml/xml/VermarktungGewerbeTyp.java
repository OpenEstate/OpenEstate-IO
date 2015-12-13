
package org.openestate.io.is24_xml.xml;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for VermarktungGewerbeTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VermarktungGewerbeTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Miete"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Pro" type="{http://www.immobilienscout24.de/immobilientransfer}MieteEinheitTyp" default="Monat" /&gt;
 *                 &lt;attribute name="Kaltmiete" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}PreisAufAnfrage" /&gt;
 *                 &lt;attribute name="Kaution" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Kauf"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Preis" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}PreisAufAnfrage" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="PreisParkflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="Nebenkosten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VermarktungGewerbeTyp", propOrder = {
    "miete",
    "kauf"
})
public class VermarktungGewerbeTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElementRef(name = "Miete", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<VermarktungGewerbeTyp.Miete> miete;
    @XmlElementRef(name = "Kauf", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<VermarktungGewerbeTyp.Kauf> kauf;
    @XmlAttribute(name = "PreisParkflaeche")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected BigDecimal preisParkflaeche;
    @XmlAttribute(name = "Nebenkosten")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected BigDecimal nebenkosten;

    /**
     * Gets the value of the miete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGewerbeTyp.Miete }{@code >}
     *     
     */
    public JAXBElement<VermarktungGewerbeTyp.Miete> getMiete() {
        return miete;
    }

    /**
     * Sets the value of the miete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGewerbeTyp.Miete }{@code >}
     *     
     */
    public void setMiete(JAXBElement<VermarktungGewerbeTyp.Miete> value) {
        this.miete = value;
    }

    /**
     * Gets the value of the kauf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGewerbeTyp.Kauf }{@code >}
     *     
     */
    public JAXBElement<VermarktungGewerbeTyp.Kauf> getKauf() {
        return kauf;
    }

    /**
     * Sets the value of the kauf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGewerbeTyp.Kauf }{@code >}
     *     
     */
    public void setKauf(JAXBElement<VermarktungGewerbeTyp.Kauf> value) {
        this.kauf = value;
    }

    /**
     * Gets the value of the preisParkflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getPreisParkflaeche() {
        return preisParkflaeche;
    }

    /**
     * Sets the value of the preisParkflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreisParkflaeche(BigDecimal value) {
        this.preisParkflaeche = value;
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
            JAXBElement<VermarktungGewerbeTyp.Miete> theMiete;
            theMiete = this.getMiete();
            strategy.appendField(locator, this, "miete", buffer, theMiete);
        }
        {
            JAXBElement<VermarktungGewerbeTyp.Kauf> theKauf;
            theKauf = this.getKauf();
            strategy.appendField(locator, this, "kauf", buffer, theKauf);
        }
        {
            BigDecimal thePreisParkflaeche;
            thePreisParkflaeche = this.getPreisParkflaeche();
            strategy.appendField(locator, this, "preisParkflaeche", buffer, thePreisParkflaeche);
        }
        {
            BigDecimal theNebenkosten;
            theNebenkosten = this.getNebenkosten();
            strategy.appendField(locator, this, "nebenkosten", buffer, theNebenkosten);
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
        if (draftCopy instanceof VermarktungGewerbeTyp) {
            final VermarktungGewerbeTyp copy = ((VermarktungGewerbeTyp) draftCopy);
            if (this.miete!= null) {
                JAXBElement<VermarktungGewerbeTyp.Miete> sourceMiete;
                sourceMiete = this.getMiete();
                @SuppressWarnings("unchecked")
                JAXBElement<VermarktungGewerbeTyp.Miete> copyMiete = ((JAXBElement<VermarktungGewerbeTyp.Miete> ) strategy.copy(LocatorUtils.property(locator, "miete", sourceMiete), sourceMiete));
                copy.setMiete(copyMiete);
            } else {
                copy.miete = null;
            }
            if (this.kauf!= null) {
                JAXBElement<VermarktungGewerbeTyp.Kauf> sourceKauf;
                sourceKauf = this.getKauf();
                @SuppressWarnings("unchecked")
                JAXBElement<VermarktungGewerbeTyp.Kauf> copyKauf = ((JAXBElement<VermarktungGewerbeTyp.Kauf> ) strategy.copy(LocatorUtils.property(locator, "kauf", sourceKauf), sourceKauf));
                copy.setKauf(copyKauf);
            } else {
                copy.kauf = null;
            }
            if (this.preisParkflaeche!= null) {
                BigDecimal sourcePreisParkflaeche;
                sourcePreisParkflaeche = this.getPreisParkflaeche();
                BigDecimal copyPreisParkflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "preisParkflaeche", sourcePreisParkflaeche), sourcePreisParkflaeche));
                copy.setPreisParkflaeche(copyPreisParkflaeche);
            } else {
                copy.preisParkflaeche = null;
            }
            if (this.nebenkosten!= null) {
                BigDecimal sourceNebenkosten;
                sourceNebenkosten = this.getNebenkosten();
                BigDecimal copyNebenkosten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nebenkosten", sourceNebenkosten), sourceNebenkosten));
                copy.setNebenkosten(copyNebenkosten);
            } else {
                copy.nebenkosten = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VermarktungGewerbeTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VermarktungGewerbeTyp that = ((VermarktungGewerbeTyp) object);
        {
            JAXBElement<VermarktungGewerbeTyp.Miete> lhsMiete;
            lhsMiete = this.getMiete();
            JAXBElement<VermarktungGewerbeTyp.Miete> rhsMiete;
            rhsMiete = that.getMiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "miete", lhsMiete), LocatorUtils.property(thatLocator, "miete", rhsMiete), lhsMiete, rhsMiete)) {
                return false;
            }
        }
        {
            JAXBElement<VermarktungGewerbeTyp.Kauf> lhsKauf;
            lhsKauf = this.getKauf();
            JAXBElement<VermarktungGewerbeTyp.Kauf> rhsKauf;
            rhsKauf = that.getKauf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kauf", lhsKauf), LocatorUtils.property(thatLocator, "kauf", rhsKauf), lhsKauf, rhsKauf)) {
                return false;
            }
        }
        {
            BigDecimal lhsPreisParkflaeche;
            lhsPreisParkflaeche = this.getPreisParkflaeche();
            BigDecimal rhsPreisParkflaeche;
            rhsPreisParkflaeche = that.getPreisParkflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisParkflaeche", lhsPreisParkflaeche), LocatorUtils.property(thatLocator, "preisParkflaeche", rhsPreisParkflaeche), lhsPreisParkflaeche, rhsPreisParkflaeche)) {
                return false;
            }
        }
        {
            BigDecimal lhsNebenkosten;
            lhsNebenkosten = this.getNebenkosten();
            BigDecimal rhsNebenkosten;
            rhsNebenkosten = that.getNebenkosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nebenkosten", lhsNebenkosten), LocatorUtils.property(thatLocator, "nebenkosten", rhsNebenkosten), lhsNebenkosten, rhsNebenkosten)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
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
     *       &lt;attribute name="Preis" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}PreisAufAnfrage" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Kauf
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlAttribute(name = "Preis", required = true)
        @XmlJavaTypeAdapter(Adapter36 .class)
        protected BigDecimal preis;

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
                BigDecimal thePreis;
                thePreis = this.getPreis();
                strategy.appendField(locator, this, "preis", buffer, thePreis);
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
            if (draftCopy instanceof VermarktungGewerbeTyp.Kauf) {
                final VermarktungGewerbeTyp.Kauf copy = ((VermarktungGewerbeTyp.Kauf) draftCopy);
                if (this.preis!= null) {
                    BigDecimal sourcePreis;
                    sourcePreis = this.getPreis();
                    BigDecimal copyPreis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "preis", sourcePreis), sourcePreis));
                    copy.setPreis(copyPreis);
                } else {
                    copy.preis = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new VermarktungGewerbeTyp.Kauf();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final VermarktungGewerbeTyp.Kauf that = ((VermarktungGewerbeTyp.Kauf) object);
            {
                BigDecimal lhsPreis;
                lhsPreis = this.getPreis();
                BigDecimal rhsPreis;
                rhsPreis = that.getPreis();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "preis", lhsPreis), LocatorUtils.property(thatLocator, "preis", rhsPreis), lhsPreis, rhsPreis)) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Pro" type="{http://www.immobilienscout24.de/immobilientransfer}MieteEinheitTyp" default="Monat" /&gt;
     *       &lt;attribute name="Kaltmiete" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}PreisAufAnfrage" /&gt;
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
    public static class Miete
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlAttribute(name = "Pro")
        protected MieteEinheitTyp pro;
        @XmlAttribute(name = "Kaltmiete", required = true)
        @XmlJavaTypeAdapter(Adapter36 .class)
        protected BigDecimal kaltmiete;
        @XmlAttribute(name = "Kaution")
        @XmlJavaTypeAdapter(Adapter7 .class)
        protected String kaution;

        /**
         * Gets the value of the pro property.
         * 
         * @return
         *     possible object is
         *     {@link MieteEinheitTyp }
         *     
         */
        public MieteEinheitTyp getPro() {
            if (pro == null) {
                return MieteEinheitTyp.MONAT;
            } else {
                return pro;
            }
        }

        /**
         * Sets the value of the pro property.
         * 
         * @param value
         *     allowed object is
         *     {@link MieteEinheitTyp }
         *     
         */
        public void setPro(MieteEinheitTyp value) {
            this.pro = value;
        }

        /**
         * Gets the value of the kaltmiete property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
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
        public void setKaltmiete(BigDecimal value) {
            this.kaltmiete = value;
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
                MieteEinheitTyp thePro;
                thePro = this.getPro();
                strategy.appendField(locator, this, "pro", buffer, thePro);
            }
            {
                BigDecimal theKaltmiete;
                theKaltmiete = this.getKaltmiete();
                strategy.appendField(locator, this, "kaltmiete", buffer, theKaltmiete);
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
            if (draftCopy instanceof VermarktungGewerbeTyp.Miete) {
                final VermarktungGewerbeTyp.Miete copy = ((VermarktungGewerbeTyp.Miete) draftCopy);
                if (this.pro!= null) {
                    MieteEinheitTyp sourcePro;
                    sourcePro = this.getPro();
                    MieteEinheitTyp copyPro = ((MieteEinheitTyp) strategy.copy(LocatorUtils.property(locator, "pro", sourcePro), sourcePro));
                    copy.setPro(copyPro);
                } else {
                    copy.pro = null;
                }
                if (this.kaltmiete!= null) {
                    BigDecimal sourceKaltmiete;
                    sourceKaltmiete = this.getKaltmiete();
                    BigDecimal copyKaltmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaltmiete", sourceKaltmiete), sourceKaltmiete));
                    copy.setKaltmiete(copyKaltmiete);
                } else {
                    copy.kaltmiete = null;
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
            return new VermarktungGewerbeTyp.Miete();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final VermarktungGewerbeTyp.Miete that = ((VermarktungGewerbeTyp.Miete) object);
            {
                MieteEinheitTyp lhsPro;
                lhsPro = this.getPro();
                MieteEinheitTyp rhsPro;
                rhsPro = that.getPro();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "pro", lhsPro), LocatorUtils.property(thatLocator, "pro", rhsPro), lhsPro, rhsPro)) {
                    return false;
                }
            }
            {
                BigDecimal lhsKaltmiete;
                lhsKaltmiete = this.getKaltmiete();
                BigDecimal rhsKaltmiete;
                rhsKaltmiete = that.getKaltmiete();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "kaltmiete", lhsKaltmiete), LocatorUtils.property(thatLocator, "kaltmiete", rhsKaltmiete), lhsKaltmiete, rhsKaltmiete)) {
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

}
