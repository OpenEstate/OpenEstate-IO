
package org.openestate.io.trovit.xml;

import java.io.Serializable;
import java.net.URI;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * 
 *                 Ein einzuf\u00fcgendes oder zu aktualisierendes Bild.
 *             
 * 
 * <p>Java class for PictureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="picture_url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="picture_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="featured" type="{}BooleanValue" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictureType", propOrder = {

})
public class PictureType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "picture_url", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anyURI")
    protected URI pictureUrl;
    @XmlElement(name = "picture_title")
    protected String pictureTitle;
    @XmlAttribute(name = "featured")
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected Boolean featured;

    /**
     * Gets the value of the pictureUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URI getPictureUrl() {
        return pictureUrl;
    }

    /**
     * Sets the value of the pictureUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureUrl(URI value) {
        this.pictureUrl = value;
    }

    /**
     * Gets the value of the pictureTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureTitle() {
        return pictureTitle;
    }

    /**
     * Sets the value of the pictureTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureTitle(String value) {
        this.pictureTitle = value;
    }

    /**
     * Gets the value of the featured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isFeatured() {
        return featured;
    }

    /**
     * Sets the value of the featured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatured(Boolean value) {
        this.featured = value;
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
            URI thePictureUrl;
            thePictureUrl = this.getPictureUrl();
            strategy.appendField(locator, this, "pictureUrl", buffer, thePictureUrl, (this.pictureUrl!= null));
        }
        {
            String thePictureTitle;
            thePictureTitle = this.getPictureTitle();
            strategy.appendField(locator, this, "pictureTitle", buffer, thePictureTitle, (this.pictureTitle!= null));
        }
        {
            Boolean theFeatured;
            theFeatured = this.isFeatured();
            strategy.appendField(locator, this, "featured", buffer, theFeatured, (this.featured!= null));
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
        if (draftCopy instanceof PictureType) {
            final PictureType copy = ((PictureType) draftCopy);
            {
                Boolean pictureUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pictureUrl!= null));
                if (pictureUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourcePictureUrl;
                    sourcePictureUrl = this.getPictureUrl();
                    URI copyPictureUrl = ((URI) strategy.copy(LocatorUtils.property(locator, "pictureUrl", sourcePictureUrl), sourcePictureUrl, (this.pictureUrl!= null)));
                    copy.setPictureUrl(copyPictureUrl);
                } else {
                    if (pictureUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pictureUrl = null;
                    }
                }
            }
            {
                Boolean pictureTitleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pictureTitle!= null));
                if (pictureTitleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePictureTitle;
                    sourcePictureTitle = this.getPictureTitle();
                    String copyPictureTitle = ((String) strategy.copy(LocatorUtils.property(locator, "pictureTitle", sourcePictureTitle), sourcePictureTitle, (this.pictureTitle!= null)));
                    copy.setPictureTitle(copyPictureTitle);
                } else {
                    if (pictureTitleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pictureTitle = null;
                    }
                }
            }
            {
                Boolean featuredShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.featured!= null));
                if (featuredShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFeatured;
                    sourceFeatured = this.isFeatured();
                    Boolean copyFeatured = ((Boolean) strategy.copy(LocatorUtils.property(locator, "featured", sourceFeatured), sourceFeatured, (this.featured!= null)));
                    copy.setFeatured(copyFeatured);
                } else {
                    if (featuredShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.featured = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PictureType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PictureType that = ((PictureType) object);
        {
            URI lhsPictureUrl;
            lhsPictureUrl = this.getPictureUrl();
            URI rhsPictureUrl;
            rhsPictureUrl = that.getPictureUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pictureUrl", lhsPictureUrl), LocatorUtils.property(thatLocator, "pictureUrl", rhsPictureUrl), lhsPictureUrl, rhsPictureUrl, (this.pictureUrl!= null), (that.pictureUrl!= null))) {
                return false;
            }
        }
        {
            String lhsPictureTitle;
            lhsPictureTitle = this.getPictureTitle();
            String rhsPictureTitle;
            rhsPictureTitle = that.getPictureTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pictureTitle", lhsPictureTitle), LocatorUtils.property(thatLocator, "pictureTitle", rhsPictureTitle), lhsPictureTitle, rhsPictureTitle, (this.pictureTitle!= null), (that.pictureTitle!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFeatured;
            lhsFeatured = this.isFeatured();
            Boolean rhsFeatured;
            rhsFeatured = that.isFeatured();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featured", lhsFeatured), LocatorUtils.property(thatLocator, "featured", rhsFeatured), lhsFeatured, rhsFeatured, (this.featured!= null), (that.featured!= null))) {
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
