
package org.openestate.io.openimmo.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Calendar>
{


    public Calendar unmarshal(String value) {
        return (org.openestate.io.openimmo.OpenImmoUtils.parseDate(value));
    }

    public String marshal(Calendar value) {
        return (org.openestate.io.openimmo.OpenImmoUtils.printDate(value));
    }

}
