OpenEstate-IO-WisIT 1.3
=======================

*OpenEstate-IO-WisIT* is a Java library to read and write real estate data in
the XML format of [*wohnen-in-suedtirol.it*](http://wohnen-in-suedtirol.it)
(version 2.2, specified at October 2015).


Features
--------

-   read XML data according to the specifications of
    [*wohnen-in-suedtirol.it*](http://wohnen-in-suedtirol.it)
    (see [`WisItReadingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.3/Examples/src/main/java/org/openestate/io/examples/WisItReadingExample.java))
-   write XML data according to the specifications of
    [*wohnen-in-suedtirol.it*](http://wohnen-in-suedtirol.it)
    (see [`WisItWritingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.3/Examples/src/main/java/org/openestate/io/examples/WisItWritingExample.java))


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
  <artifactId>OpenEstate-IO-WisIT</artifactId>
  <version>1.3</version>
</dependency>
```

You can find further informations in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki/Usage-WisIT).
Some example classes for this format are available in the
[`Examples`](https://github.com/OpenEstate/OpenEstate-IO/tree/v1.3/Examples)
module.


Specifications
--------------

The specifications for this format are placed in the [`specs`](specs) folder.


### Modifications to the original specification

[*Wohnen-in-Suedtirol.it*](http://wohnen-in-suedtirol.it) only provided a
written documentation for the XML format. Based on this documentation we've
created an [inofficial XSD](specs/inofficial.xsd) file. The inofficial XSD file
was used for generation of Java classes via JAXB.


Dependencies
------------

-   Java 7 or newer
-   [commons-codec 1.10](http://commons.apache.org/proper/commons-codec/)
-   [commons-io 2.5](http://commons.apache.org/proper/commons-io/)
-   [commons-lang 3.6](http://commons.apache.org/proper/commons-lang/)
-   [jaxb2-basics-runtime 0.11.1](https://github.com/highsource/jaxb2-basics)
-   [jaxen 1.1.6](http://jaxen.codehaus.org/)
-   [SLF4J 1.7.25](http://www.slf4j.org/)


Changelog
---------

Take a look at
[`CHANGELOG.md`](https://github.com/OpenEstate/OpenEstate-IO/blob/master/CHANGELOG.md)
for the full changelog.


License
-------

This library is licensed under the terms of
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).
Take a look at
[`LICENSE.txt`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.3/LICENSE.txt)
for the license text.


Further informations
--------------------

-   [*OpenEstate-IO* at GitHub](https://github.com/OpenEstate/OpenEstate-IO)
-   [Releases of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/releases)
-   [Changelog of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/blob/master/CHANGELOG.md)
-   [Javadocs of *OpenEstate-IO*](http://manual.openestate.org/OpenEstate-IO/)
-   [Validator for *wohnen-in-suedtirol.it* XML](http://validator.openestate.org/)
