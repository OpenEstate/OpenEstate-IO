
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for ImmobilienTransferTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImmobilienTransferTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Anbieter"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}AnbieterTyp"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.immobilienscout24.de/immobilientransfer}VirtuelleImmobilie" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.immobilienscout24.de/immobilientransfer}Immobilie" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EmailBeiFehler" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}EmailTyp" /&gt;
 *       &lt;attribute name="ErstellerSoftware" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.immobilienscout24.de/immobilientransfer}Text100Typ"&gt;
 *             &lt;minLength value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ErstellerSoftwareVersion" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.immobilienscout24.de/immobilientransfer}Text100Typ"&gt;
 *             &lt;minLength value="3"/&gt;
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
@XmlType(name = "ImmobilienTransferTyp", propOrder = {
    "anbieter"
})
public class ImmobilienTransferTyp implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "Anbieter", required = true)
    protected ImmobilienTransferTyp.Anbieter anbieter;
    @XmlAttribute(name = "EmailBeiFehler", required = true)
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected String emailBeiFehler;
    @XmlAttribute(name = "ErstellerSoftware", required = true)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected String erstellerSoftware;
    @XmlAttribute(name = "ErstellerSoftwareVersion", required = true)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected String erstellerSoftwareVersion;

    /**
     * Gets the value of the anbieter property.
     * 
     * @return
     *     possible object is
     *     {@link ImmobilienTransferTyp.Anbieter }
     *     
     */
    public ImmobilienTransferTyp.Anbieter getAnbieter() {
        return anbieter;
    }

    /**
     * Sets the value of the anbieter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmobilienTransferTyp.Anbieter }
     *     
     */
    public void setAnbieter(ImmobilienTransferTyp.Anbieter value) {
        this.anbieter = value;
    }

    /**
     * Gets the value of the emailBeiFehler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailBeiFehler() {
        return emailBeiFehler;
    }

    /**
     * Sets the value of the emailBeiFehler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailBeiFehler(String value) {
        this.emailBeiFehler = value;
    }

    /**
     * Gets the value of the erstellerSoftware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErstellerSoftware() {
        return erstellerSoftware;
    }

    /**
     * Sets the value of the erstellerSoftware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErstellerSoftware(String value) {
        this.erstellerSoftware = value;
    }

    /**
     * Gets the value of the erstellerSoftwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErstellerSoftwareVersion() {
        return erstellerSoftwareVersion;
    }

    /**
     * Sets the value of the erstellerSoftwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErstellerSoftwareVersion(String value) {
        this.erstellerSoftwareVersion = value;
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
        {
            ImmobilienTransferTyp.Anbieter theAnbieter;
            theAnbieter = this.getAnbieter();
            strategy.appendField(locator, this, "anbieter", buffer, theAnbieter, (this.anbieter!= null));
        }
        {
            String theEmailBeiFehler;
            theEmailBeiFehler = this.getEmailBeiFehler();
            strategy.appendField(locator, this, "emailBeiFehler", buffer, theEmailBeiFehler, (this.emailBeiFehler!= null));
        }
        {
            String theErstellerSoftware;
            theErstellerSoftware = this.getErstellerSoftware();
            strategy.appendField(locator, this, "erstellerSoftware", buffer, theErstellerSoftware, (this.erstellerSoftware!= null));
        }
        {
            String theErstellerSoftwareVersion;
            theErstellerSoftwareVersion = this.getErstellerSoftwareVersion();
            strategy.appendField(locator, this, "erstellerSoftwareVersion", buffer, theErstellerSoftwareVersion, (this.erstellerSoftwareVersion!= null));
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
        if (draftCopy instanceof ImmobilienTransferTyp) {
            final ImmobilienTransferTyp copy = ((ImmobilienTransferTyp) draftCopy);
            {
                Boolean anbieterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anbieter!= null));
                if (anbieterShouldBeCopiedAndSet == Boolean.TRUE) {
                    ImmobilienTransferTyp.Anbieter sourceAnbieter;
                    sourceAnbieter = this.getAnbieter();
                    ImmobilienTransferTyp.Anbieter copyAnbieter = ((ImmobilienTransferTyp.Anbieter) strategy.copy(LocatorUtils.property(locator, "anbieter", sourceAnbieter), sourceAnbieter, (this.anbieter!= null)));
                    copy.setAnbieter(copyAnbieter);
                } else {
                    if (anbieterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anbieter = null;
                    }
                }
            }
            {
                Boolean emailBeiFehlerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.emailBeiFehler!= null));
                if (emailBeiFehlerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEmailBeiFehler;
                    sourceEmailBeiFehler = this.getEmailBeiFehler();
                    String copyEmailBeiFehler = ((String) strategy.copy(LocatorUtils.property(locator, "emailBeiFehler", sourceEmailBeiFehler), sourceEmailBeiFehler, (this.emailBeiFehler!= null)));
                    copy.setEmailBeiFehler(copyEmailBeiFehler);
                } else {
                    if (emailBeiFehlerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.emailBeiFehler = null;
                    }
                }
            }
            {
                Boolean erstellerSoftwareShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erstellerSoftware!= null));
                if (erstellerSoftwareShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceErstellerSoftware;
                    sourceErstellerSoftware = this.getErstellerSoftware();
                    String copyErstellerSoftware = ((String) strategy.copy(LocatorUtils.property(locator, "erstellerSoftware", sourceErstellerSoftware), sourceErstellerSoftware, (this.erstellerSoftware!= null)));
                    copy.setErstellerSoftware(copyErstellerSoftware);
                } else {
                    if (erstellerSoftwareShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erstellerSoftware = null;
                    }
                }
            }
            {
                Boolean erstellerSoftwareVersionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erstellerSoftwareVersion!= null));
                if (erstellerSoftwareVersionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceErstellerSoftwareVersion;
                    sourceErstellerSoftwareVersion = this.getErstellerSoftwareVersion();
                    String copyErstellerSoftwareVersion = ((String) strategy.copy(LocatorUtils.property(locator, "erstellerSoftwareVersion", sourceErstellerSoftwareVersion), sourceErstellerSoftwareVersion, (this.erstellerSoftwareVersion!= null)));
                    copy.setErstellerSoftwareVersion(copyErstellerSoftwareVersion);
                } else {
                    if (erstellerSoftwareVersionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erstellerSoftwareVersion = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ImmobilienTransferTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ImmobilienTransferTyp that = ((ImmobilienTransferTyp) object);
        {
            ImmobilienTransferTyp.Anbieter lhsAnbieter;
            lhsAnbieter = this.getAnbieter();
            ImmobilienTransferTyp.Anbieter rhsAnbieter;
            rhsAnbieter = that.getAnbieter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anbieter", lhsAnbieter), LocatorUtils.property(thatLocator, "anbieter", rhsAnbieter), lhsAnbieter, rhsAnbieter, (this.anbieter!= null), (that.anbieter!= null))) {
                return false;
            }
        }
        {
            String lhsEmailBeiFehler;
            lhsEmailBeiFehler = this.getEmailBeiFehler();
            String rhsEmailBeiFehler;
            rhsEmailBeiFehler = that.getEmailBeiFehler();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailBeiFehler", lhsEmailBeiFehler), LocatorUtils.property(thatLocator, "emailBeiFehler", rhsEmailBeiFehler), lhsEmailBeiFehler, rhsEmailBeiFehler, (this.emailBeiFehler!= null), (that.emailBeiFehler!= null))) {
                return false;
            }
        }
        {
            String lhsErstellerSoftware;
            lhsErstellerSoftware = this.getErstellerSoftware();
            String rhsErstellerSoftware;
            rhsErstellerSoftware = that.getErstellerSoftware();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erstellerSoftware", lhsErstellerSoftware), LocatorUtils.property(thatLocator, "erstellerSoftware", rhsErstellerSoftware), lhsErstellerSoftware, rhsErstellerSoftware, (this.erstellerSoftware!= null), (that.erstellerSoftware!= null))) {
                return false;
            }
        }
        {
            String lhsErstellerSoftwareVersion;
            lhsErstellerSoftwareVersion = this.getErstellerSoftwareVersion();
            String rhsErstellerSoftwareVersion;
            rhsErstellerSoftwareVersion = that.getErstellerSoftwareVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erstellerSoftwareVersion", lhsErstellerSoftwareVersion), LocatorUtils.property(thatLocator, "erstellerSoftwareVersion", rhsErstellerSoftwareVersion), lhsErstellerSoftwareVersion, rhsErstellerSoftwareVersion, (this.erstellerSoftwareVersion!= null), (that.erstellerSoftwareVersion!= null))) {
                return false;
            }
        }
        return true;
    }

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
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}AnbieterTyp"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.immobilienscout24.de/immobilientransfer}VirtuelleImmobilie" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.immobilienscout24.de/immobilientransfer}Immobilie" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "virtuelleImmobilie",
        "immobilie"
    })
    public static class Anbieter
        extends AnbieterTyp
        implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElementRef(name = "VirtuelleImmobilie", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
        protected List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> virtuelleImmobilie;
        @XmlElementRef(name = "Immobilie", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class)
        protected List<JAXBElement<? extends ImmobilieBaseTyp>> immobilie;

        /**
         * Gets the value of the virtuelleImmobilie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the virtuelleImmobilie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVirtuelleImmobilie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link VirtuelleImmobilieBaseTyp }{@code >}
         * {@link JAXBElement }{@code <}{@link TypenHaus }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> getVirtuelleImmobilie() {
            if (virtuelleImmobilie == null) {
                virtuelleImmobilie = new ArrayList<JAXBElement<? extends VirtuelleImmobilieBaseTyp>>();
            }
            return this.virtuelleImmobilie;
        }

        /**
         * Gets the value of the immobilie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the immobilie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImmobilie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Zwangsversteigerung }
         * {@link WAZ }
         * {@link JAXBElement }{@code <}{@link Grundstueck }{@code >}
         * {@link Einzelhandel }
         * {@link HausKauf }
         * {@link GarageKauf }
         * {@link Gastronomie }
         * {@link SonstigeGewerbe }
         * {@link HalleProduktion }
         * {@link WohnungMiete }
         * {@link GrundstueckGewerbe }
         * {@link GrundstueckWohnenKauf }
         * {@link WohnungKauf }
         * {@link GrundstueckWohnenMiete }
         * {@link BueroPraxis }
         * {@link WGZimmer }
         * {@link GarageMiete }
         * {@link Anlageobjekt }
         * {@link HausMiete }
         * {@link JAXBElement }{@code <}{@link ImmobilieBaseTyp }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends ImmobilieBaseTyp>> getImmobilie() {
            if (immobilie == null) {
                immobilie = new ArrayList<JAXBElement<? extends ImmobilieBaseTyp>>();
            }
            return this.immobilie;
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
                List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> theVirtuelleImmobilie;
                theVirtuelleImmobilie = (((this.virtuelleImmobilie!= null)&&(!this.virtuelleImmobilie.isEmpty()))?this.getVirtuelleImmobilie():null);
                strategy.appendField(locator, this, "virtuelleImmobilie", buffer, theVirtuelleImmobilie, ((this.virtuelleImmobilie!= null)&&(!this.virtuelleImmobilie.isEmpty())));
            }
            {
                List<JAXBElement<? extends ImmobilieBaseTyp>> theImmobilie;
                theImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
                strategy.appendField(locator, this, "immobilie", buffer, theImmobilie, ((this.immobilie!= null)&&(!this.immobilie.isEmpty())));
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
            if (draftCopy instanceof ImmobilienTransferTyp.Anbieter) {
                final ImmobilienTransferTyp.Anbieter copy = ((ImmobilienTransferTyp.Anbieter) draftCopy);
                {
                    Boolean virtuelleImmobilieShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.virtuelleImmobilie!= null)&&(!this.virtuelleImmobilie.isEmpty())));
                    if (virtuelleImmobilieShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> sourceVirtuelleImmobilie;
                        sourceVirtuelleImmobilie = (((this.virtuelleImmobilie!= null)&&(!this.virtuelleImmobilie.isEmpty()))?this.getVirtuelleImmobilie():null);
                        @SuppressWarnings("unchecked")
                        List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> copyVirtuelleImmobilie = ((List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> ) strategy.copy(LocatorUtils.property(locator, "virtuelleImmobilie", sourceVirtuelleImmobilie), sourceVirtuelleImmobilie, ((this.virtuelleImmobilie!= null)&&(!this.virtuelleImmobilie.isEmpty()))));
                        copy.virtuelleImmobilie = null;
                        if (copyVirtuelleImmobilie!= null) {
                            List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> uniqueVirtuelleImmobiliel = copy.getVirtuelleImmobilie();
                            uniqueVirtuelleImmobiliel.addAll(copyVirtuelleImmobilie);
                        }
                    } else {
                        if (virtuelleImmobilieShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.virtuelleImmobilie = null;
                        }
                    }
                }
                {
                    Boolean immobilieShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.immobilie!= null)&&(!this.immobilie.isEmpty())));
                    if (immobilieShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<JAXBElement<? extends ImmobilieBaseTyp>> sourceImmobilie;
                        sourceImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
                        @SuppressWarnings("unchecked")
                        List<JAXBElement<? extends ImmobilieBaseTyp>> copyImmobilie = ((List<JAXBElement<? extends ImmobilieBaseTyp>> ) strategy.copy(LocatorUtils.property(locator, "immobilie", sourceImmobilie), sourceImmobilie, ((this.immobilie!= null)&&(!this.immobilie.isEmpty()))));
                        copy.immobilie = null;
                        if (copyImmobilie!= null) {
                            List<JAXBElement<? extends ImmobilieBaseTyp>> uniqueImmobiliel = copy.getImmobilie();
                            uniqueImmobiliel.addAll(copyImmobilie);
                        }
                    } else {
                        if (immobilieShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.immobilie = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ImmobilienTransferTyp.Anbieter();
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
            final ImmobilienTransferTyp.Anbieter that = ((ImmobilienTransferTyp.Anbieter) object);
            {
                List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> lhsVirtuelleImmobilie;
                lhsVirtuelleImmobilie = (((this.virtuelleImmobilie!= null)&&(!this.virtuelleImmobilie.isEmpty()))?this.getVirtuelleImmobilie():null);
                List<JAXBElement<? extends VirtuelleImmobilieBaseTyp>> rhsVirtuelleImmobilie;
                rhsVirtuelleImmobilie = (((that.virtuelleImmobilie!= null)&&(!that.virtuelleImmobilie.isEmpty()))?that.getVirtuelleImmobilie():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "virtuelleImmobilie", lhsVirtuelleImmobilie), LocatorUtils.property(thatLocator, "virtuelleImmobilie", rhsVirtuelleImmobilie), lhsVirtuelleImmobilie, rhsVirtuelleImmobilie, ((this.virtuelleImmobilie!= null)&&(!this.virtuelleImmobilie.isEmpty())), ((that.virtuelleImmobilie!= null)&&(!that.virtuelleImmobilie.isEmpty())))) {
                    return false;
                }
            }
            {
                List<JAXBElement<? extends ImmobilieBaseTyp>> lhsImmobilie;
                lhsImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
                List<JAXBElement<? extends ImmobilieBaseTyp>> rhsImmobilie;
                rhsImmobilie = (((that.immobilie!= null)&&(!that.immobilie.isEmpty()))?that.getImmobilie():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "immobilie", lhsImmobilie), LocatorUtils.property(thatLocator, "immobilie", rhsImmobilie), lhsImmobilie, rhsImmobilie, ((this.immobilie!= null)&&(!this.immobilie.isEmpty())), ((that.immobilie!= null)&&(!that.immobilie.isEmpty())))) {
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

}
