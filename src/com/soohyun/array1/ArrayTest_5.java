package com.soohyun.array1;

import java.util.Scanner;

public class ArrayTest_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생수를 입력   3입력
		//입력한 수만큼 학생의 이름을 입력하세요
		//내가 입력한 학생수만큼 이름이 출력
		
		int num, ktotal =0, mtotal = 0; //학생수
		
		
		System.out.println("학생수를 입력하세요");
		num = sc.nextInt();
		String [] std = new String[num];
		int [] kor = new int[std.length];
		int [] math = new int[std.length];
		
		
		for(int i=0; i<std.length; i++) {
			System.out.println(i+1+"번째 이름");
			std[i] = sc.next();
		}
		
		//학생수 만큼 국어 점수를 입력받아라
		//iu 학생의 국어점수 입력
		//suji학생의 국어 점수 입력
		//국어점수 반평균
		//수학점수 반평균
		
		for(int i=0; i<std.length; i++) {
			System.out.println(std[i]+"학생의 국어 점수 입력");
			kor[i]=sc.nextInt();
			System.out.println(std[i]+"학생의 수학 점수 입력");
			math[i]=sc.nextInt();
			
		}
		
		for(int i=0; i<std.length; i++) {
			ktotal = ktotal+kor[i];
			mtotal = mtotal+math[i];

		}
			System.out.println("국어 점수의 평균은 "+ktotal/std.length);
			System.out.println("수학 점수의 평균은 "+mtotal/std.length);
		
		
		
	}

}
