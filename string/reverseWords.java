class Demo{
	public static void main(String[]args){
			String s="Let's take LeetCode contest";
			StringBuffer result=new StringBuffer("");	
			int end=s.length();
			int start=0;
			
			
			while(start<s.length()){
					for(int j=start;j<s.length();j++){

							if(s.charAt(j)==' '){
								end=j;
								break;
							}
							
							end=s.length();
							
							
					}
					for(int j=end-1;j>=start;j--){
						

							result.append(s.charAt(j));
							
							
						
					}
				if(end!=s.length())
				result.append(' ');

				start=end+1;
				
			
				
				
				 
					

			}
			
			
			System.out.println(result);
			
			
		}

}