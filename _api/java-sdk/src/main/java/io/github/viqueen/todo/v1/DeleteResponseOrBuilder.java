// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: todo/v1/todo_service.proto

// Protobuf Java Version: 4.26.1
package io.github.viqueen.todo.v1;

public interface DeleteResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:todo.v1.DeleteResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
   * @return Whether the todo field is set.
   */
  boolean hasTodo();
  /**
   * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
   * @return The todo.
   */
  io.github.viqueen.todo.v1.Todo getTodo();
  /**
   * <code>.todo.v1.Todo todo = 1 [json_name = "todo"];</code>
   */
  io.github.viqueen.todo.v1.TodoOrBuilder getTodoOrBuilder();
}