import java.util.Scanner;


public class No10矩形覆盖 {
	
	static int []a = new int[500];
    public static int RectCover(int target) {
    	a[1]=1;
    	a[2]=2;
    	a[3]=3;
    	if(target ==0){return 0;}
    	else if(target==1){return a[1];}
    	else if(target==2){return a[2];}
    	else if(target==3){return a[3];}
    	int Num1 =target/2;
    	int Num2=(target%2==0?target/2:target/2+1);
    	for(int i=4;i<=Num2;i++){
        	int Num3 =i/2;
        	int Num4=(i%2==0?i/2:i/2+1);   		
    		a[i]= a[Num3]*a[Num4]+a[Num3-1]*a[Num4-1];
    	}
    	return a[Num1]*a[Num2]+a[Num1-1]*a[Num2-1];
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Na =in.nextInt();
		System.out.println(RectCover(Na));
	}

}
