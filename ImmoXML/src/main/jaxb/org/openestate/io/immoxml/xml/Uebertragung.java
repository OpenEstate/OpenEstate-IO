
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
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
 * Java class for &lt;uebertragung&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "uebertragung")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class Uebertragung implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "art", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Uebertragung.Art art;
    @XmlAttribute(name = "umfang", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Uebertragung.Umfang umfang;
    @XmlAttribute(name = "version", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String version;
    @XmlAttribute(name = "sendersoftware", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String sendersoftware;
    @XmlAttribute(name = "techn_email")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String technEmail;

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link Uebertragung.Art }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setUmfang(Uebertragung.Umfang value) {
        this.umfang = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setSendersoftware(String value) {
        this.sendersoftware = value;
    }

    /**
     * Gets the value of the technEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setTechnEmail(String value) {
        this.technEmail = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
            String theTechnEmail;
            theTechnEmail = this.getTechnEmail();
            strategy.appendField(locator, this, "technEmail", buffer, theTechnEmail, (this.technEmail!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Uebertragung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
            String lhsTechnEmail;
            lhsTechnEmail = this.getTechnEmail();
            String rhsTechnEmail;
            rhsTechnEmail = that.getTechnEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "technEmail", lhsTechnEmail), LocatorUtils.property(thatLocator, "technEmail", rhsTechnEmail), lhsTechnEmail, rhsTechnEmail, (this.technEmail!= null), (that.technEmail!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }


    /**
     * 
     *                     Java enum for <em>art</em> attribute in &lt;uebertragung&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="ONLINE"/&gt;
     *     &lt;enumeration value="OFFLINE"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
     * 
     *                     Java enum for <em>umfang</em> attribute in &lt;uebertragung&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="TEIL"/&gt;
     *     &lt;enumeration value="VOLL"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
