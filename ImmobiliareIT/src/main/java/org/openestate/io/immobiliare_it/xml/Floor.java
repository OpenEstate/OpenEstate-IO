
package org.openestate.io.immobiliare_it.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * <p>Java class for floor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="floor">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Intermedio"/>
 *             &lt;enumeration value="Interrato"/>
 *             &lt;enumeration value="Controterra"/>
 *             &lt;enumeration value="Seminterrato"/>
 *             &lt;enumeration value="PianoTerra"/>
 *             &lt;enumeration value="Rialzato"/>
 *             &lt;enumeration value="PianoNobile"/>
 *             &lt;enumeration value="Multipiano"/>
 *             &lt;enumeration value="Ultimo"/>
 *             &lt;enumeration value="Attico"/>
 *             &lt;enumeration value="Edificio"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "floor", propOrder = {
    "value"
})
public class Floor
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long value;
    @XmlAttribute(name = "type")
    protected Floor.FloorType type;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Floor.FloorType }
     *     
     */
    public Floor.FloorType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Floor.FloorType }
     *     
     */
    public void setType(Floor.FloorType value) {
        this.type = value;
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
            Long theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            Floor.FloorType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
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
        if (draftCopy instanceof Floor) {
            final Floor copy = ((Floor) draftCopy);
            if (this.value!= null) {
                Long sourceValue;
                sourceValue = this.getValue();
                Long copyValue = ((Long) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.type!= null) {
                Floor.FloorType sourceType;
                sourceType = this.getType();
                Floor.FloorType copyType = ((Floor.FloorType) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType));
                copy.setType(copyType);
            } else {
                copy.type = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Floor();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Floor)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Floor that = ((Floor) object);
        {
            Long lhsValue;
            lhsValue = this.getValue();
            Long rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            Floor.FloorType lhsType;
            lhsType = this.getType();
            Floor.FloorType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
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
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType>
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     &lt;enumeration value="Intermedio"/>
     *     &lt;enumeration value="Interrato"/>
     *     &lt;enumeration value="Controterra"/>
     *     &lt;enumeration value="Seminterrato"/>
     *     &lt;enumeration value="PianoTerra"/>
     *     &lt;enumeration value="Rialzato"/>
     *     &lt;enumeration value="PianoNobile"/>
     *     &lt;enumeration value="Multipiano"/>
     *     &lt;enumeration value="Ultimo"/>
     *     &lt;enumeration value="Attico"/>
     *     &lt;enumeration value="Edificio"/>
     *   &lt;/restriction>
     * &lt;/simpleType>
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum FloorType {

        @XmlEnumValue("Intermedio")
        INTERMEDIO("Intermedio"),
        @XmlEnumValue("Interrato")
        INTERRATO("Interrato"),
        @XmlEnumValue("Controterra")
        CONTROTERRA("Controterra"),
        @XmlEnumValue("Seminterrato")
        SEMINTERRATO("Seminterrato"),
        @XmlEnumValue("PianoTerra")
        PIANO_TERRA("PianoTerra"),
        @XmlEnumValue("Rialzato")
        RIALZATO("Rialzato"),
        @XmlEnumValue("PianoNobile")
        PIANO_NOBILE("PianoNobile"),
        @XmlEnumValue("Multipiano")
        MULTIPIANO("Multipiano"),
        @XmlEnumValue("Ultimo")
        ULTIMO("Ultimo"),
        @XmlEnumValue("Attico")
        ATTICO("Attico"),
        @XmlEnumValue("Edificio")
        EDIFICIO("Edificio");
        private final String value;

        FloorType(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Floor.FloorType fromValue(String v) {
            for (Floor.FloorType c: Floor.FloorType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
