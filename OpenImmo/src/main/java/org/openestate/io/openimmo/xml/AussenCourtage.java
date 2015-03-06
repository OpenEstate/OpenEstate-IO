
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="mit_mwst" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "aussen_courtage")
public class AussenCourtage
    implements Cloneable, CopyTo, Equals, ToString
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
            String theContent;
            theContent = this.getContent();
            strategy.appendField(locator, this, "content", buffer, theContent);
        }
        {
            Boolean theMitMwst;
            theMitMwst = this.isMitMwst();
            strategy.appendField(locator, this, "mitMwst", buffer, theMitMwst);
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
        if (draftCopy instanceof AussenCourtage) {
            final AussenCourtage copy = ((AussenCourtage) draftCopy);
            if (this.content!= null) {
                String sourceContent;
                sourceContent = this.getContent();
                String copyContent = ((String) strategy.copy(LocatorUtils.property(locator, "content", sourceContent), sourceContent));
                copy.setContent(copyContent);
            } else {
                copy.content = null;
            }
            if (this.mitMwst!= null) {
                Boolean sourceMitMwst;
                sourceMitMwst = this.isMitMwst();
                Boolean copyMitMwst = ((Boolean) strategy.copy(LocatorUtils.property(locator, "mitMwst", sourceMitMwst), sourceMitMwst));
                copy.setMitMwst(copyMitMwst);
            } else {
                copy.mitMwst = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new AussenCourtage();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AussenCourtage)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "content", lhsContent), LocatorUtils.property(thatLocator, "content", rhsContent), lhsContent, rhsContent)) {
                return false;
            }
        }
        {
            Boolean lhsMitMwst;
            lhsMitMwst = this.isMitMwst();
            Boolean rhsMitMwst;
            rhsMitMwst = that.isMitMwst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mitMwst", lhsMitMwst), LocatorUtils.property(thatLocator, "mitMwst", rhsMitMwst), lhsMitMwst, rhsMitMwst)) {
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
