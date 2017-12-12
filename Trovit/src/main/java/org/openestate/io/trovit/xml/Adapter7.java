
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.trovit.xml.types.ForeclosureTypeValue;

public class Adapter7
    extends XmlAdapter<String, ForeclosureTypeValue>
{


    public ForeclosureTypeValue unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseForeclosureTypeValue(value));
    }

    public String marshal(ForeclosureTypeValue value) {
        return (org.openestate.io.trovit.TrovitUtils.printForeclosureTypeValue(value));
    }

}
