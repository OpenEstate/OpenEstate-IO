
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
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
 * <p>Java class for HalleProduktionTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HalleProduktionTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}GewerbeImmoBaseTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vermarktung" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungGewerbeTyp"/&gt;
 *         &lt;element name="Lastenaufzug" type="{http://www.immobilienscout24.de/immobilientransfer}HebeanlageTyp" minOccurs="0"/&gt;
 *         &lt;element name="Kranbahn" type="{http://www.immobilienscout24.de/immobilientransfer}HebeanlageTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Objektkategorie2" type="{http://www.immobilienscout24.de/immobilientransfer}HalleProduktionKategorieTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="LagerProduktionsFlaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Bodenbelag" type="{http://www.immobilienscout24.de/immobilientransfer}BodenbelagTyp" /&gt;
 *       &lt;attribute name="Hebebuehne" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Hallenhoehe" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl52Typ" /&gt;
 *       &lt;attribute name="Rampe" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Bodenbelastung" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl72Typ" /&gt;
 *       &lt;attribute name="GrundstuecksFlaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Stromanschlusswert" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl5Typ" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HalleProduktionTyp", propOrder = {
    "vermarktung",
    "lastenaufzug",
    "kranbahn"
})
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.HalleProduktion.Type.class
})
public class HalleProduktionTyp
    extends GewerbeImmoBaseTyp
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "Vermarktung", required = true)
    protected VermarktungGewerbeTyp vermarktung;
    @XmlElement(name = "Lastenaufzug")
    protected HebeanlageTyp lastenaufzug;
    @XmlElement(name = "Kranbahn")
    protected HebeanlageTyp kranbahn;
    @XmlAttribute(name = "Objektkategorie2")
    protected HalleProduktionKategorieTyp objektkategorie2;
    @XmlAttribute(name = "LagerProduktionsFlaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal lagerProduktionsFlaeche;
    @XmlAttribute(name = "Bodenbelag")
    protected BodenbelagTyp bodenbelag;
    @XmlAttribute(name = "Hebebuehne")
    protected Boolean hebebuehne;
    @XmlAttribute(name = "Hallenhoehe")
    @XmlJavaTypeAdapter(Adapter30 .class)
    protected BigDecimal hallenhoehe;
    @XmlAttribute(name = "Rampe")
    protected Boolean rampe;
    @XmlAttribute(name = "Bodenbelastung")
    @XmlJavaTypeAdapter(Adapter33 .class)
    protected BigDecimal bodenbelastung;
    @XmlAttribute(name = "GrundstuecksFlaeche")
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal grundstuecksFlaeche;
    @XmlAttribute(name = "Stromanschlusswert")
    @XmlJavaTypeAdapter(Adapter23 .class)
    protected Long stromanschlusswert;

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
     * Gets the value of the lastenaufzug property.
     * 
     * @return
     *     possible object is
     *     {@link HebeanlageTyp }
     *     
     */
    public HebeanlageTyp getLastenaufzug() {
        return lastenaufzug;
    }

    /**
     * Sets the value of the lastenaufzug property.
     * 
     * @param value
     *     allowed object is
     *     {@link HebeanlageTyp }
     *     
     */
    public void setLastenaufzug(HebeanlageTyp value) {
        this.lastenaufzug = value;
    }

    /**
     * Gets the value of the kranbahn property.
     * 
     * @return
     *     possible object is
     *     {@link HebeanlageTyp }
     *     
     */
    public HebeanlageTyp getKranbahn() {
        return kranbahn;
    }

    /**
     * Sets the value of the kranbahn property.
     * 
     * @param value
     *     allowed object is
     *     {@link HebeanlageTyp }
     *     
     */
    public void setKranbahn(HebeanlageTyp value) {
        this.kranbahn = value;
    }

    /**
     * Gets the value of the objektkategorie2 property.
     * 
     * @return
     *     possible object is
     *     {@link HalleProduktionKategorieTyp }
     *     
     */
    public HalleProduktionKategorieTyp getObjektkategorie2() {
        if (objektkategorie2 == null) {
            return HalleProduktionKategorieTyp.KEINE_ANGABE;
        } else {
            return objektkategorie2;
        }
    }

    /**
     * Sets the value of the objektkategorie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link HalleProduktionKategorieTyp }
     *     
     */
    public void setObjektkategorie2(HalleProduktionKategorieTyp value) {
        this.objektkategorie2 = value;
    }

    /**
     * Gets the value of the lagerProduktionsFlaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getLagerProduktionsFlaeche() {
        return lagerProduktionsFlaeche;
    }

    /**
     * Sets the value of the lagerProduktionsFlaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLagerProduktionsFlaeche(BigDecimal value) {
        this.lagerProduktionsFlaeche = value;
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
        return bodenbelag;
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
     * Gets the value of the hebebuehne property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHebebuehne() {
        return hebebuehne;
    }

    /**
     * Sets the value of the hebebuehne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHebebuehne(Boolean value) {
        this.hebebuehne = value;
    }

    /**
     * Gets the value of the hallenhoehe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getHallenhoehe() {
        return hallenhoehe;
    }

    /**
     * Sets the value of the hallenhoehe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHallenhoehe(BigDecimal value) {
        this.hallenhoehe = value;
    }

    /**
     * Gets the value of the rampe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRampe() {
        return rampe;
    }

    /**
     * Sets the value of the rampe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRampe(Boolean value) {
        this.rampe = value;
    }

    /**
     * Gets the value of the bodenbelastung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getBodenbelastung() {
        return bodenbelastung;
    }

    /**
     * Sets the value of the bodenbelastung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodenbelastung(BigDecimal value) {
        this.bodenbelastung = value;
    }

    /**
     * Gets the value of the grundstuecksFlaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getGrundstuecksFlaeche() {
        return grundstuecksFlaeche;
    }

    /**
     * Sets the value of the grundstuecksFlaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrundstuecksFlaeche(BigDecimal value) {
        this.grundstuecksFlaeche = value;
    }

    /**
     * Gets the value of the stromanschlusswert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getStromanschlusswert() {
        return stromanschlusswert;
    }

    /**
     * Sets the value of the stromanschlusswert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStromanschlusswert(Long value) {
        this.stromanschlusswert = value;
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
            HebeanlageTyp theLastenaufzug;
            theLastenaufzug = this.getLastenaufzug();
            strategy.appendField(locator, this, "lastenaufzug", buffer, theLastenaufzug, (this.lastenaufzug!= null));
        }
        {
            HebeanlageTyp theKranbahn;
            theKranbahn = this.getKranbahn();
            strategy.appendField(locator, this, "kranbahn", buffer, theKranbahn, (this.kranbahn!= null));
        }
        {
            HalleProduktionKategorieTyp theObjektkategorie2;
            theObjektkategorie2 = this.getObjektkategorie2();
            strategy.appendField(locator, this, "objektkategorie2", buffer, theObjektkategorie2, (this.objektkategorie2 != null));
        }
        {
            BigDecimal theLagerProduktionsFlaeche;
            theLagerProduktionsFlaeche = this.getLagerProduktionsFlaeche();
            strategy.appendField(locator, this, "lagerProduktionsFlaeche", buffer, theLagerProduktionsFlaeche, (this.lagerProduktionsFlaeche!= null));
        }
        {
            BodenbelagTyp theBodenbelag;
            theBodenbelag = this.getBodenbelag();
            strategy.appendField(locator, this, "bodenbelag", buffer, theBodenbelag, (this.bodenbelag!= null));
        }
        {
            Boolean theHebebuehne;
            theHebebuehne = this.isHebebuehne();
            strategy.appendField(locator, this, "hebebuehne", buffer, theHebebuehne, (this.hebebuehne!= null));
        }
        {
            BigDecimal theHallenhoehe;
            theHallenhoehe = this.getHallenhoehe();
            strategy.appendField(locator, this, "hallenhoehe", buffer, theHallenhoehe, (this.hallenhoehe!= null));
        }
        {
            Boolean theRampe;
            theRampe = this.isRampe();
            strategy.appendField(locator, this, "rampe", buffer, theRampe, (this.rampe!= null));
        }
        {
            BigDecimal theBodenbelastung;
            theBodenbelastung = this.getBodenbelastung();
            strategy.appendField(locator, this, "bodenbelastung", buffer, theBodenbelastung, (this.bodenbelastung!= null));
        }
        {
            BigDecimal theGrundstuecksFlaeche;
            theGrundstuecksFlaeche = this.getGrundstuecksFlaeche();
            strategy.appendField(locator, this, "grundstuecksFlaeche", buffer, theGrundstuecksFlaeche, (this.grundstuecksFlaeche!= null));
        }
        {
            Long theStromanschlusswert;
            theStromanschlusswert = this.getStromanschlusswert();
            strategy.appendField(locator, this, "stromanschlusswert", buffer, theStromanschlusswert, (this.stromanschlusswert!= null));
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
        if (draftCopy instanceof HalleProduktionTyp) {
            final HalleProduktionTyp copy = ((HalleProduktionTyp) draftCopy);
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
                Boolean lastenaufzugShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastenaufzug!= null));
                if (lastenaufzugShouldBeCopiedAndSet == Boolean.TRUE) {
                    HebeanlageTyp sourceLastenaufzug;
                    sourceLastenaufzug = this.getLastenaufzug();
                    HebeanlageTyp copyLastenaufzug = ((HebeanlageTyp) strategy.copy(LocatorUtils.property(locator, "lastenaufzug", sourceLastenaufzug), sourceLastenaufzug, (this.lastenaufzug!= null)));
                    copy.setLastenaufzug(copyLastenaufzug);
                } else {
                    if (lastenaufzugShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastenaufzug = null;
                    }
                }
            }
            {
                Boolean kranbahnShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kranbahn!= null));
                if (kranbahnShouldBeCopiedAndSet == Boolean.TRUE) {
                    HebeanlageTyp sourceKranbahn;
                    sourceKranbahn = this.getKranbahn();
                    HebeanlageTyp copyKranbahn = ((HebeanlageTyp) strategy.copy(LocatorUtils.property(locator, "kranbahn", sourceKranbahn), sourceKranbahn, (this.kranbahn!= null)));
                    copy.setKranbahn(copyKranbahn);
                } else {
                    if (kranbahnShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kranbahn = null;
                    }
                }
            }
            {
                Boolean objektkategorie2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektkategorie2 != null));
                if (objektkategorie2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    HalleProduktionKategorieTyp sourceObjektkategorie2;
                    sourceObjektkategorie2 = this.getObjektkategorie2();
                    HalleProduktionKategorieTyp copyObjektkategorie2 = ((HalleProduktionKategorieTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2, (this.objektkategorie2 != null)));
                    copy.setObjektkategorie2(copyObjektkategorie2);
                } else {
                    if (objektkategorie2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektkategorie2 = null;
                    }
                }
            }
            {
                Boolean lagerProduktionsFlaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lagerProduktionsFlaeche!= null));
                if (lagerProduktionsFlaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLagerProduktionsFlaeche;
                    sourceLagerProduktionsFlaeche = this.getLagerProduktionsFlaeche();
                    BigDecimal copyLagerProduktionsFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "lagerProduktionsFlaeche", sourceLagerProduktionsFlaeche), sourceLagerProduktionsFlaeche, (this.lagerProduktionsFlaeche!= null)));
                    copy.setLagerProduktionsFlaeche(copyLagerProduktionsFlaeche);
                } else {
                    if (lagerProduktionsFlaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lagerProduktionsFlaeche = null;
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
                Boolean hebebuehneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hebebuehne!= null));
                if (hebebuehneShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceHebebuehne;
                    sourceHebebuehne = this.isHebebuehne();
                    Boolean copyHebebuehne = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hebebuehne", sourceHebebuehne), sourceHebebuehne, (this.hebebuehne!= null)));
                    copy.setHebebuehne(copyHebebuehne);
                } else {
                    if (hebebuehneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hebebuehne = null;
                    }
                }
            }
            {
                Boolean hallenhoeheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hallenhoehe!= null));
                if (hallenhoeheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHallenhoehe;
                    sourceHallenhoehe = this.getHallenhoehe();
                    BigDecimal copyHallenhoehe = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "hallenhoehe", sourceHallenhoehe), sourceHallenhoehe, (this.hallenhoehe!= null)));
                    copy.setHallenhoehe(copyHallenhoehe);
                } else {
                    if (hallenhoeheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hallenhoehe = null;
                    }
                }
            }
            {
                Boolean rampeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rampe!= null));
                if (rampeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRampe;
                    sourceRampe = this.isRampe();
                    Boolean copyRampe = ((Boolean) strategy.copy(LocatorUtils.property(locator, "rampe", sourceRampe), sourceRampe, (this.rampe!= null)));
                    copy.setRampe(copyRampe);
                } else {
                    if (rampeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rampe = null;
                    }
                }
            }
            {
                Boolean bodenbelastungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bodenbelastung!= null));
                if (bodenbelastungShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBodenbelastung;
                    sourceBodenbelastung = this.getBodenbelastung();
                    BigDecimal copyBodenbelastung = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "bodenbelastung", sourceBodenbelastung), sourceBodenbelastung, (this.bodenbelastung!= null)));
                    copy.setBodenbelastung(copyBodenbelastung);
                } else {
                    if (bodenbelastungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bodenbelastung = null;
                    }
                }
            }
            {
                Boolean grundstuecksFlaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.grundstuecksFlaeche!= null));
                if (grundstuecksFlaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGrundstuecksFlaeche;
                    sourceGrundstuecksFlaeche = this.getGrundstuecksFlaeche();
                    BigDecimal copyGrundstuecksFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "grundstuecksFlaeche", sourceGrundstuecksFlaeche), sourceGrundstuecksFlaeche, (this.grundstuecksFlaeche!= null)));
                    copy.setGrundstuecksFlaeche(copyGrundstuecksFlaeche);
                } else {
                    if (grundstuecksFlaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.grundstuecksFlaeche = null;
                    }
                }
            }
            {
                Boolean stromanschlusswertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stromanschlusswert!= null));
                if (stromanschlusswertShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceStromanschlusswert;
                    sourceStromanschlusswert = this.getStromanschlusswert();
                    Long copyStromanschlusswert = ((Long) strategy.copy(LocatorUtils.property(locator, "stromanschlusswert", sourceStromanschlusswert), sourceStromanschlusswert, (this.stromanschlusswert!= null)));
                    copy.setStromanschlusswert(copyStromanschlusswert);
                } else {
                    if (stromanschlusswertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stromanschlusswert = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new HalleProduktionTyp();
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
        final HalleProduktionTyp that = ((HalleProduktionTyp) object);
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
            HebeanlageTyp lhsLastenaufzug;
            lhsLastenaufzug = this.getLastenaufzug();
            HebeanlageTyp rhsLastenaufzug;
            rhsLastenaufzug = that.getLastenaufzug();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastenaufzug", lhsLastenaufzug), LocatorUtils.property(thatLocator, "lastenaufzug", rhsLastenaufzug), lhsLastenaufzug, rhsLastenaufzug, (this.lastenaufzug!= null), (that.lastenaufzug!= null))) {
                return false;
            }
        }
        {
            HebeanlageTyp lhsKranbahn;
            lhsKranbahn = this.getKranbahn();
            HebeanlageTyp rhsKranbahn;
            rhsKranbahn = that.getKranbahn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kranbahn", lhsKranbahn), LocatorUtils.property(thatLocator, "kranbahn", rhsKranbahn), lhsKranbahn, rhsKranbahn, (this.kranbahn!= null), (that.kranbahn!= null))) {
                return false;
            }
        }
        {
            HalleProduktionKategorieTyp lhsObjektkategorie2;
            lhsObjektkategorie2 = this.getObjektkategorie2();
            HalleProduktionKategorieTyp rhsObjektkategorie2;
            rhsObjektkategorie2 = that.getObjektkategorie2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie2", lhsObjektkategorie2), LocatorUtils.property(thatLocator, "objektkategorie2", rhsObjektkategorie2), lhsObjektkategorie2, rhsObjektkategorie2, (this.objektkategorie2 != null), (that.objektkategorie2 != null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLagerProduktionsFlaeche;
            lhsLagerProduktionsFlaeche = this.getLagerProduktionsFlaeche();
            BigDecimal rhsLagerProduktionsFlaeche;
            rhsLagerProduktionsFlaeche = that.getLagerProduktionsFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lagerProduktionsFlaeche", lhsLagerProduktionsFlaeche), LocatorUtils.property(thatLocator, "lagerProduktionsFlaeche", rhsLagerProduktionsFlaeche), lhsLagerProduktionsFlaeche, rhsLagerProduktionsFlaeche, (this.lagerProduktionsFlaeche!= null), (that.lagerProduktionsFlaeche!= null))) {
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
            Boolean lhsHebebuehne;
            lhsHebebuehne = this.isHebebuehne();
            Boolean rhsHebebuehne;
            rhsHebebuehne = that.isHebebuehne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hebebuehne", lhsHebebuehne), LocatorUtils.property(thatLocator, "hebebuehne", rhsHebebuehne), lhsHebebuehne, rhsHebebuehne, (this.hebebuehne!= null), (that.hebebuehne!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHallenhoehe;
            lhsHallenhoehe = this.getHallenhoehe();
            BigDecimal rhsHallenhoehe;
            rhsHallenhoehe = that.getHallenhoehe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hallenhoehe", lhsHallenhoehe), LocatorUtils.property(thatLocator, "hallenhoehe", rhsHallenhoehe), lhsHallenhoehe, rhsHallenhoehe, (this.hallenhoehe!= null), (that.hallenhoehe!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRampe;
            lhsRampe = this.isRampe();
            Boolean rhsRampe;
            rhsRampe = that.isRampe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rampe", lhsRampe), LocatorUtils.property(thatLocator, "rampe", rhsRampe), lhsRampe, rhsRampe, (this.rampe!= null), (that.rampe!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBodenbelastung;
            lhsBodenbelastung = this.getBodenbelastung();
            BigDecimal rhsBodenbelastung;
            rhsBodenbelastung = that.getBodenbelastung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bodenbelastung", lhsBodenbelastung), LocatorUtils.property(thatLocator, "bodenbelastung", rhsBodenbelastung), lhsBodenbelastung, rhsBodenbelastung, (this.bodenbelastung!= null), (that.bodenbelastung!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGrundstuecksFlaeche;
            lhsGrundstuecksFlaeche = this.getGrundstuecksFlaeche();
            BigDecimal rhsGrundstuecksFlaeche;
            rhsGrundstuecksFlaeche = that.getGrundstuecksFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundstuecksFlaeche", lhsGrundstuecksFlaeche), LocatorUtils.property(thatLocator, "grundstuecksFlaeche", rhsGrundstuecksFlaeche), lhsGrundstuecksFlaeche, rhsGrundstuecksFlaeche, (this.grundstuecksFlaeche!= null), (that.grundstuecksFlaeche!= null))) {
                return false;
            }
        }
        {
            Long lhsStromanschlusswert;
            lhsStromanschlusswert = this.getStromanschlusswert();
            Long rhsStromanschlusswert;
            rhsStromanschlusswert = that.getStromanschlusswert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stromanschlusswert", lhsStromanschlusswert), LocatorUtils.property(thatLocator, "stromanschlusswert", rhsStromanschlusswert), lhsStromanschlusswert, rhsStromanschlusswert, (this.stromanschlusswert!= null), (that.stromanschlusswert!= null))) {
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
