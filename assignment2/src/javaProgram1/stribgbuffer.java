package javaProgram1;

public class stribgbuffer {
	
	String srt = "prashant";

	public static void main(String[] args) {
		stribgbuffer name = new stribgbuffer();
		name.srt.concat("java");
		System.out.println(name.srt);
		
		String srt2 = new String("sagar");
		 srt2.concat("jll");
		System.out.println(srt2);
		srt2=srt2.concat("jll");
		System.out.println(srt2);
		
		StringBuffer srt3 = new StringBuffer("prashant");
		srt3.append("charpe");
		System.out.println(srt3);
	}
}
     