import java.util.Scanner;

public class N221最大正方形 {
    static int Pathnum = 0;
    public static int MaxNum(int m, int n){
        FindPath(0,0,m,n);
        return Pathnum;
    }
    public static void FindPath(int i,int j,int m,int n){
            if(i==m-1&&j==n-1) Pathnum=Pathnum+1;
            if(i+1<m){
                FindPath(i+1,j,m,n);
            }
            if(j+1<n){
                FindPath(i,j+1,m,n);
            }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        System.out.println(MaxNum(m,n));
    }
}
