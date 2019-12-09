import java.util.Scanner;

public class N67二进制求和 {
    public static String BigNumSum(String number1, String number2){
        int len = number1.length()>=number2.length()? number1.length(): number2.length();
        int[] nums1=new int[len+1];
        int[] nums2=new int[len+1];
        for(int i=0;i<number1.length();i++){
            nums1[len-i] = (int)number1.charAt(number1.length()-i-1)-48;
        }
        for(int i=0;i<number2.length();i++){
            nums2[len-i] = (int)number2.charAt(number2.length()-i-1)-48;
        }
        int UP=0;
        for(int i=len;i>=0;i--){
            nums1[i] = nums1[i] + nums2[i];
            if(UP==1) {
                nums1[i]++;
                UP=0;
            }
            if(nums1[i]>1) {
                nums1[i] = nums1[i]%2;
                UP=1;
            }
        }String res ="";
        for(int i=0;i<len+1;i++){
            if(i==0&&nums1[i]!=0){
                res = res + (char)(nums1[0]+48);
            }
            else if(i!=0){
                res = res + (char)(nums1[i]+48);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number1 = input.nextLine();
        String number2 = input.nextLine();
        System.out.println(BigNumSum(number1,number2));
    }
}
