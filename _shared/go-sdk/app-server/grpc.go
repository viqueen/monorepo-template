package app_server

import (
	"fmt"
	"google.golang.org/grpc"
	"io"
	"log"
	"net"
)

type GrpcAppServer interface {
	Start(func(server *grpc.Server)) error
	io.Closer
}

type GrpcAppServerConfig struct {
	Address            int32
	UnaryInterceptors  []grpc.UnaryServerInterceptor
	StreamInterceptors []grpc.StreamServerInterceptor
}

func NewGrpcAppServer(config GrpcAppServerConfig) GrpcAppServer {
	server := grpc.NewServer(
		grpc.ChainUnaryInterceptor(config.UnaryInterceptors...),
		grpc.ChainStreamInterceptor(config.StreamInterceptors...),
	)
	return &grpcAppServer{
		server:  server,
		address: config.Address,
	}
}

type grpcAppServer struct {
	server  *grpc.Server
	address int32
}

func (g grpcAppServer) Start(register func(server *grpc.Server)) error {
	listener, err := net.Listen("tcp", fmt.Sprintf(":%d", g.address))
	if err != nil {
		return err
	}
	register(g.server)
	log.Printf("grpc server running on port %d", g.address)
	if serveErr := g.server.Serve(listener); serveErr != nil {
		return serveErr
	}
	return nil
}

func (g grpcAppServer) Close() error {
	g.server.GracefulStop()
	return nil
}
