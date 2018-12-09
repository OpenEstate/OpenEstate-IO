
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Empfohlene Nutzungen fuer Grundstuecke/Wohnen
 * 
 * <p>Java class for GrundstueckWohnenEmpfohleneNutzung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrundstueckWohnenEmpfohleneNutzung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.immobilienscout24.de/immobilientransfer}GrundstueckEmpfohleneNutzung"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Bauerwartungsland" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Doppelhaus" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Einfamilienhaus" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Garagen" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Garten" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="keineBebauung" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Mehrfamilienhaus" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Obstpflanzung" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Reihenhaus" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Stellplaetze" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Villa" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Wald" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrundstueckWohnenEmpfohleneNutzung")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
public class GrundstueckWohnenEmpfohleneNutzung
    extends GrundstueckEmpfohleneNutzung
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{


    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new GrundstueckWohnenEmpfohleneNutzung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
