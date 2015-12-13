
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
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
 * Java class for &lt;zinshaus_renditeobjekt&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "zinshaus_renditeobjekt")
public class ZinshausRenditeobjekt
    implements Cloneable, CopyTo, Equals, ToString
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
            ZinshausRenditeobjekt.ZinsTyp theZinsTyp;
            theZinsTyp = this.getZinsTyp();
            strategy.appendField(locator, this, "zinsTyp", buffer, theZinsTyp);
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
        if (draftCopy instanceof ZinshausRenditeobjekt) {
            final ZinshausRenditeobjekt copy = ((ZinshausRenditeobjekt) draftCopy);
            if (this.zinsTyp!= null) {
                ZinshausRenditeobjekt.ZinsTyp sourceZinsTyp;
                sourceZinsTyp = this.getZinsTyp();
                ZinshausRenditeobjekt.ZinsTyp copyZinsTyp = ((ZinshausRenditeobjekt.ZinsTyp) strategy.copy(LocatorUtils.property(locator, "zinsTyp", sourceZinsTyp), sourceZinsTyp));
                copy.setZinsTyp(copyZinsTyp);
            } else {
                copy.zinsTyp = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ZinshausRenditeobjekt();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zinsTyp", lhsZinsTyp), LocatorUtils.property(thatLocator, "zinsTyp", rhsZinsTyp), lhsZinsTyp, rhsZinsTyp)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * Java enum for <em>zins_typ</em> attribute in &lt;zinshaus_renditeobjekt&gt; elements.

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