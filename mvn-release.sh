#!/bin/bash

MVN=mvn
PROJECT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# force an update of submodules
$PROJECT_DIR/git-submodule-update.sh

# install library and build release package
export LANG=en
set -e

cd $PROJECT_DIR
$MVN -DcreateChecksum=true clean install javadoc:aggregate
$MVN --non-recursive assembly:single
