package pankajsir;

import java.util.Arrays;

public class mergetwosortedarray {
	
	public static void main(String[] args) {
		
		int a[]= {10,5,15,25,12,99,900,11};
		int b[]= {20,10,15,80,100,950,150,1};
		
		int c[]=new int [a.length +b.length];
		
		
		Arrays.sort(a);
	
		for(int  i=0; i<a.length; i++) {
			c[i]=a[i];
		}
		
		Arrays.sort(b);
		for(int  i=0; i<b.length; i++) {
			c[i+a.length]=b[i];
		}
		
		Arrays.sort(c);
		for(int  i=0; i<c.length; i++) {  //accending oder
			System.out.print(c[i]+ " ");
		}System.out.println(c[0]);
		
		for(int  i=c.length-1; i>=0; i--) { //deccending oder
			System.out.print(c[i]+ " ");
		}System.out.println(c[0]);
		
		System.out.println();
	
		
		
		for(int i=0; i<a.length; i++) {    //accending oder
			for(int j=i; j<a.length; j++) {
				if (a[i]>a[j]) {
				
				int p=a[i];  //p=10
				a[i]=a[j];   // i= 5
				a[j]=p;    //j=10
				}
			}
			System.out.print(a[i]+ " ");
		}System.out.println();
		System.out.print("smallest number of array = "+a[0]);
		System.out.println();
		
		
		for(int i=0; i<a.length; i++) {     //deccending oder
			for(int j=i; j<a.length; j++) {
				if (a[i]<a[j]) {
				
				int p=a[i];  
				a[i]=a[j];   
				a[j]=p;    
				}
			}
			System.out.print(a[i]+ " ");
		}System.out.println();
		System.out.print("largest number of array = "+a[0]);
		
		
		
	}

}
