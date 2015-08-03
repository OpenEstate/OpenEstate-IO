
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.trovit.xml.types.Unit;

public class Adapter9
    extends XmlAdapter<String, Unit>
{


    public Unit unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseUnit(value));
    }

    public String marshal(Unit value) {
        return (org.openestate.io.trovit.TrovitUtils.printUnit(value));
    }

}
