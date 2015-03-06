
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter20
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.parseZahl32(value));
    }

    public String marshal(Double value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.printZahl32(value));
    }

}
