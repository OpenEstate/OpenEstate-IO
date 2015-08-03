
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for VermarktungGarageMieteTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VermarktungGarageMieteTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Miete" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VermarktungGarageMieteTyp")
public class VermarktungGarageMieteTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "Miete", required = true)
    @XmlJavaTypeAdapter(Adapter35 .class)
    protected Double miete;

    /**
     * Gets the value of the miete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getMiete() {
        return miete;
    }

    /**
     * Sets the value of the miete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiete(Double value) {
        this.miete = value;
    }

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
        {
            Double theMiete;
            theMiete = this.getMiete();
            strategy.appendField(locator, this, "miete", buffer, theMiete);
        }
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
        if (draftCopy instanceof VermarktungGarageMieteTyp) {
            final VermarktungGarageMieteTyp copy = ((VermarktungGarageMieteTyp) draftCopy);
            if (this.miete!= null) {
                Double sourceMiete;
                sourceMiete = this.getMiete();
                Double copyMiete = ((Double) strategy.copy(LocatorUtils.property(locator, "miete", sourceMiete), sourceMiete));
                copy.setMiete(copyMiete);
            } else {
                copy.miete = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VermarktungGarageMieteTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VermarktungGarageMieteTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VermarktungGarageMieteTyp that = ((VermarktungGarageMieteTyp) object);
        {
            Double lhsMiete;
            lhsMiete = this.getMiete();
            Double rhsMiete;
            rhsMiete = that.getMiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "miete", lhsMiete), LocatorUtils.property(thatLocator, "miete", rhsMiete), lhsMiete, rhsMiete)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
