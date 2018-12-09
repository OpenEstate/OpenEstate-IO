
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.trovit.xml.types.PricePeriodValue;

public class Adapter5
    extends XmlAdapter<String, PricePeriodValue>
{


    public PricePeriodValue unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parsePricePeriodValue(value));
    }

    public String marshal(PricePeriodValue value) {
        return (org.openestate.io.trovit.TrovitUtils.printPricePeriodValue(value));
    }

}
