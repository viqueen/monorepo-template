import React from "react";

import { TodoV1TodoService } from "@labset/monorepo-template-api-web-sdk";
import {
  Alert,
  Card,
  CardActions,
  CardContent,
  CircularProgress,
  Grid,
} from "@mui/material";

interface TodosGridProps {
  isLoading: boolean;
  data?: TodoV1TodoService.ListResponse;
  error?: unknown;
}

const TodosGrid = ({ isLoading, data, error }: TodosGridProps) => {
  return (
    <>
      {isLoading && <CircularProgress />}
      {!isLoading && error && (
        <Alert severity="error">Something went wrong</Alert>
      )}
      {!isLoading && !error && data && (
        <Grid container spacing={2}>
          {data.todos.map((todo) => (
            <Grid key={todo.id} item xs={3}>
              <Card>
                <CardContent>{todo.description}</CardContent>
                <CardActions></CardActions>
              </Card>
            </Grid>
          ))}
        </Grid>
      )}
    </>
  );
};

export { TodosGrid };
