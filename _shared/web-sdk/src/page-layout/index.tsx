import React from "react";

import { Box } from "@mui/material";

import { SideNavigation, SideNavigationProps } from "./side-navigation";
import { TopNavigation, TopNavigationProps } from "./top-navigation";

interface PageLayoutProps {
  children: React.ReactNode;
  topNav: TopNavigationProps;
  sidebarNav: SideNavigationProps;
}

const PageLayout = ({ children, topNav, sidebarNav }: PageLayoutProps) => {
  return (
    <Box sx={{ display: "flex" }}>
      <TopNavigation {...topNav} />
      <SideNavigation {...sidebarNav} />
      <Box component="main" sx={{ flexGrow: 1, p: 3, mt: 5 }}>
        <Box>{children}</Box>
      </Box>
    </Box>
  );
};

export type { PageLayoutProps };
export { PageLayout };
