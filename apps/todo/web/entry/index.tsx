import React from "react";

import { PageLayout } from "@labset/monorepo-template-lib-web-sdk";
import AdjustIcon from "@mui/icons-material/Adjust";
import { createTheme, CssBaseline, ThemeProvider } from "@mui/material";
import { createRoot, hydrateRoot } from "react-dom/client";

const App = () => {
  const topNav = {
    Logo: AdjustIcon,
    productName: "@labset/monorepo-template",
  };
  const sidebarNav = {};
  return (
    <PageLayout topNav={topNav} sidebarNav={sidebarNav}>
      <div>Content</div>
    </PageLayout>
  );
};

const AppWrapper = () => {
  const theme = createTheme({
    palette: {
      mode: "dark",
    },
  });
  return (
    <ThemeProvider theme={theme}>
      <CssBaseline />
      <App />
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
