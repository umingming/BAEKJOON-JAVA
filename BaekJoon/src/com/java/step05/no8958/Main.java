package com.java.step05.no8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		OX퀴즈의 결과가 주어졌을 떄 점수를 구하는 프로그램을 작성하시오.
		-첫째 줄에 테스트 케이스 주어짐
		
		설계>
		1. Scanner
		2. 숫자 입력
		3. count, score 변수 선언 후 0으로 초기화
		4. for문 입력한 숫자 반복
			>OX 결과 입력
			>for문 입력 받은 결과의 길이 반복
				>if O/X? 
					>O면 count++, score+=count, X면 score에 0 저장
			>score 출력 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt();
		
		for(int i=0; i<testCase; i++) {
			String result = scan.next();
			int count = 0;
			int score = 0;
			
			for(byte answer : scan.next().getBytes()) {
				if(answer == 'O'){
					count++;
					score += count;
				} else {
					count = 0;
				}
			}
			for(int j=0; j<result.length(); j++) {
				char c = result.charAt(j);
				if(c == 'O') {
					count++;
					score += count;
				} else {
					count = 0;
				}
			}
			
			System.out.println(score);
		}
	}

}
