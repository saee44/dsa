import java.util.*;
class Solution {
    public int countPrimes(int n) {
        int temp=n;
        int count=0;
        int prime=0;
        for(int i=n-1;i>1;i--){
            for(int j=1;j<n;j++){

            
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
        int prime=obj.countPrimes(n);
        System.out.println(prime);
    }
}