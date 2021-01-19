package step3_01.arrayAdvance;

import java.util.Arrays;

/*
 * # 석차 출력
 * 
 * . 성적 순으로 이름 출력
 */

public class ArrayEx32_내정답 {		// 2020.12.31		12:26 - 13:43
	public static void main(String[] args) {

		String[] names = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] scores   = {    87,    42,    100,     11,     98};
		
		int max = 0;
		int maxIdx = 0;
		int idx = 0;
		
		while(true) {
			
			for (int i = idx + 1; i < scores.length; i++) {
				if(scores[i] >= max) {
					max = scores[i];
					maxIdx = i;
				}
			}
			
			if(scores[idx] < max) {
				
				int tempS = scores[idx];
				scores[idx] = scores[maxIdx];
				scores[maxIdx] = tempS;
				
				String tempN = names[idx];
				names[idx] = names[maxIdx];
				names[maxIdx] = tempN;
				
				}
			
			idx++;
			
			if(idx == 5) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(scores));
		
	}

}
