package susharsir;

public class RemoveDuplicateArray {
	//if condition j=0 and (flage) then output in only duplicate number
	//if condition j=0 and (!flage) then output in only unic number
	//if condition j=i+1 and (!flage) then then out put in unic number + one duplicate number
	//if condition j=i+1 and (flage) then output in only duplicate number
	
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,98,10,5,2,5,20,30,99,10};
		
		System.out.print(" not dupliacte arry : ");
		for(int i=0; i<a.length; i++) {
			boolean flage=false;
			for(int j=0;  j<a.length; j++) {  
				                                
				if(a[i]==a[j] && i!=j){
					flage=true;
					break;
				}
			}
			if(!flage) {                       
				System.out.print(a[i]+" ");    
			}                                  
			                                   
		}
	}
	
}
