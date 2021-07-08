import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Fizzbuzz19 {

	public static void main(String[] args) {
		String str="i am am not going going to park";
		Fizzbuzz19.find_duplicates_in_String(str);
	}

	public static void find_duplicates_in_String(String str) {
		String[] inputary=str.split(" ");
		//here linkedhashset maintaine insertion order
		Set<String> myset=new LinkedHashSet<String>();
		for(String x:inputary) {
			myset.add(x);
		}
		Iterator itr=myset.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next()+" ");		
		}
		
	}
}
