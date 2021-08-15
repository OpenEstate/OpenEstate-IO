
package org.openestate.io.is24_xml.xml;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BildFormateTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BildFormateTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="JPG"/&gt;
 *     &lt;enumeration value="GIF"/&gt;
 *     &lt;enumeration value="PNG"/&gt;
 *     &lt;enumeration value="BMP"/&gt;
 *     &lt;enumeration value="WBMP"/&gt;
 *     &lt;enumeration value="JPEG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BildFormateTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
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
