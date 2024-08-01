package export

import (
	todoV1 "github.com/viqueen/protobuf-template/_api/go-sdk/todo/v1"
	"github.com/viqueen/protobuf-template/apps/todo/_server/internal/serviceV1"
	"google.golang.org/grpc"
)

func Bundle(server *grpc.Server) {
	todoService := serviceV1.NewTodoService()
	todoV1.RegisterTodoServiceServer(server, todoService)
}
