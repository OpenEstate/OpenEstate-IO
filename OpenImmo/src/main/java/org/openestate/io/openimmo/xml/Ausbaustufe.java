
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="BAUSATZHAUS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AUSBAUHAUS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SCHLUESSELFERTIGMITKELLER" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SCHLUESSELFERTIGOHNEBODENPLATTE" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SCHLUESSELFERTIGMITBODENPLATTE" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ausbaustufe")
public class Ausbaustufe
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "BAUSATZHAUS")
    protected Boolean bausatzhaus;
    @XmlAttribute(name = "AUSBAUHAUS")
    protected Boolean ausbauhaus;
    @XmlAttribute(name = "SCHLUESSELFERTIGMITKELLER")
    protected Boolean schluesselfertigmitkeller;
    @XmlAttribute(name = "SCHLUESSELFERTIGOHNEBODENPLATTE")
    protected Boolean schluesselfertigohnebodenplatte;
    @XmlAttribute(name = "SCHLUESSELFERTIGMITBODENPLATTE")
    protected Boolean schluesselfertigmitbodenplatte;

    /**
     * Gets the value of the bausatzhaus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBAUSATZHAUS() {
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
    public Boolean isAUSBAUHAUS() {
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
    public Boolean isSCHLUESSELFERTIGMITKELLER() {
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
    public Boolean isSCHLUESSELFERTIGOHNEBODENPLATTE() {
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
    public Boolean isSCHLUESSELFERTIGMITBODENPLATTE() {
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
    public void setSCHLUESSELFERTIGMITBODENPLATTE(Boolean value) {
        this.schluesselfertigmitbodenplatte = value;
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
            Boolean theBAUSATZHAUS;
            theBAUSATZHAUS = this.isBAUSATZHAUS();
            strategy.appendField(locator, this, "bausatzhaus", buffer, theBAUSATZHAUS);
        }
        {
            Boolean theAUSBAUHAUS;
            theAUSBAUHAUS = this.isAUSBAUHAUS();
            strategy.appendField(locator, this, "ausbauhaus", buffer, theAUSBAUHAUS);
        }
        {
            Boolean theSCHLUESSELFERTIGMITKELLER;
            theSCHLUESSELFERTIGMITKELLER = this.isSCHLUESSELFERTIGMITKELLER();
            strategy.appendField(locator, this, "schluesselfertigmitkeller", buffer, theSCHLUESSELFERTIGMITKELLER);
        }
        {
            Boolean theSCHLUESSELFERTIGOHNEBODENPLATTE;
            theSCHLUESSELFERTIGOHNEBODENPLATTE = this.isSCHLUESSELFERTIGOHNEBODENPLATTE();
            strategy.appendField(locator, this, "schluesselfertigohnebodenplatte", buffer, theSCHLUESSELFERTIGOHNEBODENPLATTE);
        }
        {
            Boolean theSCHLUESSELFERTIGMITBODENPLATTE;
            theSCHLUESSELFERTIGMITBODENPLATTE = this.isSCHLUESSELFERTIGMITBODENPLATTE();
            strategy.appendField(locator, this, "schluesselfertigmitbodenplatte", buffer, theSCHLUESSELFERTIGMITBODENPLATTE);
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
        if (draftCopy instanceof Ausbaustufe) {
            final Ausbaustufe copy = ((Ausbaustufe) draftCopy);
            if (this.bausatzhaus!= null) {
                Boolean sourceBAUSATZHAUS;
                sourceBAUSATZHAUS = this.isBAUSATZHAUS();
                Boolean copyBAUSATZHAUS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "bausatzhaus", sourceBAUSATZHAUS), sourceBAUSATZHAUS));
                copy.setBAUSATZHAUS(copyBAUSATZHAUS);
            } else {
                copy.bausatzhaus = null;
            }
            if (this.ausbauhaus!= null) {
                Boolean sourceAUSBAUHAUS;
                sourceAUSBAUHAUS = this.isAUSBAUHAUS();
                Boolean copyAUSBAUHAUS = ((Boolean) strategy.copy(LocatorUtils.property(locator, "ausbauhaus", sourceAUSBAUHAUS), sourceAUSBAUHAUS));
                copy.setAUSBAUHAUS(copyAUSBAUHAUS);
            } else {
                copy.ausbauhaus = null;
            }
            if (this.schluesselfertigmitkeller!= null) {
                Boolean sourceSCHLUESSELFERTIGMITKELLER;
                sourceSCHLUESSELFERTIGMITKELLER = this.isSCHLUESSELFERTIGMITKELLER();
                Boolean copySCHLUESSELFERTIGMITKELLER = ((Boolean) strategy.copy(LocatorUtils.property(locator, "schluesselfertigmitkeller", sourceSCHLUESSELFERTIGMITKELLER), sourceSCHLUESSELFERTIGMITKELLER));
                copy.setSCHLUESSELFERTIGMITKELLER(copySCHLUESSELFERTIGMITKELLER);
            } else {
                copy.schluesselfertigmitkeller = null;
            }
            if (this.schluesselfertigohnebodenplatte!= null) {
                Boolean sourceSCHLUESSELFERTIGOHNEBODENPLATTE;
                sourceSCHLUESSELFERTIGOHNEBODENPLATTE = this.isSCHLUESSELFERTIGOHNEBODENPLATTE();
                Boolean copySCHLUESSELFERTIGOHNEBODENPLATTE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "schluesselfertigohnebodenplatte", sourceSCHLUESSELFERTIGOHNEBODENPLATTE), sourceSCHLUESSELFERTIGOHNEBODENPLATTE));
                copy.setSCHLUESSELFERTIGOHNEBODENPLATTE(copySCHLUESSELFERTIGOHNEBODENPLATTE);
            } else {
                copy.schluesselfertigohnebodenplatte = null;
            }
            if (this.schluesselfertigmitbodenplatte!= null) {
                Boolean sourceSCHLUESSELFERTIGMITBODENPLATTE;
                sourceSCHLUESSELFERTIGMITBODENPLATTE = this.isSCHLUESSELFERTIGMITBODENPLATTE();
                Boolean copySCHLUESSELFERTIGMITBODENPLATTE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "schluesselfertigmitbodenplatte", sourceSCHLUESSELFERTIGMITBODENPLATTE), sourceSCHLUESSELFERTIGMITBODENPLATTE));
                copy.setSCHLUESSELFERTIGMITBODENPLATTE(copySCHLUESSELFERTIGMITBODENPLATTE);
            } else {
                copy.schluesselfertigmitbodenplatte = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Ausbaustufe();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Ausbaustufe)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Ausbaustufe that = ((Ausbaustufe) object);
        {
            Boolean lhsBAUSATZHAUS;
            lhsBAUSATZHAUS = this.isBAUSATZHAUS();
            Boolean rhsBAUSATZHAUS;
            rhsBAUSATZHAUS = that.isBAUSATZHAUS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bausatzhaus", lhsBAUSATZHAUS), LocatorUtils.property(thatLocator, "bausatzhaus", rhsBAUSATZHAUS), lhsBAUSATZHAUS, rhsBAUSATZHAUS)) {
                return false;
            }
        }
        {
            Boolean lhsAUSBAUHAUS;
            lhsAUSBAUHAUS = this.isAUSBAUHAUS();
            Boolean rhsAUSBAUHAUS;
            rhsAUSBAUHAUS = that.isAUSBAUHAUS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausbauhaus", lhsAUSBAUHAUS), LocatorUtils.property(thatLocator, "ausbauhaus", rhsAUSBAUHAUS), lhsAUSBAUHAUS, rhsAUSBAUHAUS)) {
                return false;
            }
        }
        {
            Boolean lhsSCHLUESSELFERTIGMITKELLER;
            lhsSCHLUESSELFERTIGMITKELLER = this.isSCHLUESSELFERTIGMITKELLER();
            Boolean rhsSCHLUESSELFERTIGMITKELLER;
            rhsSCHLUESSELFERTIGMITKELLER = that.isSCHLUESSELFERTIGMITKELLER();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schluesselfertigmitkeller", lhsSCHLUESSELFERTIGMITKELLER), LocatorUtils.property(thatLocator, "schluesselfertigmitkeller", rhsSCHLUESSELFERTIGMITKELLER), lhsSCHLUESSELFERTIGMITKELLER, rhsSCHLUESSELFERTIGMITKELLER)) {
                return false;
            }
        }
        {
            Boolean lhsSCHLUESSELFERTIGOHNEBODENPLATTE;
            lhsSCHLUESSELFERTIGOHNEBODENPLATTE = this.isSCHLUESSELFERTIGOHNEBODENPLATTE();
            Boolean rhsSCHLUESSELFERTIGOHNEBODENPLATTE;
            rhsSCHLUESSELFERTIGOHNEBODENPLATTE = that.isSCHLUESSELFERTIGOHNEBODENPLATTE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schluesselfertigohnebodenplatte", lhsSCHLUESSELFERTIGOHNEBODENPLATTE), LocatorUtils.property(thatLocator, "schluesselfertigohnebodenplatte", rhsSCHLUESSELFERTIGOHNEBODENPLATTE), lhsSCHLUESSELFERTIGOHNEBODENPLATTE, rhsSCHLUESSELFERTIGOHNEBODENPLATTE)) {
                return false;
            }
        }
        {
            Boolean lhsSCHLUESSELFERTIGMITBODENPLATTE;
            lhsSCHLUESSELFERTIGMITBODENPLATTE = this.isSCHLUESSELFERTIGMITBODENPLATTE();
            Boolean rhsSCHLUESSELFERTIGMITBODENPLATTE;
            rhsSCHLUESSELFERTIGMITBODENPLATTE = that.isSCHLUESSELFERTIGMITBODENPLATTE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schluesselfertigmitbodenplatte", lhsSCHLUESSELFERTIGMITBODENPLATTE), LocatorUtils.property(thatLocator, "schluesselfertigmitbodenplatte", rhsSCHLUESSELFERTIGMITBODENPLATTE), lhsSCHLUESSELFERTIGMITBODENPLATTE, rhsSCHLUESSELFERTIGMITBODENPLATTE)) {
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
