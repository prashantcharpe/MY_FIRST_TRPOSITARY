package pankajsir;

public class practice {
	public static void main(String[] args) {
		
	
    int n[]= {10,20,0,40,30,90,100,70,50};
   int  l[]= {10,20,0,40,30,90,100,70,50};
   int sum = 0;
       int x[]=new int [l.length];
 
	 for(int i=0; i<n.length; i++) {
		 for(int j=0; j<l.length; j++) {
			 
			 x[i]=n[i]+l[j];
			 sum=sum+x[i];
		 }System.out.print(sum+ " ");
		 
	 }
	}
}