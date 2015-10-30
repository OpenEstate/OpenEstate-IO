
package org.openestate.io.immoxml.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, BigInteger>
{


    public BigInteger unmarshal(String value) {
        return (org.openestate.io.immoxml.ImmoXmlUtils.parseInteger(value));
    }

    public String marshal(BigInteger value) {
        return (org.openestate.io.immoxml.ImmoXmlUtils.printInteger(value));
    }

}
