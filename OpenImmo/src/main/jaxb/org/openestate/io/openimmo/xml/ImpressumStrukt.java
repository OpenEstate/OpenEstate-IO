
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 * Java class for &lt;impressum_strukt&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "firmenname",
    "firmenanschrift",
    "telefon",
    "vertretungsberechtigter",
    "berufsaufsichtsbehoerde",
    "handelsregister",
    "handelsregisterNr",
    "umsstId",
    "steuernummer",
    "weiteres"
})
@XmlRootElement(name = "impressum_strukt")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
public class ImpressumStrukt implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String firmenname;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String firmenanschrift;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String telefon;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String vertretungsberechtigter;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String berufsaufsichtsbehoerde;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String handelsregister;
    @XmlElement(name = "handelsregister_nr", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String handelsregisterNr;
    @XmlElement(name = "umsst-id", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String umsstId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String steuernummer;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String weiteres;

    /**
     * Gets the value of the firmenname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getFirmenname() {
        return firmenname;
    }

    /**
     * Sets the value of the firmenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setFirmenname(String value) {
        this.firmenname = value;
    }

    /**
     * Gets the value of the firmenanschrift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getFirmenanschrift() {
        return firmenanschrift;
    }

    /**
     * Sets the value of the firmenanschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setFirmenanschrift(String value) {
        this.firmenanschrift = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the vertretungsberechtigter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getVertretungsberechtigter() {
        return vertretungsberechtigter;
    }

    /**
     * Sets the value of the vertretungsberechtigter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setVertretungsberechtigter(String value) {
        this.vertretungsberechtigter = value;
    }

    /**
     * Gets the value of the berufsaufsichtsbehoerde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getBerufsaufsichtsbehoerde() {
        return berufsaufsichtsbehoerde;
    }

    /**
     * Sets the value of the berufsaufsichtsbehoerde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setBerufsaufsichtsbehoerde(String value) {
        this.berufsaufsichtsbehoerde = value;
    }

    /**
     * Gets the value of the handelsregister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getHandelsregister() {
        return handelsregister;
    }

    /**
     * Sets the value of the handelsregister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setHandelsregister(String value) {
        this.handelsregister = value;
    }

    /**
     * Gets the value of the handelsregisterNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getHandelsregisterNr() {
        return handelsregisterNr;
    }

    /**
     * Sets the value of the handelsregisterNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setHandelsregisterNr(String value) {
        this.handelsregisterNr = value;
    }

    /**
     * Gets the value of the umsstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getUmsstId() {
        return umsstId;
    }

    /**
     * Sets the value of the umsstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setUmsstId(String value) {
        this.umsstId = value;
    }

    /**
     * Gets the value of the steuernummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getSteuernummer() {
        return steuernummer;
    }

    /**
     * Sets the value of the steuernummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setSteuernummer(String value) {
        this.steuernummer = value;
    }

    /**
     * Gets the value of the weiteres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getWeiteres() {
        return weiteres;
    }

    /**
     * Sets the value of the weiteres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setWeiteres(String value) {
        this.weiteres = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theFirmenname;
            theFirmenname = this.getFirmenname();
            strategy.appendField(locator, this, "firmenname", buffer, theFirmenname, (this.firmenname!= null));
        }
        {
            String theFirmenanschrift;
            theFirmenanschrift = this.getFirmenanschrift();
            strategy.appendField(locator, this, "firmenanschrift", buffer, theFirmenanschrift, (this.firmenanschrift!= null));
        }
        {
            String theTelefon;
            theTelefon = this.getTelefon();
            strategy.appendField(locator, this, "telefon", buffer, theTelefon, (this.telefon!= null));
        }
        {
            String theVertretungsberechtigter;
            theVertretungsberechtigter = this.getVertretungsberechtigter();
            strategy.appendField(locator, this, "vertretungsberechtigter", buffer, theVertretungsberechtigter, (this.vertretungsberechtigter!= null));
        }
        {
            String theBerufsaufsichtsbehoerde;
            theBerufsaufsichtsbehoerde = this.getBerufsaufsichtsbehoerde();
            strategy.appendField(locator, this, "berufsaufsichtsbehoerde", buffer, theBerufsaufsichtsbehoerde, (this.berufsaufsichtsbehoerde!= null));
        }
        {
            String theHandelsregister;
            theHandelsregister = this.getHandelsregister();
            strategy.appendField(locator, this, "handelsregister", buffer, theHandelsregister, (this.handelsregister!= null));
        }
        {
            String theHandelsregisterNr;
            theHandelsregisterNr = this.getHandelsregisterNr();
            strategy.appendField(locator, this, "handelsregisterNr", buffer, theHandelsregisterNr, (this.handelsregisterNr!= null));
        }
        {
            String theUmsstId;
            theUmsstId = this.getUmsstId();
            strategy.appendField(locator, this, "umsstId", buffer, theUmsstId, (this.umsstId!= null));
        }
        {
            String theSteuernummer;
            theSteuernummer = this.getSteuernummer();
            strategy.appendField(locator, this, "steuernummer", buffer, theSteuernummer, (this.steuernummer!= null));
        }
        {
            String theWeiteres;
            theWeiteres = this.getWeiteres();
            strategy.appendField(locator, this, "weiteres", buffer, theWeiteres, (this.weiteres!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ImpressumStrukt) {
            final ImpressumStrukt copy = ((ImpressumStrukt) draftCopy);
            {
                Boolean firmennameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.firmenname!= null));
                if (firmennameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFirmenname;
                    sourceFirmenname = this.getFirmenname();
                    String copyFirmenname = ((String) strategy.copy(LocatorUtils.property(locator, "firmenname", sourceFirmenname), sourceFirmenname, (this.firmenname!= null)));
                    copy.setFirmenname(copyFirmenname);
                } else {
                    if (firmennameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firmenname = null;
                    }
                }
            }
            {
                Boolean firmenanschriftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.firmenanschrift!= null));
                if (firmenanschriftShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFirmenanschrift;
                    sourceFirmenanschrift = this.getFirmenanschrift();
                    String copyFirmenanschrift = ((String) strategy.copy(LocatorUtils.property(locator, "firmenanschrift", sourceFirmenanschrift), sourceFirmenanschrift, (this.firmenanschrift!= null)));
                    copy.setFirmenanschrift(copyFirmenanschrift);
                } else {
                    if (firmenanschriftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firmenanschrift = null;
                    }
                }
            }
            {
                Boolean telefonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.telefon!= null));
                if (telefonShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTelefon;
                    sourceTelefon = this.getTelefon();
                    String copyTelefon = ((String) strategy.copy(LocatorUtils.property(locator, "telefon", sourceTelefon), sourceTelefon, (this.telefon!= null)));
                    copy.setTelefon(copyTelefon);
                } else {
                    if (telefonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.telefon = null;
                    }
                }
            }
            {
                Boolean vertretungsberechtigterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vertretungsberechtigter!= null));
                if (vertretungsberechtigterShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVertretungsberechtigter;
                    sourceVertretungsberechtigter = this.getVertretungsberechtigter();
                    String copyVertretungsberechtigter = ((String) strategy.copy(LocatorUtils.property(locator, "vertretungsberechtigter", sourceVertretungsberechtigter), sourceVertretungsberechtigter, (this.vertretungsberechtigter!= null)));
                    copy.setVertretungsberechtigter(copyVertretungsberechtigter);
                } else {
                    if (vertretungsberechtigterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertretungsberechtigter = null;
                    }
                }
            }
            {
                Boolean berufsaufsichtsbehoerdeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.berufsaufsichtsbehoerde!= null));
                if (berufsaufsichtsbehoerdeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBerufsaufsichtsbehoerde;
                    sourceBerufsaufsichtsbehoerde = this.getBerufsaufsichtsbehoerde();
                    String copyBerufsaufsichtsbehoerde = ((String) strategy.copy(LocatorUtils.property(locator, "berufsaufsichtsbehoerde", sourceBerufsaufsichtsbehoerde), sourceBerufsaufsichtsbehoerde, (this.berufsaufsichtsbehoerde!= null)));
                    copy.setBerufsaufsichtsbehoerde(copyBerufsaufsichtsbehoerde);
                } else {
                    if (berufsaufsichtsbehoerdeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.berufsaufsichtsbehoerde = null;
                    }
                }
            }
            {
                Boolean handelsregisterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.handelsregister!= null));
                if (handelsregisterShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHandelsregister;
                    sourceHandelsregister = this.getHandelsregister();
                    String copyHandelsregister = ((String) strategy.copy(LocatorUtils.property(locator, "handelsregister", sourceHandelsregister), sourceHandelsregister, (this.handelsregister!= null)));
                    copy.setHandelsregister(copyHandelsregister);
                } else {
                    if (handelsregisterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.handelsregister = null;
                    }
                }
            }
            {
                Boolean handelsregisterNrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.handelsregisterNr!= null));
                if (handelsregisterNrShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHandelsregisterNr;
                    sourceHandelsregisterNr = this.getHandelsregisterNr();
                    String copyHandelsregisterNr = ((String) strategy.copy(LocatorUtils.property(locator, "handelsregisterNr", sourceHandelsregisterNr), sourceHandelsregisterNr, (this.handelsregisterNr!= null)));
                    copy.setHandelsregisterNr(copyHandelsregisterNr);
                } else {
                    if (handelsregisterNrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.handelsregisterNr = null;
                    }
                }
            }
            {
                Boolean umsstIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.umsstId!= null));
                if (umsstIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUmsstId;
                    sourceUmsstId = this.getUmsstId();
                    String copyUmsstId = ((String) strategy.copy(LocatorUtils.property(locator, "umsstId", sourceUmsstId), sourceUmsstId, (this.umsstId!= null)));
                    copy.setUmsstId(copyUmsstId);
                } else {
                    if (umsstIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.umsstId = null;
                    }
                }
            }
            {
                Boolean steuernummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.steuernummer!= null));
                if (steuernummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSteuernummer;
                    sourceSteuernummer = this.getSteuernummer();
                    String copySteuernummer = ((String) strategy.copy(LocatorUtils.property(locator, "steuernummer", sourceSteuernummer), sourceSteuernummer, (this.steuernummer!= null)));
                    copy.setSteuernummer(copySteuernummer);
                } else {
                    if (steuernummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.steuernummer = null;
                    }
                }
            }
            {
                Boolean weiteresShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.weiteres!= null));
                if (weiteresShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceWeiteres;
                    sourceWeiteres = this.getWeiteres();
                    String copyWeiteres = ((String) strategy.copy(LocatorUtils.property(locator, "weiteres", sourceWeiteres), sourceWeiteres, (this.weiteres!= null)));
                    copy.setWeiteres(copyWeiteres);
                } else {
                    if (weiteresShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.weiteres = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new ImpressumStrukt();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ImpressumStrukt that = ((ImpressumStrukt) object);
        {
            String lhsFirmenname;
            lhsFirmenname = this.getFirmenname();
            String rhsFirmenname;
            rhsFirmenname = that.getFirmenname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firmenname", lhsFirmenname), LocatorUtils.property(thatLocator, "firmenname", rhsFirmenname), lhsFirmenname, rhsFirmenname, (this.firmenname!= null), (that.firmenname!= null))) {
                return false;
            }
        }
        {
            String lhsFirmenanschrift;
            lhsFirmenanschrift = this.getFirmenanschrift();
            String rhsFirmenanschrift;
            rhsFirmenanschrift = that.getFirmenanschrift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firmenanschrift", lhsFirmenanschrift), LocatorUtils.property(thatLocator, "firmenanschrift", rhsFirmenanschrift), lhsFirmenanschrift, rhsFirmenanschrift, (this.firmenanschrift!= null), (that.firmenanschrift!= null))) {
                return false;
            }
        }
        {
            String lhsTelefon;
            lhsTelefon = this.getTelefon();
            String rhsTelefon;
            rhsTelefon = that.getTelefon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telefon", lhsTelefon), LocatorUtils.property(thatLocator, "telefon", rhsTelefon), lhsTelefon, rhsTelefon, (this.telefon!= null), (that.telefon!= null))) {
                return false;
            }
        }
        {
            String lhsVertretungsberechtigter;
            lhsVertretungsberechtigter = this.getVertretungsberechtigter();
            String rhsVertretungsberechtigter;
            rhsVertretungsberechtigter = that.getVertretungsberechtigter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertretungsberechtigter", lhsVertretungsberechtigter), LocatorUtils.property(thatLocator, "vertretungsberechtigter", rhsVertretungsberechtigter), lhsVertretungsberechtigter, rhsVertretungsberechtigter, (this.vertretungsberechtigter!= null), (that.vertretungsberechtigter!= null))) {
                return false;
            }
        }
        {
            String lhsBerufsaufsichtsbehoerde;
            lhsBerufsaufsichtsbehoerde = this.getBerufsaufsichtsbehoerde();
            String rhsBerufsaufsichtsbehoerde;
            rhsBerufsaufsichtsbehoerde = that.getBerufsaufsichtsbehoerde();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "berufsaufsichtsbehoerde", lhsBerufsaufsichtsbehoerde), LocatorUtils.property(thatLocator, "berufsaufsichtsbehoerde", rhsBerufsaufsichtsbehoerde), lhsBerufsaufsichtsbehoerde, rhsBerufsaufsichtsbehoerde, (this.berufsaufsichtsbehoerde!= null), (that.berufsaufsichtsbehoerde!= null))) {
                return false;
            }
        }
        {
            String lhsHandelsregister;
            lhsHandelsregister = this.getHandelsregister();
            String rhsHandelsregister;
            rhsHandelsregister = that.getHandelsregister();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handelsregister", lhsHandelsregister), LocatorUtils.property(thatLocator, "handelsregister", rhsHandelsregister), lhsHandelsregister, rhsHandelsregister, (this.handelsregister!= null), (that.handelsregister!= null))) {
                return false;
            }
        }
        {
            String lhsHandelsregisterNr;
            lhsHandelsregisterNr = this.getHandelsregisterNr();
            String rhsHandelsregisterNr;
            rhsHandelsregisterNr = that.getHandelsregisterNr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handelsregisterNr", lhsHandelsregisterNr), LocatorUtils.property(thatLocator, "handelsregisterNr", rhsHandelsregisterNr), lhsHandelsregisterNr, rhsHandelsregisterNr, (this.handelsregisterNr!= null), (that.handelsregisterNr!= null))) {
                return false;
            }
        }
        {
            String lhsUmsstId;
            lhsUmsstId = this.getUmsstId();
            String rhsUmsstId;
            rhsUmsstId = that.getUmsstId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "umsstId", lhsUmsstId), LocatorUtils.property(thatLocator, "umsstId", rhsUmsstId), lhsUmsstId, rhsUmsstId, (this.umsstId!= null), (that.umsstId!= null))) {
                return false;
            }
        }
        {
            String lhsSteuernummer;
            lhsSteuernummer = this.getSteuernummer();
            String rhsSteuernummer;
            rhsSteuernummer = that.getSteuernummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "steuernummer", lhsSteuernummer), LocatorUtils.property(thatLocator, "steuernummer", rhsSteuernummer), lhsSteuernummer, rhsSteuernummer, (this.steuernummer!= null), (that.steuernummer!= null))) {
                return false;
            }
        }
        {
            String lhsWeiteres;
            lhsWeiteres = this.getWeiteres();
            String rhsWeiteres;
            rhsWeiteres = that.getWeiteres();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weiteres", lhsWeiteres), LocatorUtils.property(thatLocator, "weiteres", rhsWeiteres), lhsWeiteres, rhsWeiteres, (this.weiteres!= null), (that.weiteres!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
