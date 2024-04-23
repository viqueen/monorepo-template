#!/usr/bin/env bash

set -ex

function sdks() {
  yarn workspace @labset/monorepo-template-api-node-sdk build
  yarn workspace @labset/monorepo-template-api-web-sdk build
  yarn workspace @labset/monorepo-template-lib-web-sdk build
  yarn workspace @labset/monorepo-template-api-java-sdk build
}

eval "$@"