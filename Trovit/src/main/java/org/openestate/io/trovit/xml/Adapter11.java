
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter11
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseFloat(value));
    }

    public String marshal(Double value) {
        return (org.openestate.io.trovit.TrovitUtils.printFloat(value));
    }

}
