
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
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
    implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
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
        super.appendFields(locator, buffer, strategy);
        {
            String theInternationaleRegion;
            theInternationaleRegion = this.getInternationaleRegion();
            strategy.appendField(locator, this, "internationaleRegion", buffer, theInternationaleRegion, (this.internationaleRegion!= null));
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof ImmobilienAdresseBaseTyp) {
            final ImmobilienAdresseBaseTyp copy = ((ImmobilienAdresseBaseTyp) draftCopy);
            {
                Boolean internationaleRegionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.internationaleRegion!= null));
                if (internationaleRegionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceInternationaleRegion;
                    sourceInternationaleRegion = this.getInternationaleRegion();
                    String copyInternationaleRegion = ((String) strategy.copy(LocatorUtils.property(locator, "internationaleRegion", sourceInternationaleRegion), sourceInternationaleRegion, (this.internationaleRegion!= null)));
                    copy.setInternationaleRegion(copyInternationaleRegion);
                } else {
                    if (internationaleRegionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.internationaleRegion = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ImmobilienAdresseBaseTyp();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "internationaleRegion", lhsInternationaleRegion), LocatorUtils.property(thatLocator, "internationaleRegion", rhsInternationaleRegion), lhsInternationaleRegion, rhsInternationaleRegion, (this.internationaleRegion!= null), (that.internationaleRegion!= null))) {
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
