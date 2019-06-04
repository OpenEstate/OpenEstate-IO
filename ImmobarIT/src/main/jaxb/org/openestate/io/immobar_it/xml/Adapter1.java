
package org.openestate.io.immobar_it.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Calendar>
{


    public Calendar unmarshal(String value) {
        return (org.openestate.io.immobar_it.ImmobarItUtils.parseDateValue(value));
    }

    public String marshal(Calendar value) {
        return (org.openestate.io.immobar_it.ImmobarItUtils.printDateValue(value));
    }

}
