import React, { ComponentType } from "react";

import { Box, Divider, Drawer, Toolbar } from "@mui/material";

interface SideNavigationProps {
  Primary?: ComponentType;
  Secondary?: ComponentType;
}

const drawerWidth = 240;

const SideNavigation = ({ Primary, Secondary }: SideNavigationProps) => {
  if (!Primary && !Secondary) {
    return null;
  }
  return (
    <Drawer
      variant="permanent"
      sx={{
        width: drawerWidth,
        flexShrink: 0,
        [`& .MuiDrawer-paper`]: { width: drawerWidth, boxSizing: "border-box" },
      }}
    >
      <Toolbar />
      <Box sx={{ overflow: "auto" }}>
        {Primary && <Primary key="primary-sidebar-nav" />}
        {Primary && <Divider key="sidebar-nav-divider" />}
        {Secondary && <Secondary key="secondary-sidebar-nav" />}
      </Box>
    </Drawer>
  );
};

export type { SideNavigationProps };
export { SideNavigation };
