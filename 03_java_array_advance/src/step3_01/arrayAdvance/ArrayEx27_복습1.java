package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * # 숫자이동[2단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 */

public class ArrayEx27_복습1 { // 2020.12.24   2:03 - 2:15

	public static void main(String[] args) {
	Scanner scan =  new Scanner (System.in);
	
		int[] game = {0,0,1,0,2,0,0,1,0};
		
		int idx = 4;
		
		
		while(true) {
			
			for (int i = 0; i < game.length; i++) {
				if(game[i] == 0) {
					System.out.print(" _ ");
				}
				else if(game[i] == 2) {
					System.out.print(" 옷 ");
				}
				else if(game[i] == 1) {
					System.out.print(" | " );
				}
			}
			System.out.println();
			
			System.out.print("\n 왼쪽[1] 오른쪽[2]  이동 : ");
			int move = scan.nextInt();
			
			if(move == 1) {
				if(idx > 0) {
					if(game[idx-1] == 1) {
						System.out.print("벽이다! 격파[3] 입력 : ");
						int attack = scan.nextInt();
						
						if(attack == 3) {
							System.out.println("격파!");
							game[idx-1] = 0;
						}
						else {
							System.out.println("격파 실패!");
							continue;
						}
						
					}
					game[idx] = 0;
					game[idx-1] = 2;
					idx--;
				}
				else {
					System.out.println("더이상 이동할 수 없습니다.");
				}
			}
			
			if(move == 2) {
				if(idx < 8) {
					if(game[idx+1] == 1) {
						System.out.print("벽이다! 격파[3] 입력 : ");
						int attack = scan.nextInt();
						
						if(attack == 3) {
							System.out.println("격파!");
							game[idx+1] = 0;
						}
						else {
							System.out.println("격파 실패!");
							continue;
						}
					}
					
					game[idx] = 0;
					game[idx+1] = 2;
					idx++;
				}
				else {
					System.out.println("더이상 이동할 수 없습니다.");
				}
			}
		
		
		}
		
		
	}
	
}