OpenEstate-IO-Core 1.5-SNAPSHOT
===============================

*OpenEstate-IO-Core* is a Java library, that provides some general classes used
by the *OpenEstate-IO* format implementations.


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
  <artifactId>OpenEstate-IO-Core</artifactId>
  <version>1.5-SNAPSHOT</version>
</dependency>
```

You can find further information in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki). Some example
classes for each format are available in the
[`Examples`](https://github.com/OpenEstate/OpenEstate-IO/tree/develop/Examples)
module.


Dependencies
------------

-   Java 7 or newer
-   [commons-codec 1.14](https://commons.apache.org/proper/commons-codec/)
-   [commons-csv 1.6](https://commons.apache.org/proper/commons-csv/)
    (optional; for processing of CSV formats)
-   [commons-io 2.6](https://commons.apache.org/proper/commons-io/)
-   [commons-lang 3.8.1](https://commons.apache.org/proper/commons-lang/)
-   [jaxen 1.1.6](https://github.com/jaxen-xpath/jaxen)
    (optional; for processing of XML formats)
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
