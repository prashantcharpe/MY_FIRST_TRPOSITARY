package array;

public class revesarray {

static public int arry[]= {0,0,1,0,1,1,0,1};
	
	public static void main(String[] args) {
		/*
		 * int p; for(int i=0; i<arry.length; i++) {
		 * 
		 * for(int j=0; j<arry.length-1; j++) {
		 * 
		 * if (arry[j]>arry[j+1]) {
		 * 
		 * p = arry[j]; arry[j]=arry[j+1]; arry[j+1]=p; } } } for(int a:arry) {
		 * System.out.print(a); }
		 */
		
		for(int i=0; i>arry.length; i--) {
			System.out.println(arry[i]);	
		}
	}
}
