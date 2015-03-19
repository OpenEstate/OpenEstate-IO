This folder contains the schema files of ImmoXML for class generation via JAXB.

We can't provide these files within this folder, because the license conditions
of ImmoXML do not allow us to provide a copy of the original schema files.

You can obtain the specifications from LAGLER Spezial-Software GmbH at
https://www.lagler.de/

After you have received the schema files, place the file called "immoxml.xsd"
into this directory. Correct file names are important!

Also make sure, that you apply the modifications to "immoxml.xsd", that are
documented in the "README.md" of this module.

Afterwards you can generate the JAXB classes for yourself via "mvn-jaxb-xjc.sh".
