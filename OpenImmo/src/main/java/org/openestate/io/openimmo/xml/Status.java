
package org.openestate.io.openimmo.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * Java class for &lt;status&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statusnr",
    "text"
})
@XmlRootElement(name = "status")
public class Status
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected BigInteger statusnr;
    protected String text;

    /**
     * Gets the value of the statusnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigInteger getStatusnr() {
        return statusnr;
    }

    /**
     * Sets the value of the statusnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusnr(BigInteger value) {
        this.statusnr = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
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
            BigInteger theStatusnr;
            theStatusnr = this.getStatusnr();
            strategy.appendField(locator, this, "statusnr", buffer, theStatusnr);
        }
        {
            String theText;
            theText = this.getText();
            strategy.appendField(locator, this, "text", buffer, theText);
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
        if (draftCopy instanceof Status) {
            final Status copy = ((Status) draftCopy);
            if (this.statusnr!= null) {
                BigInteger sourceStatusnr;
                sourceStatusnr = this.getStatusnr();
                BigInteger copyStatusnr = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "statusnr", sourceStatusnr), sourceStatusnr));
                copy.setStatusnr(copyStatusnr);
            } else {
                copy.statusnr = null;
            }
            if (this.text!= null) {
                String sourceText;
                sourceText = this.getText();
                String copyText = ((String) strategy.copy(LocatorUtils.property(locator, "text", sourceText), sourceText));
                copy.setText(copyText);
            } else {
                copy.text = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Status();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Status that = ((Status) object);
        {
            BigInteger lhsStatusnr;
            lhsStatusnr = this.getStatusnr();
            BigInteger rhsStatusnr;
            rhsStatusnr = that.getStatusnr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusnr", lhsStatusnr), LocatorUtils.property(thatLocator, "statusnr", rhsStatusnr), lhsStatusnr, rhsStatusnr)) {
                return false;
            }
        }
        {
            String lhsText;
            lhsText = this.getText();
            String rhsText;
            rhsText = that.getText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText)) {
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
