
package org.openestate.io.openimmo.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
public class Status implements Cloneable, CopyTo2, Equals2, ToString2
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
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            BigInteger theStatusnr;
            theStatusnr = this.getStatusnr();
            strategy.appendField(locator, this, "statusnr", buffer, theStatusnr, (this.statusnr!= null));
        }
        {
            String theText;
            theText = this.getText();
            strategy.appendField(locator, this, "text", buffer, theText, (this.text!= null));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Status) {
            final Status copy = ((Status) draftCopy);
            {
                Boolean statusnrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.statusnr!= null));
                if (statusnrShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceStatusnr;
                    sourceStatusnr = this.getStatusnr();
                    BigInteger copyStatusnr = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "statusnr", sourceStatusnr), sourceStatusnr, (this.statusnr!= null)));
                    copy.setStatusnr(copyStatusnr);
                } else {
                    if (statusnrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.statusnr = null;
                    }
                }
            }
            {
                Boolean textShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.text!= null));
                if (textShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceText;
                    sourceText = this.getText();
                    String copyText = ((String) strategy.copy(LocatorUtils.property(locator, "text", sourceText), sourceText, (this.text!= null)));
                    copy.setText(copyText);
                } else {
                    if (textShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.text = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Status();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusnr", lhsStatusnr), LocatorUtils.property(thatLocator, "statusnr", rhsStatusnr), lhsStatusnr, rhsStatusnr, (this.statusnr!= null), (that.statusnr!= null))) {
                return false;
            }
        }
        {
            String lhsText;
            lhsText = this.getText();
            String rhsText;
            rhsText = that.getText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText, (this.text!= null), (that.text!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
