OpenEstate-IO-IDX 1.3-SNAPSHOT
==============================

*OpenEstate-IO-IDX* is a Java library to read and write real estate data in the
*IDX* format (version 3.01), that is used by [*homegate.ch*](http://homegate.ch)
and some other portals.


Features
--------

-   read CSV data according to the specifications of *IDX* 3.01
    (see [`IdxReadingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/Examples/src/main/java/org/openestate/io/examples/IdxReadingExample.java))
-   write CSV data according to the specifications of *IDX* 3.01
    (see [`IdxWritingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/Examples/src/main/java/org/openestate/io/examples/IdxWritingExample.java))


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
  <artifactId>OpenEstate-IO-IDX</artifactId>
  <version>1.3-SNAPSHOT</version>
</dependency>
```

You can find further informations in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki/Usage-IDX).
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
-   [commons-csv 1.4](http://commons.apache.org/proper/commons-csv/)
-   [commons-io 2.5](http://commons.apache.org/proper/commons-io/)
-   [commons-lang 3.6](http://commons.apache.org/proper/commons-lang/)
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
