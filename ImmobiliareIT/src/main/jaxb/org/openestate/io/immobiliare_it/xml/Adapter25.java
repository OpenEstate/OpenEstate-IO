
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.immobiliare_it.xml.types.MapType;

public class Adapter25
    extends XmlAdapter<String, MapType>
{


    public MapType unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseMap(value));
    }

    public String marshal(MapType value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printMap(value));
    }

}
