class Demo{
	public static void main(String[]args){
		String s="Apple,ok";
		s=s.toLowerCase();
		String b="";
		
		for(int i=0;i<s.length();i++){
			char a=s.charAt(i);
			
			if(a>='a'&&a<='z'){
				b+=a;
			}	     
			
			
		}
		System.out.println(b);

	}

}