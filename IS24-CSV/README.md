OpenEstate-IO-IS24-CSV 1.2
==========================

*OpenEstate-IO-IS24-CSV* is a Java library to read and write real estate data in
the *IS24-CSV* format (version 1.4.0.4), that was used by
[*immobilienscout24.de*](http://immobilienscout24.de) until 2014.


Warning
-------

*IS24-CSV* is outdated and not used by
[*immobilienscout24.de*](http://immobilienscout24.de) anymore. We're still
supporting this format for compatibility with older real estate software.

*IS24-CSV* was replaced by a REST webservice in 2014. You can access this
webservice from your Java application with
[*OpenEstate-IS24-REST*](https://github.com/OpenEstate/OpenEstate-IS24-REST).


Features
--------

-   read CSV data according to the specifications of *IS24-CSV* 1.4.0.4
    (see [`Is24CsvReadingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.2/Examples/src/main/java/org/openestate/io/examples/Is24CsvReadingExample.java))
-   write CSV data according to the specifications of *IS24-CSV* 1.4.0.4
    (see [`Is24CsvWritingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.2/Examples/src/main/java/org/openestate/io/examples/Is24CsvWritingExample.java))


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
  <artifactId>OpenEstate-IO-IS24-CSV</artifactId>
  <version>1.2</version>
</dependency>
```

You can find further informations in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki/Usage-IS24-CSV).
Some example classes for this format are available in the
[`Examples`](https://github.com/OpenEstate/OpenEstate-IO/tree/develop/Examples)
module.


Specifications
--------------

The specifications for this format are placed in the [`specs`](specs) folder.


Dependencies
------------

-   Java 6 or newer
-   [commons-codec 1.10](http://commons.apache.org/proper/commons-codec/)
-   [commons-csv 1.4](http://commons.apache.org/proper/commons-csv/)
-   [commons-io 2.5](http://commons.apache.org/proper/commons-io/)
-   [commons-lang 3.5](http://commons.apache.org/proper/commons-lang/)
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
[`LICENSE.txt`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.2/LICENSE.txt)
for the license text.


Further informations
--------------------

-   [*OpenEstate-IO* at GitHub](https://github.com/OpenEstate/OpenEstate-IO)
-   [Releases of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/releases)
-   [Changelog of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/blob/master/CHANGELOG.md)
-   [Javadocs of *OpenEstate-IO*](http://manual.openestate.org/OpenEstate-IO/)
