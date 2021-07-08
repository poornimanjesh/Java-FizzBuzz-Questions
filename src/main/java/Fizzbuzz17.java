import java.util.HashSet;
import java.util.Set;

public class Fizzbuzz17 {

	public static void main(String[] args) {
		int[]ary= {2,6,7,4,6,7,8,9,10,10};
		Fizzbuzz17.duplicate_finding_by_hashset(ary);
	}
	public static void duplicate_finding_by_hashset(int[]ary) {
		Set<Integer>hs=new HashSet<Integer>();
		for(int x:ary) {
			if(!hs.add(x)) {
				System.out.println("the duplicate element is:"+x);
			}
		}


	}
}
