
package org.openestate.io.is24_xml.xml;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
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

public class Zwangsversteigerung
    extends JAXBElement<Zwangsversteigerung.Type>
{

    protected final static QName NAME = new QName("http://www.immobilienscout24.de/immobilientransfer", "Zwangsversteigerung");

    public Zwangsversteigerung(Zwangsversteigerung.Type value) {
        super(NAME, ((Class) Zwangsversteigerung.Type.class), null, value);
    }

    public Zwangsversteigerung() {
        super(NAME, ((Class) Zwangsversteigerung.Type.class), null, null);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}ZwangsversteigerungTyp"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Aenderungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="Amtsgericht" type="{http://www.immobilienscout24.de/immobilientransfer}AmtsgerichtTyp"/&gt;
     *         &lt;element name="Aufhebungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="Eigentuemer" type="{http://www.immobilienscout24.de/immobilientransfer}Text80Typ"/&gt;
     *         &lt;element name="Erfassungsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="Grundbuchblattnummer" type="{http://www.immobilienscout24.de/immobilientransfer}Text40Typ"/&gt;
     *         &lt;element name="Objektart" type="{http://www.immobilienscout24.de/immobilientransfer}ZwangsversteigerungKategorieTyp"/&gt;
     *         &lt;element name="Preis" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ"/&gt;
     *         &lt;element name="Versteigerungstermin" type="{http://www.immobilienscout24.de/immobilientransfer}VersteigerungsterminTyp"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Gesamtflaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aenderungsdatum",
        "amtsgericht",
        "aufhebungsdatum",
        "eigentuemer",
        "erfassungsdatum",
        "grundbuchblattnummer",
        "objektart",
        "preis",
        "versteigerungstermin"
    })
    public static class Type
        extends ZwangsversteigerungTyp
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "Aenderungsdatum", type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "date")
        protected Calendar aenderungsdatum;
        @XmlElement(name = "Amtsgericht", required = true)
        protected AmtsgerichtTyp amtsgericht;
        @XmlElement(name = "Aufhebungsdatum", type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "date")
        protected Calendar aufhebungsdatum;
        @XmlElement(name = "Eigentuemer", required = true)
        @XmlJavaTypeAdapter(Adapter8 .class)
        protected String eigentuemer;
        @XmlElement(name = "Erfassungsdatum", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "date")
        protected Calendar erfassungsdatum;
        @XmlElement(name = "Grundbuchblattnummer", required = true)
        @XmlJavaTypeAdapter(Adapter6 .class)
        protected String grundbuchblattnummer;
        @XmlElement(name = "Objektart", required = true)
        @XmlSchemaType(name = "string")
        protected ZwangsversteigerungKategorieTyp objektart;
        @XmlElement(name = "Preis", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter35 .class)
        @XmlSchemaType(name = "decimal")
        protected BigDecimal preis;
        @XmlElement(name = "Versteigerungstermin", required = true)
        protected VersteigerungsterminTyp versteigerungstermin;
        @XmlAttribute(name = "Gesamtflaeche", required = true)
        @XmlJavaTypeAdapter(Adapter34 .class)
        protected BigDecimal gesamtflaeche;

        /**
         * Gets the value of the aenderungsdatum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Calendar getAenderungsdatum() {
            return aenderungsdatum;
        }

        /**
         * Sets the value of the aenderungsdatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAenderungsdatum(Calendar value) {
            this.aenderungsdatum = value;
        }

        /**
         * Gets the value of the amtsgericht property.
         * 
         * @return
         *     possible object is
         *     {@link AmtsgerichtTyp }
         *     
         */
        public AmtsgerichtTyp getAmtsgericht() {
            return amtsgericht;
        }

        /**
         * Sets the value of the amtsgericht property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmtsgerichtTyp }
         *     
         */
        public void setAmtsgericht(AmtsgerichtTyp value) {
            this.amtsgericht = value;
        }

        /**
         * Gets the value of the aufhebungsdatum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Calendar getAufhebungsdatum() {
            return aufhebungsdatum;
        }

        /**
         * Sets the value of the aufhebungsdatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAufhebungsdatum(Calendar value) {
            this.aufhebungsdatum = value;
        }

        /**
         * Gets the value of the eigentuemer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEigentuemer() {
            return eigentuemer;
        }

        /**
         * Sets the value of the eigentuemer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEigentuemer(String value) {
            this.eigentuemer = value;
        }

        /**
         * Gets the value of the erfassungsdatum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Calendar getErfassungsdatum() {
            return erfassungsdatum;
        }

        /**
         * Sets the value of the erfassungsdatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErfassungsdatum(Calendar value) {
            this.erfassungsdatum = value;
        }

        /**
         * Gets the value of the grundbuchblattnummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGrundbuchblattnummer() {
            return grundbuchblattnummer;
        }

        /**
         * Sets the value of the grundbuchblattnummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGrundbuchblattnummer(String value) {
            this.grundbuchblattnummer = value;
        }

        /**
         * Gets the value of the objektart property.
         * 
         * @return
         *     possible object is
         *     {@link ZwangsversteigerungKategorieTyp }
         *     
         */
        public ZwangsversteigerungKategorieTyp getObjektart() {
            return objektart;
        }

        /**
         * Sets the value of the objektart property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZwangsversteigerungKategorieTyp }
         *     
         */
        public void setObjektart(ZwangsversteigerungKategorieTyp value) {
            this.objektart = value;
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

        /**
         * Gets the value of the versteigerungstermin property.
         * 
         * @return
         *     possible object is
         *     {@link VersteigerungsterminTyp }
         *     
         */
        public VersteigerungsterminTyp getVersteigerungstermin() {
            return versteigerungstermin;
        }

        /**
         * Sets the value of the versteigerungstermin property.
         * 
         * @param value
         *     allowed object is
         *     {@link VersteigerungsterminTyp }
         *     
         */
        public void setVersteigerungstermin(VersteigerungsterminTyp value) {
            this.versteigerungstermin = value;
        }

        /**
         * Gets the value of the gesamtflaeche property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public BigDecimal getGesamtflaeche() {
            return gesamtflaeche;
        }

        /**
         * Sets the value of the gesamtflaeche property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGesamtflaeche(BigDecimal value) {
            this.gesamtflaeche = value;
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
            super.appendFields(locator, buffer, strategy);
            {
                Calendar theAenderungsdatum;
                theAenderungsdatum = this.getAenderungsdatum();
                strategy.appendField(locator, this, "aenderungsdatum", buffer, theAenderungsdatum);
            }
            {
                AmtsgerichtTyp theAmtsgericht;
                theAmtsgericht = this.getAmtsgericht();
                strategy.appendField(locator, this, "amtsgericht", buffer, theAmtsgericht);
            }
            {
                Calendar theAufhebungsdatum;
                theAufhebungsdatum = this.getAufhebungsdatum();
                strategy.appendField(locator, this, "aufhebungsdatum", buffer, theAufhebungsdatum);
            }
            {
                String theEigentuemer;
                theEigentuemer = this.getEigentuemer();
                strategy.appendField(locator, this, "eigentuemer", buffer, theEigentuemer);
            }
            {
                Calendar theErfassungsdatum;
                theErfassungsdatum = this.getErfassungsdatum();
                strategy.appendField(locator, this, "erfassungsdatum", buffer, theErfassungsdatum);
            }
            {
                String theGrundbuchblattnummer;
                theGrundbuchblattnummer = this.getGrundbuchblattnummer();
                strategy.appendField(locator, this, "grundbuchblattnummer", buffer, theGrundbuchblattnummer);
            }
            {
                ZwangsversteigerungKategorieTyp theObjektart;
                theObjektart = this.getObjektart();
                strategy.appendField(locator, this, "objektart", buffer, theObjektart);
            }
            {
                BigDecimal thePreis;
                thePreis = this.getPreis();
                strategy.appendField(locator, this, "preis", buffer, thePreis);
            }
            {
                VersteigerungsterminTyp theVersteigerungstermin;
                theVersteigerungstermin = this.getVersteigerungstermin();
                strategy.appendField(locator, this, "versteigerungstermin", buffer, theVersteigerungstermin);
            }
            {
                BigDecimal theGesamtflaeche;
                theGesamtflaeche = this.getGesamtflaeche();
                strategy.appendField(locator, this, "gesamtflaeche", buffer, theGesamtflaeche);
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
            super.copyTo(locator, draftCopy, strategy);
            if (draftCopy instanceof Zwangsversteigerung.Type) {
                final Zwangsversteigerung.Type copy = ((Zwangsversteigerung.Type) draftCopy);
                if (this.aenderungsdatum!= null) {
                    Calendar sourceAenderungsdatum;
                    sourceAenderungsdatum = this.getAenderungsdatum();
                    Calendar copyAenderungsdatum = ((Calendar) strategy.copy(LocatorUtils.property(locator, "aenderungsdatum", sourceAenderungsdatum), sourceAenderungsdatum));
                    copy.setAenderungsdatum(copyAenderungsdatum);
                } else {
                    copy.aenderungsdatum = null;
                }
                if (this.amtsgericht!= null) {
                    AmtsgerichtTyp sourceAmtsgericht;
                    sourceAmtsgericht = this.getAmtsgericht();
                    AmtsgerichtTyp copyAmtsgericht = ((AmtsgerichtTyp) strategy.copy(LocatorUtils.property(locator, "amtsgericht", sourceAmtsgericht), sourceAmtsgericht));
                    copy.setAmtsgericht(copyAmtsgericht);
                } else {
                    copy.amtsgericht = null;
                }
                if (this.aufhebungsdatum!= null) {
                    Calendar sourceAufhebungsdatum;
                    sourceAufhebungsdatum = this.getAufhebungsdatum();
                    Calendar copyAufhebungsdatum = ((Calendar) strategy.copy(LocatorUtils.property(locator, "aufhebungsdatum", sourceAufhebungsdatum), sourceAufhebungsdatum));
                    copy.setAufhebungsdatum(copyAufhebungsdatum);
                } else {
                    copy.aufhebungsdatum = null;
                }
                if (this.eigentuemer!= null) {
                    String sourceEigentuemer;
                    sourceEigentuemer = this.getEigentuemer();
                    String copyEigentuemer = ((String) strategy.copy(LocatorUtils.property(locator, "eigentuemer", sourceEigentuemer), sourceEigentuemer));
                    copy.setEigentuemer(copyEigentuemer);
                } else {
                    copy.eigentuemer = null;
                }
                if (this.erfassungsdatum!= null) {
                    Calendar sourceErfassungsdatum;
                    sourceErfassungsdatum = this.getErfassungsdatum();
                    Calendar copyErfassungsdatum = ((Calendar) strategy.copy(LocatorUtils.property(locator, "erfassungsdatum", sourceErfassungsdatum), sourceErfassungsdatum));
                    copy.setErfassungsdatum(copyErfassungsdatum);
                } else {
                    copy.erfassungsdatum = null;
                }
                if (this.grundbuchblattnummer!= null) {
                    String sourceGrundbuchblattnummer;
                    sourceGrundbuchblattnummer = this.getGrundbuchblattnummer();
                    String copyGrundbuchblattnummer = ((String) strategy.copy(LocatorUtils.property(locator, "grundbuchblattnummer", sourceGrundbuchblattnummer), sourceGrundbuchblattnummer));
                    copy.setGrundbuchblattnummer(copyGrundbuchblattnummer);
                } else {
                    copy.grundbuchblattnummer = null;
                }
                if (this.objektart!= null) {
                    ZwangsversteigerungKategorieTyp sourceObjektart;
                    sourceObjektart = this.getObjektart();
                    ZwangsversteigerungKategorieTyp copyObjektart = ((ZwangsversteigerungKategorieTyp) strategy.copy(LocatorUtils.property(locator, "objektart", sourceObjektart), sourceObjektart));
                    copy.setObjektart(copyObjektart);
                } else {
                    copy.objektart = null;
                }
                if (this.preis!= null) {
                    BigDecimal sourcePreis;
                    sourcePreis = this.getPreis();
                    BigDecimal copyPreis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "preis", sourcePreis), sourcePreis));
                    copy.setPreis(copyPreis);
                } else {
                    copy.preis = null;
                }
                if (this.versteigerungstermin!= null) {
                    VersteigerungsterminTyp sourceVersteigerungstermin;
                    sourceVersteigerungstermin = this.getVersteigerungstermin();
                    VersteigerungsterminTyp copyVersteigerungstermin = ((VersteigerungsterminTyp) strategy.copy(LocatorUtils.property(locator, "versteigerungstermin", sourceVersteigerungstermin), sourceVersteigerungstermin));
                    copy.setVersteigerungstermin(copyVersteigerungstermin);
                } else {
                    copy.versteigerungstermin = null;
                }
                if (this.gesamtflaeche!= null) {
                    BigDecimal sourceGesamtflaeche;
                    sourceGesamtflaeche = this.getGesamtflaeche();
                    BigDecimal copyGesamtflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gesamtflaeche", sourceGesamtflaeche), sourceGesamtflaeche));
                    copy.setGesamtflaeche(copyGesamtflaeche);
                } else {
                    copy.gesamtflaeche = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new Zwangsversteigerung.Type();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final Zwangsversteigerung.Type that = ((Zwangsversteigerung.Type) object);
            {
                Calendar lhsAenderungsdatum;
                lhsAenderungsdatum = this.getAenderungsdatum();
                Calendar rhsAenderungsdatum;
                rhsAenderungsdatum = that.getAenderungsdatum();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "aenderungsdatum", lhsAenderungsdatum), LocatorUtils.property(thatLocator, "aenderungsdatum", rhsAenderungsdatum), lhsAenderungsdatum, rhsAenderungsdatum)) {
                    return false;
                }
            }
            {
                AmtsgerichtTyp lhsAmtsgericht;
                lhsAmtsgericht = this.getAmtsgericht();
                AmtsgerichtTyp rhsAmtsgericht;
                rhsAmtsgericht = that.getAmtsgericht();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "amtsgericht", lhsAmtsgericht), LocatorUtils.property(thatLocator, "amtsgericht", rhsAmtsgericht), lhsAmtsgericht, rhsAmtsgericht)) {
                    return false;
                }
            }
            {
                Calendar lhsAufhebungsdatum;
                lhsAufhebungsdatum = this.getAufhebungsdatum();
                Calendar rhsAufhebungsdatum;
                rhsAufhebungsdatum = that.getAufhebungsdatum();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "aufhebungsdatum", lhsAufhebungsdatum), LocatorUtils.property(thatLocator, "aufhebungsdatum", rhsAufhebungsdatum), lhsAufhebungsdatum, rhsAufhebungsdatum)) {
                    return false;
                }
            }
            {
                String lhsEigentuemer;
                lhsEigentuemer = this.getEigentuemer();
                String rhsEigentuemer;
                rhsEigentuemer = that.getEigentuemer();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "eigentuemer", lhsEigentuemer), LocatorUtils.property(thatLocator, "eigentuemer", rhsEigentuemer), lhsEigentuemer, rhsEigentuemer)) {
                    return false;
                }
            }
            {
                Calendar lhsErfassungsdatum;
                lhsErfassungsdatum = this.getErfassungsdatum();
                Calendar rhsErfassungsdatum;
                rhsErfassungsdatum = that.getErfassungsdatum();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "erfassungsdatum", lhsErfassungsdatum), LocatorUtils.property(thatLocator, "erfassungsdatum", rhsErfassungsdatum), lhsErfassungsdatum, rhsErfassungsdatum)) {
                    return false;
                }
            }
            {
                String lhsGrundbuchblattnummer;
                lhsGrundbuchblattnummer = this.getGrundbuchblattnummer();
                String rhsGrundbuchblattnummer;
                rhsGrundbuchblattnummer = that.getGrundbuchblattnummer();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "grundbuchblattnummer", lhsGrundbuchblattnummer), LocatorUtils.property(thatLocator, "grundbuchblattnummer", rhsGrundbuchblattnummer), lhsGrundbuchblattnummer, rhsGrundbuchblattnummer)) {
                    return false;
                }
            }
            {
                ZwangsversteigerungKategorieTyp lhsObjektart;
                lhsObjektart = this.getObjektart();
                ZwangsversteigerungKategorieTyp rhsObjektart;
                rhsObjektart = that.getObjektart();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "objektart", lhsObjektart), LocatorUtils.property(thatLocator, "objektart", rhsObjektart), lhsObjektart, rhsObjektart)) {
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
            {
                VersteigerungsterminTyp lhsVersteigerungstermin;
                lhsVersteigerungstermin = this.getVersteigerungstermin();
                VersteigerungsterminTyp rhsVersteigerungstermin;
                rhsVersteigerungstermin = that.getVersteigerungstermin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "versteigerungstermin", lhsVersteigerungstermin), LocatorUtils.property(thatLocator, "versteigerungstermin", rhsVersteigerungstermin), lhsVersteigerungstermin, rhsVersteigerungstermin)) {
                    return false;
                }
            }
            {
                BigDecimal lhsGesamtflaeche;
                lhsGesamtflaeche = this.getGesamtflaeche();
                BigDecimal rhsGesamtflaeche;
                rhsGesamtflaeche = that.getGesamtflaeche();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtflaeche", lhsGesamtflaeche), LocatorUtils.property(thatLocator, "gesamtflaeche", rhsGesamtflaeche), lhsGesamtflaeche, rhsGesamtflaeche)) {
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
