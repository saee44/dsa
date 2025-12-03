import java.util.*;
class MissingNum{
	public static void main(String[]args){

		int arr[]=new int[]{1,2,4,5};
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		int min=arr[0];
		int count=0;
		
		for(int i=min+1;i<max;i++){
			count=0;
			for(int j=0;j<arr.length;j++){
			if(arr[j]==i){
				count++;
				
			}
		}
		
                        if(count<1)
			System.out.println(i);
			
			}



	}


}