OpenEstate-IO 1.5-SNAPSHOT
==========================

*OpenEstate-IO* provides a set of Java libraries to read and write real estate
data in common formats. These libraries are used within
[*OpenEstate-ImmoTool*](https://openestate.org/) and in some of our clients
projects in order to process real estate data.


Supported Formats
-----------------

| Module                           | Format                                                                | Type | Version   |
| -------------------------------- | --------------------------------------------------------------------- | ---- | --------- |
| [`CasaIT`](CasaIT)               | [*Casa.it*](https://www.casa.it) format (*experimental*)              | XML  | ?         |
| [`DaftIE`](DaftIE)               | [*Daft.ie*](https://www.daft.ie) Overseas Webfeed                     | XML  | 2.7       |
| [`Filemaker`](Filemaker)         | [*Filemaker*](https://www.filemaker.com) FMPXMLLAYOUT                 | XML  | ?         |
|                                  | [*Filemaker*](https://www.filemaker.com) FMPXMLRESULT                 | XML  | ?         |
| [`IDX`](IDX)                     | *IDX* format                                                          | CSV  | 3.01      |
| [`ImmoXML`](ImmoXML)             | *ImmoXML* format                                                      | XML  | 3.0       |
| [`ImmobiliareIT`](ImmobiliareIT) | [*Immobiliare.it*](https://www.immobiliare.it) format                 | XML  | 2.5       |
| [`IS24-CSV`](IS24-CSV)           | *IS24-CSV* format (*legacy*)                                          | CSV  | 1.4.0.4   |
| [`IS24-XML`](IS24-XML)           | *IS24-XML* format (*legacy*)                                          | XML  | rev189438 |
| [`Kyero`](Kyero)                 | [*Kyero.com*](https://www.kyero.com) XML feed                         | XML  | 3.4       |
|                                  |                                                                       |      | 2.1       |
| [`OpenImmo`](OpenImmo)           | [*OpenImmo*](http://www.openimmo.de) format                           | XML  | 1.2.7b    |
|                                  |                                                                       |      | 1.2.7     |
|                                  |                                                                       |      | 1.2.6     |
|                                  |                                                                       |      | 1.2.5     |
|                                  |                                                                       |      | 1.2.4     |
|                                  |                                                                       |      | 1.2.3     |
|                                  |                                                                       |      | 1.2.2     |
|                                  |                                                                       |      | 1.2.1     |
|                                  |                                                                       |      | 1.2       |
|                                  |                                                                       |      | 1.1       |
| [`Trovit`](Trovit)               | [*Trovit.com*](https://www.trovit.com) Homes Feed                     | XML  | ?         |
| [`WisIT`](WisIT)                 | [*Wohnen-in-Suedtirol.it*](https://www.wohnen-in-suedtirol.it) format | XML  | 2.2       |

Open a module subfolder to get more information about the specific format.


How to use
----------

Download the [latest release from GitHub](https://github.com/OpenEstate/OpenEstate-IO/releases/latest).
The provided archive contains all required files (compiled libraries,
dependencies, source code and documentations).

Alternatively you can integrate the library from
[Maven Central Repository](https://search.maven.org/#search|ga|1|org.openestate.io)
into your [Maven](https://maven.apache.org/) project. Just add one or more of the
following dependencies to your projects `pom.xml` (according to your
requirements):

```xml
<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-CasaIT</artifactId>
  <version>1.5-SNAPSHOT</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-DaftIE</artifactId>
  <version>1.5-SNAPSHOT</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-Filemaker</artifactId>
  <version>1.5-SNAPSHOT</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-IDX</artifactId>
  <version>1.5-SNAPSHOT</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-ImmobiliareIT</artifactId>
  <version>1.5-SNAPSHOT</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-ImmoXML</artifactId>
  <version>1.5-SNAPSHOT</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-IS24-CSV</artifactId>
  <version>1.5-SNAPSHOT</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-IS24-XML</artifactId>
  <version>1.5-SNAPSHOT</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-Kyero</artifactId>
  <version>1.5-SNAPSHOT</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-OpenImmo</artifactId>
  <version>1.5-SNAPSHOT</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-Trovit</artifactId>
  <version>1.5-SNAPSHOT</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-WisIT</artifactId>
  <version>1.5-SNAPSHOT</version>
</dependency>
```

You can find further information in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki). Some example
classes for each format are available in the [`Examples`](Examples) module.


Dependencies
------------

-   Java 7 or newer
-   [commons-codec 1.11](https://commons.apache.org/proper/commons-codec/)
-   [commons-csv 1.6](https://commons.apache.org/proper/commons-csv/)
    (optional; for processing of CSV formats)
-   [commons-io 2.6](https://commons.apache.org/proper/commons-io/)
-   [commons-lang 3.8.1](https://commons.apache.org/proper/commons-lang/)
-   [commons-text 1.3](https://commons.apache.org/proper/commons-text/)
    (optional; for examples and some unit tests)
-   [jaxb2-basics-runtime 0.11.1](https://github.com/highsource/jaxb2-basics)
    (optional; for processing of XML formats)
-   [jaxen 1.1.6](https://github.com/jaxen-xpath/jaxen)
    (optional; for processing of XML formats)
-   [SLF4J 1.7.25](https://www.slf4j.org/)
-   [log4j 1.2.17](https://logging.apache.org/log4j/1.2/)
    (optional; may be replaced by another logging system
    [via SLF4J](https://www.slf4j.org/manual.html))


Changelog
---------

Take a look at [`CHANGELOG.md`](CHANGELOG.md) for the full changelog.


License
-------

This library is licensed under the terms of
[Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.html).
Take a look at
[`LICENSE.txt`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/LICENSE.txt)
for the license text.


Todo
----

-   improve javadoc comments


Further information
-------------------

-   [*OpenEstate-IO* at GitHub](https://github.com/OpenEstate/OpenEstate-IO)
-   [Releases of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/releases)
-   [Changelog of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/CHANGELOG.md)
-   [API documentation of *OpenEstate-IO*](https://media.openestate.org/apidocs/OpenEstate-IO/)
-   [Validator for common XML formats](https://validator.openestate.org/)
