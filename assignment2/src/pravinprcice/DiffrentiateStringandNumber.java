package pravinprcice;

public class DiffrentiateStringandNumber {

	public static void method() {
		
		String a ="prashant123";
		
		String  b = a.substring(8);
		System.out.println(b);
		int d = Integer.parseInt(b);
		System.out.println(" num " + d);
		
		String c= a.substring(0, 8);
		System.out.println("chatr " + c);	
	}
	
	public static void method1() {
		String a = "prashnt1245";
		
		StringBuffer str = new StringBuffer();
		StringBuffer num = new StringBuffer();
		
		for(int i=0; i<a.length(); i++) {
			if(Character.isDigit(a.charAt(i))) {
				num.append(a.charAt(i));
			}else if(Character.isAlphabetic(a.charAt(i))) {
				str.append(a.charAt(i));
			}
		}
		System.out.println(" num :" + num);
		System.out.println("str : " + str);
		
	}
	
	
	public static void main(String[] args) {
		method();
		method1();
	}
}
