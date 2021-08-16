
package org.openestate.io.immobiliare_it.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter8
    extends XmlAdapter<String, Calendar>
{


    public Calendar unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseNullDateTime(value));
    }

    public String marshal(Calendar value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printNullDateTime(value));
    }

}
