import java.util.Scanner;

public class ClassExercise2_191120 {

//    public static void judge(int[] num,int len, int k){
//        if(k>=len||k<=0||len<=0) {
//            System.out.println(false);
//            return;
//        }
//        int max=0, temp;
//        for(int i=0;i<len;i++){
//            temp=num[i];
//            for(int j=i+1;j<len;j++){
//                if(num[j]==num[i]&&j-i>max){
//                    max=j-i;
//                }
//            }
//        }
//        if(max==k) System.out.println(true);
//        else System.out.println(false);
//    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = Math.max(i - k, 0); j < i; ++j) {
                if (nums[i] == nums[j]) {
                    System.out.println(true);
                    return true;
                }
            }
        }
            System.out.println(false);
            return false;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }
        int k = input.nextInt();
        containsNearbyDuplicate(num,  k);
    }
}
