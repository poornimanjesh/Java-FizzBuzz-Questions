import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fizzbuzz7 {

	public static void main(String[] args) {
		String str="minipmint";
		First_norreapetable_character( str);
	}
	public static void First_norreapetable_character(String str) {
		Map<Character, Integer>map=new LinkedHashMap<Character,Integer>();
		//Linked hash map maitain assertion order
		int count=1;
		for (int i = 0; i < str.length(); i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), count);
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}

		}
		for(Entry<Character,Integer>ent:map.entrySet()) {
			if(ent.getValue()==1) {
				System.out.println("the first non repeted character is :"+ent.getKey());
				break;

			}
		}
	}
}
