class CharArray{
    public static void main(String[]args){
        String s="saee";
        char arr[]=new char[s.length()];
            arr[]=s.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
}