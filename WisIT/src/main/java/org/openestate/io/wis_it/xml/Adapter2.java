
package org.openestate.io.wis_it.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Calendar>
{


    public Calendar unmarshal(String value) {
        return (org.openestate.io.wis_it.WisItUtils.parseDateTime(value));
    }

    public String marshal(Calendar value) {
        return (org.openestate.io.wis_it.WisItUtils.printDateTime(value));
    }

}
