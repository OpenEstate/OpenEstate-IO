
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="openimmo_anid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="makler_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regi_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
public class Sender
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "openimmo_anid")
    protected String openimmoAnid;
    @XmlElement(required = true)
    protected String datum;
    @XmlElement(name = "makler_id", required = true)
    protected String maklerId;
    @XmlElement(name = "regi_id")
    protected String regiId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theOpenimmoAnid;
            theOpenimmoAnid = this.getOpenimmoAnid();
            strategy.appendField(locator, this, "openimmoAnid", buffer, theOpenimmoAnid);
        }
        {
            String theDatum;
            theDatum = this.getDatum();
            strategy.appendField(locator, this, "datum", buffer, theDatum);
        }
        {
            String theMaklerId;
            theMaklerId = this.getMaklerId();
            strategy.appendField(locator, this, "maklerId", buffer, theMaklerId);
        }
        {
            String theRegiId;
            theRegiId = this.getRegiId();
            strategy.appendField(locator, this, "regiId", buffer, theRegiId);
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
        if (draftCopy instanceof Sender) {
            final Sender copy = ((Sender) draftCopy);
            if (this.name!= null) {
                String sourceName;
                sourceName = this.getName();
                String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.openimmoAnid!= null) {
                String sourceOpenimmoAnid;
                sourceOpenimmoAnid = this.getOpenimmoAnid();
                String copyOpenimmoAnid = ((String) strategy.copy(LocatorUtils.property(locator, "openimmoAnid", sourceOpenimmoAnid), sourceOpenimmoAnid));
                copy.setOpenimmoAnid(copyOpenimmoAnid);
            } else {
                copy.openimmoAnid = null;
            }
            if (this.datum!= null) {
                String sourceDatum;
                sourceDatum = this.getDatum();
                String copyDatum = ((String) strategy.copy(LocatorUtils.property(locator, "datum", sourceDatum), sourceDatum));
                copy.setDatum(copyDatum);
            } else {
                copy.datum = null;
            }
            if (this.maklerId!= null) {
                String sourceMaklerId;
                sourceMaklerId = this.getMaklerId();
                String copyMaklerId = ((String) strategy.copy(LocatorUtils.property(locator, "maklerId", sourceMaklerId), sourceMaklerId));
                copy.setMaklerId(copyMaklerId);
            } else {
                copy.maklerId = null;
            }
            if (this.regiId!= null) {
                String sourceRegiId;
                sourceRegiId = this.getRegiId();
                String copyRegiId = ((String) strategy.copy(LocatorUtils.property(locator, "regiId", sourceRegiId), sourceRegiId));
                copy.setRegiId(copyRegiId);
            } else {
                copy.regiId = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Sender();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Sender)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsOpenimmoAnid;
            lhsOpenimmoAnid = this.getOpenimmoAnid();
            String rhsOpenimmoAnid;
            rhsOpenimmoAnid = that.getOpenimmoAnid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "openimmoAnid", lhsOpenimmoAnid), LocatorUtils.property(thatLocator, "openimmoAnid", rhsOpenimmoAnid), lhsOpenimmoAnid, rhsOpenimmoAnid)) {
                return false;
            }
        }
        {
            String lhsDatum;
            lhsDatum = this.getDatum();
            String rhsDatum;
            rhsDatum = that.getDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datum", lhsDatum), LocatorUtils.property(thatLocator, "datum", rhsDatum), lhsDatum, rhsDatum)) {
                return false;
            }
        }
        {
            String lhsMaklerId;
            lhsMaklerId = this.getMaklerId();
            String rhsMaklerId;
            rhsMaklerId = that.getMaklerId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maklerId", lhsMaklerId), LocatorUtils.property(thatLocator, "maklerId", rhsMaklerId), lhsMaklerId, rhsMaklerId)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
