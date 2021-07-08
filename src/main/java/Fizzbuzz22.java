
//WRP  factorial input(int=5) output(1*2*3*4*5)=24
public class Fizzbuzz22 {
	public static void main(String[] args) {
		int a=3;
		Fizzbuzz22.factorial(a);

	}
	public static void factorial(int num) {
		int n=num;
		int fact=1;
		for (int i = 1; i <= n; i++) {
			fact=fact*i;

		}
		System.out.println("the factorial of "+n+ "is ="+fact);
	}
}
