import java.util.ArrayList;

//Question-1: Write code to filter duplicate elements from an array and print as a list?

public class Fizzbuzz27 {

	public static void main(String[] args) {
		int[]list= {1,1,3,5,5,6,7};
		duplicate_elements_array(list);
	}
public static void duplicate_elements_array(int[]ary) {
	for (int i = 0; i < ary.length; i++) {
		for(int j=i+1;j<ary.length;j++) {
			if(ary[i]==ary[j]) {
				System.out.println( "contains duplicate:"+ary[i]);
			}
		}
		
	}
	
}
}
