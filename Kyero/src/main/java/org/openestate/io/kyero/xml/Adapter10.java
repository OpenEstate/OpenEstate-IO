
package org.openestate.io.kyero.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter10
    extends XmlAdapter<String, Boolean>
{


    public Boolean unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parseBoolType(value));
    }

    public String marshal(Boolean value) {
        return (org.openestate.io.kyero.KyeroUtils.printBoolType(value));
    }

}
