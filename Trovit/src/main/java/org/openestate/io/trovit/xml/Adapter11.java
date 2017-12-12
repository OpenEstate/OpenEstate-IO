
package org.openestate.io.trovit.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter11
    extends XmlAdapter<String, BigInteger>
{


    public BigInteger unmarshal(String value) {
        return (org.openestate.io.trovit.TrovitUtils.parsePlotAreaValue(value));
    }

    public String marshal(BigInteger value) {
        return (org.openestate.io.trovit.TrovitUtils.printPlotAreaValue(value));
    }

}
