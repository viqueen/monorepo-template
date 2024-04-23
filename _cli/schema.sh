#!/usr/bin/env bash

set -ex

function tools() {
  cd _schema/protobuf-gen || exit
  docker build -t monorepo-template/protobuf-gen .
}

function codegen() {
  docker run \
    --volume "${PWD}/_schema:/workspace/_schema" \
    --volume "${PWD}/_api/go-sdk:/workspace/_api/go-sdk" \
    --volume "${PWD}/_api/node-sdk:/workspace/_api/node-sdk" \
    --volume "${PWD}/_api/web-sdk:/workspace/_api/web-sdk" \
    --volume "${PWD}/_api/java-sdk:/workspace/_api/java-sdk" \
    --workdir "/workspace/_schema" \
    monorepo-template/protobuf-gen buf generate --verbose
}

function lint() {
  docker run \
    --volume "${PWD}/_schema:/workspace/_schema" \
    --workdir "/workspace/_schema" \
    monorepo-template/protobuf-gen buf lint --verbose
}

eval "$@"