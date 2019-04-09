
package org.openestate.io.is24_xml.xml;

import java.net.URI;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter17
    extends XmlAdapter<String, URI>
{


    public URI unmarshal(String value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.parseWebUrl(value));
    }

    public String marshal(URI value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.printWebUrl(value));
    }

}
