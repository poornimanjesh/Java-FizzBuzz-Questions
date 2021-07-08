import java.util.HashMap;
import java.util.Map;

public class Fizzbuzz3 {
//Q4  numer of accurence(repetation) in the string;
	public static void main(String[] args) {
	String str="RAvi Ravi man man sap san sum sum";
	stringrepetations(str);
	}
	
	public static void stringrepetations(String str) {
		Map<String,Integer>map=new HashMap<String,Integer>();
		Integer count=1;
		String[]arry=str.split(" ");
		for (int i = 0; i < arry.length; i++) {
			if(!map.containsKey(arry[i])) {
				map.put(arry[i], count);
			}else {
				map.put(arry[i], map.get(arry[i])+1);
				}
			}
		for (String X : map.keySet()) {
			System.out.println("The cout of word:"+X+"="+map.get(X));
			
		}
	}
}
