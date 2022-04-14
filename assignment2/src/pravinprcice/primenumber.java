package pravinprcice;

public class primenumber {

	public static void primenumber(int a) {
		int count = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("this is prime no " + a);
		} else {
			System.out.println("this is not prime " + a);
		}
	}
	
	public static void printprimeno(int a) {
		int count = 0;
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(" this is prime no " + a);
		}else {
			System.out.println(" this is not prime no " + a );
		}
	}
	
	public static void printprime1() {
		int sum = 0;
		
		for(int i=0; i<=100; i++) {
			 boolean flag = true;
			 for(int j=2; j<i; j++) {
				 if(i%j==0) {
					 flag = false;
					 break;
				 }
			 }
			 if(flag) {
				 System.out.println(" this is prime no " + i);
			 }else {
				 System.out.println(" this is not prime no " + i);
			 }
		}
	}

	
	
	
	
	public static void main(String[] args) {
		//primenumber(89);
		//printprimeno(11);
		//System.out.println();
		printprime1();
	}

}
