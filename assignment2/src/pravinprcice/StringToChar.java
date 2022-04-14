package pravinprcice;

public class StringToChar {

	public static void Stringtochar() {
		
		String b = " i am prashant ";
		String d = b.replace(" ", "");
		System.out.println(d);
		char c [] = d.toCharArray();
	   for(int i=0; i<c.length; i++) {
		   System.out.print(c[i]+ " ");
	   }
	}
	
	public static void main(String[] args) {
		Stringtochar();
	}
}
