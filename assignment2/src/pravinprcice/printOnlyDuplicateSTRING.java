package pravinprcice;

public class printOnlyDuplicateSTRING {

	

	public static void countPerticularwordinString() {
		 String a = "my name is prashant and this is my no";
		String b[] = a.split(" ");
		int count;
		for(int i=0; i<b.length; i++) {
			count=1;
			boolean flag =false;
			for(int j=i+1; j<b.length; j++) {
				if(b[i].equals(b[j]) && b[j]!="0"){
					b[j]="0";
					count++;
					flag=true;
					
				}
			}if(flag && b[i]!="0") {
				System.out.println(b[i] + " : " + count);
			}
			
		}
	}	

		

	public static void main(String[] args) {
		
		countPerticularwordinString();
				
		
	}
}
