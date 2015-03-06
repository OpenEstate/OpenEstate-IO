
package org.openestate.io.wis_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (org.openestate.io.wis_it.WisItUtils.parseInteger(value));
    }

    public String marshal(Integer value) {
        return (org.openestate.io.wis_it.WisItUtils.printPositiveInteger(value));
    }

}
