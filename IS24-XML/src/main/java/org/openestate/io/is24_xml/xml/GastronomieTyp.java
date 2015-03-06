
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for GastronomieTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GastronomieTyp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}GewerbeImmoBaseTyp">
 *       &lt;sequence>
 *         &lt;element name="Vermarktung" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungGewerbeTyp2"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GastraumFlaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" />
 *       &lt;attribute name="GastraumPlaetze" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl5Typ" />
 *       &lt;attribute name="AnzahlBetten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl5Typ" />
 *       &lt;attribute name="Gastterrasse" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Denkmalschutzobjekt" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Keller" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Objektkategorie2" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}GastroKategorieTyp" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GastronomieTyp", propOrder = {
    "vermarktung"
})
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.Gastronomie.Type.class
})
public class GastronomieTyp
    extends GewerbeImmoBaseTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "Vermarktung", required = true)
    protected VermarktungGewerbeTyp2 vermarktung;
    @XmlAttribute(name = "GastraumFlaeche", required = true)
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected Double gastraumFlaeche;
    @XmlAttribute(name = "GastraumPlaetze")
    @XmlJavaTypeAdapter(Adapter33 .class)
    protected Long gastraumPlaetze;
    @XmlAttribute(name = "AnzahlBetten")
    @XmlJavaTypeAdapter(Adapter33 .class)
    protected Long anzahlBetten;
    @XmlAttribute(name = "Gastterrasse")
    protected Boolean gastterrasse;
    @XmlAttribute(name = "Denkmalschutzobjekt")
    protected Boolean denkmalschutzobjekt;
    @XmlAttribute(name = "Keller")
    protected Boolean keller;
    @XmlAttribute(name = "Objektkategorie2", required = true)
    protected GastroKategorieTyp objektkategorie2;

    /**
     * Gets the value of the vermarktung property.
     * 
     * @return
     *     possible object is
     *     {@link VermarktungGewerbeTyp2 }
     *     
     */
    public VermarktungGewerbeTyp2 getVermarktung() {
        return vermarktung;
    }

    /**
     * Sets the value of the vermarktung property.
     * 
     * @param value
     *     allowed object is
     *     {@link VermarktungGewerbeTyp2 }
     *     
     */
    public void setVermarktung(VermarktungGewerbeTyp2 value) {
        this.vermarktung = value;
    }

    /**
     * Gets the value of the gastraumFlaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGastraumFlaeche() {
        return gastraumFlaeche;
    }

    /**
     * Sets the value of the gastraumFlaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGastraumFlaeche(Double value) {
        this.gastraumFlaeche = value;
    }

    /**
     * Gets the value of the gastraumPlaetze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getGastraumPlaetze() {
        return gastraumPlaetze;
    }

    /**
     * Sets the value of the gastraumPlaetze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGastraumPlaetze(Long value) {
        this.gastraumPlaetze = value;
    }

    /**
     * Gets the value of the anzahlBetten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAnzahlBetten() {
        return anzahlBetten;
    }

    /**
     * Sets the value of the anzahlBetten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlBetten(Long value) {
        this.anzahlBetten = value;
    }

    /**
     * Gets the value of the gastterrasse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGastterrasse() {
        return gastterrasse;
    }

    /**
     * Sets the value of the gastterrasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGastterrasse(Boolean value) {
        this.gastterrasse = value;
    }

    /**
     * Gets the value of the denkmalschutzobjekt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDenkmalschutzobjekt() {
        return denkmalschutzobjekt;
    }

    /**
     * Sets the value of the denkmalschutzobjekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDenkmalschutzobjekt(Boolean value) {
        this.denkmalschutzobjekt = value;
    }

    /**
     * Gets the value of the keller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeller() {
        return keller;
    }

    /**
     * Sets the value of the keller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeller(Boolean value) {
        this.keller = value;
    }

    /**
     * Gets the value of the objektkategorie2 property.
     * 
     * @return
     *     possible object is
     *     {@link GastroKategorieTyp }
     *     
     */
    public GastroKategorieTyp getObjektkategorie2() {
        return objektkategorie2;
    }

    /**
     * Sets the value of the objektkategorie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GastroKategorieTyp }
     *     
     */
    public void setObjektkategorie2(GastroKategorieTyp value) {
        this.objektkategorie2 = value;
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
            VermarktungGewerbeTyp2 theVermarktung;
            theVermarktung = this.getVermarktung();
            strategy.appendField(locator, this, "vermarktung", buffer, theVermarktung);
        }
        {
            Double theGastraumFlaeche;
            theGastraumFlaeche = this.getGastraumFlaeche();
            strategy.appendField(locator, this, "gastraumFlaeche", buffer, theGastraumFlaeche);
        }
        {
            Long theGastraumPlaetze;
            theGastraumPlaetze = this.getGastraumPlaetze();
            strategy.appendField(locator, this, "gastraumPlaetze", buffer, theGastraumPlaetze);
        }
        {
            Long theAnzahlBetten;
            theAnzahlBetten = this.getAnzahlBetten();
            strategy.appendField(locator, this, "anzahlBetten", buffer, theAnzahlBetten);
        }
        {
            Boolean theGastterrasse;
            theGastterrasse = this.isGastterrasse();
            strategy.appendField(locator, this, "gastterrasse", buffer, theGastterrasse);
        }
        {
            Boolean theDenkmalschutzobjekt;
            theDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
            strategy.appendField(locator, this, "denkmalschutzobjekt", buffer, theDenkmalschutzobjekt);
        }
        {
            Boolean theKeller;
            theKeller = this.isKeller();
            strategy.appendField(locator, this, "keller", buffer, theKeller);
        }
        {
            GastroKategorieTyp theObjektkategorie2;
            theObjektkategorie2 = this.getObjektkategorie2();
            strategy.appendField(locator, this, "objektkategorie2", buffer, theObjektkategorie2);
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
        if (draftCopy instanceof GastronomieTyp) {
            final GastronomieTyp copy = ((GastronomieTyp) draftCopy);
            if (this.vermarktung!= null) {
                VermarktungGewerbeTyp2 sourceVermarktung;
                sourceVermarktung = this.getVermarktung();
                VermarktungGewerbeTyp2 copyVermarktung = ((VermarktungGewerbeTyp2) strategy.copy(LocatorUtils.property(locator, "vermarktung", sourceVermarktung), sourceVermarktung));
                copy.setVermarktung(copyVermarktung);
            } else {
                copy.vermarktung = null;
            }
            if (this.gastraumFlaeche!= null) {
                Double sourceGastraumFlaeche;
                sourceGastraumFlaeche = this.getGastraumFlaeche();
                Double copyGastraumFlaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "gastraumFlaeche", sourceGastraumFlaeche), sourceGastraumFlaeche));
                copy.setGastraumFlaeche(copyGastraumFlaeche);
            } else {
                copy.gastraumFlaeche = null;
            }
            if (this.gastraumPlaetze!= null) {
                Long sourceGastraumPlaetze;
                sourceGastraumPlaetze = this.getGastraumPlaetze();
                Long copyGastraumPlaetze = ((Long) strategy.copy(LocatorUtils.property(locator, "gastraumPlaetze", sourceGastraumPlaetze), sourceGastraumPlaetze));
                copy.setGastraumPlaetze(copyGastraumPlaetze);
            } else {
                copy.gastraumPlaetze = null;
            }
            if (this.anzahlBetten!= null) {
                Long sourceAnzahlBetten;
                sourceAnzahlBetten = this.getAnzahlBetten();
                Long copyAnzahlBetten = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlBetten", sourceAnzahlBetten), sourceAnzahlBetten));
                copy.setAnzahlBetten(copyAnzahlBetten);
            } else {
                copy.anzahlBetten = null;
            }
            if (this.gastterrasse!= null) {
                Boolean sourceGastterrasse;
                sourceGastterrasse = this.isGastterrasse();
                Boolean copyGastterrasse = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gastterrasse", sourceGastterrasse), sourceGastterrasse));
                copy.setGastterrasse(copyGastterrasse);
            } else {
                copy.gastterrasse = null;
            }
            if (this.denkmalschutzobjekt!= null) {
                Boolean sourceDenkmalschutzobjekt;
                sourceDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
                Boolean copyDenkmalschutzobjekt = ((Boolean) strategy.copy(LocatorUtils.property(locator, "denkmalschutzobjekt", sourceDenkmalschutzobjekt), sourceDenkmalschutzobjekt));
                copy.setDenkmalschutzobjekt(copyDenkmalschutzobjekt);
            } else {
                copy.denkmalschutzobjekt = null;
            }
            if (this.keller!= null) {
                Boolean sourceKeller;
                sourceKeller = this.isKeller();
                Boolean copyKeller = ((Boolean) strategy.copy(LocatorUtils.property(locator, "keller", sourceKeller), sourceKeller));
                copy.setKeller(copyKeller);
            } else {
                copy.keller = null;
            }
            if (this.objektkategorie2 != null) {
                GastroKategorieTyp sourceObjektkategorie2;
                sourceObjektkategorie2 = this.getObjektkategorie2();
                GastroKategorieTyp copyObjektkategorie2 = ((GastroKategorieTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2));
                copy.setObjektkategorie2(copyObjektkategorie2);
            } else {
                copy.objektkategorie2 = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GastronomieTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GastronomieTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GastronomieTyp that = ((GastronomieTyp) object);
        {
            VermarktungGewerbeTyp2 lhsVermarktung;
            lhsVermarktung = this.getVermarktung();
            VermarktungGewerbeTyp2 rhsVermarktung;
            rhsVermarktung = that.getVermarktung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermarktung", lhsVermarktung), LocatorUtils.property(thatLocator, "vermarktung", rhsVermarktung), lhsVermarktung, rhsVermarktung)) {
                return false;
            }
        }
        {
            Double lhsGastraumFlaeche;
            lhsGastraumFlaeche = this.getGastraumFlaeche();
            Double rhsGastraumFlaeche;
            rhsGastraumFlaeche = that.getGastraumFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastraumFlaeche", lhsGastraumFlaeche), LocatorUtils.property(thatLocator, "gastraumFlaeche", rhsGastraumFlaeche), lhsGastraumFlaeche, rhsGastraumFlaeche)) {
                return false;
            }
        }
        {
            Long lhsGastraumPlaetze;
            lhsGastraumPlaetze = this.getGastraumPlaetze();
            Long rhsGastraumPlaetze;
            rhsGastraumPlaetze = that.getGastraumPlaetze();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastraumPlaetze", lhsGastraumPlaetze), LocatorUtils.property(thatLocator, "gastraumPlaetze", rhsGastraumPlaetze), lhsGastraumPlaetze, rhsGastraumPlaetze)) {
                return false;
            }
        }
        {
            Long lhsAnzahlBetten;
            lhsAnzahlBetten = this.getAnzahlBetten();
            Long rhsAnzahlBetten;
            rhsAnzahlBetten = that.getAnzahlBetten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBetten", lhsAnzahlBetten), LocatorUtils.property(thatLocator, "anzahlBetten", rhsAnzahlBetten), lhsAnzahlBetten, rhsAnzahlBetten)) {
                return false;
            }
        }
        {
            Boolean lhsGastterrasse;
            lhsGastterrasse = this.isGastterrasse();
            Boolean rhsGastterrasse;
            rhsGastterrasse = that.isGastterrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastterrasse", lhsGastterrasse), LocatorUtils.property(thatLocator, "gastterrasse", rhsGastterrasse), lhsGastterrasse, rhsGastterrasse)) {
                return false;
            }
        }
        {
            Boolean lhsDenkmalschutzobjekt;
            lhsDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
            Boolean rhsDenkmalschutzobjekt;
            rhsDenkmalschutzobjekt = that.isDenkmalschutzobjekt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "denkmalschutzobjekt", lhsDenkmalschutzobjekt), LocatorUtils.property(thatLocator, "denkmalschutzobjekt", rhsDenkmalschutzobjekt), lhsDenkmalschutzobjekt, rhsDenkmalschutzobjekt)) {
                return false;
            }
        }
        {
            Boolean lhsKeller;
            lhsKeller = this.isKeller();
            Boolean rhsKeller;
            rhsKeller = that.isKeller();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keller", lhsKeller), LocatorUtils.property(thatLocator, "keller", rhsKeller), lhsKeller, rhsKeller)) {
                return false;
            }
        }
        {
            GastroKategorieTyp lhsObjektkategorie2;
            lhsObjektkategorie2 = this.getObjektkategorie2();
            GastroKategorieTyp rhsObjektkategorie2;
            rhsObjektkategorie2 = that.getObjektkategorie2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie2", lhsObjektkategorie2), LocatorUtils.property(thatLocator, "objektkategorie2", rhsObjektkategorie2), lhsObjektkategorie2, rhsObjektkategorie2)) {
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
