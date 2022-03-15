package pankajsir;

public class mergtwoarrya {
	
	public static void main(String[] args) {
		
		int a[]= {10,80,30,40};
		int b[]= {30,40,50,60};
		
		
	
		int c[]= new int [a.length+ b.length];
		
		
		for(int i=0;i<a.length; i++) {
		c[i]=a[i];
		}
		for(int i=0;i<b.length; i++) {
			c[i+a.length]=b[i];
			}
		
		for(int i=0; i<c.length; i++)	{
		System.out.print(c[i]+" ");
		}
		}

}
