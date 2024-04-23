FROM node:20-alpine


# Install buf \
RUN npm install -g @bufbuild/buf

# Install connect-es
RUN npm install -g protoc-gen-ts

RUN addgroup -S nonroot \
    && adduser -S nonroot -G nonroot

USER nonroot

WORKDIR /workspace