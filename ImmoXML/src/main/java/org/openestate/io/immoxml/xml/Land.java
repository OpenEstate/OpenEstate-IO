
package org.openestate.io.immoxml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
 * Java class for &lt;land&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "land")
public class Land
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "iso_land")
    protected String isoLand;

    /**
     * Gets the value of the isoLand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoLand() {
        return isoLand;
    }

    /**
     * Sets the value of the isoLand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoLand(String value) {
        this.isoLand = value;
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
            String theIsoLand;
            theIsoLand = this.getIsoLand();
            strategy.appendField(locator, this, "isoLand", buffer, theIsoLand);
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
        if (draftCopy instanceof Land) {
            final Land copy = ((Land) draftCopy);
            if (this.isoLand!= null) {
                String sourceIsoLand;
                sourceIsoLand = this.getIsoLand();
                String copyIsoLand = ((String) strategy.copy(LocatorUtils.property(locator, "isoLand", sourceIsoLand), sourceIsoLand));
                copy.setIsoLand(copyIsoLand);
            } else {
                copy.isoLand = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Land();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Land)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Land that = ((Land) object);
        {
            String lhsIsoLand;
            lhsIsoLand = this.getIsoLand();
            String rhsIsoLand;
            rhsIsoLand = that.getIsoLand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isoLand", lhsIsoLand), LocatorUtils.property(thatLocator, "isoLand", rhsIsoLand), lhsIsoLand, rhsIsoLand)) {
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
