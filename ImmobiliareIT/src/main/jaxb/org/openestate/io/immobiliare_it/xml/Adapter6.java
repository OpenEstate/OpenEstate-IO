
package org.openestate.io.immobiliare_it.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, BigInteger>
{


    public BigInteger unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parsePositiveInteger(value));
    }

    public String marshal(BigInteger value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printPositiveInteger(value));
    }

}
