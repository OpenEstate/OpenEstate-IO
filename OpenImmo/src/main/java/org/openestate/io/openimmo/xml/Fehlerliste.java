
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * Java class for &lt;fehlerliste&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fehler"
})
@XmlRootElement(name = "fehlerliste")
public class Fehlerliste implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
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
        {
            List<Fehlerliste.Fehler> theFehler;
            theFehler = (((this.fehler!= null)&&(!this.fehler.isEmpty()))?this.getFehler():null);
            strategy.appendField(locator, this, "fehler", buffer, theFehler, ((this.fehler!= null)&&(!this.fehler.isEmpty())));
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
        if (draftCopy instanceof Fehlerliste) {
            final Fehlerliste copy = ((Fehlerliste) draftCopy);
            {
                Boolean fehlerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.fehler!= null)&&(!this.fehler.isEmpty())));
                if (fehlerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Fehlerliste.Fehler> sourceFehler;
                    sourceFehler = (((this.fehler!= null)&&(!this.fehler.isEmpty()))?this.getFehler():null);
                    @SuppressWarnings("unchecked")
                    List<Fehlerliste.Fehler> copyFehler = ((List<Fehlerliste.Fehler> ) strategy.copy(LocatorUtils.property(locator, "fehler", sourceFehler), sourceFehler, ((this.fehler!= null)&&(!this.fehler.isEmpty()))));
                    copy.fehler = null;
                    if (copyFehler!= null) {
                        List<Fehlerliste.Fehler> uniqueFehlerl = copy.getFehler();
                        uniqueFehlerl.addAll(copyFehler);
                    }
                } else {
                    if (fehlerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fehler = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Fehlerliste();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fehler", lhsFehler), LocatorUtils.property(thatLocator, "fehler", rhsFehler), lhsFehler, rhsFehler, ((this.fehler!= null)&&(!this.fehler.isEmpty())), ((that.fehler!= null)&&(!that.fehler.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


    /**
     * Java class for &lt;fehler&gt; in &lt;fehlerliste&gt elements.
     * 
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "objektId",
        "fehlernr",
        "text"
    })
    public static class Fehler implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(name = "objekt_id")
        protected String objektId;
        @XmlElement(type = String.class)
        @XmlJavaTypeAdapter(Adapter5 .class)
        @XmlSchemaType(name = "int")
        protected BigInteger fehlernr;
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
         *     {@link String }
         *     
         */
        public BigInteger getFehlernr() {
            return fehlernr;
        }

        /**
         * Sets the value of the fehlernr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFehlernr(BigInteger value) {
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
            {
                String theObjektId;
                theObjektId = this.getObjektId();
                strategy.appendField(locator, this, "objektId", buffer, theObjektId, (this.objektId!= null));
            }
            {
                BigInteger theFehlernr;
                theFehlernr = this.getFehlernr();
                strategy.appendField(locator, this, "fehlernr", buffer, theFehlernr, (this.fehlernr!= null));
            }
            {
                String theText;
                theText = this.getText();
                strategy.appendField(locator, this, "text", buffer, theText, (this.text!= null));
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
            if (draftCopy instanceof Fehlerliste.Fehler) {
                final Fehlerliste.Fehler copy = ((Fehlerliste.Fehler) draftCopy);
                {
                    Boolean objektIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektId!= null));
                    if (objektIdShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceObjektId;
                        sourceObjektId = this.getObjektId();
                        String copyObjektId = ((String) strategy.copy(LocatorUtils.property(locator, "objektId", sourceObjektId), sourceObjektId, (this.objektId!= null)));
                        copy.setObjektId(copyObjektId);
                    } else {
                        if (objektIdShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.objektId = null;
                        }
                    }
                }
                {
                    Boolean fehlernrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fehlernr!= null));
                    if (fehlernrShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceFehlernr;
                        sourceFehlernr = this.getFehlernr();
                        BigInteger copyFehlernr = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "fehlernr", sourceFehlernr), sourceFehlernr, (this.fehlernr!= null)));
                        copy.setFehlernr(copyFehlernr);
                    } else {
                        if (fehlernrShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.fehlernr = null;
                        }
                    }
                }
                {
                    Boolean textShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.text!= null));
                    if (textShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceText;
                        sourceText = this.getText();
                        String copyText = ((String) strategy.copy(LocatorUtils.property(locator, "text", sourceText), sourceText, (this.text!= null)));
                        copy.setText(copyText);
                    } else {
                        if (textShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.text = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new Fehlerliste.Fehler();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
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
                if (!strategy.equals(LocatorUtils.property(thisLocator, "objektId", lhsObjektId), LocatorUtils.property(thatLocator, "objektId", rhsObjektId), lhsObjektId, rhsObjektId, (this.objektId!= null), (that.objektId!= null))) {
                    return false;
                }
            }
            {
                BigInteger lhsFehlernr;
                lhsFehlernr = this.getFehlernr();
                BigInteger rhsFehlernr;
                rhsFehlernr = that.getFehlernr();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "fehlernr", lhsFehlernr), LocatorUtils.property(thatLocator, "fehlernr", rhsFehlernr), lhsFehlernr, rhsFehlernr, (this.fehlernr!= null), (that.fehlernr!= null))) {
                    return false;
                }
            }
            {
                String lhsText;
                lhsText = this.getText();
                String rhsText;
                rhsText = that.getText();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText, (this.text!= null), (that.text!= null))) {
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

}
