
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for ManuellGeoCodingTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManuellGeoCodingTyp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="TermsRegion" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" />
 *       &lt;attribute name="TermsStadt" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" />
 *       &lt;attribute name="TermsStadtTeil" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManuellGeoCodingTyp")
public class ManuellGeoCodingTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "TermsRegion")
    @XmlJavaTypeAdapter(Adapter14 .class)
    protected String termsRegion;
    @XmlAttribute(name = "TermsStadt")
    @XmlJavaTypeAdapter(Adapter14 .class)
    protected String termsStadt;
    @XmlAttribute(name = "TermsStadtTeil")
    @XmlJavaTypeAdapter(Adapter14 .class)
    protected String termsStadtTeil;

    /**
     * Gets the value of the termsRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setTermsStadtTeil(String value) {
        this.termsStadtTeil = value;
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
            String theTermsRegion;
            theTermsRegion = this.getTermsRegion();
            strategy.appendField(locator, this, "termsRegion", buffer, theTermsRegion);
        }
        {
            String theTermsStadt;
            theTermsStadt = this.getTermsStadt();
            strategy.appendField(locator, this, "termsStadt", buffer, theTermsStadt);
        }
        {
            String theTermsStadtTeil;
            theTermsStadtTeil = this.getTermsStadtTeil();
            strategy.appendField(locator, this, "termsStadtTeil", buffer, theTermsStadtTeil);
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
        if (draftCopy instanceof ManuellGeoCodingTyp) {
            final ManuellGeoCodingTyp copy = ((ManuellGeoCodingTyp) draftCopy);
            if (this.termsRegion!= null) {
                String sourceTermsRegion;
                sourceTermsRegion = this.getTermsRegion();
                String copyTermsRegion = ((String) strategy.copy(LocatorUtils.property(locator, "termsRegion", sourceTermsRegion), sourceTermsRegion));
                copy.setTermsRegion(copyTermsRegion);
            } else {
                copy.termsRegion = null;
            }
            if (this.termsStadt!= null) {
                String sourceTermsStadt;
                sourceTermsStadt = this.getTermsStadt();
                String copyTermsStadt = ((String) strategy.copy(LocatorUtils.property(locator, "termsStadt", sourceTermsStadt), sourceTermsStadt));
                copy.setTermsStadt(copyTermsStadt);
            } else {
                copy.termsStadt = null;
            }
            if (this.termsStadtTeil!= null) {
                String sourceTermsStadtTeil;
                sourceTermsStadtTeil = this.getTermsStadtTeil();
                String copyTermsStadtTeil = ((String) strategy.copy(LocatorUtils.property(locator, "termsStadtTeil", sourceTermsStadtTeil), sourceTermsStadtTeil));
                copy.setTermsStadtTeil(copyTermsStadtTeil);
            } else {
                copy.termsStadtTeil = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ManuellGeoCodingTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ManuellGeoCodingTyp)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "termsRegion", lhsTermsRegion), LocatorUtils.property(thatLocator, "termsRegion", rhsTermsRegion), lhsTermsRegion, rhsTermsRegion)) {
                return false;
            }
        }
        {
            String lhsTermsStadt;
            lhsTermsStadt = this.getTermsStadt();
            String rhsTermsStadt;
            rhsTermsStadt = that.getTermsStadt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "termsStadt", lhsTermsStadt), LocatorUtils.property(thatLocator, "termsStadt", rhsTermsStadt), lhsTermsStadt, rhsTermsStadt)) {
                return false;
            }
        }
        {
            String lhsTermsStadtTeil;
            lhsTermsStadtTeil = this.getTermsStadtTeil();
            String rhsTermsStadtTeil;
            rhsTermsStadtTeil = that.getTermsStadtTeil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "termsStadtTeil", lhsTermsStadtTeil), LocatorUtils.property(thatLocator, "termsStadtTeil", rhsTermsStadtTeil), lhsTermsStadtTeil, rhsTermsStadtTeil)) {
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
