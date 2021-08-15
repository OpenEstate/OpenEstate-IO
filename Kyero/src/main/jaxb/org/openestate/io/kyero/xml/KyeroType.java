
package org.openestate.io.kyero.xml;

import java.io.Serializable;
import java.util.Calendar;
import javax.annotation.Generated;
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
public class KyeroType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "feed_version", required = true)
    @XmlJavaTypeAdapter(Adapter16 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected String feedVersion;
    @XmlElement(name = "feed_generated", type = String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar feedGenerated;

    /**
     * Gets the value of the feedVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public void setFeedGenerated(Calendar value) {
        this.feedGenerated = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theFeedVersion;
            theFeedVersion = this.getFeedVersion();
            strategy.appendField(locator, this, "feedVersion", buffer, theFeedVersion, (this.feedVersion!= null));
        }
        {
            Calendar theFeedGenerated;
            theFeedGenerated = this.getFeedGenerated();
            strategy.appendField(locator, this, "feedGenerated", buffer, theFeedGenerated, (this.feedGenerated!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof KyeroType) {
            final KyeroType copy = ((KyeroType) draftCopy);
            {
                Boolean feedVersionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.feedVersion!= null));
                if (feedVersionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFeedVersion;
                    sourceFeedVersion = this.getFeedVersion();
                    String copyFeedVersion = ((String) strategy.copy(LocatorUtils.property(locator, "feedVersion", sourceFeedVersion), sourceFeedVersion, (this.feedVersion!= null)));
                    copy.setFeedVersion(copyFeedVersion);
                } else {
                    if (feedVersionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.feedVersion = null;
                    }
                }
            }
            {
                Boolean feedGeneratedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.feedGenerated!= null));
                if (feedGeneratedShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceFeedGenerated;
                    sourceFeedGenerated = this.getFeedGenerated();
                    Calendar copyFeedGenerated = ((Calendar) strategy.copy(LocatorUtils.property(locator, "feedGenerated", sourceFeedGenerated), sourceFeedGenerated, (this.feedGenerated!= null)));
                    copy.setFeedGenerated(copyFeedGenerated);
                } else {
                    if (feedGeneratedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.feedGenerated = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new KyeroType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feedVersion", lhsFeedVersion), LocatorUtils.property(thatLocator, "feedVersion", rhsFeedVersion), lhsFeedVersion, rhsFeedVersion, (this.feedVersion!= null), (that.feedVersion!= null))) {
                return false;
            }
        }
        {
            Calendar lhsFeedGenerated;
            lhsFeedGenerated = this.getFeedGenerated();
            Calendar rhsFeedGenerated;
            rhsFeedGenerated = that.getFeedGenerated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feedGenerated", lhsFeedGenerated), LocatorUtils.property(thatLocator, "feedGenerated", rhsFeedGenerated), lhsFeedGenerated, rhsFeedGenerated, (this.feedGenerated!= null), (that.feedGenerated!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
