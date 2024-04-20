import React, { createContext, PropsWithChildren, useContext } from "react";

import { createPromiseClient, PromiseClient } from "@connectrpc/connect";
import { createGrpcWebTransport } from "@connectrpc/connect-web";
import { TodoV1Connect } from "@labset/monorepo-template-api-web-sdk";

import { gateway } from "../../components";

interface ConnectApi {
  todoClient: PromiseClient<typeof TodoV1Connect.TodoService>;
}

const ConnectApiContext = createContext<ConnectApi>({
  todoClient: {} as PromiseClient<typeof TodoV1Connect.TodoService>,
});

const useConnectApi = () => useContext(ConnectApiContext);

const ConnectApiProvider = ({ children }: PropsWithChildren) => {
  const transport = createGrpcWebTransport({
    baseUrl: gateway.apiUrl,
    credentials: "include",
  });

  const todoClient = createPromiseClient(TodoV1Connect.TodoService, transport);

  return (
    <ConnectApiContext.Provider value={{ todoClient }}>
      {children}
    </ConnectApiContext.Provider>
  );
};

export { useConnectApi, ConnectApiProvider };
