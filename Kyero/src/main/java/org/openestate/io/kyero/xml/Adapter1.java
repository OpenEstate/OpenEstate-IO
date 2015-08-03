
package org.openestate.io.kyero.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parseDecimal(value));
    }

    public String marshal(Double value) {
        return (org.openestate.io.kyero.KyeroUtils.printDecimal(value));
    }

}
