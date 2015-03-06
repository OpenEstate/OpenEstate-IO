
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
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="art" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ONLINE"/>
 *             &lt;enumeration value="OFFLINE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="umfang" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="TEIL"/>
 *             &lt;enumeration value="VOLL"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="modus">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="NEW"/>
 *             &lt;enumeration value="CHANGE"/>
 *             &lt;enumeration value="DELETE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sendersoftware" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="senderversion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="techn_email" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="regi_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "uebertragung")
public class Uebertragung
    implements Cloneable, CopyTo, Equals, ToString
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
    @XmlJavaTypeAdapter(Adapter1 .class)
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
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            Uebertragung.Art theArt;
            theArt = this.getArt();
            strategy.appendField(locator, this, "art", buffer, theArt);
        }
        {
            Uebertragung.Umfang theUmfang;
            theUmfang = this.getUmfang();
            strategy.appendField(locator, this, "umfang", buffer, theUmfang);
        }
        {
            Uebertragung.Modus theModus;
            theModus = this.getModus();
            strategy.appendField(locator, this, "modus", buffer, theModus);
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        {
            String theSendersoftware;
            theSendersoftware = this.getSendersoftware();
            strategy.appendField(locator, this, "sendersoftware", buffer, theSendersoftware);
        }
        {
            String theSenderversion;
            theSenderversion = this.getSenderversion();
            strategy.appendField(locator, this, "senderversion", buffer, theSenderversion);
        }
        {
            String theTechnEmail;
            theTechnEmail = this.getTechnEmail();
            strategy.appendField(locator, this, "technEmail", buffer, theTechnEmail);
        }
        {
            String theRegiId;
            theRegiId = this.getRegiId();
            strategy.appendField(locator, this, "regiId", buffer, theRegiId);
        }
        {
            Calendar theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Uebertragung) {
            final Uebertragung copy = ((Uebertragung) draftCopy);
            if (this.art!= null) {
                Uebertragung.Art sourceArt;
                sourceArt = this.getArt();
                Uebertragung.Art copyArt = ((Uebertragung.Art) strategy.copy(LocatorUtils.property(locator, "art", sourceArt), sourceArt));
                copy.setArt(copyArt);
            } else {
                copy.art = null;
            }
            if (this.umfang!= null) {
                Uebertragung.Umfang sourceUmfang;
                sourceUmfang = this.getUmfang();
                Uebertragung.Umfang copyUmfang = ((Uebertragung.Umfang) strategy.copy(LocatorUtils.property(locator, "umfang", sourceUmfang), sourceUmfang));
                copy.setUmfang(copyUmfang);
            } else {
                copy.umfang = null;
            }
            if (this.modus!= null) {
                Uebertragung.Modus sourceModus;
                sourceModus = this.getModus();
                Uebertragung.Modus copyModus = ((Uebertragung.Modus) strategy.copy(LocatorUtils.property(locator, "modus", sourceModus), sourceModus));
                copy.setModus(copyModus);
            } else {
                copy.modus = null;
            }
            if (this.version!= null) {
                String sourceVersion;
                sourceVersion = this.getVersion();
                String copyVersion = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion));
                copy.setVersion(copyVersion);
            } else {
                copy.version = null;
            }
            if (this.sendersoftware!= null) {
                String sourceSendersoftware;
                sourceSendersoftware = this.getSendersoftware();
                String copySendersoftware = ((String) strategy.copy(LocatorUtils.property(locator, "sendersoftware", sourceSendersoftware), sourceSendersoftware));
                copy.setSendersoftware(copySendersoftware);
            } else {
                copy.sendersoftware = null;
            }
            if (this.senderversion!= null) {
                String sourceSenderversion;
                sourceSenderversion = this.getSenderversion();
                String copySenderversion = ((String) strategy.copy(LocatorUtils.property(locator, "senderversion", sourceSenderversion), sourceSenderversion));
                copy.setSenderversion(copySenderversion);
            } else {
                copy.senderversion = null;
            }
            if (this.technEmail!= null) {
                String sourceTechnEmail;
                sourceTechnEmail = this.getTechnEmail();
                String copyTechnEmail = ((String) strategy.copy(LocatorUtils.property(locator, "technEmail", sourceTechnEmail), sourceTechnEmail));
                copy.setTechnEmail(copyTechnEmail);
            } else {
                copy.technEmail = null;
            }
            if (this.regiId!= null) {
                String sourceRegiId;
                sourceRegiId = this.getRegiId();
                String copyRegiId = ((String) strategy.copy(LocatorUtils.property(locator, "regiId", sourceRegiId), sourceRegiId));
                copy.setRegiId(copyRegiId);
            } else {
                copy.regiId = null;
            }
            if (this.timestamp!= null) {
                Calendar sourceTimestamp;
                sourceTimestamp = this.getTimestamp();
                Calendar copyTimestamp = ((Calendar) strategy.copy(LocatorUtils.property(locator, "timestamp", sourceTimestamp), sourceTimestamp));
                copy.setTimestamp(copyTimestamp);
            } else {
                copy.timestamp = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Uebertragung();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Uebertragung)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "art", lhsArt), LocatorUtils.property(thatLocator, "art", rhsArt), lhsArt, rhsArt)) {
                return false;
            }
        }
        {
            Uebertragung.Umfang lhsUmfang;
            lhsUmfang = this.getUmfang();
            Uebertragung.Umfang rhsUmfang;
            rhsUmfang = that.getUmfang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "umfang", lhsUmfang), LocatorUtils.property(thatLocator, "umfang", rhsUmfang), lhsUmfang, rhsUmfang)) {
                return false;
            }
        }
        {
            Uebertragung.Modus lhsModus;
            lhsModus = this.getModus();
            Uebertragung.Modus rhsModus;
            rhsModus = that.getModus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modus", lhsModus), LocatorUtils.property(thatLocator, "modus", rhsModus), lhsModus, rhsModus)) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
                return false;
            }
        }
        {
            String lhsSendersoftware;
            lhsSendersoftware = this.getSendersoftware();
            String rhsSendersoftware;
            rhsSendersoftware = that.getSendersoftware();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendersoftware", lhsSendersoftware), LocatorUtils.property(thatLocator, "sendersoftware", rhsSendersoftware), lhsSendersoftware, rhsSendersoftware)) {
                return false;
            }
        }
        {
            String lhsSenderversion;
            lhsSenderversion = this.getSenderversion();
            String rhsSenderversion;
            rhsSenderversion = that.getSenderversion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "senderversion", lhsSenderversion), LocatorUtils.property(thatLocator, "senderversion", rhsSenderversion), lhsSenderversion, rhsSenderversion)) {
                return false;
            }
        }
        {
            String lhsTechnEmail;
            lhsTechnEmail = this.getTechnEmail();
            String rhsTechnEmail;
            rhsTechnEmail = that.getTechnEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "technEmail", lhsTechnEmail), LocatorUtils.property(thatLocator, "technEmail", rhsTechnEmail), lhsTechnEmail, rhsTechnEmail)) {
                return false;
            }
        }
        {
            String lhsRegiId;
            lhsRegiId = this.getRegiId();
            String rhsRegiId;
            rhsRegiId = that.getRegiId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regiId", lhsRegiId), LocatorUtils.property(thatLocator, "regiId", rhsRegiId), lhsRegiId, rhsRegiId)) {
                return false;
            }
        }
        {
            Calendar lhsTimestamp;
            lhsTimestamp = this.getTimestamp();
            Calendar rhsTimestamp;
            rhsTimestamp = that.getTimestamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timestamp", lhsTimestamp), LocatorUtils.property(thatLocator, "timestamp", rhsTimestamp), lhsTimestamp, rhsTimestamp)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="ONLINE"/>
     *     &lt;enumeration value="OFFLINE"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
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
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="NEW"/>
     *     &lt;enumeration value="CHANGE"/>
     *     &lt;enumeration value="DELETE"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
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
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="TEIL"/>
     *     &lt;enumeration value="VOLL"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
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
