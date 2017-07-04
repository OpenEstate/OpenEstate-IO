
package org.openestate.io.openimmo.xml;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.io.openimmo.xml package. 
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

    private final static QName _Version_QNAME = new QName("", "version");
    private final static QName _OpenimmoAnid_QNAME = new QName("", "openimmo_anid");
    private final static QName _Lizenzkennung_QNAME = new QName("", "lizenzkennung");
    private final static QName _Strasse_QNAME = new QName("", "strasse");
    private final static QName _Hausnummer_QNAME = new QName("", "hausnummer");
    private final static QName _Plz_QNAME = new QName("", "plz");
    private final static QName _Ort_QNAME = new QName("", "ort");
    private final static QName _Bundesland_QNAME = new QName("", "bundesland");
    private final static QName _Gemeindecode_QNAME = new QName("", "gemeindecode");
    private final static QName _Flur_QNAME = new QName("", "flur");
    private final static QName _Flurstueck_QNAME = new QName("", "flurstueck");
    private final static QName _Gemarkung_QNAME = new QName("", "gemarkung");
    private final static QName _Etage_QNAME = new QName("", "etage");
    private final static QName _AnzahlEtagen_QNAME = new QName("", "anzahl_etagen");
    private final static QName _Wohnungsnr_QNAME = new QName("", "wohnungsnr");
    private final static QName _RegionalerZusatz_QNAME = new QName("", "regionaler_zusatz");
    private final static QName _KartenMakro_QNAME = new QName("", "karten_makro");
    private final static QName _KartenMikro_QNAME = new QName("", "karten_mikro");
    private final static QName _Virtuelletour_QNAME = new QName("", "virtuelletour");
    private final static QName _Luftbildern_QNAME = new QName("", "luftbildern");
    private final static QName _ReferenzId_QNAME = new QName("", "referenz_id");
    private final static QName _Vorname_QNAME = new QName("", "vorname");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Titel_QNAME = new QName("", "titel");
    private final static QName _Anrede_QNAME = new QName("", "anrede");
    private final static QName _Position_QNAME = new QName("", "position");
    private final static QName _AnredeBrief_QNAME = new QName("", "anrede_brief");
    private final static QName _Firma_QNAME = new QName("", "firma");
    private final static QName _Zusatzfeld_QNAME = new QName("", "zusatzfeld");
    private final static QName _Postfach_QNAME = new QName("", "postfach");
    private final static QName _PostfPlz_QNAME = new QName("", "postf_plz");
    private final static QName _PostfOrt_QNAME = new QName("", "postf_ort");
    private final static QName _EmailDirekt_QNAME = new QName("", "email_direkt");
    private final static QName _EmailZentrale_QNAME = new QName("", "email_zentrale");
    private final static QName _EmailPrivat_QNAME = new QName("", "email_privat");
    private final static QName _EmailFeedback_QNAME = new QName("", "email_feedback");
    private final static QName _TelZentrale_QNAME = new QName("", "tel_zentrale");
    private final static QName _TelDurchw_QNAME = new QName("", "tel_durchw");
    private final static QName _TelPrivat_QNAME = new QName("", "tel_privat");
    private final static QName _TelHandy_QNAME = new QName("", "tel_handy");
    private final static QName _TelFax_QNAME = new QName("", "tel_fax");
    private final static QName _Url_QNAME = new QName("", "url");
    private final static QName _Adressfreigabe_QNAME = new QName("", "adressfreigabe");
    private final static QName _Personennummer_QNAME = new QName("", "personennummer");
    private final static QName _Immobilientreuhaenderid_QNAME = new QName("", "immobilientreuhaenderid");
    private final static QName _Freitextfeld_QNAME = new QName("", "freitextfeld");
    private final static QName _Pauschalmiete_QNAME = new QName("", "pauschalmiete");
    private final static QName _Flaechevon_QNAME = new QName("", "flaechevon");
    private final static QName _Flaechebis_QNAME = new QName("", "flaechebis");
    private final static QName _Gesamtmietebrutto_QNAME = new QName("", "gesamtmietebrutto");
    private final static QName _Gesamtbelastungbrutto_QNAME = new QName("", "gesamtbelastungbrutto");
    private final static QName _Kaufpreisbrutto_QNAME = new QName("", "kaufpreisbrutto");
    private final static QName _Monatlichekostenbrutto_QNAME = new QName("", "monatlichekostenbrutto");
    private final static QName _Provisionbrutto_QNAME = new QName("", "provisionbrutto");
    private final static QName _Richtpreisprom2_QNAME = new QName("", "richtpreisprom2");
    private final static QName _Nettokaltmiete_QNAME = new QName("", "nettokaltmiete");
    private final static QName _Kaltmiete_QNAME = new QName("", "kaltmiete");
    private final static QName _Nebenkosten_QNAME = new QName("", "nebenkosten");
    private final static QName _Warmmiete_QNAME = new QName("", "warmmiete");
    private final static QName _HeizkostenEnthalten_QNAME = new QName("", "heizkosten_enthalten");
    private final static QName _Heizkosten_QNAME = new QName("", "heizkosten");
    private final static QName _ZzgMehrwertsteuer_QNAME = new QName("", "zzg_mehrwertsteuer");
    private final static QName _Mietzuschlaege_QNAME = new QName("", "mietzuschlaege");
    private final static QName _Pacht_QNAME = new QName("", "pacht");
    private final static QName _Erbpacht_QNAME = new QName("", "erbpacht");
    private final static QName _Hausgeld_QNAME = new QName("", "hausgeld");
    private final static QName _Abstand_QNAME = new QName("", "abstand");
    private final static QName _PreisZeitraumVon_QNAME = new QName("", "preis_zeitraum_von");
    private final static QName _PreisZeitraumBis_QNAME = new QName("", "preis_zeitraum_bis");
    private final static QName _MietpreisProQm_QNAME = new QName("", "mietpreis_pro_qm");
    private final static QName _KaufpreisProQm_QNAME = new QName("", "kaufpreis_pro_qm");
    private final static QName _Richtpreis_QNAME = new QName("", "richtpreis");
    private final static QName _StpFreiplatz_QNAME = new QName("", "stp_freiplatz");
    private final static QName _StpTiefgarage_QNAME = new QName("", "stp_tiefgarage");
    private final static QName _StpGarage_QNAME = new QName("", "stp_garage");
    private final static QName _StpCarport_QNAME = new QName("", "stp_carport");
    private final static QName _StpDuplex_QNAME = new QName("", "stp_duplex");
    private final static QName _StpParkhaus_QNAME = new QName("", "stp_parkhaus");
    private final static QName _Provisionspflichtig_QNAME = new QName("", "provisionspflichtig");
    private final static QName _CourtageHinweis_QNAME = new QName("", "courtage_hinweis");
    private final static QName _MwstSatz_QNAME = new QName("", "mwst_satz");
    private final static QName _MwstGesamt_QNAME = new QName("", "mwst_gesamt");
    private final static QName _FreitextPreis_QNAME = new QName("", "freitext_preis");
    private final static QName _XFache_QNAME = new QName("", "x_fache");
    private final static QName _Nettorendite_QNAME = new QName("", "nettorendite");
    private final static QName _NettorenditeIst_QNAME = new QName("", "nettorendite_ist");
    private final static QName _NettorenditeSoll_QNAME = new QName("", "nettorendite_soll");
    private final static QName _Erschliessungskosten_QNAME = new QName("", "erschliessungskosten");
    private final static QName _Kaution_QNAME = new QName("", "kaution");
    private final static QName _KautionText_QNAME = new QName("", "kaution_text");
    private final static QName _Geschaeftsguthaben_QNAME = new QName("", "geschaeftsguthaben");
    private final static QName _Wohnflaeche_QNAME = new QName("", "wohnflaeche");
    private final static QName _Nutzflaeche_QNAME = new QName("", "nutzflaeche");
    private final static QName _Gesamtflaeche_QNAME = new QName("", "gesamtflaeche");
    private final static QName _Ladenflaeche_QNAME = new QName("", "ladenflaeche");
    private final static QName _Lagerflaeche_QNAME = new QName("", "lagerflaeche");
    private final static QName _Verkaufsflaeche_QNAME = new QName("", "verkaufsflaeche");
    private final static QName _Freiflaeche_QNAME = new QName("", "freiflaeche");
    private final static QName _Bueroflaeche_QNAME = new QName("", "bueroflaeche");
    private final static QName _Bueroteilflaeche_QNAME = new QName("", "bueroteilflaeche");
    private final static QName _Fensterfront_QNAME = new QName("", "fensterfront");
    private final static QName _Sonstflaeche_QNAME = new QName("", "sonstflaeche");
    private final static QName _Verwaltungsflaeche_QNAME = new QName("", "verwaltungsflaeche");
    private final static QName _Gastroflaeche_QNAME = new QName("", "gastroflaeche");
    private final static QName _Grz_QNAME = new QName("", "grz");
    private final static QName _Gfz_QNAME = new QName("", "gfz");
    private final static QName _Bmz_QNAME = new QName("", "bmz");
    private final static QName _Bgf_QNAME = new QName("", "bgf");
    private final static QName _Grundstuecksflaeche_QNAME = new QName("", "grundstuecksflaeche");
    private final static QName _AnzahlZimmer_QNAME = new QName("", "anzahl_zimmer");
    private final static QName _AnzahlSchlafzimmer_QNAME = new QName("", "anzahl_schlafzimmer");
    private final static QName _AnzahlBadezimmer_QNAME = new QName("", "anzahl_badezimmer");
    private final static QName _AnzahlSepWc_QNAME = new QName("", "anzahl_sep_wc");
    private final static QName _BalkonTerrasseFlaeche_QNAME = new QName("", "balkon_terrasse_flaeche");
    private final static QName _AnzahlWohnSchlafzimmer_QNAME = new QName("", "anzahl_wohn_schlafzimmer");
    private final static QName _Gartenflaeche_QNAME = new QName("", "gartenflaeche");
    private final static QName _AnzahlBalkonTerrassen_QNAME = new QName("", "anzahl_balkon_terrassen");
    private final static QName _AnzahlBalkone_QNAME = new QName("", "anzahl_balkone");
    private final static QName _AnzahlTerrassen_QNAME = new QName("", "anzahl_terrassen");
    private final static QName _AnzahlLogia_QNAME = new QName("", "anzahl_logia");
    private final static QName _Kellerflaeche_QNAME = new QName("", "kellerflaeche");
    private final static QName _FensterfrontQm_QNAME = new QName("", "fensterfront_qm");
    private final static QName _Grundstuecksfront_QNAME = new QName("", "grundstuecksfront");
    private final static QName _Dachbodenflaeche_QNAME = new QName("", "dachbodenflaeche");
    private final static QName _TeilbarAb_QNAME = new QName("", "teilbar_ab");
    private final static QName _BeheizbareFlaeche_QNAME = new QName("", "beheizbare_flaeche");
    private final static QName _AnzahlStellplaetze_QNAME = new QName("", "anzahl_stellplaetze");
    private final static QName _PlaetzeGastraum_QNAME = new QName("", "plaetze_gastraum");
    private final static QName _AnzahlBetten_QNAME = new QName("", "anzahl_betten");
    private final static QName _AnzahlTagungsraeume_QNAME = new QName("", "anzahl_tagungsraeume");
    private final static QName _VermietbareFlaeche_QNAME = new QName("", "vermietbare_flaeche");
    private final static QName _AnzahlWohneinheiten_QNAME = new QName("", "anzahl_wohneinheiten");
    private final static QName _AnzahlGewerbeeinheiten_QNAME = new QName("", "anzahl_gewerbeeinheiten");
    private final static QName _Einliegerwohnung_QNAME = new QName("", "einliegerwohnung");
    private final static QName _Kubatur_QNAME = new QName("", "kubatur");
    private final static QName _Ausnuetzungsziffer_QNAME = new QName("", "ausnuetzungsziffer");
    private final static QName _BeginnAngebotsphase_QNAME = new QName("", "beginn_angebotsphase");
    private final static QName _Besichtigungstermin_QNAME = new QName("", "besichtigungstermin");
    private final static QName _Besichtigungstermin2_QNAME = new QName("", "besichtigungstermin_2");
    private final static QName _BeginnBietzeit_QNAME = new QName("", "beginn_bietzeit");
    private final static QName _EndeBietzeit_QNAME = new QName("", "ende_bietzeit");
    private final static QName _HoechstgebotZeigen_QNAME = new QName("", "hoechstgebot_zeigen");
    private final static QName _Mindestpreis_QNAME = new QName("", "mindestpreis");
    private final static QName _Zwangsversteigerung_QNAME = new QName("", "zwangsversteigerung");
    private final static QName _Aktenzeichen_QNAME = new QName("", "aktenzeichen");
    private final static QName _Zvtermin_QNAME = new QName("", "zvtermin");
    private final static QName _Zusatztermin_QNAME = new QName("", "zusatztermin");
    private final static QName _Amtsgericht_QNAME = new QName("", "amtsgericht");
    private final static QName _Verkehrswert_QNAME = new QName("", "verkehrswert");
    private final static QName _WgGeeignet_QNAME = new QName("", "wg_geeignet");
    private final static QName _AusstattKategorie_QNAME = new QName("", "ausstatt_kategorie");
    private final static QName _RaeumeVeraenderbar_QNAME = new QName("", "raeume_veraenderbar");
    private final static QName _Kamin_QNAME = new QName("", "kamin");
    private final static QName _Klimatisiert_QNAME = new QName("", "klimatisiert");
    private final static QName _Gartennutzung_QNAME = new QName("", "gartennutzung");
    private final static QName _Rollstuhlgerecht_QNAME = new QName("", "rollstuhlgerecht");
    private final static QName _KabelSatTv_QNAME = new QName("", "kabel_sat_tv");
    private final static QName _Dvbt_QNAME = new QName("", "dvbt");
    private final static QName _Barrierefrei_QNAME = new QName("", "barrierefrei");
    private final static QName _Sauna_QNAME = new QName("", "sauna");
    private final static QName _Swimmingpool_QNAME = new QName("", "swimmingpool");
    private final static QName _WaschTrockenraum_QNAME = new QName("", "wasch_trockenraum");
    private final static QName _Wintergarten_QNAME = new QName("", "wintergarten");
    private final static QName _DvVerkabelung_QNAME = new QName("", "dv_verkabelung");
    private final static QName _Rampe_QNAME = new QName("", "rampe");
    private final static QName _Hebebuehne_QNAME = new QName("", "hebebuehne");
    private final static QName _Kran_QNAME = new QName("", "kran");
    private final static QName _Gastterrasse_QNAME = new QName("", "gastterrasse");
    private final static QName _Stromanschlusswert_QNAME = new QName("", "stromanschlusswert");
    private final static QName _KantineCafeteria_QNAME = new QName("", "kantine_cafeteria");
    private final static QName _Teekueche_QNAME = new QName("", "teekueche");
    private final static QName _Hallenhoehe_QNAME = new QName("", "hallenhoehe");
    private final static QName _Brauereibindung_QNAME = new QName("", "brauereibindung");
    private final static QName _Sporteinrichtungen_QNAME = new QName("", "sporteinrichtungen");
    private final static QName _Wellnessbereich_QNAME = new QName("", "wellnessbereich");
    private final static QName _TelefonFerienimmobilie_QNAME = new QName("", "telefon_ferienimmobilie");
    private final static QName _UmtsEmpfang_QNAME = new QName("", "umts_empfang");
    private final static QName _Abstellraum_QNAME = new QName("", "abstellraum");
    private final static QName _Fahrradraum_QNAME = new QName("", "fahrradraum");
    private final static QName _Rolladen_QNAME = new QName("", "rolladen");
    private final static QName _Bibliothek_QNAME = new QName("", "bibliothek");
    private final static QName _Dachboden_QNAME = new QName("", "dachboden");
    private final static QName _Gaestewc_QNAME = new QName("", "gaestewc");
    private final static QName _Kabelkanaele_QNAME = new QName("", "kabelkanaele");
    private final static QName _Seniorengerecht_QNAME = new QName("", "seniorengerecht");
    private final static QName _Baujahr_QNAME = new QName("", "baujahr");
    private final static QName _Letztemodernisierung_QNAME = new QName("", "letztemodernisierung");
    private final static QName _Bauzone_QNAME = new QName("", "bauzone");
    private final static QName _Altlasten_QNAME = new QName("", "altlasten");
    private final static QName _Zulieferung_QNAME = new QName("", "zulieferung");
    private final static QName _Objekttitel_QNAME = new QName("", "objekttitel");
    private final static QName _Dreizeiler_QNAME = new QName("", "dreizeiler");
    private final static QName _Lage_QNAME = new QName("", "lage");
    private final static QName _AusstattBeschr_QNAME = new QName("", "ausstatt_beschr");
    private final static QName _Objektbeschreibung_QNAME = new QName("", "objektbeschreibung");
    private final static QName _SonstigeAngaben_QNAME = new QName("", "sonstige_angaben");
    private final static QName _Anhangtitel_QNAME = new QName("", "anhangtitel");
    private final static QName _Format_QNAME = new QName("", "format");
    private final static QName _Anhanginhalt_QNAME = new QName("", "anhanginhalt");
    private final static QName _Pfad_QNAME = new QName("", "pfad");
    private final static QName _ObjektadresseFreigeben_QNAME = new QName("", "objektadresse_freigeben");
    private final static QName _VerfuegbarAb_QNAME = new QName("", "verfuegbar_ab");
    private final static QName _Abdatum_QNAME = new QName("", "abdatum");
    private final static QName _Bisdatum_QNAME = new QName("", "bisdatum");
    private final static QName _Versteigerungstermin_QNAME = new QName("", "versteigerungstermin");
    private final static QName _WbsSozialwohnung_QNAME = new QName("", "wbs_sozialwohnung");
    private final static QName _Vermietet_QNAME = new QName("", "vermietet");
    private final static QName _Anbieternr_QNAME = new QName("", "anbieternr");
    private final static QName _ObjektnrIntern_QNAME = new QName("", "objektnr_intern");
    private final static QName _ObjektnrExtern_QNAME = new QName("", "objektnr_extern");
    private final static QName _Gruppennummer_QNAME = new QName("", "gruppennummer");
    private final static QName _Zugang_QNAME = new QName("", "zugang");
    private final static QName _AktivVon_QNAME = new QName("", "aktiv_von");
    private final static QName _AktivBis_QNAME = new QName("", "aktiv_bis");
    private final static QName _Laufzeit_QNAME = new QName("", "laufzeit");
    private final static QName _MaxPersonen_QNAME = new QName("", "max_personen");
    private final static QName _Nichtraucher_QNAME = new QName("", "nichtraucher");
    private final static QName _Haustiere_QNAME = new QName("", "haustiere");
    private final static QName _Denkmalgeschuetzt_QNAME = new QName("", "denkmalgeschuetzt");
    private final static QName _StandVom_QNAME = new QName("", "stand_vom");
    private final static QName _KennungUrsprung_QNAME = new QName("", "kennung_ursprung");
    private final static QName _OpenimmoObid_QNAME = new QName("", "openimmo_obid");
    private final static QName _WeitergabeGenerell_QNAME = new QName("", "weitergabe_generell");
    private final static QName _WeitergabeNegativ_QNAME = new QName("", "weitergabe_negativ");
    private final static QName _WeitergabePositiv_QNAME = new QName("", "weitergabe_positiv");
    private final static QName _GruppenKennung_QNAME = new QName("", "gruppen_kennung");
    private final static QName _Sprache_QNAME = new QName("", "sprache");
    private final static QName _AlsFerien_QNAME = new QName("", "als_ferien");
    private final static QName _GewerblicheNutzung_QNAME = new QName("", "gewerbliche_nutzung");
    private final static QName _Branchen_QNAME = new QName("", "branchen");
    private final static QName _Hochhaus_QNAME = new QName("", "hochhaus");
    private final static QName _ObjektartZusatz_QNAME = new QName("", "objektart_zusatz");
    private final static QName _Impressum_QNAME = new QName("", "impressum");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.io.openimmo.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ZinshausRenditeobjekt }
     * 
     */
    public ZinshausRenditeobjekt createZinshausRenditeobjekt() {
        return new ZinshausRenditeobjekt();
    }

    /**
     * Create an instance of {@link FreizeitimmobilieGewerblich }
     * 
     */
    public FreizeitimmobilieGewerblich createFreizeitimmobilieGewerblich() {
        return new FreizeitimmobilieGewerblich();
    }

    /**
     * Create an instance of {@link Sonstige }
     * 
     */
    public Sonstige createSonstige() {
        return new Sonstige();
    }

    /**
     * Create an instance of {@link Parken }
     * 
     */
    public Parken createParken() {
        return new Parken();
    }

    /**
     * Create an instance of {@link LandUndForstwirtschaft }
     * 
     */
    public LandUndForstwirtschaft createLandUndForstwirtschaft() {
        return new LandUndForstwirtschaft();
    }

    /**
     * Create an instance of {@link HallenLagerProd }
     * 
     */
    public HallenLagerProd createHallenLagerProd() {
        return new HallenLagerProd();
    }

    /**
     * Create an instance of {@link Gastgewerbe }
     * 
     */
    public Gastgewerbe createGastgewerbe() {
        return new Gastgewerbe();
    }

    /**
     * Create an instance of {@link Einzelhandel }
     * 
     */
    public Einzelhandel createEinzelhandel() {
        return new Einzelhandel();
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
     * Create an instance of {@link Haus }
     * 
     */
    public Haus createHaus() {
        return new Haus();
    }

    /**
     * Create an instance of {@link Wohnung }
     * 
     */
    public Wohnung createWohnung() {
        return new Wohnung();
    }

    /**
     * Create an instance of {@link Zimmer }
     * 
     */
    public Zimmer createZimmer() {
        return new Zimmer();
    }

    /**
     * Create an instance of {@link Aktion }
     * 
     */
    public Aktion createAktion() {
        return new Aktion();
    }

    /**
     * Create an instance of {@link Geschlecht }
     * 
     */
    public Geschlecht createGeschlecht() {
        return new Geschlecht();
    }

    /**
     * Create an instance of {@link MaxMietdauer }
     * 
     */
    public MaxMietdauer createMaxMietdauer() {
        return new MaxMietdauer();
    }

    /**
     * Create an instance of {@link MinMietdauer }
     * 
     */
    public MinMietdauer createMinMietdauer() {
        return new MinMietdauer();
    }

    /**
     * Create an instance of {@link Check }
     * 
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link Foto }
     * 
     */
    public Foto createFoto() {
        return new Foto();
    }

    /**
     * Create an instance of {@link Anhang }
     * 
     */
    public Anhang createAnhang() {
        return new Anhang();
    }

    /**
     * Create an instance of {@link DistanzenSport }
     * 
     */
    public DistanzenSport createDistanzenSport() {
        return new DistanzenSport();
    }

    /**
     * Create an instance of {@link Distanzen }
     * 
     */
    public Distanzen createDistanzen() {
        return new Distanzen();
    }

    /**
     * Create an instance of {@link Ausblick }
     * 
     */
    public Ausblick createAusblick() {
        return new Ausblick();
    }

    /**
     * Create an instance of {@link Verkaufstatus }
     * 
     */
    public Verkaufstatus createVerkaufstatus() {
        return new Verkaufstatus();
    }

    /**
     * Create an instance of {@link Energiepass }
     * 
     */
    public Energiepass createEnergiepass() {
        return new Energiepass();
    }

    /**
     * Create an instance of {@link ErschliessungUmfang }
     * 
     */
    public ErschliessungUmfang createErschliessungUmfang() {
        return new ErschliessungUmfang();
    }

    /**
     * Create an instance of {@link Erschliessung }
     * 
     */
    public Erschliessung createErschliessung() {
        return new Erschliessung();
    }

    /**
     * Create an instance of {@link BebaubarNach }
     * 
     */
    public BebaubarNach createBebaubarNach() {
        return new BebaubarNach();
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
     * Create an instance of {@link Unterkellert }
     * 
     */
    public Unterkellert createUnterkellert() {
        return new Unterkellert();
    }

    /**
     * Create an instance of {@link Moebliert }
     * 
     */
    public Moebliert createMoebliert() {
        return new Moebliert();
    }

    /**
     * Create an instance of {@link MieteinnahmenSoll }
     * 
     */
    public MieteinnahmenSoll createMieteinnahmenSoll() {
        return new MieteinnahmenSoll();
    }

    /**
     * Create an instance of {@link MieteinnahmenIst }
     * 
     */
    public MieteinnahmenIst createMieteinnahmenIst() {
        return new MieteinnahmenIst();
    }

    /**
     * Create an instance of {@link ProvisionTeilen }
     * 
     */
    public ProvisionTeilen createProvisionTeilen() {
        return new ProvisionTeilen();
    }

    /**
     * Create an instance of {@link StpSonstige }
     * 
     */
    public StpSonstige createStpSonstige() {
        return new StpSonstige();
    }

    /**
     * Create an instance of {@link PreisZeiteinheit }
     * 
     */
    public PreisZeiteinheit createPreisZeiteinheit() {
        return new PreisZeiteinheit();
    }

    /**
     * Create an instance of {@link TelSonstige }
     * 
     */
    public TelSonstige createTelSonstige() {
        return new TelSonstige();
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
     * Create an instance of {@link Uebertragung }
     * 
     */
    public Uebertragung createUebertragung() {
        return new Uebertragung();
    }

    /**
     * Create an instance of {@link Interessent }
     * 
     */
    public Interessent createInteressent() {
        return new Interessent();
    }

    /**
     * Create an instance of {@link UserDefinedExtend }
     * 
     */
    public UserDefinedExtend createUserDefinedExtend() {
        return new UserDefinedExtend();
    }

    /**
     * Create an instance of {@link Bewertung }
     * 
     */
    public Bewertung createBewertung() {
        return new Bewertung();
    }

    /**
     * Create an instance of {@link Fehlerliste }
     * 
     */
    public Fehlerliste createFehlerliste() {
        return new Fehlerliste();
    }

    /**
     * Create an instance of {@link OpenimmoFeedback }
     * 
     */
    public OpenimmoFeedback createOpenimmoFeedback() {
        return new OpenimmoFeedback();
    }

    /**
     * Create an instance of {@link Sender }
     * 
     */
    public Sender createSender() {
        return new Sender();
    }

    /**
     * Create an instance of {@link Objekt }
     * 
     */
    public Objekt createObjekt() {
        return new Objekt();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link Openimmo }
     * 
     */
    public Openimmo createOpenimmo() {
        return new Openimmo();
    }

    /**
     * Create an instance of {@link Anbieter }
     * 
     */
    public Anbieter createAnbieter() {
        return new Anbieter();
    }

    /**
     * Create an instance of {@link Immobilie }
     * 
     */
    public Immobilie createImmobilie() {
        return new Immobilie();
    }

    /**
     * Create an instance of {@link Objektkategorie }
     * 
     */
    public Objektkategorie createObjektkategorie() {
        return new Objektkategorie();
    }

    /**
     * Create an instance of {@link Geo }
     * 
     */
    public Geo createGeo() {
        return new Geo();
    }

    /**
     * Create an instance of {@link Kontaktperson }
     * 
     */
    public Kontaktperson createKontaktperson() {
        return new Kontaktperson();
    }

    /**
     * Create an instance of {@link WeitereAdresse }
     * 
     */
    public WeitereAdresse createWeitereAdresse() {
        return new WeitereAdresse();
    }

    /**
     * Create an instance of {@link Preise }
     * 
     */
    public Preise createPreise() {
        return new Preise();
    }

    /**
     * Create an instance of {@link Bieterverfahren }
     * 
     */
    public Bieterverfahren createBieterverfahren() {
        return new Bieterverfahren();
    }

    /**
     * Create an instance of {@link Versteigerung }
     * 
     */
    public Versteigerung createVersteigerung() {
        return new Versteigerung();
    }

    /**
     * Create an instance of {@link Flaechen }
     * 
     */
    public Flaechen createFlaechen() {
        return new Flaechen();
    }

    /**
     * Create an instance of {@link Ausstattung }
     * 
     */
    public Ausstattung createAusstattung() {
        return new Ausstattung();
    }

    /**
     * Create an instance of {@link ZustandAngaben }
     * 
     */
    public ZustandAngaben createZustandAngaben() {
        return new ZustandAngaben();
    }

    /**
     * Create an instance of {@link Infrastruktur }
     * 
     */
    public Infrastruktur createInfrastruktur() {
        return new Infrastruktur();
    }

    /**
     * Create an instance of {@link Freitexte }
     * 
     */
    public Freitexte createFreitexte() {
        return new Freitexte();
    }

    /**
     * Create an instance of {@link Anhaenge }
     * 
     */
    public Anhaenge createAnhaenge() {
        return new Anhaenge();
    }

    /**
     * Create an instance of {@link VerwaltungObjekt }
     * 
     */
    public VerwaltungObjekt createVerwaltungObjekt() {
        return new VerwaltungObjekt();
    }

    /**
     * Create an instance of {@link VerwaltungTechn }
     * 
     */
    public VerwaltungTechn createVerwaltungTechn() {
        return new VerwaltungTechn();
    }

    /**
     * Create an instance of {@link Geokoordinaten }
     * 
     */
    public Geokoordinaten createGeokoordinaten() {
        return new Geokoordinaten();
    }

    /**
     * Create an instance of {@link LageImBau }
     * 
     */
    public LageImBau createLageImBau() {
        return new LageImBau();
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
     * Create an instance of {@link Nutzungsart }
     * 
     */
    public Nutzungsart createNutzungsart() {
        return new Nutzungsart();
    }

    /**
     * Create an instance of {@link Hauptmietzinsnetto }
     * 
     */
    public Hauptmietzinsnetto createHauptmietzinsnetto() {
        return new Hauptmietzinsnetto();
    }

    /**
     * Create an instance of {@link Betriebskostennetto }
     * 
     */
    public Betriebskostennetto createBetriebskostennetto() {
        return new Betriebskostennetto();
    }

    /**
     * Create an instance of {@link Evbnetto }
     * 
     */
    public Evbnetto createEvbnetto() {
        return new Evbnetto();
    }

    /**
     * Create an instance of {@link Gesamtmietenetto }
     * 
     */
    public Gesamtmietenetto createGesamtmietenetto() {
        return new Gesamtmietenetto();
    }

    /**
     * Create an instance of {@link Gesamtbelastungnetto }
     * 
     */
    public Gesamtbelastungnetto createGesamtbelastungnetto() {
        return new Gesamtbelastungnetto();
    }

    /**
     * Create an instance of {@link Gesamtkostenprom2Von }
     * 
     */
    public Gesamtkostenprom2Von createGesamtkostenprom2Von() {
        return new Gesamtkostenprom2Von();
    }

    /**
     * Create an instance of {@link Heizkostennetto }
     * 
     */
    public Heizkostennetto createHeizkostennetto() {
        return new Heizkostennetto();
    }

    /**
     * Create an instance of {@link Kaufpreisnetto }
     * 
     */
    public Kaufpreisnetto createKaufpreisnetto() {
        return new Kaufpreisnetto();
    }

    /**
     * Create an instance of {@link Monatlichekostennetto }
     * 
     */
    public Monatlichekostennetto createMonatlichekostennetto() {
        return new Monatlichekostennetto();
    }

    /**
     * Create an instance of {@link Nebenkostenprom2Von }
     * 
     */
    public Nebenkostenprom2Von createNebenkostenprom2Von() {
        return new Nebenkostenprom2Von();
    }

    /**
     * Create an instance of {@link Nettomieteprom2Von }
     * 
     */
    public Nettomieteprom2Von createNettomieteprom2Von() {
        return new Nettomieteprom2Von();
    }

    /**
     * Create an instance of {@link Provisionnetto }
     * 
     */
    public Provisionnetto createProvisionnetto() {
        return new Provisionnetto();
    }

    /**
     * Create an instance of {@link Ruecklagenetto }
     * 
     */
    public Ruecklagenetto createRuecklagenetto() {
        return new Ruecklagenetto();
    }

    /**
     * Create an instance of {@link Sonstigekostennetto }
     * 
     */
    public Sonstigekostennetto createSonstigekostennetto() {
        return new Sonstigekostennetto();
    }

    /**
     * Create an instance of {@link Sonstigemietenetto }
     * 
     */
    public Sonstigemietenetto createSonstigemietenetto() {
        return new Sonstigemietenetto();
    }

    /**
     * Create an instance of {@link Summemietenetto }
     * 
     */
    public Summemietenetto createSummemietenetto() {
        return new Summemietenetto();
    }

    /**
     * Create an instance of {@link Kaufpreis }
     * 
     */
    public Kaufpreis createKaufpreis() {
        return new Kaufpreis();
    }

    /**
     * Create an instance of {@link Stellplatz }
     * 
     */
    public Stellplatz createStellplatz() {
        return new Stellplatz();
    }

    /**
     * Create an instance of {@link AussenCourtage }
     * 
     */
    public AussenCourtage createAussenCourtage() {
        return new AussenCourtage();
    }

    /**
     * Create an instance of {@link InnenCourtage }
     * 
     */
    public InnenCourtage createInnenCourtage() {
        return new InnenCourtage();
    }

    /**
     * Create an instance of {@link Bad }
     * 
     */
    public Bad createBad() {
        return new Bad();
    }

    /**
     * Create an instance of {@link Kueche }
     * 
     */
    public Kueche createKueche() {
        return new Kueche();
    }

    /**
     * Create an instance of {@link Boden }
     * 
     */
    public Boden createBoden() {
        return new Boden();
    }

    /**
     * Create an instance of {@link Heizungsart }
     * 
     */
    public Heizungsart createHeizungsart() {
        return new Heizungsart();
    }

    /**
     * Create an instance of {@link Befeuerung }
     * 
     */
    public Befeuerung createBefeuerung() {
        return new Befeuerung();
    }

    /**
     * Create an instance of {@link Fahrstuhl }
     * 
     */
    public Fahrstuhl createFahrstuhl() {
        return new Fahrstuhl();
    }

    /**
     * Create an instance of {@link Stellplatzart }
     * 
     */
    public Stellplatzart createStellplatzart() {
        return new Stellplatzart();
    }

    /**
     * Create an instance of {@link AusrichtBalkonTerrasse }
     * 
     */
    public AusrichtBalkonTerrasse createAusrichtBalkonTerrasse() {
        return new AusrichtBalkonTerrasse();
    }

    /**
     * Create an instance of {@link AngeschlGastronomie }
     * 
     */
    public AngeschlGastronomie createAngeschlGastronomie() {
        return new AngeschlGastronomie();
    }

    /**
     * Create an instance of {@link Serviceleistungen }
     * 
     */
    public Serviceleistungen createServiceleistungen() {
        return new Serviceleistungen();
    }

    /**
     * Create an instance of {@link BreitbandZugang }
     * 
     */
    public BreitbandZugang createBreitbandZugang() {
        return new BreitbandZugang();
    }

    /**
     * Create an instance of {@link Sicherheitstechnik }
     * 
     */
    public Sicherheitstechnik createSicherheitstechnik() {
        return new Sicherheitstechnik();
    }

    /**
     * Create an instance of {@link Dachform }
     * 
     */
    public Dachform createDachform() {
        return new Dachform();
    }

    /**
     * Create an instance of {@link Bauweise }
     * 
     */
    public Bauweise createBauweise() {
        return new Bauweise();
    }

    /**
     * Create an instance of {@link Ausbaustufe }
     * 
     */
    public Ausbaustufe createAusbaustufe() {
        return new Ausbaustufe();
    }

    /**
     * Create an instance of {@link Energietyp }
     * 
     */
    public Energietyp createEnergietyp() {
        return new Energietyp();
    }

    /**
     * Create an instance of {@link ObjektText }
     * 
     */
    public ObjektText createObjektText() {
        return new ObjektText();
    }

    /**
     * Create an instance of {@link Daten }
     * 
     */
    public Daten createDaten() {
        return new Daten();
    }

    /**
     * Create an instance of {@link Master }
     * 
     */
    public Master createMaster() {
        return new Master();
    }

    /**
     * Create an instance of {@link UserDefinedSimplefield }
     * 
     */
    public UserDefinedSimplefield createUserDefinedSimplefield() {
        return new UserDefinedSimplefield();
    }

    /**
     * Create an instance of {@link UserDefinedAnyfield }
     * 
     */
    public UserDefinedAnyfield createUserDefinedAnyfield() {
        return new UserDefinedAnyfield();
    }

    /**
     * Create an instance of {@link ImpressumStrukt }
     * 
     */
    public ImpressumStrukt createImpressumStrukt() {
        return new ImpressumStrukt();
    }

    /**
     * Create an instance of {@link Waehrung }
     * 
     */
    public Waehrung createWaehrung() {
        return new Waehrung();
    }

    /**
     * Create an instance of {@link Land }
     * 
     */
    public Land createLand() {
        return new Land();
    }

    /**
     * Create an instance of {@link UserDefinedExtend.Feld }
     * 
     */
    public UserDefinedExtend.Feld createUserDefinedExtendFeld() {
        return new UserDefinedExtend.Feld();
    }

    /**
     * Create an instance of {@link Bewertung.Feld }
     * 
     */
    public Bewertung.Feld createBewertungFeld() {
        return new Bewertung.Feld();
    }

    /**
     * Create an instance of {@link Fehlerliste.Fehler }
     * 
     */
    public Fehlerliste.Fehler createFehlerlisteFehler() {
        return new Fehlerliste.Fehler();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "openimmo_anid")
    public JAXBElement<String> createOpenimmoAnid(String value) {
        return new JAXBElement<String>(_OpenimmoAnid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lizenzkennung")
    public JAXBElement<String> createLizenzkennung(String value) {
        return new JAXBElement<String>(_Lizenzkennung_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "strasse")
    public JAXBElement<String> createStrasse(String value) {
        return new JAXBElement<String>(_Strasse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hausnummer")
    public JAXBElement<String> createHausnummer(String value) {
        return new JAXBElement<String>(_Hausnummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "plz")
    public JAXBElement<String> createPlz(String value) {
        return new JAXBElement<String>(_Plz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ort")
    public JAXBElement<String> createOrt(String value) {
        return new JAXBElement<String>(_Ort_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bundesland")
    public JAXBElement<String> createBundesland(String value) {
        return new JAXBElement<String>(_Bundesland_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gemeindecode")
    public JAXBElement<String> createGemeindecode(String value) {
        return new JAXBElement<String>(_Gemeindecode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flur")
    public JAXBElement<String> createFlur(String value) {
        return new JAXBElement<String>(_Flur_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flurstueck")
    public JAXBElement<String> createFlurstueck(String value) {
        return new JAXBElement<String>(_Flurstueck_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gemarkung")
    public JAXBElement<String> createGemarkung(String value) {
        return new JAXBElement<String>(_Gemarkung_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "etage")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<BigInteger> createEtage(BigInteger value) {
        return new JAXBElement<BigInteger>(_Etage_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_etagen")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<BigInteger> createAnzahlEtagen(BigInteger value) {
        return new JAXBElement<BigInteger>(_AnzahlEtagen_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wohnungsnr")
    public JAXBElement<String> createWohnungsnr(String value) {
        return new JAXBElement<String>(_Wohnungsnr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "regionaler_zusatz")
    public JAXBElement<String> createRegionalerZusatz(String value) {
        return new JAXBElement<String>(_RegionalerZusatz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "karten_makro")
    public JAXBElement<Boolean> createKartenMakro(Boolean value) {
        return new JAXBElement<Boolean>(_KartenMakro_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "karten_mikro")
    public JAXBElement<Boolean> createKartenMikro(Boolean value) {
        return new JAXBElement<Boolean>(_KartenMikro_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "virtuelletour")
    public JAXBElement<Boolean> createVirtuelletour(Boolean value) {
        return new JAXBElement<Boolean>(_Virtuelletour_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "luftbildern")
    public JAXBElement<Boolean> createLuftbildern(Boolean value) {
        return new JAXBElement<Boolean>(_Luftbildern_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "referenz_id")
    public JAXBElement<String> createReferenzId(String value) {
        return new JAXBElement<String>(_ReferenzId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vorname")
    public JAXBElement<String> createVorname(String value) {
        return new JAXBElement<String>(_Vorname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "titel")
    public JAXBElement<String> createTitel(String value) {
        return new JAXBElement<String>(_Titel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anrede")
    public JAXBElement<String> createAnrede(String value) {
        return new JAXBElement<String>(_Anrede_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "position")
    public JAXBElement<String> createPosition(String value) {
        return new JAXBElement<String>(_Position_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anrede_brief")
    public JAXBElement<String> createAnredeBrief(String value) {
        return new JAXBElement<String>(_AnredeBrief_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "firma")
    public JAXBElement<String> createFirma(String value) {
        return new JAXBElement<String>(_Firma_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zusatzfeld")
    public JAXBElement<String> createZusatzfeld(String value) {
        return new JAXBElement<String>(_Zusatzfeld_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postfach")
    public JAXBElement<String> createPostfach(String value) {
        return new JAXBElement<String>(_Postfach_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postf_plz")
    public JAXBElement<String> createPostfPlz(String value) {
        return new JAXBElement<String>(_PostfPlz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postf_ort")
    public JAXBElement<String> createPostfOrt(String value) {
        return new JAXBElement<String>(_PostfOrt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email_direkt")
    public JAXBElement<String> createEmailDirekt(String value) {
        return new JAXBElement<String>(_EmailDirekt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email_zentrale")
    public JAXBElement<String> createEmailZentrale(String value) {
        return new JAXBElement<String>(_EmailZentrale_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email_privat")
    public JAXBElement<String> createEmailPrivat(String value) {
        return new JAXBElement<String>(_EmailPrivat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email_feedback")
    public JAXBElement<String> createEmailFeedback(String value) {
        return new JAXBElement<String>(_EmailFeedback_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tel_zentrale")
    public JAXBElement<String> createTelZentrale(String value) {
        return new JAXBElement<String>(_TelZentrale_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tel_durchw")
    public JAXBElement<String> createTelDurchw(String value) {
        return new JAXBElement<String>(_TelDurchw_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tel_privat")
    public JAXBElement<String> createTelPrivat(String value) {
        return new JAXBElement<String>(_TelPrivat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tel_handy")
    public JAXBElement<String> createTelHandy(String value) {
        return new JAXBElement<String>(_TelHandy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tel_fax")
    public JAXBElement<String> createTelFax(String value) {
        return new JAXBElement<String>(_TelFax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "adressfreigabe")
    public JAXBElement<Boolean> createAdressfreigabe(Boolean value) {
        return new JAXBElement<Boolean>(_Adressfreigabe_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personennummer")
    public JAXBElement<String> createPersonennummer(String value) {
        return new JAXBElement<String>(_Personennummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "immobilientreuhaenderid")
    public JAXBElement<String> createImmobilientreuhaenderid(String value) {
        return new JAXBElement<String>(_Immobilientreuhaenderid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "freitextfeld")
    public JAXBElement<String> createFreitextfeld(String value) {
        return new JAXBElement<String>(_Freitextfeld_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pauschalmiete")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createPauschalmiete(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Pauschalmiete_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flaechevon")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createFlaechevon(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Flaechevon_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flaechebis")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createFlaechebis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Flaechebis_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gesamtmietebrutto")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createGesamtmietebrutto(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Gesamtmietebrutto_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gesamtbelastungbrutto")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createGesamtbelastungbrutto(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Gesamtbelastungbrutto_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kaufpreisbrutto")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createKaufpreisbrutto(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Kaufpreisbrutto_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "monatlichekostenbrutto")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createMonatlichekostenbrutto(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Monatlichekostenbrutto_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provisionbrutto")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createProvisionbrutto(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Provisionbrutto_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "richtpreisprom2")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createRichtpreisprom2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Richtpreisprom2_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nettokaltmiete")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createNettokaltmiete(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Nettokaltmiete_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kaltmiete")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createKaltmiete(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Kaltmiete_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nebenkosten")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createNebenkosten(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Nebenkosten_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "warmmiete")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createWarmmiete(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Warmmiete_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "heizkosten_enthalten")
    public JAXBElement<Boolean> createHeizkostenEnthalten(Boolean value) {
        return new JAXBElement<Boolean>(_HeizkostenEnthalten_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "heizkosten")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createHeizkosten(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Heizkosten_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zzg_mehrwertsteuer")
    public JAXBElement<Boolean> createZzgMehrwertsteuer(Boolean value) {
        return new JAXBElement<Boolean>(_ZzgMehrwertsteuer_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mietzuschlaege")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createMietzuschlaege(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Mietzuschlaege_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pacht")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createPacht(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Pacht_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "erbpacht")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createErbpacht(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Erbpacht_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hausgeld")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createHausgeld(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Hausgeld_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "abstand")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAbstand(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Abstand_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "preis_zeitraum_von")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Calendar> createPreisZeitraumVon(Calendar value) {
        return new JAXBElement<Calendar>(_PreisZeitraumVon_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "preis_zeitraum_bis")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Calendar> createPreisZeitraumBis(Calendar value) {
        return new JAXBElement<Calendar>(_PreisZeitraumBis_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mietpreis_pro_qm")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createMietpreisProQm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MietpreisProQm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kaufpreis_pro_qm")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createKaufpreisProQm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_KaufpreisProQm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "richtpreis")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createRichtpreis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Richtpreis_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stellplatz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stp_freiplatz")
    public JAXBElement<Stellplatz> createStpFreiplatz(Stellplatz value) {
        return new JAXBElement<Stellplatz>(_StpFreiplatz_QNAME, Stellplatz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stellplatz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stp_tiefgarage")
    public JAXBElement<Stellplatz> createStpTiefgarage(Stellplatz value) {
        return new JAXBElement<Stellplatz>(_StpTiefgarage_QNAME, Stellplatz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stellplatz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stp_garage")
    public JAXBElement<Stellplatz> createStpGarage(Stellplatz value) {
        return new JAXBElement<Stellplatz>(_StpGarage_QNAME, Stellplatz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stellplatz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stp_carport")
    public JAXBElement<Stellplatz> createStpCarport(Stellplatz value) {
        return new JAXBElement<Stellplatz>(_StpCarport_QNAME, Stellplatz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stellplatz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stp_duplex")
    public JAXBElement<Stellplatz> createStpDuplex(Stellplatz value) {
        return new JAXBElement<Stellplatz>(_StpDuplex_QNAME, Stellplatz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stellplatz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stp_parkhaus")
    public JAXBElement<Stellplatz> createStpParkhaus(Stellplatz value) {
        return new JAXBElement<Stellplatz>(_StpParkhaus_QNAME, Stellplatz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provisionspflichtig")
    public JAXBElement<Boolean> createProvisionspflichtig(Boolean value) {
        return new JAXBElement<Boolean>(_Provisionspflichtig_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "courtage_hinweis")
    public JAXBElement<String> createCourtageHinweis(String value) {
        return new JAXBElement<String>(_CourtageHinweis_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mwst_satz")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createMwstSatz(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MwstSatz_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mwst_gesamt")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createMwstGesamt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MwstGesamt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "freitext_preis")
    public JAXBElement<String> createFreitextPreis(String value) {
        return new JAXBElement<String>(_FreitextPreis_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "x_fache")
    public JAXBElement<String> createXFache(String value) {
        return new JAXBElement<String>(_XFache_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nettorendite")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createNettorendite(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Nettorendite_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nettorendite_ist")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createNettorenditeIst(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NettorenditeIst_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nettorendite_soll")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createNettorenditeSoll(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NettorenditeSoll_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "erschliessungskosten")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createErschliessungskosten(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Erschliessungskosten_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kaution")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createKaution(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Kaution_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kaution_text")
    public JAXBElement<String> createKautionText(String value) {
        return new JAXBElement<String>(_KautionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "geschaeftsguthaben")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createGeschaeftsguthaben(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Geschaeftsguthaben_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wohnflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createWohnflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Wohnflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nutzflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createNutzflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Nutzflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gesamtflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createGesamtflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Gesamtflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ladenflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createLadenflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Ladenflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lagerflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createLagerflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Lagerflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "verkaufsflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createVerkaufsflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Verkaufsflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "freiflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createFreiflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Freiflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bueroflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createBueroflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Bueroflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bueroteilflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createBueroteilflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Bueroteilflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fensterfront")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createFensterfront(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Fensterfront_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sonstflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createSonstflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Sonstflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "verwaltungsflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createVerwaltungsflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Verwaltungsflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gastroflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createGastroflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Gastroflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "grz")
    public JAXBElement<String> createGrz(String value) {
        return new JAXBElement<String>(_Grz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gfz")
    public JAXBElement<String> createGfz(String value) {
        return new JAXBElement<String>(_Gfz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bmz")
    public JAXBElement<String> createBmz(String value) {
        return new JAXBElement<String>(_Bmz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bgf")
    public JAXBElement<String> createBgf(String value) {
        return new JAXBElement<String>(_Bgf_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "grundstuecksflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createGrundstuecksflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Grundstuecksflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_zimmer")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAnzahlZimmer(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AnzahlZimmer_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_schlafzimmer")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAnzahlSchlafzimmer(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AnzahlSchlafzimmer_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_badezimmer")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAnzahlBadezimmer(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AnzahlBadezimmer_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_sep_wc")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAnzahlSepWc(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AnzahlSepWc_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "balkon_terrasse_flaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createBalkonTerrasseFlaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BalkonTerrasseFlaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_wohn_schlafzimmer")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAnzahlWohnSchlafzimmer(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AnzahlWohnSchlafzimmer_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gartenflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createGartenflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Gartenflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_balkon_terrassen")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAnzahlBalkonTerrassen(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AnzahlBalkonTerrassen_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_balkone")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAnzahlBalkone(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AnzahlBalkone_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_terrassen")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAnzahlTerrassen(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AnzahlTerrassen_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_logia")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAnzahlLogia(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AnzahlLogia_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kellerflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createKellerflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Kellerflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fensterfront_qm")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createFensterfrontQm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FensterfrontQm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "grundstuecksfront")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createGrundstuecksfront(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Grundstuecksfront_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dachbodenflaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createDachbodenflaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Dachbodenflaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "teilbar_ab")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createTeilbarAb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TeilbarAb_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "beheizbare_flaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createBeheizbareFlaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BeheizbareFlaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_stellplaetze")
    @XmlJavaTypeAdapter(Adapter6 .class)
    public JAXBElement<BigInteger> createAnzahlStellplaetze(BigInteger value) {
        return new JAXBElement<BigInteger>(_AnzahlStellplaetze_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "plaetze_gastraum")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createPlaetzeGastraum(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PlaetzeGastraum_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_betten")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAnzahlBetten(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AnzahlBetten_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_tagungsraeume")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAnzahlTagungsraeume(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AnzahlTagungsraeume_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vermietbare_flaeche")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createVermietbareFlaeche(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_VermietbareFlaeche_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_wohneinheiten")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAnzahlWohneinheiten(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AnzahlWohneinheiten_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anzahl_gewerbeeinheiten")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAnzahlGewerbeeinheiten(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AnzahlGewerbeeinheiten_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "einliegerwohnung")
    public JAXBElement<Boolean> createEinliegerwohnung(Boolean value) {
        return new JAXBElement<Boolean>(_Einliegerwohnung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kubatur")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createKubatur(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Kubatur_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ausnuetzungsziffer")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createAusnuetzungsziffer(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Ausnuetzungsziffer_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "beginn_angebotsphase")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Calendar> createBeginnAngebotsphase(Calendar value) {
        return new JAXBElement<Calendar>(_BeginnAngebotsphase_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "besichtigungstermin")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Calendar> createBesichtigungstermin(Calendar value) {
        return new JAXBElement<Calendar>(_Besichtigungstermin_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "besichtigungstermin_2")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Calendar> createBesichtigungstermin2(Calendar value) {
        return new JAXBElement<Calendar>(_Besichtigungstermin2_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "beginn_bietzeit")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Calendar> createBeginnBietzeit(Calendar value) {
        return new JAXBElement<Calendar>(_BeginnBietzeit_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ende_bietzeit")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Calendar> createEndeBietzeit(Calendar value) {
        return new JAXBElement<Calendar>(_EndeBietzeit_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hoechstgebot_zeigen")
    public JAXBElement<Boolean> createHoechstgebotZeigen(Boolean value) {
        return new JAXBElement<Boolean>(_HoechstgebotZeigen_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mindestpreis")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createMindestpreis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Mindestpreis_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zwangsversteigerung")
    public JAXBElement<Boolean> createZwangsversteigerung(Boolean value) {
        return new JAXBElement<Boolean>(_Zwangsversteigerung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "aktenzeichen")
    public JAXBElement<String> createAktenzeichen(String value) {
        return new JAXBElement<String>(_Aktenzeichen_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zvtermin")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Calendar> createZvtermin(Calendar value) {
        return new JAXBElement<Calendar>(_Zvtermin_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zusatztermin")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Calendar> createZusatztermin(Calendar value) {
        return new JAXBElement<Calendar>(_Zusatztermin_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "amtsgericht")
    public JAXBElement<String> createAmtsgericht(String value) {
        return new JAXBElement<String>(_Amtsgericht_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "verkehrswert")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createVerkehrswert(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Verkehrswert_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wg_geeignet")
    public JAXBElement<Boolean> createWgGeeignet(Boolean value) {
        return new JAXBElement<Boolean>(_WgGeeignet_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AusstattKategorie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ausstatt_kategorie")
    public JAXBElement<AusstattKategorie> createAusstattKategorie(AusstattKategorie value) {
        return new JAXBElement<AusstattKategorie>(_AusstattKategorie_QNAME, AusstattKategorie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "raeume_veraenderbar")
    public JAXBElement<Boolean> createRaeumeVeraenderbar(Boolean value) {
        return new JAXBElement<Boolean>(_RaeumeVeraenderbar_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kamin")
    public JAXBElement<Boolean> createKamin(Boolean value) {
        return new JAXBElement<Boolean>(_Kamin_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "klimatisiert")
    public JAXBElement<Boolean> createKlimatisiert(Boolean value) {
        return new JAXBElement<Boolean>(_Klimatisiert_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gartennutzung")
    public JAXBElement<Boolean> createGartennutzung(Boolean value) {
        return new JAXBElement<Boolean>(_Gartennutzung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rollstuhlgerecht")
    public JAXBElement<Boolean> createRollstuhlgerecht(Boolean value) {
        return new JAXBElement<Boolean>(_Rollstuhlgerecht_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kabel_sat_tv")
    public JAXBElement<Boolean> createKabelSatTv(Boolean value) {
        return new JAXBElement<Boolean>(_KabelSatTv_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dvbt")
    public JAXBElement<Boolean> createDvbt(Boolean value) {
        return new JAXBElement<Boolean>(_Dvbt_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "barrierefrei")
    public JAXBElement<Boolean> createBarrierefrei(Boolean value) {
        return new JAXBElement<Boolean>(_Barrierefrei_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sauna")
    public JAXBElement<Boolean> createSauna(Boolean value) {
        return new JAXBElement<Boolean>(_Sauna_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "swimmingpool")
    public JAXBElement<Boolean> createSwimmingpool(Boolean value) {
        return new JAXBElement<Boolean>(_Swimmingpool_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wasch_trockenraum")
    public JAXBElement<Boolean> createWaschTrockenraum(Boolean value) {
        return new JAXBElement<Boolean>(_WaschTrockenraum_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wintergarten")
    public JAXBElement<Boolean> createWintergarten(Boolean value) {
        return new JAXBElement<Boolean>(_Wintergarten_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dv_verkabelung")
    public JAXBElement<Boolean> createDvVerkabelung(Boolean value) {
        return new JAXBElement<Boolean>(_DvVerkabelung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rampe")
    public JAXBElement<Boolean> createRampe(Boolean value) {
        return new JAXBElement<Boolean>(_Rampe_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hebebuehne")
    public JAXBElement<Boolean> createHebebuehne(Boolean value) {
        return new JAXBElement<Boolean>(_Hebebuehne_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kran")
    public JAXBElement<Boolean> createKran(Boolean value) {
        return new JAXBElement<Boolean>(_Kran_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gastterrasse")
    public JAXBElement<Boolean> createGastterrasse(Boolean value) {
        return new JAXBElement<Boolean>(_Gastterrasse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stromanschlusswert")
    public JAXBElement<String> createStromanschlusswert(String value) {
        return new JAXBElement<String>(_Stromanschlusswert_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kantine_cafeteria")
    public JAXBElement<Boolean> createKantineCafeteria(Boolean value) {
        return new JAXBElement<Boolean>(_KantineCafeteria_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "teekueche")
    public JAXBElement<Boolean> createTeekueche(Boolean value) {
        return new JAXBElement<Boolean>(_Teekueche_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hallenhoehe")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createHallenhoehe(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Hallenhoehe_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "brauereibindung")
    public JAXBElement<Boolean> createBrauereibindung(Boolean value) {
        return new JAXBElement<Boolean>(_Brauereibindung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sporteinrichtungen")
    public JAXBElement<Boolean> createSporteinrichtungen(Boolean value) {
        return new JAXBElement<Boolean>(_Sporteinrichtungen_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wellnessbereich")
    public JAXBElement<Boolean> createWellnessbereich(Boolean value) {
        return new JAXBElement<Boolean>(_Wellnessbereich_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "telefon_ferienimmobilie")
    public JAXBElement<Boolean> createTelefonFerienimmobilie(Boolean value) {
        return new JAXBElement<Boolean>(_TelefonFerienimmobilie_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "umts_empfang")
    public JAXBElement<Boolean> createUmtsEmpfang(Boolean value) {
        return new JAXBElement<Boolean>(_UmtsEmpfang_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "abstellraum")
    public JAXBElement<Boolean> createAbstellraum(Boolean value) {
        return new JAXBElement<Boolean>(_Abstellraum_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fahrradraum")
    public JAXBElement<Boolean> createFahrradraum(Boolean value) {
        return new JAXBElement<Boolean>(_Fahrradraum_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rolladen")
    public JAXBElement<Boolean> createRolladen(Boolean value) {
        return new JAXBElement<Boolean>(_Rolladen_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bibliothek")
    public JAXBElement<Boolean> createBibliothek(Boolean value) {
        return new JAXBElement<Boolean>(_Bibliothek_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dachboden")
    public JAXBElement<Boolean> createDachboden(Boolean value) {
        return new JAXBElement<Boolean>(_Dachboden_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gaestewc")
    public JAXBElement<Boolean> createGaestewc(Boolean value) {
        return new JAXBElement<Boolean>(_Gaestewc_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kabelkanaele")
    public JAXBElement<Boolean> createKabelkanaele(Boolean value) {
        return new JAXBElement<Boolean>(_Kabelkanaele_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "seniorengerecht")
    public JAXBElement<Boolean> createSeniorengerecht(Boolean value) {
        return new JAXBElement<Boolean>(_Seniorengerecht_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "baujahr")
    public JAXBElement<String> createBaujahr(String value) {
        return new JAXBElement<String>(_Baujahr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "letztemodernisierung")
    public JAXBElement<String> createLetztemodernisierung(String value) {
        return new JAXBElement<String>(_Letztemodernisierung_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bauzone")
    public JAXBElement<String> createBauzone(String value) {
        return new JAXBElement<String>(_Bauzone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "altlasten")
    public JAXBElement<String> createAltlasten(String value) {
        return new JAXBElement<String>(_Altlasten_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zulieferung")
    public JAXBElement<Boolean> createZulieferung(Boolean value) {
        return new JAXBElement<Boolean>(_Zulieferung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "objekttitel")
    public JAXBElement<String> createObjekttitel(String value) {
        return new JAXBElement<String>(_Objekttitel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dreizeiler")
    public JAXBElement<String> createDreizeiler(String value) {
        return new JAXBElement<String>(_Dreizeiler_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lage")
    public JAXBElement<String> createLage(String value) {
        return new JAXBElement<String>(_Lage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ausstatt_beschr")
    public JAXBElement<String> createAusstattBeschr(String value) {
        return new JAXBElement<String>(_AusstattBeschr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "objektbeschreibung")
    public JAXBElement<String> createObjektbeschreibung(String value) {
        return new JAXBElement<String>(_Objektbeschreibung_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sonstige_angaben")
    public JAXBElement<String> createSonstigeAngaben(String value) {
        return new JAXBElement<String>(_SonstigeAngaben_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anhangtitel")
    public JAXBElement<String> createAnhangtitel(String value) {
        return new JAXBElement<String>(_Anhangtitel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "format")
    public JAXBElement<String> createFormat(String value) {
        return new JAXBElement<String>(_Format_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anhanginhalt")
    public JAXBElement<byte[]> createAnhanginhalt(byte[] value) {
        return new JAXBElement<byte[]>(_Anhanginhalt_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pfad")
    public JAXBElement<String> createPfad(String value) {
        return new JAXBElement<String>(_Pfad_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "objektadresse_freigeben")
    public JAXBElement<Boolean> createObjektadresseFreigeben(Boolean value) {
        return new JAXBElement<Boolean>(_ObjektadresseFreigeben_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "verfuegbar_ab")
    public JAXBElement<String> createVerfuegbarAb(String value) {
        return new JAXBElement<String>(_VerfuegbarAb_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "abdatum")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Calendar> createAbdatum(Calendar value) {
        return new JAXBElement<Calendar>(_Abdatum_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bisdatum")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Calendar> createBisdatum(Calendar value) {
        return new JAXBElement<Calendar>(_Bisdatum_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "versteigerungstermin")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Calendar> createVersteigerungstermin(Calendar value) {
        return new JAXBElement<Calendar>(_Versteigerungstermin_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wbs_sozialwohnung")
    public JAXBElement<Boolean> createWbsSozialwohnung(Boolean value) {
        return new JAXBElement<Boolean>(_WbsSozialwohnung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vermietet")
    public JAXBElement<Boolean> createVermietet(Boolean value) {
        return new JAXBElement<Boolean>(_Vermietet_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "anbieternr")
    public JAXBElement<String> createAnbieternr(String value) {
        return new JAXBElement<String>(_Anbieternr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "objektnr_intern")
    public JAXBElement<String> createObjektnrIntern(String value) {
        return new JAXBElement<String>(_ObjektnrIntern_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "objektnr_extern")
    public JAXBElement<String> createObjektnrExtern(String value) {
        return new JAXBElement<String>(_ObjektnrExtern_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gruppennummer")
    public JAXBElement<String> createGruppennummer(String value) {
        return new JAXBElement<String>(_Gruppennummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zugang")
    public JAXBElement<String> createZugang(String value) {
        return new JAXBElement<String>(_Zugang_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "aktiv_von")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Calendar> createAktivVon(Calendar value) {
        return new JAXBElement<Calendar>(_AktivVon_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "aktiv_bis")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Calendar> createAktivBis(Calendar value) {
        return new JAXBElement<Calendar>(_AktivBis_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "laufzeit")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<BigDecimal> createLaufzeit(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Laufzeit_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "max_personen")
    @XmlJavaTypeAdapter(Adapter6 .class)
    public JAXBElement<BigInteger> createMaxPersonen(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaxPersonen_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nichtraucher")
    public JAXBElement<Boolean> createNichtraucher(Boolean value) {
        return new JAXBElement<Boolean>(_Nichtraucher_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "haustiere")
    public JAXBElement<Boolean> createHaustiere(Boolean value) {
        return new JAXBElement<Boolean>(_Haustiere_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "denkmalgeschuetzt")
    public JAXBElement<Boolean> createDenkmalgeschuetzt(Boolean value) {
        return new JAXBElement<Boolean>(_Denkmalgeschuetzt_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stand_vom")
    @XmlJavaTypeAdapter(Adapter4 .class)
    public JAXBElement<Calendar> createStandVom(Calendar value) {
        return new JAXBElement<Calendar>(_StandVom_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kennung_ursprung")
    public JAXBElement<String> createKennungUrsprung(String value) {
        return new JAXBElement<String>(_KennungUrsprung_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "openimmo_obid")
    public JAXBElement<String> createOpenimmoObid(String value) {
        return new JAXBElement<String>(_OpenimmoObid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "weitergabe_generell")
    public JAXBElement<Boolean> createWeitergabeGenerell(Boolean value) {
        return new JAXBElement<Boolean>(_WeitergabeGenerell_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "weitergabe_negativ")
    public JAXBElement<String> createWeitergabeNegativ(String value) {
        return new JAXBElement<String>(_WeitergabeNegativ_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "weitergabe_positiv")
    public JAXBElement<String> createWeitergabePositiv(String value) {
        return new JAXBElement<String>(_WeitergabePositiv_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gruppen_kennung")
    public JAXBElement<String> createGruppenKennung(String value) {
        return new JAXBElement<String>(_GruppenKennung_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sprache")
    public JAXBElement<String> createSprache(String value) {
        return new JAXBElement<String>(_Sprache_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "als_ferien")
    public JAXBElement<Boolean> createAlsFerien(Boolean value) {
        return new JAXBElement<Boolean>(_AlsFerien_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gewerbliche_nutzung")
    public JAXBElement<Boolean> createGewerblicheNutzung(Boolean value) {
        return new JAXBElement<Boolean>(_GewerblicheNutzung_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "branchen")
    public JAXBElement<String> createBranchen(String value) {
        return new JAXBElement<String>(_Branchen_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hochhaus")
    public JAXBElement<Boolean> createHochhaus(Boolean value) {
        return new JAXBElement<Boolean>(_Hochhaus_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "objektart_zusatz")
    public JAXBElement<String> createObjektartZusatz(String value) {
        return new JAXBElement<String>(_ObjektartZusatz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "impressum")
    public JAXBElement<String> createImpressum(String value) {
        return new JAXBElement<String>(_Impressum_QNAME, String.class, null, value);
    }

}
