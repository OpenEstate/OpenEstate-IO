Changelog for OpenEstate-IO
===========================

1.0 (not released yet)
----------------------

-   first stable release
-   published at [Maven Central Repository](http://search.maven.org/#search|ga|1|org.openestate.io)

### new features

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
