import java.util.Scanner;

public class ClassExercise2_191204 {
    public static int MinAndMax(int[] nums){
        if(nums.length<=1) return 0;
        int sta=0,end=nums.length+1,Sort=nums.length;
        int tempSta=0,tempEnd=nums.length-1,StaDumb=0,EndDumb=0;
        while(tempSta<tempEnd&&(StaDumb!=1||EndDumb!=1)){
            int TempMax=nums[tempEnd],TempMin=nums[tempSta];
            for(int i=tempSta;i<tempEnd+1;i++){
                if(nums[tempEnd]<nums[i]){ EndDumb=1; }
                if(nums[tempSta]>nums[i]){ StaDumb=1; }
            }
            if(EndDumb==0){
                end = tempEnd;
                tempEnd--;
            }
            if(StaDumb==0){
                sta = tempSta;
                tempSta++;
            }
            if(end-sta-1<Sort)Sort=end-sta-1;
        }
        if(tempEnd==tempSta)return 0;
        return Sort;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] WaitArray = new int[num];
        for (int i = 0; i < num; i++) {
            int TempNum = input.nextInt();
            WaitArray[i] = TempNum;
        }
        System.out.println(MinAndMax(WaitArray));
    }
}
