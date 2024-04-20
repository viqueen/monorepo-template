# protobuf-template

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=viqueen_protobuf-template&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=viqueen_protobuf-template)

## development environment

- Docker
- Node.js (nvm)
- Yarn
- Golang

## build it

- install dependencies

```bash
yarn
```

- schema: build required tools

```bash
yarn schema:tools
```

- schema: codegen

```bash
yarn schema:codegen
```

## run it

- setup environment

```bash
yarn harness env:up
```

- start the backend

```bash
yarn todo server:dev
```

- start the frontend

```bash
yarn todo web:dev
```