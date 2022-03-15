package array;

public class stringmethod {
	
	static String a="prashant";
	static String b=" charpe";
	static String c=" PRASHANT";
	
	public static void main(String[] args) {
		
		System.out.println(a.charAt(3));
		System.out.println(a.length());
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a.toUpperCase());
		System.out.println(c.toLowerCase());
		System.out.println(a.concat(b));
		System.out.println(a.startsWith("pra"));
		System.out.println(a.endsWith("ant"));
		System.out.println(a.indexOf("h"));
		System.out.println(a.replace("p", "q"));
		System.out.println(a.substring(2));
		System.out.println(a.substring(2, 5));
		System.out.println(a.contains("r"));
		System.out.println(a.split("r")[0]);
		System.out.println(a.indexOf("a"));
		System.out.println(a.indexOf("s", 2));
		System.out.println(a.lastIndexOf("a"));
		System.out.println(a.repl);
		
	}

}

