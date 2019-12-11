package com.sist;

/*
 * 정수 자료형 연산 시 주의사항
 *  1. byte + byte = byte(X) 	==> int형
 *  2. byte + short = short(X) 	==> int형
 *  3. short + short = short(X) ==> int형
 *  - 자바는 정수 자료형 연산 시 최소 32bit(즉, int크기)로 처리한다!
 *  
 *  정수형 + 실수형 ==> 무조건 실수형.
 */

public class Ex02 {

	public static void main(String[] args) {
		// 변수 선언 및 변수 초기화
		//byte su1 = 130;  caution! -128 ~ 127 표현 범위를 벗어났기 때문에 error
		
		byte su1 = 127;		// 묵시적 형변환
		System.out.println("su1 ==> " + su1);
		
		int num1 = su1;
		
		int num2 = 150;
		byte su2 = (byte)num2; //1. 범위넘어감  2.int형의 byte가 더 크기 때문 <ㅡ 명시적 형변환
		
		System.out.println("su2 ==> " + su2);
		//-106이 나온 이유 : byte의 범위를 초과했기 때문에 쓰레기 값이 나옴 ㅜㅜ
		
		/*
		 * 형변환(Casting)
		 * 1. 묵시적 형변환 : 자료형의 크기가 작은 데이터를 큰 자료형의 데이터에 저장
		 * 2. 명시적 형변환 : 자료형의 크기가 큰 데이터를 작은 자료형의 데이터에 저장 
		 * 				 ==> 자료의 손실이 발생할 수 있음.
		 */
		
		int num3 = 2147483647;
		long num4 = 2147483647;
		
		long sum = num3 + num4; //int형 최대값끼리 더하면 이미 쓰레기 값이 들어가서 변수 하나를 long으로 잡아줘야함! 
		
		System.out.println("sum ==> " + sum);
		System.out.printf("sum ==> %,d\n",sum);  //format : 양식(형식)
		
		float avg = 91.3456781234111f;
		System.out.println("avg ==> " + avg);
		System.out.printf("avg ==> %.3f\n", avg);
		
		/*
		 * 출력 양식(printf() 메소드)
		 * %d : 정수값 출력
		 * %f : 실수값 출력
		 */
		
	}

}


