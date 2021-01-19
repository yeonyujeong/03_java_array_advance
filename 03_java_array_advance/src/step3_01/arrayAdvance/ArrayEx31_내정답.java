package step3_01.arrayAdvance;
/*
 * # 정렬하기
 * 
 * 1. 인덱스 0번이 나머지를 검사한다.
 * 2. 제일 큰 값을 찾아 교환한다.
 * 3. 인덱스 1증가한다.
 * 4. [1~3]을 끝까지 반복한다.
 * 예)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 */

import java.util.Arrays;

public class ArrayEx31_내정답 {			// 2020.12.31		12:12 - 12:19

	public static void main(String[] args) {
		
		int[] scores = {10, 50, 30, 40, 80, 7};
		int idx = 0;
		
		while(true) {
			
			int max = 0;
			int maxIdx = -1;
			
			for (int i = idx + 1; i < scores.length; i++) {
				if(scores[i] >= max) {
					max = scores[i];
					maxIdx = i;
				}
			}
			
			if(scores[idx] < max) {
				int temp = scores[idx];
				scores[idx] = scores[maxIdx];
				scores[maxIdx] = temp;
			}
			
			
			idx++;
			
			if(idx == 6) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(scores));
		
	}

}
