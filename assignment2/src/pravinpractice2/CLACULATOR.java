package pravinpractice2;

public class CLACULATOR {

	public static void calu(int a, int b, int cal) {
		
		if(cal==1) {
			System.out.println("addition : " + (a+b));
		}else if(cal==2) {
			System.out.println("subtraction : " + (a-b));
		}else if(cal==3) {
			System.out.println("multiplication : " + (a*b));
		}
		else if(cal==4) {
			System.out.println("division : " + (a/b));
		}
		else if(cal==5) {
			System.out.println("modulas : " + (a%b));
		}
		else if(cal==6) {
			System.out.println("square root of a is : " + (a^1/2));
		}	
	}
	
	public static void main(String[] args) {
		calu(20,2,1);
		calu(20,2,2);
		calu(20,2,3);
		calu(20,2,4);
		calu(20,2,5);
		calu(20,2,6);
	}
}
