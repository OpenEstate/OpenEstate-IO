
package org.openestate.io.is24_xml.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter35
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.parseZahl152(value));
    }

    public String marshal(BigDecimal value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.printZahl152(value));
    }

}
