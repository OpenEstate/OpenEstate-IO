OpenEstate-IO 1.0-SNAPSHOT
==========================

*OpenEstate-IO* provided a set of Java libraries to read and write real estate
data in common formats. These libraries are used within
[*OpenEstate-ImmoTool*](http://openestate.org/) and in some of our clients
projects in order to process real estate data.


Supported Formats
-----------------

| Module                           | Format                                                           | Type | Version   |
| -------------------------------- | ---------------------------------------------------------------- | ---- | --------- |
| [`CasaIT`](CasaIT)               | [*Casa.it*](http://casa.it) format (*experimental*)              | XML  | ?         |
| [`DaftIE`](DaftIE)               | [*Daft.ie*](http://daft.ie) Overseas Webfeed                     | XML  | 2.7       |
| [`IDX`](IDX)                     | *IDX* format                                                     | CSV  | 3.01      |
| [`ImmoXML`](ImmoXML)             | *ImmoXML* format                                                 | XML  | 3.0       |
| [`ImmobiliareIT`](ImmobiliareIT) | [*Immobiliare.it*](http://immobiliare.it) format                 | XML  | 2.5       |
| [`IS24-CSV`](IS24-CSV)           | *IS24-CSV* format (*legacy*)                                     | CSV  | 1.4.0.4   |
| [`IS24-XML`](IS24-XML)           | *IS24-XML* format (*legacy*)                                     | XML  | rev189438 |
| [`Kyero`](Kyero)                 | [*Kyero.com*](http://kyero.com) XML feed                         | XML  | 3         |
|                                  |                                                                  |      | 2.1       |
| [`OpenImmo`](OpenImmo)           | *OpenImmo* format                                                | XML  | 1.2.7     |
|                                  |                                                                  |      | 1.2.6     |
|                                  |                                                                  |      | 1.2.5     |
|                                  |                                                                  |      | 1.2.4     |
|                                  |                                                                  |      | 1.2.3     |
|                                  |                                                                  |      | 1.2.2     |
|                                  |                                                                  |      | 1.2.1     |
|                                  |                                                                  |      | 1.2       |
|                                  |                                                                  |      | 1.1       |
| [`Trovit`](Trovit)               | [*Trovit.com*](http://trovit.com) Homes Feed                     | XML  | ?         |
| [`WisIT`](WisIT)                 | [*Wohnen-in-Suedtirol.it*](http://wohnen-in-suedtirol.it) format | XML  | ?         |

Open a module subfolder to get more informations about the specific format.


How to use
----------

You can find further informations in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki). Some example
code for each format is available in the [`Examples`](Examples) module.


Dependencies
------------

-   Java 6 or newer
-   [commons-codec 1.10](http://commons.apache.org/proper/commons-codec/)
-   [commons-csv 1.1](http://commons.apache.org/proper/commons-csv/)
    (optional; for processing of CSV formats)
-   [commons-io 2.4](http://commons.apache.org/proper/commons-io/)
-   [commons-lang 3.3.2](http://commons.apache.org/proper/commons-lang/)
-   [jaxb2-basics-runtime 0.9.3](https://github.com/highsource/jaxb2-basics)
    (optional; for processing of XML formats)
-   [jaxen 1.1.6](http://jaxen.codehaus.org/)
    (optional; for processing of XML formats)
-   [SLF4J 1.7.7](http://www.slf4j.org/)
-   [log4j 1.2.17](http://logging.apache.org/log4j/1.2/)
    (optional; may be replaced by another logging system
    [via SLF4J](http://www.slf4j.org/manual.html))


Changelog
---------

Take a look at [`CHANGELOG.md`](CHANGELOG.md) for the full changelog.


License
-------

This library is licensed under the terms of
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).
Take a look at [`LICENSE.txt`](LICENSE.txt) for the license text.


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
-   [Validator for common XML formats](http://validator.openestate.org/)
