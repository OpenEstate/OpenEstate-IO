
package org.openestate.io.kyero.xml;

import java.net.URL;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter12
    extends XmlAdapter<String, URL>
{


    public URL unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parseUrlDataType(value));
    }

    public String marshal(URL value) {
        return (org.openestate.io.kyero.KyeroUtils.printUrlDataType(value));
    }

}
