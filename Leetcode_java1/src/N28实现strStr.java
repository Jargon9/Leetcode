public class N28实现strStr {

    public static int strStr(String haystack, String needle) {
        int Hlen=haystack.length(),Nlen=needle.length();
        if(needle=="") return 0;
        int mark=-1,flag=-1;
        for(int i=0;i<Hlen-Nlen+1;i++){
            for(int j=0;j<Nlen;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    flag = -1;
                    break;
                }
                flag = 1;
            }
            if(flag == 1) {
                mark=i;
                break;
            }
        }
        return mark;
    }
    public static void main(String[] args){
        String hay = "";
        String needle = "";
        System.out.println(strStr(hay, needle));
    }
}
