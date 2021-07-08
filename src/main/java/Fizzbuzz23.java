//Q22 (its same ad Q21 but solving in different way )WRP for fatorial recursion function call by it self
public class Fizzbuzz23 {

	public static void main(String[] args) {
		int a =5;
		System.out.println("The factorial_recursion:"+a+"is = "+factorialRecursion(a));

	}
	public static int factorialRecursion(int num) {
		if (num<=1)
			return 1;
		else
			return num*factorialRecursion(num-1);

	}
}
