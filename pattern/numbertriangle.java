class Demo{
	public static void main(String[]args){
		int n=4;
		int k=7;
		int temp=k;
		for(int i=0;i<n;i++){
			
			for(int j=0;j<=i;j++){
				System.out.print(k);
				temp=k;
				k--;
				
			}
			System.out.println();
			k=temp;
		}

	}

}