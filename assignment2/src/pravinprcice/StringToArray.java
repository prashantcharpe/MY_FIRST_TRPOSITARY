package pravinprcice;

public class StringToArray {

	public static void Stringtoarray() {
		
		String a = "i am prashant from auarnagabad";
		String [] b =a.split(" ");
		int count=0;
		for(int i=0; i<b.length; i++) {
			count++;
			System.out.println(b[i]);
		}
		System.out.println(count);
	}
	
	public static void Stringtoarray1() {
		
		String a = "i am prashant from auarnagabad";
		char[] b =a.toCharArray();
		
		int count=0;
		char name = 0 ;
		String num;
		
		for(int i=0; i<b.length; i++) {
			for(int j=i; j<b.length; j++) {
				if(b[i]==b[j] && i!=j) {
					count++;
					 name=b[j];
				}
				
			}
			System.out.println(name + " " + count);
			
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Stringtoarray();
		Stringtoarray1();
	}
}
