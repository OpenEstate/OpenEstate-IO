
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for videoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="videoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="local"/>
 *     &lt;enumeration value="remote"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "videoType")
@XmlEnum
public enum VideoType {

    @XmlEnumValue("local")
    LOCAL("local"),
    @XmlEnumValue("remote")
    REMOTE("remote");
    private final String value;

    VideoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoType fromValue(String v) {
        for (VideoType c: VideoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
