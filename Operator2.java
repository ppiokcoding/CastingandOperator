package CastingandOperator;

public class Operator2 {

	public static void main(String[] args) {

		// [Operator]--이어서
		
		//3. 논리 연산자
		// - &&(and), ||(or), !(not)
		// - 피연산자를 대상으로 정해진 규칙에 따라 정해진 값을 반환하는 역할
		// - &&, || : 2항 연산자
		// - !      : 1항 연산자
		// - 피연산자의 자료형이 boolean이다.(다른 자료형은 불가능)
		// - 연산의 결과가 boolean이다. (책에도 나와있음)
		// - 피연산자는 주로 비교연산식을 가진다
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 && b2);  //false
		System.out.println(b1 || b2);  //true
		System.out.println(!b1); 	   //false
		System.out.println(!b2);	   //true
		
		System.out.println("==============================================");
		
		//요구사항] 나이를 입력 > 19세 이상 ~ 60세 미만
		int age = 26;
		
		System.out.println(age >= 19);
		System.out.println(age < 60);
		
		
		// System.out.println(19 <= age < 60); (x)
	
		System.out.println();
		System.out.println((age >= 19) && (age < 60));
		
		
		System.out.println("==============================================");
		//요구사항] 나이를 입력 > 19세 이상 ~ 60세 미만, 나이가 짝수
		System.out.println();
		System.out.println((age >= 19) && (age < 60) && (age % 2 == 0));
		
		
		System.out.println("==============================================");
		//숫자 1개 > 2의 배수 + 3의 배수
		int num = 9;
		System.out.println((num % 2 == 0) && (num % 3 == 0));
		System.out.println((num % 2 == 0) || (num % 3 == 0));
		
		
		
		
		//4. 대입 연산자, 할당 연산자
		//- =
		//- +=, -=, *=, /=, %= : 복합 대입 연산자
		//- LValue(변수) = RValue(상수, 변수)
		//- LValue와 RValue는 반드시 자료형이 동일해야 한다. (형변환)
		//- 연산자 우선순위가 모든 연산자 중 가장 낮다.
		
		
		//연산자 우선순위
		//- 하나의 문장에 속하는 모든 연산자들이 가지는 실행 순서
		//- 산술 연산자 > 비교 연산자 > 논리 연산자 > 대입 연산자
		
		//연산자 연산방향
		//- 하나의 문자에 속하는 동일한 종류의 연산자들이 가지는 실행 순서
		//- 대입 연산자, 증감 연산자: 오른쪽 -> 왼쪽
		//- 나머지 연산자: 왼쪽 -> 오른쪽
		
		//철저하게 분해 + 순서 명확하게 인식하기!!!!!
		/*
		
		문제] int sum = 10 + 20 + 30;
			- 연산자 3개 : =, +, +
			- 대입 연산자 : =
			- 산술 연산자 : +
		
		 컴퓨터의 분석 순서)
		 1. 10 + 20
		 => int sum = 30 + 30;
		 
		 2. 30 + 30
		 => int sum = 60;
		 
		 3. int sum = 60;
		 => sum;
		 
		
		*/
		
		int n = 10;
		
		//System.out.println(n + 1); 
		//System.out.println(n);  // 10
		
		//기존 n값에 1을 누적 > 누적한다(****)
		n = n + 1;
		System.out.println(n);
		
		n += 1; // n = n + 1  ---> 둘다 같은 문장임
		System.out.println(n);  //12
		
		n += 5;
		System.out.println(n); //17   -------> 계속 덮어쓰기 하는 중임! 즉 누적
		
		n = n - 2;
		System.out.println(n);  //15
		
		n -= 5;
		System.out.println(n);  //10
		
		n = n * 2;
		System.out.println(n);  //20
				
		n *= 2;
		System.out.println(n); //40
		
		n = n / 4;
		System.out.println(n); //10
		
		n /= 2;
		System.out.println(n); //5
		
		n = n % 3;
		System.out.println(n); //2
		
		n %= 2;
		System.out.println(n); //0
		
		
		
		System.out.println("===============================================");
		
		
		
		n = 10;
		
		//A == B == C
		n = n + 10; //A
		n = 10 + n; //B
		n += 10;    //C
		
		
		//D == F != E
		n = n - 10;  //D
		n = 10 - n;  //E
		n -= 10;     //F
		
		
		//-, /, % : 피연산자의 순서가 중요..
		
		
		
		//산술 연산자(+)
		// - 피연산자가 숫자형을 가진다.
//		                                       ]--얘네 둘(위아래)는 다른애들임
		//문자열 연결 연산자(+)
		// - 피연산자를 문자열을 가진다.
		// - Concat
		// - 문자열 + 문자열 = 문자열
		// - 문자열 + 비문자열 = 문자열
		// - 비문자열 + 문자열 = 문자열
		// - 비문자열 + 비문자열 //x -> 산술 연산자
		
		//비교 연산자(==, =!)
		
		System.out.println("문자열" + "입니다.");
		System.out.println("문자열" + 100);  //"문자열100"
		System.out.println(100 + "문자열");  //"100문자열"
		System.out.println(100 + 100);  //산술연산자
		
