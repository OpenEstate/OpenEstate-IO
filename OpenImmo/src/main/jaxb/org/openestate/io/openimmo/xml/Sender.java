
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
 * Java class for &lt;sender&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "openimmoAnid",
    "datum",
    "maklerId",
    "regiId"
})
@XmlRootElement(name = "sender")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
public class Sender implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String name;
    @XmlElement(name = "openimmo_anid")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String openimmoAnid;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String datum;
    @XmlElement(name = "makler_id", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String maklerId;
    @XmlElement(name = "regi_id")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String regiId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the openimmoAnid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getOpenimmoAnid() {
        return openimmoAnid;
    }

    /**
     * Sets the value of the openimmoAnid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setOpenimmoAnid(String value) {
        this.openimmoAnid = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setDatum(String value) {
        this.datum = value;
    }

    /**
     * Gets the value of the maklerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getMaklerId() {
        return maklerId;
    }

    /**
     * Sets the value of the maklerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setMaklerId(String value) {
        this.maklerId = value;
    }

    /**
     * Gets the value of the regiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setRegiId(String value) {
        this.regiId = value;
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String theOpenimmoAnid;
            theOpenimmoAnid = this.getOpenimmoAnid();
            strategy.appendField(locator, this, "openimmoAnid", buffer, theOpenimmoAnid, (this.openimmoAnid!= null));
        }
        {
            String theDatum;
            theDatum = this.getDatum();
            strategy.appendField(locator, this, "datum", buffer, theDatum, (this.datum!= null));
        }
        {
            String theMaklerId;
            theMaklerId = this.getMaklerId();
            strategy.appendField(locator, this, "maklerId", buffer, theMaklerId, (this.maklerId!= null));
        }
        {
            String theRegiId;
            theRegiId = this.getRegiId();
            strategy.appendField(locator, this, "regiId", buffer, theRegiId, (this.regiId!= null));
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
        if (draftCopy instanceof Sender) {
            final Sender copy = ((Sender) draftCopy);
            {
                Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceName;
                    sourceName = this.getName();
                    String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName, (this.name!= null)));
                    copy.setName(copyName);
                } else {
                    if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.name = null;
                    }
                }
            }
            {
                Boolean openimmoAnidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.openimmoAnid!= null));
                if (openimmoAnidShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOpenimmoAnid;
                    sourceOpenimmoAnid = this.getOpenimmoAnid();
                    String copyOpenimmoAnid = ((String) strategy.copy(LocatorUtils.property(locator, "openimmoAnid", sourceOpenimmoAnid), sourceOpenimmoAnid, (this.openimmoAnid!= null)));
                    copy.setOpenimmoAnid(copyOpenimmoAnid);
                } else {
                    if (openimmoAnidShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.openimmoAnid = null;
                    }
                }
            }
            {
                Boolean datumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.datum!= null));
                if (datumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDatum;
                    sourceDatum = this.getDatum();
                    String copyDatum = ((String) strategy.copy(LocatorUtils.property(locator, "datum", sourceDatum), sourceDatum, (this.datum!= null)));
                    copy.setDatum(copyDatum);
                } else {
                    if (datumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.datum = null;
                    }
                }
            }
            {
                Boolean maklerIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maklerId!= null));
                if (maklerIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMaklerId;
                    sourceMaklerId = this.getMaklerId();
                    String copyMaklerId = ((String) strategy.copy(LocatorUtils.property(locator, "maklerId", sourceMaklerId), sourceMaklerId, (this.maklerId!= null)));
                    copy.setMaklerId(copyMaklerId);
                } else {
                    if (maklerIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maklerId = null;
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
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Sender();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Sender that = ((Sender) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsOpenimmoAnid;
            lhsOpenimmoAnid = this.getOpenimmoAnid();
            String rhsOpenimmoAnid;
            rhsOpenimmoAnid = that.getOpenimmoAnid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "openimmoAnid", lhsOpenimmoAnid), LocatorUtils.property(thatLocator, "openimmoAnid", rhsOpenimmoAnid), lhsOpenimmoAnid, rhsOpenimmoAnid, (this.openimmoAnid!= null), (that.openimmoAnid!= null))) {
                return false;
            }
        }
        {
            String lhsDatum;
            lhsDatum = this.getDatum();
            String rhsDatum;
            rhsDatum = that.getDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datum", lhsDatum), LocatorUtils.property(thatLocator, "datum", rhsDatum), lhsDatum, rhsDatum, (this.datum!= null), (that.datum!= null))) {
                return false;
            }
        }
        {
            String lhsMaklerId;
            lhsMaklerId = this.getMaklerId();
            String rhsMaklerId;
            rhsMaklerId = that.getMaklerId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maklerId", lhsMaklerId), LocatorUtils.property(thatLocator, "maklerId", rhsMaklerId), lhsMaklerId, rhsMaklerId, (this.maklerId!= null), (that.maklerId!= null))) {
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
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
