package javaProgram;

import java.util.Arrays;

public class TwoDArray {
	public static void main(String[] args) {
		int [][] art = new int [3][3];
		
		art[0][0]=10;
		art[0][1]=20;
		art[0][2]=30;
		
		art[1][0]=40;
		art[1][1]=50;
		art[1][2]=60;
		
		art[2][0]=70;
		art[2][1]=80;
		art[2][2]=90;
		
		for(int i=0; i<3; i++) {
			Arrays.sort(art[i]);
			for(int j=0; j<3; j++)
			{
				System.out.println(i+ " "+ j + " : "+art[i][j]);
			}
		System.out.println();	
		
	}System.out.println();
	
		for(int i=art.length-1; i>=0; i-- ) {
			System.out.println(art[i]);
		}
		
	}
}
