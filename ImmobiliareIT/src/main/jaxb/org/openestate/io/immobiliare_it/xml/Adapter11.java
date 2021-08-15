
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.openestate.io.immobiliare_it.xml.types.Breadcrumb;

public class Adapter11
    extends XmlAdapter<String, Breadcrumb>
{


    public Breadcrumb unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseBreadcrumb(value));
    }

    public String marshal(Breadcrumb value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printBreadcrumb(value));
    }

}
