
package org.openestate.io.wis_it.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, BigInteger>
{


    public BigInteger unmarshal(String value) {
        return (org.openestate.io.wis_it.WisItUtils.parsePositiveInteger(value));
    }

    public String marshal(BigInteger value) {
        return (org.openestate.io.wis_it.WisItUtils.printPositiveInteger(value));
    }

}
