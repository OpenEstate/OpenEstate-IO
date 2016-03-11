
package org.openestate.io.is24_xml.xml;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for VermarktungGrundstueckGewerbeTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VermarktungGrundstueckGewerbeTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Kauf"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Pacht"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Erbpacht"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="DauerInJahren" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3Typ" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Miete"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="Preis" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}PreisAufAnfrage" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VermarktungGrundstueckGewerbeTyp", propOrder = {
    "kauf",
    "pacht",
    "erbpacht",
    "miete"
})
public class VermarktungGrundstueckGewerbeTyp implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElementRef(name = "Kauf", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<VermarktungGrundstueckGewerbeTyp.Kauf> kauf;
    @XmlElementRef(name = "Pacht", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<VermarktungGrundstueckGewerbeTyp.Pacht> pacht;
    @XmlElementRef(name = "Erbpacht", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<VermarktungGrundstueckGewerbeTyp.Erbpacht> erbpacht;
    @XmlElementRef(name = "Miete", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<VermarktungGrundstueckGewerbeTyp.Miete> miete;
    @XmlAttribute(name = "Preis", required = true)
    @XmlJavaTypeAdapter(Adapter36 .class)
    protected BigDecimal preis;

    /**
     * Gets the value of the kauf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckGewerbeTyp.Kauf }{@code >}
     *     
     */
    public JAXBElement<VermarktungGrundstueckGewerbeTyp.Kauf> getKauf() {
        return kauf;
    }

    /**
     * Sets the value of the kauf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckGewerbeTyp.Kauf }{@code >}
     *     
     */
    public void setKauf(JAXBElement<VermarktungGrundstueckGewerbeTyp.Kauf> value) {
        this.kauf = value;
    }

    /**
     * Gets the value of the pacht property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckGewerbeTyp.Pacht }{@code >}
     *     
     */
    public JAXBElement<VermarktungGrundstueckGewerbeTyp.Pacht> getPacht() {
        return pacht;
    }

    /**
     * Sets the value of the pacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckGewerbeTyp.Pacht }{@code >}
     *     
     */
    public void setPacht(JAXBElement<VermarktungGrundstueckGewerbeTyp.Pacht> value) {
        this.pacht = value;
    }

    /**
     * Gets the value of the erbpacht property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckGewerbeTyp.Erbpacht }{@code >}
     *     
     */
    public JAXBElement<VermarktungGrundstueckGewerbeTyp.Erbpacht> getErbpacht() {
        return erbpacht;
    }

    /**
     * Sets the value of the erbpacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckGewerbeTyp.Erbpacht }{@code >}
     *     
     */
    public void setErbpacht(JAXBElement<VermarktungGrundstueckGewerbeTyp.Erbpacht> value) {
        this.erbpacht = value;
    }

    /**
     * Gets the value of the miete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckGewerbeTyp.Miete }{@code >}
     *     
     */
    public JAXBElement<VermarktungGrundstueckGewerbeTyp.Miete> getMiete() {
        return miete;
    }

    /**
     * Sets the value of the miete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckGewerbeTyp.Miete }{@code >}
     *     
     */
    public void setMiete(JAXBElement<VermarktungGrundstueckGewerbeTyp.Miete> value) {
        this.miete = value;
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
            JAXBElement<VermarktungGrundstueckGewerbeTyp.Kauf> theKauf;
            theKauf = this.getKauf();
            strategy.appendField(locator, this, "kauf", buffer, theKauf, (this.kauf!= null));
        }
        {
            JAXBElement<VermarktungGrundstueckGewerbeTyp.Pacht> thePacht;
            thePacht = this.getPacht();
            strategy.appendField(locator, this, "pacht", buffer, thePacht, (this.pacht!= null));
        }
        {
            JAXBElement<VermarktungGrundstueckGewerbeTyp.Erbpacht> theErbpacht;
            theErbpacht = this.getErbpacht();
            strategy.appendField(locator, this, "erbpacht", buffer, theErbpacht, (this.erbpacht!= null));
        }
        {
            JAXBElement<VermarktungGrundstueckGewerbeTyp.Miete> theMiete;
            theMiete = this.getMiete();
            strategy.appendField(locator, this, "miete", buffer, theMiete, (this.miete!= null));
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
        if (draftCopy instanceof VermarktungGrundstueckGewerbeTyp) {
            final VermarktungGrundstueckGewerbeTyp copy = ((VermarktungGrundstueckGewerbeTyp) draftCopy);
            {
                Boolean kaufShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kauf!= null));
                if (kaufShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<VermarktungGrundstueckGewerbeTyp.Kauf> sourceKauf;
                    sourceKauf = this.getKauf();
                    @SuppressWarnings("unchecked")
                    JAXBElement<VermarktungGrundstueckGewerbeTyp.Kauf> copyKauf = ((JAXBElement<VermarktungGrundstueckGewerbeTyp.Kauf> ) strategy.copy(LocatorUtils.property(locator, "kauf", sourceKauf), sourceKauf, (this.kauf!= null)));
                    copy.setKauf(copyKauf);
                } else {
                    if (kaufShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kauf = null;
                    }
                }
            }
            {
                Boolean pachtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pacht!= null));
                if (pachtShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<VermarktungGrundstueckGewerbeTyp.Pacht> sourcePacht;
                    sourcePacht = this.getPacht();
                    @SuppressWarnings("unchecked")
                    JAXBElement<VermarktungGrundstueckGewerbeTyp.Pacht> copyPacht = ((JAXBElement<VermarktungGrundstueckGewerbeTyp.Pacht> ) strategy.copy(LocatorUtils.property(locator, "pacht", sourcePacht), sourcePacht, (this.pacht!= null)));
                    copy.setPacht(copyPacht);
                } else {
                    if (pachtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pacht = null;
                    }
                }
            }
            {
                Boolean erbpachtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erbpacht!= null));
                if (erbpachtShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<VermarktungGrundstueckGewerbeTyp.Erbpacht> sourceErbpacht;
                    sourceErbpacht = this.getErbpacht();
                    @SuppressWarnings("unchecked")
                    JAXBElement<VermarktungGrundstueckGewerbeTyp.Erbpacht> copyErbpacht = ((JAXBElement<VermarktungGrundstueckGewerbeTyp.Erbpacht> ) strategy.copy(LocatorUtils.property(locator, "erbpacht", sourceErbpacht), sourceErbpacht, (this.erbpacht!= null)));
                    copy.setErbpacht(copyErbpacht);
                } else {
                    if (erbpachtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erbpacht = null;
                    }
                }
            }
            {
                Boolean mieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.miete!= null));
                if (mieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<VermarktungGrundstueckGewerbeTyp.Miete> sourceMiete;
                    sourceMiete = this.getMiete();
                    @SuppressWarnings("unchecked")
                    JAXBElement<VermarktungGrundstueckGewerbeTyp.Miete> copyMiete = ((JAXBElement<VermarktungGrundstueckGewerbeTyp.Miete> ) strategy.copy(LocatorUtils.property(locator, "miete", sourceMiete), sourceMiete, (this.miete!= null)));
                    copy.setMiete(copyMiete);
                } else {
                    if (mieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.miete = null;
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
        return new VermarktungGrundstueckGewerbeTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VermarktungGrundstueckGewerbeTyp that = ((VermarktungGrundstueckGewerbeTyp) object);
        {
            JAXBElement<VermarktungGrundstueckGewerbeTyp.Kauf> lhsKauf;
            lhsKauf = this.getKauf();
            JAXBElement<VermarktungGrundstueckGewerbeTyp.Kauf> rhsKauf;
            rhsKauf = that.getKauf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kauf", lhsKauf), LocatorUtils.property(thatLocator, "kauf", rhsKauf), lhsKauf, rhsKauf, (this.kauf!= null), (that.kauf!= null))) {
                return false;
            }
        }
        {
            JAXBElement<VermarktungGrundstueckGewerbeTyp.Pacht> lhsPacht;
            lhsPacht = this.getPacht();
            JAXBElement<VermarktungGrundstueckGewerbeTyp.Pacht> rhsPacht;
            rhsPacht = that.getPacht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pacht", lhsPacht), LocatorUtils.property(thatLocator, "pacht", rhsPacht), lhsPacht, rhsPacht, (this.pacht!= null), (that.pacht!= null))) {
                return false;
            }
        }
        {
            JAXBElement<VermarktungGrundstueckGewerbeTyp.Erbpacht> lhsErbpacht;
            lhsErbpacht = this.getErbpacht();
            JAXBElement<VermarktungGrundstueckGewerbeTyp.Erbpacht> rhsErbpacht;
            rhsErbpacht = that.getErbpacht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erbpacht", lhsErbpacht), LocatorUtils.property(thatLocator, "erbpacht", rhsErbpacht), lhsErbpacht, rhsErbpacht, (this.erbpacht!= null), (that.erbpacht!= null))) {
                return false;
            }
        }
        {
            JAXBElement<VermarktungGrundstueckGewerbeTyp.Miete> lhsMiete;
            lhsMiete = this.getMiete();
            JAXBElement<VermarktungGrundstueckGewerbeTyp.Miete> rhsMiete;
            rhsMiete = that.getMiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "miete", lhsMiete), LocatorUtils.property(thatLocator, "miete", rhsMiete), lhsMiete, rhsMiete, (this.miete!= null), (that.miete!= null))) {
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
     *       &lt;attribute name="DauerInJahren" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3Typ" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Erbpacht implements Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlAttribute(name = "DauerInJahren", required = true)
        @XmlJavaTypeAdapter(Adapter21 .class)
        protected Long dauerInJahren;

        /**
         * Gets the value of the dauerInJahren property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Long getDauerInJahren() {
            return dauerInJahren;
        }

        /**
         * Sets the value of the dauerInJahren property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDauerInJahren(Long value) {
            this.dauerInJahren = value;
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
                Long theDauerInJahren;
                theDauerInJahren = this.getDauerInJahren();
                strategy.appendField(locator, this, "dauerInJahren", buffer, theDauerInJahren, (this.dauerInJahren!= null));
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
            if (draftCopy instanceof VermarktungGrundstueckGewerbeTyp.Erbpacht) {
                final VermarktungGrundstueckGewerbeTyp.Erbpacht copy = ((VermarktungGrundstueckGewerbeTyp.Erbpacht) draftCopy);
                {
                    Boolean dauerInJahrenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dauerInJahren!= null));
                    if (dauerInJahrenShouldBeCopiedAndSet == Boolean.TRUE) {
                        Long sourceDauerInJahren;
                        sourceDauerInJahren = this.getDauerInJahren();
                        Long copyDauerInJahren = ((Long) strategy.copy(LocatorUtils.property(locator, "dauerInJahren", sourceDauerInJahren), sourceDauerInJahren, (this.dauerInJahren!= null)));
                        copy.setDauerInJahren(copyDauerInJahren);
                    } else {
                        if (dauerInJahrenShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.dauerInJahren = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new VermarktungGrundstueckGewerbeTyp.Erbpacht();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final VermarktungGrundstueckGewerbeTyp.Erbpacht that = ((VermarktungGrundstueckGewerbeTyp.Erbpacht) object);
            {
                Long lhsDauerInJahren;
                lhsDauerInJahren = this.getDauerInJahren();
                Long rhsDauerInJahren;
                rhsDauerInJahren = that.getDauerInJahren();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "dauerInJahren", lhsDauerInJahren), LocatorUtils.property(thatLocator, "dauerInJahren", rhsDauerInJahren), lhsDauerInJahren, rhsDauerInJahren, (this.dauerInJahren!= null), (that.dauerInJahren!= null))) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Kauf implements Cloneable, CopyTo2, Equals2, ToString2
    {


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
            return draftCopy;
        }

        public Object createNewInstance() {
            return new VermarktungGrundstueckGewerbeTyp.Kauf();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Miete implements Cloneable, CopyTo2, Equals2, ToString2
    {


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
            return draftCopy;
        }

        public Object createNewInstance() {
            return new VermarktungGrundstueckGewerbeTyp.Miete();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Pacht implements Cloneable, CopyTo2, Equals2, ToString2
    {


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
            return draftCopy;
        }

        public Object createNewInstance() {
            return new VermarktungGrundstueckGewerbeTyp.Pacht();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

    }

}
