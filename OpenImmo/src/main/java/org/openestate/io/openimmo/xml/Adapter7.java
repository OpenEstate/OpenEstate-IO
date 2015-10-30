
package org.openestate.io.openimmo.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter7
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (org.openestate.io.openimmo.OpenImmoUtils.parsePositiveDecimal(value));
    }

    public String marshal(BigDecimal value) {
        return (org.openestate.io.openimmo.OpenImmoUtils.printPositiveDecimal(value));
    }

}
