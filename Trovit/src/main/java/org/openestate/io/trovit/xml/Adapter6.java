
package org.openestate.io.trovit.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, Calendar>
{


    public Calendar unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseDate(value));
    }

    public String marshal(Calendar value) {
        return (org.openestate.io.trovit.TrovitUtils.printDate(value));
    }

}
