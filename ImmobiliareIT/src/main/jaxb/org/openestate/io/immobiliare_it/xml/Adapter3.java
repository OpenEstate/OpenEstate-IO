
package org.openestate.io.immobiliare_it.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Calendar>
{


    public Calendar unmarshal(String value) {
        return (javax.xml.bind.DatatypeConverter.parseDateTime(value));
    }

    public String marshal(Calendar value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printDateTime(value));
    }

}
