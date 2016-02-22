
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

public class WGZimmer
    extends JAXBElement<WGZimmer.Type>
{

    protected final static QName NAME = new QName("http://www.immobilienscout24.de/immobilientransfer", "WGZimmer");

    public WGZimmer(WGZimmer.Type value) {
        super(NAME, ((Class) WGZimmer.Type.class), null, value);
    }

    public WGZimmer() {
        super(NAME, ((Class) WGZimmer.Type.class), null, null);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}WGZimmerTyp"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Mietpreise" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungWGZimmerTyp"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="WGZimmerKategorie" type="{http://www.immobilienscout24.de/immobilientransfer}WGZimmerKategorienTyp" default="keineAngabe" /&gt;
     *       &lt;attribute name="Zimmerflaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
     *       &lt;attribute name="Gesamtflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
     *       &lt;attribute name="Zimmer" type="{http://www.immobilienscout24.de/immobilientransfer}ZimmeranzahlTyp" /&gt;
     *       &lt;attribute name="FreiAb" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="FreiBis" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="Bewohnerzahl" type="{http://www.immobilienscout24.de/immobilientransfer}WGGroesse" default="2" /&gt;
     *       &lt;attribute name="Mobilar" type="{http://www.immobilienscout24.de/immobilientransfer}MobilarTyp" default="keineAngabe" /&gt;
     *       &lt;attribute name="Bodenbelag" type="{http://www.immobilienscout24.de/immobilientransfer}BodenbelagWohnenTyp" default="keineAngabe" /&gt;
     *       &lt;attribute name="Rauchen" type="{http://www.immobilienscout24.de/immobilientransfer}RauchenTyp" default="keineAngabe" /&gt;
     *       &lt;attribute name="Etage" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2i0Typ" /&gt;
     *       &lt;attribute name="Etagenzahl" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
     *       &lt;attribute name="BalkonTerrasse" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="GartenBenutzung" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Backofen" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Kuehlschrank" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AnzahlBadezimmer" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
     *       &lt;attribute name="WC" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="GaesteWC" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Herd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Dusche" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Badewanne" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Spuelmaschine" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Waschmaschine" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Keller" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Aufzug" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Haustiere" type="{http://www.immobilienscout24.de/immobilientransfer}GenehmigungTyp" /&gt;
     *       &lt;attribute name="Barrierefrei" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Heizungsart" type="{http://www.immobilienscout24.de/immobilientransfer}HeizungsartTyp" /&gt;
     *       &lt;attribute name="AnzahlMaennlicheMitbewohner" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
     *       &lt;attribute name="AnzahlWeiblicheMitbewohner" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
     *       &lt;attribute name="AlterDerzeitigeBewohnerVon" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
     *       &lt;attribute name="AlterDerzeitigeBewohnerBis" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
     *       &lt;attribute name="AlterGesuchterBewohnerVon" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
     *       &lt;attribute name="AlterGesuchterBewohnerBis" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
     *       &lt;attribute name="GeschlechtGesuchterBewohner" type="{http://www.immobilienscout24.de/immobilientransfer}WGZimmerGeschlechtTyp" default="MaennlichOderWeiblich" /&gt;
     *       &lt;attribute name="AnzahlGesuchteMitbewohner" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl2Typ" /&gt;
     *       &lt;attribute name="Telefonanschluss" type="{http://www.immobilienscout24.de/immobilientransfer}TelefonanschlussTyp" default="keineAngabe" /&gt;
     *       &lt;attribute name="Internetanschluss" type="{http://www.immobilienscout24.de/immobilientransfer}InternetanschlussTyp" default="keineAngabe" /&gt;
     *       &lt;attribute name="TVAnschluss" type="{http://www.immobilienscout24.de/immobilientransfer}TVAnschlussTyp" default="keineAngabe" /&gt;
     *       &lt;attribute name="Parkplatzsituation" type="{http://www.immobilienscout24.de/immobilientransfer}ParkplatzsituationTyp" default="keineAngabe" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mietpreise"
    })
    public static class Type
        extends WGZimmerTyp
        implements Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(name = "Mietpreise", required = true)
        protected VermarktungWGZimmerTyp mietpreise;
        @XmlAttribute(name = "WGZimmerKategorie")
        protected WGZimmerKategorienTyp wgZimmerKategorie;
        @XmlAttribute(name = "Zimmerflaeche", required = true)
        @XmlJavaTypeAdapter(Adapter34 .class)
        protected BigDecimal zimmerflaeche;
        @XmlAttribute(name = "Gesamtflaeche")
        @XmlJavaTypeAdapter(Adapter34 .class)
        protected BigDecimal gesamtflaeche;
        @XmlAttribute(name = "Zimmer")
        @XmlJavaTypeAdapter(Adapter32 .class)
        protected BigDecimal zimmer;
        @XmlAttribute(name = "FreiAb", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "date")
        protected Calendar freiAb;
        @XmlAttribute(name = "FreiBis")
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "date")
        protected Calendar freiBis;
        @XmlAttribute(name = "Bewohnerzahl")
        protected WGGroesse bewohnerzahl;
        @XmlAttribute(name = "Mobilar")
        protected MobilarTyp mobilar;
        @XmlAttribute(name = "Bodenbelag")
        protected BodenbelagWohnenTyp bodenbelag;
        @XmlAttribute(name = "Rauchen")
        protected RauchenTyp rauchen;
        @XmlAttribute(name = "Etage")
        @XmlJavaTypeAdapter(Adapter18 .class)
        protected Long etage;
        @XmlAttribute(name = "Etagenzahl")
        @XmlJavaTypeAdapter(Adapter19 .class)
        protected Long etagenzahl;
        @XmlAttribute(name = "BalkonTerrasse")
        protected Boolean balkonTerrasse;
        @XmlAttribute(name = "GartenBenutzung")
        protected Boolean gartenBenutzung;
        @XmlAttribute(name = "Backofen")
        protected Boolean backofen;
        @XmlAttribute(name = "Kuehlschrank")
        protected Boolean kuehlschrank;
        @XmlAttribute(name = "AnzahlBadezimmer")
        @XmlJavaTypeAdapter(Adapter19 .class)
        protected Long anzahlBadezimmer;
        @XmlAttribute(name = "WC")
        protected Boolean wc;
        @XmlAttribute(name = "GaesteWC")
        protected Boolean gaesteWC;
        @XmlAttribute(name = "Herd")
        protected Boolean herd;
        @XmlAttribute(name = "Dusche")
        protected Boolean dusche;
        @XmlAttribute(name = "Badewanne")
        protected Boolean badewanne;
        @XmlAttribute(name = "Spuelmaschine")
        protected Boolean spuelmaschine;
        @XmlAttribute(name = "Waschmaschine")
        protected Boolean waschmaschine;
        @XmlAttribute(name = "Keller")
        protected Boolean keller;
        @XmlAttribute(name = "Aufzug")
        protected Boolean aufzug;
        @XmlAttribute(name = "Haustiere")
        protected GenehmigungTyp haustiere;
        @XmlAttribute(name = "Barrierefrei")
        protected Boolean barrierefrei;
        @XmlAttribute(name = "Heizungsart")
        protected HeizungsartTyp heizungsart;
        @XmlAttribute(name = "AnzahlMaennlicheMitbewohner")
        @XmlJavaTypeAdapter(Adapter19 .class)
        protected Long anzahlMaennlicheMitbewohner;
        @XmlAttribute(name = "AnzahlWeiblicheMitbewohner")
        @XmlJavaTypeAdapter(Adapter19 .class)
        protected Long anzahlWeiblicheMitbewohner;
        @XmlAttribute(name = "AlterDerzeitigeBewohnerVon")
        @XmlJavaTypeAdapter(Adapter19 .class)
        protected Long alterDerzeitigeBewohnerVon;
        @XmlAttribute(name = "AlterDerzeitigeBewohnerBis")
        @XmlJavaTypeAdapter(Adapter19 .class)
        protected Long alterDerzeitigeBewohnerBis;
        @XmlAttribute(name = "AlterGesuchterBewohnerVon")
        @XmlJavaTypeAdapter(Adapter19 .class)
        protected Long alterGesuchterBewohnerVon;
        @XmlAttribute(name = "AlterGesuchterBewohnerBis")
        @XmlJavaTypeAdapter(Adapter19 .class)
        protected Long alterGesuchterBewohnerBis;
        @XmlAttribute(name = "GeschlechtGesuchterBewohner")
        protected WGZimmerGeschlechtTyp geschlechtGesuchterBewohner;
        @XmlAttribute(name = "AnzahlGesuchteMitbewohner")
        @XmlJavaTypeAdapter(Adapter19 .class)
        protected Long anzahlGesuchteMitbewohner;
        @XmlAttribute(name = "Telefonanschluss")
        protected TelefonanschlussTyp telefonanschluss;
        @XmlAttribute(name = "Internetanschluss")
        protected InternetanschlussTyp internetanschluss;
        @XmlAttribute(name = "TVAnschluss")
        protected TVAnschlussTyp tvAnschluss;
        @XmlAttribute(name = "Parkplatzsituation")
        protected ParkplatzsituationTyp parkplatzsituation;

        /**
         * Gets the value of the mietpreise property.
         * 
         * @return
         *     possible object is
         *     {@link VermarktungWGZimmerTyp }
         *     
         */
        public VermarktungWGZimmerTyp getMietpreise() {
            return mietpreise;
        }

        /**
         * Sets the value of the mietpreise property.
         * 
         * @param value
         *     allowed object is
         *     {@link VermarktungWGZimmerTyp }
         *     
         */
        public void setMietpreise(VermarktungWGZimmerTyp value) {
            this.mietpreise = value;
        }

        /**
         * Gets the value of the wgZimmerKategorie property.
         * 
         * @return
         *     possible object is
         *     {@link WGZimmerKategorienTyp }
         *     
         */
        public WGZimmerKategorienTyp getWGZimmerKategorie() {
            if (wgZimmerKategorie == null) {
                return WGZimmerKategorienTyp.KEINE_ANGABE;
            } else {
                return wgZimmerKategorie;
            }
        }

        /**
         * Sets the value of the wgZimmerKategorie property.
         * 
         * @param value
         *     allowed object is
         *     {@link WGZimmerKategorienTyp }
         *     
         */
        public void setWGZimmerKategorie(WGZimmerKategorienTyp value) {
            this.wgZimmerKategorie = value;
        }

        /**
         * Gets the value of the zimmerflaeche property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public BigDecimal getZimmerflaeche() {
            return zimmerflaeche;
        }

        /**
         * Sets the value of the zimmerflaeche property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZimmerflaeche(BigDecimal value) {
            this.zimmerflaeche = value;
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
         * Gets the value of the zimmer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public BigDecimal getZimmer() {
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
        public void setZimmer(BigDecimal value) {
            this.zimmer = value;
        }

        /**
         * Gets the value of the freiAb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Calendar getFreiAb() {
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
        public void setFreiAb(Calendar value) {
            this.freiAb = value;
        }

        /**
         * Gets the value of the freiBis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Calendar getFreiBis() {
            return freiBis;
        }

        /**
         * Sets the value of the freiBis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFreiBis(Calendar value) {
            this.freiBis = value;
        }

        /**
         * Gets the value of the bewohnerzahl property.
         * 
         * @return
         *     possible object is
         *     {@link WGGroesse }
         *     
         */
        public WGGroesse getBewohnerzahl() {
            if (bewohnerzahl == null) {
                return WGGroesse.PERSONS_02;
            } else {
                return bewohnerzahl;
            }
        }

        /**
         * Sets the value of the bewohnerzahl property.
         * 
         * @param value
         *     allowed object is
         *     {@link WGGroesse }
         *     
         */
        public void setBewohnerzahl(WGGroesse value) {
            this.bewohnerzahl = value;
        }

        /**
         * Gets the value of the mobilar property.
         * 
         * @return
         *     possible object is
         *     {@link MobilarTyp }
         *     
         */
        public MobilarTyp getMobilar() {
            if (mobilar == null) {
                return MobilarTyp.KEINE_ANGABE;
            } else {
                return mobilar;
            }
        }

        /**
         * Sets the value of the mobilar property.
         * 
         * @param value
         *     allowed object is
         *     {@link MobilarTyp }
         *     
         */
        public void setMobilar(MobilarTyp value) {
            this.mobilar = value;
        }

        /**
         * Gets the value of the bodenbelag property.
         * 
         * @return
         *     possible object is
         *     {@link BodenbelagWohnenTyp }
         *     
         */
        public BodenbelagWohnenTyp getBodenbelag() {
            if (bodenbelag == null) {
                return BodenbelagWohnenTyp.KEINE_ANGABE;
            } else {
                return bodenbelag;
            }
        }

        /**
         * Sets the value of the bodenbelag property.
         * 
         * @param value
         *     allowed object is
         *     {@link BodenbelagWohnenTyp }
         *     
         */
        public void setBodenbelag(BodenbelagWohnenTyp value) {
            this.bodenbelag = value;
        }

        /**
         * Gets the value of the rauchen property.
         * 
         * @return
         *     possible object is
         *     {@link RauchenTyp }
         *     
         */
        public RauchenTyp getRauchen() {
            if (rauchen == null) {
                return RauchenTyp.KEINE_ANGABE;
            } else {
                return rauchen;
            }
        }

        /**
         * Sets the value of the rauchen property.
         * 
         * @param value
         *     allowed object is
         *     {@link RauchenTyp }
         *     
         */
        public void setRauchen(RauchenTyp value) {
            this.rauchen = value;
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
         * Gets the value of the backofen property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBackofen() {
            return backofen;
        }

        /**
         * Sets the value of the backofen property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBackofen(Boolean value) {
            this.backofen = value;
        }

        /**
         * Gets the value of the kuehlschrank property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isKuehlschrank() {
            return kuehlschrank;
        }

        /**
         * Sets the value of the kuehlschrank property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setKuehlschrank(Boolean value) {
            this.kuehlschrank = value;
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
         * Gets the value of the wc property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWC() {
            return wc;
        }

        /**
         * Sets the value of the wc property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWC(Boolean value) {
            this.wc = value;
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
         * Gets the value of the herd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHerd() {
            return herd;
        }

        /**
         * Sets the value of the herd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHerd(Boolean value) {
            this.herd = value;
        }

        /**
         * Gets the value of the dusche property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDusche() {
            return dusche;
        }

        /**
         * Sets the value of the dusche property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDusche(Boolean value) {
            this.dusche = value;
        }

        /**
         * Gets the value of the badewanne property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBadewanne() {
            return badewanne;
        }

        /**
         * Sets the value of the badewanne property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBadewanne(Boolean value) {
            this.badewanne = value;
        }

        /**
         * Gets the value of the spuelmaschine property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSpuelmaschine() {
            return spuelmaschine;
        }

        /**
         * Sets the value of the spuelmaschine property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSpuelmaschine(Boolean value) {
            this.spuelmaschine = value;
        }

        /**
         * Gets the value of the waschmaschine property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWaschmaschine() {
            return waschmaschine;
        }

        /**
         * Sets the value of the waschmaschine property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWaschmaschine(Boolean value) {
            this.waschmaschine = value;
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
         * Gets the value of the anzahlMaennlicheMitbewohner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Long getAnzahlMaennlicheMitbewohner() {
            return anzahlMaennlicheMitbewohner;
        }

        /**
         * Sets the value of the anzahlMaennlicheMitbewohner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnzahlMaennlicheMitbewohner(Long value) {
            this.anzahlMaennlicheMitbewohner = value;
        }

        /**
         * Gets the value of the anzahlWeiblicheMitbewohner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Long getAnzahlWeiblicheMitbewohner() {
            return anzahlWeiblicheMitbewohner;
        }

        /**
         * Sets the value of the anzahlWeiblicheMitbewohner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnzahlWeiblicheMitbewohner(Long value) {
            this.anzahlWeiblicheMitbewohner = value;
        }

        /**
         * Gets the value of the alterDerzeitigeBewohnerVon property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Long getAlterDerzeitigeBewohnerVon() {
            return alterDerzeitigeBewohnerVon;
        }

        /**
         * Sets the value of the alterDerzeitigeBewohnerVon property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlterDerzeitigeBewohnerVon(Long value) {
            this.alterDerzeitigeBewohnerVon = value;
        }

        /**
         * Gets the value of the alterDerzeitigeBewohnerBis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Long getAlterDerzeitigeBewohnerBis() {
            return alterDerzeitigeBewohnerBis;
        }

        /**
         * Sets the value of the alterDerzeitigeBewohnerBis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlterDerzeitigeBewohnerBis(Long value) {
            this.alterDerzeitigeBewohnerBis = value;
        }

        /**
         * Gets the value of the alterGesuchterBewohnerVon property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Long getAlterGesuchterBewohnerVon() {
            return alterGesuchterBewohnerVon;
        }

        /**
         * Sets the value of the alterGesuchterBewohnerVon property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlterGesuchterBewohnerVon(Long value) {
            this.alterGesuchterBewohnerVon = value;
        }

        /**
         * Gets the value of the alterGesuchterBewohnerBis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Long getAlterGesuchterBewohnerBis() {
            return alterGesuchterBewohnerBis;
        }

        /**
         * Sets the value of the alterGesuchterBewohnerBis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlterGesuchterBewohnerBis(Long value) {
            this.alterGesuchterBewohnerBis = value;
        }

        /**
         * Gets the value of the geschlechtGesuchterBewohner property.
         * 
         * @return
         *     possible object is
         *     {@link WGZimmerGeschlechtTyp }
         *     
         */
        public WGZimmerGeschlechtTyp getGeschlechtGesuchterBewohner() {
            if (geschlechtGesuchterBewohner == null) {
                return WGZimmerGeschlechtTyp.MAENNLICH_ODER_WEIBLICH;
            } else {
                return geschlechtGesuchterBewohner;
            }
        }

        /**
         * Sets the value of the geschlechtGesuchterBewohner property.
         * 
         * @param value
         *     allowed object is
         *     {@link WGZimmerGeschlechtTyp }
         *     
         */
        public void setGeschlechtGesuchterBewohner(WGZimmerGeschlechtTyp value) {
            this.geschlechtGesuchterBewohner = value;
        }

        /**
         * Gets the value of the anzahlGesuchteMitbewohner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Long getAnzahlGesuchteMitbewohner() {
            return anzahlGesuchteMitbewohner;
        }

        /**
         * Sets the value of the anzahlGesuchteMitbewohner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnzahlGesuchteMitbewohner(Long value) {
            this.anzahlGesuchteMitbewohner = value;
        }

        /**
         * Gets the value of the telefonanschluss property.
         * 
         * @return
         *     possible object is
         *     {@link TelefonanschlussTyp }
         *     
         */
        public TelefonanschlussTyp getTelefonanschluss() {
            if (telefonanschluss == null) {
                return TelefonanschlussTyp.KEINE_ANGABE;
            } else {
                return telefonanschluss;
            }
        }

        /**
         * Sets the value of the telefonanschluss property.
         * 
         * @param value
         *     allowed object is
         *     {@link TelefonanschlussTyp }
         *     
         */
        public void setTelefonanschluss(TelefonanschlussTyp value) {
            this.telefonanschluss = value;
        }

        /**
         * Gets the value of the internetanschluss property.
         * 
         * @return
         *     possible object is
         *     {@link InternetanschlussTyp }
         *     
         */
        public InternetanschlussTyp getInternetanschluss() {
            if (internetanschluss == null) {
                return InternetanschlussTyp.KEINE_ANGABE;
            } else {
                return internetanschluss;
            }
        }

        /**
         * Sets the value of the internetanschluss property.
         * 
         * @param value
         *     allowed object is
         *     {@link InternetanschlussTyp }
         *     
         */
        public void setInternetanschluss(InternetanschlussTyp value) {
            this.internetanschluss = value;
        }

        /**
         * Gets the value of the tvAnschluss property.
         * 
         * @return
         *     possible object is
         *     {@link TVAnschlussTyp }
         *     
         */
        public TVAnschlussTyp getTVAnschluss() {
            if (tvAnschluss == null) {
                return TVAnschlussTyp.KEINE_ANGABE;
            } else {
                return tvAnschluss;
            }
        }

        /**
         * Sets the value of the tvAnschluss property.
         * 
         * @param value
         *     allowed object is
         *     {@link TVAnschlussTyp }
         *     
         */
        public void setTVAnschluss(TVAnschlussTyp value) {
            this.tvAnschluss = value;
        }

        /**
         * Gets the value of the parkplatzsituation property.
         * 
         * @return
         *     possible object is
         *     {@link ParkplatzsituationTyp }
         *     
         */
        public ParkplatzsituationTyp getParkplatzsituation() {
            if (parkplatzsituation == null) {
                return ParkplatzsituationTyp.KEINE_ANGABE;
            } else {
                return parkplatzsituation;
            }
        }

        /**
         * Sets the value of the parkplatzsituation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ParkplatzsituationTyp }
         *     
         */
        public void setParkplatzsituation(ParkplatzsituationTyp value) {
            this.parkplatzsituation = value;
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
                VermarktungWGZimmerTyp theMietpreise;
                theMietpreise = this.getMietpreise();
                strategy.appendField(locator, this, "mietpreise", buffer, theMietpreise, (this.mietpreise!= null));
            }
            {
                WGZimmerKategorienTyp theWGZimmerKategorie;
                theWGZimmerKategorie = this.getWGZimmerKategorie();
                strategy.appendField(locator, this, "wgZimmerKategorie", buffer, theWGZimmerKategorie, (this.wgZimmerKategorie!= null));
            }
            {
                BigDecimal theZimmerflaeche;
                theZimmerflaeche = this.getZimmerflaeche();
                strategy.appendField(locator, this, "zimmerflaeche", buffer, theZimmerflaeche, (this.zimmerflaeche!= null));
            }
            {
                BigDecimal theGesamtflaeche;
                theGesamtflaeche = this.getGesamtflaeche();
                strategy.appendField(locator, this, "gesamtflaeche", buffer, theGesamtflaeche, (this.gesamtflaeche!= null));
            }
            {
                BigDecimal theZimmer;
                theZimmer = this.getZimmer();
                strategy.appendField(locator, this, "zimmer", buffer, theZimmer, (this.zimmer!= null));
            }
            {
                Calendar theFreiAb;
                theFreiAb = this.getFreiAb();
                strategy.appendField(locator, this, "freiAb", buffer, theFreiAb, (this.freiAb!= null));
            }
            {
                Calendar theFreiBis;
                theFreiBis = this.getFreiBis();
                strategy.appendField(locator, this, "freiBis", buffer, theFreiBis, (this.freiBis!= null));
            }
            {
                WGGroesse theBewohnerzahl;
                theBewohnerzahl = this.getBewohnerzahl();
                strategy.appendField(locator, this, "bewohnerzahl", buffer, theBewohnerzahl, (this.bewohnerzahl!= null));
            }
            {
                MobilarTyp theMobilar;
                theMobilar = this.getMobilar();
                strategy.appendField(locator, this, "mobilar", buffer, theMobilar, (this.mobilar!= null));
            }
            {
                BodenbelagWohnenTyp theBodenbelag;
                theBodenbelag = this.getBodenbelag();
                strategy.appendField(locator, this, "bodenbelag", buffer, theBodenbelag, (this.bodenbelag!= null));
            }
            {
                RauchenTyp theRauchen;
                theRauchen = this.getRauchen();
                strategy.appendField(locator, this, "rauchen", buffer, theRauchen, (this.rauchen!= null));
            }
            {
                Long theEtage;
                theEtage = this.getEtage();
                strategy.appendField(locator, this, "etage", buffer, theEtage, (this.etage!= null));
            }
            {
                Long theEtagenzahl;
                theEtagenzahl = this.getEtagenzahl();
                strategy.appendField(locator, this, "etagenzahl", buffer, theEtagenzahl, (this.etagenzahl!= null));
            }
            {
                Boolean theBalkonTerrasse;
                theBalkonTerrasse = this.isBalkonTerrasse();
                strategy.appendField(locator, this, "balkonTerrasse", buffer, theBalkonTerrasse, (this.balkonTerrasse!= null));
            }
            {
                Boolean theGartenBenutzung;
                theGartenBenutzung = this.isGartenBenutzung();
                strategy.appendField(locator, this, "gartenBenutzung", buffer, theGartenBenutzung, (this.gartenBenutzung!= null));
            }
            {
                Boolean theBackofen;
                theBackofen = this.isBackofen();
                strategy.appendField(locator, this, "backofen", buffer, theBackofen, (this.backofen!= null));
            }
            {
                Boolean theKuehlschrank;
                theKuehlschrank = this.isKuehlschrank();
                strategy.appendField(locator, this, "kuehlschrank", buffer, theKuehlschrank, (this.kuehlschrank!= null));
            }
            {
                Long theAnzahlBadezimmer;
                theAnzahlBadezimmer = this.getAnzahlBadezimmer();
                strategy.appendField(locator, this, "anzahlBadezimmer", buffer, theAnzahlBadezimmer, (this.anzahlBadezimmer!= null));
            }
            {
                Boolean theWC;
                theWC = this.isWC();
                strategy.appendField(locator, this, "wc", buffer, theWC, (this.wc!= null));
            }
            {
                Boolean theGaesteWC;
                theGaesteWC = this.isGaesteWC();
                strategy.appendField(locator, this, "gaesteWC", buffer, theGaesteWC, (this.gaesteWC!= null));
            }
            {
                Boolean theHerd;
                theHerd = this.isHerd();
                strategy.appendField(locator, this, "herd", buffer, theHerd, (this.herd!= null));
            }
            {
                Boolean theDusche;
                theDusche = this.isDusche();
                strategy.appendField(locator, this, "dusche", buffer, theDusche, (this.dusche!= null));
            }
            {
                Boolean theBadewanne;
                theBadewanne = this.isBadewanne();
                strategy.appendField(locator, this, "badewanne", buffer, theBadewanne, (this.badewanne!= null));
            }
            {
                Boolean theSpuelmaschine;
                theSpuelmaschine = this.isSpuelmaschine();
                strategy.appendField(locator, this, "spuelmaschine", buffer, theSpuelmaschine, (this.spuelmaschine!= null));
            }
            {
                Boolean theWaschmaschine;
                theWaschmaschine = this.isWaschmaschine();
                strategy.appendField(locator, this, "waschmaschine", buffer, theWaschmaschine, (this.waschmaschine!= null));
            }
            {
                Boolean theKeller;
                theKeller = this.isKeller();
                strategy.appendField(locator, this, "keller", buffer, theKeller, (this.keller!= null));
            }
            {
                Boolean theAufzug;
                theAufzug = this.isAufzug();
                strategy.appendField(locator, this, "aufzug", buffer, theAufzug, (this.aufzug!= null));
            }
            {
                GenehmigungTyp theHaustiere;
                theHaustiere = this.getHaustiere();
                strategy.appendField(locator, this, "haustiere", buffer, theHaustiere, (this.haustiere!= null));
            }
            {
                Boolean theBarrierefrei;
                theBarrierefrei = this.isBarrierefrei();
                strategy.appendField(locator, this, "barrierefrei", buffer, theBarrierefrei, (this.barrierefrei!= null));
            }
            {
                HeizungsartTyp theHeizungsart;
                theHeizungsart = this.getHeizungsart();
                strategy.appendField(locator, this, "heizungsart", buffer, theHeizungsart, (this.heizungsart!= null));
            }
            {
                Long theAnzahlMaennlicheMitbewohner;
                theAnzahlMaennlicheMitbewohner = this.getAnzahlMaennlicheMitbewohner();
                strategy.appendField(locator, this, "anzahlMaennlicheMitbewohner", buffer, theAnzahlMaennlicheMitbewohner, (this.anzahlMaennlicheMitbewohner!= null));
            }
            {
                Long theAnzahlWeiblicheMitbewohner;
                theAnzahlWeiblicheMitbewohner = this.getAnzahlWeiblicheMitbewohner();
                strategy.appendField(locator, this, "anzahlWeiblicheMitbewohner", buffer, theAnzahlWeiblicheMitbewohner, (this.anzahlWeiblicheMitbewohner!= null));
            }
            {
                Long theAlterDerzeitigeBewohnerVon;
                theAlterDerzeitigeBewohnerVon = this.getAlterDerzeitigeBewohnerVon();
                strategy.appendField(locator, this, "alterDerzeitigeBewohnerVon", buffer, theAlterDerzeitigeBewohnerVon, (this.alterDerzeitigeBewohnerVon!= null));
            }
            {
                Long theAlterDerzeitigeBewohnerBis;
                theAlterDerzeitigeBewohnerBis = this.getAlterDerzeitigeBewohnerBis();
                strategy.appendField(locator, this, "alterDerzeitigeBewohnerBis", buffer, theAlterDerzeitigeBewohnerBis, (this.alterDerzeitigeBewohnerBis!= null));
            }
            {
                Long theAlterGesuchterBewohnerVon;
                theAlterGesuchterBewohnerVon = this.getAlterGesuchterBewohnerVon();
                strategy.appendField(locator, this, "alterGesuchterBewohnerVon", buffer, theAlterGesuchterBewohnerVon, (this.alterGesuchterBewohnerVon!= null));
            }
            {
                Long theAlterGesuchterBewohnerBis;
                theAlterGesuchterBewohnerBis = this.getAlterGesuchterBewohnerBis();
                strategy.appendField(locator, this, "alterGesuchterBewohnerBis", buffer, theAlterGesuchterBewohnerBis, (this.alterGesuchterBewohnerBis!= null));
            }
            {
                WGZimmerGeschlechtTyp theGeschlechtGesuchterBewohner;
                theGeschlechtGesuchterBewohner = this.getGeschlechtGesuchterBewohner();
                strategy.appendField(locator, this, "geschlechtGesuchterBewohner", buffer, theGeschlechtGesuchterBewohner, (this.geschlechtGesuchterBewohner!= null));
            }
            {
                Long theAnzahlGesuchteMitbewohner;
                theAnzahlGesuchteMitbewohner = this.getAnzahlGesuchteMitbewohner();
                strategy.appendField(locator, this, "anzahlGesuchteMitbewohner", buffer, theAnzahlGesuchteMitbewohner, (this.anzahlGesuchteMitbewohner!= null));
            }
            {
                TelefonanschlussTyp theTelefonanschluss;
                theTelefonanschluss = this.getTelefonanschluss();
                strategy.appendField(locator, this, "telefonanschluss", buffer, theTelefonanschluss, (this.telefonanschluss!= null));
            }
            {
                InternetanschlussTyp theInternetanschluss;
                theInternetanschluss = this.getInternetanschluss();
                strategy.appendField(locator, this, "internetanschluss", buffer, theInternetanschluss, (this.internetanschluss!= null));
            }
            {
                TVAnschlussTyp theTVAnschluss;
                theTVAnschluss = this.getTVAnschluss();
                strategy.appendField(locator, this, "tvAnschluss", buffer, theTVAnschluss, (this.tvAnschluss!= null));
            }
            {
                ParkplatzsituationTyp theParkplatzsituation;
                theParkplatzsituation = this.getParkplatzsituation();
                strategy.appendField(locator, this, "parkplatzsituation", buffer, theParkplatzsituation, (this.parkplatzsituation!= null));
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
            final Object draftCopy = ((target == null)?createNewInstance():target);
            super.copyTo(locator, draftCopy, strategy);
            if (draftCopy instanceof WGZimmer.Type) {
                final WGZimmer.Type copy = ((WGZimmer.Type) draftCopy);
                {
                    Boolean mietpreiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mietpreise!= null));
                    if (mietpreiseShouldBeCopiedAndSet == Boolean.TRUE) {
                        VermarktungWGZimmerTyp sourceMietpreise;
                        sourceMietpreise = this.getMietpreise();
                        VermarktungWGZimmerTyp copyMietpreise = ((VermarktungWGZimmerTyp) strategy.copy(LocatorUtils.property(locator, "mietpreise", sourceMietpreise), sourceMietpreise, (this.mietpreise!= null)));
                        copy.setMietpreise(copyMietpreise);
                    } else {
                        if (mietpreiseShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.mietpreise = null;
                        }
                    }
                }
                {
                    Boolean wgZimmerKategorieShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wgZimmerKategorie!= null));
                    if (wgZimmerKategorieShouldBeCopiedAndSet == Boolean.TRUE) {
                        WGZimmerKategorienTyp sourceWGZimmerKategorie;
                        sourceWGZimmerKategorie = this.getWGZimmerKategorie();
                        WGZimmerKategorienTyp copyWGZimmerKategorie = ((WGZimmerKategorienTyp) strategy.copy(LocatorUtils.property(locator, "wgZimmerKategorie", sourceWGZimmerKategorie), sourceWGZimmerKategorie, (this.wgZimmerKategorie!= null)));
                        copy.setWGZimmerKategorie(copyWGZimmerKategorie);
                    } else {
                        if (wgZimmerKategorieShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.wgZimmerKategorie = null;
                        }
                    }
                }
                {
                    Boolean zimmerflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zimmerflaeche!= null));
                    if (zimmerflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigDecimal sourceZimmerflaeche;
                        sourceZimmerflaeche = this.getZimmerflaeche();
                        BigDecimal copyZimmerflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "zimmerflaeche", sourceZimmerflaeche), sourceZimmerflaeche, (this.zimmerflaeche!= null)));
                        copy.setZimmerflaeche(copyZimmerflaeche);
                    } else {
                        if (zimmerflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.zimmerflaeche = null;
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
                    Boolean zimmerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zimmer!= null));
                    if (zimmerShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigDecimal sourceZimmer;
                        sourceZimmer = this.getZimmer();
                        BigDecimal copyZimmer = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "zimmer", sourceZimmer), sourceZimmer, (this.zimmer!= null)));
                        copy.setZimmer(copyZimmer);
                    } else {
                        if (zimmerShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.zimmer = null;
                        }
                    }
                }
                {
                    Boolean freiAbShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freiAb!= null));
                    if (freiAbShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceFreiAb;
                        sourceFreiAb = this.getFreiAb();
                        Calendar copyFreiAb = ((Calendar) strategy.copy(LocatorUtils.property(locator, "freiAb", sourceFreiAb), sourceFreiAb, (this.freiAb!= null)));
                        copy.setFreiAb(copyFreiAb);
                    } else {
                        if (freiAbShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.freiAb = null;
                        }
                    }
                }
                {
                    Boolean freiBisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freiBis!= null));
                    if (freiBisShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceFreiBis;
                        sourceFreiBis = this.getFreiBis();
                        Calendar copyFreiBis = ((Calendar) strategy.copy(LocatorUtils.property(locator, "freiBis", sourceFreiBis), sourceFreiBis, (this.freiBis!= null)));
                        copy.setFreiBis(copyFreiBis);
                    } else {
                        if (freiBisShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.freiBis = null;
                        }
                    }
                }
                {
                    Boolean bewohnerzahlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bewohnerzahl!= null));
                    if (bewohnerzahlShouldBeCopiedAndSet == Boolean.TRUE) {
                        WGGroesse sourceBewohnerzahl;
                        sourceBewohnerzahl = this.getBewohnerzahl();
                        WGGroesse copyBewohnerzahl = ((WGGroesse) strategy.copy(LocatorUtils.property(locator, "bewohnerzahl", sourceBewohnerzahl), sourceBewohnerzahl, (this.bewohnerzahl!= null)));
                        copy.setBewohnerzahl(copyBewohnerzahl);
                    } else {
                        if (bewohnerzahlShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.bewohnerzahl = null;
                        }
                    }
                }
                {
                    Boolean mobilarShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mobilar!= null));
                    if (mobilarShouldBeCopiedAndSet == Boolean.TRUE) {
                        MobilarTyp sourceMobilar;
                        sourceMobilar = this.getMobilar();
                        MobilarTyp copyMobilar = ((MobilarTyp) strategy.copy(LocatorUtils.property(locator, "mobilar", sourceMobilar), sourceMobilar, (this.mobilar!= null)));
                        copy.setMobilar(copyMobilar);
                    } else {
                        if (mobilarShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.mobilar = null;
                        }
                    }
                }
                {
                    Boolean bodenbelagShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bodenbelag!= null));
                    if (bodenbelagShouldBeCopiedAndSet == Boolean.TRUE) {
                        BodenbelagWohnenTyp sourceBodenbelag;
                        sourceBodenbelag = this.getBodenbelag();
                        BodenbelagWohnenTyp copyBodenbelag = ((BodenbelagWohnenTyp) strategy.copy(LocatorUtils.property(locator, "bodenbelag", sourceBodenbelag), sourceBodenbelag, (this.bodenbelag!= null)));
                        copy.setBodenbelag(copyBodenbelag);
                    } else {
                        if (bodenbelagShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.bodenbelag = null;
                        }
                    }
                }
                {
                    Boolean rauchenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rauchen!= null));
                    if (rauchenShouldBeCopiedAndSet == Boolean.TRUE) {
                        RauchenTyp sourceRauchen;
                        sourceRauchen = this.getRauchen();
                        RauchenTyp copyRauchen = ((RauchenTyp) strategy.copy(LocatorUtils.property(locator, "rauchen", sourceRauchen), sourceRauchen, (this.rauchen!= null)));
                        copy.setRauchen(copyRauchen);
                    } else {
                        if (rauchenShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.rauchen = null;
                        }
                    }
                }
                {
                    Boolean etageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.etage!= null));
                    if (etageShouldBeCopiedAndSet == Boolean.TRUE) {
                        Long sourceEtage;
                        sourceEtage = this.getEtage();
                        Long copyEtage = ((Long) strategy.copy(LocatorUtils.property(locator, "etage", sourceEtage), sourceEtage, (this.etage!= null)));
                        copy.setEtage(copyEtage);
                    } else {
                        if (etageShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.etage = null;
                        }
                    }
                }
                {
                    Boolean etagenzahlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.etagenzahl!= null));
                    if (etagenzahlShouldBeCopiedAndSet == Boolean.TRUE) {
                        Long sourceEtagenzahl;
                        sourceEtagenzahl = this.getEtagenzahl();
                        Long copyEtagenzahl = ((Long) strategy.copy(LocatorUtils.property(locator, "etagenzahl", sourceEtagenzahl), sourceEtagenzahl, (this.etagenzahl!= null)));
                        copy.setEtagenzahl(copyEtagenzahl);
                    } else {
                        if (etagenzahlShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.etagenzahl = null;
                        }
                    }
                }
                {
                    Boolean balkonTerrasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balkonTerrasse!= null));
                    if (balkonTerrasseShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceBalkonTerrasse;
                        sourceBalkonTerrasse = this.isBalkonTerrasse();
                        Boolean copyBalkonTerrasse = ((Boolean) strategy.copy(LocatorUtils.property(locator, "balkonTerrasse", sourceBalkonTerrasse), sourceBalkonTerrasse, (this.balkonTerrasse!= null)));
                        copy.setBalkonTerrasse(copyBalkonTerrasse);
                    } else {
                        if (balkonTerrasseShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.balkonTerrasse = null;
                        }
                    }
                }
                {
                    Boolean gartenBenutzungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gartenBenutzung!= null));
                    if (gartenBenutzungShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceGartenBenutzung;
                        sourceGartenBenutzung = this.isGartenBenutzung();
                        Boolean copyGartenBenutzung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gartenBenutzung", sourceGartenBenutzung), sourceGartenBenutzung, (this.gartenBenutzung!= null)));
                        copy.setGartenBenutzung(copyGartenBenutzung);
                    } else {
                        if (gartenBenutzungShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.gartenBenutzung = null;
                        }
                    }
                }
                {
                    Boolean backofenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.backofen!= null));
                    if (backofenShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceBackofen;
                        sourceBackofen = this.isBackofen();
                        Boolean copyBackofen = ((Boolean) strategy.copy(LocatorUtils.property(locator, "backofen", sourceBackofen), sourceBackofen, (this.backofen!= null)));
                        copy.setBackofen(copyBackofen);
                    } else {
                        if (backofenShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.backofen = null;
                        }
                    }
                }
                {
                    Boolean kuehlschrankShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kuehlschrank!= null));
                    if (kuehlschrankShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceKuehlschrank;
                        sourceKuehlschrank = this.isKuehlschrank();
                        Boolean copyKuehlschrank = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kuehlschrank", sourceKuehlschrank), sourceKuehlschrank, (this.kuehlschrank!= null)));
                        copy.setKuehlschrank(copyKuehlschrank);
                    } else {
                        if (kuehlschrankShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.kuehlschrank = null;
                        }
                    }
                }
                {
                    Boolean anzahlBadezimmerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlBadezimmer!= null));
                    if (anzahlBadezimmerShouldBeCopiedAndSet == Boolean.TRUE) {
                        Long sourceAnzahlBadezimmer;
                        sourceAnzahlBadezimmer = this.getAnzahlBadezimmer();
                        Long copyAnzahlBadezimmer = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlBadezimmer", sourceAnzahlBadezimmer), sourceAnzahlBadezimmer, (this.anzahlBadezimmer!= null)));
                        copy.setAnzahlBadezimmer(copyAnzahlBadezimmer);
                    } else {
                        if (anzahlBadezimmerShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.anzahlBadezimmer = null;
                        }
                    }
                }
                {
                    Boolean wcShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wc!= null));
                    if (wcShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceWC;
                        sourceWC = this.isWC();
                        Boolean copyWC = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wc", sourceWC), sourceWC, (this.wc!= null)));
                        copy.setWC(copyWC);
                    } else {
                        if (wcShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.wc = null;
                        }
                    }
                }
                {
                    Boolean gaesteWCShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gaesteWC!= null));
                    if (gaesteWCShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceGaesteWC;
                        sourceGaesteWC = this.isGaesteWC();
                        Boolean copyGaesteWC = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gaesteWC", sourceGaesteWC), sourceGaesteWC, (this.gaesteWC!= null)));
                        copy.setGaesteWC(copyGaesteWC);
                    } else {
                        if (gaesteWCShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.gaesteWC = null;
                        }
                    }
                }
                {
                    Boolean herdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.herd!= null));
                    if (herdShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceHerd;
                        sourceHerd = this.isHerd();
                        Boolean copyHerd = ((Boolean) strategy.copy(LocatorUtils.property(locator, "herd", sourceHerd), sourceHerd, (this.herd!= null)));
                        copy.setHerd(copyHerd);
                    } else {
                        if (herdShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.herd = null;
                        }
                    }
                }
                {
                    Boolean duscheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dusche!= null));
                    if (duscheShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceDusche;
                        sourceDusche = this.isDusche();
                        Boolean copyDusche = ((Boolean) strategy.copy(LocatorUtils.property(locator, "dusche", sourceDusche), sourceDusche, (this.dusche!= null)));
                        copy.setDusche(copyDusche);
                    } else {
                        if (duscheShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.dusche = null;
                        }
                    }
                }
                {
                    Boolean badewanneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.badewanne!= null));
                    if (badewanneShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceBadewanne;
                        sourceBadewanne = this.isBadewanne();
                        Boolean copyBadewanne = ((Boolean) strategy.copy(LocatorUtils.property(locator, "badewanne", sourceBadewanne), sourceBadewanne, (this.badewanne!= null)));
                        copy.setBadewanne(copyBadewanne);
                    } else {
                        if (badewanneShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.badewanne = null;
                        }
                    }
                }
                {
                    Boolean spuelmaschineShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.spuelmaschine!= null));
                    if (spuelmaschineShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceSpuelmaschine;
                        sourceSpuelmaschine = this.isSpuelmaschine();
                        Boolean copySpuelmaschine = ((Boolean) strategy.copy(LocatorUtils.property(locator, "spuelmaschine", sourceSpuelmaschine), sourceSpuelmaschine, (this.spuelmaschine!= null)));
                        copy.setSpuelmaschine(copySpuelmaschine);
                    } else {
                        if (spuelmaschineShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.spuelmaschine = null;
                        }
                    }
                }
                {
                    Boolean waschmaschineShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.waschmaschine!= null));
                    if (waschmaschineShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceWaschmaschine;
                        sourceWaschmaschine = this.isWaschmaschine();
                        Boolean copyWaschmaschine = ((Boolean) strategy.copy(LocatorUtils.property(locator, "waschmaschine", sourceWaschmaschine), sourceWaschmaschine, (this.waschmaschine!= null)));
                        copy.setWaschmaschine(copyWaschmaschine);
                    } else {
                        if (waschmaschineShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.waschmaschine = null;
                        }
                    }
                }
                {
                    Boolean kellerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.keller!= null));
                    if (kellerShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceKeller;
                        sourceKeller = this.isKeller();
                        Boolean copyKeller = ((Boolean) strategy.copy(LocatorUtils.property(locator, "keller", sourceKeller), sourceKeller, (this.keller!= null)));
                        copy.setKeller(copyKeller);
                    } else {
                        if (kellerShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.keller = null;
                        }
                    }
                }
                {
                    Boolean aufzugShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aufzug!= null));
                    if (aufzugShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceAufzug;
                        sourceAufzug = this.isAufzug();
                        Boolean copyAufzug = ((Boolean) strategy.copy(LocatorUtils.property(locator, "aufzug", sourceAufzug), sourceAufzug, (this.aufzug!= null)));
                        copy.setAufzug(copyAufzug);
                    } else {
                        if (aufzugShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.aufzug = null;
                        }
                    }
                }
                {
                    Boolean haustiereShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.haustiere!= null));
                    if (haustiereShouldBeCopiedAndSet == Boolean.TRUE) {
                        GenehmigungTyp sourceHaustiere;
                        sourceHaustiere = this.getHaustiere();
                        GenehmigungTyp copyHaustiere = ((GenehmigungTyp) strategy.copy(LocatorUtils.property(locator, "haustiere", sourceHaustiere), sourceHaustiere, (this.haustiere!= null)));
                        copy.setHaustiere(copyHaustiere);
                    } else {
                        if (haustiereShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.haustiere = null;
                        }
                    }
                }
                {
                    Boolean barrierefreiShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.barrierefrei!= null));
                    if (barrierefreiShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceBarrierefrei;
                        sourceBarrierefrei = this.isBarrierefrei();
                        Boolean copyBarrierefrei = ((Boolean) strategy.copy(LocatorUtils.property(locator, "barrierefrei", sourceBarrierefrei), sourceBarrierefrei, (this.barrierefrei!= null)));
                        copy.setBarrierefrei(copyBarrierefrei);
                    } else {
                        if (barrierefreiShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.barrierefrei = null;
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
                    Boolean anzahlMaennlicheMitbewohnerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlMaennlicheMitbewohner!= null));
                    if (anzahlMaennlicheMitbewohnerShouldBeCopiedAndSet == Boolean.TRUE) {
                        Long sourceAnzahlMaennlicheMitbewohner;
                        sourceAnzahlMaennlicheMitbewohner = this.getAnzahlMaennlicheMitbewohner();
                        Long copyAnzahlMaennlicheMitbewohner = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlMaennlicheMitbewohner", sourceAnzahlMaennlicheMitbewohner), sourceAnzahlMaennlicheMitbewohner, (this.anzahlMaennlicheMitbewohner!= null)));
                        copy.setAnzahlMaennlicheMitbewohner(copyAnzahlMaennlicheMitbewohner);
                    } else {
                        if (anzahlMaennlicheMitbewohnerShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.anzahlMaennlicheMitbewohner = null;
                        }
                    }
                }
                {
                    Boolean anzahlWeiblicheMitbewohnerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlWeiblicheMitbewohner!= null));
                    if (anzahlWeiblicheMitbewohnerShouldBeCopiedAndSet == Boolean.TRUE) {
                        Long sourceAnzahlWeiblicheMitbewohner;
                        sourceAnzahlWeiblicheMitbewohner = this.getAnzahlWeiblicheMitbewohner();
                        Long copyAnzahlWeiblicheMitbewohner = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlWeiblicheMitbewohner", sourceAnzahlWeiblicheMitbewohner), sourceAnzahlWeiblicheMitbewohner, (this.anzahlWeiblicheMitbewohner!= null)));
                        copy.setAnzahlWeiblicheMitbewohner(copyAnzahlWeiblicheMitbewohner);
                    } else {
                        if (anzahlWeiblicheMitbewohnerShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.anzahlWeiblicheMitbewohner = null;
                        }
                    }
                }
                {
                    Boolean alterDerzeitigeBewohnerVonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alterDerzeitigeBewohnerVon!= null));
                    if (alterDerzeitigeBewohnerVonShouldBeCopiedAndSet == Boolean.TRUE) {
                        Long sourceAlterDerzeitigeBewohnerVon;
                        sourceAlterDerzeitigeBewohnerVon = this.getAlterDerzeitigeBewohnerVon();
                        Long copyAlterDerzeitigeBewohnerVon = ((Long) strategy.copy(LocatorUtils.property(locator, "alterDerzeitigeBewohnerVon", sourceAlterDerzeitigeBewohnerVon), sourceAlterDerzeitigeBewohnerVon, (this.alterDerzeitigeBewohnerVon!= null)));
                        copy.setAlterDerzeitigeBewohnerVon(copyAlterDerzeitigeBewohnerVon);
                    } else {
                        if (alterDerzeitigeBewohnerVonShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.alterDerzeitigeBewohnerVon = null;
                        }
                    }
                }
                {
                    Boolean alterDerzeitigeBewohnerBisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alterDerzeitigeBewohnerBis!= null));
                    if (alterDerzeitigeBewohnerBisShouldBeCopiedAndSet == Boolean.TRUE) {
                        Long sourceAlterDerzeitigeBewohnerBis;
                        sourceAlterDerzeitigeBewohnerBis = this.getAlterDerzeitigeBewohnerBis();
                        Long copyAlterDerzeitigeBewohnerBis = ((Long) strategy.copy(LocatorUtils.property(locator, "alterDerzeitigeBewohnerBis", sourceAlterDerzeitigeBewohnerBis), sourceAlterDerzeitigeBewohnerBis, (this.alterDerzeitigeBewohnerBis!= null)));
                        copy.setAlterDerzeitigeBewohnerBis(copyAlterDerzeitigeBewohnerBis);
                    } else {
                        if (alterDerzeitigeBewohnerBisShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.alterDerzeitigeBewohnerBis = null;
                        }
                    }
                }
                {
                    Boolean alterGesuchterBewohnerVonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alterGesuchterBewohnerVon!= null));
                    if (alterGesuchterBewohnerVonShouldBeCopiedAndSet == Boolean.TRUE) {
                        Long sourceAlterGesuchterBewohnerVon;
                        sourceAlterGesuchterBewohnerVon = this.getAlterGesuchterBewohnerVon();
                        Long copyAlterGesuchterBewohnerVon = ((Long) strategy.copy(LocatorUtils.property(locator, "alterGesuchterBewohnerVon", sourceAlterGesuchterBewohnerVon), sourceAlterGesuchterBewohnerVon, (this.alterGesuchterBewohnerVon!= null)));
                        copy.setAlterGesuchterBewohnerVon(copyAlterGesuchterBewohnerVon);
                    } else {
                        if (alterGesuchterBewohnerVonShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.alterGesuchterBewohnerVon = null;
                        }
                    }
                }
                {
                    Boolean alterGesuchterBewohnerBisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alterGesuchterBewohnerBis!= null));
                    if (alterGesuchterBewohnerBisShouldBeCopiedAndSet == Boolean.TRUE) {
                        Long sourceAlterGesuchterBewohnerBis;
                        sourceAlterGesuchterBewohnerBis = this.getAlterGesuchterBewohnerBis();
                        Long copyAlterGesuchterBewohnerBis = ((Long) strategy.copy(LocatorUtils.property(locator, "alterGesuchterBewohnerBis", sourceAlterGesuchterBewohnerBis), sourceAlterGesuchterBewohnerBis, (this.alterGesuchterBewohnerBis!= null)));
                        copy.setAlterGesuchterBewohnerBis(copyAlterGesuchterBewohnerBis);
                    } else {
                        if (alterGesuchterBewohnerBisShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.alterGesuchterBewohnerBis = null;
                        }
                    }
                }
                {
                    Boolean geschlechtGesuchterBewohnerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geschlechtGesuchterBewohner!= null));
                    if (geschlechtGesuchterBewohnerShouldBeCopiedAndSet == Boolean.TRUE) {
                        WGZimmerGeschlechtTyp sourceGeschlechtGesuchterBewohner;
                        sourceGeschlechtGesuchterBewohner = this.getGeschlechtGesuchterBewohner();
                        WGZimmerGeschlechtTyp copyGeschlechtGesuchterBewohner = ((WGZimmerGeschlechtTyp) strategy.copy(LocatorUtils.property(locator, "geschlechtGesuchterBewohner", sourceGeschlechtGesuchterBewohner), sourceGeschlechtGesuchterBewohner, (this.geschlechtGesuchterBewohner!= null)));
                        copy.setGeschlechtGesuchterBewohner(copyGeschlechtGesuchterBewohner);
                    } else {
                        if (geschlechtGesuchterBewohnerShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.geschlechtGesuchterBewohner = null;
                        }
                    }
                }
                {
                    Boolean anzahlGesuchteMitbewohnerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlGesuchteMitbewohner!= null));
                    if (anzahlGesuchteMitbewohnerShouldBeCopiedAndSet == Boolean.TRUE) {
                        Long sourceAnzahlGesuchteMitbewohner;
                        sourceAnzahlGesuchteMitbewohner = this.getAnzahlGesuchteMitbewohner();
                        Long copyAnzahlGesuchteMitbewohner = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlGesuchteMitbewohner", sourceAnzahlGesuchteMitbewohner), sourceAnzahlGesuchteMitbewohner, (this.anzahlGesuchteMitbewohner!= null)));
                        copy.setAnzahlGesuchteMitbewohner(copyAnzahlGesuchteMitbewohner);
                    } else {
                        if (anzahlGesuchteMitbewohnerShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.anzahlGesuchteMitbewohner = null;
                        }
                    }
                }
                {
                    Boolean telefonanschlussShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.telefonanschluss!= null));
                    if (telefonanschlussShouldBeCopiedAndSet == Boolean.TRUE) {
                        TelefonanschlussTyp sourceTelefonanschluss;
                        sourceTelefonanschluss = this.getTelefonanschluss();
                        TelefonanschlussTyp copyTelefonanschluss = ((TelefonanschlussTyp) strategy.copy(LocatorUtils.property(locator, "telefonanschluss", sourceTelefonanschluss), sourceTelefonanschluss, (this.telefonanschluss!= null)));
                        copy.setTelefonanschluss(copyTelefonanschluss);
                    } else {
                        if (telefonanschlussShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.telefonanschluss = null;
                        }
                    }
                }
                {
                    Boolean internetanschlussShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.internetanschluss!= null));
                    if (internetanschlussShouldBeCopiedAndSet == Boolean.TRUE) {
                        InternetanschlussTyp sourceInternetanschluss;
                        sourceInternetanschluss = this.getInternetanschluss();
                        InternetanschlussTyp copyInternetanschluss = ((InternetanschlussTyp) strategy.copy(LocatorUtils.property(locator, "internetanschluss", sourceInternetanschluss), sourceInternetanschluss, (this.internetanschluss!= null)));
                        copy.setInternetanschluss(copyInternetanschluss);
                    } else {
                        if (internetanschlussShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.internetanschluss = null;
                        }
                    }
                }
                {
                    Boolean tvAnschlussShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tvAnschluss!= null));
                    if (tvAnschlussShouldBeCopiedAndSet == Boolean.TRUE) {
                        TVAnschlussTyp sourceTVAnschluss;
                        sourceTVAnschluss = this.getTVAnschluss();
                        TVAnschlussTyp copyTVAnschluss = ((TVAnschlussTyp) strategy.copy(LocatorUtils.property(locator, "tvAnschluss", sourceTVAnschluss), sourceTVAnschluss, (this.tvAnschluss!= null)));
                        copy.setTVAnschluss(copyTVAnschluss);
                    } else {
                        if (tvAnschlussShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.tvAnschluss = null;
                        }
                    }
                }
                {
                    Boolean parkplatzsituationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkplatzsituation!= null));
                    if (parkplatzsituationShouldBeCopiedAndSet == Boolean.TRUE) {
                        ParkplatzsituationTyp sourceParkplatzsituation;
                        sourceParkplatzsituation = this.getParkplatzsituation();
                        ParkplatzsituationTyp copyParkplatzsituation = ((ParkplatzsituationTyp) strategy.copy(LocatorUtils.property(locator, "parkplatzsituation", sourceParkplatzsituation), sourceParkplatzsituation, (this.parkplatzsituation!= null)));
                        copy.setParkplatzsituation(copyParkplatzsituation);
                    } else {
                        if (parkplatzsituationShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.parkplatzsituation = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new WGZimmer.Type();
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
            final WGZimmer.Type that = ((WGZimmer.Type) object);
            {
                VermarktungWGZimmerTyp lhsMietpreise;
                lhsMietpreise = this.getMietpreise();
                VermarktungWGZimmerTyp rhsMietpreise;
                rhsMietpreise = that.getMietpreise();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mietpreise", lhsMietpreise), LocatorUtils.property(thatLocator, "mietpreise", rhsMietpreise), lhsMietpreise, rhsMietpreise, (this.mietpreise!= null), (that.mietpreise!= null))) {
                    return false;
                }
            }
            {
                WGZimmerKategorienTyp lhsWGZimmerKategorie;
                lhsWGZimmerKategorie = this.getWGZimmerKategorie();
                WGZimmerKategorienTyp rhsWGZimmerKategorie;
                rhsWGZimmerKategorie = that.getWGZimmerKategorie();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "wgZimmerKategorie", lhsWGZimmerKategorie), LocatorUtils.property(thatLocator, "wgZimmerKategorie", rhsWGZimmerKategorie), lhsWGZimmerKategorie, rhsWGZimmerKategorie, (this.wgZimmerKategorie!= null), (that.wgZimmerKategorie!= null))) {
                    return false;
                }
            }
            {
                BigDecimal lhsZimmerflaeche;
                lhsZimmerflaeche = this.getZimmerflaeche();
                BigDecimal rhsZimmerflaeche;
                rhsZimmerflaeche = that.getZimmerflaeche();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "zimmerflaeche", lhsZimmerflaeche), LocatorUtils.property(thatLocator, "zimmerflaeche", rhsZimmerflaeche), lhsZimmerflaeche, rhsZimmerflaeche, (this.zimmerflaeche!= null), (that.zimmerflaeche!= null))) {
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
                BigDecimal lhsZimmer;
                lhsZimmer = this.getZimmer();
                BigDecimal rhsZimmer;
                rhsZimmer = that.getZimmer();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "zimmer", lhsZimmer), LocatorUtils.property(thatLocator, "zimmer", rhsZimmer), lhsZimmer, rhsZimmer, (this.zimmer!= null), (that.zimmer!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsFreiAb;
                lhsFreiAb = this.getFreiAb();
                Calendar rhsFreiAb;
                rhsFreiAb = that.getFreiAb();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "freiAb", lhsFreiAb), LocatorUtils.property(thatLocator, "freiAb", rhsFreiAb), lhsFreiAb, rhsFreiAb, (this.freiAb!= null), (that.freiAb!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsFreiBis;
                lhsFreiBis = this.getFreiBis();
                Calendar rhsFreiBis;
                rhsFreiBis = that.getFreiBis();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "freiBis", lhsFreiBis), LocatorUtils.property(thatLocator, "freiBis", rhsFreiBis), lhsFreiBis, rhsFreiBis, (this.freiBis!= null), (that.freiBis!= null))) {
                    return false;
                }
            }
            {
                WGGroesse lhsBewohnerzahl;
                lhsBewohnerzahl = this.getBewohnerzahl();
                WGGroesse rhsBewohnerzahl;
                rhsBewohnerzahl = that.getBewohnerzahl();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "bewohnerzahl", lhsBewohnerzahl), LocatorUtils.property(thatLocator, "bewohnerzahl", rhsBewohnerzahl), lhsBewohnerzahl, rhsBewohnerzahl, (this.bewohnerzahl!= null), (that.bewohnerzahl!= null))) {
                    return false;
                }
            }
            {
                MobilarTyp lhsMobilar;
                lhsMobilar = this.getMobilar();
                MobilarTyp rhsMobilar;
                rhsMobilar = that.getMobilar();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mobilar", lhsMobilar), LocatorUtils.property(thatLocator, "mobilar", rhsMobilar), lhsMobilar, rhsMobilar, (this.mobilar!= null), (that.mobilar!= null))) {
                    return false;
                }
            }
            {
                BodenbelagWohnenTyp lhsBodenbelag;
                lhsBodenbelag = this.getBodenbelag();
                BodenbelagWohnenTyp rhsBodenbelag;
                rhsBodenbelag = that.getBodenbelag();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "bodenbelag", lhsBodenbelag), LocatorUtils.property(thatLocator, "bodenbelag", rhsBodenbelag), lhsBodenbelag, rhsBodenbelag, (this.bodenbelag!= null), (that.bodenbelag!= null))) {
                    return false;
                }
            }
            {
                RauchenTyp lhsRauchen;
                lhsRauchen = this.getRauchen();
                RauchenTyp rhsRauchen;
                rhsRauchen = that.getRauchen();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "rauchen", lhsRauchen), LocatorUtils.property(thatLocator, "rauchen", rhsRauchen), lhsRauchen, rhsRauchen, (this.rauchen!= null), (that.rauchen!= null))) {
                    return false;
                }
            }
            {
                Long lhsEtage;
                lhsEtage = this.getEtage();
                Long rhsEtage;
                rhsEtage = that.getEtage();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "etage", lhsEtage), LocatorUtils.property(thatLocator, "etage", rhsEtage), lhsEtage, rhsEtage, (this.etage!= null), (that.etage!= null))) {
                    return false;
                }
            }
            {
                Long lhsEtagenzahl;
                lhsEtagenzahl = this.getEtagenzahl();
                Long rhsEtagenzahl;
                rhsEtagenzahl = that.getEtagenzahl();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "etagenzahl", lhsEtagenzahl), LocatorUtils.property(thatLocator, "etagenzahl", rhsEtagenzahl), lhsEtagenzahl, rhsEtagenzahl, (this.etagenzahl!= null), (that.etagenzahl!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsBalkonTerrasse;
                lhsBalkonTerrasse = this.isBalkonTerrasse();
                Boolean rhsBalkonTerrasse;
                rhsBalkonTerrasse = that.isBalkonTerrasse();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "balkonTerrasse", lhsBalkonTerrasse), LocatorUtils.property(thatLocator, "balkonTerrasse", rhsBalkonTerrasse), lhsBalkonTerrasse, rhsBalkonTerrasse, (this.balkonTerrasse!= null), (that.balkonTerrasse!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsGartenBenutzung;
                lhsGartenBenutzung = this.isGartenBenutzung();
                Boolean rhsGartenBenutzung;
                rhsGartenBenutzung = that.isGartenBenutzung();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "gartenBenutzung", lhsGartenBenutzung), LocatorUtils.property(thatLocator, "gartenBenutzung", rhsGartenBenutzung), lhsGartenBenutzung, rhsGartenBenutzung, (this.gartenBenutzung!= null), (that.gartenBenutzung!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsBackofen;
                lhsBackofen = this.isBackofen();
                Boolean rhsBackofen;
                rhsBackofen = that.isBackofen();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "backofen", lhsBackofen), LocatorUtils.property(thatLocator, "backofen", rhsBackofen), lhsBackofen, rhsBackofen, (this.backofen!= null), (that.backofen!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsKuehlschrank;
                lhsKuehlschrank = this.isKuehlschrank();
                Boolean rhsKuehlschrank;
                rhsKuehlschrank = that.isKuehlschrank();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "kuehlschrank", lhsKuehlschrank), LocatorUtils.property(thatLocator, "kuehlschrank", rhsKuehlschrank), lhsKuehlschrank, rhsKuehlschrank, (this.kuehlschrank!= null), (that.kuehlschrank!= null))) {
                    return false;
                }
            }
            {
                Long lhsAnzahlBadezimmer;
                lhsAnzahlBadezimmer = this.getAnzahlBadezimmer();
                Long rhsAnzahlBadezimmer;
                rhsAnzahlBadezimmer = that.getAnzahlBadezimmer();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBadezimmer", lhsAnzahlBadezimmer), LocatorUtils.property(thatLocator, "anzahlBadezimmer", rhsAnzahlBadezimmer), lhsAnzahlBadezimmer, rhsAnzahlBadezimmer, (this.anzahlBadezimmer!= null), (that.anzahlBadezimmer!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsWC;
                lhsWC = this.isWC();
                Boolean rhsWC;
                rhsWC = that.isWC();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "wc", lhsWC), LocatorUtils.property(thatLocator, "wc", rhsWC), lhsWC, rhsWC, (this.wc!= null), (that.wc!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsGaesteWC;
                lhsGaesteWC = this.isGaesteWC();
                Boolean rhsGaesteWC;
                rhsGaesteWC = that.isGaesteWC();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "gaesteWC", lhsGaesteWC), LocatorUtils.property(thatLocator, "gaesteWC", rhsGaesteWC), lhsGaesteWC, rhsGaesteWC, (this.gaesteWC!= null), (that.gaesteWC!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsHerd;
                lhsHerd = this.isHerd();
                Boolean rhsHerd;
                rhsHerd = that.isHerd();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "herd", lhsHerd), LocatorUtils.property(thatLocator, "herd", rhsHerd), lhsHerd, rhsHerd, (this.herd!= null), (that.herd!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsDusche;
                lhsDusche = this.isDusche();
                Boolean rhsDusche;
                rhsDusche = that.isDusche();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "dusche", lhsDusche), LocatorUtils.property(thatLocator, "dusche", rhsDusche), lhsDusche, rhsDusche, (this.dusche!= null), (that.dusche!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsBadewanne;
                lhsBadewanne = this.isBadewanne();
                Boolean rhsBadewanne;
                rhsBadewanne = that.isBadewanne();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "badewanne", lhsBadewanne), LocatorUtils.property(thatLocator, "badewanne", rhsBadewanne), lhsBadewanne, rhsBadewanne, (this.badewanne!= null), (that.badewanne!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsSpuelmaschine;
                lhsSpuelmaschine = this.isSpuelmaschine();
                Boolean rhsSpuelmaschine;
                rhsSpuelmaschine = that.isSpuelmaschine();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "spuelmaschine", lhsSpuelmaschine), LocatorUtils.property(thatLocator, "spuelmaschine", rhsSpuelmaschine), lhsSpuelmaschine, rhsSpuelmaschine, (this.spuelmaschine!= null), (that.spuelmaschine!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsWaschmaschine;
                lhsWaschmaschine = this.isWaschmaschine();
                Boolean rhsWaschmaschine;
                rhsWaschmaschine = that.isWaschmaschine();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "waschmaschine", lhsWaschmaschine), LocatorUtils.property(thatLocator, "waschmaschine", rhsWaschmaschine), lhsWaschmaschine, rhsWaschmaschine, (this.waschmaschine!= null), (that.waschmaschine!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsKeller;
                lhsKeller = this.isKeller();
                Boolean rhsKeller;
                rhsKeller = that.isKeller();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "keller", lhsKeller), LocatorUtils.property(thatLocator, "keller", rhsKeller), lhsKeller, rhsKeller, (this.keller!= null), (that.keller!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsAufzug;
                lhsAufzug = this.isAufzug();
                Boolean rhsAufzug;
                rhsAufzug = that.isAufzug();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "aufzug", lhsAufzug), LocatorUtils.property(thatLocator, "aufzug", rhsAufzug), lhsAufzug, rhsAufzug, (this.aufzug!= null), (that.aufzug!= null))) {
                    return false;
                }
            }
            {
                GenehmigungTyp lhsHaustiere;
                lhsHaustiere = this.getHaustiere();
                GenehmigungTyp rhsHaustiere;
                rhsHaustiere = that.getHaustiere();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "haustiere", lhsHaustiere), LocatorUtils.property(thatLocator, "haustiere", rhsHaustiere), lhsHaustiere, rhsHaustiere, (this.haustiere!= null), (that.haustiere!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsBarrierefrei;
                lhsBarrierefrei = this.isBarrierefrei();
                Boolean rhsBarrierefrei;
                rhsBarrierefrei = that.isBarrierefrei();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "barrierefrei", lhsBarrierefrei), LocatorUtils.property(thatLocator, "barrierefrei", rhsBarrierefrei), lhsBarrierefrei, rhsBarrierefrei, (this.barrierefrei!= null), (that.barrierefrei!= null))) {
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
                Long lhsAnzahlMaennlicheMitbewohner;
                lhsAnzahlMaennlicheMitbewohner = this.getAnzahlMaennlicheMitbewohner();
                Long rhsAnzahlMaennlicheMitbewohner;
                rhsAnzahlMaennlicheMitbewohner = that.getAnzahlMaennlicheMitbewohner();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlMaennlicheMitbewohner", lhsAnzahlMaennlicheMitbewohner), LocatorUtils.property(thatLocator, "anzahlMaennlicheMitbewohner", rhsAnzahlMaennlicheMitbewohner), lhsAnzahlMaennlicheMitbewohner, rhsAnzahlMaennlicheMitbewohner, (this.anzahlMaennlicheMitbewohner!= null), (that.anzahlMaennlicheMitbewohner!= null))) {
                    return false;
                }
            }
            {
                Long lhsAnzahlWeiblicheMitbewohner;
                lhsAnzahlWeiblicheMitbewohner = this.getAnzahlWeiblicheMitbewohner();
                Long rhsAnzahlWeiblicheMitbewohner;
                rhsAnzahlWeiblicheMitbewohner = that.getAnzahlWeiblicheMitbewohner();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlWeiblicheMitbewohner", lhsAnzahlWeiblicheMitbewohner), LocatorUtils.property(thatLocator, "anzahlWeiblicheMitbewohner", rhsAnzahlWeiblicheMitbewohner), lhsAnzahlWeiblicheMitbewohner, rhsAnzahlWeiblicheMitbewohner, (this.anzahlWeiblicheMitbewohner!= null), (that.anzahlWeiblicheMitbewohner!= null))) {
                    return false;
                }
            }
            {
                Long lhsAlterDerzeitigeBewohnerVon;
                lhsAlterDerzeitigeBewohnerVon = this.getAlterDerzeitigeBewohnerVon();
                Long rhsAlterDerzeitigeBewohnerVon;
                rhsAlterDerzeitigeBewohnerVon = that.getAlterDerzeitigeBewohnerVon();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "alterDerzeitigeBewohnerVon", lhsAlterDerzeitigeBewohnerVon), LocatorUtils.property(thatLocator, "alterDerzeitigeBewohnerVon", rhsAlterDerzeitigeBewohnerVon), lhsAlterDerzeitigeBewohnerVon, rhsAlterDerzeitigeBewohnerVon, (this.alterDerzeitigeBewohnerVon!= null), (that.alterDerzeitigeBewohnerVon!= null))) {
                    return false;
                }
            }
            {
                Long lhsAlterDerzeitigeBewohnerBis;
                lhsAlterDerzeitigeBewohnerBis = this.getAlterDerzeitigeBewohnerBis();
                Long rhsAlterDerzeitigeBewohnerBis;
                rhsAlterDerzeitigeBewohnerBis = that.getAlterDerzeitigeBewohnerBis();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "alterDerzeitigeBewohnerBis", lhsAlterDerzeitigeBewohnerBis), LocatorUtils.property(thatLocator, "alterDerzeitigeBewohnerBis", rhsAlterDerzeitigeBewohnerBis), lhsAlterDerzeitigeBewohnerBis, rhsAlterDerzeitigeBewohnerBis, (this.alterDerzeitigeBewohnerBis!= null), (that.alterDerzeitigeBewohnerBis!= null))) {
                    return false;
                }
            }
            {
                Long lhsAlterGesuchterBewohnerVon;
                lhsAlterGesuchterBewohnerVon = this.getAlterGesuchterBewohnerVon();
                Long rhsAlterGesuchterBewohnerVon;
                rhsAlterGesuchterBewohnerVon = that.getAlterGesuchterBewohnerVon();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "alterGesuchterBewohnerVon", lhsAlterGesuchterBewohnerVon), LocatorUtils.property(thatLocator, "alterGesuchterBewohnerVon", rhsAlterGesuchterBewohnerVon), lhsAlterGesuchterBewohnerVon, rhsAlterGesuchterBewohnerVon, (this.alterGesuchterBewohnerVon!= null), (that.alterGesuchterBewohnerVon!= null))) {
                    return false;
                }
            }
            {
                Long lhsAlterGesuchterBewohnerBis;
                lhsAlterGesuchterBewohnerBis = this.getAlterGesuchterBewohnerBis();
                Long rhsAlterGesuchterBewohnerBis;
                rhsAlterGesuchterBewohnerBis = that.getAlterGesuchterBewohnerBis();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "alterGesuchterBewohnerBis", lhsAlterGesuchterBewohnerBis), LocatorUtils.property(thatLocator, "alterGesuchterBewohnerBis", rhsAlterGesuchterBewohnerBis), lhsAlterGesuchterBewohnerBis, rhsAlterGesuchterBewohnerBis, (this.alterGesuchterBewohnerBis!= null), (that.alterGesuchterBewohnerBis!= null))) {
                    return false;
                }
            }
            {
                WGZimmerGeschlechtTyp lhsGeschlechtGesuchterBewohner;
                lhsGeschlechtGesuchterBewohner = this.getGeschlechtGesuchterBewohner();
                WGZimmerGeschlechtTyp rhsGeschlechtGesuchterBewohner;
                rhsGeschlechtGesuchterBewohner = that.getGeschlechtGesuchterBewohner();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "geschlechtGesuchterBewohner", lhsGeschlechtGesuchterBewohner), LocatorUtils.property(thatLocator, "geschlechtGesuchterBewohner", rhsGeschlechtGesuchterBewohner), lhsGeschlechtGesuchterBewohner, rhsGeschlechtGesuchterBewohner, (this.geschlechtGesuchterBewohner!= null), (that.geschlechtGesuchterBewohner!= null))) {
                    return false;
                }
            }
            {
                Long lhsAnzahlGesuchteMitbewohner;
                lhsAnzahlGesuchteMitbewohner = this.getAnzahlGesuchteMitbewohner();
                Long rhsAnzahlGesuchteMitbewohner;
                rhsAnzahlGesuchteMitbewohner = that.getAnzahlGesuchteMitbewohner();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlGesuchteMitbewohner", lhsAnzahlGesuchteMitbewohner), LocatorUtils.property(thatLocator, "anzahlGesuchteMitbewohner", rhsAnzahlGesuchteMitbewohner), lhsAnzahlGesuchteMitbewohner, rhsAnzahlGesuchteMitbewohner, (this.anzahlGesuchteMitbewohner!= null), (that.anzahlGesuchteMitbewohner!= null))) {
                    return false;
                }
            }
            {
                TelefonanschlussTyp lhsTelefonanschluss;
                lhsTelefonanschluss = this.getTelefonanschluss();
                TelefonanschlussTyp rhsTelefonanschluss;
                rhsTelefonanschluss = that.getTelefonanschluss();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "telefonanschluss", lhsTelefonanschluss), LocatorUtils.property(thatLocator, "telefonanschluss", rhsTelefonanschluss), lhsTelefonanschluss, rhsTelefonanschluss, (this.telefonanschluss!= null), (that.telefonanschluss!= null))) {
                    return false;
                }
            }
            {
                InternetanschlussTyp lhsInternetanschluss;
                lhsInternetanschluss = this.getInternetanschluss();
                InternetanschlussTyp rhsInternetanschluss;
                rhsInternetanschluss = that.getInternetanschluss();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "internetanschluss", lhsInternetanschluss), LocatorUtils.property(thatLocator, "internetanschluss", rhsInternetanschluss), lhsInternetanschluss, rhsInternetanschluss, (this.internetanschluss!= null), (that.internetanschluss!= null))) {
                    return false;
                }
            }
            {
                TVAnschlussTyp lhsTVAnschluss;
                lhsTVAnschluss = this.getTVAnschluss();
                TVAnschlussTyp rhsTVAnschluss;
                rhsTVAnschluss = that.getTVAnschluss();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "tvAnschluss", lhsTVAnschluss), LocatorUtils.property(thatLocator, "tvAnschluss", rhsTVAnschluss), lhsTVAnschluss, rhsTVAnschluss, (this.tvAnschluss!= null), (that.tvAnschluss!= null))) {
                    return false;
                }
            }
            {
                ParkplatzsituationTyp lhsParkplatzsituation;
                lhsParkplatzsituation = this.getParkplatzsituation();
                ParkplatzsituationTyp rhsParkplatzsituation;
                rhsParkplatzsituation = that.getParkplatzsituation();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "parkplatzsituation", lhsParkplatzsituation), LocatorUtils.property(thatLocator, "parkplatzsituation", rhsParkplatzsituation), lhsParkplatzsituation, rhsParkplatzsituation, (this.parkplatzsituation!= null), (that.parkplatzsituation!= null))) {
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

}
