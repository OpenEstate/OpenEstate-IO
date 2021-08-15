
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WazObjektZustandTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WazObjektZustandTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unbekannt"/&gt;
 *     &lt;enumeration value="Erstbezug"/&gt;
 *     &lt;enumeration value="Neuwertig"/&gt;
 *     &lt;enumeration value="VollstaendigRenoviert"/&gt;
 *     &lt;enumeration value="Renovierungsbeduerftig"/&gt;
 *     &lt;enumeration value="Modernisiert"/&gt;
 *     &lt;enumeration value="NachVereinbarung"/&gt;
 *     &lt;enumeration value="Gepflegt"/&gt;
 *     &lt;enumeration value="ErstbezugNachSanierung"/&gt;
 *     &lt;enumeration value="Saniert"/&gt;
 *     &lt;enumeration value="Unrenoviert"/&gt;
 *     &lt;enumeration value="Abbruchreif"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WazObjektZustandTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
public enum WazObjektZustandTyp {

    @XmlEnumValue("Unbekannt")
    UNBEKANNT("Unbekannt"),
    @XmlEnumValue("Erstbezug")
    ERSTBEZUG("Erstbezug"),
    @XmlEnumValue("Neuwertig")
    NEUWERTIG("Neuwertig"),
    @XmlEnumValue("VollstaendigRenoviert")
    VOLLSTAENDIG_RENOVIERT("VollstaendigRenoviert"),
    @XmlEnumValue("Renovierungsbeduerftig")
    RENOVIERUNGSBEDUERFTIG("Renovierungsbeduerftig"),
    @XmlEnumValue("Modernisiert")
    MODERNISIERT("Modernisiert"),
    @XmlEnumValue("NachVereinbarung")
    NACH_VEREINBARUNG("NachVereinbarung"),
    @XmlEnumValue("Gepflegt")
    GEPFLEGT("Gepflegt"),
    @XmlEnumValue("ErstbezugNachSanierung")
    ERSTBEZUG_NACH_SANIERUNG("ErstbezugNachSanierung"),
    @XmlEnumValue("Saniert")
    SANIERT("Saniert"),

    /**
     * Nicht weiter unterstuetzt: Zu ersetzen durch Renovierungsbeduerftig
     *                     
     * 
     */
    @XmlEnumValue("Unrenoviert")
    UNRENOVIERT("Unrenoviert"),
    @XmlEnumValue("Abbruchreif")
    ABBRUCHREIF("Abbruchreif");
    private final String value;

    WazObjektZustandTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WazObjektZustandTyp fromValue(String v) {
        for (WazObjektZustandTyp c: WazObjektZustandTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
