
package org.openestate.io.is24_xml.xml;

import java.math.BigDecimal;
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
 * &lt;complexType name="HebeanlageTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Tragkraft" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl72Typ" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    @XmlJavaTypeAdapter(Adapter33 .class)
    protected BigDecimal tragkraft;

    /**
     * Gets the value of the tragkraft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getTragkraft() {
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
    public void setTragkraft(BigDecimal value) {
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
            BigDecimal theTragkraft;
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
                BigDecimal sourceTragkraft;
                sourceTragkraft = this.getTragkraft();
                BigDecimal copyTragkraft = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "tragkraft", sourceTragkraft), sourceTragkraft));
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
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HebeanlageTyp that = ((HebeanlageTyp) object);
        {
            BigDecimal lhsTragkraft;
            lhsTragkraft = this.getTragkraft();
            BigDecimal rhsTragkraft;
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
