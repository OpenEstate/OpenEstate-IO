
package org.openestate.io.daft_ie.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, Boolean>
{


    public Boolean unmarshal(String value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.parseBoolean(value));
    }

    public String marshal(Boolean value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.printBoolean(value));
    }

}
