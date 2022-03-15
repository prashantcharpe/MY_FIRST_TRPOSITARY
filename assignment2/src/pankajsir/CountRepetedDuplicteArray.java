package pankajsir;

public class CountRepetedDuplicteArray {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,98,10,5,2,5,20,30,99,10};
		int count=0;
		System.out.print(" not dupliacte arry : ");
		for(int i=0; i<a.length; i++) {
			
			boolean flage=false;
			
			for(int j=i+1;  j<a.length; j++) {  
				                                
				if(a[i]==a[j] && i!=j){
					flage=true;
					break;
				}
			}
			if(flage) {           
				 count=count+1;                              
				System.out.print(a[i]+" ");  
			}                                
			                                  
	}       System.out.println();
	       System.out.println("total count of duplicate = "+ count );
	}
	
	

}
