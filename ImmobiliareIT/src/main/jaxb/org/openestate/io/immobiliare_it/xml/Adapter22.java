
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.immobiliare_it.xml.types.EnergyScaleType;

public class Adapter22
    extends XmlAdapter<String, EnergyScaleType>
{


    public EnergyScaleType unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseEnergyScale(value));
    }

    public String marshal(EnergyScaleType value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printEnergyScale(value));
    }

}
