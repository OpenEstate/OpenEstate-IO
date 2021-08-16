
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import javax.annotation.Generated;
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
 * Java class for &lt;zinshaus_renditeobjekt&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "zinshaus_renditeobjekt")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class ZinshausRenditeobjekt implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "zins_typ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected ZinshausRenditeobjekt.ZinsTyp zinsTyp;

    /**
     * Gets the value of the zinsTyp property.
     * 
     * @return
     *     possible object is
     *     {@link ZinshausRenditeobjekt.ZinsTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public ZinshausRenditeobjekt.ZinsTyp getZinsTyp() {
        return zinsTyp;
    }

    /**
     * Sets the value of the zinsTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZinshausRenditeobjekt.ZinsTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setZinsTyp(ZinshausRenditeobjekt.ZinsTyp value) {
        this.zinsTyp = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            ZinshausRenditeobjekt.ZinsTyp theZinsTyp;
            theZinsTyp = this.getZinsTyp();
            strategy.appendField(locator, this, "zinsTyp", buffer, theZinsTyp, (this.zinsTyp!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ZinshausRenditeobjekt) {
            final ZinshausRenditeobjekt copy = ((ZinshausRenditeobjekt) draftCopy);
            {
                Boolean zinsTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zinsTyp!= null));
                if (zinsTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    ZinshausRenditeobjekt.ZinsTyp sourceZinsTyp;
                    sourceZinsTyp = this.getZinsTyp();
                    ZinshausRenditeobjekt.ZinsTyp copyZinsTyp = ((ZinshausRenditeobjekt.ZinsTyp) strategy.copy(LocatorUtils.property(locator, "zinsTyp", sourceZinsTyp), sourceZinsTyp, (this.zinsTyp!= null)));
                    copy.setZinsTyp(copyZinsTyp);
                } else {
                    if (zinsTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zinsTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new ZinshausRenditeobjekt();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZinshausRenditeobjekt that = ((ZinshausRenditeobjekt) object);
        {
            ZinshausRenditeobjekt.ZinsTyp lhsZinsTyp;
            lhsZinsTyp = this.getZinsTyp();
            ZinshausRenditeobjekt.ZinsTyp rhsZinsTyp;
            rhsZinsTyp = that.getZinsTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zinsTyp", lhsZinsTyp), LocatorUtils.property(thatLocator, "zinsTyp", rhsZinsTyp), lhsZinsTyp, rhsZinsTyp, (this.zinsTyp!= null), (that.zinsTyp!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }


    /**
     * 
     *                     Java enum for <em>zins_typ</em> attribute in &lt;zinshaus_renditeobjekt&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="MEHRFAMILIENHAUS"/&gt;
     *     &lt;enumeration value="WOHN_UND_GESCHAEFTSHAUS"/&gt;
     *     &lt;enumeration value="GESCHAEFTSHAUS"/&gt;
     *     &lt;enumeration value="BUEROGEBAEUDE"/&gt;
     *     &lt;enumeration value="SB_MAERKTE"/&gt;
     *     &lt;enumeration value="EINKAUFSCENTREN"/&gt;
     *     &lt;enumeration value="WOHNANLAGEN"/&gt;
     *     &lt;enumeration value="VERBRAUCHERMAERKTE"/&gt;
     *     &lt;enumeration value="INDUSTRIEANLAGEN"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public enum ZinsTyp {

        MEHRFAMILIENHAUS,
        WOHN_UND_GESCHAEFTSHAUS,
        GESCHAEFTSHAUS,
        BUEROGEBAEUDE,
        SB_MAERKTE,
        EINKAUFSCENTREN,
        WOHNANLAGEN,
        VERBRAUCHERMAERKTE,
        INDUSTRIEANLAGEN;

        public String value() {
            return name();
        }

        public static ZinshausRenditeobjekt.ZinsTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}
