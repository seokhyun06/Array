package sungil2023_03_13;

import java.util.Scanner;

public class Array2 {
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) 
			return false;
		for(int i = 0; i < a.length; i++) 
			if(a[i] != b[i])
				return false;
		
		return true;
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("배열 a의 길이 : ");
		int array  = sc.nextInt();		
		int []  a= new int[array];
		
		for(int i = 0; i < array; i++) {
			System.out.print("a[" + i +" ] : ");
		a[i] = sc.nextInt();
		}
		System.out.print("배열 b의 길이 : ");
		int array2 = sc.nextInt();
		int [] b = new int[array2];
		
		for(int i = 0; i <a.length; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
			
		}
		System.out.println("배열 a와 b는 " + (equals(a,b) ? "같습니다." : "다릅니다."));
	}

}
