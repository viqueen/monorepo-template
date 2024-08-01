#!/usr/bin/env bash

_clean() {
  rm -rf ../_api/web-sdk/dist
  rm -rf ../_api/node-sdk/dist
  rm -rf ../_api/java-sdk/target
  rm -rf ../_api/kotlin-sdk/target
}

_build() {
    yarn workspace @labset/monorepo-template-api-node-sdk build
    yarn workspace @labset/monorepo-template-api-web-sdk build
    yarn workspace @labset/monorepo-template-api-java-sdk build
    yarn workspace @labset/monorepo-template-api-kotlin-sdk build
}

_clean
_build