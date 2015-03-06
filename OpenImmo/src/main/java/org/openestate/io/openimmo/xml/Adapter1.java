
package org.openestate.io.openimmo.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Calendar>
{


    public Calendar unmarshal(String value) {
        return (org.openestate.io.openimmo.OpenImmoUtils.parseDateTime(value));
    }

    public String marshal(Calendar value) {
        return (org.openestate.io.openimmo.OpenImmoUtils.printDateTime(value));
    }

}
