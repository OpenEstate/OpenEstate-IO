
package org.openestate.io.immobar_it.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * The <code>&lt;realestate&gt;</code> root element.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="company" type="{}CompanyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "company"
})
@XmlRootElement(name = "realestate")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
public class Realestate implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    protected List<CompanyType> company;

    /**
     * Gets the value of the company property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the company property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public List<CompanyType> getCompany() {
        if (company == null) {
            company = new ArrayList<CompanyType>();
        }
        return this.company;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<CompanyType> theCompany;
            theCompany = (((this.company!= null)&&(!this.company.isEmpty()))?this.getCompany():null);
            strategy.appendField(locator, this, "company", buffer, theCompany, ((this.company!= null)&&(!this.company.isEmpty())));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Realestate) {
            final Realestate copy = ((Realestate) draftCopy);
            {
                Boolean companyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.company!= null)&&(!this.company.isEmpty())));
                if (companyShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CompanyType> sourceCompany;
                    sourceCompany = (((this.company!= null)&&(!this.company.isEmpty()))?this.getCompany():null);
                    @SuppressWarnings("unchecked")
                    List<CompanyType> copyCompany = ((List<CompanyType> ) strategy.copy(LocatorUtils.property(locator, "company", sourceCompany), sourceCompany, ((this.company!= null)&&(!this.company.isEmpty()))));
                    copy.company = null;
                    if (copyCompany!= null) {
                        List<CompanyType> uniqueCompanyl = copy.getCompany();
                        uniqueCompanyl.addAll(copyCompany);
                    }
                } else {
                    if (companyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.company = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new Realestate();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Realestate that = ((Realestate) object);
        {
            List<CompanyType> lhsCompany;
            lhsCompany = (((this.company!= null)&&(!this.company.isEmpty()))?this.getCompany():null);
            List<CompanyType> rhsCompany;
            rhsCompany = (((that.company!= null)&&(!that.company.isEmpty()))?that.getCompany():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "company", lhsCompany), LocatorUtils.property(thatLocator, "company", rhsCompany), lhsCompany, rhsCompany, ((this.company!= null)&&(!this.company.isEmpty())), ((that.company!= null)&&(!that.company.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-06-04T06:32:40+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
