
package org.openestate.io.kyero.xml;

import java.net.URI;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter14
    extends XmlAdapter<String, URI>
{


    public URI unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parseImageUrlType(value));
    }

    public String marshal(URI value) {
        return (org.openestate.io.kyero.KyeroUtils.printImageUrlType(value));
    }

}
