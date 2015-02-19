This folder contains the schema files of ImmoXML in XSD format.

We can't provide these files within this folder, because the license
conditions of ImmoXML do not allow us to provide a copy of the original
schema files.

You can obtain the schema files from Lagler at https://www.lagler.de/
After you have received the schema files, place the file called
"immoxml.xsd" into this directory. Correct file names are important!

Make the following modifications to the XSD file:

1)  Replace <xsd:element name="anzahl_stellplaetze">
    with <xsd:element name="anzahl_stellplaetze" type="posdecimal">

2)  Replace <xsd:element name="hallenhoehe">
    with <xsd:element name="hallenhoehe" type="posdecimal">

3)  Remove <xsd:choice> from <xsd:element name="geo">
    and move its child elements into the parent <xsd:sequence>

4)  Remove <xsd:choice> from <xsd:element name="kontaktperson">
    and move its child elements into the parent <xsd:sequence>

5)  Replace <xsd:complexType>
    with <xsd:complexType mixed="true">
    in <xsd:element name="min_mietdauer">

6)  Replace <xsd:complexType>
    with <xsd:complexType mixed="true">
    in <xsd:element name="max_mietdauer">

Afterwards you can generate the JAXB classes by yourself via "mvn-jaxb-xjc.sh".
