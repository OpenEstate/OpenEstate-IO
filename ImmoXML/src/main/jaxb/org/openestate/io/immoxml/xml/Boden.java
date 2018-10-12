
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
 * Java class for &lt;boden&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "boden")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
public class Boden implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "FLIESEN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean fliesen;
    @XmlAttribute(name = "STEIN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean stein;
    @XmlAttribute(name = "TEPPICH")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean teppich;
    @XmlAttribute(name = "PARKETT")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean parkett;
    @XmlAttribute(name = "DIELEN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean dielen;
    @XmlAttribute(name = "KUNSTSTOFF")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean kunststoff;
    @XmlAttribute(name = "ESTRICH")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean estrich;
    @XmlAttribute(name = "DOPPELBODEN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    protected Boolean doppelboden;

    /**
     * Gets the value of the fliesen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getFLIESEN() {
        return fliesen;
    }

    /**
     * Sets the value of the fliesen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setFLIESEN(Boolean value) {
        this.fliesen = value;
    }

    /**
     * Gets the value of the stein property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getSTEIN() {
        return stein;
    }

    /**
     * Sets the value of the stein property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setSTEIN(Boolean value) {
        this.stein = value;
    }

    /**
     * Gets the value of the teppich property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getTEPPICH() {
        return teppich;
    }

    /**
     * Sets the value of the teppich property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setTEPPICH(Boolean value) {
        this.teppich = value;
    }

    /**
     * Gets the value of the parkett property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getPARKETT() {
        return parkett;
    }

    /**
     * Sets the value of the parkett property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setPARKETT(Boolean value) {
        this.parkett = value;
    }

    /**
     * Gets the value of the dielen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getDIELEN() {
        return dielen;
    }

    /**
     * Sets the value of the dielen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setDIELEN(Boolean value) {
        this.dielen = value;
    }

    /**
     * Gets the value of the kunststoff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getKUNSTSTOFF() {
        return kunststoff;
    }

    /**
     * Sets the value of the kunststoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setKUNSTSTOFF(Boolean value) {
        this.kunststoff = value;
    }

    /**
     * Gets the value of the estrich property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getESTRICH() {
        return estrich;
    }

    /**
     * Sets the value of the estrich property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setESTRICH(Boolean value) {
        this.estrich = value;
    }

    /**
     * Gets the value of the doppelboden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Boolean getDOPPELBODEN() {
        return doppelboden;
    }

    /**
     * Sets the value of the doppelboden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public void setDOPPELBODEN(Boolean value) {
        this.doppelboden = value;
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
            Boolean theFLIESEN;
            theFLIESEN = this.getFLIESEN();
            strategy.appendField(locator, this, "fliesen", buffer, theFLIESEN, (this.fliesen!= null));
        }
        {
            Boolean theSTEIN;
            theSTEIN = this.getSTEIN();
            strategy.appendField(locator, this, "stein", buffer, theSTEIN, (this.stein!= null));
        }
        {
            Boolean theTEPPICH;
            theTEPPICH = this.getTEPPICH();
            strategy.appendField(locator, this, "teppich", buffer, theTEPPICH, (this.teppich!= null));
        }
        {
            Boolean thePARKETT;
            thePARKETT = this.getPARKETT();
            strategy.appendField(locator, this, "parkett", buffer, thePARKETT, (this.parkett!= null));
        }
        {
            Boolean theDIELEN;
            theDIELEN = this.getDIELEN();
            strategy.appendField(locator, this, "dielen", buffer, theDIELEN, (this.dielen!= null));
        }
        {
            Boolean theKUNSTSTOFF;
            theKUNSTSTOFF = this.getKUNSTSTOFF();
            strategy.appendField(locator, this, "kunststoff", buffer, theKUNSTSTOFF, (this.kunststoff!= null));
        }
        {
            Boolean theESTRICH;
            theESTRICH = this.getESTRICH();
            strategy.appendField(locator, this, "estrich", buffer, theESTRICH, (this.estrich!= null));
        }
        {
            Boolean theDOPPELBODEN;
            theDOPPELBODEN = this.getDOPPELBODEN();
            strategy.appendField(locator, this, "doppelboden", buffer, theDOPPELBODEN, (this.doppelboden!= null));
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
        if (draftCopy instanceof Boden) {
            final Boden copy = ((Boden) draftCopy);
            {
                Boolean fliesenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fliesen!= null));
                if (fliesenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFLIESEN;
                    sourceFLIESEN = this.getFLIESEN();
                    Boolean copyFLIESEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "fliesen", sourceFLIESEN), sourceFLIESEN, (this.fliesen!= null)));
                    copy.setFLIESEN(copyFLIESEN);
                } else {
                    if (fliesenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fliesen = null;
                    }
                }
            }
            {
                Boolean steinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stein!= null));
                if (steinShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSTEIN;
                    sourceSTEIN = this.getSTEIN();
                    Boolean copySTEIN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "stein", sourceSTEIN), sourceSTEIN, (this.stein!= null)));
                    copy.setSTEIN(copySTEIN);
                } else {
                    if (steinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stein = null;
                    }
                }
            }
            {
                Boolean teppichShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.teppich!= null));
                if (teppichShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTEPPICH;
                    sourceTEPPICH = this.getTEPPICH();
                    Boolean copyTEPPICH = ((Boolean) strategy.copy(LocatorUtils.property(locator, "teppich", sourceTEPPICH), sourceTEPPICH, (this.teppich!= null)));
                    copy.setTEPPICH(copyTEPPICH);
                } else {
                    if (teppichShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.teppich = null;
                    }
                }
            }
            {
                Boolean parkettShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkett!= null));
                if (parkettShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePARKETT;
                    sourcePARKETT = this.getPARKETT();
                    Boolean copyPARKETT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "parkett", sourcePARKETT), sourcePARKETT, (this.parkett!= null)));
                    copy.setPARKETT(copyPARKETT);
                } else {
                    if (parkettShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkett = null;
                    }
                }
            }
            {
                Boolean dielenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dielen!= null));
                if (dielenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDIELEN;
                    sourceDIELEN = this.getDIELEN();
                    Boolean copyDIELEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "dielen", sourceDIELEN), sourceDIELEN, (this.dielen!= null)));
                    copy.setDIELEN(copyDIELEN);
                } else {
                    if (dielenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dielen = null;
                    }
                }
            }
            {
                Boolean kunststoffShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kunststoff!= null));
                if (kunststoffShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKUNSTSTOFF;
                    sourceKUNSTSTOFF = this.getKUNSTSTOFF();
                    Boolean copyKUNSTSTOFF = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kunststoff", sourceKUNSTSTOFF), sourceKUNSTSTOFF, (this.kunststoff!= null)));
                    copy.setKUNSTSTOFF(copyKUNSTSTOFF);
                } else {
                    if (kunststoffShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kunststoff = null;
                    }
                }
            }
            {
                Boolean estrichShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.estrich!= null));
                if (estrichShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceESTRICH;
                    sourceESTRICH = this.getESTRICH();
                    Boolean copyESTRICH = ((Boolean) strategy.copy(LocatorUtils.property(locator, "estrich", sourceESTRICH), sourceESTRICH, (this.estrich!= null)));
                    copy.setESTRICH(copyESTRICH);
                } else {
                    if (estrichShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.estrich = null;
                    }
                }
            }
            {
                Boolean doppelbodenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.doppelboden!= null));
                if (doppelbodenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDOPPELBODEN;
                    sourceDOPPELBODEN = this.getDOPPELBODEN();
                    Boolean copyDOPPELBODEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "doppelboden", sourceDOPPELBODEN), sourceDOPPELBODEN, (this.doppelboden!= null)));
                    copy.setDOPPELBODEN(copyDOPPELBODEN);
                } else {
                    if (doppelbodenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.doppelboden = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Boden();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:50:55+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Boden that = ((Boden) object);
        {
            Boolean lhsFLIESEN;
            lhsFLIESEN = this.getFLIESEN();
            Boolean rhsFLIESEN;
            rhsFLIESEN = that.getFLIESEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fliesen", lhsFLIESEN), LocatorUtils.property(thatLocator, "fliesen", rhsFLIESEN), lhsFLIESEN, rhsFLIESEN, (this.fliesen!= null), (that.fliesen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSTEIN;
            lhsSTEIN = this.getSTEIN();
            Boolean rhsSTEIN;
            rhsSTEIN = that.getSTEIN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stein", lhsSTEIN), LocatorUtils.property(thatLocator, "stein", rhsSTEIN), lhsSTEIN, rhsSTEIN, (this.stein!= null), (that.stein!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTEPPICH;
            lhsTEPPICH = this.getTEPPICH();
            Boolean rhsTEPPICH;
            rhsTEPPICH = that.getTEPPICH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teppich", lhsTEPPICH), LocatorUtils.property(thatLocator, "teppich", rhsTEPPICH), lhsTEPPICH, rhsTEPPICH, (this.teppich!= null), (that.teppich!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPARKETT;
            lhsPARKETT = this.getPARKETT();
            Boolean rhsPARKETT;
            rhsPARKETT = that.getPARKETT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkett", lhsPARKETT), LocatorUtils.property(thatLocator, "parkett", rhsPARKETT), lhsPARKETT, rhsPARKETT, (this.parkett!= null), (that.parkett!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDIELEN;
            lhsDIELEN = this.getDIELEN();
            Boolean rhsDIELEN;
            rhsDIELEN = that.getDIELEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dielen", lhsDIELEN), LocatorUtils.property(thatLocator, "dielen", rhsDIELEN), lhsDIELEN, rhsDIELEN, (this.dielen!= null), (that.dielen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKUNSTSTOFF;
            lhsKUNSTSTOFF = this.getKUNSTSTOFF();
            Boolean rhsKUNSTSTOFF;
            rhsKUNSTSTOFF = that.getKUNSTSTOFF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kunststoff", lhsKUNSTSTOFF), LocatorUtils.property(thatLocator, "kunststoff", rhsKUNSTSTOFF), lhsKUNSTSTOFF, rhsKUNSTSTOFF, (this.kunststoff!= null), (that.kunststoff!= null))) {
                return false;
            }
        }
        {
            Boolean lhsESTRICH;
            lhsESTRICH = this.getESTRICH();
            Boolean rhsESTRICH;
            rhsESTRICH = that.getESTRICH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estrich", lhsESTRICH), LocatorUtils.property(thatLocator, "estrich", rhsESTRICH), lhsESTRICH, rhsESTRICH, (this.estrich!= null), (that.estrich!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDOPPELBODEN;
            lhsDOPPELBODEN = this.getDOPPELBODEN();
            Boolean rhsDOPPELBODEN;
            rhsDOPPELBODEN = that.getDOPPELBODEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doppelboden", lhsDOPPELBODEN), LocatorUtils.property(thatLocator, "doppelboden", rhsDOPPELBODEN), lhsDOPPELBODEN, rhsDOPPELBODEN, (this.doppelboden!= null), (that.doppelboden!= null))) {
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
