import java.util.Scanner;

public class ClassExercise3_191120 {
    public static int Print(int[][] num, int m, int n){
        m = num.length;
        if(num.length>0)n = num[0].length;
        int temp=0, max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp=Judge(num,i,j,m,n);
                if(temp>max) max=temp;
            }
        }
        max=max*max;
        System.out.println(max);
        return max;
    }
    public static int Judge(int[][] num, int i, int j, int m, int n){
        int temp=1,max=1;
        if(num[i][j]==0) return 0;
        else{
            while(true) {
                temp = temp + 1;
                for(int x=i;x<i+temp;x++){
                    if(x>=m||j+temp-1>=n||num[x][j+temp-1]==0) return max;
                }
                for(int y=j;y<j+temp;y++){
                    if(y>=n||i+temp-1>=m||num[i+temp-1][y]==0) return max;
                }
                max=temp;
            }

        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] num = new int[m][n];
        for (int i = 0; i < m; i++) {
           for(int j=0;j<n;j++) {
               num[i][j] = input.nextInt();
           }
        }
        Print(num,m,n);
    }
}
