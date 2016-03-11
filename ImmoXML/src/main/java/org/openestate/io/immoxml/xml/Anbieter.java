
package org.openestate.io.immoxml.xml;

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
 * Java class for &lt;anbieter&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "anbieternr",
    "firma",
    "immoxmlAnid",
    "anhang",
    "immobilie",
    "impressum",
    "userDefinedSimplefield",
    "userDefinedAnyfield"
})
@XmlRootElement(name = "anbieter")
public class Anbieter implements Cloneable, CopyTo2, Equals2, ToString2
{

    protected String anbieternr;
    @XmlElement(required = true)
    protected String firma;
    @XmlElement(name = "immoxml_anid", required = true)
    protected String immoxmlAnid;
    protected Anhang anhang;
    @XmlElement(required = true)
    protected List<Immobilie> immobilie;
    protected String impressum;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;

    /**
     * Gets the value of the anbieternr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnbieternr() {
        return anbieternr;
    }

    /**
     * Sets the value of the anbieternr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnbieternr(String value) {
        this.anbieternr = value;
    }

    /**
     * Gets the value of the firma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirma() {
        return firma;
    }

    /**
     * Sets the value of the firma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirma(String value) {
        this.firma = value;
    }

    /**
     * Gets the value of the immoxmlAnid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmoxmlAnid() {
        return immoxmlAnid;
    }

    /**
     * Sets the value of the immoxmlAnid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmoxmlAnid(String value) {
        this.immoxmlAnid = value;
    }

    /**
     * Gets the value of the anhang property.
     * 
     * @return
     *     possible object is
     *     {@link Anhang }
     *     
     */
    public Anhang getAnhang() {
        return anhang;
    }

    /**
     * Sets the value of the anhang property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anhang }
     *     
     */
    public void setAnhang(Anhang value) {
        this.anhang = value;
    }

    /**
     * Gets the value of the immobilie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the immobilie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImmobilie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Immobilie }
     * 
     * 
     */
    public List<Immobilie> getImmobilie() {
        if (immobilie == null) {
            immobilie = new ArrayList<Immobilie>();
        }
        return this.immobilie;
    }

    /**
     * Gets the value of the impressum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpressum() {
        return impressum;
    }

    /**
     * Sets the value of the impressum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpressum(String value) {
        this.impressum = value;
    }

    /**
     * Gets the value of the userDefinedSimplefield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedSimplefield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedSimplefield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedSimplefield }
     * 
     * 
     */
    public List<UserDefinedSimplefield> getUserDefinedSimplefield() {
        if (userDefinedSimplefield == null) {
            userDefinedSimplefield = new ArrayList<UserDefinedSimplefield>();
        }
        return this.userDefinedSimplefield;
    }

