
package org.openestate.io.trovit.xml;

import java.util.Currency;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, Currency>
{


    public Currency unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parsePriceCurrencyValue(value));
    }

    public String marshal(Currency value) {
        return (org.openestate.io.trovit.TrovitUtils.printPriceCurrencyValue(value));
    }

}
