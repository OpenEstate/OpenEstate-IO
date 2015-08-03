
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter9
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseLongitude(value));
    }

    public String marshal(Double value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printLongitude(value));
    }

}
