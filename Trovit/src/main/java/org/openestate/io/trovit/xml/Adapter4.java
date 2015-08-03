
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parsePriceValue(value));
    }

    public String marshal(Double value) {
        return (org.openestate.io.trovit.TrovitUtils.printPriceValue(value));
    }

}
