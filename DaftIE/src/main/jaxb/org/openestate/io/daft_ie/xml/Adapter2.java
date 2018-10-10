
package org.openestate.io.daft_ie.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Calendar>
{


    public Calendar unmarshal(String value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.parseDate(value));
    }

    public String marshal(Calendar value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.printDate(value));
    }

}
