package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # ATM[4단계] : 전체 기능구현
 * 
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 
 * 5. 입금
 * . 로그인시에만 이용가능
 * 
 * 6. 이체
 * . 로그인시에만 이용가능
 * 
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */


public class ArrayEx30_내정답 {		// 2020.12.30   11:06 - 11:30 // 12:11

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int usrCnt = 0;
		int identifier = -1;
		
		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";
		
		
		
		while(true) {
			
			
			System.out.println(Arrays.toString(arId));
			System.out.println(Arrays.toString(arPw));
			System.out.println(Arrays.toString(arMoney));
			
			
			System.out.println(menu);
			
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(usrCnt == 5) {
					System.out.println("더이상 가입할 수 없습니다.");
					continue;
				}
				System.out.print("가입하실 id를 입력해주세요 : ");
				int getId = scan.nextInt();
				int check = 0;
				for (int i = 0; i < arId.length; i++) {
					if(arId[i] == getId) {
						check = -1;
					}
				}	
				
				if(check == -1) {
					System.out.println("이미 사용중인 id입니다.");
					continue;
				}
				else {
					System.out.print("가입하실 id의 pw를 입력해주세요 :");
					int getPw = scan.nextInt();
							
					arId[usrCnt] = getId;
					arPw[usrCnt] = getPw;
					arMoney[usrCnt] += 1000;
					usrCnt++;
				}	
					
			}
			else if(sel == 2) {
				
				if(identifier == -1) {
					System.out.println("로그인 후에 이용해주세요 ");
					continue;
				}
				
				int checkId = arId[identifier];
				
				int[] tempId = new int [usrCnt];
				tempId = arId;
				arId = new int [MAX];
				
				for (int i = 0; i < identifier; i++) {
					arId[i] = tempId[i];	
				}
				for (int i = identifier + 1; i < usrCnt; i++) {
					arId[i-1] = tempId[i];
				}
				
				int[] tempPw = new int [usrCnt];
				tempPw = arPw;
				arPw = new int [MAX];
				for (int i = 0; i < identifier; i++) {
					arPw[i] = tempPw[i];	
				}
				for (int i = identifier + 1; i < usrCnt; i++) {
					arPw[i-1] = tempPw[i];
				}
				
				int[] tempMoney = new int [usrCnt];
				tempMoney = arMoney;	
				arMoney = new int [MAX];
				for (int i = 0; i < identifier; i++) {
					arMoney[i] = tempMoney[i];	
				}
				for (int i = identifier + 1; i < usrCnt; i++) {
					arMoney[i-1] = tempMoney[i];
				}
				
				System.out.println(checkId + "님, 탈퇴되었습니다.");
				usrCnt--;
				identifier = -1;	
			}
			
			
			else if(sel == 3) {
				System.out.print("로그인 하실 id를 입력해주세요 : ");
				int logId = scan.nextInt();
				int checkId = -1;
				
				for (int i = 0; i < arId.length; i++) {
					if(arId[i] == logId) {
						checkId = i;
					}	
				}
				
				int checkPw = -1;
				if(checkId == -1) {
					System.out.println("입력하신 id는 존재하지 않습니다.");
					continue;
				}
				else {
					System.out.print("pw를 입력해주세요 : ");
					int logPw = scan.nextInt();
					if(logPw == arPw[checkId]) {
						checkPw = checkId;
					}
					if(checkPw == -1) {
						System.out.println("pw가 일치하지 않습니다.");
					}
					else {
						identifier = checkId;
						System.out.println(arId[checkId] +"님, 로그인 되었습니다.");
					}	
				}
			}
			else if(sel == 4) {
				if(identifier == -1) {
					System.out.println("로그인 후에 이용해주세요.");
					continue;
				}
				
				System.out.println(arId[identifier] + "님, 로그아웃 되었습니다.");
				identifier = -1;	
			}
			else if(sel == 5) {
				if(identifier == -1) {
					System.out.println("로그인 후에 이용해주세요.");
					continue;
				}
				System.out.print("입금하실 금액을 입력해주세요 : ");
				int deposit = scan.nextInt();
				
				arMoney[identifier] += deposit;
				
				System.out.println("입금이 완료되었습니다.");			
			}
			
			else if(sel == 6) {
				if(identifier == -1) {
					System.out.println("로그인 후에 이용해주세요.");
					continue;
				}
				
				System.out.print("이체하실 계좌를 입력해주세요 : ");
				int transId = scan.nextInt();
				int checkId = -1;
				
				for (int i = 0; i < arId.length; i++) {
					if(transId == arId[i]) {
						checkId = i;
					}
				}
					
					if(checkId == -1) {
						System.out.println("이체하실 계좌를 확인해주세요.");
					}
					else {
						System.out.print("이체하실 금액을 입력해주세요 : ");
						int transMoney = scan.nextInt();
						
						if(arMoney[identifier] >= transMoney) {
							arMoney[checkId] += transMoney;
							arMoney[identifier] -= transMoney;
							System.out.println("이체가 완료되었습니다.");		
						}
						else {
							System.out.println("이체하실 금액이 부족합니다.");
						}
					}
					
			}
			else if(sel == 7) {
				if(identifier == -1) {
					System.out.println("로그인 후에 이용해주세요.");
					continue;
				}
				
				System.out.println(arId[identifier] + "님의 잔액 : " + arMoney[identifier]);
				System.out.println();
			}
			else if(sel == 0) {
				break;
			}
		}


		scan.close();
	}

}
