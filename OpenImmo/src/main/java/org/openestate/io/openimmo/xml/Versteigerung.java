
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * Java class for &lt;versteigerung&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zwangsversteigerung",
    "aktenzeichen",
    "zvtermin",
    "zusatztermin",
    "amtsgericht",
    "verkehrswert"
})
@XmlRootElement(name = "versteigerung")
public class Versteigerung implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    protected Boolean zwangsversteigerung;
    protected String aktenzeichen;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar zvtermin;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar zusatztermin;
    protected String amtsgericht;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal verkehrswert;

    /**
     * Gets the value of the zwangsversteigerung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZwangsversteigerung() {
        return zwangsversteigerung;
    }

    /**
     * Sets the value of the zwangsversteigerung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZwangsversteigerung(Boolean value) {
        this.zwangsversteigerung = value;
    }

    /**
     * Gets the value of the aktenzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktenzeichen() {
        return aktenzeichen;
    }

    /**
     * Sets the value of the aktenzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktenzeichen(String value) {
        this.aktenzeichen = value;
    }

    /**
     * Gets the value of the zvtermin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getZvtermin() {
        return zvtermin;
    }

    /**
     * Sets the value of the zvtermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZvtermin(Calendar value) {
        this.zvtermin = value;
    }

    /**
     * Gets the value of the zusatztermin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getZusatztermin() {
        return zusatztermin;
    }

    /**
     * Sets the value of the zusatztermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZusatztermin(Calendar value) {
        this.zusatztermin = value;
    }

    /**
     * Gets the value of the amtsgericht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmtsgericht() {
        return amtsgericht;
    }

    /**
     * Sets the value of the amtsgericht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmtsgericht(String value) {
        this.amtsgericht = value;
    }

    /**
     * Gets the value of the verkehrswert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getVerkehrswert() {
        return verkehrswert;
    }

    /**
     * Sets the value of the verkehrswert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerkehrswert(BigDecimal value) {
        this.verkehrswert = value;
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
            Boolean theZwangsversteigerung;
            theZwangsversteigerung = this.isZwangsversteigerung();
            strategy.appendField(locator, this, "zwangsversteigerung", buffer, theZwangsversteigerung, (this.zwangsversteigerung!= null));
        }
        {
            String theAktenzeichen;
            theAktenzeichen = this.getAktenzeichen();
            strategy.appendField(locator, this, "aktenzeichen", buffer, theAktenzeichen, (this.aktenzeichen!= null));
        }
        {
            Calendar theZvtermin;
            theZvtermin = this.getZvtermin();
            strategy.appendField(locator, this, "zvtermin", buffer, theZvtermin, (this.zvtermin!= null));
        }
        {
            Calendar theZusatztermin;
            theZusatztermin = this.getZusatztermin();
            strategy.appendField(locator, this, "zusatztermin", buffer, theZusatztermin, (this.zusatztermin!= null));
        }
        {
            String theAmtsgericht;
            theAmtsgericht = this.getAmtsgericht();
            strategy.appendField(locator, this, "amtsgericht", buffer, theAmtsgericht, (this.amtsgericht!= null));
        }
        {
            BigDecimal theVerkehrswert;
            theVerkehrswert = this.getVerkehrswert();
            strategy.appendField(locator, this, "verkehrswert", buffer, theVerkehrswert, (this.verkehrswert!= null));
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
        if (draftCopy instanceof Versteigerung) {
            final Versteigerung copy = ((Versteigerung) draftCopy);
            {
                Boolean zwangsversteigerungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zwangsversteigerung!= null));
                if (zwangsversteigerungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceZwangsversteigerung;
                    sourceZwangsversteigerung = this.isZwangsversteigerung();
                    Boolean copyZwangsversteigerung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "zwangsversteigerung", sourceZwangsversteigerung), sourceZwangsversteigerung, (this.zwangsversteigerung!= null)));
                    copy.setZwangsversteigerung(copyZwangsversteigerung);
                } else {
                    if (zwangsversteigerungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zwangsversteigerung = null;
                    }
                }
            }
            {
                Boolean aktenzeichenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aktenzeichen!= null));
                if (aktenzeichenShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAktenzeichen;
                    sourceAktenzeichen = this.getAktenzeichen();
                    String copyAktenzeichen = ((String) strategy.copy(LocatorUtils.property(locator, "aktenzeichen", sourceAktenzeichen), sourceAktenzeichen, (this.aktenzeichen!= null)));
                    copy.setAktenzeichen(copyAktenzeichen);
                } else {
                    if (aktenzeichenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aktenzeichen = null;
                    }
                }
            }
            {
                Boolean zvterminShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zvtermin!= null));
                if (zvterminShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceZvtermin;
                    sourceZvtermin = this.getZvtermin();
                    Calendar copyZvtermin = ((Calendar) strategy.copy(LocatorUtils.property(locator, "zvtermin", sourceZvtermin), sourceZvtermin, (this.zvtermin!= null)));
                    copy.setZvtermin(copyZvtermin);
                } else {
                    if (zvterminShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zvtermin = null;
                    }
                }
            }
            {
                Boolean zusatzterminShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zusatztermin!= null));
                if (zusatzterminShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceZusatztermin;
                    sourceZusatztermin = this.getZusatztermin();
                    Calendar copyZusatztermin = ((Calendar) strategy.copy(LocatorUtils.property(locator, "zusatztermin", sourceZusatztermin), sourceZusatztermin, (this.zusatztermin!= null)));
                    copy.setZusatztermin(copyZusatztermin);
                } else {
                    if (zusatzterminShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zusatztermin = null;
                    }
                }
            }
            {
                Boolean amtsgerichtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.amtsgericht!= null));
                if (amtsgerichtShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAmtsgericht;
                    sourceAmtsgericht = this.getAmtsgericht();
                    String copyAmtsgericht = ((String) strategy.copy(LocatorUtils.property(locator, "amtsgericht", sourceAmtsgericht), sourceAmtsgericht, (this.amtsgericht!= null)));
                    copy.setAmtsgericht(copyAmtsgericht);
                } else {
                    if (amtsgerichtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.amtsgericht = null;
                    }
                }
            }
            {
                Boolean verkehrswertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verkehrswert!= null));
                if (verkehrswertShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceVerkehrswert;
                    sourceVerkehrswert = this.getVerkehrswert();
                    BigDecimal copyVerkehrswert = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "verkehrswert", sourceVerkehrswert), sourceVerkehrswert, (this.verkehrswert!= null)));
                    copy.setVerkehrswert(copyVerkehrswert);
                } else {
                    if (verkehrswertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verkehrswert = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Versteigerung();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Versteigerung that = ((Versteigerung) object);
        {
            Boolean lhsZwangsversteigerung;
            lhsZwangsversteigerung = this.isZwangsversteigerung();
            Boolean rhsZwangsversteigerung;
            rhsZwangsversteigerung = that.isZwangsversteigerung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zwangsversteigerung", lhsZwangsversteigerung), LocatorUtils.property(thatLocator, "zwangsversteigerung", rhsZwangsversteigerung), lhsZwangsversteigerung, rhsZwangsversteigerung, (this.zwangsversteigerung!= null), (that.zwangsversteigerung!= null))) {
                return false;
            }
        }
        {
            String lhsAktenzeichen;
            lhsAktenzeichen = this.getAktenzeichen();
            String rhsAktenzeichen;
            rhsAktenzeichen = that.getAktenzeichen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktenzeichen", lhsAktenzeichen), LocatorUtils.property(thatLocator, "aktenzeichen", rhsAktenzeichen), lhsAktenzeichen, rhsAktenzeichen, (this.aktenzeichen!= null), (that.aktenzeichen!= null))) {
                return false;
            }
        }
        {
            Calendar lhsZvtermin;
            lhsZvtermin = this.getZvtermin();
            Calendar rhsZvtermin;
            rhsZvtermin = that.getZvtermin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zvtermin", lhsZvtermin), LocatorUtils.property(thatLocator, "zvtermin", rhsZvtermin), lhsZvtermin, rhsZvtermin, (this.zvtermin!= null), (that.zvtermin!= null))) {
                return false;
            }
        }
        {
            Calendar lhsZusatztermin;
            lhsZusatztermin = this.getZusatztermin();
            Calendar rhsZusatztermin;
            rhsZusatztermin = that.getZusatztermin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zusatztermin", lhsZusatztermin), LocatorUtils.property(thatLocator, "zusatztermin", rhsZusatztermin), lhsZusatztermin, rhsZusatztermin, (this.zusatztermin!= null), (that.zusatztermin!= null))) {
                return false;
            }
        }
        {
            String lhsAmtsgericht;
            lhsAmtsgericht = this.getAmtsgericht();
            String rhsAmtsgericht;
            rhsAmtsgericht = that.getAmtsgericht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amtsgericht", lhsAmtsgericht), LocatorUtils.property(thatLocator, "amtsgericht", rhsAmtsgericht), lhsAmtsgericht, rhsAmtsgericht, (this.amtsgericht!= null), (that.amtsgericht!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsVerkehrswert;
            lhsVerkehrswert = this.getVerkehrswert();
            BigDecimal rhsVerkehrswert;
            rhsVerkehrswert = that.getVerkehrswert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verkehrswert", lhsVerkehrswert), LocatorUtils.property(thatLocator, "verkehrswert", rhsVerkehrswert), lhsVerkehrswert, rhsVerkehrswert, (this.verkehrswert!= null), (that.verkehrswert!= null))) {
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
