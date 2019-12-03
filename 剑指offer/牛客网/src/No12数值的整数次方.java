import java.util.Scanner;


public class No12数值的整数次方 {
    
	public static double Power(double base, int exponent) {
        double res=1;
        if(base==0){return 0;}
        else if(exponent<0){
        	for(int i=0;i<-exponent;i++){
        		 res=base*res;
        	}
        	return 1/res;     	
        }
        else if(exponent>0){
        	for(int i=0;i<exponent;i++){
        		res=res*base;
        	}      	
        }
        return res;
  }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double ba =in.nextDouble();
		int Na =in.nextInt();
		System.out.println(Power(ba,Na));

	}

}
