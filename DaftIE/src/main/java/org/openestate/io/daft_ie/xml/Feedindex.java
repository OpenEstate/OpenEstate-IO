
package org.openestate.io.daft_ie.xml;

import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feed" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="loc" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *                   &lt;element name="lastmod" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
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
@XmlType(name = "", propOrder = {
    "feed"
})
@XmlRootElement(name = "feedindex")
public class Feedindex
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<Feedindex.Feed> feed;

    /**
     * Gets the value of the feed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feedindex.Feed }
     * 
     * 
     */
    public List<Feedindex.Feed> getFeed() {
        if (feed == null) {
            feed = new ArrayList<Feedindex.Feed>();
        }
        return this.feed;
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
            List<Feedindex.Feed> theFeed;
            theFeed = (((this.feed!= null)&&(!this.feed.isEmpty()))?this.getFeed():null);
            strategy.appendField(locator, this, "feed", buffer, theFeed);
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
        if (draftCopy instanceof Feedindex) {
            final Feedindex copy = ((Feedindex) draftCopy);
            if ((this.feed!= null)&&(!this.feed.isEmpty())) {
                List<Feedindex.Feed> sourceFeed;
                sourceFeed = (((this.feed!= null)&&(!this.feed.isEmpty()))?this.getFeed():null);
                @SuppressWarnings("unchecked")
                List<Feedindex.Feed> copyFeed = ((List<Feedindex.Feed> ) strategy.copy(LocatorUtils.property(locator, "feed", sourceFeed), sourceFeed));
                copy.feed = null;
                if (copyFeed!= null) {
                    List<Feedindex.Feed> uniqueFeedl = copy.getFeed();
                    uniqueFeedl.addAll(copyFeed);
                }
            } else {
                copy.feed = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Feedindex();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Feedindex)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Feedindex that = ((Feedindex) object);
        {
            List<Feedindex.Feed> lhsFeed;
            lhsFeed = (((this.feed!= null)&&(!this.feed.isEmpty()))?this.getFeed():null);
            List<Feedindex.Feed> rhsFeed;
            rhsFeed = (((that.feed!= null)&&(!that.feed.isEmpty()))?that.getFeed():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feed", lhsFeed), LocatorUtils.property(thatLocator, "feed", rhsFeed), lhsFeed, rhsFeed)) {
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
     *         &lt;element name="loc" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
     *         &lt;element name="lastmod" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
    public static class Feed
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter3 .class)
        @XmlSchemaType(name = "anyURI")
        protected URL loc;
        @XmlElement(type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "dateTime")
        protected Calendar lastmod;

        /**
         * Gets the value of the loc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public URL getLoc() {
            return loc;
        }

        /**
         * Sets the value of the loc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoc(URL value) {
            this.loc = value;
        }

        /**
         * Gets the value of the lastmod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Calendar getLastmod() {
            return lastmod;
        }

        /**
         * Sets the value of the lastmod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastmod(Calendar value) {
            this.lastmod = value;
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
                URL theLoc;
                theLoc = this.getLoc();
                strategy.appendField(locator, this, "loc", buffer, theLoc);
            }
            {
                Calendar theLastmod;
                theLastmod = this.getLastmod();
                strategy.appendField(locator, this, "lastmod", buffer, theLastmod);
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
            if (draftCopy instanceof Feedindex.Feed) {
                final Feedindex.Feed copy = ((Feedindex.Feed) draftCopy);
                if (this.loc!= null) {
                    URL sourceLoc;
                    sourceLoc = this.getLoc();
                    URL copyLoc = ((URL) strategy.copy(LocatorUtils.property(locator, "loc", sourceLoc), sourceLoc));
                    copy.setLoc(copyLoc);
                } else {
                    copy.loc = null;
                }
                if (this.lastmod!= null) {
                    Calendar sourceLastmod;
                    sourceLastmod = this.getLastmod();
                    Calendar copyLastmod = ((Calendar) strategy.copy(LocatorUtils.property(locator, "lastmod", sourceLastmod), sourceLastmod));
                    copy.setLastmod(copyLastmod);
                } else {
                    copy.lastmod = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new Feedindex.Feed();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof Feedindex.Feed)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Feedindex.Feed that = ((Feedindex.Feed) object);
            {
                URL lhsLoc;
                lhsLoc = this.getLoc();
                URL rhsLoc;
                rhsLoc = that.getLoc();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "loc", lhsLoc), LocatorUtils.property(thatLocator, "loc", rhsLoc), lhsLoc, rhsLoc)) {
                    return false;
                }
            }
            {
                Calendar lhsLastmod;
                lhsLastmod = this.getLastmod();
                Calendar rhsLastmod;
                rhsLastmod = that.getLastmod();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "lastmod", lhsLastmod), LocatorUtils.property(thatLocator, "lastmod", rhsLastmod), lhsLastmod, rhsLastmod)) {
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
