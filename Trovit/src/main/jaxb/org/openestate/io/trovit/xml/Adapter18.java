
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.trovit.xml.types.OrientationValue;

public class Adapter18
    extends XmlAdapter<String, OrientationValue>
{


    public OrientationValue unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parseOrientationValue(value));
    }

    public String marshal(OrientationValue value) {
        return (org.openestate.io.trovit.TrovitUtils.printOrientationValue(value));
    }

}
