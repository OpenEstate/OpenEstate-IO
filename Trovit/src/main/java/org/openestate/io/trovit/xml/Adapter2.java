
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.trovit.xml.types.IntBool;

public class Adapter2
    extends XmlAdapter<String, IntBool>
{


    public IntBool unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseIntBool(value));
    }

    public String marshal(IntBool value) {
        return (org.openestate.io.trovit.TrovitUtils.printIntBool(value));
    }

}
