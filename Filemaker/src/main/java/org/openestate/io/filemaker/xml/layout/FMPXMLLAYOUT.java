
package org.openestate.io.filemaker.xml.layout;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ERRORCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRODUCT" type="{http://www.filemaker.com/fmpxmllayout}ProductType"/&gt;
 *         &lt;element name="LAYOUT" type="{http://www.filemaker.com/fmpxmllayout}LayoutType"/&gt;
 *         &lt;element name="VALUELISTS" type="{http://www.filemaker.com/fmpxmllayout}ValueListsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorcode",
    "product",
    "layout",
    "valuelists"
})
@XmlRootElement(name = "FMPXMLLAYOUT")
public class FMPXMLLAYOUT
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "ERRORCODE", required = true)
    protected String errorcode;
    @XmlElement(name = "PRODUCT", required = true)
    protected ProductType product;
    @XmlElement(name = "LAYOUT", required = true)
    protected LayoutType layout;
    @XmlElement(name = "VALUELISTS", required = true)
    protected ValueListsType valuelists;

    /**
     * Gets the value of the errorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRORCODE() {
        return errorcode;
    }

    /**
     * Sets the value of the errorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRORCODE(String value) {
        this.errorcode = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getPRODUCT() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setPRODUCT(ProductType value) {
        this.product = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link LayoutType }
     *     
     */
    public LayoutType getLAYOUT() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayoutType }
     *     
     */
    public void setLAYOUT(LayoutType value) {
        this.layout = value;
    }

    /**
     * Gets the value of the valuelists property.
     * 
     * @return
     *     possible object is
     *     {@link ValueListsType }
     *     
     */
    public ValueListsType getVALUELISTS() {
        return valuelists;
    }

    /**
     * Sets the value of the valuelists property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueListsType }
     *     
     */
    public void setVALUELISTS(ValueListsType value) {
        this.valuelists = value;
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
            String theERRORCODE;
            theERRORCODE = this.getERRORCODE();
            strategy.appendField(locator, this, "errorcode", buffer, theERRORCODE);
        }
        {
            ProductType thePRODUCT;
            thePRODUCT = this.getPRODUCT();
            strategy.appendField(locator, this, "product", buffer, thePRODUCT);
        }
        {
            LayoutType theLAYOUT;
            theLAYOUT = this.getLAYOUT();
            strategy.appendField(locator, this, "layout", buffer, theLAYOUT);
        }
        {
            ValueListsType theVALUELISTS;
            theVALUELISTS = this.getVALUELISTS();
            strategy.appendField(locator, this, "valuelists", buffer, theVALUELISTS);
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
        if (draftCopy instanceof FMPXMLLAYOUT) {
            final FMPXMLLAYOUT copy = ((FMPXMLLAYOUT) draftCopy);
            if (this.errorcode!= null) {
                String sourceERRORCODE;
                sourceERRORCODE = this.getERRORCODE();
                String copyERRORCODE = ((String) strategy.copy(LocatorUtils.property(locator, "errorcode", sourceERRORCODE), sourceERRORCODE));
                copy.setERRORCODE(copyERRORCODE);
            } else {
                copy.errorcode = null;
            }
            if (this.product!= null) {
                ProductType sourcePRODUCT;
                sourcePRODUCT = this.getPRODUCT();
                ProductType copyPRODUCT = ((ProductType) strategy.copy(LocatorUtils.property(locator, "product", sourcePRODUCT), sourcePRODUCT));
                copy.setPRODUCT(copyPRODUCT);
            } else {
                copy.product = null;
            }
            if (this.layout!= null) {
                LayoutType sourceLAYOUT;
                sourceLAYOUT = this.getLAYOUT();
                LayoutType copyLAYOUT = ((LayoutType) strategy.copy(LocatorUtils.property(locator, "layout", sourceLAYOUT), sourceLAYOUT));
                copy.setLAYOUT(copyLAYOUT);
            } else {
                copy.layout = null;
            }
            if (this.valuelists!= null) {
                ValueListsType sourceVALUELISTS;
                sourceVALUELISTS = this.getVALUELISTS();
                ValueListsType copyVALUELISTS = ((ValueListsType) strategy.copy(LocatorUtils.property(locator, "valuelists", sourceVALUELISTS), sourceVALUELISTS));
                copy.setVALUELISTS(copyVALUELISTS);
            } else {
                copy.valuelists = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FMPXMLLAYOUT();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FMPXMLLAYOUT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FMPXMLLAYOUT that = ((FMPXMLLAYOUT) object);
        {
            String lhsERRORCODE;
            lhsERRORCODE = this.getERRORCODE();
            String rhsERRORCODE;
            rhsERRORCODE = that.getERRORCODE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorcode", lhsERRORCODE), LocatorUtils.property(thatLocator, "errorcode", rhsERRORCODE), lhsERRORCODE, rhsERRORCODE)) {
                return false;
            }
        }
        {
            ProductType lhsPRODUCT;
            lhsPRODUCT = this.getPRODUCT();
            ProductType rhsPRODUCT;
            rhsPRODUCT = that.getPRODUCT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "product", lhsPRODUCT), LocatorUtils.property(thatLocator, "product", rhsPRODUCT), lhsPRODUCT, rhsPRODUCT)) {
                return false;
            }
        }
        {
            LayoutType lhsLAYOUT;
            lhsLAYOUT = this.getLAYOUT();
            LayoutType rhsLAYOUT;
            rhsLAYOUT = that.getLAYOUT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layout", lhsLAYOUT), LocatorUtils.property(thatLocator, "layout", rhsLAYOUT), lhsLAYOUT, rhsLAYOUT)) {
                return false;
            }
        }
        {
            ValueListsType lhsVALUELISTS;
            lhsVALUELISTS = this.getVALUELISTS();
            ValueListsType rhsVALUELISTS;
            rhsVALUELISTS = that.getVALUELISTS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valuelists", lhsVALUELISTS), LocatorUtils.property(thatLocator, "valuelists", rhsVALUELISTS), lhsVALUELISTS, rhsVALUELISTS)) {
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
