package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]  
*/

public class ArrayEx36_내정답 {			// 2020.12.28

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력			//1:07 - 1:08
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		
		System.out.println("====== 문제1 ======");
		
		System.out.print("인덱스1 입력 : ");
		int idx1 = scan.nextInt();
		
		System.out.print("인덱스2 입력 : ");
		int idx2 = scan.nextInt();
		System.out.println();
		
		System.out.print("값 출력 : ");
		System.out.println(arr[idx1][idx2]);
		
		
		System.out.println();
		// 문제 2) 값을 입력받아 인덱스 2개 출력		//1:09 - 1:11
		// 예    2) 값 입력 : 60	
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
		System.out.println("====== 문제2 ======");
		
		System.out.print("값 입력 : ");
		int data = scan.nextInt();
		
		idx1 = 0;
		idx2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == data) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		
		System.out.println("인덱스1 : " + idx1 + " / 인덱스2 : " + idx2);
		System.out.println();
		
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력		//1:12 - 1:14
		// 정답 3) 2 2
		
		System.out.println("====== 문제3 ======");
		
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		
		idx1 = 0;
		idx2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == max) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		
		System.out.println("가장 큰 값의 인덱스 : " + idx1 + "," + idx2);
		
		System.out.println();
		
		// 문제 4) 값 2개를 입력받아 값 교체		// 1:14 - 1:18

		System.out.println("====== 문제4 ======");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.print("값1 입력 : ");
		int data1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		int data2 = scan.nextInt();
		System.out.println();
		
		int idx11 = 0;
		int idx12 = 0;
		int idx21 = 0;
		int idx22 = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == data1) {
					idx11 = i;
					idx12 = j;
				}
				
				if(arr[i][j] == data2) {
					idx21 = i;
					idx22 = j;
				}
			}
		}
		
		arr[idx11][idx12] = data2;
		arr[idx21][idx22] = data1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
