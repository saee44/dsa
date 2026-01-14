import java.util.*;
class PutElements{
    public static void main(String []args){
        String s="I";
    Map<Character,Integer> map=new HashMap();
    map.put('I',1);
    map.put('v',5);
    map.put('x',10);
    for(Map.Entry<Character,Integer>entry:map.entrySet()){
        if(s.length()==1){
        if(s.charAt(0)==entry.getKey()){
        System.out.println(entry.getValue()+" "+entry.getKey());
        }

        }
       for(int i=0;i<s.length();i++){
         if()
       }
    }
    }
}