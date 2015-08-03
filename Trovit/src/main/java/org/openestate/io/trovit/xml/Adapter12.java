
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter12
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseYear(value));
    }

    public String marshal(Integer value) {
        return (org.openestate.io.trovit.TrovitUtils.printYear(value));
    }

}
