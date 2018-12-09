
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseContentValue(value));
    }

    public String marshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.printContentValue(value));
    }

}
