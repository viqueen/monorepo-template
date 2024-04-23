// @generated by protoc-gen-es v1.9.0 with parameter "target=ts"
// @generated from file todo/admin/v1/admin_todo_service.proto (package todo.admin.v1, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import type { BinaryReadOptions, FieldList, JsonReadOptions, JsonValue, PartialMessage, PlainMessage } from "@bufbuild/protobuf";
import { Message, proto3 } from "@bufbuild/protobuf";
import { Todo } from "../../v1/models_pb.js";

/**
 * @generated from message todo.admin.v1.ListTodosRequest
 */
export class ListTodosRequest extends Message<ListTodosRequest> {
  /**
   * @generated from field: string query = 1;
   */
  query = "";

  constructor(data?: PartialMessage<ListTodosRequest>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "todo.admin.v1.ListTodosRequest";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "query", kind: "scalar", T: 9 /* ScalarType.STRING */ },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): ListTodosRequest {
    return new ListTodosRequest().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): ListTodosRequest {
    return new ListTodosRequest().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): ListTodosRequest {
    return new ListTodosRequest().fromJsonString(jsonString, options);
  }

  static equals(a: ListTodosRequest | PlainMessage<ListTodosRequest> | undefined, b: ListTodosRequest | PlainMessage<ListTodosRequest> | undefined): boolean {
    return proto3.util.equals(ListTodosRequest, a, b);
  }
}

/**
 * @generated from message todo.admin.v1.ListTodosResponse
 */
export class ListTodosResponse extends Message<ListTodosResponse> {
  /**
   * @generated from field: repeated todo.v1.Todo todos = 1;
   */
  todos: Todo[] = [];

  constructor(data?: PartialMessage<ListTodosResponse>) {
    super();
    proto3.util.initPartial(data, this);
  }

  static readonly runtime: typeof proto3 = proto3;
  static readonly typeName = "todo.admin.v1.ListTodosResponse";
  static readonly fields: FieldList = proto3.util.newFieldList(() => [
    { no: 1, name: "todos", kind: "message", T: Todo, repeated: true },
  ]);

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): ListTodosResponse {
    return new ListTodosResponse().fromBinary(bytes, options);
  }

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): ListTodosResponse {
    return new ListTodosResponse().fromJson(jsonValue, options);
  }

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): ListTodosResponse {
    return new ListTodosResponse().fromJsonString(jsonString, options);
  }

  static equals(a: ListTodosResponse | PlainMessage<ListTodosResponse> | undefined, b: ListTodosResponse | PlainMessage<ListTodosResponse> | undefined): boolean {
    return proto3.util.equals(ListTodosResponse, a, b);
  }
}

