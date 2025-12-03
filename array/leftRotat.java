import java.util.*;
class LeftRotate{
public static void main(String args[]){
     int n=5;
	int arr[]=new int[]{0,2,6,10,5};
     int temp;
     for(int i=0;i<n-1;i++){
               temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}

    System.out.println(Arrays.toString(arr));

}

}