
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter8
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseInt(value));
    }

    public String marshal(Integer value) {
        return (org.openestate.io.trovit.TrovitUtils.printInt(value));
    }

}
