
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter16
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.parseEmail(value));
    }

    public String marshal(String value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.printEmail(value));
    }

}
