
package org.openestate.io.daft_ie.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, BigInteger>
{


    public BigInteger unmarshal(String value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.parsePositiveInteger(value));
    }

    public String marshal(BigInteger value) {
        return (org.openestate.io.daft_ie.DaftIeUtils.printPositiveInteger(value));
    }

}
