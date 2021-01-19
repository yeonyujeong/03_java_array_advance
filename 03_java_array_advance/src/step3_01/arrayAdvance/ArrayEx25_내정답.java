package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * 
 * # 최대값 구하기[3단계]
 * 
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 0으로 변경한다.
 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, 0, 24
 * 입력 : 87
 * 
 * 11, 0, 42, 0, 24
 * 
 */


public class ArrayEx25_내정답 { // 2020.12.24    12:11 - 12:16

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
	
		int cnt = 0;
		
		while(cnt < 5) {
			
			int maxData = 0;
			int maxIdx = -1;

			for (int i = 0; i < arr.length; i++) {
				if(arr[i] > maxData) {
					maxData = arr[i];
					maxIdx = i;
				}
			}
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.print("가장 큰값 입력 : ");
			int getAnwer = scan.nextInt();
			
			if(getAnwer == maxData) {
				System.out.println("정답!");
				arr[maxIdx] = 0;
				cnt++;
			}

			if(cnt == 5) {
				System.out.println("종료");
			}
			
		}
		
		
		scan.close();
		
	}
}
