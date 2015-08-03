
package org.openestate.io.openimmo.xml;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * Java class for &lt;energiepass&gt; element.
 *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "epart",
    "gueltigBis",
    "energieverbrauchkennwert",
    "mitwarmwasser",
    "endenergiebedarf",
    "primaerenergietraeger",
    "stromwert",
    "waermewert",
    "wertklasse",
    "baujahr",
    "ausstelldatum",
    "jahrgang",
    "gebaeudeart",
    "epasstext",
    "hwbwert",
    "hwbklasse",
    "fgeewert",
    "fgeeklasse"
})
@XmlRootElement(name = "energiepass")
public class Energiepass
    implements Cloneable, CopyTo, Equals, ToString
{

    protected Energiepass.Epart epart;
    @XmlElement(name = "gueltig_bis")
    protected String gueltigBis;
    protected String energieverbrauchkennwert;
    protected Boolean mitwarmwasser;
    protected String endenergiebedarf;
    protected String primaerenergietraeger;
    protected String stromwert;
    protected String waermewert;
    protected String wertklasse;
    protected String baujahr;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    protected Calendar ausstelldatum;
    protected Energiepass.Jahrgang jahrgang;
    protected Energiepass.Gebaeudeart gebaeudeart;
    protected String epasstext;
    protected String hwbwert;
    protected String hwbklasse;
    protected String fgeewert;
    protected String fgeeklasse;

    /**
     * Gets the value of the epart property.
     *
     * @return
     *     possible object is
     *     {@link Energiepass.Epart }
     *
     */
    public Energiepass.Epart getEpart() {
        return epart;
    }

    /**
     * Sets the value of the epart property.
     *
     * @param value
     *     allowed object is
     *     {@link Energiepass.Epart }
     *
     */
    public void setEpart(Energiepass.Epart value) {
        this.epart = value;
    }

    /**
     * Gets the value of the gueltigBis property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGueltigBis() {
        return gueltigBis;
    }

    /**
     * Sets the value of the gueltigBis property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGueltigBis(String value) {
        this.gueltigBis = value;
    }

    /**
     * Gets the value of the energieverbrauchkennwert property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEnergieverbrauchkennwert() {
        return energieverbrauchkennwert;
    }

    /**
     * Sets the value of the energieverbrauchkennwert property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEnergieverbrauchkennwert(String value) {
        this.energieverbrauchkennwert = value;
    }

    /**
     * Gets the value of the mitwarmwasser property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isMitwarmwasser() {
        return mitwarmwasser;
    }

    /**
     * Sets the value of the mitwarmwasser property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMitwarmwasser(Boolean value) {
        this.mitwarmwasser = value;
    }

    /**
     * Gets the value of the endenergiebedarf property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEndenergiebedarf() {
        return endenergiebedarf;
    }

    /**
     * Sets the value of the endenergiebedarf property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEndenergiebedarf(String value) {
        this.endenergiebedarf = value;
    }

    /**
     * Gets the value of the primaerenergietraeger property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrimaerenergietraeger() {
        return primaerenergietraeger;
    }

    /**
     * Sets the value of the primaerenergietraeger property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrimaerenergietraeger(String value) {
        this.primaerenergietraeger = value;
    }

    /**
     * Gets the value of the stromwert property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStromwert() {
        return stromwert;
    }

    /**
     * Sets the value of the stromwert property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStromwert(String value) {
        this.stromwert = value;
    }

    /**
     * Gets the value of the waermewert property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWaermewert() {
        return waermewert;
    }

    /**
     * Sets the value of the waermewert property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWaermewert(String value) {
        this.waermewert = value;
    }

    /**
     * Gets the value of the wertklasse property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWertklasse() {
        return wertklasse;
    }

    /**
     * Sets the value of the wertklasse property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWertklasse(String value) {
        this.wertklasse = value;
    }

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
     * Gets the value of the ausstelldatum property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Calendar getAusstelldatum() {
        return ausstelldatum;
    }

    /**
     * Sets the value of the ausstelldatum property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAusstelldatum(Calendar value) {
        this.ausstelldatum = value;
    }

    /**
     * Gets the value of the jahrgang property.
     *
     * @return
     *     possible object is
     *     {@link Energiepass.Jahrgang }
     *
     */
    public Energiepass.Jahrgang getJahrgang() {
        return jahrgang;
    }

    /**
     * Sets the value of the jahrgang property.
     *
     * @param value
     *     allowed object is
     *     {@link Energiepass.Jahrgang }
     *
     */
    public void setJahrgang(Energiepass.Jahrgang value) {
        this.jahrgang = value;
    }

    /**
     * Gets the value of the gebaeudeart property.
     *
     * @return
     *     possible object is
     *     {@link Energiepass.Gebaeudeart }
     *
     */
    public Energiepass.Gebaeudeart getGebaeudeart() {
        return gebaeudeart;
    }

    /**
     * Sets the value of the gebaeudeart property.
     *
     * @param value
     *     allowed object is
     *     {@link Energiepass.Gebaeudeart }
     *
     */
    public void setGebaeudeart(Energiepass.Gebaeudeart value) {
        this.gebaeudeart = value;
    }

    /**
     * Gets the value of the epasstext property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEpasstext() {
        return epasstext;
    }

    /**
     * Sets the value of the epasstext property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEpasstext(String value) {
        this.epasstext = value;
    }

    /**
     * Gets the value of the hwbwert property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHwbwert() {
        return hwbwert;
    }

    /**
     * Sets the value of the hwbwert property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHwbwert(String value) {
        this.hwbwert = value;
    }

    /**
     * Gets the value of the hwbklasse property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHwbklasse() {
        return hwbklasse;
    }

    /**
     * Sets the value of the hwbklasse property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHwbklasse(String value) {
        this.hwbklasse = value;
    }

    /**
     * Gets the value of the fgeewert property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFgeewert() {
        return fgeewert;
    }

    /**
     * Sets the value of the fgeewert property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFgeewert(String value) {
        this.fgeewert = value;
    }

    /**
     * Gets the value of the fgeeklasse property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFgeeklasse() {
        return fgeeklasse;
    }

    /**
     * Sets the value of the fgeeklasse property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFgeeklasse(String value) {
        this.fgeeklasse = value;
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
            Energiepass.Epart theEpart;
            theEpart = this.getEpart();
            strategy.appendField(locator, this, "epart", buffer, theEpart);
        }
        {
            String theGueltigBis;
            theGueltigBis = this.getGueltigBis();
            strategy.appendField(locator, this, "gueltigBis", buffer, theGueltigBis);
        }
        {
            String theEnergieverbrauchkennwert;
            theEnergieverbrauchkennwert = this.getEnergieverbrauchkennwert();
            strategy.appendField(locator, this, "energieverbrauchkennwert", buffer, theEnergieverbrauchkennwert);
        }
        {
            Boolean theMitwarmwasser;
            theMitwarmwasser = this.isMitwarmwasser();
            strategy.appendField(locator, this, "mitwarmwasser", buffer, theMitwarmwasser);
        }
        {
            String theEndenergiebedarf;
            theEndenergiebedarf = this.getEndenergiebedarf();
            strategy.appendField(locator, this, "endenergiebedarf", buffer, theEndenergiebedarf);
        }
        {
            String thePrimaerenergietraeger;
            thePrimaerenergietraeger = this.getPrimaerenergietraeger();
            strategy.appendField(locator, this, "primaerenergietraeger", buffer, thePrimaerenergietraeger);
        }
        {
            String theStromwert;
            theStromwert = this.getStromwert();
            strategy.appendField(locator, this, "stromwert", buffer, theStromwert);
        }
        {
            String theWaermewert;
            theWaermewert = this.getWaermewert();
            strategy.appendField(locator, this, "waermewert", buffer, theWaermewert);
        }
        {
            String theWertklasse;
            theWertklasse = this.getWertklasse();
            strategy.appendField(locator, this, "wertklasse", buffer, theWertklasse);
        }
        {
            String theBaujahr;
            theBaujahr = this.getBaujahr();
            strategy.appendField(locator, this, "baujahr", buffer, theBaujahr);
        }
        {
            Calendar theAusstelldatum;
            theAusstelldatum = this.getAusstelldatum();
            strategy.appendField(locator, this, "ausstelldatum", buffer, theAusstelldatum);
        }
        {
            Energiepass.Jahrgang theJahrgang;
            theJahrgang = this.getJahrgang();
            strategy.appendField(locator, this, "jahrgang", buffer, theJahrgang);
        }
        {
            Energiepass.Gebaeudeart theGebaeudeart;
            theGebaeudeart = this.getGebaeudeart();
            strategy.appendField(locator, this, "gebaeudeart", buffer, theGebaeudeart);
        }
        {
            String theEpasstext;
            theEpasstext = this.getEpasstext();
            strategy.appendField(locator, this, "epasstext", buffer, theEpasstext);
        }
        {
            String theHwbwert;
            theHwbwert = this.getHwbwert();
            strategy.appendField(locator, this, "hwbwert", buffer, theHwbwert);
        }
        {
            String theHwbklasse;
            theHwbklasse = this.getHwbklasse();
            strategy.appendField(locator, this, "hwbklasse", buffer, theHwbklasse);
        }
        {
            String theFgeewert;
            theFgeewert = this.getFgeewert();
            strategy.appendField(locator, this, "fgeewert", buffer, theFgeewert);
        }
        {
            String theFgeeklasse;
            theFgeeklasse = this.getFgeeklasse();
            strategy.appendField(locator, this, "fgeeklasse", buffer, theFgeeklasse);
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
        if (draftCopy instanceof Energiepass) {
            final Energiepass copy = ((Energiepass) draftCopy);
            if (this.epart!= null) {
                Energiepass.Epart sourceEpart;
                sourceEpart = this.getEpart();
                Energiepass.Epart copyEpart = ((Energiepass.Epart) strategy.copy(LocatorUtils.property(locator, "epart", sourceEpart), sourceEpart));
                copy.setEpart(copyEpart);
            } else {
                copy.epart = null;
            }
            if (this.gueltigBis!= null) {
                String sourceGueltigBis;
                sourceGueltigBis = this.getGueltigBis();
                String copyGueltigBis = ((String) strategy.copy(LocatorUtils.property(locator, "gueltigBis", sourceGueltigBis), sourceGueltigBis));
                copy.setGueltigBis(copyGueltigBis);
            } else {
                copy.gueltigBis = null;
            }
            if (this.energieverbrauchkennwert!= null) {
                String sourceEnergieverbrauchkennwert;
                sourceEnergieverbrauchkennwert = this.getEnergieverbrauchkennwert();
                String copyEnergieverbrauchkennwert = ((String) strategy.copy(LocatorUtils.property(locator, "energieverbrauchkennwert", sourceEnergieverbrauchkennwert), sourceEnergieverbrauchkennwert));
                copy.setEnergieverbrauchkennwert(copyEnergieverbrauchkennwert);
            } else {
                copy.energieverbrauchkennwert = null;
            }
            if (this.mitwarmwasser!= null) {
                Boolean sourceMitwarmwasser;
                sourceMitwarmwasser = this.isMitwarmwasser();
                Boolean copyMitwarmwasser = ((Boolean) strategy.copy(LocatorUtils.property(locator, "mitwarmwasser", sourceMitwarmwasser), sourceMitwarmwasser));
                copy.setMitwarmwasser(copyMitwarmwasser);
            } else {
                copy.mitwarmwasser = null;
            }
            if (this.endenergiebedarf!= null) {
                String sourceEndenergiebedarf;
                sourceEndenergiebedarf = this.getEndenergiebedarf();
                String copyEndenergiebedarf = ((String) strategy.copy(LocatorUtils.property(locator, "endenergiebedarf", sourceEndenergiebedarf), sourceEndenergiebedarf));
                copy.setEndenergiebedarf(copyEndenergiebedarf);
            } else {
                copy.endenergiebedarf = null;
            }
            if (this.primaerenergietraeger!= null) {
                String sourcePrimaerenergietraeger;
                sourcePrimaerenergietraeger = this.getPrimaerenergietraeger();
                String copyPrimaerenergietraeger = ((String) strategy.copy(LocatorUtils.property(locator, "primaerenergietraeger", sourcePrimaerenergietraeger), sourcePrimaerenergietraeger));
                copy.setPrimaerenergietraeger(copyPrimaerenergietraeger);
            } else {
                copy.primaerenergietraeger = null;
            }
            if (this.stromwert!= null) {
                String sourceStromwert;
                sourceStromwert = this.getStromwert();
                String copyStromwert = ((String) strategy.copy(LocatorUtils.property(locator, "stromwert", sourceStromwert), sourceStromwert));
                copy.setStromwert(copyStromwert);
            } else {
                copy.stromwert = null;
            }
            if (this.waermewert!= null) {
                String sourceWaermewert;
                sourceWaermewert = this.getWaermewert();
                String copyWaermewert = ((String) strategy.copy(LocatorUtils.property(locator, "waermewert", sourceWaermewert), sourceWaermewert));
                copy.setWaermewert(copyWaermewert);
            } else {
                copy.waermewert = null;
            }
            if (this.wertklasse!= null) {
                String sourceWertklasse;
                sourceWertklasse = this.getWertklasse();
                String copyWertklasse = ((String) strategy.copy(LocatorUtils.property(locator, "wertklasse", sourceWertklasse), sourceWertklasse));
                copy.setWertklasse(copyWertklasse);
            } else {
                copy.wertklasse = null;
            }
            if (this.baujahr!= null) {
                String sourceBaujahr;
                sourceBaujahr = this.getBaujahr();
                String copyBaujahr = ((String) strategy.copy(LocatorUtils.property(locator, "baujahr", sourceBaujahr), sourceBaujahr));
                copy.setBaujahr(copyBaujahr);
            } else {
                copy.baujahr = null;
            }
            if (this.ausstelldatum!= null) {
                Calendar sourceAusstelldatum;
                sourceAusstelldatum = this.getAusstelldatum();
                Calendar copyAusstelldatum = ((Calendar) strategy.copy(LocatorUtils.property(locator, "ausstelldatum", sourceAusstelldatum), sourceAusstelldatum));
                copy.setAusstelldatum(copyAusstelldatum);
            } else {
                copy.ausstelldatum = null;
            }
            if (this.jahrgang!= null) {
                Energiepass.Jahrgang sourceJahrgang;
                sourceJahrgang = this.getJahrgang();
                Energiepass.Jahrgang copyJahrgang = ((Energiepass.Jahrgang) strategy.copy(LocatorUtils.property(locator, "jahrgang", sourceJahrgang), sourceJahrgang));
                copy.setJahrgang(copyJahrgang);
            } else {
                copy.jahrgang = null;
            }
            if (this.gebaeudeart!= null) {
                Energiepass.Gebaeudeart sourceGebaeudeart;
                sourceGebaeudeart = this.getGebaeudeart();
                Energiepass.Gebaeudeart copyGebaeudeart = ((Energiepass.Gebaeudeart) strategy.copy(LocatorUtils.property(locator, "gebaeudeart", sourceGebaeudeart), sourceGebaeudeart));
                copy.setGebaeudeart(copyGebaeudeart);
            } else {
                copy.gebaeudeart = null;
            }
            if (this.epasstext!= null) {
                String sourceEpasstext;
                sourceEpasstext = this.getEpasstext();
                String copyEpasstext = ((String) strategy.copy(LocatorUtils.property(locator, "epasstext", sourceEpasstext), sourceEpasstext));
                copy.setEpasstext(copyEpasstext);
            } else {
                copy.epasstext = null;
            }
            if (this.hwbwert!= null) {
                String sourceHwbwert;
                sourceHwbwert = this.getHwbwert();
                String copyHwbwert = ((String) strategy.copy(LocatorUtils.property(locator, "hwbwert", sourceHwbwert), sourceHwbwert));
                copy.setHwbwert(copyHwbwert);
            } else {
                copy.hwbwert = null;
            }
            if (this.hwbklasse!= null) {
                String sourceHwbklasse;
                sourceHwbklasse = this.getHwbklasse();
                String copyHwbklasse = ((String) strategy.copy(LocatorUtils.property(locator, "hwbklasse", sourceHwbklasse), sourceHwbklasse));
                copy.setHwbklasse(copyHwbklasse);
            } else {
                copy.hwbklasse = null;
            }
            if (this.fgeewert!= null) {
                String sourceFgeewert;
                sourceFgeewert = this.getFgeewert();
                String copyFgeewert = ((String) strategy.copy(LocatorUtils.property(locator, "fgeewert", sourceFgeewert), sourceFgeewert));
                copy.setFgeewert(copyFgeewert);
            } else {
                copy.fgeewert = null;
            }
            if (this.fgeeklasse!= null) {
                String sourceFgeeklasse;
                sourceFgeeklasse = this.getFgeeklasse();
                String copyFgeeklasse = ((String) strategy.copy(LocatorUtils.property(locator, "fgeeklasse", sourceFgeeklasse), sourceFgeeklasse));
                copy.setFgeeklasse(copyFgeeklasse);
            } else {
                copy.fgeeklasse = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Energiepass();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Energiepass)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Energiepass that = ((Energiepass) object);
        {
            Energiepass.Epart lhsEpart;
            lhsEpart = this.getEpart();
            Energiepass.Epart rhsEpart;
            rhsEpart = that.getEpart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "epart", lhsEpart), LocatorUtils.property(thatLocator, "epart", rhsEpart), lhsEpart, rhsEpart)) {
                return false;
            }
        }
        {
            String lhsGueltigBis;
            lhsGueltigBis = this.getGueltigBis();
            String rhsGueltigBis;
            rhsGueltigBis = that.getGueltigBis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gueltigBis", lhsGueltigBis), LocatorUtils.property(thatLocator, "gueltigBis", rhsGueltigBis), lhsGueltigBis, rhsGueltigBis)) {
                return false;
            }
        }
        {
            String lhsEnergieverbrauchkennwert;
            lhsEnergieverbrauchkennwert = this.getEnergieverbrauchkennwert();
            String rhsEnergieverbrauchkennwert;
            rhsEnergieverbrauchkennwert = that.getEnergieverbrauchkennwert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieverbrauchkennwert", lhsEnergieverbrauchkennwert), LocatorUtils.property(thatLocator, "energieverbrauchkennwert", rhsEnergieverbrauchkennwert), lhsEnergieverbrauchkennwert, rhsEnergieverbrauchkennwert)) {
                return false;
            }
        }
        {
            Boolean lhsMitwarmwasser;
            lhsMitwarmwasser = this.isMitwarmwasser();
            Boolean rhsMitwarmwasser;
            rhsMitwarmwasser = that.isMitwarmwasser();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mitwarmwasser", lhsMitwarmwasser), LocatorUtils.property(thatLocator, "mitwarmwasser", rhsMitwarmwasser), lhsMitwarmwasser, rhsMitwarmwasser)) {
                return false;
            }
        }
        {
            String lhsEndenergiebedarf;
            lhsEndenergiebedarf = this.getEndenergiebedarf();
            String rhsEndenergiebedarf;
            rhsEndenergiebedarf = that.getEndenergiebedarf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endenergiebedarf", lhsEndenergiebedarf), LocatorUtils.property(thatLocator, "endenergiebedarf", rhsEndenergiebedarf), lhsEndenergiebedarf, rhsEndenergiebedarf)) {
                return false;
            }
        }
        {
            String lhsPrimaerenergietraeger;
            lhsPrimaerenergietraeger = this.getPrimaerenergietraeger();
            String rhsPrimaerenergietraeger;
            rhsPrimaerenergietraeger = that.getPrimaerenergietraeger();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaerenergietraeger", lhsPrimaerenergietraeger), LocatorUtils.property(thatLocator, "primaerenergietraeger", rhsPrimaerenergietraeger), lhsPrimaerenergietraeger, rhsPrimaerenergietraeger)) {
                return false;
            }
        }
        {
            String lhsStromwert;
            lhsStromwert = this.getStromwert();
            String rhsStromwert;
            rhsStromwert = that.getStromwert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stromwert", lhsStromwert), LocatorUtils.property(thatLocator, "stromwert", rhsStromwert), lhsStromwert, rhsStromwert)) {
                return false;
            }
        }
        {
            String lhsWaermewert;
            lhsWaermewert = this.getWaermewert();
            String rhsWaermewert;
            rhsWaermewert = that.getWaermewert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waermewert", lhsWaermewert), LocatorUtils.property(thatLocator, "waermewert", rhsWaermewert), lhsWaermewert, rhsWaermewert)) {
                return false;
            }
        }
        {
            String lhsWertklasse;
            lhsWertklasse = this.getWertklasse();
            String rhsWertklasse;
            rhsWertklasse = that.getWertklasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wertklasse", lhsWertklasse), LocatorUtils.property(thatLocator, "wertklasse", rhsWertklasse), lhsWertklasse, rhsWertklasse)) {
                return false;
            }
        }
        {
            String lhsBaujahr;
            lhsBaujahr = this.getBaujahr();
            String rhsBaujahr;
            rhsBaujahr = that.getBaujahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baujahr", lhsBaujahr), LocatorUtils.property(thatLocator, "baujahr", rhsBaujahr), lhsBaujahr, rhsBaujahr)) {
                return false;
            }
        }
        {
            Calendar lhsAusstelldatum;
            lhsAusstelldatum = this.getAusstelldatum();
            Calendar rhsAusstelldatum;
            rhsAusstelldatum = that.getAusstelldatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausstelldatum", lhsAusstelldatum), LocatorUtils.property(thatLocator, "ausstelldatum", rhsAusstelldatum), lhsAusstelldatum, rhsAusstelldatum)) {
                return false;
            }
        }
        {
            Energiepass.Jahrgang lhsJahrgang;
            lhsJahrgang = this.getJahrgang();
            Energiepass.Jahrgang rhsJahrgang;
            rhsJahrgang = that.getJahrgang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jahrgang", lhsJahrgang), LocatorUtils.property(thatLocator, "jahrgang", rhsJahrgang), lhsJahrgang, rhsJahrgang)) {
                return false;
            }
        }
        {
            Energiepass.Gebaeudeart lhsGebaeudeart;
            lhsGebaeudeart = this.getGebaeudeart();
            Energiepass.Gebaeudeart rhsGebaeudeart;
            rhsGebaeudeart = that.getGebaeudeart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gebaeudeart", lhsGebaeudeart), LocatorUtils.property(thatLocator, "gebaeudeart", rhsGebaeudeart), lhsGebaeudeart, rhsGebaeudeart)) {
                return false;
            }
        }
        {
            String lhsEpasstext;
            lhsEpasstext = this.getEpasstext();
            String rhsEpasstext;
            rhsEpasstext = that.getEpasstext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "epasstext", lhsEpasstext), LocatorUtils.property(thatLocator, "epasstext", rhsEpasstext), lhsEpasstext, rhsEpasstext)) {
                return false;
            }
        }
        {
            String lhsHwbwert;
            lhsHwbwert = this.getHwbwert();
            String rhsHwbwert;
            rhsHwbwert = that.getHwbwert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hwbwert", lhsHwbwert), LocatorUtils.property(thatLocator, "hwbwert", rhsHwbwert), lhsHwbwert, rhsHwbwert)) {
                return false;
            }
        }
        {
            String lhsHwbklasse;
            lhsHwbklasse = this.getHwbklasse();
            String rhsHwbklasse;
            rhsHwbklasse = that.getHwbklasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hwbklasse", lhsHwbklasse), LocatorUtils.property(thatLocator, "hwbklasse", rhsHwbklasse), lhsHwbklasse, rhsHwbklasse)) {
                return false;
            }
        }
        {
            String lhsFgeewert;
            lhsFgeewert = this.getFgeewert();
            String rhsFgeewert;
            rhsFgeewert = that.getFgeewert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fgeewert", lhsFgeewert), LocatorUtils.property(thatLocator, "fgeewert", rhsFgeewert), lhsFgeewert, rhsFgeewert)) {
                return false;
            }
        }
        {
            String lhsFgeeklasse;
            lhsFgeeklasse = this.getFgeeklasse();
            String rhsFgeeklasse;
            rhsFgeeklasse = that.getFgeeklasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fgeeklasse", lhsFgeeklasse), LocatorUtils.property(thatLocator, "fgeeklasse", rhsFgeeklasse), lhsFgeeklasse, rhsFgeeklasse)) {
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
     * Java enum for <em>epart</em> attribute in &lt;energiepass&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Epart {

        BEDARF,
        VERBRAUCH;

        public String value() {
            return name();
        }

        public static Energiepass.Epart fromValue(String v) {
            return valueOf(v);
        }

    }


    /**
     * Java enum for <em>gebaeudeart</em> attribute in &lt;energiepass&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Gebaeudeart {

        @XmlEnumValue("wohn")
        WOHN("wohn"),
        @XmlEnumValue("nichtwohn")
        NICHTWOHN("nichtwohn");
        private final String value;

        Gebaeudeart(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Energiepass.Gebaeudeart fromValue(String v) {
            for (Energiepass.Gebaeudeart c: Energiepass.Gebaeudeart.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }


    /**
     * Java enum for <em>jahrgang</em> attribute in &lt;energiepass&gt; elements.

     */
    @XmlType(name = "")
    @XmlEnum
    public enum Jahrgang {

        @XmlEnumValue("2008")
        BIS_APRIL_2014("2008"),
        @XmlEnumValue("2014")
        AB_MAI_2014("2014"),
        @XmlEnumValue("ohne")
        OHNE("ohne"),
        @XmlEnumValue("nicht_noetig")
        NICHT_NOETIG("nicht_noetig");
        private final String value;

        Jahrgang(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static Energiepass.Jahrgang fromValue(String v) {
            for (Energiepass.Jahrgang c: Energiepass.Jahrgang.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}