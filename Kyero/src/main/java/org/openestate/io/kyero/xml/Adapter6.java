
package org.openestate.io.kyero.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, Long>
{


    public Long unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parsePriceType(value));
    }

    public String marshal(Long value) {
        return (org.openestate.io.kyero.KyeroUtils.printPriceType(value));
    }

}
