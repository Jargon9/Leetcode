public class N58最后一个单词的长度 {
    public static int lengthOfLastWord(String s) {
        String[] SetOfs = s.split(" ");
        if(SetOfs.length==0)return 0;
        return SetOfs[SetOfs.length-1].length();
    }
    public static void main(String[] args){
        String s =" ";
        System.out.println(lengthOfLastWord(s));
    }

}
