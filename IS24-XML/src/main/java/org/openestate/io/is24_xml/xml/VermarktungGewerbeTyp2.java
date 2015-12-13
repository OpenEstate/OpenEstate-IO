
package org.openestate.io.is24_xml.xml;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
public class VermarktungGewerbeTyp2
    implements Cloneable, CopyTo, Equals, ToString
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
            VermarktungGewerbeTyp2 .Miete theMiete;
            theMiete = this.getMiete();
            strategy.appendField(locator, this, "miete", buffer, theMiete);
        }
        {
            JAXBElement<Object> theKauf;
            theKauf = this.getKauf();
            strategy.appendField(locator, this, "kauf", buffer, theKauf);
        }
        {
            BigDecimal theNebenkosten;
            theNebenkosten = this.getNebenkosten();
            strategy.appendField(locator, this, "nebenkosten", buffer, theNebenkosten);
        }
        {
            BigDecimal thePreisProParkflaeche;
            thePreisProParkflaeche = this.getPreisProParkflaeche();
            strategy.appendField(locator, this, "preisProParkflaeche", buffer, thePreisProParkflaeche);
        }
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
        if (draftCopy instanceof VermarktungGewerbeTyp2) {
            final VermarktungGewerbeTyp2 copy = ((VermarktungGewerbeTyp2) draftCopy);
            if (this.miete!= null) {
                VermarktungGewerbeTyp2 .Miete sourceMiete;
                sourceMiete = this.getMiete();
                VermarktungGewerbeTyp2 .Miete copyMiete = ((VermarktungGewerbeTyp2 .Miete) strategy.copy(LocatorUtils.property(locator, "miete", sourceMiete), sourceMiete));
                copy.setMiete(copyMiete);
            } else {
                copy.miete = null;
            }
            if (this.kauf!= null) {
                JAXBElement<Object> sourceKauf;
                sourceKauf = this.getKauf();
                @SuppressWarnings("unchecked")
                JAXBElement<Object> copyKauf = ((JAXBElement<Object> ) strategy.copy(LocatorUtils.property(locator, "kauf", sourceKauf), sourceKauf));
                copy.setKauf(copyKauf);
            } else {
                copy.kauf = null;
            }
            if (this.nebenkosten!= null) {
                BigDecimal sourceNebenkosten;
                sourceNebenkosten = this.getNebenkosten();
                BigDecimal copyNebenkosten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nebenkosten", sourceNebenkosten), sourceNebenkosten));
                copy.setNebenkosten(copyNebenkosten);
            } else {
                copy.nebenkosten = null;
            }
            if (this.preisProParkflaeche!= null) {
                BigDecimal sourcePreisProParkflaeche;
                sourcePreisProParkflaeche = this.getPreisProParkflaeche();
                BigDecimal copyPreisProParkflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "preisProParkflaeche", sourcePreisProParkflaeche), sourcePreisProParkflaeche));
                copy.setPreisProParkflaeche(copyPreisProParkflaeche);
            } else {
                copy.preisProParkflaeche = null;
            }
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
        return new VermarktungGewerbeTyp2();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "miete", lhsMiete), LocatorUtils.property(thatLocator, "miete", rhsMiete), lhsMiete, rhsMiete)) {
                return false;
            }
        }
        {
            JAXBElement<Object> lhsKauf;
            lhsKauf = this.getKauf();
            JAXBElement<Object> rhsKauf;
            rhsKauf = that.getKauf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kauf", lhsKauf), LocatorUtils.property(thatLocator, "kauf", rhsKauf), lhsKauf, rhsKauf)) {
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
        {
            BigDecimal lhsPreisProParkflaeche;
            lhsPreisProParkflaeche = this.getPreisProParkflaeche();
            BigDecimal rhsPreisProParkflaeche;
            rhsPreisProParkflaeche = that.getPreisProParkflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisProParkflaeche", lhsPreisProParkflaeche), LocatorUtils.property(thatLocator, "preisProParkflaeche", rhsPreisProParkflaeche), lhsPreisProParkflaeche, rhsPreisProParkflaeche)) {
                return false;
            }
        }
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
    public static class Miete
        implements Cloneable, CopyTo, Equals, ToString
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
            if (draftCopy instanceof VermarktungGewerbeTyp2 .Miete) {
                final VermarktungGewerbeTyp2 .Miete copy = ((VermarktungGewerbeTyp2 .Miete) draftCopy);
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
            return new VermarktungGewerbeTyp2 .Miete();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
