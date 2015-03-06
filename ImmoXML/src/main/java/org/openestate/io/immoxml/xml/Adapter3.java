
package org.openestate.io.immoxml.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.io.immoxml.ImmoXmlUtils.parseDecimal(value));
    }

    public String marshal(Double value) {
        return (org.openestate.io.immoxml.ImmoXmlUtils.printDecimal(value));
    }

}
