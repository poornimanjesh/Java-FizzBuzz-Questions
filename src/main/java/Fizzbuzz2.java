import java.util.HashMap;
import java.util.Map;

public class Fizzbuzz2 {

	public static void main(String[] args) {

		int[] numbers=new int[] {2,5,6, 8,10};
		int target=18;
		int[]result= gettwosum(numbers,target);
		System.out.println(result[0] +" "+ result[1]);

	}
	public static int[] gettwosum(int[] numbers, int target) {
		Map<Integer,Integer> visitednumber=new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int delta=target-numbers[i];
			if (visitednumber.containsKey(delta)) {
				return new int[] {i, visitednumber.get(delta)};
			}
			visitednumber.put(numbers[i], i);
		}

		return new int [] {-1,-1};
	}
}
