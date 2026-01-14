class Demo{
	public static void main(String[]args){
		int n=11;
		int temp=10;
		for(int i=0;i<=n/2;i++){
			
			for(int j=0;j<=n/2;j++){
				
				if(j==i){
					if(j%2==0){
						System.out.print(" "+temp);
						

					}
					else{
						System.out.print(" X");
					}
				}
				else
				System.out.print(" ");
				
			}
			
			for(int j=n/2-1;j>=0;j--){
				
				if(j==i){
					if(j%2==0){
						System.out.print(temp+" ");
						

					}
					else{
						System.out.print(" X");
					}

				}
				else
				System.out.print(" ");
				
				

			}

		
		System.out.println();
		temp=temp+10;


			
		}
		temp-=10;
		for(int i=n/2-1;i>=0;i--){
			temp-=10;
			
				for(int j=0;j<=n/2;j++){
				if(j==i){
					if(j%2==0){
						System.out.print(" "+temp);
						

					}
					else{
						System.out.print(" X");
					}
				}

				else
				System.out.print(" ");

			}
			for(int j=n/2-1;j>=0;j--){
				if(j==i){
					if(j%2==0){
						System.out.print(temp+" ");
						

					}
					else{
						System.out.print(" X");
					}
				}

				else
				System.out.print(" ");

			}

		System.out.println();
		

		}
	
	}
}