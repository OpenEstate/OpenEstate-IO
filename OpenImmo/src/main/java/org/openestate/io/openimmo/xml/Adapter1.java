
package org.openestate.io.openimmo.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (org.openestate.io.openimmo.OpenImmoUtils.parseDecimal(value));
    }

    public String marshal(BigDecimal value) {
        return (org.openestate.io.openimmo.OpenImmoUtils.printDecimal(value));
    }

}
