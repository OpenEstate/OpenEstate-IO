
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
 * Java class for &lt;hallen_lager_prod&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "hallen_lager_prod")
public class HallenLagerProd implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "hallen_typ")
    protected HallenLagerProd.HallenTyp hallenTyp;

    /**
     * Gets the value of the hallenTyp property.
     *
     * @return
     *     possible object is
     *     {@link HallenLagerProd.HallenTyp }
     *
     */
    public HallenLagerProd.HallenTyp getHallenTyp() {
        return hallenTyp;
    }

    /**
     * Sets the value of the hallenTyp property.
     *
     * @param value
     *     allowed object is
     *     {@link HallenLagerProd.HallenTyp }
     *
     */
    public void setHallenTyp(HallenLagerProd.HallenTyp value) {
        this.hallenTyp = value;
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
            HallenLagerProd.HallenTyp theHallenTyp;
            theHallenTyp = this.getHallenTyp();
            strategy.appendField(locator, this, "hallenTyp", buffer, theHallenTyp, (this.hallenTyp!= null));
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
        if (draftCopy instanceof HallenLagerProd) {
            final HallenLagerProd copy = ((HallenLagerProd) draftCopy);
            {
                Boolean hallenTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hallenTyp!= null));
                if (hallenTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    HallenLagerProd.HallenTyp sourceHallenTyp;
                    sourceHallenTyp = this.getHallenTyp();
                    HallenLagerProd.HallenTyp copyHallenTyp = ((HallenLagerProd.HallenTyp) strategy.copy(LocatorUtils.property(locator, "hallenTyp", sourceHallenTyp), sourceHallenTyp, (this.hallenTyp!= null)));
                    copy.setHallenTyp(copyHallenTyp);
                } else {
                    if (hallenTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hallenTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new HallenLagerProd();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HallenLagerProd that = ((HallenLagerProd) object);
        {
            HallenLagerProd.HallenTyp lhsHallenTyp;
            lhsHallenTyp = this.getHallenTyp();
            HallenLagerProd.HallenTyp rhsHallenTyp;
            rhsHallenTyp = that.getHallenTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hallenTyp", lhsHallenTyp), LocatorUtils.property(thatLocator, "hallenTyp", rhsHallenTyp), lhsHallenTyp, rhsHallenTyp, (this.hallenTyp!= null), (that.hallenTyp!= null))) {
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
     * Java enum for <em>hallen_typ</em> attribute in &lt;hallen_lager_prod&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum HallenTyp {

        HALLE,
        LAGER,
        PRODUKTION,
        WERKSTATT,
        HOCHREGALLAGER,
        SERVICE,
        FREIFLAECHEN;

        public String value() {
            return name();
        }

        public static HallenLagerProd.HallenTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}