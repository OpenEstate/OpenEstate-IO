OpenEstate-IO-ImmoXML 1.5-SNAPSHOT
==================================

*OpenEstate-IO-ImmoXML* is a Java library to read and write real estate data in
the *ImmoXML* format (version 3.0), that is mostly used by
[*immopool.de*](https://www.immopool.de/).


Features
--------

-   read XML data according to the specifications of *ImmoXML* 3.0
    (see [`ImmoXmlReadingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/Examples/src/main/java/org/openestate/io/examples/ImmoXmlReadingExample.java))
-   write XML data according to the specifications of *ImmoXML* 3.0
    (see [`ImmoXmlWritingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/Examples/src/main/java/org/openestate/io/examples/ImmoXmlWritingExample.java))


How to use
----------

Download the [latest release from GitHub](https://github.com/OpenEstate/OpenEstate-IO/releases/latest).
The provided archive contains all required files (compiled libraries,
dependencies, source code and documentations).

Alternatively you can integrate the library from
[Maven Central Repository](https://search.maven.org/#search|ga|1|org.openestate.io)
into your [Maven](https://maven.apache.org/) project. Just add the following
dependency to your projects `pom.xml`:

```xml
<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-ImmoXML</artifactId>
  <version>1.5-SNAPSHOT</version>
</dependency>
```

You can find further information in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki/Usage-ImmoXML).
Some example classes for this format are available in the
[`Examples`](https://github.com/OpenEstate/OpenEstate-IO/tree/develop/Examples)
module.


Specifications
--------------

According to the license of the *ImmoXML* format we're not allowed to publish
the specifications. Get in contact with
[*LAGLER Spezial-Software GmbH*](https://www.lagler.de/) to obtain the
specifications for the *ImmoXML* format.


### Modifications to the original specification

In order to improve the generated Java classes, we've made the following
modifications to the original `immoxml.xsd` schema:

-   replaced `<xsd:element name="anzahl_stellplaetze">`
    with `<xsd:element name="anzahl_stellplaetze" type="posdecimal">`

-   replaced `<xsd:element name="hallenhoehe">`
    with `<xsd:element name="hallenhoehe" type="posdecimal">`

-   replaced `<xsd:element name="stromanschlusswert">`
    with `<xsd:element name="stromanschlusswert" type="xsd:decimal">`

-   replaced `<xsd:element name="impressum" />`
    with `<xsd:element name="impressum" type="xsd:string" />`

-   removed `<xsd:choice>` from `<xsd:element name="geo">`
    and moved its child elements into the parent `<xsd:sequence>`

-   removed `<xsd:choice>` from `<xsd:element name="kontaktperson">`
    and moved its child elements into the parent `<xsd:sequence>`

-   replaced `<xsd:complexType>` with `<xsd:complexType mixed="true">`
    in `<xsd:element name="min_mietdauer">`

-   replaced `<xsd:complexType>` with `<xsd:complexType mixed="true">`
    in `<xsd:element name="max_mietdauer">`

To generate the Java classes via JAXB for yourself, copy the modified
`immoxml.xsd` into `src/main/xsd` and run `mvn-jaxb-xjc.sh`.


Dependencies
------------

-   Java 7 or newer
-   [commons-codec 1.11](https://commons.apache.org/proper/commons-codec/)
-   [commons-io 2.6](https://commons.apache.org/proper/commons-io/)
-   [commons-lang 3.8.1](https://commons.apache.org/proper/commons-lang/)
-   [jaxb2-basics-runtime 0.11.1](https://github.com/highsource/jaxb2-basics)
-   [jaxen 1.1.6](https://github.com/jaxen-xpath/jaxen)
-   [SLF4J 1.7.25](https://www.slf4j.org/)


Changelog
---------

Take a look at
[`CHANGELOG.md`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/CHANGELOG.md)
for the full changelog.


License
-------

This library is licensed under the terms of
[Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.html).
Take a look at
[`LICENSE.txt`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/LICENSE.txt)
for the license text.


Further information
-------------------

-   [*OpenEstate-IO* at GitHub](https://github.com/OpenEstate/OpenEstate-IO)
-   [Releases of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/releases)
-   [Changelog of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/CHANGELOG.md)
-   [API documentation of *OpenEstate-IO*](https://media.openestate.org/apidocs/OpenEstate-IO/)
-   [Validator for *ImmoXML*](https://validator.openestate.org/)
