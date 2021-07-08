
public class Array_practice {
	//1)Write a Java Program to reverse a string without using String inbuilt function.

	public static void main(String[] args) {

		System.out.println("main");

			String a = "Aadya is going to school";

		//System.out.println("main a: "+ a);

		StringBuilder st = new StringBuilder();

		StringBuilder st1 = st.append(a);

		StringBuilder st2 = st1.reverse();

		System.out.println("string after reverse: "+st2);
		//  Q #2) Write a Java Program to reverse a string without using String inbuilt function reverse().

		String input="yuki is not going to park";

		String output="";

		for(int i=input.length()-1;i>=0;i--) {
			
		output=output+input.charAt(i);
		}
		System.out.println(output);
	
	//  Q #2) Write a Java Program to reverse a string without using String inbuilt function reverse().
		
		String in="we all going to movie";
		char ch[]=in.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
		System.out.println(ch[i]);
		}
		
		
	}

}
