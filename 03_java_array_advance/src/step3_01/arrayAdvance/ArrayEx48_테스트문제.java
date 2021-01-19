package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

/*
               1,000,000
	문제1) 1 ~ 백만 사이의 숫자를 입력받고 가운데 숫자 출력 
	(단 ! 짝수자리의 수는 짝수자리라고 출력)
	예)  123 ==> 2
	예)  1234 ==> 짝수의 자리이다
	예)  1 ==> 1
	예)  1234567 ==> 4
	
	힌트) 자리수를 구하고 배열을 만든다음 하나씩 저장 
	예) ==> 123 ==> 3 ==> arr[] = new int[3];
	
*/

public class ArrayEx48_테스트문제 {		// 2021.1.8		7:55 - 8:15

	public static void main(String[] args) {
		
	Scanner scan =  new Scanner(System.in);
	
		System.out.println("1 ~ 1,000,000사이의 숫자 입력 : ");
		int num = scan.nextInt();
		int cnt = 1;
		int size = 0;
		
		if(num < 1 || num > 1000000) {System.out.println("다시 입력해주세요 : ");}
		else {
			while(true) {
				if(num / cnt > 0) {size++; cnt *= 10;}
				if(num / cnt == 0) {break;}
			}
			
			int[] arr = new int [size];
			
			cnt = cnt / 10;
	
			for (int i = 0; i < arr.length; i++) {
				arr[i] = num / cnt;
				num -= arr[i]*cnt;
				cnt /= 10;
			}
			
			System.out.println(Arrays.toString(arr));
			
			if(size % 2 == 0) {System.out.println("짝수자리입니다.");}
			else {
				int middle = (size / 2);
				System.out.println("가운데 숫자 : " + arr[middle]);
			}
		}
	
		scan.close();
		
	}

}
