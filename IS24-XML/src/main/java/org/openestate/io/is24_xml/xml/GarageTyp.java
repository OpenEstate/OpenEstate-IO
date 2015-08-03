
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for GarageTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GarageTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}ImmobilieBaseTyp"&gt;
 *       &lt;attribute name="ObjektKategorie2" type="{http://www.immobilienscout24.de/immobilientransfer}GaragenKategorieTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="Objektzustand" type="{http://www.immobilienscout24.de/immobilientransfer}ObjektZustandTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="Hoehe" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl42Typ" /&gt;
 *       &lt;attribute name="Laenge" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl52Typ" /&gt;
 *       &lt;attribute name="Breite" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl52Typ" /&gt;
 *       &lt;attribute name="Flaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Baujahr" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl4Typ" /&gt;
 *       &lt;attribute name="JahrLetzteModernisierung" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl4Typ" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GarageTyp")
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.GarageMiete.Type.class,
    org.openestate.io.is24_xml.xml.GarageKauf.Type.class
})
public class GarageTyp
    extends ImmobilieBaseTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "ObjektKategorie2")
    protected GaragenKategorieTyp objektKategorie2;
    @XmlAttribute(name = "Objektzustand")
    protected ObjektZustandTyp objektzustand;
    @XmlAttribute(name = "Hoehe")
    @XmlJavaTypeAdapter(Adapter29 .class)
    protected Double hoehe;
    @XmlAttribute(name = "Laenge")
    @XmlJavaTypeAdapter(Adapter30 .class)
    protected Double laenge;
    @XmlAttribute(name = "Breite")
    @XmlJavaTypeAdapter(Adapter30 .class)
    protected Double breite;
    @XmlAttribute(name = "Flaeche")
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected Double flaeche;
    @XmlAttribute(name = "Baujahr")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Long baujahr;
    @XmlAttribute(name = "JahrLetzteModernisierung")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Long jahrLetzteModernisierung;

    /**
     * Gets the value of the objektKategorie2 property.
     * 
     * @return
     *     possible object is
     *     {@link GaragenKategorieTyp }
     *     
     */
    public GaragenKategorieTyp getObjektKategorie2() {
        if (objektKategorie2 == null) {
            return GaragenKategorieTyp.KEINE_ANGABE;
        } else {
            return objektKategorie2;
        }
    }

    /**
     * Sets the value of the objektKategorie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GaragenKategorieTyp }
     *     
     */
    public void setObjektKategorie2(GaragenKategorieTyp value) {
        this.objektKategorie2 = value;
    }

    /**
     * Gets the value of the objektzustand property.
     * 
     * @return
     *     possible object is
     *     {@link ObjektZustandTyp }
     *     
     */
    public ObjektZustandTyp getObjektzustand() {
        if (objektzustand == null) {
            return ObjektZustandTyp.KEINE_ANGABE;
        } else {
            return objektzustand;
        }
    }

    /**
     * Sets the value of the objektzustand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjektZustandTyp }
     *     
     */
    public void setObjektzustand(ObjektZustandTyp value) {
        this.objektzustand = value;
    }

    /**
     * Gets the value of the hoehe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getHoehe() {
        return hoehe;
    }

    /**
     * Sets the value of the hoehe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoehe(Double value) {
        this.hoehe = value;
    }

    /**
     * Gets the value of the laenge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLaenge() {
        return laenge;
    }

    /**
     * Sets the value of the laenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaenge(Double value) {
        this.laenge = value;
    }

    /**
     * Gets the value of the breite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getBreite() {
        return breite;
    }

    /**
     * Sets the value of the breite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreite(Double value) {
        this.breite = value;
    }

    /**
     * Gets the value of the flaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getFlaeche() {
        return flaeche;
    }

    /**
     * Sets the value of the flaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlaeche(Double value) {
        this.flaeche = value;
    }

    /**
     * Gets the value of the baujahr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getBaujahr() {
        return baujahr;
    }

    /**
     * Sets the value of the baujahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaujahr(Long value) {
        this.baujahr = value;
    }

    /**
     * Gets the value of the jahrLetzteModernisierung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getJahrLetzteModernisierung() {
        return jahrLetzteModernisierung;
    }

    /**
     * Sets the value of the jahrLetzteModernisierung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJahrLetzteModernisierung(Long value) {
        this.jahrLetzteModernisierung = value;
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
            GaragenKategorieTyp theObjektKategorie2;
            theObjektKategorie2 = this.getObjektKategorie2();
            strategy.appendField(locator, this, "objektKategorie2", buffer, theObjektKategorie2);
        }
        {
            ObjektZustandTyp theObjektzustand;
            theObjektzustand = this.getObjektzustand();
            strategy.appendField(locator, this, "objektzustand", buffer, theObjektzustand);
        }
        {
            Double theHoehe;
            theHoehe = this.getHoehe();
            strategy.appendField(locator, this, "hoehe", buffer, theHoehe);
        }
        {
            Double theLaenge;
            theLaenge = this.getLaenge();
            strategy.appendField(locator, this, "laenge", buffer, theLaenge);
        }
        {
            Double theBreite;
            theBreite = this.getBreite();
            strategy.appendField(locator, this, "breite", buffer, theBreite);
        }
        {
            Double theFlaeche;
            theFlaeche = this.getFlaeche();
            strategy.appendField(locator, this, "flaeche", buffer, theFlaeche);
        }
        {
            Long theBaujahr;
            theBaujahr = this.getBaujahr();
            strategy.appendField(locator, this, "baujahr", buffer, theBaujahr);
        }
        {
            Long theJahrLetzteModernisierung;
            theJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
            strategy.appendField(locator, this, "jahrLetzteModernisierung", buffer, theJahrLetzteModernisierung);
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
        if (draftCopy instanceof GarageTyp) {
            final GarageTyp copy = ((GarageTyp) draftCopy);
            if (this.objektKategorie2 != null) {
                GaragenKategorieTyp sourceObjektKategorie2;
                sourceObjektKategorie2 = this.getObjektKategorie2();
                GaragenKategorieTyp copyObjektKategorie2 = ((GaragenKategorieTyp) strategy.copy(LocatorUtils.property(locator, "objektKategorie2", sourceObjektKategorie2), sourceObjektKategorie2));
                copy.setObjektKategorie2(copyObjektKategorie2);
            } else {
                copy.objektKategorie2 = null;
            }
            if (this.objektzustand!= null) {
                ObjektZustandTyp sourceObjektzustand;
                sourceObjektzustand = this.getObjektzustand();
                ObjektZustandTyp copyObjektzustand = ((ObjektZustandTyp) strategy.copy(LocatorUtils.property(locator, "objektzustand", sourceObjektzustand), sourceObjektzustand));
                copy.setObjektzustand(copyObjektzustand);
            } else {
                copy.objektzustand = null;
            }
            if (this.hoehe!= null) {
                Double sourceHoehe;
                sourceHoehe = this.getHoehe();
                Double copyHoehe = ((Double) strategy.copy(LocatorUtils.property(locator, "hoehe", sourceHoehe), sourceHoehe));
                copy.setHoehe(copyHoehe);
            } else {
                copy.hoehe = null;
            }
            if (this.laenge!= null) {
                Double sourceLaenge;
                sourceLaenge = this.getLaenge();
                Double copyLaenge = ((Double) strategy.copy(LocatorUtils.property(locator, "laenge", sourceLaenge), sourceLaenge));
                copy.setLaenge(copyLaenge);
            } else {
                copy.laenge = null;
            }
            if (this.breite!= null) {
                Double sourceBreite;
                sourceBreite = this.getBreite();
                Double copyBreite = ((Double) strategy.copy(LocatorUtils.property(locator, "breite", sourceBreite), sourceBreite));
                copy.setBreite(copyBreite);
            } else {
                copy.breite = null;
            }
            if (this.flaeche!= null) {
                Double sourceFlaeche;
                sourceFlaeche = this.getFlaeche();
                Double copyFlaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "flaeche", sourceFlaeche), sourceFlaeche));
                copy.setFlaeche(copyFlaeche);
            } else {
                copy.flaeche = null;
            }
            if (this.baujahr!= null) {
                Long sourceBaujahr;
                sourceBaujahr = this.getBaujahr();
                Long copyBaujahr = ((Long) strategy.copy(LocatorUtils.property(locator, "baujahr", sourceBaujahr), sourceBaujahr));
                copy.setBaujahr(copyBaujahr);
            } else {
                copy.baujahr = null;
            }
            if (this.jahrLetzteModernisierung!= null) {
                Long sourceJahrLetzteModernisierung;
                sourceJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
                Long copyJahrLetzteModernisierung = ((Long) strategy.copy(LocatorUtils.property(locator, "jahrLetzteModernisierung", sourceJahrLetzteModernisierung), sourceJahrLetzteModernisierung));
                copy.setJahrLetzteModernisierung(copyJahrLetzteModernisierung);
            } else {
                copy.jahrLetzteModernisierung = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new GarageTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GarageTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GarageTyp that = ((GarageTyp) object);
        {
            GaragenKategorieTyp lhsObjektKategorie2;
            lhsObjektKategorie2 = this.getObjektKategorie2();
            GaragenKategorieTyp rhsObjektKategorie2;
            rhsObjektKategorie2 = that.getObjektKategorie2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektKategorie2", lhsObjektKategorie2), LocatorUtils.property(thatLocator, "objektKategorie2", rhsObjektKategorie2), lhsObjektKategorie2, rhsObjektKategorie2)) {
                return false;
            }
        }
        {
            ObjektZustandTyp lhsObjektzustand;
            lhsObjektzustand = this.getObjektzustand();
            ObjektZustandTyp rhsObjektzustand;
            rhsObjektzustand = that.getObjektzustand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektzustand", lhsObjektzustand), LocatorUtils.property(thatLocator, "objektzustand", rhsObjektzustand), lhsObjektzustand, rhsObjektzustand)) {
                return false;
            }
        }
        {
            Double lhsHoehe;
            lhsHoehe = this.getHoehe();
            Double rhsHoehe;
            rhsHoehe = that.getHoehe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hoehe", lhsHoehe), LocatorUtils.property(thatLocator, "hoehe", rhsHoehe), lhsHoehe, rhsHoehe)) {
                return false;
            }
        }
        {
            Double lhsLaenge;
            lhsLaenge = this.getLaenge();
            Double rhsLaenge;
            rhsLaenge = that.getLaenge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "laenge", lhsLaenge), LocatorUtils.property(thatLocator, "laenge", rhsLaenge), lhsLaenge, rhsLaenge)) {
                return false;
            }
        }
        {
            Double lhsBreite;
            lhsBreite = this.getBreite();
            Double rhsBreite;
            rhsBreite = that.getBreite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "breite", lhsBreite), LocatorUtils.property(thatLocator, "breite", rhsBreite), lhsBreite, rhsBreite)) {
                return false;
            }
        }
        {
            Double lhsFlaeche;
            lhsFlaeche = this.getFlaeche();
            Double rhsFlaeche;
            rhsFlaeche = that.getFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flaeche", lhsFlaeche), LocatorUtils.property(thatLocator, "flaeche", rhsFlaeche), lhsFlaeche, rhsFlaeche)) {
                return false;
            }
        }
        {
            Long lhsBaujahr;
            lhsBaujahr = this.getBaujahr();
            Long rhsBaujahr;
            rhsBaujahr = that.getBaujahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baujahr", lhsBaujahr), LocatorUtils.property(thatLocator, "baujahr", rhsBaujahr), lhsBaujahr, rhsBaujahr)) {
                return false;
            }
        }
        {
            Long lhsJahrLetzteModernisierung;
            lhsJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
            Long rhsJahrLetzteModernisierung;
            rhsJahrLetzteModernisierung = that.getJahrLetzteModernisierung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jahrLetzteModernisierung", lhsJahrLetzteModernisierung), LocatorUtils.property(thatLocator, "jahrLetzteModernisierung", rhsJahrLetzteModernisierung), lhsJahrLetzteModernisierung, rhsJahrLetzteModernisierung)) {
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
