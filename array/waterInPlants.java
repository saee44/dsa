class Demo{
	public static void main(String[]args){
			int count=0;
			int capacity=6;
			int temp=capacity;
			int arr[]=new int[]{3,2,4,2,1};
			for(int i=0;i<arr.length;i++){
					if(arr[i]<temp){
						count++;
						temp-=arr[i];	
					}
					else{
						count+=i;
						temp=capacity;
						temp-=arr[i];
						count+=(i+1+1);

					}
					System.out.println(count);

				}
			System.out.println(count);
		}

}