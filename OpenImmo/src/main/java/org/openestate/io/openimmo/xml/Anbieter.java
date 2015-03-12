
package org.openestate.io.openimmo.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 * Java class for &lt;anbieter&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "anbieternr",
    "firma",
    "openimmoAnid",
    "lizenzkennung",
    "anhang",
    "immobilie",
    "impressum",
    "impressumStrukt",
    "userDefinedSimplefield",
    "userDefinedAnyfield",
    "userDefinedExtend"
})
@XmlRootElement(name = "anbieter")
public class Anbieter
    implements Cloneable, CopyTo, Equals, ToString
{

    protected String anbieternr;
    @XmlElement(required = true)
    protected String firma;
    @XmlElement(name = "openimmo_anid", required = true)
    protected String openimmoAnid;
    protected String lizenzkennung;
    protected Anhang anhang;
    protected List<Immobilie> immobilie;
    protected String impressum;
    @XmlElement(name = "impressum_strukt")
    protected ImpressumStrukt impressumStrukt;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;
    @XmlElement(name = "user_defined_extend")
    protected List<UserDefinedExtend> userDefinedExtend;

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
     * Gets the value of the openimmoAnid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenimmoAnid() {
        return openimmoAnid;
    }

    /**
     * Sets the value of the openimmoAnid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenimmoAnid(String value) {
        this.openimmoAnid = value;
    }

    /**
     * Gets the value of the lizenzkennung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLizenzkennung() {
        return lizenzkennung;
    }

    /**
     * Sets the value of the lizenzkennung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLizenzkennung(String value) {
        this.lizenzkennung = value;
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
     * Gets the value of the impressumStrukt property.
     * 
     * @return
     *     possible object is
     *     {@link ImpressumStrukt }
     *     
     */
    public ImpressumStrukt getImpressumStrukt() {
        return impressumStrukt;
    }

    /**
     * Sets the value of the impressumStrukt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpressumStrukt }
     *     
     */
    public void setImpressumStrukt(ImpressumStrukt value) {
        this.impressumStrukt = value;
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

    /**
     * Gets the value of the userDefinedExtend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedExtend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedExtend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedExtend }
     * 
     * 
     */
    public List<UserDefinedExtend> getUserDefinedExtend() {
        if (userDefinedExtend == null) {
            userDefinedExtend = new ArrayList<UserDefinedExtend>();
        }
        return this.userDefinedExtend;
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
            String theAnbieternr;
            theAnbieternr = this.getAnbieternr();
            strategy.appendField(locator, this, "anbieternr", buffer, theAnbieternr);
        }
        {
            String theFirma;
            theFirma = this.getFirma();
            strategy.appendField(locator, this, "firma", buffer, theFirma);
        }
        {
            String theOpenimmoAnid;
            theOpenimmoAnid = this.getOpenimmoAnid();
            strategy.appendField(locator, this, "openimmoAnid", buffer, theOpenimmoAnid);
        }
        {
            String theLizenzkennung;
            theLizenzkennung = this.getLizenzkennung();
            strategy.appendField(locator, this, "lizenzkennung", buffer, theLizenzkennung);
        }
        {
            Anhang theAnhang;
            theAnhang = this.getAnhang();
            strategy.appendField(locator, this, "anhang", buffer, theAnhang);
        }
        {
            List<Immobilie> theImmobilie;
            theImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
            strategy.appendField(locator, this, "immobilie", buffer, theImmobilie);
        }
        {
            String theImpressum;
            theImpressum = this.getImpressum();
            strategy.appendField(locator, this, "impressum", buffer, theImpressum);
        }
        {
            ImpressumStrukt theImpressumStrukt;
            theImpressumStrukt = this.getImpressumStrukt();
            strategy.appendField(locator, this, "impressumStrukt", buffer, theImpressumStrukt);
        }
        {
            List<UserDefinedSimplefield> theUserDefinedSimplefield;
            theUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            strategy.appendField(locator, this, "userDefinedSimplefield", buffer, theUserDefinedSimplefield);
        }
        {
            List<UserDefinedAnyfield> theUserDefinedAnyfield;
            theUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            strategy.appendField(locator, this, "userDefinedAnyfield", buffer, theUserDefinedAnyfield);
        }
        {
            List<UserDefinedExtend> theUserDefinedExtend;
            theUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            strategy.appendField(locator, this, "userDefinedExtend", buffer, theUserDefinedExtend);
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
        if (draftCopy instanceof Anbieter) {
            final Anbieter copy = ((Anbieter) draftCopy);
            if (this.anbieternr!= null) {
                String sourceAnbieternr;
                sourceAnbieternr = this.getAnbieternr();
                String copyAnbieternr = ((String) strategy.copy(LocatorUtils.property(locator, "anbieternr", sourceAnbieternr), sourceAnbieternr));
                copy.setAnbieternr(copyAnbieternr);
            } else {
                copy.anbieternr = null;
            }
            if (this.firma!= null) {
                String sourceFirma;
                sourceFirma = this.getFirma();
                String copyFirma = ((String) strategy.copy(LocatorUtils.property(locator, "firma", sourceFirma), sourceFirma));
                copy.setFirma(copyFirma);
            } else {
                copy.firma = null;
            }
            if (this.openimmoAnid!= null) {
                String sourceOpenimmoAnid;
                sourceOpenimmoAnid = this.getOpenimmoAnid();
                String copyOpenimmoAnid = ((String) strategy.copy(LocatorUtils.property(locator, "openimmoAnid", sourceOpenimmoAnid), sourceOpenimmoAnid));
                copy.setOpenimmoAnid(copyOpenimmoAnid);
            } else {
                copy.openimmoAnid = null;
            }
            if (this.lizenzkennung!= null) {
                String sourceLizenzkennung;
                sourceLizenzkennung = this.getLizenzkennung();
                String copyLizenzkennung = ((String) strategy.copy(LocatorUtils.property(locator, "lizenzkennung", sourceLizenzkennung), sourceLizenzkennung));
                copy.setLizenzkennung(copyLizenzkennung);
            } else {
                copy.lizenzkennung = null;
            }
            if (this.anhang!= null) {
                Anhang sourceAnhang;
                sourceAnhang = this.getAnhang();
                Anhang copyAnhang = ((Anhang) strategy.copy(LocatorUtils.property(locator, "anhang", sourceAnhang), sourceAnhang));
                copy.setAnhang(copyAnhang);
            } else {
                copy.anhang = null;
            }
            if ((this.immobilie!= null)&&(!this.immobilie.isEmpty())) {
                List<Immobilie> sourceImmobilie;
                sourceImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
                @SuppressWarnings("unchecked")
                List<Immobilie> copyImmobilie = ((List<Immobilie> ) strategy.copy(LocatorUtils.property(locator, "immobilie", sourceImmobilie), sourceImmobilie));
                copy.immobilie = null;
                if (copyImmobilie!= null) {
                    List<Immobilie> uniqueImmobiliel = copy.getImmobilie();
                    uniqueImmobiliel.addAll(copyImmobilie);
                }
            } else {
                copy.immobilie = null;
            }
            if (this.impressum!= null) {
                String sourceImpressum;
                sourceImpressum = this.getImpressum();
                String copyImpressum = ((String) strategy.copy(LocatorUtils.property(locator, "impressum", sourceImpressum), sourceImpressum));
                copy.setImpressum(copyImpressum);
            } else {
                copy.impressum = null;
            }
            if (this.impressumStrukt!= null) {
                ImpressumStrukt sourceImpressumStrukt;
                sourceImpressumStrukt = this.getImpressumStrukt();
                ImpressumStrukt copyImpressumStrukt = ((ImpressumStrukt) strategy.copy(LocatorUtils.property(locator, "impressumStrukt", sourceImpressumStrukt), sourceImpressumStrukt));
                copy.setImpressumStrukt(copyImpressumStrukt);
            } else {
                copy.impressumStrukt = null;
            }
            if ((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty())) {
                List<UserDefinedSimplefield> sourceUserDefinedSimplefield;
                sourceUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedSimplefield> copyUserDefinedSimplefield = ((List<UserDefinedSimplefield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedSimplefield", sourceUserDefinedSimplefield), sourceUserDefinedSimplefield));
                copy.userDefinedSimplefield = null;
                if (copyUserDefinedSimplefield!= null) {
                    List<UserDefinedSimplefield> uniqueUserDefinedSimplefieldl = copy.getUserDefinedSimplefield();
                    uniqueUserDefinedSimplefieldl.addAll(copyUserDefinedSimplefield);
                }
            } else {
                copy.userDefinedSimplefield = null;
            }
            if ((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty())) {
                List<UserDefinedAnyfield> sourceUserDefinedAnyfield;
                sourceUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedAnyfield> copyUserDefinedAnyfield = ((List<UserDefinedAnyfield> ) strategy.copy(LocatorUtils.property(locator, "userDefinedAnyfield", sourceUserDefinedAnyfield), sourceUserDefinedAnyfield));
                copy.userDefinedAnyfield = null;
                if (copyUserDefinedAnyfield!= null) {
                    List<UserDefinedAnyfield> uniqueUserDefinedAnyfieldl = copy.getUserDefinedAnyfield();
                    uniqueUserDefinedAnyfieldl.addAll(copyUserDefinedAnyfield);
                }
            } else {
                copy.userDefinedAnyfield = null;
            }
            if ((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty())) {
                List<UserDefinedExtend> sourceUserDefinedExtend;
                sourceUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
                @SuppressWarnings("unchecked")
                List<UserDefinedExtend> copyUserDefinedExtend = ((List<UserDefinedExtend> ) strategy.copy(LocatorUtils.property(locator, "userDefinedExtend", sourceUserDefinedExtend), sourceUserDefinedExtend));
                copy.userDefinedExtend = null;
                if (copyUserDefinedExtend!= null) {
                    List<UserDefinedExtend> uniqueUserDefinedExtendl = copy.getUserDefinedExtend();
                    uniqueUserDefinedExtendl.addAll(copyUserDefinedExtend);
                }
            } else {
                copy.userDefinedExtend = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Anbieter();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Anbieter)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anbieternr", lhsAnbieternr), LocatorUtils.property(thatLocator, "anbieternr", rhsAnbieternr), lhsAnbieternr, rhsAnbieternr)) {
                return false;
            }
        }
        {
            String lhsFirma;
            lhsFirma = this.getFirma();
            String rhsFirma;
            rhsFirma = that.getFirma();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firma", lhsFirma), LocatorUtils.property(thatLocator, "firma", rhsFirma), lhsFirma, rhsFirma)) {
                return false;
            }
        }
        {
            String lhsOpenimmoAnid;
            lhsOpenimmoAnid = this.getOpenimmoAnid();
            String rhsOpenimmoAnid;
            rhsOpenimmoAnid = that.getOpenimmoAnid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "openimmoAnid", lhsOpenimmoAnid), LocatorUtils.property(thatLocator, "openimmoAnid", rhsOpenimmoAnid), lhsOpenimmoAnid, rhsOpenimmoAnid)) {
                return false;
            }
        }
        {
            String lhsLizenzkennung;
            lhsLizenzkennung = this.getLizenzkennung();
            String rhsLizenzkennung;
            rhsLizenzkennung = that.getLizenzkennung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lizenzkennung", lhsLizenzkennung), LocatorUtils.property(thatLocator, "lizenzkennung", rhsLizenzkennung), lhsLizenzkennung, rhsLizenzkennung)) {
                return false;
            }
        }
        {
            Anhang lhsAnhang;
            lhsAnhang = this.getAnhang();
            Anhang rhsAnhang;
            rhsAnhang = that.getAnhang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anhang", lhsAnhang), LocatorUtils.property(thatLocator, "anhang", rhsAnhang), lhsAnhang, rhsAnhang)) {
                return false;
            }
        }
        {
            List<Immobilie> lhsImmobilie;
            lhsImmobilie = (((this.immobilie!= null)&&(!this.immobilie.isEmpty()))?this.getImmobilie():null);
            List<Immobilie> rhsImmobilie;
            rhsImmobilie = (((that.immobilie!= null)&&(!that.immobilie.isEmpty()))?that.getImmobilie():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "immobilie", lhsImmobilie), LocatorUtils.property(thatLocator, "immobilie", rhsImmobilie), lhsImmobilie, rhsImmobilie)) {
                return false;
            }
        }
        {
            String lhsImpressum;
            lhsImpressum = this.getImpressum();
            String rhsImpressum;
            rhsImpressum = that.getImpressum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "impressum", lhsImpressum), LocatorUtils.property(thatLocator, "impressum", rhsImpressum), lhsImpressum, rhsImpressum)) {
                return false;
            }
        }
        {
            ImpressumStrukt lhsImpressumStrukt;
            lhsImpressumStrukt = this.getImpressumStrukt();
            ImpressumStrukt rhsImpressumStrukt;
            rhsImpressumStrukt = that.getImpressumStrukt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "impressumStrukt", lhsImpressumStrukt), LocatorUtils.property(thatLocator, "impressumStrukt", rhsImpressumStrukt), lhsImpressumStrukt, rhsImpressumStrukt)) {
                return false;
            }
        }
        {
            List<UserDefinedSimplefield> lhsUserDefinedSimplefield;
            lhsUserDefinedSimplefield = (((this.userDefinedSimplefield!= null)&&(!this.userDefinedSimplefield.isEmpty()))?this.getUserDefinedSimplefield():null);
            List<UserDefinedSimplefield> rhsUserDefinedSimplefield;
            rhsUserDefinedSimplefield = (((that.userDefinedSimplefield!= null)&&(!that.userDefinedSimplefield.isEmpty()))?that.getUserDefinedSimplefield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedSimplefield", lhsUserDefinedSimplefield), LocatorUtils.property(thatLocator, "userDefinedSimplefield", rhsUserDefinedSimplefield), lhsUserDefinedSimplefield, rhsUserDefinedSimplefield)) {
                return false;
            }
        }
        {
            List<UserDefinedAnyfield> lhsUserDefinedAnyfield;
            lhsUserDefinedAnyfield = (((this.userDefinedAnyfield!= null)&&(!this.userDefinedAnyfield.isEmpty()))?this.getUserDefinedAnyfield():null);
            List<UserDefinedAnyfield> rhsUserDefinedAnyfield;
            rhsUserDefinedAnyfield = (((that.userDefinedAnyfield!= null)&&(!that.userDefinedAnyfield.isEmpty()))?that.getUserDefinedAnyfield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedAnyfield", lhsUserDefinedAnyfield), LocatorUtils.property(thatLocator, "userDefinedAnyfield", rhsUserDefinedAnyfield), lhsUserDefinedAnyfield, rhsUserDefinedAnyfield)) {
                return false;
            }
        }
        {
            List<UserDefinedExtend> lhsUserDefinedExtend;
            lhsUserDefinedExtend = (((this.userDefinedExtend!= null)&&(!this.userDefinedExtend.isEmpty()))?this.getUserDefinedExtend():null);
            List<UserDefinedExtend> rhsUserDefinedExtend;
            rhsUserDefinedExtend = (((that.userDefinedExtend!= null)&&(!that.userDefinedExtend.isEmpty()))?that.getUserDefinedExtend():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefinedExtend", lhsUserDefinedExtend), LocatorUtils.property(thatLocator, "userDefinedExtend", rhsUserDefinedExtend), lhsUserDefinedExtend, rhsUserDefinedExtend)) {
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
