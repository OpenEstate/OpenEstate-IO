
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseEmailType(value));
    }

    public String marshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printEmailType(value));
    }

}
