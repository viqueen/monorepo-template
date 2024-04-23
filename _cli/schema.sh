#!/usr/bin/env bash

set -ex

function tools() {
  cd _schema/protobuf-gen || exit
  docker build -t monorepo-template-protobuf-gen .
}

function codegen() {
  registry=${1}
  docker run \
    --volume "${PWD}/_schema:/workspace/schema" \
    --volume "${PWD}/_api:/workspace/api" \
    --workdir "/workspace/schema" \
    "${registry}"monorepo-template-protobuf-gen buf generate --verbose
}

function lint() {
  registry=${1}
  docker run \
    --volume "${PWD}/_schema:/workspace/schema" \
    --workdir "/workspace/schema" \
    "${registry}"monorepo-template-protobuf-gen buf lint --verbose
}

eval "$@"