OpenEstate-IO-IDX 1.5
=====================

*OpenEstate-IO-IDX* is a Java library to read and write real estate data in the *IDX* format (version 3.01), that is used by [*homegate.ch*](https://www.homegate.ch/) and some other portals.


Features
--------

- read CSV data according to the specifications of *IDX* 3.01 (see [`IdxReadingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.5/Examples/src/main/java/org/openestate/io/examples/IdxReadingExample.java))
- write CSV data according to the specifications of *IDX* 3.01 (see [`IdxWritingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.5/Examples/src/main/java/org/openestate/io/examples/IdxWritingExample.java))


How to use
----------

Download the [latest release from GitHub](https://github.com/OpenEstate/OpenEstate-IO/releases/latest). The provided archive contains all required files (compiled libraries, dependencies, source code and documentations).

Alternatively you can integrate the library from [Maven Central Repository](https://search.maven.org/#search|ga|1|org.openestate.io) into your [Maven](https://maven.apache.org/) project. Just add the following dependency to your projects `pom.xml`:

```xml
<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-IDX</artifactId>
  <version>1.5</version>
</dependency>
```

You can find further information in the [project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki/Usage-IDX). Some example classes for this format are available in the [`Examples`](https://github.com/OpenEstate/OpenEstate-IO/tree/v1.5/Examples) module.


Specifications
--------------

The specifications for this format are placed in the [`specs`](specs) folder.


Dependencies
------------

- Java 8 or newer
- [commons-codec 1.15](https://commons.apache.org/proper/commons-codec/)
- [commons-csv 1.9.0](https://commons.apache.org/proper/commons-csv/)
- [commons-io 2.11.0](https://commons.apache.org/proper/commons-io/)
- [commons-lang 3.12.0](https://commons.apache.org/proper/commons-lang/)
- [SLF4J 1.7.30](https://www.slf4j.org/)


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
