
package org.openestate.io.immoxml.xml;

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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="LINKS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RECHTS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="VORNE" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="HINTEN" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "lage_im_bau")
public class LageImBau
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "LINKS")
    protected Boolean links;
    @XmlAttribute(name = "RECHTS")
    protected Boolean rechts;
    @XmlAttribute(name = "VORNE")
    protected Boolean vorne;
    @XmlAttribute(name = "HINTEN")
    protected Boolean hinten;

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLINKS() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLINKS(Boolean value) {
        this.links = value;
    }

    /**
     * Gets the value of the rechts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRECHTS() {
        return rechts;
    }

    /**
     * Sets the value of the rechts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRECHTS(Boolean value) {
        this.rechts = value;
    }

    /**
     * Gets the value of the vorne property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVORNE() {
        return vorne;
    }

    /**
     * Sets the value of the vorne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVORNE(Boolean value) {
        this.vorne = value;
    }

    /**
     * Gets the value of the hinten property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHINTEN() {
        return hinten;
    }

    /**
     * Sets the value of the hinten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHINTEN(Boolean value) {
        this.hinten = value;
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
            Boolean theLINKS;
            theLINKS = this.isLINKS();
            strategy.appendField(locator, this, "links", buffer, theLINKS);
        }
        {
            Boolean theRECHTS;
            theRECHTS = this.isRECHTS();
            strategy.appendField(locator, this, "rechts", buffer, theRECHTS);
        }
        {
            Boolean theVORNE;
            theVORNE = this.isVORNE();
            strategy.appendField(locator, this, "vorne", buffer, theVORNE);
        }
        {
            Boolean theHINTEN;
            theHINTEN = this.isHINTEN();
            strategy.appendField(locator, this, "hinten", buffer, theHINTEN);
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
        if (draftCopy instanceof LageImBau) {
            final LageImBau copy = ((LageImBau) draftCopy);
            if (this.links!= null) {
                Boolean sourceLINKS;
                sourceLINKS = this.isLINKS();
                Boolean copyLINKS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "links", sourceLINKS), sourceLINKS));
                copy.setLINKS(copyLINKS);
            } else {
                copy.links = null;
            }
            if (this.rechts!= null) {
                Boolean sourceRECHTS;
                sourceRECHTS = this.isRECHTS();
                Boolean copyRECHTS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "rechts", sourceRECHTS), sourceRECHTS));
                copy.setRECHTS(copyRECHTS);
            } else {
                copy.rechts = null;
            }
            if (this.vorne!= null) {
                Boolean sourceVORNE;
                sourceVORNE = this.isVORNE();
                Boolean copyVORNE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "vorne", sourceVORNE), sourceVORNE));
                copy.setVORNE(copyVORNE);
            } else {
                copy.vorne = null;
            }
            if (this.hinten!= null) {
                Boolean sourceHINTEN;
                sourceHINTEN = this.isHINTEN();
                Boolean copyHINTEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hinten", sourceHINTEN), sourceHINTEN));
                copy.setHINTEN(copyHINTEN);
            } else {
                copy.hinten = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LageImBau();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LageImBau)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LageImBau that = ((LageImBau) object);
        {
            Boolean lhsLINKS;
            lhsLINKS = this.isLINKS();
            Boolean rhsLINKS;
            rhsLINKS = that.isLINKS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "links", lhsLINKS), LocatorUtils.property(thatLocator, "links", rhsLINKS), lhsLINKS, rhsLINKS)) {
                return false;
            }
        }
        {
            Boolean lhsRECHTS;
            lhsRECHTS = this.isRECHTS();
            Boolean rhsRECHTS;
            rhsRECHTS = that.isRECHTS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rechts", lhsRECHTS), LocatorUtils.property(thatLocator, "rechts", rhsRECHTS), lhsRECHTS, rhsRECHTS)) {
                return false;
            }
        }
        {
            Boolean lhsVORNE;
            lhsVORNE = this.isVORNE();
            Boolean rhsVORNE;
            rhsVORNE = that.isVORNE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorne", lhsVORNE), LocatorUtils.property(thatLocator, "vorne", rhsVORNE), lhsVORNE, rhsVORNE)) {
                return false;
            }
        }
        {
            Boolean lhsHINTEN;
            lhsHINTEN = this.isHINTEN();
            Boolean rhsHINTEN;
            rhsHINTEN = that.isHINTEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hinten", lhsHINTEN), LocatorUtils.property(thatLocator, "hinten", rhsHINTEN), lhsHINTEN, rhsHINTEN)) {
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
