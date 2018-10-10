
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.trovit.xml.types.AreaUnitValue;

public class Adapter12
    extends XmlAdapter<String, AreaUnitValue>
{


    public AreaUnitValue unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseAreaUnitValue(value));
    }

    public String marshal(AreaUnitValue value) {
        return (org.openestate.io.trovit.TrovitUtils.printAreaUnitValue(value));
    }

}
