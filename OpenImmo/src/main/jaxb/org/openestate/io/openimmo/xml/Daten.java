
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * Java class for &lt;daten&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pfad",
    "anhanginhalt"
})
@XmlRootElement(name = "daten")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
public class Daten implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected String pfad;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    protected byte[] anhanginhalt;

    /**
     * Gets the value of the pfad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String getPfad() {
        return pfad;
    }

    /**
     * Sets the value of the pfad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setPfad(String value) {
        this.pfad = value;
    }

    /**
     * Gets the value of the anhanginhalt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public byte[] getAnhanginhalt() {
        return anhanginhalt;
    }

    /**
     * Sets the value of the anhanginhalt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public void setAnhanginhalt(byte[] value) {
        this.anhanginhalt = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String thePfad;
            thePfad = this.getPfad();
            strategy.appendField(locator, this, "pfad", buffer, thePfad, (this.pfad!= null));
        }
        {
            byte[] theAnhanginhalt;
            theAnhanginhalt = this.getAnhanginhalt();
            strategy.appendField(locator, this, "anhanginhalt", buffer, theAnhanginhalt, (this.anhanginhalt!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Daten) {
            final Daten copy = ((Daten) draftCopy);
            {
                Boolean pfadShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pfad!= null));
                if (pfadShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePfad;
                    sourcePfad = this.getPfad();
                    String copyPfad = ((String) strategy.copy(LocatorUtils.property(locator, "pfad", sourcePfad), sourcePfad, (this.pfad!= null)));
                    copy.setPfad(copyPfad);
                } else {
                    if (pfadShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pfad = null;
                    }
                }
            }
            {
                Boolean anhanginhaltShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anhanginhalt!= null));
                if (anhanginhaltShouldBeCopiedAndSet == Boolean.TRUE) {
                    byte[] sourceAnhanginhalt;
                    sourceAnhanginhalt = this.getAnhanginhalt();
                    byte[] copyAnhanginhalt = ((byte[]) strategy.copy(LocatorUtils.property(locator, "anhanginhalt", sourceAnhanginhalt), sourceAnhanginhalt, (this.anhanginhalt!= null)));
                    copy.setAnhanginhalt(copyAnhanginhalt);
                } else {
                    if (anhanginhaltShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anhanginhalt = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Daten();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Daten that = ((Daten) object);
        {
            String lhsPfad;
            lhsPfad = this.getPfad();
            String rhsPfad;
            rhsPfad = that.getPfad();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pfad", lhsPfad), LocatorUtils.property(thatLocator, "pfad", rhsPfad), lhsPfad, rhsPfad, (this.pfad!= null), (that.pfad!= null))) {
                return false;
            }
        }
        {
            byte[] lhsAnhanginhalt;
            lhsAnhanginhalt = this.getAnhanginhalt();
            byte[] rhsAnhanginhalt;
            rhsAnhanginhalt = that.getAnhanginhalt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anhanginhalt", lhsAnhanginhalt), LocatorUtils.property(thatLocator, "anhanginhalt", rhsAnhanginhalt), lhsAnhanginhalt, rhsAnhanginhalt, (this.anhanginhalt!= null), (that.anhanginhalt!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:54:50+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
