package step3_01.arrayAdvance;

import java.util.Arrays;

// 배열의 주소 

public class ArrayEx33 {

	public static void main(String[] args) {

		int[] arr = { 87, 100, 24, 11, 79};
		
		int[] temp = arr;
		
		System.out.println("arr  : " + arr);
		System.out.println("temp : " + temp);
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		System.out.println();
		
		arr[0] = 1;
		temp[1] = 2;
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
		
	}

}
