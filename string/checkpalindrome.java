class Demo{
	public static void main(String[]args){
		String s="A man, a plan, a canal: Panama";
		Solution obj=new Solution();
		System.out.println(obj.isPalindrome(s));
	}

}
class Solution {
    public String isPalindrome(String s) {
        s=s.toLowerCase();
        String b="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                b+=ch;
            }
        }
        for(int i=0;i<b.length()/2;i++){
            int k=s.length()-1;
            if(b.charAt(i)!=b.charAt(k)){
                return b;
            }
            k--;

        }
        return "true";
    }
}