
package org.openestate.io.immobiliare_it.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, BigInteger>
{


    public BigInteger unmarshal(String value) {
        return (javax.xml.bind.DatatypeConverter.parseInteger(value));
    }

    public String marshal(BigInteger value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printInteger(value));
    }

}
