import java.util.Queue;


public class NO33丑数 {

/*    static int  GetUglyNumber_Solution(int index) {
        int num=1;
        int fin=1;
        int tim=0;
        if(index==1){return fin;}
        while(num<index+1){
        	int temp=(tim)/3+1;
        	int jud=temp;
        	while(jud!=1){
        		if(jud%2==0){
        			jud=jud/2;
        		}
        		else if(jud%5==0){
        			jud=jud/5;
        		}
        		else if(jud%3==0){
        			jud=jud/3;
        		}
        		else{tim=tim+3;}
        	}
        	
        	if((num-1)%3==0){
        		fin=2*temp;
        		num++;
        	}
        	else if((num-1)%3==1){
        		fin=3*temp;
        		num++;
        	}
        	else if((num-1)%3==2){
        		fin=5*temp;
        		num++;
        	}
        	
        }
        return fin;*/
    
/*	static int  GetUglyNumber_Solution(int index) {
        int num=2;
        int temp=1;
        if(index==1){return 1;}
        while(num<index+1){
        	temp++;
        	int jud=temp;
        	while(jud!=1){
        		if(jud%2==0){
        			jud=jud/2;
        		}
        		else if(jud%5==0){
        			jud=jud/5;
        		}
        		else if(jud%3==0){
        			jud=jud/3;
        		}
        		else{
        			temp++;
        			jud=temp;
        			}
        	}

        	num++;        	        	
        }
        return temp;
    }*/
	static int  GetUglyNumber_Solution(int index) {
		Queue<Integer> q1=new Queue<>();
	}

	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(10));

	}

}
