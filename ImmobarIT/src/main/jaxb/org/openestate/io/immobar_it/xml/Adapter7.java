
package org.openestate.io.immobar_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.immobar_it.xml.types.RevenuetypeValue;

public class Adapter7
    extends XmlAdapter<String, RevenuetypeValue>
{


    public RevenuetypeValue unmarshal(String value) {
        return (org.openestate.io.immobar_it.ImmobarItUtils.parseRevenuetypeValue(value));
    }

    public String marshal(RevenuetypeValue value) {
        return (org.openestate.io.immobar_it.ImmobarItUtils.printRevenuetypeValue(value));
    }

}
