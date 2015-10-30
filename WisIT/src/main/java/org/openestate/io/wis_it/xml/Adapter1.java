
package org.openestate.io.wis_it.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, BigInteger>
{


    public BigInteger unmarshal(String value) {
        return (org.openestate.io.wis_it.WisItUtils.parseNonNegativeInteger(value));
    }

    public String marshal(BigInteger value) {
        return (org.openestate.io.wis_it.WisItUtils.printNonNegativeInteger(value));
    }

}
