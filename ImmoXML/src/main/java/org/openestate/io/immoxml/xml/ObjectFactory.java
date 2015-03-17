
package org.openestate.io.immoxml.xml;

import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.io.immoxml.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TelefonFerienimmobilie_QNAME = new QName("http://www.immoxml.de", "telefon_ferienimmobilie");
    private final static QName _Bundesland_QNAME = new QName("http://www.immoxml.de", "bundesland");
    private final static QName _Freiflaeche_QNAME = new QName("http://www.immoxml.de", "freiflaeche");
    private final static QName _KaufpreisProQm_QNAME = new QName("http://www.immoxml.de", "kaufpreis_pro_qm");
    private final static QName _Hausgeld_QNAME = new QName("http://www.immoxml.de", "hausgeld");
    private final static QName _BalkonTerrasseFlaeche_QNAME = new QName("http://www.immoxml.de", "balkon_terrasse_flaeche");
    private final static QName _Hausnummer_QNAME = new QName("http://www.immoxml.de", "hausnummer");
    private final static QName _AktivBis_QNAME = new QName("http://www.immoxml.de", "aktiv_bis");
    private final static QName _AnzahlBalkonTerrassen_QNAME = new QName("http://www.immoxml.de", "anzahl_balkon_terrassen");
    private final static QName _AnzahlSepWc_QNAME = new QName("http://www.immoxml.de", "anzahl_sep_wc");
    private final static QName _Bueroflaeche_QNAME = new QName("http://www.immoxml.de", "bueroflaeche");
    private final static QName _Gfz_QNAME = new QName("http://www.immoxml.de", "gfz");
    private final static QName _EmailPrivat_QNAME = new QName("http://www.immoxml.de", "email_privat");
    private final static QName _MieteinnahmenIst_QNAME = new QName("http://www.immoxml.de", "mieteinnahmen_ist");
    private final static QName _AnzahlGewerbeeinheiten_QNAME = new QName("http://www.immoxml.de", "anzahl_gewerbeeinheiten");
    private final static QName _AnzahlWohneinheiten_QNAME = new QName("http://www.immoxml.de", "anzahl_wohneinheiten");
    private final static QName _Firma_QNAME = new QName("http://www.immoxml.de", "firma");
    private final static QName _Wohnungsnr_QNAME = new QName("http://www.immoxml.de", "wohnungsnr");
    private final static QName _ZzgMehrwertsteuer_QNAME = new QName("http://www.immoxml.de", "zzg_mehrwertsteuer");
    private final static QName _Plz_QNAME = new QName("http://www.immoxml.de", "plz");
    private final static QName _WeitergabeNegativ_QNAME = new QName("http://www.immoxml.de", "weitergabe_negativ");
    private final static QName _TeilbarAb_QNAME = new QName("http://www.immoxml.de", "teilbar_ab");
    private final static QName _Kamin_QNAME = new QName("http://www.immoxml.de", "kamin");
    private final static QName _WeitergabePositiv_QNAME = new QName("http://www.immoxml.de", "weitergabe_positiv");
    private final static QName _ImmoxmlObid_QNAME = new QName("http://www.immoxml.de", "immoxml_obid");
    private final static QName _Url_QNAME = new QName("http://www.immoxml.de", "url");
    private final static QName _Denkmalgeschuetzt_QNAME = new QName("http://www.immoxml.de", "denkmalgeschuetzt");
    private final static QName _Hebebuehne_QNAME = new QName("http://www.immoxml.de", "hebebuehne");
    private final static QName _Versteigerungstermin_QNAME = new QName("http://www.immoxml.de", "versteigerungstermin");
    private final static QName _Format_QNAME = new QName("http://www.immoxml.de", "format");
    private final static QName _Sauna_QNAME = new QName("http://www.immoxml.de", "sauna");
    private final static QName _Hallenhoehe_QNAME = new QName("http://www.immoxml.de", "hallenhoehe");
    private final static QName _Gartennutzung_QNAME = new QName("http://www.immoxml.de", "gartennutzung");
    private final static QName _Gemarkung_QNAME = new QName("http://www.immoxml.de", "gemarkung");
    private final static QName _AktivVon_QNAME = new QName("http://www.immoxml.de", "aktiv_von");
    private final static QName _Objekttitel_QNAME = new QName("http://www.immoxml.de", "objekttitel");
    private final static QName _Nettokaltmiete_QNAME = new QName("http://www.immoxml.de", "nettokaltmiete");
    private final static QName _Brauereibindung_QNAME = new QName("http://www.immoxml.de", "brauereibindung");
    private final static QName _Zugang_QNAME = new QName("http://www.immoxml.de", "zugang");
    private final static QName _Freitextfeld_QNAME = new QName("http://www.immoxml.de", "freitextfeld");
    private final static QName _Titel_QNAME = new QName("http://www.immoxml.de", "titel");
    private final static QName _AusstattBeschr_QNAME = new QName("http://www.immoxml.de", "ausstatt_beschr");
    private final static QName _RaeumeVeraenderbar_QNAME = new QName("http://www.immoxml.de", "raeume_veraenderbar");
    private final static QName _Laufzeit_QNAME = new QName("http://www.immoxml.de", "laufzeit");
    private final static QName _Flurstueck_QNAME = new QName("http://www.immoxml.de", "flurstueck");
    private final static QName _Mietzuschlaege_QNAME = new QName("http://www.immoxml.de", "mietzuschlaege");
    private final static QName _KennungUrsprung_QNAME = new QName("http://www.immoxml.de", "kennung_ursprung");
    private final static QName _AlsFerien_QNAME = new QName("http://www.immoxml.de", "als_ferien");
    private final static QName _Gruppennummer_QNAME = new QName("http://www.immoxml.de", "gruppennummer");
    private final static QName _Swimmingpool_QNAME = new QName("http://www.immoxml.de", "swimmingpool");
    private final static QName _Verkaufsflaeche_QNAME = new QName("http://www.immoxml.de", "verkaufsflaeche");
    private final static QName _Anbieternr_QNAME = new QName("http://www.immoxml.de", "anbieternr");
    private final static QName _Bmz_QNAME = new QName("http://www.immoxml.de", "bmz");
    private final static QName _DvVerkabelung_QNAME = new QName("http://www.immoxml.de", "dv_verkabelung");
    private final static QName _ObjektadresseFreigeben_QNAME = new QName("http://www.immoxml.de", "objektadresse_freigeben");
    private final static QName _Postfach_QNAME = new QName("http://www.immoxml.de", "postfach");
    private final static QName _RegionalerZusatz_QNAME = new QName("http://www.immoxml.de", "regionaler_zusatz");
    private final static QName _Gartenflaeche_QNAME = new QName("http://www.immoxml.de", "gartenflaeche");
    private final static QName _Barrierefrei_QNAME = new QName("http://www.immoxml.de", "barrierefrei");
    private final static QName _Erbpacht_QNAME = new QName("http://www.immoxml.de", "erbpacht");
    private final static QName _Kran_QNAME = new QName("http://www.immoxml.de", "kran");
    private final static QName _Nebenkosten_QNAME = new QName("http://www.immoxml.de", "nebenkosten");
    private final static QName _Anhanginhalt_QNAME = new QName("http://www.immoxml.de", "anhanginhalt");
    private final static QName _StpTiefgarage_QNAME = new QName("http://www.immoxml.de", "stp_tiefgarage");
    private final static QName _Flur_QNAME = new QName("http://www.immoxml.de", "flur");
    private final static QName _Grundstuecksfront_QNAME = new QName("http://www.immoxml.de", "grundstuecksfront");
    private final static QName _Impressum_QNAME = new QName("http://www.immoxml.de", "impressum");
    private final static QName _Ladenflaeche_QNAME = new QName("http://www.immoxml.de", "ladenflaeche");
    private final static QName _Name_QNAME = new QName("http://www.immoxml.de", "name");
    private final static QName _Stromanschlusswert_QNAME = new QName("http://www.immoxml.de", "stromanschlusswert");
    private final static QName _Sonstflaeche_QNAME = new QName("http://www.immoxml.de", "sonstflaeche");
    private final static QName _StandVom_QNAME = new QName("http://www.immoxml.de", "stand_vom");
    private final static QName _Strasse_QNAME = new QName("http://www.immoxml.de", "strasse");
    private final static QName _SonstigeAngaben_QNAME = new QName("http://www.immoxml.de", "sonstige_angaben");
    private final static QName _StpDuplex_QNAME = new QName("http://www.immoxml.de", "stp_duplex");
    private final static QName _WeitergabeGenerell_QNAME = new QName("http://www.immoxml.de", "weitergabe_generell");
    private final static QName _Abdatum_QNAME = new QName("http://www.immoxml.de", "abdatum");
    private final static QName _TelPrivat_QNAME = new QName("http://www.immoxml.de", "tel_privat");
    private final static QName _EmailZentrale_QNAME = new QName("http://www.immoxml.de", "email_zentrale");
    private final static QName _Grz_QNAME = new QName("http://www.immoxml.de", "grz");
    private final static QName _Lagerflaeche_QNAME = new QName("http://www.immoxml.de", "lagerflaeche");
    private final static QName _Altlasten_QNAME = new QName("http://www.immoxml.de", "altlasten");
    private final static QName _Verwaltungsflaeche_QNAME = new QName("http://www.immoxml.de", "verwaltungsflaeche");
    private final static QName _Erschliessungskosten_QNAME = new QName("http://www.immoxml.de", "erschliessungskosten");
    private final static QName _TelZentrale_QNAME = new QName("http://www.immoxml.de", "tel_zentrale");
    private final static QName _Vorname_QNAME = new QName("http://www.immoxml.de", "vorname");
    private final static QName _ObjektnrExtern_QNAME = new QName("http://www.immoxml.de", "objektnr_extern");
    private final static QName _FensterfrontQm_QNAME = new QName("http://www.immoxml.de", "fensterfront_qm");
    private final static QName _AnzahlZimmer_QNAME = new QName("http://www.immoxml.de", "anzahl_zimmer");
    private final static QName _Anhangtitel_QNAME = new QName("http://www.immoxml.de", "anhangtitel");
    private final static QName _Bgf_QNAME = new QName("http://www.immoxml.de", "bgf");
    private final static QName _MaxPersonen_QNAME = new QName("http://www.immoxml.de", "max_personen");
    private final static QName _StpCarport_QNAME = new QName("http://www.immoxml.de", "stp_carport");
    private final static QName _Etage_QNAME = new QName("http://www.immoxml.de", "etage");
    private final static QName _Kellerflaeche_QNAME = new QName("http://www.immoxml.de", "kellerflaeche");
    private final static QName _AnzahlSchlafzimmer_QNAME = new QName("http://www.immoxml.de", "anzahl_schlafzimmer");
    private final static QName _ObjektnrIntern_QNAME = new QName("http://www.immoxml.de", "objektnr_intern");
    private final static QName _TelHandy_QNAME = new QName("http://www.immoxml.de", "tel_handy");
    private final static QName _Nettorendite_QNAME = new QName("http://www.immoxml.de", "nettorendite");
    private final static QName _AnzahlWohnSchlafzimmer_QNAME = new QName("http://www.immoxml.de", "anzahl_wohn_schlafzimmer");
    private final static QName _Heizkosten_QNAME = new QName("http://www.immoxml.de", "heizkosten");
    private final static QName _Anrede_QNAME = new QName("http://www.immoxml.de", "anrede");
    private final static QName _MwstSatz_QNAME = new QName("http://www.immoxml.de", "mwst_satz");
    private final static QName _Gesamtflaeche_QNAME = new QName("http://www.immoxml.de", "gesamtflaeche");
    private final static QName _Hochhaus_QNAME = new QName("http://www.immoxml.de", "hochhaus");
    private final static QName _Branchen_QNAME = new QName("http://www.immoxml.de", "branchen");
    private final static QName _Klimatisiert_QNAME = new QName("http://www.immoxml.de", "klimatisiert");
    private final static QName _AnredeBrief_QNAME = new QName("http://www.immoxml.de", "anrede_brief");
    private final static QName _StpParkhaus_QNAME = new QName("http://www.immoxml.de", "stp_parkhaus");
    private final static QName _KabelSatTv_QNAME = new QName("http://www.immoxml.de", "kabel_sat_tv");
    private final static QName _Rampe_QNAME = new QName("http://www.immoxml.de", "rampe");
    private final static QName _VerfuegbarAb_QNAME = new QName("http://www.immoxml.de", "verfuegbar_ab");
    private final static QName _MietpreisProQm_QNAME = new QName("http://www.immoxml.de", "mietpreis_pro_qm");
    private final static QName _Vermietet_QNAME = new QName("http://www.immoxml.de", "vermietet");
    private final static QName _PostfOrt_QNAME = new QName("http://www.immoxml.de", "postf_ort");
    private final static QName _Gastroflaeche_QNAME = new QName("http://www.immoxml.de", "gastroflaeche");
    private final static QName _EmailDirekt_QNAME = new QName("http://www.immoxml.de", "email_direkt");
    private final static QName _Baujahr_QNAME = new QName("http://www.immoxml.de", "baujahr");
    private final static QName _BeheizbareFlaeche_QNAME = new QName("http://www.immoxml.de", "beheizbare_flaeche");
    private final static QName _AnzahlTagungsraeume_QNAME = new QName("http://www.immoxml.de", "anzahl_tagungsraeume");
    private final static QName _GewerblicheNutzung_QNAME = new QName("http://www.immoxml.de", "gewerbliche_nutzung");
    private final static QName _Zusatzfeld_QNAME = new QName("http://www.immoxml.de", "zusatzfeld");
    private final static QName _FreitextPreis_QNAME = new QName("http://www.immoxml.de", "freitext_preis");
    private final static QName _Sporteinrichtungen_QNAME = new QName("http://www.immoxml.de", "sporteinrichtungen");
    private final static QName _Nutzflaeche_QNAME = new QName("http://www.immoxml.de", "nutzflaeche");
    private final static QName _Kaufpreis_QNAME = new QName("http://www.immoxml.de", "kaufpreis");
    private final static QName _Bueroteilflaeche_QNAME = new QName("http://www.immoxml.de", "bueroteilflaeche");
    private final static QName _Dachbodenflaeche_QNAME = new QName("http://www.immoxml.de", "dachbodenflaeche");
    private final static QName _Einliegerwohnung_QNAME = new QName("http://www.immoxml.de", "einliegerwohnung");
    private final static QName _Dreizeiler_QNAME = new QName("http://www.immoxml.de", "dreizeiler");
    private final static QName _Wellnessbereich_QNAME = new QName("http://www.immoxml.de", "wellnessbereich");
    private final static QName _Lage_QNAME = new QName("http://www.immoxml.de", "lage");
    private final static QName _PostfPlz_QNAME = new QName("http://www.immoxml.de", "postf_plz");
    private final static QName _Grundstuecksflaeche_QNAME = new QName("http://www.immoxml.de", "grundstuecksflaeche");
    private final static QName _Haustiere_QNAME = new QName("http://www.immoxml.de", "haustiere");
    private final static QName _StpFreiplatz_QNAME = new QName("http://www.immoxml.de", "stp_freiplatz");
    private final static QName _AnzahlBetten_QNAME = new QName("http://www.immoxml.de", "anzahl_betten");
    private final static QName _Gastterrasse_QNAME = new QName("http://www.immoxml.de", "gastterrasse");
    private final static QName _StpGarage_QNAME = new QName("http://www.immoxml.de", "stp_garage");
    private final static QName _KantineCafeteria_QNAME = new QName("http://www.immoxml.de", "kantine_cafeteria");
    private final static QName _WgGeeignet_QNAME = new QName("http://www.immoxml.de", "wg_geeignet");
    private final static QName _Pacht_QNAME = new QName("http://www.immoxml.de", "pacht");
    private final static QName _Pfad_QNAME = new QName("http://www.immoxml.de", "pfad");
    private final static QName _PreisZeitraumBis_QNAME = new QName("http://www.immoxml.de", "preis_zeitraum_bis");
    private final static QName _MieteinnahmenSoll_QNAME = new QName("http://www.immoxml.de", "mieteinnahmen_soll");
    private final static QName _Adressfreigabe_QNAME = new QName("http://www.immoxml.de", "adressfreigabe");
    private final static QName _VermietbareFlaeche_QNAME = new QName("http://www.immoxml.de", "vermietbare_flaeche");
    private final static QName _Rollstuhlgerecht_QNAME = new QName("http://www.immoxml.de", "rollstuhlgerecht");
    private final static QName _PreisZeitraumVon_QNAME = new QName("http://www.immoxml.de", "preis_zeitraum_von");
    private final static QName _Gemeindecode_QNAME = new QName("http://www.immoxml.de", "gemeindecode");
    private final static QName _ImmoxmlAnid_QNAME = new QName("http://www.immoxml.de", "immoxml_anid");
    private final static QName _Teekueche_QNAME = new QName("http://www.immoxml.de", "teekueche");
    private final static QName _Personennummer_QNAME = new QName("http://www.immoxml.de", "personennummer");
    private final static QName _Ort_QNAME = new QName("http://www.immoxml.de", "ort");
    private final static QName _WbsSozialwohnung_QNAME = new QName("http://www.immoxml.de", "wbs_sozialwohnung");
    private final static QName _Abstand_QNAME = new QName("http://www.immoxml.de", "abstand");
    private final static QName _Warmmiete_QNAME = new QName("http://www.immoxml.de", "warmmiete");
    private final static QName _Objektbeschreibung_QNAME = new QName("http://www.immoxml.de", "objektbeschreibung");
    private final static QName _Geschaeftsguthaben_QNAME = new QName("http://www.immoxml.de", "geschaeftsguthaben");
    private final static QName _Kaltmiete_QNAME = new QName("http://www.immoxml.de", "kaltmiete");
    private final static QName _Wohnflaeche_QNAME = new QName("http://www.immoxml.de", "wohnflaeche");
    private final static QName _XFache_QNAME = new QName("http://www.immoxml.de", "x_fache");
    private final static QName _Zulieferung_QNAME = new QName("http://www.immoxml.de", "zulieferung");
    private final static QName _Bisdatum_QNAME = new QName("http://www.immoxml.de", "bisdatum");
    private final static QName _Nichtraucher_QNAME = new QName("http://www.immoxml.de", "nichtraucher");
    private final static QName _Kaution_QNAME = new QName("http://www.immoxml.de", "kaution");
    private final static QName _AnzahlStellplaetze_QNAME = new QName("http://www.immoxml.de", "anzahl_stellplaetze");
    private final static QName _TelDurchw_QNAME = new QName("http://www.immoxml.de", "tel_durchw");
    private final static QName _TelFax_QNAME = new QName("http://www.immoxml.de", "tel_fax");
    private final static QName _PlaetzeGastraum_QNAME = new QName("http://www.immoxml.de", "plaetze_gastraum");
    private final static QName _AnzahlBadezimmer_QNAME = new QName("http://www.immoxml.de", "anzahl_badezimmer");
    private final static QName _WaschTrockenraum_QNAME = new QName("http://www.immoxml.de", "wasch_trockenraum");
    private final static QName _Fensterfront_QNAME = new QName("http://www.immoxml.de", "fensterfront");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.io.immoxml.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Haus }
     * 
     */
    public Haus createHaus() {
        return new Haus();
    }

    /**
     * Create an instance of {@link MinMietdauer }
     * 
     */
    public MinMietdauer createMinMietdauer() {
        return new MinMietdauer();
    }

    /**
     * Create an instance of {@link Anhang }
     * 
     */
    public Anhang createAnhang() {
        return new Anhang();
    }

    /**
     * Create an instance of {@link Ausblick }
     * 
     */
    public Ausblick createAusblick() {
        return new Ausblick();
    }

    /**
     * Create an instance of {@link HallenLagerProd }
     * 
     */
    public HallenLagerProd createHallenLagerProd() {
        return new HallenLagerProd();
    }

    /**
     * Create an instance of {@link Distanzen }
     * 
     */
    public Distanzen createDistanzen() {
        return new Distanzen();
    }

    /**
     * Create an instance of {@link MaxMietdauer }
     * 
     */
    public MaxMietdauer createMaxMietdauer() {
        return new MaxMietdauer();
    }

    /**
     * Create an instance of {@link TelSonstige }
     * 
     */
    public TelSonstige createTelSonstige() {
        return new TelSonstige();
    }

    /**
     * Create an instance of {@link DistanzenSport }
     * 
     */
    public DistanzenSport createDistanzenSport() {
        return new DistanzenSport();
    }

    /**
     * Create an instance of {@link EmailSonstige }
     * 
     */
    public EmailSonstige createEmailSonstige() {
        return new EmailSonstige();
    }

    /**
     * Create an instance of {@link LageGebiet }
     * 
     */
    public LageGebiet createLageGebiet() {
        return new LageGebiet();
    }

    /**
     * Create an instance of {@link Aktion }
     * 
     */
    public Aktion createAktion() {
        return new Aktion();
    }

    /**
     * Create an instance of {@link FreizeitimmobilieGewerblich }
     * 
     */
    public FreizeitimmobilieGewerblich createFreizeitimmobilieGewerblich() {
        return new FreizeitimmobilieGewerblich();
    }

    /**
     * Create an instance of {@link Zimmer }
     * 
     */
    public Zimmer createZimmer() {
        return new Zimmer();
    }

    /**
     * Create an instance of {@link Unterkellert }
     * 
     */
    public Unterkellert createUnterkellert() {
        return new Unterkellert();
    }

    /**
     * Create an instance of {@link StpSonstige }
     * 
     */
    public StpSonstige createStpSonstige() {
        return new StpSonstige();
    }

    /**
     * Create an instance of {@link Geschlecht }
     * 
     */
    public Geschlecht createGeschlecht() {
        return new Geschlecht();
    }

    /**
     * Create an instance of {@link PreisZeiteinheit }
     * 
     */
    public PreisZeiteinheit createPreisZeiteinheit() {
        return new PreisZeiteinheit();
    }

    /**
     * Create an instance of {@link BebaubarNach }
     * 
     */
    public BebaubarNach createBebaubarNach() {
        return new BebaubarNach();
    }

    /**
     * Create an instance of {@link ZinshausRenditeobjekt }
     * 
     */
    public ZinshausRenditeobjekt createZinshausRenditeobjekt() {
        return new ZinshausRenditeobjekt();
    }

    /**
     * Create an instance of {@link LandUndForstwirtschaft }
     * 
     */
    public LandUndForstwirtschaft createLandUndForstwirtschaft() {
        return new LandUndForstwirtschaft();
    }

    /**
     * Create an instance of {@link Gastgewerbe }
     * 
     */
    public Gastgewerbe createGastgewerbe() {
        return new Gastgewerbe();
    }

    /**
     * Create an instance of {@link Uebertragung }
     * 
     */
    public Uebertragung createUebertragung() {
        return new Uebertragung();
    }

    /**
     * Create an instance of {@link Alter }
     * 
     */
    public Alter createAlter() {
        return new Alter();
    }

    /**
     * Create an instance of {@link Zustand }
     * 
     */
    public Zustand createZustand() {
        return new Zustand();
    }

    /**
     * Create an instance of {@link Erschliessung }
     * 
     */
    public Erschliessung createErschliessung() {
        return new Erschliessung();
    }

    /**
     * Create an instance of {@link Wohnung }
     * 
     */
    public Wohnung createWohnung() {
        return new Wohnung();
    }

    /**
     * Create an instance of {@link Einzelhandel }
     * 
     */
    public Einzelhandel createEinzelhandel() {
        return new Einzelhandel();
    }

    /**
     * Create an instance of {@link Sonstige }
     * 
     */
    public Sonstige createSonstige() {
        return new Sonstige();
    }

    /**
     * Create an instance of {@link BueroPraxen }
     * 
     */
    public BueroPraxen createBueroPraxen() {
        return new BueroPraxen();
    }

    /**
     * Create an instance of {@link Grundstueck }
     * 
     */
    public Grundstueck createGrundstueck() {
        return new Grundstueck();
    }

    /**
     * Create an instance of {@link Stellplatz }
     * 
     */
    public Stellplatz createStellplatz() {
        return new Stellplatz();
    }

    /**
     * Create an instance of {@link Moebliert }
     * 
     */
    public Moebliert createMoebliert() {
        return new Moebliert();
    }

    /**
     * Create an instance of {@link Boden }
     * 
     */
    public Boden createBoden() {
        return new Boden();
    }

    /**
     * Create an instance of {@link Befeuerung }
     * 
     */
    public Befeuerung createBefeuerung() {
        return new Befeuerung();
    }

    /**
     * Create an instance of {@link Kueche }
     * 
     */
    public Kueche createKueche() {
        return new Kueche();
    }

    /**
     * Create an instance of {@link Waehrung }
     * 
     */
    public Waehrung createWaehrung() {
        return new Waehrung();
    }

    /**
     * Create an instance of {@link Infrastruktur }
     * 
     */
    public Infrastruktur createInfrastruktur() {
        return new Infrastruktur();
    }

    /**
     * Create an instance of {@link AngeschlGastronomie }
     * 
     */
    public AngeschlGastronomie createAngeschlGastronomie() {
        return new AngeschlGastronomie();
    }

    /**
     * Create an instance of {@link Preise }
     * 
     */
    public Preise createPreise() {
        return new Preise();
    }

    /**
     * Create an instance of {@link LageImBau }
     * 
     */
    public LageImBau createLageImBau() {
        return new LageImBau();
    }

    /**
     * Create an instance of {@link Sicherheitstechnik }
     * 
     */
    public Sicherheitstechnik createSicherheitstechnik() {
        return new Sicherheitstechnik();
    }

    /**
     * Create an instance of {@link Geo }
     * 
     */
    public Geo createGeo() {
        return new Geo();
    }

    /**
     * Create an instance of {@link Ausstattung }
     * 
     */
    public Ausstattung createAusstattung() {
        return new Ausstattung();
    }

    /**
     * Create an instance of {@link WeitereAdresse }
     * 
     */
    public WeitereAdresse createWeitereAdresse() {
        return new WeitereAdresse();
    }

    /**
     * Create an instance of {@link AussenCourtage }
     * 
     */
    public AussenCourtage createAussenCourtage() {
        return new AussenCourtage();
    }

    /**
     * Create an instance of {@link Heizungsart }
     * 
     */
    public Heizungsart createHeizungsart() {
        return new Heizungsart();
    }

    /**
     * Create an instance of {@link Land }
     * 
     */
    public Land createLand() {
        return new Land();
    }

    /**
     * Create an instance of {@link Objektart }
     * 
     */
    public Objektart createObjektart() {
        return new Objektart();
    }

    /**
     * Create an instance of {@link Vermarktungsart }
     * 
     */
    public Vermarktungsart createVermarktungsart() {
        return new Vermarktungsart();
    }

    /**
     * Create an instance of {@link Freitexte }
     * 
     */
    public Freitexte createFreitexte() {
        return new Freitexte();
    }

    /**
     * Create an instance of {@link Objektkategorie }
     * 
     */
    public Objektkategorie createObjektkategorie() {
        return new Objektkategorie();
    }

    /**
     * Create an instance of {@link Flaechen }
     * 
     */
    public Flaechen createFlaechen() {
        return new Flaechen();
    }

    /**
     * Create an instance of {@link Anhaenge }
     * 
     */
    public Anhaenge createAnhaenge() {
        return new Anhaenge();
    }

    /**
     * Create an instance of {@link Fahrstuhl }
     * 
     */
    public Fahrstuhl createFahrstuhl() {
        return new Fahrstuhl();
    }

    /**
     * Create an instance of {@link ZustandAngaben }
     * 
     */
    public ZustandAngaben createZustandAngaben() {
        return new ZustandAngaben();
    }

    /**
     * Create an instance of {@link InnenCourtage }
     * 
     */
    public InnenCourtage createInnenCourtage() {
        return new InnenCourtage();
    }

    /**
     * Create an instance of {@link UserDefinedSimplefield }
     * 
     */
    public UserDefinedSimplefield createUserDefinedSimplefield() {
        return new UserDefinedSimplefield();
    }

    /**
     * Create an instance of {@link Bad }
     * 
     */
    public Bad createBad() {
        return new Bad();
    }

    /**
     * Create an instance of {@link Serviceleistungen }
     * 
     */
    public Serviceleistungen createServiceleistungen() {
        return new Serviceleistungen();
    }

    /**
     * Create an instance of {@link AusrichtBalkonTerrasse }
     * 
     */
    public AusrichtBalkonTerrasse createAusrichtBalkonTerrasse() {
        return new AusrichtBalkonTerrasse();
    }

    /**
     * Create an instance of {@link Daten }
     * 
     */
    public Daten createDaten() {
        return new Daten();
    }

    /**
     * Create an instance of {@link Kontaktperson }
     * 
     */
    public Kontaktperson createKontaktperson() {
        return new Kontaktperson();
    }

    /**
     * Create an instance of {@link VerwaltungObjekt }
     * 
     */
    public VerwaltungObjekt createVerwaltungObjekt() {
        return new VerwaltungObjekt();
    }

    /**
     * Create an instance of {@link Immobilie }
     * 
     */
    public Immobilie createImmobilie() {
        return new Immobilie();
    }

    /**
     * Create an instance of {@link Geokoordinaten }
     * 
     */
    public Geokoordinaten createGeokoordinaten() {
        return new Geokoordinaten();
    }

    /**
     * Create an instance of {@link Nutzungsart }
     * 
     */
    public Nutzungsart createNutzungsart() {
        return new Nutzungsart();
    }

    /**
     * Create an instance of {@link Immoxml }
     * 
     */
    public Immoxml createImmoxml() {
        return new Immoxml();
    }

    /**
     * Create an instance of {@link Anbieter }
     * 
     */
    public Anbieter createAnbieter() {
        return new Anbieter();
    }

    /**
     * Create an instance of {@link VerwaltungTechn }
     * 
     */
    public VerwaltungTechn createVerwaltungTechn() {
        return new VerwaltungTechn();
    }

    /**
     * Create an instance of {@link UserDefinedAnyfield }
     * 
     */
    public UserDefinedAnyfield createUserDefinedAnyfield() {
        return new UserDefinedAnyfield();
    }

    /**
     * Create an instance of {@link Stellplatzart }
     * 
     */
    public Stellplatzart createStellplatzart() {
        return new Stellplatzart();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "telefon_ferienimmobilie")
    public JAXBElement<Boolean> createTelefonFerienimmobilie(Boolean value) {
        return new JAXBElement<Boolean>(_TelefonFerienimmobilie_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "bundesland")
    public JAXBElement<String> createBundesland(String value) {
        return new JAXBElement<String>(_Bundesland_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "freiflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createFreiflaeche(Double value) {
        return new JAXBElement<Double>(_Freiflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "kaufpreis_pro_qm")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createKaufpreisProQm(Double value) {
        return new JAXBElement<Double>(_KaufpreisProQm_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "hausgeld")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createHausgeld(Double value) {
        return new JAXBElement<Double>(_Hausgeld_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "balkon_terrasse_flaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createBalkonTerrasseFlaeche(Double value) {
        return new JAXBElement<Double>(_BalkonTerrasseFlaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "hausnummer")
    public JAXBElement<String> createHausnummer(String value) {
        return new JAXBElement<String>(_Hausnummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "aktiv_bis")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Calendar> createAktivBis(Calendar value) {
        return new JAXBElement<Calendar>(_AktivBis_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anzahl_balkon_terrassen")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createAnzahlBalkonTerrassen(Double value) {
        return new JAXBElement<Double>(_AnzahlBalkonTerrassen_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anzahl_sep_wc")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createAnzahlSepWc(Double value) {
        return new JAXBElement<Double>(_AnzahlSepWc_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "bueroflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createBueroflaeche(Double value) {
        return new JAXBElement<Double>(_Bueroflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "gfz")
    public JAXBElement<String> createGfz(String value) {
        return new JAXBElement<String>(_Gfz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "email_privat")
    public JAXBElement<String> createEmailPrivat(String value) {
        return new JAXBElement<String>(_EmailPrivat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "mieteinnahmen_ist")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createMieteinnahmenIst(Double value) {
        return new JAXBElement<Double>(_MieteinnahmenIst_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anzahl_gewerbeeinheiten")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createAnzahlGewerbeeinheiten(Double value) {
        return new JAXBElement<Double>(_AnzahlGewerbeeinheiten_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anzahl_wohneinheiten")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createAnzahlWohneinheiten(Double value) {
        return new JAXBElement<Double>(_AnzahlWohneinheiten_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "firma")
    public JAXBElement<String> createFirma(String value) {
        return new JAXBElement<String>(_Firma_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "wohnungsnr")
    public JAXBElement<String> createWohnungsnr(String value) {
        return new JAXBElement<String>(_Wohnungsnr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "zzg_mehrwertsteuer")
    public JAXBElement<Boolean> createZzgMehrwertsteuer(Boolean value) {
        return new JAXBElement<Boolean>(_ZzgMehrwertsteuer_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "plz")
    public JAXBElement<String> createPlz(String value) {
        return new JAXBElement<String>(_Plz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "weitergabe_negativ")
    public JAXBElement<String> createWeitergabeNegativ(String value) {
        return new JAXBElement<String>(_WeitergabeNegativ_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "teilbar_ab")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createTeilbarAb(Double value) {
        return new JAXBElement<Double>(_TeilbarAb_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "kamin")
    public JAXBElement<Boolean> createKamin(Boolean value) {
        return new JAXBElement<Boolean>(_Kamin_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "weitergabe_positiv")
    public JAXBElement<String> createWeitergabePositiv(String value) {
        return new JAXBElement<String>(_WeitergabePositiv_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "immoxml_obid")
    public JAXBElement<String> createImmoxmlObid(String value) {
        return new JAXBElement<String>(_ImmoxmlObid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "denkmalgeschuetzt")
    public JAXBElement<Boolean> createDenkmalgeschuetzt(Boolean value) {
        return new JAXBElement<Boolean>(_Denkmalgeschuetzt_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "hebebuehne")
    public JAXBElement<Boolean> createHebebuehne(Boolean value) {
        return new JAXBElement<Boolean>(_Hebebuehne_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "versteigerungstermin")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Calendar> createVersteigerungstermin(Calendar value) {
        return new JAXBElement<Calendar>(_Versteigerungstermin_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "format")
    public JAXBElement<String> createFormat(String value) {
        return new JAXBElement<String>(_Format_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "sauna")
    public JAXBElement<Boolean> createSauna(Boolean value) {
        return new JAXBElement<Boolean>(_Sauna_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "hallenhoehe")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createHallenhoehe(Double value) {
        return new JAXBElement<Double>(_Hallenhoehe_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "gartennutzung")
    public JAXBElement<Boolean> createGartennutzung(Boolean value) {
        return new JAXBElement<Boolean>(_Gartennutzung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "gemarkung")
    public JAXBElement<String> createGemarkung(String value) {
        return new JAXBElement<String>(_Gemarkung_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "aktiv_von")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Calendar> createAktivVon(Calendar value) {
        return new JAXBElement<Calendar>(_AktivVon_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "objekttitel")
    public JAXBElement<String> createObjekttitel(String value) {
        return new JAXBElement<String>(_Objekttitel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "nettokaltmiete")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createNettokaltmiete(Double value) {
        return new JAXBElement<Double>(_Nettokaltmiete_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "brauereibindung")
    public JAXBElement<Boolean> createBrauereibindung(Boolean value) {
        return new JAXBElement<Boolean>(_Brauereibindung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "zugang")
    public JAXBElement<String> createZugang(String value) {
        return new JAXBElement<String>(_Zugang_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "freitextfeld")
    public JAXBElement<String> createFreitextfeld(String value) {
        return new JAXBElement<String>(_Freitextfeld_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "titel")
    public JAXBElement<String> createTitel(String value) {
        return new JAXBElement<String>(_Titel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "ausstatt_beschr")
    public JAXBElement<String> createAusstattBeschr(String value) {
        return new JAXBElement<String>(_AusstattBeschr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "raeume_veraenderbar")
    public JAXBElement<Boolean> createRaeumeVeraenderbar(Boolean value) {
        return new JAXBElement<Boolean>(_RaeumeVeraenderbar_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "laufzeit")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createLaufzeit(Double value) {
        return new JAXBElement<Double>(_Laufzeit_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "flurstueck")
    public JAXBElement<String> createFlurstueck(String value) {
        return new JAXBElement<String>(_Flurstueck_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "mietzuschlaege")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createMietzuschlaege(Double value) {
        return new JAXBElement<Double>(_Mietzuschlaege_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "kennung_ursprung")
    public JAXBElement<String> createKennungUrsprung(String value) {
        return new JAXBElement<String>(_KennungUrsprung_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "als_ferien")
    public JAXBElement<Boolean> createAlsFerien(Boolean value) {
        return new JAXBElement<Boolean>(_AlsFerien_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "gruppennummer")
    public JAXBElement<String> createGruppennummer(String value) {
        return new JAXBElement<String>(_Gruppennummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "swimmingpool")
    public JAXBElement<Boolean> createSwimmingpool(Boolean value) {
        return new JAXBElement<Boolean>(_Swimmingpool_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "verkaufsflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createVerkaufsflaeche(Double value) {
        return new JAXBElement<Double>(_Verkaufsflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anbieternr")
    public JAXBElement<String> createAnbieternr(String value) {
        return new JAXBElement<String>(_Anbieternr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "bmz")
    public JAXBElement<String> createBmz(String value) {
        return new JAXBElement<String>(_Bmz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "dv_verkabelung")
    public JAXBElement<Boolean> createDvVerkabelung(Boolean value) {
        return new JAXBElement<Boolean>(_DvVerkabelung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "objektadresse_freigeben")
    public JAXBElement<Boolean> createObjektadresseFreigeben(Boolean value) {
        return new JAXBElement<Boolean>(_ObjektadresseFreigeben_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "postfach")
    public JAXBElement<String> createPostfach(String value) {
        return new JAXBElement<String>(_Postfach_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "regionaler_zusatz")
    public JAXBElement<String> createRegionalerZusatz(String value) {
        return new JAXBElement<String>(_RegionalerZusatz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "gartenflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createGartenflaeche(Double value) {
        return new JAXBElement<Double>(_Gartenflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "barrierefrei")
    public JAXBElement<Boolean> createBarrierefrei(Boolean value) {
        return new JAXBElement<Boolean>(_Barrierefrei_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "erbpacht")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createErbpacht(Double value) {
        return new JAXBElement<Double>(_Erbpacht_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "kran")
    public JAXBElement<Boolean> createKran(Boolean value) {
        return new JAXBElement<Boolean>(_Kran_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "nebenkosten")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createNebenkosten(Double value) {
        return new JAXBElement<Double>(_Nebenkosten_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anhanginhalt")
    public JAXBElement<byte[]> createAnhanginhalt(byte[] value) {
        return new JAXBElement<byte[]>(_Anhanginhalt_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stellplatz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "stp_tiefgarage")
    public JAXBElement<Stellplatz> createStpTiefgarage(Stellplatz value) {
        return new JAXBElement<Stellplatz>(_StpTiefgarage_QNAME, Stellplatz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "flur")
    public JAXBElement<String> createFlur(String value) {
        return new JAXBElement<String>(_Flur_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "grundstuecksfront")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createGrundstuecksfront(Double value) {
        return new JAXBElement<Double>(_Grundstuecksfront_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "impressum")
    public JAXBElement<String> createImpressum(String value) {
        return new JAXBElement<String>(_Impressum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "ladenflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createLadenflaeche(Double value) {
        return new JAXBElement<Double>(_Ladenflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "stromanschlusswert")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createStromanschlusswert(Double value) {
        return new JAXBElement<Double>(_Stromanschlusswert_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "sonstflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createSonstflaeche(Double value) {
        return new JAXBElement<Double>(_Sonstflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "stand_vom")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Calendar> createStandVom(Calendar value) {
        return new JAXBElement<Calendar>(_StandVom_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "strasse")
    public JAXBElement<String> createStrasse(String value) {
        return new JAXBElement<String>(_Strasse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "sonstige_angaben")
    public JAXBElement<String> createSonstigeAngaben(String value) {
        return new JAXBElement<String>(_SonstigeAngaben_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stellplatz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "stp_duplex")
    public JAXBElement<Stellplatz> createStpDuplex(Stellplatz value) {
        return new JAXBElement<Stellplatz>(_StpDuplex_QNAME, Stellplatz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "weitergabe_generell")
    public JAXBElement<Boolean> createWeitergabeGenerell(Boolean value) {
        return new JAXBElement<Boolean>(_WeitergabeGenerell_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "abdatum")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Calendar> createAbdatum(Calendar value) {
        return new JAXBElement<Calendar>(_Abdatum_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "tel_privat")
    public JAXBElement<String> createTelPrivat(String value) {
        return new JAXBElement<String>(_TelPrivat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "email_zentrale")
    public JAXBElement<String> createEmailZentrale(String value) {
        return new JAXBElement<String>(_EmailZentrale_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "grz")
    public JAXBElement<String> createGrz(String value) {
        return new JAXBElement<String>(_Grz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "lagerflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createLagerflaeche(Double value) {
        return new JAXBElement<Double>(_Lagerflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "altlasten")
    public JAXBElement<String> createAltlasten(String value) {
        return new JAXBElement<String>(_Altlasten_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "verwaltungsflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createVerwaltungsflaeche(Double value) {
        return new JAXBElement<Double>(_Verwaltungsflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "erschliessungskosten")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createErschliessungskosten(Double value) {
        return new JAXBElement<Double>(_Erschliessungskosten_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "tel_zentrale")
    public JAXBElement<String> createTelZentrale(String value) {
        return new JAXBElement<String>(_TelZentrale_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "vorname")
    public JAXBElement<String> createVorname(String value) {
        return new JAXBElement<String>(_Vorname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "objektnr_extern")
    public JAXBElement<String> createObjektnrExtern(String value) {
        return new JAXBElement<String>(_ObjektnrExtern_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "fensterfront_qm")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createFensterfrontQm(Double value) {
        return new JAXBElement<Double>(_FensterfrontQm_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anzahl_zimmer")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createAnzahlZimmer(Double value) {
        return new JAXBElement<Double>(_AnzahlZimmer_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anhangtitel")
    public JAXBElement<String> createAnhangtitel(String value) {
        return new JAXBElement<String>(_Anhangtitel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "bgf")
    public JAXBElement<String> createBgf(String value) {
        return new JAXBElement<String>(_Bgf_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "max_personen")
    @XmlJavaTypeAdapter(Adapter6 .class)
    public JAXBElement<Integer> createMaxPersonen(Integer value) {
        return new JAXBElement<Integer>(_MaxPersonen_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stellplatz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "stp_carport")
    public JAXBElement<Stellplatz> createStpCarport(Stellplatz value) {
        return new JAXBElement<Stellplatz>(_StpCarport_QNAME, Stellplatz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "etage")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Integer> createEtage(Integer value) {
        return new JAXBElement<Integer>(_Etage_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "kellerflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createKellerflaeche(Double value) {
        return new JAXBElement<Double>(_Kellerflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anzahl_schlafzimmer")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createAnzahlSchlafzimmer(Double value) {
        return new JAXBElement<Double>(_AnzahlSchlafzimmer_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "objektnr_intern")
    public JAXBElement<String> createObjektnrIntern(String value) {
        return new JAXBElement<String>(_ObjektnrIntern_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "tel_handy")
    public JAXBElement<String> createTelHandy(String value) {
        return new JAXBElement<String>(_TelHandy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "nettorendite")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createNettorendite(Double value) {
        return new JAXBElement<Double>(_Nettorendite_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anzahl_wohn_schlafzimmer")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createAnzahlWohnSchlafzimmer(Double value) {
        return new JAXBElement<Double>(_AnzahlWohnSchlafzimmer_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "heizkosten")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createHeizkosten(Double value) {
        return new JAXBElement<Double>(_Heizkosten_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anrede")
    public JAXBElement<String> createAnrede(String value) {
        return new JAXBElement<String>(_Anrede_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "mwst_satz")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createMwstSatz(Double value) {
        return new JAXBElement<Double>(_MwstSatz_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "gesamtflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createGesamtflaeche(Double value) {
        return new JAXBElement<Double>(_Gesamtflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "hochhaus")
    public JAXBElement<Boolean> createHochhaus(Boolean value) {
        return new JAXBElement<Boolean>(_Hochhaus_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "branchen")
    public JAXBElement<String> createBranchen(String value) {
        return new JAXBElement<String>(_Branchen_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "klimatisiert")
    public JAXBElement<Boolean> createKlimatisiert(Boolean value) {
        return new JAXBElement<Boolean>(_Klimatisiert_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anrede_brief")
    public JAXBElement<String> createAnredeBrief(String value) {
        return new JAXBElement<String>(_AnredeBrief_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stellplatz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "stp_parkhaus")
    public JAXBElement<Stellplatz> createStpParkhaus(Stellplatz value) {
        return new JAXBElement<Stellplatz>(_StpParkhaus_QNAME, Stellplatz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "kabel_sat_tv")
    public JAXBElement<Boolean> createKabelSatTv(Boolean value) {
        return new JAXBElement<Boolean>(_KabelSatTv_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "rampe")
    public JAXBElement<Boolean> createRampe(Boolean value) {
        return new JAXBElement<Boolean>(_Rampe_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "verfuegbar_ab")
    public JAXBElement<String> createVerfuegbarAb(String value) {
        return new JAXBElement<String>(_VerfuegbarAb_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "mietpreis_pro_qm")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createMietpreisProQm(Double value) {
        return new JAXBElement<Double>(_MietpreisProQm_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "vermietet")
    public JAXBElement<Boolean> createVermietet(Boolean value) {
        return new JAXBElement<Boolean>(_Vermietet_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "postf_ort")
    public JAXBElement<String> createPostfOrt(String value) {
        return new JAXBElement<String>(_PostfOrt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "gastroflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createGastroflaeche(Double value) {
        return new JAXBElement<Double>(_Gastroflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "email_direkt")
    public JAXBElement<String> createEmailDirekt(String value) {
        return new JAXBElement<String>(_EmailDirekt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "baujahr")
    public JAXBElement<String> createBaujahr(String value) {
        return new JAXBElement<String>(_Baujahr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "beheizbare_flaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createBeheizbareFlaeche(Double value) {
        return new JAXBElement<Double>(_BeheizbareFlaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anzahl_tagungsraeume")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createAnzahlTagungsraeume(Double value) {
        return new JAXBElement<Double>(_AnzahlTagungsraeume_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "gewerbliche_nutzung")
    public JAXBElement<Boolean> createGewerblicheNutzung(Boolean value) {
        return new JAXBElement<Boolean>(_GewerblicheNutzung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "zusatzfeld")
    public JAXBElement<Object> createZusatzfeld(Object value) {
        return new JAXBElement<Object>(_Zusatzfeld_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "freitext_preis")
    public JAXBElement<String> createFreitextPreis(String value) {
        return new JAXBElement<String>(_FreitextPreis_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "sporteinrichtungen")
    public JAXBElement<Boolean> createSporteinrichtungen(Boolean value) {
        return new JAXBElement<Boolean>(_Sporteinrichtungen_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "nutzflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createNutzflaeche(Double value) {
        return new JAXBElement<Double>(_Nutzflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "kaufpreis")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createKaufpreis(Double value) {
        return new JAXBElement<Double>(_Kaufpreis_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "bueroteilflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createBueroteilflaeche(Double value) {
        return new JAXBElement<Double>(_Bueroteilflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "dachbodenflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createDachbodenflaeche(Double value) {
        return new JAXBElement<Double>(_Dachbodenflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "einliegerwohnung")
    public JAXBElement<Boolean> createEinliegerwohnung(Boolean value) {
        return new JAXBElement<Boolean>(_Einliegerwohnung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "dreizeiler")
    public JAXBElement<String> createDreizeiler(String value) {
        return new JAXBElement<String>(_Dreizeiler_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "wellnessbereich")
    public JAXBElement<Boolean> createWellnessbereich(Boolean value) {
        return new JAXBElement<Boolean>(_Wellnessbereich_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "lage")
    public JAXBElement<String> createLage(String value) {
        return new JAXBElement<String>(_Lage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "postf_plz")
    public JAXBElement<String> createPostfPlz(String value) {
        return new JAXBElement<String>(_PostfPlz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "grundstuecksflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createGrundstuecksflaeche(Double value) {
        return new JAXBElement<Double>(_Grundstuecksflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "haustiere")
    public JAXBElement<Boolean> createHaustiere(Boolean value) {
        return new JAXBElement<Boolean>(_Haustiere_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stellplatz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "stp_freiplatz")
    public JAXBElement<Stellplatz> createStpFreiplatz(Stellplatz value) {
        return new JAXBElement<Stellplatz>(_StpFreiplatz_QNAME, Stellplatz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anzahl_betten")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createAnzahlBetten(Double value) {
        return new JAXBElement<Double>(_AnzahlBetten_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "gastterrasse")
    public JAXBElement<Boolean> createGastterrasse(Boolean value) {
        return new JAXBElement<Boolean>(_Gastterrasse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stellplatz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "stp_garage")
    public JAXBElement<Stellplatz> createStpGarage(Stellplatz value) {
        return new JAXBElement<Stellplatz>(_StpGarage_QNAME, Stellplatz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "kantine_cafeteria")
    public JAXBElement<Boolean> createKantineCafeteria(Boolean value) {
        return new JAXBElement<Boolean>(_KantineCafeteria_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "wg_geeignet")
    public JAXBElement<Boolean> createWgGeeignet(Boolean value) {
        return new JAXBElement<Boolean>(_WgGeeignet_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "pacht")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createPacht(Double value) {
        return new JAXBElement<Double>(_Pacht_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "pfad")
    public JAXBElement<String> createPfad(String value) {
        return new JAXBElement<String>(_Pfad_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "preis_zeitraum_bis")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Calendar> createPreisZeitraumBis(Calendar value) {
        return new JAXBElement<Calendar>(_PreisZeitraumBis_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "mieteinnahmen_soll")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createMieteinnahmenSoll(Double value) {
        return new JAXBElement<Double>(_MieteinnahmenSoll_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "adressfreigabe")
    public JAXBElement<Boolean> createAdressfreigabe(Boolean value) {
        return new JAXBElement<Boolean>(_Adressfreigabe_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "vermietbare_flaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createVermietbareFlaeche(Double value) {
        return new JAXBElement<Double>(_VermietbareFlaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "rollstuhlgerecht")
    public JAXBElement<Boolean> createRollstuhlgerecht(Boolean value) {
        return new JAXBElement<Boolean>(_Rollstuhlgerecht_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "preis_zeitraum_von")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Calendar> createPreisZeitraumVon(Calendar value) {
        return new JAXBElement<Calendar>(_PreisZeitraumVon_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "gemeindecode")
    public JAXBElement<String> createGemeindecode(String value) {
        return new JAXBElement<String>(_Gemeindecode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "immoxml_anid")
    public JAXBElement<String> createImmoxmlAnid(String value) {
        return new JAXBElement<String>(_ImmoxmlAnid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "teekueche")
    public JAXBElement<Boolean> createTeekueche(Boolean value) {
        return new JAXBElement<Boolean>(_Teekueche_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "personennummer")
    public JAXBElement<String> createPersonennummer(String value) {
        return new JAXBElement<String>(_Personennummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "ort")
    public JAXBElement<String> createOrt(String value) {
        return new JAXBElement<String>(_Ort_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "wbs_sozialwohnung")
    public JAXBElement<Boolean> createWbsSozialwohnung(Boolean value) {
        return new JAXBElement<Boolean>(_WbsSozialwohnung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "abstand")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createAbstand(Double value) {
        return new JAXBElement<Double>(_Abstand_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "warmmiete")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createWarmmiete(Double value) {
        return new JAXBElement<Double>(_Warmmiete_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "objektbeschreibung")
    public JAXBElement<String> createObjektbeschreibung(String value) {
        return new JAXBElement<String>(_Objektbeschreibung_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "geschaeftsguthaben")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createGeschaeftsguthaben(Double value) {
        return new JAXBElement<Double>(_Geschaeftsguthaben_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "kaltmiete")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createKaltmiete(Double value) {
        return new JAXBElement<Double>(_Kaltmiete_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "wohnflaeche")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createWohnflaeche(Double value) {
        return new JAXBElement<Double>(_Wohnflaeche_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "x_fache")
    public JAXBElement<String> createXFache(String value) {
        return new JAXBElement<String>(_XFache_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "zulieferung")
    public JAXBElement<Boolean> createZulieferung(Boolean value) {
        return new JAXBElement<Boolean>(_Zulieferung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "bisdatum")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Calendar> createBisdatum(Calendar value) {
        return new JAXBElement<Calendar>(_Bisdatum_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "nichtraucher")
    public JAXBElement<Boolean> createNichtraucher(Boolean value) {
        return new JAXBElement<Boolean>(_Nichtraucher_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "kaution")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createKaution(Double value) {
        return new JAXBElement<Double>(_Kaution_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anzahl_stellplaetze")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createAnzahlStellplaetze(Double value) {
        return new JAXBElement<Double>(_AnzahlStellplaetze_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "tel_durchw")
    public JAXBElement<String> createTelDurchw(String value) {
        return new JAXBElement<String>(_TelDurchw_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "tel_fax")
    public JAXBElement<String> createTelFax(String value) {
        return new JAXBElement<String>(_TelFax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "plaetze_gastraum")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createPlaetzeGastraum(Double value) {
        return new JAXBElement<Double>(_PlaetzeGastraum_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "anzahl_badezimmer")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createAnzahlBadezimmer(Double value) {
        return new JAXBElement<Double>(_AnzahlBadezimmer_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "wasch_trockenraum")
    public JAXBElement<Boolean> createWaschTrockenraum(Boolean value) {
        return new JAXBElement<Boolean>(_WaschTrockenraum_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.immoxml.de", name = "fensterfront")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createFensterfront(Double value) {
        return new JAXBElement<Double>(_Fensterfront_QNAME, Double.class, null, value);
    }

}
