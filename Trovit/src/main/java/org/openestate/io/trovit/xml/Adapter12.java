
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter12
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseString100(value));
    }

    public String marshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.printString100(value));
    }

}
