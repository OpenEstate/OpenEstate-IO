
package org.openestate.io.daft_ie.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.parseDouble(value));
    }

    public String marshal(Double value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.printDouble(value));
    }

}
