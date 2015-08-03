
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
 * <p>Java class for WohnungTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WohnungTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}ImmobilieBaseTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mietpreise" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungWohnMieteTyp" minOccurs="0"/&gt;
 *         &lt;element name="Kaufpreise" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungWohnKaufTyp" minOccurs="0"/&gt;
 *         &lt;element name="BefeuerungsArt" type="{http://www.immobilienscout24.de/immobilientransfer}BefeuerungsArtTyp" minOccurs="0"/&gt;
 *         &lt;element name="Energieausweis" type="{http://www.immobilienscout24.de/immobilientransfer}EnergieausweisTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="WohnungKategorie" type="{http://www.immobilienscout24.de/immobilientransfer}WohnungKategorienTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="Wohnflaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Nutzflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Zimmer" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}ZimmeranzahlTyp" /&gt;
 *       &lt;attribute name="AnzahlBadezimmer" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
 *       &lt;attribute name="AnzahlSchlafzimmer" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
 *       &lt;attribute name="Etage" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3i0Typ" /&gt;
 *       &lt;attribute name="Etagenzahl" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl3Typ" /&gt;
 *       &lt;attribute name="Baujahr" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl4Typ" /&gt;
 *       &lt;attribute name="JahrLetzteModernisierung" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl4Typ" /&gt;
 *       &lt;attribute name="Objektzustand" type="{http://www.immobilienscout24.de/immobilientransfer}ObjektZustandTyp" /&gt;
 *       &lt;attribute name="Heizungsart" type="{http://www.immobilienscout24.de/immobilientransfer}HeizungsartTyp" /&gt;
 *       &lt;attribute name="Aufzug" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Haustiere" type="{http://www.immobilienscout24.de/immobilientransfer}GenehmigungTyp" /&gt;
 *       &lt;attribute name="BalkonTerrasse" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GartenBenutzung" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Einbaukueche" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BetreutesWohnen" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Foerderung" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Vermietet" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Denkmalschutzobjekt" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GaesteWC" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Keller" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Barrierefrei" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AlsFerienwohnungGeeignet" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Parkplatz" type="{http://www.immobilienscout24.de/immobilientransfer}StellplatzKategorieTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="AnzahlGaragenStellplaetze" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
 *       &lt;attribute name="Rollstuhlgerecht" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FreiAb" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *       &lt;attribute name="Ausstattungsqualitaet" type="{http://www.immobilienscout24.de/immobilientransfer}AusstattungsqualitaetsTyp" default="KeineAngabe" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WohnungTyp", propOrder = {
    "mietpreise",
    "kaufpreise",
    "befeuerungsArt",
    "energieausweis"
})
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.WohnungKauf.Type.class,
    org.openestate.io.is24_xml.xml.WohnungMiete.Type.class
})
public class WohnungTyp
    extends ImmobilieBaseTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "Mietpreise")
    protected VermarktungWohnMieteTyp mietpreise;
    @XmlElement(name = "Kaufpreise")
    protected VermarktungWohnKaufTyp kaufpreise;
    @XmlElement(name = "BefeuerungsArt")
    protected BefeuerungsArtTyp befeuerungsArt;
    @XmlElement(name = "Energieausweis")
    protected EnergieausweisTyp energieausweis;
    @XmlAttribute(name = "WohnungKategorie")
    protected WohnungKategorienTyp wohnungKategorie;
    @XmlAttribute(name = "Wohnflaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected Double wohnflaeche;
    @XmlAttribute(name = "Nutzflaeche")
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected Double nutzflaeche;
    @XmlAttribute(name = "Zimmer", required = true)
    @XmlJavaTypeAdapter(Adapter32 .class)
    protected Double zimmer;
    @XmlAttribute(name = "AnzahlBadezimmer")
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected Long anzahlBadezimmer;
    @XmlAttribute(name = "AnzahlSchlafzimmer")
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected Long anzahlSchlafzimmer;
    @XmlAttribute(name = "Etage")
    @XmlJavaTypeAdapter(Adapter20 .class)
    protected Long etage;
    @XmlAttribute(name = "Etagenzahl")
    @XmlJavaTypeAdapter(Adapter21 .class)
    protected Long etagenzahl;
    @XmlAttribute(name = "Baujahr")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Long baujahr;
    @XmlAttribute(name = "JahrLetzteModernisierung")
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected Long jahrLetzteModernisierung;
    @XmlAttribute(name = "Objektzustand")
    protected ObjektZustandTyp objektzustand;
    @XmlAttribute(name = "Heizungsart")
    protected HeizungsartTyp heizungsart;
    @XmlAttribute(name = "Aufzug")
    protected Boolean aufzug;
    @XmlAttribute(name = "Haustiere")
    protected GenehmigungTyp haustiere;
    @XmlAttribute(name = "BalkonTerrasse")
    protected Boolean balkonTerrasse;
    @XmlAttribute(name = "GartenBenutzung")
    protected Boolean gartenBenutzung;
    @XmlAttribute(name = "Einbaukueche")
    protected Boolean einbaukueche;
    @XmlAttribute(name = "BetreutesWohnen")
    protected Boolean betreutesWohnen;
    @XmlAttribute(name = "Foerderung")
    protected Boolean foerderung;
    @XmlAttribute(name = "Vermietet")
    protected Boolean vermietet;
    @XmlAttribute(name = "Denkmalschutzobjekt")
    protected Boolean denkmalschutzobjekt;
    @XmlAttribute(name = "GaesteWC")
    protected Boolean gaesteWC;
    @XmlAttribute(name = "Keller")
    protected Boolean keller;
    @XmlAttribute(name = "Barrierefrei")
    protected Boolean barrierefrei;
    @XmlAttribute(name = "AlsFerienwohnungGeeignet")
    protected Boolean alsFerienwohnungGeeignet;
    @XmlAttribute(name = "Parkplatz")
    protected StellplatzKategorieTyp parkplatz;
    @XmlAttribute(name = "AnzahlGaragenStellplaetze")
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected Long anzahlGaragenStellplaetze;
    @XmlAttribute(name = "Rollstuhlgerecht")
    protected Boolean rollstuhlgerecht;
    @XmlAttribute(name = "FreiAb")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String freiAb;
    @XmlAttribute(name = "Ausstattungsqualitaet")
    protected AusstattungsqualitaetsTyp ausstattungsqualitaet;

    /**
     * Gets the value of the mietpreise property.
     * 
     * @return
     *     possible object is
     *     {@link VermarktungWohnMieteTyp }
     *     
     */
    public VermarktungWohnMieteTyp getMietpreise() {
        return mietpreise;
    }

    /**
     * Sets the value of the mietpreise property.
     * 
     * @param value
     *     allowed object is
     *     {@link VermarktungWohnMieteTyp }
     *     
     */
    public void setMietpreise(VermarktungWohnMieteTyp value) {
        this.mietpreise = value;
    }

    /**
     * Gets the value of the kaufpreise property.
     * 
     * @return
     *     possible object is
     *     {@link VermarktungWohnKaufTyp }
     *     
     */
    public VermarktungWohnKaufTyp getKaufpreise() {
        return kaufpreise;
    }

    /**
     * Sets the value of the kaufpreise property.
     * 
     * @param value
     *     allowed object is
     *     {@link VermarktungWohnKaufTyp }
     *     
     */
    public void setKaufpreise(VermarktungWohnKaufTyp value) {
        this.kaufpreise = value;
    }

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
     * Gets the value of the wohnungKategorie property.
     * 
     * @return
     *     possible object is
     *     {@link WohnungKategorienTyp }
     *     
     */
    public WohnungKategorienTyp getWohnungKategorie() {
        if (wohnungKategorie == null) {
            return WohnungKategorienTyp.KEINE_ANGABE;
        } else {
            return wohnungKategorie;
        }
    }

    /**
     * Sets the value of the wohnungKategorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link WohnungKategorienTyp }
     *     
     */
    public void setWohnungKategorie(WohnungKategorienTyp value) {
        this.wohnungKategorie = value;
    }

    /**
     * Gets the value of the wohnflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getWohnflaeche() {
        return wohnflaeche;
    }

    /**
     * Sets the value of the wohnflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnflaeche(Double value) {
        this.wohnflaeche = value;
    }

    /**
     * Gets the value of the nutzflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getNutzflaeche() {
        return nutzflaeche;
    }

    /**
     * Sets the value of the nutzflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutzflaeche(Double value) {
        this.nutzflaeche = value;
    }

    /**
     * Gets the value of the zimmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getZimmer() {
        return zimmer;
    }

    /**
     * Sets the value of the zimmer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZimmer(Double value) {
        this.zimmer = value;
    }

    /**
     * Gets the value of the anzahlBadezimmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAnzahlBadezimmer() {
        return anzahlBadezimmer;
    }

    /**
     * Sets the value of the anzahlBadezimmer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlBadezimmer(Long value) {
        this.anzahlBadezimmer = value;
    }

    /**
     * Gets the value of the anzahlSchlafzimmer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAnzahlSchlafzimmer() {
        return anzahlSchlafzimmer;
    }

    /**
     * Sets the value of the anzahlSchlafzimmer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlSchlafzimmer(Long value) {
        this.anzahlSchlafzimmer = value;
    }

    /**
     * Gets the value of the etage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEtage() {
        return etage;
    }

    /**
     * Sets the value of the etage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtage(Long value) {
        this.etage = value;
    }

    /**
     * Gets the value of the etagenzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEtagenzahl() {
        return etagenzahl;
    }

    /**
     * Sets the value of the etagenzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtagenzahl(Long value) {
        this.etagenzahl = value;
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

    /**
     * Gets the value of the objektzustand property.
     * 
     * @return
     *     possible object is
     *     {@link ObjektZustandTyp }
     *     
     */
    public ObjektZustandTyp getObjektzustand() {
        return objektzustand;
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
     * Gets the value of the aufzug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAufzug() {
        return aufzug;
    }

    /**
     * Sets the value of the aufzug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAufzug(Boolean value) {
        this.aufzug = value;
    }

    /**
     * Gets the value of the haustiere property.
     * 
     * @return
     *     possible object is
     *     {@link GenehmigungTyp }
     *     
     */
    public GenehmigungTyp getHaustiere() {
        return haustiere;
    }

    /**
     * Sets the value of the haustiere property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenehmigungTyp }
     *     
     */
    public void setHaustiere(GenehmigungTyp value) {
        this.haustiere = value;
    }

    /**
     * Gets the value of the balkonTerrasse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalkonTerrasse() {
        return balkonTerrasse;
    }

    /**
     * Sets the value of the balkonTerrasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalkonTerrasse(Boolean value) {
        this.balkonTerrasse = value;
    }

    /**
     * Gets the value of the gartenBenutzung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGartenBenutzung() {
        return gartenBenutzung;
    }

    /**
     * Sets the value of the gartenBenutzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGartenBenutzung(Boolean value) {
        this.gartenBenutzung = value;
    }

    /**
     * Gets the value of the einbaukueche property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEinbaukueche() {
        return einbaukueche;
    }

    /**
     * Sets the value of the einbaukueche property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEinbaukueche(Boolean value) {
        this.einbaukueche = value;
    }

    /**
     * Gets the value of the betreutesWohnen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBetreutesWohnen() {
        return betreutesWohnen;
    }

    /**
     * Sets the value of the betreutesWohnen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBetreutesWohnen(Boolean value) {
        this.betreutesWohnen = value;
    }

    /**
     * Gets the value of the foerderung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFoerderung() {
        return foerderung;
    }

    /**
     * Sets the value of the foerderung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFoerderung(Boolean value) {
        this.foerderung = value;
    }

    /**
     * Gets the value of the vermietet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVermietet() {
        return vermietet;
    }

    /**
     * Sets the value of the vermietet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVermietet(Boolean value) {
        this.vermietet = value;
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
     * Gets the value of the gaesteWC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGaesteWC() {
        return gaesteWC;
    }

    /**
     * Sets the value of the gaesteWC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGaesteWC(Boolean value) {
        this.gaesteWC = value;
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
     * Gets the value of the barrierefrei property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBarrierefrei() {
        return barrierefrei;
    }

    /**
     * Sets the value of the barrierefrei property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBarrierefrei(Boolean value) {
        this.barrierefrei = value;
    }

    /**
     * Gets the value of the alsFerienwohnungGeeignet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlsFerienwohnungGeeignet() {
        return alsFerienwohnungGeeignet;
    }

    /**
     * Sets the value of the alsFerienwohnungGeeignet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlsFerienwohnungGeeignet(Boolean value) {
        this.alsFerienwohnungGeeignet = value;
    }

    /**
     * Gets the value of the parkplatz property.
     * 
     * @return
     *     possible object is
     *     {@link StellplatzKategorieTyp }
     *     
     */
    public StellplatzKategorieTyp getParkplatz() {
        if (parkplatz == null) {
            return StellplatzKategorieTyp.KEINE_ANGABE;
        } else {
            return parkplatz;
        }
    }

    /**
     * Sets the value of the parkplatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StellplatzKategorieTyp }
     *     
     */
    public void setParkplatz(StellplatzKategorieTyp value) {
        this.parkplatz = value;
    }

    /**
     * Gets the value of the anzahlGaragenStellplaetze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAnzahlGaragenStellplaetze() {
        return anzahlGaragenStellplaetze;
    }

    /**
     * Sets the value of the anzahlGaragenStellplaetze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahlGaragenStellplaetze(Long value) {
        this.anzahlGaragenStellplaetze = value;
    }

    /**
     * Gets the value of the rollstuhlgerecht property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRollstuhlgerecht() {
        return rollstuhlgerecht;
    }

    /**
     * Sets the value of the rollstuhlgerecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRollstuhlgerecht(Boolean value) {
        this.rollstuhlgerecht = value;
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
            VermarktungWohnMieteTyp theMietpreise;
            theMietpreise = this.getMietpreise();
            strategy.appendField(locator, this, "mietpreise", buffer, theMietpreise);
        }
        {
            VermarktungWohnKaufTyp theKaufpreise;
            theKaufpreise = this.getKaufpreise();
            strategy.appendField(locator, this, "kaufpreise", buffer, theKaufpreise);
        }
        {
            BefeuerungsArtTyp theBefeuerungsArt;
            theBefeuerungsArt = this.getBefeuerungsArt();
            strategy.appendField(locator, this, "befeuerungsArt", buffer, theBefeuerungsArt);
        }
        {
            EnergieausweisTyp theEnergieausweis;
            theEnergieausweis = this.getEnergieausweis();
            strategy.appendField(locator, this, "energieausweis", buffer, theEnergieausweis);
        }
        {
            WohnungKategorienTyp theWohnungKategorie;
            theWohnungKategorie = this.getWohnungKategorie();
            strategy.appendField(locator, this, "wohnungKategorie", buffer, theWohnungKategorie);
        }
        {
            Double theWohnflaeche;
            theWohnflaeche = this.getWohnflaeche();
            strategy.appendField(locator, this, "wohnflaeche", buffer, theWohnflaeche);
        }
        {
            Double theNutzflaeche;
            theNutzflaeche = this.getNutzflaeche();
            strategy.appendField(locator, this, "nutzflaeche", buffer, theNutzflaeche);
        }
        {
            Double theZimmer;
            theZimmer = this.getZimmer();
            strategy.appendField(locator, this, "zimmer", buffer, theZimmer);
        }
        {
            Long theAnzahlBadezimmer;
            theAnzahlBadezimmer = this.getAnzahlBadezimmer();
            strategy.appendField(locator, this, "anzahlBadezimmer", buffer, theAnzahlBadezimmer);
        }
        {
            Long theAnzahlSchlafzimmer;
            theAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
            strategy.appendField(locator, this, "anzahlSchlafzimmer", buffer, theAnzahlSchlafzimmer);
        }
        {
            Long theEtage;
            theEtage = this.getEtage();
            strategy.appendField(locator, this, "etage", buffer, theEtage);
        }
        {
            Long theEtagenzahl;
            theEtagenzahl = this.getEtagenzahl();
            strategy.appendField(locator, this, "etagenzahl", buffer, theEtagenzahl);
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
        {
            ObjektZustandTyp theObjektzustand;
            theObjektzustand = this.getObjektzustand();
            strategy.appendField(locator, this, "objektzustand", buffer, theObjektzustand);
        }
        {
            HeizungsartTyp theHeizungsart;
            theHeizungsart = this.getHeizungsart();
            strategy.appendField(locator, this, "heizungsart", buffer, theHeizungsart);
        }
        {
            Boolean theAufzug;
            theAufzug = this.isAufzug();
            strategy.appendField(locator, this, "aufzug", buffer, theAufzug);
        }
        {
            GenehmigungTyp theHaustiere;
            theHaustiere = this.getHaustiere();
            strategy.appendField(locator, this, "haustiere", buffer, theHaustiere);
        }
        {
            Boolean theBalkonTerrasse;
            theBalkonTerrasse = this.isBalkonTerrasse();
            strategy.appendField(locator, this, "balkonTerrasse", buffer, theBalkonTerrasse);
        }
        {
            Boolean theGartenBenutzung;
            theGartenBenutzung = this.isGartenBenutzung();
            strategy.appendField(locator, this, "gartenBenutzung", buffer, theGartenBenutzung);
        }
        {
            Boolean theEinbaukueche;
            theEinbaukueche = this.isEinbaukueche();
            strategy.appendField(locator, this, "einbaukueche", buffer, theEinbaukueche);
        }
        {
            Boolean theBetreutesWohnen;
            theBetreutesWohnen = this.isBetreutesWohnen();
            strategy.appendField(locator, this, "betreutesWohnen", buffer, theBetreutesWohnen);
        }
        {
            Boolean theFoerderung;
            theFoerderung = this.isFoerderung();
            strategy.appendField(locator, this, "foerderung", buffer, theFoerderung);
        }
        {
            Boolean theVermietet;
            theVermietet = this.isVermietet();
            strategy.appendField(locator, this, "vermietet", buffer, theVermietet);
        }
        {
            Boolean theDenkmalschutzobjekt;
            theDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
            strategy.appendField(locator, this, "denkmalschutzobjekt", buffer, theDenkmalschutzobjekt);
        }
        {
            Boolean theGaesteWC;
            theGaesteWC = this.isGaesteWC();
            strategy.appendField(locator, this, "gaesteWC", buffer, theGaesteWC);
        }
        {
            Boolean theKeller;
            theKeller = this.isKeller();
            strategy.appendField(locator, this, "keller", buffer, theKeller);
        }
        {
            Boolean theBarrierefrei;
            theBarrierefrei = this.isBarrierefrei();
            strategy.appendField(locator, this, "barrierefrei", buffer, theBarrierefrei);
        }
        {
            Boolean theAlsFerienwohnungGeeignet;
            theAlsFerienwohnungGeeignet = this.isAlsFerienwohnungGeeignet();
            strategy.appendField(locator, this, "alsFerienwohnungGeeignet", buffer, theAlsFerienwohnungGeeignet);
        }
        {
            StellplatzKategorieTyp theParkplatz;
            theParkplatz = this.getParkplatz();
            strategy.appendField(locator, this, "parkplatz", buffer, theParkplatz);
        }
        {
            Long theAnzahlGaragenStellplaetze;
            theAnzahlGaragenStellplaetze = this.getAnzahlGaragenStellplaetze();
            strategy.appendField(locator, this, "anzahlGaragenStellplaetze", buffer, theAnzahlGaragenStellplaetze);
        }
        {
            Boolean theRollstuhlgerecht;
            theRollstuhlgerecht = this.isRollstuhlgerecht();
            strategy.appendField(locator, this, "rollstuhlgerecht", buffer, theRollstuhlgerecht);
        }
        {
            String theFreiAb;
            theFreiAb = this.getFreiAb();
            strategy.appendField(locator, this, "freiAb", buffer, theFreiAb);
        }
        {
            AusstattungsqualitaetsTyp theAusstattungsqualitaet;
            theAusstattungsqualitaet = this.getAusstattungsqualitaet();
            strategy.appendField(locator, this, "ausstattungsqualitaet", buffer, theAusstattungsqualitaet);
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
        if (draftCopy instanceof WohnungTyp) {
            final WohnungTyp copy = ((WohnungTyp) draftCopy);
            if (this.mietpreise!= null) {
                VermarktungWohnMieteTyp sourceMietpreise;
                sourceMietpreise = this.getMietpreise();
                VermarktungWohnMieteTyp copyMietpreise = ((VermarktungWohnMieteTyp) strategy.copy(LocatorUtils.property(locator, "mietpreise", sourceMietpreise), sourceMietpreise));
                copy.setMietpreise(copyMietpreise);
            } else {
                copy.mietpreise = null;
            }
            if (this.kaufpreise!= null) {
                VermarktungWohnKaufTyp sourceKaufpreise;
                sourceKaufpreise = this.getKaufpreise();
                VermarktungWohnKaufTyp copyKaufpreise = ((VermarktungWohnKaufTyp) strategy.copy(LocatorUtils.property(locator, "kaufpreise", sourceKaufpreise), sourceKaufpreise));
                copy.setKaufpreise(copyKaufpreise);
            } else {
                copy.kaufpreise = null;
            }
            if (this.befeuerungsArt!= null) {
                BefeuerungsArtTyp sourceBefeuerungsArt;
                sourceBefeuerungsArt = this.getBefeuerungsArt();
                BefeuerungsArtTyp copyBefeuerungsArt = ((BefeuerungsArtTyp) strategy.copy(LocatorUtils.property(locator, "befeuerungsArt", sourceBefeuerungsArt), sourceBefeuerungsArt));
                copy.setBefeuerungsArt(copyBefeuerungsArt);
            } else {
                copy.befeuerungsArt = null;
            }
            if (this.energieausweis!= null) {
                EnergieausweisTyp sourceEnergieausweis;
                sourceEnergieausweis = this.getEnergieausweis();
                EnergieausweisTyp copyEnergieausweis = ((EnergieausweisTyp) strategy.copy(LocatorUtils.property(locator, "energieausweis", sourceEnergieausweis), sourceEnergieausweis));
                copy.setEnergieausweis(copyEnergieausweis);
            } else {
                copy.energieausweis = null;
            }
            if (this.wohnungKategorie!= null) {
                WohnungKategorienTyp sourceWohnungKategorie;
                sourceWohnungKategorie = this.getWohnungKategorie();
                WohnungKategorienTyp copyWohnungKategorie = ((WohnungKategorienTyp) strategy.copy(LocatorUtils.property(locator, "wohnungKategorie", sourceWohnungKategorie), sourceWohnungKategorie));
                copy.setWohnungKategorie(copyWohnungKategorie);
            } else {
                copy.wohnungKategorie = null;
            }
            if (this.wohnflaeche!= null) {
                Double sourceWohnflaeche;
                sourceWohnflaeche = this.getWohnflaeche();
                Double copyWohnflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "wohnflaeche", sourceWohnflaeche), sourceWohnflaeche));
                copy.setWohnflaeche(copyWohnflaeche);
            } else {
                copy.wohnflaeche = null;
            }
            if (this.nutzflaeche!= null) {
                Double sourceNutzflaeche;
                sourceNutzflaeche = this.getNutzflaeche();
                Double copyNutzflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "nutzflaeche", sourceNutzflaeche), sourceNutzflaeche));
                copy.setNutzflaeche(copyNutzflaeche);
            } else {
                copy.nutzflaeche = null;
            }
            if (this.zimmer!= null) {
                Double sourceZimmer;
                sourceZimmer = this.getZimmer();
                Double copyZimmer = ((Double) strategy.copy(LocatorUtils.property(locator, "zimmer", sourceZimmer), sourceZimmer));
                copy.setZimmer(copyZimmer);
            } else {
                copy.zimmer = null;
            }
            if (this.anzahlBadezimmer!= null) {
                Long sourceAnzahlBadezimmer;
                sourceAnzahlBadezimmer = this.getAnzahlBadezimmer();
                Long copyAnzahlBadezimmer = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlBadezimmer", sourceAnzahlBadezimmer), sourceAnzahlBadezimmer));
                copy.setAnzahlBadezimmer(copyAnzahlBadezimmer);
            } else {
                copy.anzahlBadezimmer = null;
            }
            if (this.anzahlSchlafzimmer!= null) {
                Long sourceAnzahlSchlafzimmer;
                sourceAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
                Long copyAnzahlSchlafzimmer = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlSchlafzimmer", sourceAnzahlSchlafzimmer), sourceAnzahlSchlafzimmer));
                copy.setAnzahlSchlafzimmer(copyAnzahlSchlafzimmer);
            } else {
                copy.anzahlSchlafzimmer = null;
            }
            if (this.etage!= null) {
                Long sourceEtage;
                sourceEtage = this.getEtage();
                Long copyEtage = ((Long) strategy.copy(LocatorUtils.property(locator, "etage", sourceEtage), sourceEtage));
                copy.setEtage(copyEtage);
            } else {
                copy.etage = null;
            }
            if (this.etagenzahl!= null) {
                Long sourceEtagenzahl;
                sourceEtagenzahl = this.getEtagenzahl();
                Long copyEtagenzahl = ((Long) strategy.copy(LocatorUtils.property(locator, "etagenzahl", sourceEtagenzahl), sourceEtagenzahl));
                copy.setEtagenzahl(copyEtagenzahl);
            } else {
                copy.etagenzahl = null;
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
            if (this.objektzustand!= null) {
                ObjektZustandTyp sourceObjektzustand;
                sourceObjektzustand = this.getObjektzustand();
                ObjektZustandTyp copyObjektzustand = ((ObjektZustandTyp) strategy.copy(LocatorUtils.property(locator, "objektzustand", sourceObjektzustand), sourceObjektzustand));
                copy.setObjektzustand(copyObjektzustand);
            } else {
                copy.objektzustand = null;
            }
            if (this.heizungsart!= null) {
                HeizungsartTyp sourceHeizungsart;
                sourceHeizungsart = this.getHeizungsart();
                HeizungsartTyp copyHeizungsart = ((HeizungsartTyp) strategy.copy(LocatorUtils.property(locator, "heizungsart", sourceHeizungsart), sourceHeizungsart));
                copy.setHeizungsart(copyHeizungsart);
            } else {
                copy.heizungsart = null;
            }
            if (this.aufzug!= null) {
                Boolean sourceAufzug;
                sourceAufzug = this.isAufzug();
                Boolean copyAufzug = ((Boolean) strategy.copy(LocatorUtils.property(locator, "aufzug", sourceAufzug), sourceAufzug));
                copy.setAufzug(copyAufzug);
            } else {
                copy.aufzug = null;
            }
            if (this.haustiere!= null) {
                GenehmigungTyp sourceHaustiere;
                sourceHaustiere = this.getHaustiere();
                GenehmigungTyp copyHaustiere = ((GenehmigungTyp) strategy.copy(LocatorUtils.property(locator, "haustiere", sourceHaustiere), sourceHaustiere));
                copy.setHaustiere(copyHaustiere);
            } else {
                copy.haustiere = null;
            }
            if (this.balkonTerrasse!= null) {
                Boolean sourceBalkonTerrasse;
                sourceBalkonTerrasse = this.isBalkonTerrasse();
                Boolean copyBalkonTerrasse = ((Boolean) strategy.copy(LocatorUtils.property(locator, "balkonTerrasse", sourceBalkonTerrasse), sourceBalkonTerrasse));
                copy.setBalkonTerrasse(copyBalkonTerrasse);
            } else {
                copy.balkonTerrasse = null;
            }
            if (this.gartenBenutzung!= null) {
                Boolean sourceGartenBenutzung;
                sourceGartenBenutzung = this.isGartenBenutzung();
                Boolean copyGartenBenutzung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gartenBenutzung", sourceGartenBenutzung), sourceGartenBenutzung));
                copy.setGartenBenutzung(copyGartenBenutzung);
            } else {
                copy.gartenBenutzung = null;
            }
            if (this.einbaukueche!= null) {
                Boolean sourceEinbaukueche;
                sourceEinbaukueche = this.isEinbaukueche();
                Boolean copyEinbaukueche = ((Boolean) strategy.copy(LocatorUtils.property(locator, "einbaukueche", sourceEinbaukueche), sourceEinbaukueche));
                copy.setEinbaukueche(copyEinbaukueche);
            } else {
                copy.einbaukueche = null;
            }
            if (this.betreutesWohnen!= null) {
                Boolean sourceBetreutesWohnen;
                sourceBetreutesWohnen = this.isBetreutesWohnen();
                Boolean copyBetreutesWohnen = ((Boolean) strategy.copy(LocatorUtils.property(locator, "betreutesWohnen", sourceBetreutesWohnen), sourceBetreutesWohnen));
                copy.setBetreutesWohnen(copyBetreutesWohnen);
            } else {
                copy.betreutesWohnen = null;
            }
            if (this.foerderung!= null) {
                Boolean sourceFoerderung;
                sourceFoerderung = this.isFoerderung();
                Boolean copyFoerderung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "foerderung", sourceFoerderung), sourceFoerderung));
                copy.setFoerderung(copyFoerderung);
            } else {
                copy.foerderung = null;
            }
            if (this.vermietet!= null) {
                Boolean sourceVermietet;
                sourceVermietet = this.isVermietet();
                Boolean copyVermietet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "vermietet", sourceVermietet), sourceVermietet));
                copy.setVermietet(copyVermietet);
            } else {
                copy.vermietet = null;
            }
            if (this.denkmalschutzobjekt!= null) {
                Boolean sourceDenkmalschutzobjekt;
                sourceDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
                Boolean copyDenkmalschutzobjekt = ((Boolean) strategy.copy(LocatorUtils.property(locator, "denkmalschutzobjekt", sourceDenkmalschutzobjekt), sourceDenkmalschutzobjekt));
                copy.setDenkmalschutzobjekt(copyDenkmalschutzobjekt);
            } else {
                copy.denkmalschutzobjekt = null;
            }
            if (this.gaesteWC!= null) {
                Boolean sourceGaesteWC;
                sourceGaesteWC = this.isGaesteWC();
                Boolean copyGaesteWC = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gaesteWC", sourceGaesteWC), sourceGaesteWC));
                copy.setGaesteWC(copyGaesteWC);
            } else {
                copy.gaesteWC = null;
            }
            if (this.keller!= null) {
                Boolean sourceKeller;
                sourceKeller = this.isKeller();
                Boolean copyKeller = ((Boolean) strategy.copy(LocatorUtils.property(locator, "keller", sourceKeller), sourceKeller));
                copy.setKeller(copyKeller);
            } else {
                copy.keller = null;
            }
            if (this.barrierefrei!= null) {
                Boolean sourceBarrierefrei;
                sourceBarrierefrei = this.isBarrierefrei();
                Boolean copyBarrierefrei = ((Boolean) strategy.copy(LocatorUtils.property(locator, "barrierefrei", sourceBarrierefrei), sourceBarrierefrei));
                copy.setBarrierefrei(copyBarrierefrei);
            } else {
                copy.barrierefrei = null;
            }
            if (this.alsFerienwohnungGeeignet!= null) {
                Boolean sourceAlsFerienwohnungGeeignet;
                sourceAlsFerienwohnungGeeignet = this.isAlsFerienwohnungGeeignet();
                Boolean copyAlsFerienwohnungGeeignet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "alsFerienwohnungGeeignet", sourceAlsFerienwohnungGeeignet), sourceAlsFerienwohnungGeeignet));
                copy.setAlsFerienwohnungGeeignet(copyAlsFerienwohnungGeeignet);
            } else {
                copy.alsFerienwohnungGeeignet = null;
            }
            if (this.parkplatz!= null) {
                StellplatzKategorieTyp sourceParkplatz;
                sourceParkplatz = this.getParkplatz();
                StellplatzKategorieTyp copyParkplatz = ((StellplatzKategorieTyp) strategy.copy(LocatorUtils.property(locator, "parkplatz", sourceParkplatz), sourceParkplatz));
                copy.setParkplatz(copyParkplatz);
            } else {
                copy.parkplatz = null;
            }
            if (this.anzahlGaragenStellplaetze!= null) {
                Long sourceAnzahlGaragenStellplaetze;
                sourceAnzahlGaragenStellplaetze = this.getAnzahlGaragenStellplaetze();
                Long copyAnzahlGaragenStellplaetze = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlGaragenStellplaetze", sourceAnzahlGaragenStellplaetze), sourceAnzahlGaragenStellplaetze));
                copy.setAnzahlGaragenStellplaetze(copyAnzahlGaragenStellplaetze);
            } else {
                copy.anzahlGaragenStellplaetze = null;
            }
            if (this.rollstuhlgerecht!= null) {
                Boolean sourceRollstuhlgerecht;
                sourceRollstuhlgerecht = this.isRollstuhlgerecht();
                Boolean copyRollstuhlgerecht = ((Boolean) strategy.copy(LocatorUtils.property(locator, "rollstuhlgerecht", sourceRollstuhlgerecht), sourceRollstuhlgerecht));
                copy.setRollstuhlgerecht(copyRollstuhlgerecht);
            } else {
                copy.rollstuhlgerecht = null;
            }
            if (this.freiAb!= null) {
                String sourceFreiAb;
                sourceFreiAb = this.getFreiAb();
                String copyFreiAb = ((String) strategy.copy(LocatorUtils.property(locator, "freiAb", sourceFreiAb), sourceFreiAb));
                copy.setFreiAb(copyFreiAb);
            } else {
                copy.freiAb = null;
            }
            if (this.ausstattungsqualitaet!= null) {
                AusstattungsqualitaetsTyp sourceAusstattungsqualitaet;
                sourceAusstattungsqualitaet = this.getAusstattungsqualitaet();
                AusstattungsqualitaetsTyp copyAusstattungsqualitaet = ((AusstattungsqualitaetsTyp) strategy.copy(LocatorUtils.property(locator, "ausstattungsqualitaet", sourceAusstattungsqualitaet), sourceAusstattungsqualitaet));
                copy.setAusstattungsqualitaet(copyAusstattungsqualitaet);
            } else {
                copy.ausstattungsqualitaet = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new WohnungTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof WohnungTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final WohnungTyp that = ((WohnungTyp) object);
        {
            VermarktungWohnMieteTyp lhsMietpreise;
            lhsMietpreise = this.getMietpreise();
            VermarktungWohnMieteTyp rhsMietpreise;
            rhsMietpreise = that.getMietpreise();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietpreise", lhsMietpreise), LocatorUtils.property(thatLocator, "mietpreise", rhsMietpreise), lhsMietpreise, rhsMietpreise)) {
                return false;
            }
        }
        {
            VermarktungWohnKaufTyp lhsKaufpreise;
            lhsKaufpreise = this.getKaufpreise();
            VermarktungWohnKaufTyp rhsKaufpreise;
            rhsKaufpreise = that.getKaufpreise();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreise", lhsKaufpreise), LocatorUtils.property(thatLocator, "kaufpreise", rhsKaufpreise), lhsKaufpreise, rhsKaufpreise)) {
                return false;
            }
        }
        {
            BefeuerungsArtTyp lhsBefeuerungsArt;
            lhsBefeuerungsArt = this.getBefeuerungsArt();
            BefeuerungsArtTyp rhsBefeuerungsArt;
            rhsBefeuerungsArt = that.getBefeuerungsArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "befeuerungsArt", lhsBefeuerungsArt), LocatorUtils.property(thatLocator, "befeuerungsArt", rhsBefeuerungsArt), lhsBefeuerungsArt, rhsBefeuerungsArt)) {
                return false;
            }
        }
        {
            EnergieausweisTyp lhsEnergieausweis;
            lhsEnergieausweis = this.getEnergieausweis();
            EnergieausweisTyp rhsEnergieausweis;
            rhsEnergieausweis = that.getEnergieausweis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieausweis", lhsEnergieausweis), LocatorUtils.property(thatLocator, "energieausweis", rhsEnergieausweis), lhsEnergieausweis, rhsEnergieausweis)) {
                return false;
            }
        }
        {
            WohnungKategorienTyp lhsWohnungKategorie;
            lhsWohnungKategorie = this.getWohnungKategorie();
            WohnungKategorienTyp rhsWohnungKategorie;
            rhsWohnungKategorie = that.getWohnungKategorie();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnungKategorie", lhsWohnungKategorie), LocatorUtils.property(thatLocator, "wohnungKategorie", rhsWohnungKategorie), lhsWohnungKategorie, rhsWohnungKategorie)) {
                return false;
            }
        }
        {
            Double lhsWohnflaeche;
            lhsWohnflaeche = this.getWohnflaeche();
            Double rhsWohnflaeche;
            rhsWohnflaeche = that.getWohnflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnflaeche", lhsWohnflaeche), LocatorUtils.property(thatLocator, "wohnflaeche", rhsWohnflaeche), lhsWohnflaeche, rhsWohnflaeche)) {
                return false;
            }
        }
        {
            Double lhsNutzflaeche;
            lhsNutzflaeche = this.getNutzflaeche();
            Double rhsNutzflaeche;
            rhsNutzflaeche = that.getNutzflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nutzflaeche", lhsNutzflaeche), LocatorUtils.property(thatLocator, "nutzflaeche", rhsNutzflaeche), lhsNutzflaeche, rhsNutzflaeche)) {
                return false;
            }
        }
        {
            Double lhsZimmer;
            lhsZimmer = this.getZimmer();
            Double rhsZimmer;
            rhsZimmer = that.getZimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zimmer", lhsZimmer), LocatorUtils.property(thatLocator, "zimmer", rhsZimmer), lhsZimmer, rhsZimmer)) {
                return false;
            }
        }
        {
            Long lhsAnzahlBadezimmer;
            lhsAnzahlBadezimmer = this.getAnzahlBadezimmer();
            Long rhsAnzahlBadezimmer;
            rhsAnzahlBadezimmer = that.getAnzahlBadezimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBadezimmer", lhsAnzahlBadezimmer), LocatorUtils.property(thatLocator, "anzahlBadezimmer", rhsAnzahlBadezimmer), lhsAnzahlBadezimmer, rhsAnzahlBadezimmer)) {
                return false;
            }
        }
        {
            Long lhsAnzahlSchlafzimmer;
            lhsAnzahlSchlafzimmer = this.getAnzahlSchlafzimmer();
            Long rhsAnzahlSchlafzimmer;
            rhsAnzahlSchlafzimmer = that.getAnzahlSchlafzimmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlSchlafzimmer", lhsAnzahlSchlafzimmer), LocatorUtils.property(thatLocator, "anzahlSchlafzimmer", rhsAnzahlSchlafzimmer), lhsAnzahlSchlafzimmer, rhsAnzahlSchlafzimmer)) {
                return false;
            }
        }
        {
            Long lhsEtage;
            lhsEtage = this.getEtage();
            Long rhsEtage;
            rhsEtage = that.getEtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etage", lhsEtage), LocatorUtils.property(thatLocator, "etage", rhsEtage), lhsEtage, rhsEtage)) {
                return false;
            }
        }
        {
            Long lhsEtagenzahl;
            lhsEtagenzahl = this.getEtagenzahl();
            Long rhsEtagenzahl;
            rhsEtagenzahl = that.getEtagenzahl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etagenzahl", lhsEtagenzahl), LocatorUtils.property(thatLocator, "etagenzahl", rhsEtagenzahl), lhsEtagenzahl, rhsEtagenzahl)) {
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
            HeizungsartTyp lhsHeizungsart;
            lhsHeizungsart = this.getHeizungsart();
            HeizungsartTyp rhsHeizungsart;
            rhsHeizungsart = that.getHeizungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizungsart", lhsHeizungsart), LocatorUtils.property(thatLocator, "heizungsart", rhsHeizungsart), lhsHeizungsart, rhsHeizungsart)) {
                return false;
            }
        }
        {
            Boolean lhsAufzug;
            lhsAufzug = this.isAufzug();
            Boolean rhsAufzug;
            rhsAufzug = that.isAufzug();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aufzug", lhsAufzug), LocatorUtils.property(thatLocator, "aufzug", rhsAufzug), lhsAufzug, rhsAufzug)) {
                return false;
            }
        }
        {
            GenehmigungTyp lhsHaustiere;
            lhsHaustiere = this.getHaustiere();
            GenehmigungTyp rhsHaustiere;
            rhsHaustiere = that.getHaustiere();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haustiere", lhsHaustiere), LocatorUtils.property(thatLocator, "haustiere", rhsHaustiere), lhsHaustiere, rhsHaustiere)) {
                return false;
            }
        }
        {
            Boolean lhsBalkonTerrasse;
            lhsBalkonTerrasse = this.isBalkonTerrasse();
            Boolean rhsBalkonTerrasse;
            rhsBalkonTerrasse = that.isBalkonTerrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balkonTerrasse", lhsBalkonTerrasse), LocatorUtils.property(thatLocator, "balkonTerrasse", rhsBalkonTerrasse), lhsBalkonTerrasse, rhsBalkonTerrasse)) {
                return false;
            }
        }
        {
            Boolean lhsGartenBenutzung;
            lhsGartenBenutzung = this.isGartenBenutzung();
            Boolean rhsGartenBenutzung;
            rhsGartenBenutzung = that.isGartenBenutzung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gartenBenutzung", lhsGartenBenutzung), LocatorUtils.property(thatLocator, "gartenBenutzung", rhsGartenBenutzung), lhsGartenBenutzung, rhsGartenBenutzung)) {
                return false;
            }
        }
        {
            Boolean lhsEinbaukueche;
            lhsEinbaukueche = this.isEinbaukueche();
            Boolean rhsEinbaukueche;
            rhsEinbaukueche = that.isEinbaukueche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einbaukueche", lhsEinbaukueche), LocatorUtils.property(thatLocator, "einbaukueche", rhsEinbaukueche), lhsEinbaukueche, rhsEinbaukueche)) {
                return false;
            }
        }
        {
            Boolean lhsBetreutesWohnen;
            lhsBetreutesWohnen = this.isBetreutesWohnen();
            Boolean rhsBetreutesWohnen;
            rhsBetreutesWohnen = that.isBetreutesWohnen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betreutesWohnen", lhsBetreutesWohnen), LocatorUtils.property(thatLocator, "betreutesWohnen", rhsBetreutesWohnen), lhsBetreutesWohnen, rhsBetreutesWohnen)) {
                return false;
            }
        }
        {
            Boolean lhsFoerderung;
            lhsFoerderung = this.isFoerderung();
            Boolean rhsFoerderung;
            rhsFoerderung = that.isFoerderung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "foerderung", lhsFoerderung), LocatorUtils.property(thatLocator, "foerderung", rhsFoerderung), lhsFoerderung, rhsFoerderung)) {
                return false;
            }
        }
        {
            Boolean lhsVermietet;
            lhsVermietet = this.isVermietet();
            Boolean rhsVermietet;
            rhsVermietet = that.isVermietet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermietet", lhsVermietet), LocatorUtils.property(thatLocator, "vermietet", rhsVermietet), lhsVermietet, rhsVermietet)) {
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
            Boolean lhsGaesteWC;
            lhsGaesteWC = this.isGaesteWC();
            Boolean rhsGaesteWC;
            rhsGaesteWC = that.isGaesteWC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gaesteWC", lhsGaesteWC), LocatorUtils.property(thatLocator, "gaesteWC", rhsGaesteWC), lhsGaesteWC, rhsGaesteWC)) {
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
            Boolean lhsBarrierefrei;
            lhsBarrierefrei = this.isBarrierefrei();
            Boolean rhsBarrierefrei;
            rhsBarrierefrei = that.isBarrierefrei();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barrierefrei", lhsBarrierefrei), LocatorUtils.property(thatLocator, "barrierefrei", rhsBarrierefrei), lhsBarrierefrei, rhsBarrierefrei)) {
                return false;
            }
        }
        {
            Boolean lhsAlsFerienwohnungGeeignet;
            lhsAlsFerienwohnungGeeignet = this.isAlsFerienwohnungGeeignet();
            Boolean rhsAlsFerienwohnungGeeignet;
            rhsAlsFerienwohnungGeeignet = that.isAlsFerienwohnungGeeignet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alsFerienwohnungGeeignet", lhsAlsFerienwohnungGeeignet), LocatorUtils.property(thatLocator, "alsFerienwohnungGeeignet", rhsAlsFerienwohnungGeeignet), lhsAlsFerienwohnungGeeignet, rhsAlsFerienwohnungGeeignet)) {
                return false;
            }
        }
        {
            StellplatzKategorieTyp lhsParkplatz;
            lhsParkplatz = this.getParkplatz();
            StellplatzKategorieTyp rhsParkplatz;
            rhsParkplatz = that.getParkplatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkplatz", lhsParkplatz), LocatorUtils.property(thatLocator, "parkplatz", rhsParkplatz), lhsParkplatz, rhsParkplatz)) {
                return false;
            }
        }
        {
            Long lhsAnzahlGaragenStellplaetze;
            lhsAnzahlGaragenStellplaetze = this.getAnzahlGaragenStellplaetze();
            Long rhsAnzahlGaragenStellplaetze;
            rhsAnzahlGaragenStellplaetze = that.getAnzahlGaragenStellplaetze();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlGaragenStellplaetze", lhsAnzahlGaragenStellplaetze), LocatorUtils.property(thatLocator, "anzahlGaragenStellplaetze", rhsAnzahlGaragenStellplaetze), lhsAnzahlGaragenStellplaetze, rhsAnzahlGaragenStellplaetze)) {
                return false;
            }
        }
        {
            Boolean lhsRollstuhlgerecht;
            lhsRollstuhlgerecht = this.isRollstuhlgerecht();
            Boolean rhsRollstuhlgerecht;
            rhsRollstuhlgerecht = that.isRollstuhlgerecht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rollstuhlgerecht", lhsRollstuhlgerecht), LocatorUtils.property(thatLocator, "rollstuhlgerecht", rhsRollstuhlgerecht), lhsRollstuhlgerecht, rhsRollstuhlgerecht)) {
                return false;
            }
        }
        {
            String lhsFreiAb;
            lhsFreiAb = this.getFreiAb();
            String rhsFreiAb;
            rhsFreiAb = that.getFreiAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiAb", lhsFreiAb), LocatorUtils.property(thatLocator, "freiAb", rhsFreiAb), lhsFreiAb, rhsFreiAb)) {
                return false;
            }
        }
        {
            AusstattungsqualitaetsTyp lhsAusstattungsqualitaet;
            lhsAusstattungsqualitaet = this.getAusstattungsqualitaet();
            AusstattungsqualitaetsTyp rhsAusstattungsqualitaet;
            rhsAusstattungsqualitaet = that.getAusstattungsqualitaet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausstattungsqualitaet", lhsAusstattungsqualitaet), LocatorUtils.property(thatLocator, "ausstattungsqualitaet", rhsAusstattungsqualitaet), lhsAusstattungsqualitaet, rhsAusstattungsqualitaet)) {
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
