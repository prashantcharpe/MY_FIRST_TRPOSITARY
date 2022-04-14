package pravinprcice;

public class ArrayDuplicate {

public static void main(String[] args) {
	
	int a []= {10,20,30,40,10,50,20};
	
	for(int i=0; i<a.length; i++) {
		for(int j=i+1; j<a.length; j++) {
			if(a[i]==a[j]) {
				System.out.println(" print duplicat no ; " + a[j]);
			}
		}
	}
	
for(int i=0; i<a.length; i++) {
	boolean flag=false;
	for(int j=i+1; j<a.length; j++) {
		if(a[i]==a[j] && i!=j) {
			a[j]=0;
			flag =true;
		}		
	}
	if(flag && a[i]!=0) {
		System.out.println(" duplicat " + a[i]);
	}
}
	
	
	
	
}

}
