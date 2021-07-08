
public class Fizzbuzz8 {

	public static void main(String[] args) {
		String firchr="www.erostum.com";
		String midchr="www.erostum.com";
		String laschr="www.erostum.com";
		Firs_last_mid_charinstringextract(firchr,midchr,laschr);

	}
	
	public static void Firs_last_mid_charinstringextract(String firchr,String midchr,String laschr) {
		
		String fir= firchr.substring(0, 4);
		System.out.println(fir);
		
		String mid = midchr.substring(midchr.length()-4, midchr.length());
		System.out.println(mid);
		
		String las = laschr .substring( 4,laschr.length()-4);
		System.out.println(las);
		
		
	}

}
