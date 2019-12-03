
public class NO44翻转单次顺序 {

    public static String ReverseSentence(String str) {
        String FinStr=new String();
        String s1;
        s1=Reverse(str);
        int start=0;
        for(int i=0;i<str.length()+1;i++){
        	if(i==str.length()||s1.charAt(i)==' '){
        		s1=s1.replaceFirst(s1.substring(start, i),Reverse(s1.substring(start, i))); 
        		start=i+1;
        	}
        }
        return s1;
    }
    public static String Reverse(String str){
        int ind1=0;
        int ind2=str.length()-1;
        StringBuffer s2=new StringBuffer(str);
        s2=s2.reverse();
        str=s2.toString();
        return str;
        
    }
	public static void main(String[] args) {
		String s1="";
		System.out.println(ReverseSentence(s1));


	}
}