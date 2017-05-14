
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * Java class for &lt;aussen_courtage&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "aussen_courtage")
public class AussenCourtage implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlValue
    protected String content;
    @XmlAttribute(name = "mit_mwst")
    protected Boolean mitMwst;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the mitMwst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMitMwst() {
        return mitMwst;
    }

    /**
     * Sets the value of the mitMwst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMitMwst(Boolean value) {
        this.mitMwst = value;
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
            String theContent;
            theContent = this.getContent();
            strategy.appendField(locator, this, "content", buffer, theContent, (this.content!= null));
        }
        {
            Boolean theMitMwst;
            theMitMwst = this.isMitMwst();
            strategy.appendField(locator, this, "mitMwst", buffer, theMitMwst, (this.mitMwst!= null));
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
        if (draftCopy instanceof AussenCourtage) {
            final AussenCourtage copy = ((AussenCourtage) draftCopy);
            {
                Boolean contentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.content!= null));
                if (contentShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceContent;
                    sourceContent = this.getContent();
                    String copyContent = ((String) strategy.copy(LocatorUtils.property(locator, "content", sourceContent), sourceContent, (this.content!= null)));
                    copy.setContent(copyContent);
                } else {
                    if (contentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.content = null;
                    }
                }
            }
            {
                Boolean mitMwstShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mitMwst!= null));
                if (mitMwstShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceMitMwst;
                    sourceMitMwst = this.isMitMwst();
                    Boolean copyMitMwst = ((Boolean) strategy.copy(LocatorUtils.property(locator, "mitMwst", sourceMitMwst), sourceMitMwst, (this.mitMwst!= null)));
                    copy.setMitMwst(copyMitMwst);
                } else {
                    if (mitMwstShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mitMwst = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AussenCourtage();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AussenCourtage that = ((AussenCourtage) object);
        {
            String lhsContent;
            lhsContent = this.getContent();
            String rhsContent;
            rhsContent = that.getContent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "content", lhsContent), LocatorUtils.property(thatLocator, "content", rhsContent), lhsContent, rhsContent, (this.content!= null), (that.content!= null))) {
                return false;
            }
        }
        {
            Boolean lhsMitMwst;
            lhsMitMwst = this.isMitMwst();
            Boolean rhsMitMwst;
            rhsMitMwst = that.isMitMwst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mitMwst", lhsMitMwst), LocatorUtils.property(thatLocator, "mitMwst", rhsMitMwst), lhsMitMwst, rhsMitMwst, (this.mitMwst!= null), (that.mitMwst!= null))) {
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
