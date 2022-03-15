package susharsir;


public class practice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     m1();
	}
	public static void m1() {
		int a[]= {2,3,12,3,4,5,3,2,6,87,5,3,8,4,2};
		for(int i=0;i<a.length;i++) {
			boolean pass=false;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]&&i!=j) {
					a[j]=0;
					pass=true;
							
				}
				
			}
			if(pass && a[i]!=0) {
				System.out.print(" "+a[i]);
			}
		}
	}
}