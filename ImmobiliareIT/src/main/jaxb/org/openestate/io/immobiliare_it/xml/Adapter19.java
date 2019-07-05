
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.immobiliare_it.xml.types.GenderType;

public class Adapter19
    extends XmlAdapter<String, GenderType>
{


    public GenderType unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseGender(value));
    }

    public String marshal(GenderType value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printGender(value));
    }

}
