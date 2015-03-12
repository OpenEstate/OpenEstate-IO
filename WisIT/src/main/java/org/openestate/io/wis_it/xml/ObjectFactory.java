
package org.openestate.io.wis_it.xml;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.io.wis_it.xml package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.io.wis_it.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WIS }
     * 
     */
    public WIS createWIS() {
        return new WIS();
    }

    /**
     * Create an instance of {@link WIS.BENUTZER }
     * 
     */
    public WIS.BENUTZER createWISBENUTZER() {
        return new WIS.BENUTZER();
    }

    /**
     * Create an instance of {@link WIS.OBJEKTE }
     * 
     */
    public WIS.OBJEKTE createWISOBJEKTE() {
        return new WIS.OBJEKTE();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

}
