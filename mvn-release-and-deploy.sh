#!/bin/bash
#
# Copyright 2015 OpenEstate.org
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

MVN=mvn
PROJECT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# force an update of submodules
$PROJECT_DIR/git-submodule-update.sh

# install library and build release package
export LANG=en
set -e

cd $PROJECT_DIR
$MVN -Prelease clean javadoc:aggregate deploy
$MVN -Prelease --non-recursive assembly:single
