package com.soohyun.array1;

import java.util.Scanner;

public class ArrayTest_2 {

	public static void main(String[] args) {
		int  count;
		//정수 3개를 모을 배열을 선언
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력");
		count = sc.nextInt();
		
		int [] ar = new int[count];
		
		//배열 생성시, 이미 데이터가 있는 경우
		int [] ar2 = {10, 20, 30};
		System.out.println("검색할 번호를 입력하세요");
		count = sc.nextInt();
		//1입력하면 20출력
		//0입력하면 10출력
		
		System.out.println(ar2[count]);
		
		
		//length - 자기 배열의 크기(칸수, 사이즈)
		System.out.println(ar.length);
		
		
		
	}

}
