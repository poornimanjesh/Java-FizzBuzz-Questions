import java.util.HashMap;
import java.util.Map;

public class Fizzbuzz5 {

	public static void main(String[] args) {
		String str="we are going to park";
		char_repetation_in_string( str);
	}
	public static void char_repetation_in_string(String str) {
		char[] arry=str.toCharArray();
		Map<Character, Integer>map=new HashMap<Character,Integer>();
		int count=1;
		for (int i = 0; i < arry.length; i++) {
			if(!map.containsKey(arry[i])) {
				map.put(arry[i], count);
			}else {
				map.put(arry[i],map.get(arry[i])+1);
			}
		}
		for (Character key  : map.keySet()) {
			if(map.get(key)>1) {
				System.out.println(key+":"+map.get(key));

			}

		}
	}
}
