
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.trovit.xml.types.Action;

public class Adapter2
    extends XmlAdapter<String, Action>
{


    public Action unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseAction(value));
    }

    public String marshal(Action value) {
        return (org.openestate.io.trovit.TrovitUtils.printAction(value));
    }

}
