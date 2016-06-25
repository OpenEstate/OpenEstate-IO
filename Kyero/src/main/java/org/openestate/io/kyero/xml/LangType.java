
package org.openestate.io.kyero.xml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for langType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="langType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="de" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="da" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="el" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="es" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="et" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="he" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="it" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ko" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ru" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="th" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "langType", propOrder = {

})
public class LangType implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    protected String ar;
    protected String bg;
    protected String ca;
    protected String cs;
    protected String de;
    protected String da;
    protected String el;
    protected String en;
    protected String es;
    protected String et;
    protected String fa;
    protected String fi;
    protected String fr;
    protected String he;
    protected String hi;
    protected String hu;
    protected String id;
    protected String it;
    protected String ja;
    protected String ko;
    protected String lt;
    protected String lv;
    protected String nl;
    protected String no;
    protected String pl;
    protected String pt;
    protected String ro;
    protected String ru;
    protected String sk;
    protected String sl;
    protected String sv;
    protected String th;
    protected String tr;
    protected String uk;
    protected String vi;
    protected String zh;

    /**
     * Gets the value of the ar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAr() {
        return ar;
    }

    /**
     * Sets the value of the ar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAr(String value) {
        this.ar = value;
    }

    /**
     * Gets the value of the bg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBg() {
        return bg;
    }

    /**
     * Sets the value of the bg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBg(String value) {
        this.bg = value;
    }

    /**
     * Gets the value of the ca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCa() {
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
    public void setCa(String value) {
        this.ca = value;
    }

    /**
     * Gets the value of the cs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCs() {
        return cs;
    }

    /**
     * Sets the value of the cs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCs(String value) {
        this.cs = value;
    }

    /**
     * Gets the value of the de property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDe() {
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
    public void setDe(String value) {
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
    public String getDa() {
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
    public void setDa(String value) {
        this.da = value;
    }

    /**
     * Gets the value of the el property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEl() {
        return el;
    }

    /**
     * Sets the value of the el property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEl(String value) {
        this.el = value;
    }

    /**
     * Gets the value of the en property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEn() {
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
    public void setEn(String value) {
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
    public String getEs() {
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
    public void setEs(String value) {
        this.es = value;
    }

    /**
     * Gets the value of the et property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEt() {
        return et;
    }

    /**
     * Sets the value of the et property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEt(String value) {
        this.et = value;
    }

    /**
     * Gets the value of the fa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFa() {
        return fa;
    }

    /**
     * Sets the value of the fa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFa(String value) {
        this.fa = value;
    }

    /**
     * Gets the value of the fi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFi() {
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
    public void setFi(String value) {
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
    public String getFr() {
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
    public void setFr(String value) {
        this.fr = value;
    }

    /**
     * Gets the value of the he property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHe() {
        return he;
    }

    /**
     * Sets the value of the he property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHe(String value) {
        this.he = value;
    }

    /**
     * Gets the value of the hi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHi() {
        return hi;
    }

    /**
     * Sets the value of the hi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHi(String value) {
        this.hi = value;
    }

    /**
     * Gets the value of the hu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHu() {
        return hu;
    }

    /**
     * Sets the value of the hu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHu(String value) {
        this.hu = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the it property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIt() {
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
    public void setIt(String value) {
        this.it = value;
    }

    /**
     * Gets the value of the ja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJa() {
        return ja;
    }

    /**
     * Sets the value of the ja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJa(String value) {
        this.ja = value;
    }

    /**
     * Gets the value of the ko property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKo() {
        return ko;
    }

    /**
     * Sets the value of the ko property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKo(String value) {
        this.ko = value;
    }

    /**
     * Gets the value of the lt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLt() {
        return lt;
    }

    /**
     * Sets the value of the lt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLt(String value) {
        this.lt = value;
    }

    /**
     * Gets the value of the lv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLv() {
        return lv;
    }

    /**
     * Sets the value of the lv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLv(String value) {
        this.lv = value;
    }

    /**
     * Gets the value of the nl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNl() {
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
    public void setNl(String value) {
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
    public String getNo() {
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
    public void setNo(String value) {
        this.no = value;
    }

    /**
     * Gets the value of the pl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPl() {
        return pl;
    }

    /**
     * Sets the value of the pl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPl(String value) {
        this.pl = value;
    }

    /**
     * Gets the value of the pt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPt() {
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
    public void setPt(String value) {
        this.pt = value;
    }

    /**
     * Gets the value of the ro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRo() {
        return ro;
    }

    /**
     * Sets the value of the ro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRo(String value) {
        this.ro = value;
    }

    /**
     * Gets the value of the ru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRu() {
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
    public void setRu(String value) {
        this.ru = value;
    }

    /**
     * Gets the value of the sk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSk() {
        return sk;
    }

    /**
     * Sets the value of the sk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSk(String value) {
        this.sk = value;
    }

    /**
     * Gets the value of the sl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSl() {
        return sl;
    }

    /**
     * Sets the value of the sl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSl(String value) {
        this.sl = value;
    }

    /**
     * Gets the value of the sv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSv() {
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
    public void setSv(String value) {
        this.sv = value;
    }

    /**
     * Gets the value of the th property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTh() {
        return th;
    }

    /**
     * Sets the value of the th property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTh(String value) {
        this.th = value;
    }

    /**
     * Gets the value of the tr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTr() {
        return tr;
    }

    /**
     * Sets the value of the tr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTr(String value) {
        this.tr = value;
    }

    /**
     * Gets the value of the uk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUk() {
        return uk;
    }

    /**
     * Sets the value of the uk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUk(String value) {
        this.uk = value;
    }

    /**
     * Gets the value of the vi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVi() {
        return vi;
    }

    /**
     * Sets the value of the vi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVi(String value) {
        this.vi = value;
    }

    /**
     * Gets the value of the zh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZh() {
        return zh;
    }

    /**
     * Sets the value of the zh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZh(String value) {
        this.zh = value;
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
            String theAr;
            theAr = this.getAr();
            strategy.appendField(locator, this, "ar", buffer, theAr, (this.ar!= null));
        }
        {
            String theBg;
            theBg = this.getBg();
            strategy.appendField(locator, this, "bg", buffer, theBg, (this.bg!= null));
        }
        {
            String theCa;
            theCa = this.getCa();
            strategy.appendField(locator, this, "ca", buffer, theCa, (this.ca!= null));
        }
        {
            String theCs;
            theCs = this.getCs();
            strategy.appendField(locator, this, "cs", buffer, theCs, (this.cs!= null));
        }
        {
            String theDe;
            theDe = this.getDe();
            strategy.appendField(locator, this, "de", buffer, theDe, (this.de!= null));
        }
        {
            String theDa;
            theDa = this.getDa();
            strategy.appendField(locator, this, "da", buffer, theDa, (this.da!= null));
        }
        {
            String theEl;
            theEl = this.getEl();
            strategy.appendField(locator, this, "el", buffer, theEl, (this.el!= null));
        }
        {
            String theEn;
            theEn = this.getEn();
            strategy.appendField(locator, this, "en", buffer, theEn, (this.en!= null));
        }
        {
            String theEs;
            theEs = this.getEs();
            strategy.appendField(locator, this, "es", buffer, theEs, (this.es!= null));
        }
        {
            String theEt;
            theEt = this.getEt();
            strategy.appendField(locator, this, "et", buffer, theEt, (this.et!= null));
        }
        {
            String theFa;
            theFa = this.getFa();
            strategy.appendField(locator, this, "fa", buffer, theFa, (this.fa!= null));
        }
        {
            String theFi;
            theFi = this.getFi();
            strategy.appendField(locator, this, "fi", buffer, theFi, (this.fi!= null));
        }
        {
            String theFr;
            theFr = this.getFr();
            strategy.appendField(locator, this, "fr", buffer, theFr, (this.fr!= null));
        }
        {
            String theHe;
            theHe = this.getHe();
            strategy.appendField(locator, this, "he", buffer, theHe, (this.he!= null));
        }
        {
            String theHi;
            theHi = this.getHi();
            strategy.appendField(locator, this, "hi", buffer, theHi, (this.hi!= null));
        }
        {
            String theHu;
            theHu = this.getHu();
            strategy.appendField(locator, this, "hu", buffer, theHu, (this.hu!= null));
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
        }
        {
            String theIt;
            theIt = this.getIt();
            strategy.appendField(locator, this, "it", buffer, theIt, (this.it!= null));
        }
        {
            String theJa;
            theJa = this.getJa();
            strategy.appendField(locator, this, "ja", buffer, theJa, (this.ja!= null));
        }
        {
            String theKo;
            theKo = this.getKo();
            strategy.appendField(locator, this, "ko", buffer, theKo, (this.ko!= null));
        }
        {
            String theLt;
            theLt = this.getLt();
            strategy.appendField(locator, this, "lt", buffer, theLt, (this.lt!= null));
        }
        {
            String theLv;
            theLv = this.getLv();
            strategy.appendField(locator, this, "lv", buffer, theLv, (this.lv!= null));
        }
        {
            String theNl;
            theNl = this.getNl();
            strategy.appendField(locator, this, "nl", buffer, theNl, (this.nl!= null));
        }
        {
            String theNo;
            theNo = this.getNo();
            strategy.appendField(locator, this, "no", buffer, theNo, (this.no!= null));
        }
        {
            String thePl;
            thePl = this.getPl();
            strategy.appendField(locator, this, "pl", buffer, thePl, (this.pl!= null));
        }
        {
            String thePt;
            thePt = this.getPt();
            strategy.appendField(locator, this, "pt", buffer, thePt, (this.pt!= null));
        }
        {
            String theRo;
            theRo = this.getRo();
            strategy.appendField(locator, this, "ro", buffer, theRo, (this.ro!= null));
        }
        {
            String theRu;
            theRu = this.getRu();
            strategy.appendField(locator, this, "ru", buffer, theRu, (this.ru!= null));
        }
        {
            String theSk;
            theSk = this.getSk();
            strategy.appendField(locator, this, "sk", buffer, theSk, (this.sk!= null));
        }
        {
            String theSl;
            theSl = this.getSl();
            strategy.appendField(locator, this, "sl", buffer, theSl, (this.sl!= null));
        }
        {
            String theSv;
            theSv = this.getSv();
            strategy.appendField(locator, this, "sv", buffer, theSv, (this.sv!= null));
        }
        {
            String theTh;
            theTh = this.getTh();
            strategy.appendField(locator, this, "th", buffer, theTh, (this.th!= null));
        }
        {
            String theTr;
            theTr = this.getTr();
            strategy.appendField(locator, this, "tr", buffer, theTr, (this.tr!= null));
        }
        {
            String theUk;
            theUk = this.getUk();
            strategy.appendField(locator, this, "uk", buffer, theUk, (this.uk!= null));
        }
        {
            String theVi;
            theVi = this.getVi();
            strategy.appendField(locator, this, "vi", buffer, theVi, (this.vi!= null));
        }
        {
            String theZh;
            theZh = this.getZh();
            strategy.appendField(locator, this, "zh", buffer, theZh, (this.zh!= null));
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
        if (draftCopy instanceof LangType) {
            final LangType copy = ((LangType) draftCopy);
            {
                Boolean arShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ar!= null));
                if (arShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAr;
                    sourceAr = this.getAr();
                    String copyAr = ((String) strategy.copy(LocatorUtils.property(locator, "ar", sourceAr), sourceAr, (this.ar!= null)));
                    copy.setAr(copyAr);
                } else {
                    if (arShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ar = null;
                    }
                }
            }
            {
                Boolean bgShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bg!= null));
                if (bgShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBg;
                    sourceBg = this.getBg();
                    String copyBg = ((String) strategy.copy(LocatorUtils.property(locator, "bg", sourceBg), sourceBg, (this.bg!= null)));
                    copy.setBg(copyBg);
                } else {
                    if (bgShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bg = null;
                    }
                }
            }
            {
                Boolean caShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ca!= null));
                if (caShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCa;
                    sourceCa = this.getCa();
                    String copyCa = ((String) strategy.copy(LocatorUtils.property(locator, "ca", sourceCa), sourceCa, (this.ca!= null)));
                    copy.setCa(copyCa);
                } else {
                    if (caShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ca = null;
                    }
                }
            }
            {
                Boolean csShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cs!= null));
                if (csShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCs;
                    sourceCs = this.getCs();
                    String copyCs = ((String) strategy.copy(LocatorUtils.property(locator, "cs", sourceCs), sourceCs, (this.cs!= null)));
                    copy.setCs(copyCs);
                } else {
                    if (csShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cs = null;
                    }
                }
            }
            {
                Boolean deShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.de!= null));
                if (deShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDe;
                    sourceDe = this.getDe();
                    String copyDe = ((String) strategy.copy(LocatorUtils.property(locator, "de", sourceDe), sourceDe, (this.de!= null)));
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
                    String sourceDa;
                    sourceDa = this.getDa();
                    String copyDa = ((String) strategy.copy(LocatorUtils.property(locator, "da", sourceDa), sourceDa, (this.da!= null)));
                    copy.setDa(copyDa);
                } else {
                    if (daShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.da = null;
                    }
                }
            }
            {
                Boolean elShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.el!= null));
                if (elShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEl;
                    sourceEl = this.getEl();
                    String copyEl = ((String) strategy.copy(LocatorUtils.property(locator, "el", sourceEl), sourceEl, (this.el!= null)));
                    copy.setEl(copyEl);
                } else {
                    if (elShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.el = null;
                    }
                }
            }
            {
                Boolean enShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.en!= null));
                if (enShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEn;
                    sourceEn = this.getEn();
                    String copyEn = ((String) strategy.copy(LocatorUtils.property(locator, "en", sourceEn), sourceEn, (this.en!= null)));
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
                    String sourceEs;
                    sourceEs = this.getEs();
                    String copyEs = ((String) strategy.copy(LocatorUtils.property(locator, "es", sourceEs), sourceEs, (this.es!= null)));
                    copy.setEs(copyEs);
                } else {
                    if (esShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.es = null;
                    }
                }
            }
            {
                Boolean etShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.et!= null));
                if (etShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEt;
                    sourceEt = this.getEt();
                    String copyEt = ((String) strategy.copy(LocatorUtils.property(locator, "et", sourceEt), sourceEt, (this.et!= null)));
                    copy.setEt(copyEt);
                } else {
                    if (etShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.et = null;
                    }
                }
            }
            {
                Boolean faShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fa!= null));
                if (faShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFa;
                    sourceFa = this.getFa();
                    String copyFa = ((String) strategy.copy(LocatorUtils.property(locator, "fa", sourceFa), sourceFa, (this.fa!= null)));
                    copy.setFa(copyFa);
                } else {
                    if (faShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fa = null;
                    }
                }
            }
            {
                Boolean fiShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fi!= null));
                if (fiShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFi;
                    sourceFi = this.getFi();
                    String copyFi = ((String) strategy.copy(LocatorUtils.property(locator, "fi", sourceFi), sourceFi, (this.fi!= null)));
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
                    String sourceFr;
                    sourceFr = this.getFr();
                    String copyFr = ((String) strategy.copy(LocatorUtils.property(locator, "fr", sourceFr), sourceFr, (this.fr!= null)));
                    copy.setFr(copyFr);
                } else {
                    if (frShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fr = null;
                    }
                }
            }
            {
                Boolean heShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.he!= null));
                if (heShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHe;
                    sourceHe = this.getHe();
                    String copyHe = ((String) strategy.copy(LocatorUtils.property(locator, "he", sourceHe), sourceHe, (this.he!= null)));
                    copy.setHe(copyHe);
                } else {
                    if (heShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.he = null;
                    }
                }
            }
            {
                Boolean hiShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hi!= null));
                if (hiShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHi;
                    sourceHi = this.getHi();
                    String copyHi = ((String) strategy.copy(LocatorUtils.property(locator, "hi", sourceHi), sourceHi, (this.hi!= null)));
                    copy.setHi(copyHi);
                } else {
                    if (hiShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hi = null;
                    }
                }
            }
            {
                Boolean huShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hu!= null));
                if (huShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHu;
                    sourceHu = this.getHu();
                    String copyHu = ((String) strategy.copy(LocatorUtils.property(locator, "hu", sourceHu), sourceHu, (this.hu!= null)));
                    copy.setHu(copyHu);
                } else {
                    if (huShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hu = null;
                    }
                }
            }
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceId;
                    sourceId = this.getId();
                    String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                    copy.setId(copyId);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
            {
                Boolean itShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.it!= null));
                if (itShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIt;
                    sourceIt = this.getIt();
                    String copyIt = ((String) strategy.copy(LocatorUtils.property(locator, "it", sourceIt), sourceIt, (this.it!= null)));
                    copy.setIt(copyIt);
                } else {
                    if (itShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.it = null;
                    }
                }
            }
            {
                Boolean jaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ja!= null));
                if (jaShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceJa;
                    sourceJa = this.getJa();
                    String copyJa = ((String) strategy.copy(LocatorUtils.property(locator, "ja", sourceJa), sourceJa, (this.ja!= null)));
                    copy.setJa(copyJa);
                } else {
                    if (jaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ja = null;
                    }
                }
            }
            {
                Boolean koShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ko!= null));
                if (koShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKo;
                    sourceKo = this.getKo();
                    String copyKo = ((String) strategy.copy(LocatorUtils.property(locator, "ko", sourceKo), sourceKo, (this.ko!= null)));
                    copy.setKo(copyKo);
                } else {
                    if (koShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ko = null;
                    }
                }
            }
            {
                Boolean ltShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lt!= null));
                if (ltShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLt;
                    sourceLt = this.getLt();
                    String copyLt = ((String) strategy.copy(LocatorUtils.property(locator, "lt", sourceLt), sourceLt, (this.lt!= null)));
                    copy.setLt(copyLt);
                } else {
                    if (ltShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lt = null;
                    }
                }
            }
            {
                Boolean lvShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lv!= null));
                if (lvShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLv;
                    sourceLv = this.getLv();
                    String copyLv = ((String) strategy.copy(LocatorUtils.property(locator, "lv", sourceLv), sourceLv, (this.lv!= null)));
                    copy.setLv(copyLv);
                } else {
                    if (lvShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lv = null;
                    }
                }
            }
            {
                Boolean nlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nl!= null));
                if (nlShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNl;
                    sourceNl = this.getNl();
                    String copyNl = ((String) strategy.copy(LocatorUtils.property(locator, "nl", sourceNl), sourceNl, (this.nl!= null)));
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
                    String sourceNo;
                    sourceNo = this.getNo();
                    String copyNo = ((String) strategy.copy(LocatorUtils.property(locator, "no", sourceNo), sourceNo, (this.no!= null)));
                    copy.setNo(copyNo);
                } else {
                    if (noShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.no = null;
                    }
                }
            }
            {
                Boolean plShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pl!= null));
                if (plShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePl;
                    sourcePl = this.getPl();
                    String copyPl = ((String) strategy.copy(LocatorUtils.property(locator, "pl", sourcePl), sourcePl, (this.pl!= null)));
                    copy.setPl(copyPl);
                } else {
                    if (plShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pl = null;
                    }
                }
            }
            {
                Boolean ptShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pt!= null));
                if (ptShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePt;
                    sourcePt = this.getPt();
                    String copyPt = ((String) strategy.copy(LocatorUtils.property(locator, "pt", sourcePt), sourcePt, (this.pt!= null)));
                    copy.setPt(copyPt);
                } else {
                    if (ptShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pt = null;
                    }
                }
            }
            {
                Boolean roShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ro!= null));
                if (roShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRo;
                    sourceRo = this.getRo();
                    String copyRo = ((String) strategy.copy(LocatorUtils.property(locator, "ro", sourceRo), sourceRo, (this.ro!= null)));
                    copy.setRo(copyRo);
                } else {
                    if (roShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ro = null;
                    }
                }
            }
            {
                Boolean ruShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ru!= null));
                if (ruShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRu;
                    sourceRu = this.getRu();
                    String copyRu = ((String) strategy.copy(LocatorUtils.property(locator, "ru", sourceRu), sourceRu, (this.ru!= null)));
                    copy.setRu(copyRu);
                } else {
                    if (ruShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ru = null;
                    }
                }
            }
            {
                Boolean skShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sk!= null));
                if (skShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSk;
                    sourceSk = this.getSk();
                    String copySk = ((String) strategy.copy(LocatorUtils.property(locator, "sk", sourceSk), sourceSk, (this.sk!= null)));
                    copy.setSk(copySk);
                } else {
                    if (skShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sk = null;
                    }
                }
            }
            {
                Boolean slShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sl!= null));
                if (slShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSl;
                    sourceSl = this.getSl();
                    String copySl = ((String) strategy.copy(LocatorUtils.property(locator, "sl", sourceSl), sourceSl, (this.sl!= null)));
                    copy.setSl(copySl);
                } else {
                    if (slShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sl = null;
                    }
                }
            }
            {
                Boolean svShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sv!= null));
                if (svShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSv;
                    sourceSv = this.getSv();
                    String copySv = ((String) strategy.copy(LocatorUtils.property(locator, "sv", sourceSv), sourceSv, (this.sv!= null)));
                    copy.setSv(copySv);
                } else {
                    if (svShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sv = null;
                    }
                }
            }
            {
                Boolean thShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.th!= null));
                if (thShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTh;
                    sourceTh = this.getTh();
                    String copyTh = ((String) strategy.copy(LocatorUtils.property(locator, "th", sourceTh), sourceTh, (this.th!= null)));
                    copy.setTh(copyTh);
                } else {
                    if (thShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.th = null;
                    }
                }
            }
            {
                Boolean trShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tr!= null));
                if (trShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTr;
                    sourceTr = this.getTr();
                    String copyTr = ((String) strategy.copy(LocatorUtils.property(locator, "tr", sourceTr), sourceTr, (this.tr!= null)));
                    copy.setTr(copyTr);
                } else {
                    if (trShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tr = null;
                    }
                }
            }
            {
                Boolean ukShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.uk!= null));
                if (ukShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUk;
                    sourceUk = this.getUk();
                    String copyUk = ((String) strategy.copy(LocatorUtils.property(locator, "uk", sourceUk), sourceUk, (this.uk!= null)));
                    copy.setUk(copyUk);
                } else {
                    if (ukShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.uk = null;
                    }
                }
            }
            {
                Boolean viShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vi!= null));
                if (viShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVi;
                    sourceVi = this.getVi();
                    String copyVi = ((String) strategy.copy(LocatorUtils.property(locator, "vi", sourceVi), sourceVi, (this.vi!= null)));
                    copy.setVi(copyVi);
                } else {
                    if (viShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vi = null;
                    }
                }
            }
            {
                Boolean zhShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zh!= null));
                if (zhShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceZh;
                    sourceZh = this.getZh();
                    String copyZh = ((String) strategy.copy(LocatorUtils.property(locator, "zh", sourceZh), sourceZh, (this.zh!= null)));
                    copy.setZh(copyZh);
                } else {
                    if (zhShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zh = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LangType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LangType that = ((LangType) object);
        {
            String lhsAr;
            lhsAr = this.getAr();
            String rhsAr;
            rhsAr = that.getAr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ar", lhsAr), LocatorUtils.property(thatLocator, "ar", rhsAr), lhsAr, rhsAr, (this.ar!= null), (that.ar!= null))) {
                return false;
            }
        }
        {
            String lhsBg;
            lhsBg = this.getBg();
            String rhsBg;
            rhsBg = that.getBg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bg", lhsBg), LocatorUtils.property(thatLocator, "bg", rhsBg), lhsBg, rhsBg, (this.bg!= null), (that.bg!= null))) {
                return false;
            }
        }
        {
            String lhsCa;
            lhsCa = this.getCa();
            String rhsCa;
            rhsCa = that.getCa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ca", lhsCa), LocatorUtils.property(thatLocator, "ca", rhsCa), lhsCa, rhsCa, (this.ca!= null), (that.ca!= null))) {
                return false;
            }
        }
        {
            String lhsCs;
            lhsCs = this.getCs();
            String rhsCs;
            rhsCs = that.getCs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cs", lhsCs), LocatorUtils.property(thatLocator, "cs", rhsCs), lhsCs, rhsCs, (this.cs!= null), (that.cs!= null))) {
                return false;
            }
        }
        {
            String lhsDe;
            lhsDe = this.getDe();
            String rhsDe;
            rhsDe = that.getDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "de", lhsDe), LocatorUtils.property(thatLocator, "de", rhsDe), lhsDe, rhsDe, (this.de!= null), (that.de!= null))) {
                return false;
            }
        }
        {
            String lhsDa;
            lhsDa = this.getDa();
            String rhsDa;
            rhsDa = that.getDa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "da", lhsDa), LocatorUtils.property(thatLocator, "da", rhsDa), lhsDa, rhsDa, (this.da!= null), (that.da!= null))) {
                return false;
            }
        }
        {
            String lhsEl;
            lhsEl = this.getEl();
            String rhsEl;
            rhsEl = that.getEl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "el", lhsEl), LocatorUtils.property(thatLocator, "el", rhsEl), lhsEl, rhsEl, (this.el!= null), (that.el!= null))) {
                return false;
            }
        }
        {
            String lhsEn;
            lhsEn = this.getEn();
            String rhsEn;
            rhsEn = that.getEn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "en", lhsEn), LocatorUtils.property(thatLocator, "en", rhsEn), lhsEn, rhsEn, (this.en!= null), (that.en!= null))) {
                return false;
            }
        }
        {
            String lhsEs;
            lhsEs = this.getEs();
            String rhsEs;
            rhsEs = that.getEs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "es", lhsEs), LocatorUtils.property(thatLocator, "es", rhsEs), lhsEs, rhsEs, (this.es!= null), (that.es!= null))) {
                return false;
            }
        }
        {
            String lhsEt;
            lhsEt = this.getEt();
            String rhsEt;
            rhsEt = that.getEt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "et", lhsEt), LocatorUtils.property(thatLocator, "et", rhsEt), lhsEt, rhsEt, (this.et!= null), (that.et!= null))) {
                return false;
            }
        }
        {
            String lhsFa;
            lhsFa = this.getFa();
            String rhsFa;
            rhsFa = that.getFa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fa", lhsFa), LocatorUtils.property(thatLocator, "fa", rhsFa), lhsFa, rhsFa, (this.fa!= null), (that.fa!= null))) {
                return false;
            }
        }
        {
            String lhsFi;
            lhsFi = this.getFi();
            String rhsFi;
            rhsFi = that.getFi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fi", lhsFi), LocatorUtils.property(thatLocator, "fi", rhsFi), lhsFi, rhsFi, (this.fi!= null), (that.fi!= null))) {
                return false;
            }
        }
        {
            String lhsFr;
            lhsFr = this.getFr();
            String rhsFr;
            rhsFr = that.getFr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fr", lhsFr), LocatorUtils.property(thatLocator, "fr", rhsFr), lhsFr, rhsFr, (this.fr!= null), (that.fr!= null))) {
                return false;
            }
        }
        {
            String lhsHe;
            lhsHe = this.getHe();
            String rhsHe;
            rhsHe = that.getHe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "he", lhsHe), LocatorUtils.property(thatLocator, "he", rhsHe), lhsHe, rhsHe, (this.he!= null), (that.he!= null))) {
                return false;
            }
        }
        {
            String lhsHi;
            lhsHi = this.getHi();
            String rhsHi;
            rhsHi = that.getHi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hi", lhsHi), LocatorUtils.property(thatLocator, "hi", rhsHi), lhsHi, rhsHi, (this.hi!= null), (that.hi!= null))) {
                return false;
            }
        }
        {
            String lhsHu;
            lhsHu = this.getHu();
            String rhsHu;
            rhsHu = that.getHu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hu", lhsHu), LocatorUtils.property(thatLocator, "hu", rhsHu), lhsHu, rhsHu, (this.hu!= null), (that.hu!= null))) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            String lhsIt;
            lhsIt = this.getIt();
            String rhsIt;
            rhsIt = that.getIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "it", lhsIt), LocatorUtils.property(thatLocator, "it", rhsIt), lhsIt, rhsIt, (this.it!= null), (that.it!= null))) {
                return false;
            }
        }
        {
            String lhsJa;
            lhsJa = this.getJa();
            String rhsJa;
            rhsJa = that.getJa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ja", lhsJa), LocatorUtils.property(thatLocator, "ja", rhsJa), lhsJa, rhsJa, (this.ja!= null), (that.ja!= null))) {
                return false;
            }
        }
        {
            String lhsKo;
            lhsKo = this.getKo();
            String rhsKo;
            rhsKo = that.getKo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ko", lhsKo), LocatorUtils.property(thatLocator, "ko", rhsKo), lhsKo, rhsKo, (this.ko!= null), (that.ko!= null))) {
                return false;
            }
        }
        {
            String lhsLt;
            lhsLt = this.getLt();
            String rhsLt;
            rhsLt = that.getLt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lt", lhsLt), LocatorUtils.property(thatLocator, "lt", rhsLt), lhsLt, rhsLt, (this.lt!= null), (that.lt!= null))) {
                return false;
            }
        }
        {
            String lhsLv;
            lhsLv = this.getLv();
            String rhsLv;
            rhsLv = that.getLv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lv", lhsLv), LocatorUtils.property(thatLocator, "lv", rhsLv), lhsLv, rhsLv, (this.lv!= null), (that.lv!= null))) {
                return false;
            }
        }
        {
            String lhsNl;
            lhsNl = this.getNl();
            String rhsNl;
            rhsNl = that.getNl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nl", lhsNl), LocatorUtils.property(thatLocator, "nl", rhsNl), lhsNl, rhsNl, (this.nl!= null), (that.nl!= null))) {
                return false;
            }
        }
        {
            String lhsNo;
            lhsNo = this.getNo();
            String rhsNo;
            rhsNo = that.getNo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "no", lhsNo), LocatorUtils.property(thatLocator, "no", rhsNo), lhsNo, rhsNo, (this.no!= null), (that.no!= null))) {
                return false;
            }
        }
        {
            String lhsPl;
            lhsPl = this.getPl();
            String rhsPl;
            rhsPl = that.getPl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pl", lhsPl), LocatorUtils.property(thatLocator, "pl", rhsPl), lhsPl, rhsPl, (this.pl!= null), (that.pl!= null))) {
                return false;
            }
        }
        {
            String lhsPt;
            lhsPt = this.getPt();
            String rhsPt;
            rhsPt = that.getPt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pt", lhsPt), LocatorUtils.property(thatLocator, "pt", rhsPt), lhsPt, rhsPt, (this.pt!= null), (that.pt!= null))) {
                return false;
            }
        }
        {
            String lhsRo;
            lhsRo = this.getRo();
            String rhsRo;
            rhsRo = that.getRo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ro", lhsRo), LocatorUtils.property(thatLocator, "ro", rhsRo), lhsRo, rhsRo, (this.ro!= null), (that.ro!= null))) {
                return false;
            }
        }
        {
            String lhsRu;
            lhsRu = this.getRu();
            String rhsRu;
            rhsRu = that.getRu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ru", lhsRu), LocatorUtils.property(thatLocator, "ru", rhsRu), lhsRu, rhsRu, (this.ru!= null), (that.ru!= null))) {
                return false;
            }
        }
        {
            String lhsSk;
            lhsSk = this.getSk();
            String rhsSk;
            rhsSk = that.getSk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sk", lhsSk), LocatorUtils.property(thatLocator, "sk", rhsSk), lhsSk, rhsSk, (this.sk!= null), (that.sk!= null))) {
                return false;
            }
        }
        {
            String lhsSl;
            lhsSl = this.getSl();
            String rhsSl;
            rhsSl = that.getSl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sl", lhsSl), LocatorUtils.property(thatLocator, "sl", rhsSl), lhsSl, rhsSl, (this.sl!= null), (that.sl!= null))) {
                return false;
            }
        }
        {
            String lhsSv;
            lhsSv = this.getSv();
            String rhsSv;
            rhsSv = that.getSv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sv", lhsSv), LocatorUtils.property(thatLocator, "sv", rhsSv), lhsSv, rhsSv, (this.sv!= null), (that.sv!= null))) {
                return false;
            }
        }
        {
            String lhsTh;
            lhsTh = this.getTh();
            String rhsTh;
            rhsTh = that.getTh();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "th", lhsTh), LocatorUtils.property(thatLocator, "th", rhsTh), lhsTh, rhsTh, (this.th!= null), (that.th!= null))) {
                return false;
            }
        }
        {
            String lhsTr;
            lhsTr = this.getTr();
            String rhsTr;
            rhsTr = that.getTr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tr", lhsTr), LocatorUtils.property(thatLocator, "tr", rhsTr), lhsTr, rhsTr, (this.tr!= null), (that.tr!= null))) {
                return false;
            }
        }
        {
            String lhsUk;
            lhsUk = this.getUk();
            String rhsUk;
            rhsUk = that.getUk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uk", lhsUk), LocatorUtils.property(thatLocator, "uk", rhsUk), lhsUk, rhsUk, (this.uk!= null), (that.uk!= null))) {
                return false;
            }
        }
        {
            String lhsVi;
            lhsVi = this.getVi();
            String rhsVi;
            rhsVi = that.getVi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vi", lhsVi), LocatorUtils.property(thatLocator, "vi", rhsVi), lhsVi, rhsVi, (this.vi!= null), (that.vi!= null))) {
                return false;
            }
        }
        {
            String lhsZh;
            lhsZh = this.getZh();
            String rhsZh;
            rhsZh = that.getZh();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zh", lhsZh), LocatorUtils.property(thatLocator, "zh", rhsZh), lhsZh, rhsZh, (this.zh!= null), (that.zh!= null))) {
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
