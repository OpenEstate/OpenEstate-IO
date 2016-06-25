
package org.openestate.io.trovit.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}ad" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ad"
})
@XmlRootElement(name = "trovit")
public class Trovit implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    protected List<Ad> ad;

    /**
     * Gets the value of the ad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ad }
     * 
     * 
     */
    public List<Ad> getAd() {
        if (ad == null) {
            ad = new ArrayList<Ad>();
        }
        return this.ad;
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
            List<Ad> theAd;
            theAd = (((this.ad!= null)&&(!this.ad.isEmpty()))?this.getAd():null);
            strategy.appendField(locator, this, "ad", buffer, theAd, ((this.ad!= null)&&(!this.ad.isEmpty())));
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
        if (draftCopy instanceof Trovit) {
            final Trovit copy = ((Trovit) draftCopy);
            {
                Boolean adShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.ad!= null)&&(!this.ad.isEmpty())));
                if (adShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Ad> sourceAd;
                    sourceAd = (((this.ad!= null)&&(!this.ad.isEmpty()))?this.getAd():null);
                    @SuppressWarnings("unchecked")
                    List<Ad> copyAd = ((List<Ad> ) strategy.copy(LocatorUtils.property(locator, "ad", sourceAd), sourceAd, ((this.ad!= null)&&(!this.ad.isEmpty()))));
                    copy.ad = null;
                    if (copyAd!= null) {
                        List<Ad> uniqueAdl = copy.getAd();
                        uniqueAdl.addAll(copyAd);
                    }
                } else {
                    if (adShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ad = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Trovit();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Trovit that = ((Trovit) object);
        {
            List<Ad> lhsAd;
            lhsAd = (((this.ad!= null)&&(!this.ad.isEmpty()))?this.getAd():null);
            List<Ad> rhsAd;
            rhsAd = (((that.ad!= null)&&(!that.ad.isEmpty()))?that.getAd():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ad", lhsAd), LocatorUtils.property(thatLocator, "ad", rhsAd), lhsAd, rhsAd, ((this.ad!= null)&&(!this.ad.isEmpty())), ((that.ad!= null)&&(!that.ad.isEmpty())))) {
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
