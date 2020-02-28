public class N200岛屿数量 {
    public static int numIslands(char[][] grid) {
        int hei = grid.length;
        if (hei == 0) return 0;
        int wid = grid[0].length;
        int num = 0;
        for (int i = 0; i < hei; i++) {
            for (int j = 0; j < wid; j++) {
                if (grid[i][j] == '1') {
                    find(grid, i, j);
                    num++;
                }
            }
        }
        return num;
    }

    public static void find(char[][] grid, int x, int y) {
        if (grid[x][y] == '0') return;
        int[][] idr = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        grid[x][y] = '0';
        int wid = grid[0].length, hei = grid.length;
        for (int[] temp : idr) {
            if (x + temp[0] < hei && x + temp[0] >= 0 && y + temp[1] < wid && y + temp[1] >= 0 && grid[x + temp[0]][y + temp[1]] != '0') {
                find(grid, x + temp[0], y + temp[1]);
            }
        }
    }

    //        if (x + 1 < hei&&grid[x+1][y]!='0') {
//            find(grid, x + 1, y);
//        }
//        if (y + 1 < wid&&grid[x][y+1]!='0') {
//            find(grid, x, y + 1);
//        }
//        if (y-1 >=0&&grid[x][y-1]!='0') {
//            find(grid, x, y - 1);
//        }
//        if (x - 1 >= 0&&grid[x-1][y]!='0') {
//            find(grid, x - 1, y);
//        }
//    }
    public static void main(String[] arg) {
        char[][] grid = {{},
//                {'0', '1', '0'},
//                {'1', '1', '1'},
        };
        System.out.println(numIslands(grid));
    }
}

