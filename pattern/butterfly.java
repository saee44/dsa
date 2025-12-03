class Demo{
	public static void main(String[]args){
		int n=8;
		int k=0;
		int s=n-1;
		for(int i=0;i<n/2;i++){
			
				        
				for(int j=0;j<n;j++){
					if(j<=k||j>=s){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
					

				}
				k++;
					s--;
				System.out.println();

			}
			

			
			for(int i=n/2;i<n;i++){
				

				for(int j=0;j<n;j++){
					if(j<k||j>s){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
						

				}
				k--;
			        s++;
				System.out.println();
			}
			
		

				


	}	
}	

	

