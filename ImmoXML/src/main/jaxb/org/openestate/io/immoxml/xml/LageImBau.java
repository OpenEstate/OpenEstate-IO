
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
 * Java class for &lt;lage_im_bau&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "lage_im_bau")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
public class LageImBau implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "LINKS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean links;
    @XmlAttribute(name = "RECHTS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean rechts;
    @XmlAttribute(name = "VORNE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean vorne;
    @XmlAttribute(name = "HINTEN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean hinten;

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getLINKS() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getRECHTS() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getVORNE() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getHINTEN() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setHINTEN(Boolean value) {
        this.hinten = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Boolean theLINKS;
            theLINKS = this.getLINKS();
            strategy.appendField(locator, this, "links", buffer, theLINKS, (this.links!= null));
        }
        {
            Boolean theRECHTS;
            theRECHTS = this.getRECHTS();
            strategy.appendField(locator, this, "rechts", buffer, theRECHTS, (this.rechts!= null));
        }
        {
            Boolean theVORNE;
            theVORNE = this.getVORNE();
            strategy.appendField(locator, this, "vorne", buffer, theVORNE, (this.vorne!= null));
        }
        {
            Boolean theHINTEN;
            theHINTEN = this.getHINTEN();
            strategy.appendField(locator, this, "hinten", buffer, theHINTEN, (this.hinten!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof LageImBau) {
            final LageImBau copy = ((LageImBau) draftCopy);
            {
                Boolean linksShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.links!= null));
                if (linksShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceLINKS;
                    sourceLINKS = this.getLINKS();
                    Boolean copyLINKS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "links", sourceLINKS), sourceLINKS, (this.links!= null)));
                    copy.setLINKS(copyLINKS);
                } else {
                    if (linksShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.links = null;
                    }
                }
            }
            {
                Boolean rechtsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rechts!= null));
                if (rechtsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRECHTS;
                    sourceRECHTS = this.getRECHTS();
                    Boolean copyRECHTS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "rechts", sourceRECHTS), sourceRECHTS, (this.rechts!= null)));
                    copy.setRECHTS(copyRECHTS);
                } else {
                    if (rechtsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rechts = null;
                    }
                }
            }
            {
                Boolean vorneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vorne!= null));
                if (vorneShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceVORNE;
                    sourceVORNE = this.getVORNE();
                    Boolean copyVORNE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "vorne", sourceVORNE), sourceVORNE, (this.vorne!= null)));
                    copy.setVORNE(copyVORNE);
                } else {
                    if (vorneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vorne = null;
                    }
                }
            }
            {
                Boolean hintenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hinten!= null));
                if (hintenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceHINTEN;
                    sourceHINTEN = this.getHINTEN();
                    Boolean copyHINTEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hinten", sourceHINTEN), sourceHINTEN, (this.hinten!= null)));
                    copy.setHINTEN(copyHINTEN);
                } else {
                    if (hintenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hinten = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new LageImBau();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LageImBau that = ((LageImBau) object);
        {
            Boolean lhsLINKS;
            lhsLINKS = this.getLINKS();
            Boolean rhsLINKS;
            rhsLINKS = that.getLINKS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "links", lhsLINKS), LocatorUtils.property(thatLocator, "links", rhsLINKS), lhsLINKS, rhsLINKS, (this.links!= null), (that.links!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRECHTS;
            lhsRECHTS = this.getRECHTS();
            Boolean rhsRECHTS;
            rhsRECHTS = that.getRECHTS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rechts", lhsRECHTS), LocatorUtils.property(thatLocator, "rechts", rhsRECHTS), lhsRECHTS, rhsRECHTS, (this.rechts!= null), (that.rechts!= null))) {
                return false;
            }
        }
        {
            Boolean lhsVORNE;
            lhsVORNE = this.getVORNE();
            Boolean rhsVORNE;
            rhsVORNE = that.getVORNE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorne", lhsVORNE), LocatorUtils.property(thatLocator, "vorne", rhsVORNE), lhsVORNE, rhsVORNE, (this.vorne!= null), (that.vorne!= null))) {
                return false;
            }
        }
        {
            Boolean lhsHINTEN;
            lhsHINTEN = this.getHINTEN();
            Boolean rhsHINTEN;
            rhsHINTEN = that.getHINTEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hinten", lhsHINTEN), LocatorUtils.property(thatLocator, "hinten", rhsHINTEN), lhsHINTEN, rhsHINTEN, (this.hinten!= null), (that.hinten!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
