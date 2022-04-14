package javaProgram;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {

		int[] ar = { 50, 10, 30, -101, 80 };

		for (int i = 0; i < ar.length; i++) {
			for (int j = i; j < ar.length; j++) {
				// for descending order
				if (ar[i] < ar[j]) {

					// for ascending order
					// if(ar[i]>ar[j])

					int tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
			System.out.println(ar[i]);
		}System.out.println();
		
		//shorcut
		Arrays.sort(ar);
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
		}
		
		}
	}