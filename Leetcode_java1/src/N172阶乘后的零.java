public class N172阶乘后的零 {

    public static int trailingZeroes(int n) {
        long temp=1, sum=0;
        for(int i=1;i<n+1;i++){
            temp = temp * i;
            if(i%5==0){
                temp = temp*i;
                long temp1=0;
                while(temp!=0&&temp1==0){
                    temp1 = temp%10;
                    if(temp1 ==0){
                        sum++;
                    }
                    temp = temp /10;
                }
                temp = 1;
            }
        }
        return (int) sum;
    }
    public static void main(String[] args){
        System.out.println(trailingZeroes(30));
    }
}
