
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
public class Stellplatz implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlAttribute(name = "stellplatzmiete")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected BigDecimal stellplatzmiete;
    @XmlAttribute(name = "stellplatzkaufpreis")
    @XmlJavaTypeAdapter(Adapter7 .class)
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
            BigDecimal theStellplatzmiete;
            theStellplatzmiete = this.getStellplatzmiete();
            strategy.appendField(locator, this, "stellplatzmiete", buffer, theStellplatzmiete, (this.stellplatzmiete!= null));
        }
        {
            BigDecimal theStellplatzkaufpreis;
            theStellplatzkaufpreis = this.getStellplatzkaufpreis();
            strategy.appendField(locator, this, "stellplatzkaufpreis", buffer, theStellplatzkaufpreis, (this.stellplatzkaufpreis!= null));
        }
        {
            BigInteger theAnzahl;
            theAnzahl = this.getAnzahl();
            strategy.appendField(locator, this, "anzahl", buffer, theAnzahl, (this.anzahl!= null));
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
        if (draftCopy instanceof Stellplatz) {
            final Stellplatz copy = ((Stellplatz) draftCopy);
            {
                Boolean stellplatzmieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stellplatzmiete!= null));
                if (stellplatzmieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceStellplatzmiete;
                    sourceStellplatzmiete = this.getStellplatzmiete();
                    BigDecimal copyStellplatzmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "stellplatzmiete", sourceStellplatzmiete), sourceStellplatzmiete, (this.stellplatzmiete!= null)));
                    copy.setStellplatzmiete(copyStellplatzmiete);
                } else {
                    if (stellplatzmieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stellplatzmiete = null;
                    }
                }
            }
            {
                Boolean stellplatzkaufpreisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stellplatzkaufpreis!= null));
                if (stellplatzkaufpreisShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceStellplatzkaufpreis;
                    sourceStellplatzkaufpreis = this.getStellplatzkaufpreis();
                    BigDecimal copyStellplatzkaufpreis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "stellplatzkaufpreis", sourceStellplatzkaufpreis), sourceStellplatzkaufpreis, (this.stellplatzkaufpreis!= null)));
                    copy.setStellplatzkaufpreis(copyStellplatzkaufpreis);
                } else {
                    if (stellplatzkaufpreisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stellplatzkaufpreis = null;
                    }
                }
            }
            {
                Boolean anzahlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahl!= null));
                if (anzahlShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceAnzahl;
                    sourceAnzahl = this.getAnzahl();
                    BigInteger copyAnzahl = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "anzahl", sourceAnzahl), sourceAnzahl, (this.anzahl!= null)));
                    copy.setAnzahl(copyAnzahl);
                } else {
                    if (anzahlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahl = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Stellplatz();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stellplatzmiete", lhsStellplatzmiete), LocatorUtils.property(thatLocator, "stellplatzmiete", rhsStellplatzmiete), lhsStellplatzmiete, rhsStellplatzmiete, (this.stellplatzmiete!= null), (that.stellplatzmiete!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsStellplatzkaufpreis;
            lhsStellplatzkaufpreis = this.getStellplatzkaufpreis();
            BigDecimal rhsStellplatzkaufpreis;
            rhsStellplatzkaufpreis = that.getStellplatzkaufpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stellplatzkaufpreis", lhsStellplatzkaufpreis), LocatorUtils.property(thatLocator, "stellplatzkaufpreis", rhsStellplatzkaufpreis), lhsStellplatzkaufpreis, rhsStellplatzkaufpreis, (this.stellplatzkaufpreis!= null), (that.stellplatzkaufpreis!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsAnzahl;
            lhsAnzahl = this.getAnzahl();
            BigInteger rhsAnzahl;
            rhsAnzahl = that.getAnzahl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahl", lhsAnzahl), LocatorUtils.property(thatLocator, "anzahl", rhsAnzahl), lhsAnzahl, rhsAnzahl, (this.anzahl!= null), (that.anzahl!= null))) {
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
