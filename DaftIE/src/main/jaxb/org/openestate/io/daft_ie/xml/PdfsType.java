
package org.openestate.io.daft_ie.xml;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for pdfsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdfsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pdf" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pdfsType", propOrder = {
    "pdf"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
public class PdfsType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    protected List<URI> pdf;

    /**
     * Gets the value of the pdf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public List<URI> getPdf() {
        if (pdf == null) {
            pdf = new ArrayList<URI>();
        }
        return this.pdf;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<URI> thePdf;
            thePdf = (((this.pdf!= null)&&(!this.pdf.isEmpty()))?this.getPdf():null);
            strategy.appendField(locator, this, "pdf", buffer, thePdf, ((this.pdf!= null)&&(!this.pdf.isEmpty())));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof PdfsType) {
            final PdfsType copy = ((PdfsType) draftCopy);
            {
                Boolean pdfShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.pdf!= null)&&(!this.pdf.isEmpty())));
                if (pdfShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<URI> sourcePdf;
                    sourcePdf = (((this.pdf!= null)&&(!this.pdf.isEmpty()))?this.getPdf():null);
                    @SuppressWarnings("unchecked")
                    List<URI> copyPdf = ((List<URI> ) strategy.copy(LocatorUtils.property(locator, "pdf", sourcePdf), sourcePdf, ((this.pdf!= null)&&(!this.pdf.isEmpty()))));
                    copy.pdf = null;
                    if (copyPdf!= null) {
                        List<URI> uniquePdfl = copy.getPdf();
                        uniquePdfl.addAll(copyPdf);
                    }
                } else {
                    if (pdfShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pdf = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new PdfsType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PdfsType that = ((PdfsType) object);
        {
            List<URI> lhsPdf;
            lhsPdf = (((this.pdf!= null)&&(!this.pdf.isEmpty()))?this.getPdf():null);
            List<URI> rhsPdf;
            rhsPdf = (((that.pdf!= null)&&(!that.pdf.isEmpty()))?that.getPdf():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pdf", lhsPdf), LocatorUtils.property(thatLocator, "pdf", rhsPdf), lhsPdf, rhsPdf, ((this.pdf!= null)&&(!this.pdf.isEmpty())), ((that.pdf!= null)&&(!that.pdf.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
