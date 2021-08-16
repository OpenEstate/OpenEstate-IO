
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.immobiliare_it.xml.types.LandSizeUnitType;

public class Adapter23
    extends XmlAdapter<String, LandSizeUnitType>
{


    public LandSizeUnitType unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseLandSizeUnit(value));
    }

    public String marshal(LandSizeUnitType value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printLandSizeUnit(value));
    }

}
