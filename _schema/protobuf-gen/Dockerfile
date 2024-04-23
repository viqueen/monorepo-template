FROM node:20-alpine


# Install buf \
RUN npm install --ignore-scripts -g @bufbuild/buf

# Install protoct-gen-ts
RUN npm install --ignore-scripts -g protoc-gen-ts

RUN addgroup -S nonroot \
    && adduser -S nonroot -G nonroot

RUN mkdir -p /workspace/schema && chown -R nonroot:nonroot /workspace/schema
RUN mkdir -p /workspace/api && chown -R nonroot:nonroot /workspace/api

USER nonroot

WORKDIR /workspace/schema