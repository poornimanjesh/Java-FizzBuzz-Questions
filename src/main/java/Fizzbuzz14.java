import java.util.Arrays;

public class Fizzbuzz14 {

	public static void main(String[] args) {
		int[]ary= {1,2,3,4,5,7,8,9,10};
		findmissingnuminarray( ary);
	}
	public static void findmissingnuminarray(int[] ary) {
		int sum=0;
		int exp_sum=0;
		for (int i = 0; i < ary.length; i++) {
			sum=sum+ary[i];
		}
		for (int i = 1; i <= 10; i++) {

			exp_sum=exp_sum+i;
		}
		System.out.println(Arrays.toString(ary));
		System.out.println("the missing number is "+(exp_sum-sum));
	}
}
