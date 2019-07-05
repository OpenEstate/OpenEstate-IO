
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
import org.openestate.io.immobiliare_it.xml.types.EnergyScaleType;


/**
 * <p>Java class for classEnergy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="classEnergy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="energy-performance" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt;
 *                 &lt;attribute name="unit" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="kWh/m2anno"/&gt;
 *                       &lt;enumeration value="kWh/m3anno"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="type" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="nren"/&gt;
 *                       &lt;enumeration value="ren"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="energy-season" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="season"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="summer"/&gt;
 *                       &lt;enumeration value="winter"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="level"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="low"/&gt;
 *                       &lt;enumeration value="normal"/&gt;
 *                       &lt;enumeration value="high"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="zero" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="scale"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;pattern value="1|2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="value"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="A4"/&gt;
 *             &lt;enumeration value="A3"/&gt;
 *             &lt;enumeration value="A2"/&gt;
 *             &lt;enumeration value="A1"/&gt;
 *             &lt;enumeration value="A+"/&gt;
 *             &lt;enumeration value="A"/&gt;
 *             &lt;enumeration value="B"/&gt;
 *             &lt;enumeration value="C"/&gt;
 *             &lt;enumeration value="D"/&gt;
 *             &lt;enumeration value="E"/&gt;
 *             &lt;enumeration value="F"/&gt;
 *             &lt;enumeration value="G"/&gt;
 *             &lt;enumeration value="esente"/&gt;
 *             &lt;enumeration value="NC"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="certified" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classEnergy", propOrder = {
    "energyPerformance",
    "energySeason"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
public class ClassEnergy implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "energy-performance")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected List<ClassEnergy.EnergyPerformance> energyPerformance;
    @XmlElement(name = "energy-season")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected List<ClassEnergy.EnergySeason> energySeason;
    @XmlAttribute(name = "zero")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean zero;
    @XmlAttribute(name = "scale")
    @XmlJavaTypeAdapter(Adapter22 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected EnergyScaleType scale;
    @XmlAttribute(name = "value")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected ClassEnergy.Type value;
    @XmlAttribute(name = "certified")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean certified;

    /**
     * Gets the value of the energyPerformance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energyPerformance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergyPerformance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassEnergy.EnergyPerformance }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public List<ClassEnergy.EnergyPerformance> getEnergyPerformance() {
        if (energyPerformance == null) {
            energyPerformance = new ArrayList<ClassEnergy.EnergyPerformance>();
        }
        return this.energyPerformance;
    }

    /**
     * Gets the value of the energySeason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energySeason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergySeason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassEnergy.EnergySeason }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public List<ClassEnergy.EnergySeason> getEnergySeason() {
        if (energySeason == null) {
            energySeason = new ArrayList<ClassEnergy.EnergySeason>();
        }
        return this.energySeason;
    }

    /**
     * Gets the value of the zero property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getZero() {
        if (zero == null) {
            return false;
        } else {
            return zero;
        }
    }

    /**
     * Sets the value of the zero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setZero(Boolean value) {
        this.zero = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public EnergyScaleType getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setScale(EnergyScaleType value) {
        this.scale = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ClassEnergy.Type }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public ClassEnergy.Type getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassEnergy.Type }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setValue(ClassEnergy.Type value) {
        this.value = value;
    }

    /**
     * Gets the value of the certified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getCertified() {
        if (certified == null) {
            return true;
        } else {
            return certified;
        }
    }

    /**
     * Sets the value of the certified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public void setCertified(Boolean value) {
        this.certified = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<ClassEnergy.EnergyPerformance> theEnergyPerformance;
            theEnergyPerformance = (((this.energyPerformance!= null)&&(!this.energyPerformance.isEmpty()))?this.getEnergyPerformance():null);
            strategy.appendField(locator, this, "energyPerformance", buffer, theEnergyPerformance, ((this.energyPerformance!= null)&&(!this.energyPerformance.isEmpty())));
        }
        {
            List<ClassEnergy.EnergySeason> theEnergySeason;
            theEnergySeason = (((this.energySeason!= null)&&(!this.energySeason.isEmpty()))?this.getEnergySeason():null);
            strategy.appendField(locator, this, "energySeason", buffer, theEnergySeason, ((this.energySeason!= null)&&(!this.energySeason.isEmpty())));
        }
        {
            Boolean theZero;
            theZero = this.getZero();
            strategy.appendField(locator, this, "zero", buffer, theZero, (this.zero!= null));
        }
        {
            EnergyScaleType theScale;
            theScale = this.getScale();
            strategy.appendField(locator, this, "scale", buffer, theScale, (this.scale!= null));
        }
        {
            ClassEnergy.Type theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            Boolean theCertified;
            theCertified = this.getCertified();
            strategy.appendField(locator, this, "certified", buffer, theCertified, (this.certified!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ClassEnergy) {
            final ClassEnergy copy = ((ClassEnergy) draftCopy);
            {
                Boolean energyPerformanceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.energyPerformance!= null)&&(!this.energyPerformance.isEmpty())));
                if (energyPerformanceShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ClassEnergy.EnergyPerformance> sourceEnergyPerformance;
                    sourceEnergyPerformance = (((this.energyPerformance!= null)&&(!this.energyPerformance.isEmpty()))?this.getEnergyPerformance():null);
                    @SuppressWarnings("unchecked")
                    List<ClassEnergy.EnergyPerformance> copyEnergyPerformance = ((List<ClassEnergy.EnergyPerformance> ) strategy.copy(LocatorUtils.property(locator, "energyPerformance", sourceEnergyPerformance), sourceEnergyPerformance, ((this.energyPerformance!= null)&&(!this.energyPerformance.isEmpty()))));
                    copy.energyPerformance = null;
                    if (copyEnergyPerformance!= null) {
                        List<ClassEnergy.EnergyPerformance> uniqueEnergyPerformancel = copy.getEnergyPerformance();
                        uniqueEnergyPerformancel.addAll(copyEnergyPerformance);
                    }
                } else {
                    if (energyPerformanceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyPerformance = null;
                    }
                }
            }
            {
                Boolean energySeasonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.energySeason!= null)&&(!this.energySeason.isEmpty())));
                if (energySeasonShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ClassEnergy.EnergySeason> sourceEnergySeason;
                    sourceEnergySeason = (((this.energySeason!= null)&&(!this.energySeason.isEmpty()))?this.getEnergySeason():null);
                    @SuppressWarnings("unchecked")
                    List<ClassEnergy.EnergySeason> copyEnergySeason = ((List<ClassEnergy.EnergySeason> ) strategy.copy(LocatorUtils.property(locator, "energySeason", sourceEnergySeason), sourceEnergySeason, ((this.energySeason!= null)&&(!this.energySeason.isEmpty()))));
                    copy.energySeason = null;
                    if (copyEnergySeason!= null) {
                        List<ClassEnergy.EnergySeason> uniqueEnergySeasonl = copy.getEnergySeason();
                        uniqueEnergySeasonl.addAll(copyEnergySeason);
                    }
                } else {
                    if (energySeasonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energySeason = null;
                    }
                }
            }
            {
                Boolean zeroShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zero!= null));
                if (zeroShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceZero;
                    sourceZero = this.getZero();
                    Boolean copyZero = ((Boolean) strategy.copy(LocatorUtils.property(locator, "zero", sourceZero), sourceZero, (this.zero!= null)));
                    copy.setZero(copyZero);
                } else {
                    if (zeroShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zero = null;
                    }
                }
            }
            {
                Boolean scaleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scale!= null));
                if (scaleShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergyScaleType sourceScale;
                    sourceScale = this.getScale();
                    EnergyScaleType copyScale = ((EnergyScaleType) strategy.copy(LocatorUtils.property(locator, "scale", sourceScale), sourceScale, (this.scale!= null)));
                    copy.setScale(copyScale);
                } else {
                    if (scaleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.scale = null;
                    }
                }
            }
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    ClassEnergy.Type sourceValue;
                    sourceValue = this.getValue();
                    ClassEnergy.Type copyValue = ((ClassEnergy.Type) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean certifiedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.certified!= null));
                if (certifiedShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceCertified;
                    sourceCertified = this.getCertified();
                    Boolean copyCertified = ((Boolean) strategy.copy(LocatorUtils.property(locator, "certified", sourceCertified), sourceCertified, (this.certified!= null)));
                    copy.setCertified(copyCertified);
                } else {
                    if (certifiedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.certified = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new ClassEnergy();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ClassEnergy that = ((ClassEnergy) object);
        {
            List<ClassEnergy.EnergyPerformance> lhsEnergyPerformance;
            lhsEnergyPerformance = (((this.energyPerformance!= null)&&(!this.energyPerformance.isEmpty()))?this.getEnergyPerformance():null);
            List<ClassEnergy.EnergyPerformance> rhsEnergyPerformance;
            rhsEnergyPerformance = (((that.energyPerformance!= null)&&(!that.energyPerformance.isEmpty()))?that.getEnergyPerformance():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyPerformance", lhsEnergyPerformance), LocatorUtils.property(thatLocator, "energyPerformance", rhsEnergyPerformance), lhsEnergyPerformance, rhsEnergyPerformance, ((this.energyPerformance!= null)&&(!this.energyPerformance.isEmpty())), ((that.energyPerformance!= null)&&(!that.energyPerformance.isEmpty())))) {
                return false;
            }
        }
        {
            List<ClassEnergy.EnergySeason> lhsEnergySeason;
            lhsEnergySeason = (((this.energySeason!= null)&&(!this.energySeason.isEmpty()))?this.getEnergySeason():null);
            List<ClassEnergy.EnergySeason> rhsEnergySeason;
            rhsEnergySeason = (((that.energySeason!= null)&&(!that.energySeason.isEmpty()))?that.getEnergySeason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energySeason", lhsEnergySeason), LocatorUtils.property(thatLocator, "energySeason", rhsEnergySeason), lhsEnergySeason, rhsEnergySeason, ((this.energySeason!= null)&&(!this.energySeason.isEmpty())), ((that.energySeason!= null)&&(!that.energySeason.isEmpty())))) {
                return false;
            }
        }
        {
            Boolean lhsZero;
            lhsZero = this.getZero();
            Boolean rhsZero;
            rhsZero = that.getZero();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zero", lhsZero), LocatorUtils.property(thatLocator, "zero", rhsZero), lhsZero, rhsZero, (this.zero!= null), (that.zero!= null))) {
                return false;
            }
        }
        {
            EnergyScaleType lhsScale;
            lhsScale = this.getScale();
            EnergyScaleType rhsScale;
            rhsScale = that.getScale();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scale", lhsScale), LocatorUtils.property(thatLocator, "scale", rhsScale), lhsScale, rhsScale, (this.scale!= null), (that.scale!= null))) {
                return false;
            }
        }
        {
            ClassEnergy.Type lhsValue;
            lhsValue = this.getValue();
            ClassEnergy.Type rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            Boolean lhsCertified;
            lhsCertified = this.getCertified();
            Boolean rhsCertified;
            rhsCertified = that.getCertified();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certified", lhsCertified), LocatorUtils.property(thatLocator, "certified", rhsCertified), lhsCertified, rhsCertified, (this.certified!= null), (that.certified!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt;
     *       &lt;attribute name="unit" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="kWh/m2anno"/&gt;
     *             &lt;enumeration value="kWh/m3anno"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="type" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="nren"/&gt;
     *             &lt;enumeration value="ren"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public static class EnergyPerformance implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlValue
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "double")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected BigDecimal value;
        @XmlAttribute(name = "unit", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected ClassEnergy.EnergyPerformance.Unit unit;
        @XmlAttribute(name = "type", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected ClassEnergy.EnergyPerformance.Type type;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link ClassEnergy.EnergyPerformance.Unit }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public ClassEnergy.EnergyPerformance.Unit getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClassEnergy.EnergyPerformance.Unit }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setUnit(ClassEnergy.EnergyPerformance.Unit value) {
            this.unit = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link ClassEnergy.EnergyPerformance.Type }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public ClassEnergy.EnergyPerformance.Type getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClassEnergy.EnergyPerformance.Type }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setType(ClassEnergy.EnergyPerformance.Type value) {
            this.type = value;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                BigDecimal theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
            }
            {
                ClassEnergy.EnergyPerformance.Unit theUnit;
                theUnit = this.getUnit();
                strategy.appendField(locator, this, "unit", buffer, theUnit, (this.unit!= null));
            }
            {
                ClassEnergy.EnergyPerformance.Type theType;
                theType = this.getType();
                strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof ClassEnergy.EnergyPerformance) {
                final ClassEnergy.EnergyPerformance copy = ((ClassEnergy.EnergyPerformance) draftCopy);
                {
                    Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                    if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigDecimal sourceValue;
                        sourceValue = this.getValue();
                        BigDecimal copyValue = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                        copy.setValue(copyValue);
                    } else {
                        if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.value = null;
                        }
                    }
                }
                {
                    Boolean unitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unit!= null));
                    if (unitShouldBeCopiedAndSet == Boolean.TRUE) {
                        ClassEnergy.EnergyPerformance.Unit sourceUnit;
                        sourceUnit = this.getUnit();
                        ClassEnergy.EnergyPerformance.Unit copyUnit = ((ClassEnergy.EnergyPerformance.Unit) strategy.copy(LocatorUtils.property(locator, "unit", sourceUnit), sourceUnit, (this.unit!= null)));
                        copy.setUnit(copyUnit);
                    } else {
                        if (unitShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.unit = null;
                        }
                    }
                }
                {
                    Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                    if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                        ClassEnergy.EnergyPerformance.Type sourceType;
                        sourceType = this.getType();
                        ClassEnergy.EnergyPerformance.Type copyType = ((ClassEnergy.EnergyPerformance.Type) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                        copy.setType(copyType);
                    } else {
                        if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.type = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new ClassEnergy.EnergyPerformance();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final ClassEnergy.EnergyPerformance that = ((ClassEnergy.EnergyPerformance) object);
            {
                BigDecimal lhsValue;
                lhsValue = this.getValue();
                BigDecimal rhsValue;
                rhsValue = that.getValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                    return false;
                }
            }
            {
                ClassEnergy.EnergyPerformance.Unit lhsUnit;
                lhsUnit = this.getUnit();
                ClassEnergy.EnergyPerformance.Unit rhsUnit;
                rhsUnit = that.getUnit();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "unit", lhsUnit), LocatorUtils.property(thatLocator, "unit", rhsUnit), lhsUnit, rhsUnit, (this.unit!= null), (that.unit!= null))) {
                    return false;
                }
            }
            {
                ClassEnergy.EnergyPerformance.Type lhsType;
                lhsType = this.getType();
                ClassEnergy.EnergyPerformance.Type rhsType;
                rhsType = that.getType();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                    return false;
                }
            }
            return true;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType&gt;
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *     &lt;enumeration value="nren"/&gt;
         *     &lt;enumeration value="ren"/&gt;
         *   &lt;/restriction&gt;
         * &lt;/simpleType&gt;
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public enum Type {

            @XmlEnumValue("nren")
            NREN("nren"),
            @XmlEnumValue("ren")
            REN("ren");
            private final String value;

            Type(String v) {
                value = v;
            }

            public String value() {
                return value;
            }

            public static ClassEnergy.EnergyPerformance.Type fromValue(String v) {
                for (ClassEnergy.EnergyPerformance.Type c: ClassEnergy.EnergyPerformance.Type.values()) {
                    if (c.value.equals(v)) {
                        return c;
                    }
                }
                throw new IllegalArgumentException(v);
            }

        }


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType&gt;
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *     &lt;enumeration value="kWh/m2anno"/&gt;
         *     &lt;enumeration value="kWh/m3anno"/&gt;
         *   &lt;/restriction&gt;
         * &lt;/simpleType&gt;
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public enum Unit {

            @XmlEnumValue("kWh/m2anno")
            KWH_PER_SQM_ANNO("kWh/m2anno"),
            @XmlEnumValue("kWh/m3anno")
            KWH_PER_CUM_ANNO("kWh/m3anno");
            private final String value;

            Unit(String v) {
                value = v;
            }

            public String value() {
                return value;
            }

            public static ClassEnergy.EnergyPerformance.Unit fromValue(String v) {
                for (ClassEnergy.EnergyPerformance.Unit c: ClassEnergy.EnergyPerformance.Unit.values()) {
                    if (c.value.equals(v)) {
                        return c;
                    }
                }
                throw new IllegalArgumentException(v);
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="season"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="summer"/&gt;
     *             &lt;enumeration value="winter"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="level"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="low"/&gt;
     *             &lt;enumeration value="normal"/&gt;
     *             &lt;enumeration value="high"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public static class EnergySeason implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlAttribute(name = "season")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected ClassEnergy.EnergySeason.Type season;
        @XmlAttribute(name = "level")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        protected ClassEnergy.EnergySeason.Level level;

        /**
         * Gets the value of the season property.
         * 
         * @return
         *     possible object is
         *     {@link ClassEnergy.EnergySeason.Type }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public ClassEnergy.EnergySeason.Type getSeason() {
            return season;
        }

        /**
         * Sets the value of the season property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClassEnergy.EnergySeason.Type }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setSeason(ClassEnergy.EnergySeason.Type value) {
            this.season = value;
        }

        /**
         * Gets the value of the level property.
         * 
         * @return
         *     possible object is
         *     {@link ClassEnergy.EnergySeason.Level }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public ClassEnergy.EnergySeason.Level getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClassEnergy.EnergySeason.Level }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public void setLevel(ClassEnergy.EnergySeason.Level value) {
            this.level = value;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                ClassEnergy.EnergySeason.Type theSeason;
                theSeason = this.getSeason();
                strategy.appendField(locator, this, "season", buffer, theSeason, (this.season!= null));
            }
            {
                ClassEnergy.EnergySeason.Level theLevel;
                theLevel = this.getLevel();
                strategy.appendField(locator, this, "level", buffer, theLevel, (this.level!= null));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof ClassEnergy.EnergySeason) {
                final ClassEnergy.EnergySeason copy = ((ClassEnergy.EnergySeason) draftCopy);
                {
                    Boolean seasonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.season!= null));
                    if (seasonShouldBeCopiedAndSet == Boolean.TRUE) {
                        ClassEnergy.EnergySeason.Type sourceSeason;
                        sourceSeason = this.getSeason();
                        ClassEnergy.EnergySeason.Type copySeason = ((ClassEnergy.EnergySeason.Type) strategy.copy(LocatorUtils.property(locator, "season", sourceSeason), sourceSeason, (this.season!= null)));
                        copy.setSeason(copySeason);
                    } else {
                        if (seasonShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.season = null;
                        }
                    }
                }
                {
                    Boolean levelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.level!= null));
                    if (levelShouldBeCopiedAndSet == Boolean.TRUE) {
                        ClassEnergy.EnergySeason.Level sourceLevel;
                        sourceLevel = this.getLevel();
                        ClassEnergy.EnergySeason.Level copyLevel = ((ClassEnergy.EnergySeason.Level) strategy.copy(LocatorUtils.property(locator, "level", sourceLevel), sourceLevel, (this.level!= null)));
                        copy.setLevel(copyLevel);
                    } else {
                        if (levelShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.level = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new ClassEnergy.EnergySeason();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final ClassEnergy.EnergySeason that = ((ClassEnergy.EnergySeason) object);
            {
                ClassEnergy.EnergySeason.Type lhsSeason;
                lhsSeason = this.getSeason();
                ClassEnergy.EnergySeason.Type rhsSeason;
                rhsSeason = that.getSeason();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "season", lhsSeason), LocatorUtils.property(thatLocator, "season", rhsSeason), lhsSeason, rhsSeason, (this.season!= null), (that.season!= null))) {
                    return false;
                }
            }
            {
                ClassEnergy.EnergySeason.Level lhsLevel;
                lhsLevel = this.getLevel();
                ClassEnergy.EnergySeason.Level rhsLevel;
                rhsLevel = that.getLevel();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "level", lhsLevel), LocatorUtils.property(thatLocator, "level", rhsLevel), lhsLevel, rhsLevel, (this.level!= null), (that.level!= null))) {
                    return false;
                }
            }
            return true;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType&gt;
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *     &lt;enumeration value="low"/&gt;
         *     &lt;enumeration value="normal"/&gt;
         *     &lt;enumeration value="high"/&gt;
         *   &lt;/restriction&gt;
         * &lt;/simpleType&gt;
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public enum Level {

            @XmlEnumValue("low")
            LOW("low"),
            @XmlEnumValue("normal")
            NORMAL("normal"),
            @XmlEnumValue("high")
            HIGH("high");
            private final String value;

            Level(String v) {
                value = v;
            }

            public String value() {
                return value;
            }

            public static ClassEnergy.EnergySeason.Level fromValue(String v) {
                for (ClassEnergy.EnergySeason.Level c: ClassEnergy.EnergySeason.Level.values()) {
                    if (c.value.equals(v)) {
                        return c;
                    }
                }
                throw new IllegalArgumentException(v);
            }

        }


        /**
         * <p>Java class for null.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;simpleType&gt;
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *     &lt;enumeration value="summer"/&gt;
         *     &lt;enumeration value="winter"/&gt;
         *   &lt;/restriction&gt;
         * &lt;/simpleType&gt;
         * </pre>
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
        public enum Type {

            @XmlEnumValue("summer")
            SUMMER("summer"),
            @XmlEnumValue("winter")
            WINTER("winter");
            private final String value;

            Type(String v) {
                value = v;
            }

            public String value() {
                return value;
            }

            public static ClassEnergy.EnergySeason.Type fromValue(String v) {
                for (ClassEnergy.EnergySeason.Type c: ClassEnergy.EnergySeason.Type.values()) {
                    if (c.value.equals(v)) {
                        return c;
                    }
                }
                throw new IllegalArgumentException(v);
            }

        }

    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="A4"/&gt;
     *     &lt;enumeration value="A3"/&gt;
     *     &lt;enumeration value="A2"/&gt;
     *     &lt;enumeration value="A1"/&gt;
     *     &lt;enumeration value="A+"/&gt;
     *     &lt;enumeration value="A"/&gt;
     *     &lt;enumeration value="B"/&gt;
     *     &lt;enumeration value="C"/&gt;
     *     &lt;enumeration value="D"/&gt;
     *     &lt;enumeration value="E"/&gt;
     *     &lt;enumeration value="F"/&gt;
     *     &lt;enumeration value="G"/&gt;
     *     &lt;enumeration value="esente"/&gt;
     *     &lt;enumeration value="NC"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-07-05T06:51:24+02:00", comments = "JAXB RI v2.2.11")
    public enum Type {

        @XmlEnumValue("A4")
        A_4("A4"),
        @XmlEnumValue("A3")
        A_3("A3"),
        @XmlEnumValue("A2")
        A_2("A2"),
        @XmlEnumValue("A1")
        A_1("A1"),
        @XmlEnumValue("A+")
        A_PLUS("A+"),
        A("A"),
        B("B"),
        C("C"),
        D("D"),
        E("E"),
        F("F"),
        G("G"),
        @XmlEnumValue("esente")
        ESENTE("esente"),
        NC("NC");
        private final String value;

        Type(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static ClassEnergy.Type fromValue(String v) {
            for (ClassEnergy.Type c: ClassEnergy.Type.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
