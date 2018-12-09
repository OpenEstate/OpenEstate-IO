
package org.openestate.io.kyero.xml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
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
 *         &lt;element name="kyero" type="{}kyeroType"/&gt;
 *         &lt;element name="agent" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="mob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="addr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="addr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="town" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="property" type="{}propertyType" maxOccurs="unbounded"/&gt;
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
    "kyero",
    "agent",
    "property"
})
@XmlRootElement(name = "root")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
public class Root implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected KyeroType kyero;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected Root.Agent agent;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    protected List<PropertyType> property;

    /**
     * Gets the value of the kyero property.
     * 
     * @return
     *     possible object is
     *     {@link KyeroType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public KyeroType getKyero() {
        return kyero;
    }

    /**
     * Sets the value of the kyero property.
     * 
     * @param value
     *     allowed object is
     *     {@link KyeroType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setKyero(KyeroType value) {
        this.kyero = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link Root.Agent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public Root.Agent getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Root.Agent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public void setAgent(Root.Agent value) {
        this.agent = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public List<PropertyType> getProperty() {
        if (property == null) {
            property = new ArrayList<PropertyType>();
        }
        return this.property;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            KyeroType theKyero;
            theKyero = this.getKyero();
            strategy.appendField(locator, this, "kyero", buffer, theKyero, (this.kyero!= null));
        }
        {
            Root.Agent theAgent;
            theAgent = this.getAgent();
            strategy.appendField(locator, this, "agent", buffer, theAgent, (this.agent!= null));
        }
        {
            List<PropertyType> theProperty;
            theProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
            strategy.appendField(locator, this, "property", buffer, theProperty, ((this.property!= null)&&(!this.property.isEmpty())));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Root) {
            final Root copy = ((Root) draftCopy);
            {
                Boolean kyeroShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kyero!= null));
                if (kyeroShouldBeCopiedAndSet == Boolean.TRUE) {
                    KyeroType sourceKyero;
                    sourceKyero = this.getKyero();
                    KyeroType copyKyero = ((KyeroType) strategy.copy(LocatorUtils.property(locator, "kyero", sourceKyero), sourceKyero, (this.kyero!= null)));
                    copy.setKyero(copyKyero);
                } else {
                    if (kyeroShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kyero = null;
                    }
                }
            }
            {
                Boolean agentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.agent!= null));
                if (agentShouldBeCopiedAndSet == Boolean.TRUE) {
                    Root.Agent sourceAgent;
                    sourceAgent = this.getAgent();
                    Root.Agent copyAgent = ((Root.Agent) strategy.copy(LocatorUtils.property(locator, "agent", sourceAgent), sourceAgent, (this.agent!= null)));
                    copy.setAgent(copyAgent);
                } else {
                    if (agentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.agent = null;
                    }
                }
            }
            {
                Boolean propertyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.property!= null)&&(!this.property.isEmpty())));
                if (propertyShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<PropertyType> sourceProperty;
                    sourceProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
                    @SuppressWarnings("unchecked")
                    List<PropertyType> copyProperty = ((List<PropertyType> ) strategy.copy(LocatorUtils.property(locator, "property", sourceProperty), sourceProperty, ((this.property!= null)&&(!this.property.isEmpty()))));
                    copy.property = null;
                    if (copyProperty!= null) {
                        List<PropertyType> uniquePropertyl = copy.getProperty();
                        uniquePropertyl.addAll(copyProperty);
                    }
                } else {
                    if (propertyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.property = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Root();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Root that = ((Root) object);
        {
            KyeroType lhsKyero;
            lhsKyero = this.getKyero();
            KyeroType rhsKyero;
            rhsKyero = that.getKyero();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kyero", lhsKyero), LocatorUtils.property(thatLocator, "kyero", rhsKyero), lhsKyero, rhsKyero, (this.kyero!= null), (that.kyero!= null))) {
                return false;
            }
        }
        {
            Root.Agent lhsAgent;
            lhsAgent = this.getAgent();
            Root.Agent rhsAgent;
            rhsAgent = that.getAgent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agent", lhsAgent), LocatorUtils.property(thatLocator, "agent", rhsAgent), lhsAgent, rhsAgent, (this.agent!= null), (that.agent!= null))) {
                return false;
            }
        }
        {
            List<PropertyType> lhsProperty;
            lhsProperty = (((this.property!= null)&&(!this.property.isEmpty()))?this.getProperty():null);
            List<PropertyType> rhsProperty;
            rhsProperty = (((that.property!= null)&&(!that.property.isEmpty()))?that.getProperty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "property", lhsProperty), LocatorUtils.property(thatLocator, "property", rhsProperty), lhsProperty, rhsProperty, ((this.property!= null)&&(!this.property.isEmpty())), ((that.property!= null)&&(!that.property.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
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
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="mob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="addr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="addr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="town" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
    public static class Agent implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(type = String.class)
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "integer")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        protected BigInteger id;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        protected String name;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        protected String email;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        protected String tel;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        protected String fax;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        protected String mob;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        protected String addr1;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        protected String addr2;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        protected String town;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        protected String region;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        protected String postcode;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        protected String country;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public BigInteger getId() {
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public void setId(BigInteger value) {
            this.id = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the tel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public String getTel() {
            return tel;
        }

        /**
         * Sets the value of the tel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public void setTel(String value) {
            this.tel = value;
        }

        /**
         * Gets the value of the fax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public String getFax() {
            return fax;
        }

        /**
         * Sets the value of the fax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public void setFax(String value) {
            this.fax = value;
        }

        /**
         * Gets the value of the mob property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public String getMob() {
            return mob;
        }

        /**
         * Sets the value of the mob property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public void setMob(String value) {
            this.mob = value;
        }

        /**
         * Gets the value of the addr1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public String getAddr1() {
            return addr1;
        }

        /**
         * Sets the value of the addr1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public void setAddr1(String value) {
            this.addr1 = value;
        }

        /**
         * Gets the value of the addr2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public String getAddr2() {
            return addr2;
        }

        /**
         * Sets the value of the addr2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public void setAddr2(String value) {
            this.addr2 = value;
        }

        /**
         * Gets the value of the town property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public String getTown() {
            return town;
        }

        /**
         * Sets the value of the town property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public void setTown(String value) {
            this.town = value;
        }

        /**
         * Gets the value of the region property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public String getRegion() {
            return region;
        }

        /**
         * Sets the value of the region property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public void setRegion(String value) {
            this.region = value;
        }

        /**
         * Gets the value of the postcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public String getPostcode() {
            return postcode;
        }

        /**
         * Sets the value of the postcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public void setPostcode(String value) {
            this.postcode = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public void setCountry(String value) {
            this.country = value;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                BigInteger theId;
                theId = this.getId();
                strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
            }
            {
                String theName;
                theName = this.getName();
                strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
            }
            {
                String theEmail;
                theEmail = this.getEmail();
                strategy.appendField(locator, this, "email", buffer, theEmail, (this.email!= null));
            }
            {
                String theTel;
                theTel = this.getTel();
                strategy.appendField(locator, this, "tel", buffer, theTel, (this.tel!= null));
            }
            {
                String theFax;
                theFax = this.getFax();
                strategy.appendField(locator, this, "fax", buffer, theFax, (this.fax!= null));
            }
            {
                String theMob;
                theMob = this.getMob();
                strategy.appendField(locator, this, "mob", buffer, theMob, (this.mob!= null));
            }
            {
                String theAddr1;
                theAddr1 = this.getAddr1();
                strategy.appendField(locator, this, "addr1", buffer, theAddr1, (this.addr1 != null));
            }
            {
                String theAddr2;
                theAddr2 = this.getAddr2();
                strategy.appendField(locator, this, "addr2", buffer, theAddr2, (this.addr2 != null));
            }
            {
                String theTown;
                theTown = this.getTown();
                strategy.appendField(locator, this, "town", buffer, theTown, (this.town!= null));
            }
            {
                String theRegion;
                theRegion = this.getRegion();
                strategy.appendField(locator, this, "region", buffer, theRegion, (this.region!= null));
            }
            {
                String thePostcode;
                thePostcode = this.getPostcode();
                strategy.appendField(locator, this, "postcode", buffer, thePostcode, (this.postcode!= null));
            }
            {
                String theCountry;
                theCountry = this.getCountry();
                strategy.appendField(locator, this, "country", buffer, theCountry, (this.country!= null));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof Root.Agent) {
                final Root.Agent copy = ((Root.Agent) draftCopy);
                {
                    Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                    if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceId;
                        sourceId = this.getId();
                        BigInteger copyId = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                        copy.setId(copyId);
                    } else {
                        if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.id = null;
                        }
                    }
                }
                {
                    Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                    if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceName;
                        sourceName = this.getName();
                        String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName, (this.name!= null)));
                        copy.setName(copyName);
                    } else {
                        if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.name = null;
                        }
                    }
                }
                {
                    Boolean emailShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.email!= null));
                    if (emailShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceEmail;
                        sourceEmail = this.getEmail();
                        String copyEmail = ((String) strategy.copy(LocatorUtils.property(locator, "email", sourceEmail), sourceEmail, (this.email!= null)));
                        copy.setEmail(copyEmail);
                    } else {
                        if (emailShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.email = null;
                        }
                    }
                }
                {
                    Boolean telShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tel!= null));
                    if (telShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceTel;
                        sourceTel = this.getTel();
                        String copyTel = ((String) strategy.copy(LocatorUtils.property(locator, "tel", sourceTel), sourceTel, (this.tel!= null)));
                        copy.setTel(copyTel);
                    } else {
                        if (telShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.tel = null;
                        }
                    }
                }
                {
                    Boolean faxShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fax!= null));
                    if (faxShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceFax;
                        sourceFax = this.getFax();
                        String copyFax = ((String) strategy.copy(LocatorUtils.property(locator, "fax", sourceFax), sourceFax, (this.fax!= null)));
                        copy.setFax(copyFax);
                    } else {
                        if (faxShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.fax = null;
                        }
                    }
                }
                {
                    Boolean mobShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mob!= null));
                    if (mobShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceMob;
                        sourceMob = this.getMob();
                        String copyMob = ((String) strategy.copy(LocatorUtils.property(locator, "mob", sourceMob), sourceMob, (this.mob!= null)));
                        copy.setMob(copyMob);
                    } else {
                        if (mobShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.mob = null;
                        }
                    }
                }
                {
                    Boolean addr1ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.addr1 != null));
                    if (addr1ShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceAddr1;
                        sourceAddr1 = this.getAddr1();
                        String copyAddr1 = ((String) strategy.copy(LocatorUtils.property(locator, "addr1", sourceAddr1), sourceAddr1, (this.addr1 != null)));
                        copy.setAddr1(copyAddr1);
                    } else {
                        if (addr1ShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.addr1 = null;
                        }
                    }
                }
                {
                    Boolean addr2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.addr2 != null));
                    if (addr2ShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceAddr2;
                        sourceAddr2 = this.getAddr2();
                        String copyAddr2 = ((String) strategy.copy(LocatorUtils.property(locator, "addr2", sourceAddr2), sourceAddr2, (this.addr2 != null)));
                        copy.setAddr2(copyAddr2);
                    } else {
                        if (addr2ShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.addr2 = null;
                        }
                    }
                }
                {
                    Boolean townShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.town!= null));
                    if (townShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceTown;
                        sourceTown = this.getTown();
                        String copyTown = ((String) strategy.copy(LocatorUtils.property(locator, "town", sourceTown), sourceTown, (this.town!= null)));
                        copy.setTown(copyTown);
                    } else {
                        if (townShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.town = null;
                        }
                    }
                }
                {
                    Boolean regionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.region!= null));
                    if (regionShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceRegion;
                        sourceRegion = this.getRegion();
                        String copyRegion = ((String) strategy.copy(LocatorUtils.property(locator, "region", sourceRegion), sourceRegion, (this.region!= null)));
                        copy.setRegion(copyRegion);
                    } else {
                        if (regionShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.region = null;
                        }
                    }
                }
                {
                    Boolean postcodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.postcode!= null));
                    if (postcodeShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourcePostcode;
                        sourcePostcode = this.getPostcode();
                        String copyPostcode = ((String) strategy.copy(LocatorUtils.property(locator, "postcode", sourcePostcode), sourcePostcode, (this.postcode!= null)));
                        copy.setPostcode(copyPostcode);
                    } else {
                        if (postcodeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.postcode = null;
                        }
                    }
                }
                {
                    Boolean countryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.country!= null));
                    if (countryShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceCountry;
                        sourceCountry = this.getCountry();
                        String copyCountry = ((String) strategy.copy(LocatorUtils.property(locator, "country", sourceCountry), sourceCountry, (this.country!= null)));
                        copy.setCountry(copyCountry);
                    } else {
                        if (countryShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.country = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new Root.Agent();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Root.Agent that = ((Root.Agent) object);
            {
                BigInteger lhsId;
                lhsId = this.getId();
                BigInteger rhsId;
                rhsId = that.getId();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                    return false;
                }
            }
            {
                String lhsName;
                lhsName = this.getName();
                String rhsName;
                rhsName = that.getName();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                    return false;
                }
            }
            {
                String lhsEmail;
                lhsEmail = this.getEmail();
                String rhsEmail;
                rhsEmail = that.getEmail();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail, (this.email!= null), (that.email!= null))) {
                    return false;
                }
            }
            {
                String lhsTel;
                lhsTel = this.getTel();
                String rhsTel;
                rhsTel = that.getTel();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "tel", lhsTel), LocatorUtils.property(thatLocator, "tel", rhsTel), lhsTel, rhsTel, (this.tel!= null), (that.tel!= null))) {
                    return false;
                }
            }
            {
                String lhsFax;
                lhsFax = this.getFax();
                String rhsFax;
                rhsFax = that.getFax();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "fax", lhsFax), LocatorUtils.property(thatLocator, "fax", rhsFax), lhsFax, rhsFax, (this.fax!= null), (that.fax!= null))) {
                    return false;
                }
            }
            {
                String lhsMob;
                lhsMob = this.getMob();
                String rhsMob;
                rhsMob = that.getMob();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mob", lhsMob), LocatorUtils.property(thatLocator, "mob", rhsMob), lhsMob, rhsMob, (this.mob!= null), (that.mob!= null))) {
                    return false;
                }
            }
            {
                String lhsAddr1;
                lhsAddr1 = this.getAddr1();
                String rhsAddr1;
                rhsAddr1 = that.getAddr1();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "addr1", lhsAddr1), LocatorUtils.property(thatLocator, "addr1", rhsAddr1), lhsAddr1, rhsAddr1, (this.addr1 != null), (that.addr1 != null))) {
                    return false;
                }
            }
            {
                String lhsAddr2;
                lhsAddr2 = this.getAddr2();
                String rhsAddr2;
                rhsAddr2 = that.getAddr2();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "addr2", lhsAddr2), LocatorUtils.property(thatLocator, "addr2", rhsAddr2), lhsAddr2, rhsAddr2, (this.addr2 != null), (that.addr2 != null))) {
                    return false;
                }
            }
            {
                String lhsTown;
                lhsTown = this.getTown();
                String rhsTown;
                rhsTown = that.getTown();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "town", lhsTown), LocatorUtils.property(thatLocator, "town", rhsTown), lhsTown, rhsTown, (this.town!= null), (that.town!= null))) {
                    return false;
                }
            }
            {
                String lhsRegion;
                lhsRegion = this.getRegion();
                String rhsRegion;
                rhsRegion = that.getRegion();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "region", lhsRegion), LocatorUtils.property(thatLocator, "region", rhsRegion), lhsRegion, rhsRegion, (this.region!= null), (that.region!= null))) {
                    return false;
                }
            }
            {
                String lhsPostcode;
                lhsPostcode = this.getPostcode();
                String rhsPostcode;
                rhsPostcode = that.getPostcode();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "postcode", lhsPostcode), LocatorUtils.property(thatLocator, "postcode", rhsPostcode), lhsPostcode, rhsPostcode, (this.postcode!= null), (that.postcode!= null))) {
                    return false;
                }
            }
            {
                String lhsCountry;
                lhsCountry = this.getCountry();
                String rhsCountry;
                rhsCountry = that.getCountry();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry, (this.country!= null), (that.country!= null))) {
                    return false;
                }
            }
            return true;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T01:43:04+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

    }

}
