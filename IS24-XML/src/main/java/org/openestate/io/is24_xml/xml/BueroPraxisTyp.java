
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
    implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "Vermarktung", required = true)
    protected VermarktungGewerbeTyp vermarktung;
    @XmlAttribute(name = "Objektkategorie2")
    protected BueroPraxisKategorienTyp objektkategorie2;
    @XmlAttribute(name = "BueroPraxisFlaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal bueroPraxisFlaeche;
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
    public BigDecimal getBueroPraxisFlaeche() {
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
    public void setBueroPraxisFlaeche(BigDecimal value) {
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
            VermarktungGewerbeTyp theVermarktung;
            theVermarktung = this.getVermarktung();
            strategy.appendField(locator, this, "vermarktung", buffer, theVermarktung, (this.vermarktung!= null));
        }
        {
            BueroPraxisKategorienTyp theObjektkategorie2;
            theObjektkategorie2 = this.getObjektkategorie2();
            strategy.appendField(locator, this, "objektkategorie2", buffer, theObjektkategorie2, (this.objektkategorie2 != null));
        }
        {
            BigDecimal theBueroPraxisFlaeche;
            theBueroPraxisFlaeche = this.getBueroPraxisFlaeche();
            strategy.appendField(locator, this, "bueroPraxisFlaeche", buffer, theBueroPraxisFlaeche, (this.bueroPraxisFlaeche!= null));
        }
        {
            BodenbelagTyp theBodenbelag;
            theBodenbelag = this.getBodenbelag();
            strategy.appendField(locator, this, "bodenbelag", buffer, theBodenbelag, (this.bodenbelag!= null));
        }
        {
            DatenVerkabelungsTyp theDatenVerkabelung;
            theDatenVerkabelung = this.getDatenVerkabelung();
            strategy.appendField(locator, this, "datenVerkabelung", buffer, theDatenVerkabelung, (this.datenVerkabelung!= null));
        }
        {
            JaNeinVereinbarungTyp theKlimaanlage;
            theKlimaanlage = this.getKlimaanlage();
            strategy.appendField(locator, this, "klimaanlage", buffer, theKlimaanlage, (this.klimaanlage!= null));
        }
        {
            Boolean theKantine;
            theKantine = this.isKantine();
            strategy.appendField(locator, this, "kantine", buffer, theKantine, (this.kantine!= null));
        }
        {
            Boolean theDenkmalschutzobjekt;
            theDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
            strategy.appendField(locator, this, "denkmalschutzobjekt", buffer, theDenkmalschutzobjekt, (this.denkmalschutzobjekt!= null));
        }
        {
            Boolean theKeller;
            theKeller = this.isKeller();
            strategy.appendField(locator, this, "keller", buffer, theKeller, (this.keller!= null));
        }
        {
            Boolean theBarrierefrei;
            theBarrierefrei = this.isBarrierefrei();
            strategy.appendField(locator, this, "barrierefrei", buffer, theBarrierefrei, (this.barrierefrei!= null));
        }
        {
            Boolean theKuecheVorhanden;
            theKuecheVorhanden = this.isKuecheVorhanden();
            strategy.appendField(locator, this, "kuecheVorhanden", buffer, theKuecheVorhanden, (this.kuecheVorhanden!= null));
        }
        {
            Boolean theStarkstrom;
            theStarkstrom = this.isStarkstrom();
            strategy.appendField(locator, this, "starkstrom", buffer, theStarkstrom, (this.starkstrom!= null));
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
        if (draftCopy instanceof BueroPraxisTyp) {
            final BueroPraxisTyp copy = ((BueroPraxisTyp) draftCopy);
            {
                Boolean vermarktungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermarktung!= null));
                if (vermarktungShouldBeCopiedAndSet == Boolean.TRUE) {
                    VermarktungGewerbeTyp sourceVermarktung;
                    sourceVermarktung = this.getVermarktung();
                    VermarktungGewerbeTyp copyVermarktung = ((VermarktungGewerbeTyp) strategy.copy(LocatorUtils.property(locator, "vermarktung", sourceVermarktung), sourceVermarktung, (this.vermarktung!= null)));
                    copy.setVermarktung(copyVermarktung);
                } else {
                    if (vermarktungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermarktung = null;
                    }
                }
            }
            {
                Boolean objektkategorie2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektkategorie2 != null));
                if (objektkategorie2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    BueroPraxisKategorienTyp sourceObjektkategorie2;
                    sourceObjektkategorie2 = this.getObjektkategorie2();
                    BueroPraxisKategorienTyp copyObjektkategorie2 = ((BueroPraxisKategorienTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2, (this.objektkategorie2 != null)));
                    copy.setObjektkategorie2(copyObjektkategorie2);
                } else {
                    if (objektkategorie2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektkategorie2 = null;
                    }
                }
            }
            {
                Boolean bueroPraxisFlaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bueroPraxisFlaeche!= null));
                if (bueroPraxisFlaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBueroPraxisFlaeche;
                    sourceBueroPraxisFlaeche = this.getBueroPraxisFlaeche();
                    BigDecimal copyBueroPraxisFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "bueroPraxisFlaeche", sourceBueroPraxisFlaeche), sourceBueroPraxisFlaeche, (this.bueroPraxisFlaeche!= null)));
                    copy.setBueroPraxisFlaeche(copyBueroPraxisFlaeche);
                } else {
                    if (bueroPraxisFlaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bueroPraxisFlaeche = null;
                    }
                }
            }
            {
                Boolean bodenbelagShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bodenbelag!= null));
                if (bodenbelagShouldBeCopiedAndSet == Boolean.TRUE) {
                    BodenbelagTyp sourceBodenbelag;
                    sourceBodenbelag = this.getBodenbelag();
                    BodenbelagTyp copyBodenbelag = ((BodenbelagTyp) strategy.copy(LocatorUtils.property(locator, "bodenbelag", sourceBodenbelag), sourceBodenbelag, (this.bodenbelag!= null)));
                    copy.setBodenbelag(copyBodenbelag);
                } else {
                    if (bodenbelagShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bodenbelag = null;
                    }
                }
            }
            {
                Boolean datenVerkabelungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.datenVerkabelung!= null));
                if (datenVerkabelungShouldBeCopiedAndSet == Boolean.TRUE) {
                    DatenVerkabelungsTyp sourceDatenVerkabelung;
                    sourceDatenVerkabelung = this.getDatenVerkabelung();
                    DatenVerkabelungsTyp copyDatenVerkabelung = ((DatenVerkabelungsTyp) strategy.copy(LocatorUtils.property(locator, "datenVerkabelung", sourceDatenVerkabelung), sourceDatenVerkabelung, (this.datenVerkabelung!= null)));
                    copy.setDatenVerkabelung(copyDatenVerkabelung);
                } else {
                    if (datenVerkabelungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.datenVerkabelung = null;
                    }
                }
            }
            {
                Boolean klimaanlageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.klimaanlage!= null));
                if (klimaanlageShouldBeCopiedAndSet == Boolean.TRUE) {
                    JaNeinVereinbarungTyp sourceKlimaanlage;
                    sourceKlimaanlage = this.getKlimaanlage();
                    JaNeinVereinbarungTyp copyKlimaanlage = ((JaNeinVereinbarungTyp) strategy.copy(LocatorUtils.property(locator, "klimaanlage", sourceKlimaanlage), sourceKlimaanlage, (this.klimaanlage!= null)));
                    copy.setKlimaanlage(copyKlimaanlage);
                } else {
                    if (klimaanlageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.klimaanlage = null;
                    }
                }
            }
            {
                Boolean kantineShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kantine!= null));
                if (kantineShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKantine;
                    sourceKantine = this.isKantine();
                    Boolean copyKantine = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kantine", sourceKantine), sourceKantine, (this.kantine!= null)));
                    copy.setKantine(copyKantine);
                } else {
                    if (kantineShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kantine = null;
                    }
                }
            }
            {
                Boolean denkmalschutzobjektShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.denkmalschutzobjekt!= null));
                if (denkmalschutzobjektShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDenkmalschutzobjekt;
                    sourceDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
                    Boolean copyDenkmalschutzobjekt = ((Boolean) strategy.copy(LocatorUtils.property(locator, "denkmalschutzobjekt", sourceDenkmalschutzobjekt), sourceDenkmalschutzobjekt, (this.denkmalschutzobjekt!= null)));
                    copy.setDenkmalschutzobjekt(copyDenkmalschutzobjekt);
                } else {
                    if (denkmalschutzobjektShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.denkmalschutzobjekt = null;
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
                Boolean kuecheVorhandenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kuecheVorhanden!= null));
                if (kuecheVorhandenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKuecheVorhanden;
                    sourceKuecheVorhanden = this.isKuecheVorhanden();
                    Boolean copyKuecheVorhanden = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kuecheVorhanden", sourceKuecheVorhanden), sourceKuecheVorhanden, (this.kuecheVorhanden!= null)));
                    copy.setKuecheVorhanden(copyKuecheVorhanden);
                } else {
                    if (kuecheVorhandenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kuecheVorhanden = null;
                    }
                }
            }
            {
                Boolean starkstromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.starkstrom!= null));
                if (starkstromShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceStarkstrom;
                    sourceStarkstrom = this.isStarkstrom();
                    Boolean copyStarkstrom = ((Boolean) strategy.copy(LocatorUtils.property(locator, "starkstrom", sourceStarkstrom), sourceStarkstrom, (this.starkstrom!= null)));
                    copy.setStarkstrom(copyStarkstrom);
                } else {
                    if (starkstromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.starkstrom = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BueroPraxisTyp();
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
        final BueroPraxisTyp that = ((BueroPraxisTyp) object);
        {
            VermarktungGewerbeTyp lhsVermarktung;
            lhsVermarktung = this.getVermarktung();
            VermarktungGewerbeTyp rhsVermarktung;
            rhsVermarktung = that.getVermarktung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermarktung", lhsVermarktung), LocatorUtils.property(thatLocator, "vermarktung", rhsVermarktung), lhsVermarktung, rhsVermarktung, (this.vermarktung!= null), (that.vermarktung!= null))) {
                return false;
            }
        }
        {
            BueroPraxisKategorienTyp lhsObjektkategorie2;
            lhsObjektkategorie2 = this.getObjektkategorie2();
            BueroPraxisKategorienTyp rhsObjektkategorie2;
            rhsObjektkategorie2 = that.getObjektkategorie2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie2", lhsObjektkategorie2), LocatorUtils.property(thatLocator, "objektkategorie2", rhsObjektkategorie2), lhsObjektkategorie2, rhsObjektkategorie2, (this.objektkategorie2 != null), (that.objektkategorie2 != null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBueroPraxisFlaeche;
            lhsBueroPraxisFlaeche = this.getBueroPraxisFlaeche();
            BigDecimal rhsBueroPraxisFlaeche;
            rhsBueroPraxisFlaeche = that.getBueroPraxisFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bueroPraxisFlaeche", lhsBueroPraxisFlaeche), LocatorUtils.property(thatLocator, "bueroPraxisFlaeche", rhsBueroPraxisFlaeche), lhsBueroPraxisFlaeche, rhsBueroPraxisFlaeche, (this.bueroPraxisFlaeche!= null), (that.bueroPraxisFlaeche!= null))) {
                return false;
            }
        }
        {
            BodenbelagTyp lhsBodenbelag;
            lhsBodenbelag = this.getBodenbelag();
            BodenbelagTyp rhsBodenbelag;
            rhsBodenbelag = that.getBodenbelag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bodenbelag", lhsBodenbelag), LocatorUtils.property(thatLocator, "bodenbelag", rhsBodenbelag), lhsBodenbelag, rhsBodenbelag, (this.bodenbelag!= null), (that.bodenbelag!= null))) {
                return false;
            }
        }
        {
            DatenVerkabelungsTyp lhsDatenVerkabelung;
            lhsDatenVerkabelung = this.getDatenVerkabelung();
            DatenVerkabelungsTyp rhsDatenVerkabelung;
            rhsDatenVerkabelung = that.getDatenVerkabelung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datenVerkabelung", lhsDatenVerkabelung), LocatorUtils.property(thatLocator, "datenVerkabelung", rhsDatenVerkabelung), lhsDatenVerkabelung, rhsDatenVerkabelung, (this.datenVerkabelung!= null), (that.datenVerkabelung!= null))) {
                return false;
            }
        }
        {
            JaNeinVereinbarungTyp lhsKlimaanlage;
            lhsKlimaanlage = this.getKlimaanlage();
            JaNeinVereinbarungTyp rhsKlimaanlage;
            rhsKlimaanlage = that.getKlimaanlage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "klimaanlage", lhsKlimaanlage), LocatorUtils.property(thatLocator, "klimaanlage", rhsKlimaanlage), lhsKlimaanlage, rhsKlimaanlage, (this.klimaanlage!= null), (that.klimaanlage!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKantine;
            lhsKantine = this.isKantine();
            Boolean rhsKantine;
            rhsKantine = that.isKantine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kantine", lhsKantine), LocatorUtils.property(thatLocator, "kantine", rhsKantine), lhsKantine, rhsKantine, (this.kantine!= null), (that.kantine!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDenkmalschutzobjekt;
            lhsDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
            Boolean rhsDenkmalschutzobjekt;
            rhsDenkmalschutzobjekt = that.isDenkmalschutzobjekt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "denkmalschutzobjekt", lhsDenkmalschutzobjekt), LocatorUtils.property(thatLocator, "denkmalschutzobjekt", rhsDenkmalschutzobjekt), lhsDenkmalschutzobjekt, rhsDenkmalschutzobjekt, (this.denkmalschutzobjekt!= null), (that.denkmalschutzobjekt!= null))) {
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
            Boolean lhsBarrierefrei;
            lhsBarrierefrei = this.isBarrierefrei();
            Boolean rhsBarrierefrei;
            rhsBarrierefrei = that.isBarrierefrei();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barrierefrei", lhsBarrierefrei), LocatorUtils.property(thatLocator, "barrierefrei", rhsBarrierefrei), lhsBarrierefrei, rhsBarrierefrei, (this.barrierefrei!= null), (that.barrierefrei!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKuecheVorhanden;
            lhsKuecheVorhanden = this.isKuecheVorhanden();
            Boolean rhsKuecheVorhanden;
            rhsKuecheVorhanden = that.isKuecheVorhanden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kuecheVorhanden", lhsKuecheVorhanden), LocatorUtils.property(thatLocator, "kuecheVorhanden", rhsKuecheVorhanden), lhsKuecheVorhanden, rhsKuecheVorhanden, (this.kuecheVorhanden!= null), (that.kuecheVorhanden!= null))) {
                return false;
            }
        }
        {
            Boolean lhsStarkstrom;
            lhsStarkstrom = this.isStarkstrom();
            Boolean rhsStarkstrom;
            rhsStarkstrom = that.isStarkstrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "starkstrom", lhsStarkstrom), LocatorUtils.property(thatLocator, "starkstrom", rhsStarkstrom), lhsStarkstrom, rhsStarkstrom, (this.starkstrom!= null), (that.starkstrom!= null))) {
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
