FROM golang:1.22

# Install nodejs
RUN apt-get update \
    && apt-get install -y nodejs npm \
    && apt-get clean

# Install buf \
RUN npm install -g @bufbuild/buf

# Install protoc-gen-go and protoc-gen-go-grpc
RUN go install google.golang.org/protobuf/cmd/protoc-gen-go@latest
RUN go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@latest

# Install connect-es
RUN npm install -g @bufbuild/protoc-gen-es @connectrpc/protoc-gen-connect-es protoc-gen-ts

ENV GO111MODULE=on

WORKDIR /workspace