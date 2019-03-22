package com.soohyun.array2;

import java.util.Scanner;

public class Array_2_test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//총 심판이 5명
		//점수는 정수로 (int)
	
		int [] points = new int[5];  //점수변수
		for(int i=0; i<points.length; i++) {
			System.out.println(1+i+"번 점수 입력");
			points[i] = sc.nextInt();
		}
		
		//평균을 구하는데 최대, 최소 점수를 제외한 평균
		int max=0;
		int min = points[0];
		int sum=0, total=0;
		for(int i=0; i<points.length; i++) {
			if(max<points[i]) {
				max=points[i];
			}
			if(min>points[i]) {
				min=points[i];
			}
			sum=sum+points[i];
		}
		System.out.println("합은 "+sum);
		total = (sum-(max+min))/(points.length-2);
		
		System.out.println("최대 점수는 : "+max+"이다");
		System.out.println("최소 점수는 : "+min+"이다.");
		System.out.println("최대, 최소 점수를 제외한 평균은 : "+total+"이다.");
		
		
		
		
	}

}
