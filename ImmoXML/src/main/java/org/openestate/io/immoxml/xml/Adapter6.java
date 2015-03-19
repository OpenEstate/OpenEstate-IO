
package org.openestate.io.immoxml.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (org.openestate.io.immoxml.ImmoXmlUtils.parseInteger(value));
    }

    public String marshal(Integer value) {
        return (org.openestate.io.immoxml.ImmoXmlUtils.printPositiveInteger(value));
    }

}
