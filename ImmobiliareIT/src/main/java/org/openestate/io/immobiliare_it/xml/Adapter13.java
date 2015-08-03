
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.immobiliare_it.xml.types.EnergyUnit;

public class Adapter13
    extends XmlAdapter<String, EnergyUnit>
{


    public EnergyUnit unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseEnergyUnit(value));
    }

    public String marshal(EnergyUnit value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printEnergyUnit(value));
    }

}
