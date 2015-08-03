
package org.openestate.io.daft_ie.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for featuresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="featuresType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feature" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="10" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "featuresType", propOrder = {
    "feature"
})
public class FeaturesType
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<String> feature;

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFeature() {
        if (feature == null) {
            feature = new ArrayList<String>();
        }
        return this.feature;
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
            List<String> theFeature;
            theFeature = (((this.feature!= null)&&(!this.feature.isEmpty()))?this.getFeature():null);
            strategy.appendField(locator, this, "feature", buffer, theFeature);
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
        if (draftCopy instanceof FeaturesType) {
            final FeaturesType copy = ((FeaturesType) draftCopy);
            if ((this.feature!= null)&&(!this.feature.isEmpty())) {
                List<String> sourceFeature;
                sourceFeature = (((this.feature!= null)&&(!this.feature.isEmpty()))?this.getFeature():null);
                @SuppressWarnings("unchecked")
                List<String> copyFeature = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "feature", sourceFeature), sourceFeature));
                copy.feature = null;
                if (copyFeature!= null) {
                    List<String> uniqueFeaturel = copy.getFeature();
                    uniqueFeaturel.addAll(copyFeature);
                }
            } else {
                copy.feature = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FeaturesType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FeaturesType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FeaturesType that = ((FeaturesType) object);
        {
            List<String> lhsFeature;
            lhsFeature = (((this.feature!= null)&&(!this.feature.isEmpty()))?this.getFeature():null);
            List<String> rhsFeature;
            rhsFeature = (((that.feature!= null)&&(!that.feature.isEmpty()))?that.getFeature():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feature", lhsFeature), LocatorUtils.property(thatLocator, "feature", rhsFeature), lhsFeature, rhsFeature)) {
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
