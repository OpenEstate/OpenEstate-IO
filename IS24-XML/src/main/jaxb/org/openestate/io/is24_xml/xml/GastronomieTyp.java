
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;
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
 * <p>Java class for GastronomieTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GastronomieTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}GewerbeImmoBaseTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vermarktung" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungGewerbeTyp2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="GastraumFlaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="GastraumPlaetze" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl5Typ" /&gt;
 *       &lt;attribute name="AnzahlBetten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl5Typ" /&gt;
 *       &lt;attribute name="Gastterrasse" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Denkmalschutzobjekt" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Keller" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Objektkategorie2" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}GastroKategorieTyp" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GastronomieTyp", propOrder = {
    "vermarktung"
})
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.Gastronomie.Type.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
public class GastronomieTyp
    extends GewerbeImmoBaseTyp
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "Vermarktung", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected VermarktungGewerbeTyp2 vermarktung;
    @XmlAttribute(name = "GastraumFlaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal gastraumFlaeche;
    @XmlAttribute(name = "GastraumPlaetze")
    @XmlJavaTypeAdapter(Adapter23 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Long gastraumPlaetze;
    @XmlAttribute(name = "AnzahlBetten")
    @XmlJavaTypeAdapter(Adapter23 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Long anzahlBetten;
    @XmlAttribute(name = "Gastterrasse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean gastterrasse;
    @XmlAttribute(name = "Denkmalschutzobjekt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean denkmalschutzobjekt;
    @XmlAttribute(name = "Keller")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean keller;
    @XmlAttribute(name = "Objektkategorie2", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected GastroKategorieTyp objektkategorie2;

    /**
     * Gets the value of the vermarktung property.
     * 
     * @return
     *     possible object is
     *     {@link VermarktungGewerbeTyp2 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public VermarktungGewerbeTyp2 getVermarktung() {
        return vermarktung;
    }

    /**
     * Sets the value of the vermarktung property.
     * 
     * @param value
     *     allowed object is
     *     {@link VermarktungGewerbeTyp2 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setVermarktung(VermarktungGewerbeTyp2 value) {
        this.vermarktung = value;
    }

    /**
     * Gets the value of the gastraumFlaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getGastraumFlaeche() {
        return gastraumFlaeche;
    }

    /**
     * Sets the value of the gastraumFlaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setGastraumFlaeche(BigDecimal value) {
        this.gastraumFlaeche = value;
    }

    /**
     * Gets the value of the gastraumPlaetze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Long getGastraumPlaetze() {
        return gastraumPlaetze;
    }

    /**
     * Sets the value of the gastraumPlaetze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setGastraumPlaetze(Long value) {
        this.gastraumPlaetze = value;
    }

    /**
     * Gets the value of the anzahlBetten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Long getAnzahlBetten() {
        return anzahlBetten;
    }

    /**
     * Sets the value of the anzahlBetten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setAnzahlBetten(Long value) {
        this.anzahlBetten = value;
    }

    /**
     * Gets the value of the gastterrasse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getGastterrasse() {
        return gastterrasse;
    }

    /**
     * Sets the value of the gastterrasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setGastterrasse(Boolean value) {
        this.gastterrasse = value;
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

    /**
     * Gets the value of the objektkategorie2 property.
     * 
     * @return
     *     possible object is
     *     {@link GastroKategorieTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public GastroKategorieTyp getObjektkategorie2() {
        return objektkategorie2;
    }

    /**
     * Sets the value of the objektkategorie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GastroKategorieTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setObjektkategorie2(GastroKategorieTyp value) {
        this.objektkategorie2 = value;
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
            VermarktungGewerbeTyp2 theVermarktung;
            theVermarktung = this.getVermarktung();
            strategy.appendField(locator, this, "vermarktung", buffer, theVermarktung, (this.vermarktung!= null));
        }
        {
            BigDecimal theGastraumFlaeche;
            theGastraumFlaeche = this.getGastraumFlaeche();
            strategy.appendField(locator, this, "gastraumFlaeche", buffer, theGastraumFlaeche, (this.gastraumFlaeche!= null));
        }
        {
            Long theGastraumPlaetze;
            theGastraumPlaetze = this.getGastraumPlaetze();
            strategy.appendField(locator, this, "gastraumPlaetze", buffer, theGastraumPlaetze, (this.gastraumPlaetze!= null));
        }
        {
            Long theAnzahlBetten;
            theAnzahlBetten = this.getAnzahlBetten();
            strategy.appendField(locator, this, "anzahlBetten", buffer, theAnzahlBetten, (this.anzahlBetten!= null));
        }
        {
            Boolean theGastterrasse;
            theGastterrasse = this.getGastterrasse();
            strategy.appendField(locator, this, "gastterrasse", buffer, theGastterrasse, (this.gastterrasse!= null));
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
        {
            GastroKategorieTyp theObjektkategorie2;
            theObjektkategorie2 = this.getObjektkategorie2();
            strategy.appendField(locator, this, "objektkategorie2", buffer, theObjektkategorie2, (this.objektkategorie2 != null));
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
        if (draftCopy instanceof GastronomieTyp) {
            final GastronomieTyp copy = ((GastronomieTyp) draftCopy);
            {
                Boolean vermarktungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermarktung!= null));
                if (vermarktungShouldBeCopiedAndSet == Boolean.TRUE) {
                    VermarktungGewerbeTyp2 sourceVermarktung;
                    sourceVermarktung = this.getVermarktung();
                    VermarktungGewerbeTyp2 copyVermarktung = ((VermarktungGewerbeTyp2) strategy.copy(LocatorUtils.property(locator, "vermarktung", sourceVermarktung), sourceVermarktung, (this.vermarktung!= null)));
                    copy.setVermarktung(copyVermarktung);
                } else {
                    if (vermarktungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermarktung = null;
                    }
                }
            }
            {
                Boolean gastraumFlaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gastraumFlaeche!= null));
                if (gastraumFlaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGastraumFlaeche;
                    sourceGastraumFlaeche = this.getGastraumFlaeche();
                    BigDecimal copyGastraumFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gastraumFlaeche", sourceGastraumFlaeche), sourceGastraumFlaeche, (this.gastraumFlaeche!= null)));
                    copy.setGastraumFlaeche(copyGastraumFlaeche);
                } else {
                    if (gastraumFlaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gastraumFlaeche = null;
                    }
                }
            }
            {
                Boolean gastraumPlaetzeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gastraumPlaetze!= null));
                if (gastraumPlaetzeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceGastraumPlaetze;
                    sourceGastraumPlaetze = this.getGastraumPlaetze();
                    Long copyGastraumPlaetze = ((Long) strategy.copy(LocatorUtils.property(locator, "gastraumPlaetze", sourceGastraumPlaetze), sourceGastraumPlaetze, (this.gastraumPlaetze!= null)));
                    copy.setGastraumPlaetze(copyGastraumPlaetze);
                } else {
                    if (gastraumPlaetzeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gastraumPlaetze = null;
                    }
                }
            }
            {
                Boolean anzahlBettenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlBetten!= null));
                if (anzahlBettenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAnzahlBetten;
                    sourceAnzahlBetten = this.getAnzahlBetten();
                    Long copyAnzahlBetten = ((Long) strategy.copy(LocatorUtils.property(locator, "anzahlBetten", sourceAnzahlBetten), sourceAnzahlBetten, (this.anzahlBetten!= null)));
                    copy.setAnzahlBetten(copyAnzahlBetten);
                } else {
                    if (anzahlBettenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlBetten = null;
                    }
                }
            }
            {
                Boolean gastterrasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gastterrasse!= null));
                if (gastterrasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGastterrasse;
                    sourceGastterrasse = this.getGastterrasse();
                    Boolean copyGastterrasse = ((Boolean) strategy.copy(LocatorUtils.property(locator, "gastterrasse", sourceGastterrasse), sourceGastterrasse, (this.gastterrasse!= null)));
                    copy.setGastterrasse(copyGastterrasse);
                } else {
                    if (gastterrasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gastterrasse = null;
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
            {
                Boolean objektkategorie2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektkategorie2 != null));
                if (objektkategorie2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    GastroKategorieTyp sourceObjektkategorie2;
                    sourceObjektkategorie2 = this.getObjektkategorie2();
                    GastroKategorieTyp copyObjektkategorie2 = ((GastroKategorieTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2, (this.objektkategorie2 != null)));
                    copy.setObjektkategorie2(copyObjektkategorie2);
                } else {
                    if (objektkategorie2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektkategorie2 = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new GastronomieTyp();
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
        final GastronomieTyp that = ((GastronomieTyp) object);
        {
            VermarktungGewerbeTyp2 lhsVermarktung;
            lhsVermarktung = this.getVermarktung();
            VermarktungGewerbeTyp2 rhsVermarktung;
            rhsVermarktung = that.getVermarktung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermarktung", lhsVermarktung), LocatorUtils.property(thatLocator, "vermarktung", rhsVermarktung), lhsVermarktung, rhsVermarktung, (this.vermarktung!= null), (that.vermarktung!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGastraumFlaeche;
            lhsGastraumFlaeche = this.getGastraumFlaeche();
            BigDecimal rhsGastraumFlaeche;
            rhsGastraumFlaeche = that.getGastraumFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastraumFlaeche", lhsGastraumFlaeche), LocatorUtils.property(thatLocator, "gastraumFlaeche", rhsGastraumFlaeche), lhsGastraumFlaeche, rhsGastraumFlaeche, (this.gastraumFlaeche!= null), (that.gastraumFlaeche!= null))) {
                return false;
            }
        }
        {
            Long lhsGastraumPlaetze;
            lhsGastraumPlaetze = this.getGastraumPlaetze();
            Long rhsGastraumPlaetze;
            rhsGastraumPlaetze = that.getGastraumPlaetze();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastraumPlaetze", lhsGastraumPlaetze), LocatorUtils.property(thatLocator, "gastraumPlaetze", rhsGastraumPlaetze), lhsGastraumPlaetze, rhsGastraumPlaetze, (this.gastraumPlaetze!= null), (that.gastraumPlaetze!= null))) {
                return false;
            }
        }
        {
            Long lhsAnzahlBetten;
            lhsAnzahlBetten = this.getAnzahlBetten();
            Long rhsAnzahlBetten;
            rhsAnzahlBetten = that.getAnzahlBetten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBetten", lhsAnzahlBetten), LocatorUtils.property(thatLocator, "anzahlBetten", rhsAnzahlBetten), lhsAnzahlBetten, rhsAnzahlBetten, (this.anzahlBetten!= null), (that.anzahlBetten!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGastterrasse;
            lhsGastterrasse = this.getGastterrasse();
            Boolean rhsGastterrasse;
            rhsGastterrasse = that.getGastterrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastterrasse", lhsGastterrasse), LocatorUtils.property(thatLocator, "gastterrasse", rhsGastterrasse), lhsGastterrasse, rhsGastterrasse, (this.gastterrasse!= null), (that.gastterrasse!= null))) {
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
        {
            GastroKategorieTyp lhsObjektkategorie2;
            lhsObjektkategorie2 = this.getObjektkategorie2();
            GastroKategorieTyp rhsObjektkategorie2;
            rhsObjektkategorie2 = that.getObjektkategorie2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie2", lhsObjektkategorie2), LocatorUtils.property(thatLocator, "objektkategorie2", rhsObjektkategorie2), lhsObjektkategorie2, rhsObjektkategorie2, (this.objektkategorie2 != null), (that.objektkategorie2 != null))) {
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
