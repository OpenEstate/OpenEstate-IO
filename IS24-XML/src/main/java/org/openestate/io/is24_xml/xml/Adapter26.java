
package org.openestate.io.is24_xml.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter26
    extends XmlAdapter<String, BigInteger>
{


    public BigInteger unmarshal(String value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.parseZahl20(value));
    }

    public String marshal(BigInteger value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.printZahl20(value));
    }

}
