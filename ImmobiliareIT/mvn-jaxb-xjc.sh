#!/bin/bash

MVN=mvn
PROJECT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
export LANG=en
set -e

cd $PROJECT_DIR
rm -f jaxb.timestamp
rm -f src/main/java/org/openestate/io/immobiliare_it/xml/*.*
$MVN jaxb2:xjc
