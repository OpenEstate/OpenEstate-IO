
package org.openestate.io.trovit.xml;

import java.net.URI;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, URI>
{


    public URI unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseUriValue(value));
    }

    public String marshal(URI value) {
        return (org.openestate.io.trovit.TrovitUtils.printUriValue(value));
    }

}
