
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
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
 * Java class for &lt;objektart&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zimmer",
    "wohnung",
    "haus",
    "grundstueck",
    "bueroPraxen",
    "einzelhandel",
    "gastgewerbe",
    "hallenLagerProd",
    "landUndForstwirtschaft",
    "sonstige",
    "freizeitimmobilieGewerblich",
    "zinshausRenditeobjekt"
})
@XmlRootElement(name = "objektart")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class Objektart implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<Zimmer> zimmer;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<Wohnung> wohnung;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<Haus> haus;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<Grundstueck> grundstueck;
    @XmlElement(name = "buero_praxen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<BueroPraxen> bueroPraxen;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<Einzelhandel> einzelhandel;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<Gastgewerbe> gastgewerbe;
    @XmlElement(name = "hallen_lager_prod")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<HallenLagerProd> hallenLagerProd;
    @XmlElement(name = "land_und_forstwirtschaft")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<LandUndForstwirtschaft> landUndForstwirtschaft;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<Sonstige> sonstige;
    @XmlElement(name = "freizeitimmobilie_gewerblich")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<FreizeitimmobilieGewerblich> freizeitimmobilieGewerblich;
    @XmlElement(name = "zinshaus_renditeobjekt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected List<ZinshausRenditeobjekt> zinshausRenditeobjekt;

    /**
     * Gets the value of the zimmer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zimmer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZimmer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zimmer }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<Zimmer> getZimmer() {
        if (zimmer == null) {
            zimmer = new ArrayList<Zimmer>();
        }
        return this.zimmer;
    }

    /**
     * Gets the value of the wohnung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wohnung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWohnung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Wohnung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<Wohnung> getWohnung() {
        if (wohnung == null) {
            wohnung = new ArrayList<Wohnung>();
        }
        return this.wohnung;
    }

    /**
     * Gets the value of the haus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the haus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHaus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Haus }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<Haus> getHaus() {
        if (haus == null) {
            haus = new ArrayList<Haus>();
        }
        return this.haus;
    }

    /**
     * Gets the value of the grundstueck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grundstueck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrundstueck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Grundstueck }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<Grundstueck> getGrundstueck() {
        if (grundstueck == null) {
            grundstueck = new ArrayList<Grundstueck>();
        }
        return this.grundstueck;
    }

    /**
     * Gets the value of the bueroPraxen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bueroPraxen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBueroPraxen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BueroPraxen }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<BueroPraxen> getBueroPraxen() {
        if (bueroPraxen == null) {
            bueroPraxen = new ArrayList<BueroPraxen>();
        }
        return this.bueroPraxen;
    }

    /**
     * Gets the value of the einzelhandel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the einzelhandel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEinzelhandel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Einzelhandel }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<Einzelhandel> getEinzelhandel() {
        if (einzelhandel == null) {
            einzelhandel = new ArrayList<Einzelhandel>();
        }
        return this.einzelhandel;
    }

    /**
     * Gets the value of the gastgewerbe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gastgewerbe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGastgewerbe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Gastgewerbe }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<Gastgewerbe> getGastgewerbe() {
        if (gastgewerbe == null) {
            gastgewerbe = new ArrayList<Gastgewerbe>();
        }
        return this.gastgewerbe;
    }

    /**
     * Gets the value of the hallenLagerProd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hallenLagerProd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHallenLagerProd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HallenLagerProd }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<HallenLagerProd> getHallenLagerProd() {
        if (hallenLagerProd == null) {
            hallenLagerProd = new ArrayList<HallenLagerProd>();
        }
        return this.hallenLagerProd;
    }

    /**
     * Gets the value of the landUndForstwirtschaft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landUndForstwirtschaft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandUndForstwirtschaft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LandUndForstwirtschaft }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<LandUndForstwirtschaft> getLandUndForstwirtschaft() {
        if (landUndForstwirtschaft == null) {
            landUndForstwirtschaft = new ArrayList<LandUndForstwirtschaft>();
        }
        return this.landUndForstwirtschaft;
    }

    /**
     * Gets the value of the sonstige property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sonstige property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSonstige().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sonstige }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<Sonstige> getSonstige() {
        if (sonstige == null) {
            sonstige = new ArrayList<Sonstige>();
        }
        return this.sonstige;
    }

    /**
     * Gets the value of the freizeitimmobilieGewerblich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freizeitimmobilieGewerblich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreizeitimmobilieGewerblich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreizeitimmobilieGewerblich }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<FreizeitimmobilieGewerblich> getFreizeitimmobilieGewerblich() {
        if (freizeitimmobilieGewerblich == null) {
            freizeitimmobilieGewerblich = new ArrayList<FreizeitimmobilieGewerblich>();
        }
        return this.freizeitimmobilieGewerblich;
    }

    /**
     * Gets the value of the zinshausRenditeobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zinshausRenditeobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZinshausRenditeobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZinshausRenditeobjekt }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public List<ZinshausRenditeobjekt> getZinshausRenditeobjekt() {
        if (zinshausRenditeobjekt == null) {
            zinshausRenditeobjekt = new ArrayList<ZinshausRenditeobjekt>();
        }
        return this.zinshausRenditeobjekt;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<Zimmer> theZimmer;
            theZimmer = (((this.zimmer!= null)&&(!this.zimmer.isEmpty()))?this.getZimmer():null);
            strategy.appendField(locator, this, "zimmer", buffer, theZimmer, ((this.zimmer!= null)&&(!this.zimmer.isEmpty())));
        }
        {
            List<Wohnung> theWohnung;
            theWohnung = (((this.wohnung!= null)&&(!this.wohnung.isEmpty()))?this.getWohnung():null);
            strategy.appendField(locator, this, "wohnung", buffer, theWohnung, ((this.wohnung!= null)&&(!this.wohnung.isEmpty())));
        }
        {
            List<Haus> theHaus;
            theHaus = (((this.haus!= null)&&(!this.haus.isEmpty()))?this.getHaus():null);
            strategy.appendField(locator, this, "haus", buffer, theHaus, ((this.haus!= null)&&(!this.haus.isEmpty())));
        }
        {
            List<Grundstueck> theGrundstueck;
            theGrundstueck = (((this.grundstueck!= null)&&(!this.grundstueck.isEmpty()))?this.getGrundstueck():null);
            strategy.appendField(locator, this, "grundstueck", buffer, theGrundstueck, ((this.grundstueck!= null)&&(!this.grundstueck.isEmpty())));
        }
        {
            List<BueroPraxen> theBueroPraxen;
            theBueroPraxen = (((this.bueroPraxen!= null)&&(!this.bueroPraxen.isEmpty()))?this.getBueroPraxen():null);
            strategy.appendField(locator, this, "bueroPraxen", buffer, theBueroPraxen, ((this.bueroPraxen!= null)&&(!this.bueroPraxen.isEmpty())));
        }
        {
            List<Einzelhandel> theEinzelhandel;
            theEinzelhandel = (((this.einzelhandel!= null)&&(!this.einzelhandel.isEmpty()))?this.getEinzelhandel():null);
            strategy.appendField(locator, this, "einzelhandel", buffer, theEinzelhandel, ((this.einzelhandel!= null)&&(!this.einzelhandel.isEmpty())));
        }
        {
            List<Gastgewerbe> theGastgewerbe;
            theGastgewerbe = (((this.gastgewerbe!= null)&&(!this.gastgewerbe.isEmpty()))?this.getGastgewerbe():null);
            strategy.appendField(locator, this, "gastgewerbe", buffer, theGastgewerbe, ((this.gastgewerbe!= null)&&(!this.gastgewerbe.isEmpty())));
        }
        {
            List<HallenLagerProd> theHallenLagerProd;
            theHallenLagerProd = (((this.hallenLagerProd!= null)&&(!this.hallenLagerProd.isEmpty()))?this.getHallenLagerProd():null);
            strategy.appendField(locator, this, "hallenLagerProd", buffer, theHallenLagerProd, ((this.hallenLagerProd!= null)&&(!this.hallenLagerProd.isEmpty())));
        }
        {
            List<LandUndForstwirtschaft> theLandUndForstwirtschaft;
            theLandUndForstwirtschaft = (((this.landUndForstwirtschaft!= null)&&(!this.landUndForstwirtschaft.isEmpty()))?this.getLandUndForstwirtschaft():null);
            strategy.appendField(locator, this, "landUndForstwirtschaft", buffer, theLandUndForstwirtschaft, ((this.landUndForstwirtschaft!= null)&&(!this.landUndForstwirtschaft.isEmpty())));
        }
        {
            List<Sonstige> theSonstige;
            theSonstige = (((this.sonstige!= null)&&(!this.sonstige.isEmpty()))?this.getSonstige():null);
            strategy.appendField(locator, this, "sonstige", buffer, theSonstige, ((this.sonstige!= null)&&(!this.sonstige.isEmpty())));
        }
        {
            List<FreizeitimmobilieGewerblich> theFreizeitimmobilieGewerblich;
            theFreizeitimmobilieGewerblich = (((this.freizeitimmobilieGewerblich!= null)&&(!this.freizeitimmobilieGewerblich.isEmpty()))?this.getFreizeitimmobilieGewerblich():null);
            strategy.appendField(locator, this, "freizeitimmobilieGewerblich", buffer, theFreizeitimmobilieGewerblich, ((this.freizeitimmobilieGewerblich!= null)&&(!this.freizeitimmobilieGewerblich.isEmpty())));
        }
        {
            List<ZinshausRenditeobjekt> theZinshausRenditeobjekt;
            theZinshausRenditeobjekt = (((this.zinshausRenditeobjekt!= null)&&(!this.zinshausRenditeobjekt.isEmpty()))?this.getZinshausRenditeobjekt():null);
            strategy.appendField(locator, this, "zinshausRenditeobjekt", buffer, theZinshausRenditeobjekt, ((this.zinshausRenditeobjekt!= null)&&(!this.zinshausRenditeobjekt.isEmpty())));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Objektart) {
            final Objektart copy = ((Objektart) draftCopy);
            {
                Boolean zimmerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.zimmer!= null)&&(!this.zimmer.isEmpty())));
                if (zimmerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Zimmer> sourceZimmer;
                    sourceZimmer = (((this.zimmer!= null)&&(!this.zimmer.isEmpty()))?this.getZimmer():null);
                    @SuppressWarnings("unchecked")
                    List<Zimmer> copyZimmer = ((List<Zimmer> ) strategy.copy(LocatorUtils.property(locator, "zimmer", sourceZimmer), sourceZimmer, ((this.zimmer!= null)&&(!this.zimmer.isEmpty()))));
                    copy.zimmer = null;
                    if (copyZimmer!= null) {
                        List<Zimmer> uniqueZimmerl = copy.getZimmer();
                        uniqueZimmerl.addAll(copyZimmer);
                    }
                } else {
                    if (zimmerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zimmer = null;
                    }
                }
            }
            {
                Boolean wohnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.wohnung!= null)&&(!this.wohnung.isEmpty())));
                if (wohnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Wohnung> sourceWohnung;
                    sourceWohnung = (((this.wohnung!= null)&&(!this.wohnung.isEmpty()))?this.getWohnung():null);
                    @SuppressWarnings("unchecked")
                    List<Wohnung> copyWohnung = ((List<Wohnung> ) strategy.copy(LocatorUtils.property(locator, "wohnung", sourceWohnung), sourceWohnung, ((this.wohnung!= null)&&(!this.wohnung.isEmpty()))));
                    copy.wohnung = null;
                    if (copyWohnung!= null) {
                        List<Wohnung> uniqueWohnungl = copy.getWohnung();
                        uniqueWohnungl.addAll(copyWohnung);
                    }
                } else {
                    if (wohnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohnung = null;
                    }
                }
            }
            {
                Boolean hausShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.haus!= null)&&(!this.haus.isEmpty())));
                if (hausShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Haus> sourceHaus;
                    sourceHaus = (((this.haus!= null)&&(!this.haus.isEmpty()))?this.getHaus():null);
                    @SuppressWarnings("unchecked")
                    List<Haus> copyHaus = ((List<Haus> ) strategy.copy(LocatorUtils.property(locator, "haus", sourceHaus), sourceHaus, ((this.haus!= null)&&(!this.haus.isEmpty()))));
                    copy.haus = null;
                    if (copyHaus!= null) {
                        List<Haus> uniqueHausl = copy.getHaus();
                        uniqueHausl.addAll(copyHaus);
                    }
                } else {
                    if (hausShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.haus = null;
                    }
                }
            }
            {
                Boolean grundstueckShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.grundstueck!= null)&&(!this.grundstueck.isEmpty())));
                if (grundstueckShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Grundstueck> sourceGrundstueck;
                    sourceGrundstueck = (((this.grundstueck!= null)&&(!this.grundstueck.isEmpty()))?this.getGrundstueck():null);
                    @SuppressWarnings("unchecked")
                    List<Grundstueck> copyGrundstueck = ((List<Grundstueck> ) strategy.copy(LocatorUtils.property(locator, "grundstueck", sourceGrundstueck), sourceGrundstueck, ((this.grundstueck!= null)&&(!this.grundstueck.isEmpty()))));
                    copy.grundstueck = null;
                    if (copyGrundstueck!= null) {
                        List<Grundstueck> uniqueGrundstueckl = copy.getGrundstueck();
                        uniqueGrundstueckl.addAll(copyGrundstueck);
                    }
                } else {
                    if (grundstueckShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.grundstueck = null;
                    }
                }
            }
            {
                Boolean bueroPraxenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.bueroPraxen!= null)&&(!this.bueroPraxen.isEmpty())));
                if (bueroPraxenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<BueroPraxen> sourceBueroPraxen;
                    sourceBueroPraxen = (((this.bueroPraxen!= null)&&(!this.bueroPraxen.isEmpty()))?this.getBueroPraxen():null);
                    @SuppressWarnings("unchecked")
                    List<BueroPraxen> copyBueroPraxen = ((List<BueroPraxen> ) strategy.copy(LocatorUtils.property(locator, "bueroPraxen", sourceBueroPraxen), sourceBueroPraxen, ((this.bueroPraxen!= null)&&(!this.bueroPraxen.isEmpty()))));
                    copy.bueroPraxen = null;
                    if (copyBueroPraxen!= null) {
                        List<BueroPraxen> uniqueBueroPraxenl = copy.getBueroPraxen();
                        uniqueBueroPraxenl.addAll(copyBueroPraxen);
                    }
                } else {
                    if (bueroPraxenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bueroPraxen = null;
                    }
                }
            }
            {
                Boolean einzelhandelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.einzelhandel!= null)&&(!this.einzelhandel.isEmpty())));
                if (einzelhandelShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Einzelhandel> sourceEinzelhandel;
                    sourceEinzelhandel = (((this.einzelhandel!= null)&&(!this.einzelhandel.isEmpty()))?this.getEinzelhandel():null);
                    @SuppressWarnings("unchecked")
                    List<Einzelhandel> copyEinzelhandel = ((List<Einzelhandel> ) strategy.copy(LocatorUtils.property(locator, "einzelhandel", sourceEinzelhandel), sourceEinzelhandel, ((this.einzelhandel!= null)&&(!this.einzelhandel.isEmpty()))));
                    copy.einzelhandel = null;
                    if (copyEinzelhandel!= null) {
                        List<Einzelhandel> uniqueEinzelhandell = copy.getEinzelhandel();
                        uniqueEinzelhandell.addAll(copyEinzelhandel);
                    }
                } else {
                    if (einzelhandelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einzelhandel = null;
                    }
                }
            }
            {
                Boolean gastgewerbeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.gastgewerbe!= null)&&(!this.gastgewerbe.isEmpty())));
                if (gastgewerbeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Gastgewerbe> sourceGastgewerbe;
                    sourceGastgewerbe = (((this.gastgewerbe!= null)&&(!this.gastgewerbe.isEmpty()))?this.getGastgewerbe():null);
                    @SuppressWarnings("unchecked")
                    List<Gastgewerbe> copyGastgewerbe = ((List<Gastgewerbe> ) strategy.copy(LocatorUtils.property(locator, "gastgewerbe", sourceGastgewerbe), sourceGastgewerbe, ((this.gastgewerbe!= null)&&(!this.gastgewerbe.isEmpty()))));
                    copy.gastgewerbe = null;
                    if (copyGastgewerbe!= null) {
                        List<Gastgewerbe> uniqueGastgewerbel = copy.getGastgewerbe();
                        uniqueGastgewerbel.addAll(copyGastgewerbe);
                    }
                } else {
                    if (gastgewerbeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gastgewerbe = null;
                    }
                }
            }
            {
                Boolean hallenLagerProdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.hallenLagerProd!= null)&&(!this.hallenLagerProd.isEmpty())));
                if (hallenLagerProdShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<HallenLagerProd> sourceHallenLagerProd;
                    sourceHallenLagerProd = (((this.hallenLagerProd!= null)&&(!this.hallenLagerProd.isEmpty()))?this.getHallenLagerProd():null);
                    @SuppressWarnings("unchecked")
                    List<HallenLagerProd> copyHallenLagerProd = ((List<HallenLagerProd> ) strategy.copy(LocatorUtils.property(locator, "hallenLagerProd", sourceHallenLagerProd), sourceHallenLagerProd, ((this.hallenLagerProd!= null)&&(!this.hallenLagerProd.isEmpty()))));
                    copy.hallenLagerProd = null;
                    if (copyHallenLagerProd!= null) {
                        List<HallenLagerProd> uniqueHallenLagerProdl = copy.getHallenLagerProd();
                        uniqueHallenLagerProdl.addAll(copyHallenLagerProd);
                    }
                } else {
                    if (hallenLagerProdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hallenLagerProd = null;
                    }
                }
            }
            {
                Boolean landUndForstwirtschaftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.landUndForstwirtschaft!= null)&&(!this.landUndForstwirtschaft.isEmpty())));
                if (landUndForstwirtschaftShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<LandUndForstwirtschaft> sourceLandUndForstwirtschaft;
                    sourceLandUndForstwirtschaft = (((this.landUndForstwirtschaft!= null)&&(!this.landUndForstwirtschaft.isEmpty()))?this.getLandUndForstwirtschaft():null);
                    @SuppressWarnings("unchecked")
                    List<LandUndForstwirtschaft> copyLandUndForstwirtschaft = ((List<LandUndForstwirtschaft> ) strategy.copy(LocatorUtils.property(locator, "landUndForstwirtschaft", sourceLandUndForstwirtschaft), sourceLandUndForstwirtschaft, ((this.landUndForstwirtschaft!= null)&&(!this.landUndForstwirtschaft.isEmpty()))));
                    copy.landUndForstwirtschaft = null;
                    if (copyLandUndForstwirtschaft!= null) {
                        List<LandUndForstwirtschaft> uniqueLandUndForstwirtschaftl = copy.getLandUndForstwirtschaft();
                        uniqueLandUndForstwirtschaftl.addAll(copyLandUndForstwirtschaft);
                    }
                } else {
                    if (landUndForstwirtschaftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.landUndForstwirtschaft = null;
                    }
                }
            }
            {
                Boolean sonstigeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.sonstige!= null)&&(!this.sonstige.isEmpty())));
                if (sonstigeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Sonstige> sourceSonstige;
                    sourceSonstige = (((this.sonstige!= null)&&(!this.sonstige.isEmpty()))?this.getSonstige():null);
                    @SuppressWarnings("unchecked")
                    List<Sonstige> copySonstige = ((List<Sonstige> ) strategy.copy(LocatorUtils.property(locator, "sonstige", sourceSonstige), sourceSonstige, ((this.sonstige!= null)&&(!this.sonstige.isEmpty()))));
                    copy.sonstige = null;
                    if (copySonstige!= null) {
                        List<Sonstige> uniqueSonstigel = copy.getSonstige();
                        uniqueSonstigel.addAll(copySonstige);
                    }
                } else {
                    if (sonstigeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sonstige = null;
                    }
                }
            }
            {
                Boolean freizeitimmobilieGewerblichShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.freizeitimmobilieGewerblich!= null)&&(!this.freizeitimmobilieGewerblich.isEmpty())));
                if (freizeitimmobilieGewerblichShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<FreizeitimmobilieGewerblich> sourceFreizeitimmobilieGewerblich;
                    sourceFreizeitimmobilieGewerblich = (((this.freizeitimmobilieGewerblich!= null)&&(!this.freizeitimmobilieGewerblich.isEmpty()))?this.getFreizeitimmobilieGewerblich():null);
                    @SuppressWarnings("unchecked")
                    List<FreizeitimmobilieGewerblich> copyFreizeitimmobilieGewerblich = ((List<FreizeitimmobilieGewerblich> ) strategy.copy(LocatorUtils.property(locator, "freizeitimmobilieGewerblich", sourceFreizeitimmobilieGewerblich), sourceFreizeitimmobilieGewerblich, ((this.freizeitimmobilieGewerblich!= null)&&(!this.freizeitimmobilieGewerblich.isEmpty()))));
                    copy.freizeitimmobilieGewerblich = null;
                    if (copyFreizeitimmobilieGewerblich!= null) {
                        List<FreizeitimmobilieGewerblich> uniqueFreizeitimmobilieGewerblichl = copy.getFreizeitimmobilieGewerblich();
                        uniqueFreizeitimmobilieGewerblichl.addAll(copyFreizeitimmobilieGewerblich);
                    }
                } else {
                    if (freizeitimmobilieGewerblichShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freizeitimmobilieGewerblich = null;
                    }
                }
            }
            {
                Boolean zinshausRenditeobjektShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.zinshausRenditeobjekt!= null)&&(!this.zinshausRenditeobjekt.isEmpty())));
                if (zinshausRenditeobjektShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ZinshausRenditeobjekt> sourceZinshausRenditeobjekt;
                    sourceZinshausRenditeobjekt = (((this.zinshausRenditeobjekt!= null)&&(!this.zinshausRenditeobjekt.isEmpty()))?this.getZinshausRenditeobjekt():null);
                    @SuppressWarnings("unchecked")
                    List<ZinshausRenditeobjekt> copyZinshausRenditeobjekt = ((List<ZinshausRenditeobjekt> ) strategy.copy(LocatorUtils.property(locator, "zinshausRenditeobjekt", sourceZinshausRenditeobjekt), sourceZinshausRenditeobjekt, ((this.zinshausRenditeobjekt!= null)&&(!this.zinshausRenditeobjekt.isEmpty()))));
                    copy.zinshausRenditeobjekt = null;
                    if (copyZinshausRenditeobjekt!= null) {
                        List<ZinshausRenditeobjekt> uniqueZinshausRenditeobjektl = copy.getZinshausRenditeobjekt();
                        uniqueZinshausRenditeobjektl.addAll(copyZinshausRenditeobjekt);
                    }
                } else {
                    if (zinshausRenditeobjektShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zinshausRenditeobjekt = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Objektart();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Objektart that = ((Objektart) object);
        {
            List<Zimmer> lhsZimmer;
            lhsZimmer = (((this.zimmer!= null)&&(!this.zimmer.isEmpty()))?this.getZimmer():null);
            List<Zimmer> rhsZimmer;
            rhsZimmer = (((that.zimmer!= null)&&(!that.zimmer.isEmpty()))?that.getZimmer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zimmer", lhsZimmer), LocatorUtils.property(thatLocator, "zimmer", rhsZimmer), lhsZimmer, rhsZimmer, ((this.zimmer!= null)&&(!this.zimmer.isEmpty())), ((that.zimmer!= null)&&(!that.zimmer.isEmpty())))) {
                return false;
            }
        }
        {
            List<Wohnung> lhsWohnung;
            lhsWohnung = (((this.wohnung!= null)&&(!this.wohnung.isEmpty()))?this.getWohnung():null);
            List<Wohnung> rhsWohnung;
            rhsWohnung = (((that.wohnung!= null)&&(!that.wohnung.isEmpty()))?that.getWohnung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnung", lhsWohnung), LocatorUtils.property(thatLocator, "wohnung", rhsWohnung), lhsWohnung, rhsWohnung, ((this.wohnung!= null)&&(!this.wohnung.isEmpty())), ((that.wohnung!= null)&&(!that.wohnung.isEmpty())))) {
                return false;
            }
        }
        {
            List<Haus> lhsHaus;
            lhsHaus = (((this.haus!= null)&&(!this.haus.isEmpty()))?this.getHaus():null);
            List<Haus> rhsHaus;
            rhsHaus = (((that.haus!= null)&&(!that.haus.isEmpty()))?that.getHaus():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haus", lhsHaus), LocatorUtils.property(thatLocator, "haus", rhsHaus), lhsHaus, rhsHaus, ((this.haus!= null)&&(!this.haus.isEmpty())), ((that.haus!= null)&&(!that.haus.isEmpty())))) {
                return false;
            }
        }
        {
            List<Grundstueck> lhsGrundstueck;
            lhsGrundstueck = (((this.grundstueck!= null)&&(!this.grundstueck.isEmpty()))?this.getGrundstueck():null);
            List<Grundstueck> rhsGrundstueck;
            rhsGrundstueck = (((that.grundstueck!= null)&&(!that.grundstueck.isEmpty()))?that.getGrundstueck():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundstueck", lhsGrundstueck), LocatorUtils.property(thatLocator, "grundstueck", rhsGrundstueck), lhsGrundstueck, rhsGrundstueck, ((this.grundstueck!= null)&&(!this.grundstueck.isEmpty())), ((that.grundstueck!= null)&&(!that.grundstueck.isEmpty())))) {
                return false;
            }
        }
        {
            List<BueroPraxen> lhsBueroPraxen;
            lhsBueroPraxen = (((this.bueroPraxen!= null)&&(!this.bueroPraxen.isEmpty()))?this.getBueroPraxen():null);
            List<BueroPraxen> rhsBueroPraxen;
            rhsBueroPraxen = (((that.bueroPraxen!= null)&&(!that.bueroPraxen.isEmpty()))?that.getBueroPraxen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bueroPraxen", lhsBueroPraxen), LocatorUtils.property(thatLocator, "bueroPraxen", rhsBueroPraxen), lhsBueroPraxen, rhsBueroPraxen, ((this.bueroPraxen!= null)&&(!this.bueroPraxen.isEmpty())), ((that.bueroPraxen!= null)&&(!that.bueroPraxen.isEmpty())))) {
                return false;
            }
        }
        {
            List<Einzelhandel> lhsEinzelhandel;
            lhsEinzelhandel = (((this.einzelhandel!= null)&&(!this.einzelhandel.isEmpty()))?this.getEinzelhandel():null);
            List<Einzelhandel> rhsEinzelhandel;
            rhsEinzelhandel = (((that.einzelhandel!= null)&&(!that.einzelhandel.isEmpty()))?that.getEinzelhandel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einzelhandel", lhsEinzelhandel), LocatorUtils.property(thatLocator, "einzelhandel", rhsEinzelhandel), lhsEinzelhandel, rhsEinzelhandel, ((this.einzelhandel!= null)&&(!this.einzelhandel.isEmpty())), ((that.einzelhandel!= null)&&(!that.einzelhandel.isEmpty())))) {
                return false;
            }
        }
        {
            List<Gastgewerbe> lhsGastgewerbe;
            lhsGastgewerbe = (((this.gastgewerbe!= null)&&(!this.gastgewerbe.isEmpty()))?this.getGastgewerbe():null);
            List<Gastgewerbe> rhsGastgewerbe;
            rhsGastgewerbe = (((that.gastgewerbe!= null)&&(!that.gastgewerbe.isEmpty()))?that.getGastgewerbe():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastgewerbe", lhsGastgewerbe), LocatorUtils.property(thatLocator, "gastgewerbe", rhsGastgewerbe), lhsGastgewerbe, rhsGastgewerbe, ((this.gastgewerbe!= null)&&(!this.gastgewerbe.isEmpty())), ((that.gastgewerbe!= null)&&(!that.gastgewerbe.isEmpty())))) {
                return false;
            }
        }
        {
            List<HallenLagerProd> lhsHallenLagerProd;
            lhsHallenLagerProd = (((this.hallenLagerProd!= null)&&(!this.hallenLagerProd.isEmpty()))?this.getHallenLagerProd():null);
            List<HallenLagerProd> rhsHallenLagerProd;
            rhsHallenLagerProd = (((that.hallenLagerProd!= null)&&(!that.hallenLagerProd.isEmpty()))?that.getHallenLagerProd():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hallenLagerProd", lhsHallenLagerProd), LocatorUtils.property(thatLocator, "hallenLagerProd", rhsHallenLagerProd), lhsHallenLagerProd, rhsHallenLagerProd, ((this.hallenLagerProd!= null)&&(!this.hallenLagerProd.isEmpty())), ((that.hallenLagerProd!= null)&&(!that.hallenLagerProd.isEmpty())))) {
                return false;
            }
        }
        {
            List<LandUndForstwirtschaft> lhsLandUndForstwirtschaft;
            lhsLandUndForstwirtschaft = (((this.landUndForstwirtschaft!= null)&&(!this.landUndForstwirtschaft.isEmpty()))?this.getLandUndForstwirtschaft():null);
            List<LandUndForstwirtschaft> rhsLandUndForstwirtschaft;
            rhsLandUndForstwirtschaft = (((that.landUndForstwirtschaft!= null)&&(!that.landUndForstwirtschaft.isEmpty()))?that.getLandUndForstwirtschaft():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "landUndForstwirtschaft", lhsLandUndForstwirtschaft), LocatorUtils.property(thatLocator, "landUndForstwirtschaft", rhsLandUndForstwirtschaft), lhsLandUndForstwirtschaft, rhsLandUndForstwirtschaft, ((this.landUndForstwirtschaft!= null)&&(!this.landUndForstwirtschaft.isEmpty())), ((that.landUndForstwirtschaft!= null)&&(!that.landUndForstwirtschaft.isEmpty())))) {
                return false;
            }
        }
        {
            List<Sonstige> lhsSonstige;
            lhsSonstige = (((this.sonstige!= null)&&(!this.sonstige.isEmpty()))?this.getSonstige():null);
            List<Sonstige> rhsSonstige;
            rhsSonstige = (((that.sonstige!= null)&&(!that.sonstige.isEmpty()))?that.getSonstige():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstige", lhsSonstige), LocatorUtils.property(thatLocator, "sonstige", rhsSonstige), lhsSonstige, rhsSonstige, ((this.sonstige!= null)&&(!this.sonstige.isEmpty())), ((that.sonstige!= null)&&(!that.sonstige.isEmpty())))) {
                return false;
            }
        }
        {
            List<FreizeitimmobilieGewerblich> lhsFreizeitimmobilieGewerblich;
            lhsFreizeitimmobilieGewerblich = (((this.freizeitimmobilieGewerblich!= null)&&(!this.freizeitimmobilieGewerblich.isEmpty()))?this.getFreizeitimmobilieGewerblich():null);
            List<FreizeitimmobilieGewerblich> rhsFreizeitimmobilieGewerblich;
            rhsFreizeitimmobilieGewerblich = (((that.freizeitimmobilieGewerblich!= null)&&(!that.freizeitimmobilieGewerblich.isEmpty()))?that.getFreizeitimmobilieGewerblich():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freizeitimmobilieGewerblich", lhsFreizeitimmobilieGewerblich), LocatorUtils.property(thatLocator, "freizeitimmobilieGewerblich", rhsFreizeitimmobilieGewerblich), lhsFreizeitimmobilieGewerblich, rhsFreizeitimmobilieGewerblich, ((this.freizeitimmobilieGewerblich!= null)&&(!this.freizeitimmobilieGewerblich.isEmpty())), ((that.freizeitimmobilieGewerblich!= null)&&(!that.freizeitimmobilieGewerblich.isEmpty())))) {
                return false;
            }
        }
        {
            List<ZinshausRenditeobjekt> lhsZinshausRenditeobjekt;
            lhsZinshausRenditeobjekt = (((this.zinshausRenditeobjekt!= null)&&(!this.zinshausRenditeobjekt.isEmpty()))?this.getZinshausRenditeobjekt():null);
            List<ZinshausRenditeobjekt> rhsZinshausRenditeobjekt;
            rhsZinshausRenditeobjekt = (((that.zinshausRenditeobjekt!= null)&&(!that.zinshausRenditeobjekt.isEmpty()))?that.getZinshausRenditeobjekt():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zinshausRenditeobjekt", lhsZinshausRenditeobjekt), LocatorUtils.property(thatLocator, "zinshausRenditeobjekt", rhsZinshausRenditeobjekt), lhsZinshausRenditeobjekt, rhsZinshausRenditeobjekt, ((this.zinshausRenditeobjekt!= null)&&(!this.zinshausRenditeobjekt.isEmpty())), ((that.zinshausRenditeobjekt!= null)&&(!that.zinshausRenditeobjekt.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
