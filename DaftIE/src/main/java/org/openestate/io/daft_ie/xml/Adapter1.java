
package org.openestate.io.daft_ie.xml;

import java.net.URL;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, URL>
{


    public URL unmarshal(String value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.parseURL(value));
    }

    public String marshal(URL value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.printURL(value));
    }

}
