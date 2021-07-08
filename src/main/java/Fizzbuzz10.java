
public class Fizzbuzz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="yuki is not going to park";
		revers_word( input);

	}
	public static void revers_word(String input) {
		String output="";
		String[] arr=input.split(" ");

		for(int i=arr.length-1;i>=0;i--) {

			output=output+arr[i]+" ";
		}
		System.out.println(output);
	}
}
