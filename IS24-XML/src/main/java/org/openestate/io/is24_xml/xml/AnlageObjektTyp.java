
package org.openestate.io.is24_xml.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for AnlageObjektTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnlageObjektTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}GewerbeImmoBaseTyp"&gt;
 *       &lt;attribute name="Objektkategorie2" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}AnlageobjekteKategorieTyp" /&gt;
 *       &lt;attribute name="VermietbareFlaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="WohnFlaechen" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="GewerbeFlaechen" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="GrundstuecksFlaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="SonstigeFlaechen" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="XFacheMiete" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl31Typ" /&gt;
 *       &lt;attribute name="MietEinnahmePaIst" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="MietEinnahmePaSoll" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="Kaufpreis" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="KaufpreisProQm" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="BetriebskostenUmgelegt" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="NichtUmgelegteKosten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="PreisProParkflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *       &lt;attribute name="Denkmalschutzobjekt" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnlageObjektTyp")
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.Anlageobjekt.Type.class
})
public class AnlageObjektTyp
    extends GewerbeImmoBaseTyp
    implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "Objektkategorie2", required = true)
    protected AnlageobjekteKategorieTyp objektkategorie2;
    @XmlAttribute(name = "VermietbareFlaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal vermietbareFlaeche;
    @XmlAttribute(name = "WohnFlaechen")
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal wohnFlaechen;
    @XmlAttribute(name = "GewerbeFlaechen")
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal gewerbeFlaechen;
    @XmlAttribute(name = "GrundstuecksFlaeche")
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal grundstuecksFlaeche;
    @XmlAttribute(name = "SonstigeFlaechen")
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal sonstigeFlaechen;
    @XmlAttribute(name = "XFacheMiete")
    @XmlJavaTypeAdapter(Adapter27 .class)
    protected BigDecimal xFacheMiete;
    @XmlAttribute(name = "MietEinnahmePaIst")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected BigDecimal mietEinnahmePaIst;
    @XmlAttribute(name = "MietEinnahmePaSoll")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected BigDecimal mietEinnahmePaSoll;
    @XmlAttribute(name = "Kaufpreis", required = true)
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected BigDecimal kaufpreis;
    @XmlAttribute(name = "KaufpreisProQm")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected BigDecimal kaufpreisProQm;
    @XmlAttribute(name = "BetriebskostenUmgelegt")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected BigDecimal betriebskostenUmgelegt;
    @XmlAttribute(name = "NichtUmgelegteKosten")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected BigDecimal nichtUmgelegteKosten;
    @XmlAttribute(name = "PreisProParkflaeche")
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected BigDecimal preisProParkflaeche;
    @XmlAttribute(name = "Denkmalschutzobjekt")
    protected Boolean denkmalschutzobjekt;

    /**
     * Gets the value of the objektkategorie2 property.
     * 
     * @return
     *     possible object is
     *     {@link AnlageobjekteKategorieTyp }
     *     
     */
    public AnlageobjekteKategorieTyp getObjektkategorie2() {
        return objektkategorie2;
    }

    /**
     * Sets the value of the objektkategorie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlageobjekteKategorieTyp }
     *     
     */
    public void setObjektkategorie2(AnlageobjekteKategorieTyp value) {
        this.objektkategorie2 = value;
    }

    /**
     * Gets the value of the vermietbareFlaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getVermietbareFlaeche() {
        return vermietbareFlaeche;
    }

    /**
     * Sets the value of the vermietbareFlaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVermietbareFlaeche(BigDecimal value) {
        this.vermietbareFlaeche = value;
    }

    /**
     * Gets the value of the wohnFlaechen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getWohnFlaechen() {
        return wohnFlaechen;
    }

    /**
     * Sets the value of the wohnFlaechen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnFlaechen(BigDecimal value) {
        this.wohnFlaechen = value;
    }

    /**
     * Gets the value of the gewerbeFlaechen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getGewerbeFlaechen() {
        return gewerbeFlaechen;
    }

    /**
     * Sets the value of the gewerbeFlaechen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGewerbeFlaechen(BigDecimal value) {
        this.gewerbeFlaechen = value;
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
     * Gets the value of the sonstigeFlaechen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getSonstigeFlaechen() {
        return sonstigeFlaechen;
    }

    /**
     * Sets the value of the sonstigeFlaechen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonstigeFlaechen(BigDecimal value) {
        this.sonstigeFlaechen = value;
    }

    /**
     * Gets the value of the xFacheMiete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getXFacheMiete() {
        return xFacheMiete;
    }

    /**
     * Sets the value of the xFacheMiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFacheMiete(BigDecimal value) {
        this.xFacheMiete = value;
    }

    /**
     * Gets the value of the mietEinnahmePaIst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMietEinnahmePaIst() {
        return mietEinnahmePaIst;
    }

    /**
     * Sets the value of the mietEinnahmePaIst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMietEinnahmePaIst(BigDecimal value) {
        this.mietEinnahmePaIst = value;
    }

    /**
     * Gets the value of the mietEinnahmePaSoll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getMietEinnahmePaSoll() {
        return mietEinnahmePaSoll;
    }

    /**
     * Sets the value of the mietEinnahmePaSoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMietEinnahmePaSoll(BigDecimal value) {
        this.mietEinnahmePaSoll = value;
    }

    /**
     * Gets the value of the kaufpreis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getKaufpreis() {
        return kaufpreis;
    }

    /**
     * Sets the value of the kaufpreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKaufpreis(BigDecimal value) {
        this.kaufpreis = value;
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
     * Gets the value of the betriebskostenUmgelegt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getBetriebskostenUmgelegt() {
        return betriebskostenUmgelegt;
    }

    /**
     * Sets the value of the betriebskostenUmgelegt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetriebskostenUmgelegt(BigDecimal value) {
        this.betriebskostenUmgelegt = value;
    }

    /**
     * Gets the value of the nichtUmgelegteKosten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getNichtUmgelegteKosten() {
        return nichtUmgelegteKosten;
    }

    /**
     * Sets the value of the nichtUmgelegteKosten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNichtUmgelegteKosten(BigDecimal value) {
        this.nichtUmgelegteKosten = value;
    }

    /**
     * Gets the value of the preisProParkflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getPreisProParkflaeche() {
        return preisProParkflaeche;
    }

    /**
     * Sets the value of the preisProParkflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreisProParkflaeche(BigDecimal value) {
        this.preisProParkflaeche = value;
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
            AnlageobjekteKategorieTyp theObjektkategorie2;
            theObjektkategorie2 = this.getObjektkategorie2();
            strategy.appendField(locator, this, "objektkategorie2", buffer, theObjektkategorie2, (this.objektkategorie2 != null));
        }
        {
            BigDecimal theVermietbareFlaeche;
            theVermietbareFlaeche = this.getVermietbareFlaeche();
            strategy.appendField(locator, this, "vermietbareFlaeche", buffer, theVermietbareFlaeche, (this.vermietbareFlaeche!= null));
        }
        {
            BigDecimal theWohnFlaechen;
            theWohnFlaechen = this.getWohnFlaechen();
            strategy.appendField(locator, this, "wohnFlaechen", buffer, theWohnFlaechen, (this.wohnFlaechen!= null));
        }
        {
            BigDecimal theGewerbeFlaechen;
            theGewerbeFlaechen = this.getGewerbeFlaechen();
            strategy.appendField(locator, this, "gewerbeFlaechen", buffer, theGewerbeFlaechen, (this.gewerbeFlaechen!= null));
        }
        {
            BigDecimal theGrundstuecksFlaeche;
            theGrundstuecksFlaeche = this.getGrundstuecksFlaeche();
            strategy.appendField(locator, this, "grundstuecksFlaeche", buffer, theGrundstuecksFlaeche, (this.grundstuecksFlaeche!= null));
        }
        {
            BigDecimal theSonstigeFlaechen;
            theSonstigeFlaechen = this.getSonstigeFlaechen();
            strategy.appendField(locator, this, "sonstigeFlaechen", buffer, theSonstigeFlaechen, (this.sonstigeFlaechen!= null));
        }
        {
            BigDecimal theXFacheMiete;
            theXFacheMiete = this.getXFacheMiete();
            strategy.appendField(locator, this, "xFacheMiete", buffer, theXFacheMiete, (this.xFacheMiete!= null));
        }
        {
            BigDecimal theMietEinnahmePaIst;
            theMietEinnahmePaIst = this.getMietEinnahmePaIst();
            strategy.appendField(locator, this, "mietEinnahmePaIst", buffer, theMietEinnahmePaIst, (this.mietEinnahmePaIst!= null));
        }
        {
            BigDecimal theMietEinnahmePaSoll;
            theMietEinnahmePaSoll = this.getMietEinnahmePaSoll();
            strategy.appendField(locator, this, "mietEinnahmePaSoll", buffer, theMietEinnahmePaSoll, (this.mietEinnahmePaSoll!= null));
        }
        {
            BigDecimal theKaufpreis;
            theKaufpreis = this.getKaufpreis();
            strategy.appendField(locator, this, "kaufpreis", buffer, theKaufpreis, (this.kaufpreis!= null));
        }
        {
            BigDecimal theKaufpreisProQm;
            theKaufpreisProQm = this.getKaufpreisProQm();
            strategy.appendField(locator, this, "kaufpreisProQm", buffer, theKaufpreisProQm, (this.kaufpreisProQm!= null));
        }
        {
            BigDecimal theBetriebskostenUmgelegt;
            theBetriebskostenUmgelegt = this.getBetriebskostenUmgelegt();
            strategy.appendField(locator, this, "betriebskostenUmgelegt", buffer, theBetriebskostenUmgelegt, (this.betriebskostenUmgelegt!= null));
        }
        {
            BigDecimal theNichtUmgelegteKosten;
            theNichtUmgelegteKosten = this.getNichtUmgelegteKosten();
            strategy.appendField(locator, this, "nichtUmgelegteKosten", buffer, theNichtUmgelegteKosten, (this.nichtUmgelegteKosten!= null));
        }
        {
            BigDecimal thePreisProParkflaeche;
            thePreisProParkflaeche = this.getPreisProParkflaeche();
            strategy.appendField(locator, this, "preisProParkflaeche", buffer, thePreisProParkflaeche, (this.preisProParkflaeche!= null));
        }
        {
            Boolean theDenkmalschutzobjekt;
            theDenkmalschutzobjekt = this.isDenkmalschutzobjekt();
            strategy.appendField(locator, this, "denkmalschutzobjekt", buffer, theDenkmalschutzobjekt, (this.denkmalschutzobjekt!= null));
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
        if (draftCopy instanceof AnlageObjektTyp) {
            final AnlageObjektTyp copy = ((AnlageObjektTyp) draftCopy);
            {
                Boolean objektkategorie2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektkategorie2 != null));
                if (objektkategorie2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    AnlageobjekteKategorieTyp sourceObjektkategorie2;
                    sourceObjektkategorie2 = this.getObjektkategorie2();
                    AnlageobjekteKategorieTyp copyObjektkategorie2 = ((AnlageobjekteKategorieTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2, (this.objektkategorie2 != null)));
                    copy.setObjektkategorie2(copyObjektkategorie2);
                } else {
                    if (objektkategorie2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektkategorie2 = null;
                    }
                }
            }
            {
                Boolean vermietbareFlaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermietbareFlaeche!= null));
                if (vermietbareFlaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceVermietbareFlaeche;
                    sourceVermietbareFlaeche = this.getVermietbareFlaeche();
                    BigDecimal copyVermietbareFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "vermietbareFlaeche", sourceVermietbareFlaeche), sourceVermietbareFlaeche, (this.vermietbareFlaeche!= null)));
                    copy.setVermietbareFlaeche(copyVermietbareFlaeche);
                } else {
                    if (vermietbareFlaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermietbareFlaeche = null;
                    }
                }
            }
            {
                Boolean wohnFlaechenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wohnFlaechen!= null));
                if (wohnFlaechenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWohnFlaechen;
                    sourceWohnFlaechen = this.getWohnFlaechen();
                    BigDecimal copyWohnFlaechen = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "wohnFlaechen", sourceWohnFlaechen), sourceWohnFlaechen, (this.wohnFlaechen!= null)));
                    copy.setWohnFlaechen(copyWohnFlaechen);
                } else {
                    if (wohnFlaechenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohnFlaechen = null;
                    }
                }
            }
            {
                Boolean gewerbeFlaechenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gewerbeFlaechen!= null));
                if (gewerbeFlaechenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGewerbeFlaechen;
                    sourceGewerbeFlaechen = this.getGewerbeFlaechen();
                    BigDecimal copyGewerbeFlaechen = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gewerbeFlaechen", sourceGewerbeFlaechen), sourceGewerbeFlaechen, (this.gewerbeFlaechen!= null)));
                    copy.setGewerbeFlaechen(copyGewerbeFlaechen);
                } else {
                    if (gewerbeFlaechenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gewerbeFlaechen = null;
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
                Boolean sonstigeFlaechenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sonstigeFlaechen!= null));
                if (sonstigeFlaechenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceSonstigeFlaechen;
                    sourceSonstigeFlaechen = this.getSonstigeFlaechen();
                    BigDecimal copySonstigeFlaechen = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "sonstigeFlaechen", sourceSonstigeFlaechen), sourceSonstigeFlaechen, (this.sonstigeFlaechen!= null)));
                    copy.setSonstigeFlaechen(copySonstigeFlaechen);
                } else {
                    if (sonstigeFlaechenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sonstigeFlaechen = null;
                    }
                }
            }
            {
                Boolean xFacheMieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.xFacheMiete!= null));
                if (xFacheMieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceXFacheMiete;
                    sourceXFacheMiete = this.getXFacheMiete();
                    BigDecimal copyXFacheMiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "xFacheMiete", sourceXFacheMiete), sourceXFacheMiete, (this.xFacheMiete!= null)));
                    copy.setXFacheMiete(copyXFacheMiete);
                } else {
                    if (xFacheMieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.xFacheMiete = null;
                    }
                }
            }
            {
                Boolean mietEinnahmePaIstShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mietEinnahmePaIst!= null));
                if (mietEinnahmePaIstShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMietEinnahmePaIst;
                    sourceMietEinnahmePaIst = this.getMietEinnahmePaIst();
                    BigDecimal copyMietEinnahmePaIst = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mietEinnahmePaIst", sourceMietEinnahmePaIst), sourceMietEinnahmePaIst, (this.mietEinnahmePaIst!= null)));
                    copy.setMietEinnahmePaIst(copyMietEinnahmePaIst);
                } else {
                    if (mietEinnahmePaIstShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mietEinnahmePaIst = null;
                    }
                }
            }
            {
                Boolean mietEinnahmePaSollShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mietEinnahmePaSoll!= null));
                if (mietEinnahmePaSollShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMietEinnahmePaSoll;
                    sourceMietEinnahmePaSoll = this.getMietEinnahmePaSoll();
                    BigDecimal copyMietEinnahmePaSoll = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mietEinnahmePaSoll", sourceMietEinnahmePaSoll), sourceMietEinnahmePaSoll, (this.mietEinnahmePaSoll!= null)));
                    copy.setMietEinnahmePaSoll(copyMietEinnahmePaSoll);
                } else {
                    if (mietEinnahmePaSollShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mietEinnahmePaSoll = null;
                    }
                }
            }
            {
                Boolean kaufpreisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaufpreis!= null));
                if (kaufpreisShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKaufpreis;
                    sourceKaufpreis = this.getKaufpreis();
                    BigDecimal copyKaufpreis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaufpreis", sourceKaufpreis), sourceKaufpreis, (this.kaufpreis!= null)));
                    copy.setKaufpreis(copyKaufpreis);
                } else {
                    if (kaufpreisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kaufpreis = null;
                    }
                }
            }
            {
                Boolean kaufpreisProQmShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaufpreisProQm!= null));
                if (kaufpreisProQmShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKaufpreisProQm;
                    sourceKaufpreisProQm = this.getKaufpreisProQm();
                    BigDecimal copyKaufpreisProQm = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaufpreisProQm", sourceKaufpreisProQm), sourceKaufpreisProQm, (this.kaufpreisProQm!= null)));
                    copy.setKaufpreisProQm(copyKaufpreisProQm);
                } else {
                    if (kaufpreisProQmShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kaufpreisProQm = null;
                    }
                }
            }
            {
                Boolean betriebskostenUmgelegtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.betriebskostenUmgelegt!= null));
                if (betriebskostenUmgelegtShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBetriebskostenUmgelegt;
                    sourceBetriebskostenUmgelegt = this.getBetriebskostenUmgelegt();
                    BigDecimal copyBetriebskostenUmgelegt = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "betriebskostenUmgelegt", sourceBetriebskostenUmgelegt), sourceBetriebskostenUmgelegt, (this.betriebskostenUmgelegt!= null)));
                    copy.setBetriebskostenUmgelegt(copyBetriebskostenUmgelegt);
                } else {
                    if (betriebskostenUmgelegtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.betriebskostenUmgelegt = null;
                    }
                }
            }
            {
                Boolean nichtUmgelegteKostenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nichtUmgelegteKosten!= null));
                if (nichtUmgelegteKostenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNichtUmgelegteKosten;
                    sourceNichtUmgelegteKosten = this.getNichtUmgelegteKosten();
                    BigDecimal copyNichtUmgelegteKosten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nichtUmgelegteKosten", sourceNichtUmgelegteKosten), sourceNichtUmgelegteKosten, (this.nichtUmgelegteKosten!= null)));
                    copy.setNichtUmgelegteKosten(copyNichtUmgelegteKosten);
                } else {
                    if (nichtUmgelegteKostenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nichtUmgelegteKosten = null;
                    }
                }
            }
            {
                Boolean preisProParkflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.preisProParkflaeche!= null));
                if (preisProParkflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourcePreisProParkflaeche;
                    sourcePreisProParkflaeche = this.getPreisProParkflaeche();
                    BigDecimal copyPreisProParkflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "preisProParkflaeche", sourcePreisProParkflaeche), sourcePreisProParkflaeche, (this.preisProParkflaeche!= null)));
                    copy.setPreisProParkflaeche(copyPreisProParkflaeche);
                } else {
                    if (preisProParkflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.preisProParkflaeche = null;
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
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AnlageObjektTyp();
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
        final AnlageObjektTyp that = ((AnlageObjektTyp) object);
        {
            AnlageobjekteKategorieTyp lhsObjektkategorie2;
            lhsObjektkategorie2 = this.getObjektkategorie2();
            AnlageobjekteKategorieTyp rhsObjektkategorie2;
            rhsObjektkategorie2 = that.getObjektkategorie2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie2", lhsObjektkategorie2), LocatorUtils.property(thatLocator, "objektkategorie2", rhsObjektkategorie2), lhsObjektkategorie2, rhsObjektkategorie2, (this.objektkategorie2 != null), (that.objektkategorie2 != null))) {
                return false;
            }
        }
        {
            BigDecimal lhsVermietbareFlaeche;
            lhsVermietbareFlaeche = this.getVermietbareFlaeche();
            BigDecimal rhsVermietbareFlaeche;
            rhsVermietbareFlaeche = that.getVermietbareFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermietbareFlaeche", lhsVermietbareFlaeche), LocatorUtils.property(thatLocator, "vermietbareFlaeche", rhsVermietbareFlaeche), lhsVermietbareFlaeche, rhsVermietbareFlaeche, (this.vermietbareFlaeche!= null), (that.vermietbareFlaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWohnFlaechen;
            lhsWohnFlaechen = this.getWohnFlaechen();
            BigDecimal rhsWohnFlaechen;
            rhsWohnFlaechen = that.getWohnFlaechen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnFlaechen", lhsWohnFlaechen), LocatorUtils.property(thatLocator, "wohnFlaechen", rhsWohnFlaechen), lhsWohnFlaechen, rhsWohnFlaechen, (this.wohnFlaechen!= null), (that.wohnFlaechen!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGewerbeFlaechen;
            lhsGewerbeFlaechen = this.getGewerbeFlaechen();
            BigDecimal rhsGewerbeFlaechen;
            rhsGewerbeFlaechen = that.getGewerbeFlaechen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewerbeFlaechen", lhsGewerbeFlaechen), LocatorUtils.property(thatLocator, "gewerbeFlaechen", rhsGewerbeFlaechen), lhsGewerbeFlaechen, rhsGewerbeFlaechen, (this.gewerbeFlaechen!= null), (that.gewerbeFlaechen!= null))) {
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
            BigDecimal lhsSonstigeFlaechen;
            lhsSonstigeFlaechen = this.getSonstigeFlaechen();
            BigDecimal rhsSonstigeFlaechen;
            rhsSonstigeFlaechen = that.getSonstigeFlaechen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstigeFlaechen", lhsSonstigeFlaechen), LocatorUtils.property(thatLocator, "sonstigeFlaechen", rhsSonstigeFlaechen), lhsSonstigeFlaechen, rhsSonstigeFlaechen, (this.sonstigeFlaechen!= null), (that.sonstigeFlaechen!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsXFacheMiete;
            lhsXFacheMiete = this.getXFacheMiete();
            BigDecimal rhsXFacheMiete;
            rhsXFacheMiete = that.getXFacheMiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xFacheMiete", lhsXFacheMiete), LocatorUtils.property(thatLocator, "xFacheMiete", rhsXFacheMiete), lhsXFacheMiete, rhsXFacheMiete, (this.xFacheMiete!= null), (that.xFacheMiete!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMietEinnahmePaIst;
            lhsMietEinnahmePaIst = this.getMietEinnahmePaIst();
            BigDecimal rhsMietEinnahmePaIst;
            rhsMietEinnahmePaIst = that.getMietEinnahmePaIst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietEinnahmePaIst", lhsMietEinnahmePaIst), LocatorUtils.property(thatLocator, "mietEinnahmePaIst", rhsMietEinnahmePaIst), lhsMietEinnahmePaIst, rhsMietEinnahmePaIst, (this.mietEinnahmePaIst!= null), (that.mietEinnahmePaIst!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMietEinnahmePaSoll;
            lhsMietEinnahmePaSoll = this.getMietEinnahmePaSoll();
            BigDecimal rhsMietEinnahmePaSoll;
            rhsMietEinnahmePaSoll = that.getMietEinnahmePaSoll();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mietEinnahmePaSoll", lhsMietEinnahmePaSoll), LocatorUtils.property(thatLocator, "mietEinnahmePaSoll", rhsMietEinnahmePaSoll), lhsMietEinnahmePaSoll, rhsMietEinnahmePaSoll, (this.mietEinnahmePaSoll!= null), (that.mietEinnahmePaSoll!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsKaufpreis;
            lhsKaufpreis = this.getKaufpreis();
            BigDecimal rhsKaufpreis;
            rhsKaufpreis = that.getKaufpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreis", lhsKaufpreis), LocatorUtils.property(thatLocator, "kaufpreis", rhsKaufpreis), lhsKaufpreis, rhsKaufpreis, (this.kaufpreis!= null), (that.kaufpreis!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsKaufpreisProQm;
            lhsKaufpreisProQm = this.getKaufpreisProQm();
            BigDecimal rhsKaufpreisProQm;
            rhsKaufpreisProQm = that.getKaufpreisProQm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreisProQm", lhsKaufpreisProQm), LocatorUtils.property(thatLocator, "kaufpreisProQm", rhsKaufpreisProQm), lhsKaufpreisProQm, rhsKaufpreisProQm, (this.kaufpreisProQm!= null), (that.kaufpreisProQm!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBetriebskostenUmgelegt;
            lhsBetriebskostenUmgelegt = this.getBetriebskostenUmgelegt();
            BigDecimal rhsBetriebskostenUmgelegt;
            rhsBetriebskostenUmgelegt = that.getBetriebskostenUmgelegt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betriebskostenUmgelegt", lhsBetriebskostenUmgelegt), LocatorUtils.property(thatLocator, "betriebskostenUmgelegt", rhsBetriebskostenUmgelegt), lhsBetriebskostenUmgelegt, rhsBetriebskostenUmgelegt, (this.betriebskostenUmgelegt!= null), (that.betriebskostenUmgelegt!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNichtUmgelegteKosten;
            lhsNichtUmgelegteKosten = this.getNichtUmgelegteKosten();
            BigDecimal rhsNichtUmgelegteKosten;
            rhsNichtUmgelegteKosten = that.getNichtUmgelegteKosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nichtUmgelegteKosten", lhsNichtUmgelegteKosten), LocatorUtils.property(thatLocator, "nichtUmgelegteKosten", rhsNichtUmgelegteKosten), lhsNichtUmgelegteKosten, rhsNichtUmgelegteKosten, (this.nichtUmgelegteKosten!= null), (that.nichtUmgelegteKosten!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPreisProParkflaeche;
            lhsPreisProParkflaeche = this.getPreisProParkflaeche();
            BigDecimal rhsPreisProParkflaeche;
            rhsPreisProParkflaeche = that.getPreisProParkflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisProParkflaeche", lhsPreisProParkflaeche), LocatorUtils.property(thatLocator, "preisProParkflaeche", rhsPreisProParkflaeche), lhsPreisProParkflaeche, rhsPreisProParkflaeche, (this.preisProParkflaeche!= null), (that.preisProParkflaeche!= null))) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
