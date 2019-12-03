public class N200岛屿数量 {
    public static int numIslands(char[][] grid) {
        int hei = grid.length;
        if(hei==0)return 0;
        int  wid = grid[0].length;
        int num=0;
        for(int i=0;i<hei;i++){
            for(int j=0;j<wid;j++){
                if(grid[i][j]=='1') {
                    find(grid, i, j,"");
                    num++;
                }
            }
        }
        return num;
    }
    public static void find(char[][] grid, int x, int y, String dir){
        if(grid[x][y]=='0')return;
        else {
            int wid = grid[0].length, hei = grid.length;
            if (x + 1 < hei&&grid[x][y]!='0'&&dir!="left") {
                find(grid, x + 1, y,"right");
            }
            if (y + 1 < wid&&grid[x][y]!='0'&&dir!="right") {
                find(grid, x, y + 1, "left");
            }
            if (y-1 > 0&&grid[x][y-1]!='0'&&dir!="down") {
                find(grid, x, y - 1,"up");
            }
            if (x - 1 > 0&&grid[x-1][y]!='0'&&dir!="up") {
                find(grid, x - 1, y,"down");
            }
        }
        grid[x][y]='0';

    }
    public static void main(String[] arg) {
        char[][] grid = {{'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'},
                };
        System.out.println(numIslands(grid));
    }
}
