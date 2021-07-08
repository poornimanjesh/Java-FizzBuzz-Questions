import java.util.Arrays;

public class Fizzbuzz16 {

	public static void main(String[] args) {
		int[]ary= {2,4,4,5,6,7,8,9,3,6,8};
		sorting_to_finding_duplication(ary);

	}
	public static void sorting_to_finding_duplication(int[] ary) {
		Arrays.sort(ary);
		for(int i=0;i<ary.length-1;i++) {
			if(ary[i]==ary[i+1]) {
				System.out.println("duplicate elements is :"+ary[i]);	
			}
		}
	}
}
