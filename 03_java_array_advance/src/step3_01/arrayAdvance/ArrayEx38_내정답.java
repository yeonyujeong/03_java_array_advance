package step3_01.arrayAdvance;import java.util.Arrays;
import java.util.Scanner;

/*
 *	# 관리비
*/

public class ArrayEx38_내정답 {		// 2020.12.31		12:46 - 12:58

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		
		System.out.println("=== 문제1 ===");
		
		int [] payTot =  new int [3];
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				payTot[i] += pay[i][j];
			}
		}
		
		System.out.println(Arrays.toString(payTot));
		System.out.println();
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		
		System.out.print("호 입력 : ");
		int ho = scan.nextInt();

		int hoI = -1;
		int hoJ = -1;
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if(ho == apt[i][j]) {
					hoI = i;
					hoJ = j;
				}
			}
		}
		System.out.println(ho + "의 관리비 : " + pay[hoI][hoJ] + "원");
		System.out.println();
		
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		
		int maxPay = 0;
		int maxI = -1;
		int maxJ = -1;
		
		
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if(pay[i][j] >= maxPay) {
					maxPay = pay[i][j];
					maxI = i;
					maxJ = j;
				}
			}
		}
		
		int minPay = maxPay;
		int minI = -1;
		int minJ = -1;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if(pay[i][j] <= minPay) {
					minPay = pay[i][j];
					minI = i;
					minJ = j;
				}
			}
		}
		
		System.out.println("가장 많이 나온 집 (" +apt[maxI][maxJ] + ")" );
		System.out.println("가장 적게 나온 집 (" +apt[minI][minJ] + ")" );
		
		
		System.out.println();
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		
		System.out.print("호1 입력 : ");
		int ho1 = scan.nextInt();
		
		System.out.print("호2 입력 : ");
		int ho2 = scan.nextInt();
		
		
		int ho1I = -1;
		int ho1J = -1;
		int ho2I = -1;
		int ho2J = -1;
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if(apt[i][j] == ho1) {
					ho1I = i;
					ho1J = j;
				}
				if(apt[i][j] == ho2) {
					ho2I = i;
					ho2J = j;
				}
			}
		}
		
		int temp = 0;
		
		temp = pay[ho1I][ho1J];
		pay[ho1I][ho1J] = pay[ho2I][ho2J];
		pay[ho2I][ho2J] = temp;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay.length; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		

	}

}
