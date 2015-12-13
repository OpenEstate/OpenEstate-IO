
package org.openestate.io.openimmo.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, BigInteger>
{


    public BigInteger unmarshal(String value) {
        return (org.openestate.io.openimmo.OpenImmoUtils.parseInteger(value));
    }

    public String marshal(BigInteger value) {
        return (org.openestate.io.openimmo.OpenImmoUtils.printInteger(value));
    }

}
