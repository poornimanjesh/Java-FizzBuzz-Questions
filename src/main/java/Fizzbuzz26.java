
public class Fizzbuzz26 {
	
	public static void main(String[] args) {
		String dna1 = "ATGCGATACGCGAATGCGATACGCTTGA";
		DNAcounter( dna1);
	}
	public static void DNAcounter(String str) {
		//String[] ary=str.split("");
		int acounter=0;
		int gcounter=0;
		int tcounter=0;
		for (int i = 0; i <str.length(); i++) {
			if(str.charAt(i)=='A') {
				acounter++;
			}
			else if(str.charAt(i)=='G') {
				gcounter++;
			}
			else if(str.charAt(i)=='T') {
				tcounter++;
			}
		}
		System.out.println("acounter:"+acounter);
		System.out.println("gcounter:"+gcounter);
		System.out.println("tcounter:"+tcounter);
	}

}
