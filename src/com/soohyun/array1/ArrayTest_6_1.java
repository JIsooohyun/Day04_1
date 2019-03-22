package com.soohyun.array1;
import java.util.Scanner;
public class ArrayTest_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int [] numbers=null;//학생번호를 저장할 배열
		String [] names=null;//학생이름을 저장할 배열
		int [] kors = null;//학생들의 국어점수를 저장할 배열
		int [] engs = null;//학생들의 영어점수를 저장할 배열
		int [] maths = null;//학생들의 수학점수를 저장할 배열
		int [] totals = null;
		int tTemp=0;
		String sTemp=null;

		while(true) {
			System.out.println("1. 학생등록");
			System.out.println("2. 전체정보");
			System.out.println("3. 학생검색");
			System.out.println("4. 종      료");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("학생 수 입력");
				select = sc.nextInt();
				numbers = new int[select];
				names = new String[select];
				kors = new int[select];
				engs = new int[select];
				maths = new int[select];
				totals = new int[select];
				for(int i=0;i<select;i++) {
					System.out.println(i+1+ " 번째 번호 입력");
					numbers[i]=sc.nextInt();
					System.out.println(i+1+ " 번째 이름 입력");
					names[i]= sc.next();
					System.out.println(i+1+ " 번째 국어 입력");
					kors[i]= sc.nextInt();
					System.out.println(i+1+ " 번째 영어 입력");
					engs[i]=sc.nextInt();
					System.out.println(i+1+ " 번째 수학 입력");
					maths[i]=sc.nextInt();
					totals[i] =kors[i]+engs[i]+maths[i];
				}


			}else if(select ==2) {
				for(int i=0;i<names.length;i++) {
					System.out.println("번호 : "+numbers[i]);
					System.out.println("이름 : "+names[i]);
					System.out.println("국어 : "+kors[i]);
					System.out.println("영어 : "+engs[i]);
					System.out.println("수학 : "+maths[i]);
					System.out.println("==================");
				}


			}else if(select ==3) {
				System.out.println("검색할 학생의 번호 입력");
				select = sc.nextInt();
				int i=0;
				boolean check=false;
				for(i=0;i<names.length;i++) {
					if(select == numbers[i]) {
						check=!check;
						break;
					}
				}
				if(check) {
					System.out.println("번호 : "+numbers[i]);
					System.out.println("이름 : "+names[i]);
					System.out.println("국어 : "+kors[i]);
					System.out.println("영어 : "+engs[i]);
					System.out.println("수학 : "+maths[i]);
				}else {
					System.out.println("없는 학생 번호");
				}

			}else if(select ==4) {
				System.out.println("총점 순 출력");
				for(int i=0; i<numbers.length; i++) {
					for(int j=i+1; j<numbers.length; j++) {
						if(totals[i]<totals[j]) {
							tTemp=totals[j];
							totals[j]=totals[i];
							totals[i]=tTemp; //총합정렬

							tTemp=numbers[j];
							numbers[j]=numbers[i];
							numbers[i]=tTemp; //학생번호

							sTemp=names[j];
							names[j]=names[i];
							names[i]=sTemp; //학생이름

							tTemp=kors[j];
							kors[j]=kors[i];
							kors[i]=tTemp; //국어

							tTemp=engs[j];
							engs[j]=engs[i];
							engs[i]=tTemp; //영어

							tTemp=maths[j];
							maths[j]=maths[i];
							maths[i]=tTemp; //수학


						}
					}
				}
				for(int i=0; i<numbers.length; i++) {
					System.out.println("번호 : "+numbers[i]);
					System.out.println("이름 : "+names[i]);
					System.out.println("국어 : "+kors[i]);
					System.out.println("영어 : "+engs[i]);
					System.out.println("수학 : "+maths[i]);
					System.out.println("==================");
				}
				break;
			}else {
				System.out.println("잘못 눌렀어");
			}

		}

		//1. 학생등록
		// 학생수를 입력
		// 학생 수만 큼
		// 학생번호입력
		// 학생이름입력
		// 학생국어점수입력
		// 학생수학점수입력
		// 학생영어점수입력

		//2. 전체정보 조회
		// 번호, 이름, 국어, 영어, 수학 
		//3. 학생정보 검색
		//검색할 학생의 번호를 입력
		//검색한 학생의 번호, 이름, 국어, 영어, 수학 
		//4. 프로그램종료

	}


}

