
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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

public class GrundstueckGewerbe
    extends JAXBElement<GrundstueckGewerbe.Type>
{

    protected final static QName NAME = new QName("http://www.immobilienscout24.de/immobilientransfer", "GrundstueckGewerbe");

    public GrundstueckGewerbe(GrundstueckGewerbe.Type value) {
        super(NAME, ((Class) GrundstueckGewerbe.Type.class), null, value);
    }

    public GrundstueckGewerbe() {
        super(NAME, ((Class) GrundstueckGewerbe.Type.class), null, null);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.immobilienscout24.de/immobilientransfer}GrundstueckTypBase"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Vermarktung" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungGrundstueckGewerbeTyp"/&gt;
     *         &lt;element name="BebaubarMit" type="{http://www.immobilienscout24.de/immobilientransfer}GrundstueckGewerbeEmpfohleneNutzung" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Objektkategorie2" type="{http://www.immobilienscout24.de/immobilientransfer}GrundstueckGewerbeKategorienTyp" default="Gewerbe" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vermarktung",
        "bebaubarMit"
    })
    public static class Type
        extends GrundstueckTypBase
        implements Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(name = "Vermarktung", required = true)
        protected VermarktungGrundstueckGewerbeTyp vermarktung;
        @XmlElement(name = "BebaubarMit")
        protected GrundstueckGewerbeEmpfohleneNutzung bebaubarMit;
        @XmlAttribute(name = "Objektkategorie2")
        protected GrundstueckGewerbeKategorienTyp objektkategorie2;

        /**
         * Gets the value of the vermarktung property.
         * 
         * @return
         *     possible object is
         *     {@link VermarktungGrundstueckGewerbeTyp }
         *     
         */
        public VermarktungGrundstueckGewerbeTyp getVermarktung() {
            return vermarktung;
        }

        /**
         * Sets the value of the vermarktung property.
         * 
         * @param value
         *     allowed object is
         *     {@link VermarktungGrundstueckGewerbeTyp }
         *     
         */
        public void setVermarktung(VermarktungGrundstueckGewerbeTyp value) {
            this.vermarktung = value;
        }

        /**
         * Gets the value of the bebaubarMit property.
         * 
         * @return
         *     possible object is
         *     {@link GrundstueckGewerbeEmpfohleneNutzung }
         *     
         */
        public GrundstueckGewerbeEmpfohleneNutzung getBebaubarMit() {
            return bebaubarMit;
        }

        /**
         * Sets the value of the bebaubarMit property.
         * 
         * @param value
         *     allowed object is
         *     {@link GrundstueckGewerbeEmpfohleneNutzung }
         *     
         */
        public void setBebaubarMit(GrundstueckGewerbeEmpfohleneNutzung value) {
            this.bebaubarMit = value;
        }

        /**
         * Gets the value of the objektkategorie2 property.
         * 
         * @return
         *     possible object is
         *     {@link GrundstueckGewerbeKategorienTyp }
         *     
         */
        public GrundstueckGewerbeKategorienTyp getObjektkategorie2() {
            if (objektkategorie2 == null) {
                return GrundstueckGewerbeKategorienTyp.GEWERBE;
            } else {
                return objektkategorie2;
            }
        }

        /**
         * Sets the value of the objektkategorie2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link GrundstueckGewerbeKategorienTyp }
         *     
         */
        public void setObjektkategorie2(GrundstueckGewerbeKategorienTyp value) {
            this.objektkategorie2 = value;
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
            super.appendFields(locator, buffer, strategy);
            {
                VermarktungGrundstueckGewerbeTyp theVermarktung;
                theVermarktung = this.getVermarktung();
                strategy.appendField(locator, this, "vermarktung", buffer, theVermarktung, (this.vermarktung!= null));
            }
            {
                GrundstueckGewerbeEmpfohleneNutzung theBebaubarMit;
                theBebaubarMit = this.getBebaubarMit();
                strategy.appendField(locator, this, "bebaubarMit", buffer, theBebaubarMit, (this.bebaubarMit!= null));
            }
            {
                GrundstueckGewerbeKategorienTyp theObjektkategorie2;
                theObjektkategorie2 = this.getObjektkategorie2();
                strategy.appendField(locator, this, "objektkategorie2", buffer, theObjektkategorie2, (this.objektkategorie2 != null));
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
            super.copyTo(locator, draftCopy, strategy);
            if (draftCopy instanceof GrundstueckGewerbe.Type) {
                final GrundstueckGewerbe.Type copy = ((GrundstueckGewerbe.Type) draftCopy);
                {
                    Boolean vermarktungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermarktung!= null));
                    if (vermarktungShouldBeCopiedAndSet == Boolean.TRUE) {
                        VermarktungGrundstueckGewerbeTyp sourceVermarktung;
                        sourceVermarktung = this.getVermarktung();
                        VermarktungGrundstueckGewerbeTyp copyVermarktung = ((VermarktungGrundstueckGewerbeTyp) strategy.copy(LocatorUtils.property(locator, "vermarktung", sourceVermarktung), sourceVermarktung, (this.vermarktung!= null)));
                        copy.setVermarktung(copyVermarktung);
                    } else {
                        if (vermarktungShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.vermarktung = null;
                        }
                    }
                }
                {
                    Boolean bebaubarMitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bebaubarMit!= null));
                    if (bebaubarMitShouldBeCopiedAndSet == Boolean.TRUE) {
                        GrundstueckGewerbeEmpfohleneNutzung sourceBebaubarMit;
                        sourceBebaubarMit = this.getBebaubarMit();
                        GrundstueckGewerbeEmpfohleneNutzung copyBebaubarMit = ((GrundstueckGewerbeEmpfohleneNutzung) strategy.copy(LocatorUtils.property(locator, "bebaubarMit", sourceBebaubarMit), sourceBebaubarMit, (this.bebaubarMit!= null)));
                        copy.setBebaubarMit(copyBebaubarMit);
                    } else {
                        if (bebaubarMitShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.bebaubarMit = null;
                        }
                    }
                }
                {
                    Boolean objektkategorie2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektkategorie2 != null));
                    if (objektkategorie2ShouldBeCopiedAndSet == Boolean.TRUE) {
                        GrundstueckGewerbeKategorienTyp sourceObjektkategorie2;
                        sourceObjektkategorie2 = this.getObjektkategorie2();
                        GrundstueckGewerbeKategorienTyp copyObjektkategorie2 = ((GrundstueckGewerbeKategorienTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2, (this.objektkategorie2 != null)));
                        copy.setObjektkategorie2(copyObjektkategorie2);
                    } else {
                        if (objektkategorie2ShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.objektkategorie2 = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new GrundstueckGewerbe.Type();
        }

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
            final GrundstueckGewerbe.Type that = ((GrundstueckGewerbe.Type) object);
            {
                VermarktungGrundstueckGewerbeTyp lhsVermarktung;
                lhsVermarktung = this.getVermarktung();
                VermarktungGrundstueckGewerbeTyp rhsVermarktung;
                rhsVermarktung = that.getVermarktung();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "vermarktung", lhsVermarktung), LocatorUtils.property(thatLocator, "vermarktung", rhsVermarktung), lhsVermarktung, rhsVermarktung, (this.vermarktung!= null), (that.vermarktung!= null))) {
                    return false;
                }
            }
            {
                GrundstueckGewerbeEmpfohleneNutzung lhsBebaubarMit;
                lhsBebaubarMit = this.getBebaubarMit();
                GrundstueckGewerbeEmpfohleneNutzung rhsBebaubarMit;
                rhsBebaubarMit = that.getBebaubarMit();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "bebaubarMit", lhsBebaubarMit), LocatorUtils.property(thatLocator, "bebaubarMit", rhsBebaubarMit), lhsBebaubarMit, rhsBebaubarMit, (this.bebaubarMit!= null), (that.bebaubarMit!= null))) {
                    return false;
                }
            }
            {
                GrundstueckGewerbeKategorienTyp lhsObjektkategorie2;
                lhsObjektkategorie2 = this.getObjektkategorie2();
                GrundstueckGewerbeKategorienTyp rhsObjektkategorie2;
                rhsObjektkategorie2 = that.getObjektkategorie2();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie2", lhsObjektkategorie2), LocatorUtils.property(thatLocator, "objektkategorie2", rhsObjektkategorie2), lhsObjektkategorie2, rhsObjektkategorie2, (this.objektkategorie2 != null), (that.objektkategorie2 != null))) {
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
