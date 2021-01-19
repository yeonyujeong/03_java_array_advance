package step3_01.arrayAdvance;

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



public class ArrayEx40_내정답 {			// 2020.12.28  2:19 - 2:51

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores = null;
		int elementCnt = 0;
		int[] temp = null;
		
		while(true) {
			
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				if(elementCnt == 0) {
					scores = new int[elementCnt + 1];
				}
				else if(elementCnt > 0) {
					temp = scores;
					scores = new int[elementCnt + 1];
					for (int i = 0; i < temp.length; i++) {
						scores[i] = temp[i];
					}
				}
				System.out.print("추가할 값 입력 : ");
				int addData = scan.nextInt();
				
				scores[elementCnt] = addData;
				elementCnt++;
				
			}
			else if (sel == 2) {
				if(elementCnt == 0) {
					System.out.println("삭제할 값이 없습니다.");
					continue;
				}
				else if(elementCnt > 0) {
					System.out.print("삭제할 인덱스를 입력해주세요 : ");
					int deleteIdx = scan.nextInt();
					System.out.println();
					
					temp = scores;
					scores = new int [elementCnt - 1];
					
					for (int i = 0; i < deleteIdx; i++) {
						scores[i] = temp[i];
					}
					for (int i = deleteIdx + 1 ; i < temp.length; i++) {
						scores[i-1] = temp[i];
					}
					elementCnt--;
				}
			}
			
			else if (sel == 3) {
				if(elementCnt == 0) {
					System.out.println("삭제할 값이 없습니다.");
					continue;
				}
				else if(elementCnt > 0) {
					temp = scores;
					System.out.print("삭제할 값을 입력해주세요 : ");
					int deleteData = scan.nextInt();
					System.out.println();
				    int deleteIdx = -1;
					for (int i = 0; i < scores.length; i++) {
						if(scores[i] == deleteData) {
							deleteIdx = i;
						}
					}
					scores = new int [elementCnt - 1];
					
					for (int i = 0; i < deleteIdx; i++) {
						scores[i] = temp[i];
					}
					for (int i = deleteIdx; i < scores.length; i++) {
						scores[i] = temp[i+1];
					}
					
					elementCnt--;
				}
				
			}
			else if (sel == 4) {
				System.out.print("삽입할 데이터의 인덱스를 입력해주세요 : ");
				int insertIdx = scan.nextInt();
				
				System.out.println("삽입할 데이터의 값을 입력해주세요 : ");
				int insertData = scan.nextInt();
				
				temp = scores;
				
				scores = new int [elementCnt + 1];
				
				for (int i = 0; i < insertIdx; i++) {
					scores[i] = temp[i];
				}
				for (int i = insertIdx; i < temp.length; i++) {
					scores[i+1] = temp[i];
				}
				
				scores[insertIdx] = insertData;
				
				elementCnt++;
				
			}
			
			else if (sel == 0) {
				break;
			}
			
			for (int i = 0; i < scores.length; i++) {
				System.out.print(scores[i] + " ");
			}
			System.out.println();
			
			
		}

		scan.close();

	}

}
