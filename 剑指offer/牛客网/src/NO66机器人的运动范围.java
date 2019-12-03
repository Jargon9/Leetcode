
public class NO66机器人的运动范围 {
	static int num=0;
	public  static boolean CanMove(int threshold, int rows, int cols){
		int k=0;
		while(rows!=0){
			k=k+rows%10;
			rows=rows/10;
		}while(cols!=0){
			k=k+cols%10;
			cols=cols/10;
		}
		if(k>threshold)return false;
		else return true;
	}
	public  static void tool(int threshold,int row,int col,int rows,int cols ,int[][] mark){
		if(CanMove(threshold, row, col)){
			num++;
			mark[row][col]=1;
		}
		else return; 
		if(row-1>0&&mark[row-1][col]!=1){
			tool(threshold, row-1, col, rows, cols, mark);
			}
		if(row+1<rows&&mark[row+1][col]!=1){
			tool(threshold, row+1, col, rows, cols, mark);
			}
		if(col-1>0&&mark[row][col]!=1){
			tool(threshold, row, col-1, rows, cols, mark);
			}
		if(col+1<cols&&mark[row][col+1]!=1){
			tool(threshold, row, col+1, rows, cols, mark);
			}

	}
    public  static int movingCount(int threshold, int rows, int cols)
    {
        int[][] mark=new int[rows][cols];
        tool(threshold, 0, 0, rows, cols, mark);
        return num;
    }
    
	public static void main(String[] args) {
		int rows=15,cols=20,threshold=20;
		movingCount(rows ,cols ,threshold);
		System.out.println(num);
		

	}

}
