//  WRP FIBONACCI input(5) output(0+1=1 1+1=2 1+2=3 2+3=5 3+5=8)
public class Fizzbuzz21 {

	public static void main(String[] args) {
		int a=5;
		Fizzbuzz21.Fibonacci(a);

	}

	public static void Fibonacci(int num) {
		int first=0;
		int second=1;
		int n=num;
		for (int i = 0; i <=n; i++) {
			System.out.println(first+" ");
			int sum=first+second;
			first=second;
			second=sum;
		}
	}

}
