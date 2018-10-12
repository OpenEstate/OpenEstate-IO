
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
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

public class GarageMiete
    extends JAXBElement<GarageMiete.Type>
{

    protected final static QName NAME = new QName("http://www.immobilienscout24.de/immobilientransfer", "GarageMiete");

    public GarageMiete(GarageMiete.Type value) {
        super(NAME, ((Class) GarageMiete.Type.class), null, value);
    }

    public GarageMiete() {
        super(NAME, ((Class) GarageMiete.Type.class), null, null);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}GarageTyp"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Mietpreise" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungGarageMieteTyp"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="VerfuegbarAb" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="VerfuegbarBis" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mietpreise"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public static class Type
        extends GarageTyp
        implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(name = "Mietpreise", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        protected VermarktungGarageMieteTyp mietpreise;
        @XmlAttribute(name = "VerfuegbarAb")
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "date")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        protected Calendar verfuegbarAb;
        @XmlAttribute(name = "VerfuegbarBis")
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "date")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        protected Calendar verfuegbarBis;

        /**
         * Gets the value of the mietpreise property.
         * 
         * @return
         *     possible object is
         *     {@link VermarktungGarageMieteTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public VermarktungGarageMieteTyp getMietpreise() {
            return mietpreise;
        }

        /**
         * Sets the value of the mietpreise property.
         * 
         * @param value
         *     allowed object is
         *     {@link VermarktungGarageMieteTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public void setMietpreise(VermarktungGarageMieteTyp value) {
            this.mietpreise = value;
        }

        /**
         * Gets the value of the verfuegbarAb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public Calendar getVerfuegbarAb() {
            return verfuegbarAb;
        }

        /**
         * Sets the value of the verfuegbarAb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public void setVerfuegbarAb(Calendar value) {
            this.verfuegbarAb = value;
        }

        /**
         * Gets the value of the verfuegbarBis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public Calendar getVerfuegbarBis() {
            return verfuegbarBis;
        }

        /**
         * Sets the value of the verfuegbarBis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public void setVerfuegbarBis(Calendar value) {
            this.verfuegbarBis = value;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            super.appendFields(locator, buffer, strategy);
            {
                VermarktungGarageMieteTyp theMietpreise;
                theMietpreise = this.getMietpreise();
                strategy.appendField(locator, this, "mietpreise", buffer, theMietpreise, (this.mietpreise!= null));
            }
            {
                Calendar theVerfuegbarAb;
                theVerfuegbarAb = this.getVerfuegbarAb();
                strategy.appendField(locator, this, "verfuegbarAb", buffer, theVerfuegbarAb, (this.verfuegbarAb!= null));
            }
            {
                Calendar theVerfuegbarBis;
                theVerfuegbarBis = this.getVerfuegbarBis();
                strategy.appendField(locator, this, "verfuegbarBis", buffer, theVerfuegbarBis, (this.verfuegbarBis!= null));
            }
            return buffer;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            super.copyTo(locator, draftCopy, strategy);
            if (draftCopy instanceof GarageMiete.Type) {
                final GarageMiete.Type copy = ((GarageMiete.Type) draftCopy);
                {
                    Boolean mietpreiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mietpreise!= null));
                    if (mietpreiseShouldBeCopiedAndSet == Boolean.TRUE) {
                        VermarktungGarageMieteTyp sourceMietpreise;
                        sourceMietpreise = this.getMietpreise();
                        VermarktungGarageMieteTyp copyMietpreise = ((VermarktungGarageMieteTyp) strategy.copy(LocatorUtils.property(locator, "mietpreise", sourceMietpreise), sourceMietpreise, (this.mietpreise!= null)));
                        copy.setMietpreise(copyMietpreise);
                    } else {
                        if (mietpreiseShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.mietpreise = null;
                        }
                    }
                }
                {
                    Boolean verfuegbarAbShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verfuegbarAb!= null));
                    if (verfuegbarAbShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceVerfuegbarAb;
                        sourceVerfuegbarAb = this.getVerfuegbarAb();
                        Calendar copyVerfuegbarAb = ((Calendar) strategy.copy(LocatorUtils.property(locator, "verfuegbarAb", sourceVerfuegbarAb), sourceVerfuegbarAb, (this.verfuegbarAb!= null)));
                        copy.setVerfuegbarAb(copyVerfuegbarAb);
                    } else {
                        if (verfuegbarAbShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.verfuegbarAb = null;
                        }
                    }
                }
                {
                    Boolean verfuegbarBisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verfuegbarBis!= null));
                    if (verfuegbarBisShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceVerfuegbarBis;
                        sourceVerfuegbarBis = this.getVerfuegbarBis();
                        Calendar copyVerfuegbarBis = ((Calendar) strategy.copy(LocatorUtils.property(locator, "verfuegbarBis", sourceVerfuegbarBis), sourceVerfuegbarBis, (this.verfuegbarBis!= null)));
                        copy.setVerfuegbarBis(copyVerfuegbarBis);
                    } else {
                        if (verfuegbarBisShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.verfuegbarBis = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new GarageMiete.Type();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final GarageMiete.Type that = ((GarageMiete.Type) object);
            {
                VermarktungGarageMieteTyp lhsMietpreise;
                lhsMietpreise = this.getMietpreise();
                VermarktungGarageMieteTyp rhsMietpreise;
                rhsMietpreise = that.getMietpreise();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mietpreise", lhsMietpreise), LocatorUtils.property(thatLocator, "mietpreise", rhsMietpreise), lhsMietpreise, rhsMietpreise, (this.mietpreise!= null), (that.mietpreise!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsVerfuegbarAb;
                lhsVerfuegbarAb = this.getVerfuegbarAb();
                Calendar rhsVerfuegbarAb;
                rhsVerfuegbarAb = that.getVerfuegbarAb();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "verfuegbarAb", lhsVerfuegbarAb), LocatorUtils.property(thatLocator, "verfuegbarAb", rhsVerfuegbarAb), lhsVerfuegbarAb, rhsVerfuegbarAb, (this.verfuegbarAb!= null), (that.verfuegbarAb!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsVerfuegbarBis;
                lhsVerfuegbarBis = this.getVerfuegbarBis();
                Calendar rhsVerfuegbarBis;
                rhsVerfuegbarBis = that.getVerfuegbarBis();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "verfuegbarBis", lhsVerfuegbarBis), LocatorUtils.property(thatLocator, "verfuegbarBis", rhsVerfuegbarBis), lhsVerfuegbarBis, rhsVerfuegbarBis, (this.verfuegbarBis!= null), (that.verfuegbarBis!= null))) {
                    return false;
                }
            }
            return true;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

    }

}
