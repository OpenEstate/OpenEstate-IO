
package org.openestate.io.is24_xml.xml;

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
 * <p>Java class for VermarktungGrundstueckWohnenMieteTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VermarktungGrundstueckWohnenMieteTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Pacht">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Miete">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="Preis" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}PreisAufAnfrage" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VermarktungGrundstueckWohnenMieteTyp", propOrder = {
    "pacht",
    "miete"
})
public class VermarktungGrundstueckWohnenMieteTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElementRef(name = "Pacht", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> pacht;
    @XmlElementRef(name = "Miete", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> miete;
    @XmlAttribute(name = "Preis", required = true)
    @XmlJavaTypeAdapter(Adapter17 .class)
    protected Double preis;

    /**
     * Gets the value of the pacht property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckWohnenMieteTyp.Pacht }{@code >}
     *     
     */
    public JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> getPacht() {
        return pacht;
    }

    /**
     * Sets the value of the pacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckWohnenMieteTyp.Pacht }{@code >}
     *     
     */
    public void setPacht(JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> value) {
        this.pacht = value;
    }

    /**
     * Gets the value of the miete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckWohnenMieteTyp.Miete }{@code >}
     *     
     */
    public JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> getMiete() {
        return miete;
    }

    /**
     * Sets the value of the miete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckWohnenMieteTyp.Miete }{@code >}
     *     
     */
    public void setMiete(JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> value) {
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
    public Double getPreis() {
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
    public void setPreis(Double value) {
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
            JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> thePacht;
            thePacht = this.getPacht();
            strategy.appendField(locator, this, "pacht", buffer, thePacht);
        }
        {
            JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> theMiete;
            theMiete = this.getMiete();
            strategy.appendField(locator, this, "miete", buffer, theMiete);
        }
        {
            Double thePreis;
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
        if (draftCopy instanceof VermarktungGrundstueckWohnenMieteTyp) {
            final VermarktungGrundstueckWohnenMieteTyp copy = ((VermarktungGrundstueckWohnenMieteTyp) draftCopy);
            if (this.pacht!= null) {
                JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> sourcePacht;
                sourcePacht = this.getPacht();
                @SuppressWarnings("unchecked")
                JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> copyPacht = ((JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> ) strategy.copy(LocatorUtils.property(locator, "pacht", sourcePacht), sourcePacht));
                copy.setPacht(copyPacht);
            } else {
                copy.pacht = null;
            }
            if (this.miete!= null) {
                JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> sourceMiete;
                sourceMiete = this.getMiete();
                @SuppressWarnings("unchecked")
                JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> copyMiete = ((JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> ) strategy.copy(LocatorUtils.property(locator, "miete", sourceMiete), sourceMiete));
                copy.setMiete(copyMiete);
            } else {
                copy.miete = null;
            }
            if (this.preis!= null) {
                Double sourcePreis;
                sourcePreis = this.getPreis();
                Double copyPreis = ((Double) strategy.copy(LocatorUtils.property(locator, "preis", sourcePreis), sourcePreis));
                copy.setPreis(copyPreis);
            } else {
                copy.preis = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VermarktungGrundstueckWohnenMieteTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VermarktungGrundstueckWohnenMieteTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VermarktungGrundstueckWohnenMieteTyp that = ((VermarktungGrundstueckWohnenMieteTyp) object);
        {
            JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> lhsPacht;
            lhsPacht = this.getPacht();
            JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> rhsPacht;
            rhsPacht = that.getPacht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pacht", lhsPacht), LocatorUtils.property(thatLocator, "pacht", rhsPacht), lhsPacht, rhsPacht)) {
                return false;
            }
        }
        {
            JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> lhsMiete;
            lhsMiete = this.getMiete();
            JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> rhsMiete;
            rhsMiete = that.getMiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "miete", lhsMiete), LocatorUtils.property(thatLocator, "miete", rhsMiete), lhsMiete, rhsMiete)) {
                return false;
            }
        }
        {
            Double lhsPreis;
            lhsPreis = this.getPreis();
            Double rhsPreis;
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Miete
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
            return new VermarktungGrundstueckWohnenMieteTyp.Miete();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof VermarktungGrundstueckWohnenMieteTyp.Miete)) {
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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
            return new VermarktungGrundstueckWohnenMieteTyp.Pacht();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof VermarktungGrundstueckWohnenMieteTyp.Pacht)) {
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
