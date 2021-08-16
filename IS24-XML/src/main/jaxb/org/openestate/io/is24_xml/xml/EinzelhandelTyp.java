
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
public class EinzelhandelTyp
    extends GewerbeImmoBaseTyp
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "Vermarktung", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected VermarktungGewerbeTyp vermarktung;
    @XmlElementRef(name = "Lastenaufzug", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected JAXBElement<HebeanlageTyp> lastenaufzug;
    @XmlAttribute(name = "Objektkategorie2")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected EinzelhandelKategorienTyp objektkategorie2;
    @XmlAttribute(name = "Verkaufsflaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal verkaufsflaeche;
    @XmlAttribute(name = "Bodenbelag")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BodenbelagTyp bodenbelag;
    @XmlAttribute(name = "Schaufensterfront")
    @XmlJavaTypeAdapter(Adapter30 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal schaufensterfront;
    @XmlAttribute(name = "Deckenlast")
    @XmlJavaTypeAdapter(Adapter33 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal deckenlast;
    @XmlAttribute(name = "Lageart")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected LageartTyp lageart;
    @XmlAttribute(name = "Rampe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean rampe;
    @XmlAttribute(name = "Zulieferung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected ZulieferungTyp zulieferung;
    @XmlAttribute(name = "Denkmalschutzobjekt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean denkmalschutzobjekt;
    @XmlAttribute(name = "Keller")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean keller;

    /**
     * Gets the value of the vermarktung property.
     * 
     * @return
     *     possible object is
     *     {@link VermarktungGewerbeTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getRampe() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getDenkmalschutzobjekt() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getKeller() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setKeller(Boolean value) {
        this.keller = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            VermarktungGewerbeTyp theVermarktung;
            theVermarktung = this.getVermarktung();
            strategy.appendField(locator, this, "vermarktung", buffer, theVermarktung, (this.vermarktung!= null));
        }
        {
            JAXBElement<HebeanlageTyp> theLastenaufzug;
            theLastenaufzug = this.getLastenaufzug();
            strategy.appendField(locator, this, "lastenaufzug", buffer, theLastenaufzug, (this.lastenaufzug!= null));
        }
        {
            EinzelhandelKategorienTyp theObjektkategorie2;
            theObjektkategorie2 = this.getObjektkategorie2();
            strategy.appendField(locator, this, "objektkategorie2", buffer, theObjektkategorie2, (this.objektkategorie2 != null));
        }
        {
            BigDecimal theVerkaufsflaeche;
            theVerkaufsflaeche = this.getVerkaufsflaeche();
            strategy.appendField(locator, this, "verkaufsflaeche", buffer, theVerkaufsflaeche, (this.verkaufsflaeche!= null));
        }
        {
            BodenbelagTyp theBodenbelag;
            theBodenbelag = this.getBodenbelag();
            strategy.appendField(locator, this, "bodenbelag", buffer, theBodenbelag, (this.bodenbelag!= null));
        }
        {
            BigDecimal theSchaufensterfront;
            theSchaufensterfront = this.getSchaufensterfront();
            strategy.appendField(locator, this, "schaufensterfront", buffer, theSchaufensterfront, (this.schaufensterfront!= null));
        }
        {
            BigDecimal theDeckenlast;
            theDeckenlast = this.getDeckenlast();
            strategy.appendField(locator, this, "deckenlast", buffer, theDeckenlast, (this.deckenlast!= null));
        }
        {
            LageartTyp theLageart;
            theLageart = this.getLageart();
            strategy.appendField(locator, this, "lageart", buffer, theLageart, (this.lageart!= null));
        }
        {
            Boolean theRampe;
            theRampe = this.getRampe();
            strategy.appendField(locator, this, "rampe", buffer, theRampe, (this.rampe!= null));
        }
        {
            ZulieferungTyp theZulieferung;
            theZulieferung = this.getZulieferung();
            strategy.appendField(locator, this, "zulieferung", buffer, theZulieferung, (this.zulieferung!= null));
        }
        {
            Boolean theDenkmalschutzobjekt;
            theDenkmalschutzobjekt = this.getDenkmalschutzobjekt();
            strategy.appendField(locator, this, "denkmalschutzobjekt", buffer, theDenkmalschutzobjekt, (this.denkmalschutzobjekt!= null));
        }
        {
            Boolean theKeller;
            theKeller = this.getKeller();
            strategy.appendField(locator, this, "keller", buffer, theKeller, (this.keller!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof EinzelhandelTyp) {
            final EinzelhandelTyp copy = ((EinzelhandelTyp) draftCopy);
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
                    JAXBElement<HebeanlageTyp> sourceLastenaufzug;
                    sourceLastenaufzug = this.getLastenaufzug();
                    @SuppressWarnings("unchecked")
                    JAXBElement<HebeanlageTyp> copyLastenaufzug = ((JAXBElement<HebeanlageTyp> ) strategy.copy(LocatorUtils.property(locator, "lastenaufzug", sourceLastenaufzug), sourceLastenaufzug, (this.lastenaufzug!= null)));
                    copy.setLastenaufzug(copyLastenaufzug);
                } else {
                    if (lastenaufzugShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastenaufzug = null;
                    }
                }
            }
            {
                Boolean objektkategorie2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektkategorie2 != null));
                if (objektkategorie2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    EinzelhandelKategorienTyp sourceObjektkategorie2;
                    sourceObjektkategorie2 = this.getObjektkategorie2();
                    EinzelhandelKategorienTyp copyObjektkategorie2 = ((EinzelhandelKategorienTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2, (this.objektkategorie2 != null)));
                    copy.setObjektkategorie2(copyObjektkategorie2);
                } else {
                    if (objektkategorie2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektkategorie2 = null;
                    }
                }
            }
            {
                Boolean verkaufsflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verkaufsflaeche!= null));
                if (verkaufsflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceVerkaufsflaeche;
                    sourceVerkaufsflaeche = this.getVerkaufsflaeche();
                    BigDecimal copyVerkaufsflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "verkaufsflaeche", sourceVerkaufsflaeche), sourceVerkaufsflaeche, (this.verkaufsflaeche!= null)));
                    copy.setVerkaufsflaeche(copyVerkaufsflaeche);
                } else {
                    if (verkaufsflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verkaufsflaeche = null;
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
                Boolean schaufensterfrontShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schaufensterfront!= null));
                if (schaufensterfrontShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceSchaufensterfront;
                    sourceSchaufensterfront = this.getSchaufensterfront();
                    BigDecimal copySchaufensterfront = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "schaufensterfront", sourceSchaufensterfront), sourceSchaufensterfront, (this.schaufensterfront!= null)));
                    copy.setSchaufensterfront(copySchaufensterfront);
                } else {
                    if (schaufensterfrontShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schaufensterfront = null;
                    }
                }
            }
            {
                Boolean deckenlastShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deckenlast!= null));
                if (deckenlastShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceDeckenlast;
                    sourceDeckenlast = this.getDeckenlast();
                    BigDecimal copyDeckenlast = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "deckenlast", sourceDeckenlast), sourceDeckenlast, (this.deckenlast!= null)));
                    copy.setDeckenlast(copyDeckenlast);
                } else {
                    if (deckenlastShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deckenlast = null;
                    }
                }
            }
            {
                Boolean lageartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lageart!= null));
                if (lageartShouldBeCopiedAndSet == Boolean.TRUE) {
                    LageartTyp sourceLageart;
                    sourceLageart = this.getLageart();
                    LageartTyp copyLageart = ((LageartTyp) strategy.copy(LocatorUtils.property(locator, "lageart", sourceLageart), sourceLageart, (this.lageart!= null)));
                    copy.setLageart(copyLageart);
                } else {
                    if (lageartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lageart = null;
                    }
                }
            }
            {
                Boolean rampeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rampe!= null));
                if (rampeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRampe;
                    sourceRampe = this.getRampe();
                    Boolean copyRampe = ((Boolean) strategy.copy(LocatorUtils.property(locator, "rampe", sourceRampe), sourceRampe, (this.rampe!= null)));
                    copy.setRampe(copyRampe);
                } else {
                    if (rampeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rampe = null;
                    }
                }
            }
            {
                Boolean zulieferungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zulieferung!= null));
                if (zulieferungShouldBeCopiedAndSet == Boolean.TRUE) {
                    ZulieferungTyp sourceZulieferung;
                    sourceZulieferung = this.getZulieferung();
                    ZulieferungTyp copyZulieferung = ((ZulieferungTyp) strategy.copy(LocatorUtils.property(locator, "zulieferung", sourceZulieferung), sourceZulieferung, (this.zulieferung!= null)));
                    copy.setZulieferung(copyZulieferung);
                } else {
                    if (zulieferungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zulieferung = null;
                    }
                }
            }
            {
                Boolean denkmalschutzobjektShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.denkmalschutzobjekt!= null));
                if (denkmalschutzobjektShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDenkmalschutzobjekt;
                    sourceDenkmalschutzobjekt = this.getDenkmalschutzobjekt();
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
                    sourceKeller = this.getKeller();
                    Boolean copyKeller = ((Boolean) strategy.copy(LocatorUtils.property(locator, "keller", sourceKeller), sourceKeller, (this.keller!= null)));
                    copy.setKeller(copyKeller);
                } else {
                    if (kellerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.keller = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new EinzelhandelTyp();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
        final EinzelhandelTyp that = ((EinzelhandelTyp) object);
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
            JAXBElement<HebeanlageTyp> lhsLastenaufzug;
            lhsLastenaufzug = this.getLastenaufzug();
            JAXBElement<HebeanlageTyp> rhsLastenaufzug;
            rhsLastenaufzug = that.getLastenaufzug();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastenaufzug", lhsLastenaufzug), LocatorUtils.property(thatLocator, "lastenaufzug", rhsLastenaufzug), lhsLastenaufzug, rhsLastenaufzug, (this.lastenaufzug!= null), (that.lastenaufzug!= null))) {
                return false;
            }
        }
        {
            EinzelhandelKategorienTyp lhsObjektkategorie2;
            lhsObjektkategorie2 = this.getObjektkategorie2();
            EinzelhandelKategorienTyp rhsObjektkategorie2;
            rhsObjektkategorie2 = that.getObjektkategorie2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie2", lhsObjektkategorie2), LocatorUtils.property(thatLocator, "objektkategorie2", rhsObjektkategorie2), lhsObjektkategorie2, rhsObjektkategorie2, (this.objektkategorie2 != null), (that.objektkategorie2 != null))) {
                return false;
            }
        }
        {
            BigDecimal lhsVerkaufsflaeche;
            lhsVerkaufsflaeche = this.getVerkaufsflaeche();
            BigDecimal rhsVerkaufsflaeche;
            rhsVerkaufsflaeche = that.getVerkaufsflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verkaufsflaeche", lhsVerkaufsflaeche), LocatorUtils.property(thatLocator, "verkaufsflaeche", rhsVerkaufsflaeche), lhsVerkaufsflaeche, rhsVerkaufsflaeche, (this.verkaufsflaeche!= null), (that.verkaufsflaeche!= null))) {
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
            BigDecimal lhsSchaufensterfront;
            lhsSchaufensterfront = this.getSchaufensterfront();
            BigDecimal rhsSchaufensterfront;
            rhsSchaufensterfront = that.getSchaufensterfront();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schaufensterfront", lhsSchaufensterfront), LocatorUtils.property(thatLocator, "schaufensterfront", rhsSchaufensterfront), lhsSchaufensterfront, rhsSchaufensterfront, (this.schaufensterfront!= null), (that.schaufensterfront!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsDeckenlast;
            lhsDeckenlast = this.getDeckenlast();
            BigDecimal rhsDeckenlast;
            rhsDeckenlast = that.getDeckenlast();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deckenlast", lhsDeckenlast), LocatorUtils.property(thatLocator, "deckenlast", rhsDeckenlast), lhsDeckenlast, rhsDeckenlast, (this.deckenlast!= null), (that.deckenlast!= null))) {
                return false;
            }
        }
        {
            LageartTyp lhsLageart;
            lhsLageart = this.getLageart();
            LageartTyp rhsLageart;
            rhsLageart = that.getLageart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lageart", lhsLageart), LocatorUtils.property(thatLocator, "lageart", rhsLageart), lhsLageart, rhsLageart, (this.lageart!= null), (that.lageart!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRampe;
            lhsRampe = this.getRampe();
            Boolean rhsRampe;
            rhsRampe = that.getRampe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rampe", lhsRampe), LocatorUtils.property(thatLocator, "rampe", rhsRampe), lhsRampe, rhsRampe, (this.rampe!= null), (that.rampe!= null))) {
                return false;
            }
        }
        {
            ZulieferungTyp lhsZulieferung;
            lhsZulieferung = this.getZulieferung();
            ZulieferungTyp rhsZulieferung;
            rhsZulieferung = that.getZulieferung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zulieferung", lhsZulieferung), LocatorUtils.property(thatLocator, "zulieferung", rhsZulieferung), lhsZulieferung, rhsZulieferung, (this.zulieferung!= null), (that.zulieferung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDenkmalschutzobjekt;
            lhsDenkmalschutzobjekt = this.getDenkmalschutzobjekt();
            Boolean rhsDenkmalschutzobjekt;
            rhsDenkmalschutzobjekt = that.getDenkmalschutzobjekt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "denkmalschutzobjekt", lhsDenkmalschutzobjekt), LocatorUtils.property(thatLocator, "denkmalschutzobjekt", rhsDenkmalschutzobjekt), lhsDenkmalschutzobjekt, rhsDenkmalschutzobjekt, (this.denkmalschutzobjekt!= null), (that.denkmalschutzobjekt!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKeller;
            lhsKeller = this.getKeller();
            Boolean rhsKeller;
            rhsKeller = that.getKeller();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keller", lhsKeller), LocatorUtils.property(thatLocator, "keller", rhsKeller), lhsKeller, rhsKeller, (this.keller!= null), (that.keller!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
