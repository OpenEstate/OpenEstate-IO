
package org.openestate.io.daft_ie.xml;

import java.net.URI;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, URI>
{


    public URI unmarshal(String value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.parseURI(value));
    }

    public String marshal(URI value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.printURI(value));
    }

}
