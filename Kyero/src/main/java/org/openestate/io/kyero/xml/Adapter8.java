
package org.openestate.io.kyero.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter8
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parseTypeDataType(value));
    }

    public String marshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.printTypeDataType(value));
    }

}
