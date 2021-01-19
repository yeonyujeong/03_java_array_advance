package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 숫자 야구 게임
 * 
 * 1. me에 1~9 사이의 숫자 3개를 저장
 *    (단, 중복되는 숫자는 저장 불가)
 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
 * 3. 숫자와 자리가 같으면 		    strike += 1
 *    숫자만 같고 자리가 틀리면 	ball += 1
 * 예)
 * 정답 : 1 7 3
 * 3 1 5		: 2b
 * 7 5 1        : 1b
 * 1 5 6		: 1s
 * 1 7 3        : 1s 2b
 * 2 4 9        : 없음
 * 1 7 3        : 3s  > 게임종료
 * 
 */

public class ArrayEx29_내정답 {		// 2020.12.30		5:39 - 5:50

	public static void main(String[] args) {
	Random ran = new Random();	
	Scanner scan =  new Scanner(System.in);
	
		int[] com = new int[3];
		int[] me  = new int[3];
		int[] temp = new int[9];
		int cnt = 0;
		
		while(cnt<3) {
			
			int rNum = ran.nextInt(9) + 1 ;
			
			for (int i = 0; i < temp.length; i++) {
				if(temp[rNum - 1] == 0) {
					temp[rNum - 1] = 1;
					com[cnt] = rNum;
					cnt++;
				}
			}
		}
			
			System.out.print("( com = ");
			System.out.print(Arrays.toString(com));
			System.out.print(" )");
			System.out.println();
			System.out.println();
			
			while(true) {
				System.out.print("[1] 숫자 입력 : ");
				me[0] = scan.nextInt();
				System.out.print("[2] 숫자 입력 : ");
				me[1] = scan.nextInt();
				System.out.print("[3] 숫자 입력 : ");
				me[2] = scan.nextInt();
				System.out.println();
				
				
				
				System.out.print("me = ");
				System.out.print(Arrays.toString(me));
				System.out.println();
				
				int strike = 0;
				int ball = 0;
				
				for (int i = 0; i < com.length; i++) {
					if(me[i] == com[i]) {
						strike++;
					}
				}
				
				for (int i = 0; i < com.length; i++) {
					for (int j = i; j < me.length; j++) {
						if(com[i] == me[j]) {
							if(i != j) {
								ball++;
							}
						}
					}
				}
				
				
				System.out.println("strike :" + strike);
				System.out.println("ball   :" + ball);
				
				System.out.println();
				
				if(strike == 3) {
					System.out.println("정답! 게임종료");
					break;
				}
		
			}
		
		scan.close();
		
		
	}
	
}
