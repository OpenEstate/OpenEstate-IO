
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
 * <p>Java class for BueroPraxisTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BueroPraxisTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}GewerbeImmoBaseTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vermarktung" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungGewerbeTyp"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Objektkategorie2" type="{http://www.immobilienscout24.de/immobilientransfer}BueroPraxisKategorienTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="BueroPraxisFlaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Bodenbelag" type="{http://www.immobilienscout24.de/immobilientransfer}BodenbelagTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="DatenVerkabelung" type="{http://www.immobilienscout24.de/immobilientransfer}DatenVerkabelungsTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="Klimaanlage" type="{http://www.immobilienscout24.de/immobilientransfer}JaNeinVereinbarungTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="Kantine" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Denkmalschutzobjekt" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Keller" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Barrierefrei" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="KuecheVorhanden" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Starkstrom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BueroPraxisTyp", propOrder = {
    "vermarktung"
})
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.BueroPraxis.Type.class
})
public class BueroPraxisTyp
    extends GewerbeImmoBaseTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "Vermarktung", required = true)
    protected VermarktungGewerbeTyp vermarktung;
    @XmlAttribute(name = "Objektkategorie2")
    protected BueroPraxisKategorienTyp objektkategorie2;
    @XmlAttribute(name = "BueroPraxisFlaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected Double bueroPraxisFlaeche;
    @XmlAttribute(name = "Bodenbelag")
    protected BodenbelagTyp bodenbelag;
    @XmlAttribute(name = "DatenVerkabelung")
    protected DatenVerkabelungsTyp datenVerkabelung;
    @XmlAttribute(name = "Klimaanlage")
    protected JaNeinVereinbarungTyp klimaanlage;
    @XmlAttribute(name = "Kantine")
    protected Boolean kantine;
    @XmlAttribute(name = "Denkmalschutzobjekt")
    protected Boolean denkmalschutzobjekt;
    @XmlAttribute(name = "Keller")
    protected Boolean keller;
    @XmlAttribute(name = "Barrierefrei")
    protected Boolean barrierefrei;
    @XmlAttribute(name = "KuecheVorhanden")
    protected Boolean kuecheVorhanden;
    @XmlAttribute(name = "Starkstrom")
    protected Boolean starkstrom;

    /**
     * Gets the value of the vermarktung property.
     * 
     * @return
     *     possible object is
     *     {@link VermarktungGewerbeTyp }
     *     
     */
    public VermarktungGewerbeTyp getVermarktung() {
        return vermarktung;
    }

    /**
     * Sets the value of the vermarktung property.
     * 
     * @param value
     *     allowed object is
     *     {@link VermarktungGewerbeTyp }
     *     
     */
    public void setVermarktung(VermarktungGewerbeTyp value) {
        this.vermarktung = value;
    }

    /**
     * Gets the value of the objektkategorie2 property.
     * 
     * @return
     *     possible object is
     *     {@link BueroPraxisKategorienTyp }
     *     
     */
    public BueroPraxisKategorienTyp getObjektkategorie2() {
        if (objektkategorie2 == null) {
            return BueroPraxisKategorienTyp.KEINE_ANGABE;
        } else {
            return objektkategorie2;
        }
    }

    /**
     * Sets the value of the objektkategorie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BueroPraxisKategorienTyp }
     *     
     */
    public void setObjektkategorie2(BueroPraxisKategorienTyp value) {
        this.objektkategorie2 = value;
    }

    /**
     * Gets the value of the bueroPraxisFlaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getBueroPraxisFlaeche() {
        return bueroPraxisFlaeche;
    }

    /**
     * Sets the value of the bueroPraxisFlaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBueroPraxisFlaeche(Double value) {
        this.bueroPraxisFlaeche = value;
    }

    /**
     * Gets the value of the bodenbelag property.
     * 
     * @return
     *     possible object is
     *     {@link BodenbelagTyp }
     *     
     */
    public BodenbelagTyp getBodenbelag() {
        if (bodenbelag == null) {
            return BodenbelagTyp.KEINE_ANGABE;
        } else {
            return bodenbelag;
        }
    }

    /**
     * Sets the value of the bodenbelag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodenbelagTyp }
     *     
     */
    public void setBodenbelag(BodenbelagTyp value) {
        this.bodenbelag = value;
    }

    /**
     * Gets the value of the datenVerkabelung property.
     * 
     * @return
     *     possible object is
     *     {@link DatenVerkabelungsTyp }
     *     
     */
    public DatenVerkabelungsTyp getDatenVerkabelung() {
        if (datenVerkabelung == null) {
            return DatenVerkabelungsTyp.KEINE_ANGABE;
        } else {
            return datenVerkabelung;
        }
    }

    /**
     * Sets the value of the datenVerkabelung property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatenVerkabelungsTyp }
     *     
     */
    public void setDatenVerkabelung(DatenVerkabelungsTyp value) {
        this.datenVerkabelung = value;
    }

    /**
     * Gets the value of the klimaanlage property.
     * 
     * @return
     *     possible object is
     *     {@link JaNeinVereinbarungTyp }
     *     
     */
    public JaNeinVereinbarungTyp getKlimaanlage() {
        if (klimaanlage == null) {
            return JaNeinVereinbarungTyp.KEINE_ANGABE;
        } else {
            return klimaanlage;
        }
    }

    /**
     * Sets the value of the klimaanlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaNeinVereinbarungTyp }
     *     
     */
    public void setKlimaanlage(JaNeinVereinbarungTyp value) {
        this.klimaanlage = value;
    }

    /**
     * Gets the value of the kantine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKantine() {
        return kantine;
    }

    /**
     * Sets the value of the kantine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKantine(Boolean value) {
        this.kantine = value;
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
     * Gets the value of the kuecheVorhanden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKuecheVorhanden() {
        return kuecheVorhanden;
    }

    /**
     * Sets the value of the kuecheVorhanden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKuecheVorhanden(Boolean value) {
        this.kuecheVorhanden = value;
    }

    /**
     * Gets the value of the starkstrom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStarkstrom() {
        return starkstrom;
    }

    /**
     * Sets the value of the starkstrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStarkstrom(Boolean value) {
        this.starkstrom = value;
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
            VermarktungGewerbeTyp theVermarktung;
            theVermarktung = this.getVermarktung();
            strategy.appendField(locator, this, "vermarktung", buffer, theVermarktung);
        }
        {
            BueroPraxisKategorienTyp theObjektkategorie2;
            theObjektkategorie2 = this.getObjektkategorie2();
            strategy.appendField(locator, this, "objektkategorie2", buffer, theObjektkategorie2);
        }
        {
            Double theBueroPraxisFlaeche;
            theBueroPraxisFlaeche = this.getBueroPraxisFlaeche();
            strategy.appendField(locator, this, "bueroPraxisFlaeche", buffer, theBueroPraxisFlaeche);
        }
        {
            BodenbelagTyp theBodenbelag;
            theBodenbelag = this.getBodenbelag();
            strategy.appendField(locator, this, "bodenbelag", buffer, theBodenbelag);
        }
        {
            DatenVerkabelungsTyp theDatenVerkabelung;
            theDatenVerkabelung = this.getDatenVerkabelung();
            strategy.appendField(locator, this, "datenVerkabelung", buffer, theDatenVerkabelung);
        }
        {
            JaNeinVereinbarungTyp theKlimaanlage;
            theKlimaanlage = this.getKlimaanlage();
            strategy.appendField(locator, this, "klimaanlage", buffer, theKlimaanlage);
        }
        {
            Boolean theKantine;
            theKantine = this.isKantine();
            strategy.appendField(locator, this, "kantine", buffer, theKantine);
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
            Boolean theBarrierefrei;
            theBarrierefrei = this.isBarrierefrei();
            strategy.appendField(locator, this, "barrierefrei", buffer, theBarrierefrei);
        }
        {
            Boolean theKuecheVorhanden;
            theKuecheVorhanden = this.isKuecheVorhanden();
            strategy.appendField(locator, this, "kuecheVorhanden", buffer, theKuecheVorhanden);
        }
        {
            Boolean theStarkstrom;
            theStarkstrom = this.isStarkstrom();
            strategy.appendField(locator, this, "starkstrom", buffer, theStarkstrom);
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
        if (draftCopy instanceof BueroPraxisTyp) {
            final BueroPraxisTyp copy = ((BueroPraxisTyp) draftCopy);
            if (this.vermarktung!= null) {
                VermarktungGewerbeTyp sourceVermarktung;
                sourceVermarktung = this.getVermarktung();
                VermarktungGewerbeTyp copyVermarktung = ((VermarktungGewerbeTyp) strategy.copy(LocatorUtils.property(locator, "vermarktung", sourceVermarktung), sourceVermarktung));
                copy.setVermarktung(copyVermarktung);
            } else {
                copy.vermarktung = null;
            }
            if (this.objektkategorie2 != null) {
                BueroPraxisKategorienTyp sourceObjektkategorie2;
                sourceObjektkategorie2 = this.getObjektkategorie2();
                BueroPraxisKategorienTyp copyObjektkategorie2 = ((BueroPraxisKategorienTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2));
                copy.setObjektkategorie2(copyObjektkategorie2);
            } else {
                copy.objektkategorie2 = null;
            }
            if (this.bueroPraxisFlaeche!= null) {
                Double sourceBueroPraxisFlaeche;
                sourceBueroPraxisFlaeche = this.getBueroPraxisFlaeche();
                Double copyBueroPraxisFlaeche = ((Double) strategy.copy(LocatorUtils.property(locator, "bueroPraxisFlaeche", sourceBueroPraxisFlaeche), sourceBueroPraxisFlaeche));
                copy.setBueroPraxisFlaeche(copyBueroPraxisFlaeche);
            } else {
                copy.bueroPraxisFlaeche = null;
            }
            if (this.bodenbelag!= null) {
                BodenbelagTyp sourceBodenbelag;
                sourceBodenbelag = this.getBodenbelag();
                BodenbelagTyp copyBodenbelag = ((BodenbelagTyp) strategy.copy(LocatorUtils.property(locator, "bodenbelag", sourceBodenbelag), sourceBodenbelag));
                copy.setBodenbelag(copyBodenbelag);
            } else {
                copy.bodenbelag = null;
            }
            if (this.datenVerkabelung!= null) {
                DatenVerkabelungsTyp sourceDatenVerkabelung;
                sourceDatenVerkabelung = this.getDatenVerkabelung();
                DatenVerkabelungsTyp copyDatenVerkabelung = ((DatenVerkabelungsTyp) strategy.copy(LocatorUtils.property(locator, "datenVerkabelung", sourceDatenVerkabelung), sourceDatenVerkabelung));
                copy.setDatenVerkabelung(copyDatenVerkabelung);
            } else {
                copy.datenVerkabelung = null;
            }
            if (this.klimaanlage!= null) {
                JaNeinVereinbarungTyp sourceKlimaanlage;
                sourceKlimaanlage = this.getKlimaanlage();
                JaNeinVereinbarungTyp copyKlimaanlage = ((JaNeinVereinbarungTyp) strategy.copy(LocatorUtils.property(locator, "klimaanlage", sourceKlimaanlage), sourceKlimaanlage));
                copy.setKlimaanlage(copyKlimaanlage);
            } else {
                copy.klimaanlage = null;
            }
            if (this.kantine!= null) {
                Boolean sourceKantine;
                sourceKantine = this.isKantine();
                Boolean copyKantine = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kantine", sourceKantine), sourceKantine));
                copy.setKantine(copyKantine);
            } else {
                copy.kantine = null;
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
            if (this.barrierefrei!= null) {
                Boolean sourceBarrierefrei;
                sourceBarrierefrei = this.isBarrierefrei();
                Boolean copyBarrierefrei = ((Boolean) strategy.copy(LocatorUtils.property(locator, "barrierefrei", sourceBarrierefrei), sourceBarrierefrei));
                copy.setBarrierefrei(copyBarrierefrei);
            } else {
                copy.barrierefrei = null;
            }
            if (this.kuecheVorhanden!= null) {
                Boolean sourceKuecheVorhanden;
                sourceKuecheVorhanden = this.isKuecheVorhanden();
                Boolean copyKuecheVorhanden = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kuecheVorhanden", sourceKuecheVorhanden), sourceKuecheVorhanden));
                copy.setKuecheVorhanden(copyKuecheVorhanden);
            } else {
                copy.kuecheVorhanden = null;
            }
            if (this.starkstrom!= null) {
                Boolean sourceStarkstrom;
                sourceStarkstrom = this.isStarkstrom();
                Boolean copyStarkstrom = ((Boolean) strategy.copy(LocatorUtils.property(locator, "starkstrom", sourceStarkstrom), sourceStarkstrom));
                copy.setStarkstrom(copyStarkstrom);
            } else {
                copy.starkstrom = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BueroPraxisTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BueroPraxisTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BueroPraxisTyp that = ((BueroPraxisTyp) object);
        {
            VermarktungGewerbeTyp lhsVermarktung;
            lhsVermarktung = this.getVermarktung();
            VermarktungGewerbeTyp rhsVermarktung;
            rhsVermarktung = that.getVermarktung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermarktung", lhsVermarktung), LocatorUtils.property(thatLocator, "vermarktung", rhsVermarktung), lhsVermarktung, rhsVermarktung)) {
                return false;
            }
        }
        {
            BueroPraxisKategorienTyp lhsObjektkategorie2;
            lhsObjektkategorie2 = this.getObjektkategorie2();
            BueroPraxisKategorienTyp rhsObjektkategorie2;
            rhsObjektkategorie2 = that.getObjektkategorie2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie2", lhsObjektkategorie2), LocatorUtils.property(thatLocator, "objektkategorie2", rhsObjektkategorie2), lhsObjektkategorie2, rhsObjektkategorie2)) {
                return false;
            }
        }
        {
            Double lhsBueroPraxisFlaeche;
            lhsBueroPraxisFlaeche = this.getBueroPraxisFlaeche();
            Double rhsBueroPraxisFlaeche;
            rhsBueroPraxisFlaeche = that.getBueroPraxisFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bueroPraxisFlaeche", lhsBueroPraxisFlaeche), LocatorUtils.property(thatLocator, "bueroPraxisFlaeche", rhsBueroPraxisFlaeche), lhsBueroPraxisFlaeche, rhsBueroPraxisFlaeche)) {
                return false;
            }
        }
        {
            BodenbelagTyp lhsBodenbelag;
            lhsBodenbelag = this.getBodenbelag();
            BodenbelagTyp rhsBodenbelag;
            rhsBodenbelag = that.getBodenbelag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bodenbelag", lhsBodenbelag), LocatorUtils.property(thatLocator, "bodenbelag", rhsBodenbelag), lhsBodenbelag, rhsBodenbelag)) {
                return false;
            }
        }
        {
            DatenVerkabelungsTyp lhsDatenVerkabelung;
            lhsDatenVerkabelung = this.getDatenVerkabelung();
            DatenVerkabelungsTyp rhsDatenVerkabelung;
            rhsDatenVerkabelung = that.getDatenVerkabelung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datenVerkabelung", lhsDatenVerkabelung), LocatorUtils.property(thatLocator, "datenVerkabelung", rhsDatenVerkabelung), lhsDatenVerkabelung, rhsDatenVerkabelung)) {
                return false;
            }
        }
        {
            JaNeinVereinbarungTyp lhsKlimaanlage;
            lhsKlimaanlage = this.getKlimaanlage();
            JaNeinVereinbarungTyp rhsKlimaanlage;
            rhsKlimaanlage = that.getKlimaanlage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "klimaanlage", lhsKlimaanlage), LocatorUtils.property(thatLocator, "klimaanlage", rhsKlimaanlage), lhsKlimaanlage, rhsKlimaanlage)) {
                return false;
            }
        }
        {
            Boolean lhsKantine;
            lhsKantine = this.isKantine();
            Boolean rhsKantine;
            rhsKantine = that.isKantine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kantine", lhsKantine), LocatorUtils.property(thatLocator, "kantine", rhsKantine), lhsKantine, rhsKantine)) {
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
            Boolean lhsBarrierefrei;
            lhsBarrierefrei = this.isBarrierefrei();
            Boolean rhsBarrierefrei;
            rhsBarrierefrei = that.isBarrierefrei();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barrierefrei", lhsBarrierefrei), LocatorUtils.property(thatLocator, "barrierefrei", rhsBarrierefrei), lhsBarrierefrei, rhsBarrierefrei)) {
                return false;
            }
        }
        {
            Boolean lhsKuecheVorhanden;
            lhsKuecheVorhanden = this.isKuecheVorhanden();
            Boolean rhsKuecheVorhanden;
            rhsKuecheVorhanden = that.isKuecheVorhanden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kuecheVorhanden", lhsKuecheVorhanden), LocatorUtils.property(thatLocator, "kuecheVorhanden", rhsKuecheVorhanden), lhsKuecheVorhanden, rhsKuecheVorhanden)) {
                return false;
            }
        }
        {
            Boolean lhsStarkstrom;
            lhsStarkstrom = this.isStarkstrom();
            Boolean rhsStarkstrom;
            rhsStarkstrom = that.isStarkstrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "starkstrom", lhsStarkstrom), LocatorUtils.property(thatLocator, "starkstrom", rhsStarkstrom), lhsStarkstrom, rhsStarkstrom)) {
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
