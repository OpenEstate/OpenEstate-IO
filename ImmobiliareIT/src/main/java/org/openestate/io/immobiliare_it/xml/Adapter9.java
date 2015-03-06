
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter9
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseRooms(value));
    }

    public String marshal(Integer value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printRooms(value));
    }

}
