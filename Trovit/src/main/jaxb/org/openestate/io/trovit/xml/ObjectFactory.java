
package org.openestate.io.trovit.xml;

import javax.xml.bind.annotation.XmlRegistry;


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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.io.trovit.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdType }
     * 
     */
    public AdType createAdType() {
        return new AdType();
    }

    /**
     * Create an instance of {@link Trovit }
     * 
     */
    public Trovit createTrovit() {
        return new Trovit();
    }

    /**
     * Create an instance of {@link PictureType }
     * 
     */
    public PictureType createPictureType() {
        return new PictureType();
    }

    /**
     * Create an instance of {@link PriceType }
     * 
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link FloorAreaType }
     * 
     */
    public FloorAreaType createFloorAreaType() {
        return new FloorAreaType();
    }

    /**
     * Create an instance of {@link PlotAreaType }
     * 
     */
    public PlotAreaType createPlotAreaType() {
        return new PlotAreaType();
    }

    /**
     * Create an instance of {@link AdType.Pictures }
     * 
     */
    public AdType.Pictures createAdTypePictures() {
        return new AdType.Pictures();
    }

}
