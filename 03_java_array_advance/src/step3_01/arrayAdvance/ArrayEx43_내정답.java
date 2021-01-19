package step3_01.arrayAdvance;

import java.util.Random;
import java.util.Scanner;

// # 소코반

public class ArrayEx43_내정답 {		//2021.1.5		11:52 - 12:25

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 7;
		
		int[][] arr = new int [SIZE][SIZE];
		
		System.out.print(">>설치할 벽의 개수를 입력하세요 : ");
		int wallCnt = scan.nextInt();
		
		//벽설치
		for (int i = 0; i < wallCnt; i++) {
			int rNum1 = ran.nextInt(7);
			int rNum2 = ran.nextInt(7);
			
			if(arr[rNum1][rNum2] != -1) {
				arr[rNum1][rNum2] = -1;
			}
			else {
				i--;
			}			
		}
		
		//플레이어 위치
		
		System.out.println(">>플레이어의 위치를 선택하세요 : ");
		System.out.print("y좌표 입력 : ");
		int playerY = scan.nextInt();
		System.out.print("x좌표 입력 : ");
		int playerX = scan.nextInt();
		
		arr[playerY][playerX] = 1;

		//공 설치
		
		int ballY = ran.nextInt(SIZE - 2) + 1;
		int ballX = ran.nextInt(SIZE - 2) + 1;
		
		while(true) {
			if(arr[ballY][ballX] == 0) {
				arr[ballY][ballX] = 9;
				break;
			}
		}
		//골 설치
		
		int goalY = ran.nextInt(SIZE - 1);
		int goalX = ran.nextInt(SIZE - 1);
		
		while(true) {
			if(arr[goalY][goalX] == 0) {
				arr[goalY][goalX] = 5;
				break;
			}
		}
		
		//화면 출력
		
		while(true) {
			
			if(ballY == goalY && ballX == goalX) {
				arr[goalY][goalX] = 9;
			}
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if(arr[i][j] == -1) {
						System.out.print(" 벽");
					}
					else if(arr[i][j] == 1) {
						System.out.print(" 옷");
					}
					else if(arr[i][j] == 9) {
						System.out.print(" 공");
					}
					else if(arr[i][j] == 5) {
						System.out.print(" 골");
					}
					else {
					System.out.print(" " + arr[i][j] + " ");
					}
				}
				System.out.println();
			}
			
			if(ballY == goalY && ballX == goalX) {
				System.out.println("골~!");
				break;
			}
			
			System.out.println();
			System.out.println("---------------");
			System.out.println("상(1)하(2)좌(3)우(4) 입력 : ");
			int move = scan.nextInt();
			
			if(move == 1) {
				if(playerY-1 < 0) {
					continue;
				}
				if(arr[playerY-1][playerX] == 5 || arr[playerY-1][playerX] == -1) {
					continue;
				}
				else if(arr[playerY-1][playerX] == 0) {
					arr[playerY-1][playerX] = 1;
					arr[playerY][playerX] = 0;
					playerY--;
				}
				else if(arr[playerY-1][playerX] == 9) {
					if(ballY-1 < 0) {
						continue;
					}
					arr[ballY-1][ballX] = 9;
					arr[ballY][ballX] = 0;
					ballY--;
					arr[playerY-1][playerX] = 1;
					arr[playerY][playerX] = 0;
					playerY--;
				}	
			}
			
			else if(move == 2) {
				if(playerY+1 == SIZE || arr[playerY+1][playerX] == 5 || arr[playerY+1][playerX] == -1 ) {
					continue;
				}
				else if(arr[playerY+1][playerX] == 0) {
					arr[playerY+1][playerX] = 1;
					arr[playerY][playerX] = 0;
					playerY++;
				}
				else if(arr[playerY+1][playerX] == 9) {
					if(ballY+1 == SIZE) {
						continue;
					}
					arr[ballY+1][ballX] = 9;
					arr[ballY][ballX] = 0;
					ballY++;
					arr[playerY+1][playerX] = 1;
					arr[playerY][playerX] = 0;
					playerY++;
				}	
			}
			else if(move == 3) {
				if(playerX-1 < 0 || arr[playerY][playerX-1] == 5 || arr[playerY][playerX-1] == -1 ) {
					continue;
				}
				else if(arr[playerY][playerX-1] == 0) {
					arr[playerY][playerX-1] = 1;
					arr[playerY][playerX] = 0;
					playerX--;
				}
				else if(arr[playerY][playerX-1] == 9) {
					if(ballX-1 < 0) {
						continue;
					}
					arr[ballY][ballX-1] = 9;
					arr[ballY][ballX] = 0;
					ballX--;
					arr[playerY][playerX-1] = 1;
					arr[playerY][playerX] = 0;
					playerX--;
				}	
			}
			else if(move == 4) {
				if( playerX+1 == SIZE || playerX+1 == SIZE || arr[playerY][playerX+1] == 5 || arr[playerY][playerX+1] == -1 ) {
					continue;
				}
				else if(arr[playerY][playerX+1] == 0) {
					arr[playerY][playerX+1] = 1;
					arr[playerY][playerX] = 0;
					playerX++;
				}
				else if(arr[playerY][playerX+1] == 9) {
					if(ballX+1 == SIZE) {
						continue;
					}
					arr[ballY][ballX+1] = 9;
					arr[ballY][ballX] = 0;
					ballX++;
					arr[playerY][playerX+1] = 1;
					arr[playerY][playerX] = 0;
					playerX++;
				}	
			}
			
			
		
		
		
		}
		
		scan.close();
	}

}
