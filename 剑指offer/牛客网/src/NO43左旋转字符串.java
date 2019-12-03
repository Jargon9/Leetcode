
public class NO43左旋转字符串 {

    public static String LeftRotateString(String str,int n) {
        String s1=new String();
    	if(n>str.length()){return s1;}
        StringBuffer s2=new StringBuffer(str);
        String s3=new String(str);
        s3=s2.substring(n, str.length());
        s1=str.substring(0, n);
        s3=s3.concat(s1);
        
        
        return s3;
    }
	public static void main(String[] args) {
		String s="abcXYZdef";
		System.out.println(LeftRotateString(s, 3));

	}

}
