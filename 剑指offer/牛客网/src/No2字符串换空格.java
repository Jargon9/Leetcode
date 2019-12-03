
public class No2字符串换空格 {

    public static String replaceSpace(StringBuffer str) {
    	for(int ind = 0;ind!=-1;){
    		ind = str.indexOf(" ");
    		if(ind!=-1){
    			str.replace(ind, ind+1, "%20");
    		}
    	}
    	String string = str.toString();
    	return string;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str2 = new StringBuffer();
		str2.append("jis hu ai");
		replaceSpace(str2);
		System.out.println(str2);
/*		String str = new String("dd");
		int ind = str2.indexOf(" ");
		System.out.println(str2.length());
		System.out.println(ind);
		str2.replace(ind, ind+1, str);
		System.out.println(str2);*/
		
		
	}

}
