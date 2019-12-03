public class N343IntergerBreak {
    static public int intergerBreak(int n){
        int MaxInt=0, piece=0, Add=0, num1=0;
        int piece1=0, subtract=0;
        for(int i=2;i<=n;i++){
            piece = n / i;
            Add = n - piece*i;
            int temp=(int)Math.pow(piece, i-1)*(piece + Add);
            piece1 = piece+1;
            num1=n/piece1;
            subtract = n%piece1;
            int temp1=(int)Math.pow(piece1, num1)*(subtract);
            if(temp>=MaxInt||temp1>=MaxInt) {
                MaxInt=temp;
                if(temp1>=MaxInt) MaxInt=temp1;
            }

        }
        return MaxInt;
    }
    //数学题
    //动态规划也可以
    //想法在于结果一定产生与两数乘或者多数乘
    //多数乘法 dp[i-j]*j=dp[i]   或者dp[i]=j*(i-j)
    public static void main(String[] args){
        System.out.println(intergerBreak(25));
    }
}
