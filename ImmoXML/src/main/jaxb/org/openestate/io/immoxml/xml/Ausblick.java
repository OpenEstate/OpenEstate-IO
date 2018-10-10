
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
 * Java class for &lt;ausblick&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ausblick")
public class Ausblick implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "blick")
    protected Ausblick.Blick blick;

    /**
     * Gets the value of the blick property.
     * 
     * @return
     *     possible object is
     *     {@link Ausblick.Blick }
     *     
     */
    public Ausblick.Blick getBlick() {
        return blick;
    }

    /**
     * Sets the value of the blick property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ausblick.Blick }
     *     
     */
    public void setBlick(Ausblick.Blick value) {
        this.blick = value;
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
            Ausblick.Blick theBlick;
            theBlick = this.getBlick();
            strategy.appendField(locator, this, "blick", buffer, theBlick, (this.blick!= null));
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
        if (draftCopy instanceof Ausblick) {
            final Ausblick copy = ((Ausblick) draftCopy);
            {
                Boolean blickShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.blick!= null));
                if (blickShouldBeCopiedAndSet == Boolean.TRUE) {
                    Ausblick.Blick sourceBlick;
                    sourceBlick = this.getBlick();
                    Ausblick.Blick copyBlick = ((Ausblick.Blick) strategy.copy(LocatorUtils.property(locator, "blick", sourceBlick), sourceBlick, (this.blick!= null)));
                    copy.setBlick(copyBlick);
                } else {
                    if (blickShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.blick = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Ausblick();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Ausblick that = ((Ausblick) object);
        {
            Ausblick.Blick lhsBlick;
            lhsBlick = this.getBlick();
            Ausblick.Blick rhsBlick;
            rhsBlick = that.getBlick();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "blick", lhsBlick), LocatorUtils.property(thatLocator, "blick", rhsBlick), lhsBlick, rhsBlick, (this.blick!= null), (that.blick!= null))) {
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
     * 
     *                     Java enum for <em>blick</em> attribute in &lt;ausblick&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="FERNE"/&gt;
     *     &lt;enumeration value="SEE"/&gt;
     *     &lt;enumeration value="BERGE"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum Blick {

        FERNE,
        SEE,
        BERGE;

        public String value() {
            return name();
        }

        public static Ausblick.Blick fromValue(String v) {
            return valueOf(v);
        }

    }

}
