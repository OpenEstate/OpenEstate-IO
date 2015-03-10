
package org.openestate.io.openimmo.xml;

import java.util.ArrayList;
import java.util.List;
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
 * Java class for &lt;openimmo_feedback&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "version",
    "sender",
    "objekt",
    "fehlerliste",
    "status"
})
@XmlRootElement(name = "openimmo_feedback")
public class OpenimmoFeedback
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected Sender sender;
    protected List<Objekt> objekt;
    protected List<Fehlerliste> fehlerliste;
    protected List<Status> status;

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
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the objekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Objekt }
     * 
     * 
     */
    public List<Objekt> getObjekt() {
        if (objekt == null) {
            objekt = new ArrayList<Objekt>();
        }
        return this.objekt;
    }

    /**
     * Gets the value of the fehlerliste property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fehlerliste property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFehlerliste().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fehlerliste }
     * 
     * 
     */
    public List<Fehlerliste> getFehlerliste() {
        if (fehlerliste == null) {
            fehlerliste = new ArrayList<Fehlerliste>();
        }
        return this.fehlerliste;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Status }
     * 
     * 
     */
    public List<Status> getStatus() {
        if (status == null) {
            status = new ArrayList<Status>();
        }
        return this.status;
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
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        {
            Sender theSender;
            theSender = this.getSender();
            strategy.appendField(locator, this, "sender", buffer, theSender);
        }
        {
            List<Objekt> theObjekt;
            theObjekt = (((this.objekt!= null)&&(!this.objekt.isEmpty()))?this.getObjekt():null);
            strategy.appendField(locator, this, "objekt", buffer, theObjekt);
        }
        {
            List<Fehlerliste> theFehlerliste;
            theFehlerliste = (((this.fehlerliste!= null)&&(!this.fehlerliste.isEmpty()))?this.getFehlerliste():null);
            strategy.appendField(locator, this, "fehlerliste", buffer, theFehlerliste);
        }
        {
            List<Status> theStatus;
            theStatus = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            strategy.appendField(locator, this, "status", buffer, theStatus);
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
        if (draftCopy instanceof OpenimmoFeedback) {
            final OpenimmoFeedback copy = ((OpenimmoFeedback) draftCopy);
            if (this.version!= null) {
                String sourceVersion;
                sourceVersion = this.getVersion();
                String copyVersion = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion));
                copy.setVersion(copyVersion);
            } else {
                copy.version = null;
            }
            if (this.sender!= null) {
                Sender sourceSender;
                sourceSender = this.getSender();
                Sender copySender = ((Sender) strategy.copy(LocatorUtils.property(locator, "sender", sourceSender), sourceSender));
                copy.setSender(copySender);
            } else {
                copy.sender = null;
            }
            if ((this.objekt!= null)&&(!this.objekt.isEmpty())) {
                List<Objekt> sourceObjekt;
                sourceObjekt = (((this.objekt!= null)&&(!this.objekt.isEmpty()))?this.getObjekt():null);
                @SuppressWarnings("unchecked")
                List<Objekt> copyObjekt = ((List<Objekt> ) strategy.copy(LocatorUtils.property(locator, "objekt", sourceObjekt), sourceObjekt));
                copy.objekt = null;
                if (copyObjekt!= null) {
                    List<Objekt> uniqueObjektl = copy.getObjekt();
                    uniqueObjektl.addAll(copyObjekt);
                }
            } else {
                copy.objekt = null;
            }
            if ((this.fehlerliste!= null)&&(!this.fehlerliste.isEmpty())) {
                List<Fehlerliste> sourceFehlerliste;
                sourceFehlerliste = (((this.fehlerliste!= null)&&(!this.fehlerliste.isEmpty()))?this.getFehlerliste():null);
                @SuppressWarnings("unchecked")
                List<Fehlerliste> copyFehlerliste = ((List<Fehlerliste> ) strategy.copy(LocatorUtils.property(locator, "fehlerliste", sourceFehlerliste), sourceFehlerliste));
                copy.fehlerliste = null;
                if (copyFehlerliste!= null) {
                    List<Fehlerliste> uniqueFehlerlistel = copy.getFehlerliste();
                    uniqueFehlerlistel.addAll(copyFehlerliste);
                }
            } else {
                copy.fehlerliste = null;
            }
            if ((this.status!= null)&&(!this.status.isEmpty())) {
                List<Status> sourceStatus;
                sourceStatus = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
                @SuppressWarnings("unchecked")
                List<Status> copyStatus = ((List<Status> ) strategy.copy(LocatorUtils.property(locator, "status", sourceStatus), sourceStatus));
                copy.status = null;
                if (copyStatus!= null) {
                    List<Status> uniqueStatusl = copy.getStatus();
                    uniqueStatusl.addAll(copyStatus);
                }
            } else {
                copy.status = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new OpenimmoFeedback();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OpenimmoFeedback)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OpenimmoFeedback that = ((OpenimmoFeedback) object);
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
            Sender lhsSender;
            lhsSender = this.getSender();
            Sender rhsSender;
            rhsSender = that.getSender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sender", lhsSender), LocatorUtils.property(thatLocator, "sender", rhsSender), lhsSender, rhsSender)) {
                return false;
            }
        }
        {
            List<Objekt> lhsObjekt;
            lhsObjekt = (((this.objekt!= null)&&(!this.objekt.isEmpty()))?this.getObjekt():null);
            List<Objekt> rhsObjekt;
            rhsObjekt = (((that.objekt!= null)&&(!that.objekt.isEmpty()))?that.getObjekt():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objekt", lhsObjekt), LocatorUtils.property(thatLocator, "objekt", rhsObjekt), lhsObjekt, rhsObjekt)) {
                return false;
            }
        }
        {
            List<Fehlerliste> lhsFehlerliste;
            lhsFehlerliste = (((this.fehlerliste!= null)&&(!this.fehlerliste.isEmpty()))?this.getFehlerliste():null);
            List<Fehlerliste> rhsFehlerliste;
            rhsFehlerliste = (((that.fehlerliste!= null)&&(!that.fehlerliste.isEmpty()))?that.getFehlerliste():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fehlerliste", lhsFehlerliste), LocatorUtils.property(thatLocator, "fehlerliste", rhsFehlerliste), lhsFehlerliste, rhsFehlerliste)) {
                return false;
            }
        }
        {
            List<Status> lhsStatus;
            lhsStatus = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            List<Status> rhsStatus;
            rhsStatus = (((that.status!= null)&&(!that.status.isEmpty()))?that.getStatus():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
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
