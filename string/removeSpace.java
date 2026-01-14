class Demo{
	public static void main(String[]args){
		String s="             saee j    ";
		 StringBuffer  result=new StringBuffer("");
			int start=0;
			

			int end=s.length();
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)!=' '){
					start=i;
					
					break;
				}
			}			
			for(int i=s.length()-1;i>=0;i--){
				if(s.charAt(i)!=' '){
					end=i;
					break;
				}
			}
			

			for(int i=start;i<=end;i++){
				

				result.append(s.charAt(i));
				
			}

			System.out.println(result.toString());
			

			
	}


}