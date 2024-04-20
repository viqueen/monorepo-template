package main

import (
	"fmt"
	"github.com/viqueen/protobuf-template/apps/todo/server/export"
	"google.golang.org/grpc"
	"log"
	"net"
)

func main() {
	address := 50051
	listener, err := net.Listen("tcp", fmt.Sprintf(":%d", address))
	if err != nil {
		log.Fatalf("failed to listen: %v", err)
	}

	server := grpc.NewServer(
		grpc.ChainUnaryInterceptor(),
		grpc.ChainStreamInterceptor(),
	)

	export.Bundle(server)

	log.Printf("todo grpc server running on port %d", address)
	if serveErr := server.Serve(listener); serveErr != nil {
		log.Fatalf("failed to serve on port %d: %v", address, serveErr)
	}
}
