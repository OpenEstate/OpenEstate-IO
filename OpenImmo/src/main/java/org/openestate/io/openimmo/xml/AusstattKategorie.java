
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * Java enum for &lt;ausstatt_kategorie&gt; elements.

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