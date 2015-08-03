
package org.openestate.io.wis_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.io.wis_it.WisItUtils.parseDecimal(value));
    }

    public String marshal(Double value) {
        return (org.openestate.io.wis_it.WisItUtils.printDecimal(value));
    }

}
