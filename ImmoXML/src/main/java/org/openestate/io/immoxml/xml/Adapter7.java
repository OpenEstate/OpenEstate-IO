
package org.openestate.io.immoxml.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter7
    extends XmlAdapter<String, BigDecimal>
{


    public BigDecimal unmarshal(String value) {
        return (org.openestate.io.immoxml.ImmoXmlUtils.parsePositiveDecimal(value));
    }

    public String marshal(BigDecimal value) {
        return (org.openestate.io.immoxml.ImmoXmlUtils.printPositiveDecimal(value));
    }

}
