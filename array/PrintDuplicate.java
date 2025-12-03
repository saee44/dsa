import java.util.*;
class PrintDuplicate{
public static void main(String args[]){
     	int arr[]=new int[]{1,1,2,3,2,3,0,2};
     
     for(int i=0;i<arr.length;i++){
	boolean alreadyPrinted = false;

                        for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) continue;
	int count=1;
	for(int j=1+i;j<arr.length;j++){

		if(arr[i]==arr[j]){              
			count++;
			}
		}
	if(count>1)

	System.out.println(arr[i]);
	}

   

}

}