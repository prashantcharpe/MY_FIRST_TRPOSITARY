package pravinprcice;

public class Armstrong {

	public static void main(String[] args) {
		
	
	int num =153;
	int c=num;
	int rev=0;
    int reminder=0;


	
	for(; num> 0;) {
		reminder = num %10;
		rev=(reminder*reminder*reminder)+rev;
		num=num/10;
		System.out.println(num);
	}
	if (c==rev) {
		System.out.println(" this is amstrong no = "+ c);
	}else {
		System.out.println(" not amstrong no");
	}
}
}