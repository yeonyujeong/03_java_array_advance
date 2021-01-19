package step3_01.arrayAdvance;

import java.util.Random;
import java.util.Scanner;

//# 빙고 Ver2(플레이어 2명)

public class ArrayEx45_내정답 { // 2021.1.8		1:05 - 1:26  //36

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran =  new Random();
		
		
		int turn = 0;
		int win = 0;
		int num = 5;
		
		int[][] me = new int[num][num];
		int[][] you = new int[num][num];
		
		
		// me빙고판 설정
		int [] temp = new int[50];
		for (int i = 0; i < me.length; i++) {
			for (int j = 0; j < me[i].length; j++) {
				int rNum = ran.nextInt(50)+1;
				if(temp[rNum - 1] == 0) {me[i][j] = rNum; temp[rNum - 1] = rNum;}
				else {j--;}
			}
		}
	
		// you빙고판 설정		
		temp = new int[50];
		for (int i = 0; i < you.length; i++) {
			for (int j = 0; j < you[i].length; j++) {
				int rNum = ran.nextInt(50)+1;
				if(temp[rNum - 1] == 0) {you[i][j] = rNum; temp[rNum - 1] = rNum;}
				else {j--;}
			}
		}
		
		while(true) {

			//빙고판 출력
			
			System.out.println("========= BINGO GAME[ME] =========");
			for (int i = 0; i < me.length; i++) {
				for (int j = 0; j < me[i].length; j++) {
					if(me[i][j] != 0) {System.out.print(me[i][j] + "\t");}
					else {System.out.print("O" + "\t");}
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.println("========= BINGO GAME[YOU] =========");
			for (int i = 0; i < you.length; i++) {
				for (int j = 0; j < you[i].length; j++) {
					if(you[i][j] != 0) {System.out.print(you[i][j] + "\t");}
					else {System.out.print("X" + "\t");}
				}
				System.out.println();
			}
			System.out.println("\n");
			
			if(win == 1) {System.out.println("ME승리!");break;}
			if(win == 2) {System.out.println("YOU승리!");break;}
			
			//me차례 (짝수)
			if(turn % 2 == 0) {
				System.out.print("[ME]y좌표 입력 : ");
				int meY = scan.nextInt();
				System.out.print("[ME]X좌표 입력 : ");
				int meX = scan.nextInt();
				
				
				if(me[meY][meX] != 0) {
					int data = me[meY][meX];
					me[meY][meX] = 0;
					for (int i = 0; i < you.length; i++) {
						for (int j = 0; j < you[i].length; j++) {
							if(you[i][j] == data) {you[i][j] = 0;}
						}
					} 
				}
				else {continue;}
			}
				
			//you차례 (홀수)
			if(turn % 2 == 1) {
				System.out.print("[YOU]y좌표 입력 : ");
				int youY = scan.nextInt();
				System.out.print("[YOU]X좌표 입력 : ");
				int youX = scan.nextInt();
				
				
				if(you[youY][youX] != 0) {
					int data = you[youY][youX];
					you[youY][youX] = 0;
					for (int i = 0; i < me.length; i++) {
						for (int j = 0; j < me[i].length; j++) {
							if(me[i][j] == data) {me[i][j] = 0;}
						}
					} 
				}
				else {continue;}
			}
			
			turn++;
			
			//승패확인 - 가로
			for (int i = 0; i < num; i++) {
				if(me[i][0] == 0 && me[i][1] == 0 && me[i][2] == 0 && me[i][3] == 0 && me[i][4] == 0) {win = 1;}
				if(you[i][0] == 0 && you[i][1] == 0 && you[i][2] == 0 && you[i][3] == 0 && you[i][4] == 0) {win = 2;}
			}
			
			//승패확인 - 세로
			for (int i = 0; i < num; i++) {
				if(me[0][i] == 0 && me[1][i] == 0 && me[2][i] == 0 && me[3][i] == 0 && me[4][i] == 0) {win = 1;}
				if(you[0][i] == 0 && you[1][i] == 0 && you[2][i] == 0 && you[3][i] == 0 && you[5][i] == 0) {win = 2;}
			}
			//승패확인 - 대각선\
			int cnt1 = 0;
			int cnt2 = 0;
			for (int i = 0; i < num; i++) {
				if(me[i][i] == 0) {cnt1++;}
				if(you[i][i] == 0) {cnt2++;}
			}
			if(cnt1 == 5) {win = 1;}
			if(cnt2 == 5) {win = 2;}
			
			
			//승패확인 - 대각선/
			cnt1 = 0;
			cnt2 = 0;
			for (int i = 0; i < num; i++) {
				if(me[i][4-i] == 0) {cnt1++;}
				if(you[i][4-i] == 0) {cnt2++;}
			}
			if(cnt1 == 5) {win = 1;}
			if(cnt2 == 5) {win = 2;}
			
			
			
			
		}
		
		
	}

}
