
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter14
    extends XmlAdapter<String, Long>
{


    public Long unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseLong(value));
    }

    public String marshal(Long value) {
        return (org.openestate.io.trovit.TrovitUtils.printLong(value));
    }

}
