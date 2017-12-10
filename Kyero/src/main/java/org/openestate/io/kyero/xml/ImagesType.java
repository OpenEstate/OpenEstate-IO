
package org.openestate.io.kyero.xml;

import java.io.Serializable;
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
public class ImagesType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
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
            List<ImagesType.Image> theImage;
            theImage = (((this.image!= null)&&(!this.image.isEmpty()))?this.getImage():null);
            strategy.appendField(locator, this, "image", buffer, theImage, ((this.image!= null)&&(!this.image.isEmpty())));
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
        if (draftCopy instanceof ImagesType) {
            final ImagesType copy = ((ImagesType) draftCopy);
            {
                Boolean imageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.image!= null)&&(!this.image.isEmpty())));
                if (imageShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ImagesType.Image> sourceImage;
                    sourceImage = (((this.image!= null)&&(!this.image.isEmpty()))?this.getImage():null);
                    @SuppressWarnings("unchecked")
                    List<ImagesType.Image> copyImage = ((List<ImagesType.Image> ) strategy.copy(LocatorUtils.property(locator, "image", sourceImage), sourceImage, ((this.image!= null)&&(!this.image.isEmpty()))));
                    copy.image = null;
                    if (copyImage!= null) {
                        List<ImagesType.Image> uniqueImagel = copy.getImage();
                        uniqueImagel.addAll(copyImage);
                    }
                } else {
                    if (imageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.image = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ImagesType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "image", lhsImage), LocatorUtils.property(thatLocator, "image", rhsImage), lhsImage, rhsImage, ((this.image!= null)&&(!this.image.isEmpty())), ((that.image!= null)&&(!that.image.isEmpty())))) {
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
    public static class Image implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(type = String.class)
        @XmlJavaTypeAdapter(Adapter14 .class)
        @XmlSchemaType(name = "token")
        protected URL url;
        @XmlAttribute(name = "id", required = true)
        @XmlJavaTypeAdapter(Adapter15 .class)
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
                URL theUrl;
                theUrl = this.getUrl();
                strategy.appendField(locator, this, "url", buffer, theUrl, (this.url!= null));
            }
            {
                Integer theId;
                theId = this.getId();
                strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
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
            if (draftCopy instanceof ImagesType.Image) {
                final ImagesType.Image copy = ((ImagesType.Image) draftCopy);
                {
                    Boolean urlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.url!= null));
                    if (urlShouldBeCopiedAndSet == Boolean.TRUE) {
                        URL sourceUrl;
                        sourceUrl = this.getUrl();
                        URL copyUrl = ((URL) strategy.copy(LocatorUtils.property(locator, "url", sourceUrl), sourceUrl, (this.url!= null)));
                        copy.setUrl(copyUrl);
                    } else {
                        if (urlShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.url = null;
                        }
                    }
                }
                {
                    Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                    if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                        Integer sourceId;
                        sourceId = this.getId();
                        Integer copyId = ((Integer) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                        copy.setId(copyId);
                    } else {
                        if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.id = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ImagesType.Image();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
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
                if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl, (this.url!= null), (that.url!= null))) {
                    return false;
                }
            }
            {
                Integer lhsId;
                lhsId = this.getId();
                Integer rhsId;
                rhsId = that.getId();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
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

}
