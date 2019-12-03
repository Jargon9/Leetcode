import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N279PerfectSquares {
    public static int numSquares1(int n) {
        int []dp=new int[n+1];
        if(n>0)dp[1]=1;
        for(int i=2;i<n+1;i++){
            dp[i]=i;
            for(int j=1;j*j<i+1;j++)
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
        }
        return dp[n];
    }
    static class Node{
        int val;
        int step;
        public Node(int val,int step){
            this.val=val;
            this.step=step;
        }
    }
    public static int numSquares(int n) {
        Queue<Node> queue=new LinkedList<>();
        queue.add(new Node(n,0));//第0层建起来
        boolean[] visited =new boolean[n+1];//一定是n+1个零点
        while(!queue.isEmpty()){
            int num = queue.peek().val;
            int step = queue.peek().step;
            queue.remove();

            for(int i=1;;i++){
                int a=num-i*i;
                if(a<0){
                    break;
                }
                if(a == 0){
                    return step+1;
                }
                if(!visited[a]){
                    queue.add(new Node(a,step+1));
                    visited[a]=true;
                }
            }
        }
        return -1;
    }
    public  static void main(String ary[]){
        System.out.println(numSquares(8));
    }
}
