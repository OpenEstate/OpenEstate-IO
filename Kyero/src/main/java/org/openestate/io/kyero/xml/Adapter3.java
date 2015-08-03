
package org.openestate.io.kyero.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Long>
{


    public Long unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parseInteger(value));
    }

    public String marshal(Long value) {
        return (org.openestate.io.kyero.KyeroUtils.printNonNegativeInteger(value));
    }

}
