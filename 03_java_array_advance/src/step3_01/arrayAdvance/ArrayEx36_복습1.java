package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx36_복습1 {		// 2020.12.29	1:12 - 1:20

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		
		System.out.print("인덱스1 입력 : ");
		int idx1 = scan.nextInt();
		
		System.out.print("인덱스2 입력 : ");
		int idx2 = scan.nextInt();
		
		System.out.println("값 출력 : " + arr[idx1][idx2]);
		
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
		System.out.print("값 입력 : ");
		int data = scan.nextInt();
		idx1 = -1;
		idx2 = -1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j] == data) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("인덱스 1 출력 : " + idx1 + "인덱스 2 출력 : " + idx2);
		
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		
		int max = 0;
		int maxIdx1 = -1;
		int maxIdx2 = -2;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j] >  max) {
					max = arr[i][j];
					maxIdx1 = i;
					maxIdx2 = j;
				}
			}
		}
		
		System.out.println("가장 큰 값의 인덱스 :" + maxIdx1 + "," + maxIdx2);
		
		
		// 문제 4) 값 2개를 입력받아 값 교체

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.print("교체할 값 1 입력 : ");
		int data1 = scan.nextInt();

		System.out.print("교체할 값 2 입력 : ");
		int data2 = scan.nextInt();

		int idx00 = -1;
		int idx01 = -1;
		int idx10 = -1;
		int idx11 = -1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j] == data1) {
					idx00 = i;
					idx01 = j;
				}
				if(arr[i][j] == data2) {
					idx10 = i;
					idx11 = j;
				}
			}
		}
		
		arr[idx00][idx01] = data2;
		arr[idx10][idx11] = data1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}

}
