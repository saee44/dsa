import java.util.*;
class Solution {
    public int countPrimes(int n) {
        
        int prime=0;
        for(int i=2;i<n;i++){
            int count=0;
            for(int j=1;j<=i;j++){

            
            if(i%j==0){
                count++;
            }
            
            }
           if(count==2){
                prime++;
           }
        }
        return prime;
    }
}
class Demo{
    public static void main(String[]arhs){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        Solution obj =new Solution();
        int result=obj.countPrimes(n);
        System.out.println(result);
    }
}