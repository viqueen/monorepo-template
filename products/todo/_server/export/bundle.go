package export

import (
	todoV1 "_api/go-sdk/todo/v1"
	"google.golang.org/grpc"
	"products/todo/_server/internal/serviceV1"
)

func Bundle(server *grpc.Server) {
	todoService := serviceV1.NewTodoService()
	todoV1.RegisterTodoServiceServer(server, todoService)
}
