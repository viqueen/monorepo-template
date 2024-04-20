import eslint from "@eslint/js";
import tsEslint from "typescript-eslint";

// noinspection JSUnusedGlobalSymbols
export default tsEslint.config(
  eslint.configs.recommended,
  ...tsEslint.configs.recommended,
);
