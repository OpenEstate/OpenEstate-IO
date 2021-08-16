
package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="version" type="{http://feed.immobiliare.it}version" minOccurs="0"/&gt;
 *         &lt;element name="metadata" type="{http://feed.immobiliare.it}metadata" minOccurs="0"/&gt;
 *         &lt;element name="projects" type="{http://feed.immobiliare.it}projects" minOccurs="0"/&gt;
 *         &lt;element name="properties" type="{http://feed.immobiliare.it}properties" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "feed")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
public class Feed implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected VersionType version;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Metadata metadata;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Projects projects;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    protected Properties properties;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link VersionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public VersionType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setVersion(VersionType value) {
        this.version = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link Metadata }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadata }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setMetadata(Metadata value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the projects property.
     * 
     * @return
     *     possible object is
     *     {@link Projects }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Projects getProjects() {
        return projects;
    }

    /**
     * Sets the value of the projects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Projects }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setProjects(Projects value) {
        this.projects = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public void setProperties(Properties value) {
        this.properties = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            VersionType theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion, (this.version!= null));
        }
        {
            Metadata theMetadata;
            theMetadata = this.getMetadata();
            strategy.appendField(locator, this, "metadata", buffer, theMetadata, (this.metadata!= null));
        }
        {
            Projects theProjects;
            theProjects = this.getProjects();
            strategy.appendField(locator, this, "projects", buffer, theProjects, (this.projects!= null));
        }
        {
            Properties theProperties;
            theProperties = this.getProperties();
            strategy.appendField(locator, this, "properties", buffer, theProperties, (this.properties!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Feed) {
            final Feed copy = ((Feed) draftCopy);
            {
                Boolean versionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.version!= null));
                if (versionShouldBeCopiedAndSet == Boolean.TRUE) {
                    VersionType sourceVersion;
                    sourceVersion = this.getVersion();
                    VersionType copyVersion = ((VersionType) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion, (this.version!= null)));
                    copy.setVersion(copyVersion);
                } else {
                    if (versionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.version = null;
                    }
                }
            }
            {
                Boolean metadataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.metadata!= null));
                if (metadataShouldBeCopiedAndSet == Boolean.TRUE) {
                    Metadata sourceMetadata;
                    sourceMetadata = this.getMetadata();
                    Metadata copyMetadata = ((Metadata) strategy.copy(LocatorUtils.property(locator, "metadata", sourceMetadata), sourceMetadata, (this.metadata!= null)));
                    copy.setMetadata(copyMetadata);
                } else {
                    if (metadataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.metadata = null;
                    }
                }
            }
            {
                Boolean projectsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.projects!= null));
                if (projectsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Projects sourceProjects;
                    sourceProjects = this.getProjects();
                    Projects copyProjects = ((Projects) strategy.copy(LocatorUtils.property(locator, "projects", sourceProjects), sourceProjects, (this.projects!= null)));
                    copy.setProjects(copyProjects);
                } else {
                    if (projectsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.projects = null;
                    }
                }
            }
            {
                Boolean propertiesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.properties!= null));
                if (propertiesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Properties sourceProperties;
                    sourceProperties = this.getProperties();
                    Properties copyProperties = ((Properties) strategy.copy(LocatorUtils.property(locator, "properties", sourceProperties), sourceProperties, (this.properties!= null)));
                    copy.setProperties(copyProperties);
                } else {
                    if (propertiesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.properties = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Feed();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Feed that = ((Feed) object);
        {
            VersionType lhsVersion;
            lhsVersion = this.getVersion();
            VersionType rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion, (this.version!= null), (that.version!= null))) {
                return false;
            }
        }
        {
            Metadata lhsMetadata;
            lhsMetadata = this.getMetadata();
            Metadata rhsMetadata;
            rhsMetadata = that.getMetadata();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metadata", lhsMetadata), LocatorUtils.property(thatLocator, "metadata", rhsMetadata), lhsMetadata, rhsMetadata, (this.metadata!= null), (that.metadata!= null))) {
                return false;
            }
        }
        {
            Projects lhsProjects;
            lhsProjects = this.getProjects();
            Projects rhsProjects;
            rhsProjects = that.getProjects();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "projects", lhsProjects), LocatorUtils.property(thatLocator, "projects", rhsProjects), lhsProjects, rhsProjects, (this.projects!= null), (that.projects!= null))) {
                return false;
            }
        }
        {
            Properties lhsProperties;
            lhsProperties = this.getProperties();
            Properties rhsProperties;
            rhsProperties = that.getProperties();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "properties", lhsProperties), LocatorUtils.property(thatLocator, "properties", rhsProperties), lhsProperties, rhsProperties, (this.properties!= null), (that.properties!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-15T07:05:08+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
