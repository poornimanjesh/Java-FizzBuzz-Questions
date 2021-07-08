import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Fizzbuzz30 {

	public static void main(String[] args) {
		int[]ary= {10,20,20,30,40,40};
		remove_duplicate_in_intArray(ary);

	}
	public static void remove_duplicate_in_intArray(int[]ary) {
		int end = ary.length;
		Set<Integer> set = new LinkedHashSet<Integer>();

		for(int i = 0; i < end; i++){
		  set.add(ary[i]);
		}
		Iterator it = set.iterator();
		while(it.hasNext()) {
		  System.out.println(it.next());
		}
	}

}
