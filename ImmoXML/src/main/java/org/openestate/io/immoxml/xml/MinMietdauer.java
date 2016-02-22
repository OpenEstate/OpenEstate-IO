
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
 * Java class for &lt;min_mietdauer&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "min_mietdauer")
public class MinMietdauer implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlValue
    protected String content;
    @XmlAttribute(name = "min_dauer")
    protected MinMietdauer.MinDauer minDauer;

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
     * Gets the value of the minDauer property.
     *
     * @return
     *     possible object is
     *     {@link MinMietdauer.MinDauer }
     *
     */
    public MinMietdauer.MinDauer getMinDauer() {
        return minDauer;
    }

    /**
     * Sets the value of the minDauer property.
     *
     * @param value
     *     allowed object is
     *     {@link MinMietdauer.MinDauer }
     *
     */
    public void setMinDauer(MinMietdauer.MinDauer value) {
        this.minDauer = value;
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
            MinMietdauer.MinDauer theMinDauer;
            theMinDauer = this.getMinDauer();
            strategy.appendField(locator, this, "minDauer", buffer, theMinDauer, (this.minDauer!= null));
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
        if (draftCopy instanceof MinMietdauer) {
            final MinMietdauer copy = ((MinMietdauer) draftCopy);
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
                Boolean minDauerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minDauer!= null));
                if (minDauerShouldBeCopiedAndSet == Boolean.TRUE) {
                    MinMietdauer.MinDauer sourceMinDauer;
                    sourceMinDauer = this.getMinDauer();
                    MinMietdauer.MinDauer copyMinDauer = ((MinMietdauer.MinDauer) strategy.copy(LocatorUtils.property(locator, "minDauer", sourceMinDauer), sourceMinDauer, (this.minDauer!= null)));
                    copy.setMinDauer(copyMinDauer);
                } else {
                    if (minDauerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minDauer = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MinMietdauer();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MinMietdauer that = ((MinMietdauer) object);
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
            MinMietdauer.MinDauer lhsMinDauer;
            lhsMinDauer = this.getMinDauer();
            MinMietdauer.MinDauer rhsMinDauer;
            rhsMinDauer = that.getMinDauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minDauer", lhsMinDauer), LocatorUtils.property(thatLocator, "minDauer", rhsMinDauer), lhsMinDauer, rhsMinDauer, (this.minDauer!= null), (that.minDauer!= null))) {
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
     * Java enum for <em>min_dauer</em> attribute in &lt;min_mietdauer&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum MinDauer {

        TAG,
        WOCHE,
        MONAT,
        JAHR;

        public String value() {
            return name();
        }

        public static MinMietdauer.MinDauer fromValue(String v) {
            return valueOf(v);
        }

    }

}