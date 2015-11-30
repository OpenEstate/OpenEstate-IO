
package org.openestate.io.openimmo.xml;

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
 * Java class for &lt;waehrung&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "waehrung")
public class Waehrung
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "iso_waehrung")
    protected String isoWaehrung;

    /**
     * Gets the value of the isoWaehrung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoWaehrung() {
        return isoWaehrung;
    }

    /**
     * Sets the value of the isoWaehrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoWaehrung(String value) {
        this.isoWaehrung = value;
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
            String theIsoWaehrung;
            theIsoWaehrung = this.getIsoWaehrung();
            strategy.appendField(locator, this, "isoWaehrung", buffer, theIsoWaehrung);
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
        if (draftCopy instanceof Waehrung) {
            final Waehrung copy = ((Waehrung) draftCopy);
            if (this.isoWaehrung!= null) {
                String sourceIsoWaehrung;
                sourceIsoWaehrung = this.getIsoWaehrung();
                String copyIsoWaehrung = ((String) strategy.copy(LocatorUtils.property(locator, "isoWaehrung", sourceIsoWaehrung), sourceIsoWaehrung));
                copy.setIsoWaehrung(copyIsoWaehrung);
            } else {
                copy.isoWaehrung = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Waehrung();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Waehrung that = ((Waehrung) object);
        {
            String lhsIsoWaehrung;
            lhsIsoWaehrung = this.getIsoWaehrung();
            String rhsIsoWaehrung;
            rhsIsoWaehrung = that.getIsoWaehrung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isoWaehrung", lhsIsoWaehrung), LocatorUtils.property(thatLocator, "isoWaehrung", rhsIsoWaehrung), lhsIsoWaehrung, rhsIsoWaehrung)) {
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
