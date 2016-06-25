
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
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
 * Java class for &lt;zustand_angaben&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baujahr",
    "zustand",
    "alter",
    "bebaubarNach",
    "erschliessung",
    "altlasten",
    "userDefinedSimplefield",
    "userDefinedAnyfield"
})
@XmlRootElement(name = "zustand_angaben")
public class ZustandAngaben implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    protected String baujahr;
    protected Zustand zustand;
    protected Alter alter;
    @XmlElement(name = "bebaubar_nach")
    protected BebaubarNach bebaubarNach;
    protected Erschliessung erschliessung;
    protected String altlasten;
    @XmlElement(name = "user_defined_simplefield")
    protected List<UserDefinedSimplefield> userDefinedSimplefield;
    @XmlElement(name = "user_defined_anyfield")
    protected List<UserDefinedAnyfield> userDefinedAnyfield;

    /**
     * Gets the value of the baujahr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaujahr() {
        return baujahr;
    }

    /**
     * Sets the value of the baujahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaujahr(String value) {
        this.baujahr = value;
    }

    /**
     * Gets the value of the zustand property.
     * 
     * @return
     *     possible object is
     *     {@link Zustand }
     *     
     */
    public Zustand getZustand() {
        return zustand;
    }

    /**
     * Sets the value of the zustand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zustand }
     *     
     */
    public void setZustand(Zustand value) {
        this.zustand = value;
    }

    /**
     * Gets the value of the alter property.
     * 
     * @return
     *     possible object is
     *     {@link Alter }
     *     
     */
    public Alter getAlter() {
        return alter;
    }

    /**
     * Sets the value of the alter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Alter }
     *     
     */
    public void setAlter(Alter value) {
        this.alter = value;
    }

    /**
     * Gets the value of the bebaubarNach property.
     * 
     * @return
     *     possible object is
     *     {@link BebaubarNach }
     *     
     */
    public BebaubarNach getBebaubarNach() {
        return bebaubarNach;
    }

    /**
     * Sets the value of the bebaubarNach property.
     * 
     * @param value
     *     allowed object is
     *     {@link BebaubarNach }
     *     
     */
    public void setBebaubarNach(BebaubarNach value) {
        this.bebaubarNach = value;
    }

    /**
     * Gets the value of the erschliessung property.
     * 
     * @return
     *     possible object is
     *     {@link Erschliessung }
     *     
     */
    public Erschliessung getErschliessung() {
        return erschliessung;
    }

    /**
     * Sets the value of the erschliessung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Erschliessung }
     *     
     */
    public void setErschliessung(Erschliessung value) {
        this.erschliessung = value;
    }

    /**
     * Gets the value of the altlasten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltlasten() {
        return altlasten;
    }

    /**
     * Sets the value of the altlasten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltlasten(String value) {
        this.altlasten = value;
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
            String theBaujahr;
            theBaujahr = this.getBaujahr();
            strategy.appendField(locator, this, "baujahr", buffer, theBaujahr, (this.baujahr!= null));
        }
        {
            Zustand theZustand;
            theZustand = this.getZustand();
            strategy.appendField(locator, this, "zustand", buffer, theZustand, (this.zustand!= null));
        }
        {
            Alter theAlter;
            theAlter = this.getAlter();
            strategy.appendField(locator, this, "alter", buffer, theAlter, (this.alter!= null));
        }
        {
            BebaubarNach theBebaubarNach;
            theBebaubarNach = this.getBebaubarNach();
            strategy.appendField(locator, this, "bebaubarNach", buffer, theBebaubarNach, (this.bebaubarNach!= null));
        }
        {
            Erschliessung theErschliessung;
            theErschliessung = this.getErschliessung();
            strategy.appendField(locator, this, "erschliessung", buffer, theErschliessung, (this.erschliessung!= null));
        }
        {
            String theAltlasten;
            theAltlasten = this.getAltlasten();
            strategy.appendField(locator, this, "altlasten", buffer, theAltlasten, (this.altlasten!= null));
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
        if (draftCopy instanceof ZustandAngaben) {
            final ZustandAngaben copy = ((ZustandAngaben) draftCopy);
            {
                Boolean baujahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.baujahr!= null));
                if (baujahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBaujahr;
                    sourceBaujahr = this.getBaujahr();
                    String copyBaujahr = ((String) strategy.copy(LocatorUtils.property(locator, "baujahr", sourceBaujahr), sourceBaujahr, (this.baujahr!= null)));
                    copy.setBaujahr(copyBaujahr);
                } else {
                    if (baujahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.baujahr = null;
                    }
                }
            }
            {
                Boolean zustandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zustand!= null));
                if (zustandShouldBeCopiedAndSet == Boolean.TRUE) {
                    Zustand sourceZustand;
                    sourceZustand = this.getZustand();
                    Zustand copyZustand = ((Zustand) strategy.copy(LocatorUtils.property(locator, "zustand", sourceZustand), sourceZustand, (this.zustand!= null)));
                    copy.setZustand(copyZustand);
                } else {
                    if (zustandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zustand = null;
                    }
                }
            }
            {
                Boolean alterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alter!= null));
                if (alterShouldBeCopiedAndSet == Boolean.TRUE) {
                    Alter sourceAlter;
                    sourceAlter = this.getAlter();
                    Alter copyAlter = ((Alter) strategy.copy(LocatorUtils.property(locator, "alter", sourceAlter), sourceAlter, (this.alter!= null)));
                    copy.setAlter(copyAlter);
                } else {
                    if (alterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alter = null;
                    }
                }
            }
            {
                Boolean bebaubarNachShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bebaubarNach!= null));
                if (bebaubarNachShouldBeCopiedAndSet == Boolean.TRUE) {
                    BebaubarNach sourceBebaubarNach;
                    sourceBebaubarNach = this.getBebaubarNach();
                    BebaubarNach copyBebaubarNach = ((BebaubarNach) strategy.copy(LocatorUtils.property(locator, "bebaubarNach", sourceBebaubarNach), sourceBebaubarNach, (this.bebaubarNach!= null)));
                    copy.setBebaubarNach(copyBebaubarNach);
                } else {
                    if (bebaubarNachShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bebaubarNach = null;
                    }
                }
            }
            {
                Boolean erschliessungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erschliessung!= null));
                if (erschliessungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Erschliessung sourceErschliessung;
                    sourceErschliessung = this.getErschliessung();
                    Erschliessung copyErschliessung = ((Erschliessung) strategy.copy(LocatorUtils.property(locator, "erschliessung", sourceErschliessung), sourceErschliessung, (this.erschliessung!= null)));
                    copy.setErschliessung(copyErschliessung);
                } else {
                    if (erschliessungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erschliessung = null;
                    }
                }
            }
            {
                Boolean altlastenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.altlasten!= null));
                if (altlastenShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAltlasten;
                    sourceAltlasten = this.getAltlasten();
                    String copyAltlasten = ((String) strategy.copy(LocatorUtils.property(locator, "altlasten", sourceAltlasten), sourceAltlasten, (this.altlasten!= null)));
                    copy.setAltlasten(copyAltlasten);
                } else {
                    if (altlastenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.altlasten = null;
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
        return new ZustandAngaben();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZustandAngaben that = ((ZustandAngaben) object);
        {
            String lhsBaujahr;
            lhsBaujahr = this.getBaujahr();
            String rhsBaujahr;
            rhsBaujahr = that.getBaujahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baujahr", lhsBaujahr), LocatorUtils.property(thatLocator, "baujahr", rhsBaujahr), lhsBaujahr, rhsBaujahr, (this.baujahr!= null), (that.baujahr!= null))) {
                return false;
            }
        }
        {
            Zustand lhsZustand;
            lhsZustand = this.getZustand();
            Zustand rhsZustand;
            rhsZustand = that.getZustand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zustand", lhsZustand), LocatorUtils.property(thatLocator, "zustand", rhsZustand), lhsZustand, rhsZustand, (this.zustand!= null), (that.zustand!= null))) {
                return false;
            }
        }
        {
            Alter lhsAlter;
            lhsAlter = this.getAlter();
            Alter rhsAlter;
            rhsAlter = that.getAlter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alter", lhsAlter), LocatorUtils.property(thatLocator, "alter", rhsAlter), lhsAlter, rhsAlter, (this.alter!= null), (that.alter!= null))) {
                return false;
            }
        }
        {
            BebaubarNach lhsBebaubarNach;
            lhsBebaubarNach = this.getBebaubarNach();
            BebaubarNach rhsBebaubarNach;
            rhsBebaubarNach = that.getBebaubarNach();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bebaubarNach", lhsBebaubarNach), LocatorUtils.property(thatLocator, "bebaubarNach", rhsBebaubarNach), lhsBebaubarNach, rhsBebaubarNach, (this.bebaubarNach!= null), (that.bebaubarNach!= null))) {
                return false;
            }
        }
        {
            Erschliessung lhsErschliessung;
            lhsErschliessung = this.getErschliessung();
            Erschliessung rhsErschliessung;
            rhsErschliessung = that.getErschliessung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erschliessung", lhsErschliessung), LocatorUtils.property(thatLocator, "erschliessung", rhsErschliessung), lhsErschliessung, rhsErschliessung, (this.erschliessung!= null), (that.erschliessung!= null))) {
                return false;
            }
        }
        {
            String lhsAltlasten;
            lhsAltlasten = this.getAltlasten();
            String rhsAltlasten;
            rhsAltlasten = that.getAltlasten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "altlasten", lhsAltlasten), LocatorUtils.property(thatLocator, "altlasten", rhsAltlasten), lhsAltlasten, rhsAltlasten, (this.altlasten!= null), (that.altlasten!= null))) {
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
