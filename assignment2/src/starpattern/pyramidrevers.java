package starpattern;

public class pyramidrevers {
	
	public static void main(String[] args) {
		
	
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" *");
			}System.out.println();
		}
		
		for(int i=5; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}System.out.println();
		}
		
		for(int i=5; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(i);
			}System.out.println();
		}
int k=1;
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(k++ + " ");
			}System.out.println();
		}
	}
}
