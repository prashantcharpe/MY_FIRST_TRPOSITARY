package naveen;

public class swapTWOintegerWITHOUTusingTEMP {

	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		//without using third value
		a=b+a;
		b=a-b;
		a=a-b;
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("************************");

		// using third value
		int y=10,z=20;
		int x=0;
		x=y;
		y=z;
		z=x;
		System.out.println("y = "+ y);
		System.out.println("z = "+ z);
		System.out.println("************************");
		
		// using multiply value
				int p=10,r=20;
				int q=0;
				q= p*r;
				
				System.out.println("y = "+ y);
				System.out.println("z = "+ z);
				System.out.println("************************");
				
				
				
	}
}
