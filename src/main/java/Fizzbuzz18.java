import java.util.HashMap;
import java.util.Map;

public class Fizzbuzz18 {

	public static void main(String[] args) {
		int[] ary= {1,3,4,5,6,7,3,1,4,7};
		Fizzbuzz18.FindinDuplicaUsingHashMao(ary);
	}
	public static void FindinDuplicaUsingHashMao(int[] ary) {
		Map<Integer,Integer>hm=new HashMap<Integer,Integer>();
		for(int x:ary) {
			if(!hm.containsKey(x)) {
				hm.put(x, 1);
			}else {
				hm.put(x, hm.get(x)+1);
			}
		}
		for(Integer x:hm.keySet()) {
			if(hm.get(x)>1) {
				System.out.println("duplicate element is:"+ x);

			}
		}
	}

}
