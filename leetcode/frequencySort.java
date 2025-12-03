import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		String s="saee";
		String result="";
		int max=0;
		int temp;
		for(int i=0;i<s.length();i++){
		
			hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);


		}
		
		List<Integer>list=new ArrayList<Integer>();
		for(int value:hm.values()){
			list.add(value);
		

		   }
		for(int i=0;i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
			if(list.get(i)<list.get(j)){
				temp=list.get(j);
				list.set(j, list.get(i));
                                list.set(i, temp);
			}
			}
		}
		for(int k=0;i<list.size;i++){
		  result+=(char)hm.values(k);

		}
		System.out.println(list);
		
		

		
	}

}