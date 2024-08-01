import React, {
  createContext,
  PropsWithChildren,
  useContext,
  useMemo,
} from "react";

import { createPromiseClient, PromiseClient } from "@connectrpc/connect";
import { createGrpcWebTransport } from "@connectrpc/connect-web";
import { TodoV1TodoServiceConnect } from "@labset/monorepo-template-api-web-sdk";

import { gateway } from "../../components";

interface ConnectApi {
  todoClient: PromiseClient<typeof TodoV1TodoServiceConnect.TodoService>;
}

const ConnectApiContext = createContext<ConnectApi>({
  todoClient: {} as PromiseClient<typeof TodoV1TodoServiceConnect.TodoService>,
});

const useConnectApi = () => useContext(ConnectApiContext);

const ConnectApiProvider = ({ children }: PropsWithChildren) => {
  const transport = createGrpcWebTransport({
    baseUrl: gateway.apiUrl,
    credentials: "include",
  });

  const value = useMemo(() => {
    const todoClient = createPromiseClient(
      TodoV1TodoServiceConnect.TodoService,
      transport,
    );
    return {
      todoClient,
    };
  }, []);

  return (
    <ConnectApiContext.Provider value={value}>
      {children}
    </ConnectApiContext.Provider>
  );
};

export { useConnectApi, ConnectApiProvider };
