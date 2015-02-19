This folder contains the schema files of OpenImmo-XML in XSD format.

We can't provide these files within this folder, because the license
conditions of OpenImmo-XML do not allow us to provide a copy of the original
schema files.

You can obtain the schema files from OpenImmo e.V. at http://www.openimmo.de/
After you have received the schema files, place the two files called
"openimmo_127.xsd" and "openimmo-feedback_125.xsd" into this directory.
Correct file names are important!

Make the following modifications to the XSD files:

1)  Uncomment or remove
    <xsd:element name="user_defined_extend"> ... </xsd:element>
    from "openimmo-feedback_125.xsd".

2)  Replace <xsd:element name="anzahl_stellplaetze">
    with <xsd:element name="anzahl_stellplaetze" type="xsd:decimal">
    in "openimmo_127.xsd".

3)  Replace <xsd:element name="hallenhoehe">
    with <xsd:element name="hallenhoehe" type="xsd:decimal">
    in "openimmo_127.xsd".

4)  Remove <xsd:choice> from <xsd:element name="geo">
    and move its child elements into the parent <xsd:sequence>
    in "openimmo_127.xsd".

5)  Remove <xsd:choice> from <xsd:element name="kontaktperson">
    and move its child elements into the parent <xsd:sequence>
    in "openimmo_127.xsd".

Afterwards you can generate the JAXB classes by yourself via "mvn-jaxb-xjc.sh".
