
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseString255(value));
    }

    public String marshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.printString255(value));
    }

}
