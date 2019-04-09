
package org.openestate.io.filemaker.xml.layout;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
public class FMPXMLLAYOUT implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "ERRORCODE", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    protected String errorcode;
    @XmlElement(name = "PRODUCT", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    protected ProductType product;
    @XmlElement(name = "LAYOUT", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    protected LayoutType layout;
    @XmlElement(name = "VALUELISTS", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    protected ValueListsType valuelists;

    /**
     * Gets the value of the errorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public void setVALUELISTS(ValueListsType value) {
        this.valuelists = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theERRORCODE;
            theERRORCODE = this.getERRORCODE();
            strategy.appendField(locator, this, "errorcode", buffer, theERRORCODE, (this.errorcode!= null));
        }
        {
            ProductType thePRODUCT;
            thePRODUCT = this.getPRODUCT();
            strategy.appendField(locator, this, "product", buffer, thePRODUCT, (this.product!= null));
        }
        {
            LayoutType theLAYOUT;
            theLAYOUT = this.getLAYOUT();
            strategy.appendField(locator, this, "layout", buffer, theLAYOUT, (this.layout!= null));
        }
        {
            ValueListsType theVALUELISTS;
            theVALUELISTS = this.getVALUELISTS();
            strategy.appendField(locator, this, "valuelists", buffer, theVALUELISTS, (this.valuelists!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof FMPXMLLAYOUT) {
            final FMPXMLLAYOUT copy = ((FMPXMLLAYOUT) draftCopy);
            {
                Boolean errorcodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.errorcode!= null));
                if (errorcodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceERRORCODE;
                    sourceERRORCODE = this.getERRORCODE();
                    String copyERRORCODE = ((String) strategy.copy(LocatorUtils.property(locator, "errorcode", sourceERRORCODE), sourceERRORCODE, (this.errorcode!= null)));
                    copy.setERRORCODE(copyERRORCODE);
                } else {
                    if (errorcodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.errorcode = null;
                    }
                }
            }
            {
                Boolean productShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.product!= null));
                if (productShouldBeCopiedAndSet == Boolean.TRUE) {
                    ProductType sourcePRODUCT;
                    sourcePRODUCT = this.getPRODUCT();
                    ProductType copyPRODUCT = ((ProductType) strategy.copy(LocatorUtils.property(locator, "product", sourcePRODUCT), sourcePRODUCT, (this.product!= null)));
                    copy.setPRODUCT(copyPRODUCT);
                } else {
                    if (productShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.product = null;
                    }
                }
            }
            {
                Boolean layoutShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.layout!= null));
                if (layoutShouldBeCopiedAndSet == Boolean.TRUE) {
                    LayoutType sourceLAYOUT;
                    sourceLAYOUT = this.getLAYOUT();
                    LayoutType copyLAYOUT = ((LayoutType) strategy.copy(LocatorUtils.property(locator, "layout", sourceLAYOUT), sourceLAYOUT, (this.layout!= null)));
                    copy.setLAYOUT(copyLAYOUT);
                } else {
                    if (layoutShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.layout = null;
                    }
                }
            }
            {
                Boolean valuelistsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valuelists!= null));
                if (valuelistsShouldBeCopiedAndSet == Boolean.TRUE) {
                    ValueListsType sourceVALUELISTS;
                    sourceVALUELISTS = this.getVALUELISTS();
                    ValueListsType copyVALUELISTS = ((ValueListsType) strategy.copy(LocatorUtils.property(locator, "valuelists", sourceVALUELISTS), sourceVALUELISTS, (this.valuelists!= null)));
                    copy.setVALUELISTS(copyVALUELISTS);
                } else {
                    if (valuelistsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.valuelists = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new FMPXMLLAYOUT();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorcode", lhsERRORCODE), LocatorUtils.property(thatLocator, "errorcode", rhsERRORCODE), lhsERRORCODE, rhsERRORCODE, (this.errorcode!= null), (that.errorcode!= null))) {
                return false;
            }
        }
        {
            ProductType lhsPRODUCT;
            lhsPRODUCT = this.getPRODUCT();
            ProductType rhsPRODUCT;
            rhsPRODUCT = that.getPRODUCT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "product", lhsPRODUCT), LocatorUtils.property(thatLocator, "product", rhsPRODUCT), lhsPRODUCT, rhsPRODUCT, (this.product!= null), (that.product!= null))) {
                return false;
            }
        }
        {
            LayoutType lhsLAYOUT;
            lhsLAYOUT = this.getLAYOUT();
            LayoutType rhsLAYOUT;
            rhsLAYOUT = that.getLAYOUT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layout", lhsLAYOUT), LocatorUtils.property(thatLocator, "layout", rhsLAYOUT), lhsLAYOUT, rhsLAYOUT, (this.layout!= null), (that.layout!= null))) {
                return false;
            }
        }
        {
            ValueListsType lhsVALUELISTS;
            lhsVALUELISTS = this.getVALUELISTS();
            ValueListsType rhsVALUELISTS;
            rhsVALUELISTS = that.getVALUELISTS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valuelists", lhsVALUELISTS), LocatorUtils.property(thatLocator, "valuelists", rhsVALUELISTS), lhsVALUELISTS, rhsVALUELISTS, (this.valuelists!= null), (that.valuelists!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
