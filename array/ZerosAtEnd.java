import java.util.*;
class ZeroAtEnd{
	
	int[] zeroMove(int[]arr){
		int k=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr[k]=arr[i];
				
				k++;
				

			}
		}
		while(k<arr.length){

			arr[k]=0;
			k++;
		}
		return  arr;

	}

}
class Demo{
    public static void main(String[]args){
		Scanner Sc=new Scanner(System.in);

		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i]=Sc.nextInt();
		}
		
		ZeroAtEnd obj=new ZeroAtEnd();
		int[]result=obj.zeroMove(arr);

		System.out.println(Arrays.toString(result));





	}


}