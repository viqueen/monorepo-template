import React, { ComponentType } from "react";

import { AppBar, Box, Toolbar, Typography } from "@mui/material";
import type { SxProps } from "@mui/material";

interface TopNavigationProps {
  Logo: ComponentType<{ sx?: SxProps }>;
  productName: string;
  Primary?: ComponentType;
  Secondary?: ComponentType;
}

const TopNavigation = ({ Logo, productName }: TopNavigationProps) => {
  return (
    <AppBar
      position="fixed"
      sx={{ zIndex: (theme) => theme.zIndex.drawer + 1 }}
    >
      <Box>
        <Toolbar variant="dense">
          <Logo sx={{ display: { xs: "flex", md: "flex" }, mr: 1 }} />
          <Typography
            component="a"
            sx={{
              display: { xs: "flex", md: "flex" },
              fontFamily: "monospace",
              fontWeight: 700,
              color: "inherit",
              textDecoration: "none",
              marginRight: 2,
            }}
            href="/"
          >
            {productName}
          </Typography>
          <Box sx={{ flexGrow: 1 }}></Box>
        </Toolbar>
      </Box>
    </AppBar>
  );
};

export type { TopNavigationProps };
export { TopNavigation };
