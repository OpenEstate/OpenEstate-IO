OpenEstate-IO-Filemaker 1.4-SNAPSHOT
====================================

*OpenEstate-IO-Filemaker* is a Java library to read and write XML formats of
the real estate software [*FlatHunter Pro*](http://www.fmmedia.de/immobilien/flathunterpro),
which is based on the [*Filemaker*](http://www.filemaker.com/) database system.


Features
--------

-   read *FMPXMLLAYOUT* & *FMPXMLRESULT* data according to the specifications
    of *Filemaker*
    (see [`FilemakerReadingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/Examples/src/main/java/org/openestate/io/examples/FilemakerReadingExample.java))
-   write *FMPXMLLAYOUT* & *FMPXMLRESULT* data according to the specifications
    of *Filemaker*
    (see [`FilemakerWritingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/Examples/src/main/java/org/openestate/io/examples/FilemakerWritingExample.java))
-   read *FMPXMLRESULT* data more easily through a high level class
    (see [`FilemakerResultMappingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/Examples/src/main/java/org/openestate/io/examples/FilemakerResultMappingExample.java))


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
  <artifactId>OpenEstate-IO-Filemaker</artifactId>
  <version>1.4-SNAPSHOT</version>
</dependency>
```

You can find further informations in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki/Usage-Filemaker).
Some example classes for this format are available in the
[`Examples`](https://github.com/OpenEstate/OpenEstate-IO/tree/develop/Examples)
module.


Specifications
--------------

The specifications for this format are placed in the [`specs`](specs) folder.


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
-   [English documentation about *FMPXMLLAYOUT*](http://etutorials.org/XML/filemaker+pro+6+developers+guide+to+xml_xsl/Chapter+4+FileMaker+Pro+XML+Schema+or+Grammar+Formats+DTDs/4.1+FMPXMLLAYOUT+Schema+Grammar/)
-   [English documentation about *FMPXMLRESULT*](http://etutorials.org/XML/filemaker+pro+6+developers+guide+to+xml_xsl/Chapter+4+FileMaker+Pro+XML+Schema+or+Grammar+Formats+DTDs/4.2+FMPXMLRESULT+Schema+Grammar/)
-   [English documentation about *FMPDSORESULT*](http://etutorials.org/XML/filemaker+pro+6+developers+guide+to+xml_xsl/Chapter+4+FileMaker+Pro+XML+Schema+or+Grammar+Formats+DTDs/4.3+FMPDSORESULT+Schema+Grammar/)
-   [German documentation about *FMPXMLRESULT*](http://www.filemaker.com/de/help/html/import_export.16.30.html)
-   [German documentation about *FMPDSORESULT*](http://www.filemaker.com/de/help/html/import_export.16.29.html)
