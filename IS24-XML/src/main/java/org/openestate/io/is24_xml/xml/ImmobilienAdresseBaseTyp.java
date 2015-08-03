
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for ImmobilienAdresseBaseTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImmobilienAdresseBaseTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}AdresseBaseTyp"&gt;
 *       &lt;attribute name="InternationaleRegion" type="{http://www.immobilienscout24.de/immobilientransfer}Text100Typ" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmobilienAdresseBaseTyp")
@XmlSeeAlso({
    ImmobilienAdresseTyp.class
})
public class ImmobilienAdresseBaseTyp
    extends AdresseBaseTyp
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "InternationaleRegion")
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected String internationaleRegion;

    /**
     * Gets the value of the internationaleRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationaleRegion() {
        return internationaleRegion;
    }

    /**
     * Sets the value of the internationaleRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationaleRegion(String value) {
        this.internationaleRegion = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            String theInternationaleRegion;
            theInternationaleRegion = this.getInternationaleRegion();
            strategy.appendField(locator, this, "internationaleRegion", buffer, theInternationaleRegion);
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof ImmobilienAdresseBaseTyp) {
            final ImmobilienAdresseBaseTyp copy = ((ImmobilienAdresseBaseTyp) draftCopy);
            if (this.internationaleRegion!= null) {
                String sourceInternationaleRegion;
                sourceInternationaleRegion = this.getInternationaleRegion();
                String copyInternationaleRegion = ((String) strategy.copy(LocatorUtils.property(locator, "internationaleRegion", sourceInternationaleRegion), sourceInternationaleRegion));
                copy.setInternationaleRegion(copyInternationaleRegion);
            } else {
                copy.internationaleRegion = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ImmobilienAdresseBaseTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ImmobilienAdresseBaseTyp)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ImmobilienAdresseBaseTyp that = ((ImmobilienAdresseBaseTyp) object);
        {
            String lhsInternationaleRegion;
            lhsInternationaleRegion = this.getInternationaleRegion();
            String rhsInternationaleRegion;
            rhsInternationaleRegion = that.getInternationaleRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "internationaleRegion", lhsInternationaleRegion), LocatorUtils.property(thatLocator, "internationaleRegion", rhsInternationaleRegion), lhsInternationaleRegion, rhsInternationaleRegion)) {
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
