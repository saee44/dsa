class Demo{
	public static void main(String[]args){
		int n=1	;
		int a=1;
		int b=1;
		int c=0;
		//System.out.println(a);
		//System.out.println(b);

		for(int i=1;i<n;i++){
		 c=a+b;
		//System.out.println(c);
		a=b;
		b=c;
		}
System.out.println(c);
	}

}