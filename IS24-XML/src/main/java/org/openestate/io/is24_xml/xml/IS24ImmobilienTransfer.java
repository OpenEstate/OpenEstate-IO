
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IS24ImmobilienTransfer
    extends JAXBElement<ImmobilienTransferTyp>
{

    protected final static QName NAME = new QName("http://www.immobilienscout24.de/immobilientransfer", "IS24ImmobilienTransfer");

    public IS24ImmobilienTransfer(ImmobilienTransferTyp value) {
        super(NAME, ((Class) ImmobilienTransferTyp.class), null, value);
    }

    public IS24ImmobilienTransfer() {
        super(NAME, ((Class) ImmobilienTransferTyp.class), null, null);
    }

}
