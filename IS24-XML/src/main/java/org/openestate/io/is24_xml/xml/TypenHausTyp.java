
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
 * <p>Java class for TypenHausTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypenHausTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}VirtuelleImmobilieBaseTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Baureihe" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/&gt;
 *         &lt;element name="Haustypinfo" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/&gt;
 *         &lt;element name="Dachform" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/&gt;
 *         &lt;element name="WohnFlProGeschoss" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/&gt;
 *         &lt;element name="PreisProBauleistung" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Objektkategorie2" type="{http://www.immobilienscout24.de/immobilientransfer}TypenHausKategorienTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="Wohnflaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Grundflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Gesamtflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Zimmeranzahl" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}ZimmeranzahlTyp" /&gt;
 *       &lt;attribute name="PreisAb" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="Bauweise" type="{http://www.immobilienscout24.de/immobilientransfer}BauweiseTyp" /&gt;
 *       &lt;attribute name="KWert" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl32Typ" /&gt;
 *       &lt;attribute name="Ausbaustufe" type="{http://www.immobilienscout24.de/immobilientransfer}AusbaustufeTyp" /&gt;
 *       &lt;attribute name="Energiestandard" type="{http://www.immobilienscout24.de/immobilientransfer}EnergiestandardTyp" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypenHausTyp", propOrder = {
    "baureihe",
    "haustypinfo",
    "dachform",
    "wohnFlProGeschoss",
    "preisProBauleistung"
})
@XmlSeeAlso({
    TypenHaus.class
})
public class TypenHausTyp
    extends VirtuelleImmobilieBaseTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "Baureihe")
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected String baureihe;
    @XmlElement(name = "Haustypinfo")
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected String haustypinfo;
    @XmlElement(name = "Dachform")
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected String dachform;
    @XmlElement(name = "WohnFlProGeschoss")
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected String wohnFlProGeschoss;
    @XmlElement(name = "PreisProBauleistung")
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected String preisProBauleistung;
    @XmlAttribute(name = "Objektkategorie2")
    protected TypenHausKategorienTyp objektkategorie2;
    @XmlAttribute(name = "Wohnflaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected Double wohnflaeche;
    @XmlAttribute(name = "Grundflaeche")
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected Double grundflaeche;
    @XmlAttribute(name = "Gesamtflaeche")
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected Double gesamtflaeche;
    @XmlAttribute(name = "Zimmeranzahl", required = true)
    @XmlJavaTypeAdapter(Adapter32 .class)
    protected Double zimmeranzahl;
    @XmlAttribute(name = "PreisAb", required = true)
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected Double preisAb;
    @XmlAttribute(name = "Bauweise")
    protected BauweiseTyp bauweise;
    @XmlAttribute(name = "KWert")
    @XmlJavaTypeAdapter(Adapter28 .class)
    protected Double kWert;
    @XmlAttribute(name = "Ausbaustufe")
    protected AusbaustufeTyp ausbaustufe;
    @XmlAttribute(name = "Energiestandard")
    protected EnergiestandardTyp energiestandard;

    /**
     * Gets the value of the baureihe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaureihe() {
        return baureihe;
    }

    /**
     * Sets the value of the baureihe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaureihe(String value) {
        this.baureihe = value;
    }

    /**
     * Gets the value of the haustypinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaustypinfo() {
        return haustypinfo;
    }

    /**
     * Sets the value of the haustypinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaustypinfo(String value) {
        this.haustypinfo = value;
    }

    /**
     * Gets the value of the dachform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDachform() {
        return dachform;
    }

    /**
     * Sets the value of the dachform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDachform(String value) {
        this.dachform = value;
    }

    /**
     * Gets the value of the wohnFlProGeschoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWohnFlProGeschoss() {
        return wohnFlProGeschoss;
    }

    /**
     * Sets the value of the wohnFlProGeschoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnFlProGeschoss(String value) {
        this.wohnFlProGeschoss = value;
    }

    /**
     * Gets the value of the preisProBauleistung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreisProBauleistung() {
        return preisProBauleistung;
    }

    /**
     * Sets the value of the preisProBauleistung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreisProBauleistung(String value) {
        this.preisProBauleistung = value;
    }

    /**
     * Gets the value of the objektkategorie2 property.
     * 
     * @return
     *     possible object is
     *     {@link TypenHausKategorienTyp }
     *     
     */
    public TypenHausKategorienTyp getObjektkategorie2() {
        if (objektkategorie2 == null) {
            return TypenHausKategorienTyp.KEINE_ANGABE;
        } else {
            return objektkategorie2;
        }
    }

    /**
     * Sets the value of the objektkategorie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypenHausKategorienTyp }
     *     
     */
    public void setObjektkategorie2(TypenHausKategorienTyp value) {
        this.objektkategorie2 = value;
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
     * Gets the value of the grundflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGrundflaeche() {
        return grundflaeche;
    }

    /**
     * Sets the value of the grundflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrundflaeche(Double value) {
        this.grundflaeche = value;
    }

    /**
     * Gets the value of the gesamtflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getGesamtflaeche() {
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
    public void setGesamtflaeche(Double value) {
        this.gesamtflaeche = value;
    }

    /**
     * Gets the value of the zimmeranzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getZimmeranzahl() {
        return zimmeranzahl;
    }

    /**
     * Sets the value of the zimmeranzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZimmeranzahl(Double value) {
        this.zimmeranzahl = value;
    }

    /**
     * Gets the value of the preisAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getPreisAb() {
        return preisAb;
    }

    /**
     * Sets the value of the preisAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreisAb(Double value) {
        this.preisAb = value;
    }

    /**
     * Gets the value of the bauweise property.
     * 
     * @return
     *     possible object is
     *     {@link BauweiseTyp }
     *     
     */
    public BauweiseTyp getBauweise() {
        return bauweise;
    }

    /**
     * Sets the value of the bauweise property.
     * 
     * @param value
     *     allowed object is
     *     {@link BauweiseTyp }
     *     
     */
    public void setBauweise(BauweiseTyp value) {
        this.bauweise = value;
    }

    /**
     * Gets the value of the kWert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getKWert() {
        return kWert;
    }

    /**
     * Sets the value of the kWert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKWert(Double value) {
        this.kWert = value;
    }

    /**
     * Gets the value of the ausbaustufe property.
     * 
     * @return
     *     possible object is
     *     {@link AusbaustufeTyp }
     *     
     */
    public AusbaustufeTyp getAusbaustufe() {
        return ausbaustufe;
    }

    /**
     * Sets the value of the ausbaustufe property.
     * 
     * @param value
     *     allowed object is
     *     {@link AusbaustufeTyp }
     *     
     */
    public void setAusbaustufe(AusbaustufeTyp value) {
        this.ausbaustufe = value;
    }

    /**
     * Gets the value of the energiestandard property.
     * 
     * @return
     *     possible object is
     *     {@link EnergiestandardTyp }
     *     
     */
    public EnergiestandardTyp getEnergiestandard() {
        return energiestandard;
    }

    /**
     * Sets the value of the energiestandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergiestandardTyp }
     *     
     */
    public void setEnergiestandard(EnergiestandardTyp value) {
        this.energiestandard = value;
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
            String theBaureihe;
            theBaureihe = this.getBaureihe();
            strategy.appendField(locator, this, "baureihe", buffer, theBaureihe);
        }
        {
            String theHaustypinfo;
            theHaustypinfo = this.getHaustypinfo();
            strategy.appendField(locator, this, "haustypinfo", buffer, theHaustypinfo);
        }
        {
            String theDachform;
            theDachform = this.getDachform();
            strategy.appendField(locator, this, "dachform", buffer, theDachform);
        }
        {
            String theWohnFlProGeschoss;
            theWohnFlProGeschoss = this.getWohnFlProGeschoss();
            strategy.appendField(locator, this, "wohnFlProGeschoss", buffer, theWohnFlProGeschoss);
        }
        {
            String thePreisProBauleistung;
            thePreisProBauleistung = this.getPreisProBauleistung();
            strategy.appendField(locator, this, "preisProBauleistung", buffer, thePreisProBauleistung);
        }
        {
            TypenHausKategorienTyp theObjektkategorie2;
            theObjektkategorie2 = this.getObjektkategorie2();
            strategy.appendField(locator, this, "objektkategorie2", buffer, theObjektkategorie2);
        }
        {
            Double theWohnflaeche;
            theWohnflaeche = this.getWohnflaeche();
            strategy.appendField(locator, this, "wohnflaeche", buffer, theWohnflaeche);
        }
        {
            Double theGrundflaeche;
            theGrundflaeche = this.getGrundflaeche();
            strategy.appendField(locator, this, "grundflaeche", buffer, theGrundflaeche);
        }
        {
            Double theGesamtflaeche;
            theGesamtflaeche = this.getGesamtflaeche();
            strategy.appendField(locator, this, "gesamtflaeche", buffer, theGesamtflaeche);
        }
        {
            Double theZimmeranzahl;
            theZimmeranzahl = this.getZimmeranzahl();
            strategy.appendField(locator, this, "zimmeranzahl", buffer, theZimmeranzahl);
        }
        {
            Double thePreisAb;
            thePreisAb = this.getPreisAb();
            strategy.appendField(locator, this, "preisAb", buffer, thePreisAb);
        }
        {
            BauweiseTyp theBauweise;
            theBauweise = this.getBauweise();
            strategy.appendField(locator, this, "bauweise", buffer, theBauweise);
        }
        {
            Double theKWert;
            theKWert = this.getKWert();
            strategy.appendField(locator, this, "kWert", buffer, theKWert);
        }
        {
            AusbaustufeTyp theAusbaustufe;
            theAusbaustufe = this.getAusbaustufe();
            strategy.appendField(locator, this, "ausbaustufe", buffer, theAusbaustufe);
        }
        {
            EnergiestandardTyp theEnergiestandard;
            theEnergiestandard = this.getEnergiestandard();
            strategy.appendField(locator, this, "energiestandard", buffer, theEnergiestandard);
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
        if (draftCopy instanceof TypenHausTyp) {
            final TypenHausTyp copy = ((TypenHausTyp) draftCopy);
            if (this.baureihe!= null) {
                String sourceBaureihe;
                sourceBaureihe = this.getBaureihe();
                String copyBaureihe = ((String) strategy.copy(LocatorUtils.property(locator, "baureihe", sourceBaureihe), sourceBaureihe));
                copy.setBaureihe(copyBaureihe);
            } else {
                copy.baureihe = null;
            }
            if (this.haustypinfo!= null) {
                String sourceHaustypinfo;
                sourceHaustypinfo = this.getHaustypinfo();
                String copyHaustypinfo = ((String) strategy.copy(LocatorUtils.property(locator, "haustypinfo", sourceHaustypinfo), sourceHaustypinfo));
                copy.setHaustypinfo(copyHaustypinfo);
            } else {
                copy.haustypinfo = null;
            }
            if (this.dachform!= null) {
                String sourceDachform;
                sourceDachform = this.getDachform();
                String copyDachform = ((String) strategy.copy(LocatorUtils.property(locator, "dachform", sourceDachform), sourceDachform));
                copy.setDachform(copyDachform);
            } else {
                copy.dachform = null;
            }
            if (this.wohnFlProGeschoss!= null) {
                String sourceWohnFlProGeschoss;
                sourceWohnFlProGeschoss = this.getWohnFlProGeschoss();
                String copyWohnFlProGeschoss = ((String) strategy.copy(LocatorUtils.property(locator, "wohnFlProGeschoss", sourceWohnFlProGeschoss), sourceWohnFlProGeschoss));
                copy.setWohnFlProGeschoss(copyWohnFlProGeschoss);
            } else {
                copy.wohnFlProGeschoss = null;
            }
            if (this.preisProBauleistung!= null) {
                String sourcePreisProBauleistung;
                sourcePreisProBauleistung = this.getPreisProBauleistung();
                String copyPreisProBauleistung = ((String) strategy.copy(LocatorUtils.property(locator, "preisProBauleistung", sourcePreisProBauleistung), sourcePreisProBauleistung));
                copy.setPreisProBauleistung(copyPreisProBauleistung);
            } else {
                copy.preisProBauleistung = null;
            }
            if (this.objektkategorie2 != null) {
                TypenHausKategorienTyp sourceObjektkategorie2;
                sourceObjektkategorie2 = this.getObjektkategorie2();
                TypenHausKategorienTyp copyObjektkategorie2 = ((TypenHausKategorienTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2));
                copy.setObjektkategorie2(copyObjektkategorie2);
            } else {
                copy.objektkategorie2 = null;
            }
            if (this.wohnflaeche!= null) {
                Double sourceWohnflaeche;
                sourceWohnflaeche = this.getWohnflaeche();
                Double copyWohnflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "wohnflaeche", sourceWohnflaeche), sourceWohnflaeche));
                copy.setWohnflaeche(copyWohnflaeche);
            } else {
                copy.wohnflaeche = null;
            }
            if (this.grundflaeche!= null) {
                Double sourceGrundflaeche;
                sourceGrundflaeche = this.getGrundflaeche();
                Double copyGrundflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "grundflaeche", sourceGrundflaeche), sourceGrundflaeche));
                copy.setGrundflaeche(copyGrundflaeche);
            } else {
                copy.grundflaeche = null;
            }
            if (this.gesamtflaeche!= null) {
                Double sourceGesamtflaeche;
                sourceGesamtflaeche = this.getGesamtflaeche();
                Double copyGesamtflaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "gesamtflaeche", sourceGesamtflaeche), sourceGesamtflaeche));
                copy.setGesamtflaeche(copyGesamtflaeche);
            } else {
                copy.gesamtflaeche = null;
            }
            if (this.zimmeranzahl!= null) {
                Double sourceZimmeranzahl;
                sourceZimmeranzahl = this.getZimmeranzahl();
                Double copyZimmeranzahl = ((Double) strategy.copy(LocatorUtils.property(locator, "zimmeranzahl", sourceZimmeranzahl), sourceZimmeranzahl));
                copy.setZimmeranzahl(copyZimmeranzahl);
            } else {
                copy.zimmeranzahl = null;
            }
            if (this.preisAb!= null) {
                Double sourcePreisAb;
                sourcePreisAb = this.getPreisAb();
                Double copyPreisAb = ((Double) strategy.copy(LocatorUtils.property(locator, "preisAb", sourcePreisAb), sourcePreisAb));
                copy.setPreisAb(copyPreisAb);
            } else {
                copy.preisAb = null;
            }
            if (this.bauweise!= null) {
                BauweiseTyp sourceBauweise;
                sourceBauweise = this.getBauweise();
                BauweiseTyp copyBauweise = ((BauweiseTyp) strategy.copy(LocatorUtils.property(locator, "bauweise", sourceBauweise), sourceBauweise));
                copy.setBauweise(copyBauweise);
            } else {
                copy.bauweise = null;
            }
            if (this.kWert!= null) {
                Double sourceKWert;
                sourceKWert = this.getKWert();
                Double copyKWert = ((Double) strategy.copy(LocatorUtils.property(locator, "kWert", sourceKWert), sourceKWert));
                copy.setKWert(copyKWert);
            } else {
                copy.kWert = null;
            }
            if (this.ausbaustufe!= null) {
                AusbaustufeTyp sourceAusbaustufe;
                sourceAusbaustufe = this.getAusbaustufe();
                AusbaustufeTyp copyAusbaustufe = ((AusbaustufeTyp) strategy.copy(LocatorUtils.property(locator, "ausbaustufe", sourceAusbaustufe), sourceAusbaustufe));
                copy.setAusbaustufe(copyAusbaustufe);
            } else {
                copy.ausbaustufe = null;
            }
            if (this.energiestandard!= null) {
                EnergiestandardTyp sourceEnergiestandard;
                sourceEnergiestandard = this.getEnergiestandard();
                EnergiestandardTyp copyEnergiestandard = ((EnergiestandardTyp) strategy.copy(LocatorUtils.property(locator, "energiestandard", sourceEnergiestandard), sourceEnergiestandard));
                copy.setEnergiestandard(copyEnergiestandard);
            } else {
                copy.energiestandard = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TypenHausTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TypenHausTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TypenHausTyp that = ((TypenHausTyp) object);
        {
            String lhsBaureihe;
            lhsBaureihe = this.getBaureihe();
            String rhsBaureihe;
            rhsBaureihe = that.getBaureihe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baureihe", lhsBaureihe), LocatorUtils.property(thatLocator, "baureihe", rhsBaureihe), lhsBaureihe, rhsBaureihe)) {
                return false;
            }
        }
        {
            String lhsHaustypinfo;
            lhsHaustypinfo = this.getHaustypinfo();
            String rhsHaustypinfo;
            rhsHaustypinfo = that.getHaustypinfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haustypinfo", lhsHaustypinfo), LocatorUtils.property(thatLocator, "haustypinfo", rhsHaustypinfo), lhsHaustypinfo, rhsHaustypinfo)) {
                return false;
            }
        }
        {
            String lhsDachform;
            lhsDachform = this.getDachform();
            String rhsDachform;
            rhsDachform = that.getDachform();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dachform", lhsDachform), LocatorUtils.property(thatLocator, "dachform", rhsDachform), lhsDachform, rhsDachform)) {
                return false;
            }
        }
        {
            String lhsWohnFlProGeschoss;
            lhsWohnFlProGeschoss = this.getWohnFlProGeschoss();
            String rhsWohnFlProGeschoss;
            rhsWohnFlProGeschoss = that.getWohnFlProGeschoss();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnFlProGeschoss", lhsWohnFlProGeschoss), LocatorUtils.property(thatLocator, "wohnFlProGeschoss", rhsWohnFlProGeschoss), lhsWohnFlProGeschoss, rhsWohnFlProGeschoss)) {
                return false;
            }
        }
        {
            String lhsPreisProBauleistung;
            lhsPreisProBauleistung = this.getPreisProBauleistung();
            String rhsPreisProBauleistung;
            rhsPreisProBauleistung = that.getPreisProBauleistung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisProBauleistung", lhsPreisProBauleistung), LocatorUtils.property(thatLocator, "preisProBauleistung", rhsPreisProBauleistung), lhsPreisProBauleistung, rhsPreisProBauleistung)) {
                return false;
            }
        }
        {
            TypenHausKategorienTyp lhsObjektkategorie2;
            lhsObjektkategorie2 = this.getObjektkategorie2();
            TypenHausKategorienTyp rhsObjektkategorie2;
            rhsObjektkategorie2 = that.getObjektkategorie2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie2", lhsObjektkategorie2), LocatorUtils.property(thatLocator, "objektkategorie2", rhsObjektkategorie2), lhsObjektkategorie2, rhsObjektkategorie2)) {
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
            Double lhsGrundflaeche;
            lhsGrundflaeche = this.getGrundflaeche();
            Double rhsGrundflaeche;
            rhsGrundflaeche = that.getGrundflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundflaeche", lhsGrundflaeche), LocatorUtils.property(thatLocator, "grundflaeche", rhsGrundflaeche), lhsGrundflaeche, rhsGrundflaeche)) {
                return false;
            }
        }
        {
            Double lhsGesamtflaeche;
            lhsGesamtflaeche = this.getGesamtflaeche();
            Double rhsGesamtflaeche;
            rhsGesamtflaeche = that.getGesamtflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtflaeche", lhsGesamtflaeche), LocatorUtils.property(thatLocator, "gesamtflaeche", rhsGesamtflaeche), lhsGesamtflaeche, rhsGesamtflaeche)) {
                return false;
            }
        }
        {
            Double lhsZimmeranzahl;
            lhsZimmeranzahl = this.getZimmeranzahl();
            Double rhsZimmeranzahl;
            rhsZimmeranzahl = that.getZimmeranzahl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zimmeranzahl", lhsZimmeranzahl), LocatorUtils.property(thatLocator, "zimmeranzahl", rhsZimmeranzahl), lhsZimmeranzahl, rhsZimmeranzahl)) {
                return false;
            }
        }
        {
            Double lhsPreisAb;
            lhsPreisAb = this.getPreisAb();
            Double rhsPreisAb;
            rhsPreisAb = that.getPreisAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisAb", lhsPreisAb), LocatorUtils.property(thatLocator, "preisAb", rhsPreisAb), lhsPreisAb, rhsPreisAb)) {
                return false;
            }
        }
        {
            BauweiseTyp lhsBauweise;
            lhsBauweise = this.getBauweise();
            BauweiseTyp rhsBauweise;
            rhsBauweise = that.getBauweise();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bauweise", lhsBauweise), LocatorUtils.property(thatLocator, "bauweise", rhsBauweise), lhsBauweise, rhsBauweise)) {
                return false;
            }
        }
        {
            Double lhsKWert;
            lhsKWert = this.getKWert();
            Double rhsKWert;
            rhsKWert = that.getKWert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kWert", lhsKWert), LocatorUtils.property(thatLocator, "kWert", rhsKWert), lhsKWert, rhsKWert)) {
                return false;
            }
        }
        {
            AusbaustufeTyp lhsAusbaustufe;
            lhsAusbaustufe = this.getAusbaustufe();
            AusbaustufeTyp rhsAusbaustufe;
            rhsAusbaustufe = that.getAusbaustufe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausbaustufe", lhsAusbaustufe), LocatorUtils.property(thatLocator, "ausbaustufe", rhsAusbaustufe), lhsAusbaustufe, rhsAusbaustufe)) {
                return false;
            }
        }
        {
            EnergiestandardTyp lhsEnergiestandard;
            lhsEnergiestandard = this.getEnergiestandard();
            EnergiestandardTyp rhsEnergiestandard;
            rhsEnergiestandard = that.getEnergiestandard();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energiestandard", lhsEnergiestandard), LocatorUtils.property(thatLocator, "energiestandard", rhsEnergiestandard), lhsEnergiestandard, rhsEnergiestandard)) {
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
