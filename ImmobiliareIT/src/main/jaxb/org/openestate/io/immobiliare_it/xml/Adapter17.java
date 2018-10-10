
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.immobiliare_it.xml.types.LandSizeUnit;

public class Adapter17
    extends XmlAdapter<String, LandSizeUnit>
{


    public LandSizeUnit unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseLandSizeUnit(value));
    }

    public String marshal(LandSizeUnit value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printLandSizeUnit(value));
    }

}
