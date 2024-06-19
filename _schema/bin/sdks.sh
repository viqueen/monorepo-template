#!/usr/bin/env bash

_clean() {
  rm -rf ../_api/web-sdk/dist
}

_build() {
    yarn workspace @labset/monorepo-template-api-node-sdk build
    yarn workspace @labset/monorepo-template-api-web-sdk build
    yarn workspace @labset/monorepo-template-lib-web-sdk build
    yarn workspace @labset/monorepo-template-api-java-sdk build
    yarn workspace @labset/monorepo-template-api-kotlin-sdk build
}

_clean
_build