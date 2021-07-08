
public class Fizzbuzz11 {
	public static void main(String[] args) {

		Fizzbuzz11.starPattren(5);
	}
	public static void starPattren(int num) {
		for(int i =1;i<=num;i++) {

			for (int j=1;j<=i;j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
