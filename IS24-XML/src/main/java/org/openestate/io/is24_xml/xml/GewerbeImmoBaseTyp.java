
package org.openestate.io.is24_xml.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for GewerbeImmoBaseTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GewerbeImmoBaseTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}ImmobilieBaseTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BefeuerungsArt" type="{http://www.immobilienscout24.de/immobilientransfer}BefeuerungsArtTyp" minOccurs="0"/&gt;
 *         &lt;element name="Energieausweis" type="{http://www.immobilienscout24.de/immobilientransfer}EnergieausweisTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Gesamtflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Nebenflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="TeilbarAb" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Etagen" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *       &lt;attribute name="FreiAb" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *       &lt;attribute name="Baujahr" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl4Typ" /&gt;
 *       &lt;attribute name="Objektzustand" type="{http://www.immobilienscout24.de/immobilientransfer}ObjektZustandTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="Personenaufzug" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnzahlParkflaechen" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl5Typ" /&gt;
 *       &lt;attribute name="FusswegOeNV" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
 *       &lt;attribute name="FahrzeitBHf" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
 *       &lt;attribute name="FahrzeitBAB" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3Typ" /&gt;
 *       &lt;attribute name="FahrzeitFlughafen" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3Typ" /&gt;
 *       &lt;attribute name="Heizungsart" type="{http://www.immobilienscout24.de/immobilientransfer}HeizungsartTyp" /&gt;
 *       &lt;attribute name="JahrLetzteModernisierung" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl4Typ" /&gt;
 *       &lt;attribute name="Ausstattungsqualitaet" type="{http://www.immobilienscout24.de/immobilientransfer}AusstattungsqualitaetsTyp" default="KeineAngabe" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GewerbeImmoBaseTyp", propOrder = {
    "befeuerungsArt",
    "energieausweis"
})
@XmlSeeAlso({
    BueroPraxisTyp.class,
    EinzelhandelTyp.class,
    GastronomieTyp.class,
    HalleProduktionTyp.class,
    SonstigeGewerbeTyp.class,
    AnlageObjektTyp.class
})
public abstract class GewerbeImmoBaseTyp
    extends ImmobilieBaseTyp
    implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "BefeuerungsArt")
    protected BefeuerungsArtTyp befeuerungsArt;
    @XmlElement(name = "Energieausweis")
    protected EnergieausweisTyp energieausweis;
    @XmlAttribute(name = "Gesamtflaeche")
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal gesamtflaeche;
    @XmlAttribute(name = "Nebenflaeche")
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal nebenflaeche;
    @XmlAttribute(name = "TeilbarAb")
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal teilbarAb;
    @XmlAttribute(name = "Etagen")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String etagen;
    @XmlAttribute(name = "FreiAb")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String freiAb;
    @XmlAttribute(name = "Baujahr")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Long baujahr;
    @XmlAttribute(name = "Objektzustand")
    protected ObjektZustandTyp objektzustand;
    @XmlAttribute(name = "Personenaufzug")
    protected Boolean personenaufzug;
    @XmlAttribute(name = "AnzahlParkflaechen")
    @XmlJavaTypeAdapter(Adapter23 .class)
    protected Long anzahlParkflaechen;
    @XmlAttribute(name = "FusswegOeNV")
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected Long fusswegOeNV;
    @XmlAttribute(name = "FahrzeitBHf")
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected Long fahrzeitBHf;
    @XmlAttribute(name = "FahrzeitBAB")
    @XmlJavaTypeAdapter(Adapter21 .class)
    protected Long fahrzeitBAB;
    @XmlAttribute(name = "FahrzeitFlughafen")
    @XmlJavaTypeAdapter(Adapter21 .class)
    protected Long fahrzeitFlughafen;
    @XmlAttribute(name = "Heizungsart")
    protected HeizungsartTyp heizungsart;
    @XmlAttribute(name = "JahrLetzteModernisierung")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Long jahrLetzteModernisierung;
    @XmlAttribute(name = "Ausstattungsqualitaet")
    protected AusstattungsqualitaetsTyp ausstattungsqualitaet;

    /**
     * Gets the value of the befeuerungsArt property.
     * 
     * @return
     *     possible object is
     *     {@link BefeuerungsArtTyp }
     *     
     */
    public BefeuerungsArtTyp getBefeuerungsArt() {
        return befeuerungsArt;
    }

    /**
     * Sets the value of the befeuerungsArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BefeuerungsArtTyp }
     *     
     */
    public void setBefeuerungsArt(BefeuerungsArtTyp value) {
        this.befeuerungsArt = value;
    }

    /**
     * Gets the value of the energieausweis property.
     * 
     * @return
     *     possible object is
     *     {@link EnergieausweisTyp }
     *     
     */
    public EnergieausweisTyp getEnergieausweis() {
        return energieausweis;
    }

    /**
     * Sets the value of the energieausweis property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergieausweisTyp }
     *     
     */
    public void setEnergieausweis(EnergieausweisTyp value) {
        this.energieausweis = value;
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

    /**
     * Gets the value of the nebenflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getNebenflaeche() {
        return nebenflaeche;
    }

    /**
     * Sets the value of the nebenflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNebenflaeche(BigDecimal value) {
        this.nebenflaeche = value;
    }

    /**
     * Gets the value of the teilbarAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getTeilbarAb() {
        return teilbarAb;
    }

    /**
     * Sets the value of the teilbarAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeilbarAb(BigDecimal value) {
        this.teilbarAb = value;
    }

    /**
     * Gets the value of the etagen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtagen() {
        return etagen;
    }

    /**
     * Sets the value of the etagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtagen(String value) {
        this.etagen = value;
    }

    /**
     * Gets the value of the freiAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreiAb() {
        return freiAb;
    }

    /**
     * Sets the value of the freiAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreiAb(String value) {
        this.freiAb = value;
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
     * Gets the value of the personenaufzug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonenaufzug() {
        return personenaufzug;
    }

    /**
     * Sets the value of the personenaufzug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonenaufzug(Boolean value) {
        this.personenaufzug = value;
    }

    /**
     * Gets the value of the anzahlParkflaechen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAnzahlParkflaechen() {
        return anzahlParkflaechen;
    }

    /**
     * Sets the value of the anzahlParkflaechen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlParkflaechen(Long value) {
        this.anzahlParkflaechen = value;
    }

    /**
     * Gets the value of the fusswegOeNV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFusswegOeNV() {
        return fusswegOeNV;
    }

    /**
     * Sets the value of the fusswegOeNV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFusswegOeNV(Long value) {
        this.fusswegOeNV = value;
    }

    /**
     * Gets the value of the fahrzeitBHf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFahrzeitBHf() {
        return fahrzeitBHf;
    }

    /**
     * Sets the value of the fahrzeitBHf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFahrzeitBHf(Long value) {
        this.fahrzeitBHf = value;
    }

    /**
     * Gets the value of the fahrzeitBAB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFahrzeitBAB() {
        return fahrzeitBAB;
    }

    /**
     * Sets the value of the fahrzeitBAB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFahrzeitBAB(Long value) {
        this.fahrzeitBAB = value;
    }

    /**
     * Gets the value of the fahrzeitFlughafen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFahrzeitFlughafen() {
        return fahrzeitFlughafen;
    }

    /**
     * Sets the value of the fahrzeitFlughafen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFahrzeitFlughafen(Long value) {
        this.fahrzeitFlughafen = value;
    }

    /**
     * Gets the value of the heizungsart property.
     * 
     * @return
     *     possible object is
     *     {@link HeizungsartTyp }
     *     
     */
    public HeizungsartTyp getHeizungsart() {
        return heizungsart;
    }

    /**
     * Sets the value of the heizungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeizungsartTyp }
     *     
     */
    public void setHeizungsart(HeizungsartTyp value) {
        this.heizungsart = value;
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

    /**
     * Gets the value of the ausstattungsqualitaet property.
     * 
     * @return
     *     possible object is
     *     {@link AusstattungsqualitaetsTyp }
     *     
     */
    public AusstattungsqualitaetsTyp getAusstattungsqualitaet() {
        if (ausstattungsqualitaet == null) {
            return AusstattungsqualitaetsTyp.KEINE_ANGABE;
        } else {
            return ausstattungsqualitaet;
        }
    }

    /**
     * Sets the value of the ausstattungsqualitaet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AusstattungsqualitaetsTyp }
     *     
     */
    public void setAusstattungsqualitaet(AusstattungsqualitaetsTyp value) {
        this.ausstattungsqualitaet = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            BefeuerungsArtTyp theBefeuerungsArt;
            theBefeuerungsArt = this.getBefeuerungsArt();
            strategy.appendField(locator, this, "befeuerungsArt", buffer, theBefeuerungsArt, (this.befeuerungsArt!= null));
        }
        {
            EnergieausweisTyp theEnergieausweis;
            theEnergieausweis = this.getEnergieausweis();
            strategy.appendField(locator, this, "energieausweis", buffer, theEnergieausweis, (this.energieausweis!= null));
        }
        {
            BigDecimal theGesamtflaeche;
            theGesamtflaeche = this.getGesamtflaeche();
            strategy.appendField(locator, this, "gesamtflaeche", buffer, theGesamtflaeche, (this.gesamtflaeche!= null));
        }
        {
            BigDecimal theNebenflaeche;
            theNebenflaeche = this.getNebenflaeche();
            strategy.appendField(locator, this, "nebenflaeche", buffer, theNebenflaeche, (this.nebenflaeche!= null));
        }
        {
            BigDecimal theTeilbarAb;
            theTeilbarAb = this.getTeilbarAb();
            strategy.appendField(locator, this, "teilbarAb", buffer, theTeilbarAb, (this.teilbarAb!= null));
        }
        {
            String theEtagen;
            theEtagen = this.getEtagen();
            strategy.appendField(locator, this, "etagen", buffer, theEtagen, (this.etagen!= null));
        }
        {
            String theFreiAb;
            theFreiAb = this.getFreiAb();
            strategy.appendField(locator, this, "freiAb", buffer, theFreiAb, (this.freiAb!= null));
        }
        {
            Long theBaujahr;
            theBaujahr = this.getBaujahr();
            strategy.appendField(locator, this, "baujahr", buffer, theBaujahr, (this.baujahr!= null));
        }
        {
            ObjektZustandTyp theObjektzustand;
            theObjektzustand = this.getObjektzustand();
            strategy.appendField(locator, this, "objektzustand", buffer, theObjektzustand, (this.objektzustand!= null));
        }
        {
            Boolean thePersonenaufzug;
            thePersonenaufzug = this.isPersonenaufzug();
            strategy.appendField(locator, this, "personenaufzug", buffer, thePersonenaufzug, (this.personenaufzug!= null));
        }
        {
            Long theAnzahlParkflaechen;
            theAnzahlParkflaechen = this.getAnzahlParkflaechen();
            strategy.appendField(locator, this, "anzahlParkflaechen", buffer, theAnzahlParkflaechen, (this.anzahlParkflaechen!= null));
        }
        {
            Long theFusswegOeNV;
            theFusswegOeNV = this.getFusswegOeNV();
            strategy.appendField(locator, this, "fusswegOeNV", buffer, theFusswegOeNV, (this.fusswegOeNV!= null));
        }
        {
            Long theFahrzeitBHf;
            theFahrzeitBHf = this.getFahrzeitBHf();
            strategy.appendField(locator, this, "fahrzeitBHf", buffer, theFahrzeitBHf, (this.fahrzeitBHf!= null));
        }
        {
            Long theFahrzeitBAB;
            theFahrzeitBAB = this.getFahrzeitBAB();
            strategy.appendField(locator, this, "fahrzeitBAB", buffer, theFahrzeitBAB, (this.fahrzeitBAB!= null));
        }
        {
            Long theFahrzeitFlughafen;
            theFahrzeitFlughafen = this.getFahrzeitFlughafen();
            strategy.appendField(locator, this, "fahrzeitFlughafen", buffer, theFahrzeitFlughafen, (this.fahrzeitFlughafen!= null));
        }
        {
            HeizungsartTyp theHeizungsart;
            theHeizungsart = this.getHeizungsart();
            strategy.appendField(locator, this, "heizungsart", buffer, theHeizungsart, (this.heizungsart!= null));
        }
        {
            Long theJahrLetzteModernisierung;
            theJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
            strategy.appendField(locator, this, "jahrLetzteModernisierung", buffer, theJahrLetzteModernisierung, (this.jahrLetzteModernisierung!= null));
        }
        {
            AusstattungsqualitaetsTyp theAusstattungsqualitaet;
            theAusstattungsqualitaet = this.getAusstattungsqualitaet();
            strategy.appendField(locator, this, "ausstattungsqualitaet", buffer, theAusstattungsqualitaet, (this.ausstattungsqualitaet!= null));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof GewerbeImmoBaseTyp) {
            final GewerbeImmoBaseTyp copy = ((GewerbeImmoBaseTyp) target);
            {
                Boolean befeuerungsArtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.befeuerungsArt!= null));
                if (befeuerungsArtShouldBeCopiedAndSet == Boolean.TRUE) {
                    BefeuerungsArtTyp sourceBefeuerungsArt;
                    sourceBefeuerungsArt = this.getBefeuerungsArt();
                    BefeuerungsArtTyp copyBefeuerungsArt = ((BefeuerungsArtTyp) strategy.copy(LocatorUtils.property(locator, "befeuerungsArt", sourceBefeuerungsArt), sourceBefeuerungsArt, (this.befeuerungsArt!= null)));
                    copy.setBefeuerungsArt(copyBefeuerungsArt);
                } else {
                    if (befeuerungsArtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.befeuerungsArt = null;
                    }
                }
            }
            {
                Boolean energieausweisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energieausweis!= null));
                if (energieausweisShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergieausweisTyp sourceEnergieausweis;
                    sourceEnergieausweis = this.getEnergieausweis();
                    EnergieausweisTyp copyEnergieausweis = ((EnergieausweisTyp) strategy.copy(LocatorUtils.property(locator, "energieausweis", sourceEnergieausweis), sourceEnergieausweis, (this.energieausweis!= null)));
                    copy.setEnergieausweis(copyEnergieausweis);
                } else {
                    if (energieausweisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energieausweis = null;
                    }
                }
            }
            {
                Boolean gesamtflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gesamtflaeche!= null));
                if (gesamtflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGesamtflaeche;
                    sourceGesamtflaeche = this.getGesamtflaeche();
                    BigDecimal copyGesamtflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gesamtflaeche", sourceGesamtflaeche), sourceGesamtflaeche, (this.gesamtflaeche!= null)));
                    copy.setGesamtflaeche(copyGesamtflaeche);
                } else {
                    if (gesamtflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gesamtflaeche = null;
                    }
                }
            }
            {
                Boolean nebenflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nebenflaeche!= null));
                if (nebenflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNebenflaeche;
                    sourceNebenflaeche = this.getNebenflaeche();
                    BigDecimal copyNebenflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nebenflaeche", sourceNebenflaeche), sourceNebenflaeche, (this.nebenflaeche!= null)));
                    copy.setNebenflaeche(copyNebenflaeche);
                } else {
                    if (nebenflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nebenflaeche = null;
                    }
                }
            }
            {
                Boolean teilbarAbShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.teilbarAb!= null));
                if (teilbarAbShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceTeilbarAb;
                    sourceTeilbarAb = this.getTeilbarAb();
                    BigDecimal copyTeilbarAb = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "teilbarAb", sourceTeilbarAb), sourceTeilbarAb, (this.teilbarAb!= null)));
                    copy.setTeilbarAb(copyTeilbarAb);
                } else {
                    if (teilbarAbShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.teilbarAb = null;
                    }
                }
            }
            {
                Boolean etagenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.etagen!= null));
                if (etagenShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEtagen;
                    sourceEtagen = this.getEtagen();
                    String copyEtagen = ((String) strategy.copy(LocatorUtils.property(locator, "etagen", sourceEtagen), sourceEtagen, (this.etagen!= null)));
                    copy.setEtagen(copyEtagen);
                } else {
                    if (etagenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.etagen = null;
                    }
                }
            }
            {
                Boolean freiAbShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freiAb!= null));
                if (freiAbShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFreiAb;
                    sourceFreiAb = this.getFreiAb();
                    String copyFreiAb = ((String) strategy.copy(LocatorUtils.property(locator, "freiAb", sourceFreiAb), sourceFreiAb, (this.freiAb!= null)));
                    copy.setFreiAb(copyFreiAb);
                } else {
                    if (freiAbShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freiAb = null;
                    }
                }
            }
            {
                Boolean baujahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.baujahr!= null));
                if (baujahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceBaujahr;
                    sourceBaujahr = this.getBaujahr();
                    Long copyBaujahr = ((Long) strategy.copy(LocatorUtils.property(locator, "baujahr", sourceBaujahr), sourceBaujahr, (this.baujahr!= null)));
                    copy.setBaujahr(copyBaujahr);
                } else {
                    if (baujahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.baujahr = null;
                    }
                }
            }
            {
                Boolean objektzustandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektzustand!= null));
                if (objektzustandShouldBeCopiedAndSet == Boolean.TRUE) {
                    ObjektZustandTyp sourceObjektzustand;
                    sourceObjektzustand = this.getObjektzustand();
                    ObjektZustandTyp copyObjektzustand = ((ObjektZustandTyp) strategy.copy(LocatorUtils.property(locator, "objektzustand", sourceObjektzustand), sourceObjektzustand, (this.objektzustand!= null)));
                    copy.setObjektzustand(copyObjektzustand);
                } else {
                    if (objektzustandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektzustand = null;
                    }
                }
            }
            {
                Boolean personenaufzugShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.personenaufzug!= null));
                if (personenaufzugShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePersonenaufzug;
                    sourcePersonenaufzug = this.isPersonenaufzug();
                    Boolean copyPersonenaufzug = ((Boolean) strategy.copy(LocatorUtils.property(locator, "personenaufzug", sourcePersonenaufzug), sourcePersonenaufzug, (this.personenaufzug!= null)));
                    copy.setPersonenaufzug(copyPersonenaufzug);
                } else {
                    if (personenaufzugShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.personenaufzug = null;
                    }
                }
            }
            {
                Boolean anzahlParkflaechenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlParkflaechen!= null));
                if (anzahlParkflaechenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAnzahlParkflaechen;
                    sourceAnzahlParkflaechen = this.getAnzahlParkflaechen();
                    Long copyAnzahlParkflaechen = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlParkflaechen", sourceAnzahlParkflaechen), sourceAnzahlParkflaechen, (this.anzahlParkflaechen!= null)));
                    copy.setAnzahlParkflaechen(copyAnzahlParkflaechen);
                } else {
                    if (anzahlParkflaechenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlParkflaechen = null;
                    }
                }
            }
            {
                Boolean fusswegOeNVShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fusswegOeNV!= null));
                if (fusswegOeNVShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceFusswegOeNV;
                    sourceFusswegOeNV = this.getFusswegOeNV();
                    Long copyFusswegOeNV = ((Long) strategy.copy(LocatorUtils.property(locator, "fusswegOeNV", sourceFusswegOeNV), sourceFusswegOeNV, (this.fusswegOeNV!= null)));
                    copy.setFusswegOeNV(copyFusswegOeNV);
                } else {
                    if (fusswegOeNVShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fusswegOeNV = null;
                    }
                }
            }
            {
                Boolean fahrzeitBHfShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fahrzeitBHf!= null));
                if (fahrzeitBHfShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceFahrzeitBHf;
                    sourceFahrzeitBHf = this.getFahrzeitBHf();
                    Long copyFahrzeitBHf = ((Long) strategy.copy(LocatorUtils.property(locator, "fahrzeitBHf", sourceFahrzeitBHf), sourceFahrzeitBHf, (this.fahrzeitBHf!= null)));
                    copy.setFahrzeitBHf(copyFahrzeitBHf);
                } else {
                    if (fahrzeitBHfShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fahrzeitBHf = null;
                    }
                }
            }
            {
                Boolean fahrzeitBABShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fahrzeitBAB!= null));
                if (fahrzeitBABShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceFahrzeitBAB;
                    sourceFahrzeitBAB = this.getFahrzeitBAB();
                    Long copyFahrzeitBAB = ((Long) strategy.copy(LocatorUtils.property(locator, "fahrzeitBAB", sourceFahrzeitBAB), sourceFahrzeitBAB, (this.fahrzeitBAB!= null)));
                    copy.setFahrzeitBAB(copyFahrzeitBAB);
                } else {
                    if (fahrzeitBABShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fahrzeitBAB = null;
                    }
                }
            }
            {
                Boolean fahrzeitFlughafenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fahrzeitFlughafen!= null));
                if (fahrzeitFlughafenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceFahrzeitFlughafen;
                    sourceFahrzeitFlughafen = this.getFahrzeitFlughafen();
                    Long copyFahrzeitFlughafen = ((Long) strategy.copy(LocatorUtils.property(locator, "fahrzeitFlughafen", sourceFahrzeitFlughafen), sourceFahrzeitFlughafen, (this.fahrzeitFlughafen!= null)));
                    copy.setFahrzeitFlughafen(copyFahrzeitFlughafen);
                } else {
                    if (fahrzeitFlughafenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fahrzeitFlughafen = null;
                    }
                }
            }
            {
                Boolean heizungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heizungsart!= null));
                if (heizungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    HeizungsartTyp sourceHeizungsart;
                    sourceHeizungsart = this.getHeizungsart();
                    HeizungsartTyp copyHeizungsart = ((HeizungsartTyp) strategy.copy(LocatorUtils.property(locator, "heizungsart", sourceHeizungsart), sourceHeizungsart, (this.heizungsart!= null)));
                    copy.setHeizungsart(copyHeizungsart);
                } else {
                    if (heizungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heizungsart = null;
                    }
                }
            }
            {
                Boolean jahrLetzteModernisierungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.jahrLetzteModernisierung!= null));
                if (jahrLetzteModernisierungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceJahrLetzteModernisierung;
                    sourceJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
                    Long copyJahrLetzteModernisierung = ((Long) strategy.copy(LocatorUtils.property(locator, "jahrLetzteModernisierung", sourceJahrLetzteModernisierung), sourceJahrLetzteModernisierung, (this.jahrLetzteModernisierung!= null)));
                    copy.setJahrLetzteModernisierung(copyJahrLetzteModernisierung);
                } else {
                    if (jahrLetzteModernisierungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.jahrLetzteModernisierung = null;
                    }
                }
            }
            {
                Boolean ausstattungsqualitaetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausstattungsqualitaet!= null));
                if (ausstattungsqualitaetShouldBeCopiedAndSet == Boolean.TRUE) {
                    AusstattungsqualitaetsTyp sourceAusstattungsqualitaet;
                    sourceAusstattungsqualitaet = this.getAusstattungsqualitaet();
                    AusstattungsqualitaetsTyp copyAusstattungsqualitaet = ((AusstattungsqualitaetsTyp) strategy.copy(LocatorUtils.property(locator, "ausstattungsqualitaet", sourceAusstattungsqualitaet), sourceAusstattungsqualitaet, (this.ausstattungsqualitaet!= null)));
                    copy.setAusstattungsqualitaet(copyAusstattungsqualitaet);
                } else {
                    if (ausstattungsqualitaetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausstattungsqualitaet = null;
                    }
                }
            }
        }
        return target;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GewerbeImmoBaseTyp that = ((GewerbeImmoBaseTyp) object);
        {
            BefeuerungsArtTyp lhsBefeuerungsArt;
            lhsBefeuerungsArt = this.getBefeuerungsArt();
            BefeuerungsArtTyp rhsBefeuerungsArt;
            rhsBefeuerungsArt = that.getBefeuerungsArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "befeuerungsArt", lhsBefeuerungsArt), LocatorUtils.property(thatLocator, "befeuerungsArt", rhsBefeuerungsArt), lhsBefeuerungsArt, rhsBefeuerungsArt, (this.befeuerungsArt!= null), (that.befeuerungsArt!= null))) {
                return false;
            }
        }
        {
            EnergieausweisTyp lhsEnergieausweis;
            lhsEnergieausweis = this.getEnergieausweis();
            EnergieausweisTyp rhsEnergieausweis;
            rhsEnergieausweis = that.getEnergieausweis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieausweis", lhsEnergieausweis), LocatorUtils.property(thatLocator, "energieausweis", rhsEnergieausweis), lhsEnergieausweis, rhsEnergieausweis, (this.energieausweis!= null), (that.energieausweis!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGesamtflaeche;
            lhsGesamtflaeche = this.getGesamtflaeche();
            BigDecimal rhsGesamtflaeche;
            rhsGesamtflaeche = that.getGesamtflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtflaeche", lhsGesamtflaeche), LocatorUtils.property(thatLocator, "gesamtflaeche", rhsGesamtflaeche), lhsGesamtflaeche, rhsGesamtflaeche, (this.gesamtflaeche!= null), (that.gesamtflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNebenflaeche;
            lhsNebenflaeche = this.getNebenflaeche();
            BigDecimal rhsNebenflaeche;
            rhsNebenflaeche = that.getNebenflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nebenflaeche", lhsNebenflaeche), LocatorUtils.property(thatLocator, "nebenflaeche", rhsNebenflaeche), lhsNebenflaeche, rhsNebenflaeche, (this.nebenflaeche!= null), (that.nebenflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTeilbarAb;
            lhsTeilbarAb = this.getTeilbarAb();
            BigDecimal rhsTeilbarAb;
            rhsTeilbarAb = that.getTeilbarAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teilbarAb", lhsTeilbarAb), LocatorUtils.property(thatLocator, "teilbarAb", rhsTeilbarAb), lhsTeilbarAb, rhsTeilbarAb, (this.teilbarAb!= null), (that.teilbarAb!= null))) {
                return false;
            }
        }
        {
            String lhsEtagen;
            lhsEtagen = this.getEtagen();
            String rhsEtagen;
            rhsEtagen = that.getEtagen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etagen", lhsEtagen), LocatorUtils.property(thatLocator, "etagen", rhsEtagen), lhsEtagen, rhsEtagen, (this.etagen!= null), (that.etagen!= null))) {
                return false;
            }
        }
        {
            String lhsFreiAb;
            lhsFreiAb = this.getFreiAb();
            String rhsFreiAb;
            rhsFreiAb = that.getFreiAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiAb", lhsFreiAb), LocatorUtils.property(thatLocator, "freiAb", rhsFreiAb), lhsFreiAb, rhsFreiAb, (this.freiAb!= null), (that.freiAb!= null))) {
                return false;
            }
        }
        {
            Long lhsBaujahr;
            lhsBaujahr = this.getBaujahr();
            Long rhsBaujahr;
            rhsBaujahr = that.getBaujahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baujahr", lhsBaujahr), LocatorUtils.property(thatLocator, "baujahr", rhsBaujahr), lhsBaujahr, rhsBaujahr, (this.baujahr!= null), (that.baujahr!= null))) {
                return false;
            }
        }
        {
            ObjektZustandTyp lhsObjektzustand;
            lhsObjektzustand = this.getObjektzustand();
            ObjektZustandTyp rhsObjektzustand;
            rhsObjektzustand = that.getObjektzustand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektzustand", lhsObjektzustand), LocatorUtils.property(thatLocator, "objektzustand", rhsObjektzustand), lhsObjektzustand, rhsObjektzustand, (this.objektzustand!= null), (that.objektzustand!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPersonenaufzug;
            lhsPersonenaufzug = this.isPersonenaufzug();
            Boolean rhsPersonenaufzug;
            rhsPersonenaufzug = that.isPersonenaufzug();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personenaufzug", lhsPersonenaufzug), LocatorUtils.property(thatLocator, "personenaufzug", rhsPersonenaufzug), lhsPersonenaufzug, rhsPersonenaufzug, (this.personenaufzug!= null), (that.personenaufzug!= null))) {
                return false;
            }
        }
        {
            Long lhsAnzahlParkflaechen;
            lhsAnzahlParkflaechen = this.getAnzahlParkflaechen();
            Long rhsAnzahlParkflaechen;
            rhsAnzahlParkflaechen = that.getAnzahlParkflaechen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlParkflaechen", lhsAnzahlParkflaechen), LocatorUtils.property(thatLocator, "anzahlParkflaechen", rhsAnzahlParkflaechen), lhsAnzahlParkflaechen, rhsAnzahlParkflaechen, (this.anzahlParkflaechen!= null), (that.anzahlParkflaechen!= null))) {
                return false;
            }
        }
        {
            Long lhsFusswegOeNV;
            lhsFusswegOeNV = this.getFusswegOeNV();
            Long rhsFusswegOeNV;
            rhsFusswegOeNV = that.getFusswegOeNV();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fusswegOeNV", lhsFusswegOeNV), LocatorUtils.property(thatLocator, "fusswegOeNV", rhsFusswegOeNV), lhsFusswegOeNV, rhsFusswegOeNV, (this.fusswegOeNV!= null), (that.fusswegOeNV!= null))) {
                return false;
            }
        }
        {
            Long lhsFahrzeitBHf;
            lhsFahrzeitBHf = this.getFahrzeitBHf();
            Long rhsFahrzeitBHf;
            rhsFahrzeitBHf = that.getFahrzeitBHf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fahrzeitBHf", lhsFahrzeitBHf), LocatorUtils.property(thatLocator, "fahrzeitBHf", rhsFahrzeitBHf), lhsFahrzeitBHf, rhsFahrzeitBHf, (this.fahrzeitBHf!= null), (that.fahrzeitBHf!= null))) {
                return false;
            }
        }
        {
            Long lhsFahrzeitBAB;
            lhsFahrzeitBAB = this.getFahrzeitBAB();
            Long rhsFahrzeitBAB;
            rhsFahrzeitBAB = that.getFahrzeitBAB();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fahrzeitBAB", lhsFahrzeitBAB), LocatorUtils.property(thatLocator, "fahrzeitBAB", rhsFahrzeitBAB), lhsFahrzeitBAB, rhsFahrzeitBAB, (this.fahrzeitBAB!= null), (that.fahrzeitBAB!= null))) {
                return false;
            }
        }
        {
            Long lhsFahrzeitFlughafen;
            lhsFahrzeitFlughafen = this.getFahrzeitFlughafen();
            Long rhsFahrzeitFlughafen;
            rhsFahrzeitFlughafen = that.getFahrzeitFlughafen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fahrzeitFlughafen", lhsFahrzeitFlughafen), LocatorUtils.property(thatLocator, "fahrzeitFlughafen", rhsFahrzeitFlughafen), lhsFahrzeitFlughafen, rhsFahrzeitFlughafen, (this.fahrzeitFlughafen!= null), (that.fahrzeitFlughafen!= null))) {
                return false;
            }
        }
        {
            HeizungsartTyp lhsHeizungsart;
            lhsHeizungsart = this.getHeizungsart();
            HeizungsartTyp rhsHeizungsart;
            rhsHeizungsart = that.getHeizungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizungsart", lhsHeizungsart), LocatorUtils.property(thatLocator, "heizungsart", rhsHeizungsart), lhsHeizungsart, rhsHeizungsart, (this.heizungsart!= null), (that.heizungsart!= null))) {
                return false;
            }
        }
        {
            Long lhsJahrLetzteModernisierung;
            lhsJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
            Long rhsJahrLetzteModernisierung;
            rhsJahrLetzteModernisierung = that.getJahrLetzteModernisierung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jahrLetzteModernisierung", lhsJahrLetzteModernisierung), LocatorUtils.property(thatLocator, "jahrLetzteModernisierung", rhsJahrLetzteModernisierung), lhsJahrLetzteModernisierung, rhsJahrLetzteModernisierung, (this.jahrLetzteModernisierung!= null), (that.jahrLetzteModernisierung!= null))) {
                return false;
            }
        }
        {
            AusstattungsqualitaetsTyp lhsAusstattungsqualitaet;
            lhsAusstattungsqualitaet = this.getAusstattungsqualitaet();
            AusstattungsqualitaetsTyp rhsAusstattungsqualitaet;
            rhsAusstattungsqualitaet = that.getAusstattungsqualitaet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausstattungsqualitaet", lhsAusstattungsqualitaet), LocatorUtils.property(thatLocator, "ausstattungsqualitaet", rhsAusstattungsqualitaet), lhsAusstattungsqualitaet, rhsAusstattungsqualitaet, (this.ausstattungsqualitaet!= null), (that.ausstattungsqualitaet!= null))) {
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
