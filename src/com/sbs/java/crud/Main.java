package com.sbs.java.crud; //packaged 이름 지정


import java.util.Scanner; //ctrl + shift +o

public class Main {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");

		Scanner sc = new Scanner(System.in);
		System.out.printf("명령어) ");
		String command = sc.nextLine().trim();
		System.out.printf("입력된 명령어 : %s\n", command);

//		System.out.printf("명령어) ");
//		int number = sc.nextInt();
//
//		System.out.printf("입력된 숫자 : %d\n", number);

		sc.close();

		System.out.println("==프로그램 종료==");
	}
}
