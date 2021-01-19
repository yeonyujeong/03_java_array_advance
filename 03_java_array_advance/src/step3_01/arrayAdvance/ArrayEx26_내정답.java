package step3_01.arrayAdvance;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */


public class ArrayEx26_내정답 { // 2020.12.24   12:20 - 12:40

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	
		final int SIZE = 9;
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		
		int[] check = new int[SIZE];
		
		for (int i = 0; i < front.length; i++) {
			int rNum = ran.nextInt(9);
			if(check[rNum] == 0) {
				front[i] = rNum + 1;
				check[rNum] = 1;
			}
			else {
				i--;
			}
		}
		
		for (int i = 0; i <back.length; i++) {
			back[i] = front[i] + 9;
		}
		
		int cnt = 0;
		int data = 1;
		int idx = -1;
		
		while(true) {
			
			for (int i = 0; i < front.length; i++) {
				if(front[i] == data) {
					idx = i;
				}
			}
			System.out.println(data + "[" + idx + "]");
			
			for (int i = 0; i < 9; i++) {		
				if(front[i] == -1) {
					System.out.print("  " +"  ");
				}
				else {
					System.out.print(front[i] + "  ");
				}
				
				if(i % 3 == 2) {
					System.out.println( );
				}
			}
			System.out.println();
			System.out.print(data + "의 위치입력 : ");
			int answer = scan.nextInt();
			
			if(answer == idx) {
				if(cnt<9) {
					front[idx] = back[idx];
				}
				else if(cnt >=9) {
					front[idx] = -1;
				}
				data++;
				cnt++;
			}
			else {
				System.out.println("정답이 아닙니다!");
			}
			System.out.println();
			
			if(cnt == 18) {
				System.out.println("게임 종료!");
				break;
				
			}
	
			
			
			
			
			
		}
		
		scan.close();
	}
	
}
