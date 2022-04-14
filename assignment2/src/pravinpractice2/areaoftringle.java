package pravinpractice2;

public class areaoftringle {

	public static void AOT() {
		int H=10;;
		int B=5;
		 double a = 0.5*H*B;
		 System.out.println(" area of tringle : " +  a);
	}
	
	public static void AOT1(int h, int b) {
	
		 double a = 0.5*h*b;
		 System.out.println(" area of tringle : " +  a);
	}
	
	public static void main(String[] args) {
		 AOT() ;
		 AOT1(18,4) ;
	}
}
