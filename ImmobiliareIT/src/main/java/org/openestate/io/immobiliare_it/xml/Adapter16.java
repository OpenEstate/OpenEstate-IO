
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter16
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseText3000(value));
    }

    public String marshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printText3000(value));
    }

}
