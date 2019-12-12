package com.sist;

/*
 * 기본자료형은 아니지만 기본자료형처럼 사용하는 String 자료형.
 * String 클래스형은 문자열을 처리하는 클래스 자료형.
 * 반드시 ""(쌍따옴표)를 사용해야 함.
 */

public class Ex04 {

	public static void main(String[] args) {

		String name = "홍길동";
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		
		System.out.println(); //빈 줄 삽입
		
		//성적 처리
		//이름, 국어, 영어, 수학
		//총점, 평균
		
		String name1 = ""; 	
		int kor = 95; 		// 국어점수 변수
		int eng = 88; 		// 영어점수 변수
		int mat = 92; 		// 수학점수 변수
		
		// 총점을 구해보자
		int tot = kor + eng + mat;
		
		//평균을 구해보자
		double avg = tot / 3;	//int형으로 계산 후 형변환이 되어 소수점이 무시 됨.
		double davg = (double)tot / 3;
		double davg1 = tot / 3.0;
		float favg = (float)tot /3;
		float favg1 = tot /3.0f;
		
		
		System.out.println("총 점 ==> " + tot + "점");
		System.out.println("총 점 ==> " + (kor + eng + mat) + "점");
		System.out.println("평 균 ==> " + avg + "점");
		System.out.println("평 균 ==> " + davg + "점");
		System.out.println("평 균 ==> " + davg1 + "점");
		System.out.printf("총 점 ==> %d점\n", tot);
		System.out.printf("평 균 ==> %.2f점\n", davg);
		System.out.printf("평 균 ==> %f점\n", favg);
		System.out.println("평 균 ==> " + favg1 + "점");
		System.out.println("평 균 ==> " + (tot /3.0f) + "점");
		
	}

}
