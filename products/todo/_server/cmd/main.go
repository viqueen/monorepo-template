package main

import (
	appserver "_shared/go-sdk/app-server"
	grpczap "github.com/grpc-ecosystem/go-grpc-middleware/logging/zap"
	"go.uber.org/zap"
	"google.golang.org/grpc"
	"log"
	"os"
	"os/signal"
	"products/todo/_server/export"
	"syscall"
)

func main() {
	zapLogger, _ := zap.NewDevelopment()
	defer zapLogger.Sync()

	server := appserver.NewGrpcAppServer(appserver.GrpcAppServerConfig{
		Address: 50051,
		UnaryInterceptors: []grpc.UnaryServerInterceptor{
			grpczap.UnaryServerInterceptor(zapLogger),
		},
		StreamInterceptors: []grpc.StreamServerInterceptor{
			grpczap.StreamServerInterceptor(zapLogger),
		},
	})

	sigs := make(chan os.Signal, 1)
	signal.Notify(sigs, syscall.SIGTERM)

	go func() {
		<-sigs
		err := server.Close()
		if err != nil {
			log.Fatalf("failed to close server: %v", err)
		}
	}()

	err := server.Start(export.Bundle)
	if err != nil {
		log.Fatalf("failed to start server: %v", err)
	}
}
