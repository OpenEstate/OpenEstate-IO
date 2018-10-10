
package org.openestate.io.filemaker.xml.result;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for ProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VERSION" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BUILD" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType")
public class ProductType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "NAME", required = true)
    protected String name;
    @XmlAttribute(name = "VERSION", required = true)
    protected String version;
    @XmlAttribute(name = "BUILD", required = true)
    protected String build;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERSION() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERSION(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUILD() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUILD(String value) {
        this.build = value;
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
            String theNAME;
            theNAME = this.getNAME();
            strategy.appendField(locator, this, "name", buffer, theNAME, (this.name!= null));
        }
        {
            String theVERSION;
            theVERSION = this.getVERSION();
            strategy.appendField(locator, this, "version", buffer, theVERSION, (this.version!= null));
        }
        {
            String theBUILD;
            theBUILD = this.getBUILD();
            strategy.appendField(locator, this, "build", buffer, theBUILD, (this.build!= null));
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
        if (draftCopy instanceof ProductType) {
            final ProductType copy = ((ProductType) draftCopy);
            {
                Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNAME;
                    sourceNAME = this.getNAME();
                    String copyNAME = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceNAME), sourceNAME, (this.name!= null)));
                    copy.setNAME(copyNAME);
                } else {
                    if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.name = null;
                    }
                }
            }
            {
                Boolean versionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.version!= null));
                if (versionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVERSION;
                    sourceVERSION = this.getVERSION();
                    String copyVERSION = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVERSION), sourceVERSION, (this.version!= null)));
                    copy.setVERSION(copyVERSION);
                } else {
                    if (versionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.version = null;
                    }
                }
            }
            {
                Boolean buildShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.build!= null));
                if (buildShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBUILD;
                    sourceBUILD = this.getBUILD();
                    String copyBUILD = ((String) strategy.copy(LocatorUtils.property(locator, "build", sourceBUILD), sourceBUILD, (this.build!= null)));
                    copy.setBUILD(copyBUILD);
                } else {
                    if (buildShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.build = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ProductType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProductType that = ((ProductType) object);
        {
            String lhsNAME;
            lhsNAME = this.getNAME();
            String rhsNAME;
            rhsNAME = that.getNAME();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsNAME), LocatorUtils.property(thatLocator, "name", rhsNAME), lhsNAME, rhsNAME, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsVERSION;
            lhsVERSION = this.getVERSION();
            String rhsVERSION;
            rhsVERSION = that.getVERSION();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVERSION), LocatorUtils.property(thatLocator, "version", rhsVERSION), lhsVERSION, rhsVERSION, (this.version!= null), (that.version!= null))) {
                return false;
            }
        }
        {
            String lhsBUILD;
            lhsBUILD = this.getBUILD();
            String rhsBUILD;
            rhsBUILD = that.getBUILD();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "build", lhsBUILD), LocatorUtils.property(thatLocator, "build", rhsBUILD), lhsBUILD, rhsBUILD, (this.build!= null), (that.build!= null))) {
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