    /**
     * Gets the value of the userDefinedAnyfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedAnyfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedAnyfield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedAnyfield }
     * 
     * 
     */
    public List<UserDefinedAnyfield> getUserDefinedAnyfield() {
        if (userDefinedAnyfield == null) {
            userDefinedAnyfield = new ArrayList<UserDefinedAnyfield>();
        }
        return this.userDefinedAnyfield;
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
            String theAnbieternr;
            theAnbieternr = this.getAnbieternr();
            strategy.appendField(locator, this, "anbieternr", buffer, theAnbieternr, (this.anbieternr!= null));
        }
        {
            String theFirma;
            theFirma = this.getFirma();
            strategy.appendField(locator, this, "firma", buffer, theFirma, (this.firma!= null));
        }
        {
            String theImmoxmlAnid;
            theImmoxmlAnid = this.getImmoxmlAnid();
            strategy.appendField(locator, this, "immoxmlAnid", buffer, theImmoxmlAnid, (this.immoxmlAnid!= null));
        }
        {
            Anhang theAnhang;
            theAnhang = this.getAnhang();
            strategy.appendField(locator, this, "anhang", buffer, theAnhang, (this.anhang!= null));
        }
        {
            List<Immobilie> theImmobilie;
            theImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
            strategy.appendField(locator, this, "immobilie", buffer, theImmobilie, ((this.immobilie!= null)&&(!this.immobilie.isEmpty())));
        }
        {
            String theImpressum;
            theImpressum = this.getImpressum();
            strategy.appendField(locator, this, "impressum", buffer, theImpressum, (this.impressum!= null));
        }
        {
            List<UserDefinedSimplefield> theUserDefinedSimplefield;
            theUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            strategy.appendField(locator, this, "userDefinedSimplefield", buffer, theUserDefinedSimplefield, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())));
        }
        {
            List<UserDefinedAnyfield> theUserDefinedAnyfield;
            theUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            strategy.appendField(locator, this, "userDefinedAnyfield", buffer, theUserDefinedAnyfield, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())));
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
        if (draftCopy instanceof Anbieter) {
            final Anbieter copy = ((Anbieter) draftCopy);
            {
                Boolean anbieternrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anbieternr!= null));
                if (anbieternrShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAnbieternr;
                    sourceAnbieternr = this.getAnbieternr();
                    String copyAnbieternr = ((String) strategy.copy(LocatorUtils.property(locator, "anbieternr", sourceAnbieternr), sourceAnbieternr, (this.anbieternr!= null)));
                    copy.setAnbieternr(copyAnbieternr);
                } else {
                    if (anbieternrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anbieternr = null;
                    }
                }
            }
            {
                Boolean firmaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.firma!= null));
                if (firmaShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFirma;
                    sourceFirma = this.getFirma();
                    String copyFirma = ((String) strategy.copy(LocatorUtils.property(locator, "firma", sourceFirma), sourceFirma, (this.firma!= null)));
                    copy.setFirma(copyFirma);
                } else {
                    if (firmaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firma = null;
                    }
                }
            }
            {
                Boolean immoxmlAnidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.immoxmlAnid!= null));
                if (immoxmlAnidShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceImmoxmlAnid;
                    sourceImmoxmlAnid = this.getImmoxmlAnid();
                    String copyImmoxmlAnid = ((String) strategy.copy(LocatorUtils.property(locator, "immoxmlAnid", sourceImmoxmlAnid), sourceImmoxmlAnid, (this.immoxmlAnid!= null)));
                    copy.setImmoxmlAnid(copyImmoxmlAnid);
                } else {
                    if (immoxmlAnidShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.immoxmlAnid = null;
                    }
                }
            }
            {
                Boolean anhangShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anhang!= null));
                if (anhangShouldBeCopiedAndSet == Boolean.TRUE) {
                    Anhang sourceAnhang;
                    sourceAnhang = this.getAnhang();
                    Anhang copyAnhang = ((Anhang) strategy.copy(LocatorUtils.property(locator, "anhang", sourceAnhang), sourceAnhang, (this.anhang!= null)));
                    copy.setAnhang(copyAnhang);
                } else {
                    if (anhangShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anhang = null;
                    }
                }
            }
            {
                Boolean immobilieShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.immobilie!= null)&&(!this.immobilie.isEmpty())));
                if (immobilieShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Immobilie> sourceImmobilie;
                    sourceImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
                    @SuppressWarnings("unchecked")
                    List<Immobilie> copyImmobilie = ((List<Immobilie> ) strategy.copy(LocatorUtils.property(locator, "immobilie", sourceImmobilie), sourceImmobilie, ((this.immobilie!= null)&&(!this.immobilie.isEmpty()))));
                    copy.immobilie = null;
                    if (copyImmobilie!= null) {
                        List<Immobilie> uniqueImmobiliel = copy.getImmobilie();
                        uniqueImmobiliel.addAll(copyImmobilie);
                    }
                } else {
                    if (immobilieShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.immobilie = null;
                    }
                }
            }
            {
                Boolean impressumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.impressum!= null));
                if (impressumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceImpressum;
                    sourceImpressum = this.getImpressum();
                    String copyImpressum = ((String) strategy.copy(LocatorUtils.property(locator, "impressum", sourceImpressum), sourceImpressum, (this.impressum!= null)));
                    copy.setImpressum(copyImpressum);
                } else {
                    if (impressumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.impressum = null;
                    }
                }
            }
            {
                Boolean userDefinedSimplefieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())));
                if (userDefinedSimplefieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UserDefinedSimplefield> sourceUserDefinedSimplefield;
                    sourceUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
                    @SuppressWarnings("unchecked")
                    List<UserDefinedSimplefield> copyUserDefinedSimplefield = ((List<UserDefinedSimplefield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedSimplefield", sourceUserDefinedSimplefield), sourceUserDefinedSimplefield, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))));
                    copy.userDefinedSimplefield = null;
                    if (copyUserDefinedSimplefield!= null) {
                        List<UserDefinedSimplefield> uniqueUserDefinedSimplefieldl = copy.getUserDefinedSimplefield();
                        uniqueUserDefinedSimplefieldl.addAll(copyUserDefinedSimplefield);
                    }
                } else {
                    if (userDefinedSimplefieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userDefinedSimplefield = null;
                    }
                }
            }
            {
                Boolean userDefinedAnyfieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())));
                if (userDefinedAnyfieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<UserDefinedAnyfield> sourceUserDefinedAnyfield;
                    sourceUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
                    @SuppressWarnings("unchecked")
                    List<UserDefinedAnyfield> copyUserDefinedAnyfield = ((List<UserDefinedAnyfield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedAnyfield", sourceUserDefinedAnyfield), sourceUserDefinedAnyfield, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))));
                    copy.userDefinedAnyfield = null;
                    if (copyUserDefinedAnyfield!= null) {
                        List<UserDefinedAnyfield> uniqueUserDefinedAnyfieldl = copy.getUserDefinedAnyfield();
                        uniqueUserDefinedAnyfieldl.addAll(copyUserDefinedAnyfield);
                    }
                } else {
                    if (userDefinedAnyfieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.userDefinedAnyfield = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Anbieter();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Anbieter that = ((Anbieter) object);
        {
            String lhsAnbieternr;
            lhsAnbieternr = this.getAnbieternr();
            String rhsAnbieternr;
            rhsAnbieternr = that.getAnbieternr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anbieternr", lhsAnbieternr), LocatorUtils.property(thatLocator, "anbieternr", rhsAnbieternr), lhsAnbieternr, rhsAnbieternr, (this.anbieternr!= null), (that.anbieternr!= null))) {
                return false;
            }
        }
        {
            String lhsFirma;
            lhsFirma = this.getFirma();
            String rhsFirma;
            rhsFirma = that.getFirma();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firma", lhsFirma), LocatorUtils.property(thatLocator, "firma", rhsFirma), lhsFirma, rhsFirma, (this.firma!= null), (that.firma!= null))) {
                return false;
            }
        }
        {
            String lhsImmoxmlAnid;
            lhsImmoxmlAnid = this.getImmoxmlAnid();
            String rhsImmoxmlAnid;
            rhsImmoxmlAnid = that.getImmoxmlAnid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "immoxmlAnid", lhsImmoxmlAnid), LocatorUtils.property(thatLocator, "immoxmlAnid", rhsImmoxmlAnid), lhsImmoxmlAnid, rhsImmoxmlAnid, (this.immoxmlAnid!= null), (that.immoxmlAnid!= null))) {
                return false;
            }
        }
        {
            Anhang lhsAnhang;
            lhsAnhang = this.getAnhang();
            Anhang rhsAnhang;
            rhsAnhang = that.getAnhang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anhang", lhsAnhang), LocatorUtils.property(thatLocator, "anhang", rhsAnhang), lhsAnhang, rhsAnhang, (this.anhang!= null), (that.anhang!= null))) {
                return false;
            }
        }
        {
            List<Immobilie> lhsImmobilie;
            lhsImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
            List<Immobilie> rhsImmobilie;
            rhsImmobilie = (((that.immobilie!= null)&&(!that.immobilie.isEmpty()))?that.getImmobilie():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "immobilie", lhsImmobilie), LocatorUtils.property(thatLocator, "immobilie", rhsImmobilie), lhsImmobilie, rhsImmobilie, ((this.immobilie!= null)&&(!this.immobilie.isEmpty())), ((that.immobilie!= null)&&(!that.immobilie.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsImpressum;
            lhsImpressum = this.getImpressum();
            String rhsImpressum;
            rhsImpressum = that.getImpressum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "impressum", lhsImpressum), LocatorUtils.property(thatLocator, "impressum", rhsImpressum), lhsImpressum, rhsImpressum, (this.impressum!= null), (that.impressum!= null))) {
                return false;
            }
        }
        {
            List<UserDefinedSimplefield> lhsUserDefinedSimplefield;
            lhsUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            List<UserDefinedSimplefield> rhsUserDefinedSimplefield;
            rhsUserDefinedSimplefield = (((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty()))?that.getUserDefinedSimplefield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedSimplefield", lhsUserDefinedSimplefield), LocatorUtils.property(thatLocator, "userDefinedSimplefield", rhsUserDefinedSimplefield), lhsUserDefinedSimplefield, rhsUserDefinedSimplefield, ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())), ((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty())))) {
                return false;
            }
        }
        {
            List<UserDefinedAnyfield> lhsUserDefinedAnyfield;
            lhsUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            List<UserDefinedAnyfield> rhsUserDefinedAnyfield;
            rhsUserDefinedAnyfield = (((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty()))?that.getUserDefinedAnyfield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedAnyfield", lhsUserDefinedAnyfield), LocatorUtils.property(thatLocator, "userDefinedAnyfield", rhsUserDefinedAnyfield), lhsUserDefinedAnyfield, rhsUserDefinedAnyfield, ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())), ((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty())))) {
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
