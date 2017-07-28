
package org.openestate.io.wis_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, Boolean>
{


    public Boolean unmarshal(String value) {
        return (org.openestate.io.wis_it.WisItUtils.parseYesNo(value));
    }

    public String marshal(Boolean value) {
        return (org.openestate.io.wis_it.WisItUtils.printYesNo(value));
    }

}
