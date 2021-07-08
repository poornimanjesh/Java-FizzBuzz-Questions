

public class Fizz {

	public static void main(String[] args) {
		String str="my name is aadya";
		checkaccurence( str);
		check( str);

	}
	public static void checkaccurence(String str) {
		String input=str;
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
			output=output+input.charAt(i);
			
		}System.out.println(output);
		
} 
	public static void check(String str)	{
		
		String output="";
		String[]ary=str.split(" ");
		
		for(int i=ary.length-1;i>=0;i--) {
			output=output+ary[i];
			
		}System.out.println(output);
	}
	
}