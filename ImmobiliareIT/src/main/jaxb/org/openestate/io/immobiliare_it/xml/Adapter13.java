
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.immobiliare_it.xml.types.SizeUnitType;

public class Adapter13
    extends XmlAdapter<String, SizeUnitType>
{


    public SizeUnitType unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseSizeUnit(value));
    }

    public String marshal(SizeUnitType value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printSizeUnit(value));
    }

}
