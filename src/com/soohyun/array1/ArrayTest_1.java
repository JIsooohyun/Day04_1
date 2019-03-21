package com.soohyun.array1;

import java.util.Scanner;

public class ArrayTest_1 {

	public static void main(String[] args) {
		System.out.println("Array Test");
		
		int a; //지역변수, primitive 타입
		//정수형데이터
		int [] array = new int [3];
		array[0]='a'; //자동형변환하여서 들어갈 수 있다.
		array[1]=20; //인덱스번호를 사용
		array[2]=(int)3.2;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		//문자5개를 담을 배열을 선언하고 
		//각 5개의 문자를 입력하고 출력해보세요
		char [] ch = new char [5];
		ch[0]='k';  //멤버변수
		ch[1]='o';
		ch[2]='r';
		ch[3]='e';
		ch[4]='a';
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println(ch[4]);
		
		int [] num;
		num =new int[3];
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		
		
	}

}
