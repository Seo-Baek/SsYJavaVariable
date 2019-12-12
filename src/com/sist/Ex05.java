package com.sist;

public class Ex05 {

	public static void main(String[] args) {
		
		// 키보드로 이름과 국어점수, 영어점수, 수학점수를 입력을 받자!
		String name = args[0];
		int kor = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		int mat = Integer.parseInt(args[3]); //parseInt 문자열을 날리고 숫자로 변경해주는 메소드
		
		// 총점 구하기
		int tot = kor + eng + mat;
		float avg = tot / 3.0f;
		
		// 화면에 성적을 출력해보자
		System.out.println("이     름 : " + name);
		System.out.println("국어점수 : " + kor + "점");
		System.out.println("영어점수 : " + eng + "점");
		System.out.println("수학점수 : " + mat + "점");
		System.out.println("총     점 : " + tot + "점");
		System.out.printf("평     균 : %.2f점", avg);
		
		//char ch1 = "";  문자열로 인식되어 오류
		char ch2 = 'A'; // 단위문자로 한 글자만 들어가기 때문에 홑따옴표로 해줘야한다.
						// 쌍따옴표도 한 글자가 들어가긴 하나 char형이 더 낫다
	}

}
