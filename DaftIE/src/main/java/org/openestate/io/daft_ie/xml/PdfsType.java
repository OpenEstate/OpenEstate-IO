
package org.openestate.io.daft_ie.xml;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for pdfsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdfsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdf" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pdfsType", propOrder = {
    "pdf"
})
public class PdfsType
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anyURI")
    protected List<URL> pdf;

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
    public List<URL> getPdf() {
        if (pdf == null) {
            pdf = new ArrayList<URL>();
        }
        return this.pdf;
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
            List<URL> thePdf;
            thePdf = (((this.pdf!= null)&&(!this.pdf.isEmpty()))?this.getPdf():null);
            strategy.appendField(locator, this, "pdf", buffer, thePdf);
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
        if (draftCopy instanceof PdfsType) {
            final PdfsType copy = ((PdfsType) draftCopy);
            if ((this.pdf!= null)&&(!this.pdf.isEmpty())) {
                List<URL> sourcePdf;
                sourcePdf = (((this.pdf!= null)&&(!this.pdf.isEmpty()))?this.getPdf():null);
                @SuppressWarnings("unchecked")
                List<URL> copyPdf = ((List<URL> ) strategy.copy(LocatorUtils.property(locator, "pdf", sourcePdf), sourcePdf));
                copy.pdf = null;
                if (copyPdf!= null) {
                    List<URL> uniquePdfl = copy.getPdf();
                    uniquePdfl.addAll(copyPdf);
                }
            } else {
                copy.pdf = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new PdfsType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PdfsType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PdfsType that = ((PdfsType) object);
        {
            List<URL> lhsPdf;
            lhsPdf = (((this.pdf!= null)&&(!this.pdf.isEmpty()))?this.getPdf():null);
            List<URL> rhsPdf;
            rhsPdf = (((that.pdf!= null)&&(!that.pdf.isEmpty()))?that.getPdf():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pdf", lhsPdf), LocatorUtils.property(thatLocator, "pdf", rhsPdf), lhsPdf, rhsPdf)) {
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
