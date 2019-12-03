public class N64MinimumPathSum {

     public static int minPath(int[][] g,int a,int b){
        int num=g[a][b];
        if(a==g.length-1){
            int fin=num;
            for(int i=b+1;i<g[0].length;i++){
                num=num+g[a][i];
            }
            return num;
        }
         if(b==g[0].length-1){
             int fin=num;
             for(int i=a+1;i<g.length;i++){
                 num=num+g[i][b];
             }
             return num;
         }
         num=num+(minPath(g,a+1,b)<=minPath(g,a,b+1)?minPath(g,a+1,b):minPath(g,a,b+1));
        return num;
    }
    public static int minPathSum(int[][] grid) {
         int [][]g=new int[grid.length][grid[0].length];
        return minPath(grid,0,0);
    }
        public static void main(String arg[]){
            int[][]g={{1,3,1},{1,5,1},{4,2,1}};
            System.out.println(minPathSum(g));
        }


}
