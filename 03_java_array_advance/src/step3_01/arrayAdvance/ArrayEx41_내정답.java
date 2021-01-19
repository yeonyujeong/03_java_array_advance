package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * # 사다리 게임
 * 
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */

public class ArrayEx41_내정답 {			// 2020.12.29   2:25 - 2:34

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
		int ladder[][]= {
				{0,0,0,0,0},
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}
		};
		
		int x = 0;	// 가로 ─┤ ├─
		int y = 0;	// 세로
		
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {
				if(ladder[i][j] == 0) {
					System.out.print(" │ ");
				}
				else if(j>0 && ladder[i][j] == 1 && ladder[i][j-1] == 1) {
					System.out.print("─┤ ");
				}
				else if(j <4 &&ladder[i][j] == 1 && ladder[i][j+1] == 1) {
					System.out.print(" ├─");
				}
			}
			System.out.println();
		}
		
		System.out.print("0~4 입력 : ");
		x = scan.nextInt();
		System.out.println();
		

			
			for (int i = 0; i < ladder.length; i++) {			
					if(ladder[y][x] == 0) {
						y++;
					}
					else if(x > 0 && ladder[y][x-1] == 1 && ladder[y][x] == 1) {
						x--;
						y++;
					}
					else if(x < 4 &&ladder[y][x+1] == 1 && ladder[y][x] == 1) {
						x++;
						y++;
					}			
			}
		
		
			System.out.println("x = " + x);
			
		    
		
		
		

	}

}
