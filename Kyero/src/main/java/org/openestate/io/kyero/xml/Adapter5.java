
package org.openestate.io.kyero.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parseImageAttributeType(value));
    }

    public String marshal(Integer value) {
        return (org.openestate.io.kyero.KyeroUtils.printImageAttributeType(value));
    }

}
