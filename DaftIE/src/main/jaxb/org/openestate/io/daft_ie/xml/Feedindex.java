
package org.openestate.io.daft_ie.xml;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
public class Feedindex implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public List<Feedindex.Feed> getFeed() {
        if (feed == null) {
            feed = new ArrayList<Feedindex.Feed>();
        }
        return this.feed;
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
            List<Feedindex.Feed> theFeed;
            theFeed = (((this.feed!= null)&&(!this.feed.isEmpty()))?this.getFeed():null);
            strategy.appendField(locator, this, "feed", buffer, theFeed, ((this.feed!= null)&&(!this.feed.isEmpty())));
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
        if (draftCopy instanceof Feedindex) {
            final Feedindex copy = ((Feedindex) draftCopy);
            {
                Boolean feedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.feed!= null)&&(!this.feed.isEmpty())));
                if (feedShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Feedindex.Feed> sourceFeed;
                    sourceFeed = (((this.feed!= null)&&(!this.feed.isEmpty()))?this.getFeed():null);
                    @SuppressWarnings("unchecked")
                    List<Feedindex.Feed> copyFeed = ((List<Feedindex.Feed> ) strategy.copy(LocatorUtils.property(locator, "feed", sourceFeed), sourceFeed, ((this.feed!= null)&&(!this.feed.isEmpty()))));
                    copy.feed = null;
                    if (copyFeed!= null) {
                        List<Feedindex.Feed> uniqueFeedl = copy.getFeed();
                        uniqueFeedl.addAll(copyFeed);
                    }
                } else {
                    if (feedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.feed = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Feedindex();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feed", lhsFeed), LocatorUtils.property(thatLocator, "feed", rhsFeed), lhsFeed, rhsFeed, ((this.feed!= null)&&(!this.feed.isEmpty())), ((that.feed!= null)&&(!that.feed.isEmpty())))) {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public static class Feed implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter3 .class)
        @XmlSchemaType(name = "anyURI")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
        protected URI loc;
        @XmlElement(type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "dateTime")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
        protected Calendar lastmod;

        /**
         * Gets the value of the loc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
        public URI getLoc() {
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
        public void setLoc(URI value) {
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
        public void setLastmod(Calendar value) {
            this.lastmod = value;
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
                URI theLoc;
                theLoc = this.getLoc();
                strategy.appendField(locator, this, "loc", buffer, theLoc, (this.loc!= null));
            }
            {
                Calendar theLastmod;
                theLastmod = this.getLastmod();
                strategy.appendField(locator, this, "lastmod", buffer, theLastmod, (this.lastmod!= null));
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
            if (draftCopy instanceof Feedindex.Feed) {
                final Feedindex.Feed copy = ((Feedindex.Feed) draftCopy);
                {
                    Boolean locShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loc!= null));
                    if (locShouldBeCopiedAndSet == Boolean.TRUE) {
                        URI sourceLoc;
                        sourceLoc = this.getLoc();
                        URI copyLoc = ((URI) strategy.copy(LocatorUtils.property(locator, "loc", sourceLoc), sourceLoc, (this.loc!= null)));
                        copy.setLoc(copyLoc);
                    } else {
                        if (locShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.loc = null;
                        }
                    }
                }
                {
                    Boolean lastmodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastmod!= null));
                    if (lastmodShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceLastmod;
                        sourceLastmod = this.getLastmod();
                        Calendar copyLastmod = ((Calendar) strategy.copy(LocatorUtils.property(locator, "lastmod", sourceLastmod), sourceLastmod, (this.lastmod!= null)));
                        copy.setLastmod(copyLastmod);
                    } else {
                        if (lastmodShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.lastmod = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new Feedindex.Feed();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Feedindex.Feed that = ((Feedindex.Feed) object);
            {
                URI lhsLoc;
                lhsLoc = this.getLoc();
                URI rhsLoc;
                rhsLoc = that.getLoc();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "loc", lhsLoc), LocatorUtils.property(thatLocator, "loc", rhsLoc), lhsLoc, rhsLoc, (this.loc!= null), (that.loc!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsLastmod;
                lhsLastmod = this.getLastmod();
                Calendar rhsLastmod;
                rhsLastmod = that.getLastmod();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "lastmod", lhsLastmod), LocatorUtils.property(thatLocator, "lastmod", rhsLastmod), lhsLastmod, rhsLastmod, (this.lastmod!= null), (that.lastmod!= null))) {
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

}
