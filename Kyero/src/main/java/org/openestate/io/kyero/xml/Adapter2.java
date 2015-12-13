
package org.openestate.io.kyero.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, BigInteger>
{


    public BigInteger unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parseInteger(value));
    }

    public String marshal(BigInteger value) {
        return (org.openestate.io.kyero.KyeroUtils.printInteger(value));
    }

}
