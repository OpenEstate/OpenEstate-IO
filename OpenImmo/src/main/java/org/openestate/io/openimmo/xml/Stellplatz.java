
package org.openestate.io.openimmo.xml;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
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
 * Java class for "stellplatz" complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stellplatz")
@XmlSeeAlso({
    StpSonstige.class
})
public class Stellplatz
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "stellplatzmiete")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal stellplatzmiete;
    @XmlAttribute(name = "stellplatzkaufpreis")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "decimal")
    protected BigDecimal stellplatzkaufpreis;
    @XmlAttribute(name = "anzahl")
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    protected BigInteger anzahl;

    /**
     * Gets the value of the stellplatzmiete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getStellplatzmiete() {
        return stellplatzmiete;
    }

    /**
     * Sets the value of the stellplatzmiete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStellplatzmiete(BigDecimal value) {
        this.stellplatzmiete = value;
    }

    /**
     * Gets the value of the stellplatzkaufpreis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getStellplatzkaufpreis() {
        return stellplatzkaufpreis;
    }

    /**
     * Sets the value of the stellplatzkaufpreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStellplatzkaufpreis(BigDecimal value) {
        this.stellplatzkaufpreis = value;
    }

    /**
     * Gets the value of the anzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigInteger getAnzahl() {
        return anzahl;
    }

    /**
     * Sets the value of the anzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzahl(BigInteger value) {
        this.anzahl = value;
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
            BigDecimal theStellplatzmiete;
            theStellplatzmiete = this.getStellplatzmiete();
            strategy.appendField(locator, this, "stellplatzmiete", buffer, theStellplatzmiete);
        }
        {
            BigDecimal theStellplatzkaufpreis;
            theStellplatzkaufpreis = this.getStellplatzkaufpreis();
            strategy.appendField(locator, this, "stellplatzkaufpreis", buffer, theStellplatzkaufpreis);
        }
        {
            BigInteger theAnzahl;
            theAnzahl = this.getAnzahl();
            strategy.appendField(locator, this, "anzahl", buffer, theAnzahl);
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
        if (draftCopy instanceof Stellplatz) {
            final Stellplatz copy = ((Stellplatz) draftCopy);
            if (this.stellplatzmiete!= null) {
                BigDecimal sourceStellplatzmiete;
                sourceStellplatzmiete = this.getStellplatzmiete();
                BigDecimal copyStellplatzmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "stellplatzmiete", sourceStellplatzmiete), sourceStellplatzmiete));
                copy.setStellplatzmiete(copyStellplatzmiete);
            } else {
                copy.stellplatzmiete = null;
            }
            if (this.stellplatzkaufpreis!= null) {
                BigDecimal sourceStellplatzkaufpreis;
                sourceStellplatzkaufpreis = this.getStellplatzkaufpreis();
                BigDecimal copyStellplatzkaufpreis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "stellplatzkaufpreis", sourceStellplatzkaufpreis), sourceStellplatzkaufpreis));
                copy.setStellplatzkaufpreis(copyStellplatzkaufpreis);
            } else {
                copy.stellplatzkaufpreis = null;
            }
            if (this.anzahl!= null) {
                BigInteger sourceAnzahl;
                sourceAnzahl = this.getAnzahl();
                BigInteger copyAnzahl = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "anzahl", sourceAnzahl), sourceAnzahl));
                copy.setAnzahl(copyAnzahl);
            } else {
                copy.anzahl = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Stellplatz();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Stellplatz that = ((Stellplatz) object);
        {
            BigDecimal lhsStellplatzmiete;
            lhsStellplatzmiete = this.getStellplatzmiete();
            BigDecimal rhsStellplatzmiete;
            rhsStellplatzmiete = that.getStellplatzmiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stellplatzmiete", lhsStellplatzmiete), LocatorUtils.property(thatLocator, "stellplatzmiete", rhsStellplatzmiete), lhsStellplatzmiete, rhsStellplatzmiete)) {
                return false;
            }
        }
        {
            BigDecimal lhsStellplatzkaufpreis;
            lhsStellplatzkaufpreis = this.getStellplatzkaufpreis();
            BigDecimal rhsStellplatzkaufpreis;
            rhsStellplatzkaufpreis = that.getStellplatzkaufpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stellplatzkaufpreis", lhsStellplatzkaufpreis), LocatorUtils.property(thatLocator, "stellplatzkaufpreis", rhsStellplatzkaufpreis), lhsStellplatzkaufpreis, rhsStellplatzkaufpreis)) {
                return false;
            }
        }
        {
            BigInteger lhsAnzahl;
            lhsAnzahl = this.getAnzahl();
            BigInteger rhsAnzahl;
            rhsAnzahl = that.getAnzahl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahl", lhsAnzahl), LocatorUtils.property(thatLocator, "anzahl", rhsAnzahl), lhsAnzahl, rhsAnzahl)) {
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
