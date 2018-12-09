
package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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

public class GarageKauf
    extends JAXBElement<GarageKauf.Type>
{

    protected final static QName NAME = new QName("http://www.immobilienscout24.de/immobilientransfer", "GarageKauf");

    public GarageKauf(GarageKauf.Type value) {
        super(NAME, ((Class) GarageKauf.Type.class), null, value);
    }

    public GarageKauf() {
        super(NAME, ((Class) GarageKauf.Type.class), null, null);
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
     *         &lt;element name="Kaufpreise" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungGarageKaufTyp"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "kaufpreise"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
    public static class Type
        extends GarageTyp
        implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(name = "Kaufpreise", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        protected VermarktungGarageKaufTyp kaufpreise;

        /**
         * Gets the value of the kaufpreise property.
         * 
         * @return
         *     possible object is
         *     {@link VermarktungGarageKaufTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public VermarktungGarageKaufTyp getKaufpreise() {
            return kaufpreise;
        }

        /**
         * Sets the value of the kaufpreise property.
         * 
         * @param value
         *     allowed object is
         *     {@link VermarktungGarageKaufTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public void setKaufpreise(VermarktungGarageKaufTyp value) {
            this.kaufpreise = value;
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
                VermarktungGarageKaufTyp theKaufpreise;
                theKaufpreise = this.getKaufpreise();
                strategy.appendField(locator, this, "kaufpreise", buffer, theKaufpreise, (this.kaufpreise!= null));
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
            if (draftCopy instanceof GarageKauf.Type) {
                final GarageKauf.Type copy = ((GarageKauf.Type) draftCopy);
                {
                    Boolean kaufpreiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaufpreise!= null));
                    if (kaufpreiseShouldBeCopiedAndSet == Boolean.TRUE) {
                        VermarktungGarageKaufTyp sourceKaufpreise;
                        sourceKaufpreise = this.getKaufpreise();
                        VermarktungGarageKaufTyp copyKaufpreise = ((VermarktungGarageKaufTyp) strategy.copy(LocatorUtils.property(locator, "kaufpreise", sourceKaufpreise), sourceKaufpreise, (this.kaufpreise!= null)));
                        copy.setKaufpreise(copyKaufpreise);
                    } else {
                        if (kaufpreiseShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.kaufpreise = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:52:47+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new GarageKauf.Type();
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
            final GarageKauf.Type that = ((GarageKauf.Type) object);
            {
                VermarktungGarageKaufTyp lhsKaufpreise;
                lhsKaufpreise = this.getKaufpreise();
                VermarktungGarageKaufTyp rhsKaufpreise;
                rhsKaufpreise = that.getKaufpreise();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreise", lhsKaufpreise), LocatorUtils.property(thatLocator, "kaufpreise", rhsKaufpreise), lhsKaufpreise, rhsKaufpreise, (this.kaufpreise!= null), (that.kaufpreise!= null))) {
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
