
public class Fizzbuzz9 {

	public static void main(String[] args) {
		String str="nitin";
		recurtion_palindrome(str);
		boolean result=recurtion_palindrome(str);
		System.out.println(str+"recurtion_palindrome="+result);
	}

	public static  boolean recurtion_palindrome(String str ) {

		if(str==null) {
			return false;
		}

		if(str.length()<=1) {
			return true;
		}
		String fist=str.substring(0,1);
		String last=str.substring(str.length()-1,str.length() );
		if(!fist.equals(last)) {
			return false;
		}else {
			return recurtion_palindrome(str.substring(1, str.length()-1));
		}

	}

}
