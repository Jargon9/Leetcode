public class N695岛屿的最大面积 {
    public static int maxAreaOfIsland(int[][] grid) {
        if(grid==null||grid.length==0) return 0;
        int wid = grid[0].length, len = grid.length;
        int[][] mark = new int[grid.length][grid[0].length];
        int max=0, tempmax=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<wid;j++){
                if(grid[i][j]==0||mark[i][j]==1) continue;
                max = Math.max(max, maxAreatool(grid, mark, i, j));
            }
        }
        return max;
    }
    public static int maxAreatool(int[][] grid, int[][] mark, int i, int j){
        int base = 0, left=0, right = 0, up=0, down = 0;
        if(grid[i][j]==0) return 0;
        else {
            base = 1;
            mark[i][j] = 1;
        }
        if(i-1>0&&mark[i-1][j]==0&&grid[i-1][j]==1){
            up = maxAreatool(grid, mark, i-1, j);
        }
        if(j-1>0&&mark[i][j-1]==0&&grid[i][j-1]==1){
            left = maxAreatool(grid, mark, i, j-1);
        }
        if(i+1<grid.length&&mark[i+1][j]==0&&grid[i+1][j]==1){
            down = maxAreatool(grid, mark, i+1, j);
        }
        if(j+1<grid[0].length&&mark[i][j+1]==0&&grid[i][j+1]==1){
            right = maxAreatool(grid, mark, i, j+1);
        }
        return base+left+right+up+down;
    }
    public static void main(String[] args){
        int[][] s = {{1,1}
        };
        System.out.println(maxAreaOfIsland(s));
    }
}
