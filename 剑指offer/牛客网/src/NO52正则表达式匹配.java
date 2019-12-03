
public class NO52正则表达式匹配 {
    public static  boolean match(char[] str, char[] pattern)
    {
        int len1=str.length;
        int len2=pattern.length;
        int i=0,j=0;
        i=0;
        for(i=0,j=0;i<=len1&&j<len2;i++,j++){
        	if(i<len1&&str[i]==pattern[j]){continue;}
        	else{
        		if(j+1<len2&&pattern[j+1]=='*'&&pattern[j]=='.'){
        			j=j+1;
        			i=i+1;
        		}
        		else if(j+1<len2&&pattern[j+1]=='*'){
        			j=j+1;
        			i=i-1;
        			continue;
        		}
        		else if(pattern[j]=='*')
        		{
        			if(pattern[j-1]==str[i]){
        				j--;
        				continue;
        			}
        		}
        		else if(i<len1&&len1>0&&pattern[j]=='.'){continue;}
   		
        	}

        }
    	if(i>=len1&&j>=len2){return true;}
    	return false;
    }

	public static void main(String[] args) {
		char[]a={'a'};
		char[]b={'.','*'};
		System.out.println(match(a, b));
	
	}

}
