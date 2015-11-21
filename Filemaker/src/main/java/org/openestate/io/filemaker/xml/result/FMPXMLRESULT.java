
package org.openestate.io.filemaker.xml.result;

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
public class FMPXMLRESULT
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "ERRORCODE", required = true)
    protected String errorcode;
    @XmlElement(name = "PRODUCT", required = true)
    protected ProductType product;
    @XmlElement(name = "DATABASE", required = true)
    protected DatabaseType database;
    @XmlElement(name = "METADATA", required = true)
    protected MetaDataType metadata;
    @XmlElement(name = "RESULTSET", required = true)
    protected ResultSetType resultset;

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
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseType }
     *     
     */
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
    public void setRESULTSET(ResultSetType value) {
        this.resultset = value;
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
            DatabaseType theDATABASE;
            theDATABASE = this.getDATABASE();
            strategy.appendField(locator, this, "database", buffer, theDATABASE);
        }
        {
            MetaDataType theMETADATA;
            theMETADATA = this.getMETADATA();
            strategy.appendField(locator, this, "metadata", buffer, theMETADATA);
        }
        {
            ResultSetType theRESULTSET;
            theRESULTSET = this.getRESULTSET();
            strategy.appendField(locator, this, "resultset", buffer, theRESULTSET);
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
        if (draftCopy instanceof FMPXMLRESULT) {
            final FMPXMLRESULT copy = ((FMPXMLRESULT) draftCopy);
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
            if (this.database!= null) {
                DatabaseType sourceDATABASE;
                sourceDATABASE = this.getDATABASE();
                DatabaseType copyDATABASE = ((DatabaseType) strategy.copy(LocatorUtils.property(locator, "database", sourceDATABASE), sourceDATABASE));
                copy.setDATABASE(copyDATABASE);
            } else {
                copy.database = null;
            }
            if (this.metadata!= null) {
                MetaDataType sourceMETADATA;
                sourceMETADATA = this.getMETADATA();
                MetaDataType copyMETADATA = ((MetaDataType) strategy.copy(LocatorUtils.property(locator, "metadata", sourceMETADATA), sourceMETADATA));
                copy.setMETADATA(copyMETADATA);
            } else {
                copy.metadata = null;
            }
            if (this.resultset!= null) {
                ResultSetType sourceRESULTSET;
                sourceRESULTSET = this.getRESULTSET();
                ResultSetType copyRESULTSET = ((ResultSetType) strategy.copy(LocatorUtils.property(locator, "resultset", sourceRESULTSET), sourceRESULTSET));
                copy.setRESULTSET(copyRESULTSET);
            } else {
                copy.resultset = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FMPXMLRESULT();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FMPXMLRESULT)) {
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
            DatabaseType lhsDATABASE;
            lhsDATABASE = this.getDATABASE();
            DatabaseType rhsDATABASE;
            rhsDATABASE = that.getDATABASE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "database", lhsDATABASE), LocatorUtils.property(thatLocator, "database", rhsDATABASE), lhsDATABASE, rhsDATABASE)) {
                return false;
            }
        }
        {
            MetaDataType lhsMETADATA;
            lhsMETADATA = this.getMETADATA();
            MetaDataType rhsMETADATA;
            rhsMETADATA = that.getMETADATA();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metadata", lhsMETADATA), LocatorUtils.property(thatLocator, "metadata", rhsMETADATA), lhsMETADATA, rhsMETADATA)) {
                return false;
            }
        }
        {
            ResultSetType lhsRESULTSET;
            lhsRESULTSET = this.getRESULTSET();
            ResultSetType rhsRESULTSET;
            rhsRESULTSET = that.getRESULTSET();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultset", lhsRESULTSET), LocatorUtils.property(thatLocator, "resultset", rhsRESULTSET), lhsRESULTSET, rhsRESULTSET)) {
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
