#!/usr/bin/env bash

set -ex

function tools() {
  cd _schema/protobuf-gen || exit
  docker build -t viqueen/monorepo-template-protobuf-gen .
}

function codegen() {
  registry=${1:-""}
  version=${2:-""}
  docker run \
    --volume "${PWD}/_schema:/workspace/schema" \
    --volume "${PWD}/_api:/workspace/api" \
    "${registry}"viqueen/monorepo-template-protobuf-gen"${version}" buf generate --verbose
}

function lint() {
  registry=${1}
  docker run \
    --volume "${PWD}/_schema:/workspace/schema" \
    "${registry}"monorepo-template-protobuf-gen buf lint --verbose
}

eval "$@"