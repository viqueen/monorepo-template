// Code generated by protoc-gen-connect-swift. DO NOT EDIT.
//
// Source: todo/v1/todo_service.proto
//

import Connect
import Foundation
import SwiftProtobuf

internal protocol Todo_V1_TodoServiceClientInterface: Sendable {

    @available(iOS 13, *)
    func `create`(request: Todo_V1_CreateRequest, headers: Connect.Headers) async -> ResponseMessage<Todo_V1_CreateResponse>

    @available(iOS 13, *)
    func `read`(request: Todo_V1_ReadRequest, headers: Connect.Headers) async -> ResponseMessage<Todo_V1_ReadResponse>

    @available(iOS 13, *)
    func `update`(request: Todo_V1_UpdateRequest, headers: Connect.Headers) async -> ResponseMessage<Todo_V1_UpdateResponse>

    @available(iOS 13, *)
    func `delete`(request: Todo_V1_DeleteRequest, headers: Connect.Headers) async -> ResponseMessage<Todo_V1_DeleteResponse>

    @available(iOS 13, *)
    func `list`(request: Todo_V1_ListRequest, headers: Connect.Headers) async -> ResponseMessage<Todo_V1_ListResponse>
}

/// Concrete implementation of `Todo_V1_TodoServiceClientInterface`.
internal final class Todo_V1_TodoServiceClient: Todo_V1_TodoServiceClientInterface, Sendable {
    private let client: Connect.ProtocolClientInterface

    internal init(client: Connect.ProtocolClientInterface) {
        self.client = client
    }

    @available(iOS 13, *)
    internal func `create`(request: Todo_V1_CreateRequest, headers: Connect.Headers = [:]) async -> ResponseMessage<Todo_V1_CreateResponse> {
        return await self.client.unary(path: "/todo.v1.TodoService/Create", idempotencyLevel: .unknown, request: request, headers: headers)
    }

    @available(iOS 13, *)
    internal func `read`(request: Todo_V1_ReadRequest, headers: Connect.Headers = [:]) async -> ResponseMessage<Todo_V1_ReadResponse> {
        return await self.client.unary(path: "/todo.v1.TodoService/Read", idempotencyLevel: .unknown, request: request, headers: headers)
    }

    @available(iOS 13, *)
    internal func `update`(request: Todo_V1_UpdateRequest, headers: Connect.Headers = [:]) async -> ResponseMessage<Todo_V1_UpdateResponse> {
        return await self.client.unary(path: "/todo.v1.TodoService/Update", idempotencyLevel: .unknown, request: request, headers: headers)
    }

    @available(iOS 13, *)
    internal func `delete`(request: Todo_V1_DeleteRequest, headers: Connect.Headers = [:]) async -> ResponseMessage<Todo_V1_DeleteResponse> {
        return await self.client.unary(path: "/todo.v1.TodoService/Delete", idempotencyLevel: .unknown, request: request, headers: headers)
    }

    @available(iOS 13, *)
    internal func `list`(request: Todo_V1_ListRequest, headers: Connect.Headers = [:]) async -> ResponseMessage<Todo_V1_ListResponse> {
        return await self.client.unary(path: "/todo.v1.TodoService/List", idempotencyLevel: .unknown, request: request, headers: headers)
    }

    internal enum Metadata {
        internal enum Methods {
            internal static let create = Connect.MethodSpec(name: "Create", service: "todo.v1.TodoService", type: .unary)
            internal static let read = Connect.MethodSpec(name: "Read", service: "todo.v1.TodoService", type: .unary)
            internal static let update = Connect.MethodSpec(name: "Update", service: "todo.v1.TodoService", type: .unary)
            internal static let delete = Connect.MethodSpec(name: "Delete", service: "todo.v1.TodoService", type: .unary)
            internal static let list = Connect.MethodSpec(name: "List", service: "todo.v1.TodoService", type: .unary)
        }
    }
}