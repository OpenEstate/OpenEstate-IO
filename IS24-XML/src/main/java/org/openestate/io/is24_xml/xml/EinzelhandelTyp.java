
package org.openestate.io.is24_xml.xml;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for EinzelhandelTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EinzelhandelTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}GewerbeImmoBaseTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vermarktung" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungGewerbeTyp"/&gt;
 *         &lt;element name="Lastenaufzug" type="{http://www.immobilienscout24.de/immobilientransfer}HebeanlageTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Objektkategorie2" type="{http://www.immobilienscout24.de/immobilientransfer}EinzelhandelKategorienTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="Verkaufsflaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Bodenbelag" type="{http://www.immobilienscout24.de/immobilientransfer}BodenbelagTyp" /&gt;
 *       &lt;attribute name="Schaufensterfront" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl52Typ" /&gt;
 *       &lt;attribute name="Deckenlast" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl72Typ" /&gt;
 *       &lt;attribute name="Lageart" type="{http://www.immobilienscout24.de/immobilientransfer}LageartTyp" /&gt;
 *       &lt;attribute name="Rampe" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Zulieferung" type="{http://www.immobilienscout24.de/immobilientransfer}ZulieferungTyp" /&gt;
 *       &lt;attribute name="Denkmalschutzobjekt" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Keller" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EinzelhandelTyp", propOrder = {
    "vermarktung",
    "lastenaufzug"
})
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.Einzelhandel.Type.class
})
public class EinzelhandelTyp
    extends GewerbeImmoBaseTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "Vermarktung", required = true)
    protected VermarktungGewerbeTyp vermarktung;
    @XmlElementRef(name = "Lastenaufzug", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
    protected JAXBElement<HebeanlageTyp> lastenaufzug;
    @XmlAttribute(name = "Objektkategorie2")
    protected EinzelhandelKategorienTyp objektkategorie2;
    @XmlAttribute(name = "Verkaufsflaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal verkaufsflaeche;
    @XmlAttribute(name = "Bodenbelag")
    protected BodenbelagTyp bodenbelag;
    @XmlAttribute(name = "Schaufensterfront")
    @XmlJavaTypeAdapter(Adapter30 .class)
    protected BigDecimal schaufensterfront;
    @XmlAttribute(name = "Deckenlast")
    @XmlJavaTypeAdapter(Adapter33 .class)
    protected BigDecimal deckenlast;
    @XmlAttribute(name = "Lageart")
    protected LageartTyp lageart;
    @XmlAttribute(name = "Rampe")
    protected Boolean rampe;
    @XmlAttribute(name = "Zulieferung")
    protected ZulieferungTyp zulieferung;
    @XmlAttribute(name = "Denkmalschutzobjekt")
    protected Boolean denkmalschutzobjekt;
    @XmlAttribute(name = "Keller")
    protected Boolean keller;

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
     *     {@link JAXBElement }{@code <}{@link HebeanlageTyp }{@code >}
     *     
     */
    public JAXBElement<HebeanlageTyp> getLastenaufzug() {
        return lastenaufzug;
    }

    /**
     * Sets the value of the lastenaufzug property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HebeanlageTyp }{@code >}
     *     
     */
    public void setLastenaufzug(JAXBElement<HebeanlageTyp> value) {
        this.lastenaufzug = value;
    }

    /**
     * Gets the value of the objektkategorie2 property.
     * 
     * @return
     *     possible object is
     *     {@link EinzelhandelKategorienTyp }
     *     
     */
    public EinzelhandelKategorienTyp getObjektkategorie2() {
        if (objektkategorie2 == null) {
            return EinzelhandelKategorienTyp.KEINE_ANGABE;
        } else {
            return objektkategorie2;
        }
    }

    /**
     * Sets the value of the objektkategorie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EinzelhandelKategorienTyp }
     *     
     */
    public void setObjektkategorie2(EinzelhandelKategorienTyp value) {
        this.objektkategorie2 = value;
    }

    /**
     * Gets the value of the verkaufsflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getVerkaufsflaeche() {
        return verkaufsflaeche;
    }

    /**
     * Sets the value of the verkaufsflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerkaufsflaeche(BigDecimal value) {
        this.verkaufsflaeche = value;
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
     * Gets the value of the schaufensterfront property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getSchaufensterfront() {
        return schaufensterfront;
    }

    /**
     * Sets the value of the schaufensterfront property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchaufensterfront(BigDecimal value) {
        this.schaufensterfront = value;
    }

    /**
     * Gets the value of the deckenlast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getDeckenlast() {
        return deckenlast;
    }

    /**
     * Sets the value of the deckenlast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckenlast(BigDecimal value) {
        this.deckenlast = value;
    }

    /**
     * Gets the value of the lageart property.
     * 
     * @return
     *     possible object is
     *     {@link LageartTyp }
     *     
     */
    public LageartTyp getLageart() {
        return lageart;
    }

    /**
     * Sets the value of the lageart property.
     * 
     * @param value
     *     allowed object is
     *     {@link LageartTyp }
     *     
     */
    public void setLageart(LageartTyp value) {
        this.lageart = value;
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
     * Gets the value of the zulieferung property.
     * 
     * @return
     *     possible object is
     *     {@link ZulieferungTyp }
     *     
     */
    public ZulieferungTyp getZulieferung() {
        return zulieferung;
    }

    /**
     * Sets the value of the zulieferung property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZulieferungTyp }
     *     
     */
    public void setZulieferung(ZulieferungTyp value) {
        this.zulieferung = value;
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
            JAXBElement<HebeanlageTyp> theLastenaufzug;
            theLastenaufzug = this.getLastenaufzug();
            strategy.appendField(locator, this, "lastenaufzug", buffer, theLastenaufzug);
        }
        {
            EinzelhandelKategorienTyp theObjektkategorie2;
            theObjektkategorie2 = this.getObjektkategorie2();
            strategy.appendField(locator, this, "objektkategorie2", buffer, theObjektkategorie2);
        }
        {
            BigDecimal theVerkaufsflaeche;
            theVerkaufsflaeche = this.getVerkaufsflaeche();
            strategy.appendField(locator, this, "verkaufsflaeche", buffer, theVerkaufsflaeche);
        }
        {
            BodenbelagTyp theBodenbelag;
            theBodenbelag = this.getBodenbelag();
            strategy.appendField(locator, this, "bodenbelag", buffer, theBodenbelag);
        }
        {
            BigDecimal theSchaufensterfront;
            theSchaufensterfront = this.getSchaufensterfront();
            strategy.appendField(locator, this, "schaufensterfront", buffer, theSchaufensterfront);
        }
        {
            BigDecimal theDeckenlast;
            theDeckenlast = this.getDeckenlast();
            strategy.appendField(locator, this, "deckenlast", buffer, theDeckenlast);
        }
        {
            LageartTyp theLageart;
            theLageart = this.getLageart();
            strategy.appendField(locator, this, "lageart", buffer, theLageart);
        }
        {
            Boolean theRampe;
            theRampe = this.isRampe();
            strategy.appendField(locator, this, "rampe", buffer, theRampe);
        }
        {
            ZulieferungTyp theZulieferung;
            theZulieferung = this.getZulieferung();
            strategy.appendField(locator, this, "zulieferung", buffer, theZulieferung);
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
        if (draftCopy instanceof EinzelhandelTyp) {
            final EinzelhandelTyp copy = ((EinzelhandelTyp) draftCopy);
            if (this.vermarktung!= null) {
                VermarktungGewerbeTyp sourceVermarktung;
                sourceVermarktung = this.getVermarktung();
                VermarktungGewerbeTyp copyVermarktung = ((VermarktungGewerbeTyp) strategy.copy(LocatorUtils.property(locator, "vermarktung", sourceVermarktung), sourceVermarktung));
                copy.setVermarktung(copyVermarktung);
            } else {
                copy.vermarktung = null;
            }
            if (this.lastenaufzug!= null) {
                JAXBElement<HebeanlageTyp> sourceLastenaufzug;
                sourceLastenaufzug = this.getLastenaufzug();
                @SuppressWarnings("unchecked")
                JAXBElement<HebeanlageTyp> copyLastenaufzug = ((JAXBElement<HebeanlageTyp> ) strategy.copy(LocatorUtils.property(locator, "lastenaufzug", sourceLastenaufzug), sourceLastenaufzug));
                copy.setLastenaufzug(copyLastenaufzug);
            } else {
                copy.lastenaufzug = null;
            }
            if (this.objektkategorie2 != null) {
                EinzelhandelKategorienTyp sourceObjektkategorie2;
                sourceObjektkategorie2 = this.getObjektkategorie2();
                EinzelhandelKategorienTyp copyObjektkategorie2 = ((EinzelhandelKategorienTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2));
                copy.setObjektkategorie2(copyObjektkategorie2);
            } else {
                copy.objektkategorie2 = null;
            }
            if (this.verkaufsflaeche!= null) {
                BigDecimal sourceVerkaufsflaeche;
                sourceVerkaufsflaeche = this.getVerkaufsflaeche();
                BigDecimal copyVerkaufsflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "verkaufsflaeche", sourceVerkaufsflaeche), sourceVerkaufsflaeche));
                copy.setVerkaufsflaeche(copyVerkaufsflaeche);
            } else {
                copy.verkaufsflaeche = null;
            }
            if (this.bodenbelag!= null) {
                BodenbelagTyp sourceBodenbelag;
                sourceBodenbelag = this.getBodenbelag();
                BodenbelagTyp copyBodenbelag = ((BodenbelagTyp) strategy.copy(LocatorUtils.property(locator, "bodenbelag", sourceBodenbelag), sourceBodenbelag));
                copy.setBodenbelag(copyBodenbelag);
            } else {
                copy.bodenbelag = null;
            }
            if (this.schaufensterfront!= null) {
                BigDecimal sourceSchaufensterfront;
                sourceSchaufensterfront = this.getSchaufensterfront();
                BigDecimal copySchaufensterfront = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "schaufensterfront", sourceSchaufensterfront), sourceSchaufensterfront));
                copy.setSchaufensterfront(copySchaufensterfront);
            } else {
                copy.schaufensterfront = null;
            }
            if (this.deckenlast!= null) {
                BigDecimal sourceDeckenlast;
                sourceDeckenlast = this.getDeckenlast();
                BigDecimal copyDeckenlast = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "deckenlast", sourceDeckenlast), sourceDeckenlast));
                copy.setDeckenlast(copyDeckenlast);
            } else {
                copy.deckenlast = null;
            }
            if (this.lageart!= null) {
                LageartTyp sourceLageart;
                sourceLageart = this.getLageart();
                LageartTyp copyLageart = ((LageartTyp) strategy.copy(LocatorUtils.property(locator, "lageart", sourceLageart), sourceLageart));
                copy.setLageart(copyLageart);
            } else {
                copy.lageart = null;
            }
            if (this.rampe!= null) {
                Boolean sourceRampe;
                sourceRampe = this.isRampe();
                Boolean copyRampe = ((Boolean) strategy.copy(LocatorUtils.property(locator, "rampe", sourceRampe), sourceRampe));
                copy.setRampe(copyRampe);
            } else {
                copy.rampe = null;
            }
            if (this.zulieferung!= null) {
                ZulieferungTyp sourceZulieferung;
                sourceZulieferung = this.getZulieferung();
                ZulieferungTyp copyZulieferung = ((ZulieferungTyp) strategy.copy(LocatorUtils.property(locator, "zulieferung", sourceZulieferung), sourceZulieferung));
                copy.setZulieferung(copyZulieferung);
            } else {
                copy.zulieferung = null;
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
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EinzelhandelTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EinzelhandelTyp that = ((EinzelhandelTyp) object);
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
            JAXBElement<HebeanlageTyp> lhsLastenaufzug;
            lhsLastenaufzug = this.getLastenaufzug();
            JAXBElement<HebeanlageTyp> rhsLastenaufzug;
            rhsLastenaufzug = that.getLastenaufzug();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastenaufzug", lhsLastenaufzug), LocatorUtils.property(thatLocator, "lastenaufzug", rhsLastenaufzug), lhsLastenaufzug, rhsLastenaufzug)) {
                return false;
            }
        }
        {
            EinzelhandelKategorienTyp lhsObjektkategorie2;
            lhsObjektkategorie2 = this.getObjektkategorie2();
            EinzelhandelKategorienTyp rhsObjektkategorie2;
            rhsObjektkategorie2 = that.getObjektkategorie2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie2", lhsObjektkategorie2), LocatorUtils.property(thatLocator, "objektkategorie2", rhsObjektkategorie2), lhsObjektkategorie2, rhsObjektkategorie2)) {
                return false;
            }
        }
        {
            BigDecimal lhsVerkaufsflaeche;
            lhsVerkaufsflaeche = this.getVerkaufsflaeche();
            BigDecimal rhsVerkaufsflaeche;
            rhsVerkaufsflaeche = that.getVerkaufsflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verkaufsflaeche", lhsVerkaufsflaeche), LocatorUtils.property(thatLocator, "verkaufsflaeche", rhsVerkaufsflaeche), lhsVerkaufsflaeche, rhsVerkaufsflaeche)) {
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
            BigDecimal lhsSchaufensterfront;
            lhsSchaufensterfront = this.getSchaufensterfront();
            BigDecimal rhsSchaufensterfront;
            rhsSchaufensterfront = that.getSchaufensterfront();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schaufensterfront", lhsSchaufensterfront), LocatorUtils.property(thatLocator, "schaufensterfront", rhsSchaufensterfront), lhsSchaufensterfront, rhsSchaufensterfront)) {
                return false;
            }
        }
        {
            BigDecimal lhsDeckenlast;
            lhsDeckenlast = this.getDeckenlast();
            BigDecimal rhsDeckenlast;
            rhsDeckenlast = that.getDeckenlast();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deckenlast", lhsDeckenlast), LocatorUtils.property(thatLocator, "deckenlast", rhsDeckenlast), lhsDeckenlast, rhsDeckenlast)) {
                return false;
            }
        }
        {
            LageartTyp lhsLageart;
            lhsLageart = this.getLageart();
            LageartTyp rhsLageart;
            rhsLageart = that.getLageart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lageart", lhsLageart), LocatorUtils.property(thatLocator, "lageart", rhsLageart), lhsLageart, rhsLageart)) {
                return false;
            }
        }
        {
            Boolean lhsRampe;
            lhsRampe = this.isRampe();
            Boolean rhsRampe;
            rhsRampe = that.isRampe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rampe", lhsRampe), LocatorUtils.property(thatLocator, "rampe", rhsRampe), lhsRampe, rhsRampe)) {
                return false;
            }
        }
        {
            ZulieferungTyp lhsZulieferung;
            lhsZulieferung = this.getZulieferung();
            ZulieferungTyp rhsZulieferung;
            rhsZulieferung = that.getZulieferung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zulieferung", lhsZulieferung), LocatorUtils.property(thatLocator, "zulieferung", rhsZulieferung), lhsZulieferung, rhsZulieferung)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
