
package org.openestate.io.kyero.xml;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for imagesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imagesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="image" maxOccurs="50" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="url" type="{}imageUrlType" minOccurs="0"/&gt;
 *                   &lt;element name="title" type="{}langType" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *                 &lt;attribute name="id" use="required" type="{}imageAttributeType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imagesType", propOrder = {
    "image"
})
public class ImagesType
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<ImagesType.Image> image;

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImagesType.Image }
     * 
     * 
     */
    public List<ImagesType.Image> getImage() {
        if (image == null) {
            image = new ArrayList<ImagesType.Image>();
        }
        return this.image;
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
            List<ImagesType.Image> theImage;
            theImage = (((this.image!= null)&&(!this.image.isEmpty()))?this.getImage():null);
            strategy.appendField(locator, this, "image", buffer, theImage);
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
        if (draftCopy instanceof ImagesType) {
            final ImagesType copy = ((ImagesType) draftCopy);
            if ((this.image!= null)&&(!this.image.isEmpty())) {
                List<ImagesType.Image> sourceImage;
                sourceImage = (((this.image!= null)&&(!this.image.isEmpty()))?this.getImage():null);
                @SuppressWarnings("unchecked")
                List<ImagesType.Image> copyImage = ((List<ImagesType.Image> ) strategy.copy(LocatorUtils.property(locator, "image", sourceImage), sourceImage));
                copy.image = null;
                if (copyImage!= null) {
                    List<ImagesType.Image> uniqueImagel = copy.getImage();
                    uniqueImagel.addAll(copyImage);
                }
            } else {
                copy.image = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ImagesType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ImagesType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ImagesType that = ((ImagesType) object);
        {
            List<ImagesType.Image> lhsImage;
            lhsImage = (((this.image!= null)&&(!this.image.isEmpty()))?this.getImage():null);
            List<ImagesType.Image> rhsImage;
            rhsImage = (((that.image!= null)&&(!that.image.isEmpty()))?that.getImage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "image", lhsImage), LocatorUtils.property(thatLocator, "image", rhsImage), lhsImage, rhsImage)) {
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="url" type="{}imageUrlType" minOccurs="0"/&gt;
     *         &lt;element name="title" type="{}langType" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *       &lt;attribute name="id" use="required" type="{}imageAttributeType" /&gt;
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
    public static class Image
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(type = String.class)
        @XmlJavaTypeAdapter(Adapter13 .class)
        @XmlSchemaType(name = "token")
        protected URL url;
        protected LangType title;
        @XmlAttribute(name = "id", required = true)
        @XmlJavaTypeAdapter(Adapter14 .class)
        protected Integer id;

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public URL getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(URL value) {
            this.url = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link LangType }
         *     
         */
        public LangType getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link LangType }
         *     
         */
        public void setTitle(LangType value) {
            this.title = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Integer getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(Integer value) {
            this.id = value;
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
                URL theUrl;
                theUrl = this.getUrl();
                strategy.appendField(locator, this, "url", buffer, theUrl);
            }
            {
                LangType theTitle;
                theTitle = this.getTitle();
                strategy.appendField(locator, this, "title", buffer, theTitle);
            }
            {
                Integer theId;
                theId = this.getId();
                strategy.appendField(locator, this, "id", buffer, theId);
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
            if (draftCopy instanceof ImagesType.Image) {
                final ImagesType.Image copy = ((ImagesType.Image) draftCopy);
                if (this.url!= null) {
                    URL sourceUrl;
                    sourceUrl = this.getUrl();
                    URL copyUrl = ((URL) strategy.copy(LocatorUtils.property(locator, "url", sourceUrl), sourceUrl));
                    copy.setUrl(copyUrl);
                } else {
                    copy.url = null;
                }
                if (this.title!= null) {
                    LangType sourceTitle;
                    sourceTitle = this.getTitle();
                    LangType copyTitle = ((LangType) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle));
                    copy.setTitle(copyTitle);
                } else {
                    copy.title = null;
                }
                if (this.id!= null) {
                    Integer sourceId;
                    sourceId = this.getId();
                    Integer copyId = ((Integer) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                    copy.setId(copyId);
                } else {
                    copy.id = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ImagesType.Image();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof ImagesType.Image)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final ImagesType.Image that = ((ImagesType.Image) object);
            {
                URL lhsUrl;
                lhsUrl = this.getUrl();
                URL rhsUrl;
                rhsUrl = that.getUrl();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl)) {
                    return false;
                }
            }
            {
                LangType lhsTitle;
                lhsTitle = this.getTitle();
                LangType rhsTitle;
                rhsTitle = that.getTitle();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle)) {
                    return false;
                }
            }
            {
                Integer lhsId;
                lhsId = this.getId();
                Integer rhsId;
                rhsId = that.getId();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
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

}
