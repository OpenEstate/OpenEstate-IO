
package org.openestate.io.filemaker.xml.result;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Boolean>
{


    public Boolean unmarshal(String value) {
        return (org.openestate.io.filemaker.FilemakerUtils.parseBoolean(value));
    }

    public String marshal(Boolean value) {
        return (org.openestate.io.filemaker.FilemakerUtils.printBoolean(value));
    }

}
