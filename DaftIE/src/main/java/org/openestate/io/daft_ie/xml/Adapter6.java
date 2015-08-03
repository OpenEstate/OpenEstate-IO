
package org.openestate.io.daft_ie.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.parseInteger(value));
    }

    public String marshal(Integer value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.printInteger(value));
    }

}
