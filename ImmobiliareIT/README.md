OpenEstate-IO-ImmobiliareIT 1.4
===============================

*OpenEstate-IO-ImmobiliareIT* is a Java library to read and write real estate
data in the XML format of [*immobiliare.it*](https://www.immobiliare.it/)
(version 2.5).


Features
--------

-   read XML data according to the specifications of
    [*immobiliare.it*](https://www.immobiliare.it/) in version 2.5
    (see [`ImmobiliareItReadingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.4/Examples/src/main/java/org/openestate/io/examples/ImmobiliareItReadingExample.java))
-   write XML data according to the specifications of
    [*immobiliare.it*](https://www.immobiliare.it/) in version 2.5
    (see [`ImmobiliareItWritingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.4/Examples/src/main/java/org/openestate/io/examples/ImmobiliareItWritingExample.java))


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
  <artifactId>OpenEstate-IO-ImmobiliareIT</artifactId>
  <version>1.4</version>
</dependency>
```

You can find further information in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki/Usage-ImmobiliareIT).
Some example classes for this format are available in the
[`Examples`](https://github.com/OpenEstate/OpenEstate-IO/tree/v1.4/Examples)
module.


Specifications
--------------

The specifications for this format are placed in the [`specs`](specs) folder.
[*Immobiliare.it*](https://www.immobiliare.it/) also provides some
[documentations in Italian language](http://feed.immobiliare.it/import/docs/xml-specification.beta.html).


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
[`CHANGELOG.md`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.4/CHANGELOG.md)
for the full changelog.


License
-------

This library is licensed under the terms of
[Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.html).
Take a look at
[`LICENSE.txt`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.4/LICENSE.txt)
for the license text.


Further information
-------------------

-   [*OpenEstate-IO* at GitHub](https://github.com/OpenEstate/OpenEstate-IO)
-   [Releases of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/releases)
-   [Changelog of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.4/CHANGELOG.md)
-   [API documentation of *OpenEstate-IO*](https://media.openestate.org/apidocs/OpenEstate-IO/)
-   [Validator for *immobiliare.it* XML](https://validator.openestate.org/)
-   [Documentations in Italian language](http://feed.immobiliare.it/import/docs/xml-specification.beta.html)
-   [Alternative validator by *Immobiliare.it*](http://feed.immobiliare.it/import/docs/validator.php)
-   [Current schema in version 2.5](http://feed.immobiliare.it/import/docs/xsd/v2.5.xsd)
