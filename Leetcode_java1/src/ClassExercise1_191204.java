import java.util.ArrayList;
import java.util.Scanner;

public class ClassExercise1_191204 {
    public static int Min(int[] nums, int s) {
        int l = 0, r = -1; // nums[l...r]为我们的滑动窗口
        int sum = 0;
        int res = nums.length + 1;
        while (l < nums.length) {   // 窗口的左边界在数组范围内,则循环继续
            if (r + 1 < nums.length && sum < s) {
                sum += nums[++r];
            } else {// r已经到头 或者 sum >= s
                sum -= nums[l++];
            }
            if (sum >= s) {
                res = Math.min(res, r - l + 1);
            }
        }
        if (res == nums.length + 1) {
            return 0;
        }
        return res;
    }
    public static int Mi1n(int[] nums, int target){
        ArrayList<Integer> num = new ArrayList<>();
        for(int i:nums){
            num.add(i);
        }
        if (num.size()<=0) return 0;
        int sta=0,end=0,mark=0;
        int min=num.size(), Temp=1,TempSum=num.get(0);
        while(end<num.size()-1){
            if(TempSum<target){
                end = end +1;
                TempSum = TempSum+num.get(end);
                Temp = Temp + 1;
            }
            else {
                mark = 1;
                if(Temp<min) min = Temp;
                TempSum = TempSum-num.get(sta);
                sta++;
                Temp = Temp - 1;
            }
        }
        while(TempSum>=target&&sta<end){
            mark = 1;
            if(Temp<min) min = Temp;
            TempSum = TempSum-num.get(sta);
            sta++;
            Temp = Temp - 1;
        }
        if(mark == 1) return min;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] WaitArray = new int[num];
        for(int i=0;i<num;i++){
            int TempNum = input.nextInt();
            WaitArray[i] = TempNum;
        }
        int target = input.nextInt();
        System.out.println(Min(WaitArray, target));
        input.close();
    }
}
