package CastingandOperator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operator {
	
	public static void main(String[] args) throws IOException {
		
		//[Operator]
		
		/*
		 연산자, Operator
		 - 피연산자(Operator)를 대상으로 미리 정해진 연산을 한 후에 연산의 결과를 돌려주는 요소
		 - 주로 기호를 많이 사용 + 단어도 많이 사용
		 
		  1. 문장(Statement)
		  2. 표현식(Expression)
		  3. 연산자
		  4. 피연산자
		  5. 연산자 우선순위
		  6. 연산자 연산방향
		 
		  
		  연산자의 종류
		  1. 산술 연산자
		  2. 비교 연산자
		  3. 논리 연산자
		  4. 대입 연산자
		  5. 증감 연산자
		  6. 조건 연산자
		  7. 비트 연산자(x)
		 
		 */
		
		//문장(Statement)
		//int sum = 10 + 20; //문장(Statement)
		
		
		//표현식
		// - int sum
		// - 10 + 20
		// - sum = 30
		
		//연산자
		// - =
		// - +
		
		//피연산자
		// - = > sum, 30
		// - + > 10, 20
		
		//int sum = 10 + 20;
		
		
		//1. 산술 연산자
		// - +, -, *, /, %(mod, 나머지) --> (5가지)
		// - 2항 연산자
		// - 피연산자를 숫자형을 가진다. (정수, 실수)
		// - %: 패턴 생성
		

		//- 정수/정수 = 정수
		
		int a = 10;
		int b = 3;
		
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d %% %d = %d\n", a, b, a % b);
		
		
		//나누기 연산자(기억!!)
		// - 나누기 피연산자가 1개 이상이 실수면 연산 결과도 실수이다.
		System.out.println(10 / 3);     // 정수/정수 -> 3
		System.out.println(10.0 / 3.0); // 실수/실수 -> 3.33333333
		System.out.println(10.0 / 3);   // 실수/정수 -> 3.33333333
		System.out.println(10 / 3.0);   // 실수/정수 -> 3.33333333
		
		//근본 원인(*****)
		// - 모든 산술 연산자 결과 자료형은 두 피연산자 중에서 크기가 더 큰 자료형으로 반환이 된다.
		// - '+' : 신경쓰기!!! 
		// - '-' : 신경쓰기!!!
		// - '*' : 더욱 신경쓰기!!!
		// - '/' : 소수이하를 남길지 말지결정
		// - '%' : 신경 x
		
		int c = 1000000000;
		int d = 1000000000;
		int e = 2000000000;
		int f = Integer.MIN_VALUE;
		
		System.out.println(c + d); //int
		System.out.println(c + e); //int + int = int(결과값) 인데 21억이 넘어가서 오버플로우됨!!!! 이상한 값 나옴
		System.out.println(c + (long)e); // int + long = long 
		System.out.println((long)c + e);
		System.out.println((long)c +(long)e);
		System.out.println(1000000000 + 2000000000L);
		System.out.println(f - 1L);
		
		
		//2. 비교 연산자
		//- >, >=, <, <=, ==(equals), !=(not equals)
		//- 2항 연산자
		//- 피연산자들의 우위(동등) 비교하는 역할
		//- 피연산자를 숫자형을 가진다.
		//- 연산의 결과가 boolean이다.
		
		a = 10;
		b = 3;
		
		System.out.printf("%d > %d = %b\n", a, b, a > b);
		System.out.printf("%d >= %d = %b\n", a, b, a >= b);
		System.out.printf("%d < %d = %b\n", a, b, a < b);
		System.out.printf("%d <= %d = %b\n", a, b, a <= b);
		System.out.printf("%d == %d = %b\n", a, b, a == b);
		System.out.printf("%d != %d = %b\n", a, b, a != b);
		
		//요구사항] 나이를 입력 > 원하는 나이? 유효성 검사. 19세 이상
		int age = 15;
		
		// A > B
		//- 왼쪽 -> 오른쪽
		//- 주체 -> 비교
		//1. A가 B보다 크다. (O)
		//2. B가 A보다 작다.
		
		System.out.println(age >= 19); // 사용
		System.out.println(19 <= age); // 사용안함
		
		
		//요구사항] 사용자 키보드 입력 > 문자 1개 > 영어 소문자인지 판단?
		//**** 유효성 검사, Validation Check
		//		-> 프로그램에서 쓸모가 있는 데이터인지 판별하는 작업
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("영소문자 입력: ");
		String input = reader.readLine();
		
		System.out.println("입력된 문자: " + input);
		
		//사용자가 입력한 문자 1개가 영어소문자인지 확인? > 문자코드값을 사용한다.
		// 'A' -> (int)'A' -> 65
		// "A" -> (int)"A" // (X) 참조형(String)은 값형(int)으로 형변환이 불가능하다.
		
		// "A" -> 'A' -> 65 // 문자열 을 캐릭터로 바꾸는 편법을 응용해서 하는 것
		char c1 = input.charAt(0); // input("A") -> c1('A') 단, 한글자이어야 함!!
		
        //System.out.println((int)input); //(불가), "A"
		System.out.println(c1);
		System.out.println((int)c1);
		
		//영어 소문자? > 문자코드값 > a(97) ~ z(122)
		
		System.out.println((int)c1 >= 97);
		System.out.println((int)c1 <= 122);
		
		System.out.println((int)c1 >= (int)'a');
		System.out.println((int)c1 <= (int)'z');
		
		//char -> 내부적으로는 숫자형 -> 직접 비교 가능(문자 코드값끼리 비교되는 것임)
		System.out.println(c1 >= 'a');
		System.out.println(c1 <= 'z');
		
		System.out.println('가' > '힝');
		System.out.println('$' > '@');

		//System.out.println("A" > "B"); String > String 불가능(String은 숫자가 아니기 때문)
		
		//사용자가 입력하는 모든 데이터 > 반드시(***) 유효성 검사 필요
		
		
	}//main

}
