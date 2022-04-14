package pravinprcice;

public class PRINTAtoZ {

	public static void PrintAtoz() {
		char b;
		for(b='a'; b<='z'; b++) {
			System.out.print(b+" ");
		}
		System.out.println();
		for(b='z'; b>='a'; b--) {
			System.out.print(b+ " ");
		}
		
	}
	public static void main(String[] args) {
		 PrintAtoz();
		 
	}
}
