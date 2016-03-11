
package org.openestate.io.kyero.xml;

import java.net.URL;
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
 *         &lt;element name="ar" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="bg" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="ca" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="cs" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="de" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="da" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="el" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="en" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="es" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="et" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="fa" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="fi" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="fr" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="he" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="hi" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="hu" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="it" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="ja" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="ko" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="lt" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="lv" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="nl" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="no" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="pl" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="pt" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="ro" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="ru" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="sk" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="sl" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="sv" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="th" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="tr" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="uk" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="vi" type="{}urlDataType" minOccurs="0"/&gt;
 *         &lt;element name="zh" type="{}urlDataType" minOccurs="0"/&gt;
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
public class UrlType implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL ar;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL bg;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL ca;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL cs;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL de;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL da;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL el;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL en;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL es;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL et;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL fa;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL fi;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL fr;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL he;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL hi;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL hu;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL id;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL it;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL ja;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL ko;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL lt;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL lv;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL nl;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL no;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL pl;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL pt;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL ro;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL ru;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL sk;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL sl;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL sv;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL th;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL tr;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL uk;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL vi;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @XmlSchemaType(name = "token")
    protected URL zh;

    /**
     * Gets the value of the ar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URL getAr() {
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
    public void setAr(URL value) {
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
    public URL getBg() {
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
    public void setBg(URL value) {
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
    public URL getCa() {
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
    public void setCa(URL value) {
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
    public URL getCs() {
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
    public void setCs(URL value) {
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
    public URL getDe() {
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
    public void setDe(URL value) {
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
    public URL getDa() {
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
    public void setDa(URL value) {
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
    public URL getEl() {
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
    public void setEl(URL value) {
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
    public URL getEn() {
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
    public void setEn(URL value) {
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
    public URL getEs() {
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
    public void setEs(URL value) {
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
    public URL getEt() {
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
    public void setEt(URL value) {
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
    public URL getFa() {
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
    public void setFa(URL value) {
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
    public URL getFi() {
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
    public void setFi(URL value) {
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
    public URL getFr() {
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
    public void setFr(URL value) {
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
    public URL getHe() {
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
    public void setHe(URL value) {
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
    public URL getHi() {
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
    public void setHi(URL value) {
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
    public URL getHu() {
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
    public void setHu(URL value) {
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
    public URL getId() {
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
    public void setId(URL value) {
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
    public URL getIt() {
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
    public void setIt(URL value) {
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
    public URL getJa() {
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
    public void setJa(URL value) {
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
    public URL getKo() {
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
    public void setKo(URL value) {
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
    public URL getLt() {
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
    public void setLt(URL value) {
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
    public URL getLv() {
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
    public void setLv(URL value) {
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
    public URL getNl() {
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
    public void setNl(URL value) {
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
    public URL getNo() {
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
    public void setNo(URL value) {
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
    public URL getPl() {
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
    public void setPl(URL value) {
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
    public URL getPt() {
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
    public void setPt(URL value) {
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
    public URL getRo() {
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
    public void setRo(URL value) {
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
    public URL getRu() {
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
    public void setRu(URL value) {
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
    public URL getSk() {
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
    public void setSk(URL value) {
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
    public URL getSl() {
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
    public void setSl(URL value) {
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
    public URL getSv() {
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
    public void setSv(URL value) {
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
    public URL getTh() {
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
    public void setTh(URL value) {
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
    public URL getTr() {
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
    public void setTr(URL value) {
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
    public URL getUk() {
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
    public void setUk(URL value) {
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
    public URL getVi() {
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
    public void setVi(URL value) {
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
    public URL getZh() {
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
    public void setZh(URL value) {
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
            URL theAr;
            theAr = this.getAr();
            strategy.appendField(locator, this, "ar", buffer, theAr, (this.ar!= null));
        }
        {
            URL theBg;
            theBg = this.getBg();
            strategy.appendField(locator, this, "bg", buffer, theBg, (this.bg!= null));
        }
        {
            URL theCa;
            theCa = this.getCa();
            strategy.appendField(locator, this, "ca", buffer, theCa, (this.ca!= null));
        }
        {
            URL theCs;
            theCs = this.getCs();
            strategy.appendField(locator, this, "cs", buffer, theCs, (this.cs!= null));
        }
        {
            URL theDe;
            theDe = this.getDe();
            strategy.appendField(locator, this, "de", buffer, theDe, (this.de!= null));
        }
        {
            URL theDa;
            theDa = this.getDa();
            strategy.appendField(locator, this, "da", buffer, theDa, (this.da!= null));
        }
        {
            URL theEl;
            theEl = this.getEl();
            strategy.appendField(locator, this, "el", buffer, theEl, (this.el!= null));
        }
        {
            URL theEn;
            theEn = this.getEn();
            strategy.appendField(locator, this, "en", buffer, theEn, (this.en!= null));
        }
        {
            URL theEs;
            theEs = this.getEs();
            strategy.appendField(locator, this, "es", buffer, theEs, (this.es!= null));
        }
        {
            URL theEt;
            theEt = this.getEt();
            strategy.appendField(locator, this, "et", buffer, theEt, (this.et!= null));
        }
        {
            URL theFa;
            theFa = this.getFa();
            strategy.appendField(locator, this, "fa", buffer, theFa, (this.fa!= null));
        }
        {
            URL theFi;
            theFi = this.getFi();
            strategy.appendField(locator, this, "fi", buffer, theFi, (this.fi!= null));
        }
        {
            URL theFr;
            theFr = this.getFr();
            strategy.appendField(locator, this, "fr", buffer, theFr, (this.fr!= null));
        }
        {
            URL theHe;
            theHe = this.getHe();
            strategy.appendField(locator, this, "he", buffer, theHe, (this.he!= null));
        }
        {
            URL theHi;
            theHi = this.getHi();
            strategy.appendField(locator, this, "hi", buffer, theHi, (this.hi!= null));
        }
        {
            URL theHu;
            theHu = this.getHu();
            strategy.appendField(locator, this, "hu", buffer, theHu, (this.hu!= null));
        }
        {
            URL theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
        }
        {
            URL theIt;
            theIt = this.getIt();
            strategy.appendField(locator, this, "it", buffer, theIt, (this.it!= null));
        }
        {
            URL theJa;
            theJa = this.getJa();
            strategy.appendField(locator, this, "ja", buffer, theJa, (this.ja!= null));
        }
        {
            URL theKo;
            theKo = this.getKo();
            strategy.appendField(locator, this, "ko", buffer, theKo, (this.ko!= null));
        }
        {
            URL theLt;
            theLt = this.getLt();
            strategy.appendField(locator, this, "lt", buffer, theLt, (this.lt!= null));
        }
        {
            URL theLv;
            theLv = this.getLv();
            strategy.appendField(locator, this, "lv", buffer, theLv, (this.lv!= null));
        }
        {
            URL theNl;
            theNl = this.getNl();
            strategy.appendField(locator, this, "nl", buffer, theNl, (this.nl!= null));
        }
        {
            URL theNo;
            theNo = this.getNo();
            strategy.appendField(locator, this, "no", buffer, theNo, (this.no!= null));
        }
        {
            URL thePl;
            thePl = this.getPl();
            strategy.appendField(locator, this, "pl", buffer, thePl, (this.pl!= null));
        }
        {
            URL thePt;
            thePt = this.getPt();
            strategy.appendField(locator, this, "pt", buffer, thePt, (this.pt!= null));
        }
        {
            URL theRo;
            theRo = this.getRo();
            strategy.appendField(locator, this, "ro", buffer, theRo, (this.ro!= null));
        }
        {
            URL theRu;
            theRu = this.getRu();
            strategy.appendField(locator, this, "ru", buffer, theRu, (this.ru!= null));
        }
        {
            URL theSk;
            theSk = this.getSk();
            strategy.appendField(locator, this, "sk", buffer, theSk, (this.sk!= null));
        }
        {
            URL theSl;
            theSl = this.getSl();
            strategy.appendField(locator, this, "sl", buffer, theSl, (this.sl!= null));
        }
        {
            URL theSv;
            theSv = this.getSv();
            strategy.appendField(locator, this, "sv", buffer, theSv, (this.sv!= null));
        }
        {
            URL theTh;
            theTh = this.getTh();
            strategy.appendField(locator, this, "th", buffer, theTh, (this.th!= null));
        }
        {
            URL theTr;
            theTr = this.getTr();
            strategy.appendField(locator, this, "tr", buffer, theTr, (this.tr!= null));
        }
        {
            URL theUk;
            theUk = this.getUk();
            strategy.appendField(locator, this, "uk", buffer, theUk, (this.uk!= null));
        }
        {
            URL theVi;
            theVi = this.getVi();
            strategy.appendField(locator, this, "vi", buffer, theVi, (this.vi!= null));
        }
        {
            URL theZh;
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
        if (draftCopy instanceof UrlType) {
            final UrlType copy = ((UrlType) draftCopy);
            {
                Boolean arShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ar!= null));
                if (arShouldBeCopiedAndSet == Boolean.TRUE) {
                    URL sourceAr;
                    sourceAr = this.getAr();
                    URL copyAr = ((URL) strategy.copy(LocatorUtils.property(locator, "ar", sourceAr), sourceAr, (this.ar!= null)));
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
                    URL sourceBg;
                    sourceBg = this.getBg();
                    URL copyBg = ((URL) strategy.copy(LocatorUtils.property(locator, "bg", sourceBg), sourceBg, (this.bg!= null)));
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
                    URL sourceCa;
                    sourceCa = this.getCa();
                    URL copyCa = ((URL) strategy.copy(LocatorUtils.property(locator, "ca", sourceCa), sourceCa, (this.ca!= null)));
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
                    URL sourceCs;
                    sourceCs = this.getCs();
                    URL copyCs = ((URL) strategy.copy(LocatorUtils.property(locator, "cs", sourceCs), sourceCs, (this.cs!= null)));
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
                    URL sourceDe;
                    sourceDe = this.getDe();
                    URL copyDe = ((URL) strategy.copy(LocatorUtils.property(locator, "de", sourceDe), sourceDe, (this.de!= null)));
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
                    URL sourceDa;
                    sourceDa = this.getDa();
                    URL copyDa = ((URL) strategy.copy(LocatorUtils.property(locator, "da", sourceDa), sourceDa, (this.da!= null)));
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
                    URL sourceEl;
                    sourceEl = this.getEl();
                    URL copyEl = ((URL) strategy.copy(LocatorUtils.property(locator, "el", sourceEl), sourceEl, (this.el!= null)));
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
                    URL sourceEn;
                    sourceEn = this.getEn();
                    URL copyEn = ((URL) strategy.copy(LocatorUtils.property(locator, "en", sourceEn), sourceEn, (this.en!= null)));
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
                    URL sourceEs;
                    sourceEs = this.getEs();
                    URL copyEs = ((URL) strategy.copy(LocatorUtils.property(locator, "es", sourceEs), sourceEs, (this.es!= null)));
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
                    URL sourceEt;
                    sourceEt = this.getEt();
                    URL copyEt = ((URL) strategy.copy(LocatorUtils.property(locator, "et", sourceEt), sourceEt, (this.et!= null)));
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
                    URL sourceFa;
                    sourceFa = this.getFa();
                    URL copyFa = ((URL) strategy.copy(LocatorUtils.property(locator, "fa", sourceFa), sourceFa, (this.fa!= null)));
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
                    URL sourceFi;
                    sourceFi = this.getFi();
                    URL copyFi = ((URL) strategy.copy(LocatorUtils.property(locator, "fi", sourceFi), sourceFi, (this.fi!= null)));
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
                    URL sourceFr;
                    sourceFr = this.getFr();
                    URL copyFr = ((URL) strategy.copy(LocatorUtils.property(locator, "fr", sourceFr), sourceFr, (this.fr!= null)));
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
                    URL sourceHe;
                    sourceHe = this.getHe();
                    URL copyHe = ((URL) strategy.copy(LocatorUtils.property(locator, "he", sourceHe), sourceHe, (this.he!= null)));
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
                    URL sourceHi;
                    sourceHi = this.getHi();
                    URL copyHi = ((URL) strategy.copy(LocatorUtils.property(locator, "hi", sourceHi), sourceHi, (this.hi!= null)));
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
                    URL sourceHu;
                    sourceHu = this.getHu();
                    URL copyHu = ((URL) strategy.copy(LocatorUtils.property(locator, "hu", sourceHu), sourceHu, (this.hu!= null)));
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
                    URL sourceId;
                    sourceId = this.getId();
                    URL copyId = ((URL) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
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
                    URL sourceIt;
                    sourceIt = this.getIt();
                    URL copyIt = ((URL) strategy.copy(LocatorUtils.property(locator, "it", sourceIt), sourceIt, (this.it!= null)));
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
                    URL sourceJa;
                    sourceJa = this.getJa();
                    URL copyJa = ((URL) strategy.copy(LocatorUtils.property(locator, "ja", sourceJa), sourceJa, (this.ja!= null)));
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
                    URL sourceKo;
                    sourceKo = this.getKo();
                    URL copyKo = ((URL) strategy.copy(LocatorUtils.property(locator, "ko", sourceKo), sourceKo, (this.ko!= null)));
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
                    URL sourceLt;
                    sourceLt = this.getLt();
                    URL copyLt = ((URL) strategy.copy(LocatorUtils.property(locator, "lt", sourceLt), sourceLt, (this.lt!= null)));
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
                    URL sourceLv;
                    sourceLv = this.getLv();
                    URL copyLv = ((URL) strategy.copy(LocatorUtils.property(locator, "lv", sourceLv), sourceLv, (this.lv!= null)));
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
                    URL sourceNl;
                    sourceNl = this.getNl();
                    URL copyNl = ((URL) strategy.copy(LocatorUtils.property(locator, "nl", sourceNl), sourceNl, (this.nl!= null)));
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
                    URL sourceNo;
                    sourceNo = this.getNo();
                    URL copyNo = ((URL) strategy.copy(LocatorUtils.property(locator, "no", sourceNo), sourceNo, (this.no!= null)));
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
                    URL sourcePl;
                    sourcePl = this.getPl();
                    URL copyPl = ((URL) strategy.copy(LocatorUtils.property(locator, "pl", sourcePl), sourcePl, (this.pl!= null)));
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
                    URL sourcePt;
                    sourcePt = this.getPt();
                    URL copyPt = ((URL) strategy.copy(LocatorUtils.property(locator, "pt", sourcePt), sourcePt, (this.pt!= null)));
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
                    URL sourceRo;
                    sourceRo = this.getRo();
                    URL copyRo = ((URL) strategy.copy(LocatorUtils.property(locator, "ro", sourceRo), sourceRo, (this.ro!= null)));
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
                    URL sourceRu;
                    sourceRu = this.getRu();
                    URL copyRu = ((URL) strategy.copy(LocatorUtils.property(locator, "ru", sourceRu), sourceRu, (this.ru!= null)));
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
                    URL sourceSk;
                    sourceSk = this.getSk();
                    URL copySk = ((URL) strategy.copy(LocatorUtils.property(locator, "sk", sourceSk), sourceSk, (this.sk!= null)));
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
                    URL sourceSl;
                    sourceSl = this.getSl();
                    URL copySl = ((URL) strategy.copy(LocatorUtils.property(locator, "sl", sourceSl), sourceSl, (this.sl!= null)));
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
                    URL sourceSv;
                    sourceSv = this.getSv();
                    URL copySv = ((URL) strategy.copy(LocatorUtils.property(locator, "sv", sourceSv), sourceSv, (this.sv!= null)));
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
                    URL sourceTh;
                    sourceTh = this.getTh();
                    URL copyTh = ((URL) strategy.copy(LocatorUtils.property(locator, "th", sourceTh), sourceTh, (this.th!= null)));
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
                    URL sourceTr;
                    sourceTr = this.getTr();
                    URL copyTr = ((URL) strategy.copy(LocatorUtils.property(locator, "tr", sourceTr), sourceTr, (this.tr!= null)));
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
                    URL sourceUk;
                    sourceUk = this.getUk();
                    URL copyUk = ((URL) strategy.copy(LocatorUtils.property(locator, "uk", sourceUk), sourceUk, (this.uk!= null)));
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
                    URL sourceVi;
                    sourceVi = this.getVi();
                    URL copyVi = ((URL) strategy.copy(LocatorUtils.property(locator, "vi", sourceVi), sourceVi, (this.vi!= null)));
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
                    URL sourceZh;
                    sourceZh = this.getZh();
                    URL copyZh = ((URL) strategy.copy(LocatorUtils.property(locator, "zh", sourceZh), sourceZh, (this.zh!= null)));
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
        return new UrlType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UrlType that = ((UrlType) object);
        {
            URL lhsAr;
            lhsAr = this.getAr();
            URL rhsAr;
            rhsAr = that.getAr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ar", lhsAr), LocatorUtils.property(thatLocator, "ar", rhsAr), lhsAr, rhsAr, (this.ar!= null), (that.ar!= null))) {
                return false;
            }
        }
        {
            URL lhsBg;
            lhsBg = this.getBg();
            URL rhsBg;
            rhsBg = that.getBg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bg", lhsBg), LocatorUtils.property(thatLocator, "bg", rhsBg), lhsBg, rhsBg, (this.bg!= null), (that.bg!= null))) {
                return false;
            }
        }
        {
            URL lhsCa;
            lhsCa = this.getCa();
            URL rhsCa;
            rhsCa = that.getCa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ca", lhsCa), LocatorUtils.property(thatLocator, "ca", rhsCa), lhsCa, rhsCa, (this.ca!= null), (that.ca!= null))) {
                return false;
            }
        }
        {
            URL lhsCs;
            lhsCs = this.getCs();
            URL rhsCs;
            rhsCs = that.getCs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cs", lhsCs), LocatorUtils.property(thatLocator, "cs", rhsCs), lhsCs, rhsCs, (this.cs!= null), (that.cs!= null))) {
                return false;
            }
        }
        {
            URL lhsDe;
            lhsDe = this.getDe();
            URL rhsDe;
            rhsDe = that.getDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "de", lhsDe), LocatorUtils.property(thatLocator, "de", rhsDe), lhsDe, rhsDe, (this.de!= null), (that.de!= null))) {
                return false;
            }
        }
        {
            URL lhsDa;
            lhsDa = this.getDa();
            URL rhsDa;
            rhsDa = that.getDa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "da", lhsDa), LocatorUtils.property(thatLocator, "da", rhsDa), lhsDa, rhsDa, (this.da!= null), (that.da!= null))) {
                return false;
            }
        }
        {
            URL lhsEl;
            lhsEl = this.getEl();
            URL rhsEl;
            rhsEl = that.getEl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "el", lhsEl), LocatorUtils.property(thatLocator, "el", rhsEl), lhsEl, rhsEl, (this.el!= null), (that.el!= null))) {
                return false;
            }
        }
        {
            URL lhsEn;
            lhsEn = this.getEn();
            URL rhsEn;
            rhsEn = that.getEn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "en", lhsEn), LocatorUtils.property(thatLocator, "en", rhsEn), lhsEn, rhsEn, (this.en!= null), (that.en!= null))) {
                return false;
            }
        }
        {
            URL lhsEs;
            lhsEs = this.getEs();
            URL rhsEs;
            rhsEs = that.getEs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "es", lhsEs), LocatorUtils.property(thatLocator, "es", rhsEs), lhsEs, rhsEs, (this.es!= null), (that.es!= null))) {
                return false;
            }
        }
        {
            URL lhsEt;
            lhsEt = this.getEt();
            URL rhsEt;
            rhsEt = that.getEt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "et", lhsEt), LocatorUtils.property(thatLocator, "et", rhsEt), lhsEt, rhsEt, (this.et!= null), (that.et!= null))) {
                return false;
            }
        }
        {
            URL lhsFa;
            lhsFa = this.getFa();
            URL rhsFa;
            rhsFa = that.getFa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fa", lhsFa), LocatorUtils.property(thatLocator, "fa", rhsFa), lhsFa, rhsFa, (this.fa!= null), (that.fa!= null))) {
                return false;
            }
        }
        {
            URL lhsFi;
            lhsFi = this.getFi();
            URL rhsFi;
            rhsFi = that.getFi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fi", lhsFi), LocatorUtils.property(thatLocator, "fi", rhsFi), lhsFi, rhsFi, (this.fi!= null), (that.fi!= null))) {
                return false;
            }
        }
        {
            URL lhsFr;
            lhsFr = this.getFr();
            URL rhsFr;
            rhsFr = that.getFr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fr", lhsFr), LocatorUtils.property(thatLocator, "fr", rhsFr), lhsFr, rhsFr, (this.fr!= null), (that.fr!= null))) {
                return false;
            }
        }
        {
            URL lhsHe;
            lhsHe = this.getHe();
            URL rhsHe;
            rhsHe = that.getHe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "he", lhsHe), LocatorUtils.property(thatLocator, "he", rhsHe), lhsHe, rhsHe, (this.he!= null), (that.he!= null))) {
                return false;
            }
        }
        {
            URL lhsHi;
            lhsHi = this.getHi();
            URL rhsHi;
            rhsHi = that.getHi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hi", lhsHi), LocatorUtils.property(thatLocator, "hi", rhsHi), lhsHi, rhsHi, (this.hi!= null), (that.hi!= null))) {
                return false;
            }
        }
        {
            URL lhsHu;
            lhsHu = this.getHu();
            URL rhsHu;
            rhsHu = that.getHu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hu", lhsHu), LocatorUtils.property(thatLocator, "hu", rhsHu), lhsHu, rhsHu, (this.hu!= null), (that.hu!= null))) {
                return false;
            }
        }
        {
            URL lhsId;
            lhsId = this.getId();
            URL rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            URL lhsIt;
            lhsIt = this.getIt();
            URL rhsIt;
            rhsIt = that.getIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "it", lhsIt), LocatorUtils.property(thatLocator, "it", rhsIt), lhsIt, rhsIt, (this.it!= null), (that.it!= null))) {
                return false;
            }
        }
        {
            URL lhsJa;
            lhsJa = this.getJa();
            URL rhsJa;
            rhsJa = that.getJa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ja", lhsJa), LocatorUtils.property(thatLocator, "ja", rhsJa), lhsJa, rhsJa, (this.ja!= null), (that.ja!= null))) {
                return false;
            }
        }
        {
            URL lhsKo;
            lhsKo = this.getKo();
            URL rhsKo;
            rhsKo = that.getKo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ko", lhsKo), LocatorUtils.property(thatLocator, "ko", rhsKo), lhsKo, rhsKo, (this.ko!= null), (that.ko!= null))) {
                return false;
            }
        }
        {
            URL lhsLt;
            lhsLt = this.getLt();
            URL rhsLt;
            rhsLt = that.getLt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lt", lhsLt), LocatorUtils.property(thatLocator, "lt", rhsLt), lhsLt, rhsLt, (this.lt!= null), (that.lt!= null))) {
                return false;
            }
        }
        {
            URL lhsLv;
            lhsLv = this.getLv();
            URL rhsLv;
            rhsLv = that.getLv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lv", lhsLv), LocatorUtils.property(thatLocator, "lv", rhsLv), lhsLv, rhsLv, (this.lv!= null), (that.lv!= null))) {
                return false;
            }
        }
        {
            URL lhsNl;
            lhsNl = this.getNl();
            URL rhsNl;
            rhsNl = that.getNl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nl", lhsNl), LocatorUtils.property(thatLocator, "nl", rhsNl), lhsNl, rhsNl, (this.nl!= null), (that.nl!= null))) {
                return false;
            }
        }
        {
            URL lhsNo;
            lhsNo = this.getNo();
            URL rhsNo;
            rhsNo = that.getNo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "no", lhsNo), LocatorUtils.property(thatLocator, "no", rhsNo), lhsNo, rhsNo, (this.no!= null), (that.no!= null))) {
                return false;
            }
        }
        {
            URL lhsPl;
            lhsPl = this.getPl();
            URL rhsPl;
            rhsPl = that.getPl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pl", lhsPl), LocatorUtils.property(thatLocator, "pl", rhsPl), lhsPl, rhsPl, (this.pl!= null), (that.pl!= null))) {
                return false;
            }
        }
        {
            URL lhsPt;
            lhsPt = this.getPt();
            URL rhsPt;
            rhsPt = that.getPt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pt", lhsPt), LocatorUtils.property(thatLocator, "pt", rhsPt), lhsPt, rhsPt, (this.pt!= null), (that.pt!= null))) {
                return false;
            }
        }
        {
            URL lhsRo;
            lhsRo = this.getRo();
            URL rhsRo;
            rhsRo = that.getRo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ro", lhsRo), LocatorUtils.property(thatLocator, "ro", rhsRo), lhsRo, rhsRo, (this.ro!= null), (that.ro!= null))) {
                return false;
            }
        }
        {
            URL lhsRu;
            lhsRu = this.getRu();
            URL rhsRu;
            rhsRu = that.getRu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ru", lhsRu), LocatorUtils.property(thatLocator, "ru", rhsRu), lhsRu, rhsRu, (this.ru!= null), (that.ru!= null))) {
                return false;
            }
        }
        {
            URL lhsSk;
            lhsSk = this.getSk();
            URL rhsSk;
            rhsSk = that.getSk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sk", lhsSk), LocatorUtils.property(thatLocator, "sk", rhsSk), lhsSk, rhsSk, (this.sk!= null), (that.sk!= null))) {
                return false;
            }
        }
        {
            URL lhsSl;
            lhsSl = this.getSl();
            URL rhsSl;
            rhsSl = that.getSl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sl", lhsSl), LocatorUtils.property(thatLocator, "sl", rhsSl), lhsSl, rhsSl, (this.sl!= null), (that.sl!= null))) {
                return false;
            }
        }
        {
            URL lhsSv;
            lhsSv = this.getSv();
            URL rhsSv;
            rhsSv = that.getSv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sv", lhsSv), LocatorUtils.property(thatLocator, "sv", rhsSv), lhsSv, rhsSv, (this.sv!= null), (that.sv!= null))) {
                return false;
            }
        }
        {
            URL lhsTh;
            lhsTh = this.getTh();
            URL rhsTh;
            rhsTh = that.getTh();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "th", lhsTh), LocatorUtils.property(thatLocator, "th", rhsTh), lhsTh, rhsTh, (this.th!= null), (that.th!= null))) {
                return false;
            }
        }
        {
            URL lhsTr;
            lhsTr = this.getTr();
            URL rhsTr;
            rhsTr = that.getTr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tr", lhsTr), LocatorUtils.property(thatLocator, "tr", rhsTr), lhsTr, rhsTr, (this.tr!= null), (that.tr!= null))) {
                return false;
            }
        }
        {
            URL lhsUk;
            lhsUk = this.getUk();
            URL rhsUk;
            rhsUk = that.getUk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uk", lhsUk), LocatorUtils.property(thatLocator, "uk", rhsUk), lhsUk, rhsUk, (this.uk!= null), (that.uk!= null))) {
                return false;
            }
        }
        {
            URL lhsVi;
            lhsVi = this.getVi();
            URL rhsVi;
            rhsVi = that.getVi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vi", lhsVi), LocatorUtils.property(thatLocator, "vi", rhsVi), lhsVi, rhsVi, (this.vi!= null), (that.vi!= null))) {
                return false;
            }
        }
        {
            URL lhsZh;
            lhsZh = this.getZh();
            URL rhsZh;
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
