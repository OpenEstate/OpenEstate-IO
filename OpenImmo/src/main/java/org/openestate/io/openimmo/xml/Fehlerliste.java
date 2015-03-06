
package org.openestate.io.openimmo.xml;

import java.util.ArrayList;
import java.util.List;
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fehler" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="objekt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fehlernr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fehler"
})
@XmlRootElement(name = "fehlerliste")
public class Fehlerliste
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<Fehlerliste.Fehler> fehler;

    /**
     * Gets the value of the fehler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fehler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFehler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fehlerliste.Fehler }
     * 
     * 
     */
    public List<Fehlerliste.Fehler> getFehler() {
        if (fehler == null) {
            fehler = new ArrayList<Fehlerliste.Fehler>();
        }
        return this.fehler;
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
            List<Fehlerliste.Fehler> theFehler;
            theFehler = (((this.fehler!= null)&&(!this.fehler.isEmpty()))?this.getFehler():null);
            strategy.appendField(locator, this, "fehler", buffer, theFehler);
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
        if (draftCopy instanceof Fehlerliste) {
            final Fehlerliste copy = ((Fehlerliste) draftCopy);
            if ((this.fehler!= null)&&(!this.fehler.isEmpty())) {
                List<Fehlerliste.Fehler> sourceFehler;
                sourceFehler = (((this.fehler!= null)&&(!this.fehler.isEmpty()))?this.getFehler():null);
                @SuppressWarnings("unchecked")
                List<Fehlerliste.Fehler> copyFehler = ((List<Fehlerliste.Fehler> ) strategy.copy(LocatorUtils.property(locator, "fehler", sourceFehler), sourceFehler));
                copy.fehler = null;
                if (copyFehler!= null) {
                    List<Fehlerliste.Fehler> uniqueFehlerl = copy.getFehler();
                    uniqueFehlerl.addAll(copyFehler);
                }
            } else {
                copy.fehler = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Fehlerliste();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Fehlerliste)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Fehlerliste that = ((Fehlerliste) object);
        {
            List<Fehlerliste.Fehler> lhsFehler;
            lhsFehler = (((this.fehler!= null)&&(!this.fehler.isEmpty()))?this.getFehler():null);
            List<Fehlerliste.Fehler> rhsFehler;
            rhsFehler = (((that.fehler!= null)&&(!that.fehler.isEmpty()))?that.getFehler():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fehler", lhsFehler), LocatorUtils.property(thatLocator, "fehler", rhsFehler), lhsFehler, rhsFehler)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="objekt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fehlernr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "objektId",
        "fehlernr",
        "text"
    })
    public static class Fehler
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "objekt_id")
        protected String objektId;
        protected Integer fehlernr;
        protected String text;

        /**
         * Gets the value of the objektId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjektId() {
            return objektId;
        }

        /**
         * Sets the value of the objektId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjektId(String value) {
            this.objektId = value;
        }

        /**
         * Gets the value of the fehlernr property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFehlernr() {
            return fehlernr;
        }

        /**
         * Sets the value of the fehlernr property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFehlernr(Integer value) {
            this.fehlernr = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
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
                String theObjektId;
                theObjektId = this.getObjektId();
                strategy.appendField(locator, this, "objektId", buffer, theObjektId);
            }
            {
                Integer theFehlernr;
                theFehlernr = this.getFehlernr();
                strategy.appendField(locator, this, "fehlernr", buffer, theFehlernr);
            }
            {
                String theText;
                theText = this.getText();
                strategy.appendField(locator, this, "text", buffer, theText);
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
            if (draftCopy instanceof Fehlerliste.Fehler) {
                final Fehlerliste.Fehler copy = ((Fehlerliste.Fehler) draftCopy);
                if (this.objektId!= null) {
                    String sourceObjektId;
                    sourceObjektId = this.getObjektId();
                    String copyObjektId = ((String) strategy.copy(LocatorUtils.property(locator, "objektId", sourceObjektId), sourceObjektId));
                    copy.setObjektId(copyObjektId);
                } else {
                    copy.objektId = null;
                }
                if (this.fehlernr!= null) {
                    Integer sourceFehlernr;
                    sourceFehlernr = this.getFehlernr();
                    Integer copyFehlernr = ((Integer) strategy.copy(LocatorUtils.property(locator, "fehlernr", sourceFehlernr), sourceFehlernr));
                    copy.setFehlernr(copyFehlernr);
                } else {
                    copy.fehlernr = null;
                }
                if (this.text!= null) {
                    String sourceText;
                    sourceText = this.getText();
                    String copyText = ((String) strategy.copy(LocatorUtils.property(locator, "text", sourceText), sourceText));
                    copy.setText(copyText);
                } else {
                    copy.text = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new Fehlerliste.Fehler();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof Fehlerliste.Fehler)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Fehlerliste.Fehler that = ((Fehlerliste.Fehler) object);
            {
                String lhsObjektId;
                lhsObjektId = this.getObjektId();
                String rhsObjektId;
                rhsObjektId = that.getObjektId();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "objektId", lhsObjektId), LocatorUtils.property(thatLocator, "objektId", rhsObjektId), lhsObjektId, rhsObjektId)) {
                    return false;
                }
            }
            {
                Integer lhsFehlernr;
                lhsFehlernr = this.getFehlernr();
                Integer rhsFehlernr;
                rhsFehlernr = that.getFehlernr();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "fehlernr", lhsFehlernr), LocatorUtils.property(thatLocator, "fehlernr", rhsFehlernr), lhsFehlernr, rhsFehlernr)) {
                    return false;
                }
            }
            {
                String lhsText;
                lhsText = this.getText();
                String rhsText;
                rhsText = that.getText();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText)) {
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

}
