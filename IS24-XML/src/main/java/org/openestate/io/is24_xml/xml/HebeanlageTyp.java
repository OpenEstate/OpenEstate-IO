
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
 * <p>Java class for HebeanlageTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HebeanlageTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Tragkraft" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl72Typ" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HebeanlageTyp")
public class HebeanlageTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "Tragkraft")
    @XmlJavaTypeAdapter(Adapter27 .class)
    protected Double tragkraft;

    /**
     * Gets the value of the tragkraft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getTragkraft() {
        return tragkraft;
    }

    /**
     * Sets the value of the tragkraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTragkraft(Double value) {
        this.tragkraft = value;
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
            Double theTragkraft;
            theTragkraft = this.getTragkraft();
            strategy.appendField(locator, this, "tragkraft", buffer, theTragkraft);
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
        if (draftCopy instanceof HebeanlageTyp) {
            final HebeanlageTyp copy = ((HebeanlageTyp) draftCopy);
            if (this.tragkraft!= null) {
                Double sourceTragkraft;
                sourceTragkraft = this.getTragkraft();
                Double copyTragkraft = ((Double) strategy.copy(LocatorUtils.property(locator, "tragkraft", sourceTragkraft), sourceTragkraft));
                copy.setTragkraft(copyTragkraft);
            } else {
                copy.tragkraft = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new HebeanlageTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof HebeanlageTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HebeanlageTyp that = ((HebeanlageTyp) object);
        {
            Double lhsTragkraft;
            lhsTragkraft = this.getTragkraft();
            Double rhsTragkraft;
            rhsTragkraft = that.getTragkraft();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tragkraft", lhsTragkraft), LocatorUtils.property(thatLocator, "tragkraft", rhsTragkraft), lhsTragkraft, rhsTragkraft)) {
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
