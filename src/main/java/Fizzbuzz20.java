// Q21 reverse the given number by using whil loop;

public class Fizzbuzz20 {

	public static void main(String[] args) {
		int num=1234;
		Fizzbuzz20.reverse_numbers(num);

	}
	public static int reverse_numbers(int num) {
		int result=0;

		while(num>0) {
			result=result*10+num%10;
			num=num/10;
		}
		System.out.println("reverse number :"+result);
		return result;

	}
}
