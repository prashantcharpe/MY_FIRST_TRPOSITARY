package starpattern;

public class example1 {

	
	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" *");
			}System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" *");
			}System.out.println();
		}
	
		System.out.println();

		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" *");
			}System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" *");
			}System.out.println();
		}
		
		for(int i=0; i<=5; i++) {
		for(int j=5; j>i; j--) {
			System.out.print(" ");
		} for(int k=0; k<i; k++) {
			System.out.print("*");
		}System.out.println();
		}
	
		for (int i=0; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=5; k>i; k--) {
				System.out.print("*");
			}System.out.println();
		}
		
		for(int i=1; i<=5; i++ ) {
			for(int j=1; j<=i; j++) {
				if(i>=2 && j<=i-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
		
	for(int i=1; i<=5; i++) {
		for(int j=5; j>=i; j--) {
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++) {
			if(i>=2 && k>1) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	
	
	for(int i=1; i<=5; i++) {
		for(int j=5; j>=i; j--) {
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++) {
			if(i>=2 && k>1) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
		}
		for(int l=2; l<=i; l++) {
			if(i>=2 && l<=i-1) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	for(int i =0; i<=5; i++) {
		for(int j =1; j<=i; j++) {
			if(i>=2 && j<=i-1) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
		}
		for(int k=10; k>=i; k--) {
			if(i>=2 && k>i) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	
	
}
}
