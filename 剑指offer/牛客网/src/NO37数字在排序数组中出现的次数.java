
public class NO37数字在排序数组中出现的次数 {

    public static int GetNumberOfK(int [] array , int k) {
        int num=0;
        int i;
        for(i=0;i<array.length&&array[i]!=k;i++){}
        for(int j=i;j<array.length&&array[j]==k;j++){
        	num++;
        }
        return num;
     }
	public static void main(String[] args) {
		int []s1={1,1,1,2,2,3,3,4,5,6};
		int []s2={6,5,4,3,3,2,2,1,1,1};
		System.out.println(GetNumberOfK(s1, 1));
		System.out.println(GetNumberOfK(s2, 1));
		

	}

}
