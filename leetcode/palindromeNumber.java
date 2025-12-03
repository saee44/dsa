import java.util.*;
class Demo{
    public static void main(String[]args){
         Scanner Sc=new Scanner(System.in);
         int x=123;
         int rev=0;
         
       while(x!=0){
		int digit=x%10;
		 rev=rev*10+digit;
		x=x/10;

		
		
		
		
	}
	System.out.println(rev);
    }
}