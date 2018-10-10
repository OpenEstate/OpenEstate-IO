
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
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
public class ZinshausRenditeobjekt implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "zins_typ")
    protected ZinshausRenditeobjekt.ZinsTyp zinsTyp;

    /**
     * Gets the value of the zinsTyp property.
     * 
     * @return
     *     possible object is
     *     {@link ZinshausRenditeobjekt.ZinsTyp }
     *     
     */
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
    public void setZinsTyp(ZinshausRenditeobjekt.ZinsTyp value) {
        this.zinsTyp = value;
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
            ZinshausRenditeobjekt.ZinsTyp theZinsTyp;
            theZinsTyp = this.getZinsTyp();
            strategy.appendField(locator, this, "zinsTyp", buffer, theZinsTyp, (this.zinsTyp!= null));
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

    public Object createNewInstance() {
        return new ZinshausRenditeobjekt();
    }

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

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
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
     *     &lt;enumeration value="PFLEGEHEIM"/&gt;
     *     &lt;enumeration value="SANATORIUM"/&gt;
     *     &lt;enumeration value="SENIORENHEIM"/&gt;
     *     &lt;enumeration value="BETREUTES-WOHNEN"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum ZinsTyp {

        MEHRFAMILIENHAUS("MEHRFAMILIENHAUS"),
        WOHN_UND_GESCHAEFTSHAUS("WOHN_UND_GESCHAEFTSHAUS"),
        GESCHAEFTSHAUS("GESCHAEFTSHAUS"),
        BUEROGEBAEUDE("BUEROGEBAEUDE"),
        SB_MAERKTE("SB_MAERKTE"),
        EINKAUFSCENTREN("EINKAUFSCENTREN"),
        WOHNANLAGEN("WOHNANLAGEN"),
        VERBRAUCHERMAERKTE("VERBRAUCHERMAERKTE"),
        INDUSTRIEANLAGEN("INDUSTRIEANLAGEN"),
        PFLEGEHEIM("PFLEGEHEIM"),
        SANATORIUM("SANATORIUM"),
        SENIORENHEIM("SENIORENHEIM"),
        @XmlEnumValue("BETREUTES-WOHNEN")
        BETREUTES_WOHNEN("BETREUTES-WOHNEN");
        private final String value;

        ZinsTyp(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static ZinshausRenditeobjekt.ZinsTyp fromValue(String v) {
            for (ZinshausRenditeobjekt.ZinsTyp c: ZinshausRenditeobjekt.ZinsTyp.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
