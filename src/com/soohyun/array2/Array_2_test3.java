package com.soohyun.array2;
import java.util.Arrays;


public class Array_2_test3 {

	public static void main(String[] args) {
		int [] points = {3, 5, 1, 9, 2};
		int temp =0;
/*
		for(int i=0; i<points.length; i++) {
			for(int j=i+1; j<points.length; j++) {
				if(points[i]>points[j]) {
					temp = points[j];
					points[j]=points[i];
					points[i]=temp;
				}//if함수 끝

			}//안쪽 for문
		}//바깥쪽 for문
*/
		Arrays.sort(points);
		for(int i=0; i<points.length; i++) {
			System.out.print(points[i]);
		}
	}

}
