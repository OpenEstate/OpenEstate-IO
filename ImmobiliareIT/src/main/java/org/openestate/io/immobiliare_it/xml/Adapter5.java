
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.immobiliare_it.xml.types.Category;

public class Adapter5
    extends XmlAdapter<String, Category>
{


    public Category unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseCategory(value));
    }

    public String marshal(Category value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printCategory(value));
    }

}
