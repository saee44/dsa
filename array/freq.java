class freq{
 	public static void main(String[]args){
		int count=1;
		boolean check=false;
		int arr[]=new int[]{3,2,3,1};
		for(int i=0;i<arr.length;i++){
			count=1;

			for(int k=0;k<i;k++){
				if(arr[k]==arr[i]){
					check=true;
				}
			}
			if(check){
			continue;
			}
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]==arr[i]){
					count++;
				}
			}
		if(count>arr.length/2){
			System.out.println(arr[i]);
			}
		}

	}

}