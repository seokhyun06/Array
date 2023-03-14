package sungil2023_03_13;

import java.util.Scanner;

class MaxArray {
	static int MaxArray(int[] a) {
		int max = a[0];
		for(int i =1; i < a.length; i++)
			if(a[i] > max)
				max = a[i];
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int n = sc.nextInt();
		
		int [] height= new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("height[" + i + "] : ");
			height[i] = sc.nextInt();
			}
	
		System.out.println("최댓값은: " + MaxArray(height) + "입니다.");
	
	}
}
