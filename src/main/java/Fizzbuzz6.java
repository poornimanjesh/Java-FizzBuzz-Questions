import java.util.Arrays;

public class Fizzbuzz6 {

	public static void main(String[] args) {
		String str1="aadya maya";
		String str2="aydaa ayam";
		anagram( str1, str2);

	}
	public static void anagram(String str1, String str2) {
		char[] arr1=str1.toLowerCase().toCharArray();
		char[]arr2=str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Given string are anagram");
		}else {
			System.out.println("Given string are not anagram");
		}
	}
}
