
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
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
public class Boden implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "FLIESEN")
    protected Boolean fliesen;
    @XmlAttribute(name = "STEIN")
    protected Boolean stein;
    @XmlAttribute(name = "TEPPICH")
    protected Boolean teppich;
    @XmlAttribute(name = "PARKETT")
    protected Boolean parkett;
    @XmlAttribute(name = "FERTIGPARKETT")
    protected Boolean fertigparkett;
    @XmlAttribute(name = "LAMINAT")
    protected Boolean laminat;
    @XmlAttribute(name = "DIELEN")
    protected Boolean dielen;
    @XmlAttribute(name = "KUNSTSTOFF")
    protected Boolean kunststoff;
    @XmlAttribute(name = "ESTRICH")
    protected Boolean estrich;
    @XmlAttribute(name = "DOPPELBODEN")
    protected Boolean doppelboden;
    @XmlAttribute(name = "LINOLEUM")
    protected Boolean linoleum;
    @XmlAttribute(name = "MARMOR")
    protected Boolean marmor;
    @XmlAttribute(name = "TERRAKOTTA")
    protected Boolean terrakotta;
    @XmlAttribute(name = "GRANIT")
    protected Boolean granit;

    /**
     * Gets the value of the fliesen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFLIESEN() {
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
    public Boolean isSTEIN() {
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
    public Boolean isTEPPICH() {
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
    public Boolean isPARKETT() {
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
    public void setPARKETT(Boolean value) {
        this.parkett = value;
    }

    /**
     * Gets the value of the fertigparkett property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFERTIGPARKETT() {
        return fertigparkett;
    }

    /**
     * Sets the value of the fertigparkett property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFERTIGPARKETT(Boolean value) {
        this.fertigparkett = value;
    }

    /**
     * Gets the value of the laminat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLAMINAT() {
        return laminat;
    }

    /**
     * Sets the value of the laminat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLAMINAT(Boolean value) {
        this.laminat = value;
    }

    /**
     * Gets the value of the dielen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDIELEN() {
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
    public Boolean isKUNSTSTOFF() {
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
    public Boolean isESTRICH() {
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
    public Boolean isDOPPELBODEN() {
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
    public void setDOPPELBODEN(Boolean value) {
        this.doppelboden = value;
    }

    /**
     * Gets the value of the linoleum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLINOLEUM() {
        return linoleum;
    }

    /**
     * Sets the value of the linoleum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLINOLEUM(Boolean value) {
        this.linoleum = value;
    }

    /**
     * Gets the value of the marmor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMARMOR() {
        return marmor;
    }

    /**
     * Sets the value of the marmor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMARMOR(Boolean value) {
        this.marmor = value;
    }

    /**
     * Gets the value of the terrakotta property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTERRAKOTTA() {
        return terrakotta;
    }

    /**
     * Sets the value of the terrakotta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTERRAKOTTA(Boolean value) {
        this.terrakotta = value;
    }

    /**
     * Gets the value of the granit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGRANIT() {
        return granit;
    }

    /**
     * Sets the value of the granit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGRANIT(Boolean value) {
        this.granit = value;
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
            Boolean theFLIESEN;
            theFLIESEN = this.isFLIESEN();
            strategy.appendField(locator, this, "fliesen", buffer, theFLIESEN, (this.fliesen!= null));
        }
        {
            Boolean theSTEIN;
            theSTEIN = this.isSTEIN();
            strategy.appendField(locator, this, "stein", buffer, theSTEIN, (this.stein!= null));
        }
        {
            Boolean theTEPPICH;
            theTEPPICH = this.isTEPPICH();
            strategy.appendField(locator, this, "teppich", buffer, theTEPPICH, (this.teppich!= null));
        }
        {
            Boolean thePARKETT;
            thePARKETT = this.isPARKETT();
            strategy.appendField(locator, this, "parkett", buffer, thePARKETT, (this.parkett!= null));
        }
        {
            Boolean theFERTIGPARKETT;
            theFERTIGPARKETT = this.isFERTIGPARKETT();
            strategy.appendField(locator, this, "fertigparkett", buffer, theFERTIGPARKETT, (this.fertigparkett!= null));
        }
        {
            Boolean theLAMINAT;
            theLAMINAT = this.isLAMINAT();
            strategy.appendField(locator, this, "laminat", buffer, theLAMINAT, (this.laminat!= null));
        }
        {
            Boolean theDIELEN;
            theDIELEN = this.isDIELEN();
            strategy.appendField(locator, this, "dielen", buffer, theDIELEN, (this.dielen!= null));
        }
        {
            Boolean theKUNSTSTOFF;
            theKUNSTSTOFF = this.isKUNSTSTOFF();
            strategy.appendField(locator, this, "kunststoff", buffer, theKUNSTSTOFF, (this.kunststoff!= null));
        }
        {
            Boolean theESTRICH;
            theESTRICH = this.isESTRICH();
            strategy.appendField(locator, this, "estrich", buffer, theESTRICH, (this.estrich!= null));
        }
        {
            Boolean theDOPPELBODEN;
            theDOPPELBODEN = this.isDOPPELBODEN();
            strategy.appendField(locator, this, "doppelboden", buffer, theDOPPELBODEN, (this.doppelboden!= null));
        }
        {
            Boolean theLINOLEUM;
            theLINOLEUM = this.isLINOLEUM();
            strategy.appendField(locator, this, "linoleum", buffer, theLINOLEUM, (this.linoleum!= null));
        }
        {
            Boolean theMARMOR;
            theMARMOR = this.isMARMOR();
            strategy.appendField(locator, this, "marmor", buffer, theMARMOR, (this.marmor!= null));
        }
        {
            Boolean theTERRAKOTTA;
            theTERRAKOTTA = this.isTERRAKOTTA();
            strategy.appendField(locator, this, "terrakotta", buffer, theTERRAKOTTA, (this.terrakotta!= null));
        }
        {
            Boolean theGRANIT;
            theGRANIT = this.isGRANIT();
            strategy.appendField(locator, this, "granit", buffer, theGRANIT, (this.granit!= null));
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
        if (draftCopy instanceof Boden) {
            final Boden copy = ((Boden) draftCopy);
            {
                Boolean fliesenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fliesen!= null));
                if (fliesenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFLIESEN;
                    sourceFLIESEN = this.isFLIESEN();
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
                    sourceSTEIN = this.isSTEIN();
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
                    sourceTEPPICH = this.isTEPPICH();
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
                    sourcePARKETT = this.isPARKETT();
                    Boolean copyPARKETT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "parkett", sourcePARKETT), sourcePARKETT, (this.parkett!= null)));
                    copy.setPARKETT(copyPARKETT);
                } else {
                    if (parkettShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkett = null;
                    }
                }
            }
            {
                Boolean fertigparkettShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fertigparkett!= null));
                if (fertigparkettShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFERTIGPARKETT;
                    sourceFERTIGPARKETT = this.isFERTIGPARKETT();
                    Boolean copyFERTIGPARKETT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "fertigparkett", sourceFERTIGPARKETT), sourceFERTIGPARKETT, (this.fertigparkett!= null)));
                    copy.setFERTIGPARKETT(copyFERTIGPARKETT);
                } else {
                    if (fertigparkettShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fertigparkett = null;
                    }
                }
            }
            {
                Boolean laminatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.laminat!= null));
                if (laminatShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceLAMINAT;
                    sourceLAMINAT = this.isLAMINAT();
                    Boolean copyLAMINAT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "laminat", sourceLAMINAT), sourceLAMINAT, (this.laminat!= null)));
                    copy.setLAMINAT(copyLAMINAT);
                } else {
                    if (laminatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.laminat = null;
                    }
                }
            }
            {
                Boolean dielenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dielen!= null));
                if (dielenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDIELEN;
                    sourceDIELEN = this.isDIELEN();
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
                    sourceKUNSTSTOFF = this.isKUNSTSTOFF();
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
                    sourceESTRICH = this.isESTRICH();
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
                    sourceDOPPELBODEN = this.isDOPPELBODEN();
                    Boolean copyDOPPELBODEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "doppelboden", sourceDOPPELBODEN), sourceDOPPELBODEN, (this.doppelboden!= null)));
                    copy.setDOPPELBODEN(copyDOPPELBODEN);
                } else {
                    if (doppelbodenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.doppelboden = null;
                    }
                }
            }
            {
                Boolean linoleumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.linoleum!= null));
                if (linoleumShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceLINOLEUM;
                    sourceLINOLEUM = this.isLINOLEUM();
                    Boolean copyLINOLEUM = ((Boolean) strategy.copy(LocatorUtils.property(locator, "linoleum", sourceLINOLEUM), sourceLINOLEUM, (this.linoleum!= null)));
                    copy.setLINOLEUM(copyLINOLEUM);
                } else {
                    if (linoleumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.linoleum = null;
                    }
                }
            }
            {
                Boolean marmorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.marmor!= null));
                if (marmorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceMARMOR;
                    sourceMARMOR = this.isMARMOR();
                    Boolean copyMARMOR = ((Boolean) strategy.copy(LocatorUtils.property(locator, "marmor", sourceMARMOR), sourceMARMOR, (this.marmor!= null)));
                    copy.setMARMOR(copyMARMOR);
                } else {
                    if (marmorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.marmor = null;
                    }
                }
            }
            {
                Boolean terrakottaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.terrakotta!= null));
                if (terrakottaShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTERRAKOTTA;
                    sourceTERRAKOTTA = this.isTERRAKOTTA();
                    Boolean copyTERRAKOTTA = ((Boolean) strategy.copy(LocatorUtils.property(locator, "terrakotta", sourceTERRAKOTTA), sourceTERRAKOTTA, (this.terrakotta!= null)));
                    copy.setTERRAKOTTA(copyTERRAKOTTA);
                } else {
                    if (terrakottaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.terrakotta = null;
                    }
                }
            }
            {
                Boolean granitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.granit!= null));
                if (granitShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGRANIT;
                    sourceGRANIT = this.isGRANIT();
                    Boolean copyGRANIT = ((Boolean) strategy.copy(LocatorUtils.property(locator, "granit", sourceGRANIT), sourceGRANIT, (this.granit!= null)));
                    copy.setGRANIT(copyGRANIT);
                } else {
                    if (granitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.granit = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Boden();
    }

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
            lhsFLIESEN = this.isFLIESEN();
            Boolean rhsFLIESEN;
            rhsFLIESEN = that.isFLIESEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fliesen", lhsFLIESEN), LocatorUtils.property(thatLocator, "fliesen", rhsFLIESEN), lhsFLIESEN, rhsFLIESEN, (this.fliesen!= null), (that.fliesen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSTEIN;
            lhsSTEIN = this.isSTEIN();
            Boolean rhsSTEIN;
            rhsSTEIN = that.isSTEIN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stein", lhsSTEIN), LocatorUtils.property(thatLocator, "stein", rhsSTEIN), lhsSTEIN, rhsSTEIN, (this.stein!= null), (that.stein!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTEPPICH;
            lhsTEPPICH = this.isTEPPICH();
            Boolean rhsTEPPICH;
            rhsTEPPICH = that.isTEPPICH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teppich", lhsTEPPICH), LocatorUtils.property(thatLocator, "teppich", rhsTEPPICH), lhsTEPPICH, rhsTEPPICH, (this.teppich!= null), (that.teppich!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPARKETT;
            lhsPARKETT = this.isPARKETT();
            Boolean rhsPARKETT;
            rhsPARKETT = that.isPARKETT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkett", lhsPARKETT), LocatorUtils.property(thatLocator, "parkett", rhsPARKETT), lhsPARKETT, rhsPARKETT, (this.parkett!= null), (that.parkett!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFERTIGPARKETT;
            lhsFERTIGPARKETT = this.isFERTIGPARKETT();
            Boolean rhsFERTIGPARKETT;
            rhsFERTIGPARKETT = that.isFERTIGPARKETT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fertigparkett", lhsFERTIGPARKETT), LocatorUtils.property(thatLocator, "fertigparkett", rhsFERTIGPARKETT), lhsFERTIGPARKETT, rhsFERTIGPARKETT, (this.fertigparkett!= null), (that.fertigparkett!= null))) {
                return false;
            }
        }
        {
            Boolean lhsLAMINAT;
            lhsLAMINAT = this.isLAMINAT();
            Boolean rhsLAMINAT;
            rhsLAMINAT = that.isLAMINAT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "laminat", lhsLAMINAT), LocatorUtils.property(thatLocator, "laminat", rhsLAMINAT), lhsLAMINAT, rhsLAMINAT, (this.laminat!= null), (that.laminat!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDIELEN;
            lhsDIELEN = this.isDIELEN();
            Boolean rhsDIELEN;
            rhsDIELEN = that.isDIELEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dielen", lhsDIELEN), LocatorUtils.property(thatLocator, "dielen", rhsDIELEN), lhsDIELEN, rhsDIELEN, (this.dielen!= null), (that.dielen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKUNSTSTOFF;
            lhsKUNSTSTOFF = this.isKUNSTSTOFF();
            Boolean rhsKUNSTSTOFF;
            rhsKUNSTSTOFF = that.isKUNSTSTOFF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kunststoff", lhsKUNSTSTOFF), LocatorUtils.property(thatLocator, "kunststoff", rhsKUNSTSTOFF), lhsKUNSTSTOFF, rhsKUNSTSTOFF, (this.kunststoff!= null), (that.kunststoff!= null))) {
                return false;
            }
        }
        {
            Boolean lhsESTRICH;
            lhsESTRICH = this.isESTRICH();
            Boolean rhsESTRICH;
            rhsESTRICH = that.isESTRICH();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estrich", lhsESTRICH), LocatorUtils.property(thatLocator, "estrich", rhsESTRICH), lhsESTRICH, rhsESTRICH, (this.estrich!= null), (that.estrich!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDOPPELBODEN;
            lhsDOPPELBODEN = this.isDOPPELBODEN();
            Boolean rhsDOPPELBODEN;
            rhsDOPPELBODEN = that.isDOPPELBODEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doppelboden", lhsDOPPELBODEN), LocatorUtils.property(thatLocator, "doppelboden", rhsDOPPELBODEN), lhsDOPPELBODEN, rhsDOPPELBODEN, (this.doppelboden!= null), (that.doppelboden!= null))) {
                return false;
            }
        }
        {
            Boolean lhsLINOLEUM;
            lhsLINOLEUM = this.isLINOLEUM();
            Boolean rhsLINOLEUM;
            rhsLINOLEUM = that.isLINOLEUM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "linoleum", lhsLINOLEUM), LocatorUtils.property(thatLocator, "linoleum", rhsLINOLEUM), lhsLINOLEUM, rhsLINOLEUM, (this.linoleum!= null), (that.linoleum!= null))) {
                return false;
            }
        }
        {
            Boolean lhsMARMOR;
            lhsMARMOR = this.isMARMOR();
            Boolean rhsMARMOR;
            rhsMARMOR = that.isMARMOR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "marmor", lhsMARMOR), LocatorUtils.property(thatLocator, "marmor", rhsMARMOR), lhsMARMOR, rhsMARMOR, (this.marmor!= null), (that.marmor!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTERRAKOTTA;
            lhsTERRAKOTTA = this.isTERRAKOTTA();
            Boolean rhsTERRAKOTTA;
            rhsTERRAKOTTA = that.isTERRAKOTTA();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terrakotta", lhsTERRAKOTTA), LocatorUtils.property(thatLocator, "terrakotta", rhsTERRAKOTTA), lhsTERRAKOTTA, rhsTERRAKOTTA, (this.terrakotta!= null), (that.terrakotta!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGRANIT;
            lhsGRANIT = this.isGRANIT();
            Boolean rhsGRANIT;
            rhsGRANIT = that.isGRANIT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "granit", lhsGRANIT), LocatorUtils.property(thatLocator, "granit", rhsGRANIT), lhsGRANIT, rhsGRANIT, (this.granit!= null), (that.granit!= null))) {
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
