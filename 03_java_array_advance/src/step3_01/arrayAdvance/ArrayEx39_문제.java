package step3_01.arrayAdvance;
/*
 
 	# 중복 안된 숫자 제거
 	
	int[] test1 = {1,2,3,2,1};		
	int[] test2 = {1,3,4,4,2};
	int[] test3 = {1,1,1,2,1};
	
	// 위 배열에서 중복안된숫자를 제거하시요 
	// 1) {1,2,1,2}
	// 2) {4,4}
	// 3) {1,1,1,1}
	 
 */

import java.util.Arrays;

public class ArrayEx39_문제 {		// 2020.12.31		1:00 - 1:08

	public static void main(String[] args) {
		
		int[] test1  = {1,2,3,2,1};
		int[] test2  = {1,3,4,4,2};
		int[] test3  = {1,1,1,2,1};
		int[] result1 = new int[5];
		int[] result2 = new int[5];
		int[] result3 = new int[5];
		
		
		int idx1 = 0;
		
		for (int i = 0; i < 5; i++) {	
			int cnt1 = 0;
			for (int j = 0; j < 5; j++) {
				if(test1[i] == test1[j]) {
					cnt1++;
				}
			}
			if(cnt1 >= 2) {
				result1[idx1]= test1[i];
				idx1++;
			}
		}
		
		for (int i = 0; i < idx1; i++) {
			System.out.print(result1[i] + " ");
		}
		System.out.println();
		
		int idx2 = 0;
		
		for (int i = 0; i < 5; i++) {	
			int cnt2 = 0;
			for (int j = 0; j < 5; j++) {
				if(test2[i] == test2[j]) {
					cnt2++;
				}
			}
			if(cnt2 >= 2) {
				result2[idx2]= test2[i];
				idx2++;
			}
		}
		
		for (int i = 0; i < idx2; i++) {
			System.out.print(result2[i] + " ");
		}
		System.out.println();
		
		
		int idx3 = 0;
		
		for (int i = 0; i < 5; i++) {	
			int cnt3 = 0;
			for (int j = 0; j < 5; j++) {
				if(test3[i] == test3[j]) {
					cnt3++;
				}
			}
			if(cnt3 >= 2) {
				result3[idx3]= test3[i];
				idx3++;
			}
		}
		
		for (int i = 0; i < idx3; i++) {
			System.out.print(result3[i] + " ");
		}
		System.out.println();
		
		

	}

}
