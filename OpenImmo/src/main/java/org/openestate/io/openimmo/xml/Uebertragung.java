
package org.openestate.io.openimmo.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * Java class for &lt;uebertragung&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "uebertragung")
public class Uebertragung implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "art", required = true)
    protected Uebertragung.Art art;
    @XmlAttribute(name = "umfang", required = true)
    protected Uebertragung.Umfang umfang;
    @XmlAttribute(name = "modus")
    protected Uebertragung.Modus modus;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "sendersoftware", required = true)
    protected String sendersoftware;
    @XmlAttribute(name = "senderversion", required = true)
    protected String senderversion;
    @XmlAttribute(name = "techn_email")
    protected String technEmail;
    @XmlAttribute(name = "regi_id")
    protected String regiId;
    @XmlAttribute(name = "timestamp")
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar timestamp;

    /**
     * Gets the value of the art property.
     *
     * @return
     *     possible object is
     *     {@link Uebertragung.Art }
     *
     */
    public Uebertragung.Art getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     *
     * @param value
     *     allowed object is
     *     {@link Uebertragung.Art }
     *
     */
    public void setArt(Uebertragung.Art value) {
        this.art = value;
    }

    /**
     * Gets the value of the umfang property.
     *
     * @return
     *     possible object is
     *     {@link Uebertragung.Umfang }
     *
     */
    public Uebertragung.Umfang getUmfang() {
        return umfang;
    }

    /**
     * Sets the value of the umfang property.
     *
     * @param value
     *     allowed object is
     *     {@link Uebertragung.Umfang }
     *
     */
    public void setUmfang(Uebertragung.Umfang value) {
        this.umfang = value;
    }

    /**
     * Gets the value of the modus property.
     *
     * @return
     *     possible object is
     *     {@link Uebertragung.Modus }
     *
     */
    public Uebertragung.Modus getModus() {
        return modus;
    }

    /**
     * Sets the value of the modus property.
     *
     * @param value
     *     allowed object is
     *     {@link Uebertragung.Modus }
     *
     */
    public void setModus(Uebertragung.Modus value) {
        this.modus = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the sendersoftware property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSendersoftware() {
        return sendersoftware;
    }

    /**
     * Sets the value of the sendersoftware property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSendersoftware(String value) {
        this.sendersoftware = value;
    }

    /**
     * Gets the value of the senderversion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSenderversion() {
        return senderversion;
    }

    /**
     * Sets the value of the senderversion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSenderversion(String value) {
        this.senderversion = value;
    }

    /**
     * Gets the value of the technEmail property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTechnEmail() {
        return technEmail;
    }

    /**
     * Sets the value of the technEmail property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTechnEmail(String value) {
        this.technEmail = value;
    }

    /**
     * Gets the value of the regiId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegiId() {
        return regiId;
    }

    /**
     * Sets the value of the regiId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegiId(String value) {
        this.regiId = value;
    }

    /**
     * Gets the value of the timestamp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Calendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTimestamp(Calendar value) {
        this.timestamp = value;
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
            Uebertragung.Art theArt;
            theArt = this.getArt();
            strategy.appendField(locator, this, "art", buffer, theArt, (this.art!= null));
        }
        {
            Uebertragung.Umfang theUmfang;
            theUmfang = this.getUmfang();
            strategy.appendField(locator, this, "umfang", buffer, theUmfang, (this.umfang!= null));
        }
        {
            Uebertragung.Modus theModus;
            theModus = this.getModus();
            strategy.appendField(locator, this, "modus", buffer, theModus, (this.modus!= null));
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion, (this.version!= null));
        }
        {
            String theSendersoftware;
            theSendersoftware = this.getSendersoftware();
            strategy.appendField(locator, this, "sendersoftware", buffer, theSendersoftware, (this.sendersoftware!= null));
        }
        {
            String theSenderversion;
            theSenderversion = this.getSenderversion();
            strategy.appendField(locator, this, "senderversion", buffer, theSenderversion, (this.senderversion!= null));
        }
        {
            String theTechnEmail;
            theTechnEmail = this.getTechnEmail();
            strategy.appendField(locator, this, "technEmail", buffer, theTechnEmail, (this.technEmail!= null));
        }
        {
            String theRegiId;
            theRegiId = this.getRegiId();
            strategy.appendField(locator, this, "regiId", buffer, theRegiId, (this.regiId!= null));
        }
        {
            Calendar theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp, (this.timestamp!= null));
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
        if (draftCopy instanceof Uebertragung) {
            final Uebertragung copy = ((Uebertragung) draftCopy);
            {
                Boolean artShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.art!= null));
                if (artShouldBeCopiedAndSet == Boolean.TRUE) {
                    Uebertragung.Art sourceArt;
                    sourceArt = this.getArt();
                    Uebertragung.Art copyArt = ((Uebertragung.Art) strategy.copy(LocatorUtils.property(locator, "art", sourceArt), sourceArt, (this.art!= null)));
                    copy.setArt(copyArt);
                } else {
                    if (artShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.art = null;
                    }
                }
            }
            {
                Boolean umfangShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.umfang!= null));
                if (umfangShouldBeCopiedAndSet == Boolean.TRUE) {
                    Uebertragung.Umfang sourceUmfang;
                    sourceUmfang = this.getUmfang();
                    Uebertragung.Umfang copyUmfang = ((Uebertragung.Umfang) strategy.copy(LocatorUtils.property(locator, "umfang", sourceUmfang), sourceUmfang, (this.umfang!= null)));
                    copy.setUmfang(copyUmfang);
                } else {
                    if (umfangShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.umfang = null;
                    }
                }
            }
            {
                Boolean modusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.modus!= null));
                if (modusShouldBeCopiedAndSet == Boolean.TRUE) {
                    Uebertragung.Modus sourceModus;
                    sourceModus = this.getModus();
                    Uebertragung.Modus copyModus = ((Uebertragung.Modus) strategy.copy(LocatorUtils.property(locator, "modus", sourceModus), sourceModus, (this.modus!= null)));
                    copy.setModus(copyModus);
                } else {
                    if (modusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.modus = null;
                    }
                }
            }
            {
                Boolean versionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.version!= null));
                if (versionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVersion;
                    sourceVersion = this.getVersion();
                    String copyVersion = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion, (this.version!= null)));
                    copy.setVersion(copyVersion);
                } else {
                    if (versionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.version = null;
                    }
                }
            }
            {
                Boolean sendersoftwareShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sendersoftware!= null));
                if (sendersoftwareShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSendersoftware;
                    sourceSendersoftware = this.getSendersoftware();
                    String copySendersoftware = ((String) strategy.copy(LocatorUtils.property(locator, "sendersoftware", sourceSendersoftware), sourceSendersoftware, (this.sendersoftware!= null)));
                    copy.setSendersoftware(copySendersoftware);
                } else {
                    if (sendersoftwareShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sendersoftware = null;
                    }
                }
            }
            {
                Boolean senderversionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.senderversion!= null));
                if (senderversionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSenderversion;
                    sourceSenderversion = this.getSenderversion();
                    String copySenderversion = ((String) strategy.copy(LocatorUtils.property(locator, "senderversion", sourceSenderversion), sourceSenderversion, (this.senderversion!= null)));
                    copy.setSenderversion(copySenderversion);
                } else {
                    if (senderversionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.senderversion = null;
                    }
                }
            }
            {
                Boolean technEmailShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.technEmail!= null));
                if (technEmailShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTechnEmail;
                    sourceTechnEmail = this.getTechnEmail();
                    String copyTechnEmail = ((String) strategy.copy(LocatorUtils.property(locator, "technEmail", sourceTechnEmail), sourceTechnEmail, (this.technEmail!= null)));
                    copy.setTechnEmail(copyTechnEmail);
                } else {
                    if (technEmailShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.technEmail = null;
                    }
                }
            }
            {
                Boolean regiIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.regiId!= null));
                if (regiIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRegiId;
                    sourceRegiId = this.getRegiId();
                    String copyRegiId = ((String) strategy.copy(LocatorUtils.property(locator, "regiId", sourceRegiId), sourceRegiId, (this.regiId!= null)));
                    copy.setRegiId(copyRegiId);
                } else {
                    if (regiIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.regiId = null;
                    }
                }
            }
            {
                Boolean timestampShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.timestamp!= null));
                if (timestampShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceTimestamp;
                    sourceTimestamp = this.getTimestamp();
                    Calendar copyTimestamp = ((Calendar) strategy.copy(LocatorUtils.property(locator, "timestamp", sourceTimestamp), sourceTimestamp, (this.timestamp!= null)));
                    copy.setTimestamp(copyTimestamp);
                } else {
                    if (timestampShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.timestamp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Uebertragung();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Uebertragung that = ((Uebertragung) object);
        {
            Uebertragung.Art lhsArt;
            lhsArt = this.getArt();
            Uebertragung.Art rhsArt;
            rhsArt = that.getArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "art", lhsArt), LocatorUtils.property(thatLocator, "art", rhsArt), lhsArt, rhsArt, (this.art!= null), (that.art!= null))) {
                return false;
            }
        }
        {
            Uebertragung.Umfang lhsUmfang;
            lhsUmfang = this.getUmfang();
            Uebertragung.Umfang rhsUmfang;
            rhsUmfang = that.getUmfang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "umfang", lhsUmfang), LocatorUtils.property(thatLocator, "umfang", rhsUmfang), lhsUmfang, rhsUmfang, (this.umfang!= null), (that.umfang!= null))) {
                return false;
            }
        }
        {
            Uebertragung.Modus lhsModus;
            lhsModus = this.getModus();
            Uebertragung.Modus rhsModus;
            rhsModus = that.getModus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modus", lhsModus), LocatorUtils.property(thatLocator, "modus", rhsModus), lhsModus, rhsModus, (this.modus!= null), (that.modus!= null))) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion, (this.version!= null), (that.version!= null))) {
                return false;
            }
        }
        {
            String lhsSendersoftware;
            lhsSendersoftware = this.getSendersoftware();
            String rhsSendersoftware;
            rhsSendersoftware = that.getSendersoftware();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendersoftware", lhsSendersoftware), LocatorUtils.property(thatLocator, "sendersoftware", rhsSendersoftware), lhsSendersoftware, rhsSendersoftware, (this.sendersoftware!= null), (that.sendersoftware!= null))) {
                return false;
            }
        }
        {
            String lhsSenderversion;
            lhsSenderversion = this.getSenderversion();
            String rhsSenderversion;
            rhsSenderversion = that.getSenderversion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "senderversion", lhsSenderversion), LocatorUtils.property(thatLocator, "senderversion", rhsSenderversion), lhsSenderversion, rhsSenderversion, (this.senderversion!= null), (that.senderversion!= null))) {
                return false;
            }
        }
        {
            String lhsTechnEmail;
            lhsTechnEmail = this.getTechnEmail();
            String rhsTechnEmail;
            rhsTechnEmail = that.getTechnEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "technEmail", lhsTechnEmail), LocatorUtils.property(thatLocator, "technEmail", rhsTechnEmail), lhsTechnEmail, rhsTechnEmail, (this.technEmail!= null), (that.technEmail!= null))) {
                return false;
            }
        }
        {
            String lhsRegiId;
            lhsRegiId = this.getRegiId();
            String rhsRegiId;
            rhsRegiId = that.getRegiId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regiId", lhsRegiId), LocatorUtils.property(thatLocator, "regiId", rhsRegiId), lhsRegiId, rhsRegiId, (this.regiId!= null), (that.regiId!= null))) {
                return false;
            }
        }
        {
            Calendar lhsTimestamp;
            lhsTimestamp = this.getTimestamp();
            Calendar rhsTimestamp;
            rhsTimestamp = that.getTimestamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timestamp", lhsTimestamp), LocatorUtils.property(thatLocator, "timestamp", rhsTimestamp), lhsTimestamp, rhsTimestamp, (this.timestamp!= null), (that.timestamp!= null))) {
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
     * Java enum for <em>art</em> attribute in &lt;uebertragung&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Art {

        ONLINE,
        OFFLINE;

        public String value() {
            return name();
        }

        public static Uebertragung.Art fromValue(String v) {
            return valueOf(v);
        }

    }


    /**
     * Java enum for <em>modus</em> attribute in &lt;uebertragung&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Modus {

        NEW,
        CHANGE,
        DELETE;

        public String value() {
            return name();
        }

        public static Uebertragung.Modus fromValue(String v) {
            return valueOf(v);
        }

    }


    /**
     * Java enum for <em>umfang</em> attribute in &lt;uebertragung&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Umfang {

        TEIL,
        VOLL;

        public String value() {
            return name();
        }

        public static Uebertragung.Umfang fromValue(String v) {
            return valueOf(v);
        }

    }

}