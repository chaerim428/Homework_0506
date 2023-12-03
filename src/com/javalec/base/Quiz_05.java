package com.javalec.base;

import java.util.Scanner;

public class Quiz_05 {

	public static void main(String[] args) {
		// 몇개의 숫자를 더할까요? 4
		// 4개의 숫자를 입력하세요

		// 합계 : 입력한 숫자의 합은 10 입니다.

		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int sum = 0;

		System.out.print("몇개의 숫자를 더할까요?");
		input = scanner.nextInt();

		int[] num = new int[input];

		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력하세요 : ");
			num[i] = scanner.nextInt();
			sum += num[i];
		}
		System.out.println("입력한 숫자의 합은 " + sum + "입니다.");
	}

}
