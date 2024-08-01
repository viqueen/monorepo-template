import React from "react";
import { QueryClient, QueryClientProvider } from "react-query";
import { HashRouter, Navigate, Route, Routes } from "react-router-dom";

import { PageLayout } from "@labset/monorepo-template-lib-web-sdk";
import AdjustIcon from "@mui/icons-material/Adjust";
import { createTheme, CssBaseline, ThemeProvider } from "@mui/material";
import { createRoot, hydrateRoot } from "react-dom/client";

import {
  PrimarySidebarNav,
  PrimaryTopNav,
  SecondarySidebarNav,
  SecondaryTopNav,
} from "../components";
import { ConnectApiProvider } from "../context-providers";
import { DashboardPage, TodoPage } from "../pages";

const App = () => {
  const topNav = {
    Logo: AdjustIcon,
    productName: "@labset/monorepo-template",
    Primary: PrimaryTopNav,
    Secondary: SecondaryTopNav,
  };
  const sidebarNav = {
    Primary: PrimarySidebarNav,
    Secondary: SecondarySidebarNav,
  };
  return (
    <PageLayout topNav={topNav} sidebarNav={sidebarNav}>
      <HashRouter>
        <Routes>
          <Route path="/" element={<Navigate to="/dashboard" />} />
          <Route path="/dashboard" element={<DashboardPage />} />
          <Route path="/todo/:todoId" element={<TodoPage />} />
        </Routes>
      </HashRouter>
    </PageLayout>
  );
};

const AppWrapper = () => {
  const theme = createTheme({
    palette: {
      mode: "dark",
    },
  });
  const queryClient = new QueryClient();

  return (
    <ThemeProvider theme={theme}>
      <CssBaseline />
      <QueryClientProvider client={queryClient}>
        <ConnectApiProvider>
          <App />
        </ConnectApiProvider>
      </QueryClientProvider>
    </ThemeProvider>
  );
};

const rootContainer = document.querySelector("#root");
if (rootContainer) {
  if (rootContainer.hasChildNodes()) {
    hydrateRoot(rootContainer, <AppWrapper />);
  } else {
    createRoot(rootContainer).render(<AppWrapper />);
  }
}
