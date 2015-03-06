
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for null.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType>
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="GEHOBEN"/>
 *     &lt;enumeration value="LUXUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum AusstattKategorie {

    STANDARD,
    GEHOBEN,
    LUXUS;

    public String value() {
        return name();
    }

    public static AusstattKategorie fromValue(String v) {
        return valueOf(v);
    }

}
