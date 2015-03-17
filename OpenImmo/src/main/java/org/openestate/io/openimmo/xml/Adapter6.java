
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (org.openestate.io.openimmo.OpenImmoUtils.parseInteger(value));
    }

    public String marshal(Integer value) {
        return (org.openestate.io.openimmo.OpenImmoUtils.printPositiveInteger(value));
    }

}
