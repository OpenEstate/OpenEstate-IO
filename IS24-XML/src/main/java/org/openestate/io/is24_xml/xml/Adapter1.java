
package org.openestate.io.is24_xml.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Calendar>
{


    public Calendar unmarshal(String value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.parseDate(value));
    }

    public String marshal(Calendar value) {
        return (org.openestate.io.is24_xml.Is24XmlUtils.printDate(value));
    }

}
