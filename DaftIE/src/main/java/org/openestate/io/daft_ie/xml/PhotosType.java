
package org.openestate.io.daft_ie.xml;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for photosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="photosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "photosType", propOrder = {
    "photo"
})
public class PhotosType implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anyURI")
    protected List<URL> photo;

    /**
     * Gets the value of the photo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the photo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<URL> getPhoto() {
        if (photo == null) {
            photo = new ArrayList<URL>();
        }
        return this.photo;
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
            List<URL> thePhoto;
            thePhoto = (((this.photo!= null)&&(!this.photo.isEmpty()))?this.getPhoto():null);
            strategy.appendField(locator, this, "photo", buffer, thePhoto, ((this.photo!= null)&&(!this.photo.isEmpty())));
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
        if (draftCopy instanceof PhotosType) {
            final PhotosType copy = ((PhotosType) draftCopy);
            {
                Boolean photoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.photo!= null)&&(!this.photo.isEmpty())));
                if (photoShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<URL> sourcePhoto;
                    sourcePhoto = (((this.photo!= null)&&(!this.photo.isEmpty()))?this.getPhoto():null);
                    @SuppressWarnings("unchecked")
                    List<URL> copyPhoto = ((List<URL> ) strategy.copy(LocatorUtils.property(locator, "photo", sourcePhoto), sourcePhoto, ((this.photo!= null)&&(!this.photo.isEmpty()))));
                    copy.photo = null;
                    if (copyPhoto!= null) {
                        List<URL> uniquePhotol = copy.getPhoto();
                        uniquePhotol.addAll(copyPhoto);
                    }
                } else {
                    if (photoShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.photo = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PhotosType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PhotosType that = ((PhotosType) object);
        {
            List<URL> lhsPhoto;
            lhsPhoto = (((this.photo!= null)&&(!this.photo.isEmpty()))?this.getPhoto():null);
            List<URL> rhsPhoto;
            rhsPhoto = (((that.photo!= null)&&(!that.photo.isEmpty()))?that.getPhoto():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "photo", lhsPhoto), LocatorUtils.property(thatLocator, "photo", rhsPhoto), lhsPhoto, rhsPhoto, ((this.photo!= null)&&(!this.photo.isEmpty())), ((that.photo!= null)&&(!that.photo.isEmpty())))) {
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
