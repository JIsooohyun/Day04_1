package com.soohyun.array1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest_6 {

	public static void main(String[] args) {
		//1.학생등록
		//학생수를 입력
		//학생 수만큼
		//학생번호를 입력
		//학생의 이름 입력
		//학생의 국어점수입력
		//학생의 수학점수입력

		//학생의 영어점수입력

		//2.전체정보 조회
		//모든 학생의 정보가 출력
		//번호, 이름, 국어, 영어, 수학 출력
		//3.학생정보 검색
		//검색할 학생의 번호를 입력
		//학생의 정보만 출력
		//4.프로그램 종료
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int select;
		int count;
		int nTemp,kTemp, mTemp, eTemp=0, tTemp;
		String naTemp;
		int [] totals = null;  //총점순 출력
		int [] numbers = null; //학생번호를 저장할 배열
		String [] names = null; //학생이름을 저장할 배열
		int [] kors = null;
		int [] maths = null;
		int [] engs = null;
		int search;
		while(check) {
			System.out.println("1.학생등록");
			System.out.println("2.전체정보 조회");
			System.out.println("3.학생정보 검색");
			System.out.println("4.전체정보를 총점순으로 출력");
			System.out.println("5.프로그램 종료");
			System.out.println("----번호를 입력하세요----");
			select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("학생 수를 입력하세요");
				count = sc.nextInt();

				numbers = new int[count];
				System.out.println("학생번호를 입력하세요");
				for(int i=0; i<numbers.length; i++) {
					numbers[i] = sc.nextInt();
				} //학생번호 입력

				names = new String[count];
				System.out.println("학생이름을 입력하세요");
				for(int i=0; i<names.length; i++) {
					names[i] = sc.next();
				}//학생이름 입력

				kors = new int[count];
				System.out.println("국어점수를 입력하세요");
				for(int i=0; i<kors.length; i++) {
					kors[i] = sc.nextInt();
				}//국어점수 입력

				maths = new int[count];
				System.out.println("수학점수를 입력하세요");
				for(int i=0; i<maths.length; i++) {
					maths[i] = sc.nextInt();
				}//수학점수 입력

				engs = new int[count];
				System.out.println("영어점수를 입력하세요");
				for(int i=0; i<engs.length; i++) {
					engs[i] = sc.nextInt();
				}//영어점수 입력

				totals = new int[count];
				for(int i=0; i<numbers.length; i++) {
					totals[i]=kors[i]+maths[i]+engs[i];

				}//총점 저장
				/*for(int i=0; i<numbers.length; i++) {
					System.out.println("총점 출력 : "+totals[i]);
				}*/
				
				break;

			case 2:
				for(int i=0; i<numbers.length; i++) {
					System.out.println("학생번호 : "+numbers[i]+" , 학생이름 : "+names[i]+" , 국어점수 : "+kors[i]+
							" , 영어점수 : "+engs[i]+" , 수학점수 : "+maths[i]+" , 총점 : "+totals[i]);
				}
				break;

			case 3:
				System.out.println("검색할 학생의 번호를 입력");
				search = sc.nextInt();
				for(int i=0; i<numbers.length; i++) {
					if(search == numbers[i]) {
						System.out.println("학생번호 : "+numbers[i]+" , 학생이름 : "+names[i]+
								" , 국어점수 : "+kors[i]+" , 영어점수 : "+engs[i]+" , 수학점수 : "+maths[i]);

					}
				}
				break;


			case 4:
				System.out.println("총점 순 출력");
				for(int i=0; i<numbers.length; i++) {
					for(int j=i+1; j<numbers.length; j++) {
						if(totals[i]>totals[j]) {
							tTemp=totals[j];
							totals[j]=totals[i];
							totals[i]=tTemp; //총합정렬

							nTemp=numbers[j];
							numbers[j]=numbers[i];
							numbers[i]=nTemp; //학생번호

							naTemp=names[j];
							names[j]=names[i];
							names[i]=naTemp; //학생이름

							kTemp=kors[j];
							kors[j]=kors[i];
							kors[i]=kTemp; //국어

							eTemp=engs[j];
							engs[j]=engs[i];
							engs[i]=eTemp; //영어

							mTemp=maths[j];
							maths[j]=maths[i];
							maths[i]=mTemp; //수학


						}
					}
				}

				for(int i=0; i<numbers.length; i++) {
					System.out.println("학생번호 : "+numbers[i]+" , 학생이름 : "+names[i]+" , 국어점수 : "
							+kors[i]+" , 영어점수 : "+engs[i]+" , 수학점수 : "+maths[i]+"총합 점수 : "+totals[i]);
				}
				break;

			case 5:
				break;

			}
		}

		System.out.println("프로그램 종료");


	}

}
