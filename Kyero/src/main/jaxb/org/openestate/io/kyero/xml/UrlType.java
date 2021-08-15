
package org.openestate.io.kyero.xml;

import java.io.Serializable;
import java.net.URI;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for urlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="urlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ca" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="de" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="da" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="en" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="es" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="fi" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="fr" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="it" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="nl" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="no" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="pt" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="ru" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="sv" type="{}urlDataType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "urlType", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
public class UrlType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected URI ca;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected URI de;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected URI da;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected URI en;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected URI es;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected URI fi;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected URI fr;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected URI it;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected URI nl;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected URI no;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected URI pt;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected URI ru;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    protected URI sv;

    /**
     * Gets the value of the ca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public URI getCa() {
        return ca;
    }

    /**
     * Sets the value of the ca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public void setCa(URI value) {
        this.ca = value;
    }

    /**
     * Gets the value of the de property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public URI getDe() {
        return de;
    }

    /**
     * Sets the value of the de property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public void setDe(URI value) {
        this.de = value;
    }

    /**
     * Gets the value of the da property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public URI getDa() {
        return da;
    }

    /**
     * Sets the value of the da property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public void setDa(URI value) {
        this.da = value;
    }

    /**
     * Gets the value of the en property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public URI getEn() {
        return en;
    }

    /**
     * Sets the value of the en property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public void setEn(URI value) {
        this.en = value;
    }

    /**
     * Gets the value of the es property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public URI getEs() {
        return es;
    }

    /**
     * Sets the value of the es property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public void setEs(URI value) {
        this.es = value;
    }

    /**
     * Gets the value of the fi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public URI getFi() {
        return fi;
    }

    /**
     * Sets the value of the fi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public void setFi(URI value) {
        this.fi = value;
    }

    /**
     * Gets the value of the fr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public URI getFr() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public void setFr(URI value) {
        this.fr = value;
    }

    /**
     * Gets the value of the it property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public URI getIt() {
        return it;
    }

    /**
     * Sets the value of the it property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public void setIt(URI value) {
        this.it = value;
    }

    /**
     * Gets the value of the nl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public URI getNl() {
        return nl;
    }

    /**
     * Sets the value of the nl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public void setNl(URI value) {
        this.nl = value;
    }

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public URI getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public void setNo(URI value) {
        this.no = value;
    }

    /**
     * Gets the value of the pt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public URI getPt() {
        return pt;
    }

    /**
     * Sets the value of the pt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public void setPt(URI value) {
        this.pt = value;
    }

    /**
     * Gets the value of the ru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public URI getRu() {
        return ru;
    }

    /**
     * Sets the value of the ru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public void setRu(URI value) {
        this.ru = value;
    }

    /**
     * Gets the value of the sv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public URI getSv() {
        return sv;
    }

    /**
     * Sets the value of the sv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public void setSv(URI value) {
        this.sv = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            URI theCa;
            theCa = this.getCa();
            strategy.appendField(locator, this, "ca", buffer, theCa, (this.ca!= null));
        }
        {
            URI theDe;
            theDe = this.getDe();
            strategy.appendField(locator, this, "de", buffer, theDe, (this.de!= null));
        }
        {
            URI theDa;
            theDa = this.getDa();
            strategy.appendField(locator, this, "da", buffer, theDa, (this.da!= null));
        }
        {
            URI theEn;
            theEn = this.getEn();
            strategy.appendField(locator, this, "en", buffer, theEn, (this.en!= null));
        }
        {
            URI theEs;
            theEs = this.getEs();
            strategy.appendField(locator, this, "es", buffer, theEs, (this.es!= null));
        }
        {
            URI theFi;
            theFi = this.getFi();
            strategy.appendField(locator, this, "fi", buffer, theFi, (this.fi!= null));
        }
        {
            URI theFr;
            theFr = this.getFr();
            strategy.appendField(locator, this, "fr", buffer, theFr, (this.fr!= null));
        }
        {
            URI theIt;
            theIt = this.getIt();
            strategy.appendField(locator, this, "it", buffer, theIt, (this.it!= null));
        }
        {
            URI theNl;
            theNl = this.getNl();
            strategy.appendField(locator, this, "nl", buffer, theNl, (this.nl!= null));
        }
        {
            URI theNo;
            theNo = this.getNo();
            strategy.appendField(locator, this, "no", buffer, theNo, (this.no!= null));
        }
        {
            URI thePt;
            thePt = this.getPt();
            strategy.appendField(locator, this, "pt", buffer, thePt, (this.pt!= null));
        }
        {
            URI theRu;
            theRu = this.getRu();
            strategy.appendField(locator, this, "ru", buffer, theRu, (this.ru!= null));
        }
        {
            URI theSv;
            theSv = this.getSv();
            strategy.appendField(locator, this, "sv", buffer, theSv, (this.sv!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof UrlType) {
            final UrlType copy = ((UrlType) draftCopy);
            {
                Boolean caShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ca!= null));
                if (caShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceCa;
                    sourceCa = this.getCa();
                    URI copyCa = ((URI) strategy.copy(LocatorUtils.property(locator, "ca", sourceCa), sourceCa, (this.ca!= null)));
                    copy.setCa(copyCa);
                } else {
                    if (caShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ca = null;
                    }
                }
            }
            {
                Boolean deShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.de!= null));
                if (deShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceDe;
                    sourceDe = this.getDe();
                    URI copyDe = ((URI) strategy.copy(LocatorUtils.property(locator, "de", sourceDe), sourceDe, (this.de!= null)));
                    copy.setDe(copyDe);
                } else {
                    if (deShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.de = null;
                    }
                }
            }
            {
                Boolean daShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.da!= null));
                if (daShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceDa;
                    sourceDa = this.getDa();
                    URI copyDa = ((URI) strategy.copy(LocatorUtils.property(locator, "da", sourceDa), sourceDa, (this.da!= null)));
                    copy.setDa(copyDa);
                } else {
                    if (daShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.da = null;
                    }
                }
            }
            {
                Boolean enShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.en!= null));
                if (enShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceEn;
                    sourceEn = this.getEn();
                    URI copyEn = ((URI) strategy.copy(LocatorUtils.property(locator, "en", sourceEn), sourceEn, (this.en!= null)));
                    copy.setEn(copyEn);
                } else {
                    if (enShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.en = null;
                    }
                }
            }
            {
                Boolean esShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.es!= null));
                if (esShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceEs;
                    sourceEs = this.getEs();
                    URI copyEs = ((URI) strategy.copy(LocatorUtils.property(locator, "es", sourceEs), sourceEs, (this.es!= null)));
                    copy.setEs(copyEs);
                } else {
                    if (esShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.es = null;
                    }
                }
            }
            {
                Boolean fiShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fi!= null));
                if (fiShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceFi;
                    sourceFi = this.getFi();
                    URI copyFi = ((URI) strategy.copy(LocatorUtils.property(locator, "fi", sourceFi), sourceFi, (this.fi!= null)));
                    copy.setFi(copyFi);
                } else {
                    if (fiShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fi = null;
                    }
                }
            }
            {
                Boolean frShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fr!= null));
                if (frShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceFr;
                    sourceFr = this.getFr();
                    URI copyFr = ((URI) strategy.copy(LocatorUtils.property(locator, "fr", sourceFr), sourceFr, (this.fr!= null)));
                    copy.setFr(copyFr);
                } else {
                    if (frShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fr = null;
                    }
                }
            }
            {
                Boolean itShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.it!= null));
                if (itShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceIt;
                    sourceIt = this.getIt();
                    URI copyIt = ((URI) strategy.copy(LocatorUtils.property(locator, "it", sourceIt), sourceIt, (this.it!= null)));
                    copy.setIt(copyIt);
                } else {
                    if (itShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.it = null;
                    }
                }
            }
            {
                Boolean nlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nl!= null));
                if (nlShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceNl;
                    sourceNl = this.getNl();
                    URI copyNl = ((URI) strategy.copy(LocatorUtils.property(locator, "nl", sourceNl), sourceNl, (this.nl!= null)));
                    copy.setNl(copyNl);
                } else {
                    if (nlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nl = null;
                    }
                }
            }
            {
                Boolean noShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.no!= null));
                if (noShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceNo;
                    sourceNo = this.getNo();
                    URI copyNo = ((URI) strategy.copy(LocatorUtils.property(locator, "no", sourceNo), sourceNo, (this.no!= null)));
                    copy.setNo(copyNo);
                } else {
                    if (noShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.no = null;
                    }
                }
            }
            {
                Boolean ptShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pt!= null));
                if (ptShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourcePt;
                    sourcePt = this.getPt();
                    URI copyPt = ((URI) strategy.copy(LocatorUtils.property(locator, "pt", sourcePt), sourcePt, (this.pt!= null)));
                    copy.setPt(copyPt);
                } else {
                    if (ptShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pt = null;
                    }
                }
            }
            {
                Boolean ruShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ru!= null));
                if (ruShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceRu;
                    sourceRu = this.getRu();
                    URI copyRu = ((URI) strategy.copy(LocatorUtils.property(locator, "ru", sourceRu), sourceRu, (this.ru!= null)));
                    copy.setRu(copyRu);
                } else {
                    if (ruShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ru = null;
                    }
                }
            }
            {
                Boolean svShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sv!= null));
                if (svShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceSv;
                    sourceSv = this.getSv();
                    URI copySv = ((URI) strategy.copy(LocatorUtils.property(locator, "sv", sourceSv), sourceSv, (this.sv!= null)));
                    copy.setSv(copySv);
                } else {
                    if (svShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sv = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new UrlType();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UrlType that = ((UrlType) object);
        {
            URI lhsCa;
            lhsCa = this.getCa();
            URI rhsCa;
            rhsCa = that.getCa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ca", lhsCa), LocatorUtils.property(thatLocator, "ca", rhsCa), lhsCa, rhsCa, (this.ca!= null), (that.ca!= null))) {
                return false;
            }
        }
        {
            URI lhsDe;
            lhsDe = this.getDe();
            URI rhsDe;
            rhsDe = that.getDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "de", lhsDe), LocatorUtils.property(thatLocator, "de", rhsDe), lhsDe, rhsDe, (this.de!= null), (that.de!= null))) {
                return false;
            }
        }
        {
            URI lhsDa;
            lhsDa = this.getDa();
            URI rhsDa;
            rhsDa = that.getDa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "da", lhsDa), LocatorUtils.property(thatLocator, "da", rhsDa), lhsDa, rhsDa, (this.da!= null), (that.da!= null))) {
                return false;
            }
        }
        {
            URI lhsEn;
            lhsEn = this.getEn();
            URI rhsEn;
            rhsEn = that.getEn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "en", lhsEn), LocatorUtils.property(thatLocator, "en", rhsEn), lhsEn, rhsEn, (this.en!= null), (that.en!= null))) {
                return false;
            }
        }
        {
            URI lhsEs;
            lhsEs = this.getEs();
            URI rhsEs;
            rhsEs = that.getEs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "es", lhsEs), LocatorUtils.property(thatLocator, "es", rhsEs), lhsEs, rhsEs, (this.es!= null), (that.es!= null))) {
                return false;
            }
        }
        {
            URI lhsFi;
            lhsFi = this.getFi();
            URI rhsFi;
            rhsFi = that.getFi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fi", lhsFi), LocatorUtils.property(thatLocator, "fi", rhsFi), lhsFi, rhsFi, (this.fi!= null), (that.fi!= null))) {
                return false;
            }
        }
        {
            URI lhsFr;
            lhsFr = this.getFr();
            URI rhsFr;
            rhsFr = that.getFr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fr", lhsFr), LocatorUtils.property(thatLocator, "fr", rhsFr), lhsFr, rhsFr, (this.fr!= null), (that.fr!= null))) {
                return false;
            }
        }
        {
            URI lhsIt;
            lhsIt = this.getIt();
            URI rhsIt;
            rhsIt = that.getIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "it", lhsIt), LocatorUtils.property(thatLocator, "it", rhsIt), lhsIt, rhsIt, (this.it!= null), (that.it!= null))) {
                return false;
            }
        }
        {
            URI lhsNl;
            lhsNl = this.getNl();
            URI rhsNl;
            rhsNl = that.getNl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nl", lhsNl), LocatorUtils.property(thatLocator, "nl", rhsNl), lhsNl, rhsNl, (this.nl!= null), (that.nl!= null))) {
                return false;
            }
        }
        {
            URI lhsNo;
            lhsNo = this.getNo();
            URI rhsNo;
            rhsNo = that.getNo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "no", lhsNo), LocatorUtils.property(thatLocator, "no", rhsNo), lhsNo, rhsNo, (this.no!= null), (that.no!= null))) {
                return false;
            }
        }
        {
            URI lhsPt;
            lhsPt = this.getPt();
            URI rhsPt;
            rhsPt = that.getPt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pt", lhsPt), LocatorUtils.property(thatLocator, "pt", rhsPt), lhsPt, rhsPt, (this.pt!= null), (that.pt!= null))) {
                return false;
            }
        }
        {
            URI lhsRu;
            lhsRu = this.getRu();
            URI rhsRu;
            rhsRu = that.getRu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ru", lhsRu), LocatorUtils.property(thatLocator, "ru", rhsRu), lhsRu, rhsRu, (this.ru!= null), (that.ru!= null))) {
                return false;
            }
        }
        {
            URI lhsSv;
            lhsSv = this.getSv();
            URI rhsSv;
            rhsSv = that.getSv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sv", lhsSv), LocatorUtils.property(thatLocator, "sv", rhsSv), lhsSv, rhsSv, (this.sv!= null), (that.sv!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:05+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
