
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.io.openimmo.OpenImmoUtils.parseDecimal(value));
    }

    public String marshal(Double value) {
        return (org.openestate.io.openimmo.OpenImmoUtils.printDecimal(value));
    }

}
