
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;
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
 * <p>Java class for GarageTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GarageTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}ImmobilieBaseTyp"&gt;
 *       &lt;attribute name="ObjektKategorie2" type="{http://www.immobilienscout24.de/immobilientransfer}GaragenKategorieTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="Objektzustand" type="{http://www.immobilienscout24.de/immobilientransfer}ObjektZustandTyp" default="keineAngabe" /&gt;
 *       &lt;attribute name="Hoehe" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl42Typ" /&gt;
 *       &lt;attribute name="Laenge" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl52Typ" /&gt;
 *       &lt;attribute name="Breite" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl52Typ" /&gt;
 *       &lt;attribute name="Flaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="Baujahr" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl4Typ" /&gt;
 *       &lt;attribute name="JahrLetzteModernisierung" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl4Typ" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GarageTyp")
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.GarageMiete.Type.class,
    org.openestate.io.is24_xml.xml.GarageKauf.Type.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public class GarageTyp
    extends ImmobilieBaseTyp
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "ObjektKategorie2")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected GaragenKategorieTyp objektKategorie2;
    @XmlAttribute(name = "Objektzustand")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected ObjektZustandTyp objektzustand;
    @XmlAttribute(name = "Hoehe")
    @XmlJavaTypeAdapter(Adapter29 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal hoehe;
    @XmlAttribute(name = "Laenge")
    @XmlJavaTypeAdapter(Adapter30 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal laenge;
    @XmlAttribute(name = "Breite")
    @XmlJavaTypeAdapter(Adapter30 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal breite;
    @XmlAttribute(name = "Flaeche")
    @XmlJavaTypeAdapter(Adapter34 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected BigDecimal flaeche;
    @XmlAttribute(name = "Baujahr")
    @XmlJavaTypeAdapter(Adapter22 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Long baujahr;
    @XmlAttribute(name = "JahrLetzteModernisierung")
    @XmlJavaTypeAdapter(Adapter22 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected Long jahrLetzteModernisierung;

    /**
     * Gets the value of the objektKategorie2 property.
     * 
     * @return
     *     possible object is
     *     {@link GaragenKategorieTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public GaragenKategorieTyp getObjektKategorie2() {
        if (objektKategorie2 == null) {
            return GaragenKategorieTyp.KEINE_ANGABE;
        } else {
            return objektKategorie2;
        }
    }

    /**
     * Sets the value of the objektKategorie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GaragenKategorieTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setObjektKategorie2(GaragenKategorieTyp value) {
        this.objektKategorie2 = value;
    }

    /**
     * Gets the value of the objektzustand property.
     * 
     * @return
     *     possible object is
     *     {@link ObjektZustandTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public ObjektZustandTyp getObjektzustand() {
        if (objektzustand == null) {
            return ObjektZustandTyp.KEINE_ANGABE;
        } else {
            return objektzustand;
        }
    }

    /**
     * Sets the value of the objektzustand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjektZustandTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setObjektzustand(ObjektZustandTyp value) {
        this.objektzustand = value;
    }

    /**
     * Gets the value of the hoehe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getHoehe() {
        return hoehe;
    }

    /**
     * Sets the value of the hoehe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setHoehe(BigDecimal value) {
        this.hoehe = value;
    }

    /**
     * Gets the value of the laenge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getLaenge() {
        return laenge;
    }

    /**
     * Sets the value of the laenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setLaenge(BigDecimal value) {
        this.laenge = value;
    }

    /**
     * Gets the value of the breite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getBreite() {
        return breite;
    }

    /**
     * Sets the value of the breite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setBreite(BigDecimal value) {
        this.breite = value;
    }

    /**
     * Gets the value of the flaeche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public BigDecimal getFlaeche() {
        return flaeche;
    }

    /**
     * Sets the value of the flaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setFlaeche(BigDecimal value) {
        this.flaeche = value;
    }

    /**
     * Gets the value of the baujahr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Long getBaujahr() {
        return baujahr;
    }

    /**
     * Sets the value of the baujahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setBaujahr(Long value) {
        this.baujahr = value;
    }

    /**
     * Gets the value of the jahrLetzteModernisierung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Long getJahrLetzteModernisierung() {
        return jahrLetzteModernisierung;
    }

    /**
     * Sets the value of the jahrLetzteModernisierung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setJahrLetzteModernisierung(Long value) {
        this.jahrLetzteModernisierung = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            GaragenKategorieTyp theObjektKategorie2;
            theObjektKategorie2 = this.getObjektKategorie2();
            strategy.appendField(locator, this, "objektKategorie2", buffer, theObjektKategorie2, (this.objektKategorie2 != null));
        }
        {
            ObjektZustandTyp theObjektzustand;
            theObjektzustand = this.getObjektzustand();
            strategy.appendField(locator, this, "objektzustand", buffer, theObjektzustand, (this.objektzustand!= null));
        }
        {
            BigDecimal theHoehe;
            theHoehe = this.getHoehe();
            strategy.appendField(locator, this, "hoehe", buffer, theHoehe, (this.hoehe!= null));
        }
        {
            BigDecimal theLaenge;
            theLaenge = this.getLaenge();
            strategy.appendField(locator, this, "laenge", buffer, theLaenge, (this.laenge!= null));
        }
        {
            BigDecimal theBreite;
            theBreite = this.getBreite();
            strategy.appendField(locator, this, "breite", buffer, theBreite, (this.breite!= null));
        }
        {
            BigDecimal theFlaeche;
            theFlaeche = this.getFlaeche();
            strategy.appendField(locator, this, "flaeche", buffer, theFlaeche, (this.flaeche!= null));
        }
        {
            Long theBaujahr;
            theBaujahr = this.getBaujahr();
            strategy.appendField(locator, this, "baujahr", buffer, theBaujahr, (this.baujahr!= null));
        }
        {
            Long theJahrLetzteModernisierung;
            theJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
            strategy.appendField(locator, this, "jahrLetzteModernisierung", buffer, theJahrLetzteModernisierung, (this.jahrLetzteModernisierung!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof GarageTyp) {
            final GarageTyp copy = ((GarageTyp) draftCopy);
            {
                Boolean objektKategorie2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektKategorie2 != null));
                if (objektKategorie2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    GaragenKategorieTyp sourceObjektKategorie2;
                    sourceObjektKategorie2 = this.getObjektKategorie2();
                    GaragenKategorieTyp copyObjektKategorie2 = ((GaragenKategorieTyp) strategy.copy(LocatorUtils.property(locator, "objektKategorie2", sourceObjektKategorie2), sourceObjektKategorie2, (this.objektKategorie2 != null)));
                    copy.setObjektKategorie2(copyObjektKategorie2);
                } else {
                    if (objektKategorie2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektKategorie2 = null;
                    }
                }
            }
            {
                Boolean objektzustandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektzustand!= null));
                if (objektzustandShouldBeCopiedAndSet == Boolean.TRUE) {
                    ObjektZustandTyp sourceObjektzustand;
                    sourceObjektzustand = this.getObjektzustand();
                    ObjektZustandTyp copyObjektzustand = ((ObjektZustandTyp) strategy.copy(LocatorUtils.property(locator, "objektzustand", sourceObjektzustand), sourceObjektzustand, (this.objektzustand!= null)));
                    copy.setObjektzustand(copyObjektzustand);
                } else {
                    if (objektzustandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektzustand = null;
                    }
                }
            }
            {
                Boolean hoeheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hoehe!= null));
                if (hoeheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHoehe;
                    sourceHoehe = this.getHoehe();
                    BigDecimal copyHoehe = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "hoehe", sourceHoehe), sourceHoehe, (this.hoehe!= null)));
                    copy.setHoehe(copyHoehe);
                } else {
                    if (hoeheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hoehe = null;
                    }
                }
            }
            {
                Boolean laengeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.laenge!= null));
                if (laengeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLaenge;
                    sourceLaenge = this.getLaenge();
                    BigDecimal copyLaenge = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "laenge", sourceLaenge), sourceLaenge, (this.laenge!= null)));
                    copy.setLaenge(copyLaenge);
                } else {
                    if (laengeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.laenge = null;
                    }
                }
            }
            {
                Boolean breiteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.breite!= null));
                if (breiteShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBreite;
                    sourceBreite = this.getBreite();
                    BigDecimal copyBreite = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "breite", sourceBreite), sourceBreite, (this.breite!= null)));
                    copy.setBreite(copyBreite);
                } else {
                    if (breiteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.breite = null;
                    }
                }
            }
            {
                Boolean flaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flaeche!= null));
                if (flaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceFlaeche;
                    sourceFlaeche = this.getFlaeche();
                    BigDecimal copyFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "flaeche", sourceFlaeche), sourceFlaeche, (this.flaeche!= null)));
                    copy.setFlaeche(copyFlaeche);
                } else {
                    if (flaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flaeche = null;
                    }
                }
            }
            {
                Boolean baujahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.baujahr!= null));
                if (baujahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceBaujahr;
                    sourceBaujahr = this.getBaujahr();
                    Long copyBaujahr = ((Long) strategy.copy(LocatorUtils.property(locator, "baujahr", sourceBaujahr), sourceBaujahr, (this.baujahr!= null)));
                    copy.setBaujahr(copyBaujahr);
                } else {
                    if (baujahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.baujahr = null;
                    }
                }
            }
            {
                Boolean jahrLetzteModernisierungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.jahrLetzteModernisierung!= null));
                if (jahrLetzteModernisierungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceJahrLetzteModernisierung;
                    sourceJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
                    Long copyJahrLetzteModernisierung = ((Long) strategy.copy(LocatorUtils.property(locator, "jahrLetzteModernisierung", sourceJahrLetzteModernisierung), sourceJahrLetzteModernisierung, (this.jahrLetzteModernisierung!= null)));
                    copy.setJahrLetzteModernisierung(copyJahrLetzteModernisierung);
                } else {
                    if (jahrLetzteModernisierungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.jahrLetzteModernisierung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new GarageTyp();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
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
        final GarageTyp that = ((GarageTyp) object);
        {
            GaragenKategorieTyp lhsObjektKategorie2;
            lhsObjektKategorie2 = this.getObjektKategorie2();
            GaragenKategorieTyp rhsObjektKategorie2;
            rhsObjektKategorie2 = that.getObjektKategorie2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektKategorie2", lhsObjektKategorie2), LocatorUtils.property(thatLocator, "objektKategorie2", rhsObjektKategorie2), lhsObjektKategorie2, rhsObjektKategorie2, (this.objektKategorie2 != null), (that.objektKategorie2 != null))) {
                return false;
            }
        }
        {
            ObjektZustandTyp lhsObjektzustand;
            lhsObjektzustand = this.getObjektzustand();
            ObjektZustandTyp rhsObjektzustand;
            rhsObjektzustand = that.getObjektzustand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektzustand", lhsObjektzustand), LocatorUtils.property(thatLocator, "objektzustand", rhsObjektzustand), lhsObjektzustand, rhsObjektzustand, (this.objektzustand!= null), (that.objektzustand!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHoehe;
            lhsHoehe = this.getHoehe();
            BigDecimal rhsHoehe;
            rhsHoehe = that.getHoehe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hoehe", lhsHoehe), LocatorUtils.property(thatLocator, "hoehe", rhsHoehe), lhsHoehe, rhsHoehe, (this.hoehe!= null), (that.hoehe!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLaenge;
            lhsLaenge = this.getLaenge();
            BigDecimal rhsLaenge;
            rhsLaenge = that.getLaenge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "laenge", lhsLaenge), LocatorUtils.property(thatLocator, "laenge", rhsLaenge), lhsLaenge, rhsLaenge, (this.laenge!= null), (that.laenge!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBreite;
            lhsBreite = this.getBreite();
            BigDecimal rhsBreite;
            rhsBreite = that.getBreite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "breite", lhsBreite), LocatorUtils.property(thatLocator, "breite", rhsBreite), lhsBreite, rhsBreite, (this.breite!= null), (that.breite!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsFlaeche;
            lhsFlaeche = this.getFlaeche();
            BigDecimal rhsFlaeche;
            rhsFlaeche = that.getFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flaeche", lhsFlaeche), LocatorUtils.property(thatLocator, "flaeche", rhsFlaeche), lhsFlaeche, rhsFlaeche, (this.flaeche!= null), (that.flaeche!= null))) {
                return false;
            }
        }
        {
            Long lhsBaujahr;
            lhsBaujahr = this.getBaujahr();
            Long rhsBaujahr;
            rhsBaujahr = that.getBaujahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baujahr", lhsBaujahr), LocatorUtils.property(thatLocator, "baujahr", rhsBaujahr), lhsBaujahr, rhsBaujahr, (this.baujahr!= null), (that.baujahr!= null))) {
                return false;
            }
        }
        {
            Long lhsJahrLetzteModernisierung;
            lhsJahrLetzteModernisierung = this.getJahrLetzteModernisierung();
            Long rhsJahrLetzteModernisierung;
            rhsJahrLetzteModernisierung = that.getJahrLetzteModernisierung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jahrLetzteModernisierung", lhsJahrLetzteModernisierung), LocatorUtils.property(thatLocator, "jahrLetzteModernisierung", rhsJahrLetzteModernisierung), lhsJahrLetzteModernisierung, rhsJahrLetzteModernisierung, (this.jahrLetzteModernisierung!= null), (that.jahrLetzteModernisierung!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
