
public class Fizzbuzz4 {
	public static void main(String[] args) {
		String str="poornima poorni pink"; 
		num_char_accurence(str);
	}

	public static void num_char_accurence(String str) {
		int result=str.length()-str.replaceAll("p", "").length();
		System.out.println(result);

	}
}
