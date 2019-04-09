
package org.openestate.io.immobar_it.xml;

import java.net.URI;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, URI>
{


    public URI unmarshal(String value) {
        return (org.openestate.io.immobar_it.ImmobarItUtils.parseUriValue(value));
    }

    public String marshal(URI value) {
        return (org.openestate.io.immobar_it.ImmobarItUtils.printUriValue(value));
    }

}
