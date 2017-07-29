Changelog for OpenEstate-IO
===========================

1.4 (not released yet)
----------------------

...



1.3 (29 Jul 2017)
-----------------

-   Updated to Java 7.
-   Updated `commons-lang` library to version 3.6.
-   Add dependency to `commons-text` library in version 1.1.
-   Support **OpenImmo** format in version 1.2.7b.
-   Update XML format of
    [wohnen-in-suedtirol.it](https://wohnen-in-suedtirol.it/) to version 2.2.


1.2 (14 May 2017)
-----------------

### updates

-   Generated JAXB classes implement `java.io.Serializable`.
-   Improved parsing of numeric values according to a certain locale.
-   Improved processing of certain simple types in **Kyero** / **Trovit** /
    **daft.ie** / **IS24-XML** format.
-   Dump CSV records into a human readable form.
-   Updated `commons-csv` library to version 1.4.
-   Updated `commons-io` library to version 2.5.
-   Updated `commons-lang` library to version 3.5.
-   Updated `jaxb2-basics` library to version 0.11.1.
-   Updated `slf4j` libraries to version 1.7.25.


1.1 (11 Mar 2016)
-----------------

### bugfixes

-   `xsd:positiveDecimal` / `xsd:positiveInteger` values are not printed
    correctly in **ImmoXML** / **DaftIE** / **OpenImmo** format
-   fixed printing of `posdecimal` / `xsd:positiveInteger` values in
    **ImmoXML** / **OpenImmo** format
-   numeric values are not strictly parsed in **IDX** / **ImmoXML** /
    **IS24-CSV** / **OpenImmo** / **Trovit** format

### updates

-   updated `slf4j` libraries to version 1.7.18
-   updated `jaxb2-basics` libraries to version 0.11.0 and regenerated JAXB
    classes


1.0 (13 Dec 2015)
-----------------

### new features

-   The library is available through [Maven Central Repository](http://search.maven.org/#search|ga|1|org.openestate.io)
    from this release on. See [documentation page about Maven](https://github.com/OpenEstate/OpenEstate-IO/wiki/Integration-with-Maven)
    for more informations.
-   implemented *FMPXMLLAYOUT* & *FMPXMLRESULT* format of *Filemaker* databases

### updates

-   general

    -   updated `commons-csv` library to version 1.2
    -   updated `commons-lang` library to version 3.4
    -   updated `jaxb2-basics` libraries to version 0.10.0
    -   updated `slf4j` libraries to version 1.7.13

-   all XML formats

    -   use `java.math.BigDecimal` for `xsd:float`, `xsd:double`, `xsd:decimal`
        values in XML classes
    -   use `java.math.BigInteger` for unbounded `xsd:integer`
        values in XML classes
    -   regenerated JAXB classes for `jaxb2-basics` 0.10.0

-   IS24-CSV

    - fixed possible `NullPointerException` when writing an `Is24CsvRecord`
    - use `java.math.BigDecimal` instead of `java.lang.Double` in `Is24CsvRecord`

-   IDX

    - fixed possible `NullPointerException` when writing an `IdxRecord`
    - use `java.math.BigDecimal` instead of `java.lang.Double` in `IdxRecord`


1.0-RC2 (19 Mar 2015)
---------------------

-   all XML formats

    -   more relaxed parsing of `xsd:date` / `xsd:dateTime` values

-   ImmoXML

    -   fixed a mistake in the specs for `<stromanschlusswert>`
    -   fixed a mistake in the specs for `<impressum>`
    -   improved parsing & printing of `xsd:int` & `xsd:positiveInteger`

-   Kyero

    -   added missing specs for Kyero-XML 2.1

-   OpenImmo

    -   fixed a mistake in the specs for `<stromanschlusswert>`
    -   improved parsing & printing of `xsd:int` & `xsd:positiveInteger`


1.0-RC1 (12 Mar 2015)
---------------------

-   initial release candidate
