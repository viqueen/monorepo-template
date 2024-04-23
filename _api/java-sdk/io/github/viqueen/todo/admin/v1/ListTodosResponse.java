// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: todo/admin/v1/admin_todo_service.proto

package io.github.viqueen.todo.admin.v1;

/**
 * Protobuf type {@code todo.admin.v1.ListTodosResponse}
 */
public  final class ListTodosResponse extends
    com.google.protobuf.GeneratedMessageLite<
        ListTodosResponse, ListTodosResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:todo.admin.v1.ListTodosResponse)
    ListTodosResponseOrBuilder {
  private ListTodosResponse() {
    todos_ = emptyProtobufList();
  }
  public static final int TODOS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<io.github.viqueen.todo.v1.Todo> todos_;
  /**
   * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
   */
  @java.lang.Override
  public java.util.List<io.github.viqueen.todo.v1.Todo> getTodosList() {
    return todos_;
  }
  /**
   * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
   */
  public java.util.List<? extends io.github.viqueen.todo.v1.TodoOrBuilder> 
      getTodosOrBuilderList() {
    return todos_;
  }
  /**
   * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
   */
  @java.lang.Override
  public int getTodosCount() {
    return todos_.size();
  }
  /**
   * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
   */
  @java.lang.Override
  public io.github.viqueen.todo.v1.Todo getTodos(int index) {
    return todos_.get(index);
  }
  /**
   * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
   */
  public io.github.viqueen.todo.v1.TodoOrBuilder getTodosOrBuilder(
      int index) {
    return todos_.get(index);
  }
  private void ensureTodosIsMutable() {
    com.google.protobuf.Internal.ProtobufList<io.github.viqueen.todo.v1.Todo> tmp = todos_;
    if (!tmp.isModifiable()) {
      todos_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
   */
  private void setTodos(
      int index, io.github.viqueen.todo.v1.Todo value) {
    value.getClass();
  ensureTodosIsMutable();
    todos_.set(index, value);
  }
  /**
   * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
   */
  private void addTodos(io.github.viqueen.todo.v1.Todo value) {
    value.getClass();
  ensureTodosIsMutable();
    todos_.add(value);
  }
  /**
   * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
   */
  private void addTodos(
      int index, io.github.viqueen.todo.v1.Todo value) {
    value.getClass();
  ensureTodosIsMutable();
    todos_.add(index, value);
  }
  /**
   * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
   */
  private void addAllTodos(
      java.lang.Iterable<? extends io.github.viqueen.todo.v1.Todo> values) {
    ensureTodosIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, todos_);
  }
  /**
   * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
   */
  private void clearTodos() {
    todos_ = emptyProtobufList();
  }
  /**
   * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
   */
  private void removeTodos(int index) {
    ensureTodosIsMutable();
    todos_.remove(index);
  }

  public static io.github.viqueen.todo.admin.v1.ListTodosResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.github.viqueen.todo.admin.v1.ListTodosResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.github.viqueen.todo.admin.v1.ListTodosResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.github.viqueen.todo.admin.v1.ListTodosResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.github.viqueen.todo.admin.v1.ListTodosResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.github.viqueen.todo.admin.v1.ListTodosResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.github.viqueen.todo.admin.v1.ListTodosResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.github.viqueen.todo.admin.v1.ListTodosResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.github.viqueen.todo.admin.v1.ListTodosResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.github.viqueen.todo.admin.v1.ListTodosResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.github.viqueen.todo.admin.v1.ListTodosResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.github.viqueen.todo.admin.v1.ListTodosResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.github.viqueen.todo.admin.v1.ListTodosResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code todo.admin.v1.ListTodosResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.github.viqueen.todo.admin.v1.ListTodosResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:todo.admin.v1.ListTodosResponse)
      io.github.viqueen.todo.admin.v1.ListTodosResponseOrBuilder {
    // Construct using io.github.viqueen.todo.admin.v1.ListTodosResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
     */
    @java.lang.Override
    public java.util.List<io.github.viqueen.todo.v1.Todo> getTodosList() {
      return java.util.Collections.unmodifiableList(
          instance.getTodosList());
    }
    /**
     * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
     */
    @java.lang.Override
    public int getTodosCount() {
      return instance.getTodosCount();
    }/**
     * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
     */
    @java.lang.Override
    public io.github.viqueen.todo.v1.Todo getTodos(int index) {
      return instance.getTodos(index);
    }
    /**
     * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
     */
    public Builder setTodos(
        int index, io.github.viqueen.todo.v1.Todo value) {
      copyOnWrite();
      instance.setTodos(index, value);
      return this;
    }
    /**
     * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
     */
    public Builder setTodos(
        int index, io.github.viqueen.todo.v1.Todo.Builder builderForValue) {
      copyOnWrite();
      instance.setTodos(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
     */
    public Builder addTodos(io.github.viqueen.todo.v1.Todo value) {
      copyOnWrite();
      instance.addTodos(value);
      return this;
    }
    /**
     * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
     */
    public Builder addTodos(
        int index, io.github.viqueen.todo.v1.Todo value) {
      copyOnWrite();
      instance.addTodos(index, value);
      return this;
    }
    /**
     * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
     */
    public Builder addTodos(
        io.github.viqueen.todo.v1.Todo.Builder builderForValue) {
      copyOnWrite();
      instance.addTodos(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
     */
    public Builder addTodos(
        int index, io.github.viqueen.todo.v1.Todo.Builder builderForValue) {
      copyOnWrite();
      instance.addTodos(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
     */
    public Builder addAllTodos(
        java.lang.Iterable<? extends io.github.viqueen.todo.v1.Todo> values) {
      copyOnWrite();
      instance.addAllTodos(values);
      return this;
    }
    /**
     * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
     */
    public Builder clearTodos() {
      copyOnWrite();
      instance.clearTodos();
      return this;
    }
    /**
     * <code>repeated .todo.v1.Todo todos = 1 [json_name = "todos"];</code>
     */
    public Builder removeTodos(int index) {
      copyOnWrite();
      instance.removeTodos(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:todo.admin.v1.ListTodosResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.github.viqueen.todo.admin.v1.ListTodosResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "todos_",
            io.github.viqueen.todo.v1.Todo.class,
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.github.viqueen.todo.admin.v1.ListTodosResponse> parser = PARSER;
        if (parser == null) {
          synchronized (io.github.viqueen.todo.admin.v1.ListTodosResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.github.viqueen.todo.admin.v1.ListTodosResponse>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:todo.admin.v1.ListTodosResponse)
  private static final io.github.viqueen.todo.admin.v1.ListTodosResponse DEFAULT_INSTANCE;
  static {
    ListTodosResponse defaultInstance = new ListTodosResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ListTodosResponse.class, defaultInstance);
  }

  public static io.github.viqueen.todo.admin.v1.ListTodosResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListTodosResponse> PARSER;

  public static com.google.protobuf.Parser<ListTodosResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
