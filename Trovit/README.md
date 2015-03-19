OpenEstate-IO-Trovit 1.0-RC2
============================

*OpenEstate-IO-Trovit* is a Java library to read and write real estate data in
the XML format of [*trovit.com*](http://trovit.com).


Features
--------

-   read XML data according to the specifications of
    [*trovit.com*](http://trovit.com)
    (see [`TrovitReadingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.0-RC2/Examples/src/main/java/org/openestate/io/examples/TrovitReadingExample.java))
-   write XML data according to the specifications of
    [*trovit.com*](http://trovit.com)
    (see [`TrovitWritingExample.java`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.0-RC2/Examples/src/main/java/org/openestate/io/examples/TrovitWritingExample.java))


How to use
----------

You can find further informations in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IO/wiki/Usage-Trovit).
Some example classes for this format are available in the
[`Examples`](https://github.com/OpenEstate/OpenEstate-IO/tree/v1.0-RC2/Examples)
module.


Specifications
--------------

The specifications for this format are placed in the [`specs`](specs) folder.
[*Trovit.com*](http://trovit.com) also provides some
[further documentations](http://about.trovit.com/your-ads-on-trovit/uk/feed-uk-homes/).


### Modifications to the original specification

In order to make the XML schema readable by JAXB, we had to fix the following
problems in the original `homes.xsd`:

-   removed invalid `<xsd:fractionDigits value="100"/>` from
    `<xsd:simpleType name="typeLong">`

-   changed type of `<xsd:element name="latitude">` from `typeLong` to
    `typeFloat`

-   changed type of `<xsd:element name="longitude">` from `typeLong` to
    `typeFloat`


Dependencies
------------

-   Java 6 or newer
-   [commons-codec 1.10](http://commons.apache.org/proper/commons-codec/)
-   [commons-io 2.4](http://commons.apache.org/proper/commons-io/)
-   [commons-lang 3.3.2](http://commons.apache.org/proper/commons-lang/)
-   [jaxb2-basics-runtime 0.9.3](https://github.com/highsource/jaxb2-basics)
-   [jaxen 1.1.6](http://jaxen.codehaus.org/)
-   [SLF4J 1.7.7](http://www.slf4j.org/)


Changelog
---------

Take a look at
[`CHANGELOG.md`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.0-RC2/CHANGELOG.md)
for the full changelog.


License
-------

This library is licensed under the terms of
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).
Take a look at
[`LICENSE.txt`](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.0-RC2/LICENSE.txt)
for the license text.


Further informations
--------------------

-   [*OpenEstate-IO* at GitHub](https://github.com/OpenEstate/OpenEstate-IO)
-   [Releases of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/releases)
-   [Changelog of *OpenEstate-IO*](https://github.com/OpenEstate/OpenEstate-IO/blob/v1.0-RC2/CHANGELOG.md)
-   [Javadocs of *OpenEstate-IO*](http://manual.openestate.org/OpenEstate-IO/)
-   [Validator for *trovit.com* XML](http://validator.openestate.org/)
-   [Homes Feed specifications](http://agents.kyero.com/kyero-import-specification)
-   [Alternative validator](http://about.trovit.com/validator/)
