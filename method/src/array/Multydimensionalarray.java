package array;

public class Multydimensionalarray {
	
	public static int a[]; // single dimensional aaray
	public static int b[][]; // two dimensional aaray
	public static  int c[][][]; // three dimensional aaray
	public static int d[][][][]; // four dimensional aaray
	public static int e[][]= {{20,30},{30,40}};

	public static void main(String[] args) {
		
		b=new int [2][2];
		//inilization
		b[0][0]=5;
		b[0][1]=15;
		b[1][0]=25;
		b[1][1]=35;
		
		//1st type for print 2D array
		for(int i=0; i<2; i++) {
			System.out.println(b[i][0]);
			System.out.println(b[i][1]);
		}System.out.println();
		
		//2st type for print 2D array
				for(int i=0; i<2; i++) {
					for(int j=0; j<2; j++)
					System.out.println(b[i][j]);
				}System.out.println("\n");
				
				for(int i=0; i<2; i++) {
					for(int j=0; j<2; j++)
					System.out.println(e[i][j]+"  ");
				}
	}
}
