# Monorepo Template

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=viqueen_monorepo-template&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=viqueen_monorepo-template)

---

Thank you **copilot** for this readme

---

This project is a full-stack, monorepo application that uses a variety of modern technologies for robust, scalable development.

### Overview

1. **Monorepo**: The project is structured as a monorepo, housing multiple packages or projects in a single repository. This structure simplifies dependency management and code sharing.

2. **Protobuf**: Protocol Buffers (protobuf) is used to define the data schema. It's a language-agnostic binary format developed by Google, used for serializing structured data.

3. **gRPC and Connect RPC**: The backend is built with Go and uses gRPC, a high-performance, open-source universal RPC framework. Connect RPC, a library for building gRPC services, is also used.

4. **React and TypeScript**: The frontend is built with React, a popular JavaScript library for building user interfaces, and TypeScript, a statically typed superset of JavaScript.

5. **React Query**: React Query, a data synchronization library for React, is used. It provides hooks to fetch, cache, and update data in React components.

6. **Webpack**: Webpack, a static module bundler for JavaScript applications, is used. It takes modules with dependencies and generates static assets representing those modules.

7. **Docker, Node.js, Yarn, and Golang**: These are part of the development environment. Docker is used for containerization, Node.js and Yarn for managing JavaScript dependencies, and Golang for backend development.

8. **SonarCloud**: The project uses SonarCloud for continuous code quality inspection.

### Development Environment

- Docker
- Node.js (nvm)
- Yarn
- Golang

### Build Instructions

1. Install dependencies: `yarn`
2. Generate code for schema: `yarn schema codegen`
3. Build the sdks: `yarn schema sdks`

### Run Instructions

1. Setup environment: `yarn harness env:up`
2. Start the backend: `yarn todo server:dev`
3. Start the frontend with material ui: `yarn todo web-mui:dev`
