
package org.openestate.io.kyero.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter11
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parseCountryType(value));
    }

    public String marshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.printCountryType(value));
    }

}
