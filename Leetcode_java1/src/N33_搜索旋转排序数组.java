public class N33_搜索旋转排序数组 {
    public static int search(int[] nums, int target) {
        int sta=0, end=nums.length-1;
        if(end<0)return -1;
        return NonOrderSe(nums, sta, end ,target);
    }
    public static int Ordersearch(int[] nums, int sta, int end, int target) {
        if (end<sta||target < nums[sta] || target > nums[end]) return -1;
        else {
            if (end==sta){
                return nums[sta]==target?sta:-1;
            }
            if (end > sta) {
                int mid = (sta + end) / 2;
                if (nums[mid] == target) return mid;
                else if (nums[mid] > target) {
                    return Ordersearch(nums, sta, mid - 1, target);
                } else {
                    return Ordersearch(nums, mid + 1, end, target);
                }
            }
        }return -1;
    }
    public static int NonOrderSe(int[] nums, int sta, int end, int target){
        if (end<sta) return -1;
        int mid = (sta + end) / 2;
        if (nums[mid] == target) return mid;
        else if(nums[mid]>=nums[sta]){
            if(target>=nums[sta]&&target<nums[mid]){
                return Ordersearch(nums, sta, mid-1, target);
            }else{
                return NonOrderSe(nums, mid+1, end, target);
            }
        }
        else{
            if(target>nums[mid]&&target<=nums[end]){
                return Ordersearch(nums, mid+1, end, target);
            }else{
                return NonOrderSe(nums, sta, mid-1, target);
            }
        }
    }

    public static void main(String[] args){
        int[] test={4,5,6,7,0,1,2};
        System.out.println(search(test, 4));
    }
}
