package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 * 
 */



public class ArrayEx40_복습1 {		// 2020.12.29		12:13 - 12:35

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores = null;
		int elementCnt = 0;
		
		while(true) {
			
			int[] temp = null;
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				
				if(elementCnt == 0) {
					scores = new int [elementCnt + 1];			
				}
				else if(elementCnt > 0 ) {
					temp = scores;
					scores = new int [elementCnt + 1];
					for (int i = 0; i < temp.length; i++) {
						scores[i] = temp[i];
					}
				}
				System.out.print("추가할 값을 입력하세요 : ");
				int addData = scan.nextInt();
				scores[elementCnt] = addData;
				elementCnt++;
			}
			else if (sel == 2) {
				
				if(elementCnt == 0) {
					System.out.println("더이상 삭제할 수 없습니다.");
					continue;
				}
				
				System.out.print("삭제할 데이터의 인덱스를 입력하세요 : ");
				int delIdx = scan.nextInt();
				temp = scores;
				scores = new int [elementCnt - 1];
				for (int i = 0; i < delIdx; i++) {
					scores[i] = temp[i];
				}
				for (int i = delIdx; i < scores.length; i++) {
					scores[i] = temp[i+1];
				}
				elementCnt--;
			}
			else if (sel == 3) {
				
				if(elementCnt == 0) {
					System.out.println("더이상 삭제할 수 없습니다.");
					continue;
				}
				
				System.out.print("삭제할 데이터의 값을 입력하세요 : ");
				int delData = scan.nextInt();
				int delIdx = -1;
				for (int i = 0; i < scores.length; i++) {
					if(scores[i] == delData) {
						delIdx = i;
					}
				}
				temp = scores;
				scores = new int [elementCnt-1];
				
				for (int i = 0; i < delIdx; i++) {
					scores[i] = temp[i];
				}
				for (int i = delIdx; i < scores.length; i++) {
					scores[i] = temp[i+1];
				}
				elementCnt--;
			}
			else if (sel == 4) {
				
					
				System.out.print("삽입할 값의 인덱스를 입력해주세요 : ");
				int insertIdx = scan.nextInt();
				
				if(insertIdx > elementCnt || insertIdx <0) {
					System.out.println("해당 위치에는 삽입할 수 없습니다.");
					continue;
				}
				System.out.print("삽입할 값의 데이터를 입력해주세요 : ");
				int insertData = scan.nextInt();
				
				temp = scores;
				
				scores = new int [elementCnt+1];
				
				for (int i = 0; i < insertIdx; i++) {
					scores[i] = temp[i];
				}
				for (int i = insertIdx; i < scores.length; i++) {
					scores[i] = temp[i-1];
				}
				
				scores[insertIdx] = insertData;
				elementCnt++;
				
			}
			else if (sel == 0) {
				break;
			}
			
			System.out.println(Arrays.toString(scores));
			System.out.println();
			
			
		}



	}

}
