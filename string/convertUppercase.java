class Demo{
	public static void main(String[]args){
		StringBuffer s=new StringBuffer("APPle");
		
		for(int i=0;i<s.length();i++){
			int a=(int)s.charAt(i);
			
			if(a<97){
				a=a+32;
			}	
			s.setCharAt(i,(char)a);
			
		}
		System.out.println(s);

	}

}