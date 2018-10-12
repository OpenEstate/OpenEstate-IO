
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.net.URI;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for KontaktAdresseTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KontaktAdresseTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}AdresseBaseTyp"&gt;
 *       &lt;attribute name="Anrede" type="{http://www.immobilienscout24.de/immobilientransfer}Text20Typ" /&gt;
 *       &lt;attribute name="Vorname" type="{http://www.immobilienscout24.de/immobilientransfer}Text30Typ" /&gt;
 *       &lt;attribute name="Nachname" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *       &lt;attribute name="Telefon" type="{http://www.immobilienscout24.de/immobilientransfer}Text40Typ" /&gt;
 *       &lt;attribute name="Mobiltelefon" type="{http://www.immobilienscout24.de/immobilientransfer}Text40Typ" /&gt;
 *       &lt;attribute name="Telefax" type="{http://www.immobilienscout24.de/immobilientransfer}Text40Typ" /&gt;
 *       &lt;attribute name="EMail" type="{http://www.immobilienscout24.de/immobilientransfer}EmailTyp" /&gt;
 *       &lt;attribute name="Homepage" type="{http://www.immobilienscout24.de/immobilientransfer}WebUrlTyp" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KontaktAdresseTyp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public class KontaktAdresseTyp
    extends AdresseBaseTyp
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "Anrede")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String anrede;
    @XmlAttribute(name = "Vorname")
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String vorname;
    @XmlAttribute(name = "Nachname")
    @XmlJavaTypeAdapter(Adapter7 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String nachname;
    @XmlAttribute(name = "Telefon")
    @XmlJavaTypeAdapter(Adapter6 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String telefon;
    @XmlAttribute(name = "Mobiltelefon")
    @XmlJavaTypeAdapter(Adapter6 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String mobiltelefon;
    @XmlAttribute(name = "Telefax")
    @XmlJavaTypeAdapter(Adapter6 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String telefax;
    @XmlAttribute(name = "EMail")
    @XmlJavaTypeAdapter(Adapter16 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected String eMail;
    @XmlAttribute(name = "Homepage")
    @XmlJavaTypeAdapter(Adapter17 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    protected URI homepage;

    /**
     * Gets the value of the anrede property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getAnrede() {
        return anrede;
    }

    /**
     * Sets the value of the anrede property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setAnrede(String value) {
        this.anrede = value;
    }

    /**
     * Gets the value of the vorname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getVorname() {
        return vorname;
    }

    /**
     * Sets the value of the vorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setVorname(String value) {
        this.vorname = value;
    }

    /**
     * Gets the value of the nachname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getNachname() {
        return nachname;
    }

    /**
     * Sets the value of the nachname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setNachname(String value) {
        this.nachname = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the mobiltelefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getMobiltelefon() {
        return mobiltelefon;
    }

    /**
     * Sets the value of the mobiltelefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setMobiltelefon(String value) {
        this.mobiltelefon = value;
    }

    /**
     * Gets the value of the telefax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getTelefax() {
        return telefax;
    }

    /**
     * Sets the value of the telefax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setTelefax(String value) {
        this.telefax = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the homepage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public URI getHomepage() {
        return homepage;
    }

    /**
     * Sets the value of the homepage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public void setHomepage(URI value) {
        this.homepage = value;
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
            String theAnrede;
            theAnrede = this.getAnrede();
            strategy.appendField(locator, this, "anrede", buffer, theAnrede, (this.anrede!= null));
        }
        {
            String theVorname;
            theVorname = this.getVorname();
            strategy.appendField(locator, this, "vorname", buffer, theVorname, (this.vorname!= null));
        }
        {
            String theNachname;
            theNachname = this.getNachname();
            strategy.appendField(locator, this, "nachname", buffer, theNachname, (this.nachname!= null));
        }
        {
            String theTelefon;
            theTelefon = this.getTelefon();
            strategy.appendField(locator, this, "telefon", buffer, theTelefon, (this.telefon!= null));
        }
        {
            String theMobiltelefon;
            theMobiltelefon = this.getMobiltelefon();
            strategy.appendField(locator, this, "mobiltelefon", buffer, theMobiltelefon, (this.mobiltelefon!= null));
        }
        {
            String theTelefax;
            theTelefax = this.getTelefax();
            strategy.appendField(locator, this, "telefax", buffer, theTelefax, (this.telefax!= null));
        }
        {
            String theEMail;
            theEMail = this.getEMail();
            strategy.appendField(locator, this, "eMail", buffer, theEMail, (this.eMail!= null));
        }
        {
            URI theHomepage;
            theHomepage = this.getHomepage();
            strategy.appendField(locator, this, "homepage", buffer, theHomepage, (this.homepage!= null));
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
        if (draftCopy instanceof KontaktAdresseTyp) {
            final KontaktAdresseTyp copy = ((KontaktAdresseTyp) draftCopy);
            {
                Boolean anredeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anrede!= null));
                if (anredeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAnrede;
                    sourceAnrede = this.getAnrede();
                    String copyAnrede = ((String) strategy.copy(LocatorUtils.property(locator, "anrede", sourceAnrede), sourceAnrede, (this.anrede!= null)));
                    copy.setAnrede(copyAnrede);
                } else {
                    if (anredeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anrede = null;
                    }
                }
            }
            {
                Boolean vornameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vorname!= null));
                if (vornameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVorname;
                    sourceVorname = this.getVorname();
                    String copyVorname = ((String) strategy.copy(LocatorUtils.property(locator, "vorname", sourceVorname), sourceVorname, (this.vorname!= null)));
                    copy.setVorname(copyVorname);
                } else {
                    if (vornameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vorname = null;
                    }
                }
            }
            {
                Boolean nachnameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nachname!= null));
                if (nachnameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNachname;
                    sourceNachname = this.getNachname();
                    String copyNachname = ((String) strategy.copy(LocatorUtils.property(locator, "nachname", sourceNachname), sourceNachname, (this.nachname!= null)));
                    copy.setNachname(copyNachname);
                } else {
                    if (nachnameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nachname = null;
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
                Boolean mobiltelefonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mobiltelefon!= null));
                if (mobiltelefonShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMobiltelefon;
                    sourceMobiltelefon = this.getMobiltelefon();
                    String copyMobiltelefon = ((String) strategy.copy(LocatorUtils.property(locator, "mobiltelefon", sourceMobiltelefon), sourceMobiltelefon, (this.mobiltelefon!= null)));
                    copy.setMobiltelefon(copyMobiltelefon);
                } else {
                    if (mobiltelefonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mobiltelefon = null;
                    }
                }
            }
            {
                Boolean telefaxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.telefax!= null));
                if (telefaxShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTelefax;
                    sourceTelefax = this.getTelefax();
                    String copyTelefax = ((String) strategy.copy(LocatorUtils.property(locator, "telefax", sourceTelefax), sourceTelefax, (this.telefax!= null)));
                    copy.setTelefax(copyTelefax);
                } else {
                    if (telefaxShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.telefax = null;
                    }
                }
            }
            {
                Boolean eMailShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.eMail!= null));
                if (eMailShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEMail;
                    sourceEMail = this.getEMail();
                    String copyEMail = ((String) strategy.copy(LocatorUtils.property(locator, "eMail", sourceEMail), sourceEMail, (this.eMail!= null)));
                    copy.setEMail(copyEMail);
                } else {
                    if (eMailShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eMail = null;
                    }
                }
            }
            {
                Boolean homepageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.homepage!= null));
                if (homepageShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceHomepage;
                    sourceHomepage = this.getHomepage();
                    URI copyHomepage = ((URI) strategy.copy(LocatorUtils.property(locator, "homepage", sourceHomepage), sourceHomepage, (this.homepage!= null)));
                    copy.setHomepage(copyHomepage);
                } else {
                    if (homepageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.homepage = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new KontaktAdresseTyp();
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
        final KontaktAdresseTyp that = ((KontaktAdresseTyp) object);
        {
            String lhsAnrede;
            lhsAnrede = this.getAnrede();
            String rhsAnrede;
            rhsAnrede = that.getAnrede();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anrede", lhsAnrede), LocatorUtils.property(thatLocator, "anrede", rhsAnrede), lhsAnrede, rhsAnrede, (this.anrede!= null), (that.anrede!= null))) {
                return false;
            }
        }
        {
            String lhsVorname;
            lhsVorname = this.getVorname();
            String rhsVorname;
            rhsVorname = that.getVorname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorname", lhsVorname), LocatorUtils.property(thatLocator, "vorname", rhsVorname), lhsVorname, rhsVorname, (this.vorname!= null), (that.vorname!= null))) {
                return false;
            }
        }
        {
            String lhsNachname;
            lhsNachname = this.getNachname();
            String rhsNachname;
            rhsNachname = that.getNachname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nachname", lhsNachname), LocatorUtils.property(thatLocator, "nachname", rhsNachname), lhsNachname, rhsNachname, (this.nachname!= null), (that.nachname!= null))) {
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
            String lhsMobiltelefon;
            lhsMobiltelefon = this.getMobiltelefon();
            String rhsMobiltelefon;
            rhsMobiltelefon = that.getMobiltelefon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mobiltelefon", lhsMobiltelefon), LocatorUtils.property(thatLocator, "mobiltelefon", rhsMobiltelefon), lhsMobiltelefon, rhsMobiltelefon, (this.mobiltelefon!= null), (that.mobiltelefon!= null))) {
                return false;
            }
        }
        {
            String lhsTelefax;
            lhsTelefax = this.getTelefax();
            String rhsTelefax;
            rhsTelefax = that.getTelefax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telefax", lhsTelefax), LocatorUtils.property(thatLocator, "telefax", rhsTelefax), lhsTelefax, rhsTelefax, (this.telefax!= null), (that.telefax!= null))) {
                return false;
            }
        }
        {
            String lhsEMail;
            lhsEMail = this.getEMail();
            String rhsEMail;
            rhsEMail = that.getEMail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eMail", lhsEMail), LocatorUtils.property(thatLocator, "eMail", rhsEMail), lhsEMail, rhsEMail, (this.eMail!= null), (that.eMail!= null))) {
                return false;
            }
        }
        {
            URI lhsHomepage;
            lhsHomepage = this.getHomepage();
            URI rhsHomepage;
            rhsHomepage = that.getHomepage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homepage", lhsHomepage), LocatorUtils.property(thatLocator, "homepage", rhsHomepage), lhsHomepage, rhsHomepage, (this.homepage!= null), (that.homepage!= null))) {
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
