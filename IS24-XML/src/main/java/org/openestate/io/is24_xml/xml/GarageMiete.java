
package org.openestate.io.is24_xml.xml;

import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
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
    public static class Type
        extends GarageTyp
        implements Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "Mietpreise", required = true)
        protected VermarktungGarageMieteTyp mietpreise;
        @XmlAttribute(name = "VerfuegbarAb")
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "date")
        protected Calendar verfuegbarAb;
        @XmlAttribute(name = "VerfuegbarBis")
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "date")
        protected Calendar verfuegbarBis;

        /**
         * Gets the value of the mietpreise property.
         * 
         * @return
         *     possible object is
         *     {@link VermarktungGarageMieteTyp }
         *     
         */
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
        public void setVerfuegbarBis(Calendar value) {
            this.verfuegbarBis = value;
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
            super.appendFields(locator, buffer, strategy);
            {
                VermarktungGarageMieteTyp theMietpreise;
                theMietpreise = this.getMietpreise();
                strategy.appendField(locator, this, "mietpreise", buffer, theMietpreise);
            }
            {
                Calendar theVerfuegbarAb;
                theVerfuegbarAb = this.getVerfuegbarAb();
                strategy.appendField(locator, this, "verfuegbarAb", buffer, theVerfuegbarAb);
            }
            {
                Calendar theVerfuegbarBis;
                theVerfuegbarBis = this.getVerfuegbarBis();
                strategy.appendField(locator, this, "verfuegbarBis", buffer, theVerfuegbarBis);
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
            super.copyTo(locator, draftCopy, strategy);
            if (draftCopy instanceof GarageMiete.Type) {
                final GarageMiete.Type copy = ((GarageMiete.Type) draftCopy);
                if (this.mietpreise!= null) {
                    VermarktungGarageMieteTyp sourceMietpreise;
                    sourceMietpreise = this.getMietpreise();
                    VermarktungGarageMieteTyp copyMietpreise = ((VermarktungGarageMieteTyp) strategy.copy(LocatorUtils.property(locator, "mietpreise", sourceMietpreise), sourceMietpreise));
                    copy.setMietpreise(copyMietpreise);
                } else {
                    copy.mietpreise = null;
                }
                if (this.verfuegbarAb!= null) {
                    Calendar sourceVerfuegbarAb;
                    sourceVerfuegbarAb = this.getVerfuegbarAb();
                    Calendar copyVerfuegbarAb = ((Calendar) strategy.copy(LocatorUtils.property(locator, "verfuegbarAb", sourceVerfuegbarAb), sourceVerfuegbarAb));
                    copy.setVerfuegbarAb(copyVerfuegbarAb);
                } else {
                    copy.verfuegbarAb = null;
                }
                if (this.verfuegbarBis!= null) {
                    Calendar sourceVerfuegbarBis;
                    sourceVerfuegbarBis = this.getVerfuegbarBis();
                    Calendar copyVerfuegbarBis = ((Calendar) strategy.copy(LocatorUtils.property(locator, "verfuegbarBis", sourceVerfuegbarBis), sourceVerfuegbarBis));
                    copy.setVerfuegbarBis(copyVerfuegbarBis);
                } else {
                    copy.verfuegbarBis = null;
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new GarageMiete.Type();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof GarageMiete.Type)) {
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
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mietpreise", lhsMietpreise), LocatorUtils.property(thatLocator, "mietpreise", rhsMietpreise), lhsMietpreise, rhsMietpreise)) {
                    return false;
                }
            }
            {
                Calendar lhsVerfuegbarAb;
                lhsVerfuegbarAb = this.getVerfuegbarAb();
                Calendar rhsVerfuegbarAb;
                rhsVerfuegbarAb = that.getVerfuegbarAb();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "verfuegbarAb", lhsVerfuegbarAb), LocatorUtils.property(thatLocator, "verfuegbarAb", rhsVerfuegbarAb), lhsVerfuegbarAb, rhsVerfuegbarAb)) {
                    return false;
                }
            }
            {
                Calendar lhsVerfuegbarBis;
                lhsVerfuegbarBis = this.getVerfuegbarBis();
                Calendar rhsVerfuegbarBis;
                rhsVerfuegbarBis = that.getVerfuegbarBis();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "verfuegbarBis", lhsVerfuegbarBis), LocatorUtils.property(thatLocator, "verfuegbarBis", rhsVerfuegbarBis), lhsVerfuegbarBis, rhsVerfuegbarBis)) {
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
