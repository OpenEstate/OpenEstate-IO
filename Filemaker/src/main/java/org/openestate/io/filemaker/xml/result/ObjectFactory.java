
package org.openestate.io.filemaker.xml.result;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.io.filemaker.xml.result package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.io.filemaker.xml.result
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultSetType }
     * 
     */
    public ResultSetType createResultSetType() {
        return new ResultSetType();
    }

    /**
     * Create an instance of {@link ResultSetType.ROW }
     * 
     */
    public ResultSetType.ROW createResultSetTypeROW() {
        return new ResultSetType.ROW();
    }

    /**
     * Create an instance of {@link MetaDataType }
     * 
     */
    public MetaDataType createMetaDataType() {
        return new MetaDataType();
    }

    /**
     * Create an instance of {@link FMPXMLRESULT }
     * 
     */
    public FMPXMLRESULT createFMPXMLRESULT() {
        return new FMPXMLRESULT();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link DatabaseType }
     * 
     */
    public DatabaseType createDatabaseType() {
        return new DatabaseType();
    }

    /**
     * Create an instance of {@link ResultSetType.ROW.COL }
     * 
     */
    public ResultSetType.ROW.COL createResultSetTypeROWCOL() {
        return new ResultSetType.ROW.COL();
    }

    /**
     * Create an instance of {@link MetaDataType.FIELD }
     * 
     */
    public MetaDataType.FIELD createMetaDataTypeFIELD() {
        return new MetaDataType.FIELD();
    }

}
