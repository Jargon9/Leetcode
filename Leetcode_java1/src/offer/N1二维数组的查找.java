package offer;

public class N1二维数组的查找 {
    public static boolean Find1(int target, int [][] array) {
        int len = array.length;
        if(len>0){
            int wid=array[0].length;
            int sta = 0, end = wid-1;
            int mid = 0;
            while(sta<end){
                mid = (sta+end)/2;
                if(array[len-1][mid]==target) return true;
                else if(array[len-1][mid]>target) {
                    end = mid;
                }else {
                    sta = mid+1 ;
                }
            }
            int mark = sta;
            end = wid-1;
            while(sta<end){
                mid = (sta+end)/2;
                if(array[mid][mark]==target) return true;
                else if(array[mid][mark]>target) {
                    end = mid;
                }else {
                    sta = mid +1;
                }
            }
        }
        return false;
    }
    public static boolean Find(int target, int [][] array) {
        int len = array.length;
        if(len>0){
            int index = 0;
            while(index<len){
                if(target>array[index][index]) break;
                if(target==array[index][index]) return true;
                index++;
            }if(index>=len) return false;
            int sta=0, end = index;
            int mid = 0;
            while(sta<end){
                mid = (sta+end)/2;
                if(array[index][mid]==target) return true;
                else if(array[index][mid]>target) {
                    end = mid;
                }else {
                    sta = mid+1 ;
                }
            }
            end = index;
            while(sta<end){
                mid = (sta+end)/2;
                if(array[mid][index]==target) return true;
                else if(array[mid][index]>target) {
                    end = mid;
                }else {
                    sta = mid +1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] s ={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Find(7,s));
    }
}
