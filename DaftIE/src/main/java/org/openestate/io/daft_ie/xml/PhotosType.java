
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
public class PhotosType
    implements Cloneable, CopyTo, Equals, ToString
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
            List<URL> thePhoto;
            thePhoto = (((this.photo!= null)&&(!this.photo.isEmpty()))?this.getPhoto():null);
            strategy.appendField(locator, this, "photo", buffer, thePhoto);
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
        if (draftCopy instanceof PhotosType) {
            final PhotosType copy = ((PhotosType) draftCopy);
            if ((this.photo!= null)&&(!this.photo.isEmpty())) {
                List<URL> sourcePhoto;
                sourcePhoto = (((this.photo!= null)&&(!this.photo.isEmpty()))?this.getPhoto():null);
                @SuppressWarnings("unchecked")
                List<URL> copyPhoto = ((List<URL> ) strategy.copy(LocatorUtils.property(locator, "photo", sourcePhoto), sourcePhoto));
                copy.photo = null;
                if (copyPhoto!= null) {
                    List<URL> uniquePhotol = copy.getPhoto();
                    uniquePhotol.addAll(copyPhoto);
                }
            } else {
                copy.photo = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PhotosType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PhotosType)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "photo", lhsPhoto), LocatorUtils.property(thatLocator, "photo", rhsPhoto), lhsPhoto, rhsPhoto)) {
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
