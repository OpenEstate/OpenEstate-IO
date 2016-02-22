
package org.openestate.io.immoxml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
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
 * Java class for &lt;max_mietdauer&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "max_mietdauer")
public class MaxMietdauer implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlValue
    protected String content;
    @XmlAttribute(name = "max_dauer")
    protected MaxMietdauer.MaxDauer maxDauer;

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
     * Gets the value of the maxDauer property.
     *
     * @return
     *     possible object is
     *     {@link MaxMietdauer.MaxDauer }
     *
     */
    public MaxMietdauer.MaxDauer getMaxDauer() {
        return maxDauer;
    }

    /**
     * Sets the value of the maxDauer property.
     *
     * @param value
     *     allowed object is
     *     {@link MaxMietdauer.MaxDauer }
     *
     */
    public void setMaxDauer(MaxMietdauer.MaxDauer value) {
        this.maxDauer = value;
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
            MaxMietdauer.MaxDauer theMaxDauer;
            theMaxDauer = this.getMaxDauer();
            strategy.appendField(locator, this, "maxDauer", buffer, theMaxDauer, (this.maxDauer!= null));
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
        if (draftCopy instanceof MaxMietdauer) {
            final MaxMietdauer copy = ((MaxMietdauer) draftCopy);
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
                Boolean maxDauerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxDauer!= null));
                if (maxDauerShouldBeCopiedAndSet == Boolean.TRUE) {
                    MaxMietdauer.MaxDauer sourceMaxDauer;
                    sourceMaxDauer = this.getMaxDauer();
                    MaxMietdauer.MaxDauer copyMaxDauer = ((MaxMietdauer.MaxDauer) strategy.copy(LocatorUtils.property(locator, "maxDauer", sourceMaxDauer), sourceMaxDauer, (this.maxDauer!= null)));
                    copy.setMaxDauer(copyMaxDauer);
                } else {
                    if (maxDauerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxDauer = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MaxMietdauer();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MaxMietdauer that = ((MaxMietdauer) object);
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
            MaxMietdauer.MaxDauer lhsMaxDauer;
            lhsMaxDauer = this.getMaxDauer();
            MaxMietdauer.MaxDauer rhsMaxDauer;
            rhsMaxDauer = that.getMaxDauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxDauer", lhsMaxDauer), LocatorUtils.property(thatLocator, "maxDauer", rhsMaxDauer), lhsMaxDauer, rhsMaxDauer, (this.maxDauer!= null), (that.maxDauer!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * Java enum for <em>max_dauer</em> attribute in &lt;max_mietdauer&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum MaxDauer {

        TAG,
        WOCHE,
        MONAT,
        JAHR;

        public String value() {
            return name();
        }

        public static MaxMietdauer.MaxDauer fromValue(String v) {
            return valueOf(v);
        }

    }

}