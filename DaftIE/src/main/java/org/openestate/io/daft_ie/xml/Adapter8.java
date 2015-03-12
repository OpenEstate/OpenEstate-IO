
package org.openestate.io.daft_ie.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter8
    extends XmlAdapter<java.lang.String, String>
{


    public String unmarshal(java.lang.String value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.parseCountry(value));
    }

    public java.lang.String marshal(String value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.printCountry(value));
    }

}
