
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Long>
{


    public Long unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseInteger(value));
    }

    public String marshal(Long value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printInteger(value));
    }

}
