#!/bin/bash

GIT=git
PROJECT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
set -e

cd $PROJECT_DIR
$GIT submodule update --init
