class p3{
 	public static void main(String[]args){
		int count;
         boolean check;
		int arr[]=new int[]{2};
		for(int i=0;i<arr.length-1;i++){
			count=1;
            check=false;
            
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    check=true;
                }
            }
            
            if(check)
            continue;
			
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