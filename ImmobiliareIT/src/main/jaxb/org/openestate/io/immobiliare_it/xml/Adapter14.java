
package org.openestate.io.immobiliare_it.xml;

import java.util.Currency;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter14
    extends XmlAdapter<String, Currency>
{


    public Currency unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseCurrency(value));
    }

    public String marshal(Currency value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printCurrency(value));
    }

}
