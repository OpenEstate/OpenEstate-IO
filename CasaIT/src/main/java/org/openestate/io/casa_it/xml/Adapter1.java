
package org.openestate.io.casa_it.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (org.openestate.io.casa_it.CasaItUtils.parseDouble(value));
    }

    public String marshal(BigDecimal value) {
        return (org.openestate.io.casa_it.CasaItUtils.printDouble(value));
    }

}
