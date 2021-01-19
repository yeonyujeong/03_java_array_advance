package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * 
 * # 나만의 마블
 * 
 * P □ □ □ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ □ □ □ □
 * 
 * 
 * 정답의 소스를 컴파일 해보고 동작을 파악하여 코드를 작성하기.
 * 
 */

public class ArrayEx49_내정답 {

	public static void main(String[] args) {	//2021.1.8	8:20 - 8:48
	Scanner scan = new Scanner(System.in);	
		
		int[][] map = {
				{0,   1,  2,  3, 4},			
				{15, 20, 20, 20, 5},
				{14, 20, 20, 20, 6},
				{13, 20, 20, 20, 7},
				{12, 11, 10,  9, 8}
			};
			
		int player = 0;
		int playerY = 0;
		int playerX = 0;
		int temp = 0;
		map[playerY][playerX] = -1;
		
		while(true) {
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if(map[i][j] == 20) {System.out.print("■" + " ");}
					else if(map[i][j] == -1) {System.out.print("P" + " ");}
					else {System.out.print("□" + " ");}
				}
					System.out.println();
			}
			
			System.out.print("1~3을 입력하세요 : ");
			int move = scan.nextInt();
			player += move;
			if(player >= 16) { player %= 16;}

			
			if(move < 1 || move >3) {System.out.println("범위 내에서 입력해주세요.");}
			
			else {
				for (int i = 0; i < map.length; i++) {
					for (int j = 0; j < map[i].length; j++) {
						if(map[i][j] == player) {
							map[playerY][playerX] = temp;
							temp = map[i][j];
							map[i][j] = -1;
							playerY = i; playerX = j;
						}
					}
				}

			}
		}
	}

}
