
package org.openestate.io.openimmo.xml;

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
 * Java class for &lt;ausbaustufe&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ausbaustufe")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Ausbaustufe implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "BAUSATZHAUS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean bausatzhaus;
    @XmlAttribute(name = "AUSBAUHAUS")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean ausbauhaus;
    @XmlAttribute(name = "SCHLUESSELFERTIGMITKELLER")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean schluesselfertigmitkeller;
    @XmlAttribute(name = "SCHLUESSELFERTIGOHNEBODENPLATTE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean schluesselfertigohnebodenplatte;
    @XmlAttribute(name = "SCHLUESSELFERTIGMITBODENPLATTE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean schluesselfertigmitbodenplatte;

    /**
     * Gets the value of the bausatzhaus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getBAUSATZHAUS() {
        return bausatzhaus;
    }

    /**
     * Sets the value of the bausatzhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setBAUSATZHAUS(Boolean value) {
        this.bausatzhaus = value;
    }

    /**
     * Gets the value of the ausbauhaus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getAUSBAUHAUS() {
        return ausbauhaus;
    }

    /**
     * Sets the value of the ausbauhaus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setAUSBAUHAUS(Boolean value) {
        this.ausbauhaus = value;
    }

    /**
     * Gets the value of the schluesselfertigmitkeller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getSCHLUESSELFERTIGMITKELLER() {
        return schluesselfertigmitkeller;
    }

    /**
     * Sets the value of the schluesselfertigmitkeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setSCHLUESSELFERTIGMITKELLER(Boolean value) {
        this.schluesselfertigmitkeller = value;
    }

    /**
     * Gets the value of the schluesselfertigohnebodenplatte property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getSCHLUESSELFERTIGOHNEBODENPLATTE() {
        return schluesselfertigohnebodenplatte;
    }

    /**
     * Sets the value of the schluesselfertigohnebodenplatte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setSCHLUESSELFERTIGOHNEBODENPLATTE(Boolean value) {
        this.schluesselfertigohnebodenplatte = value;
    }

    /**
     * Gets the value of the schluesselfertigmitbodenplatte property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getSCHLUESSELFERTIGMITBODENPLATTE() {
        return schluesselfertigmitbodenplatte;
    }

    /**
     * Sets the value of the schluesselfertigmitbodenplatte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setSCHLUESSELFERTIGMITBODENPLATTE(Boolean value) {
        this.schluesselfertigmitbodenplatte = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Boolean theBAUSATZHAUS;
            theBAUSATZHAUS = this.getBAUSATZHAUS();
            strategy.appendField(locator, this, "bausatzhaus", buffer, theBAUSATZHAUS, (this.bausatzhaus!= null));
        }
        {
            Boolean theAUSBAUHAUS;
            theAUSBAUHAUS = this.getAUSBAUHAUS();
            strategy.appendField(locator, this, "ausbauhaus", buffer, theAUSBAUHAUS, (this.ausbauhaus!= null));
        }
        {
            Boolean theSCHLUESSELFERTIGMITKELLER;
            theSCHLUESSELFERTIGMITKELLER = this.getSCHLUESSELFERTIGMITKELLER();
            strategy.appendField(locator, this, "schluesselfertigmitkeller", buffer, theSCHLUESSELFERTIGMITKELLER, (this.schluesselfertigmitkeller!= null));
        }
        {
            Boolean theSCHLUESSELFERTIGOHNEBODENPLATTE;
            theSCHLUESSELFERTIGOHNEBODENPLATTE = this.getSCHLUESSELFERTIGOHNEBODENPLATTE();
            strategy.appendField(locator, this, "schluesselfertigohnebodenplatte", buffer, theSCHLUESSELFERTIGOHNEBODENPLATTE, (this.schluesselfertigohnebodenplatte!= null));
        }
        {
            Boolean theSCHLUESSELFERTIGMITBODENPLATTE;
            theSCHLUESSELFERTIGMITBODENPLATTE = this.getSCHLUESSELFERTIGMITBODENPLATTE();
            strategy.appendField(locator, this, "schluesselfertigmitbodenplatte", buffer, theSCHLUESSELFERTIGMITBODENPLATTE, (this.schluesselfertigmitbodenplatte!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Ausbaustufe) {
            final Ausbaustufe copy = ((Ausbaustufe) draftCopy);
            {
                Boolean bausatzhausShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bausatzhaus!= null));
                if (bausatzhausShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBAUSATZHAUS;
                    sourceBAUSATZHAUS = this.getBAUSATZHAUS();
                    Boolean copyBAUSATZHAUS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "bausatzhaus", sourceBAUSATZHAUS), sourceBAUSATZHAUS, (this.bausatzhaus!= null)));
                    copy.setBAUSATZHAUS(copyBAUSATZHAUS);
                } else {
                    if (bausatzhausShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bausatzhaus = null;
                    }
                }
            }
            {
                Boolean ausbauhausShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausbauhaus!= null));
                if (ausbauhausShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAUSBAUHAUS;
                    sourceAUSBAUHAUS = this.getAUSBAUHAUS();
                    Boolean copyAUSBAUHAUS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "ausbauhaus", sourceAUSBAUHAUS), sourceAUSBAUHAUS, (this.ausbauhaus!= null)));
                    copy.setAUSBAUHAUS(copyAUSBAUHAUS);
                } else {
                    if (ausbauhausShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausbauhaus = null;
                    }
                }
            }
            {
                Boolean schluesselfertigmitkellerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schluesselfertigmitkeller!= null));
                if (schluesselfertigmitkellerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSCHLUESSELFERTIGMITKELLER;
                    sourceSCHLUESSELFERTIGMITKELLER = this.getSCHLUESSELFERTIGMITKELLER();
                    Boolean copySCHLUESSELFERTIGMITKELLER = ((Boolean) strategy.copy(LocatorUtils.property(locator, "schluesselfertigmitkeller", sourceSCHLUESSELFERTIGMITKELLER), sourceSCHLUESSELFERTIGMITKELLER, (this.schluesselfertigmitkeller!= null)));
                    copy.setSCHLUESSELFERTIGMITKELLER(copySCHLUESSELFERTIGMITKELLER);
                } else {
                    if (schluesselfertigmitkellerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schluesselfertigmitkeller = null;
                    }
                }
            }
            {
                Boolean schluesselfertigohnebodenplatteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schluesselfertigohnebodenplatte!= null));
                if (schluesselfertigohnebodenplatteShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSCHLUESSELFERTIGOHNEBODENPLATTE;
                    sourceSCHLUESSELFERTIGOHNEBODENPLATTE = this.getSCHLUESSELFERTIGOHNEBODENPLATTE();
                    Boolean copySCHLUESSELFERTIGOHNEBODENPLATTE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "schluesselfertigohnebodenplatte", sourceSCHLUESSELFERTIGOHNEBODENPLATTE), sourceSCHLUESSELFERTIGOHNEBODENPLATTE, (this.schluesselfertigohnebodenplatte!= null)));
                    copy.setSCHLUESSELFERTIGOHNEBODENPLATTE(copySCHLUESSELFERTIGOHNEBODENPLATTE);
                } else {
                    if (schluesselfertigohnebodenplatteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schluesselfertigohnebodenplatte = null;
                    }
                }
            }
            {
                Boolean schluesselfertigmitbodenplatteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schluesselfertigmitbodenplatte!= null));
                if (schluesselfertigmitbodenplatteShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSCHLUESSELFERTIGMITBODENPLATTE;
                    sourceSCHLUESSELFERTIGMITBODENPLATTE = this.getSCHLUESSELFERTIGMITBODENPLATTE();
                    Boolean copySCHLUESSELFERTIGMITBODENPLATTE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "schluesselfertigmitbodenplatte", sourceSCHLUESSELFERTIGMITBODENPLATTE), sourceSCHLUESSELFERTIGMITBODENPLATTE, (this.schluesselfertigmitbodenplatte!= null)));
                    copy.setSCHLUESSELFERTIGMITBODENPLATTE(copySCHLUESSELFERTIGMITBODENPLATTE);
                } else {
                    if (schluesselfertigmitbodenplatteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schluesselfertigmitbodenplatte = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Ausbaustufe();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Ausbaustufe that = ((Ausbaustufe) object);
        {
            Boolean lhsBAUSATZHAUS;
            lhsBAUSATZHAUS = this.getBAUSATZHAUS();
            Boolean rhsBAUSATZHAUS;
            rhsBAUSATZHAUS = that.getBAUSATZHAUS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bausatzhaus", lhsBAUSATZHAUS), LocatorUtils.property(thatLocator, "bausatzhaus", rhsBAUSATZHAUS), lhsBAUSATZHAUS, rhsBAUSATZHAUS, (this.bausatzhaus!= null), (that.bausatzhaus!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAUSBAUHAUS;
            lhsAUSBAUHAUS = this.getAUSBAUHAUS();
            Boolean rhsAUSBAUHAUS;
            rhsAUSBAUHAUS = that.getAUSBAUHAUS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausbauhaus", lhsAUSBAUHAUS), LocatorUtils.property(thatLocator, "ausbauhaus", rhsAUSBAUHAUS), lhsAUSBAUHAUS, rhsAUSBAUHAUS, (this.ausbauhaus!= null), (that.ausbauhaus!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSCHLUESSELFERTIGMITKELLER;
            lhsSCHLUESSELFERTIGMITKELLER = this.getSCHLUESSELFERTIGMITKELLER();
            Boolean rhsSCHLUESSELFERTIGMITKELLER;
            rhsSCHLUESSELFERTIGMITKELLER = that.getSCHLUESSELFERTIGMITKELLER();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schluesselfertigmitkeller", lhsSCHLUESSELFERTIGMITKELLER), LocatorUtils.property(thatLocator, "schluesselfertigmitkeller", rhsSCHLUESSELFERTIGMITKELLER), lhsSCHLUESSELFERTIGMITKELLER, rhsSCHLUESSELFERTIGMITKELLER, (this.schluesselfertigmitkeller!= null), (that.schluesselfertigmitkeller!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSCHLUESSELFERTIGOHNEBODENPLATTE;
            lhsSCHLUESSELFERTIGOHNEBODENPLATTE = this.getSCHLUESSELFERTIGOHNEBODENPLATTE();
            Boolean rhsSCHLUESSELFERTIGOHNEBODENPLATTE;
            rhsSCHLUESSELFERTIGOHNEBODENPLATTE = that.getSCHLUESSELFERTIGOHNEBODENPLATTE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schluesselfertigohnebodenplatte", lhsSCHLUESSELFERTIGOHNEBODENPLATTE), LocatorUtils.property(thatLocator, "schluesselfertigohnebodenplatte", rhsSCHLUESSELFERTIGOHNEBODENPLATTE), lhsSCHLUESSELFERTIGOHNEBODENPLATTE, rhsSCHLUESSELFERTIGOHNEBODENPLATTE, (this.schluesselfertigohnebodenplatte!= null), (that.schluesselfertigohnebodenplatte!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSCHLUESSELFERTIGMITBODENPLATTE;
            lhsSCHLUESSELFERTIGMITBODENPLATTE = this.getSCHLUESSELFERTIGMITBODENPLATTE();
            Boolean rhsSCHLUESSELFERTIGMITBODENPLATTE;
            rhsSCHLUESSELFERTIGMITBODENPLATTE = that.getSCHLUESSELFERTIGMITBODENPLATTE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schluesselfertigmitbodenplatte", lhsSCHLUESSELFERTIGMITBODENPLATTE), LocatorUtils.property(thatLocator, "schluesselfertigmitbodenplatte", rhsSCHLUESSELFERTIGMITBODENPLATTE), lhsSCHLUESSELFERTIGMITBODENPLATTE, rhsSCHLUESSELFERTIGMITBODENPLATTE, (this.schluesselfertigmitbodenplatte!= null), (that.schluesselfertigmitbodenplatte!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
