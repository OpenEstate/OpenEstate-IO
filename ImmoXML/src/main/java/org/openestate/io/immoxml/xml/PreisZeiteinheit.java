
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
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
 * Java class for &lt;preis_zeiteinheit&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "preis_zeiteinheit")
public class PreisZeiteinheit implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "zeiteinheit")
    protected PreisZeiteinheit.Zeiteinheit zeiteinheit;

    /**
     * Gets the value of the zeiteinheit property.
     *
     * @return
     *     possible object is
     *     {@link PreisZeiteinheit.Zeiteinheit }
     *
     */
    public PreisZeiteinheit.Zeiteinheit getZeiteinheit() {
        return zeiteinheit;
    }

    /**
     * Sets the value of the zeiteinheit property.
     *
     * @param value
     *     allowed object is
     *     {@link PreisZeiteinheit.Zeiteinheit }
     *
     */
    public void setZeiteinheit(PreisZeiteinheit.Zeiteinheit value) {
        this.zeiteinheit = value;
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
            PreisZeiteinheit.Zeiteinheit theZeiteinheit;
            theZeiteinheit = this.getZeiteinheit();
            strategy.appendField(locator, this, "zeiteinheit", buffer, theZeiteinheit, (this.zeiteinheit!= null));
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
        if (draftCopy instanceof PreisZeiteinheit) {
            final PreisZeiteinheit copy = ((PreisZeiteinheit) draftCopy);
            {
                Boolean zeiteinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zeiteinheit!= null));
                if (zeiteinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    PreisZeiteinheit.Zeiteinheit sourceZeiteinheit;
                    sourceZeiteinheit = this.getZeiteinheit();
                    PreisZeiteinheit.Zeiteinheit copyZeiteinheit = ((PreisZeiteinheit.Zeiteinheit) strategy.copy(LocatorUtils.property(locator, "zeiteinheit", sourceZeiteinheit), sourceZeiteinheit, (this.zeiteinheit!= null)));
                    copy.setZeiteinheit(copyZeiteinheit);
                } else {
                    if (zeiteinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zeiteinheit = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PreisZeiteinheit();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PreisZeiteinheit that = ((PreisZeiteinheit) object);
        {
            PreisZeiteinheit.Zeiteinheit lhsZeiteinheit;
            lhsZeiteinheit = this.getZeiteinheit();
            PreisZeiteinheit.Zeiteinheit rhsZeiteinheit;
            rhsZeiteinheit = that.getZeiteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeiteinheit", lhsZeiteinheit), LocatorUtils.property(thatLocator, "zeiteinheit", rhsZeiteinheit), lhsZeiteinheit, rhsZeiteinheit, (this.zeiteinheit!= null), (that.zeiteinheit!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * Java enum for <em>zeiteinheit</em> attribute in &lt;preis_zeiteinheit&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Zeiteinheit {

        TAG,
        WOCHE,
        MONAT,
        JAHR;

        public String value() {
            return name();
        }

        public static PreisZeiteinheit.Zeiteinheit fromValue(String v) {
            return valueOf(v);
        }

    }

}