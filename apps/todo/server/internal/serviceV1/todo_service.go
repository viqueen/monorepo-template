package serviceV1

import (
	"context"
	"github.com/viqueen/protobuf-template/_api/go-sdk/todo/v1"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/status"
)

type TodoService struct {
	todoV1.UnimplementedTodoServiceServer
	inMemory map[string]*todoV1.Todo
}

func NewTodoService() *TodoService {
	return &TodoService{
		inMemory: make(map[string]*todoV1.Todo),
	}
}

func (t TodoService) Create(ctx context.Context, request *todoV1.CreateRequest) (*todoV1.CreateResponse, error) {
	t.inMemory[request.Todo.Id] = request.Todo
	return &todoV1.CreateResponse{
		Todo: request.Todo,
	}, nil
}

func (t TodoService) Read(ctx context.Context, request *todoV1.ReadRequest) (*todoV1.ReadResponse, error) {
	found, ok := t.inMemory[request.Id]
	if !ok {
		return nil, status.Error(codes.NotFound, "not found")
	}
	return &todoV1.ReadResponse{
		Todo: found,
	}, nil
}

func (t TodoService) Update(ctx context.Context, request *todoV1.UpdateRequest) (*todoV1.UpdateResponse, error) {
	t.inMemory[request.Todo.Id] = request.Todo
	return &todoV1.UpdateResponse{
		Todo: request.Todo,
	}, nil
}

func (t TodoService) Delete(ctx context.Context, request *todoV1.DeleteRequest) (*todoV1.DeleteResponse, error) {
	found, ok := t.inMemory[request.Id]
	if !ok {
		return nil, status.Error(codes.NotFound, "not found")
	}
	delete(t.inMemory, request.Id)
	return &todoV1.DeleteResponse{Todo: found}, nil
}
