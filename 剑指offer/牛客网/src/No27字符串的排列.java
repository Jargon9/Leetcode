import java.util.ArrayList;
public class No27字符串的排列 {
	
	static ArrayList<String> str1 = new ArrayList<>();
    public static ArrayList<String> Permutation(String str) {
    	String s3=new String();
    	String1(str, s3);
        return str1;
    }
    public static void String1(String str, String strUp) {
    	if(str.length()==1){
    		for(int i=0;i<str1.size();i++){
    			if(str1.get(i).equals(strUp.concat(str)))return;
    		}
    		str1.add(strUp.concat(str));
    	}
    	else{
    		for(int i=0;i<str.length();i++){    	
	    		char a=str.charAt(i);
	    		String s1=String.valueOf(a);
	    		StringBuffer s2=new StringBuffer(str);
	    		s2=s2.deleteCharAt(i);
	    		String1(s2.toString(), strUp.concat(s1));
    		}
    	}

    	
    	
    }
	public static void main(String[] args) {
		String s="aa";
		Permutation(s);

		
		
	}

}
