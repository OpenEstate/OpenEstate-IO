
package org.openestate.io.filemaker.xml.result;

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
 *         &lt;element name="PRODUCT" type="{http://www.filemaker.com/fmpxmlresult}ProductType"/&gt;
 *         &lt;element name="DATABASE" type="{http://www.filemaker.com/fmpxmlresult}DatabaseType"/&gt;
 *         &lt;element name="METADATA" type="{http://www.filemaker.com/fmpxmlresult}MetaDataType"/&gt;
 *         &lt;element name="RESULTSET" type="{http://www.filemaker.com/fmpxmlresult}ResultSetType"/&gt;
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
    "database",
    "metadata",
    "resultset"
})
@XmlRootElement(name = "FMPXMLRESULT")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
public class FMPXMLRESULT implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "ERRORCODE", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    protected String errorcode;
    @XmlElement(name = "PRODUCT", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    protected ProductType product;
    @XmlElement(name = "DATABASE", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    protected DatabaseType database;
    @XmlElement(name = "METADATA", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    protected MetaDataType metadata;
    @XmlElement(name = "RESULTSET", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    protected ResultSetType resultset;

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
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public DatabaseType getDATABASE() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public void setDATABASE(DatabaseType value) {
        this.database = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public MetaDataType getMETADATA() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public void setMETADATA(MetaDataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the resultset property.
     * 
     * @return
     *     possible object is
     *     {@link ResultSetType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public ResultSetType getRESULTSET() {
        return resultset;
    }

    /**
     * Sets the value of the resultset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSetType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public void setRESULTSET(ResultSetType value) {
        this.resultset = value;
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
            DatabaseType theDATABASE;
            theDATABASE = this.getDATABASE();
            strategy.appendField(locator, this, "database", buffer, theDATABASE, (this.database!= null));
        }
        {
            MetaDataType theMETADATA;
            theMETADATA = this.getMETADATA();
            strategy.appendField(locator, this, "metadata", buffer, theMETADATA, (this.metadata!= null));
        }
        {
            ResultSetType theRESULTSET;
            theRESULTSET = this.getRESULTSET();
            strategy.appendField(locator, this, "resultset", buffer, theRESULTSET, (this.resultset!= null));
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
        if (draftCopy instanceof FMPXMLRESULT) {
            final FMPXMLRESULT copy = ((FMPXMLRESULT) draftCopy);
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
                Boolean databaseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.database!= null));
                if (databaseShouldBeCopiedAndSet == Boolean.TRUE) {
                    DatabaseType sourceDATABASE;
                    sourceDATABASE = this.getDATABASE();
                    DatabaseType copyDATABASE = ((DatabaseType) strategy.copy(LocatorUtils.property(locator, "database", sourceDATABASE), sourceDATABASE, (this.database!= null)));
                    copy.setDATABASE(copyDATABASE);
                } else {
                    if (databaseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.database = null;
                    }
                }
            }
            {
                Boolean metadataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.metadata!= null));
                if (metadataShouldBeCopiedAndSet == Boolean.TRUE) {
                    MetaDataType sourceMETADATA;
                    sourceMETADATA = this.getMETADATA();
                    MetaDataType copyMETADATA = ((MetaDataType) strategy.copy(LocatorUtils.property(locator, "metadata", sourceMETADATA), sourceMETADATA, (this.metadata!= null)));
                    copy.setMETADATA(copyMETADATA);
                } else {
                    if (metadataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.metadata = null;
                    }
                }
            }
            {
                Boolean resultsetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.resultset!= null));
                if (resultsetShouldBeCopiedAndSet == Boolean.TRUE) {
                    ResultSetType sourceRESULTSET;
                    sourceRESULTSET = this.getRESULTSET();
                    ResultSetType copyRESULTSET = ((ResultSetType) strategy.copy(LocatorUtils.property(locator, "resultset", sourceRESULTSET), sourceRESULTSET, (this.resultset!= null)));
                    copy.setRESULTSET(copyRESULTSET);
                } else {
                    if (resultsetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.resultset = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new FMPXMLRESULT();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:42:33+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FMPXMLRESULT that = ((FMPXMLRESULT) object);
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
            DatabaseType lhsDATABASE;
            lhsDATABASE = this.getDATABASE();
            DatabaseType rhsDATABASE;
            rhsDATABASE = that.getDATABASE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "database", lhsDATABASE), LocatorUtils.property(thatLocator, "database", rhsDATABASE), lhsDATABASE, rhsDATABASE, (this.database!= null), (that.database!= null))) {
                return false;
            }
        }
        {
            MetaDataType lhsMETADATA;
            lhsMETADATA = this.getMETADATA();
            MetaDataType rhsMETADATA;
            rhsMETADATA = that.getMETADATA();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metadata", lhsMETADATA), LocatorUtils.property(thatLocator, "metadata", rhsMETADATA), lhsMETADATA, rhsMETADATA, (this.metadata!= null), (that.metadata!= null))) {
                return false;
            }
        }
        {
            ResultSetType lhsRESULTSET;
            lhsRESULTSET = this.getRESULTSET();
            ResultSetType rhsRESULTSET;
            rhsRESULTSET = that.getRESULTSET();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultset", lhsRESULTSET), LocatorUtils.property(thatLocator, "resultset", rhsRESULTSET), lhsRESULTSET, rhsRESULTSET, (this.resultset!= null), (that.resultset!= null))) {
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
