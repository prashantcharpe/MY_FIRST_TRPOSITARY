package starpattern;

public class pyramid {
	
	public static void pyramid() {
		
		for(int i=1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(i);
			}System.out.println();
		}
	}
	
	public static void pyramid1() {
		
		for(int i=1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}System.out.println();
		}
	}
	
public static void pyramid2() {
		
		for(int i=1; i<=6; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j+i);
			}System.out.println();
		}
	}
public static void pyramid3() {
	int k =1;
	for(int i=1; i<=5; i++) {
		for(int j = 1; j<=i; j++) {
			System.out.print(k++ + " ");
		}System.out.println();
	}
}

	public static void main(String[] args) {
		pyramid();
		pyramid1();
		pyramid2();
		pyramid3();
		
	}
}