		System.out.println();
		
		
		//연산자 연산 방향, 문자열 연산자
		System.out.println(100 + 200 + 300);    //600  
		System.out.println(100 + 200 + "300");  //300300
		System.out.println(100 + "200" + 300);  //100200300
		System.out.println("100" + 200 + 300);  //100200300 : "100" + 200 부터 연산 --> 문자열이됨
												//				문자열-->300도 문자열 취급받아짐 결국 전부 문자열 됨
		System.out.println("100" + (200 + 300)); //100500
		
		
		// >, >=, <, <=
		// - 피연산자는 숫자형을 가진다.

		// ==, !=
		// - 피연산자는 모든 자료형을 가진다.
		
		System.out.println(true == true);
		
		String str1 = "홍길동";  //회원가입할때 작성한 비밀번호
		String str2 = "홍길동";  //로그인할때 작성한 비밀번호
		String str3 = "아무개";
		String str4 = "홍";
		str4 = str4 + "길동";
		
		
		
		//*********자바는 ==, !=을 문자열을 대상으로 사용할 수 없다.
		System.out.println(str1 == str2); //true
		System.out.println(str1 == str3); //false
		
		System.out.println(str1);
		System.out.println(str4);
		System.out.println(str1 == str4);
		
		
		//**결론: 문자열의 동등 비교는 연산자(==. !=)를 사용해서는 *절대* 안되고, 반드시 equals() 메소드를 사용해야 한다.
		System.out.println(str1.equals(str4));  // ==
		System.out.println(!str1.equals(str4)); // !=
		
		
		
		//5. 증감 연산자
		//- ++(증가 연산자, 플러스플러스), --(감소 연산자, 마이너스마이너스)
		//- 1항 연산자, 단항 연산자
		//- 피연산자는 숫자형을 가진다.
		//- 피연산자의 값을 +1, -1 누적 연산을 한다. 
		//- 연산자의 위치에 따라 연산 우선 순위가 달라진다. 
		// a. ++n : 전위 배치(전치 연산자). 연산자 우선 순위가 가장 높음
		// b. n++ : 후위 배치(후치 연산자). 연산자 우선 순위가 가장 낮음
		
		// 소괄호() > 증감 연산자(전치) > 산술 연산자 > 비교 연산자 > 논리 연산자 > 대입 연산자
		// 소괄호() > 산술 연산자 > 비교 연산자 > 논리 연산자 > 대입 연산자  > 증감 연산자(후치)
		
		//연산자 우선순위
		//1 + 2 x 3 = 7
		
		
		n = 10;
		
		n = n + 1;  //11
		n += 1;     //12
		++n;        //13
		//위의 세 문장이 다 똑같은 문장이다.(누적되어서 출력값이 다르게 나오는 것 뿐)
		System.out.println(n);

		
		System.out.println();
		
		
		n = n -1;  //12
		n -= 1;    //11
		--n;       //10
		System.out.println(n);
		
		n += 5;   //+5 누적
		++n;      //+1 누적
		
		
		System.out.println();
		
		
		
		n = 10;
		int sum = 0;
		
		sum = 20 + ++n;
		System.out.println("sum: " + sum);
		
		n = 10;
		sum = 0;
		
		sum = 20 + n++;  //우선순위 변화때문에..
		
		System.out.println("sum: " + sum); //30
		System.out.println("n: " + n);  //11
		
		
		//설명] sum = 20 + n++;
		// 1. 20 + n  --> 30++
		// 2. sum = 30++  
		// 3. 30 = ++ 되어서 반영이 안되어서 30이 나옴

		
		//증감 연산자 결론 > 증감 연산자는 전치 or 후치 마음대로 사용
		// > 단, 한 문장에 증감 연산자 이외의 연산자를 같이 사용하지 말 것!
		
		
		n = 10;
		sum = 0;
		
		//sum = 20 + ++n; 1번
		
		++n;           // 2번
		sum = 20 + n;  //     , 1번=2번 같은 문장임, 2번처럼 쓸것! 가독성이 높다
		
		
	    System.out.println();	
		
	    
		n = 10;
		sum = 0;
		
		//sum =20 + n++;
		
		sum = 20 + n;
		++n; //n++;     //얘네도 같은 문장임 후자의 방법으로 쓸것!
		
		
		int O = 10;
		System.out.println(--O - O--); 
		
		
		//6. 조건 연산자
		//- A ? B : C 
		//- ?:
		//- A, B, C: 피연산자
		//- 3항 연산자
		//- A: boolean
		//-B,C : 상수, 변수, 연산식, 메소드 > 값
		//- 직관적인고 읽기 쉽고, 사용하기 쉬운 연산자
		// 반드시 B와 C는 자료형이 동일해야 한다.
		
		boolean flag = true;
			
		String result = flag ? "참" : "거짓";
		System.out.println(result);
		
		
		//나이 입력
		
		age = 25;
		
		result = ((age >= 19) && (age < 60)) ? "성공" : "실패";
		System.out.printf("입력하신 나이 %d세는 회원 가입 %s입니다.\n", age, result);
	
		
		n = 10;
		
		String result2 = (n % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println((n % 2 == 0) ? "짝수" : "홀수");
		
		//String result3 = (n % 2 == 0) ? "짝수" : 100; (x)
	
	
	}// main

}
