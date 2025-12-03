class Demo{
    public static void main(String[]args){

	String s="(){";
	boolean check =true;
	for(int i=0;i<s.length()-1;i++){
		if(s.charAt(i)==s.charAt(i+1)){
			check=false;
		}
		


	}
	System.out.println(check);
	
			
	}


}