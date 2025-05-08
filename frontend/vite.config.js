import { defineConfig } from "vite";
import react from "@vitejs/plugin-react";
import path from "path";

// https://vite.dev/config/
export default defineConfig({
  resolve: {
    alias: {
      "@": path.resolve(process.cwd(), "src"), // 또는 ESM에서 __dirname 구해서
    },
  },
  plugins: [react()],
  resolve: {
    alias: {
      // src/ 디렉토리를 @로, 또는 src로 바로 참조할 수 있게
      '@': path.resolve(__dirname, 'src'),
      'src': path.resolve(__dirname, 'src')
    }
  },
  server: {
    host: "0.0.0.0",
    port: 5173,
  },
});
