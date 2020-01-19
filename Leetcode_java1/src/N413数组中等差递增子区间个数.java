public class N413数组中等差递增子区间个数 {
    public static int numberOfArithmeticSlices(int[] A) {
        int[] TempA = new int[A.length];
        int[] res = new int[A.length];
        if(A.length>2){
            for(int i=2;i<A.length;i++)
            {
                if(A[i]-A[i-1]==A[i-1]-A[i-2]){
                    TempA[i] = TempA[i-1] + 1;
                }else{
                    TempA[i] = 0;
                }
                res[i] = res[i-1] + TempA[i];
            }
            return res[A.length-1];
        }
        return 0;
    }
    public static void main(String[] args){
        int[] a = {-1, -2, -3};
        System.out.println(numberOfArithmeticSlices(a));
    }
}
