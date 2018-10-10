
package org.openestate.io.immoxml.xml;

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
 * Java class for &lt;haus&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "haus")
public class Haus implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "haustyp")
    protected Haus.Haustyp haustyp;

    /**
     * Gets the value of the haustyp property.
     * 
     * @return
     *     possible object is
     *     {@link Haus.Haustyp }
     *     
     */
    public Haus.Haustyp getHaustyp() {
        return haustyp;
    }

    /**
     * Sets the value of the haustyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Haus.Haustyp }
     *     
     */
    public void setHaustyp(Haus.Haustyp value) {
        this.haustyp = value;
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
            Haus.Haustyp theHaustyp;
            theHaustyp = this.getHaustyp();
            strategy.appendField(locator, this, "haustyp", buffer, theHaustyp, (this.haustyp!= null));
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
        if (draftCopy instanceof Haus) {
            final Haus copy = ((Haus) draftCopy);
            {
                Boolean haustypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.haustyp!= null));
                if (haustypShouldBeCopiedAndSet == Boolean.TRUE) {
                    Haus.Haustyp sourceHaustyp;
                    sourceHaustyp = this.getHaustyp();
                    Haus.Haustyp copyHaustyp = ((Haus.Haustyp) strategy.copy(LocatorUtils.property(locator, "haustyp", sourceHaustyp), sourceHaustyp, (this.haustyp!= null)));
                    copy.setHaustyp(copyHaustyp);
                } else {
                    if (haustypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.haustyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Haus();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Haus that = ((Haus) object);
        {
            Haus.Haustyp lhsHaustyp;
            lhsHaustyp = this.getHaustyp();
            Haus.Haustyp rhsHaustyp;
            rhsHaustyp = that.getHaustyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haustyp", lhsHaustyp), LocatorUtils.property(thatLocator, "haustyp", rhsHaustyp), lhsHaustyp, rhsHaustyp, (this.haustyp!= null), (that.haustyp!= null))) {
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
     *                     Java enum for <em>haustyp</em> attribute in &lt;haus&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="REIHENHAUS"/&gt;
     *     &lt;enumeration value="REIHENEND"/&gt;
     *     &lt;enumeration value="REIHENMITTEL"/&gt;
     *     &lt;enumeration value="REIHENECK"/&gt;
     *     &lt;enumeration value="DOPPELHAUSHAELFTE"/&gt;
     *     &lt;enumeration value="EINFAMILIENHAUS"/&gt;
     *     &lt;enumeration value="STADTHAUS"/&gt;
     *     &lt;enumeration value="VILLA"/&gt;
     *     &lt;enumeration value="RESTHOF"/&gt;
     *     &lt;enumeration value="BAUERNHAUS"/&gt;
     *     &lt;enumeration value="LANDHAUS"/&gt;
     *     &lt;enumeration value="SCHLOSS"/&gt;
     *     &lt;enumeration value="ZWEIFAMILIENHAUS"/&gt;
     *     &lt;enumeration value="MEHRFAMILIENHAUS"/&gt;
     *     &lt;enumeration value="FERIENHAUS"/&gt;
     *     &lt;enumeration value="BERGHUETTE"/&gt;
     *     &lt;enumeration value="CHALET"/&gt;
     *     &lt;enumeration value="STRANDHAUS"/&gt;
     *     &lt;enumeration value="LAUBE-DATSCHE-GARTENHAUS"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum Haustyp {

        REIHENHAUS("REIHENHAUS"),
        REIHENEND("REIHENEND"),
        REIHENMITTEL("REIHENMITTEL"),
        REIHENECK("REIHENECK"),
        DOPPELHAUSHAELFTE("DOPPELHAUSHAELFTE"),
        EINFAMILIENHAUS("EINFAMILIENHAUS"),
        STADTHAUS("STADTHAUS"),
        VILLA("VILLA"),
        RESTHOF("RESTHOF"),
        BAUERNHAUS("BAUERNHAUS"),
        LANDHAUS("LANDHAUS"),
        SCHLOSS("SCHLOSS"),
        ZWEIFAMILIENHAUS("ZWEIFAMILIENHAUS"),
        MEHRFAMILIENHAUS("MEHRFAMILIENHAUS"),
        FERIENHAUS("FERIENHAUS"),
        BERGHUETTE("BERGHUETTE"),
        CHALET("CHALET"),
        STRANDHAUS("STRANDHAUS"),
        @XmlEnumValue("LAUBE-DATSCHE-GARTENHAUS")
        LAUBE_DATSCHE_GARTENHAUS("LAUBE-DATSCHE-GARTENHAUS");
        private final String value;

        Haustyp(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Haus.Haustyp fromValue(String v) {
            for (Haus.Haustyp c: Haus.Haustyp.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
