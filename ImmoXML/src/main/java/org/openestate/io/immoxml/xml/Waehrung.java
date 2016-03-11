
package org.openestate.io.immoxml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * Java class for &lt;waehrung&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "waehrung")
public class Waehrung implements Cloneable, CopyTo2, Equals2, ToString2
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
            String theIsoWaehrung;
            theIsoWaehrung = this.getIsoWaehrung();
            strategy.appendField(locator, this, "isoWaehrung", buffer, theIsoWaehrung, (this.isoWaehrung!= null));
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
        if (draftCopy instanceof Waehrung) {
            final Waehrung copy = ((Waehrung) draftCopy);
            {
                Boolean isoWaehrungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isoWaehrung!= null));
                if (isoWaehrungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIsoWaehrung;
                    sourceIsoWaehrung = this.getIsoWaehrung();
                    String copyIsoWaehrung = ((String) strategy.copy(LocatorUtils.property(locator, "isoWaehrung", sourceIsoWaehrung), sourceIsoWaehrung, (this.isoWaehrung!= null)));
                    copy.setIsoWaehrung(copyIsoWaehrung);
                } else {
                    if (isoWaehrungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isoWaehrung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Waehrung();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isoWaehrung", lhsIsoWaehrung), LocatorUtils.property(thatLocator, "isoWaehrung", rhsIsoWaehrung), lhsIsoWaehrung, rhsIsoWaehrung, (this.isoWaehrung!= null), (that.isoWaehrung!= null))) {
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
