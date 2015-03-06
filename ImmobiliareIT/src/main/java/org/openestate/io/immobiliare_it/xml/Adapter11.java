
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter11
    extends XmlAdapter<String, Boolean>
{


    public Boolean unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseYesNo(value));
    }

    public String marshal(Boolean value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printYesNo(value));
    }

}
