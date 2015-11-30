
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * Java class for &lt;anhang&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "anhangtitel",
    "format",
    "check",
    "daten"
})
@XmlRootElement(name = "anhang")
public class Anhang
    implements Cloneable, CopyTo, Equals, ToString
{

    protected String anhangtitel;
    @XmlElement(required = true)
    protected String format;
    protected Check check;
    @XmlElement(required = true)
    protected Daten daten;
    @XmlAttribute(name = "location", required = true)
    protected Anhang.Location location;
    @XmlAttribute(name = "gruppe")
    protected Anhang.Gruppe gruppe;

    /**
     * Gets the value of the anhangtitel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAnhangtitel() {
        return anhangtitel;
    }

    /**
     * Sets the value of the anhangtitel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAnhangtitel(String value) {
        this.anhangtitel = value;
    }

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
     * Gets the value of the check property.
     *
     * @return
     *     possible object is
     *     {@link Check }
     *
     */
    public Check getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     *
     * @param value
     *     allowed object is
     *     {@link Check }
     *
     */
    public void setCheck(Check value) {
        this.check = value;
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
     *     {@link Anhang.Location }
     *
     */
    public Anhang.Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value
     *     allowed object is
     *     {@link Anhang.Location }
     *
     */
    public void setLocation(Anhang.Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the gruppe property.
     *
     * @return
     *     possible object is
     *     {@link Anhang.Gruppe }
     *
     */
    public Anhang.Gruppe getGruppe() {
        return gruppe;
    }

    /**
     * Sets the value of the gruppe property.
     *
     * @param value
     *     allowed object is
     *     {@link Anhang.Gruppe }
     *
     */
    public void setGruppe(Anhang.Gruppe value) {
        this.gruppe = value;
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
            String theAnhangtitel;
            theAnhangtitel = this.getAnhangtitel();
            strategy.appendField(locator, this, "anhangtitel", buffer, theAnhangtitel);
        }
        {
            String theFormat;
            theFormat = this.getFormat();
            strategy.appendField(locator, this, "format", buffer, theFormat);
        }
        {
            Check theCheck;
            theCheck = this.getCheck();
            strategy.appendField(locator, this, "check", buffer, theCheck);
        }
        {
            Daten theDaten;
            theDaten = this.getDaten();
            strategy.appendField(locator, this, "daten", buffer, theDaten);
        }
        {
            Anhang.Location theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation);
        }
        {
            Anhang.Gruppe theGruppe;
            theGruppe = this.getGruppe();
            strategy.appendField(locator, this, "gruppe", buffer, theGruppe);
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
        if (draftCopy instanceof Anhang) {
            final Anhang copy = ((Anhang) draftCopy);
            if (this.anhangtitel!= null) {
                String sourceAnhangtitel;
                sourceAnhangtitel = this.getAnhangtitel();
                String copyAnhangtitel = ((String) strategy.copy(LocatorUtils.property(locator, "anhangtitel", sourceAnhangtitel), sourceAnhangtitel));
                copy.setAnhangtitel(copyAnhangtitel);
            } else {
                copy.anhangtitel = null;
            }
            if (this.format!= null) {
                String sourceFormat;
                sourceFormat = this.getFormat();
                String copyFormat = ((String) strategy.copy(LocatorUtils.property(locator, "format", sourceFormat), sourceFormat));
                copy.setFormat(copyFormat);
            } else {
                copy.format = null;
            }
            if (this.check!= null) {
                Check sourceCheck;
                sourceCheck = this.getCheck();
                Check copyCheck = ((Check) strategy.copy(LocatorUtils.property(locator, "check", sourceCheck), sourceCheck));
                copy.setCheck(copyCheck);
            } else {
                copy.check = null;
            }
            if (this.daten!= null) {
                Daten sourceDaten;
                sourceDaten = this.getDaten();
                Daten copyDaten = ((Daten) strategy.copy(LocatorUtils.property(locator, "daten", sourceDaten), sourceDaten));
                copy.setDaten(copyDaten);
            } else {
                copy.daten = null;
            }
            if (this.location!= null) {
                Anhang.Location sourceLocation;
                sourceLocation = this.getLocation();
                Anhang.Location copyLocation = ((Anhang.Location) strategy.copy(LocatorUtils.property(locator, "location", sourceLocation), sourceLocation));
                copy.setLocation(copyLocation);
            } else {
                copy.location = null;
            }
            if (this.gruppe!= null) {
                Anhang.Gruppe sourceGruppe;
                sourceGruppe = this.getGruppe();
                Anhang.Gruppe copyGruppe = ((Anhang.Gruppe) strategy.copy(LocatorUtils.property(locator, "gruppe", sourceGruppe), sourceGruppe));
                copy.setGruppe(copyGruppe);
            } else {
                copy.gruppe = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Anhang();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Anhang that = ((Anhang) object);
        {
            String lhsAnhangtitel;
            lhsAnhangtitel = this.getAnhangtitel();
            String rhsAnhangtitel;
            rhsAnhangtitel = that.getAnhangtitel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anhangtitel", lhsAnhangtitel), LocatorUtils.property(thatLocator, "anhangtitel", rhsAnhangtitel), lhsAnhangtitel, rhsAnhangtitel)) {
                return false;
            }
        }
        {
            String lhsFormat;
            lhsFormat = this.getFormat();
            String rhsFormat;
            rhsFormat = that.getFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "format", lhsFormat), LocatorUtils.property(thatLocator, "format", rhsFormat), lhsFormat, rhsFormat)) {
                return false;
            }
        }
        {
            Check lhsCheck;
            lhsCheck = this.getCheck();
            Check rhsCheck;
            rhsCheck = that.getCheck();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "check", lhsCheck), LocatorUtils.property(thatLocator, "check", rhsCheck), lhsCheck, rhsCheck)) {
                return false;
            }
        }
        {
            Daten lhsDaten;
            lhsDaten = this.getDaten();
            Daten rhsDaten;
            rhsDaten = that.getDaten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "daten", lhsDaten), LocatorUtils.property(thatLocator, "daten", rhsDaten), lhsDaten, rhsDaten)) {
                return false;
            }
        }
        {
            Anhang.Location lhsLocation;
            lhsLocation = this.getLocation();
            Anhang.Location rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation)) {
                return false;
            }
        }
        {
            Anhang.Gruppe lhsGruppe;
            lhsGruppe = this.getGruppe();
            Anhang.Gruppe rhsGruppe;
            rhsGruppe = that.getGruppe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gruppe", lhsGruppe), LocatorUtils.property(thatLocator, "gruppe", rhsGruppe), lhsGruppe, rhsGruppe)) {
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
     * Java enum for <em>gruppe</em> attribute in &lt;anhang&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Gruppe {

        TITELBILD("TITELBILD"),
        INNENANSICHTEN("INNENANSICHTEN"),
        AUSSENANSICHTEN("AUSSENANSICHTEN"),
        GRUNDRISS("GRUNDRISS"),
        KARTEN_LAGEPLAN("KARTEN_LAGEPLAN"),
        ANBIETERLOGO("ANBIETERLOGO"),
        BILD("BILD"),
        DOKUMENTE("DOKUMENTE"),
        LINKS("LINKS"),
        PANORAMA("PANORAMA"),
        QRCODE("QRCODE"),
        FILM("FILM"),
        FILMLINK("FILMLINK"),
        @XmlEnumValue("EPASS-SKALA")
        EPASS_SKALA("EPASS-SKALA"),
        ANBOBJURL("ANBOBJURL");
        private final String value;

        Gruppe(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Anhang.Gruppe fromValue(String v) {
            for (Anhang.Gruppe c: Anhang.Gruppe.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }


    /**
     * Java enum for <em>location</em> attribute in &lt;anhang&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Location {

        INTERN,
        EXTERN,
        REMOTE;

        public String value() {
            return name();
        }

        public static Anhang.Location fromValue(String v) {
            return valueOf(v);
        }

    }

}