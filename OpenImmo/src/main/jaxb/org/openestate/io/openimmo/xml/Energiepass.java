
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
    "geg2018",
    "hwbwert",
    "hwbklasse",
    "fgeewert",
    "fgeeklasse"
})
@XmlRootElement(name = "energiepass")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Energiepass implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Energiepass.Epart epart;
    @XmlElement(name = "gueltig_bis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String gueltigBis;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String energieverbrauchkennwert;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean mitwarmwasser;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String endenergiebedarf;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String primaerenergietraeger;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String stromwert;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String waermewert;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String wertklasse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String baujahr;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Calendar ausstelldatum;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Energiepass.Jahrgang jahrgang;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Energiepass.Gebaeudeart gebaeudeart;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String epasstext;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String geg2018;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String hwbwert;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String hwbklasse;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String fgeewert;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String fgeeklasse;

    /**
     * Gets the value of the epart property.
     * 
     * @return
     *     possible object is
     *     {@link Energiepass.Epart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getMitwarmwasser() {
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setEpasstext(String value) {
        this.epasstext = value;
    }

    /**
     * Gets the value of the geg2018 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String getGeg2018() {
        return geg2018;
    }

    /**
     * Sets the value of the geg2018 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setGeg2018(String value) {
        this.geg2018 = value;
    }

    /**
     * Gets the value of the hwbwert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setFgeeklasse(String value) {
        this.fgeeklasse = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Energiepass.Epart theEpart;
            theEpart = this.getEpart();
            strategy.appendField(locator, this, "epart", buffer, theEpart, (this.epart!= null));
        }
        {
            String theGueltigBis;
            theGueltigBis = this.getGueltigBis();
            strategy.appendField(locator, this, "gueltigBis", buffer, theGueltigBis, (this.gueltigBis!= null));
        }
        {
            String theEnergieverbrauchkennwert;
            theEnergieverbrauchkennwert = this.getEnergieverbrauchkennwert();
            strategy.appendField(locator, this, "energieverbrauchkennwert", buffer, theEnergieverbrauchkennwert, (this.energieverbrauchkennwert!= null));
        }
        {
            Boolean theMitwarmwasser;
            theMitwarmwasser = this.getMitwarmwasser();
            strategy.appendField(locator, this, "mitwarmwasser", buffer, theMitwarmwasser, (this.mitwarmwasser!= null));
        }
        {
            String theEndenergiebedarf;
            theEndenergiebedarf = this.getEndenergiebedarf();
            strategy.appendField(locator, this, "endenergiebedarf", buffer, theEndenergiebedarf, (this.endenergiebedarf!= null));
        }
        {
            String thePrimaerenergietraeger;
            thePrimaerenergietraeger = this.getPrimaerenergietraeger();
            strategy.appendField(locator, this, "primaerenergietraeger", buffer, thePrimaerenergietraeger, (this.primaerenergietraeger!= null));
        }
        {
            String theStromwert;
            theStromwert = this.getStromwert();
            strategy.appendField(locator, this, "stromwert", buffer, theStromwert, (this.stromwert!= null));
        }
        {
            String theWaermewert;
            theWaermewert = this.getWaermewert();
            strategy.appendField(locator, this, "waermewert", buffer, theWaermewert, (this.waermewert!= null));
        }
        {
            String theWertklasse;
            theWertklasse = this.getWertklasse();
            strategy.appendField(locator, this, "wertklasse", buffer, theWertklasse, (this.wertklasse!= null));
        }
        {
            String theBaujahr;
            theBaujahr = this.getBaujahr();
            strategy.appendField(locator, this, "baujahr", buffer, theBaujahr, (this.baujahr!= null));
        }
        {
            Calendar theAusstelldatum;
            theAusstelldatum = this.getAusstelldatum();
            strategy.appendField(locator, this, "ausstelldatum", buffer, theAusstelldatum, (this.ausstelldatum!= null));
        }
        {
            Energiepass.Jahrgang theJahrgang;
            theJahrgang = this.getJahrgang();
            strategy.appendField(locator, this, "jahrgang", buffer, theJahrgang, (this.jahrgang!= null));
        }
        {
            Energiepass.Gebaeudeart theGebaeudeart;
            theGebaeudeart = this.getGebaeudeart();
            strategy.appendField(locator, this, "gebaeudeart", buffer, theGebaeudeart, (this.gebaeudeart!= null));
        }
        {
            String theEpasstext;
            theEpasstext = this.getEpasstext();
            strategy.appendField(locator, this, "epasstext", buffer, theEpasstext, (this.epasstext!= null));
        }
        {
            String theGeg2018;
            theGeg2018 = this.getGeg2018();
            strategy.appendField(locator, this, "geg2018", buffer, theGeg2018, (this.geg2018 != null));
        }
        {
            String theHwbwert;
            theHwbwert = this.getHwbwert();
            strategy.appendField(locator, this, "hwbwert", buffer, theHwbwert, (this.hwbwert!= null));
        }
        {
            String theHwbklasse;
            theHwbklasse = this.getHwbklasse();
            strategy.appendField(locator, this, "hwbklasse", buffer, theHwbklasse, (this.hwbklasse!= null));
        }
        {
            String theFgeewert;
            theFgeewert = this.getFgeewert();
            strategy.appendField(locator, this, "fgeewert", buffer, theFgeewert, (this.fgeewert!= null));
        }
        {
            String theFgeeklasse;
            theFgeeklasse = this.getFgeeklasse();
            strategy.appendField(locator, this, "fgeeklasse", buffer, theFgeeklasse, (this.fgeeklasse!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Energiepass) {
            final Energiepass copy = ((Energiepass) draftCopy);
            {
                Boolean epartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.epart!= null));
                if (epartShouldBeCopiedAndSet == Boolean.TRUE) {
                    Energiepass.Epart sourceEpart;
                    sourceEpart = this.getEpart();
                    Energiepass.Epart copyEpart = ((Energiepass.Epart) strategy.copy(LocatorUtils.property(locator, "epart", sourceEpart), sourceEpart, (this.epart!= null)));
                    copy.setEpart(copyEpart);
                } else {
                    if (epartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.epart = null;
                    }
                }
            }
            {
                Boolean gueltigBisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gueltigBis!= null));
                if (gueltigBisShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGueltigBis;
                    sourceGueltigBis = this.getGueltigBis();
                    String copyGueltigBis = ((String) strategy.copy(LocatorUtils.property(locator, "gueltigBis", sourceGueltigBis), sourceGueltigBis, (this.gueltigBis!= null)));
                    copy.setGueltigBis(copyGueltigBis);
                } else {
                    if (gueltigBisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gueltigBis = null;
                    }
                }
            }
            {
                Boolean energieverbrauchkennwertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energieverbrauchkennwert!= null));
                if (energieverbrauchkennwertShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEnergieverbrauchkennwert;
                    sourceEnergieverbrauchkennwert = this.getEnergieverbrauchkennwert();
                    String copyEnergieverbrauchkennwert = ((String) strategy.copy(LocatorUtils.property(locator, "energieverbrauchkennwert", sourceEnergieverbrauchkennwert), sourceEnergieverbrauchkennwert, (this.energieverbrauchkennwert!= null)));
                    copy.setEnergieverbrauchkennwert(copyEnergieverbrauchkennwert);
                } else {
                    if (energieverbrauchkennwertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energieverbrauchkennwert = null;
                    }
                }
            }
            {
                Boolean mitwarmwasserShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mitwarmwasser!= null));
                if (mitwarmwasserShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceMitwarmwasser;
                    sourceMitwarmwasser = this.getMitwarmwasser();
                    Boolean copyMitwarmwasser = ((Boolean) strategy.copy(LocatorUtils.property(locator, "mitwarmwasser", sourceMitwarmwasser), sourceMitwarmwasser, (this.mitwarmwasser!= null)));
                    copy.setMitwarmwasser(copyMitwarmwasser);
                } else {
                    if (mitwarmwasserShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mitwarmwasser = null;
                    }
                }
            }
            {
                Boolean endenergiebedarfShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.endenergiebedarf!= null));
                if (endenergiebedarfShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEndenergiebedarf;
                    sourceEndenergiebedarf = this.getEndenergiebedarf();
                    String copyEndenergiebedarf = ((String) strategy.copy(LocatorUtils.property(locator, "endenergiebedarf", sourceEndenergiebedarf), sourceEndenergiebedarf, (this.endenergiebedarf!= null)));
                    copy.setEndenergiebedarf(copyEndenergiebedarf);
                } else {
                    if (endenergiebedarfShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.endenergiebedarf = null;
                    }
                }
            }
            {
                Boolean primaerenergietraegerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.primaerenergietraeger!= null));
                if (primaerenergietraegerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePrimaerenergietraeger;
                    sourcePrimaerenergietraeger = this.getPrimaerenergietraeger();
                    String copyPrimaerenergietraeger = ((String) strategy.copy(LocatorUtils.property(locator, "primaerenergietraeger", sourcePrimaerenergietraeger), sourcePrimaerenergietraeger, (this.primaerenergietraeger!= null)));
                    copy.setPrimaerenergietraeger(copyPrimaerenergietraeger);
                } else {
                    if (primaerenergietraegerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.primaerenergietraeger = null;
                    }
                }
            }
            {
                Boolean stromwertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stromwert!= null));
                if (stromwertShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceStromwert;
                    sourceStromwert = this.getStromwert();
                    String copyStromwert = ((String) strategy.copy(LocatorUtils.property(locator, "stromwert", sourceStromwert), sourceStromwert, (this.stromwert!= null)));
                    copy.setStromwert(copyStromwert);
                } else {
                    if (stromwertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stromwert = null;
                    }
                }
            }
            {
                Boolean waermewertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.waermewert!= null));
                if (waermewertShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceWaermewert;
                    sourceWaermewert = this.getWaermewert();
                    String copyWaermewert = ((String) strategy.copy(LocatorUtils.property(locator, "waermewert", sourceWaermewert), sourceWaermewert, (this.waermewert!= null)));
                    copy.setWaermewert(copyWaermewert);
                } else {
                    if (waermewertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.waermewert = null;
                    }
                }
            }
            {
                Boolean wertklasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wertklasse!= null));
                if (wertklasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceWertklasse;
                    sourceWertklasse = this.getWertklasse();
                    String copyWertklasse = ((String) strategy.copy(LocatorUtils.property(locator, "wertklasse", sourceWertklasse), sourceWertklasse, (this.wertklasse!= null)));
                    copy.setWertklasse(copyWertklasse);
                } else {
                    if (wertklasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wertklasse = null;
                    }
                }
            }
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
                Boolean ausstelldatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausstelldatum!= null));
                if (ausstelldatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceAusstelldatum;
                    sourceAusstelldatum = this.getAusstelldatum();
                    Calendar copyAusstelldatum = ((Calendar) strategy.copy(LocatorUtils.property(locator, "ausstelldatum", sourceAusstelldatum), sourceAusstelldatum, (this.ausstelldatum!= null)));
                    copy.setAusstelldatum(copyAusstelldatum);
                } else {
                    if (ausstelldatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausstelldatum = null;
                    }
                }
            }
            {
                Boolean jahrgangShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.jahrgang!= null));
                if (jahrgangShouldBeCopiedAndSet == Boolean.TRUE) {
                    Energiepass.Jahrgang sourceJahrgang;
                    sourceJahrgang = this.getJahrgang();
                    Energiepass.Jahrgang copyJahrgang = ((Energiepass.Jahrgang) strategy.copy(LocatorUtils.property(locator, "jahrgang", sourceJahrgang), sourceJahrgang, (this.jahrgang!= null)));
                    copy.setJahrgang(copyJahrgang);
                } else {
                    if (jahrgangShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.jahrgang = null;
                    }
                }
            }
            {
                Boolean gebaeudeartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gebaeudeart!= null));
                if (gebaeudeartShouldBeCopiedAndSet == Boolean.TRUE) {
                    Energiepass.Gebaeudeart sourceGebaeudeart;
                    sourceGebaeudeart = this.getGebaeudeart();
                    Energiepass.Gebaeudeart copyGebaeudeart = ((Energiepass.Gebaeudeart) strategy.copy(LocatorUtils.property(locator, "gebaeudeart", sourceGebaeudeart), sourceGebaeudeart, (this.gebaeudeart!= null)));
                    copy.setGebaeudeart(copyGebaeudeart);
                } else {
                    if (gebaeudeartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gebaeudeart = null;
                    }
                }
            }
            {
                Boolean epasstextShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.epasstext!= null));
                if (epasstextShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEpasstext;
                    sourceEpasstext = this.getEpasstext();
                    String copyEpasstext = ((String) strategy.copy(LocatorUtils.property(locator, "epasstext", sourceEpasstext), sourceEpasstext, (this.epasstext!= null)));
                    copy.setEpasstext(copyEpasstext);
                } else {
                    if (epasstextShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.epasstext = null;
                    }
                }
            }
            {
                Boolean geg2018ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geg2018 != null));
                if (geg2018ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGeg2018;
                    sourceGeg2018 = this.getGeg2018();
                    String copyGeg2018 = ((String) strategy.copy(LocatorUtils.property(locator, "geg2018", sourceGeg2018), sourceGeg2018, (this.geg2018 != null)));
                    copy.setGeg2018(copyGeg2018);
                } else {
                    if (geg2018ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geg2018 = null;
                    }
                }
            }
            {
                Boolean hwbwertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hwbwert!= null));
                if (hwbwertShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHwbwert;
                    sourceHwbwert = this.getHwbwert();
                    String copyHwbwert = ((String) strategy.copy(LocatorUtils.property(locator, "hwbwert", sourceHwbwert), sourceHwbwert, (this.hwbwert!= null)));
                    copy.setHwbwert(copyHwbwert);
                } else {
                    if (hwbwertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hwbwert = null;
                    }
                }
            }
            {
                Boolean hwbklasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hwbklasse!= null));
                if (hwbklasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHwbklasse;
                    sourceHwbklasse = this.getHwbklasse();
                    String copyHwbklasse = ((String) strategy.copy(LocatorUtils.property(locator, "hwbklasse", sourceHwbklasse), sourceHwbklasse, (this.hwbklasse!= null)));
                    copy.setHwbklasse(copyHwbklasse);
                } else {
                    if (hwbklasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hwbklasse = null;
                    }
                }
            }
            {
                Boolean fgeewertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fgeewert!= null));
                if (fgeewertShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFgeewert;
                    sourceFgeewert = this.getFgeewert();
                    String copyFgeewert = ((String) strategy.copy(LocatorUtils.property(locator, "fgeewert", sourceFgeewert), sourceFgeewert, (this.fgeewert!= null)));
                    copy.setFgeewert(copyFgeewert);
                } else {
                    if (fgeewertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fgeewert = null;
                    }
                }
            }
            {
                Boolean fgeeklasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fgeeklasse!= null));
                if (fgeeklasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFgeeklasse;
                    sourceFgeeklasse = this.getFgeeklasse();
                    String copyFgeeklasse = ((String) strategy.copy(LocatorUtils.property(locator, "fgeeklasse", sourceFgeeklasse), sourceFgeeklasse, (this.fgeeklasse!= null)));
                    copy.setFgeeklasse(copyFgeeklasse);
                } else {
                    if (fgeeklasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fgeeklasse = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Energiepass();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "epart", lhsEpart), LocatorUtils.property(thatLocator, "epart", rhsEpart), lhsEpart, rhsEpart, (this.epart!= null), (that.epart!= null))) {
                return false;
            }
        }
        {
            String lhsGueltigBis;
            lhsGueltigBis = this.getGueltigBis();
            String rhsGueltigBis;
            rhsGueltigBis = that.getGueltigBis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gueltigBis", lhsGueltigBis), LocatorUtils.property(thatLocator, "gueltigBis", rhsGueltigBis), lhsGueltigBis, rhsGueltigBis, (this.gueltigBis!= null), (that.gueltigBis!= null))) {
                return false;
            }
        }
        {
            String lhsEnergieverbrauchkennwert;
            lhsEnergieverbrauchkennwert = this.getEnergieverbrauchkennwert();
            String rhsEnergieverbrauchkennwert;
            rhsEnergieverbrauchkennwert = that.getEnergieverbrauchkennwert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieverbrauchkennwert", lhsEnergieverbrauchkennwert), LocatorUtils.property(thatLocator, "energieverbrauchkennwert", rhsEnergieverbrauchkennwert), lhsEnergieverbrauchkennwert, rhsEnergieverbrauchkennwert, (this.energieverbrauchkennwert!= null), (that.energieverbrauchkennwert!= null))) {
                return false;
            }
        }
        {
            Boolean lhsMitwarmwasser;
            lhsMitwarmwasser = this.getMitwarmwasser();
            Boolean rhsMitwarmwasser;
            rhsMitwarmwasser = that.getMitwarmwasser();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mitwarmwasser", lhsMitwarmwasser), LocatorUtils.property(thatLocator, "mitwarmwasser", rhsMitwarmwasser), lhsMitwarmwasser, rhsMitwarmwasser, (this.mitwarmwasser!= null), (that.mitwarmwasser!= null))) {
                return false;
            }
        }
        {
            String lhsEndenergiebedarf;
            lhsEndenergiebedarf = this.getEndenergiebedarf();
            String rhsEndenergiebedarf;
            rhsEndenergiebedarf = that.getEndenergiebedarf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endenergiebedarf", lhsEndenergiebedarf), LocatorUtils.property(thatLocator, "endenergiebedarf", rhsEndenergiebedarf), lhsEndenergiebedarf, rhsEndenergiebedarf, (this.endenergiebedarf!= null), (that.endenergiebedarf!= null))) {
                return false;
            }
        }
        {
            String lhsPrimaerenergietraeger;
            lhsPrimaerenergietraeger = this.getPrimaerenergietraeger();
            String rhsPrimaerenergietraeger;
            rhsPrimaerenergietraeger = that.getPrimaerenergietraeger();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaerenergietraeger", lhsPrimaerenergietraeger), LocatorUtils.property(thatLocator, "primaerenergietraeger", rhsPrimaerenergietraeger), lhsPrimaerenergietraeger, rhsPrimaerenergietraeger, (this.primaerenergietraeger!= null), (that.primaerenergietraeger!= null))) {
                return false;
            }
        }
        {
            String lhsStromwert;
            lhsStromwert = this.getStromwert();
            String rhsStromwert;
            rhsStromwert = that.getStromwert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stromwert", lhsStromwert), LocatorUtils.property(thatLocator, "stromwert", rhsStromwert), lhsStromwert, rhsStromwert, (this.stromwert!= null), (that.stromwert!= null))) {
                return false;
            }
        }
        {
            String lhsWaermewert;
            lhsWaermewert = this.getWaermewert();
            String rhsWaermewert;
            rhsWaermewert = that.getWaermewert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waermewert", lhsWaermewert), LocatorUtils.property(thatLocator, "waermewert", rhsWaermewert), lhsWaermewert, rhsWaermewert, (this.waermewert!= null), (that.waermewert!= null))) {
                return false;
            }
        }
        {
            String lhsWertklasse;
            lhsWertklasse = this.getWertklasse();
            String rhsWertklasse;
            rhsWertklasse = that.getWertklasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wertklasse", lhsWertklasse), LocatorUtils.property(thatLocator, "wertklasse", rhsWertklasse), lhsWertklasse, rhsWertklasse, (this.wertklasse!= null), (that.wertklasse!= null))) {
                return false;
            }
        }
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
            Calendar lhsAusstelldatum;
            lhsAusstelldatum = this.getAusstelldatum();
            Calendar rhsAusstelldatum;
            rhsAusstelldatum = that.getAusstelldatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausstelldatum", lhsAusstelldatum), LocatorUtils.property(thatLocator, "ausstelldatum", rhsAusstelldatum), lhsAusstelldatum, rhsAusstelldatum, (this.ausstelldatum!= null), (that.ausstelldatum!= null))) {
                return false;
            }
        }
        {
            Energiepass.Jahrgang lhsJahrgang;
            lhsJahrgang = this.getJahrgang();
            Energiepass.Jahrgang rhsJahrgang;
            rhsJahrgang = that.getJahrgang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jahrgang", lhsJahrgang), LocatorUtils.property(thatLocator, "jahrgang", rhsJahrgang), lhsJahrgang, rhsJahrgang, (this.jahrgang!= null), (that.jahrgang!= null))) {
                return false;
            }
        }
        {
            Energiepass.Gebaeudeart lhsGebaeudeart;
            lhsGebaeudeart = this.getGebaeudeart();
            Energiepass.Gebaeudeart rhsGebaeudeart;
            rhsGebaeudeart = that.getGebaeudeart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gebaeudeart", lhsGebaeudeart), LocatorUtils.property(thatLocator, "gebaeudeart", rhsGebaeudeart), lhsGebaeudeart, rhsGebaeudeart, (this.gebaeudeart!= null), (that.gebaeudeart!= null))) {
                return false;
            }
        }
        {
            String lhsEpasstext;
            lhsEpasstext = this.getEpasstext();
            String rhsEpasstext;
            rhsEpasstext = that.getEpasstext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "epasstext", lhsEpasstext), LocatorUtils.property(thatLocator, "epasstext", rhsEpasstext), lhsEpasstext, rhsEpasstext, (this.epasstext!= null), (that.epasstext!= null))) {
                return false;
            }
        }
        {
            String lhsGeg2018;
            lhsGeg2018 = this.getGeg2018();
            String rhsGeg2018;
            rhsGeg2018 = that.getGeg2018();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geg2018", lhsGeg2018), LocatorUtils.property(thatLocator, "geg2018", rhsGeg2018), lhsGeg2018, rhsGeg2018, (this.geg2018 != null), (that.geg2018 != null))) {
                return false;
            }
        }
        {
            String lhsHwbwert;
            lhsHwbwert = this.getHwbwert();
            String rhsHwbwert;
            rhsHwbwert = that.getHwbwert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hwbwert", lhsHwbwert), LocatorUtils.property(thatLocator, "hwbwert", rhsHwbwert), lhsHwbwert, rhsHwbwert, (this.hwbwert!= null), (that.hwbwert!= null))) {
                return false;
            }
        }
        {
            String lhsHwbklasse;
            lhsHwbklasse = this.getHwbklasse();
            String rhsHwbklasse;
            rhsHwbklasse = that.getHwbklasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hwbklasse", lhsHwbklasse), LocatorUtils.property(thatLocator, "hwbklasse", rhsHwbklasse), lhsHwbklasse, rhsHwbklasse, (this.hwbklasse!= null), (that.hwbklasse!= null))) {
                return false;
            }
        }
        {
            String lhsFgeewert;
            lhsFgeewert = this.getFgeewert();
            String rhsFgeewert;
            rhsFgeewert = that.getFgeewert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fgeewert", lhsFgeewert), LocatorUtils.property(thatLocator, "fgeewert", rhsFgeewert), lhsFgeewert, rhsFgeewert, (this.fgeewert!= null), (that.fgeewert!= null))) {
                return false;
            }
        }
        {
            String lhsFgeeklasse;
            lhsFgeeklasse = this.getFgeeklasse();
            String rhsFgeeklasse;
            rhsFgeeklasse = that.getFgeeklasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fgeeklasse", lhsFgeeklasse), LocatorUtils.property(thatLocator, "fgeeklasse", rhsFgeeklasse), lhsFgeeklasse, rhsFgeeklasse, (this.fgeeklasse!= null), (that.fgeeklasse!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }


    /**
     * 
     *                     Java enum for <em>epart</em> attribute in &lt;energiepass&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="BEDARF"/&gt;
     *     &lt;enumeration value="VERBRAUCH"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
     * 
     *                     Java enum for <em>gebaeudeart</em> attribute in &lt;energiepass&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="wohn"/&gt;
     *     &lt;enumeration value="nichtwohn"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
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
     * 
     *                     Java enum for <em>jahrgang</em> attribute in &lt;energiepass&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="2008"/&gt;
     *     &lt;enumeration value="2014"/&gt;
     *     &lt;enumeration value="ohne"/&gt;
     *     &lt;enumeration value="nicht_noetig"/&gt;
     *     &lt;enumeration value="bei_besichtigung"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public enum Jahrgang {

        @XmlEnumValue("2008")
        BIS_APRIL_2014("2008"),
        @XmlEnumValue("2014")
        AB_MAI_2014("2014"),
        @XmlEnumValue("ohne")
        OHNE("ohne"),
        @XmlEnumValue("nicht_noetig")
        NICHT_NOETIG("nicht_noetig"),
        @XmlEnumValue("bei_besichtigung")
        BEI_BESICHTIGUNG("bei_besichtigung");
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
