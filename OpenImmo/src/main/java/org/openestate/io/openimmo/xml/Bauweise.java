
package org.openestate.io.openimmo.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 * Java class for &lt;bauweise&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "bauweise")
public class Bauweise
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "MASSIV")
    protected Boolean massiv;
    @XmlAttribute(name = "FERTIGTEILE")
    protected Boolean fertigteile;
    @XmlAttribute(name = "HOLZ")
    protected Boolean holz;

    /**
     * Gets the value of the massiv property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMASSIV() {
        return massiv;
    }

    /**
     * Sets the value of the massiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMASSIV(Boolean value) {
        this.massiv = value;
    }

    /**
     * Gets the value of the fertigteile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFERTIGTEILE() {
        return fertigteile;
    }

    /**
     * Sets the value of the fertigteile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFERTIGTEILE(Boolean value) {
        this.fertigteile = value;
    }

    /**
     * Gets the value of the holz property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHOLZ() {
        return holz;
    }

    /**
     * Sets the value of the holz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHOLZ(Boolean value) {
        this.holz = value;
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
            Boolean theMASSIV;
            theMASSIV = this.isMASSIV();
            strategy.appendField(locator, this, "massiv", buffer, theMASSIV);
        }
        {
            Boolean theFERTIGTEILE;
            theFERTIGTEILE = this.isFERTIGTEILE();
            strategy.appendField(locator, this, "fertigteile", buffer, theFERTIGTEILE);
        }
        {
            Boolean theHOLZ;
            theHOLZ = this.isHOLZ();
            strategy.appendField(locator, this, "holz", buffer, theHOLZ);
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
        if (draftCopy instanceof Bauweise) {
            final Bauweise copy = ((Bauweise) draftCopy);
            if (this.massiv!= null) {
                Boolean sourceMASSIV;
                sourceMASSIV = this.isMASSIV();
                Boolean copyMASSIV = ((Boolean) strategy.copy(LocatorUtils.property(locator, "massiv", sourceMASSIV), sourceMASSIV));
                copy.setMASSIV(copyMASSIV);
            } else {
                copy.massiv = null;
            }
            if (this.fertigteile!= null) {
                Boolean sourceFERTIGTEILE;
                sourceFERTIGTEILE = this.isFERTIGTEILE();
                Boolean copyFERTIGTEILE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "fertigteile", sourceFERTIGTEILE), sourceFERTIGTEILE));
                copy.setFERTIGTEILE(copyFERTIGTEILE);
            } else {
                copy.fertigteile = null;
            }
            if (this.holz!= null) {
                Boolean sourceHOLZ;
                sourceHOLZ = this.isHOLZ();
                Boolean copyHOLZ = ((Boolean) strategy.copy(LocatorUtils.property(locator, "holz", sourceHOLZ), sourceHOLZ));
                copy.setHOLZ(copyHOLZ);
            } else {
                copy.holz = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Bauweise();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Bauweise that = ((Bauweise) object);
        {
            Boolean lhsMASSIV;
            lhsMASSIV = this.isMASSIV();
            Boolean rhsMASSIV;
            rhsMASSIV = that.isMASSIV();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "massiv", lhsMASSIV), LocatorUtils.property(thatLocator, "massiv", rhsMASSIV), lhsMASSIV, rhsMASSIV)) {
                return false;
            }
        }
        {
            Boolean lhsFERTIGTEILE;
            lhsFERTIGTEILE = this.isFERTIGTEILE();
            Boolean rhsFERTIGTEILE;
            rhsFERTIGTEILE = that.isFERTIGTEILE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fertigteile", lhsFERTIGTEILE), LocatorUtils.property(thatLocator, "fertigteile", rhsFERTIGTEILE), lhsFERTIGTEILE, rhsFERTIGTEILE)) {
                return false;
            }
        }
        {
            Boolean lhsHOLZ;
            lhsHOLZ = this.isHOLZ();
            Boolean rhsHOLZ;
            rhsHOLZ = that.isHOLZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "holz", lhsHOLZ), LocatorUtils.property(thatLocator, "holz", rhsHOLZ), lhsHOLZ, rhsHOLZ)) {
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
