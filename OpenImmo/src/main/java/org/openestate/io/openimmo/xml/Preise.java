
package org.openestate.io.openimmo.xml;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * Java class for &lt;preise&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kaufpreis",
    "kaufpreisnetto",
    "kaufpreisbrutto",
    "nettokaltmiete",
    "kaltmiete",
    "warmmiete",
    "nebenkosten",
    "heizkostenEnthalten",
    "heizkosten",
    "zzgMehrwertsteuer",
    "mietzuschlaege",
    "hauptmietzinsnetto",
    "pauschalmiete",
    "betriebskostennetto",
    "evbnetto",
    "gesamtmietenetto",
    "gesamtmietebrutto",
    "gesamtbelastungnetto",
    "gesamtbelastungbrutto",
    "gesamtkostenprom2Von",
    "heizkostennetto",
    "monatlichekostennetto",
    "monatlichekostenbrutto",
    "nebenkostenprom2Von",
    "ruecklagenetto",
    "sonstigekostennetto",
    "sonstigemietenetto",
    "summemietenetto",
    "nettomieteprom2Von",
    "pacht",
    "erbpacht",
    "hausgeld",
    "abstand",
    "preisZeitraumVon",
    "preisZeitraumBis",
    "preisZeiteinheit",
    "mietpreisProQm",
    "kaufpreisProQm",
    "provisionspflichtig",
    "provisionTeilen",
    "innenCourtage",
    "aussenCourtage",
    "courtageHinweis",
    "provisionnetto",
    "provisionbrutto",
    "waehrung",
    "mwstSatz",
    "mwstGesamt",
    "freitextPreis",
    "xFache",
    "nettorendite",
    "nettorenditeSoll",
    "nettorenditeIst",
    "mieteinnahmenIst",
    "mieteinnahmenSoll",
    "erschliessungskosten",
    "kaution",
    "kautionText",
    "geschaeftsguthaben",
    "stpCarport",
    "stpDuplex",
    "stpFreiplatz",
    "stpGarage",
    "stpParkhaus",
    "stpTiefgarage",
    "stpSonstige",
    "richtpreis",
    "richtpreisprom2",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "preise")
