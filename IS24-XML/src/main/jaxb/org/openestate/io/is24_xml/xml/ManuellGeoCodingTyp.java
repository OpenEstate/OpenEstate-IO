
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for ManuellGeoCodingTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManuellGeoCodingTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="TermsRegion" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *       &lt;attribute name="TermsStadt" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *       &lt;attribute name="TermsStadtTeil" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManuellGeoCodingTyp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
public class ManuellGeoCodingTyp implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "TermsRegion")
    @XmlJavaTypeAdapter(Adapter7 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected String termsRegion;
    @XmlAttribute(name = "TermsStadt")
    @XmlJavaTypeAdapter(Adapter7 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected String termsStadt;
    @XmlAttribute(name = "TermsStadtTeil")
    @XmlJavaTypeAdapter(Adapter7 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    protected String termsStadtTeil;

    /**
     * Gets the value of the termsRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public String getTermsRegion() {
        return termsRegion;
    }

    /**
     * Sets the value of the termsRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setTermsRegion(String value) {
        this.termsRegion = value;
    }

    /**
     * Gets the value of the termsStadt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public String getTermsStadt() {
        return termsStadt;
    }

    /**
     * Sets the value of the termsStadt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setTermsStadt(String value) {
        this.termsStadt = value;
    }

    /**
     * Gets the value of the termsStadtTeil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public String getTermsStadtTeil() {
        return termsStadtTeil;
    }

    /**
     * Sets the value of the termsStadtTeil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public void setTermsStadtTeil(String value) {
        this.termsStadtTeil = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theTermsRegion;
            theTermsRegion = this.getTermsRegion();
            strategy.appendField(locator, this, "termsRegion", buffer, theTermsRegion, (this.termsRegion!= null));
        }
        {
            String theTermsStadt;
            theTermsStadt = this.getTermsStadt();
            strategy.appendField(locator, this, "termsStadt", buffer, theTermsStadt, (this.termsStadt!= null));
        }
        {
            String theTermsStadtTeil;
            theTermsStadtTeil = this.getTermsStadtTeil();
            strategy.appendField(locator, this, "termsStadtTeil", buffer, theTermsStadtTeil, (this.termsStadtTeil!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ManuellGeoCodingTyp) {
            final ManuellGeoCodingTyp copy = ((ManuellGeoCodingTyp) draftCopy);
            {
                Boolean termsRegionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.termsRegion!= null));
                if (termsRegionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTermsRegion;
                    sourceTermsRegion = this.getTermsRegion();
                    String copyTermsRegion = ((String) strategy.copy(LocatorUtils.property(locator, "termsRegion", sourceTermsRegion), sourceTermsRegion, (this.termsRegion!= null)));
                    copy.setTermsRegion(copyTermsRegion);
                } else {
                    if (termsRegionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.termsRegion = null;
                    }
                }
            }
            {
                Boolean termsStadtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.termsStadt!= null));
                if (termsStadtShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTermsStadt;
                    sourceTermsStadt = this.getTermsStadt();
                    String copyTermsStadt = ((String) strategy.copy(LocatorUtils.property(locator, "termsStadt", sourceTermsStadt), sourceTermsStadt, (this.termsStadt!= null)));
                    copy.setTermsStadt(copyTermsStadt);
                } else {
                    if (termsStadtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.termsStadt = null;
                    }
                }
            }
            {
                Boolean termsStadtTeilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.termsStadtTeil!= null));
                if (termsStadtTeilShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTermsStadtTeil;
                    sourceTermsStadtTeil = this.getTermsStadtTeil();
                    String copyTermsStadtTeil = ((String) strategy.copy(LocatorUtils.property(locator, "termsStadtTeil", sourceTermsStadtTeil), sourceTermsStadtTeil, (this.termsStadtTeil!= null)));
                    copy.setTermsStadtTeil(copyTermsStadtTeil);
                } else {
                    if (termsStadtTeilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.termsStadtTeil = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new ManuellGeoCodingTyp();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ManuellGeoCodingTyp that = ((ManuellGeoCodingTyp) object);
        {
            String lhsTermsRegion;
            lhsTermsRegion = this.getTermsRegion();
            String rhsTermsRegion;
            rhsTermsRegion = that.getTermsRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "termsRegion", lhsTermsRegion), LocatorUtils.property(thatLocator, "termsRegion", rhsTermsRegion), lhsTermsRegion, rhsTermsRegion, (this.termsRegion!= null), (that.termsRegion!= null))) {
                return false;
            }
        }
        {
            String lhsTermsStadt;
            lhsTermsStadt = this.getTermsStadt();
            String rhsTermsStadt;
            rhsTermsStadt = that.getTermsStadt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "termsStadt", lhsTermsStadt), LocatorUtils.property(thatLocator, "termsStadt", rhsTermsStadt), lhsTermsStadt, rhsTermsStadt, (this.termsStadt!= null), (that.termsStadt!= null))) {
                return false;
            }
        }
        {
            String lhsTermsStadtTeil;
            lhsTermsStadtTeil = this.getTermsStadtTeil();
            String rhsTermsStadtTeil;
            rhsTermsStadtTeil = that.getTermsStadtTeil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "termsStadtTeil", lhsTermsStadtTeil), LocatorUtils.property(thatLocator, "termsStadtTeil", rhsTermsStadtTeil), lhsTermsStadtTeil, rhsTermsStadtTeil, (this.termsStadtTeil!= null), (that.termsStadtTeil!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:26+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
