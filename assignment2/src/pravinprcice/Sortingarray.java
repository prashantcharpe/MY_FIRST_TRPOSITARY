package pravinprcice;

public class Sortingarray {
	
	public static void sortingarray()
	{
		int a [] = {10,20,40,60,78,0415,30,16,98,142,34,-51,-654};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length; j++ ) {
				if(a[i]>a[j]) {
					int emp = a[i];
					a[i]=a[j];
					a[j]=emp;
				}
			}
			System.out.println(a[i]);
			
		}
		
	}	
	
	public static void main(String[] args) {
		sortingarray();
	}
}
