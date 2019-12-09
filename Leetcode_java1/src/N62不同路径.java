public class N62不同路径 {
    static int Pathnum = 0;
    public static   void FindPath(int i,int j,int m,int n){
        if(i==m-1&&j==n-1) Pathnum=Pathnum+1;
        if(i+1<m){
            FindPath(i+1,j,m,n);
        }
        if(j+1<n){
            FindPath(i,j+1,m,n);
        }
    }
    public static int uniquePaths(int m, int n) {
        int[][] s = new int[m][n];
        if(m>0) {
            for (int i = 0; i < n; i++) {
                s[0][i] = 1;
            }
            for (int i = 0; i < m; i++) {
                s[i][0] = 1;
            }
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    s[i][j] = s[i - 1][j] + s[i][j - 1];
                }
            }
        }
        else return 0;
        return s[m-1][n-1];
    }
    public static void main(String[] args){
        System.out.println(uniquePaths(1, 1));
    }

}
