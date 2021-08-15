
package org.openestate.io.immobiliare_it.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter18
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseRatio(value));
    }

    public String marshal(BigDecimal value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printRatio(value));
    }

}
