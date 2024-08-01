import React, { useState } from "react";
import { useQuery } from "react-query";

import { TodoV1TodoService } from "@labset/monorepo-template-api-web-sdk";
import { Button, Container, Divider, Grid, TextField } from "@mui/material";

import { useConnectApi } from "../../context-providers";

import { TodosGrid } from "./todos-grid";

const DashboardPage = () => {
  const [description, setDescription] = useState<string>("");

  const { todoClient } = useConnectApi();
  const { data, isLoading, error, refetch } = useQuery(
    "todos",
    async () => {
      return await todoClient.list(new TodoV1TodoService.ListRequest({}));
    },
    { retry: false },
  );

  const onAdd = () => {
    todoClient
      .create(
        new TodoV1TodoService.CreateRequest({
          todo: { id: crypto.randomUUID(), description },
        }),
      )
      .then(() => setDescription(""))
      .then(() => refetch());
  };

  return (
    <Container maxWidth="md">
      <Grid spacing={2} container>
        <Grid item xs={10}>
          <TextField
            label="todo"
            fullWidth
            size="small"
            onChange={(e) => setDescription(e.target.value)}
          />
        </Grid>
        <Grid item xs={2}>
          <Button variant="contained" fullWidth onClick={onAdd}>
            add
          </Button>
        </Grid>
      </Grid>
      <Divider sx={{ mt: 2, mb: 2 }} />
      <TodosGrid isLoading={isLoading} data={data} error={error} />
    </Container>
  );
};

export { DashboardPage };
