
package org.openestate.io.kyero.xml;

import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
public class UrlType
    implements Cloneable, CopyTo, Equals, ToString
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
            URL theAr;
            theAr = this.getAr();
            strategy.appendField(locator, this, "ar", buffer, theAr);
        }
        {
            URL theBg;
            theBg = this.getBg();
            strategy.appendField(locator, this, "bg", buffer, theBg);
        }
        {
            URL theCa;
            theCa = this.getCa();
            strategy.appendField(locator, this, "ca", buffer, theCa);
        }
        {
            URL theCs;
            theCs = this.getCs();
            strategy.appendField(locator, this, "cs", buffer, theCs);
        }
        {
            URL theDe;
            theDe = this.getDe();
            strategy.appendField(locator, this, "de", buffer, theDe);
        }
        {
            URL theDa;
            theDa = this.getDa();
            strategy.appendField(locator, this, "da", buffer, theDa);
        }
        {
            URL theEl;
            theEl = this.getEl();
            strategy.appendField(locator, this, "el", buffer, theEl);
        }
        {
            URL theEn;
            theEn = this.getEn();
            strategy.appendField(locator, this, "en", buffer, theEn);
        }
        {
            URL theEs;
            theEs = this.getEs();
            strategy.appendField(locator, this, "es", buffer, theEs);
        }
        {
            URL theEt;
            theEt = this.getEt();
            strategy.appendField(locator, this, "et", buffer, theEt);
        }
        {
            URL theFa;
            theFa = this.getFa();
            strategy.appendField(locator, this, "fa", buffer, theFa);
        }
        {
            URL theFi;
            theFi = this.getFi();
            strategy.appendField(locator, this, "fi", buffer, theFi);
        }
        {
            URL theFr;
            theFr = this.getFr();
            strategy.appendField(locator, this, "fr", buffer, theFr);
        }
        {
            URL theHe;
            theHe = this.getHe();
            strategy.appendField(locator, this, "he", buffer, theHe);
        }
        {
            URL theHi;
            theHi = this.getHi();
            strategy.appendField(locator, this, "hi", buffer, theHi);
        }
        {
            URL theHu;
            theHu = this.getHu();
            strategy.appendField(locator, this, "hu", buffer, theHu);
        }
        {
            URL theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            URL theIt;
            theIt = this.getIt();
            strategy.appendField(locator, this, "it", buffer, theIt);
        }
        {
            URL theJa;
            theJa = this.getJa();
            strategy.appendField(locator, this, "ja", buffer, theJa);
        }
        {
            URL theKo;
            theKo = this.getKo();
            strategy.appendField(locator, this, "ko", buffer, theKo);
        }
        {
            URL theLt;
            theLt = this.getLt();
            strategy.appendField(locator, this, "lt", buffer, theLt);
        }
        {
            URL theLv;
            theLv = this.getLv();
            strategy.appendField(locator, this, "lv", buffer, theLv);
        }
        {
            URL theNl;
            theNl = this.getNl();
            strategy.appendField(locator, this, "nl", buffer, theNl);
        }
        {
            URL theNo;
            theNo = this.getNo();
            strategy.appendField(locator, this, "no", buffer, theNo);
        }
        {
            URL thePl;
            thePl = this.getPl();
            strategy.appendField(locator, this, "pl", buffer, thePl);
        }
        {
            URL thePt;
            thePt = this.getPt();
            strategy.appendField(locator, this, "pt", buffer, thePt);
        }
        {
            URL theRo;
            theRo = this.getRo();
            strategy.appendField(locator, this, "ro", buffer, theRo);
        }
        {
            URL theRu;
            theRu = this.getRu();
            strategy.appendField(locator, this, "ru", buffer, theRu);
        }
        {
            URL theSk;
            theSk = this.getSk();
            strategy.appendField(locator, this, "sk", buffer, theSk);
        }
        {
            URL theSl;
            theSl = this.getSl();
            strategy.appendField(locator, this, "sl", buffer, theSl);
        }
        {
            URL theSv;
            theSv = this.getSv();
            strategy.appendField(locator, this, "sv", buffer, theSv);
        }
        {
            URL theTh;
            theTh = this.getTh();
            strategy.appendField(locator, this, "th", buffer, theTh);
        }
        {
            URL theTr;
            theTr = this.getTr();
            strategy.appendField(locator, this, "tr", buffer, theTr);
        }
        {
            URL theUk;
            theUk = this.getUk();
            strategy.appendField(locator, this, "uk", buffer, theUk);
        }
        {
            URL theVi;
            theVi = this.getVi();
            strategy.appendField(locator, this, "vi", buffer, theVi);
        }
        {
            URL theZh;
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
        if (draftCopy instanceof UrlType) {
            final UrlType copy = ((UrlType) draftCopy);
            if (this.ar!= null) {
                URL sourceAr;
                sourceAr = this.getAr();
                URL copyAr = ((URL) strategy.copy(LocatorUtils.property(locator, "ar", sourceAr), sourceAr));
                copy.setAr(copyAr);
            } else {
                copy.ar = null;
            }
            if (this.bg!= null) {
                URL sourceBg;
                sourceBg = this.getBg();
                URL copyBg = ((URL) strategy.copy(LocatorUtils.property(locator, "bg", sourceBg), sourceBg));
                copy.setBg(copyBg);
            } else {
                copy.bg = null;
            }
            if (this.ca!= null) {
                URL sourceCa;
                sourceCa = this.getCa();
                URL copyCa = ((URL) strategy.copy(LocatorUtils.property(locator, "ca", sourceCa), sourceCa));
                copy.setCa(copyCa);
            } else {
                copy.ca = null;
            }
            if (this.cs!= null) {
                URL sourceCs;
                sourceCs = this.getCs();
                URL copyCs = ((URL) strategy.copy(LocatorUtils.property(locator, "cs", sourceCs), sourceCs));
                copy.setCs(copyCs);
            } else {
                copy.cs = null;
            }
            if (this.de!= null) {
                URL sourceDe;
                sourceDe = this.getDe();
                URL copyDe = ((URL) strategy.copy(LocatorUtils.property(locator, "de", sourceDe), sourceDe));
                copy.setDe(copyDe);
            } else {
                copy.de = null;
            }
            if (this.da!= null) {
                URL sourceDa;
                sourceDa = this.getDa();
                URL copyDa = ((URL) strategy.copy(LocatorUtils.property(locator, "da", sourceDa), sourceDa));
                copy.setDa(copyDa);
            } else {
                copy.da = null;
            }
            if (this.el!= null) {
                URL sourceEl;
                sourceEl = this.getEl();
                URL copyEl = ((URL) strategy.copy(LocatorUtils.property(locator, "el", sourceEl), sourceEl));
                copy.setEl(copyEl);
            } else {
                copy.el = null;
            }
            if (this.en!= null) {
                URL sourceEn;
                sourceEn = this.getEn();
                URL copyEn = ((URL) strategy.copy(LocatorUtils.property(locator, "en", sourceEn), sourceEn));
                copy.setEn(copyEn);
            } else {
                copy.en = null;
            }
            if (this.es!= null) {
                URL sourceEs;
                sourceEs = this.getEs();
                URL copyEs = ((URL) strategy.copy(LocatorUtils.property(locator, "es", sourceEs), sourceEs));
                copy.setEs(copyEs);
            } else {
                copy.es = null;
            }
            if (this.et!= null) {
                URL sourceEt;
                sourceEt = this.getEt();
                URL copyEt = ((URL) strategy.copy(LocatorUtils.property(locator, "et", sourceEt), sourceEt));
                copy.setEt(copyEt);
            } else {
                copy.et = null;
            }
            if (this.fa!= null) {
                URL sourceFa;
                sourceFa = this.getFa();
                URL copyFa = ((URL) strategy.copy(LocatorUtils.property(locator, "fa", sourceFa), sourceFa));
                copy.setFa(copyFa);
            } else {
                copy.fa = null;
            }
            if (this.fi!= null) {
                URL sourceFi;
                sourceFi = this.getFi();
                URL copyFi = ((URL) strategy.copy(LocatorUtils.property(locator, "fi", sourceFi), sourceFi));
                copy.setFi(copyFi);
            } else {
                copy.fi = null;
            }
            if (this.fr!= null) {
                URL sourceFr;
                sourceFr = this.getFr();
                URL copyFr = ((URL) strategy.copy(LocatorUtils.property(locator, "fr", sourceFr), sourceFr));
                copy.setFr(copyFr);
            } else {
                copy.fr = null;
            }
            if (this.he!= null) {
                URL sourceHe;
                sourceHe = this.getHe();
                URL copyHe = ((URL) strategy.copy(LocatorUtils.property(locator, "he", sourceHe), sourceHe));
                copy.setHe(copyHe);
            } else {
                copy.he = null;
            }
            if (this.hi!= null) {
                URL sourceHi;
                sourceHi = this.getHi();
                URL copyHi = ((URL) strategy.copy(LocatorUtils.property(locator, "hi", sourceHi), sourceHi));
                copy.setHi(copyHi);
            } else {
                copy.hi = null;
            }
            if (this.hu!= null) {
                URL sourceHu;
                sourceHu = this.getHu();
                URL copyHu = ((URL) strategy.copy(LocatorUtils.property(locator, "hu", sourceHu), sourceHu));
                copy.setHu(copyHu);
            } else {
                copy.hu = null;
            }
            if (this.id!= null) {
                URL sourceId;
                sourceId = this.getId();
                URL copyId = ((URL) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId));
                copy.setId(copyId);
            } else {
                copy.id = null;
            }
            if (this.it!= null) {
                URL sourceIt;
                sourceIt = this.getIt();
                URL copyIt = ((URL) strategy.copy(LocatorUtils.property(locator, "it", sourceIt), sourceIt));
                copy.setIt(copyIt);
            } else {
                copy.it = null;
            }
            if (this.ja!= null) {
                URL sourceJa;
                sourceJa = this.getJa();
                URL copyJa = ((URL) strategy.copy(LocatorUtils.property(locator, "ja", sourceJa), sourceJa));
                copy.setJa(copyJa);
            } else {
                copy.ja = null;
            }
            if (this.ko!= null) {
                URL sourceKo;
                sourceKo = this.getKo();
                URL copyKo = ((URL) strategy.copy(LocatorUtils.property(locator, "ko", sourceKo), sourceKo));
                copy.setKo(copyKo);
            } else {
                copy.ko = null;
            }
            if (this.lt!= null) {
                URL sourceLt;
                sourceLt = this.getLt();
                URL copyLt = ((URL) strategy.copy(LocatorUtils.property(locator, "lt", sourceLt), sourceLt));
                copy.setLt(copyLt);
            } else {
                copy.lt = null;
            }
            if (this.lv!= null) {
                URL sourceLv;
                sourceLv = this.getLv();
                URL copyLv = ((URL) strategy.copy(LocatorUtils.property(locator, "lv", sourceLv), sourceLv));
                copy.setLv(copyLv);
            } else {
                copy.lv = null;
            }
            if (this.nl!= null) {
                URL sourceNl;
                sourceNl = this.getNl();
                URL copyNl = ((URL) strategy.copy(LocatorUtils.property(locator, "nl", sourceNl), sourceNl));
                copy.setNl(copyNl);
            } else {
                copy.nl = null;
            }
            if (this.no!= null) {
                URL sourceNo;
                sourceNo = this.getNo();
                URL copyNo = ((URL) strategy.copy(LocatorUtils.property(locator, "no", sourceNo), sourceNo));
                copy.setNo(copyNo);
            } else {
                copy.no = null;
            }
            if (this.pl!= null) {
                URL sourcePl;
                sourcePl = this.getPl();
                URL copyPl = ((URL) strategy.copy(LocatorUtils.property(locator, "pl", sourcePl), sourcePl));
                copy.setPl(copyPl);
            } else {
                copy.pl = null;
            }
            if (this.pt!= null) {
                URL sourcePt;
                sourcePt = this.getPt();
                URL copyPt = ((URL) strategy.copy(LocatorUtils.property(locator, "pt", sourcePt), sourcePt));
                copy.setPt(copyPt);
            } else {
                copy.pt = null;
            }
            if (this.ro!= null) {
                URL sourceRo;
                sourceRo = this.getRo();
                URL copyRo = ((URL) strategy.copy(LocatorUtils.property(locator, "ro", sourceRo), sourceRo));
                copy.setRo(copyRo);
            } else {
                copy.ro = null;
            }
            if (this.ru!= null) {
                URL sourceRu;
                sourceRu = this.getRu();
                URL copyRu = ((URL) strategy.copy(LocatorUtils.property(locator, "ru", sourceRu), sourceRu));
                copy.setRu(copyRu);
            } else {
                copy.ru = null;
            }
            if (this.sk!= null) {
                URL sourceSk;
                sourceSk = this.getSk();
                URL copySk = ((URL) strategy.copy(LocatorUtils.property(locator, "sk", sourceSk), sourceSk));
                copy.setSk(copySk);
            } else {
                copy.sk = null;
            }
            if (this.sl!= null) {
                URL sourceSl;
                sourceSl = this.getSl();
                URL copySl = ((URL) strategy.copy(LocatorUtils.property(locator, "sl", sourceSl), sourceSl));
                copy.setSl(copySl);
            } else {
                copy.sl = null;
            }
            if (this.sv!= null) {
                URL sourceSv;
                sourceSv = this.getSv();
                URL copySv = ((URL) strategy.copy(LocatorUtils.property(locator, "sv", sourceSv), sourceSv));
                copy.setSv(copySv);
            } else {
                copy.sv = null;
            }
            if (this.th!= null) {
                URL sourceTh;
                sourceTh = this.getTh();
                URL copyTh = ((URL) strategy.copy(LocatorUtils.property(locator, "th", sourceTh), sourceTh));
                copy.setTh(copyTh);
            } else {
                copy.th = null;
            }
            if (this.tr!= null) {
                URL sourceTr;
                sourceTr = this.getTr();
                URL copyTr = ((URL) strategy.copy(LocatorUtils.property(locator, "tr", sourceTr), sourceTr));
                copy.setTr(copyTr);
            } else {
                copy.tr = null;
            }
            if (this.uk!= null) {
                URL sourceUk;
                sourceUk = this.getUk();
                URL copyUk = ((URL) strategy.copy(LocatorUtils.property(locator, "uk", sourceUk), sourceUk));
                copy.setUk(copyUk);
            } else {
                copy.uk = null;
            }
            if (this.vi!= null) {
                URL sourceVi;
                sourceVi = this.getVi();
                URL copyVi = ((URL) strategy.copy(LocatorUtils.property(locator, "vi", sourceVi), sourceVi));
                copy.setVi(copyVi);
            } else {
                copy.vi = null;
            }
            if (this.zh!= null) {
                URL sourceZh;
                sourceZh = this.getZh();
                URL copyZh = ((URL) strategy.copy(LocatorUtils.property(locator, "zh", sourceZh), sourceZh));
                copy.setZh(copyZh);
            } else {
                copy.zh = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new UrlType();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UrlType)) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ar", lhsAr), LocatorUtils.property(thatLocator, "ar", rhsAr), lhsAr, rhsAr)) {
                return false;
            }
        }
        {
            URL lhsBg;
            lhsBg = this.getBg();
            URL rhsBg;
            rhsBg = that.getBg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bg", lhsBg), LocatorUtils.property(thatLocator, "bg", rhsBg), lhsBg, rhsBg)) {
                return false;
            }
        }
        {
            URL lhsCa;
            lhsCa = this.getCa();
            URL rhsCa;
            rhsCa = that.getCa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ca", lhsCa), LocatorUtils.property(thatLocator, "ca", rhsCa), lhsCa, rhsCa)) {
                return false;
            }
        }
        {
            URL lhsCs;
            lhsCs = this.getCs();
            URL rhsCs;
            rhsCs = that.getCs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cs", lhsCs), LocatorUtils.property(thatLocator, "cs", rhsCs), lhsCs, rhsCs)) {
                return false;
            }
        }
        {
            URL lhsDe;
            lhsDe = this.getDe();
            URL rhsDe;
            rhsDe = that.getDe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "de", lhsDe), LocatorUtils.property(thatLocator, "de", rhsDe), lhsDe, rhsDe)) {
                return false;
            }
        }
        {
            URL lhsDa;
            lhsDa = this.getDa();
            URL rhsDa;
            rhsDa = that.getDa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "da", lhsDa), LocatorUtils.property(thatLocator, "da", rhsDa), lhsDa, rhsDa)) {
                return false;
            }
        }
        {
            URL lhsEl;
            lhsEl = this.getEl();
            URL rhsEl;
            rhsEl = that.getEl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "el", lhsEl), LocatorUtils.property(thatLocator, "el", rhsEl), lhsEl, rhsEl)) {
                return false;
            }
        }
        {
            URL lhsEn;
            lhsEn = this.getEn();
            URL rhsEn;
            rhsEn = that.getEn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "en", lhsEn), LocatorUtils.property(thatLocator, "en", rhsEn), lhsEn, rhsEn)) {
                return false;
            }
        }
        {
            URL lhsEs;
            lhsEs = this.getEs();
            URL rhsEs;
            rhsEs = that.getEs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "es", lhsEs), LocatorUtils.property(thatLocator, "es", rhsEs), lhsEs, rhsEs)) {
                return false;
            }
        }
        {
            URL lhsEt;
            lhsEt = this.getEt();
            URL rhsEt;
            rhsEt = that.getEt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "et", lhsEt), LocatorUtils.property(thatLocator, "et", rhsEt), lhsEt, rhsEt)) {
                return false;
            }
        }
        {
            URL lhsFa;
            lhsFa = this.getFa();
            URL rhsFa;
            rhsFa = that.getFa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fa", lhsFa), LocatorUtils.property(thatLocator, "fa", rhsFa), lhsFa, rhsFa)) {
                return false;
            }
        }
        {
            URL lhsFi;
            lhsFi = this.getFi();
            URL rhsFi;
            rhsFi = that.getFi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fi", lhsFi), LocatorUtils.property(thatLocator, "fi", rhsFi), lhsFi, rhsFi)) {
                return false;
            }
        }
        {
            URL lhsFr;
            lhsFr = this.getFr();
            URL rhsFr;
            rhsFr = that.getFr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fr", lhsFr), LocatorUtils.property(thatLocator, "fr", rhsFr), lhsFr, rhsFr)) {
                return false;
            }
        }
        {
            URL lhsHe;
            lhsHe = this.getHe();
            URL rhsHe;
            rhsHe = that.getHe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "he", lhsHe), LocatorUtils.property(thatLocator, "he", rhsHe), lhsHe, rhsHe)) {
                return false;
            }
        }
        {
            URL lhsHi;
            lhsHi = this.getHi();
            URL rhsHi;
            rhsHi = that.getHi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hi", lhsHi), LocatorUtils.property(thatLocator, "hi", rhsHi), lhsHi, rhsHi)) {
                return false;
            }
        }
        {
            URL lhsHu;
            lhsHu = this.getHu();
            URL rhsHu;
            rhsHu = that.getHu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hu", lhsHu), LocatorUtils.property(thatLocator, "hu", rhsHu), lhsHu, rhsHu)) {
                return false;
            }
        }
        {
            URL lhsId;
            lhsId = this.getId();
            URL rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            URL lhsIt;
            lhsIt = this.getIt();
            URL rhsIt;
            rhsIt = that.getIt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "it", lhsIt), LocatorUtils.property(thatLocator, "it", rhsIt), lhsIt, rhsIt)) {
                return false;
            }
        }
        {
            URL lhsJa;
            lhsJa = this.getJa();
            URL rhsJa;
            rhsJa = that.getJa();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ja", lhsJa), LocatorUtils.property(thatLocator, "ja", rhsJa), lhsJa, rhsJa)) {
                return false;
            }
        }
        {
            URL lhsKo;
            lhsKo = this.getKo();
            URL rhsKo;
            rhsKo = that.getKo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ko", lhsKo), LocatorUtils.property(thatLocator, "ko", rhsKo), lhsKo, rhsKo)) {
                return false;
            }
        }
        {
            URL lhsLt;
            lhsLt = this.getLt();
            URL rhsLt;
            rhsLt = that.getLt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lt", lhsLt), LocatorUtils.property(thatLocator, "lt", rhsLt), lhsLt, rhsLt)) {
                return false;
            }
        }
        {
            URL lhsLv;
            lhsLv = this.getLv();
            URL rhsLv;
            rhsLv = that.getLv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lv", lhsLv), LocatorUtils.property(thatLocator, "lv", rhsLv), lhsLv, rhsLv)) {
                return false;
            }
        }
        {
            URL lhsNl;
            lhsNl = this.getNl();
            URL rhsNl;
            rhsNl = that.getNl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nl", lhsNl), LocatorUtils.property(thatLocator, "nl", rhsNl), lhsNl, rhsNl)) {
                return false;
            }
        }
        {
            URL lhsNo;
            lhsNo = this.getNo();
            URL rhsNo;
            rhsNo = that.getNo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "no", lhsNo), LocatorUtils.property(thatLocator, "no", rhsNo), lhsNo, rhsNo)) {
                return false;
            }
        }
        {
            URL lhsPl;
            lhsPl = this.getPl();
            URL rhsPl;
            rhsPl = that.getPl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pl", lhsPl), LocatorUtils.property(thatLocator, "pl", rhsPl), lhsPl, rhsPl)) {
                return false;
            }
        }
        {
            URL lhsPt;
            lhsPt = this.getPt();
            URL rhsPt;
            rhsPt = that.getPt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pt", lhsPt), LocatorUtils.property(thatLocator, "pt", rhsPt), lhsPt, rhsPt)) {
                return false;
            }
        }
        {
            URL lhsRo;
            lhsRo = this.getRo();
            URL rhsRo;
            rhsRo = that.getRo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ro", lhsRo), LocatorUtils.property(thatLocator, "ro", rhsRo), lhsRo, rhsRo)) {
                return false;
            }
        }
        {
            URL lhsRu;
            lhsRu = this.getRu();
            URL rhsRu;
            rhsRu = that.getRu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ru", lhsRu), LocatorUtils.property(thatLocator, "ru", rhsRu), lhsRu, rhsRu)) {
                return false;
            }
        }
        {
            URL lhsSk;
            lhsSk = this.getSk();
            URL rhsSk;
            rhsSk = that.getSk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sk", lhsSk), LocatorUtils.property(thatLocator, "sk", rhsSk), lhsSk, rhsSk)) {
                return false;
            }
        }
        {
            URL lhsSl;
            lhsSl = this.getSl();
            URL rhsSl;
            rhsSl = that.getSl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sl", lhsSl), LocatorUtils.property(thatLocator, "sl", rhsSl), lhsSl, rhsSl)) {
                return false;
            }
        }
        {
            URL lhsSv;
            lhsSv = this.getSv();
            URL rhsSv;
            rhsSv = that.getSv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sv", lhsSv), LocatorUtils.property(thatLocator, "sv", rhsSv), lhsSv, rhsSv)) {
                return false;
            }
        }
        {
            URL lhsTh;
            lhsTh = this.getTh();
            URL rhsTh;
            rhsTh = that.getTh();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "th", lhsTh), LocatorUtils.property(thatLocator, "th", rhsTh), lhsTh, rhsTh)) {
                return false;
            }
        }
        {
            URL lhsTr;
            lhsTr = this.getTr();
            URL rhsTr;
            rhsTr = that.getTr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tr", lhsTr), LocatorUtils.property(thatLocator, "tr", rhsTr), lhsTr, rhsTr)) {
                return false;
            }
        }
        {
            URL lhsUk;
            lhsUk = this.getUk();
            URL rhsUk;
            rhsUk = that.getUk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uk", lhsUk), LocatorUtils.property(thatLocator, "uk", rhsUk), lhsUk, rhsUk)) {
                return false;
            }
        }
        {
            URL lhsVi;
            lhsVi = this.getVi();
            URL rhsVi;
            rhsVi = that.getVi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vi", lhsVi), LocatorUtils.property(thatLocator, "vi", rhsVi), lhsVi, rhsVi)) {
                return false;
            }
        }
        {
            URL lhsZh;
            lhsZh = this.getZh();
            URL rhsZh;
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
