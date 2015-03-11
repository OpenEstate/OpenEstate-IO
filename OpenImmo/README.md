OpenEstate-IO-OpenImmo 1.0-SNAPSHOT
===================================

*OpenEstate-IO-OpenImmo* is a Java library to read and write real estate data in
the *OpenImmo* format (version 1.2.7 down to 1.1), that is used by a variety of
real estate software in Germany.


Features
--------

-   read XML data according to the specifications of
    *OpenImmo* 1.2.7 down to 1.1
    (see [`OpenImmoReadingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/Examples/src/main/java/org/openestate/io/examples/OpenImmoReadingExample.java))
-   write XML data according to the specifications of
    *OpenImmo* 1.2.7 down to 1.1
    (see [`OpenImmoWritingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/Examples/src/main/java/org/openestate/io/examples/OpenImmoWritingExample.java))


How to use
----------

You can find further informations in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki). Some example
code for this format is available in the
[`Examples`](https://github.com/OpenEstate/OpenEstate-IO/tree/develop/Examples)
module.


Specifications
--------------

According to the license of the *OpenImmo* format we're not allowed to publish
the specifications. Get in contact with [*OpenImmo e.V.*](http://openimmo.de/)
to obtain the specifications of the *OpenImmo* format.


### Modifications to the original specification

In order to improve the generated Java classes, we've made the following
modifications to the original `openimmo_127.xsd` schema:

-   replaced `<xsd:element name="anzahl_stellplaetze">`
    with `<xsd:element name="anzahl_stellplaetze" type="xsd:decimal">`

-   replaced `<xsd:element name="hallenhoehe">`
    with `<xsd:element name="hallenhoehe" type="xsd:decimal">`

-   removed `<xsd:choice>` from `<xsd:element name="geo">`
    and move its child elements into the parent `<xsd:sequence>`

-   removed `<xsd:choice>` from `<xsd:element name="kontaktperson">`
    and move its child elements into the parent `<xsd:sequence>`

The following changes were made to the original `openimmo-feedback_125.xsd`
schema:

-   removed `<xsd:element name="user_defined_extend"> ... </xsd:element>`
    because it is also defined in `openimmo_127.xsd`

To generate the Java classes via JAXB for yourself, copy the modified
`openimmo_127.xsd` and `openimmo-feedback_125.xsd` into `src/main/xsd` and run
`mvn-jaxb-xjc.sh`.


Dependencies
------------

-   Java 6 or newer
-   [commons-codec 1.10](http://commons.apache.org/proper/commons-codec/)
-   [commons-io 2.4](http://commons.apache.org/proper/commons-io/)
-   [commons-lang 3.3.2](http://commons.apache.org/proper/commons-lang/)
-   [jaxb2-basics-runtime 0.9.3](https://github.com/highsource/jaxb2-basics)
-   [jaxen 1.1.6](http://jaxen.codehaus.org/)
-   [SLF4J 1.7.7](http://www.slf4j.org/)


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


Todo
----

-   further testing
-   add missing javadoc comments
-   publish at Maven Central Repository


Further informations
--------------------

-   [*OpenEstate-IO* at GitHub](https://github.com/OpenEstate/OpenEstate-IO)
-   [Releases of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/releases)
-   [Changelog of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/CHANGELOG.md)
-   [Javadocs of *OpenEstate-IO*](http://manual.openestate.org/OpenEstate-IO/)
-   [Validator for *OpenImmo*](http://validator.openestate.org/)
-   [*OpenImmo e.V.*](http://www.openimmo.de/)
