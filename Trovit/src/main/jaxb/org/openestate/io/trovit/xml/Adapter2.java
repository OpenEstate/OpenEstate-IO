
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.trovit.xml.types.TypeValue;

public class Adapter2
    extends XmlAdapter<String, TypeValue>
{


    public TypeValue unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseTypeValue(value));
    }

    public String marshal(TypeValue value) {
        return (org.openestate.io.trovit.TrovitUtils.printTypeValue(value));
    }

}
