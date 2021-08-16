OpenEstate-IO-IS24-XML 1.5
==========================

*OpenEstate-IO-IS24-XML* is a Java library to read and write real estate data in the *IS24-XML* format (revision 189438), that was used by [*immobilienscout24.de*](https://www.immobilienscout24.de/) until 2014.


Warning
-------

*IS24-XML* is outdated and not used by [*immobilienscout24.de*](https://www.immobilienscout24.de/) anymore. We're still supporting this format for compatibility with older real estate software.

*IS24-XML* was replaced by a REST webservice in 2014. You can access this webservice from your Java application with [*OpenEstate-IS24-REST*](https://github.com/OpenEstate/OpenEstate-IS24-REST).


Features
--------

- read XML data according to the specifications of *IS24-XML* (revision 189438) (see [`Is24XmlReadingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.5/Examples/src/main/java/org/openestate/io/examples/Is24XmlReadingExample.java)) 
- write XML data according to the specifications of *IS24-XML* (revision 189438) (see [`Is24XmlWritingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.5/Examples/src/main/java/org/openestate/io/examples/Is24XmlWritingExample.java))


How to use
----------

Download the [latest release from GitHub](https://github.com/OpenEstate/OpenEstate-IO/releases/latest). The provided archive contains all required files (compiled libraries, dependencies, source code and documentations).

Alternatively you can integrate the library from [Maven Central Repository](https://search.maven.org/#search|ga|1|org.openestate.io) into your [Maven](https://maven.apache.org/) project. Just add the following dependency to your projects `pom.xml`:

```xml
<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-IS24-XML</artifactId>
  <version>1.5</version>
</dependency>
```

You can find further information in the [project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki/Usage-IS24-XML). Some example classes for this format are available in the [`Examples`](https://github.com/OpenEstate/OpenEstate-IO/tree/v1.5/Examples) module.


Specifications
--------------

The specifications for this format are placed in the [`specs`](specs) folder.


### Modifications to the original specification

In order to improve the generated Java classes, we've made the following modifications to the original `is24immotransfer.xsd`:

- replaced

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

- Java 8 or newer
- [commons-codec 1.15](https://commons.apache.org/proper/commons-codec/)
- [commons-io 2.11.0](https://commons.apache.org/proper/commons-io/)
- [commons-lang 3.12.0](https://commons.apache.org/proper/commons-lang/)
- [Eclipse Implementation of JAXB 2.3.5](https://projects.eclipse.org/projects/ee4j.jaxb-impl)
- [Jakarta Activation 1.2.2](https://projects.eclipse.org/projects/ee4j.jaf)
- [Jakarta Annotations 1.3.5](https://projects.eclipse.org/projects/ee4j.ca)
- [Jakarta XML Binding 2.3.3](https://projects.eclipse.org/projects/ee4j.jaxb)
- [jaxb2-basics-runtime 0.12.0](https://github.com/highsource/jaxb2-basics)
- [SLF4J 1.7.30](https://www.slf4j.org/)


Notes about JDK versions below 11
---------------------------------

JAXB is bundled with JDK 8, was disabled / deprecated in JDK 9 & 10 and finally removed in JDK 11. Therefore, we're providing JAXB as an explicit dependency. See also ["JAXB on Java 9, 10, 11 and beyond"](https://www.jesperdj.com/2018/09/30/jaxb-on-java-9-10-11-and-beyond/).

It is recommended to use this library with JDK 11 as it should work out of the box. In case you're using JDK 8, you might need to follow one of these steps documented at ["JAXB Release Documentation"](https://javaee.github.io/jaxb-v2/doc/user-guide/release-documentation.html#deployment-migrating-jaxb-2-0-applications-to-javase-6):

> JavaSE comes with JAXB 2.x API/implementation in `rt.jar`. Each version of JavaSE (6, 7, 8, ...) contains different version of JAXB 2.x API. Therefore, if you want to use different version of JAXB API/implementation than the one present in your version of JDK, you are required to override a portion of `rt.jar` with the new API. There are several ways to achieve this:
>
> 1.    Place the `jakarta.xml.bind-api-X.Y.Z.jar` into `$JRE_HOME/lib/endorsed`. **Do not put other JAXB jars into the endorsed directory.** This essentially makes your JRE to "JRE X + JAXB 2.y". This would affect any other applications that use this JRE, and it's easy. On the other hand, in various scenarios you may not be able to alter the JRE.
>
> 2.    Use the system property `java.endorsed.dirs` when you launch your application, and have it point to the directory which contains the `jakarta.xml.bind-api-X.Y.Z.jar` only. **The directory must not contain any other jaxb artifacts.** This allows you to use different version of JAXB for different applications.
>
> See the [endorsed directory mechanism](http://docs.oracle.com/javase/6/docs/technotes/guides/standards/) for more details.

All provided dependencies should work with JDK 8. If compatibility problems occur, you might replace them with an earlier version.


Changelog
---------

Take a look at [`CHANGELOG.md`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.5/CHANGELOG.md) for the full changelog.


License
-------

This library is licensed under the terms of [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.html). Take a look at [`LICENSE.txt`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.5/LICENSE.txt) for the license text.


Further information
-------------------

- [*OpenEstate-IO* at GitHub](https://github.com/OpenEstate/OpenEstate-IO)
- [Releases of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/releases)
- [Changelog of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.5/CHANGELOG.md)
- [API documentation of *OpenEstate-IO*](https://media.openestate.org/apidocs/OpenEstate-IO/) 
- [Validator for *IS24-XML*](https://validator.openestate.org/)
