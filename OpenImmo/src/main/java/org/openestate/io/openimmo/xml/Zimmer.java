
package org.openestate.io.openimmo.xml;

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
 * Java class for &lt;zimmer&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "zimmer")
public class Zimmer implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "zimmertyp")
    protected Zimmer.Zimmertyp zimmertyp;

    /**
     * Gets the value of the zimmertyp property.
     *
     * @return
     *     possible object is
     *     {@link Zimmer.Zimmertyp }
     *
     */
    public Zimmer.Zimmertyp getZimmertyp() {
        return zimmertyp;
    }

    /**
     * Sets the value of the zimmertyp property.
     *
     * @param value
     *     allowed object is
     *     {@link Zimmer.Zimmertyp }
     *
     */
    public void setZimmertyp(Zimmer.Zimmertyp value) {
        this.zimmertyp = value;
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
            Zimmer.Zimmertyp theZimmertyp;
            theZimmertyp = this.getZimmertyp();
            strategy.appendField(locator, this, "zimmertyp", buffer, theZimmertyp, (this.zimmertyp!= null));
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
        if (draftCopy instanceof Zimmer) {
            final Zimmer copy = ((Zimmer) draftCopy);
            {
                Boolean zimmertypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zimmertyp!= null));
                if (zimmertypShouldBeCopiedAndSet == Boolean.TRUE) {
                    Zimmer.Zimmertyp sourceZimmertyp;
                    sourceZimmertyp = this.getZimmertyp();
                    Zimmer.Zimmertyp copyZimmertyp = ((Zimmer.Zimmertyp) strategy.copy(LocatorUtils.property(locator, "zimmertyp", sourceZimmertyp), sourceZimmertyp, (this.zimmertyp!= null)));
                    copy.setZimmertyp(copyZimmertyp);
                } else {
                    if (zimmertypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zimmertyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Zimmer();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Zimmer that = ((Zimmer) object);
        {
            Zimmer.Zimmertyp lhsZimmertyp;
            lhsZimmertyp = this.getZimmertyp();
            Zimmer.Zimmertyp rhsZimmertyp;
            rhsZimmertyp = that.getZimmertyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zimmertyp", lhsZimmertyp), LocatorUtils.property(thatLocator, "zimmertyp", rhsZimmertyp), lhsZimmertyp, rhsZimmertyp, (this.zimmertyp!= null), (that.zimmertyp!= null))) {
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
     * Java enum for <em>zimmertyp</em> attribute in &lt;zimmer&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Zimmertyp {

        ZIMMER;

        public String value() {
            return name();
        }

        public static Zimmer.Zimmertyp fromValue(String v) {
            return valueOf(v);
        }

    }

}