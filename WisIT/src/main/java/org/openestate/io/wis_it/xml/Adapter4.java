
package org.openestate.io.wis_it.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (org.openestate.io.wis_it.WisItUtils.parseDecimal(value));
    }

    public String marshal(BigDecimal value) {
        return (org.openestate.io.wis_it.WisItUtils.printDecimal(value));
    }

}
