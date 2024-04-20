import React from "react";
import { useQuery } from "react-query";

import { TodoV1Service } from "@labset/monorepo-template-api-web-sdk";
import { Alert, CircularProgress, Container, Grid } from "@mui/material";

import { useConnectApi } from "../../context-providers";

const DashboardPage = () => {
  const { todoClient } = useConnectApi();
  const { data, isLoading, error } = useQuery(
    "todos",
    async () => {
      return await todoClient.list(new TodoV1Service.ListRequest({}));
    },
    { retry: false },
  );
  return (
    <Container maxWidth="md">
      <>
        {isLoading && <CircularProgress />}
        {!isLoading && error && (
          <Alert severity="error">Something went wrong</Alert>
        )}
        {!isLoading && !error && data && (
          <Grid container spacing={2}>
            {data.todos.map((todo) => (
              <Grid key={todo.id} item xs={3}>
                {todo.title}
              </Grid>
            ))}
          </Grid>
        )}
      </>
    </Container>
  );
};

export { DashboardPage };
