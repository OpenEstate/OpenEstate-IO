
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * Java class for &lt;foto&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "format",
    "daten"
})
@XmlRootElement(name = "foto")
public class Foto implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    protected String format;
    @XmlElement(required = true)
    protected Daten daten;
    @XmlAttribute(name = "location", required = true)
    protected Foto.Location location;

    /**
     * Gets the value of the format property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the daten property.
     *
     * @return
     *     possible object is
     *     {@link Daten }
     *
     */
    public Daten getDaten() {
        return daten;
    }

    /**
     * Sets the value of the daten property.
     *
     * @param value
     *     allowed object is
     *     {@link Daten }
     *
     */
    public void setDaten(Daten value) {
        this.daten = value;
    }

    /**
     * Gets the value of the location property.
     *
     * @return
     *     possible object is
     *     {@link Foto.Location }
     *
     */
    public Foto.Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value
     *     allowed object is
     *     {@link Foto.Location }
     *
     */
    public void setLocation(Foto.Location value) {
        this.location = value;
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
            String theFormat;
            theFormat = this.getFormat();
            strategy.appendField(locator, this, "format", buffer, theFormat, (this.format!= null));
        }
        {
            Daten theDaten;
            theDaten = this.getDaten();
            strategy.appendField(locator, this, "daten", buffer, theDaten, (this.daten!= null));
        }
        {
            Foto.Location theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation, (this.location!= null));
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
        if (draftCopy instanceof Foto) {
            final Foto copy = ((Foto) draftCopy);
            {
                Boolean formatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.format!= null));
                if (formatShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFormat;
                    sourceFormat = this.getFormat();
                    String copyFormat = ((String) strategy.copy(LocatorUtils.property(locator, "format", sourceFormat), sourceFormat, (this.format!= null)));
                    copy.setFormat(copyFormat);
                } else {
                    if (formatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.format = null;
                    }
                }
            }
            {
                Boolean datenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.daten!= null));
                if (datenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Daten sourceDaten;
                    sourceDaten = this.getDaten();
                    Daten copyDaten = ((Daten) strategy.copy(LocatorUtils.property(locator, "daten", sourceDaten), sourceDaten, (this.daten!= null)));
                    copy.setDaten(copyDaten);
                } else {
                    if (datenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.daten = null;
                    }
                }
            }
            {
                Boolean locationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.location!= null));
                if (locationShouldBeCopiedAndSet == Boolean.TRUE) {
                    Foto.Location sourceLocation;
                    sourceLocation = this.getLocation();
                    Foto.Location copyLocation = ((Foto.Location) strategy.copy(LocatorUtils.property(locator, "location", sourceLocation), sourceLocation, (this.location!= null)));
                    copy.setLocation(copyLocation);
                } else {
                    if (locationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.location = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Foto();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Foto that = ((Foto) object);
        {
            String lhsFormat;
            lhsFormat = this.getFormat();
            String rhsFormat;
            rhsFormat = that.getFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "format", lhsFormat), LocatorUtils.property(thatLocator, "format", rhsFormat), lhsFormat, rhsFormat, (this.format!= null), (that.format!= null))) {
                return false;
            }
        }
        {
            Daten lhsDaten;
            lhsDaten = this.getDaten();
            Daten rhsDaten;
            rhsDaten = that.getDaten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "daten", lhsDaten), LocatorUtils.property(thatLocator, "daten", rhsDaten), lhsDaten, rhsDaten, (this.daten!= null), (that.daten!= null))) {
                return false;
            }
        }
        {
            Foto.Location lhsLocation;
            lhsLocation = this.getLocation();
            Foto.Location rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation, (this.location!= null), (that.location!= null))) {
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
     * Java enum for <em>gruppe</em> attribute in &lt;foto&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Location {

        EXTERN,
        REMOTE;

        public String value() {
            return name();
        }

        public static Foto.Location fromValue(String v) {
            return valueOf(v);
        }

    }

}