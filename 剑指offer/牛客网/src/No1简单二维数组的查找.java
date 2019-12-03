



public class No1简单二维数组的查找{
	
	public static boolean Find(int target, int [][] array){
		int row = 0;
		int columns = array[0].length-1;
		for( ;row>-1&&row<array.length&&columns>-1&&columns<array[0].length; )
		{
			if(array[row][columns]==target){
				return true;
			}
			else if(array[row][columns]>target){
				columns=columns-1;
				continue;
			}
			else if(array[row][columns]<target){
				row=row+1;
				continue;
//				for(int i=row;i< array.length;i++){
//					if(array[i][columns]==target){
//						return true;
//					}
//				}
			}
		}
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {
				{2,3,4},
				{4,5,6},
				{7,8,9}
			};
		Find(3,arr);
		System.out.println(Find(10,arr));
	}
	
}
