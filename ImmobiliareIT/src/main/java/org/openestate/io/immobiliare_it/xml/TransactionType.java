
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * <p>Java class for transactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="auction"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="yes|no"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ownership" type="{http://feed.immobiliare.it}ownershipType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionType", propOrder = {
    "value"
})
public class TransactionType
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "auction")
    @XmlJavaTypeAdapter(Adapter21 .class)
    protected Boolean auction;
    @XmlAttribute(name = "ownership")
    protected OwnershipType ownership;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the auction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isAuction() {
        return auction;
    }

    /**
     * Sets the value of the auction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuction(Boolean value) {
        this.auction = value;
    }

    /**
     * Gets the value of the ownership property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipType }
     *     
     */
    public OwnershipType getOwnership() {
        return ownership;
    }

    /**
     * Sets the value of the ownership property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipType }
     *     
     */
    public void setOwnership(OwnershipType value) {
        this.ownership = value;
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
            String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            Boolean theAuction;
            theAuction = this.isAuction();
            strategy.appendField(locator, this, "auction", buffer, theAuction);
        }
        {
            OwnershipType theOwnership;
            theOwnership = this.getOwnership();
            strategy.appendField(locator, this, "ownership", buffer, theOwnership);
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
        if (draftCopy instanceof TransactionType) {
            final TransactionType copy = ((TransactionType) draftCopy);
            if (this.value!= null) {
                String sourceValue;
                sourceValue = this.getValue();
                String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.auction!= null) {
                Boolean sourceAuction;
                sourceAuction = this.isAuction();
                Boolean copyAuction = ((Boolean) strategy.copy(LocatorUtils.property(locator, "auction", sourceAuction), sourceAuction));
                copy.setAuction(copyAuction);
            } else {
                copy.auction = null;
            }
            if (this.ownership!= null) {
                OwnershipType sourceOwnership;
                sourceOwnership = this.getOwnership();
                OwnershipType copyOwnership = ((OwnershipType) strategy.copy(LocatorUtils.property(locator, "ownership", sourceOwnership), sourceOwnership));
                copy.setOwnership(copyOwnership);
            } else {
                copy.ownership = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TransactionType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TransactionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TransactionType that = ((TransactionType) object);
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            Boolean lhsAuction;
            lhsAuction = this.isAuction();
            Boolean rhsAuction;
            rhsAuction = that.isAuction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auction", lhsAuction), LocatorUtils.property(thatLocator, "auction", rhsAuction), lhsAuction, rhsAuction)) {
                return false;
            }
        }
        {
            OwnershipType lhsOwnership;
            lhsOwnership = this.getOwnership();
            OwnershipType rhsOwnership;
            rhsOwnership = that.getOwnership();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ownership", lhsOwnership), LocatorUtils.property(thatLocator, "ownership", rhsOwnership), lhsOwnership, rhsOwnership)) {
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
