package com.soohyun.array1;

import java.util.Scanner;

public class ArrayTest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		int [] ar = {10, 32, 15, 27, 46, 52};
		
		//인덱스 입력 받아서 해당 인데스 번호의 값을 출력
		//다른 번호를 입력허면 "없는법호입니다."
		
		
		int count = sc.nextInt();
		
		System.out.println("번호를 입력");
		int index = sc.nextInt();
		if(index>ar.length || index<0) {
			System.out.println("없는 번호");
		}else {
			System.out.println(ar[index]);
		}
	}

}