public class Preise
    implements Cloneable, CopyTo, Equals, ToString
{

    protected Kaufpreis kaufpreis;
    protected Kaufpreisnetto kaufpreisnetto;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal kaufpreisbrutto;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal nettokaltmiete;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal kaltmiete;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal warmmiete;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal nebenkosten;
    @XmlElement(name = "heizkosten_enthalten")
    protected Boolean heizkostenEnthalten;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal heizkosten;
    @XmlElement(name = "zzg_mehrwertsteuer")
    protected Boolean zzgMehrwertsteuer;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal mietzuschlaege;
    protected Hauptmietzinsnetto hauptmietzinsnetto;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal pauschalmiete;
    protected Betriebskostennetto betriebskostennetto;
    protected Evbnetto evbnetto;
    protected Gesamtmietenetto gesamtmietenetto;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal gesamtmietebrutto;
    protected Gesamtbelastungnetto gesamtbelastungnetto;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal gesamtbelastungbrutto;
    @XmlElement(name = "gesamtkostenprom2von")
    protected Gesamtkostenprom2Von gesamtkostenprom2Von;
    protected Heizkostennetto heizkostennetto;
    protected Monatlichekostennetto monatlichekostennetto;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal monatlichekostenbrutto;
    @XmlElement(name = "nebenkostenprom2von")
    protected Nebenkostenprom2Von nebenkostenprom2Von;
    protected Ruecklagenetto ruecklagenetto;
    protected Sonstigekostennetto sonstigekostennetto;
    protected Sonstigemietenetto sonstigemietenetto;
    protected Summemietenetto summemietenetto;
    @XmlElement(name = "nettomieteprom2von")
    protected Nettomieteprom2Von nettomieteprom2Von;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal pacht;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal erbpacht;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal hausgeld;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal abstand;
    @XmlElement(name = "preis_zeitraum_von", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar preisZeitraumVon;
    @XmlElement(name = "preis_zeitraum_bis", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar preisZeitraumBis;
    @XmlElement(name = "preis_zeiteinheit")
    protected PreisZeiteinheit preisZeiteinheit;
    @XmlElement(name = "mietpreis_pro_qm", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal mietpreisProQm;
    @XmlElement(name = "kaufpreis_pro_qm", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal kaufpreisProQm;
    protected Boolean provisionspflichtig;
    @XmlElement(name = "provision_teilen")
    protected ProvisionTeilen provisionTeilen;
    @XmlElement(name = "innen_courtage")
    protected InnenCourtage innenCourtage;
    @XmlElement(name = "aussen_courtage")
    protected AussenCourtage aussenCourtage;
    @XmlElement(name = "courtage_hinweis")
    protected String courtageHinweis;
    protected Provisionnetto provisionnetto;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal provisionbrutto;
    protected Waehrung waehrung;
    @XmlElement(name = "mwst_satz", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected BigDecimal mwstSatz;
    @XmlElement(name = "mwst_gesamt", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected BigDecimal mwstGesamt;
    @XmlElement(name = "freitext_preis")
    protected String freitextPreis;
    @XmlElement(name = "x_fache")
    protected String xFache;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal nettorendite;
    @XmlElement(name = "nettorendite_soll", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal nettorenditeSoll;
    @XmlElement(name = "nettorendite_ist", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal nettorenditeIst;
    @XmlElement(name = "mieteinnahmen_ist")
    protected MieteinnahmenIst mieteinnahmenIst;
    @XmlElement(name = "mieteinnahmen_soll")
    protected MieteinnahmenSoll mieteinnahmenSoll;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal erschliessungskosten;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal kaution;
    @XmlElement(name = "kaution_text")
    protected String kautionText;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal geschaeftsguthaben;
    @XmlElement(name = "stp_carport")
    protected Stellplatz stpCarport;
    @XmlElement(name = "stp_duplex")
    protected Stellplatz stpDuplex;
    @XmlElement(name = "stp_freiplatz")
    protected Stellplatz stpFreiplatz;
    @XmlElement(name = "stp_garage")
    protected Stellplatz stpGarage;
    @XmlElement(name = "stp_parkhaus")
    protected Stellplatz stpParkhaus;
    @XmlElement(name = "stp_tiefgarage")
    protected Stellplatz stpTiefgarage;
    @XmlElement(name = "stp_sonstige")
    protected List<StpSonstige> stpSonstige;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal richtpreis;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal richtpreisprom2;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    protected List<UserDefinedExtend> userDefinedExtend;

    /**
     * Gets the value of the kaufpreis property.
     * 
     * @return
     *     possible object is
     *     {@link Kaufpreis }
     *     
     */
    public Kaufpreis getKaufpreis() {
        return kaufpreis;
    }

    /**
     * Sets the value of the kaufpreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kaufpreis }
     *     
     */
    public void setKaufpreis(Kaufpreis value) {
        this.kaufpreis = value;
    }

    /**
     * Gets the value of the kaufpreisnetto property.
     * 
     * @return
     *     possible object is
     *     {@link Kaufpreisnetto }
     *     
     */
    public Kaufpreisnetto getKaufpreisnetto() {
        return kaufpreisnetto;
    }

    /**
     * Sets the value of the kaufpreisnetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kaufpreisnetto }
     *     
     */
    public void setKaufpreisnetto(Kaufpreisnetto value) {
        this.kaufpreisnetto = value;
    }

    /**
     * Gets the value of the kaufpreisbrutto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getKaufpreisbrutto() {
        return kaufpreisbrutto;
    }

    /**
     * Sets the value of the kaufpreisbrutto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKaufpreisbrutto(BigDecimal value) {
        this.kaufpreisbrutto = value;
    }

    /**
     * Gets the value of the nettokaltmiete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getNettokaltmiete() {
        return nettokaltmiete;
    }

    /**
     * Sets the value of the nettokaltmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNettokaltmiete(BigDecimal value) {
        this.nettokaltmiete = value;
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
     * Gets the value of the warmmiete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getWarmmiete() {
        return warmmiete;
    }

    /**
     * Sets the value of the warmmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarmmiete(BigDecimal value) {
        this.warmmiete = value;
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
     * Gets the value of the heizkostenEnthalten property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeizkostenEnthalten() {
        return heizkostenEnthalten;
    }

    /**
     * Sets the value of the heizkostenEnthalten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeizkostenEnthalten(Boolean value) {
        this.heizkostenEnthalten = value;
    }

    /**
     * Gets the value of the heizkosten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getHeizkosten() {
        return heizkosten;
    }

    /**
     * Sets the value of the heizkosten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeizkosten(BigDecimal value) {
        this.heizkosten = value;
    }

    /**
     * Gets the value of the zzgMehrwertsteuer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZzgMehrwertsteuer() {
        return zzgMehrwertsteuer;
    }

    /**
     * Sets the value of the zzgMehrwertsteuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZzgMehrwertsteuer(Boolean value) {
        this.zzgMehrwertsteuer = value;
    }

    /**
     * Gets the value of the mietzuschlaege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMietzuschlaege() {
        return mietzuschlaege;
    }

    /**
     * Sets the value of the mietzuschlaege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMietzuschlaege(BigDecimal value) {
        this.mietzuschlaege = value;
    }

    /**
     * Gets the value of the hauptmietzinsnetto property.
     * 
     * @return
     *     possible object is
     *     {@link Hauptmietzinsnetto }
     *     
     */
    public Hauptmietzinsnetto getHauptmietzinsnetto() {
        return hauptmietzinsnetto;
    }

    /**
     * Sets the value of the hauptmietzinsnetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hauptmietzinsnetto }
     *     
     */
    public void setHauptmietzinsnetto(Hauptmietzinsnetto value) {
        this.hauptmietzinsnetto = value;
    }

    /**
     * Gets the value of the pauschalmiete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getPauschalmiete() {
        return pauschalmiete;
    }

    /**
     * Sets the value of the pauschalmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPauschalmiete(BigDecimal value) {
        this.pauschalmiete = value;
    }

    /**
     * Gets the value of the betriebskostennetto property.
     * 
     * @return
     *     possible object is
     *     {@link Betriebskostennetto }
     *     
     */
    public Betriebskostennetto getBetriebskostennetto() {
        return betriebskostennetto;
    }

    /**
     * Sets the value of the betriebskostennetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Betriebskostennetto }
     *     
     */
    public void setBetriebskostennetto(Betriebskostennetto value) {
        this.betriebskostennetto = value;
    }

    /**
     * Gets the value of the evbnetto property.
     * 
     * @return
     *     possible object is
     *     {@link Evbnetto }
     *     
     */
    public Evbnetto getEvbnetto() {
        return evbnetto;
    }

    /**
     * Sets the value of the evbnetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Evbnetto }
     *     
     */
    public void setEvbnetto(Evbnetto value) {
        this.evbnetto = value;
    }

    /**
     * Gets the value of the gesamtmietenetto property.
     * 
     * @return
     *     possible object is
     *     {@link Gesamtmietenetto }
     *     
     */
    public Gesamtmietenetto getGesamtmietenetto() {
        return gesamtmietenetto;
    }

    /**
     * Sets the value of the gesamtmietenetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gesamtmietenetto }
     *     
     */
    public void setGesamtmietenetto(Gesamtmietenetto value) {
        this.gesamtmietenetto = value;
    }

    /**
     * Gets the value of the gesamtmietebrutto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getGesamtmietebrutto() {
        return gesamtmietebrutto;
    }

    /**
     * Sets the value of the gesamtmietebrutto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGesamtmietebrutto(BigDecimal value) {
        this.gesamtmietebrutto = value;
    }

    /**
     * Gets the value of the gesamtbelastungnetto property.
     * 
     * @return
     *     possible object is
     *     {@link Gesamtbelastungnetto }
     *     
     */
    public Gesamtbelastungnetto getGesamtbelastungnetto() {
        return gesamtbelastungnetto;
    }

    /**
     * Sets the value of the gesamtbelastungnetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gesamtbelastungnetto }
     *     
     */
    public void setGesamtbelastungnetto(Gesamtbelastungnetto value) {
        this.gesamtbelastungnetto = value;
    }

    /**
     * Gets the value of the gesamtbelastungbrutto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getGesamtbelastungbrutto() {
        return gesamtbelastungbrutto;
    }

    /**
     * Sets the value of the gesamtbelastungbrutto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGesamtbelastungbrutto(BigDecimal value) {
        this.gesamtbelastungbrutto = value;
    }

    /**
     * Gets the value of the gesamtkostenprom2Von property.
     * 
     * @return
     *     possible object is
     *     {@link Gesamtkostenprom2Von }
     *     
     */
    public Gesamtkostenprom2Von getGesamtkostenprom2Von() {
        return gesamtkostenprom2Von;
    }

    /**
     * Sets the value of the gesamtkostenprom2Von property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gesamtkostenprom2Von }
     *     
     */
    public void setGesamtkostenprom2Von(Gesamtkostenprom2Von value) {
        this.gesamtkostenprom2Von = value;
    }

    /**
     * Gets the value of the heizkostennetto property.
     * 
     * @return
     *     possible object is
     *     {@link Heizkostennetto }
     *     
     */
    public Heizkostennetto getHeizkostennetto() {
        return heizkostennetto;
    }

    /**
     * Sets the value of the heizkostennetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Heizkostennetto }
     *     
     */
    public void setHeizkostennetto(Heizkostennetto value) {
        this.heizkostennetto = value;
    }

    /**
     * Gets the value of the monatlichekostennetto property.
     * 
     * @return
     *     possible object is
     *     {@link Monatlichekostennetto }
     *     
     */
    public Monatlichekostennetto getMonatlichekostennetto() {
        return monatlichekostennetto;
    }

    /**
     * Sets the value of the monatlichekostennetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Monatlichekostennetto }
     *     
     */
    public void setMonatlichekostennetto(Monatlichekostennetto value) {
        this.monatlichekostennetto = value;
    }

    /**
     * Gets the value of the monatlichekostenbrutto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMonatlichekostenbrutto() {
        return monatlichekostenbrutto;
    }

    /**
     * Sets the value of the monatlichekostenbrutto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonatlichekostenbrutto(BigDecimal value) {
        this.monatlichekostenbrutto = value;
    }

    /**
     * Gets the value of the nebenkostenprom2Von property.
     * 
     * @return
     *     possible object is
     *     {@link Nebenkostenprom2Von }
     *     
     */
    public Nebenkostenprom2Von getNebenkostenprom2Von() {
        return nebenkostenprom2Von;
    }

    /**
     * Sets the value of the nebenkostenprom2Von property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nebenkostenprom2Von }
     *     
     */
    public void setNebenkostenprom2Von(Nebenkostenprom2Von value) {
        this.nebenkostenprom2Von = value;
    }

    /**
     * Gets the value of the ruecklagenetto property.
     * 
     * @return
     *     possible object is
     *     {@link Ruecklagenetto }
     *     
     */
    public Ruecklagenetto getRuecklagenetto() {
        return ruecklagenetto;
    }

    /**
     * Sets the value of the ruecklagenetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ruecklagenetto }
     *     
     */
    public void setRuecklagenetto(Ruecklagenetto value) {
        this.ruecklagenetto = value;
    }

    /**
     * Gets the value of the sonstigekostennetto property.
     * 
     * @return
     *     possible object is
     *     {@link Sonstigekostennetto }
     *     
     */
    public Sonstigekostennetto getSonstigekostennetto() {
        return sonstigekostennetto;
    }

    /**
     * Sets the value of the sonstigekostennetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sonstigekostennetto }
     *     
     */
    public void setSonstigekostennetto(Sonstigekostennetto value) {
        this.sonstigekostennetto = value;
    }

    /**
     * Gets the value of the sonstigemietenetto property.
     * 
     * @return
     *     possible object is
     *     {@link Sonstigemietenetto }
     *     
     */
    public Sonstigemietenetto getSonstigemietenetto() {
        return sonstigemietenetto;
    }

    /**
     * Sets the value of the sonstigemietenetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sonstigemietenetto }
     *     
     */
    public void setSonstigemietenetto(Sonstigemietenetto value) {
        this.sonstigemietenetto = value;
    }

    /**
     * Gets the value of the summemietenetto property.
     * 
     * @return
     *     possible object is
     *     {@link Summemietenetto }
     *     
     */
    public Summemietenetto getSummemietenetto() {
        return summemietenetto;
    }

    /**
     * Sets the value of the summemietenetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summemietenetto }
     *     
     */
    public void setSummemietenetto(Summemietenetto value) {
        this.summemietenetto = value;
    }

    /**
     * Gets the value of the nettomieteprom2Von property.
     * 
     * @return
     *     possible object is
     *     {@link Nettomieteprom2Von }
     *     
     */
    public Nettomieteprom2Von getNettomieteprom2Von() {
        return nettomieteprom2Von;
    }

    /**
     * Sets the value of the nettomieteprom2Von property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nettomieteprom2Von }
     *     
     */
    public void setNettomieteprom2Von(Nettomieteprom2Von value) {
        this.nettomieteprom2Von = value;
    }

    /**
     * Gets the value of the pacht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getPacht() {
        return pacht;
    }

    /**
     * Sets the value of the pacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacht(BigDecimal value) {
        this.pacht = value;
    }

    /**
     * Gets the value of the erbpacht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getErbpacht() {
        return erbpacht;
    }

    /**
     * Sets the value of the erbpacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErbpacht(BigDecimal value) {
        this.erbpacht = value;
    }

    /**
     * Gets the value of the hausgeld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getHausgeld() {
        return hausgeld;
    }

    /**
     * Sets the value of the hausgeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHausgeld(BigDecimal value) {
        this.hausgeld = value;
    }

    /**
     * Gets the value of the abstand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getAbstand() {
        return abstand;
    }

    /**
     * Sets the value of the abstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstand(BigDecimal value) {
        this.abstand = value;
    }

    /**
     * Gets the value of the preisZeitraumVon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPreisZeitraumVon() {
        return preisZeitraumVon;
    }

    /**
     * Sets the value of the preisZeitraumVon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreisZeitraumVon(Calendar value) {
        this.preisZeitraumVon = value;
    }

    /**
     * Gets the value of the preisZeitraumBis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPreisZeitraumBis() {
        return preisZeitraumBis;
    }

    /**
     * Sets the value of the preisZeitraumBis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreisZeitraumBis(Calendar value) {
        this.preisZeitraumBis = value;
    }

    /**
     * Gets the value of the preisZeiteinheit property.
     * 
     * @return
     *     possible object is
     *     {@link PreisZeiteinheit }
     *     
     */
    public PreisZeiteinheit getPreisZeiteinheit() {
        return preisZeiteinheit;
    }

    /**
     * Sets the value of the preisZeiteinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreisZeiteinheit }
     *     
     */
    public void setPreisZeiteinheit(PreisZeiteinheit value) {
        this.preisZeiteinheit = value;
    }

    /**
     * Gets the value of the mietpreisProQm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMietpreisProQm() {
        return mietpreisProQm;
    }

    /**
     * Sets the value of the mietpreisProQm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMietpreisProQm(BigDecimal value) {
        this.mietpreisProQm = value;
    }

    /**
     * Gets the value of the kaufpreisProQm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getKaufpreisProQm() {
        return kaufpreisProQm;
    }

    /**
     * Sets the value of the kaufpreisProQm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKaufpreisProQm(BigDecimal value) {
        this.kaufpreisProQm = value;
    }

    /**
     * Gets the value of the provisionspflichtig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProvisionspflichtig() {
        return provisionspflichtig;
    }

    /**
     * Sets the value of the provisionspflichtig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProvisionspflichtig(Boolean value) {
        this.provisionspflichtig = value;
    }

    /**
     * Gets the value of the provisionTeilen property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisionTeilen }
     *     
     */
    public ProvisionTeilen getProvisionTeilen() {
        return provisionTeilen;
    }

    /**
     * Sets the value of the provisionTeilen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisionTeilen }
     *     
     */
    public void setProvisionTeilen(ProvisionTeilen value) {
        this.provisionTeilen = value;
    }

    /**
     * Gets the value of the innenCourtage property.
     * 
     * @return
     *     possible object is
     *     {@link InnenCourtage }
     *     
     */
    public InnenCourtage getInnenCourtage() {
        return innenCourtage;
    }

    /**
     * Sets the value of the innenCourtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link InnenCourtage }
     *     
     */
    public void setInnenCourtage(InnenCourtage value) {
        this.innenCourtage = value;
    }

    /**
     * Gets the value of the aussenCourtage property.
     * 
     * @return
     *     possible object is
     *     {@link AussenCourtage }
     *     
     */
    public AussenCourtage getAussenCourtage() {
        return aussenCourtage;
    }

    /**
     * Sets the value of the aussenCourtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AussenCourtage }
     *     
     */
    public void setAussenCourtage(AussenCourtage value) {
        this.aussenCourtage = value;
    }

    /**
     * Gets the value of the courtageHinweis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtageHinweis() {
        return courtageHinweis;
    }

    /**
     * Sets the value of the courtageHinweis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtageHinweis(String value) {
        this.courtageHinweis = value;
    }

    /**
     * Gets the value of the provisionnetto property.
     * 
     * @return
     *     possible object is
     *     {@link Provisionnetto }
     *     
     */
    public Provisionnetto getProvisionnetto() {
        return provisionnetto;
    }

    /**
     * Sets the value of the provisionnetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provisionnetto }
     *     
     */
    public void setProvisionnetto(Provisionnetto value) {
        this.provisionnetto = value;
    }

    /**
     * Gets the value of the provisionbrutto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getProvisionbrutto() {
        return provisionbrutto;
    }

    /**
     * Sets the value of the provisionbrutto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisionbrutto(BigDecimal value) {
        this.provisionbrutto = value;
    }

    /**
     * Gets the value of the waehrung property.
     * 
     * @return
     *     possible object is
     *     {@link Waehrung }
     *     
     */
    public Waehrung getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the value of the waehrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Waehrung }
     *     
     */
    public void setWaehrung(Waehrung value) {
        this.waehrung = value;
    }

    /**
     * Gets the value of the mwstSatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMwstSatz() {
        return mwstSatz;
    }

    /**
     * Sets the value of the mwstSatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMwstSatz(BigDecimal value) {
        this.mwstSatz = value;
    }

    /**
     * Gets the value of the mwstGesamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMwstGesamt() {
        return mwstGesamt;
    }

    /**
     * Sets the value of the mwstGesamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMwstGesamt(BigDecimal value) {
        this.mwstGesamt = value;
    }

    /**
     * Gets the value of the freitextPreis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreitextPreis() {
        return freitextPreis;
    }

    /**
     * Sets the value of the freitextPreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreitextPreis(String value) {
        this.freitextPreis = value;
    }

    /**
     * Gets the value of the xFache property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFache() {
        return xFache;
    }

    /**
     * Sets the value of the xFache property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFache(String value) {
        this.xFache = value;
    }

    /**
     * Gets the value of the nettorendite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getNettorendite() {
        return nettorendite;
    }

    /**
     * Sets the value of the nettorendite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNettorendite(BigDecimal value) {
        this.nettorendite = value;
    }

    /**
     * Gets the value of the nettorenditeSoll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getNettorenditeSoll() {
        return nettorenditeSoll;
    }

    /**
     * Sets the value of the nettorenditeSoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNettorenditeSoll(BigDecimal value) {
        this.nettorenditeSoll = value;
    }

    /**
     * Gets the value of the nettorenditeIst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getNettorenditeIst() {
        return nettorenditeIst;
    }

    /**
     * Sets the value of the nettorenditeIst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNettorenditeIst(BigDecimal value) {
        this.nettorenditeIst = value;
    }

    /**
     * Gets the value of the mieteinnahmenIst property.
     * 
     * @return
     *     possible object is
     *     {@link MieteinnahmenIst }
     *     
     */
    public MieteinnahmenIst getMieteinnahmenIst() {
        return mieteinnahmenIst;
    }

    /**
     * Sets the value of the mieteinnahmenIst property.
     * 
     * @param value
     *     allowed object is
     *     {@link MieteinnahmenIst }
     *     
     */
    public void setMieteinnahmenIst(MieteinnahmenIst value) {
        this.mieteinnahmenIst = value;
    }

    /**
     * Gets the value of the mieteinnahmenSoll property.
     * 
     * @return
     *     possible object is
     *     {@link MieteinnahmenSoll }
     *     
     */
    public MieteinnahmenSoll getMieteinnahmenSoll() {
        return mieteinnahmenSoll;
    }

    /**
     * Sets the value of the mieteinnahmenSoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link MieteinnahmenSoll }
     *     
     */
    public void setMieteinnahmenSoll(MieteinnahmenSoll value) {
        this.mieteinnahmenSoll = value;
    }

    /**
     * Gets the value of the erschliessungskosten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getErschliessungskosten() {
        return erschliessungskosten;
    }

    /**
     * Sets the value of the erschliessungskosten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErschliessungskosten(BigDecimal value) {
        this.erschliessungskosten = value;
    }

    /**
     * Gets the value of the kaution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getKaution() {
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
    public void setKaution(BigDecimal value) {
        this.kaution = value;
    }

    /**
     * Gets the value of the kautionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKautionText() {
        return kautionText;
    }

    /**
     * Sets the value of the kautionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKautionText(String value) {
        this.kautionText = value;
    }

    /**
     * Gets the value of the geschaeftsguthaben property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getGeschaeftsguthaben() {
        return geschaeftsguthaben;
    }

    /**
     * Sets the value of the geschaeftsguthaben property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeschaeftsguthaben(BigDecimal value) {
        this.geschaeftsguthaben = value;
    }

    /**
     * Gets the value of the stpCarport property.
     * 
     * @return
     *     possible object is
     *     {@link Stellplatz }
     *     
     */
    public Stellplatz getStpCarport() {
        return stpCarport;
    }

    /**
     * Sets the value of the stpCarport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stellplatz }
     *     
     */
    public void setStpCarport(Stellplatz value) {
        this.stpCarport = value;
    }

    /**
     * Gets the value of the stpDuplex property.
     * 
     * @return
     *     possible object is
     *     {@link Stellplatz }
     *     
     */
    public Stellplatz getStpDuplex() {
        return stpDuplex;
    }

    /**
     * Sets the value of the stpDuplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stellplatz }
     *     
     */
    public void setStpDuplex(Stellplatz value) {
        this.stpDuplex = value;
    }

    /**
     * Gets the value of the stpFreiplatz property.
     * 
     * @return
     *     possible object is
     *     {@link Stellplatz }
     *     
     */
    public Stellplatz getStpFreiplatz() {
        return stpFreiplatz;
    }

    /**
     * Sets the value of the stpFreiplatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stellplatz }
     *     
     */
    public void setStpFreiplatz(Stellplatz value) {
        this.stpFreiplatz = value;
    }

    /**
     * Gets the value of the stpGarage property.
     * 
     * @return
     *     possible object is
     *     {@link Stellplatz }
     *     
     */
    public Stellplatz getStpGarage() {
        return stpGarage;
    }

    /**
     * Sets the value of the stpGarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stellplatz }
     *     
     */
    public void setStpGarage(Stellplatz value) {
        this.stpGarage = value;
    }

    /**
     * Gets the value of the stpParkhaus property.
     * 
     * @return
     *     possible object is
     *     {@link Stellplatz }
     *     
     */
    public Stellplatz getStpParkhaus() {
        return stpParkhaus;
    }

    /**
     * Sets the value of the stpParkhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stellplatz }
     *     
     */
    public void setStpParkhaus(Stellplatz value) {
        this.stpParkhaus = value;
    }

    /**
     * Gets the value of the stpTiefgarage property.
     * 
     * @return
     *     possible object is
     *     {@link Stellplatz }
     *     
     */
    public Stellplatz getStpTiefgarage() {
        return stpTiefgarage;
    }

    /**
     * Sets the value of the stpTiefgarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stellplatz }
     *     
     */
    public void setStpTiefgarage(Stellplatz value) {
        this.stpTiefgarage = value;
    }

    /**
     * Gets the value of the stpSonstige property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stpSonstige property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStpSonstige().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StpSonstige }
     * 
     * 
     */
    public List<StpSonstige> getStpSonstige() {
        if (stpSonstige == null) {
            stpSonstige = new ArrayList<StpSonstige>();
        }
        return this.stpSonstige;
    }

    /**
     * Gets the value of the richtpreis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getRichtpreis() {
        return richtpreis;
    }

    /**
     * Sets the value of the richtpreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichtpreis(BigDecimal value) {
        this.richtpreis = value;
    }

    /**
     * Gets the value of the richtpreisprom2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getRichtpreisprom2() {
        return richtpreisprom2;
    }

    /**
     * Sets the value of the richtpreisprom2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichtpreisprom2(BigDecimal value) {
        this.richtpreisprom2 = value;
    }

    /**
     * Gets the value of the userDefinedSimplefield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedSimplefield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedSimplefield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedSimplefield }
     * 
     * 
     */
    public List<UserDefinedSimplefield> getUserDefinedSimplefield() {
        if (userDefinedSimplefield == null) {
            userDefinedSimplefield = new ArrayList<UserDefinedSimplefield>();
        }
        return this.userDefinedSimplefield;
    }

    /**
     * Gets the value of the userDefinedAnyfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedAnyfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedAnyfield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedAnyfield }
     * 
     * 
     */
    public List<UserDefinedAnyfield> getUserDefinedAnyfield() {
        if (userDefinedAnyfield == null) {
            userDefinedAnyfield = new ArrayList<UserDefinedAnyfield>();
        }
        return this.userDefinedAnyfield;
    }

    /**
     * Gets the value of the userDefinedExtend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedExtend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedExtend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedExtend }
     * 
     * 
     */
    public List<UserDefinedExtend> getUserDefinedExtend() {
        if (userDefinedExtend == null) {
            userDefinedExtend = new ArrayList<UserDefinedExtend>();
        }
        return this.userDefinedExtend;
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
            Kaufpreis theKaufpreis;
            theKaufpreis = this.getKaufpreis();
            strategy.appendField(locator, this, "kaufpreis", buffer, theKaufpreis);
        }
        {
            Kaufpreisnetto theKaufpreisnetto;
            theKaufpreisnetto = this.getKaufpreisnetto();
            strategy.appendField(locator, this, "kaufpreisnetto", buffer, theKaufpreisnetto);
        }
        {
            BigDecimal theKaufpreisbrutto;
            theKaufpreisbrutto = this.getKaufpreisbrutto();
            strategy.appendField(locator, this, "kaufpreisbrutto", buffer, theKaufpreisbrutto);
        }
        {
            BigDecimal theNettokaltmiete;
            theNettokaltmiete = this.getNettokaltmiete();
            strategy.appendField(locator, this, "nettokaltmiete", buffer, theNettokaltmiete);
        }
        {
            BigDecimal theKaltmiete;
            theKaltmiete = this.getKaltmiete();
            strategy.appendField(locator, this, "kaltmiete", buffer, theKaltmiete);
        }
        {
            BigDecimal theWarmmiete;
            theWarmmiete = this.getWarmmiete();
            strategy.appendField(locator, this, "warmmiete", buffer, theWarmmiete);
        }
        {
            BigDecimal theNebenkosten;
            theNebenkosten = this.getNebenkosten();
            strategy.appendField(locator, this, "nebenkosten", buffer, theNebenkosten);
        }
        {
            Boolean theHeizkostenEnthalten;
            theHeizkostenEnthalten = this.isHeizkostenEnthalten();
            strategy.appendField(locator, this, "heizkostenEnthalten", buffer, theHeizkostenEnthalten);
        }
        {
            BigDecimal theHeizkosten;
            theHeizkosten = this.getHeizkosten();
            strategy.appendField(locator, this, "heizkosten", buffer, theHeizkosten);
        }
        {
            Boolean theZzgMehrwertsteuer;
            theZzgMehrwertsteuer = this.isZzgMehrwertsteuer();
            strategy.appendField(locator, this, "zzgMehrwertsteuer", buffer, theZzgMehrwertsteuer);
        }
        {
            BigDecimal theMietzuschlaege;
            theMietzuschlaege = this.getMietzuschlaege();
            strategy.appendField(locator, this, "mietzuschlaege", buffer, theMietzuschlaege);
        }
        {
            Hauptmietzinsnetto theHauptmietzinsnetto;
            theHauptmietzinsnetto = this.getHauptmietzinsnetto();
            strategy.appendField(locator, this, "hauptmietzinsnetto", buffer, theHauptmietzinsnetto);
        }
        {
            BigDecimal thePauschalmiete;
            thePauschalmiete = this.getPauschalmiete();
            strategy.appendField(locator, this, "pauschalmiete", buffer, thePauschalmiete);
        }
        {
            Betriebskostennetto theBetriebskostennetto;
            theBetriebskostennetto = this.getBetriebskostennetto();
            strategy.appendField(locator, this, "betriebskostennetto", buffer, theBetriebskostennetto);
        }
        {
            Evbnetto theEvbnetto;
            theEvbnetto = this.getEvbnetto();
            strategy.appendField(locator, this, "evbnetto", buffer, theEvbnetto);
        }
        {
            Gesamtmietenetto theGesamtmietenetto;
            theGesamtmietenetto = this.getGesamtmietenetto();
            strategy.appendField(locator, this, "gesamtmietenetto", buffer, theGesamtmietenetto);
        }
        {
            BigDecimal theGesamtmietebrutto;
            theGesamtmietebrutto = this.getGesamtmietebrutto();
            strategy.appendField(locator, this, "gesamtmietebrutto", buffer, theGesamtmietebrutto);
        }
        {
            Gesamtbelastungnetto theGesamtbelastungnetto;
            theGesamtbelastungnetto = this.getGesamtbelastungnetto();
            strategy.appendField(locator, this, "gesamtbelastungnetto", buffer, theGesamtbelastungnetto);
        }
        {
            BigDecimal theGesamtbelastungbrutto;
            theGesamtbelastungbrutto = this.getGesamtbelastungbrutto();
            strategy.appendField(locator, this, "gesamtbelastungbrutto", buffer, theGesamtbelastungbrutto);
        }
        {
            Gesamtkostenprom2Von theGesamtkostenprom2Von;
            theGesamtkostenprom2Von = this.getGesamtkostenprom2Von();
            strategy.appendField(locator, this, "gesamtkostenprom2Von", buffer, theGesamtkostenprom2Von);
        }
        {
            Heizkostennetto theHeizkostennetto;
            theHeizkostennetto = this.getHeizkostennetto();
            strategy.appendField(locator, this, "heizkostennetto", buffer, theHeizkostennetto);
        }
        {
            Monatlichekostennetto theMonatlichekostennetto;
            theMonatlichekostennetto = this.getMonatlichekostennetto();
            strategy.appendField(locator, this, "monatlichekostennetto", buffer, theMonatlichekostennetto);
        }
        {
            BigDecimal theMonatlichekostenbrutto;
            theMonatlichekostenbrutto = this.getMonatlichekostenbrutto();
            strategy.appendField(locator, this, "monatlichekostenbrutto", buffer, theMonatlichekostenbrutto);
        }
        {
            Nebenkostenprom2Von theNebenkostenprom2Von;
            theNebenkostenprom2Von = this.getNebenkostenprom2Von();
            strategy.appendField(locator, this, "nebenkostenprom2Von", buffer, theNebenkostenprom2Von);
        }
        {
            Ruecklagenetto theRuecklagenetto;
            theRuecklagenetto = this.getRuecklagenetto();
            strategy.appendField(locator, this, "ruecklagenetto", buffer, theRuecklagenetto);
        }
        {
            Sonstigekostennetto theSonstigekostennetto;
            theSonstigekostennetto = this.getSonstigekostennetto();
            strategy.appendField(locator, this, "sonstigekostennetto", buffer, theSonstigekostennetto);
        }
        {
            Sonstigemietenetto theSonstigemietenetto;
            theSonstigemietenetto = this.getSonstigemietenetto();
            strategy.appendField(locator, this, "sonstigemietenetto", buffer, theSonstigemietenetto);
        }
        {
            Summemietenetto theSummemietenetto;
            theSummemietenetto = this.getSummemietenetto();
            strategy.appendField(locator, this, "summemietenetto", buffer, theSummemietenetto);
        }
        {
            Nettomieteprom2Von theNettomieteprom2Von;
            theNettomieteprom2Von = this.getNettomieteprom2Von();
            strategy.appendField(locator, this, "nettomieteprom2Von", buffer, theNettomieteprom2Von);
        }
        {
            BigDecimal thePacht;
            thePacht = this.getPacht();
            strategy.appendField(locator, this, "pacht", buffer, thePacht);
        }
        {
            BigDecimal theErbpacht;
            theErbpacht = this.getErbpacht();
            strategy.appendField(locator, this, "erbpacht", buffer, theErbpacht);
        }
        {
            BigDecimal theHausgeld;
            theHausgeld = this.getHausgeld();
            strategy.appendField(locator, this, "hausgeld", buffer, theHausgeld);
        }
        {
            BigDecimal theAbstand;
            theAbstand = this.getAbstand();
            strategy.appendField(locator, this, "abstand", buffer, theAbstand);
        }
        {
            Calendar thePreisZeitraumVon;
            thePreisZeitraumVon = this.getPreisZeitraumVon();
            strategy.appendField(locator, this, "preisZeitraumVon", buffer, thePreisZeitraumVon);
        }
        {
            Calendar thePreisZeitraumBis;
            thePreisZeitraumBis = this.getPreisZeitraumBis();
            strategy.appendField(locator, this, "preisZeitraumBis", buffer, thePreisZeitraumBis);
        }
        {
            PreisZeiteinheit thePreisZeiteinheit;
            thePreisZeiteinheit = this.getPreisZeiteinheit();
            strategy.appendField(locator, this, "preisZeiteinheit", buffer, thePreisZeiteinheit);
        }
        {
            BigDecimal theMietpreisProQm;
            theMietpreisProQm = this.getMietpreisProQm();
            strategy.appendField(locator, this, "mietpreisProQm", buffer, theMietpreisProQm);
        }
        {
            BigDecimal theKaufpreisProQm;
            theKaufpreisProQm = this.getKaufpreisProQm();
            strategy.appendField(locator, this, "kaufpreisProQm", buffer, theKaufpreisProQm);
        }
        {
            Boolean theProvisionspflichtig;
            theProvisionspflichtig = this.isProvisionspflichtig();
            strategy.appendField(locator, this, "provisionspflichtig", buffer, theProvisionspflichtig);
        }
        {
            ProvisionTeilen theProvisionTeilen;
            theProvisionTeilen = this.getProvisionTeilen();
            strategy.appendField(locator, this, "provisionTeilen", buffer, theProvisionTeilen);
        }
        {
            InnenCourtage theInnenCourtage;
            theInnenCourtage = this.getInnenCourtage();
            strategy.appendField(locator, this, "innenCourtage", buffer, theInnenCourtage);
        }
        {
            AussenCourtage theAussenCourtage;
            theAussenCourtage = this.getAussenCourtage();
            strategy.appendField(locator, this, "aussenCourtage", buffer, theAussenCourtage);
        }
        {
            String theCourtageHinweis;
            theCourtageHinweis = this.getCourtageHinweis();
            strategy.appendField(locator, this, "courtageHinweis", buffer, theCourtageHinweis);
        }
        {
            Provisionnetto theProvisionnetto;
            theProvisionnetto = this.getProvisionnetto();
            strategy.appendField(locator, this, "provisionnetto", buffer, theProvisionnetto);
        }
        {
            BigDecimal theProvisionbrutto;
            theProvisionbrutto = this.getProvisionbrutto();
            strategy.appendField(locator, this, "provisionbrutto", buffer, theProvisionbrutto);
        }
        {
            Waehrung theWaehrung;
            theWaehrung = this.getWaehrung();
            strategy.appendField(locator, this, "waehrung", buffer, theWaehrung);
        }
        {
            BigDecimal theMwstSatz;
            theMwstSatz = this.getMwstSatz();
            strategy.appendField(locator, this, "mwstSatz", buffer, theMwstSatz);
        }
        {
            BigDecimal theMwstGesamt;
            theMwstGesamt = this.getMwstGesamt();
            strategy.appendField(locator, this, "mwstGesamt", buffer, theMwstGesamt);
        }
        {
            String theFreitextPreis;
            theFreitextPreis = this.getFreitextPreis();
            strategy.appendField(locator, this, "freitextPreis", buffer, theFreitextPreis);
        }
        {
            String theXFache;
            theXFache = this.getXFache();
            strategy.appendField(locator, this, "xFache", buffer, theXFache);
        }
        {
            BigDecimal theNettorendite;
            theNettorendite = this.getNettorendite();
            strategy.appendField(locator, this, "nettorendite", buffer, theNettorendite);
        }
        {
            BigDecimal theNettorenditeSoll;
            theNettorenditeSoll = this.getNettorenditeSoll();
            strategy.appendField(locator, this, "nettorenditeSoll", buffer, theNettorenditeSoll);
        }
        {
            BigDecimal theNettorenditeIst;
            theNettorenditeIst = this.getNettorenditeIst();
            strategy.appendField(locator, this, "nettorenditeIst", buffer, theNettorenditeIst);
        }
        {
            MieteinnahmenIst theMieteinnahmenIst;
            theMieteinnahmenIst = this.getMieteinnahmenIst();
            strategy.appendField(locator, this, "mieteinnahmenIst", buffer, theMieteinnahmenIst);
        }
        {
            MieteinnahmenSoll theMieteinnahmenSoll;
            theMieteinnahmenSoll = this.getMieteinnahmenSoll();
            strategy.appendField(locator, this, "mieteinnahmenSoll", buffer, theMieteinnahmenSoll);
        }
        {
            BigDecimal theErschliessungskosten;
            theErschliessungskosten = this.getErschliessungskosten();
            strategy.appendField(locator, this, "erschliessungskosten", buffer, theErschliessungskosten);
        }
        {
            BigDecimal theKaution;
            theKaution = this.getKaution();
            strategy.appendField(locator, this, "kaution", buffer, theKaution);
        }
        {
            String theKautionText;
            theKautionText = this.getKautionText();
            strategy.appendField(locator, this, "kautionText", buffer, theKautionText);
        }
        {
            BigDecimal theGeschaeftsguthaben;
            theGeschaeftsguthaben = this.getGeschaeftsguthaben();
            strategy.appendField(locator, this, "geschaeftsguthaben", buffer, theGeschaeftsguthaben);
        }
        {
            Stellplatz theStpCarport;
            theStpCarport = this.getStpCarport();
            strategy.appendField(locator, this, "stpCarport", buffer, theStpCarport);
        }
        {
            Stellplatz theStpDuplex;
            theStpDuplex = this.getStpDuplex();
            strategy.appendField(locator, this, "stpDuplex", buffer, theStpDuplex);
        }
        {
            Stellplatz theStpFreiplatz;
            theStpFreiplatz = this.getStpFreiplatz();
            strategy.appendField(locator, this, "stpFreiplatz", buffer, theStpFreiplatz);
        }
        {
            Stellplatz theStpGarage;
            theStpGarage = this.getStpGarage();
            strategy.appendField(locator, this, "stpGarage", buffer, theStpGarage);
        }
        {
            Stellplatz theStpParkhaus;
            theStpParkhaus = this.getStpParkhaus();
            strategy.appendField(locator, this, "stpParkhaus", buffer, theStpParkhaus);
        }
        {
            Stellplatz theStpTiefgarage;
            theStpTiefgarage = this.getStpTiefgarage();
            strategy.appendField(locator, this, "stpTiefgarage", buffer, theStpTiefgarage);
        }
        {
            List<StpSonstige> theStpSonstige;
            theStpSonstige = (((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty()))?this.getStpSonstige():null);
            strategy.appendField(locator, this, "stpSonstige", buffer, theStpSonstige);
        }
        {
            BigDecimal theRichtpreis;
            theRichtpreis = this.getRichtpreis();
            strategy.appendField(locator, this, "richtpreis", buffer, theRichtpreis);
        }
        {
            BigDecimal theRichtpreisprom2;
            theRichtpreisprom2 = this.getRichtpreisprom2();
            strategy.appendField(locator, this, "richtpreisprom2", buffer, theRichtpreisprom2);
        }
        {
            List<UserDefinedSimplefield> theUserDefinedSimplefield;
            theUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            strategy.appendField(locator, this, "userDefinedSimplefield", buffer, theUserDefinedSimplefield);
        }
        {
            List<UserDefinedAnyfield> theUserDefinedAnyfield;
            theUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            strategy.appendField(locator, this, "userDefinedAnyfield", buffer, theUserDefinedAnyfield);
        }
        {
            List<UserDefinedExtend> theUserDefinedExtend;
            theUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            strategy.appendField(locator, this, "userDefinedExtend", buffer, theUserDefinedExtend);
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
        if (draftCopy instanceof Preise) {
            final Preise copy = ((Preise) draftCopy);
            if (this.kaufpreis!= null) {
                Kaufpreis sourceKaufpreis;
                sourceKaufpreis = this.getKaufpreis();
                Kaufpreis copyKaufpreis = ((Kaufpreis) strategy.copy(LocatorUtils.property(locator, "kaufpreis", sourceKaufpreis), sourceKaufpreis));
                copy.setKaufpreis(copyKaufpreis);
            } else {
                copy.kaufpreis = null;
            }
            if (this.kaufpreisnetto!= null) {
                Kaufpreisnetto sourceKaufpreisnetto;
                sourceKaufpreisnetto = this.getKaufpreisnetto();
                Kaufpreisnetto copyKaufpreisnetto = ((Kaufpreisnetto) strategy.copy(LocatorUtils.property(locator, "kaufpreisnetto", sourceKaufpreisnetto), sourceKaufpreisnetto));
                copy.setKaufpreisnetto(copyKaufpreisnetto);
            } else {
                copy.kaufpreisnetto = null;
            }
            if (this.kaufpreisbrutto!= null) {
                BigDecimal sourceKaufpreisbrutto;
                sourceKaufpreisbrutto = this.getKaufpreisbrutto();
                BigDecimal copyKaufpreisbrutto = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaufpreisbrutto", sourceKaufpreisbrutto), sourceKaufpreisbrutto));
                copy.setKaufpreisbrutto(copyKaufpreisbrutto);
            } else {
                copy.kaufpreisbrutto = null;
            }
            if (this.nettokaltmiete!= null) {
                BigDecimal sourceNettokaltmiete;
                sourceNettokaltmiete = this.getNettokaltmiete();
                BigDecimal copyNettokaltmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nettokaltmiete", sourceNettokaltmiete), sourceNettokaltmiete));
                copy.setNettokaltmiete(copyNettokaltmiete);
            } else {
                copy.nettokaltmiete = null;
            }
            if (this.kaltmiete!= null) {
                BigDecimal sourceKaltmiete;
                sourceKaltmiete = this.getKaltmiete();
                BigDecimal copyKaltmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaltmiete", sourceKaltmiete), sourceKaltmiete));
                copy.setKaltmiete(copyKaltmiete);
            } else {
                copy.kaltmiete = null;
            }
            if (this.warmmiete!= null) {
                BigDecimal sourceWarmmiete;
                sourceWarmmiete = this.getWarmmiete();
                BigDecimal copyWarmmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "warmmiete", sourceWarmmiete), sourceWarmmiete));
                copy.setWarmmiete(copyWarmmiete);
            } else {
                copy.warmmiete = null;
            }
            if (this.nebenkosten!= null) {
                BigDecimal sourceNebenkosten;
                sourceNebenkosten = this.getNebenkosten();
                BigDecimal copyNebenkosten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nebenkosten", sourceNebenkosten), sourceNebenkosten));
                copy.setNebenkosten(copyNebenkosten);
            } else {
                copy.nebenkosten = null;
            }
            if (this.heizkostenEnthalten!= null) {
                Boolean sourceHeizkostenEnthalten;
                sourceHeizkostenEnthalten = this.isHeizkostenEnthalten();
                Boolean copyHeizkostenEnthalten = ((Boolean) strategy.copy(LocatorUtils.property(locator, "heizkostenEnthalten", sourceHeizkostenEnthalten), sourceHeizkostenEnthalten));
                copy.setHeizkostenEnthalten(copyHeizkostenEnthalten);
            } else {
                copy.heizkostenEnthalten = null;
            }
            if (this.heizkosten!= null) {
                BigDecimal sourceHeizkosten;
                sourceHeizkosten = this.getHeizkosten();
                BigDecimal copyHeizkosten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "heizkosten", sourceHeizkosten), sourceHeizkosten));
                copy.setHeizkosten(copyHeizkosten);
            } else {
                copy.heizkosten = null;
            }
            if (this.zzgMehrwertsteuer!= null) {
                Boolean sourceZzgMehrwertsteuer;
                sourceZzgMehrwertsteuer = this.isZzgMehrwertsteuer();
                Boolean copyZzgMehrwertsteuer = ((Boolean) strategy.copy(LocatorUtils.property(locator, "zzgMehrwertsteuer", sourceZzgMehrwertsteuer), sourceZzgMehrwertsteuer));
                copy.setZzgMehrwertsteuer(copyZzgMehrwertsteuer);
            } else {
                copy.zzgMehrwertsteuer = null;
            }
            if (this.mietzuschlaege!= null) {
                BigDecimal sourceMietzuschlaege;
                sourceMietzuschlaege = this.getMietzuschlaege();
                BigDecimal copyMietzuschlaege = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mietzuschlaege", sourceMietzuschlaege), sourceMietzuschlaege));
                copy.setMietzuschlaege(copyMietzuschlaege);
            } else {
                copy.mietzuschlaege = null;
            }
            if (this.hauptmietzinsnetto!= null) {
                Hauptmietzinsnetto sourceHauptmietzinsnetto;
                sourceHauptmietzinsnetto = this.getHauptmietzinsnetto();
                Hauptmietzinsnetto copyHauptmietzinsnetto = ((Hauptmietzinsnetto) strategy.copy(LocatorUtils.property(locator, "hauptmietzinsnetto", sourceHauptmietzinsnetto), sourceHauptmietzinsnetto));
                copy.setHauptmietzinsnetto(copyHauptmietzinsnetto);
            } else {
                copy.hauptmietzinsnetto = null;
            }
            if (this.pauschalmiete!= null) {
                BigDecimal sourcePauschalmiete;
                sourcePauschalmiete = this.getPauschalmiete();
                BigDecimal copyPauschalmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "pauschalmiete", sourcePauschalmiete), sourcePauschalmiete));
                copy.setPauschalmiete(copyPauschalmiete);
            } else {
                copy.pauschalmiete = null;
            }
            if (this.betriebskostennetto!= null) {
                Betriebskostennetto sourceBetriebskostennetto;
                sourceBetriebskostennetto = this.getBetriebskostennetto();
                Betriebskostennetto copyBetriebskostennetto = ((Betriebskostennetto) strategy.copy(LocatorUtils.property(locator, "betriebskostennetto", sourceBetriebskostennetto), sourceBetriebskostennetto));
                copy.setBetriebskostennetto(copyBetriebskostennetto);
            } else {
                copy.betriebskostennetto = null;
            }
            if (this.evbnetto!= null) {
                Evbnetto sourceEvbnetto;
                sourceEvbnetto = this.getEvbnetto();
                Evbnetto copyEvbnetto = ((Evbnetto) strategy.copy(LocatorUtils.property(locator, "evbnetto", sourceEvbnetto), sourceEvbnetto));
                copy.setEvbnetto(copyEvbnetto);
            } else {
                copy.evbnetto = null;
            }
            if (this.gesamtmietenetto!= null) {
                Gesamtmietenetto sourceGesamtmietenetto;
                sourceGesamtmietenetto = this.getGesamtmietenetto();
                Gesamtmietenetto copyGesamtmietenetto = ((Gesamtmietenetto) strategy.copy(LocatorUtils.property(locator, "gesamtmietenetto", sourceGesamtmietenetto), sourceGesamtmietenetto));
                copy.setGesamtmietenetto(copyGesamtmietenetto);
            } else {
                copy.gesamtmietenetto = null;
            }
            if (this.gesamtmietebrutto!= null) {
                BigDecimal sourceGesamtmietebrutto;
                sourceGesamtmietebrutto = this.getGesamtmietebrutto();
                BigDecimal copyGesamtmietebrutto = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gesamtmietebrutto", sourceGesamtmietebrutto), sourceGesamtmietebrutto));
                copy.setGesamtmietebrutto(copyGesamtmietebrutto);
            } else {
                copy.gesamtmietebrutto = null;
            }
            if (this.gesamtbelastungnetto!= null) {
                Gesamtbelastungnetto sourceGesamtbelastungnetto;
                sourceGesamtbelastungnetto = this.getGesamtbelastungnetto();
                Gesamtbelastungnetto copyGesamtbelastungnetto = ((Gesamtbelastungnetto) strategy.copy(LocatorUtils.property(locator, "gesamtbelastungnetto", sourceGesamtbelastungnetto), sourceGesamtbelastungnetto));
                copy.setGesamtbelastungnetto(copyGesamtbelastungnetto);
            } else {
                copy.gesamtbelastungnetto = null;
            }
            if (this.gesamtbelastungbrutto!= null) {
                BigDecimal sourceGesamtbelastungbrutto;
                sourceGesamtbelastungbrutto = this.getGesamtbelastungbrutto();
                BigDecimal copyGesamtbelastungbrutto = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gesamtbelastungbrutto", sourceGesamtbelastungbrutto), sourceGesamtbelastungbrutto));
                copy.setGesamtbelastungbrutto(copyGesamtbelastungbrutto);
            } else {
                copy.gesamtbelastungbrutto = null;
            }
            if (this.gesamtkostenprom2Von!= null) {
                Gesamtkostenprom2Von sourceGesamtkostenprom2Von;
                sourceGesamtkostenprom2Von = this.getGesamtkostenprom2Von();
                Gesamtkostenprom2Von copyGesamtkostenprom2Von = ((Gesamtkostenprom2Von) strategy.copy(LocatorUtils.property(locator, "gesamtkostenprom2Von", sourceGesamtkostenprom2Von), sourceGesamtkostenprom2Von));
                copy.setGesamtkostenprom2Von(copyGesamtkostenprom2Von);
            } else {
                copy.gesamtkostenprom2Von = null;
            }
            if (this.heizkostennetto!= null) {
                Heizkostennetto sourceHeizkostennetto;
                sourceHeizkostennetto = this.getHeizkostennetto();
                Heizkostennetto copyHeizkostennetto = ((Heizkostennetto) strategy.copy(LocatorUtils.property(locator, "heizkostennetto", sourceHeizkostennetto), sourceHeizkostennetto));
                copy.setHeizkostennetto(copyHeizkostennetto);
            } else {
                copy.heizkostennetto = null;
            }
            if (this.monatlichekostennetto!= null) {
                Monatlichekostennetto sourceMonatlichekostennetto;
                sourceMonatlichekostennetto = this.getMonatlichekostennetto();
                Monatlichekostennetto copyMonatlichekostennetto = ((Monatlichekostennetto) strategy.copy(LocatorUtils.property(locator, "monatlichekostennetto", sourceMonatlichekostennetto), sourceMonatlichekostennetto));
                copy.setMonatlichekostennetto(copyMonatlichekostennetto);
            } else {
                copy.monatlichekostennetto = null;
            }
            if (this.monatlichekostenbrutto!= null) {
                BigDecimal sourceMonatlichekostenbrutto;
                sourceMonatlichekostenbrutto = this.getMonatlichekostenbrutto();
                BigDecimal copyMonatlichekostenbrutto = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "monatlichekostenbrutto", sourceMonatlichekostenbrutto), sourceMonatlichekostenbrutto));
                copy.setMonatlichekostenbrutto(copyMonatlichekostenbrutto);
            } else {
                copy.monatlichekostenbrutto = null;
            }
            if (this.nebenkostenprom2Von!= null) {
                Nebenkostenprom2Von sourceNebenkostenprom2Von;
                sourceNebenkostenprom2Von = this.getNebenkostenprom2Von();
                Nebenkostenprom2Von copyNebenkostenprom2Von = ((Nebenkostenprom2Von) strategy.copy(LocatorUtils.property(locator, "nebenkostenprom2Von", sourceNebenkostenprom2Von), sourceNebenkostenprom2Von));
                copy.setNebenkostenprom2Von(copyNebenkostenprom2Von);
            } else {
                copy.nebenkostenprom2Von = null;
            }
            if (this.ruecklagenetto!= null) {
                Ruecklagenetto sourceRuecklagenetto;
                sourceRuecklagenetto = this.getRuecklagenetto();
                Ruecklagenetto copyRuecklagenetto = ((Ruecklagenetto) strategy.copy(LocatorUtils.property(locator, "ruecklagenetto", sourceRuecklagenetto), sourceRuecklagenetto));
                copy.setRuecklagenetto(copyRuecklagenetto);
            } else {
                copy.ruecklagenetto = null;
            }
            if (this.sonstigekostennetto!= null) {
                Sonstigekostennetto sourceSonstigekostennetto;
                sourceSonstigekostennetto = this.getSonstigekostennetto();
                Sonstigekostennetto copySonstigekostennetto = ((Sonstigekostennetto) strategy.copy(LocatorUtils.property(locator, "sonstigekostennetto", sourceSonstigekostennetto), sourceSonstigekostennetto));
                copy.setSonstigekostennetto(copySonstigekostennetto);
            } else {
                copy.sonstigekostennetto = null;
            }
            if (this.sonstigemietenetto!= null) {
                Sonstigemietenetto sourceSonstigemietenetto;
                sourceSonstigemietenetto = this.getSonstigemietenetto();
                Sonstigemietenetto copySonstigemietenetto = ((Sonstigemietenetto) strategy.copy(LocatorUtils.property(locator, "sonstigemietenetto", sourceSonstigemietenetto), sourceSonstigemietenetto));
                copy.setSonstigemietenetto(copySonstigemietenetto);
            } else {
                copy.sonstigemietenetto = null;
            }
            if (this.summemietenetto!= null) {
                Summemietenetto sourceSummemietenetto;
                sourceSummemietenetto = this.getSummemietenetto();
                Summemietenetto copySummemietenetto = ((Summemietenetto) strategy.copy(LocatorUtils.property(locator, "summemietenetto", sourceSummemietenetto), sourceSummemietenetto));
                copy.setSummemietenetto(copySummemietenetto);
            } else {
                copy.summemietenetto = null;
            }
            if (this.nettomieteprom2Von!= null) {
                Nettomieteprom2Von sourceNettomieteprom2Von;
                sourceNettomieteprom2Von = this.getNettomieteprom2Von();
                Nettomieteprom2Von copyNettomieteprom2Von = ((Nettomieteprom2Von) strategy.copy(LocatorUtils.property(locator, "nettomieteprom2Von", sourceNettomieteprom2Von), sourceNettomieteprom2Von));
                copy.setNettomieteprom2Von(copyNettomieteprom2Von);
            } else {
                copy.nettomieteprom2Von = null;
            }
            if (this.pacht!= null) {
                BigDecimal sourcePacht;
                sourcePacht = this.getPacht();
                BigDecimal copyPacht = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "pacht", sourcePacht), sourcePacht));
                copy.setPacht(copyPacht);
            } else {
                copy.pacht = null;
            }
            if (this.erbpacht!= null) {
                BigDecimal sourceErbpacht;
                sourceErbpacht = this.getErbpacht();
                BigDecimal copyErbpacht = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "erbpacht", sourceErbpacht), sourceErbpacht));
                copy.setErbpacht(copyErbpacht);
            } else {
                copy.erbpacht = null;
            }
            if (this.hausgeld!= null) {
                BigDecimal sourceHausgeld;
                sourceHausgeld = this.getHausgeld();
                BigDecimal copyHausgeld = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "hausgeld", sourceHausgeld), sourceHausgeld));
                copy.setHausgeld(copyHausgeld);
            } else {
                copy.hausgeld = null;
            }
            if (this.abstand!= null) {
                BigDecimal sourceAbstand;
                sourceAbstand = this.getAbstand();
                BigDecimal copyAbstand = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "abstand", sourceAbstand), sourceAbstand));
                copy.setAbstand(copyAbstand);
            } else {
                copy.abstand = null;
            }
            if (this.preisZeitraumVon!= null) {
                Calendar sourcePreisZeitraumVon;
                sourcePreisZeitraumVon = this.getPreisZeitraumVon();
                Calendar copyPreisZeitraumVon = ((Calendar) strategy.copy(LocatorUtils.property(locator, "preisZeitraumVon", sourcePreisZeitraumVon), sourcePreisZeitraumVon));
                copy.setPreisZeitraumVon(copyPreisZeitraumVon);
            } else {
                copy.preisZeitraumVon = null;
            }
            if (this.preisZeitraumBis!= null) {
                Calendar sourcePreisZeitraumBis;
                sourcePreisZeitraumBis = this.getPreisZeitraumBis();
                Calendar copyPreisZeitraumBis = ((Calendar) strategy.copy(LocatorUtils.property(locator, "preisZeitraumBis", sourcePreisZeitraumBis), sourcePreisZeitraumBis));
                copy.setPreisZeitraumBis(copyPreisZeitraumBis);
            } else {
                copy.preisZeitraumBis = null;
            }
            if (this.preisZeiteinheit!= null) {
                PreisZeiteinheit sourcePreisZeiteinheit;
                sourcePreisZeiteinheit = this.getPreisZeiteinheit();
                PreisZeiteinheit copyPreisZeiteinheit = ((PreisZeiteinheit) strategy.copy(LocatorUtils.property(locator, "preisZeiteinheit", sourcePreisZeiteinheit), sourcePreisZeiteinheit));
                copy.setPreisZeiteinheit(copyPreisZeiteinheit);
            } else {
                copy.preisZeiteinheit = null;
            }
            if (this.mietpreisProQm!= null) {
                BigDecimal sourceMietpreisProQm;
                sourceMietpreisProQm = this.getMietpreisProQm();
                BigDecimal copyMietpreisProQm = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mietpreisProQm", sourceMietpreisProQm), sourceMietpreisProQm));
                copy.setMietpreisProQm(copyMietpreisProQm);
            } else {
                copy.mietpreisProQm = null;
            }
            if (this.kaufpreisProQm!= null) {
                BigDecimal sourceKaufpreisProQm;
                sourceKaufpreisProQm = this.getKaufpreisProQm();
                BigDecimal copyKaufpreisProQm = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaufpreisProQm", sourceKaufpreisProQm), sourceKaufpreisProQm));
                copy.setKaufpreisProQm(copyKaufpreisProQm);
            } else {
                copy.kaufpreisProQm = null;
            }
            if (this.provisionspflichtig!= null) {
                Boolean sourceProvisionspflichtig;
                sourceProvisionspflichtig = this.isProvisionspflichtig();
                Boolean copyProvisionspflichtig = ((Boolean) strategy.copy(LocatorUtils.property(locator, "provisionspflichtig", sourceProvisionspflichtig), sourceProvisionspflichtig));
                copy.setProvisionspflichtig(copyProvisionspflichtig);
            } else {
                copy.provisionspflichtig = null;
            }
            if (this.provisionTeilen!= null) {
                ProvisionTeilen sourceProvisionTeilen;
                sourceProvisionTeilen = this.getProvisionTeilen();
                ProvisionTeilen copyProvisionTeilen = ((ProvisionTeilen) strategy.copy(LocatorUtils.property(locator, "provisionTeilen", sourceProvisionTeilen), sourceProvisionTeilen));
                copy.setProvisionTeilen(copyProvisionTeilen);
            } else {
                copy.provisionTeilen = null;
            }
            if (this.innenCourtage!= null) {
                InnenCourtage sourceInnenCourtage;
                sourceInnenCourtage = this.getInnenCourtage();
                InnenCourtage copyInnenCourtage = ((InnenCourtage) strategy.copy(LocatorUtils.property(locator, "innenCourtage", sourceInnenCourtage), sourceInnenCourtage));
                copy.setInnenCourtage(copyInnenCourtage);
            } else {
                copy.innenCourtage = null;
            }
            if (this.aussenCourtage!= null) {
                AussenCourtage sourceAussenCourtage;
                sourceAussenCourtage = this.getAussenCourtage();
                AussenCourtage copyAussenCourtage = ((AussenCourtage) strategy.copy(LocatorUtils.property(locator, "aussenCourtage", sourceAussenCourtage), sourceAussenCourtage));
                copy.setAussenCourtage(copyAussenCourtage);
            } else {
                copy.aussenCourtage = null;
            }
            if (this.courtageHinweis!= null) {
                String sourceCourtageHinweis;
                sourceCourtageHinweis = this.getCourtageHinweis();
                String copyCourtageHinweis = ((String) strategy.copy(LocatorUtils.property(locator, "courtageHinweis", sourceCourtageHinweis), sourceCourtageHinweis));
                copy.setCourtageHinweis(copyCourtageHinweis);
            } else {
                copy.courtageHinweis = null;
            }
            if (this.provisionnetto!= null) {
                Provisionnetto sourceProvisionnetto;
                sourceProvisionnetto = this.getProvisionnetto();
                Provisionnetto copyProvisionnetto = ((Provisionnetto) strategy.copy(LocatorUtils.property(locator, "provisionnetto", sourceProvisionnetto), sourceProvisionnetto));
                copy.setProvisionnetto(copyProvisionnetto);
            } else {
                copy.provisionnetto = null;
            }
            if (this.provisionbrutto!= null) {
                BigDecimal sourceProvisionbrutto;
                sourceProvisionbrutto = this.getProvisionbrutto();
                BigDecimal copyProvisionbrutto = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "provisionbrutto", sourceProvisionbrutto), sourceProvisionbrutto));
                copy.setProvisionbrutto(copyProvisionbrutto);
            } else {
                copy.provisionbrutto = null;
            }
            if (this.waehrung!= null) {
                Waehrung sourceWaehrung;
                sourceWaehrung = this.getWaehrung();
                Waehrung copyWaehrung = ((Waehrung) strategy.copy(LocatorUtils.property(locator, "waehrung", sourceWaehrung), sourceWaehrung));
                copy.setWaehrung(copyWaehrung);
            } else {
                copy.waehrung = null;
            }
            if (this.mwstSatz!= null) {
                BigDecimal sourceMwstSatz;
                sourceMwstSatz = this.getMwstSatz();
                BigDecimal copyMwstSatz = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mwstSatz", sourceMwstSatz), sourceMwstSatz));
                copy.setMwstSatz(copyMwstSatz);
            } else {
                copy.mwstSatz = null;
            }
            if (this.mwstGesamt!= null) {
                BigDecimal sourceMwstGesamt;
                sourceMwstGesamt = this.getMwstGesamt();
                BigDecimal copyMwstGesamt = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mwstGesamt", sourceMwstGesamt), sourceMwstGesamt));
                copy.setMwstGesamt(copyMwstGesamt);
            } else {
                copy.mwstGesamt = null;
            }
            if (this.freitextPreis!= null) {
                String sourceFreitextPreis;
                sourceFreitextPreis = this.getFreitextPreis();
                String copyFreitextPreis = ((String) strategy.copy(LocatorUtils.property(locator, "freitextPreis", sourceFreitextPreis), sourceFreitextPreis));
                copy.setFreitextPreis(copyFreitextPreis);
            } else {
                copy.freitextPreis = null;
            }
            if (this.xFache!= null) {
                String sourceXFache;
                sourceXFache = this.getXFache();
                String copyXFache = ((String) strategy.copy(LocatorUtils.property(locator, "xFache", sourceXFache), sourceXFache));
                copy.setXFache(copyXFache);
            } else {
                copy.xFache = null;
            }
            if (this.nettorendite!= null) {
                BigDecimal sourceNettorendite;
                sourceNettorendite = this.getNettorendite();
                BigDecimal copyNettorendite = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nettorendite", sourceNettorendite), sourceNettorendite));
                copy.setNettorendite(copyNettorendite);
            } else {
                copy.nettorendite = null;
            }
            if (this.nettorenditeSoll!= null) {
                BigDecimal sourceNettorenditeSoll;
                sourceNettorenditeSoll = this.getNettorenditeSoll();
                BigDecimal copyNettorenditeSoll = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nettorenditeSoll", sourceNettorenditeSoll), sourceNettorenditeSoll));
                copy.setNettorenditeSoll(copyNettorenditeSoll);
            } else {
                copy.nettorenditeSoll = null;
            }
            if (this.nettorenditeIst!= null) {
                BigDecimal sourceNettorenditeIst;
                sourceNettorenditeIst = this.getNettorenditeIst();
                BigDecimal copyNettorenditeIst = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nettorenditeIst", sourceNettorenditeIst), sourceNettorenditeIst));
                copy.setNettorenditeIst(copyNettorenditeIst);
            } else {
                copy.nettorenditeIst = null;
            }
            if (this.mieteinnahmenIst!= null) {
                MieteinnahmenIst sourceMieteinnahmenIst;
                sourceMieteinnahmenIst = this.getMieteinnahmenIst();
                MieteinnahmenIst copyMieteinnahmenIst = ((MieteinnahmenIst) strategy.copy(LocatorUtils.property(locator, "mieteinnahmenIst", sourceMieteinnahmenIst), sourceMieteinnahmenIst));
                copy.setMieteinnahmenIst(copyMieteinnahmenIst);
            } else {
                copy.mieteinnahmenIst = null;
            }
            if (this.mieteinnahmenSoll!= null) {
                MieteinnahmenSoll sourceMieteinnahmenSoll;
                sourceMieteinnahmenSoll = this.getMieteinnahmenSoll();
                MieteinnahmenSoll copyMieteinnahmenSoll = ((MieteinnahmenSoll) strategy.copy(LocatorUtils.property(locator, "mieteinnahmenSoll", sourceMieteinnahmenSoll), sourceMieteinnahmenSoll));
                copy.setMieteinnahmenSoll(copyMieteinnahmenSoll);
            } else {
                copy.mieteinnahmenSoll = null;
            }
            if (this.erschliessungskosten!= null) {
                BigDecimal sourceErschliessungskosten;
                sourceErschliessungskosten = this.getErschliessungskosten();
                BigDecimal copyErschliessungskosten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "erschliessungskosten", sourceErschliessungskosten), sourceErschliessungskosten));
                copy.setErschliessungskosten(copyErschliessungskosten);
            } else {
                copy.erschliessungskosten = null;
            }
            if (this.kaution!= null) {
                BigDecimal sourceKaution;
                sourceKaution = this.getKaution();
                BigDecimal copyKaution = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaution", sourceKaution), sourceKaution));
                copy.setKaution(copyKaution);
            } else {
                copy.kaution = null;
            }
            if (this.kautionText!= null) {
                String sourceKautionText;
                sourceKautionText = this.getKautionText();
                String copyKautionText = ((String) strategy.copy(LocatorUtils.property(locator, "kautionText", sourceKautionText), sourceKautionText));
                copy.setKautionText(copyKautionText);
            } else {
                copy.kautionText = null;
            }
            if (this.geschaeftsguthaben!= null) {
                BigDecimal sourceGeschaeftsguthaben;
                sourceGeschaeftsguthaben = this.getGeschaeftsguthaben();
                BigDecimal copyGeschaeftsguthaben = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "geschaeftsguthaben", sourceGeschaeftsguthaben), sourceGeschaeftsguthaben));
                copy.setGeschaeftsguthaben(copyGeschaeftsguthaben);
            } else {
                copy.geschaeftsguthaben = null;
            }
            if (this.stpCarport!= null) {
                Stellplatz sourceStpCarport;
                sourceStpCarport = this.getStpCarport();
                Stellplatz copyStpCarport = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpCarport", sourceStpCarport), sourceStpCarport));
                copy.setStpCarport(copyStpCarport);
            } else {
                copy.stpCarport = null;
            }
            if (this.stpDuplex!= null) {
                Stellplatz sourceStpDuplex;
                sourceStpDuplex = this.getStpDuplex();
                Stellplatz copyStpDuplex = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpDuplex", sourceStpDuplex), sourceStpDuplex));
                copy.setStpDuplex(copyStpDuplex);
            } else {
                copy.stpDuplex = null;
            }
            if (this.stpFreiplatz!= null) {
                Stellplatz sourceStpFreiplatz;
                sourceStpFreiplatz = this.getStpFreiplatz();
                Stellplatz copyStpFreiplatz = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpFreiplatz", sourceStpFreiplatz), sourceStpFreiplatz));
                copy.setStpFreiplatz(copyStpFreiplatz);
            } else {
                copy.stpFreiplatz = null;
            }
            if (this.stpGarage!= null) {
                Stellplatz sourceStpGarage;
                sourceStpGarage = this.getStpGarage();
                Stellplatz copyStpGarage = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpGarage", sourceStpGarage), sourceStpGarage));
                copy.setStpGarage(copyStpGarage);
            } else {
                copy.stpGarage = null;
            }
            if (this.stpParkhaus!= null) {
                Stellplatz sourceStpParkhaus;
                sourceStpParkhaus = this.getStpParkhaus();
                Stellplatz copyStpParkhaus = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpParkhaus", sourceStpParkhaus), sourceStpParkhaus));
                copy.setStpParkhaus(copyStpParkhaus);
            } else {
                copy.stpParkhaus = null;
            }
            if (this.stpTiefgarage!= null) {
                Stellplatz sourceStpTiefgarage;
                sourceStpTiefgarage = this.getStpTiefgarage();
                Stellplatz copyStpTiefgarage = ((Stellplatz) strategy.copy(LocatorUtils.property(locator, "stpTiefgarage", sourceStpTiefgarage), sourceStpTiefgarage));
                copy.setStpTiefgarage(copyStpTiefgarage);
            } else {
                copy.stpTiefgarage = null;
            }
            if ((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty())) {
                List<StpSonstige> sourceStpSonstige;
                sourceStpSonstige = (((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty()))?this.getStpSonstige():null);
                @SuppressWarnings("unchecked")
                List<StpSonstige> copyStpSonstige = ((List<StpSonstige> ) strategy.copy(LocatorUtils.property(locator, "stpSonstige", sourceStpSonstige), sourceStpSonstige));
                copy.stpSonstige = null;
                if (copyStpSonstige!= null) {
                    List<StpSonstige> uniqueStpSonstigel = copy.getStpSonstige();
                    uniqueStpSonstigel.addAll(copyStpSonstige);
                }
            } else {
                copy.stpSonstige = null;
            }
            if (this.richtpreis!= null) {
                BigDecimal sourceRichtpreis;
                sourceRichtpreis = this.getRichtpreis();
                BigDecimal copyRichtpreis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "richtpreis", sourceRichtpreis), sourceRichtpreis));
                copy.setRichtpreis(copyRichtpreis);
            } else {
                copy.richtpreis = null;
            }
            if (this.richtpreisprom2 != null) {
                BigDecimal sourceRichtpreisprom2;
                sourceRichtpreisprom2 = this.getRichtpreisprom2();
                BigDecimal copyRichtpreisprom2 = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "richtpreisprom2", sourceRichtpreisprom2), sourceRichtpreisprom2));
                copy.setRichtpreisprom2(copyRichtpreisprom2);
            } else {
                copy.richtpreisprom2 = null;
            }
            if ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())) {
                List<UserDefinedSimplefield> sourceUserDefinedSimplefield;
                sourceUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedSimplefield> copyUserDefinedSimplefield = ((List<UserDefinedSimplefield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedSimplefield", sourceUserDefinedSimplefield), sourceUserDefinedSimplefield));
                copy.userDefinedSimplefield = null;
                if (copyUserDefinedSimplefield!= null) {
                    List<UserDefinedSimplefield> uniqueUserDefinedSimplefieldl = copy.getUserDefinedSimplefield();
                    uniqueUserDefinedSimplefieldl.addAll(copyUserDefinedSimplefield);
                }
            } else {
                copy.userDefinedSimplefield = null;
            }
            if ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())) {
                List<UserDefinedAnyfield> sourceUserDefinedAnyfield;
                sourceUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedAnyfield> copyUserDefinedAnyfield = ((List<UserDefinedAnyfield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedAnyfield", sourceUserDefinedAnyfield), sourceUserDefinedAnyfield));
                copy.userDefinedAnyfield = null;
                if (copyUserDefinedAnyfield!= null) {
                    List<UserDefinedAnyfield> uniqueUserDefinedAnyfieldl = copy.getUserDefinedAnyfield();
                    uniqueUserDefinedAnyfieldl.addAll(copyUserDefinedAnyfield);
                }
            } else {
                copy.userDefinedAnyfield = null;
            }
            if ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())) {
                List<UserDefinedExtend> sourceUserDefinedExtend;
                sourceUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedExtend> copyUserDefinedExtend = ((List<UserDefinedExtend> ) strategy.copy(LocatorUtils.property(locator, "userDefinedExtend", sourceUserDefinedExtend), sourceUserDefinedExtend));
                copy.userDefinedExtend = null;
                if (copyUserDefinedExtend!= null) {
                    List<UserDefinedExtend> uniqueUserDefinedExtendl = copy.getUserDefinedExtend();
                    uniqueUserDefinedExtendl.addAll(copyUserDefinedExtend);
                }
            } else {
                copy.userDefinedExtend = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Preise();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Preise)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Preise that = ((Preise) object);
        {
            Kaufpreis lhsKaufpreis;
            lhsKaufpreis = this.getKaufpreis();
            Kaufpreis rhsKaufpreis;
            rhsKaufpreis = that.getKaufpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreis", lhsKaufpreis), LocatorUtils.property(thatLocator, "kaufpreis", rhsKaufpreis), lhsKaufpreis, rhsKaufpreis)) {
                return false;
            }
        }
        {
            Kaufpreisnetto lhsKaufpreisnetto;
            lhsKaufpreisnetto = this.getKaufpreisnetto();
            Kaufpreisnetto rhsKaufpreisnetto;
            rhsKaufpreisnetto = that.getKaufpreisnetto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreisnetto", lhsKaufpreisnetto), LocatorUtils.property(thatLocator, "kaufpreisnetto", rhsKaufpreisnetto), lhsKaufpreisnetto, rhsKaufpreisnetto)) {
                return false;
            }
        }
        {
            BigDecimal lhsKaufpreisbrutto;
            lhsKaufpreisbrutto = this.getKaufpreisbrutto();
            BigDecimal rhsKaufpreisbrutto;
            rhsKaufpreisbrutto = that.getKaufpreisbrutto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreisbrutto", lhsKaufpreisbrutto), LocatorUtils.property(thatLocator, "kaufpreisbrutto", rhsKaufpreisbrutto), lhsKaufpreisbrutto, rhsKaufpreisbrutto)) {
                return false;
            }
        }
        {
            BigDecimal lhsNettokaltmiete;
            lhsNettokaltmiete = this.getNettokaltmiete();
            BigDecimal rhsNettokaltmiete;
            rhsNettokaltmiete = that.getNettokaltmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nettokaltmiete", lhsNettokaltmiete), LocatorUtils.property(thatLocator, "nettokaltmiete", rhsNettokaltmiete), lhsNettokaltmiete, rhsNettokaltmiete)) {
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
            BigDecimal lhsWarmmiete;
            lhsWarmmiete = this.getWarmmiete();
            BigDecimal rhsWarmmiete;
            rhsWarmmiete = that.getWarmmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warmmiete", lhsWarmmiete), LocatorUtils.property(thatLocator, "warmmiete", rhsWarmmiete), lhsWarmmiete, rhsWarmmiete)) {
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
            Boolean lhsHeizkostenEnthalten;
            lhsHeizkostenEnthalten = this.isHeizkostenEnthalten();
            Boolean rhsHeizkostenEnthalten;
            rhsHeizkostenEnthalten = that.isHeizkostenEnthalten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizkostenEnthalten", lhsHeizkostenEnthalten), LocatorUtils.property(thatLocator, "heizkostenEnthalten", rhsHeizkostenEnthalten), lhsHeizkostenEnthalten, rhsHeizkostenEnthalten)) {
                return false;
            }
        }
        {
            BigDecimal lhsHeizkosten;
            lhsHeizkosten = this.getHeizkosten();
            BigDecimal rhsHeizkosten;
            rhsHeizkosten = that.getHeizkosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizkosten", lhsHeizkosten), LocatorUtils.property(thatLocator, "heizkosten", rhsHeizkosten), lhsHeizkosten, rhsHeizkosten)) {
                return false;
            }
        }
        {
            Boolean lhsZzgMehrwertsteuer;
            lhsZzgMehrwertsteuer = this.isZzgMehrwertsteuer();
            Boolean rhsZzgMehrwertsteuer;
            rhsZzgMehrwertsteuer = that.isZzgMehrwertsteuer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zzgMehrwertsteuer", lhsZzgMehrwertsteuer), LocatorUtils.property(thatLocator, "zzgMehrwertsteuer", rhsZzgMehrwertsteuer), lhsZzgMehrwertsteuer, rhsZzgMehrwertsteuer)) {
                return false;
            }
        }
        {
            BigDecimal lhsMietzuschlaege;
            lhsMietzuschlaege = this.getMietzuschlaege();
            BigDecimal rhsMietzuschlaege;
            rhsMietzuschlaege = that.getMietzuschlaege();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietzuschlaege", lhsMietzuschlaege), LocatorUtils.property(thatLocator, "mietzuschlaege", rhsMietzuschlaege), lhsMietzuschlaege, rhsMietzuschlaege)) {
                return false;
            }
        }
        {
            Hauptmietzinsnetto lhsHauptmietzinsnetto;
            lhsHauptmietzinsnetto = this.getHauptmietzinsnetto();
            Hauptmietzinsnetto rhsHauptmietzinsnetto;
            rhsHauptmietzinsnetto = that.getHauptmietzinsnetto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hauptmietzinsnetto", lhsHauptmietzinsnetto), LocatorUtils.property(thatLocator, "hauptmietzinsnetto", rhsHauptmietzinsnetto), lhsHauptmietzinsnetto, rhsHauptmietzinsnetto)) {
                return false;
            }
        }
        {
            BigDecimal lhsPauschalmiete;
            lhsPauschalmiete = this.getPauschalmiete();
            BigDecimal rhsPauschalmiete;
            rhsPauschalmiete = that.getPauschalmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pauschalmiete", lhsPauschalmiete), LocatorUtils.property(thatLocator, "pauschalmiete", rhsPauschalmiete), lhsPauschalmiete, rhsPauschalmiete)) {
                return false;
            }
        }
        {
            Betriebskostennetto lhsBetriebskostennetto;
            lhsBetriebskostennetto = this.getBetriebskostennetto();
            Betriebskostennetto rhsBetriebskostennetto;
            rhsBetriebskostennetto = that.getBetriebskostennetto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betriebskostennetto", lhsBetriebskostennetto), LocatorUtils.property(thatLocator, "betriebskostennetto", rhsBetriebskostennetto), lhsBetriebskostennetto, rhsBetriebskostennetto)) {
                return false;
            }
        }
        {
            Evbnetto lhsEvbnetto;
            lhsEvbnetto = this.getEvbnetto();
            Evbnetto rhsEvbnetto;
            rhsEvbnetto = that.getEvbnetto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evbnetto", lhsEvbnetto), LocatorUtils.property(thatLocator, "evbnetto", rhsEvbnetto), lhsEvbnetto, rhsEvbnetto)) {
                return false;
            }
        }
        {
            Gesamtmietenetto lhsGesamtmietenetto;
            lhsGesamtmietenetto = this.getGesamtmietenetto();
            Gesamtmietenetto rhsGesamtmietenetto;
            rhsGesamtmietenetto = that.getGesamtmietenetto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtmietenetto", lhsGesamtmietenetto), LocatorUtils.property(thatLocator, "gesamtmietenetto", rhsGesamtmietenetto), lhsGesamtmietenetto, rhsGesamtmietenetto)) {
                return false;
            }
        }
        {
            BigDecimal lhsGesamtmietebrutto;
            lhsGesamtmietebrutto = this.getGesamtmietebrutto();
            BigDecimal rhsGesamtmietebrutto;
            rhsGesamtmietebrutto = that.getGesamtmietebrutto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtmietebrutto", lhsGesamtmietebrutto), LocatorUtils.property(thatLocator, "gesamtmietebrutto", rhsGesamtmietebrutto), lhsGesamtmietebrutto, rhsGesamtmietebrutto)) {
                return false;
            }
        }
        {
            Gesamtbelastungnetto lhsGesamtbelastungnetto;
            lhsGesamtbelastungnetto = this.getGesamtbelastungnetto();
            Gesamtbelastungnetto rhsGesamtbelastungnetto;
            rhsGesamtbelastungnetto = that.getGesamtbelastungnetto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtbelastungnetto", lhsGesamtbelastungnetto), LocatorUtils.property(thatLocator, "gesamtbelastungnetto", rhsGesamtbelastungnetto), lhsGesamtbelastungnetto, rhsGesamtbelastungnetto)) {
                return false;
            }
        }
        {
            BigDecimal lhsGesamtbelastungbrutto;
            lhsGesamtbelastungbrutto = this.getGesamtbelastungbrutto();
            BigDecimal rhsGesamtbelastungbrutto;
            rhsGesamtbelastungbrutto = that.getGesamtbelastungbrutto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtbelastungbrutto", lhsGesamtbelastungbrutto), LocatorUtils.property(thatLocator, "gesamtbelastungbrutto", rhsGesamtbelastungbrutto), lhsGesamtbelastungbrutto, rhsGesamtbelastungbrutto)) {
                return false;
            }
        }
        {
            Gesamtkostenprom2Von lhsGesamtkostenprom2Von;
            lhsGesamtkostenprom2Von = this.getGesamtkostenprom2Von();
            Gesamtkostenprom2Von rhsGesamtkostenprom2Von;
            rhsGesamtkostenprom2Von = that.getGesamtkostenprom2Von();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtkostenprom2Von", lhsGesamtkostenprom2Von), LocatorUtils.property(thatLocator, "gesamtkostenprom2Von", rhsGesamtkostenprom2Von), lhsGesamtkostenprom2Von, rhsGesamtkostenprom2Von)) {
                return false;
            }
        }
        {
            Heizkostennetto lhsHeizkostennetto;
            lhsHeizkostennetto = this.getHeizkostennetto();
            Heizkostennetto rhsHeizkostennetto;
            rhsHeizkostennetto = that.getHeizkostennetto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heizkostennetto", lhsHeizkostennetto), LocatorUtils.property(thatLocator, "heizkostennetto", rhsHeizkostennetto), lhsHeizkostennetto, rhsHeizkostennetto)) {
                return false;
            }
        }
        {
            Monatlichekostennetto lhsMonatlichekostennetto;
            lhsMonatlichekostennetto = this.getMonatlichekostennetto();
            Monatlichekostennetto rhsMonatlichekostennetto;
            rhsMonatlichekostennetto = that.getMonatlichekostennetto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monatlichekostennetto", lhsMonatlichekostennetto), LocatorUtils.property(thatLocator, "monatlichekostennetto", rhsMonatlichekostennetto), lhsMonatlichekostennetto, rhsMonatlichekostennetto)) {
                return false;
            }
        }
        {
            BigDecimal lhsMonatlichekostenbrutto;
            lhsMonatlichekostenbrutto = this.getMonatlichekostenbrutto();
            BigDecimal rhsMonatlichekostenbrutto;
            rhsMonatlichekostenbrutto = that.getMonatlichekostenbrutto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monatlichekostenbrutto", lhsMonatlichekostenbrutto), LocatorUtils.property(thatLocator, "monatlichekostenbrutto", rhsMonatlichekostenbrutto), lhsMonatlichekostenbrutto, rhsMonatlichekostenbrutto)) {
                return false;
            }
        }
        {
            Nebenkostenprom2Von lhsNebenkostenprom2Von;
            lhsNebenkostenprom2Von = this.getNebenkostenprom2Von();
            Nebenkostenprom2Von rhsNebenkostenprom2Von;
            rhsNebenkostenprom2Von = that.getNebenkostenprom2Von();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nebenkostenprom2Von", lhsNebenkostenprom2Von), LocatorUtils.property(thatLocator, "nebenkostenprom2Von", rhsNebenkostenprom2Von), lhsNebenkostenprom2Von, rhsNebenkostenprom2Von)) {
                return false;
            }
        }
        {
            Ruecklagenetto lhsRuecklagenetto;
            lhsRuecklagenetto = this.getRuecklagenetto();
            Ruecklagenetto rhsRuecklagenetto;
            rhsRuecklagenetto = that.getRuecklagenetto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ruecklagenetto", lhsRuecklagenetto), LocatorUtils.property(thatLocator, "ruecklagenetto", rhsRuecklagenetto), lhsRuecklagenetto, rhsRuecklagenetto)) {
                return false;
            }
        }
        {
            Sonstigekostennetto lhsSonstigekostennetto;
            lhsSonstigekostennetto = this.getSonstigekostennetto();
            Sonstigekostennetto rhsSonstigekostennetto;
            rhsSonstigekostennetto = that.getSonstigekostennetto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstigekostennetto", lhsSonstigekostennetto), LocatorUtils.property(thatLocator, "sonstigekostennetto", rhsSonstigekostennetto), lhsSonstigekostennetto, rhsSonstigekostennetto)) {
                return false;
            }
        }
        {
            Sonstigemietenetto lhsSonstigemietenetto;
            lhsSonstigemietenetto = this.getSonstigemietenetto();
            Sonstigemietenetto rhsSonstigemietenetto;
            rhsSonstigemietenetto = that.getSonstigemietenetto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstigemietenetto", lhsSonstigemietenetto), LocatorUtils.property(thatLocator, "sonstigemietenetto", rhsSonstigemietenetto), lhsSonstigemietenetto, rhsSonstigemietenetto)) {
                return false;
            }
        }
        {
            Summemietenetto lhsSummemietenetto;
            lhsSummemietenetto = this.getSummemietenetto();
            Summemietenetto rhsSummemietenetto;
            rhsSummemietenetto = that.getSummemietenetto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "summemietenetto", lhsSummemietenetto), LocatorUtils.property(thatLocator, "summemietenetto", rhsSummemietenetto), lhsSummemietenetto, rhsSummemietenetto)) {
                return false;
            }
        }
        {
            Nettomieteprom2Von lhsNettomieteprom2Von;
            lhsNettomieteprom2Von = this.getNettomieteprom2Von();
            Nettomieteprom2Von rhsNettomieteprom2Von;
            rhsNettomieteprom2Von = that.getNettomieteprom2Von();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nettomieteprom2Von", lhsNettomieteprom2Von), LocatorUtils.property(thatLocator, "nettomieteprom2Von", rhsNettomieteprom2Von), lhsNettomieteprom2Von, rhsNettomieteprom2Von)) {
                return false;
            }
        }
        {
            BigDecimal lhsPacht;
            lhsPacht = this.getPacht();
            BigDecimal rhsPacht;
            rhsPacht = that.getPacht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pacht", lhsPacht), LocatorUtils.property(thatLocator, "pacht", rhsPacht), lhsPacht, rhsPacht)) {
                return false;
            }
        }
        {
            BigDecimal lhsErbpacht;
            lhsErbpacht = this.getErbpacht();
            BigDecimal rhsErbpacht;
            rhsErbpacht = that.getErbpacht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erbpacht", lhsErbpacht), LocatorUtils.property(thatLocator, "erbpacht", rhsErbpacht), lhsErbpacht, rhsErbpacht)) {
                return false;
            }
        }
        {
            BigDecimal lhsHausgeld;
            lhsHausgeld = this.getHausgeld();
            BigDecimal rhsHausgeld;
            rhsHausgeld = that.getHausgeld();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hausgeld", lhsHausgeld), LocatorUtils.property(thatLocator, "hausgeld", rhsHausgeld), lhsHausgeld, rhsHausgeld)) {
                return false;
            }
        }
        {
            BigDecimal lhsAbstand;
            lhsAbstand = this.getAbstand();
            BigDecimal rhsAbstand;
            rhsAbstand = that.getAbstand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abstand", lhsAbstand), LocatorUtils.property(thatLocator, "abstand", rhsAbstand), lhsAbstand, rhsAbstand)) {
                return false;
            }
        }
        {
            Calendar lhsPreisZeitraumVon;
            lhsPreisZeitraumVon = this.getPreisZeitraumVon();
            Calendar rhsPreisZeitraumVon;
            rhsPreisZeitraumVon = that.getPreisZeitraumVon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisZeitraumVon", lhsPreisZeitraumVon), LocatorUtils.property(thatLocator, "preisZeitraumVon", rhsPreisZeitraumVon), lhsPreisZeitraumVon, rhsPreisZeitraumVon)) {
                return false;
            }
        }
        {
            Calendar lhsPreisZeitraumBis;
            lhsPreisZeitraumBis = this.getPreisZeitraumBis();
            Calendar rhsPreisZeitraumBis;
            rhsPreisZeitraumBis = that.getPreisZeitraumBis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisZeitraumBis", lhsPreisZeitraumBis), LocatorUtils.property(thatLocator, "preisZeitraumBis", rhsPreisZeitraumBis), lhsPreisZeitraumBis, rhsPreisZeitraumBis)) {
                return false;
            }
        }
        {
            PreisZeiteinheit lhsPreisZeiteinheit;
            lhsPreisZeiteinheit = this.getPreisZeiteinheit();
            PreisZeiteinheit rhsPreisZeiteinheit;
            rhsPreisZeiteinheit = that.getPreisZeiteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisZeiteinheit", lhsPreisZeiteinheit), LocatorUtils.property(thatLocator, "preisZeiteinheit", rhsPreisZeiteinheit), lhsPreisZeiteinheit, rhsPreisZeiteinheit)) {
                return false;
            }
        }
        {
            BigDecimal lhsMietpreisProQm;
            lhsMietpreisProQm = this.getMietpreisProQm();
            BigDecimal rhsMietpreisProQm;
            rhsMietpreisProQm = that.getMietpreisProQm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietpreisProQm", lhsMietpreisProQm), LocatorUtils.property(thatLocator, "mietpreisProQm", rhsMietpreisProQm), lhsMietpreisProQm, rhsMietpreisProQm)) {
                return false;
            }
        }
        {
            BigDecimal lhsKaufpreisProQm;
            lhsKaufpreisProQm = this.getKaufpreisProQm();
            BigDecimal rhsKaufpreisProQm;
            rhsKaufpreisProQm = that.getKaufpreisProQm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreisProQm", lhsKaufpreisProQm), LocatorUtils.property(thatLocator, "kaufpreisProQm", rhsKaufpreisProQm), lhsKaufpreisProQm, rhsKaufpreisProQm)) {
                return false;
            }
        }
        {
            Boolean lhsProvisionspflichtig;
            lhsProvisionspflichtig = this.isProvisionspflichtig();
            Boolean rhsProvisionspflichtig;
            rhsProvisionspflichtig = that.isProvisionspflichtig();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "provisionspflichtig", lhsProvisionspflichtig), LocatorUtils.property(thatLocator, "provisionspflichtig", rhsProvisionspflichtig), lhsProvisionspflichtig, rhsProvisionspflichtig)) {
                return false;
            }
        }
        {
            ProvisionTeilen lhsProvisionTeilen;
            lhsProvisionTeilen = this.getProvisionTeilen();
            ProvisionTeilen rhsProvisionTeilen;
            rhsProvisionTeilen = that.getProvisionTeilen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "provisionTeilen", lhsProvisionTeilen), LocatorUtils.property(thatLocator, "provisionTeilen", rhsProvisionTeilen), lhsProvisionTeilen, rhsProvisionTeilen)) {
                return false;
            }
        }
        {
            InnenCourtage lhsInnenCourtage;
            lhsInnenCourtage = this.getInnenCourtage();
            InnenCourtage rhsInnenCourtage;
            rhsInnenCourtage = that.getInnenCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "innenCourtage", lhsInnenCourtage), LocatorUtils.property(thatLocator, "innenCourtage", rhsInnenCourtage), lhsInnenCourtage, rhsInnenCourtage)) {
                return false;
            }
        }
        {
            AussenCourtage lhsAussenCourtage;
            lhsAussenCourtage = this.getAussenCourtage();
            AussenCourtage rhsAussenCourtage;
            rhsAussenCourtage = that.getAussenCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aussenCourtage", lhsAussenCourtage), LocatorUtils.property(thatLocator, "aussenCourtage", rhsAussenCourtage), lhsAussenCourtage, rhsAussenCourtage)) {
                return false;
            }
        }
        {
            String lhsCourtageHinweis;
            lhsCourtageHinweis = this.getCourtageHinweis();
            String rhsCourtageHinweis;
            rhsCourtageHinweis = that.getCourtageHinweis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtageHinweis", lhsCourtageHinweis), LocatorUtils.property(thatLocator, "courtageHinweis", rhsCourtageHinweis), lhsCourtageHinweis, rhsCourtageHinweis)) {
                return false;
            }
        }
        {
            Provisionnetto lhsProvisionnetto;
            lhsProvisionnetto = this.getProvisionnetto();
            Provisionnetto rhsProvisionnetto;
            rhsProvisionnetto = that.getProvisionnetto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "provisionnetto", lhsProvisionnetto), LocatorUtils.property(thatLocator, "provisionnetto", rhsProvisionnetto), lhsProvisionnetto, rhsProvisionnetto)) {
                return false;
            }
        }
        {
            BigDecimal lhsProvisionbrutto;
            lhsProvisionbrutto = this.getProvisionbrutto();
            BigDecimal rhsProvisionbrutto;
            rhsProvisionbrutto = that.getProvisionbrutto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "provisionbrutto", lhsProvisionbrutto), LocatorUtils.property(thatLocator, "provisionbrutto", rhsProvisionbrutto), lhsProvisionbrutto, rhsProvisionbrutto)) {
                return false;
            }
        }
        {
            Waehrung lhsWaehrung;
            lhsWaehrung = this.getWaehrung();
            Waehrung rhsWaehrung;
            rhsWaehrung = that.getWaehrung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waehrung", lhsWaehrung), LocatorUtils.property(thatLocator, "waehrung", rhsWaehrung), lhsWaehrung, rhsWaehrung)) {
                return false;
            }
        }
        {
            BigDecimal lhsMwstSatz;
            lhsMwstSatz = this.getMwstSatz();
            BigDecimal rhsMwstSatz;
            rhsMwstSatz = that.getMwstSatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mwstSatz", lhsMwstSatz), LocatorUtils.property(thatLocator, "mwstSatz", rhsMwstSatz), lhsMwstSatz, rhsMwstSatz)) {
                return false;
            }
        }
        {
            BigDecimal lhsMwstGesamt;
            lhsMwstGesamt = this.getMwstGesamt();
            BigDecimal rhsMwstGesamt;
            rhsMwstGesamt = that.getMwstGesamt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mwstGesamt", lhsMwstGesamt), LocatorUtils.property(thatLocator, "mwstGesamt", rhsMwstGesamt), lhsMwstGesamt, rhsMwstGesamt)) {
                return false;
            }
        }
        {
            String lhsFreitextPreis;
            lhsFreitextPreis = this.getFreitextPreis();
            String rhsFreitextPreis;
            rhsFreitextPreis = that.getFreitextPreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freitextPreis", lhsFreitextPreis), LocatorUtils.property(thatLocator, "freitextPreis", rhsFreitextPreis), lhsFreitextPreis, rhsFreitextPreis)) {
                return false;
            }
        }
        {
            String lhsXFache;
            lhsXFache = this.getXFache();
            String rhsXFache;
            rhsXFache = that.getXFache();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xFache", lhsXFache), LocatorUtils.property(thatLocator, "xFache", rhsXFache), lhsXFache, rhsXFache)) {
                return false;
            }
        }
        {
            BigDecimal lhsNettorendite;
            lhsNettorendite = this.getNettorendite();
            BigDecimal rhsNettorendite;
            rhsNettorendite = that.getNettorendite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nettorendite", lhsNettorendite), LocatorUtils.property(thatLocator, "nettorendite", rhsNettorendite), lhsNettorendite, rhsNettorendite)) {
                return false;
            }
        }
        {
            BigDecimal lhsNettorenditeSoll;
            lhsNettorenditeSoll = this.getNettorenditeSoll();
            BigDecimal rhsNettorenditeSoll;
            rhsNettorenditeSoll = that.getNettorenditeSoll();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nettorenditeSoll", lhsNettorenditeSoll), LocatorUtils.property(thatLocator, "nettorenditeSoll", rhsNettorenditeSoll), lhsNettorenditeSoll, rhsNettorenditeSoll)) {
                return false;
            }
        }
        {
            BigDecimal lhsNettorenditeIst;
            lhsNettorenditeIst = this.getNettorenditeIst();
            BigDecimal rhsNettorenditeIst;
            rhsNettorenditeIst = that.getNettorenditeIst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nettorenditeIst", lhsNettorenditeIst), LocatorUtils.property(thatLocator, "nettorenditeIst", rhsNettorenditeIst), lhsNettorenditeIst, rhsNettorenditeIst)) {
                return false;
            }
        }
        {
            MieteinnahmenIst lhsMieteinnahmenIst;
            lhsMieteinnahmenIst = this.getMieteinnahmenIst();
            MieteinnahmenIst rhsMieteinnahmenIst;
            rhsMieteinnahmenIst = that.getMieteinnahmenIst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mieteinnahmenIst", lhsMieteinnahmenIst), LocatorUtils.property(thatLocator, "mieteinnahmenIst", rhsMieteinnahmenIst), lhsMieteinnahmenIst, rhsMieteinnahmenIst)) {
                return false;
            }
        }
        {
            MieteinnahmenSoll lhsMieteinnahmenSoll;
            lhsMieteinnahmenSoll = this.getMieteinnahmenSoll();
            MieteinnahmenSoll rhsMieteinnahmenSoll;
            rhsMieteinnahmenSoll = that.getMieteinnahmenSoll();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mieteinnahmenSoll", lhsMieteinnahmenSoll), LocatorUtils.property(thatLocator, "mieteinnahmenSoll", rhsMieteinnahmenSoll), lhsMieteinnahmenSoll, rhsMieteinnahmenSoll)) {
                return false;
            }
        }
        {
            BigDecimal lhsErschliessungskosten;
            lhsErschliessungskosten = this.getErschliessungskosten();
            BigDecimal rhsErschliessungskosten;
            rhsErschliessungskosten = that.getErschliessungskosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erschliessungskosten", lhsErschliessungskosten), LocatorUtils.property(thatLocator, "erschliessungskosten", rhsErschliessungskosten), lhsErschliessungskosten, rhsErschliessungskosten)) {
                return false;
            }
        }
        {
            BigDecimal lhsKaution;
            lhsKaution = this.getKaution();
            BigDecimal rhsKaution;
            rhsKaution = that.getKaution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaution", lhsKaution), LocatorUtils.property(thatLocator, "kaution", rhsKaution), lhsKaution, rhsKaution)) {
                return false;
            }
        }
        {
            String lhsKautionText;
            lhsKautionText = this.getKautionText();
            String rhsKautionText;
            rhsKautionText = that.getKautionText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kautionText", lhsKautionText), LocatorUtils.property(thatLocator, "kautionText", rhsKautionText), lhsKautionText, rhsKautionText)) {
                return false;
            }
        }
        {
            BigDecimal lhsGeschaeftsguthaben;
            lhsGeschaeftsguthaben = this.getGeschaeftsguthaben();
            BigDecimal rhsGeschaeftsguthaben;
            rhsGeschaeftsguthaben = that.getGeschaeftsguthaben();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geschaeftsguthaben", lhsGeschaeftsguthaben), LocatorUtils.property(thatLocator, "geschaeftsguthaben", rhsGeschaeftsguthaben), lhsGeschaeftsguthaben, rhsGeschaeftsguthaben)) {
                return false;
            }
        }
        {
            Stellplatz lhsStpCarport;
            lhsStpCarport = this.getStpCarport();
            Stellplatz rhsStpCarport;
            rhsStpCarport = that.getStpCarport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpCarport", lhsStpCarport), LocatorUtils.property(thatLocator, "stpCarport", rhsStpCarport), lhsStpCarport, rhsStpCarport)) {
                return false;
            }
        }
        {
            Stellplatz lhsStpDuplex;
            lhsStpDuplex = this.getStpDuplex();
            Stellplatz rhsStpDuplex;
            rhsStpDuplex = that.getStpDuplex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpDuplex", lhsStpDuplex), LocatorUtils.property(thatLocator, "stpDuplex", rhsStpDuplex), lhsStpDuplex, rhsStpDuplex)) {
                return false;
            }
        }
        {
            Stellplatz lhsStpFreiplatz;
            lhsStpFreiplatz = this.getStpFreiplatz();
            Stellplatz rhsStpFreiplatz;
            rhsStpFreiplatz = that.getStpFreiplatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpFreiplatz", lhsStpFreiplatz), LocatorUtils.property(thatLocator, "stpFreiplatz", rhsStpFreiplatz), lhsStpFreiplatz, rhsStpFreiplatz)) {
                return false;
            }
        }
        {
            Stellplatz lhsStpGarage;
            lhsStpGarage = this.getStpGarage();
            Stellplatz rhsStpGarage;
            rhsStpGarage = that.getStpGarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpGarage", lhsStpGarage), LocatorUtils.property(thatLocator, "stpGarage", rhsStpGarage), lhsStpGarage, rhsStpGarage)) {
                return false;
            }
        }
        {
            Stellplatz lhsStpParkhaus;
            lhsStpParkhaus = this.getStpParkhaus();
            Stellplatz rhsStpParkhaus;
            rhsStpParkhaus = that.getStpParkhaus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpParkhaus", lhsStpParkhaus), LocatorUtils.property(thatLocator, "stpParkhaus", rhsStpParkhaus), lhsStpParkhaus, rhsStpParkhaus)) {
                return false;
            }
        }
        {
            Stellplatz lhsStpTiefgarage;
            lhsStpTiefgarage = this.getStpTiefgarage();
            Stellplatz rhsStpTiefgarage;
            rhsStpTiefgarage = that.getStpTiefgarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpTiefgarage", lhsStpTiefgarage), LocatorUtils.property(thatLocator, "stpTiefgarage", rhsStpTiefgarage), lhsStpTiefgarage, rhsStpTiefgarage)) {
                return false;
            }
        }
        {
            List<StpSonstige> lhsStpSonstige;
            lhsStpSonstige = (((this.stpSonstige!= null)&&(!this.stpSonstige.isEmpty()))?this.getStpSonstige():null);
            List<StpSonstige> rhsStpSonstige;
            rhsStpSonstige = (((that.stpSonstige!= null)&&(!that.stpSonstige.isEmpty()))?that.getStpSonstige():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stpSonstige", lhsStpSonstige), LocatorUtils.property(thatLocator, "stpSonstige", rhsStpSonstige), lhsStpSonstige, rhsStpSonstige)) {
                return false;
            }
        }
        {
            BigDecimal lhsRichtpreis;
            lhsRichtpreis = this.getRichtpreis();
            BigDecimal rhsRichtpreis;
            rhsRichtpreis = that.getRichtpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "richtpreis", lhsRichtpreis), LocatorUtils.property(thatLocator, "richtpreis", rhsRichtpreis), lhsRichtpreis, rhsRichtpreis)) {
                return false;
            }
        }
        {
            BigDecimal lhsRichtpreisprom2;
            lhsRichtpreisprom2 = this.getRichtpreisprom2();
            BigDecimal rhsRichtpreisprom2;
            rhsRichtpreisprom2 = that.getRichtpreisprom2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "richtpreisprom2", lhsRichtpreisprom2), LocatorUtils.property(thatLocator, "richtpreisprom2", rhsRichtpreisprom2), lhsRichtpreisprom2, rhsRichtpreisprom2)) {
                return false;
            }
        }
        {
            List<UserDefinedSimplefield> lhsUserDefinedSimplefield;
            lhsUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            List<UserDefinedSimplefield> rhsUserDefinedSimplefield;
            rhsUserDefinedSimplefield = (((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty()))?that.getUserDefinedSimplefield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedSimplefield", lhsUserDefinedSimplefield), LocatorUtils.property(thatLocator, "userDefinedSimplefield", rhsUserDefinedSimplefield), lhsUserDefinedSimplefield, rhsUserDefinedSimplefield)) {
                return false;
            }
        }
        {
            List<UserDefinedAnyfield> lhsUserDefinedAnyfield;
            lhsUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            List<UserDefinedAnyfield> rhsUserDefinedAnyfield;
            rhsUserDefinedAnyfield = (((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty()))?that.getUserDefinedAnyfield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedAnyfield", lhsUserDefinedAnyfield), LocatorUtils.property(thatLocator, "userDefinedAnyfield", rhsUserDefinedAnyfield), lhsUserDefinedAnyfield, rhsUserDefinedAnyfield)) {
                return false;
            }
        }
        {
            List<UserDefinedExtend> lhsUserDefinedExtend;
            lhsUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            List<UserDefinedExtend> rhsUserDefinedExtend;
            rhsUserDefinedExtend = (((that.userDefinedExtend!= null)&&(!that.userDefinedExtend.isEmpty()))?that.getUserDefinedExtend():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedExtend", lhsUserDefinedExtend), LocatorUtils.property(thatLocator, "userDefinedExtend", rhsUserDefinedExtend), lhsUserDefinedExtend, rhsUserDefinedExtend)) {
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
