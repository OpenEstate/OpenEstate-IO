
package org.openestate.io.kyero.xml;

import java.net.URI;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter13
    extends XmlAdapter<String, URI>
{


    public URI unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parseUrlDataType(value));
    }

    public String marshal(URI value) {
        return (org.openestate.io.kyero.KyeroUtils.printUrlDataType(value));
    }

}
