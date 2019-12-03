import java.util.Arrays;

public class N215Kth_Largest_Element_InAnArray {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int len=nums.length-1;

        for(int i=0;i<k;i++) {
            if(i==k-1)
            return (nums[len-i]);
        }
        return 0;
    }
    public static void main(String[] args){
        int []a ={2,5,8,6};
        System.out.println(findKthLargest(a,4));
    }
}
