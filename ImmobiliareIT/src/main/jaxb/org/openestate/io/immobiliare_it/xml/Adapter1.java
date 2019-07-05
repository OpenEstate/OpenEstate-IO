
package org.openestate.io.immobiliare_it.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (javax.xml.bind.DatatypeConverter.parseDecimal(value));
    }

    public String marshal(BigDecimal value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printDecimal(value));
    }

}
