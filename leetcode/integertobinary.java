class Demo{
	public static void main(String[]args){
		int n=2;
		//int num=n;
		int rev=0;
		int count=1;
		
			
			while(n!=1){
				
				int rem=n%2;
				n=n/2;
				rev=rev+rem*count;
				count=count*10;
								
			}
			//num=n;
		
		System.out.println(rev);
				
		
	}

}