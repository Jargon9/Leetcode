public class N88合并两个有序数组 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp=m+n-1;
        m = m-1;
        n = n-1;
        while(m>=0&&n>=0){
            if(nums1[m]>nums2[n]){
                nums1[temp] = nums1[m];
                m--;
            }else{
                nums1[temp] = nums2[n];
                n--;
            }
            temp--;
        }
        System.arraycopy(nums2, 0, nums1, 0, n+1);
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = nums1.length, n = nums2.length;
        merge(nums1,3,  nums2, 3);
    }
}
