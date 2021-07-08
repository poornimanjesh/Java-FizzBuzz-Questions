
public class Fizzbuzz15 {

	public static void main(String[] args) {
		int[] ary= {2,4,8,8,9,9,3,3,7};
		find_duplication_in_aray(ary);
	}
	public static void find_duplication_in_aray(int[] ary) {
		for(int i=0;i<ary.length;i++)
		{
			for(int j=i+1;j<ary.length;j++)
			if(ary[i]==ary[j]) {
				System.out.println("duplicate element found:"+ary[i]);
			}
		}

	}
	
	
}
