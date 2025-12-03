//remove elemnt 


class RemoveDuplicate{
	public static void main(String[]args){
		int arr[]=new int[]{1,2,2,4,2,0};
		int count=0;
		int temp;
		
		for(int i=0;i<arr.length;i++){
			for(int k=i+1;k<arr.length;k++){
				if(arr[k]==arr[i])			
				count++;
				

			}
			if(count<1)
			continue;
			
			for(int j=i+1;j<arr.length-1;j++){
				if(arr[i]==arr[j]){
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}

			}
		}
			System.out.println("count"+ count);
			for(int s=0;s<arr.length-count;s++){
				System.out.print(arr[s]+" ");
				
	

		}

	}

}

