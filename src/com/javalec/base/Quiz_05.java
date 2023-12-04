package com.javalec.base;

import java.util.Scanner;

public class Quiz_06 {

	public static void main(String[] args) {
		/*
		 * 몇 단계의 파라미드로 구성할까 ? : 5 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		 */

		Scanner scanner = new Scanner(System.in);
		int line = 0;
		int sum = 0;

		System.out.print("몇 단계의 파라미드로 구성할까 ? : ");
		line = scanner.nextInt();

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++) {
				sum += 1;
				System.out.print(String.format("%3d", sum));
			}
			System.out.println();
		}

	}

}
