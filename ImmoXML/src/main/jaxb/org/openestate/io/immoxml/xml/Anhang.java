
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import javax.annotation.Generated;
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
 * Java class for &lt;anhang&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "anhangtitel",
    "format",
    "daten"
})
@XmlRootElement(name = "anhang")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class Anhang implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String anhangtitel;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected String format;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Daten daten;
    @XmlAttribute(name = "location", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Anhang.Location location;
    @XmlAttribute(name = "gruppe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Anhang.Gruppe gruppe;

    /**
     * Gets the value of the anhangtitel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setGruppe(Anhang.Gruppe value) {
        this.gruppe = value;
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
            String theAnhangtitel;
            theAnhangtitel = this.getAnhangtitel();
            strategy.appendField(locator, this, "anhangtitel", buffer, theAnhangtitel, (this.anhangtitel!= null));
        }
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
            Anhang.Location theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation, (this.location!= null));
        }
        {
            Anhang.Gruppe theGruppe;
            theGruppe = this.getGruppe();
            strategy.appendField(locator, this, "gruppe", buffer, theGruppe, (this.gruppe!= null));
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
        if (draftCopy instanceof Anhang) {
            final Anhang copy = ((Anhang) draftCopy);
            {
                Boolean anhangtitelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anhangtitel!= null));
                if (anhangtitelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAnhangtitel;
                    sourceAnhangtitel = this.getAnhangtitel();
                    String copyAnhangtitel = ((String) strategy.copy(LocatorUtils.property(locator, "anhangtitel", sourceAnhangtitel), sourceAnhangtitel, (this.anhangtitel!= null)));
                    copy.setAnhangtitel(copyAnhangtitel);
                } else {
                    if (anhangtitelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anhangtitel = null;
                    }
                }
            }
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
                    Anhang.Location sourceLocation;
                    sourceLocation = this.getLocation();
                    Anhang.Location copyLocation = ((Anhang.Location) strategy.copy(LocatorUtils.property(locator, "location", sourceLocation), sourceLocation, (this.location!= null)));
                    copy.setLocation(copyLocation);
                } else {
                    if (locationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.location = null;
                    }
                }
            }
            {
                Boolean gruppeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gruppe!= null));
                if (gruppeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Anhang.Gruppe sourceGruppe;
                    sourceGruppe = this.getGruppe();
                    Anhang.Gruppe copyGruppe = ((Anhang.Gruppe) strategy.copy(LocatorUtils.property(locator, "gruppe", sourceGruppe), sourceGruppe, (this.gruppe!= null)));
                    copy.setGruppe(copyGruppe);
                } else {
                    if (gruppeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gruppe = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Anhang();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anhangtitel", lhsAnhangtitel), LocatorUtils.property(thatLocator, "anhangtitel", rhsAnhangtitel), lhsAnhangtitel, rhsAnhangtitel, (this.anhangtitel!= null), (that.anhangtitel!= null))) {
                return false;
            }
        }
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
            Anhang.Location lhsLocation;
            lhsLocation = this.getLocation();
            Anhang.Location rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation, (this.location!= null), (that.location!= null))) {
                return false;
            }
        }
        {
            Anhang.Gruppe lhsGruppe;
            lhsGruppe = this.getGruppe();
            Anhang.Gruppe rhsGruppe;
            rhsGruppe = that.getGruppe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gruppe", lhsGruppe), LocatorUtils.property(thatLocator, "gruppe", rhsGruppe), lhsGruppe, rhsGruppe, (this.gruppe!= null), (that.gruppe!= null))) {
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
     *                     Java enum for <em>gruppe</em> attribute in &lt;anhang&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="TITELBILD"/&gt;
     *     &lt;enumeration value="INNENANSICHTEN"/&gt;
     *     &lt;enumeration value="AUSSENANSICHTEN"/&gt;
     *     &lt;enumeration value="GRUNDRISS"/&gt;
     *     &lt;enumeration value="KARTEN_LAGEPLAN"/&gt;
     *     &lt;enumeration value="ANBIETERLOGO"/&gt;
     *     &lt;enumeration value="BILD"/&gt;
     *     &lt;enumeration value="DOKUMENTE"/&gt;
     *     &lt;enumeration value="LINKS"/&gt;
     *     &lt;enumeration value="PANORAMA"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public enum Gruppe {

        TITELBILD,
        INNENANSICHTEN,
        AUSSENANSICHTEN,
        GRUNDRISS,
        KARTEN_LAGEPLAN,
        ANBIETERLOGO,
        BILD,
        DOKUMENTE,
        LINKS,
        PANORAMA;

        public String value() {
            return name();
        }

        public static Anhang.Gruppe fromValue(String v) {
            return valueOf(v);
        }

    }


    /**
     * 
     *                     Java enum for <em>location</em> attribute in &lt;anhang&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="INTERN"/&gt;
     *     &lt;enumeration value="EXTERN"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public enum Location {

        INTERN,
        EXTERN;

        public String value() {
            return name();
        }

        public static Anhang.Location fromValue(String v) {
            return valueOf(v);
        }

    }

}
