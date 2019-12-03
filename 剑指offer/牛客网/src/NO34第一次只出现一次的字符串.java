
public class NO34第一次只出现一次的字符串 {

    public static int FirstNotRepeatingChar(String str) {
    	if(str.length()==0){return -1;}
    	int[]Index = new int[52];
    	int sta=(int)str.charAt(0);
    	int asc;
    	if(sta>96&&sta<123){asc=(int)str.charAt(0)-97;}
    	else{asc=(int)str.charAt(0)-65+26;}
    	Index[asc]=-2;
    	for(int i=1;i<str.length();i++){
    		sta=(int)str.charAt(i);
        	if(sta>96&&sta<123){asc=(int)str.charAt(i)-97;}
        	else{asc=(int)str.charAt(i)-65+26;}
    		if(Index[asc]!=0){Index[asc]=-1;}
    		else{Index[asc]=i;}
    	}
    	int fin=0;
    	int j;
    	for(j=0;j<52;j++){
    		if(Index[j]!=-1&&Index[j]!=0){
    			fin=Index[j];
    			break;}
    	}
    	for(;j<52;j++){
    		if(Index[j]!=-1&&Index[j]!=0){
    			if(Index[j]<fin){fin=Index[j];}
    		}
    	}
    	if(fin==-2){return 0;}
        return fin;
    }
	public static void main(String[] args) {
		String a="NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp";
		System.out.println(FirstNotRepeatingChar(a));

	}

}
