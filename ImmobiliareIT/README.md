OpenEstate-IO-ImmobiliareIT 1.0-SNAPSHOT
========================================

*OpenEstate-IO-ImmobiliareIT* is a Java library to read and write real estate
data in the XML format of [*immobiliare.it*](http://immobiliare.it)
(version 2.5).


Features
--------

-   read XML data according to the specifications of
    [*immobiliare.it*](http://immobiliare.it) in version 2.5
    (see [`ImmobiliareItReadingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/Examples/src/main/java/org/openestate/io/examples/ImmobiliareItReadingExample.java))
-   write XML data according to the specifications of
    [*immobiliare.it*](http://immobiliare.it) in version 2.5
    (see [`ImmobiliareItWritingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/develop/Examples/src/main/java/org/openestate/io/examples/ImmobiliareItWritingExample.java))


How to use
----------

You can find further informations in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki/Usage-ImmobiliareIT).
Some example classes for this format are available in the
[`Examples`](https://github.com/OpenEstate/OpenEstate-IO/tree/develop/Examples)
module.


Specifications
--------------

The specifications for this format are placed in the [`specs`](specs) folder.
[*Immobiliare.it*](http://immobiliare.it) also provides some
[documentations in Italian language](http://feed.immobiliare.it/import/docs/xml-specification.beta.html).


Dependencies
------------

-   Java 6 or newer
-   [commons-codec 1.10](http://commons.apache.org/proper/commons-codec/)
-   [commons-io 2.4](http://commons.apache.org/proper/commons-io/)
-   [commons-lang 3.4](http://commons.apache.org/proper/commons-lang/)
-   [jaxb2-basics-runtime 0.9.5](https://github.com/highsource/jaxb2-basics)
-   [jaxen 1.1.6](http://jaxen.codehaus.org/)
-   [SLF4J 1.7.12](http://www.slf4j.org/)


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
-   [Validator for *immobiliare.it* XML](http://validator.openestate.org/)
-   [Documentations in Italian language](http://feed.immobiliare.it/import/docs/xml-specification.beta.html)
-   [Alternative validator by *Immobiliare.it*](http://feed.immobiliare.it/import/docs/validator.php)
-   [Current schema in version 2.5](http://feed.immobiliare.it/import/docs/xsd/v2.5.xsd)
