class Demo{
	public static void main(String[]args){
		int n=10;
		for(int i=0;i<=n/2;i++){
			for(int j=0;j<=n/2;j++){
				if(j==i)
				System.out.print("*");
				else
				System.out.print(" ");

			}
			for(int j=n/2-1;j>=0;j--){
				if(j==i)
				System.out.print("*");
				else
				System.out.print(" ");

			}

		System.out.println();

			
		}
		for(int i=n/2-1;i>=0;i--){
				for(int j=0;j<=n/2;j++){
				if(j==i)
				System.out.print("*");
				else
				System.out.print(" ");

			}
			for(int j=n/2-1;j>=0;j--){
				if(j==i)
				System.out.print("*");
				else
				System.out.print(" ");

			}

		System.out.println();

		}
	
	}
}