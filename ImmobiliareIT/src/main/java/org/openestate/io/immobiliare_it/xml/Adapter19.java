
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.immobiliare_it.xml.types.SizeUnit;

public class Adapter19
    extends XmlAdapter<String, SizeUnit>
{


    public SizeUnit unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseSizeUnit(value));
    }

    public String marshal(SizeUnit value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printSizeUnit(value));
    }

}
