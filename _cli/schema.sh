#!/usr/bin/env bash

set -ex

function tools() {
  cd _schema/protobuf-gen || exit
  docker build -t protobuf-template/protobuf-gen .
}

function codegen() {
  docker run \
    --volume "${PWD}/_schema:/workspace/_schema" \
    --volume "${PWD}/_api/go-sdk:/workspace/_api/go-sdk" \
    --volume "${PWD}/_api/node-sdk:/workspace/_api/node-sdk" \
    --volume "${PWD}/_api/web-sdk:/workspace/_api/web-sdk" \
    --workdir "/workspace/_schema" \
    protobuf-template/protobuf-gen buf generate --verbose
}

eval "$@"