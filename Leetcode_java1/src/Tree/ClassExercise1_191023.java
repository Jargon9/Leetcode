package Tree;

import java.util.Scanner;

public class ClassExercise1_191023 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n<=0) System.out.println(0);
        int []num = new int[n];
        for(int i=0;i<n;i++){
            num[i]= input.nextInt();
        }
        int s = input.nextInt();
        int min=n+1;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+num[j];
                if(sum>=s){
                    int temp=j-i+1;
                    if(temp<min){
                        min =temp;
                        break;
                    }
                }
            }
        }
//        int s = input.nextInt(),sum=num[0],nums=1,min=n+1,head=0;
//        for(int i=0;i<n;i++){
//            if(sum<s){
//                sum=sum+num[i];
//                nums++;
//            }
//            if(sum>=s) {
//                if(min>nums) {
//                    min=nums;
//                    if(min==1) break;
//                }
//                else{
//                    nums--;
//                    sum=sum-num[head];
//                    head++;
//                }
//            }
//        }
//        while(sum-num[head]>s){
//            sum=sum-num[head];
//            head++;
//            min--;
//        }
        if(min<n+1){
            System.out.println(min);
        }
        else{
            System.out.println(0);
        }
        input.close();
    }
}
