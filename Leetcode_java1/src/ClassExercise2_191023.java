public class ClassExercise2_191023 {
//    public static int[] asteroidCollision(int[] asteroids) {
//        int[] res = new int[asteroids.length];
//        int index = -1;
//        for (int i = 0; i < asteroids.length; i++) {
//            int val = asteroids[i];
//            if (index == -1) {
//                res[++index] = val;
//            } else {
//                if (res[index] * val > 0) {
//                    res[++index] = val;
//                } else {
//                    if (val > 0)
//                        res[++index] = val;
//                    else {
//                        if (res[index] + val < 0) {
//                            index--;
//                            i--;
//                        } else if (res[index] + val == 0) {
//                            index--;
//                        }
//                    }
//                }
//            }
//            return res;
//        }
//    }
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] asteroids= new int[n];
//        for(int i=0;i<n;i++){
//            int x=input.nextInt();
//            asteroids[i]=x;
//        }
//        int[] res = new int[asteroids.length];
//        int index =-1;
//        for(int i=0;i<asteroids.length;i++){
//            int val =asteroids[i];
//            if(index == -1){
//                res[++index]=val;
//            }
//            else{
//                if(res[index]* val >0){
//                    res[++index] =val;
//                }
//                else{
//                    if(val >0)
//                        res[++index] =val;
//                    else{
//                        if(res[index] + val <0)
//                        {
//                            index--;
//                            i--;
//                        }
//                        else if(res[index] + val ==0){
//                            index--;
//                        }
//                    }
//                }
//            }
//        }
//        int[] ans = new int[index+1];
//        for(int i=0;i<=index;i++){
//            ans[i]=res[i];
//        }
////        int mark=0,temp=0,index=-1;
////        for(int i=0;i<num.size();){
////            if(num.get(i)<0&&mark==0)continue;
////            else if(num.get(i)>0&&mark==0) {
////                temp=num.get(i);
////                index=i;
////                mark=1;
////                i++;
////            }
////            else if(num.get(i)<0&&mark==1){
////                if(temp>Math.abs(num.get(i))){
////                    num.remove(i);
////                }
////                else if(temp==Math.abs(num.get(i))){
////                    num.remove(i);
////                    num.remove(index);
////                    mark=0;
////                    temp=0;
////                    index=-1;
////                }
////                else{
////                    num.remove(index);
////                    mark=0;
////                    temp=0;
////                    index=-1;
////                }
////            }
////            else if(num.get(i)>0&&mark==1){
////                temp=num.get(i);
////                index=i;
////                i++;
////            }
////        }
//        for(int i=0;i<ans.length;i++){
//            System.out.println(ans[i]);
//        }
//
//    }
}


