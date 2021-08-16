OpenEstate-IO 1.5
=================

*OpenEstate-IO* provides a set of Java libraries to read and write real estate data in common formats. These libraries are used within [*OpenEstate-ImmoTool*](https://openestate.org/) and in some of our clients projects in order to process real estate data.


Supported Formats
-----------------

| Module                           | Format                                                                  | Type | Version    |
| -------------------------------- | ------------------------------------------------------------------------|:----:|:----------:|
| [`CasaIT`](CasaIT)               | [*Casa.it*](https://www.casa.it/) format **(experimental)**             | XML  | ?          |
| [`DaftIE`](DaftIE)               | [*Daft.ie*](https://www.daft.ie) Overseas Webfeed                       | XML  | 2.7        |
| [`Filemaker`](Filemaker)         | [*Filemaker*](http://www.filemaker.com) FMPXMLLAYOUT                    | XML  | ?          |
|                                  | [*Filemaker*](http://www.filemaker.com) FMPXMLRESULT                    | XML  | ?          |
| [`Idealista`](Idealista)         | [*idealista.com*](https://www.idealista.com/) format **(experimental)** | JSON | 6.00       |
| [`IDX`](IDX)                     | *IDX* format                                                            | CSV  | 3.01       |
| [`ImmoXML`](ImmoXML)             | *ImmoXML* format                                                        | XML  | 3.0        |
| [`ImmobarIT`](ImmobarIT)         | [*immobar.it*](https://www.immobar.it) format **(experimental)**        | XML  | 21/04/2015 |
| [`ImmobiliareIT`](ImmobiliareIT) | [*Immobiliare.it*](https://www.immobiliare.it) format                   | XML  | 2.8        |
| [`IS24-CSV`](IS24-CSV)           | *IS24-CSV* format (*legacy*)                                            | CSV  | 1.4.0.4    |
| [`IS24-XML`](IS24-XML)           | *IS24-XML* format (*legacy*)                                            | XML  | rev189438  |
| [`Kyero`](Kyero)                 | [*Kyero.com*](https://www.kyero.com) XML feed                           | XML  | 3.4        |
|                                  |                                                                         |      | 2.1        |
| [`OpenImmo`](OpenImmo)           | [*OpenImmo*](http://www.openimmo.de) format                             | XML  | 1.2.7b     |
|                                  |                                                                         |      | 1.2.7      |
|                                  |                                                                         |      | 1.2.6      |
|                                  |                                                                         |      | 1.2.5      |
|                                  |                                                                         |      | 1.2.4      |
|                                  |                                                                         |      | 1.2.3      |
|                                  |                                                                         |      | 1.2.2      |
|                                  |                                                                         |      | 1.2.1      |
|                                  |                                                                         |      | 1.2        |
|                                  |                                                                         |      | 1.1        |
| [`Trovit`](Trovit)               | [*Trovit.com*](https://www.trovit.com) Homes Feed                       | XML  | ?          |
| [`WisIT`](WisIT)                 | [*Wohnen-in-Suedtirol.it*](https://www.wohnen-in-suedtirol.it) format   | XML  | 2.2        |

Open a module subfolder to get more information about the specific format.


How to use
----------

Download the [latest release from GitHub](https://github.com/OpenEstate/OpenEstate-IO/releases/latest). The provided archive contains all required files (compiled libraries, dependencies, source code and documentations).

Alternatively you can integrate the library from [Maven Central Repository](https://search.maven.org/#search|ga|1|org.openestate.io) into your [Maven](https://maven.apache.org/) project. Just add one or more of the following dependencies to your projects `pom.xml` (according to your requirements):

```xml
<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-CasaIT</artifactId>
  <version>1.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-DaftIE</artifactId>
  <version>1.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-Filemaker</artifactId>
  <version>1.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-Idealista</artifactId>
  <version>1.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-IDX</artifactId>
  <version>1.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-ImmobarIT</artifactId>
  <version>1.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-ImmobiliareIT</artifactId>
  <version>1.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-ImmoXML</artifactId>
  <version>1.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-IS24-CSV</artifactId>
  <version>1.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-IS24-XML</artifactId>
  <version>1.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-Kyero</artifactId>
  <version>1.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-OpenImmo</artifactId>
  <version>1.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-Trovit</artifactId>
  <version>1.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.io</groupId>
  <artifactId>OpenEstate-IO-WisIT</artifactId>
  <version>1.5</version>
</dependency>
```

You can find further information in the [project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki). Some example classes for each format are available in the [`Examples`](Examples) module.


Dependencies
------------

- Java 8 or newer
- [Apache BVal 2.0.5](https://bval.apache.org/) (optional; for validation of JSON data; may be replaced with other implementations)
- [commons-codec 1.15](https://commons.apache.org/proper/commons-codec/)
- [commons-csv 1.9.0](https://commons.apache.org/proper/commons-csv/) (optional; for processing of CSV formats)
- [commons-io 2.11.0](https://commons.apache.org/proper/commons-io/)
- [commons-lang 3.12.0](https://commons.apache.org/proper/commons-lang/)
- [commons-text 1.9](https://commons.apache.org/proper/commons-text/) (optional; for examples and some unit tests)
- [Eclipse Implementation of JAXB 2.3.5](https://projects.eclipse.org/projects/ee4j.jaxb-impl) (optional; for processing of XML formats)
- [jackson-databind 2.12.4](https://github.com/FasterXML/jackson-databind) (optional; for processing of JSON formats)
- [Jakarta Activation 1.2.2](https://projects.eclipse.org/projects/ee4j.jaf) (optional; for processing of XML formats)
- [Jakarta Annotations 1.3.5](https://projects.eclipse.org/projects/ee4j.ca) (optional; for processing of JSON / XML formats)
- [Jakarta Bean Validation 2.0.2](https://projects.eclipse.org/projects/ee4j.bean-validation) (optional; for processing of JSON formats)
- [Jakarta XML Binding 2.3.3](https://projects.eclipse.org/projects/ee4j.jaxb) (optional; for processing of XML formats)
- [jaxb2-basics-runtime 0.12.0](https://github.com/highsource/jaxb2-basics) (optional; for processing of XML formats)
- [SLF4J 1.7.30](https://www.slf4j.org/)
- [Logback 1.2.5](http://logback.qos.ch/) (optional; for logging in example classes)
- [lorem 2.1](https://github.com/mdeanda/lorem) (optional; for generating random data in example classes)


Notes about JDK versions below 11
---------------------------------

JAXB is bundled with JDK 8, was disabled / deprecated in JDK 9 & 10 and finally removed in JDK 11. Therefore, we're providing JAXB as an explicit dependency. See also ["JAXB on Java 9, 10, 11 and beyond"](https://www.jesperdj.com/2018/09/30/jaxb-on-java-9-10-11-and-beyond/).

It is recommended to use this library with JDK 11 as it should work out of the box. In case you're using JDK 8, you might need to follow one of these steps documented at ["JAXB Release Documentation"](https://javaee.github.io/jaxb-v2/doc/user-guide/release-documentation.html#deployment-migrating-jaxb-2-0-applications-to-javase-6):

> JavaSE comes with JAXB 2.x API/implementation in `rt.jar`. Each version of JavaSE (6, 7, 8, ...) contains different version of JAXB 2.x API. Therefore, if you want to use different version of JAXB API/implementation than the one present in your version of JDK, you are required to override a portion of `rt.jar` with the new API. There are several ways to achieve this:
>
> 1.    Place the `jakarta.xml.bind-api-X.Y.Z.jar` into `$JRE_HOME/lib/endorsed`. **Do not put other JAXB jars into the endorsed directory.** This essentially makes your JRE to "JRE X + JAXB 2.y". This would affect any other applications that use this JRE, and it's easy. On the other hand, in various scenarios you may not be able to alter the JRE.
>
> 2.    Use the system property `java.endorsed.dirs` when you launch your application, and have it point to the directory which contains the `jakarta.xml.bind-api-X.Y.Z.jar` only. **The directory must not contain any other jaxb artifacts.** This allows you to use different version of JAXB for different applications.
>
> See the [endorsed directory mechanism](http://docs.oracle.com/javase/6/docs/technotes/guides/standards/) for more details.

All provided dependencies should work with JDK 8. If compatibility problems occur, you might replace them with an earlier version.


Changelog
---------

Take a look at [`CHANGELOG.md`](CHANGELOG.md) for the full changelog.


License
-------

This library is licensed under the terms of [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.html). Take a look at [`LICENSE.txt`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/LICENSE.txt) for the license text.


Support
-------

We are providing [professional support](https://github.com/OpenEstate/OpenEstate-IO/wiki/Service) for *OpenEstate-IO* in case you need a specialized solution for your use case. 


Further information
-------------------

- [*OpenEstate-IO* at GitHub](https://github.com/OpenEstate/OpenEstate-IO)
- [Releases of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/releases)
- [Changelog of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.5/CHANGELOG.md)
- [API documentation of *OpenEstate-IO*](https://media.openestate.org/apidocs/OpenEstate-IO/)
- [Validator for common XML formats](https://validator.openestate.org/)
