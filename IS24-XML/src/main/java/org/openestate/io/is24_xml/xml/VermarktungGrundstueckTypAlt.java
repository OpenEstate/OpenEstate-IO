
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
 * <p>Java class for VermarktungGrundstueckTypAlt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VermarktungGrundstueckTypAlt"&gt;
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
@XmlType(name = "VermarktungGrundstueckTypAlt", propOrder = {
    "kauf",
    "pacht",
    "erbpacht"
})
public class VermarktungGrundstueckTypAlt
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElementRef(name = "Kauf", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<VermarktungGrundstueckTypAlt.Kauf> kauf;
    @XmlElementRef(name = "Pacht", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<VermarktungGrundstueckTypAlt.Pacht> pacht;
    @XmlElementRef(name = "Erbpacht", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<VermarktungGrundstueckTypAlt.Erbpacht> erbpacht;
    @XmlAttribute(name = "Preis", required = true)
    @XmlJavaTypeAdapter(Adapter36 .class)
    protected BigDecimal preis;

    /**
     * Gets the value of the kauf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckTypAlt.Kauf }{@code >}
     *     
     */
    public JAXBElement<VermarktungGrundstueckTypAlt.Kauf> getKauf() {
        return kauf;
    }

    /**
     * Sets the value of the kauf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckTypAlt.Kauf }{@code >}
     *     
     */
    public void setKauf(JAXBElement<VermarktungGrundstueckTypAlt.Kauf> value) {
        this.kauf = value;
    }

    /**
     * Gets the value of the pacht property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckTypAlt.Pacht }{@code >}
     *     
     */
    public JAXBElement<VermarktungGrundstueckTypAlt.Pacht> getPacht() {
        return pacht;
    }

    /**
     * Sets the value of the pacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckTypAlt.Pacht }{@code >}
     *     
     */
    public void setPacht(JAXBElement<VermarktungGrundstueckTypAlt.Pacht> value) {
        this.pacht = value;
    }

    /**
     * Gets the value of the erbpacht property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckTypAlt.Erbpacht }{@code >}
     *     
     */
    public JAXBElement<VermarktungGrundstueckTypAlt.Erbpacht> getErbpacht() {
        return erbpacht;
    }

    /**
     * Sets the value of the erbpacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckTypAlt.Erbpacht }{@code >}
     *     
     */
    public void setErbpacht(JAXBElement<VermarktungGrundstueckTypAlt.Erbpacht> value) {
        this.erbpacht = value;
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
            JAXBElement<VermarktungGrundstueckTypAlt.Kauf> theKauf;
            theKauf = this.getKauf();
            strategy.appendField(locator, this, "kauf", buffer, theKauf);
        }
        {
            JAXBElement<VermarktungGrundstueckTypAlt.Pacht> thePacht;
            thePacht = this.getPacht();
            strategy.appendField(locator, this, "pacht", buffer, thePacht);
        }
        {
            JAXBElement<VermarktungGrundstueckTypAlt.Erbpacht> theErbpacht;
            theErbpacht = this.getErbpacht();
            strategy.appendField(locator, this, "erbpacht", buffer, theErbpacht);
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
        if (draftCopy instanceof VermarktungGrundstueckTypAlt) {
            final VermarktungGrundstueckTypAlt copy = ((VermarktungGrundstueckTypAlt) draftCopy);
            if (this.kauf!= null) {
                JAXBElement<VermarktungGrundstueckTypAlt.Kauf> sourceKauf;
                sourceKauf = this.getKauf();
                @SuppressWarnings("unchecked")
                JAXBElement<VermarktungGrundstueckTypAlt.Kauf> copyKauf = ((JAXBElement<VermarktungGrundstueckTypAlt.Kauf> ) strategy.copy(LocatorUtils.property(locator, "kauf", sourceKauf), sourceKauf));
                copy.setKauf(copyKauf);
            } else {
                copy.kauf = null;
            }
            if (this.pacht!= null) {
                JAXBElement<VermarktungGrundstueckTypAlt.Pacht> sourcePacht;
                sourcePacht = this.getPacht();
                @SuppressWarnings("unchecked")
                JAXBElement<VermarktungGrundstueckTypAlt.Pacht> copyPacht = ((JAXBElement<VermarktungGrundstueckTypAlt.Pacht> ) strategy.copy(LocatorUtils.property(locator, "pacht", sourcePacht), sourcePacht));
                copy.setPacht(copyPacht);
            } else {
                copy.pacht = null;
            }
            if (this.erbpacht!= null) {
                JAXBElement<VermarktungGrundstueckTypAlt.Erbpacht> sourceErbpacht;
                sourceErbpacht = this.getErbpacht();
                @SuppressWarnings("unchecked")
                JAXBElement<VermarktungGrundstueckTypAlt.Erbpacht> copyErbpacht = ((JAXBElement<VermarktungGrundstueckTypAlt.Erbpacht> ) strategy.copy(LocatorUtils.property(locator, "erbpacht", sourceErbpacht), sourceErbpacht));
                copy.setErbpacht(copyErbpacht);
            } else {
                copy.erbpacht = null;
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
        return new VermarktungGrundstueckTypAlt();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VermarktungGrundstueckTypAlt)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VermarktungGrundstueckTypAlt that = ((VermarktungGrundstueckTypAlt) object);
        {
            JAXBElement<VermarktungGrundstueckTypAlt.Kauf> lhsKauf;
            lhsKauf = this.getKauf();
            JAXBElement<VermarktungGrundstueckTypAlt.Kauf> rhsKauf;
            rhsKauf = that.getKauf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kauf", lhsKauf), LocatorUtils.property(thatLocator, "kauf", rhsKauf), lhsKauf, rhsKauf)) {
                return false;
            }
        }
        {
            JAXBElement<VermarktungGrundstueckTypAlt.Pacht> lhsPacht;
            lhsPacht = this.getPacht();
            JAXBElement<VermarktungGrundstueckTypAlt.Pacht> rhsPacht;
            rhsPacht = that.getPacht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pacht", lhsPacht), LocatorUtils.property(thatLocator, "pacht", rhsPacht), lhsPacht, rhsPacht)) {
                return false;
            }
        }
        {
            JAXBElement<VermarktungGrundstueckTypAlt.Erbpacht> lhsErbpacht;
            lhsErbpacht = this.getErbpacht();
            JAXBElement<VermarktungGrundstueckTypAlt.Erbpacht> rhsErbpacht;
            rhsErbpacht = that.getErbpacht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erbpacht", lhsErbpacht), LocatorUtils.property(thatLocator, "erbpacht", rhsErbpacht), lhsErbpacht, rhsErbpacht)) {
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
    public static class Erbpacht
        implements Cloneable, CopyTo, Equals, ToString
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
                Long theDauerInJahren;
                theDauerInJahren = this.getDauerInJahren();
                strategy.appendField(locator, this, "dauerInJahren", buffer, theDauerInJahren);
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
            if (draftCopy instanceof VermarktungGrundstueckTypAlt.Erbpacht) {
                final VermarktungGrundstueckTypAlt.Erbpacht copy = ((VermarktungGrundstueckTypAlt.Erbpacht) draftCopy);
                if (this.dauerInJahren!= null) {
                    Long sourceDauerInJahren;
                    sourceDauerInJahren = this.getDauerInJahren();
                    Long copyDauerInJahren = ((Long) strategy.copy(LocatorUtils.property(locator, "dauerInJahren", sourceDauerInJahren), sourceDauerInJahren));
                    copy.setDauerInJahren(copyDauerInJahren);
                } else {
                    copy.dauerInJahren = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new VermarktungGrundstueckTypAlt.Erbpacht();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof VermarktungGrundstueckTypAlt.Erbpacht)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final VermarktungGrundstueckTypAlt.Erbpacht that = ((VermarktungGrundstueckTypAlt.Erbpacht) object);
            {
                Long lhsDauerInJahren;
                lhsDauerInJahren = this.getDauerInJahren();
                Long rhsDauerInJahren;
                rhsDauerInJahren = that.getDauerInJahren();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "dauerInJahren", lhsDauerInJahren), LocatorUtils.property(thatLocator, "dauerInJahren", rhsDauerInJahren), lhsDauerInJahren, rhsDauerInJahren)) {
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
            return draftCopy;
        }

        public Object createNewInstance() {
            return new VermarktungGrundstueckTypAlt.Kauf();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof VermarktungGrundstueckTypAlt.Kauf)) {
                return false;
            }
            if (this == object) {
                return true;
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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Pacht
        implements Cloneable, CopyTo, Equals, ToString
    {


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
            return draftCopy;
        }

        public Object createNewInstance() {
            return new VermarktungGrundstueckTypAlt.Pacht();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof VermarktungGrundstueckTypAlt.Pacht)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

    }

}
