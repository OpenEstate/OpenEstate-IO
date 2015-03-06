
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for ZwangsversteigerungTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZwangsversteigerungTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.immobilienscout24.de/immobilientransfer}ImmobilieBaseTyp">
 *       &lt;sequence>
 *         &lt;element name="Adresse" type="{http://www.immobilienscout24.de/immobilientransfer}ImmobilienAdresseTyp"/>
 *         &lt;element name="Objektbeschreibung" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/>
 *         &lt;element name="MultimediaAnhang" type="{http://www.immobilienscout24.de/immobilientransfer}MultimediaAnhangTyp" maxOccurs="15" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AnbieterObjektID" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" />
 *       &lt;attribute name="StatusIS24" type="{http://www.immobilienscout24.de/immobilientransfer}StatusTyp" default="aktiv" />
 *       &lt;attribute name="StatusHP" type="{http://www.immobilienscout24.de/immobilientransfer}StatusTyp" fixed="aktiv" />
 *       &lt;attribute name="Importmodus" type="{http://www.immobilienscout24.de/immobilientransfer}AktionsTyp" default="importieren" />
 *       &lt;attribute name="ScoutObjektID" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl20Typ" />
 *       &lt;attribute name="Ueberschrift" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Text100Typ" />
 *       &lt;attribute name="Waehrung" type="{http://www.immobilienscout24.de/immobilientransfer}WaehrungTyp" fixed="EUR" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZwangsversteigerungTyp")
@XmlSeeAlso({
    org.openestate.io.is24_xml.xml.Zwangsversteigerung.Type.class
})
public class ZwangsversteigerungTyp
    extends ImmobilieBaseTyp
    implements Cloneable, CopyTo, Equals, ToString
{


    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ZwangsversteigerungTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZwangsversteigerungTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
