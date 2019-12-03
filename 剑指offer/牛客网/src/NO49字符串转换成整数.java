
public class NO49字符串转换成整数 {

    public  static int StrToInt(String str) {
    	int Num=0;
    	int Pos=1;
        for(int i=0;i<str.length();i++){
        	int c=str.charAt(i);
        	if(i==0&&((int)c==45||(int)c==43)){
        		if((int)c==45){
        			Pos=-1;
        			}
    			continue;
        	}
        	else if(c>57||c<48){ return 0;}
        	Num=((int)c-48)+Num*10;
        }
        return Num*Pos;
    }
	public static void main(String[] args) {
		System.out.println(StrToInt("+"));
	}
}
