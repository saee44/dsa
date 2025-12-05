import java.util.*;
class Demo{
	public static void main(String[]args){
		int k=7;
		int arr[]=new int[]{1,2};
			k=k%arr.length;
			while(k>0){
			for(int j=arr.length-1;j>0;j--){
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				
				

			}
		k--;
		
					
		}
	System.out.println(Arrays.toString(arr));

		
	}
}