
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="picture_url" type="{}typeString"/&gt;
 *         &lt;element name="picture_title" type="{}typeString" minOccurs="0"/&gt;
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
@XmlRootElement(name = "picture")
public class Picture
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "picture_url", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String pictureUrl;
    @XmlElement(name = "picture_title")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String pictureTitle;

    /**
     * Gets the value of the pictureUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureUrl() {
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
    public void setPictureUrl(String value) {
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
            String thePictureUrl;
            thePictureUrl = this.getPictureUrl();
            strategy.appendField(locator, this, "pictureUrl", buffer, thePictureUrl);
        }
        {
            String thePictureTitle;
            thePictureTitle = this.getPictureTitle();
            strategy.appendField(locator, this, "pictureTitle", buffer, thePictureTitle);
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
        if (draftCopy instanceof Picture) {
            final Picture copy = ((Picture) draftCopy);
            if (this.pictureUrl!= null) {
                String sourcePictureUrl;
                sourcePictureUrl = this.getPictureUrl();
                String copyPictureUrl = ((String) strategy.copy(LocatorUtils.property(locator, "pictureUrl", sourcePictureUrl), sourcePictureUrl));
                copy.setPictureUrl(copyPictureUrl);
            } else {
                copy.pictureUrl = null;
            }
            if (this.pictureTitle!= null) {
                String sourcePictureTitle;
                sourcePictureTitle = this.getPictureTitle();
                String copyPictureTitle = ((String) strategy.copy(LocatorUtils.property(locator, "pictureTitle", sourcePictureTitle), sourcePictureTitle));
                copy.setPictureTitle(copyPictureTitle);
            } else {
                copy.pictureTitle = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Picture();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Picture that = ((Picture) object);
        {
            String lhsPictureUrl;
            lhsPictureUrl = this.getPictureUrl();
            String rhsPictureUrl;
            rhsPictureUrl = that.getPictureUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pictureUrl", lhsPictureUrl), LocatorUtils.property(thatLocator, "pictureUrl", rhsPictureUrl), lhsPictureUrl, rhsPictureUrl)) {
                return false;
            }
        }
        {
            String lhsPictureTitle;
            lhsPictureTitle = this.getPictureTitle();
            String rhsPictureTitle;
            rhsPictureTitle = that.getPictureTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pictureTitle", lhsPictureTitle), LocatorUtils.property(thatLocator, "pictureTitle", rhsPictureTitle), lhsPictureTitle, rhsPictureTitle)) {
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
