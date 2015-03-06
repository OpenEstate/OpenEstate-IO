
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjektZustandTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjektZustandTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="keineAngabe"/>
 *     &lt;enumeration value="Erstbezug"/>
 *     &lt;enumeration value="Neuwertig"/>
 *     &lt;enumeration value="VollstaendigReonviert"/>
 *     &lt;enumeration value="Renovierungsbeduerftig"/>
 *     &lt;enumeration value="Modernisiert"/>
 *     &lt;enumeration value="NachVereinbarung"/>
 *     &lt;enumeration value="Gepflegt"/>
 *     &lt;enumeration value="ErstbezugNachSanierung"/>
 *     &lt;enumeration value="Saniert"/>
 *     &lt;enumeration value="Unrenoviert"/>
 *     &lt;enumeration value="Abbruchreif"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjektZustandTyp")
@XmlEnum
public enum ObjektZustandTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Erstbezug")
    ERSTBEZUG("Erstbezug"),
    @XmlEnumValue("Neuwertig")
    NEUWERTIG("Neuwertig"),
    @XmlEnumValue("VollstaendigReonviert")
    VOLLSTAENDIG_REONVIERT("VollstaendigReonviert"),
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
     */
    @XmlEnumValue("Unrenoviert")
    UNRENOVIERT("Unrenoviert"),
    @XmlEnumValue("Abbruchreif")
    ABBRUCHREIF("Abbruchreif");
    private final String value;

    ObjektZustandTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjektZustandTyp fromValue(String v) {
        for (ObjektZustandTyp c: ObjektZustandTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
