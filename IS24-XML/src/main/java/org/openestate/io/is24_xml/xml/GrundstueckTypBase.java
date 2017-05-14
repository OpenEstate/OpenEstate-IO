
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
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
 * Basisklasse fuer alle Grundstueckstypen
 * 
 * <p>Java class for GrundstueckTypBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrundstueckTypBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}ImmobilieBaseTyp"&gt;
 *       &lt;attribute name="GrundstuecksFlaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" /&gt;
 *       &lt;attribute name="TeilbarAb" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl8Typ" /&gt;
 *       &lt;attribute name="BebaubarNach" type="{http://www.immobilienscout24.de/immobilientransfer}BebaubarNachTyp" /&gt;
 *       &lt;attribute name="BaugenehmigungVorhanden" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AbrissErforderlich" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GRZ" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl32Typ" /&gt;
 *       &lt;attribute name="GFZ" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl32Typ" /&gt;
 *       &lt;attribute name="Erschliessungszustand" type="{http://www.immobilienscout24.de/immobilientransfer}ErschliessungszustandTyp" /&gt;
 *       &lt;attribute name="KurzfristigBebaubar" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FreiAb" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrundstueckTypBase")
@XmlSeeAlso({
    Grundstueck.class,
    org.openestate.io.is24_xml.xml.GrundstueckWohnenKauf.Type.class,
    org.openestate.io.is24_xml.xml.GrundstueckWohnenMiete.Type.class,
    org.openestate.io.is24_xml.xml.GrundstueckGewerbe.Type.class
})
public abstract class GrundstueckTypBase
    extends ImmobilieBaseTyp
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "GrundstuecksFlaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    protected BigDecimal grundstuecksFlaeche;
    @XmlAttribute(name = "TeilbarAb")
    @XmlJavaTypeAdapter(Adapter24 .class)
    protected Long teilbarAb;
    @XmlAttribute(name = "BebaubarNach")
    protected BebaubarNachTyp bebaubarNach;
    @XmlAttribute(name = "BaugenehmigungVorhanden")
    protected Boolean baugenehmigungVorhanden;
    @XmlAttribute(name = "AbrissErforderlich")
    protected Boolean abrissErforderlich;
    @XmlAttribute(name = "GRZ")
    @XmlJavaTypeAdapter(Adapter28 .class)
    protected BigDecimal grz;
    @XmlAttribute(name = "GFZ")
    @XmlJavaTypeAdapter(Adapter28 .class)
    protected BigDecimal gfz;
    @XmlAttribute(name = "Erschliessungszustand")
    protected ErschliessungszustandTyp erschliessungszustand;
    @XmlAttribute(name = "KurzfristigBebaubar")
    protected Boolean kurzfristigBebaubar;
    @XmlAttribute(name = "FreiAb")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected String freiAb;

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
     * Gets the value of the teilbarAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTeilbarAb() {
        return teilbarAb;
    }

    /**
     * Sets the value of the teilbarAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeilbarAb(Long value) {
        this.teilbarAb = value;
    }

    /**
     * Gets the value of the bebaubarNach property.
     * 
     * @return
     *     possible object is
     *     {@link BebaubarNachTyp }
     *     
     */
    public BebaubarNachTyp getBebaubarNach() {
        return bebaubarNach;
    }

    /**
     * Sets the value of the bebaubarNach property.
     * 
     * @param value
     *     allowed object is
     *     {@link BebaubarNachTyp }
     *     
     */
    public void setBebaubarNach(BebaubarNachTyp value) {
        this.bebaubarNach = value;
    }

    /**
     * Gets the value of the baugenehmigungVorhanden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBaugenehmigungVorhanden() {
        return baugenehmigungVorhanden;
    }

    /**
     * Sets the value of the baugenehmigungVorhanden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaugenehmigungVorhanden(Boolean value) {
        this.baugenehmigungVorhanden = value;
    }

    /**
     * Gets the value of the abrissErforderlich property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbrissErforderlich() {
        return abrissErforderlich;
    }

    /**
     * Sets the value of the abrissErforderlich property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbrissErforderlich(Boolean value) {
        this.abrissErforderlich = value;
    }

    /**
     * Gets the value of the grz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getGRZ() {
        return grz;
    }

    /**
     * Sets the value of the grz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRZ(BigDecimal value) {
        this.grz = value;
    }

    /**
     * Gets the value of the gfz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getGFZ() {
        return gfz;
    }

    /**
     * Sets the value of the gfz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGFZ(BigDecimal value) {
        this.gfz = value;
    }

    /**
     * Gets the value of the erschliessungszustand property.
     * 
     * @return
     *     possible object is
     *     {@link ErschliessungszustandTyp }
     *     
     */
    public ErschliessungszustandTyp getErschliessungszustand() {
        return erschliessungszustand;
    }

    /**
     * Sets the value of the erschliessungszustand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErschliessungszustandTyp }
     *     
     */
    public void setErschliessungszustand(ErschliessungszustandTyp value) {
        this.erschliessungszustand = value;
    }

    /**
     * Gets the value of the kurzfristigBebaubar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKurzfristigBebaubar() {
        return kurzfristigBebaubar;
    }

    /**
     * Sets the value of the kurzfristigBebaubar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKurzfristigBebaubar(Boolean value) {
        this.kurzfristigBebaubar = value;
    }

    /**
     * Gets the value of the freiAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreiAb() {
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
    public void setFreiAb(String value) {
        this.freiAb = value;
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
            BigDecimal theGrundstuecksFlaeche;
            theGrundstuecksFlaeche = this.getGrundstuecksFlaeche();
            strategy.appendField(locator, this, "grundstuecksFlaeche", buffer, theGrundstuecksFlaeche, (this.grundstuecksFlaeche!= null));
        }
        {
            Long theTeilbarAb;
            theTeilbarAb = this.getTeilbarAb();
            strategy.appendField(locator, this, "teilbarAb", buffer, theTeilbarAb, (this.teilbarAb!= null));
        }
        {
            BebaubarNachTyp theBebaubarNach;
            theBebaubarNach = this.getBebaubarNach();
            strategy.appendField(locator, this, "bebaubarNach", buffer, theBebaubarNach, (this.bebaubarNach!= null));
        }
        {
            Boolean theBaugenehmigungVorhanden;
            theBaugenehmigungVorhanden = this.isBaugenehmigungVorhanden();
            strategy.appendField(locator, this, "baugenehmigungVorhanden", buffer, theBaugenehmigungVorhanden, (this.baugenehmigungVorhanden!= null));
        }
        {
            Boolean theAbrissErforderlich;
            theAbrissErforderlich = this.isAbrissErforderlich();
            strategy.appendField(locator, this, "abrissErforderlich", buffer, theAbrissErforderlich, (this.abrissErforderlich!= null));
        }
        {
            BigDecimal theGRZ;
            theGRZ = this.getGRZ();
            strategy.appendField(locator, this, "grz", buffer, theGRZ, (this.grz!= null));
        }
        {
            BigDecimal theGFZ;
            theGFZ = this.getGFZ();
            strategy.appendField(locator, this, "gfz", buffer, theGFZ, (this.gfz!= null));
        }
        {
            ErschliessungszustandTyp theErschliessungszustand;
            theErschliessungszustand = this.getErschliessungszustand();
            strategy.appendField(locator, this, "erschliessungszustand", buffer, theErschliessungszustand, (this.erschliessungszustand!= null));
        }
        {
            Boolean theKurzfristigBebaubar;
            theKurzfristigBebaubar = this.isKurzfristigBebaubar();
            strategy.appendField(locator, this, "kurzfristigBebaubar", buffer, theKurzfristigBebaubar, (this.kurzfristigBebaubar!= null));
        }
        {
            String theFreiAb;
            theFreiAb = this.getFreiAb();
            strategy.appendField(locator, this, "freiAb", buffer, theFreiAb, (this.freiAb!= null));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof GrundstueckTypBase) {
            final GrundstueckTypBase copy = ((GrundstueckTypBase) target);
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
                Boolean teilbarAbShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.teilbarAb!= null));
                if (teilbarAbShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTeilbarAb;
                    sourceTeilbarAb = this.getTeilbarAb();
                    Long copyTeilbarAb = ((Long) strategy.copy(LocatorUtils.property(locator, "teilbarAb", sourceTeilbarAb), sourceTeilbarAb, (this.teilbarAb!= null)));
                    copy.setTeilbarAb(copyTeilbarAb);
                } else {
                    if (teilbarAbShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.teilbarAb = null;
                    }
                }
            }
            {
                Boolean bebaubarNachShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bebaubarNach!= null));
                if (bebaubarNachShouldBeCopiedAndSet == Boolean.TRUE) {
                    BebaubarNachTyp sourceBebaubarNach;
                    sourceBebaubarNach = this.getBebaubarNach();
                    BebaubarNachTyp copyBebaubarNach = ((BebaubarNachTyp) strategy.copy(LocatorUtils.property(locator, "bebaubarNach", sourceBebaubarNach), sourceBebaubarNach, (this.bebaubarNach!= null)));
                    copy.setBebaubarNach(copyBebaubarNach);
                } else {
                    if (bebaubarNachShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bebaubarNach = null;
                    }
                }
            }
            {
                Boolean baugenehmigungVorhandenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.baugenehmigungVorhanden!= null));
                if (baugenehmigungVorhandenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBaugenehmigungVorhanden;
                    sourceBaugenehmigungVorhanden = this.isBaugenehmigungVorhanden();
                    Boolean copyBaugenehmigungVorhanden = ((Boolean) strategy.copy(LocatorUtils.property(locator, "baugenehmigungVorhanden", sourceBaugenehmigungVorhanden), sourceBaugenehmigungVorhanden, (this.baugenehmigungVorhanden!= null)));
                    copy.setBaugenehmigungVorhanden(copyBaugenehmigungVorhanden);
                } else {
                    if (baugenehmigungVorhandenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.baugenehmigungVorhanden = null;
                    }
                }
            }
            {
                Boolean abrissErforderlichShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abrissErforderlich!= null));
                if (abrissErforderlichShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAbrissErforderlich;
                    sourceAbrissErforderlich = this.isAbrissErforderlich();
                    Boolean copyAbrissErforderlich = ((Boolean) strategy.copy(LocatorUtils.property(locator, "abrissErforderlich", sourceAbrissErforderlich), sourceAbrissErforderlich, (this.abrissErforderlich!= null)));
                    copy.setAbrissErforderlich(copyAbrissErforderlich);
                } else {
                    if (abrissErforderlichShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abrissErforderlich = null;
                    }
                }
            }
            {
                Boolean grzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.grz!= null));
                if (grzShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGRZ;
                    sourceGRZ = this.getGRZ();
                    BigDecimal copyGRZ = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "grz", sourceGRZ), sourceGRZ, (this.grz!= null)));
                    copy.setGRZ(copyGRZ);
                } else {
                    if (grzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.grz = null;
                    }
                }
            }
            {
                Boolean gfzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gfz!= null));
                if (gfzShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGFZ;
                    sourceGFZ = this.getGFZ();
                    BigDecimal copyGFZ = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gfz", sourceGFZ), sourceGFZ, (this.gfz!= null)));
                    copy.setGFZ(copyGFZ);
                } else {
                    if (gfzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gfz = null;
                    }
                }
            }
            {
                Boolean erschliessungszustandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erschliessungszustand!= null));
                if (erschliessungszustandShouldBeCopiedAndSet == Boolean.TRUE) {
                    ErschliessungszustandTyp sourceErschliessungszustand;
                    sourceErschliessungszustand = this.getErschliessungszustand();
                    ErschliessungszustandTyp copyErschliessungszustand = ((ErschliessungszustandTyp) strategy.copy(LocatorUtils.property(locator, "erschliessungszustand", sourceErschliessungszustand), sourceErschliessungszustand, (this.erschliessungszustand!= null)));
                    copy.setErschliessungszustand(copyErschliessungszustand);
                } else {
                    if (erschliessungszustandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erschliessungszustand = null;
                    }
                }
            }
            {
                Boolean kurzfristigBebaubarShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kurzfristigBebaubar!= null));
                if (kurzfristigBebaubarShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKurzfristigBebaubar;
                    sourceKurzfristigBebaubar = this.isKurzfristigBebaubar();
                    Boolean copyKurzfristigBebaubar = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kurzfristigBebaubar", sourceKurzfristigBebaubar), sourceKurzfristigBebaubar, (this.kurzfristigBebaubar!= null)));
                    copy.setKurzfristigBebaubar(copyKurzfristigBebaubar);
                } else {
                    if (kurzfristigBebaubarShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kurzfristigBebaubar = null;
                    }
                }
            }
            {
                Boolean freiAbShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freiAb!= null));
                if (freiAbShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFreiAb;
                    sourceFreiAb = this.getFreiAb();
                    String copyFreiAb = ((String) strategy.copy(LocatorUtils.property(locator, "freiAb", sourceFreiAb), sourceFreiAb, (this.freiAb!= null)));
                    copy.setFreiAb(copyFreiAb);
                } else {
                    if (freiAbShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freiAb = null;
                    }
                }
            }
        }
        return target;
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
        final GrundstueckTypBase that = ((GrundstueckTypBase) object);
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
            Long lhsTeilbarAb;
            lhsTeilbarAb = this.getTeilbarAb();
            Long rhsTeilbarAb;
            rhsTeilbarAb = that.getTeilbarAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teilbarAb", lhsTeilbarAb), LocatorUtils.property(thatLocator, "teilbarAb", rhsTeilbarAb), lhsTeilbarAb, rhsTeilbarAb, (this.teilbarAb!= null), (that.teilbarAb!= null))) {
                return false;
            }
        }
        {
            BebaubarNachTyp lhsBebaubarNach;
            lhsBebaubarNach = this.getBebaubarNach();
            BebaubarNachTyp rhsBebaubarNach;
            rhsBebaubarNach = that.getBebaubarNach();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bebaubarNach", lhsBebaubarNach), LocatorUtils.property(thatLocator, "bebaubarNach", rhsBebaubarNach), lhsBebaubarNach, rhsBebaubarNach, (this.bebaubarNach!= null), (that.bebaubarNach!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBaugenehmigungVorhanden;
            lhsBaugenehmigungVorhanden = this.isBaugenehmigungVorhanden();
            Boolean rhsBaugenehmigungVorhanden;
            rhsBaugenehmigungVorhanden = that.isBaugenehmigungVorhanden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baugenehmigungVorhanden", lhsBaugenehmigungVorhanden), LocatorUtils.property(thatLocator, "baugenehmigungVorhanden", rhsBaugenehmigungVorhanden), lhsBaugenehmigungVorhanden, rhsBaugenehmigungVorhanden, (this.baugenehmigungVorhanden!= null), (that.baugenehmigungVorhanden!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAbrissErforderlich;
            lhsAbrissErforderlich = this.isAbrissErforderlich();
            Boolean rhsAbrissErforderlich;
            rhsAbrissErforderlich = that.isAbrissErforderlich();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abrissErforderlich", lhsAbrissErforderlich), LocatorUtils.property(thatLocator, "abrissErforderlich", rhsAbrissErforderlich), lhsAbrissErforderlich, rhsAbrissErforderlich, (this.abrissErforderlich!= null), (that.abrissErforderlich!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGRZ;
            lhsGRZ = this.getGRZ();
            BigDecimal rhsGRZ;
            rhsGRZ = that.getGRZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grz", lhsGRZ), LocatorUtils.property(thatLocator, "grz", rhsGRZ), lhsGRZ, rhsGRZ, (this.grz!= null), (that.grz!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGFZ;
            lhsGFZ = this.getGFZ();
            BigDecimal rhsGFZ;
            rhsGFZ = that.getGFZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gfz", lhsGFZ), LocatorUtils.property(thatLocator, "gfz", rhsGFZ), lhsGFZ, rhsGFZ, (this.gfz!= null), (that.gfz!= null))) {
                return false;
            }
        }
        {
            ErschliessungszustandTyp lhsErschliessungszustand;
            lhsErschliessungszustand = this.getErschliessungszustand();
            ErschliessungszustandTyp rhsErschliessungszustand;
            rhsErschliessungszustand = that.getErschliessungszustand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erschliessungszustand", lhsErschliessungszustand), LocatorUtils.property(thatLocator, "erschliessungszustand", rhsErschliessungszustand), lhsErschliessungszustand, rhsErschliessungszustand, (this.erschliessungszustand!= null), (that.erschliessungszustand!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKurzfristigBebaubar;
            lhsKurzfristigBebaubar = this.isKurzfristigBebaubar();
            Boolean rhsKurzfristigBebaubar;
            rhsKurzfristigBebaubar = that.isKurzfristigBebaubar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kurzfristigBebaubar", lhsKurzfristigBebaubar), LocatorUtils.property(thatLocator, "kurzfristigBebaubar", rhsKurzfristigBebaubar), lhsKurzfristigBebaubar, rhsKurzfristigBebaubar, (this.kurzfristigBebaubar!= null), (that.kurzfristigBebaubar!= null))) {
                return false;
            }
        }
        {
            String lhsFreiAb;
            lhsFreiAb = this.getFreiAb();
            String rhsFreiAb;
            rhsFreiAb = that.getFreiAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freiAb", lhsFreiAb), LocatorUtils.property(thatLocator, "freiAb", rhsFreiAb), lhsFreiAb, rhsFreiAb, (this.freiAb!= null), (that.freiAb!= null))) {
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
