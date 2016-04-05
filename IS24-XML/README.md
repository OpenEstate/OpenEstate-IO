OpenEstate-IO-IS24-XML 1.2-SNAPSHOT
===================================

*OpenEstate-IO-IS24-XML* is a Java library to read and write real estate data in
the *IS24-XML* format (revision 189438), that was used by
[*immobilienscout24.de*](http://immobilienscout24.de) until 2014.


Warning
-------

*IS24-XML* is outdated and not used by
[*immobilienscout24.de*](http://immobilienscout24.de) anymore. We're still
supporting this format for compatibility with older real estate software.

*IS24-XML* was replaced by a REST webservice in 2014. You can access this
webservice from your Java application with
[*OpenEstate-IS24-REST*](https://github.com/OpenEstate/OpenEstate-IS24-REST).


Features
--------

-   read XML data according to the specifications of
    *IS24-XML* (revision 189438)
    (see [`Is24XmlReadingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/Examples/src/main/java/org/openestate/io/examples/Is24XmlReadingExample.java))
-   write XML data according to the specifications of
    *IS24-XML* (revision 189438)
    (see [`Is24XmlWritingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/Examples/src/main/java/org/openestate/io/examples/Is24XmlWritingExample.java))


How to use
----------

Download the [latest release from GitHub](https://github.com/OpenEstate/OpenEstate-IO/releases/latest).
The provided archive contains all required files (compiled libraries,
dependencies, source code and documentations).

Alternatively you can integrate the library from
[Maven Central Repository](http://search.maven.org/#search|ga|1|org.openestate.io)
into your [Maven](http://maven.apache.org/) project. Just add the following
dependency to your projects `pom.xml`:

```xml
<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-IS24-XML</artifactId>
  <version>1.2-SNAPSHOT</version>
</dependency>
```

You can find further informations in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki/Usage-IS24-XML).
Some example classes for this format are available in the
[`Examples`](https://github.com/OpenEstate/OpenEstate-IO/tree/develop/Examples)
module.


Specifications
--------------

The specifications for this format are placed in the [`specs`](specs) folder.


### Modifications to the original specification

In order to improve the generated Java classes, we've made the following
modifications to the original `is24immotransfer.xsd`:

-   replaced

    ```xml
    <xs:element name="Anbieter">
      <xs:complexType>
        <xs:complexContent>
          <xs:extension base="AnbieterTyp">
            <xs:sequence>
              <xs:choice maxOccurs="unbounded">
                <xs:element ref="VirtuelleImmobilie" minOccurs="0"/>
                <xs:element ref="Immobilie" minOccurs="0"/>
              </xs:choice>
            </xs:sequence>
          </xs:extension>
        </xs:complexContent>
      </xs:complexType>
    </xs:element>
    ```

    with

    ```xml
    <xs:element name="Anbieter">
      <xs:complexType>
        <xs:complexContent>
          <xs:extension base="AnbieterTyp">
            <xs:sequence>
              <xs:element ref="VirtuelleImmobilie" minOccurs="0" maxOccurs="unbounded"/>
              <xs:element ref="Immobilie" minOccurs="0" maxOccurs="unbounded"/>
            </xs:sequence>
          </xs:extension>
        </xs:complexContent>
      </xs:complexType>
    </xs:element>
    ```


Dependencies
------------

-   Java 6 or newer
-   [commons-codec 1.10](http://commons.apache.org/proper/commons-codec/)
-   [commons-io 2.4](http://commons.apache.org/proper/commons-io/)
-   [commons-lang 3.4](http://commons.apache.org/proper/commons-lang/)
-   [jaxb2-basics-runtime 0.11.0](https://github.com/highsource/jaxb2-basics)
-   [jaxen 1.1.6](http://jaxen.codehaus.org/)
-   [SLF4J 1.7.21](http://www.slf4j.org/)


Changelog
---------

Take a look at
[`CHANGELOG.md`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/CHANGELOG.md)
for the full changelog.


License
-------

This library is licensed under the terms of
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).
Take a look at
[`LICENSE.txt`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/LICENSE.txt)
for the license text.


Further informations
--------------------

-   [*OpenEstate-IO* at GitHub](https://github.com/OpenEstate/OpenEstate-IO)
-   [Releases of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/releases)
-   [Changelog of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/CHANGELOG.md)
-   [Javadocs of *OpenEstate-IO*](http://manual.openestate.org/OpenEstate-IO/)
-   [Validator for *IS24-XML*](http://validator.openestate.org/)
