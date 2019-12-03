public class N387_FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        int[]num = new int[26];
        int mark=-1;
        int len = s.length();
        for(int i=0;i<len ;i++){
            char x = s.charAt(i);
            if(num[(int)x-97]==0)
            {
                num[(int)x-97]=i;
            }
            else num[(int)x-97]=len;
        }
        mark = num[0];
        for(int i=0;i<len ;i++){
            if(num[i]<mark){
                mark=num[i];
            }
        }
        return mark;
    }
}
