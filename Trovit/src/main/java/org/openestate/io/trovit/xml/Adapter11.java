
package org.openestate.io.trovit.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter11
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseFloat(value));
    }

    public String marshal(BigDecimal value) {
        return (org.openestate.io.trovit.TrovitUtils.printFloat(value));
    }

}
