
package org.openestate.io.kyero.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for langType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="langType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="de" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="da" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="el" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="en" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="es" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="et" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="he" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="it" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ko" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ru" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="th" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "langType", propOrder = {

})
public class LangType
    implements Cloneable, CopyTo, Equals, ToString
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
            String theAr;
            theAr = this.getAr();
            strategy.appendField(locator, this, "ar", buffer, theAr);
        }
        {
            String theBg;
            theBg = this.getBg();
            strategy.appendField(locator, this, "bg", buffer, theBg);
        }
        {
            String theCa;
            theCa = this.getCa();
            strategy.appendField(locator, this, "ca", buffer, theCa);
        }
        {
            String theCs;
            theCs = this.getCs();
            strategy.appendField(locator, this, "cs", buffer, theCs);
        }
        {
            String theDe;
            theDe = this.getDe();
            strategy.appendField(locator, this, "de", buffer, theDe);
        }
        {
            String theDa;
            theDa = this.getDa();
            strategy.appendField(locator, this, "da", buffer, theDa);
        }
        {
            String theEl;
            theEl = this.getEl();
            strategy.appendField(locator, this, "el", buffer, theEl);
        }
        {
            String theEn;
            theEn = this.getEn();
            strategy.appendField(locator, this, "en", buffer, theEn);
        }
        {
            String theEs;
            theEs = this.getEs();
            strategy.appendField(locator, this, "es", buffer, theEs);
        }
        {
            String theEt;
            theEt = this.getEt();
            strategy.appendField(locator, this, "et", buffer, theEt);
        }
        {
            String theFa;
            theFa = this.getFa();
            strategy.appendField(locator, this, "fa", buffer, theFa);
        }
        {
            String theFi;
            theFi = this.getFi();
            strategy.appendField(locator, this, "fi", buffer, theFi);
        }
        {
            String theFr;
            theFr = this.getFr();
            strategy.appendField(locator, this, "fr", buffer, theFr);
        }
        {
            String theHe;
            theHe = this.getHe();
            strategy.appendField(locator, this, "he", buffer, theHe);
        }
        {
            String theHi;
            theHi = this.getHi();
            strategy.appendField(locator, this, "hi", buffer, theHi);
        }
        {
            String theHu;
            theHu = this.getHu();
            strategy.appendField(locator, this, "hu", buffer, theHu);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theIt;
            theIt = this.getIt();
            strategy.appendField(locator, this, "it", buffer, theIt);
        }
        {
            String theJa;
            theJa = this.getJa();
            strategy.appendField(locator, this, "ja", buffer, theJa);
        }
        {
            String theKo;
            theKo = this.getKo();
            strategy.appendField(locator, this, "ko", buffer, theKo);
        }
        {
            String theLt;
            theLt = this.getLt();
            strategy.appendField(locator, this, "lt", buffer, theLt);
        }
        {
            String theLv;
            theLv = this.getLv();
            strategy.appendField(locator, this, "lv", buffer, theLv);
        }
        {
            String theNl;
            theNl = this.getNl();
            strategy.appendField(locator, this, "nl", buffer, theNl);
        }
        {
            String theNo;
            theNo = this.getNo();
            strategy.appendField(locator, this, "no", buffer, theNo);
        }
        {
            String thePl;
            thePl = this.getPl();
            strategy.appendField(locator, this, "pl", buffer, thePl);
        }
        {
            String thePt;
            thePt = this.getPt();
            strategy.appendField(locator, this, "pt", buffer, thePt);
        }
        {
            String theRo;
            theRo = this.getRo();
            strategy.appendField(locator, this, "ro", buffer, theRo);
        }
        {
            String theRu;
            theRu = this.getRu();
            strategy.appendField(locator, this, "ru", buffer, theRu);
        }
        {
            String theSk;
            theSk = this.getSk();
            strategy.appendField(locator, this, "sk", buffer, theSk);
        }
        {
            String theSl;
            theSl = this.getSl();
            strategy.appendField(locator, this, "sl", buffer, theSl);
        }
        {
            String theSv;
            theSv = this.getSv();
            strategy.appendField(locator, this, "sv", buffer, theSv);
        }
        {
            String theTh;
            theTh = this.getTh();
            strategy.appendField(locator, this, "th", buffer, theTh);
        }
        {
            String theTr;
            theTr = this.getTr();
            strategy.appendField(locator, this, "tr", buffer, theTr);
        }
        {
            String theUk;
            theUk = this.getUk();
            strategy.appendField(locator, this, "uk", buffer, theUk);
        }
        {
            String theVi;
            theVi = this.getVi();
            strategy.appendField(locator, this, "vi", buffer, theVi);
        }
        {
            String theZh;
            theZh = this.getZh();
            strategy.appendField(locator, this, "zh", buffer, theZh);
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
        if (draftCopy instanceof LangType) {
            final LangType copy = ((LangType) draftCopy);
            if (this.ar!= null) {
                String sourceAr;
                sourceAr = this.getAr();
                String copyAr = ((String) strategy.copy(LocatorUtils.property(locator, "ar", sourceAr), sourceAr));
                copy.setAr(copyAr);
            } else {
                copy.ar = null;
            }
            if (this.bg!= null) {
                String sourceBg;
                sourceBg = this.getBg();
                String copyBg = ((String) strategy.copy(LocatorUtils.property(locator, "bg", sourceBg), sourceBg));
                copy.setBg(copyBg);
            } else {
                copy.bg = null;
            }
            if (this.ca!= null) {
                String sourceCa;
                sourceCa = this.getCa();
                String copyCa = ((String) strategy.copy(LocatorUtils.property(locator, "ca", sourceCa), sourceCa));
                copy.setCa(copyCa);
            } else {
                copy.ca = null;
            }
            if (this.cs!= null) {
                String sourceCs;
                sourceCs = this.getCs();
                String copyCs = ((String) strategy.copy(LocatorUtils.property(locator, "cs", sourceCs), sourceCs));
                copy.setCs(copyCs);
            } else {
                copy.cs = null;
            }
            if (this.de!= null) {
                String sourceDe;
                sourceDe = this.getDe();
                String copyDe = ((String) strategy.copy(LocatorUtils.property(locator, "de", sourceDe), sourceDe));
                copy.setDe(copyDe);
            } else {
                copy.de = null;
            }
            if (this.da!= null) {
                String sourceDa;
                sourceDa = this.getDa();
                String copyDa = ((String) strategy.copy(LocatorUtils.property(locator, "da", sourceDa), sourceDa));
                copy.setDa(copyDa);
            } else {
                copy.da = null;
            }
            if (this.el!= null) {
                String sourceEl;
                sourceEl = this.getEl();
                String copyEl = ((String) strategy.copy(LocatorUtils.property(locator, "el", sourceEl), sourceEl));
                copy.setEl(copyEl);
            } else {
                copy.el = null;
            }
            if (this.en!= null) {
                String sourceEn;
                sourceEn = this.getEn();
                String copyEn = ((String) strategy.copy(LocatorUtils.property(locator, "en", sourceEn), sourceEn));
                copy.setEn(copyEn);
            } else {
                copy.en = null;
            }
            if (this.es!= null) {
                String sourceEs;
                sourceEs = this.getEs();
                String copyEs = ((String) strategy.copy(LocatorUtils.property(locator, "es", sourceEs), sourceEs));
                copy.setEs(copyEs);
            } else {
                copy.es = null;
            }
            if (this.et!= null) {
                String sourceEt;
                sourceEt = this.getEt();
                String copyEt = ((String) strategy.copy(LocatorUtils.property(locator, "et", sourceEt), sourceEt));
                copy.setEt(copyEt);
            } else {
                copy.et = null;
            }
            if (this.fa!= null) {
                String sourceFa;
                sourceFa = this.getFa();
                String copyFa = ((String) strategy.copy(LocatorUtils.property(locator, "fa", sourceFa), sourceFa));
                copy.setFa(copyFa);
            } else {
                copy.fa = null;
            }
            if (this.fi!= null) {
                String sourceFi;
                sourceFi = this.getFi();
                String copyFi = ((String) strategy.copy(LocatorUtils.property(locator, "fi", sourceFi), sourceFi));
                copy.setFi(copyFi);
            } else {
                copy.fi = null;
            }
            if (this.fr!= null) {
                String sourceFr;
                sourceFr = this.getFr();
                String copyFr = ((String) strategy.copy(LocatorUtils.property(locator, "fr", sourceFr), sourceFr));
                copy.setFr(copyFr);
            } else {
                copy.fr = null;
            }
            if (this.he!= null) {
                String sourceHe;
                sourceHe = this.getHe();
                String copyHe = ((String) strategy.copy(LocatorUtils.property(locator, "he", sourceHe), sourceHe));
                copy.setHe(copyHe);
            } else {
                copy.he = null;
            }
            if (this.hi!= null) {
                String sourceHi;
                sourceHi = this.getHi();
                String copyHi = ((String) strategy.copy(LocatorUtils.property(locator, "hi", sourceHi), sourceHi));
                copy.setHi(copyHi);
            } else {
                copy.hi = null;
            }
            if (this.hu!= null) {
                String sourceHu;
                sourceHu = this.getHu();
                String copyHu = ((String) strategy.copy(LocatorUtils.property(locator, "hu", sourceHu), sourceHu));
                copy.setHu(copyHu);
            } else {
                copy.hu = null;
            }
            if (this.id!= null) {
                String sourceId;
                sourceId = this.getId();
                String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                copy.setId(copyId);
            } else {
                copy.id = null;
            }
            if (this.it!= null) {
                String sourceIt;
                sourceIt = this.getIt();
                String copyIt = ((String) strategy.copy(LocatorUtils.property(locator, "it", sourceIt), sourceIt));
                copy.setIt(copyIt);
            } else {
                copy.it = null;
            }
            if (this.ja!= null) {
                String sourceJa;
                sourceJa = this.getJa();
                String copyJa = ((String) strategy.copy(LocatorUtils.property(locator, "ja", sourceJa), sourceJa));
                copy.setJa(copyJa);
            } else {
                copy.ja = null;
            }
            if (this.ko!= null) {
                String sourceKo;
                sourceKo = this.getKo();
                String copyKo = ((String) strategy.copy(LocatorUtils.property(locator, "ko", sourceKo), sourceKo));
                copy.setKo(copyKo);
            } else {
                copy.ko = null;
            }
            if (this.lt!= null) {
                String sourceLt;
                sourceLt = this.getLt();
                String copyLt = ((String) strategy.copy(LocatorUtils.property(locator, "lt", sourceLt), sourceLt));
                copy.setLt(copyLt);
            } else {
                copy.lt = null;
            }
            if (this.lv!= null) {
                String sourceLv;
                sourceLv = this.getLv();
                String copyLv = ((String) strategy.copy(LocatorUtils.property(locator, "lv", sourceLv), sourceLv));
                copy.setLv(copyLv);
            } else {
                copy.lv = null;
            }
            if (this.nl!= null) {
                String sourceNl;
                sourceNl = this.getNl();
                String copyNl = ((String) strategy.copy(LocatorUtils.property(locator, "nl", sourceNl), sourceNl));
                copy.setNl(copyNl);
            } else {
                copy.nl = null;
            }
            if (this.no!= null) {
                String sourceNo;
                sourceNo = this.getNo();
                String copyNo = ((String) strategy.copy(LocatorUtils.property(locator, "no", sourceNo), sourceNo));
                copy.setNo(copyNo);
            } else {
                copy.no = null;
            }
            if (this.pl!= null) {
                String sourcePl;
                sourcePl = this.getPl();
                String copyPl = ((String) strategy.copy(LocatorUtils.property(locator, "pl", sourcePl), sourcePl));
                copy.setPl(copyPl);
            } else {
                copy.pl = null;
            }
            if (this.pt!= null) {
                String sourcePt;
                sourcePt = this.getPt();
                String copyPt = ((String) strategy.copy(LocatorUtils.property(locator, "pt", sourcePt), sourcePt));
                copy.setPt(copyPt);
            } else {
                copy.pt = null;
            }
            if (this.ro!= null) {
                String sourceRo;
                sourceRo = this.getRo();
                String copyRo = ((String) strategy.copy(LocatorUtils.property(locator, "ro", sourceRo), sourceRo));
                copy.setRo(copyRo);
            } else {
                copy.ro = null;
            }
            if (this.ru!= null) {
                String sourceRu;
                sourceRu = this.getRu();
                String copyRu = ((String) strategy.copy(LocatorUtils.property(locator, "ru", sourceRu), sourceRu));
                copy.setRu(copyRu);
            } else {
                copy.ru = null;
            }
            if (this.sk!= null) {
                String sourceSk;
                sourceSk = this.getSk();
                String copySk = ((String) strategy.copy(LocatorUtils.property(locator, "sk", sourceSk), sourceSk));
                copy.setSk(copySk);
            } else {
                copy.sk = null;
            }
            if (this.sl!= null) {
                String sourceSl;
                sourceSl = this.getSl();
                String copySl = ((String) strategy.copy(LocatorUtils.property(locator, "sl", sourceSl), sourceSl));
                copy.setSl(copySl);
            } else {
                copy.sl = null;
            }
            if (this.sv!= null) {
                String sourceSv;
                sourceSv = this.getSv();
                String copySv = ((String) strategy.copy(LocatorUtils.property(locator, "sv", sourceSv), sourceSv));
                copy.setSv(copySv);
            } else {
                copy.sv = null;
            }
            if (this.th!= null) {
                String sourceTh;
                sourceTh = this.getTh();
                String copyTh = ((String) strategy.copy(LocatorUtils.property(locator, "th", sourceTh), sourceTh));
                copy.setTh(copyTh);
            } else {
                copy.th = null;
            }
            if (this.tr!= null) {
                String sourceTr;
                sourceTr = this.getTr();
                String copyTr = ((String) strategy.copy(LocatorUtils.property(locator, "tr", sourceTr), sourceTr));
                copy.setTr(copyTr);
            } else {
                copy.tr = null;
            }
            if (this.uk!= null) {
                String sourceUk;
                sourceUk = this.getUk();
                String copyUk = ((String) strategy.copy(LocatorUtils.property(locator, "uk", sourceUk), sourceUk));
                copy.setUk(copyUk);
            } else {
                copy.uk = null;
            }
            if (this.vi!= null) {
                String sourceVi;
                sourceVi = this.getVi();
                String copyVi = ((String) strategy.copy(LocatorUtils.property(locator, "vi", sourceVi), sourceVi));
                copy.setVi(copyVi);
            } else {
                copy.vi = null;
            }
            if (this.zh!= null) {
                String sourceZh;
                sourceZh = this.getZh();
                String copyZh = ((String) strategy.copy(LocatorUtils.property(locator, "zh", sourceZh), sourceZh));
                copy.setZh(copyZh);
            } else {
                copy.zh = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LangType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LangType)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ar", lhsAr), LocatorUtils.property(thatLocator, "ar", rhsAr), lhsAr, rhsAr)) {
                return false;
            }
        }
        {
            String lhsBg;
            lhsBg = this.getBg();
            String rhsBg;
            rhsBg = that.getBg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bg", lhsBg), LocatorUtils.property(thatLocator, "bg", rhsBg), lhsBg, rhsBg)) {
                return false;
            }
        }
        {
            String lhsCa;
            lhsCa = this.getCa();
            String rhsCa;
            rhsCa = that.getCa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ca", lhsCa), LocatorUtils.property(thatLocator, "ca", rhsCa), lhsCa, rhsCa)) {
                return false;
            }
        }
        {
            String lhsCs;
            lhsCs = this.getCs();
            String rhsCs;
            rhsCs = that.getCs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cs", lhsCs), LocatorUtils.property(thatLocator, "cs", rhsCs), lhsCs, rhsCs)) {
                return false;
            }
        }
        {
            String lhsDe;
            lhsDe = this.getDe();
            String rhsDe;
            rhsDe = that.getDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "de", lhsDe), LocatorUtils.property(thatLocator, "de", rhsDe), lhsDe, rhsDe)) {
                return false;
            }
        }
        {
            String lhsDa;
            lhsDa = this.getDa();
            String rhsDa;
            rhsDa = that.getDa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "da", lhsDa), LocatorUtils.property(thatLocator, "da", rhsDa), lhsDa, rhsDa)) {
                return false;
            }
        }
        {
            String lhsEl;
            lhsEl = this.getEl();
            String rhsEl;
            rhsEl = that.getEl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "el", lhsEl), LocatorUtils.property(thatLocator, "el", rhsEl), lhsEl, rhsEl)) {
                return false;
            }
        }
        {
            String lhsEn;
            lhsEn = this.getEn();
            String rhsEn;
            rhsEn = that.getEn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "en", lhsEn), LocatorUtils.property(thatLocator, "en", rhsEn), lhsEn, rhsEn)) {
                return false;
            }
        }
        {
            String lhsEs;
            lhsEs = this.getEs();
            String rhsEs;
            rhsEs = that.getEs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "es", lhsEs), LocatorUtils.property(thatLocator, "es", rhsEs), lhsEs, rhsEs)) {
                return false;
            }
        }
        {
            String lhsEt;
            lhsEt = this.getEt();
            String rhsEt;
            rhsEt = that.getEt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "et", lhsEt), LocatorUtils.property(thatLocator, "et", rhsEt), lhsEt, rhsEt)) {
                return false;
            }
        }
        {
            String lhsFa;
            lhsFa = this.getFa();
            String rhsFa;
            rhsFa = that.getFa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fa", lhsFa), LocatorUtils.property(thatLocator, "fa", rhsFa), lhsFa, rhsFa)) {
                return false;
            }
        }
        {
            String lhsFi;
            lhsFi = this.getFi();
            String rhsFi;
            rhsFi = that.getFi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fi", lhsFi), LocatorUtils.property(thatLocator, "fi", rhsFi), lhsFi, rhsFi)) {
                return false;
            }
        }
        {
            String lhsFr;
            lhsFr = this.getFr();
            String rhsFr;
            rhsFr = that.getFr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fr", lhsFr), LocatorUtils.property(thatLocator, "fr", rhsFr), lhsFr, rhsFr)) {
                return false;
            }
        }
        {
            String lhsHe;
            lhsHe = this.getHe();
            String rhsHe;
            rhsHe = that.getHe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "he", lhsHe), LocatorUtils.property(thatLocator, "he", rhsHe), lhsHe, rhsHe)) {
                return false;
            }
        }
        {
            String lhsHi;
            lhsHi = this.getHi();
            String rhsHi;
            rhsHi = that.getHi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hi", lhsHi), LocatorUtils.property(thatLocator, "hi", rhsHi), lhsHi, rhsHi)) {
                return false;
            }
        }
        {
            String lhsHu;
            lhsHu = this.getHu();
            String rhsHu;
            rhsHu = that.getHu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hu", lhsHu), LocatorUtils.property(thatLocator, "hu", rhsHu), lhsHu, rhsHu)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsIt;
            lhsIt = this.getIt();
            String rhsIt;
            rhsIt = that.getIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "it", lhsIt), LocatorUtils.property(thatLocator, "it", rhsIt), lhsIt, rhsIt)) {
                return false;
            }
        }
        {
            String lhsJa;
            lhsJa = this.getJa();
            String rhsJa;
            rhsJa = that.getJa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ja", lhsJa), LocatorUtils.property(thatLocator, "ja", rhsJa), lhsJa, rhsJa)) {
                return false;
            }
        }
        {
            String lhsKo;
            lhsKo = this.getKo();
            String rhsKo;
            rhsKo = that.getKo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ko", lhsKo), LocatorUtils.property(thatLocator, "ko", rhsKo), lhsKo, rhsKo)) {
                return false;
            }
        }
        {
            String lhsLt;
            lhsLt = this.getLt();
            String rhsLt;
            rhsLt = that.getLt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lt", lhsLt), LocatorUtils.property(thatLocator, "lt", rhsLt), lhsLt, rhsLt)) {
                return false;
            }
        }
        {
            String lhsLv;
            lhsLv = this.getLv();
            String rhsLv;
            rhsLv = that.getLv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lv", lhsLv), LocatorUtils.property(thatLocator, "lv", rhsLv), lhsLv, rhsLv)) {
                return false;
            }
        }
        {
            String lhsNl;
            lhsNl = this.getNl();
            String rhsNl;
            rhsNl = that.getNl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nl", lhsNl), LocatorUtils.property(thatLocator, "nl", rhsNl), lhsNl, rhsNl)) {
                return false;
            }
        }
        {
            String lhsNo;
            lhsNo = this.getNo();
            String rhsNo;
            rhsNo = that.getNo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "no", lhsNo), LocatorUtils.property(thatLocator, "no", rhsNo), lhsNo, rhsNo)) {
                return false;
            }
        }
        {
            String lhsPl;
            lhsPl = this.getPl();
            String rhsPl;
            rhsPl = that.getPl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pl", lhsPl), LocatorUtils.property(thatLocator, "pl", rhsPl), lhsPl, rhsPl)) {
                return false;
            }
        }
        {
            String lhsPt;
            lhsPt = this.getPt();
            String rhsPt;
            rhsPt = that.getPt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pt", lhsPt), LocatorUtils.property(thatLocator, "pt", rhsPt), lhsPt, rhsPt)) {
                return false;
            }
        }
        {
            String lhsRo;
            lhsRo = this.getRo();
            String rhsRo;
            rhsRo = that.getRo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ro", lhsRo), LocatorUtils.property(thatLocator, "ro", rhsRo), lhsRo, rhsRo)) {
                return false;
            }
        }
        {
            String lhsRu;
            lhsRu = this.getRu();
            String rhsRu;
            rhsRu = that.getRu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ru", lhsRu), LocatorUtils.property(thatLocator, "ru", rhsRu), lhsRu, rhsRu)) {
                return false;
            }
        }
        {
            String lhsSk;
            lhsSk = this.getSk();
            String rhsSk;
            rhsSk = that.getSk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sk", lhsSk), LocatorUtils.property(thatLocator, "sk", rhsSk), lhsSk, rhsSk)) {
                return false;
            }
        }
        {
            String lhsSl;
            lhsSl = this.getSl();
            String rhsSl;
            rhsSl = that.getSl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sl", lhsSl), LocatorUtils.property(thatLocator, "sl", rhsSl), lhsSl, rhsSl)) {
                return false;
            }
        }
        {
            String lhsSv;
            lhsSv = this.getSv();
            String rhsSv;
            rhsSv = that.getSv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sv", lhsSv), LocatorUtils.property(thatLocator, "sv", rhsSv), lhsSv, rhsSv)) {
                return false;
            }
        }
        {
            String lhsTh;
            lhsTh = this.getTh();
            String rhsTh;
            rhsTh = that.getTh();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "th", lhsTh), LocatorUtils.property(thatLocator, "th", rhsTh), lhsTh, rhsTh)) {
                return false;
            }
        }
        {
            String lhsTr;
            lhsTr = this.getTr();
            String rhsTr;
            rhsTr = that.getTr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tr", lhsTr), LocatorUtils.property(thatLocator, "tr", rhsTr), lhsTr, rhsTr)) {
                return false;
            }
        }
        {
            String lhsUk;
            lhsUk = this.getUk();
            String rhsUk;
            rhsUk = that.getUk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uk", lhsUk), LocatorUtils.property(thatLocator, "uk", rhsUk), lhsUk, rhsUk)) {
                return false;
            }
        }
        {
            String lhsVi;
            lhsVi = this.getVi();
            String rhsVi;
            rhsVi = that.getVi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vi", lhsVi), LocatorUtils.property(thatLocator, "vi", rhsVi), lhsVi, rhsVi)) {
                return false;
            }
        }
        {
            String lhsZh;
            lhsZh = this.getZh();
            String rhsZh;
            rhsZh = that.getZh();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zh", lhsZh), LocatorUtils.property(thatLocator, "zh", rhsZh), lhsZh, rhsZh)) {
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
