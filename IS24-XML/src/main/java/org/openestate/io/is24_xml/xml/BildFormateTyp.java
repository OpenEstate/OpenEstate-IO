
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BildFormateTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BildFormateTyp">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JPG"/>
 *     &lt;enumeration value="GIF"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="BMP"/>
 *     &lt;enumeration value="WBMP"/>
 *     &lt;enumeration value="JPEG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BildFormateTyp")
@XmlEnum
public enum BildFormateTyp {

    JPG,
    GIF,
    PNG,
    BMP,
    WBMP,
    JPEG;

    public String value() {
        return name();
    }

    public static BildFormateTyp fromValue(String v) {
        return valueOf(v);
    }

}
