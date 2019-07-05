
package org.openestate.io.immobar_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.immobar_it.xml.types.ImmotypeValue;

public class Adapter6
    extends XmlAdapter<String, ImmotypeValue>
{


    public ImmotypeValue unmarshal(String value) {
        return (org.openestate.io.immobar_it.ImmobarItUtils.parseImmotypeValue(value));
    }

    public String marshal(ImmotypeValue value) {
        return (org.openestate.io.immobar_it.ImmobarItUtils.printImmotypeValue(value));
    }

}
