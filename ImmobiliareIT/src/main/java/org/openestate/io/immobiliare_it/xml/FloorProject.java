
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
 * <p>Java class for floorProject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="floorProject"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
 *       &lt;attribute name="type"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Intermedio"/&gt;
 *             &lt;enumeration value="Interrato"/&gt;
 *             &lt;enumeration value="Seminterrato"/&gt;
 *             &lt;enumeration value="PianoTerra"/&gt;
 *             &lt;enumeration value="Rialzato"/&gt;
 *             &lt;enumeration value="PianoNobile"/&gt;
 *             &lt;enumeration value="Multipiano su pi\u00f9 livelli"/&gt;
 *             &lt;enumeration value="Ultimo"/&gt;
 *             &lt;enumeration value="Attico"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "floorProject", propOrder = {
    "value"
})
public class FloorProject
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long value;
    @XmlAttribute(name = "type")
    protected FloorProject.FloorProjectType type;

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
     *     {@link FloorProject.FloorProjectType }
     *     
     */
    public FloorProject.FloorProjectType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloorProject.FloorProjectType }
     *     
     */
    public void setType(FloorProject.FloorProjectType value) {
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
            FloorProject.FloorProjectType theType;
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
        if (draftCopy instanceof FloorProject) {
            final FloorProject copy = ((FloorProject) draftCopy);
            if (this.value!= null) {
                Long sourceValue;
                sourceValue = this.getValue();
                Long copyValue = ((Long) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.type!= null) {
                FloorProject.FloorProjectType sourceType;
                sourceType = this.getType();
                FloorProject.FloorProjectType copyType = ((FloorProject.FloorProjectType) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType));
                copy.setType(copyType);
            } else {
                copy.type = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FloorProject();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FloorProject)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FloorProject that = ((FloorProject) object);
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
            FloorProject.FloorProjectType lhsType;
            lhsType = this.getType();
            FloorProject.FloorProjectType rhsType;
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
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="Intermedio"/&gt;
     *     &lt;enumeration value="Interrato"/&gt;
     *     &lt;enumeration value="Seminterrato"/&gt;
     *     &lt;enumeration value="PianoTerra"/&gt;
     *     &lt;enumeration value="Rialzato"/&gt;
     *     &lt;enumeration value="PianoNobile"/&gt;
     *     &lt;enumeration value="Multipiano su pi\u00f9 livelli"/&gt;
     *     &lt;enumeration value="Ultimo"/&gt;
     *     &lt;enumeration value="Attico"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum FloorProjectType {

        @XmlEnumValue("Intermedio")
        INTERMEDIO("Intermedio"),
        @XmlEnumValue("Interrato")
        INTERRATO("Interrato"),
        @XmlEnumValue("Seminterrato")
        SEMINTERRATO("Seminterrato"),
        @XmlEnumValue("PianoTerra")
        PIANO_TERRA("PianoTerra"),
        @XmlEnumValue("Rialzato")
        RIALZATO("Rialzato"),
        @XmlEnumValue("PianoNobile")
        PIANO_NOBILE("PianoNobile"),
        @XmlEnumValue("Multipiano su pi\u00f9 livelli")
        MULTIPIANO_SU_PI\u00d9_LIVELLI("Multipiano su pi\u00f9 livelli"),
        @XmlEnumValue("Ultimo")
        ULTIMO("Ultimo"),
        @XmlEnumValue("Attico")
        ATTICO("Attico");
        private final String value;

        FloorProjectType(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static FloorProject.FloorProjectType fromValue(String v) {
            for (FloorProject.FloorProjectType c: FloorProject.FloorProjectType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
