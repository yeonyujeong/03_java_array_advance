package step3_01.arrayAdvance;

import java.util.Random;
import java.util.Scanner;

//# 빙고 Ver1(플레이어 1명)

public class ArrayEx44_내정답 {	// 2021.1.8		12:21 - 12:43  //54

	public static void main(String[] args) {
		
		
		Random ran = new Random();
		Scanner scan = new Scanner (System.in);
		
		
		int [][] bingo = new int[5][5];
		int [] temp = new int[50];
		
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				int rNum = ran.nextInt(50)+1;
				if(temp[rNum - 1] == 0) {
					bingo[i][j] = rNum;
				}
				else {
					j--;
				}
			}
		}

		while(true) {
		
			for (int i = 0; i < 5; i++) {
				System.out.print("\t" + i  );
			}
			System.out.println("\n");
			
			for (int i = 0; i < bingo.length; i++) {
				System.out.print(i + "\t");
				for (int j = 0; j < bingo[i].length; j++) {
					System.out.print(bingo[i][j] + "\t");
				}
				System.out.println("\n");
			}
			
			System.out.print("y좌표 입력 :");
			int y = scan.nextInt();
			
			System.out.print("x좌표 입력 : ");
		    int x = scan.nextInt();
		    
		    if(x < 0 || x > 5) {continue;}
		    if(y < 0 || y > 5) {continue;}
		    
		    
			if(bingo[y][x] != 0) {bingo[y][x] = 0;}
			
			//가로
			for (int i = 0; i < bingo.length; i++) {
				for (int j = 0; j < bingo[i].length; j++) {
					if(bingo[i][0] == 0 && bingo[i][1] == 0 && bingo[i][2] == 0 && bingo[i][3] == 0 && bingo[i][4] == 0) {
						System.out.println("BINGO!");
						break;
					}
				}
			}
			//세로
			for (int i = 0; i < bingo.length; i++) {
				for (int j = 0; j < bingo[i].length; j++) {
					if(bingo[0][j] == 0 && bingo[1][j] == 0 && bingo[2][j] == 0 && bingo[3][j] == 0 && bingo[4][j] == 0) {
						System.out.println("BINGO!");
						break;
					}
				}
			}
			//대각선1
			int cnt = 0;
			for (int i = 0; i < bingo.length; i++) {
				if(bingo[i][i] == 0) {cnt++;}
			}
			if(cnt == 5) {
				System.out.println("BINGO!");
				break;
			}
			
			//대각선2
			cnt = 0;
			for (int i = 0; i < bingo.length; i++) {
				if(bingo[i][4-i] == 0) {cnt++;}
			}
			if(cnt == 5) {
				System.out.println("BINGO!");
				break;
			}
			
			
			
			
		}
		scan.close();
		
	}

}
