
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter36
    extends XmlAdapter<String, Long>
{


    public Long unmarshal(String value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.parseZahl20(value));
    }

    public String marshal(Long value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.printZahl20(value));
    }

}
