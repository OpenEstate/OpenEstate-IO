
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter13
    extends XmlAdapter<String, Boolean>
{


    public Boolean unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseBool(value));
    }

    public String marshal(Boolean value) {
        return (org.openestate.io.trovit.TrovitUtils.printBool(value));
    }

}
