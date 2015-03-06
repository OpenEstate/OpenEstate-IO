
package org.openestate.io.trovit.xml;

import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.openestate.io.trovit.xml.types.Action;
import org.openestate.io.trovit.xml.types.IntBool;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.io.trovit.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Region_QNAME = new QName("", "region");
    private final static QName _Parking_QNAME = new QName("", "parking");
    private final static QName _Bathrooms_QNAME = new QName("", "bathrooms");
    private final static QName _Type_QNAME = new QName("", "type");
    private final static QName _Date_QNAME = new QName("", "date");
    private final static QName _IsFurnished_QNAME = new QName("", "is_furnished");
    private final static QName _MlsDatabase_QNAME = new QName("", "mls_database");
    private final static QName _City_QNAME = new QName("", "city");
    private final static QName _Id_QNAME = new QName("", "id");
    private final static QName _IsNew_QNAME = new QName("", "is_new");
    private final static QName _Title_QNAME = new QName("", "title");
    private final static QName _Time_QNAME = new QName("", "time");
    private final static QName _VirtualTour_QNAME = new QName("", "virtual_tour");
    private final static QName _Foreclosure_QNAME = new QName("", "foreclosure");
    private final static QName _Year_QNAME = new QName("", "year");
    private final static QName _Longitude_QNAME = new QName("", "longitude");
    private final static QName _PlotArea_QNAME = new QName("", "plot_area");
    private final static QName _Rooms_QNAME = new QName("", "rooms");
    private final static QName _Orientation_QNAME = new QName("", "orientation");
    private final static QName _FloorNumber_QNAME = new QName("", "floor_number");
    private final static QName _Condition_QNAME = new QName("", "condition");
    private final static QName _Agency_QNAME = new QName("", "agency");
    private final static QName _Postcode_QNAME = new QName("", "postcode");
    private final static QName _Url_QNAME = new QName("", "url");
    private final static QName _Content_QNAME = new QName("", "content");
    private final static QName _PropertyType_QNAME = new QName("", "property_type");
    private final static QName _Address_QNAME = new QName("", "address");
    private final static QName _ExpirationDate_QNAME = new QName("", "expiration_date");
    private final static QName _Latitude_QNAME = new QName("", "latitude");
    private final static QName _CityArea_QNAME = new QName("", "city_area");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.io.trovit.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FloorArea }
     * 
     */
    public FloorArea createFloorArea() {
        return new FloorArea();
    }

    /**
     * Create an instance of {@link Pictures }
     * 
     */
    public Pictures createPictures() {
        return new Pictures();
    }

    /**
     * Create an instance of {@link Picture }
     * 
     */
    public Picture createPicture() {
        return new Picture();
    }

    /**
     * Create an instance of {@link Trovit }
     * 
     */
    public Trovit createTrovit() {
        return new Trovit();
    }

    /**
     * Create an instance of {@link Ad }
     * 
     */
    public Ad createAd() {
        return new Ad();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "region")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<String> createRegion(String value) {
        return new JAXBElement<String>(_Region_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntBool }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "parking")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<IntBool> createParking(IntBool value) {
        return new JAXBElement<IntBool>(_Parking_QNAME, IntBool.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bathrooms")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createBathrooms(Double value) {
        return new JAXBElement<Double>(_Bathrooms_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Action }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type")
    @XmlJavaTypeAdapter(Adapter7 .class)
    public JAXBElement<Action> createType(Action value) {
        return new JAXBElement<Action>(_Type_QNAME, Action.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "date")
    @XmlJavaTypeAdapter(Adapter6 .class)
    public JAXBElement<Calendar> createDate(Calendar value) {
        return new JAXBElement<Calendar>(_Date_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntBool }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "is_furnished")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<IntBool> createIsFurnished(IntBool value) {
        return new JAXBElement<IntBool>(_IsFurnished_QNAME, IntBool.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mls_database")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<String> createMlsDatabase(String value) {
        return new JAXBElement<String>(_MlsDatabase_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "city")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeNew }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "is_new")
    public JAXBElement<TypeNew> createIsNew(TypeNew value) {
        return new JAXBElement<TypeNew>(_IsNew_QNAME, TypeNew.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "time")
    @XmlJavaTypeAdapter(Adapter8 .class)
    public JAXBElement<Calendar> createTime(Calendar value) {
        return new JAXBElement<Calendar>(_Time_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "virtual_tour")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<String> createVirtualTour(String value) {
        return new JAXBElement<String>(_VirtualTour_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "foreclosure")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<String> createForeclosure(String value) {
        return new JAXBElement<String>(_Foreclosure_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "year")
    @XmlJavaTypeAdapter(Adapter9 .class)
    public JAXBElement<Integer> createYear(Integer value) {
        return new JAXBElement<Integer>(_Year_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "longitude")
    @XmlJavaTypeAdapter(Adapter10 .class)
    public JAXBElement<Double> createLongitude(Double value) {
        return new JAXBElement<Double>(_Longitude_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "plot_area")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Integer> createPlotArea(Integer value) {
        return new JAXBElement<Integer>(_PlotArea_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rooms")
    @XmlJavaTypeAdapter(Adapter5 .class)
    public JAXBElement<Double> createRooms(Double value) {
        return new JAXBElement<Double>(_Rooms_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "orientation")
    @XmlJavaTypeAdapter(Adapter12 .class)
    public JAXBElement<String> createOrientation(String value) {
        return new JAXBElement<String>(_Orientation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "floor_number")
    @XmlJavaTypeAdapter(Adapter12 .class)
    public JAXBElement<String> createFloorNumber(String value) {
        return new JAXBElement<String>(_FloorNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "condition")
    @XmlJavaTypeAdapter(Adapter12 .class)
    public JAXBElement<String> createCondition(String value) {
        return new JAXBElement<String>(_Condition_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agency")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<String> createAgency(String value) {
        return new JAXBElement<String>(_Agency_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postcode")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<String> createPostcode(String value) {
        return new JAXBElement<String>(_Postcode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "url")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "content")
    public JAXBElement<String> createContent(String value) {
        return new JAXBElement<String>(_Content_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "property_type")
    @XmlJavaTypeAdapter(Adapter12 .class)
    public JAXBElement<String> createPropertyType(String value) {
        return new JAXBElement<String>(_PropertyType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "address")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<String> createAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "expiration_date")
    @XmlJavaTypeAdapter(Adapter6 .class)
    public JAXBElement<Calendar> createExpirationDate(Calendar value) {
        return new JAXBElement<Calendar>(_ExpirationDate_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "latitude")
    @XmlJavaTypeAdapter(Adapter10 .class)
    public JAXBElement<Double> createLatitude(Double value) {
        return new JAXBElement<Double>(_Latitude_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "city_area")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<String> createCityArea(String value) {
        return new JAXBElement<String>(_CityArea_QNAME, String.class, null, value);
    }

}
