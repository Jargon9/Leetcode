package 周赛;

public class N5171最接近的因数 {
    public static int[] closestDivisors(int num) {
        int[] res = new int[2];
        int min = Integer.MAX_VALUE;
        for(int i=1;i<=Math.sqrt(num+1);i++){
            if((num+1)%i==0){
                int temp = num/i;
                if(min>(Math.abs(temp-i))){
                    min = Math.abs(temp-i);
                    res[0] = i;
                    res[1] = temp;
                }
            }
        }
        for(int i=1;i<=Math.sqrt(num+2);i++){
            if((num+2)%i==0){
                int temp = num/i;
                if(min>(Math.abs(temp-i))){
                    min = Math.abs(temp-i);
                    res[0] = i;
                    res[1] = temp;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        closestDivisors(8);
    }
}
