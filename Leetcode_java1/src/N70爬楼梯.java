public class N70爬楼梯 {
    public int climbStairs(int n) {
        if(n<=0) return 0;
        int[] Stairs=new int[n+1];
        Stairs[1]=1;
        if(n>=2) {
            Stairs[2] = 2;
            for (int i = 3; i < n + 1; i++) {
                Stairs[i] = Stairs[i - 1] + Stairs[i - 2];
            }
        }
        return Stairs[n];
    }

}
