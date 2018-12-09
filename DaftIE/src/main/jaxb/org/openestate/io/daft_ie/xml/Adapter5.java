
package org.openestate.io.daft_ie.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.parsePositiveDecimal(value));
    }

    public String marshal(BigDecimal value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.printPositiveDecimal(value));
    }

}
