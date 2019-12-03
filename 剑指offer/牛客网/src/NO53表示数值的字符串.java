import com.sun.org.apache.bcel.internal.generic.NEW;


public class NO53表示数值的字符串 {
    String s=new String();
    char[] hash=new char[256];
    public void Insert(char ch)
    {
        s+=ch;//字符中
        hash[ch]++;
    }
    public char FirstAppearingOnce()
    {
         
        int size=s.length();
        for(int i=0;i<size;++i)
        {
            if(hash[s.charAt(i)]==1)
                return (char)s.charAt(i);
        }
        return '#';
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
