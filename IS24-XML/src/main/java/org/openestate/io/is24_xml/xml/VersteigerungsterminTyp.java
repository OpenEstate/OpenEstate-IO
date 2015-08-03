
package org.openestate.io.is24_xml.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * <p>Java class for VersteigerungsterminTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VersteigerungsterminTyp"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *       &lt;attribute name="Wiederholungstermin" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Teilungsversteigerung" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersteigerungsterminTyp", propOrder = {
    "value"
})
public class VersteigerungsterminTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Calendar value;
    @XmlAttribute(name = "Wiederholungstermin")
    protected Boolean wiederholungstermin;
    @XmlAttribute(name = "Teilungsversteigerung")
    protected Boolean teilungsversteigerung;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(Calendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the wiederholungstermin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWiederholungstermin() {
        if (wiederholungstermin == null) {
            return false;
        } else {
            return wiederholungstermin;
        }
    }

    /**
     * Sets the value of the wiederholungstermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWiederholungstermin(Boolean value) {
        this.wiederholungstermin = value;
    }

    /**
     * Gets the value of the teilungsversteigerung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTeilungsversteigerung() {
        if (teilungsversteigerung == null) {
            return false;
        } else {
            return teilungsversteigerung;
        }
    }

    /**
     * Sets the value of the teilungsversteigerung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeilungsversteigerung(Boolean value) {
        this.teilungsversteigerung = value;
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
            Calendar theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            boolean theWiederholungstermin;
            theWiederholungstermin = ((this.wiederholungstermin!= null)?this.isWiederholungstermin():false);
            strategy.appendField(locator, this, "wiederholungstermin", buffer, theWiederholungstermin);
        }
        {
            boolean theTeilungsversteigerung;
            theTeilungsversteigerung = ((this.teilungsversteigerung!= null)?this.isTeilungsversteigerung():false);
            strategy.appendField(locator, this, "teilungsversteigerung", buffer, theTeilungsversteigerung);
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
        if (draftCopy instanceof VersteigerungsterminTyp) {
            final VersteigerungsterminTyp copy = ((VersteigerungsterminTyp) draftCopy);
            if (this.value!= null) {
                Calendar sourceValue;
                sourceValue = this.getValue();
                Calendar copyValue = ((Calendar) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.wiederholungstermin!= null) {
                boolean sourceWiederholungstermin;
                sourceWiederholungstermin = ((this.wiederholungstermin!= null)?this.isWiederholungstermin():false);
                boolean copyWiederholungstermin = strategy.copy(LocatorUtils.property(locator, "wiederholungstermin", sourceWiederholungstermin), sourceWiederholungstermin);
                copy.setWiederholungstermin(copyWiederholungstermin);
            } else {
                copy.wiederholungstermin = null;
            }
            if (this.teilungsversteigerung!= null) {
                boolean sourceTeilungsversteigerung;
                sourceTeilungsversteigerung = ((this.teilungsversteigerung!= null)?this.isTeilungsversteigerung():false);
                boolean copyTeilungsversteigerung = strategy.copy(LocatorUtils.property(locator, "teilungsversteigerung", sourceTeilungsversteigerung), sourceTeilungsversteigerung);
                copy.setTeilungsversteigerung(copyTeilungsversteigerung);
            } else {
                copy.teilungsversteigerung = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new VersteigerungsterminTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VersteigerungsterminTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VersteigerungsterminTyp that = ((VersteigerungsterminTyp) object);
        {
            Calendar lhsValue;
            lhsValue = this.getValue();
            Calendar rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            boolean lhsWiederholungstermin;
            lhsWiederholungstermin = ((this.wiederholungstermin!= null)?this.isWiederholungstermin():false);
            boolean rhsWiederholungstermin;
            rhsWiederholungstermin = ((that.wiederholungstermin!= null)?that.isWiederholungstermin():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wiederholungstermin", lhsWiederholungstermin), LocatorUtils.property(thatLocator, "wiederholungstermin", rhsWiederholungstermin), lhsWiederholungstermin, rhsWiederholungstermin)) {
                return false;
            }
        }
        {
            boolean lhsTeilungsversteigerung;
            lhsTeilungsversteigerung = ((this.teilungsversteigerung!= null)?this.isTeilungsversteigerung():false);
            boolean rhsTeilungsversteigerung;
            rhsTeilungsversteigerung = ((that.teilungsversteigerung!= null)?that.isTeilungsversteigerung():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teilungsversteigerung", lhsTeilungsversteigerung), LocatorUtils.property(thatLocator, "teilungsversteigerung", rhsTeilungsversteigerung), lhsTeilungsversteigerung, rhsTeilungsversteigerung)) {
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
