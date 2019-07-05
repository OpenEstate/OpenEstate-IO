
package org.openestate.io.immobiliare_it.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter9
    extends XmlAdapter<String, BigInteger>
{


    public BigInteger unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseNullInteger(value));
    }

    public String marshal(BigInteger value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printNullInteger(value));
    }

}
