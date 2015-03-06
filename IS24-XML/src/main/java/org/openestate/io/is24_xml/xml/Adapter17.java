
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter17
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.parsePreisAufAnfrage(value));
    }

    public String marshal(Double value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.printPreisAufAnfrage(value));
    }

}
