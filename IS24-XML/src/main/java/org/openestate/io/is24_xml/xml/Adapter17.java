
package org.openestate.io.is24_xml.xml;

import java.net.URL;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter17
    extends XmlAdapter<String, URL>
{


    public URL unmarshal(String value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.parseWebUrl(value));
    }

    public String marshal(URL value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.printWebUrl(value));
    }

}
