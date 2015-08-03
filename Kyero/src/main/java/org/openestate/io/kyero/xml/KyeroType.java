
package org.openestate.io.kyero.xml;

import java.util.Calendar;
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
 * <p>Java class for kyeroType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kyeroType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="feed_version"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="feed_generated" type="{}dateType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kyeroType", propOrder = {

})
public class KyeroType
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "feed_version", required = true)
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected String feedVersion;
    @XmlElement(name = "feed_generated", type = String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "token")
    protected Calendar feedGenerated;

    /**
     * Gets the value of the feedVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedVersion() {
        return feedVersion;
    }

    /**
     * Sets the value of the feedVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedVersion(String value) {
        this.feedVersion = value;
    }

    /**
     * Gets the value of the feedGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFeedGenerated() {
        return feedGenerated;
    }

    /**
     * Sets the value of the feedGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedGenerated(Calendar value) {
        this.feedGenerated = value;
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
            String theFeedVersion;
            theFeedVersion = this.getFeedVersion();
            strategy.appendField(locator, this, "feedVersion", buffer, theFeedVersion);
        }
        {
            Calendar theFeedGenerated;
            theFeedGenerated = this.getFeedGenerated();
            strategy.appendField(locator, this, "feedGenerated", buffer, theFeedGenerated);
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
        if (draftCopy instanceof KyeroType) {
            final KyeroType copy = ((KyeroType) draftCopy);
            if (this.feedVersion!= null) {
                String sourceFeedVersion;
                sourceFeedVersion = this.getFeedVersion();
                String copyFeedVersion = ((String) strategy.copy(LocatorUtils.property(locator, "feedVersion", sourceFeedVersion), sourceFeedVersion));
                copy.setFeedVersion(copyFeedVersion);
            } else {
                copy.feedVersion = null;
            }
            if (this.feedGenerated!= null) {
                Calendar sourceFeedGenerated;
                sourceFeedGenerated = this.getFeedGenerated();
                Calendar copyFeedGenerated = ((Calendar) strategy.copy(LocatorUtils.property(locator, "feedGenerated", sourceFeedGenerated), sourceFeedGenerated));
                copy.setFeedGenerated(copyFeedGenerated);
            } else {
                copy.feedGenerated = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new KyeroType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof KyeroType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final KyeroType that = ((KyeroType) object);
        {
            String lhsFeedVersion;
            lhsFeedVersion = this.getFeedVersion();
            String rhsFeedVersion;
            rhsFeedVersion = that.getFeedVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feedVersion", lhsFeedVersion), LocatorUtils.property(thatLocator, "feedVersion", rhsFeedVersion), lhsFeedVersion, rhsFeedVersion)) {
                return false;
            }
        }
        {
            Calendar lhsFeedGenerated;
            lhsFeedGenerated = this.getFeedGenerated();
            Calendar rhsFeedGenerated;
            rhsFeedGenerated = that.getFeedGenerated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feedGenerated", lhsFeedGenerated), LocatorUtils.property(thatLocator, "feedGenerated", rhsFeedGenerated), lhsFeedGenerated, rhsFeedGenerated)) {
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
