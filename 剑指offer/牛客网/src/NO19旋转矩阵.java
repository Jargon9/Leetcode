import java.util.ArrayList;


public class NO19旋转矩阵 {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        int len=matrix[0].length;
        int wid=matrix.length;
        int len1=matrix[0].length;
        int wid1=matrix.length;;
        int epo=0;
        ArrayList<Integer> array=new ArrayList<Integer>();
        while(len>0&&wid>0){
        	if(len>0){
        		for(int i=epo;i<len1-epo;i++){
        			array.add(matrix[epo][i]);
        		}
        		len--;
        	}else{break;}
        	if(wid>0){
        		for(int i=epo+1;i<wid1-epo;i++){
        			array.add(matrix[i][len1-epo-1]);
        		}
        		wid--;
        	}else{break;}
        	if(len>0&&wid>0){
        		for(int i=len1-epo-2;i>epo-1;i--){
        			array.add(matrix[wid1-epo-1][i]);
        		}
        		len--;
        	}else{break;}
        	if(len>-1&&wid>0){
        		for(int i=wid1-epo-2;i>epo;i--){
        			array.add(matrix[i][epo]);
        		}
        		wid--;
        	}else{break;}

        	epo++;
        }
        return array;
    }


	public static void main(String[] args) {
		int[][]exm={{1,2,3,4,5}};
		System.out.println(printMatrix(exm));

	}

}
