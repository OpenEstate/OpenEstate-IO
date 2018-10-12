
package org.openestate.io.daft_ie.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
public class FeaturesType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public List<String> getFeature() {
        if (feature == null) {
            feature = new ArrayList<String>();
        }
        return this.feature;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<String> theFeature;
            theFeature = (((this.feature!= null)&&(!this.feature.isEmpty()))?this.getFeature():null);
            strategy.appendField(locator, this, "feature", buffer, theFeature, ((this.feature!= null)&&(!this.feature.isEmpty())));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof FeaturesType) {
            final FeaturesType copy = ((FeaturesType) draftCopy);
            {
                Boolean featureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.feature!= null)&&(!this.feature.isEmpty())));
                if (featureShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceFeature;
                    sourceFeature = (((this.feature!= null)&&(!this.feature.isEmpty()))?this.getFeature():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyFeature = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "feature", sourceFeature), sourceFeature, ((this.feature!= null)&&(!this.feature.isEmpty()))));
                    copy.feature = null;
                    if (copyFeature!= null) {
                        List<String> uniqueFeaturel = copy.getFeature();
                        uniqueFeaturel.addAll(copyFeature);
                    }
                } else {
                    if (featureShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.feature = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new FeaturesType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feature", lhsFeature), LocatorUtils.property(thatLocator, "feature", rhsFeature), lhsFeature, rhsFeature, ((this.feature!= null)&&(!this.feature.isEmpty())), ((that.feature!= null)&&(!that.feature.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
