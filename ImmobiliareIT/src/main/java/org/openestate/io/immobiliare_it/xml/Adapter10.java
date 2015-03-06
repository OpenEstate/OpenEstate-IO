
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter10
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseLatitude(value));
    }

    public String marshal(Double value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printLatitude(value));
    }

}
