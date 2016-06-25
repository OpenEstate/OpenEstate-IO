
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * Java class for &lt;user_defined_extend&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "feld"
})
@XmlRootElement(name = "user_defined_extend")
public class UserDefinedExtend implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    protected List<UserDefinedExtend.Feld> feld;

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
     * {@link UserDefinedExtend.Feld }
     * 
     * 
     */
    public List<UserDefinedExtend.Feld> getFeld() {
        if (feld == null) {
            feld = new ArrayList<UserDefinedExtend.Feld>();
        }
        return this.feld;
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
            List<UserDefinedExtend.Feld> theFeld;
            theFeld = (((this.feld!= null)&&(!this.feld.isEmpty()))?this.getFeld():null);
            strategy.appendField(locator, this, "feld", buffer, theFeld, ((this.feld!= null)&&(!this.feld.isEmpty())));
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
        if (draftCopy instanceof UserDefinedExtend) {
            final UserDefinedExtend copy = ((UserDefinedExtend) draftCopy);
            {
                Boolean feldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.feld!= null)&&(!this.feld.isEmpty())));
                if (feldShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UserDefinedExtend.Feld> sourceFeld;
                    sourceFeld = (((this.feld!= null)&&(!this.feld.isEmpty()))?this.getFeld():null);
                    @SuppressWarnings("unchecked")
                    List<UserDefinedExtend.Feld> copyFeld = ((List<UserDefinedExtend.Feld> ) strategy.copy(LocatorUtils.property(locator, "feld", sourceFeld), sourceFeld, ((this.feld!= null)&&(!this.feld.isEmpty()))));
                    copy.feld = null;
                    if (copyFeld!= null) {
                        List<UserDefinedExtend.Feld> uniqueFeldl = copy.getFeld();
                        uniqueFeldl.addAll(copyFeld);
                    }
                } else {
                    if (feldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.feld = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new UserDefinedExtend();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UserDefinedExtend that = ((UserDefinedExtend) object);
        {
            List<UserDefinedExtend.Feld> lhsFeld;
            lhsFeld = (((this.feld!= null)&&(!this.feld.isEmpty()))?this.getFeld():null);
            List<UserDefinedExtend.Feld> rhsFeld;
            rhsFeld = (((that.feld!= null)&&(!that.feld.isEmpty()))?that.getFeld():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feld", lhsFeld), LocatorUtils.property(thatLocator, "feld", rhsFeld), lhsFeld, rhsFeld, ((this.feld!= null)&&(!this.feld.isEmpty())), ((that.feld!= null)&&(!that.feld.isEmpty())))) {
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
     * Java class for &lt;feld&gt; in &lt;user_defined_extend&gt; elements.
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
    public static class Feld implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
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
                String theName;
                theName = this.getName();
                strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
            }
            {
                String theWert;
                theWert = this.getWert();
                strategy.appendField(locator, this, "wert", buffer, theWert, (this.wert!= null));
            }
            {
                List<String> theTyp;
                theTyp = (((this.typ!= null)&&(!this.typ.isEmpty()))?this.getTyp():null);
                strategy.appendField(locator, this, "typ", buffer, theTyp, ((this.typ!= null)&&(!this.typ.isEmpty())));
            }
            {
                List<String> theModus;
                theModus = (((this.modus!= null)&&(!this.modus.isEmpty()))?this.getModus():null);
                strategy.appendField(locator, this, "modus", buffer, theModus, ((this.modus!= null)&&(!this.modus.isEmpty())));
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
            if (draftCopy instanceof UserDefinedExtend.Feld) {
                final UserDefinedExtend.Feld copy = ((UserDefinedExtend.Feld) draftCopy);
                {
                    Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                    if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceName;
                        sourceName = this.getName();
                        String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName, (this.name!= null)));
                        copy.setName(copyName);
                    } else {
                        if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.name = null;
                        }
                    }
                }
                {
                    Boolean wertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wert!= null));
                    if (wertShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceWert;
                        sourceWert = this.getWert();
                        String copyWert = ((String) strategy.copy(LocatorUtils.property(locator, "wert", sourceWert), sourceWert, (this.wert!= null)));
                        copy.setWert(copyWert);
                    } else {
                        if (wertShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.wert = null;
                        }
                    }
                }
                {
                    Boolean typShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.typ!= null)&&(!this.typ.isEmpty())));
                    if (typShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<String> sourceTyp;
                        sourceTyp = (((this.typ!= null)&&(!this.typ.isEmpty()))?this.getTyp():null);
                        @SuppressWarnings("unchecked")
                        List<String> copyTyp = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "typ", sourceTyp), sourceTyp, ((this.typ!= null)&&(!this.typ.isEmpty()))));
                        copy.typ = null;
                        if (copyTyp!= null) {
                            List<String> uniqueTypl = copy.getTyp();
                            uniqueTypl.addAll(copyTyp);
                        }
                    } else {
                        if (typShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.typ = null;
                        }
                    }
                }
                {
                    Boolean modusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.modus!= null)&&(!this.modus.isEmpty())));
                    if (modusShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<String> sourceModus;
                        sourceModus = (((this.modus!= null)&&(!this.modus.isEmpty()))?this.getModus():null);
                        @SuppressWarnings("unchecked")
                        List<String> copyModus = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "modus", sourceModus), sourceModus, ((this.modus!= null)&&(!this.modus.isEmpty()))));
                        copy.modus = null;
                        if (copyModus!= null) {
                            List<String> uniqueModusl = copy.getModus();
                            uniqueModusl.addAll(copyModus);
                        }
                    } else {
                        if (modusShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.modus = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new UserDefinedExtend.Feld();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final UserDefinedExtend.Feld that = ((UserDefinedExtend.Feld) object);
            {
                String lhsName;
                lhsName = this.getName();
                String rhsName;
                rhsName = that.getName();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                    return false;
                }
            }
            {
                String lhsWert;
                lhsWert = this.getWert();
                String rhsWert;
                rhsWert = that.getWert();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "wert", lhsWert), LocatorUtils.property(thatLocator, "wert", rhsWert), lhsWert, rhsWert, (this.wert!= null), (that.wert!= null))) {
                    return false;
                }
            }
            {
                List<String> lhsTyp;
                lhsTyp = (((this.typ!= null)&&(!this.typ.isEmpty()))?this.getTyp():null);
                List<String> rhsTyp;
                rhsTyp = (((that.typ!= null)&&(!that.typ.isEmpty()))?that.getTyp():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "typ", lhsTyp), LocatorUtils.property(thatLocator, "typ", rhsTyp), lhsTyp, rhsTyp, ((this.typ!= null)&&(!this.typ.isEmpty())), ((that.typ!= null)&&(!that.typ.isEmpty())))) {
                    return false;
                }
            }
            {
                List<String> lhsModus;
                lhsModus = (((this.modus!= null)&&(!this.modus.isEmpty()))?this.getModus():null);
                List<String> rhsModus;
                rhsModus = (((that.modus!= null)&&(!that.modus.isEmpty()))?that.getModus():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "modus", lhsModus), LocatorUtils.property(thatLocator, "modus", rhsModus), lhsModus, rhsModus, ((this.modus!= null)&&(!this.modus.isEmpty())), ((that.modus!= null)&&(!that.modus.isEmpty())))) {
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
