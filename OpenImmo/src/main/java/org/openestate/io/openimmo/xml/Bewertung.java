
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
 * Java class for &lt;bewertung&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "feld"
})
@XmlRootElement(name = "bewertung")
public class Bewertung
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<Bewertung.Feld> feld;

    /**
     * Gets the value of the feld property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feld property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeld().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bewertung.Feld }
     * 
     * 
     */
    public List<Bewertung.Feld> getFeld() {
        if (feld == null) {
            feld = new ArrayList<Bewertung.Feld>();
        }
        return this.feld;
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
            List<Bewertung.Feld> theFeld;
            theFeld = (((this.feld!= null)&&(!this.feld.isEmpty()))?this.getFeld():null);
            strategy.appendField(locator, this, "feld", buffer, theFeld);
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
        if (draftCopy instanceof Bewertung) {
            final Bewertung copy = ((Bewertung) draftCopy);
            if ((this.feld!= null)&&(!this.feld.isEmpty())) {
                List<Bewertung.Feld> sourceFeld;
                sourceFeld = (((this.feld!= null)&&(!this.feld.isEmpty()))?this.getFeld():null);
                @SuppressWarnings("unchecked")
                List<Bewertung.Feld> copyFeld = ((List<Bewertung.Feld> ) strategy.copy(LocatorUtils.property(locator, "feld", sourceFeld), sourceFeld));
                copy.feld = null;
                if (copyFeld!= null) {
                    List<Bewertung.Feld> uniqueFeldl = copy.getFeld();
                    uniqueFeldl.addAll(copyFeld);
                }
            } else {
                copy.feld = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Bewertung();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Bewertung that = ((Bewertung) object);
        {
            List<Bewertung.Feld> lhsFeld;
            lhsFeld = (((this.feld!= null)&&(!this.feld.isEmpty()))?this.getFeld():null);
            List<Bewertung.Feld> rhsFeld;
            rhsFeld = (((that.feld!= null)&&(!that.feld.isEmpty()))?that.getFeld():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feld", lhsFeld), LocatorUtils.property(thatLocator, "feld", rhsFeld), lhsFeld, rhsFeld)) {
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
     * Java class for &lt;feld&gt; in &lt;bewertung&gt; elements.
     * 
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "wert",
        "typ",
        "modus"
    })
    public static class Feld
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String wert;
        protected List<String> typ;
        protected List<String> modus;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the wert property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWert() {
            return wert;
        }

        /**
         * Sets the value of the wert property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWert(String value) {
            this.wert = value;
        }

        /**
         * Gets the value of the typ property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the typ property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTyp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTyp() {
            if (typ == null) {
                typ = new ArrayList<String>();
            }
            return this.typ;
        }

        /**
         * Gets the value of the modus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getModus() {
            if (modus == null) {
                modus = new ArrayList<String>();
            }
            return this.modus;
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
                String theName;
                theName = this.getName();
                strategy.appendField(locator, this, "name", buffer, theName);
            }
            {
                String theWert;
                theWert = this.getWert();
                strategy.appendField(locator, this, "wert", buffer, theWert);
            }
            {
                List<String> theTyp;
                theTyp = (((this.typ!= null)&&(!this.typ.isEmpty()))?this.getTyp():null);
                strategy.appendField(locator, this, "typ", buffer, theTyp);
            }
            {
                List<String> theModus;
                theModus = (((this.modus!= null)&&(!this.modus.isEmpty()))?this.getModus():null);
                strategy.appendField(locator, this, "modus", buffer, theModus);
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
            if (draftCopy instanceof Bewertung.Feld) {
                final Bewertung.Feld copy = ((Bewertung.Feld) draftCopy);
                if (this.name!= null) {
                    String sourceName;
                    sourceName = this.getName();
                    String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                    copy.setName(copyName);
                } else {
                    copy.name = null;
                }
                if (this.wert!= null) {
                    String sourceWert;
                    sourceWert = this.getWert();
                    String copyWert = ((String) strategy.copy(LocatorUtils.property(locator, "wert", sourceWert), sourceWert));
                    copy.setWert(copyWert);
                } else {
                    copy.wert = null;
                }
                if ((this.typ!= null)&&(!this.typ.isEmpty())) {
                    List<String> sourceTyp;
                    sourceTyp = (((this.typ!= null)&&(!this.typ.isEmpty()))?this.getTyp():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyTyp = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "typ", sourceTyp), sourceTyp));
                    copy.typ = null;
                    if (copyTyp!= null) {
                        List<String> uniqueTypl = copy.getTyp();
                        uniqueTypl.addAll(copyTyp);
                    }
                } else {
                    copy.typ = null;
                }
                if ((this.modus!= null)&&(!this.modus.isEmpty())) {
                    List<String> sourceModus;
                    sourceModus = (((this.modus!= null)&&(!this.modus.isEmpty()))?this.getModus():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyModus = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "modus", sourceModus), sourceModus));
                    copy.modus = null;
                    if (copyModus!= null) {
                        List<String> uniqueModusl = copy.getModus();
                        uniqueModusl.addAll(copyModus);
                    }
                } else {
                    copy.modus = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new Bewertung.Feld();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Bewertung.Feld that = ((Bewertung.Feld) object);
            {
                String lhsName;
                lhsName = this.getName();
                String rhsName;
                rhsName = that.getName();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                    return false;
                }
            }
            {
                String lhsWert;
                lhsWert = this.getWert();
                String rhsWert;
                rhsWert = that.getWert();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "wert", lhsWert), LocatorUtils.property(thatLocator, "wert", rhsWert), lhsWert, rhsWert)) {
                    return false;
                }
            }
            {
                List<String> lhsTyp;
                lhsTyp = (((this.typ!= null)&&(!this.typ.isEmpty()))?this.getTyp():null);
                List<String> rhsTyp;
                rhsTyp = (((that.typ!= null)&&(!that.typ.isEmpty()))?that.getTyp():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "typ", lhsTyp), LocatorUtils.property(thatLocator, "typ", rhsTyp), lhsTyp, rhsTyp)) {
                    return false;
                }
            }
            {
                List<String> lhsModus;
                lhsModus = (((this.modus!= null)&&(!this.modus.isEmpty()))?this.getModus():null);
                List<String> rhsModus;
                rhsModus = (((that.modus!= null)&&(!that.modus.isEmpty()))?that.getModus():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "modus", lhsModus), LocatorUtils.property(thatLocator, "modus", rhsModus), lhsModus, rhsModus)) {
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
