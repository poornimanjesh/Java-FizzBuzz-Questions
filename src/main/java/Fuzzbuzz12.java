
public class Fuzzbuzz12 {

	public static void main(String[] args) {
		String str="yuki is going to school";
		revers_each_word_char( str);
	}
	public static void revers_each_word_char(String str) {
		String result="";
		String[] arr=str.split(" ");
		for (String word : arr) {

			String reversword=" ";
			int j=word.length()-1;
			while(j>=0) {
				char ch=word.charAt(j);
				reversword=reversword+ch;
				j--;
			}
			result=result+reversword;
		}
		System.out.println(result);
	}

}
