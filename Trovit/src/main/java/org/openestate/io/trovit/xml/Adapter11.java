
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.trovit.xml.types.PriceInterval;

public class Adapter11
    extends XmlAdapter<String, PriceInterval>
{


    public PriceInterval unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parsePriceInterval(value));
    }

    public String marshal(PriceInterval value) {
        return (org.openestate.io.trovit.TrovitUtils.printPriceInterval(value));
    }

}
