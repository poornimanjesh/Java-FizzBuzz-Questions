import java.util.Arrays;

public class Fizzbuzz13 {

	public static void main(String[] args) {
		int[] arr= {2,3,7,9,45,76,567};
		largest_smallest_num_in_array( arr);
	}
	public static void largest_smallest_num_in_array(int[] arr) {
		int largest=arr[0];
		int smallest=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			else if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("the largest element is"+largest);
		System.out.println("the smallest element is"+smallest);
		
		
	}

}
