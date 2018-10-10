
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter16
    extends XmlAdapter<String, Boolean>
{


    public Boolean unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseBooleanValue(value));
    }

    public String marshal(Boolean value) {
        return (org.openestate.io.trovit.TrovitUtils.printBooleanValue(value));
    }

}
