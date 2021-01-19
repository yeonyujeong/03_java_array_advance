package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Random;

/*
 * # 1부터 5사이의 랜덤 숫자를 2개씩 arr 배열에 저장하기
 * 예) 1 3 2 1 4 4 5 2 3 5
 * 
 *  - 1부터 5까지 숫자를 2개씩 넣고 셔플로 이용해서 섞지 말것
 * 
 */

public class ArrayEx46_테스트문제 {		// 2021.1.8		1:48 - 1:52

	public static void main(String[] args) {

		Random ran = new Random();
		
		int [] temp = new int[5];
		int [] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			int rNum = ran.nextInt(5) + 1;
			if(temp[rNum-1] == 0) {temp[rNum-1] = 1; arr[i] = rNum ;}
			else if(temp[rNum-1] == 1) {temp[rNum-1] = 2; arr[i] = rNum ;}
			else {i--;}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
