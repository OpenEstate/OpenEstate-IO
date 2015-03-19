This folder contains the schema files of OpenImmo for class generation via JAXB.

We can't provide these files within this folder, because the license conditions
of OpenImmo do not allow us to provide a copy of the original schema files.

You can obtain the specifications from OpenImmo e.V. at
http://www.openimmo.de/

After you have received the schema files, place the files called
"openimmo_127.xsd" and "openimmo-feedback_125.xsd" into this directory. Correct
file names are important!

Also make sure, that you apply the modifications to "openimmo_127.xsd" and
"openimmo-feedback_125.xsd", that are documented in the "README.md" of this
module.

Afterwards you can generate the JAXB classes for yourself via "mvn-jaxb-xjc.sh".
