package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Random;

/*
 * # 중복숫자 금지[2단계]
 * 
 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
 * 2. 단 중복되는 숫자가 없어야 한다.
 */


public class ArrayEx28_내정답 {		// 2020.12.30   5:27 - 5:31

	public static void main(String[] args) {
	Random ran = new Random();
		
		
		int[] arr = new int[5];
		int[] temp = new int[10];
		int cnt = 0;
		
		while(cnt < 5) {
			
		int rNum = ran.nextInt(10) +1;
		for (int i = 0; i < temp.length; i++) {
			if(temp[rNum - 1] == 0) {
				temp[rNum - 1] = 1;
				arr[cnt] = rNum;
				cnt++;
			}
		}
		
			
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
	
}
