package step3_01.arrayAdvance;

import java.util.Scanner;

/*
문제1) 숫자 0이 플레이어이다. 
	    
	    1) left 2)right 3)up 4)down 5)되감기
		번호를 입력받고 해당위치로 이동 ==> 이동할때 값을 서로 교환한다. 
		 예) 1 ==> 
		
	    {1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,14,0,15}		
		 
		
문제2) 심화  ==> 한칸한칸이동할때마다 yx 에 배열에 이동한경로를 저장했다가 
 	5번입력시 ==> 왔던길로 되돌아가기 한다.
 	
*/

public class ArrayEx47_테스트문제 {		// 2021.1.8		2:01 - 2:21 //40

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int game[][] = {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,0}
				};
		
		int yx [][] = new int[10000][2];
		int cnt = 0;
		int size = 3;
		
		int playerY = -1;
		int playerX = -1;

		while(true) {
			
			System.out.println("==================================");
			for (int i = 0; i < game.length; i++) {
				for (int j = 0; j < game[i].length; j++) {
					System.out.print(game[i][j] + "\t");
				}
				System.out.println();
			}
			
			System.out.println("==================================");
			System.out.println("1) left 2)right 3)up 4)down 5)되감기 6)종료");
			System.out.print("번호 입력 : ");
			int choice = scan.nextInt();
			
			
			for (int i = 0; i < game.length; i++) {
				for (int j = 0; j < game[i].length; j++) {
					if(game[i][j] == 0) { 
						playerY = i; playerX = j; yx[cnt][0] = i; yx[cnt][1] = j;
					}
				}
			}
			
			if(choice == 1) {
				if(playerX == 0) {continue;}
				int temp = game[playerY][playerX-1];
				game[playerY][playerX-1] = 0;
				game[playerY][playerX] = temp;
				cnt++;
			}
			else if(choice == 2) {
				if(playerX == size) {continue;}
				int temp = game[playerY][playerX+1];
				game[playerY][playerX+1] = 0;
				game[playerY][playerX] = temp;
				cnt++;
			}
			else if(choice == 3) {
				if(playerY == 0) {continue;}
				int temp = game[playerY-1][playerX];
				game[playerY-1][playerX] = 0;
				game[playerY][playerX] = temp;
				cnt++;
			}
			else if(choice == 4) {
				if(playerY == size) {continue;}
				int temp = game[playerY+1][playerX];
				game[playerY+1][playerX] = 0;
				game[playerY][playerX] = temp;
				cnt++;
			}
			else if(choice == 5) {
				while(true) {
					for (int i = 0; i < game.length; i++) {
						for (int j = 0; j < game[i].length; j++) {
							if(game[i][j] == 0) {playerY = i; playerX = j;}						
						}
					}
					int cntY = yx[cnt][0];
					int cntX = yx[cnt][1];
					
					int temp = game[cntY][cntX];
					game[cntY][cntX] = 0;
					game[playerY][playerX] = temp;
					
					//출력
					System.out.println("----------------------------------");
					for (int i = 0; i < game.length; i++) {
						for (int j = 0; j < game[i].length; j++) {
							System.out.print(game[i][j] + "\t");
						}
						System.out.println();
					}
					cnt--;
					
					if(cnt < 0) {break;}
				}
				
			}
			else if(choice == 6) {break;}
			
			else{System.out.println("다시 입력해주세요");}
			
			scan.close();
			
		}
		
	}

}
